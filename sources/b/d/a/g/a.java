package b.d.a.g;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout;

public final class a implements ViewBinding {
    @NonNull
    public final FrameLayout a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f394b;
    @NonNull
    public final CoordinatorLayout c;
    @NonNull
    public final CornerRadiusFrameLayout d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f395e;

    public a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull CoordinatorLayout coordinatorLayout, @NonNull CornerRadiusFrameLayout cornerRadiusFrameLayout, @NonNull View view) {
        this.a = frameLayout;
        this.f394b = frameLayout2;
        this.c = coordinatorLayout;
        this.d = cornerRadiusFrameLayout;
        this.f395e = view;
    }

    @NonNull
    public View getRoot() {
        return this.a;
    }
}
