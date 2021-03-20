package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ViewBoundsCheck {
    public static final int CVE_PVE_POS = 12;
    public static final int CVE_PVS_POS = 8;
    public static final int CVS_PVE_POS = 4;
    public static final int CVS_PVS_POS = 0;
    public static final int EQ = 2;
    public static final int FLAG_CVE_EQ_PVE = 8192;
    public static final int FLAG_CVE_EQ_PVS = 512;
    public static final int FLAG_CVE_GT_PVE = 4096;
    public static final int FLAG_CVE_GT_PVS = 256;
    public static final int FLAG_CVE_LT_PVE = 16384;
    public static final int FLAG_CVE_LT_PVS = 1024;
    public static final int FLAG_CVS_EQ_PVE = 32;
    public static final int FLAG_CVS_EQ_PVS = 2;
    public static final int FLAG_CVS_GT_PVE = 16;
    public static final int FLAG_CVS_GT_PVS = 1;
    public static final int FLAG_CVS_LT_PVE = 64;
    public static final int FLAG_CVS_LT_PVS = 4;
    public static final int GT = 1;
    public static final int LT = 4;
    public static final int MASK = 7;
    public BoundFlags mBoundFlags = new BoundFlags();
    public final Callback mCallback;

    public static class BoundFlags {
        public int mBoundFlags = 0;
        public int mChildEnd;
        public int mChildStart;
        public int mRvEnd;
        public int mRvStart;

        public void addFlags(int i2) {
            this.mBoundFlags = i2 | this.mBoundFlags;
        }

        public boolean boundsMatch() {
            int i2 = this.mBoundFlags;
            if ((i2 & 7) != 0 && (i2 & (compare(this.mChildStart, this.mRvStart) << 0)) == 0) {
                return false;
            }
            int i3 = this.mBoundFlags;
            if ((i3 & 112) != 0 && (i3 & (compare(this.mChildStart, this.mRvEnd) << 4)) == 0) {
                return false;
            }
            int i4 = this.mBoundFlags;
            if ((i4 & 1792) != 0 && (i4 & (compare(this.mChildEnd, this.mRvStart) << 8)) == 0) {
                return false;
            }
            int i5 = this.mBoundFlags;
            return (i5 & 28672) == 0 || (i5 & (compare(this.mChildEnd, this.mRvEnd) << 12)) != 0;
        }

        public int compare(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        public void resetFlags() {
            this.mBoundFlags = 0;
        }

        public void setBounds(int i2, int i3, int i4, int i5) {
            this.mRvStart = i2;
            this.mRvEnd = i3;
            this.mChildStart = i4;
            this.mChildEnd = i5;
        }
    }

    public interface Callback {
        View getChildAt(int i2);

        int getChildEnd(View view);

        int getChildStart(View view);

        int getParentEnd();

        int getParentStart();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(Callback callback) {
        this.mCallback = callback;
    }

    public View findOneViewWithinBoundFlags(int i2, int i3, int i4, int i5) {
        int parentStart = this.mCallback.getParentStart();
        int parentEnd = this.mCallback.getParentEnd();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View childAt = this.mCallback.getChildAt(i2);
            this.mBoundFlags.setBounds(parentStart, parentEnd, this.mCallback.getChildStart(childAt), this.mCallback.getChildEnd(childAt));
            if (i4 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i4);
                if (this.mBoundFlags.boundsMatch()) {
                    return childAt;
                }
            }
            if (i5 != 0) {
                this.mBoundFlags.resetFlags();
                this.mBoundFlags.addFlags(i5);
                if (this.mBoundFlags.boundsMatch()) {
                    view = childAt;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public boolean isViewWithinBoundFlags(View view, int i2) {
        this.mBoundFlags.setBounds(this.mCallback.getParentStart(), this.mCallback.getParentEnd(), this.mCallback.getChildStart(view), this.mCallback.getChildEnd(view));
        if (i2 == 0) {
            return false;
        }
        this.mBoundFlags.resetFlags();
        this.mBoundFlags.addFlags(i2);
        return this.mBoundFlags.boundsMatch();
    }
}
