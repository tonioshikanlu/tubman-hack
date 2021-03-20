package b.l.a.a.e.e;

import androidx.annotation.Nullable;

public final class c extends a {
    public final Integer a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2416b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2417e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2418g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2419h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2420i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2421j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2422k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2423l;

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, a aVar) {
        this.a = num;
        this.f2416b = str;
        this.c = str2;
        this.d = str3;
        this.f2417e = str4;
        this.f = str5;
        this.f2418g = str6;
        this.f2419h = str7;
        this.f2420i = str8;
        this.f2421j = str9;
        this.f2422k = str10;
        this.f2423l = str11;
    }

    @Nullable
    public String a() {
        return this.f2423l;
    }

    @Nullable
    public String b() {
        return this.f2421j;
    }

    @Nullable
    public String c() {
        return this.d;
    }

    @Nullable
    public String d() {
        return this.f2419h;
    }

    @Nullable
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f2416b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f2417e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.f2418g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f2419h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.f2420i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f2421j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f2422k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f2423l;
                                                    String a2 = aVar.a();
                                                    if (str11 == null) {
                                                        if (a2 == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(a2)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    public String f() {
        return this.f2420i;
    }

    @Nullable
    public String g() {
        return this.f2418g;
    }

    @Nullable
    public String h() {
        return this.f2422k;
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2416b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2417e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f2418g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f2419h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f2420i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f2421j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f2422k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f2423l;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode11 ^ i2;
    }

    @Nullable
    public String i() {
        return this.f2416b;
    }

    @Nullable
    public String j() {
        return this.f;
    }

    @Nullable
    public String k() {
        return this.f2417e;
    }

    @Nullable
    public Integer l() {
        return this.a;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("AndroidClientInfo{sdkVersion=");
        y.append(this.a);
        y.append(", model=");
        y.append(this.f2416b);
        y.append(", hardware=");
        y.append(this.c);
        y.append(", device=");
        y.append(this.d);
        y.append(", product=");
        y.append(this.f2417e);
        y.append(", osBuild=");
        y.append(this.f);
        y.append(", manufacturer=");
        y.append(this.f2418g);
        y.append(", fingerprint=");
        y.append(this.f2419h);
        y.append(", locale=");
        y.append(this.f2420i);
        y.append(", country=");
        y.append(this.f2421j);
        y.append(", mccMnc=");
        y.append(this.f2422k);
        y.append(", applicationBuild=");
        return b.e.a.a.a.q(y, this.f2423l, "}");
    }
}
