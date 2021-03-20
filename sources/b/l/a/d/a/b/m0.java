package b.l.a.d.a.b;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final /* synthetic */ class m0 implements u0 {
    public final v0 a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f4579b;
    public final /* synthetic */ int c = 0;

    public m0(v0 v0Var, Bundle bundle) {
        this.a = v0Var;
        this.f4579b = bundle;
    }

    public m0(v0 v0Var, Bundle bundle, byte[] bArr) {
        this.a = v0Var;
        this.f4579b = bundle;
    }

    public final Object a() {
        boolean z;
        t0 t0Var;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        boolean z2 = true;
        if (this.c != 0) {
            v0 v0Var = this.a;
            Bundle bundle = this.f4579b;
            Objects.requireNonNull(v0Var);
            int i2 = bundle.getInt("session_id");
            if (i2 == 0) {
                return bool;
            }
            Map<Integer, s0> map = v0Var.f4639e;
            Integer valueOf = Integer.valueOf(i2);
            boolean z3 = false;
            if (map.containsKey(valueOf)) {
                s0 c2 = v0Var.c(i2);
                int i3 = bundle.getInt(a.R(NotificationCompat.CATEGORY_STATUS, c2.c.a));
                if (e1.g(c2.c.c, i3)) {
                    v0.f4637g.b(3, "Found stale update for session %s with status %d.", new Object[]{valueOf, Integer.valueOf(c2.c.c)});
                    r0 r0Var = c2.c;
                    String str = r0Var.a;
                    int i4 = r0Var.c;
                    if (i4 == 4) {
                        v0Var.f4638b.a().a(i2, str);
                    } else if (i4 == 5) {
                        v0Var.f4638b.a().d(i2);
                    } else if (i4 == 6) {
                        v0Var.f4638b.a().f(Arrays.asList(new String[]{str}));
                    }
                } else {
                    c2.c.c = i3;
                    if (e1.e(i3)) {
                        v0Var.a(i2);
                        v0Var.c.a(c2.c.a);
                    } else {
                        for (t0 next : c2.c.f4618e) {
                            ArrayList parcelableArrayList = bundle.getParcelableArrayList(a.V("chunk_intents", c2.c.a, next.a));
                            if (parcelableArrayList != null) {
                                for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                    if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                        next.d.get(i5).a = true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                String d = v0.d(bundle);
                long j2 = bundle.getLong(a.R("pack_version", d));
                int i6 = bundle.getInt(a.R(NotificationCompat.CATEGORY_STATUS, d));
                long j3 = bundle.getLong(a.R("total_bytes_to_download", d));
                List<String> stringArrayList = bundle.getStringArrayList(a.R("slice_ids", d));
                ArrayList arrayList = new ArrayList();
                if (stringArrayList == null) {
                    stringArrayList = Collections.emptyList();
                }
                for (String str2 : stringArrayList) {
                    List<Intent> parcelableArrayList2 = bundle.getParcelableArrayList(a.V("chunk_intents", d, str2));
                    ArrayList arrayList2 = new ArrayList();
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = Collections.emptyList();
                    }
                    for (Intent intent : parcelableArrayList2) {
                        if (intent == null) {
                            z2 = z3;
                        }
                        arrayList2.add(new q0(z2));
                        z2 = true;
                        z3 = false;
                    }
                    String string = bundle.getString(a.V("uncompressed_hash_sha256", d, str2));
                    long j4 = bundle.getLong(a.V("uncompressed_size", d, str2));
                    int i7 = bundle.getInt(a.V("patch_format", d, str2), 0);
                    if (i7 != 0) {
                        t0Var = new t0(str2, string, j4, arrayList2, 0, i7);
                        z = false;
                    } else {
                        z = false;
                        t0Var = new t0(str2, string, j4, arrayList2, bundle.getInt(a.V("compression_format", d, str2), 0), 0);
                    }
                    arrayList.add(t0Var);
                    z3 = z;
                    z2 = true;
                }
                v0Var.f4639e.put(Integer.valueOf(i2), new s0(i2, bundle.getInt("app_version_code"), new r0(d, j2, i6, j3, arrayList)));
            }
            return bool2;
        }
        v0 v0Var2 = this.a;
        Bundle bundle2 = this.f4579b;
        Objects.requireNonNull(v0Var2);
        int i8 = bundle2.getInt("session_id");
        if (i8 != 0) {
            Map<Integer, s0> map2 = v0Var2.f4639e;
            Integer valueOf2 = Integer.valueOf(i8);
            if (map2.containsKey(valueOf2)) {
                s0 s0Var = v0Var2.f4639e.get(valueOf2);
                if (s0Var.c.c == 6) {
                    return bool;
                }
                return Boolean.valueOf(!e1.g(s0Var.c.c, bundle2.getInt(a.R(NotificationCompat.CATEGORY_STATUS, v0.d(bundle2)))));
            }
        }
        return bool2;
    }
}
