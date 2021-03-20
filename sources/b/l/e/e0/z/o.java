package b.l.e.e0.z;

import b.l.e.e0.s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class o {
    public static final b.l.e.b0<String> A;
    public static final b.l.e.b0<BigDecimal> B = new h();
    public static final b.l.e.b0<BigInteger> C = new i();
    public static final b.l.e.c0 D;
    public static final b.l.e.b0<StringBuilder> E;
    public static final b.l.e.c0 F;
    public static final b.l.e.b0<StringBuffer> G;
    public static final b.l.e.c0 H;
    public static final b.l.e.b0<URL> I;
    public static final b.l.e.c0 J;
    public static final b.l.e.b0<URI> K;
    public static final b.l.e.c0 L;
    public static final b.l.e.b0<InetAddress> M;
    public static final b.l.e.c0 N;
    public static final b.l.e.b0<UUID> O;
    public static final b.l.e.c0 P;
    public static final b.l.e.b0<Currency> Q;
    public static final b.l.e.c0 R;
    public static final b.l.e.c0 S = new r();
    public static final b.l.e.b0<Calendar> T;
    public static final b.l.e.c0 U;
    public static final b.l.e.b0<Locale> V;
    public static final b.l.e.c0 W;
    public static final b.l.e.b0<b.l.e.q> X;
    public static final b.l.e.c0 Y;
    public static final b.l.e.c0 Z = new w();
    public static final b.l.e.b0<Class> a;

    /* renamed from: b  reason: collision with root package name */
    public static final b.l.e.c0 f5492b;
    public static final b.l.e.b0<BitSet> c;
    public static final b.l.e.c0 d;

    /* renamed from: e  reason: collision with root package name */
    public static final b.l.e.b0<Boolean> f5493e;
    public static final b.l.e.b0<Boolean> f = new y();

    /* renamed from: g  reason: collision with root package name */
    public static final b.l.e.c0 f5494g;

    /* renamed from: h  reason: collision with root package name */
    public static final b.l.e.b0<Number> f5495h;

    /* renamed from: i  reason: collision with root package name */
    public static final b.l.e.c0 f5496i;

    /* renamed from: j  reason: collision with root package name */
    public static final b.l.e.b0<Number> f5497j;

    /* renamed from: k  reason: collision with root package name */
    public static final b.l.e.c0 f5498k;

    /* renamed from: l  reason: collision with root package name */
    public static final b.l.e.b0<Number> f5499l;

    /* renamed from: m  reason: collision with root package name */
    public static final b.l.e.c0 f5500m;

    /* renamed from: n  reason: collision with root package name */
    public static final b.l.e.b0<AtomicInteger> f5501n;

    /* renamed from: o  reason: collision with root package name */
    public static final b.l.e.c0 f5502o;

    /* renamed from: p  reason: collision with root package name */
    public static final b.l.e.b0<AtomicBoolean> f5503p;

    /* renamed from: q  reason: collision with root package name */
    public static final b.l.e.c0 f5504q;
    public static final b.l.e.b0<AtomicIntegerArray> r;
    public static final b.l.e.c0 s;
    public static final b.l.e.b0<Number> t = new b();
    public static final b.l.e.b0<Number> u = new c();
    public static final b.l.e.b0<Number> v = new d();
    public static final b.l.e.b0<Number> w;
    public static final b.l.e.c0 x;
    public static final b.l.e.b0<Character> y;
    public static final b.l.e.c0 z;

    public class a extends b.l.e.b0<AtomicIntegerArray> {
        public Object a(b.l.e.g0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.Y()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.n0()));
                } catch (NumberFormatException e2) {
                    throw new b.l.e.y((Throwable) e2);
                }
            }
            aVar.H();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            cVar.e();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.n0((long) atomicIntegerArray.get(i2));
            }
            cVar.H();
        }
    }

    public class a0 extends b.l.e.b0<Number> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.n0());
            } catch (NumberFormatException e2) {
                throw new b.l.e.y((Throwable) e2);
            }
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.p0((Number) obj);
        }
    }

    public class b extends b.l.e.b0<Number> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            try {
                return Long.valueOf(aVar.o0());
            } catch (NumberFormatException e2) {
                throw new b.l.e.y((Throwable) e2);
            }
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.p0((Number) obj);
        }
    }

    public class b0 extends b.l.e.b0<Number> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.n0());
            } catch (NumberFormatException e2) {
                throw new b.l.e.y((Throwable) e2);
            }
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.p0((Number) obj);
        }
    }

    public class c extends b.l.e.b0<Number> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() != b.l.e.g0.b.NULL) {
                return Float.valueOf((float) aVar.m0());
            }
            aVar.r0();
            return null;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.p0((Number) obj);
        }
    }

    public class c0 extends b.l.e.b0<AtomicInteger> {
        public Object a(b.l.e.g0.a aVar) {
            try {
                return new AtomicInteger(aVar.n0());
            } catch (NumberFormatException e2) {
                throw new b.l.e.y((Throwable) e2);
            }
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.n0((long) ((AtomicInteger) obj).get());
        }
    }

    public class d extends b.l.e.b0<Number> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() != b.l.e.g0.b.NULL) {
                return Double.valueOf(aVar.m0());
            }
            aVar.r0();
            return null;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.p0((Number) obj);
        }
    }

    public class d0 extends b.l.e.b0<AtomicBoolean> {
        public Object a(b.l.e.g0.a aVar) {
            return new AtomicBoolean(aVar.k0());
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.r0(((AtomicBoolean) obj).get());
        }
    }

    public class e extends b.l.e.b0<Number> {
        public Object a(b.l.e.g0.a aVar) {
            b.l.e.g0.b v0 = aVar.v0();
            int ordinal = v0.ordinal();
            if (ordinal == 5 || ordinal == 6) {
                return new b.l.e.e0.r(aVar.t0());
            }
            if (ordinal == 8) {
                aVar.r0();
                return null;
            }
            throw new b.l.e.y("Expecting number, got: " + v0);
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.p0((Number) obj);
        }
    }

    public static final class e0<T extends Enum<T>> extends b.l.e.b0<T> {
        public final Map<String, T> a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<T, String> f5505b = new HashMap();

        public e0(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    b.l.e.d0.b bVar = (b.l.e.d0.b) cls.getField(name).getAnnotation(b.l.e.d0.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            this.a.put(put, enumR);
                        }
                    }
                    this.a.put(name, enumR);
                    this.f5505b.put(enumR, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() != b.l.e.g0.b.NULL) {
                return (Enum) this.a.get(aVar.t0());
            }
            aVar.r0();
            return null;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            Enum enumR = (Enum) obj;
            cVar.q0(enumR == null ? null : this.f5505b.get(enumR));
        }
    }

    public class f extends b.l.e.b0<Character> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            String t0 = aVar.t0();
            if (t0.length() == 1) {
                return Character.valueOf(t0.charAt(0));
            }
            throw new b.l.e.y(b.e.a.a.a.m("Expecting character, got: ", t0));
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            Character ch = (Character) obj;
            cVar.q0(ch == null ? null : String.valueOf(ch));
        }
    }

    public class g extends b.l.e.b0<String> {
        public Object a(b.l.e.g0.a aVar) {
            b.l.e.g0.b v0 = aVar.v0();
            if (v0 != b.l.e.g0.b.NULL) {
                return v0 == b.l.e.g0.b.BOOLEAN ? Boolean.toString(aVar.k0()) : aVar.t0();
            }
            aVar.r0();
            return null;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.q0((String) obj);
        }
    }

    public class h extends b.l.e.b0<BigDecimal> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            try {
                return new BigDecimal(aVar.t0());
            } catch (NumberFormatException e2) {
                throw new b.l.e.y((Throwable) e2);
            }
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.p0((BigDecimal) obj);
        }
    }

    public class i extends b.l.e.b0<BigInteger> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            try {
                return new BigInteger(aVar.t0());
            } catch (NumberFormatException e2) {
                throw new b.l.e.y((Throwable) e2);
            }
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.p0((BigInteger) obj);
        }
    }

    public class j extends b.l.e.b0<StringBuilder> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() != b.l.e.g0.b.NULL) {
                return new StringBuilder(aVar.t0());
            }
            aVar.r0();
            return null;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            cVar.q0(sb == null ? null : sb.toString());
        }
    }

    public class k extends b.l.e.b0<Class> {
        public Object a(b.l.e.g0.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            throw new UnsupportedOperationException(b.e.a.a.a.e((Class) obj, b.e.a.a.a.y("Attempted to serialize java.lang.Class: "), ". Forgot to register a type adapter?"));
        }
    }

    public class l extends b.l.e.b0<StringBuffer> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() != b.l.e.g0.b.NULL) {
                return new StringBuffer(aVar.t0());
            }
            aVar.r0();
            return null;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            StringBuffer stringBuffer = (StringBuffer) obj;
            cVar.q0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    public class m extends b.l.e.b0<URL> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            String t0 = aVar.t0();
            if ("null".equals(t0)) {
                return null;
            }
            return new URL(t0);
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            URL url = (URL) obj;
            cVar.q0(url == null ? null : url.toExternalForm());
        }
    }

    public class n extends b.l.e.b0<URI> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            try {
                String t0 = aVar.t0();
                if ("null".equals(t0)) {
                    return null;
                }
                return new URI(t0);
            } catch (URISyntaxException e2) {
                throw new b.l.e.r((Throwable) e2);
            }
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            URI uri = (URI) obj;
            cVar.q0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: b.l.e.e0.z.o$o  reason: collision with other inner class name */
    public class C0095o extends b.l.e.b0<InetAddress> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() != b.l.e.g0.b.NULL) {
                return InetAddress.getByName(aVar.t0());
            }
            aVar.r0();
            return null;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            InetAddress inetAddress = (InetAddress) obj;
            cVar.q0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    public class p extends b.l.e.b0<UUID> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() != b.l.e.g0.b.NULL) {
                return UUID.fromString(aVar.t0());
            }
            aVar.r0();
            return null;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            UUID uuid = (UUID) obj;
            cVar.q0(uuid == null ? null : uuid.toString());
        }
    }

    public class q extends b.l.e.b0<Currency> {
        public Object a(b.l.e.g0.a aVar) {
            return Currency.getInstance(aVar.t0());
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.q0(((Currency) obj).getCurrencyCode());
        }
    }

    public class r implements b.l.e.c0 {

        public class a extends b.l.e.b0<Timestamp> {
            public final /* synthetic */ b.l.e.b0 a;

            public a(r rVar, b.l.e.b0 b0Var) {
                this.a = b0Var;
            }

            public Object a(b.l.e.g0.a aVar) {
                Date date = (Date) this.a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            public void b(b.l.e.g0.c cVar, Object obj) {
                this.a.b(cVar, (Timestamp) obj);
            }
        }

        public <T> b.l.e.b0<T> a(b.l.e.k kVar, b.l.e.f0.a<T> aVar) {
            if (aVar.a != Timestamp.class) {
                return null;
            }
            return new a(this, kVar.f(Date.class));
        }
    }

    public class s extends b.l.e.b0<Calendar> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            aVar.e();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.v0() != b.l.e.g0.b.END_OBJECT) {
                String p0 = aVar.p0();
                int n0 = aVar.n0();
                if ("year".equals(p0)) {
                    i2 = n0;
                } else if ("month".equals(p0)) {
                    i3 = n0;
                } else if ("dayOfMonth".equals(p0)) {
                    i4 = n0;
                } else if ("hourOfDay".equals(p0)) {
                    i5 = n0;
                } else if ("minute".equals(p0)) {
                    i6 = n0;
                } else if ("second".equals(p0)) {
                    i7 = n0;
                }
            }
            aVar.N();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                cVar.Y();
                return;
            }
            cVar.q();
            cVar.O("year");
            cVar.n0((long) calendar.get(1));
            cVar.O("month");
            cVar.n0((long) calendar.get(2));
            cVar.O("dayOfMonth");
            cVar.n0((long) calendar.get(5));
            cVar.O("hourOfDay");
            cVar.n0((long) calendar.get(11));
            cVar.O("minute");
            cVar.n0((long) calendar.get(12));
            cVar.O("second");
            cVar.n0((long) calendar.get(13));
            cVar.N();
        }
    }

    public class t extends b.l.e.b0<Locale> {
        public Object a(b.l.e.g0.a aVar) {
            Locale locale;
            String str = null;
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.t0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str != null) {
                locale = new Locale(nextToken, nextToken2, str);
            }
            return locale;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            Locale locale = (Locale) obj;
            cVar.q0(locale == null ? null : locale.toString());
        }
    }

    public class u extends b.l.e.b0<b.l.e.q> {
        /* renamed from: c */
        public b.l.e.q a(b.l.e.g0.a aVar) {
            b.l.e.s sVar = b.l.e.s.a;
            int ordinal = aVar.v0().ordinal();
            if (ordinal == 0) {
                b.l.e.n nVar = new b.l.e.n();
                aVar.b();
                while (aVar.Y()) {
                    nVar.f5566h.add(a(aVar));
                }
                aVar.H();
                return nVar;
            } else if (ordinal == 2) {
                b.l.e.t tVar = new b.l.e.t();
                aVar.e();
                while (aVar.Y()) {
                    tVar.a.put(aVar.p0(), a(aVar));
                }
                aVar.N();
                return tVar;
            } else if (ordinal == 5) {
                return new b.l.e.v(aVar.t0());
            } else {
                if (ordinal == 6) {
                    return new b.l.e.v((Number) new b.l.e.e0.r(aVar.t0()));
                }
                if (ordinal == 7) {
                    return new b.l.e.v(Boolean.valueOf(aVar.k0()));
                }
                if (ordinal == 8) {
                    aVar.r0();
                    return sVar;
                }
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: d */
        public void b(b.l.e.g0.c cVar, b.l.e.q qVar) {
            if (qVar == null || (qVar instanceof b.l.e.s)) {
                cVar.Y();
            } else if (qVar instanceof b.l.e.v) {
                b.l.e.v l2 = qVar.l();
                Object obj = l2.a;
                if (obj instanceof Number) {
                    cVar.p0(l2.v());
                } else if (obj instanceof Boolean) {
                    cVar.r0(l2.s());
                } else {
                    cVar.q0(l2.p());
                }
            } else if (qVar instanceof b.l.e.n) {
                cVar.e();
                Iterator<b.l.e.q> it = qVar.d().iterator();
                while (it.hasNext()) {
                    b(cVar, it.next());
                }
                cVar.H();
            } else if (qVar instanceof b.l.e.t) {
                cVar.q();
                b.l.e.e0.s sVar = b.l.e.e0.s.this;
                s.e<K, V> eVar = sVar.f5442l.f5454k;
                int i2 = sVar.f5441k;
                while (true) {
                    if (!(eVar != sVar.f5442l)) {
                        cVar.N();
                        return;
                    } else if (eVar == sVar.f5442l) {
                        throw new NoSuchElementException();
                    } else if (sVar.f5441k == i2) {
                        s.e<K, V> eVar2 = eVar.f5454k;
                        cVar.O((String) eVar.getKey());
                        b(cVar, (b.l.e.q) eVar.getValue());
                        eVar = eVar2;
                    } else {
                        throw new ConcurrentModificationException();
                    }
                }
            } else {
                StringBuilder y = b.e.a.a.a.y("Couldn't write ");
                y.append(qVar.getClass());
                throw new IllegalArgumentException(y.toString());
            }
        }
    }

    public class v extends b.l.e.b0<BitSet> {
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
            if (r7.n0() != 0) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
            r1 = false;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0054 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(b.l.e.g0.a r7) {
            /*
                r6 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r7.b()
                b.l.e.g0.b r1 = r7.v0()
                r2 = 0
                r3 = r2
            L_0x000e:
                b.l.e.g0.b r4 = b.l.e.g0.b.END_ARRAY
                if (r1 == r4) goto L_0x0067
                int r4 = r1.ordinal()
                r5 = 5
                if (r4 == r5) goto L_0x0042
                r5 = 6
                if (r4 == r5) goto L_0x003b
                r5 = 7
                if (r4 != r5) goto L_0x0024
                boolean r1 = r7.k0()
                goto L_0x004f
            L_0x0024:
                b.l.e.y r7 = new b.l.e.y
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>((java.lang.String) r0)
                throw r7
            L_0x003b:
                int r1 = r7.n0()
                if (r1 == 0) goto L_0x004e
                goto L_0x004c
            L_0x0042:
                java.lang.String r1 = r7.t0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x005b }
                if (r1 == 0) goto L_0x004e
            L_0x004c:
                r1 = 1
                goto L_0x004f
            L_0x004e:
                r1 = r2
            L_0x004f:
                if (r1 == 0) goto L_0x0054
                r0.set(r3)
            L_0x0054:
                int r3 = r3 + 1
                b.l.e.g0.b r1 = r7.v0()
                goto L_0x000e
            L_0x005b:
                b.l.e.y r7 = new b.l.e.y
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = b.e.a.a.a.m(r0, r1)
                r7.<init>((java.lang.String) r0)
                throw r7
            L_0x0067:
                r7.H()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.e.e0.z.o.v.a(b.l.e.g0.a):java.lang.Object");
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            BitSet bitSet = (BitSet) obj;
            cVar.e();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.n0(bitSet.get(i2) ? 1 : 0);
            }
            cVar.H();
        }
    }

    public class w implements b.l.e.c0 {
        public <T> b.l.e.b0<T> a(b.l.e.k kVar, b.l.e.f0.a<T> aVar) {
            Class<Enum> cls = Enum.class;
            Class cls2 = aVar.a;
            if (!cls.isAssignableFrom(cls2) || cls2 == cls) {
                return null;
            }
            if (!cls2.isEnum()) {
                cls2 = cls2.getSuperclass();
            }
            return new e0(cls2);
        }
    }

    public class x extends b.l.e.b0<Boolean> {
        public Object a(b.l.e.g0.a aVar) {
            b.l.e.g0.b v0 = aVar.v0();
            if (v0 == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            return Boolean.valueOf(v0 == b.l.e.g0.b.STRING ? Boolean.parseBoolean(aVar.t0()) : aVar.k0());
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.o0((Boolean) obj);
        }
    }

    public class y extends b.l.e.b0<Boolean> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() != b.l.e.g0.b.NULL) {
                return Boolean.valueOf(aVar.t0());
            }
            aVar.r0();
            return null;
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            Boolean bool = (Boolean) obj;
            cVar.q0(bool == null ? "null" : bool.toString());
        }
    }

    public class z extends b.l.e.b0<Number> {
        public Object a(b.l.e.g0.a aVar) {
            if (aVar.v0() == b.l.e.g0.b.NULL) {
                aVar.r0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.n0());
            } catch (NumberFormatException e2) {
                throw new b.l.e.y((Throwable) e2);
            }
        }

        public void b(b.l.e.g0.c cVar, Object obj) {
            cVar.p0((Number) obj);
        }
    }

    static {
        b.l.e.a0 a0Var = new b.l.e.a0(new k());
        a = a0Var;
        f5492b = new q(Class.class, a0Var);
        b.l.e.a0 a0Var2 = new b.l.e.a0(new v());
        c = a0Var2;
        d = new q(BitSet.class, a0Var2);
        x xVar = new x();
        f5493e = xVar;
        f5494g = new r(Boolean.TYPE, Boolean.class, xVar);
        z zVar = new z();
        f5495h = zVar;
        f5496i = new r(Byte.TYPE, Byte.class, zVar);
        a0 a0Var3 = new a0();
        f5497j = a0Var3;
        f5498k = new r(Short.TYPE, Short.class, a0Var3);
        b0 b0Var = new b0();
        f5499l = b0Var;
        f5500m = new r(Integer.TYPE, Integer.class, b0Var);
        b.l.e.a0 a0Var4 = new b.l.e.a0(new c0());
        f5501n = a0Var4;
        f5502o = new q(AtomicInteger.class, a0Var4);
        b.l.e.a0 a0Var5 = new b.l.e.a0(new d0());
        f5503p = a0Var5;
        f5504q = new q(AtomicBoolean.class, a0Var5);
        b.l.e.a0 a0Var6 = new b.l.e.a0(new a());
        r = a0Var6;
        s = new q(AtomicIntegerArray.class, a0Var6);
        e eVar = new e();
        w = eVar;
        x = new q(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = new r(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        D = new q(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = new q(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = new q(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = new q(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = new q(URI.class, nVar);
        C0095o oVar = new C0095o();
        M = oVar;
        N = new t(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = new q(UUID.class, pVar);
        b.l.e.a0 a0Var7 = new b.l.e.a0(new q());
        Q = a0Var7;
        R = new q(Currency.class, a0Var7);
        s sVar = new s();
        T = sVar;
        U = new s(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = new q(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = new t(b.l.e.q.class, uVar);
    }
}
