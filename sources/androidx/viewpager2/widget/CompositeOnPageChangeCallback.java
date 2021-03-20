package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public final class CompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
    @NonNull
    private final List<ViewPager2.OnPageChangeCallback> mCallbacks;

    public CompositeOnPageChangeCallback(int i2) {
        this.mCallbacks = new ArrayList(i2);
    }

    private void throwCallbackListModifiedWhileInUse(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    public void addOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallbacks.add(onPageChangeCallback);
    }

    public void onPageScrollStateChanged(int i2) {
        try {
            for (ViewPager2.OnPageChangeCallback onPageScrollStateChanged : this.mCallbacks) {
                onPageScrollStateChanged.onPageScrollStateChanged(i2);
            }
        } catch (ConcurrentModificationException e2) {
            throwCallbackListModifiedWhileInUse(e2);
        }
    }

    public void onPageScrolled(int i2, float f, @Px int i3) {
        try {
            for (ViewPager2.OnPageChangeCallback onPageScrolled : this.mCallbacks) {
                onPageScrolled.onPageScrolled(i2, f, i3);
            }
        } catch (ConcurrentModificationException e2) {
            throwCallbackListModifiedWhileInUse(e2);
        }
    }

    public void onPageSelected(int i2) {
        try {
            for (ViewPager2.OnPageChangeCallback onPageSelected : this.mCallbacks) {
                onPageSelected.onPageSelected(i2);
            }
        } catch (ConcurrentModificationException e2) {
            throwCallbackListModifiedWhileInUse(e2);
        }
    }

    public void removeOnPageChangeCallback(ViewPager2.OnPageChangeCallback onPageChangeCallback) {
        this.mCallbacks.remove(onPageChangeCallback);
    }
}
