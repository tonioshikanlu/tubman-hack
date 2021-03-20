package b.l.c.b;

import b.l.a.c.b.a;
import b.l.c.a.c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public final class l<T> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final Comparator<? super T> f4873h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4874i;

    /* renamed from: j  reason: collision with root package name */
    public final T f4875j;

    /* renamed from: k  reason: collision with root package name */
    public final f f4876k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4877l;

    /* renamed from: m  reason: collision with root package name */
    public final T f4878m;

    /* renamed from: n  reason: collision with root package name */
    public final f f4879n;

    public l(Comparator<? super T> comparator, boolean z, T t, f fVar, boolean z2, T t2, f fVar2) {
        Objects.requireNonNull(comparator);
        this.f4873h = comparator;
        this.f4874i = z;
        this.f4877l = z2;
        this.f4875j = t;
        Objects.requireNonNull(fVar);
        this.f4876k = fVar;
        this.f4878m = t2;
        Objects.requireNonNull(fVar2);
        this.f4879n = fVar2;
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator.compare(t, t2);
            boolean z3 = true;
            if (!(compare <= 0)) {
                throw new IllegalArgumentException(c.a("lowerEndpoint (%s) > upperEndpoint (%s)", t, t2));
            } else if (compare == 0) {
                f fVar3 = f.OPEN;
                a.q((fVar != fVar3) | (fVar2 == fVar3 ? false : z3));
            }
        }
    }

    public boolean a(T t) {
        return !d(t) && !c(t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r13.f4876k == r0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r13.f4879n == r0) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.c.b.l<T> b(b.l.c.b.l<T> r13) {
        /*
            r12 = this;
            b.l.c.b.f r0 = b.l.c.b.f.OPEN
            java.util.Comparator<? super T> r1 = r12.f4873h
            java.util.Comparator<? super T> r2 = r13.f4873h
            boolean r1 = r1.equals(r2)
            b.l.a.c.b.a.q(r1)
            boolean r1 = r12.f4874i
            T r2 = r12.f4875j
            b.l.c.b.f r3 = r12.f4876k
            if (r1 != 0) goto L_0x001a
            boolean r1 = r13.f4874i
        L_0x0017:
            T r2 = r13.f4875j
            goto L_0x002f
        L_0x001a:
            boolean r4 = r13.f4874i
            if (r4 == 0) goto L_0x0031
            java.util.Comparator<? super T> r4 = r12.f4873h
            T r5 = r13.f4875j
            int r4 = r4.compare(r2, r5)
            if (r4 < 0) goto L_0x0017
            if (r4 != 0) goto L_0x0031
            b.l.c.b.f r4 = r13.f4876k
            if (r4 != r0) goto L_0x0031
            goto L_0x0017
        L_0x002f:
            b.l.c.b.f r3 = r13.f4876k
        L_0x0031:
            r6 = r1
            boolean r1 = r12.f4877l
            T r4 = r12.f4878m
            b.l.c.b.f r5 = r12.f4879n
            if (r1 != 0) goto L_0x003f
            boolean r1 = r13.f4877l
        L_0x003c:
            T r4 = r13.f4878m
            goto L_0x0054
        L_0x003f:
            boolean r7 = r13.f4877l
            if (r7 == 0) goto L_0x0056
            java.util.Comparator<? super T> r7 = r12.f4873h
            T r8 = r13.f4878m
            int r7 = r7.compare(r4, r8)
            if (r7 > 0) goto L_0x003c
            if (r7 != 0) goto L_0x0056
            b.l.c.b.f r7 = r13.f4879n
            if (r7 != r0) goto L_0x0056
            goto L_0x003c
        L_0x0054:
            b.l.c.b.f r5 = r13.f4879n
        L_0x0056:
            r9 = r1
            r10 = r4
            if (r6 == 0) goto L_0x0070
            if (r9 == 0) goto L_0x0070
            java.util.Comparator<? super T> r13 = r12.f4873h
            int r13 = r13.compare(r2, r10)
            if (r13 > 0) goto L_0x006a
            if (r13 != 0) goto L_0x0070
            if (r3 != r0) goto L_0x0070
            if (r5 != r0) goto L_0x0070
        L_0x006a:
            b.l.c.b.f r13 = b.l.c.b.f.CLOSED
            r11 = r13
            r8 = r0
            r7 = r10
            goto L_0x0073
        L_0x0070:
            r7 = r2
            r8 = r3
            r11 = r5
        L_0x0073:
            b.l.c.b.l r13 = new b.l.c.b.l
            java.util.Comparator<? super T> r5 = r12.f4873h
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.c.b.l.b(b.l.c.b.l):b.l.c.b.l");
    }

    public boolean c(T t) {
        boolean z = false;
        if (!this.f4877l) {
            return false;
        }
        int compare = this.f4873h.compare(t, this.f4878m);
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (this.f4879n == f.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    public boolean d(T t) {
        boolean z = false;
        if (!this.f4874i) {
            return false;
        }
        int compare = this.f4873h.compare(t, this.f4875j);
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (this.f4876k == f.OPEN) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f4873h.equals(lVar.f4873h) || this.f4874i != lVar.f4874i || this.f4877l != lVar.f4877l || !this.f4876k.equals(lVar.f4876k) || !this.f4879n.equals(lVar.f4879n) || !a.U(this.f4875j, lVar.f4875j) || !a.U(this.f4878m, lVar.f4878m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4873h, this.f4875j, this.f4876k, this.f4878m, this.f4879n});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4873h);
        sb.append(":");
        f fVar = this.f4876k;
        f fVar2 = f.CLOSED;
        sb.append(fVar == fVar2 ? '[' : '(');
        sb.append(this.f4874i ? this.f4875j : "-∞");
        sb.append(',');
        sb.append(this.f4877l ? this.f4878m : "∞");
        sb.append(this.f4879n == fVar2 ? ']' : ')');
        return sb.toString();
    }
}
