package com.amplitude.api;

import android.util.Log;
import com.segment.analytics.integrations.BasePayload;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n.c0;
import n.e0;
import n.m0.g.e;
import n.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Diagnostics {
    public static final int DIAGNOSTIC_EVENT_API_VERSION = 1;
    public static final String DIAGNOSTIC_EVENT_ENDPOINT = "https://api.amplitude.com/diagnostic";
    public static final int DIAGNOSTIC_EVENT_MAX_COUNT = 50;
    public static final int DIAGNOSTIC_EVENT_MIN_COUNT = 5;
    public static Diagnostics instance;
    private volatile String apiKey;
    /* access modifiers changed from: private */
    public volatile String deviceId;
    public int diagnosticEventMaxCount = 50;
    public WorkerThread diagnosticThread = new WorkerThread("diagnosticThread");
    public volatile boolean enabled = false;
    private volatile c0 httpClient;
    public List<String> unsentErrorStrings = new ArrayList(this.diagnosticEventMaxCount);
    public Map<String, JSONObject> unsentErrors = new HashMap(this.diagnosticEventMaxCount);
    public String url = DIAGNOSTIC_EVENT_ENDPOINT;

    private Diagnostics() {
        this.diagnosticThread.start();
    }

    public static synchronized Diagnostics getLogger() {
        Diagnostics diagnostics;
        synchronized (Diagnostics.class) {
            if (instance == null) {
                instance = new Diagnostics();
            }
            diagnostics = instance;
        }
        return diagnostics;
    }

    public Diagnostics disableLogging() {
        this.enabled = false;
        return this;
    }

    public Diagnostics enableLogging(c0 c0Var, String str, String str2) {
        this.enabled = true;
        this.apiKey = str;
        this.httpClient = c0Var;
        this.deviceId = str2;
        return this;
    }

    public Diagnostics flushEvents() {
        if (this.enabled && !Utils.isEmptyString(this.apiKey) && this.httpClient != null && !Utils.isEmptyString(this.deviceId)) {
            runOnBgThread(new Runnable() {
                public void run() {
                    if (!Diagnostics.this.unsentErrorStrings.isEmpty()) {
                        ArrayList arrayList = new ArrayList(Diagnostics.this.unsentErrorStrings.size());
                        for (String str : Diagnostics.this.unsentErrorStrings) {
                            arrayList.add(Diagnostics.this.unsentErrors.get(str));
                        }
                        String jSONArray = new JSONArray(arrayList).toString();
                        if (!Utils.isEmptyString(jSONArray)) {
                            Diagnostics.this.makeEventUploadPostRequest(jSONArray);
                        }
                    }
                }
            });
        }
        return this;
    }

    public Diagnostics logError(String str) {
        return logError(str, (Throwable) null);
    }

    public Diagnostics logError(final String str, final Throwable th) {
        if (this.enabled && !Utils.isEmptyString(str) && !Utils.isEmptyString(this.deviceId)) {
            runOnBgThread(new Runnable() {
                public void run() {
                    JSONObject jSONObject = Diagnostics.this.unsentErrors.get(str);
                    if (jSONObject == null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("error", AmplitudeClient.truncate(str));
                            jSONObject2.put(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis());
                            jSONObject2.put(AmplitudeClient.DEVICE_ID_KEY, Diagnostics.this.deviceId);
                            jSONObject2.put("count", 1);
                            Throwable th = th;
                            if (th != null) {
                                String stackTraceString = Log.getStackTraceString(th);
                                if (!Utils.isEmptyString(stackTraceString)) {
                                    jSONObject2.put("stack_trace", AmplitudeClient.truncate(stackTraceString));
                                }
                            }
                            if (Diagnostics.this.unsentErrorStrings.size() >= Diagnostics.this.diagnosticEventMaxCount) {
                                for (int i2 = 0; i2 < 5; i2++) {
                                    Diagnostics.this.unsentErrors.remove(Diagnostics.this.unsentErrorStrings.remove(0));
                                }
                            }
                            Diagnostics.this.unsentErrors.put(str, jSONObject2);
                            Diagnostics.this.unsentErrorStrings.add(str);
                        } catch (JSONException unused) {
                        }
                    } else {
                        jSONObject.put("count", jSONObject.optInt("count", 0) + 1);
                    }
                }
            });
        }
        return this;
    }

    public void makeEventUploadPostRequest(String str) {
        v.a aVar = new v.a();
        aVar.a("v", "1");
        aVar.a("client", this.apiKey);
        aVar.a("e", str);
        aVar.a("upload_time", "" + System.currentTimeMillis());
        v vVar = new v(aVar.a, aVar.f10422b);
        e0.a aVar2 = new e0.a();
        aVar2.g(this.url);
        aVar2.e(vVar);
        try {
            if (((e) this.httpClient.a(aVar2.b())).h().f10106n.z().equals("success")) {
                this.unsentErrors.clear();
                this.unsentErrorStrings.clear();
            }
        } catch (IOException | AssertionError | Exception unused) {
        }
    }

    public void runOnBgThread(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        WorkerThread workerThread = this.diagnosticThread;
        if (currentThread != workerThread) {
            workerThread.post(runnable);
        } else {
            runnable.run();
        }
    }

    public Diagnostics setDiagnosticEventMaxCount(final int i2) {
        runOnBgThread(new Runnable() {
            public void run() {
                this.diagnosticEventMaxCount = Math.max(i2, 5);
                Diagnostics diagnostics = this;
                diagnostics.diagnosticEventMaxCount = Math.min(diagnostics.diagnosticEventMaxCount, 50);
                Diagnostics diagnostics2 = this;
                if (diagnostics2.diagnosticEventMaxCount < diagnostics2.unsentErrorStrings.size()) {
                    for (int i2 = 0; i2 < Diagnostics.this.unsentErrorStrings.size() - this.diagnosticEventMaxCount; i2++) {
                        Diagnostics.this.unsentErrors.remove(Diagnostics.this.unsentErrorStrings.remove(0));
                    }
                }
            }
        });
        return this;
    }
}
