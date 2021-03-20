package b.l.a.d.a.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.core.app.NotificationCompat;
import b.l.a.c.b.a;
import b.l.a.d.a.e.c0;
import b.l.a.d.a.e.f;
import b.l.a.d.a.i.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class d1 implements n2 {

    /* renamed from: g  reason: collision with root package name */
    public static final f f4513g = new f("FakeAssetPackService");
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final q f4514b;
    public final Context c;
    public final p1 d;

    /* renamed from: e  reason: collision with root package name */
    public final c0<Executor> f4515e;
    public final Handler f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public d1(File file, q qVar, k0 k0Var, Context context, p1 p1Var, c0<Executor> c0Var) {
        this.a = file.getAbsolutePath();
        this.f4514b = qVar;
        this.c = context;
        this.d = p1Var;
        this.f4515e = c0Var;
    }

    public static long h(int i2, long j2) {
        if (i2 == 2) {
            return j2 / 2;
        }
        if (i2 == 3 || i2 == 4) {
            return j2;
        }
        return 0;
    }

    public final void a(int i2, String str) {
        f4513g.b(4, "notifyModuleCompleted", new Object[0]);
        this.f4515e.a().execute(new a1(this, i2, str));
    }

    public final r<ParcelFileDescriptor> b(int i2, String str, String str2, int i3) {
        f4513g.b(4, "getChunkFileDescriptor(session=%d, %s, %s, %d)", new Object[]{Integer.valueOf(i2), str, str2, Integer.valueOf(i3)});
        r<ParcelFileDescriptor> rVar = new r<>();
        try {
            for (File file : i(str)) {
                if (a.e(file).equals(str2)) {
                    rVar.a(ParcelFileDescriptor.open(file, 268435456));
                    return rVar;
                }
            }
            throw new b.l.a.d.a.c.a(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e2) {
            f4513g.b(5, "getChunkFileDescriptor failed", new Object[]{e2});
            rVar.d(new b.l.a.d.a.c.a("Asset Slice file not found.", e2));
        } catch (b.l.a.d.a.c.a e3) {
            f4513g.b(5, "getChunkFileDescriptor failed", new Object[]{e3});
            rVar.d(e3);
        }
    }

    public final void c() {
        f4513g.b(4, "keepAlive", new Object[0]);
    }

    public final void d(int i2) {
        f4513g.b(4, "notifySessionFailed", new Object[0]);
    }

    public final r<List<String>> e(Map<String, Long> map) {
        f4513g.b(4, "syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        r<List<String>> rVar = new r<>();
        rVar.a(arrayList);
        return rVar;
    }

    public final void f(List<String> list) {
        f4513g.b(4, "cancelDownload(%s)", new Object[]{list});
    }

    public final void g(int i2, String str, String str2, int i3) {
        f4513g.b(4, "notifyChunkTransferred", new Object[0]);
    }

    public final File[] i(String str) {
        File file = new File(this.a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new b1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File e2 : listFiles) {
                        if (a.e(e2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new b.l.a.d.a.c.a(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new b.l.a.d.a.c.a(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new b.l.a.d.a.c.a(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new b.l.a.d.a.c.a(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    public final void j(int i2, String str, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.d.a());
        bundle.putInt("session_id", i2);
        File[] i4 = i(str);
        ArrayList arrayList = new ArrayList();
        int length = i4.length;
        long j2 = 0;
        int i5 = 0;
        while (i5 < length) {
            File file = i4[i5];
            j2 += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i3 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String e2 = a.e(file);
            bundle.putParcelableArrayList(a.V("chunk_intents", str, e2), arrayList2);
            try {
                bundle.putString(a.V("uncompressed_hash_sha256", str, e2), e1.a(Arrays.asList(new File[]{file})));
                bundle.putLong(a.V("uncompressed_size", str, e2), file.length());
                arrayList.add(e2);
                i5++;
            } catch (NoSuchAlgorithmException e3) {
                throw new b.l.a.d.a.c.a("SHA256 algorithm not supported.", e3);
            } catch (IOException e4) {
                throw new b.l.a.d.a.c.a(String.format("Could not digest file: %s.", new Object[]{file}), e4);
            }
        }
        bundle.putStringArrayList(a.R("slice_ids", str), arrayList);
        bundle.putLong(a.R("pack_version", str), (long) this.d.a());
        bundle.putInt(a.R(NotificationCompat.CATEGORY_STATUS, str), i3);
        bundle.putInt(a.R("error_code", str), 0);
        bundle.putLong(a.R("bytes_downloaded", str), h(i3, j2));
        bundle.putLong(a.R("total_bytes_to_download", str), j2);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", h(i3, j2));
        bundle.putLong("total_bytes_to_download", j2);
        this.f.post(new c1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }
}
