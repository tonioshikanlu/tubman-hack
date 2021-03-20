package b.l.a.d.a.a;

import android.app.PendingIntent;
import android.os.Bundle;
import b.l.a.d.a.d.a;
import b.l.a.d.a.e.f;
import b.l.a.d.a.i.n;
import java.io.File;
import java.util.Objects;

public final class o extends m<a> {
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f4460e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(p pVar, n<a> nVar, String str) {
        super(pVar, new f("OnRequestInstallCallback"), nVar);
        this.f4460e = pVar;
        this.d = str;
    }

    public final void X0(Bundle bundle) {
        Bundle bundle2 = bundle;
        this.c.a.b();
        this.a.b(4, "onRequestInfo", new Object[0]);
        if (bundle2.getInt("error.code", -2) != 0) {
            this.f4459b.a(new a(bundle2.getInt("error.code", -2)));
            return;
        }
        n<T> nVar = this.f4459b;
        p pVar = this.f4460e;
        String str = this.d;
        int i2 = bundle2.getInt("version.code", -1);
        int i3 = bundle2.getInt("update.availability");
        int i4 = bundle2.getInt("install.status", 0);
        Integer valueOf = bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness"));
        int i5 = bundle2.getInt("in.app.update.priority", 0);
        long j2 = bundle2.getLong("bytes.downloaded");
        long j3 = bundle2.getLong("total.bytes.to.download");
        long j4 = bundle2.getLong("additional.size.required");
        r rVar = pVar.d;
        Objects.requireNonNull(rVar);
        nVar.b(new s(str, i2, i3, i4, valueOf, i5, j2, j3, j4, r.a(new File(rVar.a.getFilesDir(), "assetpacks")), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent")));
    }
}
