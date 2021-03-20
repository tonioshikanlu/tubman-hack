package b.l.c.b;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Collection;

public abstract class r<E> extends a0<E> {
    public void clear() {
        d().clear();
    }

    public boolean contains(Object obj) {
        return d().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return d().containsAll(collection);
    }

    public abstract o<E> d();

    public boolean isEmpty() {
        return d().isEmpty();
    }

    public boolean remove(Object obj) {
        return d().k(obj, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) > 0;
    }

    public int size() {
        return d().entrySet().size();
    }
}
