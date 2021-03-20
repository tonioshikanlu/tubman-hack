package b.l.d.o.e0;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import b.l.a.c.c.n.a;
import b.l.a.c.f.e.fc;
import b.l.a.c.f.e.pc;
import b.l.a.c.f.e.sm;
import b.l.a.c.f.e.w1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class o {
    public static final a a = new a("JSONParser", new String[0]);

    @NonNull
    public static Map<String, Object> a(String str) {
        byte[] bArr;
        b.l.a.c.b.a.x(str);
        List<String> b2 = new w1(new sm(new pc())).b(str);
        if (b2.size() < 2) {
            a.b(str.length() != 0 ? "Invalid idToken ".concat(str) : new String("Invalid idToken "), new Object[0]);
            return new HashMap();
        }
        String str2 = b2.get(1);
        try {
            if (str2 == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(str2, 11);
            }
            Map<String, Object> b3 = b(new String(bArr, "UTF-8"));
            return b3 == null ? new HashMap() : b3;
        } catch (UnsupportedEncodingException e2) {
            a aVar = a;
            Log.e(aVar.a, aVar.c("Unable to decode token", new Object[0]), e2);
            return new HashMap();
        }
    }

    @Nullable
    public static Map<String, Object> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e2) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new fc(e2);
        }
    }

    public static Map<String, Object> c(JSONObject jSONObject) {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = d((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayMap.put(next, obj);
        }
        return arrayMap;
    }

    public static List<Object> d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = d((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
