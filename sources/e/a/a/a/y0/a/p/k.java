package e.a.a.a.y0.a.p;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.j;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.x;
import e.a.a.a.y0.d.b.r;
import e.a.a.a.y0.j.l;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.l.i;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.d1;
import e.a.a.a.y0.m.g0;
import e.a.a.a.y0.m.k0;
import e.a.l;
import e.t.o;
import e.x.b.p;
import e.x.c.q;
import e.x.c.v;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class k implements e.a.a.a.y0.b.b1.a, e.a.a.a.y0.b.b1.c {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ l[] f7741i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f7742j;

    /* renamed from: k  reason: collision with root package name */
    public static final Set<String> f7743k;

    /* renamed from: l  reason: collision with root package name */
    public static final Set<String> f7744l;

    /* renamed from: m  reason: collision with root package name */
    public static final Set<String> f7745m;

    /* renamed from: n  reason: collision with root package name */
    public static final Set<String> f7746n;

    /* renamed from: o  reason: collision with root package name */
    public static final Set<String> f7747o;

    /* renamed from: p  reason: collision with root package name */
    public static final a f7748p;
    public final c a = c.f7720m;

    /* renamed from: b  reason: collision with root package name */
    public final e.f f7749b;
    public final e.f c;
    public final d0 d;

    /* renamed from: e  reason: collision with root package name */
    public final i f7750e;
    public final e.a.a.a.y0.l.a<e.a.a.a.y0.f.b, e.a.a.a.y0.b.e> f;

    /* renamed from: g  reason: collision with root package name */
    public final i f7751g;

    /* renamed from: h  reason: collision with root package name */
    public final w f7752h;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean a(e.a.a.a.y0.f.c cVar) {
            g.d dVar = g.f7647k;
            if (!e.x.c.i.a(cVar, dVar.f7655g)) {
                if (cVar != null) {
                    if (!(dVar.k0.get(cVar) != null)) {
                        return false;
                    }
                } else {
                    g.a(78);
                    throw null;
                }
            }
            return true;
        }
    }

    public enum b {
        BLACK_LIST,
        WHITE_LIST,
        NOT_CONSIDERED,
        DROP
    }

    public static final class c extends e.x.c.k implements e.x.b.a<k0> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f7758h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ m f7759i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(k kVar, m mVar) {
            super(0);
            this.f7758h = kVar;
            this.f7759i = mVar;
        }

        public Object e() {
            Objects.requireNonNull(e.f7725h);
            return b.q.a.a.o0((w) this.f7758h.f7749b.getValue(), e.f7724g, new x(this.f7759i, (w) this.f7758h.f7749b.getValue())).s();
        }
    }

    public static final class d extends e.x.c.k implements p<j, j, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ d1 f7760h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(d1 d1Var) {
            super(2);
            this.f7760h = d1Var;
        }

        public final boolean a(j jVar, j jVar2) {
            e.x.c.i.e(jVar, "$this$isEffectivelyTheSameAs");
            e.x.c.i.e(jVar2, "javaConstructor");
            return e.a.a.a.y0.j.l.j(jVar, jVar2.c(this.f7760h)) == l.d.a.OVERRIDABLE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(a((j) obj, (j) obj2));
        }
    }

    public static final class e extends e.x.c.k implements e.x.b.l<e.a.a.a.y0.j.y.i, Collection<? extends l0>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.y0.f.d f7761h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(e.a.a.a.y0.f.d dVar) {
            super(1);
            this.f7761h = dVar;
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.j.y.i iVar = (e.a.a.a.y0.j.y.i) obj;
            e.x.c.i.e(iVar, "it");
            return iVar.a(this.f7761h, e.a.a.a.y0.c.a.d.FROM_BUILTINS);
        }
    }

    public static final class f extends e.x.c.k implements e.x.b.a<h> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ k f7762h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(k kVar) {
            super(0);
            this.f7762h = kVar;
        }

        public Object e() {
            g v = this.f7762h.f7752h.v();
            e.a.a.a.y0.f.d dVar = e.a.a.a.y0.b.a1.g.a;
            e.x.c.i.e(v, "$this$createDeprecatedAnnotation");
            e.x.c.i.e("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "message");
            e.x.c.i.e("", "replaceWith");
            e.x.c.i.e("WARNING", "level");
            g.d dVar2 = g.f7647k;
            e.a.a.a.y0.f.b bVar = dVar2.v;
            e.x.c.i.d(bVar, "KotlinBuiltIns.FQ_NAMES.replaceWith");
            e.a.a.a.y0.b.a1.j jVar = new e.a.a.a.y0.b.a1.j(v, bVar, e.t.g.E(new e.j(e.a.a.a.y0.b.a1.g.d, new e.a.a.a.y0.j.t.x("")), new e.j(e.a.a.a.y0.b.a1.g.f7784e, new e.a.a.a.y0.j.t.b(o.f7934h, new e.a.a.a.y0.b.a1.f(v)))));
            e.a.a.a.y0.f.b bVar2 = dVar2.t;
            e.x.c.i.d(bVar2, "KotlinBuiltIns.FQ_NAMES.deprecated");
            e.a.a.a.y0.f.d dVar3 = e.a.a.a.y0.b.a1.g.c;
            e.a.a.a.y0.f.a l2 = e.a.a.a.y0.f.a.l(dVar2.u);
            e.x.c.i.d(l2, "ClassId.topLevel(KotlinB…Q_NAMES.deprecationLevel)");
            e.a.a.a.y0.f.d l3 = e.a.a.a.y0.f.d.l("WARNING");
            e.x.c.i.d(l3, "Name.identifier(level)");
            return h.f7785e.a(b.q.a.a.l2(new e.a.a.a.y0.b.a1.j(v, bVar2, e.t.g.E(new e.j(e.a.a.a.y0.b.a1.g.a, new e.a.a.a.y0.j.t.x("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new e.j(e.a.a.a.y0.b.a1.g.f7783b, new e.a.a.a.y0.j.t.a(jVar)), new e.j(dVar3, new e.a.a.a.y0.j.t.k(l2, l3))))));
        }
    }

    static {
        Class<k> cls = k.class;
        r rVar = r.a;
        f7741i = new e.a.l[]{v.c(new q(v.a(cls), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), v.c(new q(v.a(cls), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
        a aVar = new a((DefaultConstructorMarker) null);
        f7748p = aVar;
        f7742j = e.t.g.L(rVar.d("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        Objects.requireNonNull(aVar);
        List<e.a.a.a.y0.j.w.c> B = e.t.g.B(e.a.a.a.y0.j.w.c.BOOLEAN, e.a.a.a.y0.j.w.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (e.a.a.a.y0.j.w.c cVar : B) {
            String e2 = cVar.m().g().e();
            e.x.c.i.d(e2, "it.wrapperFqName.shortName().asString()");
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            String str = cVar.f9433i;
            if (str != null) {
                sb.append(str);
                sb.append("Value()");
                sb.append(cVar.j());
                strArr[0] = sb.toString();
                e.t.g.b(linkedHashSet, rVar.c(e2, strArr));
            } else {
                e.a.a.a.y0.j.w.c.d(11);
                throw null;
            }
        }
        f7743k = e.t.g.K(e.t.g.K(e.t.g.K(e.t.g.K(e.t.g.K(linkedHashSet, rVar.d("List", "sort(Ljava/util/Comparator;)V")), rVar.c("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), rVar.c("Double", "isInfinite()Z", "isNaN()Z")), rVar.c("Float", "isInfinite()Z", "isNaN()Z")), rVar.c("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        f7744l = e.t.g.K(e.t.g.K(e.t.g.K(e.t.g.K(e.t.g.K(e.t.g.K(rVar.c("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), rVar.d("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), rVar.c("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), rVar.c("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), rVar.d("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), rVar.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), rVar.d("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f7745m = e.t.g.K(e.t.g.K(rVar.d("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), rVar.d("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), rVar.d("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Objects.requireNonNull(f7748p);
        e.a.a.a.y0.j.w.c cVar2 = e.a.a.a.y0.j.w.c.BYTE;
        List<e.a.a.a.y0.j.w.c> B2 = e.t.g.B(e.a.a.a.y0.j.w.c.BOOLEAN, cVar2, e.a.a.a.y0.j.w.c.DOUBLE, e.a.a.a.y0.j.w.c.FLOAT, cVar2, e.a.a.a.y0.j.w.c.INT, e.a.a.a.y0.j.w.c.LONG, e.a.a.a.y0.j.w.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (e.a.a.a.y0.j.w.c m2 : B2) {
            String e3 = m2.m().g().e();
            e.x.c.i.d(e3, "it.wrapperFqName.shortName().asString()");
            String[] a2 = rVar.a("Ljava/lang/String;");
            e.t.g.b(linkedHashSet2, rVar.c(e3, (String[]) Arrays.copyOf(a2, a2.length)));
        }
        String[] a3 = rVar.a("D");
        Set<T> K = e.t.g.K(linkedHashSet2, rVar.c("Float", (String[]) Arrays.copyOf(a3, a3.length)));
        String[] a4 = rVar.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f7746n = e.t.g.K(K, rVar.c("String", (String[]) Arrays.copyOf(a4, a4.length)));
        String[] a5 = rVar.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f7747o = rVar.c("Throwable", (String[]) Arrays.copyOf(a5, a5.length));
    }

    public k(w wVar, m mVar, e.x.b.a<? extends w> aVar, e.x.b.a<Boolean> aVar2) {
        e.x.c.i.e(wVar, "moduleDescriptor");
        e.x.c.i.e(mVar, "storageManager");
        e.x.c.i.e(aVar, "deferredOwnerModuleDescriptor");
        e.x.c.i.e(aVar2, "isAdditionalBuiltInsFeatureSupported");
        this.f7752h = wVar;
        this.f7749b = b.q.a.a.h2(aVar);
        this.c = b.q.a.a.h2(aVar2);
        e.a.a.a.y0.b.c1.k kVar = new e.a.a.a.y0.b.c1.k(new l(this, wVar, new e.a.a.a.y0.f.b("java.io")), e.a.a.a.y0.f.d.l("Serializable"), e.a.a.a.y0.b.v.ABSTRACT, e.a.a.a.y0.b.f.INTERFACE, b.q.a.a.l2(new g0(mVar, new m(this))), m0.a, false, mVar);
        kVar.K0(i.b.f9460b, e.t.q.f7936h, (e.a.a.a.y0.b.d) null);
        k0 s = kVar.s();
        e.x.c.i.d(s, "mockSerializableClass.defaultType");
        this.d = s;
        this.f7750e = mVar.a(new c(this, mVar));
        this.f = mVar.f();
        this.f7751g = mVar.a(new f(this));
    }

    public Collection<d0> a(e.a.a.a.y0.b.e eVar) {
        e.x.c.i.e(eVar, "classDescriptor");
        e.a.a.a.y0.f.c i2 = e.a.a.a.y0.j.v.b.i(eVar);
        a aVar = f7748p;
        boolean z = true;
        if (aVar.a(i2)) {
            k0 k0Var = (k0) b.q.a.a.j1(this.f7750e, f7741i[0]);
            e.x.c.i.d(k0Var, "cloneableType");
            return e.t.g.B(k0Var, this.d);
        }
        e.x.c.i.e(i2, "fqName");
        if (!aVar.a(i2)) {
            e.a.a.a.y0.f.a l2 = c.f7720m.l(i2);
            if (l2 != null) {
                try {
                    Class<?> cls = Class.forName(l2.b().b());
                    e.x.c.i.d(cls, "Class.forName(javaClassI…ingleFqName().asString())");
                    z = Serializable.class.isAssignableFrom(cls);
                } catch (ClassNotFoundException unused) {
                }
            }
            z = false;
        }
        return z ? b.q.a.a.l2(this.d) : o.f7934h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r3 = (r3 = f(r3)).K0().e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection b(e.a.a.a.y0.b.e r3) {
        /*
            r2 = this;
            e.t.q r0 = e.t.q.f7936h
            java.lang.String r1 = "classDescriptor"
            e.x.c.i.e(r3, r1)
            boolean r1 = r2.g()
            if (r1 != 0) goto L_0x000e
            goto L_0x001f
        L_0x000e:
            e.a.a.a.y0.d.a.b0.n.e r3 = r2.f(r3)
            if (r3 == 0) goto L_0x001f
            e.a.a.a.y0.d.a.b0.n.g r3 = r3.G0()
            java.util.Set r3 = r3.e()
            if (r3 == 0) goto L_0x001f
            r0 = r3
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.a.p.k.b(e.a.a.a.y0.b.e):java.util.Collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: e.t.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<e.a.a.a.y0.b.d> c(e.a.a.a.y0.b.e r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            e.a.a.a.y0.d.b.t r2 = e.a.a.a.y0.d.b.t.a
            e.t.o r3 = e.t.o.f7934h
            java.lang.String r4 = "classDescriptor"
            e.x.c.i.e(r1, r4)
            r5 = r1
            e.a.a.a.y0.k.b.g0.d r5 = (e.a.a.a.y0.k.b.g0.d) r5
            e.a.a.a.y0.b.f r5 = r5.f9512o
            e.a.a.a.y0.b.f r6 = e.a.a.a.y0.b.f.CLASS
            if (r5 != r6) goto L_0x0226
            boolean r5 = r20.g()
            if (r5 != 0) goto L_0x001e
            goto L_0x0226
        L_0x001e:
            e.a.a.a.y0.d.a.b0.n.e r5 = r20.f(r21)
            if (r5 == 0) goto L_0x0226
            e.a.a.a.y0.a.p.c r6 = r0.a
            e.a.a.a.y0.f.b r7 = e.a.a.a.y0.j.v.b.h(r5)
            e.a.a.a.y0.a.p.b r8 = e.a.a.a.y0.a.p.b.f7711n
            e.a.a.a.y0.a.g r8 = e.a.a.a.y0.a.p.b.f7710m
            r9 = 4
            r10 = 0
            e.a.a.a.y0.b.e r6 = e.a.a.a.y0.a.p.c.k(r6, r7, r8, r10, r9)
            if (r6 == 0) goto L_0x0226
            e.a.a.a.y0.m.x0 r3 = b.q.a.a.e0(r6, r5)
            e.a.a.a.y0.m.d1 r3 = r3.c()
            e.a.a.a.y0.a.p.k$d r7 = new e.a.a.a.y0.a.p.k$d
            r7.<init>(r3)
            e.a.a.a.y0.d.a.b0.n.g r8 = r5.u
            e.a.a.a.y0.l.i<java.util.List<e.a.a.a.y0.b.d>> r8 = r8.f8392n
            java.lang.Object r8 = r8.e()
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0056:
            boolean r10 = r8.hasNext()
            java.lang.String r11 = "internalName"
            java.lang.String r12 = "JvmClassName.byClassId(it).internalName"
            java.lang.String r13 = "JvmClassName.byClassId(it)"
            java.lang.String r14 = "fqNameSafe.toUnsafe()"
            java.lang.String r15 = "$this$internalName"
            java.lang.String r0 = "jvmDescriptor"
            if (r10 == 0) goto L_0x016b
            java.lang.Object r10 = r8.next()
            r16 = r8
            r8 = r10
            e.a.a.a.y0.b.d r8 = (e.a.a.a.y0.b.d) r8
            r17 = r3
            e.a.a.a.y0.b.z0 r3 = r8.getVisibility()
            boolean r3 = r3.f7860b
            if (r3 == 0) goto L_0x0155
            java.util.Collection r3 = r6.r()
            r18 = r6
            java.lang.String r6 = "defaultKotlinVersion.constructors"
            e.x.c.i.d(r3, r6)
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x008d
            goto L_0x00af
        L_0x008d:
            java.util.Iterator r3 = r3.iterator()
        L_0x0091:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00af
            java.lang.Object r6 = r3.next()
            e.a.a.a.y0.b.d r6 = (e.a.a.a.y0.b.d) r6
            r19 = r3
            java.lang.String r3 = "it"
            e.x.c.i.d(r6, r3)
            boolean r3 = r7.a(r6, r8)
            if (r3 == 0) goto L_0x00ac
            r3 = 0
            goto L_0x00b0
        L_0x00ac:
            r3 = r19
            goto L_0x0091
        L_0x00af:
            r3 = 1
        L_0x00b0:
            if (r3 == 0) goto L_0x0157
            java.util.List r3 = r8.n()
            int r3 = r3.size()
            r6 = 1
            if (r3 != r6) goto L_0x00f1
            java.util.List r3 = r8.n()
            java.lang.String r6 = "valueParameters"
            e.x.c.i.d(r3, r6)
            java.lang.Object r3 = e.t.g.O(r3)
            java.lang.String r6 = "valueParameters.single()"
            e.x.c.i.d(r3, r6)
            e.a.a.a.y0.b.w0 r3 = (e.a.a.a.y0.b.w0) r3
            e.a.a.a.y0.m.d0 r3 = r3.d()
            e.a.a.a.y0.m.v0 r3 = r3.W0()
            e.a.a.a.y0.b.h r3 = r3.d()
            if (r3 == 0) goto L_0x00e4
            e.a.a.a.y0.f.c r3 = e.a.a.a.y0.j.v.b.i(r3)
            goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            e.a.a.a.y0.f.c r6 = e.a.a.a.y0.j.v.b.i(r21)
            boolean r3 = e.x.c.i.a(r3, r6)
            if (r3 == 0) goto L_0x00f1
            r3 = 1
            goto L_0x00f2
        L_0x00f1:
            r3 = 0
        L_0x00f2:
            if (r3 != 0) goto L_0x0157
            boolean r3 = e.a.a.a.y0.a.g.E(r8)
            if (r3 != 0) goto L_0x0157
            java.util.Set<java.lang.String> r3 = f7746n
            r6 = 0
            r19 = r7
            r7 = 3
            java.lang.String r6 = b.q.a.a.H(r8, r6, r6, r7)
            e.x.c.i.e(r5, r4)
            e.x.c.i.e(r6, r0)
            e.x.c.i.e(r5, r15)
            e.a.a.a.y0.a.p.c r7 = e.a.a.a.y0.a.p.c.f7720m
            e.a.a.a.y0.f.b r8 = e.a.a.a.y0.j.v.b.h(r5)
            e.a.a.a.y0.f.c r8 = r8.j()
            e.x.c.i.d(r8, r14)
            e.a.a.a.y0.f.a r7 = r7.l(r8)
            if (r7 == 0) goto L_0x012f
            e.a.a.a.y0.j.w.b r7 = e.a.a.a.y0.j.w.b.b(r7)
            e.x.c.i.d(r7, r13)
            java.lang.String r7 = r7.e()
            e.x.c.i.d(r7, r12)
            goto L_0x0133
        L_0x012f:
            java.lang.String r7 = e.a.a.a.y0.d.b.v.a(r5, r2)
        L_0x0133:
            e.x.c.i.e(r7, r11)
            e.x.c.i.e(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r7 = 46
            r0.append(r7)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0159
            r0 = 1
            goto L_0x015a
        L_0x0155:
            r18 = r6
        L_0x0157:
            r19 = r7
        L_0x0159:
            r0 = 0
        L_0x015a:
            if (r0 == 0) goto L_0x015f
            r9.add(r10)
        L_0x015f:
            r0 = r20
            r8 = r16
            r3 = r17
            r6 = r18
            r7 = r19
            goto L_0x0056
        L_0x016b:
            r17 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 10
            int r6 = b.q.a.a.C(r9, r6)
            r3.<init>(r6)
            java.util.Iterator r6 = r9.iterator()
        L_0x017c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0224
            java.lang.Object r7 = r6.next()
            e.a.a.a.y0.b.d r7 = (e.a.a.a.y0.b.d) r7
            e.a.a.a.y0.b.s$a r8 = r7.x()
            r8.j(r1)
            r9 = r1
            e.a.a.a.y0.b.c1.b r9 = (e.a.a.a.y0.b.c1.b) r9
            e.a.a.a.y0.m.k0 r9 = r9.s()
            r8.q(r9)
            r8.o()
            e.a.a.a.y0.m.b1 r9 = r17.g()
            r8.h(r9)
            java.util.Set<java.lang.String> r9 = f7747o
            r10 = 0
            r1 = 3
            java.lang.String r1 = b.q.a.a.H(r7, r10, r10, r1)
            e.x.c.i.e(r5, r4)
            e.x.c.i.e(r1, r0)
            e.x.c.i.e(r5, r15)
            e.a.a.a.y0.a.p.c r7 = e.a.a.a.y0.a.p.c.f7720m
            e.a.a.a.y0.f.b r10 = e.a.a.a.y0.j.v.b.h(r5)
            e.a.a.a.y0.f.c r10 = r10.j()
            e.x.c.i.d(r10, r14)
            e.a.a.a.y0.f.a r7 = r7.l(r10)
            if (r7 == 0) goto L_0x01d6
            e.a.a.a.y0.j.w.b r7 = e.a.a.a.y0.j.w.b.b(r7)
            e.x.c.i.d(r7, r13)
            java.lang.String r7 = r7.e()
            e.x.c.i.d(r7, r12)
            goto L_0x01da
        L_0x01d6:
            java.lang.String r7 = e.a.a.a.y0.d.b.v.a(r5, r2)
        L_0x01da:
            e.x.c.i.e(r7, r11)
            e.x.c.i.e(r1, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r7 = 46
            r10.append(r7)
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            boolean r1 = r9.contains(r1)
            if (r1 != 0) goto L_0x020e
            r1 = r0
            r0 = r20
            e.a.a.a.y0.l.i r7 = r0.f7751g
            e.a.l[] r9 = f7741i
            r10 = 1
            r9 = r9[r10]
            java.lang.Object r7 = b.q.a.a.j1(r7, r9)
            e.a.a.a.y0.b.a1.h r7 = (e.a.a.a.y0.b.a1.h) r7
            r8.p(r7)
            goto L_0x0211
        L_0x020e:
            r1 = r0
            r0 = r20
        L_0x0211:
            e.a.a.a.y0.b.s r7 = r8.e()
            java.lang.String r8 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor"
            java.util.Objects.requireNonNull(r7, r8)
            e.a.a.a.y0.b.d r7 = (e.a.a.a.y0.b.d) r7
            r3.add(r7)
            r0 = r1
            r1 = r21
            goto L_0x017c
        L_0x0224:
            r0 = r20
        L_0x0226:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.a.p.k.c(e.a.a.a.y0.b.e):java.util.Collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: e.t.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: e.t.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x033a, code lost:
        if (r4 != 3) goto L_0x0361;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<e.a.a.a.y0.b.l0> d(e.a.a.a.y0.f.d r17, e.a.a.a.y0.b.e r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            e.t.o r3 = e.t.o.f7934h
            java.lang.String r4 = "name"
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = "classDescriptor"
            e.x.c.i.e(r2, r4)
            e.a.a.a.y0.a.p.a r5 = e.a.a.a.y0.a.p.a.f
            e.a.a.a.y0.f.d r5 = e.a.a.a.y0.a.p.a.f7709e
            boolean r5 = e.x.c.i.a(r1, r5)
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x00bc
            boolean r5 = r2 instanceof e.a.a.a.y0.k.b.g0.d
            if (r5 == 0) goto L_0x00bc
            e.a.a.a.y0.a.g$d r5 = e.a.a.a.y0.a.g.f7647k
            e.a.a.a.y0.f.c r5 = r5.f7655g
            boolean r5 = e.a.a.a.y0.a.g.c(r2, r5)
            if (r5 != 0) goto L_0x0035
            e.a.a.a.y0.a.i r5 = e.a.a.a.y0.a.g.s(r18)
            if (r5 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r5 = r6
            goto L_0x0036
        L_0x0035:
            r5 = r7
        L_0x0036:
            if (r5 == 0) goto L_0x00bc
            e.a.a.a.y0.k.b.g0.d r2 = (e.a.a.a.y0.k.b.g0.d) r2
            e.a.a.a.y0.e.c r4 = r2.B
            java.util.List<e.a.a.a.y0.e.i> r4 = r4.u
            java.lang.String r5 = "classDescriptor.classProto.functionList"
            e.x.c.i.d(r4, r5)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x004a
            goto L_0x0074
        L_0x004a:
            java.util.Iterator r4 = r4.iterator()
        L_0x004e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0074
            java.lang.Object r5 = r4.next()
            e.a.a.a.y0.e.i r5 = (e.a.a.a.y0.e.i) r5
            e.a.a.a.y0.k.b.l r8 = r2.f9513p
            e.a.a.a.y0.e.z.c r8 = r8.d
            java.lang.String r9 = "functionProto"
            e.x.c.i.d(r5, r9)
            int r5 = r5.f8929m
            e.a.a.a.y0.f.d r5 = b.q.a.a.X0(r8, r5)
            e.a.a.a.y0.a.p.a r8 = e.a.a.a.y0.a.p.a.f
            e.a.a.a.y0.f.d r8 = e.a.a.a.y0.a.p.a.f7709e
            boolean r5 = e.x.c.i.a(r5, r8)
            if (r5 == 0) goto L_0x004e
            goto L_0x0075
        L_0x0074:
            r7 = r6
        L_0x0075:
            if (r7 == 0) goto L_0x0078
            return r3
        L_0x0078:
            e.a.a.a.y0.l.i r3 = r0.f7750e
            e.a.l[] r4 = f7741i
            r4 = r4[r6]
            java.lang.Object r3 = b.q.a.a.j1(r3, r4)
            e.a.a.a.y0.m.k0 r3 = (e.a.a.a.y0.m.k0) r3
            e.a.a.a.y0.j.y.i r3 = r3.z()
            e.a.a.a.y0.c.a.d r4 = e.a.a.a.y0.c.a.d.FROM_BUILTINS
            java.util.Collection r1 = r3.a(r1, r4)
            java.lang.Object r1 = e.t.g.N(r1)
            e.a.a.a.y0.b.l0 r1 = (e.a.a.a.y0.b.l0) r1
            e.a.a.a.y0.b.s$a r1 = r1.x()
            r1.j(r2)
            e.a.a.a.y0.b.z0 r3 = e.a.a.a.y0.b.y0.f7850e
            r1.g(r3)
            e.a.a.a.y0.m.k0 r3 = r2.s()
            r1.q(r3)
            e.a.a.a.y0.b.i0 r2 = r2.U0()
            r1.n(r2)
            e.a.a.a.y0.b.s r1 = r1.e()
            e.x.c.i.c(r1)
            e.a.a.a.y0.b.l0 r1 = (e.a.a.a.y0.b.l0) r1
            java.util.List r1 = b.q.a.a.l2(r1)
            return r1
        L_0x00bc:
            boolean r5 = r16.g()
            if (r5 != 0) goto L_0x00c3
            return r3
        L_0x00c3:
            e.a.a.a.y0.a.p.k$e r5 = new e.a.a.a.y0.a.p.k$e
            r5.<init>(r1)
            e.a.a.a.y0.d.a.b0.n.e r1 = r0.f(r2)
            java.lang.String r8 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r9 = 0
            r10 = 2
            r11 = 3
            if (r1 == 0) goto L_0x02bb
            e.a.a.a.y0.a.p.c r12 = r0.a
            e.a.a.a.y0.f.b r13 = e.a.a.a.y0.j.v.b.h(r1)
            e.a.a.a.y0.a.p.b r14 = e.a.a.a.y0.a.p.b.f7711n
            e.a.a.a.y0.a.g r14 = e.a.a.a.y0.a.p.b.f7710m
            java.util.Objects.requireNonNull(r12)
            java.lang.String r15 = "fqName"
            e.x.c.i.e(r13, r15)
            java.lang.String r15 = "builtIns"
            e.x.c.i.e(r14, r15)
            r15 = 4
            e.a.a.a.y0.b.e r12 = e.a.a.a.y0.a.p.c.k(r12, r13, r14, r9, r15)
            if (r12 == 0) goto L_0x011d
            java.util.HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.b> r13 = e.a.a.a.y0.a.p.c.f7718k
            e.a.a.a.y0.f.c r15 = e.a.a.a.y0.j.v.b.i(r12)
            java.lang.Object r13 = r13.get(r15)
            e.a.a.a.y0.f.b r13 = (e.a.a.a.y0.f.b) r13
            if (r13 == 0) goto L_0x0118
            java.lang.String r15 = "readOnlyToMutable[kotlin…eturn setOf(kotlinAnalog)"
            e.x.c.i.d(r13, r15)
            e.a.a.a.y0.b.e[] r10 = new e.a.a.a.y0.b.e[r10]
            r10[r6] = r12
            e.a.a.a.y0.b.e r12 = r14.i(r13)
            java.lang.String r13 = "builtIns.getBuiltInClass…otlinMutableAnalogFqName)"
            e.x.c.i.d(r12, r13)
            r10[r7] = r12
            java.util.List r7 = e.t.g.B(r10)
            goto L_0x011f
        L_0x0118:
            java.util.Set r7 = b.q.a.a.S2(r12)
            goto L_0x011f
        L_0x011d:
            e.t.q r7 = e.t.q.f7936h
        L_0x011f:
            java.lang.String r10 = "$this$lastOrNull"
            e.x.c.i.e(r7, r10)
            boolean r10 = r7 instanceof java.util.List
            if (r10 == 0) goto L_0x013d
            r10 = r7
            java.util.List r10 = (java.util.List) r10
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x0132
            goto L_0x0147
        L_0x0132:
            int r12 = r10.size()
            int r12 = r12 + -1
            java.lang.Object r10 = r10.get(r12)
            goto L_0x0155
        L_0x013d:
            java.util.Iterator r10 = r7.iterator()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x0149
        L_0x0147:
            r10 = r9
            goto L_0x0155
        L_0x0149:
            java.lang.Object r12 = r10.next()
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0154
            goto L_0x0149
        L_0x0154:
            r10 = r12
        L_0x0155:
            e.a.a.a.y0.b.e r10 = (e.a.a.a.y0.b.e) r10
            if (r10 == 0) goto L_0x02bb
            java.util.ArrayList r3 = new java.util.ArrayList
            r12 = 10
            int r12 = b.q.a.a.C(r7, r12)
            r3.<init>(r12)
            java.util.Iterator r7 = r7.iterator()
        L_0x0168:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x017c
            java.lang.Object r12 = r7.next()
            e.a.a.a.y0.b.e r12 = (e.a.a.a.y0.b.e) r12
            e.a.a.a.y0.f.b r12 = e.a.a.a.y0.j.v.b.h(r12)
            r3.add(r12)
            goto L_0x0168
        L_0x017c:
            java.lang.String r7 = "set"
            e.x.c.i.e(r3, r7)
            e.a.a.a.y0.o.m r7 = new e.a.a.a.y0.o.m
            r7.<init>(r9)
            r7.addAll(r3)
            e.a.a.a.y0.a.p.c r3 = r0.a
            boolean r3 = r3.h(r2)
            e.a.a.a.y0.l.a<e.a.a.a.y0.f.b, e.a.a.a.y0.b.e> r9 = r0.f
            e.a.a.a.y0.f.b r12 = e.a.a.a.y0.j.v.b.h(r1)
            e.a.a.a.y0.a.p.n r13 = new e.a.a.a.y0.a.p.n
            r13.<init>(r1, r10)
            e.a.a.a.y0.l.e$d r9 = (e.a.a.a.y0.l.e.d) r9
            java.lang.Object r1 = r9.c(r12, r13)
            e.a.a.a.y0.b.e r1 = (e.a.a.a.y0.b.e) r1
            e.a.a.a.y0.j.y.i r1 = r1.G0()
            java.lang.String r9 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            e.x.c.i.d(r1, r9)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01ba:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x02ba
            java.lang.Object r9 = r1.next()
            r10 = r9
            e.a.a.a.y0.b.l0 r10 = (e.a.a.a.y0.b.l0) r10
            e.a.a.a.y0.b.b$a r12 = r10.i()
            e.a.a.a.y0.b.b$a r13 = e.a.a.a.y0.b.b.a.DECLARATION
            if (r12 == r13) goto L_0x01d0
            goto L_0x021d
        L_0x01d0:
            e.a.a.a.y0.b.z0 r12 = r10.getVisibility()
            boolean r12 = r12.f7860b
            if (r12 != 0) goto L_0x01d9
            goto L_0x021d
        L_0x01d9:
            boolean r12 = e.a.a.a.y0.a.g.E(r10)
            if (r12 == 0) goto L_0x01e0
            goto L_0x021d
        L_0x01e0:
            java.util.Collection r12 = r10.g()
            java.lang.String r13 = "analogueMember.overriddenDescriptors"
            e.x.c.i.d(r12, r13)
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L_0x01f0
            goto L_0x021a
        L_0x01f0:
            java.util.Iterator r12 = r12.iterator()
        L_0x01f4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x021a
            java.lang.Object r13 = r12.next()
            e.a.a.a.y0.b.s r13 = (e.a.a.a.y0.b.s) r13
            java.lang.String r14 = "it"
            e.x.c.i.d(r13, r14)
            e.a.a.a.y0.b.k r13 = r13.b()
            java.lang.String r14 = "it.containingDeclaration"
            e.x.c.i.d(r13, r14)
            e.a.a.a.y0.f.b r13 = e.a.a.a.y0.j.v.b.h(r13)
            boolean r13 = r7.contains(r13)
            if (r13 == 0) goto L_0x01f4
            r12 = 1
            goto L_0x021b
        L_0x021a:
            r12 = r6
        L_0x021b:
            if (r12 == 0) goto L_0x0221
        L_0x021d:
            r17 = r1
            goto L_0x02ae
        L_0x0221:
            e.a.a.a.y0.b.k r12 = r10.b()
            java.util.Objects.requireNonNull(r12, r8)
            e.a.a.a.y0.b.e r12 = (e.a.a.a.y0.b.e) r12
            java.lang.String r6 = b.q.a.a.H(r10, r6, r6, r11)
            java.util.Set<java.lang.String> r11 = f7745m
            e.x.c.i.e(r12, r4)
            java.lang.String r13 = "jvmDescriptor"
            e.x.c.i.e(r6, r13)
            java.lang.String r14 = "$this$internalName"
            e.x.c.i.e(r12, r14)
            e.a.a.a.y0.a.p.c r14 = e.a.a.a.y0.a.p.c.f7720m
            e.a.a.a.y0.f.b r15 = e.a.a.a.y0.j.v.b.h(r12)
            e.a.a.a.y0.f.c r15 = r15.j()
            r17 = r1
            java.lang.String r1 = "fqNameSafe.toUnsafe()"
            e.x.c.i.d(r15, r1)
            e.a.a.a.y0.f.a r1 = r14.l(r15)
            if (r1 == 0) goto L_0x0267
            e.a.a.a.y0.j.w.b r1 = e.a.a.a.y0.j.w.b.b(r1)
            java.lang.String r12 = "JvmClassName.byClassId(it)"
            e.x.c.i.d(r1, r12)
            java.lang.String r1 = r1.e()
            java.lang.String r12 = "JvmClassName.byClassId(it).internalName"
            e.x.c.i.d(r1, r12)
            goto L_0x026d
        L_0x0267:
            e.a.a.a.y0.d.b.t r1 = e.a.a.a.y0.d.b.t.a
            java.lang.String r1 = e.a.a.a.y0.d.b.v.a(r12, r1)
        L_0x026d:
            java.lang.String r12 = "internalName"
            e.x.c.i.e(r1, r12)
            e.x.c.i.e(r6, r13)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            r1 = 46
            r12.append(r1)
            r12.append(r6)
            java.lang.String r1 = r12.toString()
            boolean r1 = r11.contains(r1)
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0292
            r1 = 1
            goto L_0x02aa
        L_0x0292:
            java.util.List r1 = b.q.a.a.l2(r10)
            e.a.a.a.y0.a.p.q r6 = e.a.a.a.y0.a.p.q.a
            e.a.a.a.y0.a.p.r r10 = new e.a.a.a.y0.a.p.r
            r10.<init>(r0)
            java.lang.Boolean r1 = e.a.a.a.y0.m.o1.c.I(r1, r6, r10)
            java.lang.String r6 = "DFS.ifAny<CallableMember…lassDescriptor)\n        }"
            e.x.c.i.d(r1, r6)
            boolean r1 = r1.booleanValue()
        L_0x02aa:
            if (r1 != 0) goto L_0x02ae
            r1 = 1
            goto L_0x02af
        L_0x02ae:
            r1 = 0
        L_0x02af:
            if (r1 == 0) goto L_0x02b4
            r5.add(r9)
        L_0x02b4:
            r6 = 0
            r11 = 3
            r1 = r17
            goto L_0x01ba
        L_0x02ba:
            r3 = r5
        L_0x02bb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x02c4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0372
            java.lang.Object r4 = r3.next()
            e.a.a.a.y0.b.l0 r4 = (e.a.a.a.y0.b.l0) r4
            e.a.a.a.y0.b.k r5 = r4.b()
            java.util.Objects.requireNonNull(r5, r8)
            e.a.a.a.y0.b.e r5 = (e.a.a.a.y0.b.e) r5
            e.a.a.a.y0.m.x0 r5 = b.q.a.a.e0(r5, r2)
            e.a.a.a.y0.m.d1 r5 = r5.c()
            e.a.a.a.y0.b.s r5 = r4.c(r5)
            java.lang.String r6 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            java.util.Objects.requireNonNull(r5, r6)
            e.a.a.a.y0.b.l0 r5 = (e.a.a.a.y0.b.l0) r5
            e.a.a.a.y0.b.s$a r5 = r5.x()
            r5.j(r2)
            r6 = r2
            e.a.a.a.y0.b.c1.b r6 = (e.a.a.a.y0.b.c1.b) r6
            e.a.a.a.y0.b.i0 r6 = r6.U0()
            r5.n(r6)
            r5.o()
            e.a.a.a.y0.b.k r6 = r4.b()
            java.util.Objects.requireNonNull(r6, r8)
            e.a.a.a.y0.b.e r6 = (e.a.a.a.y0.b.e) r6
            r7 = 3
            r9 = 0
            java.lang.String r4 = b.q.a.a.H(r4, r9, r9, r7)
            e.x.c.u r7 = new e.x.c.u
            r7.<init>()
            r9 = 0
            r7.f7989h = r9
            java.util.List r6 = b.q.a.a.l2(r6)
            e.a.a.a.y0.a.p.o r10 = new e.a.a.a.y0.a.p.o
            r10.<init>(r0)
            e.a.a.a.y0.a.p.p r11 = new e.a.a.a.y0.a.p.p
            r11.<init>(r4, r7)
            java.lang.Object r4 = e.a.a.a.y0.m.o1.c.w(r6, r10, r11)
            java.lang.String r6 = "DFS.dfs<ClassDescriptor,…CONSIDERED\n            })"
            e.x.c.i.d(r4, r6)
            e.a.a.a.y0.a.p.k$b r4 = (e.a.a.a.y0.a.p.k.b) r4
            int r4 = r4.ordinal()
            r6 = 2
            if (r4 == 0) goto L_0x0351
            if (r4 == r6) goto L_0x033d
            r6 = 3
            if (r4 == r6) goto L_0x036b
            goto L_0x0361
        L_0x033d:
            e.a.a.a.y0.l.i r4 = r0.f7751g
            e.a.l[] r6 = f7741i
            r7 = 1
            r6 = r6[r7]
            java.lang.Object r4 = b.q.a.a.j1(r4, r6)
            e.a.a.a.y0.b.a1.h r4 = (e.a.a.a.y0.b.a1.h) r4
            e.a.a.a.y0.b.s$a r4 = r5.p(r4)
            java.lang.String r6 = "setAdditionalAnnotations(notConsideredDeprecation)"
            goto L_0x035e
        L_0x0351:
            boolean r4 = b.q.a.a.J1(r18)
            if (r4 == 0) goto L_0x0358
            goto L_0x036b
        L_0x0358:
            e.a.a.a.y0.b.s$a r4 = r5.t()
            java.lang.String r6 = "setHiddenForResolutionEverywhereBesideSupercalls()"
        L_0x035e:
            e.x.c.i.d(r4, r6)
        L_0x0361:
            e.a.a.a.y0.b.s r4 = r5.e()
            e.x.c.i.c(r4)
            r9 = r4
            e.a.a.a.y0.b.l0 r9 = (e.a.a.a.y0.b.l0) r9
        L_0x036b:
            if (r9 == 0) goto L_0x02c4
            r1.add(r9)
            goto L_0x02c4
        L_0x0372:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.a.p.k.d(e.a.a.a.y0.f.d, e.a.a.a.y0.b.e):java.util.Collection");
    }

    public boolean e(e.a.a.a.y0.b.e eVar, l0 l0Var) {
        e.x.c.i.e(eVar, "classDescriptor");
        e.x.c.i.e(l0Var, "functionDescriptor");
        e.a.a.a.y0.d.a.b0.n.e f2 = f(eVar);
        if (f2 == null || !l0Var.k().x(e.a.a.a.y0.b.b1.d.a)) {
            return true;
        }
        if (!g()) {
            return false;
        }
        String H = b.q.a.a.H(l0Var, false, false, 3);
        e.a.a.a.y0.d.a.b0.n.g K0 = f2.G0();
        e.a.a.a.y0.f.d name = l0Var.getName();
        e.x.c.i.d(name, "functionDescriptor.name");
        Collection<l0> a2 = K0.a(name, e.a.a.a.y0.c.a.d.FROM_BUILTINS);
        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
            for (l0 H2 : a2) {
                if (e.x.c.i.a(b.q.a.a.H(H2, false, false, 3), H)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final e.a.a.a.y0.d.a.b0.n.e f(e.a.a.a.y0.b.e eVar) {
        e.a.a.a.y0.f.a l2;
        e.a.a.a.y0.f.b b2;
        e.a.a.a.y0.d.a.b0.n.e eVar2 = null;
        if (eVar == null) {
            g.a(107);
            throw null;
        } else if (g.c(eVar, g.f7647k.a) || !g.N(eVar)) {
            return null;
        } else {
            e.a.a.a.y0.f.c i2 = e.a.a.a.y0.j.v.b.i(eVar);
            if (!i2.f() || (l2 = this.a.l(i2)) == null || (b2 = l2.b()) == null) {
                return null;
            }
            e.x.c.i.d(b2, "j2kClassMap.mapKotlinToJ…leFqName() ?: return null");
            e.a.a.a.y0.b.e I2 = b.q.a.a.I2((w) this.f7749b.getValue(), b2, e.a.a.a.y0.c.a.d.FROM_BUILTINS);
            if (I2 instanceof e.a.a.a.y0.d.a.b0.n.e) {
                eVar2 = I2;
            }
            return eVar2;
        }
    }

    public final boolean g() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
