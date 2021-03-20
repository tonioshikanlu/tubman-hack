package b.o;

import androidx.annotation.NonNull;
import b.e.a.a.a;
import com.segment.analytics.AnalyticsContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class s0 {
    @NonNull
    public String a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, HashMap<String, String>> f6272b;
    @NonNull
    public ArrayList<ArrayList<d2>> c;
    @NonNull
    public Set<String> d;

    /* renamed from: e  reason: collision with root package name */
    public f1 f6273e = new f1();
    public double f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6274g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6275h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6276i;

    /* renamed from: j  reason: collision with root package name */
    public Date f6277j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6278k;

    public s0(@NonNull String str, @NonNull Set<String> set, boolean z, f1 f1Var) {
        this.a = str;
        this.d = set;
        this.f6274g = z;
        this.f6273e = f1Var;
    }

    public s0(JSONObject jSONObject) {
        this.a = jSONObject.getString(AnalyticsContext.Device.DEVICE_ID_KEY);
        JSONObject jSONObject2 = jSONObject.getJSONObject("variants");
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys2 = jSONObject3.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap2.put(next2, jSONObject3.getString(next2));
            }
            hashMap.put(next, hashMap2);
        }
        this.f6272b = hashMap;
        JSONArray jSONArray = jSONObject.getJSONArray("triggers");
        ArrayList<ArrayList<d2>> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                arrayList2.add(new d2(jSONArray2.getJSONObject(i3)));
            }
            arrayList.add(arrayList2);
        }
        this.c = arrayList;
        this.d = new HashSet();
        Date date = null;
        try {
            String string = jSONObject.getString("end_time");
            if (!string.equals("null")) {
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).parse(string);
                } catch (ParseException e2) {
                    e2.printStackTrace();
                }
            }
        } catch (JSONException unused) {
        }
        this.f6277j = date;
        if (jSONObject.has("redisplay")) {
            this.f6273e = new f1(jSONObject.getJSONObject("redisplay"));
        }
    }

    public s0(boolean z) {
        this.f6278k = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((s0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder y = a.y("OSInAppMessage{messageId='");
        y.append(this.a);
        y.append('\'');
        y.append(", variants=");
        y.append(this.f6272b);
        y.append(", triggers=");
        y.append(this.c);
        y.append(", clickedClickIds=");
        y.append(this.d);
        y.append(", redisplayStats=");
        y.append(this.f6273e);
        y.append(", displayDuration=");
        y.append(this.f);
        y.append(", displayedInSession=");
        y.append(this.f6274g);
        y.append(", triggerChanged=");
        y.append(this.f6275h);
        y.append(", actionTaken=");
        y.append(this.f6276i);
        y.append(", isPreview=");
        y.append(this.f6278k);
        y.append(", endTime=");
        y.append(this.f6277j);
        y.append('}');
        return y.toString();
    }
}
