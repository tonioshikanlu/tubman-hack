package e.a.a.a.y0.m.n1;

import java.util.ArrayList;

public final class a extends ArrayList<j> implements i {
    public a(int i2) {
        super(i2);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof j) {
            return super.remove((j) obj);
        }
        return false;
    }
}
