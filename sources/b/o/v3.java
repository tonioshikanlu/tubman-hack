package b.o;

import android.content.Context;
import b.o.i2;
import b.o.u3;
import com.amazon.device.messaging.ADM;
import com.amplitude.api.Constants;

public class v3 implements u3 {
    public static u3.a a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6328b = false;

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Context f6329h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ u3.a f6330i;

        public a(v3 v3Var, Context context, u3.a aVar) {
            this.f6329h = context;
            this.f6330i = aVar;
        }

        public void run() {
            ADM adm = new ADM(this.f6329h);
            String registrationId = adm.getRegistrationId();
            if (registrationId == null) {
                adm.startRegister();
            } else {
                i2.k kVar = i2.k.DEBUG;
                i2.a(kVar, "ADM Already registered with ID:" + registrationId, (Throwable) null);
                ((i2.d) this.f6330i).a(registrationId, 1);
            }
            try {
                Thread.sleep(Constants.EVENT_UPLOAD_PERIOD_MILLIS);
            } catch (InterruptedException unused) {
            }
            if (!v3.f6328b) {
                i2.a(i2.k.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", (Throwable) null);
                v3.b((String) null);
            }
        }
    }

    public static void b(String str) {
        u3.a aVar = a;
        if (aVar != null) {
            f6328b = true;
            ((i2.d) aVar).a(str, 1);
        }
    }

    public void a(Context context, String str, u3.a aVar) {
        a = aVar;
        new Thread(new a(this, context, aVar)).start();
    }
}
