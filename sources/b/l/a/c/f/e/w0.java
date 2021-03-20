package b.l.a.c.f.e;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public abstract class w0 extends w0<String> implements Iterator {

    /* renamed from: h  reason: collision with root package name */
    public T f3368h;

    /* renamed from: i  reason: collision with root package name */
    public int f3369i = 2;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f3370j;

    /* renamed from: k  reason: collision with root package name */
    public int f3371k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f3372l;

    public w0(w1 w1Var, CharSequence charSequence) {
        Objects.requireNonNull(w1Var);
        this.f3372l = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f3370j = charSequence;
    }

    public abstract int a(int i2);

    public abstract int b(int i2);

    public final boolean hasNext() {
        int i2;
        int i3 = this.f3369i;
        if (i3 != 4) {
            int i4 = i3 - 1;
            T t = null;
            if (i3 == 0) {
                throw null;
            } else if (i4 == 0) {
                return true;
            } else {
                if (i4 != 2) {
                    this.f3369i = 4;
                    int i5 = this.f3371k;
                    while (true) {
                        int i6 = this.f3371k;
                        if (i6 == -1) {
                            this.f3369i = 3;
                            break;
                        }
                        int a = a(i6);
                        if (a == -1) {
                            a = this.f3370j.length();
                            this.f3371k = -1;
                            i2 = -1;
                        } else {
                            i2 = b(a);
                            this.f3371k = i2;
                        }
                        if (i2 == i5) {
                            int i7 = i2 + 1;
                            this.f3371k = i7;
                            if (i7 > this.f3370j.length()) {
                                this.f3371k = -1;
                            }
                        } else {
                            if (i5 < a) {
                                this.f3370j.charAt(i5);
                            }
                            if (i5 < a) {
                                this.f3370j.charAt(a - 1);
                            }
                            int i8 = this.f3372l;
                            if (i8 == 1) {
                                a = this.f3370j.length();
                                this.f3371k = -1;
                                if (a > i5) {
                                    this.f3370j.charAt(a - 1);
                                }
                            } else {
                                this.f3372l = i8 - 1;
                            }
                            t = this.f3370j.subSequence(i5, a).toString();
                        }
                    }
                    this.f3368h = t;
                    if (this.f3369i != 3) {
                        this.f3369i = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f3369i = 2;
            T t = this.f3368h;
            this.f3368h = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
