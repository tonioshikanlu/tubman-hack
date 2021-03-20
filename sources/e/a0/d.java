package e.a0;

public final class d extends b implements a<Integer> {

    /* renamed from: k  reason: collision with root package name */
    public static final d f7890k = new d(1, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final d f7891l = null;

    public d(int i2, int i3) {
        super(i2, i3, 1);
    }

    /* renamed from: d */
    public Integer getEndInclusive() {
        return Integer.valueOf(this.f7884i);
    }

    /* renamed from: e */
    public Integer getStart() {
        return Integer.valueOf(this.f7883h);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (!(this.f7883h == dVar.f7883h && this.f7884i == dVar.f7884i)) {
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
        return (this.f7883h * 31) + this.f7884i;
    }

    public boolean isEmpty() {
        return this.f7883h > this.f7884i;
    }

    public String toString() {
        return this.f7883h + ".." + this.f7884i;
    }
}
