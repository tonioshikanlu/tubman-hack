package b.o;

import android.app.AlertDialog;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.o.c0;
import b.o.i2;
import b.o.u0;
import java.util.List;
import java.util.Objects;

public final class m2 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i2.p f6201h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f6202i;

    public class a extends c0.e {
        public a() {
        }

        public void a(c0.d dVar) {
            if (!i2.G("promptLocation()") && dVar != null) {
                o3.e(dVar);
            }
        }

        public void b(i2.s sVar) {
            i2.p pVar = m2.this.f6201h;
            if (pVar != null) {
                u0.d dVar = (u0.d) pVar;
                u0.this.f6305j = null;
                i2.k kVar = i2.k.DEBUG;
                i2.a(kVar, "IAM prompt to handle finished with result: " + sVar, (Throwable) null);
                s0 s0Var = dVar.a;
                if (!s0Var.f6278k || sVar != i2.s.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                    u0.this.w(s0Var, dVar.f6310b);
                    return;
                }
                u0 u0Var = u0.this;
                List list = dVar.f6310b;
                Objects.requireNonNull(u0Var);
                String string = i2.c.getString(R.string.location_not_available_title);
                new AlertDialog.Builder(i2.k()).setTitle(string).setMessage(i2.c.getString(R.string.location_not_available_message)).setPositiveButton(17039370, new x0(u0Var, s0Var, list)).show();
            }
        }

        public c0.f d() {
            return c0.f.PROMPT_LOCATION;
        }
    }

    public m2(i2.p pVar, boolean z) {
        this.f6201h = pVar;
        this.f6202i = z;
    }

    public void run() {
        c0.d(i2.c, true, this.f6202i, new a());
        i2.E = true;
    }
}
