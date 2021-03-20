package b.a.a.g;

import b.e.a.a.a;
import e.x.c.i;

public final class b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f238b;
    public final String c;

    public b(String str, String str2, String str3) {
        i.e(str2, "startDate");
        this.a = str;
        this.f238b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.a, bVar.a) && i.a(this.f238b, bVar.f238b) && i.a(this.c, bVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f238b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("AddToCalendarEvent(eventName=");
        y.append(this.a);
        y.append(", startDate=");
        y.append(this.f238b);
        y.append(", endDate=");
        return a.q(y, this.c, ")");
    }
}
