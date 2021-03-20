package b.j.a.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface k {

    public enum a {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public static class b {
        public static final b c = new b(0, 0);
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1314b;

        public b(int i2, int i3) {
            this.a = i2;
            this.f1314b = i3;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.f1314b == this.f1314b;
        }

        public int hashCode() {
            return this.f1314b + this.a;
        }

        public String toString() {
            if (this == c) {
                return "EMPTY";
            }
            return String.format("(enabled=0x%x,disabled=0x%x)", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.f1314b)});
        }
    }

    public enum c {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN;

        public boolean d() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }
    }

    public static class d implements Object<k> {

        /* renamed from: o  reason: collision with root package name */
        public static final d f1325o = new d("", c.ANY, "", "", b.c, (Boolean) null);

        /* renamed from: h  reason: collision with root package name */
        public final String f1326h;

        /* renamed from: i  reason: collision with root package name */
        public final c f1327i;

        /* renamed from: j  reason: collision with root package name */
        public final Locale f1328j;

        /* renamed from: k  reason: collision with root package name */
        public final String f1329k;

        /* renamed from: l  reason: collision with root package name */
        public final Boolean f1330l;

        /* renamed from: m  reason: collision with root package name */
        public final b f1331m;

        /* renamed from: n  reason: collision with root package name */
        public transient TimeZone f1332n;

        public d() {
            this("", c.ANY, "", "", b.c, (Boolean) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(java.lang.String r14, b.j.a.a.k.c r15, java.lang.String r16, java.lang.String r17, b.j.a.a.k.b r18, java.lang.Boolean r19) {
            /*
                r13 = this;
                r0 = r16
                r1 = r17
                java.lang.String r2 = "##default"
                r3 = 0
                if (r0 == 0) goto L_0x001d
                int r4 = r16.length()
                if (r4 == 0) goto L_0x001d
                boolean r4 = r2.equals(r0)
                if (r4 == 0) goto L_0x0016
                goto L_0x001d
            L_0x0016:
                java.util.Locale r4 = new java.util.Locale
                r4.<init>(r0)
                r8 = r4
                goto L_0x001e
            L_0x001d:
                r8 = r3
            L_0x001e:
                if (r1 == 0) goto L_0x002f
                int r0 = r17.length()
                if (r0 == 0) goto L_0x002f
                boolean r0 = r2.equals(r1)
                if (r0 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r9 = r1
                goto L_0x0030
            L_0x002f:
                r9 = r3
            L_0x0030:
                r10 = 0
                r5 = r13
                r6 = r14
                r7 = r15
                r11 = r18
                r12 = r19
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.a.k.d.<init>(java.lang.String, b.j.a.a.k$c, java.lang.String, java.lang.String, b.j.a.a.k$b, java.lang.Boolean):void");
        }

        public d(String str, c cVar, Locale locale, String str2, TimeZone timeZone, b bVar, Boolean bool) {
            this.f1326h = str;
            this.f1327i = cVar == null ? c.ANY : cVar;
            this.f1328j = locale;
            this.f1332n = timeZone;
            this.f1329k = str2;
            this.f1331m = bVar == null ? b.c : bVar;
            this.f1330l = bool;
        }

        public static <T> boolean a(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }

        public Boolean b(a aVar) {
            b bVar = this.f1331m;
            Objects.requireNonNull(bVar);
            int ordinal = 1 << aVar.ordinal();
            if ((bVar.f1314b & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & bVar.a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public TimeZone c() {
            TimeZone timeZone = this.f1332n;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this.f1329k;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this.f1332n = timeZone2;
            return timeZone2;
        }

        public boolean d() {
            return this.f1328j != null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r1.f1329k;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean e() {
            /*
                r1 = this;
                java.util.TimeZone r0 = r1.f1332n
                if (r0 != 0) goto L_0x0011
                java.lang.String r0 = r1.f1329k
                if (r0 == 0) goto L_0x000f
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r0 = 0
                goto L_0x0012
            L_0x0011:
                r0 = 1
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.j.a.a.k.d.e():boolean");
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != d.class) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f1327i != dVar.f1327i || !this.f1331m.equals(dVar.f1331m)) {
                return false;
            }
            return a(this.f1330l, dVar.f1330l) && a(this.f1329k, dVar.f1329k) && a(this.f1326h, dVar.f1326h) && a(this.f1332n, dVar.f1332n) && a(this.f1328j, dVar.f1328j);
        }

        public final d f(d dVar) {
            d dVar2;
            TimeZone timeZone;
            String str;
            if (dVar == null || dVar == (dVar2 = f1325o) || dVar == this) {
                return this;
            }
            if (this == dVar2) {
                return dVar;
            }
            String str2 = dVar.f1326h;
            if (str2 == null || str2.isEmpty()) {
                str2 = this.f1326h;
            }
            String str3 = str2;
            c cVar = dVar.f1327i;
            if (cVar == c.ANY) {
                cVar = this.f1327i;
            }
            c cVar2 = cVar;
            Locale locale = dVar.f1328j;
            if (locale == null) {
                locale = this.f1328j;
            }
            Locale locale2 = locale;
            b bVar = this.f1331m;
            if (bVar == null) {
                bVar = dVar.f1331m;
            } else {
                b bVar2 = dVar.f1331m;
                if (bVar2 != null) {
                    int i2 = bVar2.f1314b;
                    int i3 = bVar2.a;
                    if (!(i2 == 0 && i3 == 0)) {
                        int i4 = bVar.a;
                        if (i4 == 0 && bVar.f1314b == 0) {
                            bVar = bVar2;
                        } else {
                            int i5 = ((~i2) & i4) | i3;
                            int i6 = bVar.f1314b;
                            int i7 = i2 | ((~i3) & i6);
                            if (!(i5 == i4 && i7 == i6)) {
                                bVar = new b(i5, i7);
                            }
                        }
                    }
                }
            }
            b bVar3 = bVar;
            Boolean bool = dVar.f1330l;
            if (bool == null) {
                bool = this.f1330l;
            }
            Boolean bool2 = bool;
            String str4 = dVar.f1329k;
            if (str4 == null || str4.isEmpty()) {
                str = this.f1329k;
                timeZone = this.f1332n;
            } else {
                timeZone = dVar.f1332n;
                str = str4;
            }
            return new d(str3, cVar2, locale2, str, timeZone, bVar3, bool2);
        }

        public int hashCode() {
            String str = this.f1329k;
            int hashCode = str == null ? 1 : str.hashCode();
            String str2 = this.f1326h;
            if (str2 != null) {
                hashCode ^= str2.hashCode();
            }
            int hashCode2 = this.f1327i.hashCode() + hashCode;
            Boolean bool = this.f1330l;
            if (bool != null) {
                hashCode2 ^= bool.hashCode();
            }
            Locale locale = this.f1328j;
            if (locale != null) {
                hashCode2 += locale.hashCode();
            }
            return this.f1331m.hashCode() ^ hashCode2;
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", new Object[]{this.f1326h, this.f1327i, this.f1330l, this.f1328j, this.f1329k, this.f1331m});
        }
    }

    m0 lenient() default m0.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    c shape() default c.ANY;

    String timezone() default "##default";

    a[] with() default {};

    a[] without() default {};
}
