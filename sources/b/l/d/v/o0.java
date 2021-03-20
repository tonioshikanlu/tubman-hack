package b.l.d.v;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Objects;

public class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new n0();

    /* renamed from: h  reason: collision with root package name */
    public Messenger f5331h;

    public static final class a extends ClassLoader {
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.n()) {
                return o0.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return o0.class;
        }
    }

    public o0(IBinder iBinder) {
        this.f5331h = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f5331h;
        Objects.requireNonNull(messenger);
        return messenger.getBinder();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((o0) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f5331h;
        Objects.requireNonNull(messenger);
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
