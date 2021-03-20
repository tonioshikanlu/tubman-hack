package b.l.a.c.f.e;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import b.l.a.c.c.m.v.a;
import b.l.a.c.c.p.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ql extends a {
    public static final Parcelable.Creator<ql> CREATOR = new rl();

    /* renamed from: h  reason: collision with root package name */
    public final int f3244h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f3245i;

    public ql() {
        this((List<String>) null);
    }

    public ql(int i2, List<String> list) {
        List<String> list2;
        this.f3244h = i2;
        if (list == null || list.isEmpty()) {
            list2 = Collections.emptyList();
        } else {
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.set(i3, f.a(list.get(i3)));
            }
            list2 = Collections.unmodifiableList(list);
        }
        this.f3245i = list2;
    }

    public ql(@Nullable List<String> list) {
        this.f3244h = 1;
        this.f3245i = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.f3245i.addAll(list);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int P0 = b.l.a.c.b.a.P0(parcel, 20293);
        int i3 = this.f3244h;
        b.l.a.c.b.a.I1(parcel, 1, 4);
        parcel.writeInt(i3);
        b.l.a.c.b.a.L0(parcel, 2, this.f3245i, false);
        b.l.a.c.b.a.H1(parcel, P0);
    }
}
