package b.a.a.h;

import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import e.x.c.i;
import java.util.List;
import java.util.Objects;

public final class h implements View.OnLayoutChangeListener {
    public final /* synthetic */ FrameLayout a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Toolbar f268b;
    public final /* synthetic */ Container c;

    public h(FrameLayout frameLayout, Toolbar toolbar, Container container) {
        this.a = frameLayout;
        this.f268b = toolbar;
        this.c = container;
    }

    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        List<Component> list;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        if (i.a(view.getTag(R.id.notch_handled), Boolean.FALSE)) {
            BravoApp.b bVar = BravoApp.Q;
            if (BravoApp.A) {
                view.setTag(R.id.notch_handled, Boolean.TRUE);
                if (Build.VERSION.SDK_INT >= 28) {
                    Context context = this.a.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    Window window = ((FragmentActivity) context).getWindow();
                    int safeInsetTop = (window == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
                    if (safeInsetTop > 0) {
                        Toolbar toolbar = this.f268b;
                        i.e(toolbar, "$this$addNotchHeight");
                        toolbar.getLayoutParams().height += safeInsetTop;
                        FrameLayout frameLayout = this.a;
                        Container container = this.c;
                        int size = (container == null || (list = container.f) == null) ? 0 : list.size();
                        i.e(frameLayout, "$this$addPaddingToChildren");
                        int childCount = frameLayout.getChildCount();
                        if (size <= childCount) {
                            int i10 = size;
                            while (true) {
                                View childAt = frameLayout.getChildAt(i10);
                                if (childAt != null) {
                                    if (i10 <= size + -1 && i.a(childAt.getTag(R.id.component_type), "component:color")) {
                                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                        ((FrameLayout.LayoutParams) layoutParams).topMargin += safeInsetTop;
                                    } else {
                                        childAt.setPadding(childAt.getPaddingLeft(), safeInsetTop, childAt.getPaddingRight(), childAt.getPaddingBottom());
                                    }
                                }
                                if (i10 != childCount) {
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
