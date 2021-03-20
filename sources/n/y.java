package n;

import e.a0.e;
import e.c0.h;
import e.j;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.m0.c;

public final class y implements Iterable<j<? extends String, ? extends String>>, e.x.c.z.a {

    /* renamed from: i  reason: collision with root package name */
    public static final b f10426i = new b((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public final String[] f10427h;

    public static final class a {
        public final List<String> a = new ArrayList(20);

        public final a a(String str, String str2) {
            i.e(str, "name");
            i.e(str2, "value");
            this.a.add(str);
            this.a.add(h.N(str2).toString());
            return this;
        }

        public final y b() {
            Object[] array = this.a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new y((String[]) array, (DefaultConstructorMarker) null);
        }

        public final a c(String str) {
            i.e(str, "name");
            int i2 = 0;
            while (i2 < this.a.size()) {
                if (h.f(str, this.a.get(i2), true)) {
                    this.a.remove(i2);
                    this.a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }
    }

    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i2 = 0;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if ('!' <= charAt && '~' >= charAt) {
                        i2++;
                    } else {
                        throw new IllegalArgumentException(c.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        public final void b(String str, String str2) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i2++;
                } else {
                    throw new IllegalArgumentException(c.i("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str2, str).toString());
                }
            }
        }

        public final y c(String... strArr) {
            i.e(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    if (strArr2[i2] != null) {
                        String str = strArr2[i2];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i2] = h.N(str).toString();
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                e.a0.b c = e.c(e.d(0, strArr2.length), 2);
                int i3 = c.f7883h;
                int i4 = c.f7884i;
                int i5 = c.f7885j;
                if (i5 < 0 ? i3 >= i4 : i3 <= i4) {
                    while (true) {
                        String str2 = strArr2[i3];
                        String str3 = strArr2[i3 + 1];
                        a(str2);
                        b(str3, str2);
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    }
                }
                return new y(strArr2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public y(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f10427h = strArr;
    }

    public final String d(String str) {
        i.e(str, "name");
        String[] strArr = this.f10427h;
        e.a0.b c = e.c(e.b(strArr.length - 2, 0), 2);
        int i2 = c.f7883h;
        int i3 = c.f7884i;
        int i4 = c.f7885j;
        if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
            while (!h.f(str, strArr[i2], true)) {
                if (i2 != i3) {
                    i2 += i4;
                }
            }
            return strArr[i2 + 1];
        }
        return null;
    }

    public final String e(int i2) {
        return this.f10427h[i2 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && Arrays.equals(this.f10427h, ((y) obj).f10427h);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10427h);
    }

    public Iterator<j<String, String>> iterator() {
        int size = size();
        j[] jVarArr = new j[size];
        for (int i2 = 0; i2 < size; i2++) {
            jVarArr[i2] = new j(e(i2), p(i2));
        }
        return b.q.a.a.c2(jVarArr);
    }

    public final a n() {
        a aVar = new a();
        List<String> list = aVar.a;
        String[] strArr = this.f10427h;
        i.e(list, "$this$addAll");
        i.e(strArr, "elements");
        list.addAll(g.c(strArr));
        return aVar;
    }

    public final String p(int i2) {
        return this.f10427h[(i2 * 2) + 1];
    }

    public final int size() {
        return this.f10427h.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(e(i2));
            sb.append(": ");
            sb.append(p(i2));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
