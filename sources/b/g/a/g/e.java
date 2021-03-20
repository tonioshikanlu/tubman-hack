package b.g.a.g;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.e.l;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.Map;

public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final String f417h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, String> f418i;

    /* renamed from: j  reason: collision with root package name */
    public h f419j;

    public static class a implements Parcelable.Creator<e> {
        public Object createFromParcel(Parcel parcel) {
            return new e(parcel.readString());
        }

        public Object[] newArray(int i2) {
            return new e[i2];
        }
    }

    static {
        Class<e> cls = e.class;
    }

    public e(@NonNull String str) {
        String[] split = str.split("\\.");
        if (split.length == 2 && str.endsWith(".")) {
            split = new String[]{split[0], split[1], ""};
        }
        if (split.length == 3) {
            this.f418i = (Map) c(a(split[0]), new f(this).f5519b);
            this.f419j = (h) c(a(split[1]), h.class);
            String str2 = split[2];
            this.f417h = str;
            return;
        }
        throw new d(String.format("The token was expected to have 3 parts, but got %s.", new Object[]{Integer.valueOf(split.length)}));
    }

    @Nullable
    public final String a(String str) {
        try {
            return new String(Base64.decode(str, 11), "UTF-8");
        } catch (IllegalArgumentException e2) {
            throw new d("Received bytes didn't correspond to a valid Base64 encoded string.", e2);
        } catch (UnsupportedEncodingException e3) {
            throw new d("Device doesn't support UTF-8 charset encoding.", e3);
        }
    }

    @NonNull
    public b b(@NonNull String str) {
        b bVar = this.f419j.f.get(str);
        return bVar != null ? bVar : new a();
    }

    public final <T> T c(String str, Type type) {
        try {
            l lVar = new l();
            lVar.b(h.class, new g());
            return lVar.a().d(str, type);
        } catch (Exception e2) {
            throw new d("The token's payload had an invalid JSON format.", e2);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f417h;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f417h);
    }
}
