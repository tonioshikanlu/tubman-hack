package b.p.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class n {
    public final String[] a;

    public static final class b {
        public final List<String> a = new ArrayList(20);

        public b a(String str, String str2) {
            d(str, str2);
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public b b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public n c() {
            return new n(this, (a) null);
        }

        public final void d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i2), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        char charAt2 = str2.charAt(i3);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i3), str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        public b e(String str) {
            int i2 = 0;
            while (i2 < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i2))) {
                    this.a.remove(i2);
                    this.a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }
    }

    public n(b bVar, a aVar) {
        List<String> list = bVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    public String a(String str) {
        String[] strArr = this.a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public String b(int i2) {
        int i3 = i2 * 2;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public b c() {
        b bVar = new b();
        Collections.addAll(bVar.a, this.a);
        return bVar;
    }

    public int d() {
        return this.a.length / 2;
    }

    public String e(int i2) {
        int i3 = (i2 * 2) + 1;
        if (i3 < 0) {
            return null;
        }
        String[] strArr = this.a;
        if (i3 >= strArr.length) {
            return null;
        }
        return strArr[i3];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int d = d();
        for (int i2 = 0; i2 < d; i2++) {
            sb.append(b(i2));
            sb.append(": ");
            sb.append(e(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}
