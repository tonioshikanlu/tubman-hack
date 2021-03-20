package b.a.a.h;

import android.graphics.drawable.ShapeDrawable;
import com.appfoundry.previewer.model.Coordinate;
import e.j;

public final class v extends ShapeDrawable.ShaderFactory {
    public final /* synthetic */ Coordinate a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Coordinate f295b;
    public final /* synthetic */ j c;

    public v(Coordinate coordinate, Coordinate coordinate2, j jVar) {
        this.a = coordinate;
        this.f295b = coordinate2;
        this.c = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r10 = r10.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Shader resize(int r9, int r10) {
        /*
            r8 = this;
            android.graphics.LinearGradient r9 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x0052 }
            com.appfoundry.previewer.model.Coordinate r10 = r8.a     // Catch:{ Exception -> 0x0052 }
            r0 = 0
            if (r10 == 0) goto L_0x0011
            java.lang.Float r10 = r10.a     // Catch:{ Exception -> 0x0052 }
            if (r10 == 0) goto L_0x0011
            float r10 = r10.floatValue()     // Catch:{ Exception -> 0x0052 }
            r1 = r10
            goto L_0x0012
        L_0x0011:
            r1 = r0
        L_0x0012:
            com.appfoundry.previewer.model.Coordinate r10 = r8.a     // Catch:{ Exception -> 0x0052 }
            if (r10 == 0) goto L_0x0020
            java.lang.Float r10 = r10.f7107b     // Catch:{ Exception -> 0x0052 }
            if (r10 == 0) goto L_0x0020
            float r10 = r10.floatValue()     // Catch:{ Exception -> 0x0052 }
            r2 = r10
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            com.appfoundry.previewer.model.Coordinate r10 = r8.f295b     // Catch:{ Exception -> 0x0052 }
            if (r10 == 0) goto L_0x002f
            java.lang.Float r10 = r10.a     // Catch:{ Exception -> 0x0052 }
            if (r10 == 0) goto L_0x002f
            float r10 = r10.floatValue()     // Catch:{ Exception -> 0x0052 }
            r3 = r10
            goto L_0x0030
        L_0x002f:
            r3 = r0
        L_0x0030:
            com.appfoundry.previewer.model.Coordinate r10 = r8.f295b     // Catch:{ Exception -> 0x0052 }
            if (r10 == 0) goto L_0x003e
            java.lang.Float r10 = r10.f7107b     // Catch:{ Exception -> 0x0052 }
            if (r10 == 0) goto L_0x003e
            float r10 = r10.floatValue()     // Catch:{ Exception -> 0x0052 }
            r4 = r10
            goto L_0x003f
        L_0x003e:
            r4 = r0
        L_0x003f:
            e.j r10 = r8.c     // Catch:{ Exception -> 0x0052 }
            A r0 = r10.f7906h     // Catch:{ Exception -> 0x0052 }
            r5 = r0
            int[] r5 = (int[]) r5     // Catch:{ Exception -> 0x0052 }
            B r10 = r10.f7907i     // Catch:{ Exception -> 0x0052 }
            r6 = r10
            float[] r6 = (float[]) r6     // Catch:{ Exception -> 0x0052 }
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x0052 }
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0069
        L_0x0052:
            r9 = move-exception
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r0 = 0
            java.lang.String r9 = r9.getLocalizedMessage()
            r10[r0] = r9
            q.a.a$b r9 = q.a.a.d
            java.lang.String r0 = "Exception with linear gradient: %s"
            r9.b(r0, r10)
            android.graphics.Shader r9 = new android.graphics.Shader
            r9.<init>()
        L_0x0069:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.v.resize(int, int):android.graphics.Shader");
    }
}
