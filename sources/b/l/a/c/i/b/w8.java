package b.l.a.c.i.b;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import b.l.a.c.c.p.c;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class w8 implements m3 {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d9 f4337b;

    public w8(d9 d9Var, String str) {
        this.f4337b = d9Var;
        this.a = str;
    }

    /* JADX INFO: finally extract failed */
    public final void a(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        j L;
        d9 d9Var = this.f4337b;
        d9Var.f3979j.d().h();
        d9Var.R();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                d9Var.r = false;
                d9Var.E();
                throw th2;
            }
        }
        List<Long> list = d9Var.v;
        d9Var.v = null;
        if (i2 != 200) {
            if (i2 == 204) {
                i2 = 204;
            }
            d9Var.f3979j.a().f4096n.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            u3 u3Var = d9Var.f3979j.q().f;
            Objects.requireNonNull((c) d9Var.f3979j.f4121n);
            u3Var.b(System.currentTimeMillis());
            if (i2 == 503 || i2 == 429) {
                u3 u3Var2 = d9Var.f3979j.q().f4354g;
                Objects.requireNonNull((c) d9Var.f3979j.f4121n);
                u3Var2.b(System.currentTimeMillis());
            }
            d9Var.L().R(list);
            d9Var.D();
            d9Var.r = false;
            d9Var.E();
        }
        if (th == null) {
            try {
                u3 u3Var3 = d9Var.f3979j.q().f4353e;
                Objects.requireNonNull((c) d9Var.f3979j.f4121n);
                u3Var3.b(System.currentTimeMillis());
                d9Var.f3979j.q().f.b(0);
                d9Var.D();
                d9Var.f3979j.a().f4096n.c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                d9Var.L().v();
                try {
                    for (Long next : list) {
                        try {
                            L = d9Var.L();
                            long longValue = next.longValue();
                            L.h();
                            L.i();
                            if (L.y().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            L.a.a().f.b("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        } catch (SQLiteException e3) {
                            List<Long> list2 = d9Var.w;
                            if (list2 == null || !list2.contains(next)) {
                                throw e3;
                            }
                        }
                    }
                    d9Var.L().w();
                    d9Var.L().x();
                    d9Var.w = null;
                    if (!d9Var.K().l() || !d9Var.C()) {
                        d9Var.x = -1;
                        d9Var.D();
                    } else {
                        d9Var.k();
                    }
                    d9Var.f3982m = 0;
                    d9Var.r = false;
                    d9Var.E();
                } catch (Throwable th3) {
                    d9Var.L().x();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                d9Var.f3979j.a().f.b("Database error while trying to delete uploaded bundles", e4);
                Objects.requireNonNull((c) d9Var.f3979j.f4121n);
                d9Var.f3982m = SystemClock.elapsedRealtime();
                d9Var.f3979j.a().f4096n.b("Disable upload, time", Long.valueOf(d9Var.f3982m));
            }
        }
        d9Var.f3979j.a().f4096n.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
        u3 u3Var4 = d9Var.f3979j.q().f;
        Objects.requireNonNull((c) d9Var.f3979j.f4121n);
        u3Var4.b(System.currentTimeMillis());
        u3 u3Var22 = d9Var.f3979j.q().f4354g;
        Objects.requireNonNull((c) d9Var.f3979j.f4121n);
        u3Var22.b(System.currentTimeMillis());
        d9Var.L().R(list);
        d9Var.D();
        d9Var.r = false;
        d9Var.E();
    }
}
