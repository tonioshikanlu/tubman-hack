package b.o;

import android.os.Bundle;

public class i implements h<Bundle> {
    public Bundle a;

    public i() {
        this.a = new Bundle();
    }

    public i(Bundle bundle) {
        this.a = bundle;
    }

    public void a(String str, String str2) {
        this.a.putString(str, str2);
    }

    public boolean b(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    public void c(String str, Long l2) {
        this.a.putLong(str, l2.longValue());
    }

    public Integer d(String str) {
        return Integer.valueOf(this.a.getInt(str));
    }

    public Long e(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    public String f(String str) {
        return this.a.getString(str);
    }

    public boolean g(String str) {
        return this.a.containsKey(str);
    }
}
