package b.a.a.h;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.viewpager2.widget.ViewPager2;
import b.a.a.l.a;
import e.x.c.i;
import e.x.c.s;

public final class x implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f302h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a f303i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s f304j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Handler f305k;

    public x(ViewPager2 viewPager2, a aVar, s sVar, Handler handler) {
        this.f302h = viewPager2;
        this.f303i = aVar;
        this.f304j = sVar;
        this.f305k = handler;
    }

    public void run() {
        int itemCount = this.f303i.getItemCount();
        s sVar = this.f304j;
        int i2 = sVar.f7987h;
        if (itemCount == i2) {
            sVar.f7987h = 0;
        } else {
            sVar.f7987h = i2 + 1;
        }
        ViewPager2 viewPager2 = this.f302h;
        int i3 = sVar.f7987h;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        int width = viewPager2.getWidth();
        i.e(viewPager2, "$this$setCurrentItemSlow");
        i.e(accelerateDecelerateInterpolator, "interpolator");
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (i3 - viewPager2.getCurrentItem()) * width});
        s sVar2 = new s();
        sVar2.f7987h = 0;
        ofInt.addUpdateListener(new y(viewPager2, sVar2));
        ofInt.addListener(new z(viewPager2));
        i.d(ofInt, "animator");
        ofInt.setInterpolator(accelerateDecelerateInterpolator);
        ofInt.setDuration(750);
        ofInt.start();
        this.f305k.postDelayed(this, 2500);
    }
}
