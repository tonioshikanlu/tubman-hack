package b.l.d.o.e0;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.segment.analytics.integrations.BasePayload;
import java.util.Objects;

public final class x {

    /* renamed from: b  reason: collision with root package name */
    public static final x f5000b = new x();
    public final r a;

    public x() {
        r rVar = r.f4995b;
        if (m.a == null) {
            m.a = new m();
        }
        this.a = rVar;
    }

    public final void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f7263i);
        edit.putString("statusMessage", status.f7264j);
        edit.putLong(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis());
        edit.commit();
    }

    public final void b(Context context) {
        Objects.requireNonNull(this.a);
        r.a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }
}
