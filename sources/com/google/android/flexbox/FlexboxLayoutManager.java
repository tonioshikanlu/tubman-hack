package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import b.l.a.b.d;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements b.l.a.b.a, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final Rect y = new Rect();
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f7201b;
    public int c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7202e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public List<b.l.a.b.c> f7203g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final b.l.a.b.d f7204h = new b.l.a.b.d(this);

    /* renamed from: i  reason: collision with root package name */
    public RecyclerView.Recycler f7205i;

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView.State f7206j;

    /* renamed from: k  reason: collision with root package name */
    public d f7207k;

    /* renamed from: l  reason: collision with root package name */
    public b f7208l = new b((a) null);

    /* renamed from: m  reason: collision with root package name */
    public OrientationHelper f7209m;

    /* renamed from: n  reason: collision with root package name */
    public OrientationHelper f7210n;

    /* renamed from: o  reason: collision with root package name */
    public e f7211o;

    /* renamed from: p  reason: collision with root package name */
    public int f7212p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f7213q = Integer.MIN_VALUE;
    public int r = Integer.MIN_VALUE;
    public int s = Integer.MIN_VALUE;
    public SparseArray<View> t = new SparseArray<>();
    public final Context u;
    public View v;
    public int w = -1;
    public d.a x = new d.a();

    public class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f7214b;
        public int c;
        public int d = 0;

        /* renamed from: e  reason: collision with root package name */
        public boolean f7215e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f7216g;

        public b(a aVar) {
        }

        public static void a(b bVar) {
            int i2;
            FlexboxLayoutManager flexboxLayoutManager;
            if (!FlexboxLayoutManager.this.r()) {
                flexboxLayoutManager = FlexboxLayoutManager.this;
                if (flexboxLayoutManager.f7202e) {
                    if (!bVar.f7215e) {
                        i2 = flexboxLayoutManager.getWidth() - FlexboxLayoutManager.this.f7209m.getStartAfterPadding();
                        bVar.c = i2;
                    }
                    i2 = flexboxLayoutManager.f7209m.getEndAfterPadding();
                    bVar.c = i2;
                }
            }
            if (bVar.f7215e) {
                flexboxLayoutManager = FlexboxLayoutManager.this;
                i2 = flexboxLayoutManager.f7209m.getEndAfterPadding();
                bVar.c = i2;
            }
            i2 = FlexboxLayoutManager.this.f7209m.getStartAfterPadding();
            bVar.c = i2;
        }

        public static void b(b bVar) {
            FlexboxLayoutManager flexboxLayoutManager;
            int i2;
            FlexboxLayoutManager flexboxLayoutManager2;
            int i3;
            bVar.a = -1;
            bVar.f7214b = -1;
            bVar.c = Integer.MIN_VALUE;
            boolean z = false;
            bVar.f = false;
            bVar.f7216g = false;
            if (!FlexboxLayoutManager.this.r() ? !((i2 = flexboxLayoutManager.f7201b) != 0 ? i2 != 2 : (flexboxLayoutManager = FlexboxLayoutManager.this).a != 3) : !((i3 = flexboxLayoutManager2.f7201b) != 0 ? i3 != 2 : (flexboxLayoutManager2 = FlexboxLayoutManager.this).a != 1)) {
                z = true;
            }
            bVar.f7215e = z;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("AnchorInfo{mPosition=");
            y.append(this.a);
            y.append(", mFlexLinePosition=");
            y.append(this.f7214b);
            y.append(", mCoordinate=");
            y.append(this.c);
            y.append(", mPerpendicularCoordinate=");
            y.append(this.d);
            y.append(", mLayoutFromEnd=");
            y.append(this.f7215e);
            y.append(", mValid=");
            y.append(this.f);
            y.append(", mAssignedFromSavedState=");
            y.append(this.f7216g);
            y.append('}');
            return y.toString();
        }
    }

    public static class c extends RecyclerView.LayoutParams implements b.l.a.b.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public float f7218h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f7219i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public int f7220j = -1;

        /* renamed from: k  reason: collision with root package name */
        public float f7221k = -1.0f;

        /* renamed from: l  reason: collision with root package name */
        public int f7222l;

        /* renamed from: m  reason: collision with root package name */
        public int f7223m;

        /* renamed from: n  reason: collision with root package name */
        public int f7224n = ViewCompat.MEASURED_SIZE_MASK;

        /* renamed from: o  reason: collision with root package name */
        public int f7225o = ViewCompat.MEASURED_SIZE_MASK;

        /* renamed from: p  reason: collision with root package name */
        public boolean f7226p;

        public static class a implements Parcelable.Creator<c> {
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public Object[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(Parcel parcel) {
            super(-2, -2);
            this.f7218h = parcel.readFloat();
            this.f7219i = parcel.readFloat();
            this.f7220j = parcel.readInt();
            this.f7221k = parcel.readFloat();
            this.f7222l = parcel.readInt();
            this.f7223m = parcel.readInt();
            this.f7224n = parcel.readInt();
            this.f7225o = parcel.readInt();
            this.f7226p = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public int C() {
            return this.rightMargin;
        }

        public int D() {
            return this.f7223m;
        }

        public int G() {
            return this.f7222l;
        }

        public boolean I() {
            return this.f7226p;
        }

        public int J() {
            return this.f7225o;
        }

        public void K(int i2) {
            this.f7222l = i2;
        }

        public int L() {
            return this.bottomMargin;
        }

        public int N() {
            return this.leftMargin;
        }

        public int T() {
            return this.f7224n;
        }

        public int U() {
            return this.topMargin;
        }

        public int describeContents() {
            return 0;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public void l(int i2) {
            this.f7223m = i2;
        }

        public float n() {
            return this.f7218h;
        }

        public float p() {
            return this.f7221k;
        }

        public int s() {
            return this.f7220j;
        }

        public float v() {
            return this.f7219i;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeFloat(this.f7218h);
            parcel.writeFloat(this.f7219i);
            parcel.writeInt(this.f7220j);
            parcel.writeFloat(this.f7221k);
            parcel.writeInt(this.f7222l);
            parcel.writeInt(this.f7223m);
            parcel.writeInt(this.f7224n);
            parcel.writeInt(this.f7225o);
            parcel.writeByte(this.f7226p ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }
    }

    public static class d {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7227b;
        public int c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f7228e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f7229g;

        /* renamed from: h  reason: collision with root package name */
        public int f7230h = 1;

        /* renamed from: i  reason: collision with root package name */
        public int f7231i = 1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f7232j;

        public d(a aVar) {
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("LayoutState{mAvailable=");
            y.append(this.a);
            y.append(", mFlexLinePosition=");
            y.append(this.c);
            y.append(", mPosition=");
            y.append(this.d);
            y.append(", mOffset=");
            y.append(this.f7228e);
            y.append(", mScrollingOffset=");
            y.append(this.f);
            y.append(", mLastScrollDelta=");
            y.append(this.f7229g);
            y.append(", mItemDirection=");
            y.append(this.f7230h);
            y.append(", mLayoutDirection=");
            y.append(this.f7231i);
            y.append('}');
            return y.toString();
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public int f7233h;

        /* renamed from: i  reason: collision with root package name */
        public int f7234i;

        public static class a implements Parcelable.Creator<e> {
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel, (a) null);
            }

            public Object[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        public e(Parcel parcel, a aVar) {
            this.f7233h = parcel.readInt();
            this.f7234i = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("SavedState{mAnchorPosition=");
            y.append(this.f7233h);
            y.append(", mAnchorOffset=");
            y.append(this.f7234i);
            y.append('}');
            return y.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f7233h);
            parcel.writeInt(this.f7234i);
        }

        public e(e eVar, a aVar) {
            this.f7233h = eVar.f7233h;
            this.f7234i = eVar.f7234i;
        }
    }

    public FlexboxLayoutManager(Context context) {
        v(0);
        w(1);
        u(4);
        setAutoMeasureEnabled(true);
        this.u = context;
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        int i4;
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i2, i3);
        int i5 = properties.orientation;
        if (i5 != 0) {
            i4 = i5 == 1 ? properties.reverseLayout ? 3 : 2 : i4;
            w(1);
            u(4);
            setAutoMeasureEnabled(true);
            this.u = context;
        } else if (properties.reverseLayout) {
            v(1);
            w(1);
            u(4);
            setAutoMeasureEnabled(true);
            this.u = context;
        } else {
            i4 = 0;
        }
        v(i4);
        w(1);
        u(4);
        setAutoMeasureEnabled(true);
        this.u = context;
    }

    public static boolean isMeasurementUpToDate(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    private boolean shouldMeasureChild(View view, int i2, int i3, RecyclerView.LayoutParams layoutParams) {
        return view.isLayoutRequested() || !isMeasurementCacheEnabled() || !isMeasurementUpToDate(view.getWidth(), i2, layoutParams.width) || !isMeasurementUpToDate(view.getHeight(), i3, layoutParams.height);
    }

    public final void a() {
        this.f7203g.clear();
        b.b(this.f7208l);
        this.f7208l.d = 0;
    }

    public final void b() {
        OrientationHelper orientationHelper;
        if (this.f7209m == null) {
            if (!r() ? this.f7201b != 0 : this.f7201b == 0) {
                this.f7209m = OrientationHelper.createHorizontalHelper(this);
                orientationHelper = OrientationHelper.createVerticalHelper(this);
            } else {
                this.f7209m = OrientationHelper.createVerticalHelper(this);
                orientationHelper = OrientationHelper.createHorizontalHelper(this);
            }
            this.f7210n = orientationHelper;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r10 = r2.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(androidx.recyclerview.widget.RecyclerView.Recycler r30, androidx.recyclerview.widget.RecyclerView.State r31, com.google.android.flexbox.FlexboxLayoutManager.d r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r32
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x0016
            int r5 = r2.a
            if (r5 >= 0) goto L_0x0013
            int r3 = r3 + r5
            r2.f = r3
        L_0x0013:
            r0.s(r1, r2)
        L_0x0016:
            int r3 = r2.a
            boolean r5 = r29.r()
            r7 = r3
            r8 = 0
        L_0x001e:
            if (r7 > 0) goto L_0x0026
            com.google.android.flexbox.FlexboxLayoutManager$d r9 = r0.f7207k
            boolean r9 = r9.f7227b
            if (r9 == 0) goto L_0x02fd
        L_0x0026:
            java.util.List<b.l.a.b.c> r9 = r0.f7203g
            int r10 = r2.d
            if (r10 < 0) goto L_0x003e
            int r12 = r31.getItemCount()
            if (r10 >= r12) goto L_0x003e
            int r10 = r2.c
            if (r10 < 0) goto L_0x003e
            int r9 = r9.size()
            if (r10 >= r9) goto L_0x003e
            r9 = 1
            goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            if (r9 == 0) goto L_0x02fd
            java.util.List<b.l.a.b.c> r9 = r0.f7203g
            int r10 = r2.c
            java.lang.Object r9 = r9.get(r10)
            b.l.a.b.c r9 = (b.l.a.b.c) r9
            int r10 = r9.f2567k
            r2.d = r10
            boolean r10 = r29.r()
            r12 = 0
            r13 = -1
            if (r10 == 0) goto L_0x016f
            int r10 = r29.getPaddingLeft()
            int r14 = r29.getPaddingRight()
            int r15 = r29.getWidth()
            int r6 = r2.f7228e
            int r4 = r2.f7231i
            if (r4 != r13) goto L_0x006c
            int r4 = r9.c
            int r6 = r6 - r4
        L_0x006c:
            int r4 = r2.d
            float r10 = (float) r10
            int r15 = r15 - r14
            float r13 = (float) r15
            com.google.android.flexbox.FlexboxLayoutManager$b r14 = r0.f7208l
            int r14 = r14.d
            float r14 = (float) r14
            float r10 = r10 - r14
            float r13 = r13 - r14
            float r19 = java.lang.Math.max(r12, r12)
            int r15 = r9.d
            r14 = r4
            r12 = 0
        L_0x0080:
            int r11 = r4 + r15
            if (r14 >= r11) goto L_0x015c
            android.view.View r11 = r0.m(r14)
            if (r11 != 0) goto L_0x0094
            r22 = r3
            r21 = r4
            r25 = r14
            r26 = r15
            goto L_0x0152
        L_0x0094:
            r21 = r4
            int r4 = r2.f7231i
            r16 = r15
            r15 = 1
            if (r4 != r15) goto L_0x00a6
            android.graphics.Rect r4 = y
            r0.calculateItemDecorationsForChild(r11, r4)
            r0.addView(r11)
            goto L_0x00b0
        L_0x00a6:
            android.graphics.Rect r4 = y
            r0.calculateItemDecorationsForChild(r11, r4)
            r0.addView(r11, r12)
            int r12 = r12 + 1
        L_0x00b0:
            r4 = r12
            b.l.a.b.d r12 = r0.f7204h
            long[] r15 = r12.d
            r22 = r3
            r23 = r4
            r3 = r15[r14]
            int r15 = (int) r3
            int r3 = r12.j(r3)
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = (com.google.android.flexbox.FlexboxLayoutManager.c) r4
            boolean r12 = r0.shouldMeasureChild(r11, r15, r3, r4)
            if (r12 == 0) goto L_0x00cf
            r11.measure(r15, r3)
        L_0x00cf:
            int r3 = r4.leftMargin
            int r12 = r0.getLeftDecorationWidth(r11)
            int r12 = r12 + r3
            float r3 = (float) r12
            float r10 = r10 + r3
            int r3 = r4.rightMargin
            int r12 = r0.getRightDecorationWidth(r11)
            int r12 = r12 + r3
            float r3 = (float) r12
            float r3 = r13 - r3
            int r12 = r0.getTopDecorationHeight(r11)
            int r17 = r12 + r6
            boolean r12 = r0.f7202e
            if (r12 == 0) goto L_0x0106
            b.l.a.b.d r12 = r0.f7204h
            int r13 = java.lang.Math.round(r3)
            int r15 = r11.getMeasuredWidth()
            int r13 = r13 - r15
            int r15 = java.lang.Math.round(r3)
            int r18 = r11.getMeasuredHeight()
            int r18 = r18 + r17
            r24 = r18
            r18 = r15
            goto L_0x011e
        L_0x0106:
            b.l.a.b.d r12 = r0.f7204h
            int r13 = java.lang.Math.round(r10)
            int r15 = java.lang.Math.round(r10)
            int r18 = r11.getMeasuredWidth()
            int r18 = r18 + r15
            int r15 = r11.getMeasuredHeight()
            int r15 = r15 + r17
            r24 = r15
        L_0x011e:
            r15 = r13
            r13 = r11
            r25 = r14
            r14 = r9
            r26 = r16
            r16 = r17
            r17 = r18
            r18 = r24
            r12.r(r13, r14, r15, r16, r17, r18)
            int r12 = r11.getMeasuredWidth()
            int r13 = r4.rightMargin
            int r12 = r12 + r13
            int r13 = r0.getRightDecorationWidth(r11)
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 + r19
            float r12 = r12 + r10
            int r10 = r11.getMeasuredWidth()
            int r4 = r4.leftMargin
            int r10 = r10 + r4
            int r4 = r0.getLeftDecorationWidth(r11)
            int r4 = r4 + r10
            float r4 = (float) r4
            float r4 = r4 + r19
            float r3 = r3 - r4
            r13 = r3
            r10 = r12
            r12 = r23
        L_0x0152:
            int r14 = r25 + 1
            r4 = r21
            r3 = r22
            r15 = r26
            goto L_0x0080
        L_0x015c:
            r22 = r3
            int r3 = r2.c
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f7207k
            int r4 = r4.f7231i
            int r3 = r3 + r4
            r2.c = r3
            int r3 = r9.c
            r21 = r7
            r23 = r8
            goto L_0x02d4
        L_0x016f:
            r22 = r3
            int r3 = r29.getPaddingTop()
            int r4 = r29.getPaddingBottom()
            int r6 = r29.getHeight()
            int r10 = r2.f7228e
            int r11 = r2.f7231i
            if (r11 != r13) goto L_0x018b
            int r11 = r9.c
            int r13 = r10 - r11
            int r10 = r10 + r11
            r11 = r10
            r10 = r13
            goto L_0x018c
        L_0x018b:
            r11 = r10
        L_0x018c:
            int r15 = r2.d
            float r3 = (float) r3
            int r6 = r6 - r4
            float r4 = (float) r6
            com.google.android.flexbox.FlexboxLayoutManager$b r6 = r0.f7208l
            int r6 = r6.d
            float r6 = (float) r6
            float r3 = r3 - r6
            float r4 = r4 - r6
            float r6 = java.lang.Math.max(r12, r12)
            int r14 = r9.d
            r13 = r15
            r12 = 0
        L_0x01a0:
            int r1 = r15 + r14
            if (r13 >= r1) goto L_0x02c5
            android.view.View r1 = r0.m(r13)
            if (r1 != 0) goto L_0x01b8
            r21 = r7
            r23 = r8
            r26 = r13
            r27 = r14
            r20 = r15
            r28 = 1
            goto L_0x02b9
        L_0x01b8:
            r16 = r14
            b.l.a.b.d r14 = r0.f7204h
            r17 = r15
            long[] r15 = r14.d
            r21 = r7
            r23 = r8
            r7 = r15[r13]
            int r15 = (int) r7
            int r7 = r14.j(r7)
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
            com.google.android.flexbox.FlexboxLayoutManager$c r8 = (com.google.android.flexbox.FlexboxLayoutManager.c) r8
            boolean r14 = r0.shouldMeasureChild(r1, r15, r7, r8)
            if (r14 == 0) goto L_0x01da
            r1.measure(r15, r7)
        L_0x01da:
            int r7 = r8.topMargin
            int r14 = r0.getTopDecorationHeight(r1)
            int r14 = r14 + r7
            float r7 = (float) r14
            float r3 = r3 + r7
            int r7 = r8.rightMargin
            int r14 = r0.getBottomDecorationHeight(r1)
            int r14 = r14 + r7
            float r7 = (float) r14
            float r4 = r4 - r7
            int r7 = r2.f7231i
            r15 = 1
            if (r7 != r15) goto L_0x01fa
            android.graphics.Rect r7 = y
            r0.calculateItemDecorationsForChild(r1, r7)
            r0.addView(r1)
            goto L_0x0204
        L_0x01fa:
            android.graphics.Rect r7 = y
            r0.calculateItemDecorationsForChild(r1, r7)
            r0.addView(r1, r12)
            int r12 = r12 + 1
        L_0x0204:
            r7 = r12
            int r12 = r0.getLeftDecorationWidth(r1)
            int r12 = r12 + r10
            int r14 = r0.getRightDecorationWidth(r1)
            int r14 = r11 - r14
            boolean r15 = r0.f7202e
            if (r15 == 0) goto L_0x024a
            boolean r12 = r0.f
            if (r12 == 0) goto L_0x022f
            b.l.a.b.d r12 = r0.f7204h
            int r18 = r1.getMeasuredWidth()
            int r18 = r14 - r18
            int r19 = java.lang.Math.round(r4)
            int r24 = r1.getMeasuredHeight()
            int r19 = r19 - r24
            int r24 = java.lang.Math.round(r4)
            goto L_0x0245
        L_0x022f:
            b.l.a.b.d r12 = r0.f7204h
            int r18 = r1.getMeasuredWidth()
            int r18 = r14 - r18
            int r19 = java.lang.Math.round(r3)
            int r24 = java.lang.Math.round(r3)
            int r25 = r1.getMeasuredHeight()
            int r24 = r25 + r24
        L_0x0245:
            r25 = r24
            r24 = r14
            goto L_0x0284
        L_0x024a:
            boolean r14 = r0.f
            if (r14 == 0) goto L_0x0265
            b.l.a.b.d r14 = r0.f7204h
            int r18 = java.lang.Math.round(r4)
            int r19 = r1.getMeasuredHeight()
            int r18 = r18 - r19
            int r19 = r1.getMeasuredWidth()
            int r19 = r19 + r12
            int r24 = java.lang.Math.round(r4)
            goto L_0x027b
        L_0x0265:
            b.l.a.b.d r14 = r0.f7204h
            int r18 = java.lang.Math.round(r3)
            int r19 = r1.getMeasuredWidth()
            int r19 = r19 + r12
            int r24 = java.lang.Math.round(r3)
            int r25 = r1.getMeasuredHeight()
            int r24 = r25 + r24
        L_0x027b:
            r25 = r24
            r24 = r19
            r19 = r18
            r18 = r12
            r12 = r14
        L_0x0284:
            r26 = r13
            r13 = r1
            r27 = r16
            r14 = r9
            r20 = r17
            r28 = 1
            r16 = r18
            r17 = r19
            r18 = r24
            r19 = r25
            r12.s(r13, r14, r15, r16, r17, r18, r19)
            int r12 = r1.getMeasuredHeight()
            int r13 = r8.topMargin
            int r12 = r12 + r13
            int r13 = r0.getBottomDecorationHeight(r1)
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 + r6
            float r12 = r12 + r3
            int r3 = r1.getMeasuredHeight()
            int r8 = r8.bottomMargin
            int r3 = r3 + r8
            int r1 = r0.getTopDecorationHeight(r1)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r6
            float r4 = r4 - r1
            r3 = r12
            r12 = r7
        L_0x02b9:
            int r13 = r26 + 1
            r15 = r20
            r7 = r21
            r8 = r23
            r14 = r27
            goto L_0x01a0
        L_0x02c5:
            r21 = r7
            r23 = r8
            int r1 = r2.c
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f7207k
            int r3 = r3.f7231i
            int r1 = r1 + r3
            r2.c = r1
            int r3 = r9.c
        L_0x02d4:
            int r8 = r23 + r3
            if (r5 != 0) goto L_0x02e7
            boolean r1 = r0.f7202e
            if (r1 == 0) goto L_0x02e7
            int r1 = r2.f7228e
            int r3 = r9.c
            int r4 = r2.f7231i
            int r3 = r3 * r4
            int r1 = r1 - r3
            r2.f7228e = r1
            goto L_0x02f1
        L_0x02e7:
            int r1 = r2.f7228e
            int r3 = r9.c
            int r4 = r2.f7231i
            int r3 = r3 * r4
            int r3 = r3 + r1
            r2.f7228e = r3
        L_0x02f1:
            int r1 = r9.c
            int r7 = r21 - r1
            r1 = r30
            r3 = r22
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x001e
        L_0x02fd:
            r22 = r3
            r23 = r8
            int r1 = r2.a
            int r1 = r1 - r23
            r2.a = r1
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x031b
            int r3 = r3 + r23
            r2.f = r3
            if (r1 >= 0) goto L_0x0316
            int r3 = r3 + r1
            r2.f = r3
        L_0x0316:
            r1 = r30
            r0.s(r1, r2)
        L_0x031b:
            int r1 = r2.a
            int r3 = r22 - r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    public boolean canScrollHorizontally() {
        if (this.f7201b == 0) {
            return r();
        }
        if (r()) {
            int width = getWidth();
            View view = this.v;
            return width > (view != null ? view.getWidth() : 0);
        }
    }

    public boolean canScrollVertically() {
        if (this.f7201b == 0) {
            return !r();
        }
        if (r()) {
            return true;
        }
        int height = getHeight();
        View view = this.v;
        return height > (view != null ? view.getHeight() : 0);
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        b();
        View d2 = d(itemCount);
        View f2 = f(itemCount);
        if (state.getItemCount() == 0 || d2 == null || f2 == null) {
            return 0;
        }
        return Math.min(this.f7209m.getTotalSpace(), this.f7209m.getDecoratedEnd(f2) - this.f7209m.getDecoratedStart(d2));
    }

    public final int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View d2 = d(itemCount);
        View f2 = f(itemCount);
        if (!(state.getItemCount() == 0 || d2 == null || f2 == null)) {
            int position = getPosition(d2);
            int position2 = getPosition(f2);
            int abs = Math.abs(this.f7209m.getDecoratedEnd(f2) - this.f7209m.getDecoratedStart(d2));
            int[] iArr = this.f7204h.c;
            int i2 = iArr[position];
            if (!(i2 == 0 || i2 == -1)) {
                return Math.round((((float) i2) * (((float) abs) / ((float) ((iArr[position2] - i2) + 1)))) + ((float) (this.f7209m.getStartAfterPadding() - this.f7209m.getDecoratedStart(d2))));
            }
        }
        return 0;
    }

    public final int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View d2 = d(itemCount);
        View f2 = f(itemCount);
        if (state.getItemCount() == 0 || d2 == null || f2 == null) {
            return 0;
        }
        View h2 = h(0, getChildCount(), false);
        return (int) ((((float) Math.abs(this.f7209m.getDecoratedEnd(f2) - this.f7209m.getDecoratedStart(d2))) / ((float) ((findLastVisibleItemPosition() - (h2 == null ? -1 : getPosition(h2))) + 1))) * ((float) state.getItemCount()));
    }

    public PointF computeScrollVectorForPosition(int i2) {
        if (getChildCount() == 0) {
            return null;
        }
        int i3 = i2 < getPosition(getChildAt(0)) ? -1 : 1;
        return r() ? new PointF(0.0f, (float) i3) : new PointF((float) i3, 0.0f);
    }

    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    public final View d(int i2) {
        int i3;
        View i4 = i(0, getChildCount(), i2);
        if (i4 == null || (i3 = this.f7204h.c[getPosition(i4)]) == -1) {
            return null;
        }
        return e(i4, this.f7203g.get(i3));
    }

    public final View e(View view, b.l.a.b.c cVar) {
        boolean r2 = r();
        int i2 = cVar.d;
        for (int i3 = 1; i3 < i2; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f7202e || r2) {
                    if (this.f7209m.getDecoratedStart(view) <= this.f7209m.getDecoratedStart(childAt)) {
                    }
                } else if (this.f7209m.getDecoratedEnd(view) >= this.f7209m.getDecoratedEnd(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    public final View f(int i2) {
        View i3 = i(getChildCount() - 1, -1, i2);
        if (i3 == null) {
            return null;
        }
        return g(i3, this.f7203g.get(this.f7204h.c[getPosition(i3)]));
    }

    public int findLastVisibleItemPosition() {
        View h2 = h(getChildCount() - 1, -1, false);
        if (h2 == null) {
            return -1;
        }
        return getPosition(h2);
    }

    public final int fixLayoutEndGap(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i3;
        int endAfterPadding;
        if (!r() && this.f7202e) {
            int startAfterPadding = i2 - this.f7209m.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            i3 = p(startAfterPadding, recycler, state);
        } else {
            int endAfterPadding2 = this.f7209m.getEndAfterPadding() - i2;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            i3 = -p(-endAfterPadding2, recycler, state);
        }
        int i4 = i2 + i3;
        if (!z || (endAfterPadding = this.f7209m.getEndAfterPadding() - i4) <= 0) {
            return i3;
        }
        this.f7209m.offsetChildren(endAfterPadding);
        return endAfterPadding + i3;
    }

    public final int fixLayoutStartGap(int i2, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i3;
        int startAfterPadding;
        if (r() || !this.f7202e) {
            int startAfterPadding2 = i2 - this.f7209m.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            i3 = -p(startAfterPadding2, recycler, state);
        } else {
            int endAfterPadding = this.f7209m.getEndAfterPadding() - i2;
            if (endAfterPadding <= 0) {
                return 0;
            }
            i3 = p(-endAfterPadding, recycler, state);
        }
        int i4 = i2 + i3;
        if (!z || (startAfterPadding = i4 - this.f7209m.getStartAfterPadding()) <= 0) {
            return i3;
        }
        this.f7209m.offsetChildren(-startAfterPadding);
        return i3 - startAfterPadding;
    }

    public final View g(View view, b.l.a.b.c cVar) {
        boolean r2 = r();
        int childCount = (getChildCount() - cVar.d) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f7202e || r2) {
                    if (this.f7209m.getDecoratedEnd(view) >= this.f7209m.getDecoratedEnd(childAt)) {
                    }
                } else if (this.f7209m.getDecoratedStart(view) <= this.f7209m.getDecoratedStart(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public final View h(int i2, int i3, boolean z) {
        int i4 = i3;
        int i5 = i2;
        int i6 = i4 > i5 ? 1 : -1;
        while (i5 != i4) {
            View childAt = getChildAt(i5);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            boolean z2 = false;
            boolean z3 = paddingLeft <= decoratedLeft && width >= decoratedRight;
            boolean z4 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z5 = paddingTop <= decoratedTop && height >= decoratedBottom;
            boolean z6 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (!z ? !(!z4 || !z6) : !(!z3 || !z5)) {
                z2 = true;
            }
            if (z2) {
                return childAt;
            }
            i5 += i6;
        }
        return null;
    }

    public final View i(int i2, int i3, int i4) {
        b();
        View view = null;
        if (this.f7207k == null) {
            this.f7207k = new d((a) null);
        }
        int startAfterPadding = this.f7209m.getStartAfterPadding();
        int endAfterPadding = this.f7209m.getEndAfterPadding();
        int i5 = i3 > i2 ? 1 : -1;
        View view2 = null;
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            if (position >= 0 && position < i4) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f7209m.getDecoratedStart(childAt) >= startAfterPadding && this.f7209m.getDecoratedEnd(childAt) <= endAfterPadding) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    public int j(int i2, int i3, int i4) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i3, i4, canScrollVertically());
    }

    public int k(int i2, int i3, int i4) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i3, i4, canScrollHorizontally());
    }

    public int l(View view) {
        int i2;
        int i3;
        if (r()) {
            i3 = getTopDecorationHeight(view);
            i2 = getBottomDecorationHeight(view);
        } else {
            i3 = getLeftDecorationWidth(view);
            i2 = getRightDecorationWidth(view);
        }
        return i2 + i3;
    }

    public View m(int i2) {
        View view = this.t.get(i2);
        return view != null ? view : this.f7205i.getViewForPosition(i2);
    }

    public int n() {
        return this.f7206j.getItemCount();
    }

    public int o() {
        if (this.f7203g.size() == 0) {
            return 0;
        }
        int i2 = Integer.MIN_VALUE;
        int size = this.f7203g.size();
        for (int i3 = 0; i3 < size; i3++) {
            i2 = Math.max(i2, this.f7203g.get(i3).a);
        }
        return i2;
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.v = (View) recyclerView.getParent();
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i2, int i3) {
        super.onItemsAdded(recyclerView, i2, i3);
        x(i2);
    }

    public void onItemsMoved(@NonNull RecyclerView recyclerView, int i2, int i3, int i4) {
        super.onItemsMoved(recyclerView, i2, i3, i4);
        x(Math.min(i2, i3));
    }

    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i2, int i3) {
        super.onItemsRemoved(recyclerView, i2, i3);
        x(i2);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i2, int i3) {
        super.onItemsUpdated(recyclerView, i2, i3);
        x(i2);
    }

    public void onItemsUpdated(@NonNull RecyclerView recyclerView, int i2, int i3, Object obj) {
        super.onItemsUpdated(recyclerView, i2, i3, obj);
        x(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r0.f7201b == 2) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
        if (r0.f7201b == 2) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.Recycler r22, androidx.recyclerview.widget.RecyclerView.State r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r0.f7205i = r1
            r0.f7206j = r2
            int r3 = r23.getItemCount()
            if (r3 != 0) goto L_0x0017
            boolean r4 = r23.isPreLayout()
            if (r4 == 0) goto L_0x0017
            return
        L_0x0017:
            int r4 = r21.getLayoutDirection()
            int r5 = r0.a
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0058
            if (r5 == r8) goto L_0x004c
            if (r5 == r6) goto L_0x003d
            r9 = 3
            if (r5 == r9) goto L_0x002c
            r0.f7202e = r7
            goto L_0x0065
        L_0x002c:
            if (r4 != r8) goto L_0x0030
            r4 = r8
            goto L_0x0031
        L_0x0030:
            r4 = r7
        L_0x0031:
            r0.f7202e = r4
            int r5 = r0.f7201b
            if (r5 != r6) goto L_0x003a
            r4 = r4 ^ r8
            r0.f7202e = r4
        L_0x003a:
            r0.f = r8
            goto L_0x0068
        L_0x003d:
            if (r4 != r8) goto L_0x0041
            r4 = r8
            goto L_0x0042
        L_0x0041:
            r4 = r7
        L_0x0042:
            r0.f7202e = r4
            int r5 = r0.f7201b
            if (r5 != r6) goto L_0x0065
            r4 = r4 ^ r8
            r0.f7202e = r4
            goto L_0x0065
        L_0x004c:
            if (r4 == r8) goto L_0x0050
            r4 = r8
            goto L_0x0051
        L_0x0050:
            r4 = r7
        L_0x0051:
            r0.f7202e = r4
            int r4 = r0.f7201b
            if (r4 != r6) goto L_0x0065
            goto L_0x0063
        L_0x0058:
            if (r4 != r8) goto L_0x005c
            r4 = r8
            goto L_0x005d
        L_0x005c:
            r4 = r7
        L_0x005d:
            r0.f7202e = r4
            int r4 = r0.f7201b
            if (r4 != r6) goto L_0x0065
        L_0x0063:
            r4 = r8
            goto L_0x0066
        L_0x0065:
            r4 = r7
        L_0x0066:
            r0.f = r4
        L_0x0068:
            r21.b()
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f7207k
            r5 = 0
            if (r4 != 0) goto L_0x0077
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = new com.google.android.flexbox.FlexboxLayoutManager$d
            r4.<init>(r5)
            r0.f7207k = r4
        L_0x0077:
            b.l.a.b.d r4 = r0.f7204h
            r4.g(r3)
            b.l.a.b.d r4 = r0.f7204h
            r4.h(r3)
            b.l.a.b.d r4 = r0.f7204h
            r4.f(r3)
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f7207k
            r4.f7232j = r7
            com.google.android.flexbox.FlexboxLayoutManager$e r4 = r0.f7211o
            if (r4 == 0) goto L_0x009b
            int r6 = r4.f7233h
            if (r6 < 0) goto L_0x0096
            if (r6 >= r3) goto L_0x0096
            r9 = r8
            goto L_0x0097
        L_0x0096:
            r9 = r7
        L_0x0097:
            if (r9 == 0) goto L_0x009b
            r0.f7212p = r6
        L_0x009b:
            com.google.android.flexbox.FlexboxLayoutManager$b r6 = r0.f7208l
            boolean r9 = r6.f
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -1
            if (r9 == 0) goto L_0x00aa
            int r9 = r0.f7212p
            if (r9 != r11) goto L_0x00aa
            if (r4 == 0) goto L_0x0287
        L_0x00aa:
            com.google.android.flexbox.FlexboxLayoutManager.b.b(r6)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f7208l
            com.google.android.flexbox.FlexboxLayoutManager$e r6 = r0.f7211o
            boolean r9 = r23.isPreLayout()
            if (r9 != 0) goto L_0x01a2
            int r9 = r0.f7212p
            if (r9 != r11) goto L_0x00bd
            goto L_0x01a2
        L_0x00bd:
            if (r9 < 0) goto L_0x019e
            int r12 = r23.getItemCount()
            if (r9 < r12) goto L_0x00c7
            goto L_0x019e
        L_0x00c7:
            int r9 = r0.f7212p
            r4.a = r9
            b.l.a.b.d r12 = r0.f7204h
            int[] r12 = r12.c
            r9 = r12[r9]
            r4.f7214b = r9
            com.google.android.flexbox.FlexboxLayoutManager$e r9 = r0.f7211o
            if (r9 == 0) goto L_0x00f7
            int r12 = r23.getItemCount()
            int r9 = r9.f7233h
            if (r9 < 0) goto L_0x00e3
            if (r9 >= r12) goto L_0x00e3
            r9 = r8
            goto L_0x00e4
        L_0x00e3:
            r9 = r7
        L_0x00e4:
            if (r9 == 0) goto L_0x00f7
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r9 = r9.getStartAfterPadding()
            int r6 = r6.f7234i
            int r9 = r9 + r6
            r4.c = r9
            r4.f7216g = r8
            r4.f7214b = r11
            goto L_0x019c
        L_0x00f7:
            int r6 = r0.f7213q
            if (r6 != r10) goto L_0x017d
            int r6 = r0.f7212p
            android.view.View r6 = r0.findViewByPosition(r6)
            if (r6 == 0) goto L_0x0162
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r9 = r9.getDecoratedMeasurement(r6)
            androidx.recyclerview.widget.OrientationHelper r12 = r0.f7209m
            int r12 = r12.getTotalSpace()
            if (r9 <= r12) goto L_0x0112
            goto L_0x0179
        L_0x0112:
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r9 = r9.getDecoratedStart(r6)
            androidx.recyclerview.widget.OrientationHelper r12 = r0.f7209m
            int r12 = r12.getStartAfterPadding()
            int r9 = r9 - r12
            if (r9 >= 0) goto L_0x012d
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f7209m
            int r6 = r6.getStartAfterPadding()
            r4.c = r6
            r4.f7215e = r7
            goto L_0x019c
        L_0x012d:
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r9 = r9.getEndAfterPadding()
            androidx.recyclerview.widget.OrientationHelper r12 = r0.f7209m
            int r12 = r12.getDecoratedEnd(r6)
            int r9 = r9 - r12
            if (r9 >= 0) goto L_0x0147
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f7209m
            int r6 = r6.getEndAfterPadding()
            r4.c = r6
            r4.f7215e = r8
            goto L_0x019c
        L_0x0147:
            boolean r9 = r4.f7215e
            if (r9 == 0) goto L_0x0159
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r6 = r9.getDecoratedEnd(r6)
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r9 = r9.getTotalSpaceChange()
            int r9 = r9 + r6
            goto L_0x015f
        L_0x0159:
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r9 = r9.getDecoratedStart(r6)
        L_0x015f:
            r4.c = r9
            goto L_0x019c
        L_0x0162:
            int r6 = r21.getChildCount()
            if (r6 <= 0) goto L_0x0179
            android.view.View r6 = r0.getChildAt(r7)
            int r6 = r0.getPosition(r6)
            int r9 = r0.f7212p
            if (r9 >= r6) goto L_0x0176
            r6 = r8
            goto L_0x0177
        L_0x0176:
            r6 = r7
        L_0x0177:
            r4.f7215e = r6
        L_0x0179:
            com.google.android.flexbox.FlexboxLayoutManager.b.a(r4)
            goto L_0x019c
        L_0x017d:
            boolean r6 = r21.r()
            if (r6 != 0) goto L_0x0191
            boolean r6 = r0.f7202e
            if (r6 == 0) goto L_0x0191
            int r6 = r0.f7213q
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r9 = r9.getEndPadding()
            int r6 = r6 - r9
            goto L_0x019a
        L_0x0191:
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f7209m
            int r6 = r6.getStartAfterPadding()
            int r9 = r0.f7213q
            int r6 = r6 + r9
        L_0x019a:
            r4.c = r6
        L_0x019c:
            r6 = r8
            goto L_0x01a3
        L_0x019e:
            r0.f7212p = r11
            r0.f7213q = r10
        L_0x01a2:
            r6 = r7
        L_0x01a3:
            if (r6 == 0) goto L_0x01a7
            goto L_0x0283
        L_0x01a7:
            int r6 = r21.getChildCount()
            if (r6 != 0) goto L_0x01af
            goto L_0x0278
        L_0x01af:
            boolean r6 = r4.f7215e
            if (r6 == 0) goto L_0x01bc
            int r6 = r23.getItemCount()
            android.view.View r6 = r0.f(r6)
            goto L_0x01c4
        L_0x01bc:
            int r6 = r23.getItemCount()
            android.view.View r6 = r0.d(r6)
        L_0x01c4:
            if (r6 == 0) goto L_0x0278
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            int r12 = r9.f7201b
            if (r12 != 0) goto L_0x01cf
            androidx.recyclerview.widget.OrientationHelper r12 = r9.f7210n
            goto L_0x01d1
        L_0x01cf:
            androidx.recyclerview.widget.OrientationHelper r12 = r9.f7209m
        L_0x01d1:
            boolean r9 = r9.r()
            if (r9 != 0) goto L_0x01eb
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            boolean r9 = r9.f7202e
            if (r9 == 0) goto L_0x01eb
            boolean r9 = r4.f7215e
            if (r9 == 0) goto L_0x01e6
            int r9 = r12.getDecoratedStart(r6)
            goto L_0x01f3
        L_0x01e6:
            int r9 = r12.getDecoratedEnd(r6)
            goto L_0x01ff
        L_0x01eb:
            boolean r9 = r4.f7215e
            if (r9 == 0) goto L_0x01fb
            int r9 = r12.getDecoratedEnd(r6)
        L_0x01f3:
            int r12 = r12.getTotalSpaceChange()
            int r12 = r12 + r9
            r4.c = r12
            goto L_0x0201
        L_0x01fb:
            int r9 = r12.getDecoratedStart(r6)
        L_0x01ff:
            r4.c = r9
        L_0x0201:
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            int r9 = r9.getPosition(r6)
            r4.a = r9
            r4.f7216g = r7
            com.google.android.flexbox.FlexboxLayoutManager r12 = com.google.android.flexbox.FlexboxLayoutManager.this
            b.l.a.b.d r13 = r12.f7204h
            int[] r13 = r13.c
            if (r9 == r11) goto L_0x0214
            goto L_0x0215
        L_0x0214:
            r9 = r7
        L_0x0215:
            r9 = r13[r9]
            if (r9 == r11) goto L_0x021a
            goto L_0x021b
        L_0x021a:
            r9 = r7
        L_0x021b:
            r4.f7214b = r9
            java.util.List<b.l.a.b.c> r9 = r12.f7203g
            int r9 = r9.size()
            int r12 = r4.f7214b
            if (r9 <= r12) goto L_0x0235
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            java.util.List<b.l.a.b.c> r9 = r9.f7203g
            java.lang.Object r9 = r9.get(r12)
            b.l.a.b.c r9 = (b.l.a.b.c) r9
            int r9 = r9.f2567k
            r4.a = r9
        L_0x0235:
            boolean r9 = r23.isPreLayout()
            if (r9 != 0) goto L_0x0276
            boolean r9 = r21.supportsPredictiveItemAnimations()
            if (r9 == 0) goto L_0x0276
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r9 = r9.getDecoratedStart(r6)
            androidx.recyclerview.widget.OrientationHelper r12 = r0.f7209m
            int r12 = r12.getEndAfterPadding()
            if (r9 >= r12) goto L_0x0260
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r6 = r9.getDecoratedEnd(r6)
            androidx.recyclerview.widget.OrientationHelper r9 = r0.f7209m
            int r9 = r9.getStartAfterPadding()
            if (r6 >= r9) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r6 = r7
            goto L_0x0261
        L_0x0260:
            r6 = r8
        L_0x0261:
            if (r6 == 0) goto L_0x0276
            boolean r6 = r4.f7215e
            if (r6 == 0) goto L_0x026e
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f7209m
            int r6 = r6.getEndAfterPadding()
            goto L_0x0274
        L_0x026e:
            androidx.recyclerview.widget.OrientationHelper r6 = r0.f7209m
            int r6 = r6.getStartAfterPadding()
        L_0x0274:
            r4.c = r6
        L_0x0276:
            r6 = r8
            goto L_0x0279
        L_0x0278:
            r6 = r7
        L_0x0279:
            if (r6 == 0) goto L_0x027c
            goto L_0x0283
        L_0x027c:
            com.google.android.flexbox.FlexboxLayoutManager.b.a(r4)
            r4.a = r7
            r4.f7214b = r7
        L_0x0283:
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f7208l
            r4.f = r8
        L_0x0287:
            r21.detachAndScrapAttachedViews(r22)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f7208l
            boolean r6 = r4.f7215e
            if (r6 == 0) goto L_0x0294
            r0.z(r4, r7, r8)
            goto L_0x0297
        L_0x0294:
            r0.y(r4, r7, r8)
        L_0x0297:
            int r4 = r21.getWidth()
            int r6 = r21.getWidthMode()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            int r6 = r21.getHeight()
            int r9 = r21.getHeightMode()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            int r9 = r21.getWidth()
            int r12 = r21.getHeight()
            boolean r13 = r21.r()
            if (r13 == 0) goto L_0x02d9
            int r13 = r0.r
            if (r13 == r10) goto L_0x02c5
            if (r13 == r9) goto L_0x02c5
            r10 = r8
            goto L_0x02c6
        L_0x02c5:
            r10 = r7
        L_0x02c6:
            com.google.android.flexbox.FlexboxLayoutManager$d r13 = r0.f7207k
            boolean r14 = r13.f7227b
            if (r14 == 0) goto L_0x02f5
            android.content.Context r13 = r0.u
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            int r13 = r13.heightPixels
            goto L_0x02f7
        L_0x02d9:
            int r13 = r0.s
            if (r13 == r10) goto L_0x02e1
            if (r13 == r12) goto L_0x02e1
            r10 = r8
            goto L_0x02e2
        L_0x02e1:
            r10 = r7
        L_0x02e2:
            com.google.android.flexbox.FlexboxLayoutManager$d r13 = r0.f7207k
            boolean r14 = r13.f7227b
            if (r14 == 0) goto L_0x02f5
            android.content.Context r13 = r0.u
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            int r13 = r13.widthPixels
            goto L_0x02f7
        L_0x02f5:
            int r13 = r13.a
        L_0x02f7:
            r17 = r13
            r0.r = r9
            r0.s = r12
            int r9 = r0.w
            if (r9 != r11) goto L_0x036d
            int r12 = r0.f7212p
            if (r12 != r11) goto L_0x0307
            if (r10 == 0) goto L_0x036d
        L_0x0307:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f7208l
            boolean r3 = r3.f7215e
            if (r3 == 0) goto L_0x030f
            goto L_0x0410
        L_0x030f:
            java.util.List<b.l.a.b.c> r3 = r0.f7203g
            r3.clear()
            b.l.a.b.d$a r3 = r0.x
            r3.a = r5
            boolean r3 = r21.r()
            b.l.a.b.d r12 = r0.f7204h
            b.l.a.b.d$a r13 = r0.x
            if (r3 == 0) goto L_0x0337
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f7208l
            int r3 = r3.a
            java.util.List<b.l.a.b.c> r5 = r0.f7203g
            r9 = 0
            r14 = r4
            r15 = r6
            r16 = r17
            r17 = r9
            r18 = r3
            r19 = r5
            r12.b(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x034b
        L_0x0337:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f7208l
            int r3 = r3.a
            java.util.List<b.l.a.b.c> r5 = r0.f7203g
            r9 = 0
            r14 = r6
            r15 = r4
            r16 = r17
            r17 = r9
            r18 = r3
            r19 = r5
            r12.b(r13, r14, r15, r16, r17, r18, r19)
        L_0x034b:
            b.l.a.b.d$a r3 = r0.x
            java.util.List<b.l.a.b.c> r3 = r3.a
            r0.f7203g = r3
            b.l.a.b.d r3 = r0.f7204h
            r3.e(r4, r6, r7)
            b.l.a.b.d r3 = r0.f7204h
            r3.w(r7)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f7208l
            b.l.a.b.d r4 = r0.f7204h
            int[] r4 = r4.c
            int r5 = r3.a
            r4 = r4[r5]
            r3.f7214b = r4
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f7207k
            r3.c = r4
            goto L_0x0410
        L_0x036d:
            if (r9 == r11) goto L_0x0378
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f7208l
            int r10 = r10.a
            int r9 = java.lang.Math.min(r9, r10)
            goto L_0x037c
        L_0x0378:
            com.google.android.flexbox.FlexboxLayoutManager$b r9 = r0.f7208l
            int r9 = r9.a
        L_0x037c:
            b.l.a.b.d$a r10 = r0.x
            r10.a = r5
            boolean r5 = r21.r()
            if (r5 == 0) goto L_0x03bf
            java.util.List<b.l.a.b.c> r5 = r0.f7203g
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x03a5
            b.l.a.b.d r3 = r0.f7204h
            java.util.List<b.l.a.b.c> r5 = r0.f7203g
            r3.d(r5, r9)
            b.l.a.b.d r3 = r0.f7204h
            b.l.a.b.d$a r5 = r0.x
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f7208l
            int r10 = r10.a
            java.util.List<b.l.a.b.c> r11 = r0.f7203g
            r13 = r3
            r15 = r4
            r14 = r5
            r16 = r6
            goto L_0x03dd
        L_0x03a5:
            b.l.a.b.d r5 = r0.f7204h
            r5.f(r3)
            b.l.a.b.d r12 = r0.f7204h
            b.l.a.b.d$a r13 = r0.x
            r3 = 0
            java.util.List<b.l.a.b.c> r5 = r0.f7203g
            r18 = -1
            r14 = r4
            r15 = r6
            r16 = r17
            r17 = r3
            r19 = r5
            r12.b(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0400
        L_0x03bf:
            java.util.List<b.l.a.b.c> r5 = r0.f7203g
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x03e7
            b.l.a.b.d r3 = r0.f7204h
            java.util.List<b.l.a.b.c> r5 = r0.f7203g
            r3.d(r5, r9)
            b.l.a.b.d r3 = r0.f7204h
            b.l.a.b.d$a r5 = r0.x
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f7208l
            int r10 = r10.a
            java.util.List<b.l.a.b.c> r11 = r0.f7203g
            r13 = r3
            r16 = r4
            r14 = r5
            r15 = r6
        L_0x03dd:
            r19 = r10
            r20 = r11
            r18 = r9
            r13.b(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0400
        L_0x03e7:
            b.l.a.b.d r5 = r0.f7204h
            r5.f(r3)
            b.l.a.b.d r12 = r0.f7204h
            b.l.a.b.d$a r13 = r0.x
            r3 = 0
            java.util.List<b.l.a.b.c> r5 = r0.f7203g
            r18 = -1
            r14 = r6
            r15 = r4
            r16 = r17
            r17 = r3
            r19 = r5
            r12.b(r13, r14, r15, r16, r17, r18, r19)
        L_0x0400:
            b.l.a.b.d$a r3 = r0.x
            java.util.List<b.l.a.b.c> r3 = r3.a
            r0.f7203g = r3
            b.l.a.b.d r3 = r0.f7204h
            r3.e(r4, r6, r9)
            b.l.a.b.d r3 = r0.f7204h
            r3.w(r9)
        L_0x0410:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f7208l
            boolean r3 = r3.f7215e
            if (r3 == 0) goto L_0x042e
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f7207k
            r0.c(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f7207k
            int r3 = r3.f7228e
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f7208l
            r0.y(r4, r8, r7)
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f7207k
            r0.c(r1, r2, r4)
            com.google.android.flexbox.FlexboxLayoutManager$d r4 = r0.f7207k
            int r4 = r4.f7228e
            goto L_0x0445
        L_0x042e:
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f7207k
            r0.c(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f7207k
            int r4 = r3.f7228e
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f7208l
            r0.z(r3, r8, r7)
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f7207k
            r0.c(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$d r3 = r0.f7207k
            int r3 = r3.f7228e
        L_0x0445:
            int r5 = r21.getChildCount()
            if (r5 <= 0) goto L_0x0462
            com.google.android.flexbox.FlexboxLayoutManager$b r5 = r0.f7208l
            boolean r5 = r5.f7215e
            if (r5 == 0) goto L_0x045a
            int r4 = r0.fixLayoutEndGap(r4, r1, r2, r8)
            int r4 = r4 + r3
            r0.fixLayoutStartGap(r4, r1, r2, r7)
            goto L_0x0462
        L_0x045a:
            int r3 = r0.fixLayoutStartGap(r3, r1, r2, r8)
            int r3 = r3 + r4
            r0.fixLayoutEndGap(r3, r1, r2, r7)
        L_0x0462:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f7211o = null;
        this.f7212p = -1;
        this.f7213q = Integer.MIN_VALUE;
        this.w = -1;
        b.b(this.f7208l);
        this.t.clear();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f7211o = (e) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        e eVar = this.f7211o;
        if (eVar != null) {
            return new e(eVar, (a) null);
        }
        e eVar2 = new e();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            eVar2.f7233h = getPosition(childAt);
            eVar2.f7234i = this.f7209m.getDecoratedStart(childAt) - this.f7209m.getStartAfterPadding();
        } else {
            eVar2.f7233h = -1;
        }
        return eVar2;
    }

    public final int p(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i3;
        int i4;
        d dVar;
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        b();
        this.f7207k.f7232j = true;
        boolean z = !r() && this.f7202e;
        int i5 = (!z ? i2 <= 0 : i2 >= 0) ? -1 : 1;
        int abs = Math.abs(i2);
        this.f7207k.f7231i = i5;
        boolean r2 = r();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), getWidthMode());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getHeight(), getHeightMode());
        boolean z2 = !r2 && this.f7202e;
        if (i5 == 1) {
            View childAt = getChildAt(getChildCount() - 1);
            this.f7207k.f7228e = this.f7209m.getDecoratedEnd(childAt);
            int position = getPosition(childAt);
            View g2 = g(childAt, this.f7203g.get(this.f7204h.c[position]));
            d dVar2 = this.f7207k;
            dVar2.f7230h = 1;
            int i6 = position + 1;
            dVar2.d = i6;
            int[] iArr = this.f7204h.c;
            if (iArr.length <= i6) {
                dVar2.c = -1;
            } else {
                dVar2.c = iArr[i6];
            }
            if (z2) {
                dVar2.f7228e = this.f7209m.getDecoratedStart(g2);
                this.f7207k.f = this.f7209m.getStartAfterPadding() + (-this.f7209m.getDecoratedStart(g2));
                dVar = this.f7207k;
                i4 = dVar.f;
                if (i4 < 0) {
                    i4 = 0;
                }
            } else {
                dVar2.f7228e = this.f7209m.getDecoratedEnd(g2);
                dVar = this.f7207k;
                i4 = this.f7209m.getDecoratedEnd(g2) - this.f7209m.getEndAfterPadding();
            }
            dVar.f = i4;
            int i7 = this.f7207k.c;
            if ((i7 == -1 || i7 > this.f7203g.size() - 1) && this.f7207k.d <= n()) {
                d dVar3 = this.f7207k;
                int i8 = abs - dVar3.f;
                d.a aVar = this.x;
                aVar.a = null;
                if (i8 > 0) {
                    b.l.a.b.d dVar4 = this.f7204h;
                    if (r2) {
                        dVar4.b(aVar, makeMeasureSpec, makeMeasureSpec2, i8, dVar3.d, -1, this.f7203g);
                    } else {
                        dVar4.b(aVar, makeMeasureSpec2, makeMeasureSpec, i8, dVar3.d, -1, this.f7203g);
                    }
                    this.f7204h.e(makeMeasureSpec, makeMeasureSpec2, this.f7207k.d);
                    this.f7204h.w(this.f7207k.d);
                }
            }
        } else {
            View childAt2 = getChildAt(0);
            this.f7207k.f7228e = this.f7209m.getDecoratedStart(childAt2);
            int position2 = getPosition(childAt2);
            View e2 = e(childAt2, this.f7203g.get(this.f7204h.c[position2]));
            d dVar5 = this.f7207k;
            dVar5.f7230h = 1;
            int i9 = this.f7204h.c[position2];
            if (i9 == -1) {
                i9 = 0;
            }
            if (i9 > 0) {
                this.f7207k.d = position2 - this.f7203g.get(i9 - 1).d;
            } else {
                dVar5.d = -1;
            }
            d dVar6 = this.f7207k;
            dVar6.c = i9 > 0 ? i9 - 1 : 0;
            OrientationHelper orientationHelper = this.f7209m;
            if (z2) {
                dVar6.f7228e = orientationHelper.getDecoratedEnd(e2);
                this.f7207k.f = this.f7209m.getDecoratedEnd(e2) - this.f7209m.getEndAfterPadding();
                d dVar7 = this.f7207k;
                int i10 = dVar7.f;
                if (i10 < 0) {
                    i10 = 0;
                }
                dVar7.f = i10;
            } else {
                dVar6.f7228e = orientationHelper.getDecoratedStart(e2);
                this.f7207k.f = this.f7209m.getStartAfterPadding() + (-this.f7209m.getDecoratedStart(e2));
            }
        }
        d dVar8 = this.f7207k;
        int i11 = dVar8.f;
        dVar8.a = abs - i11;
        int c2 = c(recycler, state, dVar8) + i11;
        if (c2 < 0) {
            return 0;
        }
        if (z) {
            if (abs > c2) {
                i3 = (-i5) * c2;
                this.f7209m.offsetChildren(-i3);
                this.f7207k.f7229g = i3;
                return i3;
            }
        } else if (abs > c2) {
            i3 = i5 * c2;
            this.f7209m.offsetChildren(-i3);
            this.f7207k.f7229g = i3;
            return i3;
        }
        i3 = i2;
        this.f7209m.offsetChildren(-i3);
        this.f7207k.f7229g = i3;
        return i3;
    }

    public final int q(int i2) {
        int i3;
        boolean z = false;
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        b();
        boolean r2 = r();
        View view = this.v;
        int width = r2 ? view.getWidth() : view.getHeight();
        int width2 = r2 ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i2);
            if (i2 < 0) {
                return -Math.min((width2 + this.f7208l.d) - width, abs);
            }
            i3 = this.f7208l.d;
            if (i3 + i2 <= 0) {
                return i2;
            }
        } else if (i2 > 0) {
            return Math.min((width2 - this.f7208l.d) - width, i2);
        } else {
            i3 = this.f7208l.d;
            if (i3 + i2 >= 0) {
                return i2;
            }
        }
        return -i3;
    }

    public boolean r() {
        int i2 = this.a;
        return i2 == 0 || i2 == 1;
    }

    public final void s(RecyclerView.Recycler recycler, d dVar) {
        int childCount;
        if (dVar.f7232j) {
            int i2 = -1;
            if (dVar.f7231i == -1) {
                if (dVar.f >= 0) {
                    this.f7209m.getEnd();
                    int childCount2 = getChildCount();
                    if (childCount2 != 0) {
                        int i3 = childCount2 - 1;
                        int i4 = this.f7204h.c[getPosition(getChildAt(i3))];
                        if (i4 != -1) {
                            b.l.a.b.c cVar = this.f7203g.get(i4);
                            int i5 = i3;
                            while (true) {
                                if (i5 < 0) {
                                    break;
                                }
                                View childAt = getChildAt(i5);
                                int i6 = dVar.f;
                                if (!(r() || !this.f7202e ? this.f7209m.getDecoratedStart(childAt) >= this.f7209m.getEnd() - i6 : this.f7209m.getDecoratedEnd(childAt) <= i6)) {
                                    break;
                                }
                                if (cVar.f2567k == getPosition(childAt)) {
                                    if (i4 <= 0) {
                                        childCount2 = i5;
                                        break;
                                    }
                                    i4 += dVar.f7231i;
                                    cVar = this.f7203g.get(i4);
                                    childCount2 = i5;
                                }
                                i5--;
                            }
                            while (i3 >= childCount2) {
                                removeAndRecycleViewAt(i3, recycler);
                                i3--;
                            }
                        }
                    }
                }
            } else if (dVar.f >= 0 && (childCount = getChildCount()) != 0) {
                int i7 = this.f7204h.c[getPosition(getChildAt(0))];
                if (i7 != -1) {
                    b.l.a.b.c cVar2 = this.f7203g.get(i7);
                    int i8 = 0;
                    while (true) {
                        if (i8 >= childCount) {
                            break;
                        }
                        View childAt2 = getChildAt(i8);
                        int i9 = dVar.f;
                        if (!(r() || !this.f7202e ? this.f7209m.getDecoratedEnd(childAt2) <= i9 : this.f7209m.getEnd() - this.f7209m.getDecoratedStart(childAt2) <= i9)) {
                            break;
                        }
                        if (cVar2.f2568l == getPosition(childAt2)) {
                            if (i7 >= this.f7203g.size() - 1) {
                                i2 = i8;
                                break;
                            }
                            i7 += dVar.f7231i;
                            cVar2 = this.f7203g.get(i7);
                            i2 = i8;
                        }
                        i8++;
                    }
                    while (i2 >= 0) {
                        removeAndRecycleViewAt(i2, recycler);
                        i2--;
                    }
                }
            }
        }
    }

    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!r() || (this.f7201b == 0 && r())) {
            int p2 = p(i2, recycler, state);
            this.t.clear();
            return p2;
        }
        int q2 = q(i2);
        this.f7208l.d += q2;
        this.f7210n.offsetChildren(-q2);
        return q2;
    }

    public void scrollToPosition(int i2) {
        this.f7212p = i2;
        this.f7213q = Integer.MIN_VALUE;
        e eVar = this.f7211o;
        if (eVar != null) {
            eVar.f7233h = -1;
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (r() || (this.f7201b == 0 && !r())) {
            int p2 = p(i2, recycler, state);
            this.t.clear();
            return p2;
        }
        int q2 = q(i2);
        this.f7208l.d += q2;
        this.f7210n.offsetChildren(-q2);
        return q2;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i2);
        startSmoothScroll(linearSmoothScroller);
    }

    public final void t() {
        int heightMode = r() ? getHeightMode() : getWidthMode();
        this.f7207k.f7227b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public void u(int i2) {
        int i3 = this.c;
        if (i3 != i2) {
            if (i3 == 4 || i2 == 4) {
                removeAllViews();
                a();
            }
            this.c = i2;
            requestLayout();
        }
    }

    public void v(int i2) {
        if (this.a != i2) {
            removeAllViews();
            this.a = i2;
            this.f7209m = null;
            this.f7210n = null;
            a();
            requestLayout();
        }
    }

    public void w(int i2) {
        if (i2 != 2) {
            int i3 = this.f7201b;
            if (i3 != i2) {
                if (i3 == 0 || i2 == 0) {
                    removeAllViews();
                    a();
                }
                this.f7201b = i2;
                this.f7209m = null;
                this.f7210n = null;
                requestLayout();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    public final void x(int i2) {
        if (i2 < findLastVisibleItemPosition()) {
            int childCount = getChildCount();
            this.f7204h.g(childCount);
            this.f7204h.h(childCount);
            this.f7204h.f(childCount);
            if (i2 < this.f7204h.c.length) {
                this.w = i2;
                View childAt = getChildAt(0);
                if (childAt != null) {
                    this.f7212p = getPosition(childAt);
                    if (r() || !this.f7202e) {
                        this.f7213q = this.f7209m.getDecoratedStart(childAt) - this.f7209m.getStartAfterPadding();
                        return;
                    }
                    this.f7213q = this.f7209m.getEndPadding() + this.f7209m.getDecoratedEnd(childAt);
                }
            }
        }
    }

    public final void y(b bVar, boolean z, boolean z2) {
        d dVar;
        int endAfterPadding;
        int i2;
        int i3;
        if (z2) {
            t();
        } else {
            this.f7207k.f7227b = false;
        }
        if (r() || !this.f7202e) {
            dVar = this.f7207k;
            endAfterPadding = this.f7209m.getEndAfterPadding();
            i2 = bVar.c;
        } else {
            dVar = this.f7207k;
            endAfterPadding = bVar.c;
            i2 = getPaddingRight();
        }
        dVar.a = endAfterPadding - i2;
        d dVar2 = this.f7207k;
        dVar2.d = bVar.a;
        dVar2.f7230h = 1;
        dVar2.f7231i = 1;
        dVar2.f7228e = bVar.c;
        dVar2.f = Integer.MIN_VALUE;
        dVar2.c = bVar.f7214b;
        if (z && this.f7203g.size() > 1 && (i3 = bVar.f7214b) >= 0 && i3 < this.f7203g.size() - 1) {
            d dVar3 = this.f7207k;
            dVar3.c++;
            dVar3.d += this.f7203g.get(bVar.f7214b).d;
        }
    }

    public final void z(b bVar, boolean z, boolean z2) {
        d dVar;
        int i2;
        int i3;
        if (z2) {
            t();
        } else {
            this.f7207k.f7227b = false;
        }
        if (r() || !this.f7202e) {
            dVar = this.f7207k;
            i2 = bVar.c;
        } else {
            dVar = this.f7207k;
            i2 = this.v.getWidth() - bVar.c;
        }
        dVar.a = i2 - this.f7209m.getStartAfterPadding();
        d dVar2 = this.f7207k;
        dVar2.d = bVar.a;
        dVar2.f7230h = 1;
        dVar2.f7231i = -1;
        dVar2.f7228e = bVar.c;
        dVar2.f = Integer.MIN_VALUE;
        int i4 = bVar.f7214b;
        dVar2.c = i4;
        if (z && i4 > 0 && this.f7203g.size() > (i3 = bVar.f7214b)) {
            d dVar3 = this.f7207k;
            dVar3.c--;
            dVar3.d -= this.f7203g.get(i3).d;
        }
    }
}
