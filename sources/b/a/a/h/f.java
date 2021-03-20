package b.a.a.h;

import android.view.View;

public final class f implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f264h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ View f265i;

    public f(String str, View view) {
        this.f264h = str;
        this.f265i = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f264h
            java.lang.String r1 = "audio:currenttime"
            boolean r0 = e.x.c.i.a(r0, r1)
            if (r0 == 0) goto L_0x002a
            android.view.View r0 = r3.f265i
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            java.util.Objects.requireNonNull(r0, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
            b.a.a.i.g r1 = com.appfoundry.previewer.BravoApp.G
            if (r1 == 0) goto L_0x0026
            android.media.MediaPlayer r1 = r1.c
            if (r1 == 0) goto L_0x0026
            int r1 = r1.getCurrentPosition()
            java.lang.String r1 = b.f.a.e.k0(r1)
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            r0.setText(r1)
        L_0x002a:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            b.a.a.i.g r0 = com.appfoundry.previewer.BravoApp.G
            if (r0 == 0) goto L_0x0039
            android.os.Handler r0 = r0.d
            if (r0 == 0) goto L_0x0039
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r3, r1)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.f.run():void");
    }
}
