package b.a.a.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.h.o;
import com.appfoundry.previewer.model.Page;
import e.x.c.i;
import java.util.List;
import java.util.Objects;

public final class j extends b {

    /* renamed from: k  reason: collision with root package name */
    public ViewPager2 f124k;

    public final class a extends FragmentStateAdapter {
        public final /* synthetic */ j a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            i.e(fragmentActivity, "fa");
            this.a = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r0 = r0.f7136o;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.fragment.app.Fragment createFragment(int r3) {
            /*
                r2 = this;
                b.a.a.a.j r0 = r2.a
                com.appfoundry.previewer.model.Page r0 = r0.f74h
                r1 = 0
                if (r0 == 0) goto L_0x0012
                java.util.List<java.lang.String> r0 = r0.f7136o
                if (r0 == 0) goto L_0x0012
                java.lang.Object r3 = r0.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                goto L_0x0013
            L_0x0012:
                r3 = r1
            L_0x0013:
                com.appfoundry.previewer.model.Page r3 = b.a.a.n.f.n(r3)
                if (r3 == 0) goto L_0x001f
                r0 = 1
                b.a.a.a.b r3 = b.a.a.h.e.f(r3, r1, r0)
                goto L_0x0024
            L_0x001f:
                b.a.a.a.h r3 = new b.a.a.a.h
                r3.<init>()
            L_0x0024:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.j.a.createFragment(int):androidx.fragment.app.Fragment");
        }

        public int getItemCount() {
            List<String> list;
            Page page = this.a.f74h;
            if (page == null || (list = page.f7136o) == null) {
                return 0;
            }
            return list.size();
        }
    }

    public void c() {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_viewpager_toolbar_solid, viewGroup, false);
        i.d(inflate, "view");
        o.i(inflate);
        Page page = this.f74h;
        o.b(inflate, page != null ? page.a : null, page != null ? page.f7130i : null, (Boolean) null, 4);
        Page page2 = this.f74h;
        o.d(inflate, page2 != null ? page2.a : null, page2 != null ? page2.d : null, Boolean.FALSE);
        View findViewById = inflate.findViewById(R.id.fragment_viewpager);
        i.d(findViewById, "view.findViewById(R.id.fragment_viewpager)");
        this.f124k = (ViewPager2) findViewById;
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        a aVar = new a(this, (FragmentActivity) context);
        ViewPager2 viewPager2 = this.f124k;
        if (viewPager2 != null) {
            viewPager2.setAdapter(aVar);
            return inflate;
        }
        i.m("viewPager");
        throw null;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }
}
