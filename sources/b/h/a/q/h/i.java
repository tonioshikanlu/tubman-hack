package b.h.a.q.h;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.h.a.q.b;
import b.h.a.q.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Deprecated
public abstract class i<T extends View, Z> extends a<Z> {

    /* renamed from: h  reason: collision with root package name */
    public final T f994h;

    /* renamed from: i  reason: collision with root package name */
    public final a f995i;

    @VisibleForTesting
    public static final class a {
        @VisibleForTesting
        @Nullable
        public static Integer d;
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public final List<g> f996b = new ArrayList();
        @Nullable
        public C0038a c;

        /* renamed from: b.h.a.q.h.i$a$a  reason: collision with other inner class name */
        public static final class C0038a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: h  reason: collision with root package name */
            public final WeakReference<a> f997h;

            public C0038a(@NonNull a aVar) {
                this.f997h = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f997h.get();
                if (aVar == null || aVar.f996b.isEmpty()) {
                    return true;
                }
                int d = aVar.d();
                int c = aVar.c();
                if (!aVar.e(d, c)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f996b).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).d(d, c);
                }
                aVar.a();
                return true;
            }
        }

        public a(@NonNull View view) {
            this.a = view;
        }

        public void a() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.c);
            }
            this.c = null;
            this.f996b.clear();
        }

        public final int b(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.a.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.a.getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }

        public final int c() {
            int paddingBottom = this.a.getPaddingBottom() + this.a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return b(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.a.getPaddingRight() + this.a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return b(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean e(int i2, int i3) {
            if (!(i2 > 0 || i2 == Integer.MIN_VALUE)) {
                return false;
            }
            return i3 > 0 || i3 == Integer.MIN_VALUE;
        }
    }

    public i(@NonNull T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f994h = t;
        this.f995i = new a(t);
    }

    @CallSuper
    public void a(@NonNull g gVar) {
        this.f995i.f996b.remove(gVar);
    }

    @Nullable
    public b f() {
        Object tag = this.f994h.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof b) {
            return (b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @CallSuper
    public void h(@NonNull g gVar) {
        a aVar = this.f995i;
        int d = aVar.d();
        int c = aVar.c();
        if (aVar.e(d, c)) {
            ((g) gVar).d(d, c);
            return;
        }
        if (!aVar.f996b.contains(gVar)) {
            aVar.f996b.add(gVar);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
            a.C0038a aVar2 = new a.C0038a(aVar);
            aVar.c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    public void i(@Nullable b bVar) {
        this.f994h.setTag(R.id.glide_custom_view_target_tag, bVar);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Target for: ");
        y.append(this.f994h);
        return y.toString();
    }
}
