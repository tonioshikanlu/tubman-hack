package b.l.a.d.a.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.l.a.d.a.b.h;
import b.l.a.d.a.b.m;

public abstract class r0 extends h0 implements s0 {
    public r0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    public final boolean g(int i2, Parcel parcel) {
        switch (i2) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) i0.a(parcel, Bundle.CREATOR);
                ((h) this).f4549b.c.b();
                m.f.b(4, "onStartDownload(%d)", new Object[]{Integer.valueOf(readInt)});
                break;
            case 3:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) i0.a(parcel, Bundle.CREATOR);
                ((h) this).f4549b.c.b();
                m.f.b(4, "onCancelDownload(%d)", new Object[]{Integer.valueOf(readInt2)});
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) i0.a(parcel, Bundle.CREATOR);
                ((h) this).f4549b.c.b();
                m.f.b(4, "onGetSession(%d)", new Object[]{Integer.valueOf(readInt3)});
                break;
            case 5:
                J0(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) i0.a(parcel, creator);
                Bundle bundle5 = (Bundle) i0.a(parcel, creator);
                ((h) this).f4549b.c.b();
                m.f.b(4, "onNotifyChunkTransferred(%s, %s, %d, session=%d)", new Object[]{bundle4.getString("module_name"), bundle4.getString("slice_id"), Integer.valueOf(bundle4.getInt("chunk_number")), Integer.valueOf(bundle4.getInt("session_id"))});
                break;
            case 7:
                s0((Bundle) i0.a(parcel, Bundle.CREATOR));
                break;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) i0.a(parcel, creator2);
                Bundle bundle7 = (Bundle) i0.a(parcel, creator2);
                ((h) this).f4549b.c.b();
                m.f.b(4, "onNotifyModuleCompleted(%s, sessionId=%d)", new Object[]{bundle6.getString("module_name"), Integer.valueOf(bundle6.getInt("session_id"))});
                break;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) i0.a(parcel, creator3);
                ((h) this).f4549b.c.b();
                m.f.b(4, "onNotifySessionFailed(%d)", new Object[]{Integer.valueOf(((Bundle) i0.a(parcel, creator3)).getInt("session_id"))});
                break;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                e0((Bundle) i0.a(parcel, creator4), (Bundle) i0.a(parcel, creator4));
                break;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                u0((Bundle) i0.a(parcel, creator5), (Bundle) i0.a(parcel, creator5));
                break;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) i0.a(parcel, creator6);
                Bundle bundle10 = (Bundle) i0.a(parcel, creator6);
                ((h) this).f4549b.c.b();
                m.f.b(4, "onRequestDownloadInfo()", new Object[0]);
                break;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) i0.a(parcel, creator7);
                Bundle bundle12 = (Bundle) i0.a(parcel, creator7);
                ((h) this).f4549b.c.b();
                m.f.b(4, "onRemoveModule()", new Object[0]);
                break;
            case 15:
                Bundle bundle13 = (Bundle) i0.a(parcel, Bundle.CREATOR);
                ((h) this).f4549b.c.b();
                m.f.b(4, "onCancelDownloads()", new Object[0]);
                break;
            default:
                return false;
        }
        return true;
    }
}
