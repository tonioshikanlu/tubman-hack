package e.a.a.a.y0.o;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public class l<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public int f9824h;

    /* renamed from: i  reason: collision with root package name */
    public Object f9825i;

    public static class b<T> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f9826h = new b();

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    public class c extends d<E> {

        /* renamed from: i  reason: collision with root package name */
        public final int f9827i;

        public c() {
            super((a) null);
            this.f9827i = l.this.modCount;
        }

        public void a() {
            if (l.this.modCount != this.f9827i) {
                StringBuilder y = b.e.a.a.a.y("ModCount: ");
                y.append(l.this.modCount);
                y.append("; expected: ");
                y.append(this.f9827i);
                throw new ConcurrentModificationException(y.toString());
            }
        }

        public void remove() {
            a();
            l.this.clear();
        }
    }

    public static abstract class d<T> implements Iterator<T> {

        /* renamed from: h  reason: collision with root package name */
        public boolean f9829h;

        public d(a aVar) {
        }

        public abstract void a();

        public final boolean hasNext() {
            return !this.f9829h;
        }

        public final T next() {
            if (!this.f9829h) {
                this.f9829h = true;
                a();
                return l.this.f9825i;
            }
            throw new NoSuchElementException();
        }
    }

    public static /* synthetic */ void d(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : 3)];
        switch (i2) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i2 == 2 || i2 == 3) {
            objArr[1] = "iterator";
        } else if (i2 == 5 || i2 == 6 || i2 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i2) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6 || i2 == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public void add(int i2, E e2) {
        int i3;
        if (i2 < 0 || i2 > (i3 = this.f9824h)) {
            StringBuilder z = b.e.a.a.a.z("Index: ", i2, ", Size: ");
            z.append(this.f9824h);
            throw new IndexOutOfBoundsException(z.toString());
        }
        if (i3 == 0) {
            this.f9825i = e2;
        } else if (i3 == 1 && i2 == 0) {
            this.f9825i = new Object[]{e2, this.f9825i};
        } else {
            Object[] objArr = new Object[(i3 + 1)];
            if (i3 == 1) {
                objArr[0] = this.f9825i;
            } else {
                Object[] objArr2 = (Object[]) this.f9825i;
                System.arraycopy(objArr2, 0, objArr, 0, i2);
                System.arraycopy(objArr2, i2, objArr, i2 + 1, this.f9824h - i2);
            }
            objArr[i2] = e2;
            this.f9825i = objArr;
        }
        this.f9824h++;
        this.modCount++;
    }

    public boolean add(E e2) {
        int i2 = this.f9824h;
        if (i2 == 0) {
            this.f9825i = e2;
        } else if (i2 == 1) {
            this.f9825i = new Object[]{this.f9825i, e2};
        } else {
            Object[] objArr = (Object[]) this.f9825i;
            int length = objArr.length;
            if (i2 >= length) {
                int H = b.e.a.a.a.H(length, 3, 2, 1);
                int i3 = i2 + 1;
                if (H < i3) {
                    H = i3;
                }
                Object[] objArr2 = new Object[H];
                this.f9825i = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f9824h] = e2;
        }
        this.f9824h++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.f9825i = null;
        this.f9824h = 0;
        this.modCount++;
    }

    public E get(int i2) {
        int i3;
        if (i2 >= 0 && i2 < (i3 = this.f9824h)) {
            return i3 == 1 ? this.f9825i : ((Object[]) this.f9825i)[i2];
        }
        StringBuilder z = b.e.a.a.a.z("Index: ", i2, ", Size: ");
        z.append(this.f9824h);
        throw new IndexOutOfBoundsException(z.toString());
    }

    public Iterator<E> iterator() {
        int i2 = this.f9824h;
        if (i2 == 0) {
            return b.f9826h;
        }
        if (i2 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        d(3);
        throw null;
    }

    public E remove(int i2) {
        int i3;
        E e2;
        if (i2 < 0 || i2 >= (i3 = this.f9824h)) {
            StringBuilder z = b.e.a.a.a.z("Index: ", i2, ", Size: ");
            z.append(this.f9824h);
            throw new IndexOutOfBoundsException(z.toString());
        }
        if (i3 == 1) {
            e2 = this.f9825i;
            this.f9825i = null;
        } else {
            E[] eArr = (Object[]) this.f9825i;
            E e3 = eArr[i2];
            if (i3 == 2) {
                this.f9825i = eArr[1 - i2];
            } else {
                int i4 = (i3 - i2) - 1;
                if (i4 > 0) {
                    System.arraycopy(eArr, i2 + 1, eArr, i2, i4);
                }
                eArr[this.f9824h - 1] = null;
            }
            e2 = e3;
        }
        this.f9824h--;
        this.modCount++;
        return e2;
    }

    public E set(int i2, E e2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f9824h)) {
            StringBuilder z = b.e.a.a.a.z("Index: ", i2, ", Size: ");
            z.append(this.f9824h);
            throw new IndexOutOfBoundsException(z.toString());
        } else if (i3 == 1) {
            E e3 = this.f9825i;
            this.f9825i = e2;
            return e3;
        } else {
            E[] eArr = (Object[]) this.f9825i;
            E e4 = eArr[i2];
            eArr[i2] = e2;
            return e4;
        }
    }

    public int size() {
        return this.f9824h;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr != null) {
            int length = tArr.length;
            int i2 = this.f9824h;
            if (i2 == 1) {
                if (length != 0) {
                    tArr[0] = this.f9825i;
                } else {
                    T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                    tArr2[0] = this.f9825i;
                    return tArr2;
                }
            } else if (length < i2) {
                T[] copyOf = Arrays.copyOf((Object[]) this.f9825i, i2, tArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                d(6);
                throw null;
            } else if (i2 != 0) {
                System.arraycopy(this.f9825i, 0, tArr, 0, i2);
            }
            int i3 = this.f9824h;
            if (length > i3) {
                tArr[i3] = null;
            }
            return tArr;
        }
        d(4);
        throw null;
    }
}
