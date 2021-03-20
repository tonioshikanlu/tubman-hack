package b.l.a.c.d;

import android.os.IBinder;
import android.os.IInterface;

public interface b extends IInterface {

    public static abstract class a extends b.l.a.c.f.d.a implements b {

        /* renamed from: b.l.a.c.d.b$a$a  reason: collision with other inner class name */
        public static class C0064a extends b.l.a.c.f.d.b implements b {
            public C0064a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static b k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof b ? (b) queryLocalInterface : new C0064a(iBinder);
        }
    }
}
