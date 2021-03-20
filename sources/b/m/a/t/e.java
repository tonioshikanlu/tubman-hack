package b.m.a.t;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.f.x.a.b;
import b.m.a.j;
import b.m.a.r;
import b.m.a.s;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class e {

    /* renamed from: n  reason: collision with root package name */
    public static final String f5959n = "e";
    public Camera a;

    /* renamed from: b  reason: collision with root package name */
    public Camera.CameraInfo f5960b;
    public a c;
    public b d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5961e;
    public String f;

    /* renamed from: g  reason: collision with root package name */
    public f f5962g = new f();

    /* renamed from: h  reason: collision with root package name */
    public j f5963h;

    /* renamed from: i  reason: collision with root package name */
    public r f5964i;

    /* renamed from: j  reason: collision with root package name */
    public r f5965j;

    /* renamed from: k  reason: collision with root package name */
    public int f5966k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Context f5967l;

    /* renamed from: m  reason: collision with root package name */
    public final a f5968m;

    public final class a implements Camera.PreviewCallback {
        public m a;

        /* renamed from: b  reason: collision with root package name */
        public r f5969b;

        public a() {
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e2;
            r rVar = this.f5969b;
            m mVar = this.a;
            if (rVar == null || mVar == null) {
                Log.d(e.f5959n, "Got preview callback, but no handler or resolution available");
                if (mVar != null) {
                    e2 = new Exception("No resolution available");
                } else {
                    return;
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    s sVar = new s(bArr2, rVar.f5930h, rVar.f5931i, camera.getParameters().getPreviewFormat(), e.this.f5966k);
                    if (e.this.f5960b.facing == 1) {
                        sVar.f5933e = true;
                    }
                    j.b bVar = (j.b) mVar;
                    synchronized (j.this.f5924h) {
                        j jVar = j.this;
                        if (jVar.f5923g) {
                            jVar.c.obtainMessage(R.id.zxing_decode, sVar).sendToTarget();
                        }
                    }
                    return;
                } catch (RuntimeException e3) {
                    e2 = e3;
                    Log.e(e.f5959n, "Camera preview failed", e2);
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
            ((j.b) mVar).a(e2);
        }
    }

    public e(Context context) {
        this.f5967l = context;
        this.f5968m = new a();
    }

    public final int a() {
        int i2 = this.f5963h.f5974b;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = 90;
            } else if (i2 == 2) {
                i3 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
            } else if (i2 == 3) {
                i3 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f5960b;
        int i4 = cameraInfo.facing;
        int i5 = cameraInfo.orientation;
        int i6 = (i4 == 1 ? 360 - ((i5 + i3) % 360) : (i5 - i3) + 360) % 360;
        String str = f5959n;
        Log.i(str, "Camera Display Orientation: " + i6);
        return i6;
    }

    public void b() {
        if (this.a != null) {
            try {
                int a2 = a();
                this.f5966k = a2;
                this.a.setDisplayOrientation(a2);
            } catch (Exception unused) {
                Log.w(f5959n, "Failed to set rotation.");
            }
            try {
                e(false);
            } catch (Exception unused2) {
                try {
                    e(true);
                } catch (Exception unused3) {
                    Log.w(f5959n, "Camera rejected even safe-mode parameters! No configuration");
                }
            }
            Camera.Size previewSize = this.a.getParameters().getPreviewSize();
            if (previewSize == null) {
                this.f5965j = this.f5964i;
            } else {
                this.f5965j = new r(previewSize.width, previewSize.height);
            }
            this.f5968m.f5969b = this.f5965j;
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    public boolean c() {
        int i2 = this.f5966k;
        if (i2 != -1) {
            return i2 % BaseTransientBottomBar.ANIMATION_FADE_DURATION != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public void d() {
        int a2 = b.l.f.x.a.i.b.a.a(this.f5962g.a);
        Camera open = a2 == -1 ? null : Camera.open(a2);
        this.a = open;
        if (open != null) {
            int a3 = b.l.f.x.a.i.b.a.a(this.f5962g.a);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f5960b = cameraInfo;
            Camera.getCameraInfo(a3, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    public final void e(boolean z) {
        String str;
        String str2;
        Camera.Parameters parameters = this.a.getParameters();
        String str3 = this.f;
        if (str3 == null) {
            this.f = parameters.flatten();
        } else {
            parameters.unflatten(str3);
        }
        if (parameters == null) {
            Log.w(f5959n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str4 = f5959n;
        StringBuilder y = b.e.a.a.a.y("Initial camera parameters: ");
        y.append(parameters.flatten());
        Log.i(str4, y.toString());
        if (z) {
            Log.w(str4, "In camera config safe mode -- most settings will not be honored");
        }
        Objects.requireNonNull(this.f5962g);
        int i2 = b.l.f.x.a.i.a.a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String a2 = b.l.f.x.a.i.a.a("focus mode", supportedFocusModes, "auto");
        if (!z && a2 == null) {
            a2 = b.l.f.x.a.i.a.a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (a2 != null) {
            if (a2.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to " + a2);
            } else {
                parameters.setFocusMode(a2);
            }
        }
        if (!z) {
            b.l.f.x.a.i.a.b(parameters, false);
            Objects.requireNonNull(this.f5962g);
            Objects.requireNonNull(this.f5962g);
            Objects.requireNonNull(this.f5962g);
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new r(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size next : supportedPreviewSizes) {
                arrayList.add(new r(next.width, next.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.f5964i = null;
        } else {
            j jVar = this.f5963h;
            boolean c2 = c();
            r rVar = jVar.a;
            if (rVar == null) {
                rVar = null;
            } else if (c2) {
                rVar = new r(rVar.f5931i, rVar.f5930h);
            }
            o oVar = jVar.c;
            Objects.requireNonNull(oVar);
            if (rVar != null) {
                Collections.sort(arrayList, new n(oVar, rVar));
            }
            String str5 = o.a;
            Log.i(str5, "Viewfinder size: " + rVar);
            Log.i(str5, "Preview in order of preference: " + arrayList);
            r rVar2 = (r) arrayList.get(0);
            this.f5964i = rVar2;
            parameters.setPreviewSize(rVar2.f5930h, rVar2.f5931i);
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder y2 = b.e.a.a.a.y("Supported FPS ranges: ");
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                str = "[]";
            } else {
                StringBuilder v = b.e.a.a.a.v('[');
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    v.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        v.append(", ");
                    }
                }
                v.append(']');
                str = v.toString();
            }
            y2.append(str);
            Log.i("CameraConfiguration", y2.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next2 = it2.next();
                    int i3 = next2[0];
                    int i4 = next2[1];
                    if (i3 >= 10000 && i4 <= 20000) {
                        iArr = next2;
                        break;
                    }
                }
                if (iArr == null) {
                    str2 = "No suitable FPS range?";
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        StringBuilder y3 = b.e.a.a.a.y("FPS range already set to ");
                        y3.append(Arrays.toString(iArr));
                        str2 = y3.toString();
                    } else {
                        StringBuilder y4 = b.e.a.a.a.y("Setting FPS range to ");
                        y4.append(Arrays.toString(iArr));
                        Log.i("CameraConfiguration", y4.toString());
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
                Log.i("CameraConfiguration", str2);
            }
        }
        String str6 = f5959n;
        StringBuilder y5 = b.e.a.a.a.y("Final camera parameters: ");
        y5.append(parameters.flatten());
        Log.i(str6, y5.toString());
        this.a.setParameters(parameters);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r0 = r0.getFlashMode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(boolean r4) {
        /*
            r3 = this;
            android.hardware.Camera r0 = r3.a
            if (r0 == 0) goto L_0x0052
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ RuntimeException -> 0x004a }
            r1 = 0
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r0.getFlashMode()     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = "on"
            boolean r2 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x004a }
            if (r2 != 0) goto L_0x0021
            java.lang.String r2 = "torch"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x0023
        L_0x0021:
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r4 == r0) goto L_0x0052
            b.m.a.t.a r0 = r3.c     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x002d
            r0.c()     // Catch:{ RuntimeException -> 0x004a }
        L_0x002d:
            android.hardware.Camera r0 = r3.a     // Catch:{ RuntimeException -> 0x004a }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ RuntimeException -> 0x004a }
            b.l.f.x.a.i.a.b(r0, r4)     // Catch:{ RuntimeException -> 0x004a }
            b.m.a.t.f r4 = r3.f5962g     // Catch:{ RuntimeException -> 0x004a }
            java.util.Objects.requireNonNull(r4)     // Catch:{ RuntimeException -> 0x004a }
            android.hardware.Camera r4 = r3.a     // Catch:{ RuntimeException -> 0x004a }
            r4.setParameters(r0)     // Catch:{ RuntimeException -> 0x004a }
            b.m.a.t.a r4 = r3.c     // Catch:{ RuntimeException -> 0x004a }
            if (r4 == 0) goto L_0x0052
            r4.a = r1     // Catch:{ RuntimeException -> 0x004a }
            r4.b()     // Catch:{ RuntimeException -> 0x004a }
            goto L_0x0052
        L_0x004a:
            r4 = move-exception
            java.lang.String r0 = f5959n
            java.lang.String r1 = "Failed to set torch"
            android.util.Log.e(r0, r1, r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.m.a.t.e.f(boolean):void");
    }

    public void g() {
        Camera camera = this.a;
        if (camera != null && !this.f5961e) {
            camera.startPreview();
            this.f5961e = true;
            this.c = new a(this.a, this.f5962g);
            Context context = this.f5967l;
            f fVar = this.f5962g;
            this.d = new b(context, this, fVar);
            Objects.requireNonNull(fVar);
        }
    }
}
