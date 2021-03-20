package b.l.d.q.f.l;

import b.l.a.a.d;
import b.l.d.q.f.i.v;
import b.l.d.q.f.i.x.h;

public class c {

    /* renamed from: b  reason: collision with root package name */
    public static final h f5268b = new h();
    public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    public static final b.l.a.a.c<v, byte[]> f5269e = b.a;
    public final d<v> a;

    public c(d<v> dVar, b.l.a.a.c<v, byte[]> cVar) {
        this.a = dVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }
}
