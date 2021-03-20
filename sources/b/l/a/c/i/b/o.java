package b.l.a.c.i.b;

import b.l.a.c.b.a;

public final class o {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4180b;
    public final long c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4181e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4182g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f4183h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f4184i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f4185j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f4186k;

    public o(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        a.x(str);
        a.x(str2);
        boolean z = true;
        a.j(j7 >= 0);
        a.j(j8 >= 0);
        a.j(j9 >= 0);
        a.j(j10 < 0 ? false : z);
        this.a = str;
        this.f4180b = str2;
        this.c = j7;
        this.d = j8;
        this.f4181e = j9;
        this.f = j5;
        this.f4182g = j10;
        this.f4183h = l2;
        this.f4184i = l3;
        this.f4185j = l4;
        this.f4186k = bool;
    }

    public final o a(long j2) {
        return new o(this.a, this.f4180b, this.c, this.d, this.f4181e, j2, this.f4182g, this.f4183h, this.f4184i, this.f4185j, this.f4186k);
    }

    public final o b(long j2, long j3) {
        return new o(this.a, this.f4180b, this.c, this.d, this.f4181e, this.f, j2, Long.valueOf(j3), this.f4184i, this.f4185j, this.f4186k);
    }

    public final o c(Long l2, Long l3, Boolean bool) {
        return new o(this.a, this.f4180b, this.c, this.d, this.f4181e, this.f, this.f4182g, this.f4183h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
