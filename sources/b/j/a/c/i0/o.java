package b.j.a.c.i0;

import b.j.a.c.i;
import b.j.a.c.j0.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class o implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final n f2193h;

    public static final class a extends StringTokenizer {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public int f2194b;
        public String c;

        public a(String str) {
            super(str, "<,>", true);
            this.a = str;
        }

        public boolean hasMoreTokens() {
            return this.c != null || super.hasMoreTokens();
        }

        public String nextToken() {
            String str = this.c;
            if (str != null) {
                this.c = null;
                return str;
            }
            String nextToken = super.nextToken();
            this.f2194b = nextToken.length() + this.f2194b;
            return nextToken.trim();
        }
    }

    public o(n nVar) {
        this.f2193h = nVar;
    }

    public IllegalArgumentException a(a aVar, String str) {
        String str2 = aVar.a;
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", new Object[]{str2, str2.substring(aVar.f2194b), str}));
    }

    public i b(a aVar) {
        if (aVar.hasMoreTokens()) {
            String nextToken = aVar.nextToken();
            try {
                Class<?> l2 = this.f2193h.l(nextToken);
                if (aVar.hasMoreTokens()) {
                    String nextToken2 = aVar.nextToken();
                    if ("<".equals(nextToken2)) {
                        ArrayList arrayList = new ArrayList();
                        while (aVar.hasMoreTokens()) {
                            arrayList.add(b(aVar));
                            if (!aVar.hasMoreTokens()) {
                                break;
                            }
                            String nextToken3 = aVar.nextToken();
                            if (">".equals(nextToken3)) {
                                return this.f2193h.c((c) null, l2, m.c(l2, arrayList.isEmpty() ? m.f2172m : (i[]) arrayList.toArray(new i[arrayList.size()])));
                            } else if (!",".equals(nextToken3)) {
                                throw a(aVar, "Unexpected token '" + nextToken3 + "', expected ',' or '>')");
                            }
                        }
                        throw a(aVar, "Unexpected end-of-string");
                    }
                    aVar.c = nextToken2;
                }
                return this.f2193h.c((c) null, l2, m.f2173n);
            } catch (Exception e2) {
                g.E(e2);
                throw a(aVar, "Cannot locate class '" + nextToken + "', problem: " + e2.getMessage());
            }
        } else {
            throw a(aVar, "Unexpected end-of-string");
        }
    }
}
