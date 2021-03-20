package b.l.a.d.a.g;

import android.os.IBinder;
import android.os.IInterface;
import b.l.a.d.a.e.a;
import b.l.a.d.a.e.b;
import b.l.a.d.a.e.c;
import b.l.a.d.a.e.l;

public final /* synthetic */ class d implements l {
    public static final l a = new d();

    public final Object a(IBinder iBinder) {
        int i2 = b.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
    }
}
