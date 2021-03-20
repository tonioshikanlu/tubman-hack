package b.l.a.a.f;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import b.l.a.a.b;
import b.l.a.a.f.b;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class h {

    @AutoValue.Builder
    public static abstract class a {
        public abstract h a();

        public abstract a b(String str);

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public abstract a c(b bVar);
    }

    public static a a() {
        b.C0054b bVar = new b.C0054b();
        bVar.c(b.l.a.a.b.DEFAULT);
        return bVar;
    }

    public abstract String b();

    @Nullable
    public abstract byte[] c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract b.l.a.a.b d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
