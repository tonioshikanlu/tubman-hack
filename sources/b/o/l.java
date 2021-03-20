package b.o;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.customview.widget.ViewDragHelper;
import b.o.m;

public class l extends ViewDragHelper.Callback {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f6172b;

    public l(m mVar) {
        this.f6172b = mVar;
    }

    public int clampViewPositionHorizontal(@NonNull View view, int i2, int i3) {
        return this.f6172b.f6193k.d;
    }

    public int clampViewPositionVertical(@NonNull View view, int i2, int i3) {
        m.a aVar;
        m.a aVar2;
        this.a = i2;
        m mVar = this.f6172b;
        m.b bVar = mVar.f6193k;
        if (bVar.f == 1) {
            if (i2 >= bVar.c && (aVar2 = mVar.f6190h) != null) {
                ((y) aVar2).a.f5998i = true;
            }
            int i4 = bVar.f6194b;
            if (i2 < i4) {
                return i4;
            }
        } else {
            if (i2 <= bVar.c && (aVar = mVar.f6190h) != null) {
                ((y) aVar).a.f5998i = true;
            }
            int i5 = bVar.f6194b;
            if (i2 > i5) {
                return i5;
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r6 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewReleased(@androidx.annotation.NonNull android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            b.o.m r6 = r5.f6172b
            b.o.m$b r7 = r6.f6193k
            int r0 = r7.f6194b
            boolean r1 = r6.f6192j
            if (r1 != 0) goto L_0x0042
            int r1 = r7.f
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0026
            int r1 = r5.a
            int r4 = r7.f6198i
            if (r1 > r4) goto L_0x001d
            int r1 = r7.f6196g
            float r1 = (float) r1
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0042
        L_0x001d:
            int r0 = r7.f6197h
            r6.f6192j = r3
            b.o.m$a r6 = r6.f6190h
            if (r6 == 0) goto L_0x0042
            goto L_0x003b
        L_0x0026:
            int r1 = r5.a
            int r4 = r7.f6198i
            if (r1 < r4) goto L_0x0033
            int r1 = r7.f6196g
            float r1 = (float) r1
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 >= 0) goto L_0x0042
        L_0x0033:
            int r0 = r7.f6197h
            r6.f6192j = r3
            b.o.m$a r6 = r6.f6190h
            if (r6 == 0) goto L_0x0042
        L_0x003b:
            b.o.y r6 = (b.o.y) r6
            b.o.a0 r6 = r6.a
            r6.f(r2)
        L_0x0042:
            b.o.m r6 = r5.f6172b
            androidx.customview.widget.ViewDragHelper r7 = r6.f6191i
            b.o.m$b r6 = r6.f6193k
            int r6 = r6.d
            boolean r6 = r7.settleCapturedViewAt(r6, r0)
            if (r6 == 0) goto L_0x0055
            b.o.m r6 = r5.f6172b
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r6)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.l.onViewReleased(android.view.View, float, float):void");
    }

    public boolean tryCaptureView(@NonNull View view, int i2) {
        return true;
    }
}
