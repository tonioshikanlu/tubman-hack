package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class w<E> implements List<E>, RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public final List<E> f5255h;

    public w(List<E> list) {
        this.f5255h = Collections.unmodifiableList(list);
    }

    public void add(int i2, @NonNull E e2) {
        this.f5255h.add(i2, e2);
    }

    public boolean add(@NonNull E e2) {
        return this.f5255h.add(e2);
    }

    public boolean addAll(int i2, @NonNull Collection<? extends E> collection) {
        return this.f5255h.addAll(i2, collection);
    }

    public boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.f5255h.addAll(collection);
    }

    public void clear() {
        this.f5255h.clear();
    }

    public boolean contains(@Nullable Object obj) {
        return this.f5255h.contains(obj);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.f5255h.containsAll(collection);
    }

    public boolean equals(@Nullable Object obj) {
        return this.f5255h.equals(obj);
    }

    @NonNull
    public E get(int i2) {
        return this.f5255h.get(i2);
    }

    public int hashCode() {
        return this.f5255h.hashCode();
    }

    public int indexOf(@Nullable Object obj) {
        return this.f5255h.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f5255h.isEmpty();
    }

    @NonNull
    public Iterator<E> iterator() {
        return this.f5255h.iterator();
    }

    public int lastIndexOf(@Nullable Object obj) {
        return this.f5255h.lastIndexOf(obj);
    }

    @NonNull
    public ListIterator<E> listIterator() {
        return this.f5255h.listIterator();
    }

    @NonNull
    public ListIterator<E> listIterator(int i2) {
        return this.f5255h.listIterator(i2);
    }

    public E remove(int i2) {
        return this.f5255h.remove(i2);
    }

    public boolean remove(@Nullable Object obj) {
        return this.f5255h.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.f5255h.removeAll(collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.f5255h.retainAll(collection);
    }

    @NonNull
    public E set(int i2, @NonNull E e2) {
        return this.f5255h.set(i2, e2);
    }

    public int size() {
        return this.f5255h.size();
    }

    @NonNull
    public List<E> subList(int i2, int i3) {
        return this.f5255h.subList(i2, i3);
    }

    @Nullable
    public Object[] toArray() {
        return this.f5255h.toArray();
    }

    public <T> T[] toArray(@Nullable T[] tArr) {
        return this.f5255h.toArray(tArr);
    }
}
