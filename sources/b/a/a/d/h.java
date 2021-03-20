package b.a.a.d;

import android.widget.RelativeLayout;
import b.a.a.h.o;
import b.f.a.e;
import b.l.b.a.a.b.f;
import com.appfoundry.previewer.activities.BravoActivity;

public final class h implements b.a.a.k.h {
    public final /* synthetic */ BravoActivity a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f228b;

    public static final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ h f229h;

        public a(h hVar) {
            this.f229h = hVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f229h.f228b;
            if (relativeLayout != null) {
                o.e(relativeLayout);
            }
        }
    }

    public static final class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ h f230h;

        public b(h hVar) {
            this.f230h = hVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f230h.f228b;
            if (relativeLayout != null) {
                o.e(relativeLayout);
            }
        }
    }

    public h(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
        this.a = bravoActivity;
        this.f228b = relativeLayout;
    }

    public void a(String str) {
        q.a.a.d.b("AuthHandler: Error logging in: %s", str);
        this.a.runOnUiThread(new a(this));
    }

    public void b(f fVar) {
        Object[] objArr = new Object[1];
        objArr[0] = fVar != null ? fVar.getAccessToken() : null;
        q.a.a.d.a("AuthHandler: AuthToken: = %s", objArr);
        e.w0();
        e.v0(fVar);
        this.a.runOnUiThread(new b(this));
        BravoActivity.d(this.a);
    }
}
