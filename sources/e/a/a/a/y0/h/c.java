package e.a.a.a.y0.h;

import com.google.android.material.badge.BadgeDrawable;
import e.a.a.a.y0.h.s;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class c implements Iterable<Byte> {

    /* renamed from: h  reason: collision with root package name */
    public static final c f9218h = new o(new byte[0]);

    public interface a extends Iterator<Byte> {
        byte d();
    }

    public static final class b extends OutputStream {

        /* renamed from: m  reason: collision with root package name */
        public static final byte[] f9219m = new byte[0];

        /* renamed from: h  reason: collision with root package name */
        public final int f9220h;

        /* renamed from: i  reason: collision with root package name */
        public final ArrayList<c> f9221i;

        /* renamed from: j  reason: collision with root package name */
        public int f9222j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f9223k;

        /* renamed from: l  reason: collision with root package name */
        public int f9224l;

        public b(int i2) {
            if (i2 >= 0) {
                this.f9220h = i2;
                this.f9221i = new ArrayList<>();
                this.f9223k = new byte[i2];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public final void b(int i2) {
            this.f9221i.add(new o(this.f9223k));
            int length = this.f9222j + this.f9223k.length;
            this.f9222j = length;
            this.f9223k = new byte[Math.max(this.f9220h, Math.max(i2, length >>> 1))];
            this.f9224l = 0;
        }

        public final void e() {
            int i2 = this.f9224l;
            byte[] bArr = this.f9223k;
            if (i2 >= bArr.length) {
                this.f9221i.add(new o(this.f9223k));
                this.f9223k = f9219m;
            } else if (i2 > 0) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i2));
                this.f9221i.add(new o(bArr2));
            }
            this.f9222j += this.f9224l;
            this.f9224l = 0;
        }

        public synchronized c q() {
            ArrayList<c> arrayList;
            e();
            arrayList = this.f9221i;
            if (!(arrayList instanceof Collection)) {
                ArrayList<c> arrayList2 = new ArrayList<>();
                for (c add : arrayList) {
                    arrayList2.add(add);
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? c.f9218h : c.d(arrayList.iterator(), arrayList.size());
        }

        public String toString() {
            int i2;
            Object[] objArr = new Object[2];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i2 = this.f9222j + this.f9224l;
            }
            objArr[1] = Integer.valueOf(i2);
            return String.format("<ByteString.Output@%s size=%d>", objArr);
        }

        public synchronized void write(int i2) {
            if (this.f9224l == this.f9223k.length) {
                b(1);
            }
            byte[] bArr = this.f9223k;
            int i3 = this.f9224l;
            this.f9224l = i3 + 1;
            bArr[i3] = (byte) i2;
        }

        public synchronized void write(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = this.f9223k;
            int length = bArr2.length;
            int i4 = this.f9224l;
            if (i3 <= length - i4) {
                System.arraycopy(bArr, i2, bArr2, i4, i3);
                this.f9224l += i3;
            } else {
                int length2 = bArr2.length - i4;
                System.arraycopy(bArr, i2, bArr2, i4, length2);
                int i5 = i3 - length2;
                b(i5);
                System.arraycopy(bArr, i2 + length2, this.f9223k, 0, i5);
                this.f9224l = i5;
            }
        }
    }

    static {
        Class<c> cls = c.class;
    }

    public static b D() {
        return new b(128);
    }

    public static c d(Iterator<c> it, int i2) {
        if (i2 == 1) {
            return it.next();
        }
        int i3 = i2 >>> 1;
        return d(it, i3).e(d(it, i2 - i3));
    }

    public static c l(String str) {
        try {
            return new o(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    /* renamed from: C */
    public abstract a iterator();

    public abstract int G(int i2, int i3, int i4);

    public abstract int H(int i2, int i3, int i4);

    public abstract int I();

    public abstract String J(String str);

    public String K() {
        try {
            return J("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    public abstract void L(OutputStream outputStream, int i2, int i3);

    public c e(c cVar) {
        int size = size();
        int size2 = cVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            int[] iArr = s.f9259o;
            s sVar = this instanceof s ? (s) this : null;
            if (cVar.size() == 0) {
                return this;
            }
            if (size() == 0) {
                return cVar;
            }
            int size3 = cVar.size() + size();
            if (size3 < 128) {
                return s.N(this, cVar);
            }
            if (sVar != null) {
                if (cVar.size() + sVar.f9262k.size() < 128) {
                    return new s(sVar.f9261j, s.N(sVar.f9262k, cVar));
                }
            }
            if (sVar == null || sVar.f9261j.s() <= sVar.f9262k.s() || sVar.f9264m <= cVar.s()) {
                if (size3 >= s.f9259o[Math.max(s(), cVar.s()) + 1]) {
                    return new s(this, cVar);
                }
                s.b bVar = new s.b((s.a) null);
                bVar.a(this);
                bVar.a(cVar);
                c pop = bVar.a.pop();
                while (!bVar.a.isEmpty()) {
                    pop = new s(bVar.a.pop(), pop);
                }
                return pop;
            }
            return new s(sVar.f9261j, new s(sVar.f9262k, cVar));
        }
        throw new IllegalArgumentException(b.e.a.a.a.R(53, "ByteString would be too long: ", size, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, size2));
    }

    public void n(byte[] bArr, int i2, int i3, int i4) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(b.e.a.a.a.Q(30, "Source offset < 0: ", i2));
        } else if (i3 < 0) {
            throw new IndexOutOfBoundsException(b.e.a.a.a.Q(30, "Target offset < 0: ", i3));
        } else if (i4 >= 0) {
            int i5 = i2 + i4;
            if (i5 <= size()) {
                int i6 = i3 + i4;
                if (i6 > bArr.length) {
                    throw new IndexOutOfBoundsException(b.e.a.a.a.Q(34, "Target end offset < 0: ", i6));
                } else if (i4 > 0) {
                    p(bArr, i2, i3, i4);
                }
            } else {
                throw new IndexOutOfBoundsException(b.e.a.a.a.Q(34, "Source end offset < 0: ", i5));
            }
        } else {
            throw new IndexOutOfBoundsException(b.e.a.a.a.Q(23, "Length < 0: ", i4));
        }
    }

    public abstract void p(byte[] bArr, int i2, int i3, int i4);

    public abstract int s();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract boolean v();

    public abstract boolean y();
}
