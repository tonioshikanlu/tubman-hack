package e.a0;

import e.x.c.z.a;
import java.util.Iterator;

public class b implements Iterable<Integer>, a {

    /* renamed from: h  reason: collision with root package name */
    public final int f7883h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7884i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7885j;

    public b(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.f7883h = i2;
            if (i4 > 0) {
                if (i2 < i3) {
                    i3 -= b.q.a.a.t2(b.q.a.a.t2(i3, i4) - b.q.a.a.t2(i2, i4), i4);
                }
            } else if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i2 > i3) {
                int i5 = -i4;
                i3 += b.q.a.a.t2(b.q.a.a.t2(i2, i5) - b.q.a.a.t2(i3, i5), i5);
            }
            this.f7884i = i3;
            this.f7885j = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (!(this.f7883h == bVar.f7883h && this.f7884i == bVar.f7884i && this.f7885j == bVar.f7885j)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f7883h * 31) + this.f7884i) * 31) + this.f7885j;
    }

    public boolean isEmpty() {
        if (this.f7885j > 0) {
            if (this.f7883h > this.f7884i) {
                return true;
            }
        } else if (this.f7883h < this.f7884i) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return new c(this.f7883h, this.f7884i, this.f7885j);
    }

    public String toString() {
        int i2;
        StringBuilder sb;
        if (this.f7885j > 0) {
            sb = new StringBuilder();
            sb.append(this.f7883h);
            sb.append("..");
            sb.append(this.f7884i);
            sb.append(" step ");
            i2 = this.f7885j;
        } else {
            sb = new StringBuilder();
            sb.append(this.f7883h);
            sb.append(" downTo ");
            sb.append(this.f7884i);
            sb.append(" step ");
            i2 = -this.f7885j;
        }
        sb.append(i2);
        return sb.toString();
    }
}
