package b.l.a.c.c;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b.l.a.c.c.m.j0;
import b.l.a.c.d.b;
import b.l.a.c.d.d;
import b.l.a.c.f.d.a;
import b.l.a.c.f.d.c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class u extends a implements j0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2829b = 0;
    public int a;

    public u(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        b.l.a.c.b.a.j(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] n(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public final b b() {
        return new d(k());
    }

    public final int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        b b2;
        if (obj != null && (obj instanceof j0)) {
            try {
                j0 j0Var = (j0) obj;
                if (j0Var.c() != this.a || (b2 = j0Var.b()) == null) {
                    return false;
                }
                return Arrays.equals(k(), (byte[]) d.n(b2));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final boolean g(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            b b2 = b();
            parcel2.writeNoException();
            c.b(parcel2, b2);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            int i4 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i4);
            return true;
        }
    }

    public int hashCode() {
        return this.a;
    }

    public abstract byte[] k();
}
