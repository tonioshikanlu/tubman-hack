package b.j.a.c.b0.a0;

import b.j.a.b.i;
import b.j.a.b.l;
import b.j.a.c.g;
import b.j.a.c.h;

public class x extends c0<StackTraceElement> {
    public x() {
        super((Class<?>) StackTraceElement.class);
    }

    /* renamed from: c0 */
    public StackTraceElement d(i iVar, g gVar) {
        l g0 = iVar.g0();
        if (g0 == l.START_OBJECT) {
            int i2 = -1;
            String str = "";
            String str2 = str;
            String str3 = str2;
            while (true) {
                l U0 = iVar.U0();
                if (U0 == l.END_OBJECT) {
                    return new StackTraceElement(str, str2, str3, i2);
                }
                String e0 = iVar.e0();
                if ("className".equals(e0)) {
                    str = iVar.x0();
                } else {
                    if (!"classLoaderName".equals(e0)) {
                        if ("fileName".equals(e0)) {
                            str3 = iVar.x0();
                        } else if ("lineNumber".equals(e0)) {
                            i2 = U0.f1444n ? iVar.q0() : L(iVar, gVar);
                        } else if ("methodName".equals(e0)) {
                            str2 = iVar.x0();
                        } else if (!"nativeMethod".equals(e0)) {
                            if (!"moduleName".equals(e0) && !"moduleVersion".equals(e0)) {
                                if (!"declaringClass".equals(e0) && !"format".equals(e0)) {
                                    b0(iVar, gVar, this.f1761h, e0);
                                }
                            }
                        }
                    }
                    iVar.x0();
                }
                iVar.a1();
            }
        } else if (g0 != l.START_ARRAY || !gVar.O(h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            gVar.G(this.f1761h, iVar);
            throw null;
        } else {
            iVar.T0();
            StackTraceElement c0 = d(iVar, gVar);
            if (iVar.T0() == l.END_ARRAY) {
                return c0;
            }
            a0(gVar);
            throw null;
        }
    }
}
