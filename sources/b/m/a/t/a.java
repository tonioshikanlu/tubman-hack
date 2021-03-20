package b.m.a.t;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final String f5934h = "a";

    /* renamed from: i  reason: collision with root package name */
    public static final Collection<String> f5935i;
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5936b;
    public final boolean c;
    public final Camera d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f5937e;
    public final Handler.Callback f;

    /* renamed from: g  reason: collision with root package name */
    public final Camera.AutoFocusCallback f5938g = new b();

    /* renamed from: b.m.a.t.a$a  reason: collision with other inner class name */
    public class C0103a implements Handler.Callback {
        public C0103a() {
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            Objects.requireNonNull(a.this);
            if (i2 != 1) {
                return false;
            }
            a.this.b();
            return true;
        }
    }

    public class b implements Camera.AutoFocusCallback {

        /* renamed from: b.m.a.t.a$b$a  reason: collision with other inner class name */
        public class C0104a implements Runnable {
            public C0104a() {
            }

            public void run() {
                a aVar = a.this;
                aVar.f5936b = false;
                aVar.a();
            }
        }

        public b() {
        }

        public void onAutoFocus(boolean z, Camera camera) {
            a.this.f5937e.post(new C0104a());
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f5935i = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera, f fVar) {
        C0103a aVar = new C0103a();
        this.f = aVar;
        this.f5937e = new Handler(aVar);
        this.d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        Objects.requireNonNull(fVar);
        boolean contains = f5935i.contains(focusMode);
        this.c = contains;
        String str = f5934h;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + contains);
        this.a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.a && !this.f5937e.hasMessages(1)) {
            Handler handler = this.f5937e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000);
        }
    }

    public final void b() {
        if (this.c && !this.a && !this.f5936b) {
            try {
                this.d.autoFocus(this.f5938g);
                this.f5936b = true;
            } catch (RuntimeException e2) {
                Log.w(f5934h, "Unexpected exception while focusing", e2);
                a();
            }
        }
    }

    public void c() {
        this.a = true;
        this.f5936b = false;
        this.f5937e.removeMessages(1);
        if (this.c) {
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e2) {
                Log.w(f5934h, "Unexpected exception while cancelling focusing", e2);
            }
        }
    }
}
