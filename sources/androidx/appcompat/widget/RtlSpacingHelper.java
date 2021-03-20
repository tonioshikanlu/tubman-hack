package androidx.appcompat.widget;

public class RtlSpacingHelper {
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mEnd = Integer.MIN_VALUE;
    private int mExplicitLeft = 0;
    private int mExplicitRight = 0;
    private boolean mIsRelative = false;
    private boolean mIsRtl = false;
    private int mLeft = 0;
    private int mRight = 0;
    private int mStart = Integer.MIN_VALUE;

    public int getEnd() {
        return this.mIsRtl ? this.mLeft : this.mRight;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getRight() {
        return this.mRight;
    }

    public int getStart() {
        return this.mIsRtl ? this.mRight : this.mLeft;
    }

    public void setAbsolute(int i2, int i3) {
        this.mIsRelative = false;
        if (i2 != Integer.MIN_VALUE) {
            this.mExplicitLeft = i2;
            this.mLeft = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.mExplicitRight = i3;
            this.mRight = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDirection(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.mIsRtl
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.mIsRtl = r2
            boolean r0 = r1.mIsRelative
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.mEnd
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.mExplicitLeft
        L_0x0016:
            r1.mLeft = r2
            int r2 = r1.mStart
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.mStart
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.mExplicitLeft
        L_0x0024:
            r1.mLeft = r2
            int r2 = r1.mEnd
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.mExplicitLeft
            r1.mLeft = r2
        L_0x002f:
            int r2 = r1.mExplicitRight
        L_0x0031:
            r1.mRight = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.RtlSpacingHelper.setDirection(boolean):void");
    }

    public void setRelative(int i2, int i3) {
        this.mStart = i2;
        this.mEnd = i3;
        this.mIsRelative = true;
        if (this.mIsRtl) {
            if (i3 != Integer.MIN_VALUE) {
                this.mLeft = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.mRight = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mLeft = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.mRight = i3;
        }
    }
}
