package b.l.f.x.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.amplitude.api.Constants;

public final class f {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final BroadcastReceiver f5804b;
    public boolean c = false;
    public Handler d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f5805e;
    public boolean f;

    public final class b extends BroadcastReceiver {

        public class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ boolean f5806h;

            public a(boolean z) {
                this.f5806h = z;
            }

            public void run() {
                f fVar = f.this;
                fVar.f = this.f5806h;
                if (fVar.c) {
                    fVar.d.removeCallbacksAndMessages((Object) null);
                    if (fVar.f) {
                        fVar.d.postDelayed(fVar.f5805e, Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS);
                    }
                }
            }
        }

        public b(a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                f.this.d.post(new a(intent.getIntExtra("plugged", -1) <= 0));
            }
        }
    }

    public f(Context context, Runnable runnable) {
        this.a = context;
        this.f5805e = runnable;
        this.f5804b = new b((a) null);
        this.d = new Handler();
    }

    public void a() {
        this.d.removeCallbacksAndMessages((Object) null);
        if (this.c) {
            this.a.unregisterReceiver(this.f5804b);
            this.c = false;
        }
    }
}
