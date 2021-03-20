package e.a.a.a.y0.d.b.w;

import b.m.a.t.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.d.a.t;
import e.a.a.a.y0.d.b.l;
import e.a.a.a.y0.d.b.w.a;
import e.a.a.a.y0.j.t.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b implements l.c {

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f8671j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k  reason: collision with root package name */
    public static final Map<e.a.a.a.y0.f.a, a.C0184a> f8672k;
    public int[] a = null;

    /* renamed from: b  reason: collision with root package name */
    public e.a.a.a.y0.e.a0.b.c f8673b = null;
    public String c = null;
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f8674e = null;
    public String[] f = null;

    /* renamed from: g  reason: collision with root package name */
    public String[] f8675g = null;

    /* renamed from: h  reason: collision with root package name */
    public String[] f8676h = null;

    /* renamed from: i  reason: collision with root package name */
    public a.C0184a f8677i = null;

    /* renamed from: e.a.a.a.y0.d.b.w.b$b  reason: collision with other inner class name */
    public static abstract class C0186b implements l.b {
        public final List<String> a = new ArrayList();

        public void a() {
            e((String[]) this.a.toArray(new String[0]));
        }

        public void b(f fVar) {
        }

        public void c(Object obj) {
            if (obj instanceof String) {
                this.a.add((String) obj);
            }
        }

        public void d(e.a.a.a.y0.f.a aVar, e.a.a.a.y0.f.d dVar) {
        }

        public abstract void e(String[] strArr);
    }

    public class c implements l.a {
        public c(a aVar) {
        }

        public static /* synthetic */ void g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i2 == 7) {
                objArr[0] = "classId";
            } else if (i2 == 4) {
                objArr[0] = "enumClassId";
            } else if (i2 != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (i2) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a() {
        }

        public void b(e.a.a.a.y0.f.d dVar, f fVar) {
            if (dVar == null) {
                g(0);
                throw null;
            }
        }

        public l.a c(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.f.a aVar) {
            if (dVar != null) {
                return null;
            }
            g(6);
            throw null;
        }

        public void d(e.a.a.a.y0.f.d dVar, Object obj) {
            if (dVar != null) {
                String e2 = dVar.e();
                if (k.f5975b.equals(e2)) {
                    if (obj instanceof Integer) {
                        b bVar = b.this;
                        a.C0184a aVar = a.C0184a.f8668p.get(Integer.valueOf(((Integer) obj).intValue()));
                        if (aVar == null) {
                            aVar = a.C0184a.UNKNOWN;
                        }
                        bVar.f8677i = aVar;
                    }
                } else if ("mv".equals(e2)) {
                    if (obj instanceof int[]) {
                        b.this.a = (int[]) obj;
                    }
                } else if ("bv".equals(e2)) {
                    if (obj instanceof int[]) {
                        b.this.f8673b = new e.a.a.a.y0.e.a0.b.c((int[]) obj);
                    }
                } else if ("xs".equals(e2)) {
                    if (obj instanceof String) {
                        b.this.c = (String) obj;
                    }
                } else if ("xi".equals(e2)) {
                    if (obj instanceof Integer) {
                        b.this.d = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(e2) && (obj instanceof String)) {
                    b.this.f8674e = (String) obj;
                }
            }
        }

        public void e(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.f.a aVar, e.a.a.a.y0.f.d dVar2) {
            if (dVar == null) {
                g(3);
                throw null;
            }
        }

        public l.b f(e.a.a.a.y0.f.d dVar) {
            if (dVar != null) {
                String e2 = dVar.e();
                if ("d1".equals(e2)) {
                    return new c(this);
                }
                if ("d2".equals(e2)) {
                    return new d(this);
                }
                return null;
            }
            g(2);
            throw null;
        }
    }

    public class d implements l.a {
        public d(a aVar) {
        }

        public static /* synthetic */ void g(int i2) {
            Object[] objArr = new Object[3];
            if (i2 == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i2 == 7) {
                objArr[0] = "classId";
            } else if (i2 == 4) {
                objArr[0] = "enumClassId";
            } else if (i2 != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (i2) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a() {
        }

        public void b(e.a.a.a.y0.f.d dVar, f fVar) {
            if (dVar == null) {
                g(0);
                throw null;
            }
        }

        public l.a c(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.f.a aVar) {
            if (dVar != null) {
                return null;
            }
            g(6);
            throw null;
        }

        public void d(e.a.a.a.y0.f.d dVar, Object obj) {
            if (dVar != null) {
                String e2 = dVar.e();
                if ("version".equals(e2)) {
                    if (obj instanceof int[]) {
                        b bVar = b.this;
                        int[] iArr = (int[]) obj;
                        bVar.a = iArr;
                        if (bVar.f8673b == null) {
                            bVar.f8673b = new e.a.a.a.y0.e.a0.b.c(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(e2)) {
                    b.this.c = obj instanceof String ? (String) obj : null;
                }
            }
        }

        public void e(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.f.a aVar, e.a.a.a.y0.f.d dVar2) {
            if (dVar == null) {
                g(3);
                throw null;
            }
        }

        public l.b f(e.a.a.a.y0.f.d dVar) {
            if (dVar != null) {
                String e2 = dVar.e();
                if ("data".equals(e2) || "filePartClassNames".equals(e2)) {
                    return new e(this);
                }
                if ("strings".equals(e2)) {
                    return new f(this);
                }
                return null;
            }
            g(2);
            throw null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f8672k = hashMap;
        hashMap.put(e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b("kotlin.jvm.internal.KotlinClass")), a.C0184a.CLASS);
        hashMap.put(e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b("kotlin.jvm.internal.KotlinFileFacade")), a.C0184a.FILE_FACADE);
        hashMap.put(e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b("kotlin.jvm.internal.KotlinMultifileClass")), a.C0184a.MULTIFILE_CLASS);
        hashMap.put(e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b("kotlin.jvm.internal.KotlinMultifileClassPart")), a.C0184a.MULTIFILE_CLASS_PART);
        hashMap.put(e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b("kotlin.jvm.internal.KotlinSyntheticClass")), a.C0184a.SYNTHETIC_CLASS);
    }

    public l.a a(e.a.a.a.y0.f.a aVar, m0 m0Var) {
        a.C0184a aVar2;
        if (aVar.b().equals(t.a)) {
            return new c((a) null);
        }
        if (f8671j || this.f8677i != null || (aVar2 = f8672k.get(aVar)) == null) {
            return null;
        }
        this.f8677i = aVar2;
        return new d((a) null);
    }
}
