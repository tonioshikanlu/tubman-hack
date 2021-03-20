package b.g.a.k;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import b.l.e.k;
import com.amplitude.api.DeviceInfo;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class c {
    public final Map<String, String> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f464b;

    public c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.a = Collections.emptyMap();
            this.f464b = null;
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DeviceInfo.OS_NAME, String.valueOf(Build.VERSION.SDK_INT));
        if (!TextUtils.isEmpty((CharSequence) null)) {
            hashMap.put("auth0.android", (Object) null);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(hashMap);
        this.a = unmodifiableMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("name", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap2.put("version", str2);
        }
        hashMap2.put("env", unmodifiableMap);
        String i2 = new k().i(hashMap2);
        Charset forName = Charset.forName("UTF-8");
        this.f464b = new String(Base64.encode(i2.getBytes(forName), 10), forName);
    }
}
