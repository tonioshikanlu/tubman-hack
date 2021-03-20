package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/appfoundry/previewer/model/JsonAppJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/JsonApp;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableIntAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/App;", "nullableAppAdapter", "nullableStringAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class JsonAppJsonAdapter extends l<JsonApp> {
    private final l<App> nullableAppAdapter;
    private final l<Integer> nullableIntAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public JsonAppJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a(AnalyticsContext.Device.DEVICE_ID_KEY, "hash", "lastUpdate", "app", "statusCode", "message", "error");
        i.d(a, "JsonReader.Options.of(\"i…ode\", \"message\", \"error\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(String.class, qVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        i.d(d, "moshi.adapter(String::cl…,\n      emptySet(), \"id\")");
        this.nullableStringAdapter = d;
        l<App> d2 = xVar.d(App.class, qVar, "app");
        i.d(d2, "moshi.adapter(App::class… emptySet(),\n      \"app\")");
        this.nullableAppAdapter = d2;
        l<Integer> d3 = xVar.d(Integer.class, qVar, "statusCode");
        i.d(d3, "moshi.adapter(Int::class…emptySet(), \"statusCode\")");
        this.nullableIntAdapter = d3;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        App app2 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        while (qVar.N()) {
            switch (qVar.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.a(qVar);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.a(qVar);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.a(qVar);
                    break;
                case 3:
                    app2 = this.nullableAppAdapter.a(qVar);
                    break;
                case 4:
                    num = this.nullableIntAdapter.a(qVar);
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.a(qVar);
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.a(qVar);
                    break;
            }
        }
        qVar.z();
        return new JsonApp(str, str2, str3, app2, num, str4, str5);
    }

    public void e(u uVar, Object obj) {
        JsonApp jsonApp = (JsonApp) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(jsonApp, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.nullableStringAdapter.e(uVar, jsonApp.a);
        uVar.O("hash");
        this.nullableStringAdapter.e(uVar, jsonApp.f7121b);
        uVar.O("lastUpdate");
        this.nullableStringAdapter.e(uVar, jsonApp.c);
        uVar.O("app");
        this.nullableAppAdapter.e(uVar, jsonApp.d);
        uVar.O("statusCode");
        this.nullableIntAdapter.e(uVar, jsonApp.f7122e);
        uVar.O("message");
        this.nullableStringAdapter.e(uVar, jsonApp.f);
        uVar.O("error");
        this.nullableStringAdapter.e(uVar, jsonApp.f7123g);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(JsonApp)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(JsonApp)";
    }
}
