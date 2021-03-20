package b.l.a.d.a.a;

public final class t extends c {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4474b;

    public /* synthetic */ t(int i2, boolean z) {
        this.a = i2;
        this.f4474b = z;
    }

    public final boolean a() {
        return this.f4474b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.a == cVar.b() && this.f4474b == cVar.a();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (true != this.f4474b ? 1237 : 1231);
    }

    public final String toString() {
        int i2 = this.a;
        boolean z = this.f4474b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i2);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
