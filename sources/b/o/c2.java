package b.o;

public class c2 {

    /* renamed from: b  reason: collision with root package name */
    public static final String f6042b = "b.o.c2";
    public final b a;

    public interface a {
    }

    public interface b {
        void b();
    }

    public c2(b bVar) {
        this.a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[Catch:{ NoClassDefFoundError -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r9 = this;
            b.o.i2$k r0 = b.o.i2.k.WARN
            android.app.Activity r1 = b.o.i2.k()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = "OSSystemConditionObserver curActivity null"
            b.o.i2.a(r0, r1, r3)
            return r2
        L_0x0010:
            r1 = 1
            android.app.Activity r4 = b.o.i2.k()     // Catch:{ NoClassDefFoundError -> 0x004d }
            boolean r5 = r4 instanceof androidx.appcompat.app.AppCompatActivity     // Catch:{ NoClassDefFoundError -> 0x004d }
            if (r5 == 0) goto L_0x0044
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4     // Catch:{ NoClassDefFoundError -> 0x004d }
            androidx.fragment.app.FragmentManager r4 = r4.getSupportFragmentManager()     // Catch:{ NoClassDefFoundError -> 0x004d }
            b.o.b2 r5 = new b.o.b2     // Catch:{ NoClassDefFoundError -> 0x004d }
            r5.<init>(r9, r4)     // Catch:{ NoClassDefFoundError -> 0x004d }
            r4.registerFragmentLifecycleCallbacks(r5, r1)     // Catch:{ NoClassDefFoundError -> 0x004d }
            java.util.List r4 = r4.getFragments()     // Catch:{ NoClassDefFoundError -> 0x004d }
            int r5 = r4.size()     // Catch:{ NoClassDefFoundError -> 0x004d }
            if (r5 <= 0) goto L_0x0044
            int r5 = r5 - r1
            java.lang.Object r4 = r4.get(r5)     // Catch:{ NoClassDefFoundError -> 0x004d }
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4     // Catch:{ NoClassDefFoundError -> 0x004d }
            boolean r5 = r4.isVisible()     // Catch:{ NoClassDefFoundError -> 0x004d }
            if (r5 == 0) goto L_0x0044
            boolean r4 = r4 instanceof androidx.fragment.app.DialogFragment     // Catch:{ NoClassDefFoundError -> 0x004d }
            if (r4 == 0) goto L_0x0044
            r4 = r1
            goto L_0x0045
        L_0x0044:
            r4 = r2
        L_0x0045:
            if (r4 == 0) goto L_0x0064
            java.lang.String r4 = "OSSystemConditionObserver dialog fragment detected"
            b.o.i2.a(r0, r4, r3)     // Catch:{ NoClassDefFoundError -> 0x004d }
            return r2
        L_0x004d:
            r2 = move-exception
            b.o.i2$k r4 = b.o.i2.k.INFO
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "AppCompatActivity is not used in this app, skipping 'isDialogFragmentShowing' check: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            b.o.i2.a(r4, r2, r3)
        L_0x0064:
            b.o.a r2 = b.o.c.f6028i
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            android.app.Activity r5 = b.o.i2.k()
            r4.<init>(r5)
            boolean r4 = b.o.g2.e(r4)
            if (r4 == 0) goto L_0x00a2
            if (r2 == 0) goto L_0x00a2
            java.lang.String r5 = f6042b
            b.o.c2$b r6 = r9.a
            android.app.Activity r7 = r2.a
            if (r7 == 0) goto L_0x0098
            android.view.Window r7 = r7.getWindow()
            android.view.View r7 = r7.getDecorView()
            android.view.ViewTreeObserver r7 = r7.getViewTreeObserver()
            b.o.a$e r8 = new b.o.a$e
            r8.<init>(r2, r6, r5, r3)
            r7.addOnGlobalLayoutListener(r8)
            java.util.Map<java.lang.String, b.o.a$e> r2 = b.o.a.f5983e
            r2.put(r5, r8)
        L_0x0098:
            java.util.Map<java.lang.String, b.o.c2$b> r2 = b.o.a.d
            r2.put(r5, r6)
            java.lang.String r2 = "OSSystemConditionObserver keyboard up detected"
            b.o.i2.a(r0, r2, r3)
        L_0x00a2:
            r0 = r4 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.c2.a():boolean");
    }
}
