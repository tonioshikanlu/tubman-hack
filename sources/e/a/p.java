package e.a;

import e.h;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class p {
    public static final p c = new p((q) null, (n) null);
    public static final a d = new a((DefaultConstructorMarker) null);
    public final q a;

    /* renamed from: b  reason: collision with root package name */
    public final n f7868b;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public p(q qVar, n nVar) {
        String str;
        this.a = qVar;
        this.f7868b = nVar;
        if (!((qVar == null) != (nVar == null) ? false : true)) {
            if (qVar == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + qVar + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return i.a(this.a, pVar.a) && i.a(this.f7868b, pVar.f7868b);
    }

    public int hashCode() {
        q qVar = this.a;
        int i2 = 0;
        int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        n nVar = this.f7868b;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        String str;
        StringBuilder sb;
        q qVar = this.a;
        if (qVar == null) {
            return "*";
        }
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            return String.valueOf(this.f7868b);
        }
        if (ordinal == 1) {
            sb = new StringBuilder();
            str = "in ";
        } else if (ordinal == 2) {
            sb = new StringBuilder();
            str = "out ";
        } else {
            throw new h();
        }
        sb.append(str);
        sb.append(this.f7868b);
        return sb.toString();
    }
}
