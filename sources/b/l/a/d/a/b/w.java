package b.l.a.d.a.b;

import androidx.annotation.Nullable;
import b.e.a.a.a;

public final class w extends b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4640b;

    public w(int i2, @Nullable String str, @Nullable String str2) {
        this.a = str;
        this.f4640b = str2;
    }

    @Nullable
    public final String a() {
        return this.f4640b;
    }

    public final int b() {
        return 0;
    }

    @Nullable
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.b() == 0 && ((str = this.a) != null ? str.equals(bVar.c()) : bVar.c() == null)) {
                String str2 = this.f4640b;
                String a2 = bVar.a();
                if (str2 != null ? str2.equals(a2) : a2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ -721379959) * 1000003;
        String str2 = this.f4640b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f4640b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(0);
        sb.append(", path=");
        sb.append(str);
        return a.r(sb, ", assetsPath=", str2, "}");
    }
}
