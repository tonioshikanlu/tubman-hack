package b.p.b.a0.j;

import androidx.exifinterface.media.ExifInterface;
import b.p.b.a0.j.p;
import e.a.a.a.y0.m.o1.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.e;
import o.g;
import o.h;
import o.z;

public final class n {
    public static final l[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<h, Integer> f6566b;

    public static final class a {
        public final List<l> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final g f6567b;
        public int c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public l[] f6568e = new l[8];
        public int f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f6569g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f6570h = 0;

        public a(int i2, z zVar) {
            this.c = i2;
            this.d = i2;
            this.f6567b = c.m(zVar);
        }

        public final void a() {
            this.a.clear();
            Arrays.fill(this.f6568e, (Object) null);
            this.f = this.f6568e.length - 1;
            this.f6569g = 0;
            this.f6570h = 0;
        }

        public final int b(int i2) {
            return this.f + 1 + i2;
        }

        public final int c(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f6568e.length;
                while (true) {
                    length--;
                    i3 = this.f;
                    if (length < i3 || i2 <= 0) {
                        l[] lVarArr = this.f6568e;
                        System.arraycopy(lVarArr, i3 + 1, lVarArr, i3 + 1 + i4, this.f6569g);
                        this.f += i4;
                    } else {
                        l[] lVarArr2 = this.f6568e;
                        i2 -= lVarArr2[length].c;
                        this.f6570h -= lVarArr2[length].c;
                        this.f6569g--;
                        i4++;
                    }
                }
                l[] lVarArr3 = this.f6568e;
                System.arraycopy(lVarArr3, i3 + 1, lVarArr3, i3 + 1 + i4, this.f6569g);
                this.f += i4;
            }
            return i4;
        }

        public final h d(int i2) {
            l lVar;
            boolean z = true;
            if (i2 < 0 || i2 > n.a.length - 1) {
                z = false;
            }
            if (z) {
                lVar = n.a[i2];
            } else {
                lVar = this.f6568e[b(i2 - n.a.length)];
            }
            return lVar.a;
        }

        public final void e(int i2, l lVar) {
            this.a.add(lVar);
            int i3 = lVar.c;
            if (i2 != -1) {
                i3 -= this.f6568e[(this.f + 1) + i2].c;
            }
            int i4 = this.d;
            if (i3 > i4) {
                a();
                return;
            }
            int c2 = c((this.f6570h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f6569g + 1;
                l[] lVarArr = this.f6568e;
                if (i5 > lVarArr.length) {
                    l[] lVarArr2 = new l[(lVarArr.length * 2)];
                    System.arraycopy(lVarArr, 0, lVarArr2, lVarArr.length, lVarArr.length);
                    this.f = this.f6568e.length - 1;
                    this.f6568e = lVarArr2;
                }
                int i6 = this.f;
                this.f = i6 - 1;
                this.f6568e[i6] = lVar;
                this.f6569g++;
            } else {
                this.f6568e[this.f + 1 + i2 + c2 + i2] = lVar;
            }
            this.f6570h += i3;
        }

        public h f() {
            byte readByte = this.f6567b.readByte() & ExifInterface.MARKER;
            boolean z = (readByte & 128) == 128;
            int g2 = g(readByte, 127);
            if (!z) {
                return this.f6567b.p((long) g2);
            }
            p pVar = p.d;
            byte[] G = this.f6567b.G((long) g2);
            Objects.requireNonNull(pVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i2 = 0;
            p.a aVar = pVar.a;
            byte b2 = 0;
            for (byte b3 : G) {
                b2 = (b2 << 8) | (b3 & ExifInterface.MARKER);
                i2 += 8;
                while (i2 >= 8) {
                    int i3 = i2 - 8;
                    aVar = aVar.a[(b2 >>> i3) & 255];
                    if (aVar.a == null) {
                        byteArrayOutputStream.write(aVar.f6590b);
                        i2 -= aVar.c;
                        aVar = pVar.a;
                    } else {
                        i2 = i3;
                    }
                }
            }
            while (i2 > 0) {
                p.a aVar2 = aVar.a[(b2 << (8 - i2)) & 255];
                if (aVar2.a != null || aVar2.c > i2) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.f6590b);
                i2 -= aVar2.c;
                aVar = pVar.a;
            }
            return h.t(byteArrayOutputStream.toByteArray());
        }

        public int g(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                byte readByte = this.f6567b.readByte() & ExifInterface.MARKER;
                if ((readByte & 128) == 0) {
                    return i3 + (readByte << i5);
                }
                i3 += (readByte & Byte.MAX_VALUE) << i5;
                i5 += 7;
            }
        }
    }

    public static final class b {
        public final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        public void a(h hVar) {
            c(hVar.l(), 127, 0);
            this.a.r0(hVar);
        }

        public void b(List<l> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                h w = list.get(i2).a.w();
                Integer num = n.f6566b.get(w);
                if (num != null) {
                    c(num.intValue() + 1, 15, 0);
                } else {
                    this.a.u0(0);
                    a(w);
                }
                a(list.get(i2).f6560b);
            }
        }

        public void c(int i2, int i3, int i4) {
            int i5;
            e eVar;
            if (i2 < i3) {
                eVar = this.a;
                i5 = i2 | i4;
            } else {
                this.a.u0(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.a.u0(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                eVar = this.a;
            }
            eVar.u0(i5);
        }
    }

    static {
        l lVar = new l(l.f6557h, "");
        int i2 = 0;
        h hVar = l.f6555e;
        h hVar2 = l.f;
        h hVar3 = l.f6556g;
        h hVar4 = l.d;
        l[] lVarArr = {lVar, new l(hVar, "GET"), new l(hVar, "POST"), new l(hVar2, "/"), new l(hVar2, "/index.html"), new l(hVar3, "http"), new l(hVar3, "https"), new l(hVar4, "200"), new l(hVar4, "204"), new l(hVar4, "206"), new l(hVar4, "304"), new l(hVar4, "400"), new l(hVar4, "404"), new l(hVar4, "500"), new l("accept-charset", ""), new l("accept-encoding", "gzip, deflate"), new l("accept-language", ""), new l("accept-ranges", ""), new l("accept", ""), new l("access-control-allow-origin", ""), new l("age", ""), new l("allow", ""), new l("authorization", ""), new l("cache-control", ""), new l("content-disposition", ""), new l("content-encoding", ""), new l("content-language", ""), new l("content-length", ""), new l("content-location", ""), new l("content-range", ""), new l("content-type", ""), new l("cookie", ""), new l("date", ""), new l("etag", ""), new l("expect", ""), new l("expires", ""), new l("from", ""), new l("host", ""), new l("if-match", ""), new l("if-modified-since", ""), new l("if-none-match", ""), new l("if-range", ""), new l("if-unmodified-since", ""), new l("last-modified", ""), new l("link", ""), new l("location", ""), new l("max-forwards", ""), new l("proxy-authenticate", ""), new l("proxy-authorization", ""), new l("range", ""), new l("referer", ""), new l("refresh", ""), new l("retry-after", ""), new l("server", ""), new l("set-cookie", ""), new l("strict-transport-security", ""), new l("transfer-encoding", ""), new l("user-agent", ""), new l("vary", ""), new l("via", ""), new l("www-authenticate", "")};
        a = lVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(lVarArr.length);
        while (true) {
            l[] lVarArr2 = a;
            if (i2 < lVarArr2.length) {
                if (!linkedHashMap.containsKey(lVarArr2[i2].a)) {
                    linkedHashMap.put(lVarArr2[i2].a, Integer.valueOf(i2));
                }
                i2++;
            } else {
                f6566b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static h a(h hVar) {
        int l2 = hVar.l();
        int i2 = 0;
        while (i2 < l2) {
            byte r = hVar.r(i2);
            if (r < 65 || r > 90) {
                i2++;
            } else {
                StringBuilder y = b.e.a.a.a.y("PROTOCOL_ERROR response malformed: mixed case name: ");
                y.append(hVar.y());
                throw new IOException(y.toString());
            }
        }
        return hVar;
    }
}
