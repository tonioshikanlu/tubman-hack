package b.a.a.d;

import android.content.SharedPreferences;
import android.widget.RelativeLayout;
import b.a.a.h.o;
import b.a.a.n.f;
import b.f.a.e;
import b.l.a.c.k.c;
import b.l.a.c.k.h;
import b.l.d.o.q;
import com.appfoundry.previewer.activities.BravoActivity;
import e.x.c.i;

public final class g<TResult> implements c<q> {
    public final /* synthetic */ BravoActivity a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f226b;

    public static final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ g f227h;

        public a(g gVar) {
            this.f227h = gVar;
        }

        public final void run() {
            RelativeLayout relativeLayout = this.f227h.f226b;
            if (relativeLayout != null) {
                o.e(relativeLayout);
            }
        }
    }

    public g(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
        this.a = bravoActivity;
        this.f226b = relativeLayout;
    }

    public final void c(h<q> hVar) {
        i.e(hVar, "task");
        String str = null;
        if (hVar.n()) {
            e.w0();
            q j2 = hVar.j();
            if (j2 != null) {
                str = j2.a;
            }
            if (str != null) {
                SharedPreferences sharedPreferences = e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                String str2 = e.c().getPackageName() + f.g() + "firebase_id_token";
                i.e(str2, "key");
                i.e(str, "value");
                sharedPreferences.edit().putString(str2, str).apply();
            }
            BravoActivity bravoActivity = this.a;
            int i2 = BravoActivity.t;
            bravoActivity.t(str);
            return;
        }
        this.a.runOnUiThread(new a(this));
        Object[] objArr = new Object[1];
        Exception i3 = hVar.i();
        objArr[0] = i3 != null ? i3.getLocalizedMessage() : null;
        q.a.a.d.b("getIdToken:failure %s", objArr);
        BravoActivity bravoActivity2 = this.a;
        Exception i4 = hVar.i();
        if (i4 != null) {
            str = i4.getLocalizedMessage();
        }
        e.J0(bravoActivity2, "getIdToken failed", str, 0, 4);
    }
}
