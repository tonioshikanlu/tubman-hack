package b.a.a.l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.f.a.e;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import e.x.c.i;
import java.util.Iterator;
import java.util.List;

public final class a extends RecyclerView.Adapter<b> {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Container> f334b;
    public final Boolean c;
    public final Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final Float f335e;

    public a(String str, List list, Boolean bool, Boolean bool2, Float f, int i2) {
        Boolean bool3 = Boolean.FALSE;
        bool = (i2 & 4) != 0 ? bool3 : bool;
        bool2 = (i2 & 8) != 0 ? bool3 : bool2;
        f = (i2 & 16) != 0 ? Float.valueOf(100.0f) : f;
        this.a = str;
        this.f334b = list;
        this.c = bool;
        this.d = bool2;
        this.f335e = f;
    }

    public int getItemCount() {
        if (i.a(this.d, Boolean.TRUE)) {
            return 1000;
        }
        List<Container> list = this.f334b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getItemViewType(int i2) {
        boolean z;
        List<String> list;
        String z2;
        boolean z3;
        boolean z4;
        List<String> list2;
        String z5;
        if (i.a(this.d, Boolean.TRUE)) {
            List<Container> list3 = this.f334b;
            i2 %= list3 != null ? list3.size() : 1;
        }
        List<Container> list4 = this.f334b;
        Container container = list4 != null ? list4.get(i2) : null;
        boolean z6 = false;
        if (container != null) {
            i.e(container, "$this$hasVideo");
            List<Component> list5 = container.f;
            if (list5 != null) {
                i.c(list5);
                Iterator<Component> it = list5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Component next = it.next();
                    i.e(next, "$this$isVideo");
                    if (i.a(next.f7083b, "component:video") || !((list2 = next.f7087i) == null || (z5 = e.z(list2)) == null || !z5.equals("video"))) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            if (z3) {
                return 9;
            }
        }
        if (container != null) {
            i.e(container, "$this$hasLottie");
            List<Component> list6 = container.f;
            if (list6 != null) {
                i.c(list6);
                Iterator<Component> it2 = list6.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Component next2 = it2.next();
                    i.e(next2, "$this$isLottie");
                    if (i.a(next2.f7083b, "component:lottie") || !((list = next2.f7087i) == null || (z2 = e.z(list)) == null || !z2.equals("lottie"))) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z6 = true;
                        break;
                    }
                }
            }
            if (z6) {
                return 15;
            }
        }
        if (container != null && b.a.a.h.e.z(container)) {
            return 17;
        }
        if (container == null || !b.a.a.h.e.F(container)) {
            return 1;
        }
        return 5;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        i.e(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        b bVar = (b) viewHolder;
        i.e(bVar, "holder");
        if (i.a(this.d, Boolean.TRUE)) {
            List<Container> list = this.f334b;
            i2 %= list != null ? list.size() : 1;
        }
        if (getItemViewType(i2) == 9) {
            bVar.setIsRecyclable(false);
        }
        List<Container> list2 = this.f334b;
        Container container = list2 != null ? list2.get(i2) : null;
        String str = this.a;
        Float f = this.f335e;
        if (container != null && !b.a.a.h.e.F(container)) {
            bVar.a.removeAllViews();
        }
        if (container != null) {
            View view = bVar.itemView;
            i.d(view, "itemView");
            Context context = view.getContext();
            i.d(context, "itemView.context");
            b.a.a.h.e.g(container, context, str, bVar.a, bVar.f336b, f != null ? f.floatValue() : 100.0f);
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflater;
        int i3;
        i.e(viewGroup, "parent");
        if (i2 == 5) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.viewholder_container_slider;
        } else if (i2 != 17) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.viewholder_container_default;
        } else {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.viewholder_container_carousel;
        }
        View inflate = layoutInflater.inflate(i3, viewGroup, false);
        i.d(inflate, "view");
        return new b(inflate, this.c);
    }
}
