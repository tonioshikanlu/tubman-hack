package b.o;

import android.content.Context;
import androidx.annotation.NonNull;
import b.o.i2;
import b.o.u3;
import com.huawei.hms.common.ApiException;

public class z3 implements u3 {

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Context f6367h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ u3.a f6368i;

        public a(Context context, u3.a aVar) {
            this.f6367h = context;
            this.f6368i = aVar;
        }

        public void run() {
            try {
                z3.this.b(this.f6367h, this.f6368i);
            } catch (ApiException e2) {
                i2.a(i2.k.ERROR, "HMS ApiException getting Huawei push token!", e2);
                ((i2.d) this.f6368i).a((String) null, e2.getStatusCode() == 907135000 ? -26 : -27);
            }
        }
    }

    public void a(@NonNull Context context, String str, @NonNull u3.a aVar) {
        new Thread(new a(context, aVar), "OS_HMS_GET_TOKEN").start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.NonNull b.o.u3.a r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = b.o.f2.i()     // Catch:{ all -> 0x0068 }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = b.o.f2.l()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r2 = 0
            if (r0 != 0) goto L_0x001d
            r6 = -28
            b.o.i2$d r7 = (b.o.i2.d) r7
            r7.a(r2, r6)     // Catch:{ all -> 0x0068 }
            monitor-exit(r5)
            return
        L_0x001d:
            com.huawei.agconnect.config.AGConnectServicesConfig r0 = com.huawei.agconnect.config.AGConnectServicesConfig.fromContext(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "client/app_id"
            java.lang.String r0 = r0.getString(r3)     // Catch:{ all -> 0x0068 }
            com.huawei.hms.aaid.HmsInstanceId r6 = com.huawei.hms.aaid.HmsInstanceId.getInstance(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = "HCM"
            java.lang.String r6 = r6.getToken(r0, r3)     // Catch:{ all -> 0x0068 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0053
            b.o.i2$k r0 = b.o.i2.k.INFO     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            r3.<init>()     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "Device registered for HMS, push token = "
            r3.append(r4)     // Catch:{ all -> 0x0068 }
            r3.append(r6)     // Catch:{ all -> 0x0068 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0068 }
            b.o.i2.a(r0, r3, r2)     // Catch:{ all -> 0x0068 }
            b.o.i2$d r7 = (b.o.i2.d) r7
            r7.a(r6, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0066
        L_0x0053:
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0058:
            b.o.i2$k r6 = b.o.i2.k.ERROR     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "HmsMessageServiceOneSignal.onNewToken timed out."
            b.o.i2.a(r6, r0, r2)     // Catch:{ all -> 0x0068 }
            r6 = -25
            b.o.i2$d r7 = (b.o.i2.d) r7     // Catch:{ all -> 0x0068 }
            r7.a(r2, r6)     // Catch:{ all -> 0x0068 }
        L_0x0066:
            monitor-exit(r5)
            return
        L_0x0068:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.z3.b(android.content.Context, b.o.u3$a):void");
    }
}
