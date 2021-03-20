package b.h.a.m.w.y;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import b.h.a.f;
import b.h.a.m.p;
import b.h.a.m.u.d;
import b.h.a.m.w.n;
import b.h.a.m.w.o;
import b.h.a.m.w.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RequiresApi(29)
public final class e<DataT> implements n<Uri, DataT> {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f829b;
    public final n<Uri, DataT> c;
    public final Class<DataT> d;

    public static abstract class a<DataT> implements o<Uri, DataT> {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f830b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.f830b = cls;
        }

        @NonNull
        public final n<Uri, DataT> b(@NonNull r rVar) {
            return new e(this.a, rVar.b(File.class, this.f830b), rVar.b(Uri.class, this.f830b), this.f830b);
        }
    }

    @RequiresApi(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class d<DataT> implements b.h.a.m.u.d<DataT> {
        public static final String[] r = {"_data"};

        /* renamed from: h  reason: collision with root package name */
        public final Context f831h;

        /* renamed from: i  reason: collision with root package name */
        public final n<File, DataT> f832i;

        /* renamed from: j  reason: collision with root package name */
        public final n<Uri, DataT> f833j;

        /* renamed from: k  reason: collision with root package name */
        public final Uri f834k;

        /* renamed from: l  reason: collision with root package name */
        public final int f835l;

        /* renamed from: m  reason: collision with root package name */
        public final int f836m;

        /* renamed from: n  reason: collision with root package name */
        public final p f837n;

        /* renamed from: o  reason: collision with root package name */
        public final Class<DataT> f838o;

        /* renamed from: p  reason: collision with root package name */
        public volatile boolean f839p;
        @Nullable

        /* renamed from: q  reason: collision with root package name */
        public volatile b.h.a.m.u.d<DataT> f840q;

        public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i2, int i3, p pVar, Class<DataT> cls) {
            this.f831h = context.getApplicationContext();
            this.f832i = nVar;
            this.f833j = nVar2;
            this.f834k = uri;
            this.f835l = i2;
            this.f836m = i3;
            this.f837n = pVar;
            this.f838o = cls;
        }

        @NonNull
        public Class<DataT> a() {
            return this.f838o;
        }

        public void b() {
            b.h.a.m.u.d<DataT> dVar = this.f840q;
            if (dVar != null) {
                dVar.b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        @androidx.annotation.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final b.h.a.m.u.d<DataT> c() {
            /*
                r9 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                if (r0 == 0) goto L_0x007e
                b.h.a.m.w.n<java.io.File, DataT> r0 = r9.f832i
                android.net.Uri r8 = r9.f834k
                android.content.Context r2 = r9.f831h     // Catch:{ all -> 0x0077 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0077 }
                java.lang.String[] r4 = r     // Catch:{ all -> 0x0077 }
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r8
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0077 }
                if (r2 == 0) goto L_0x005d
                boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005d
                java.lang.String r3 = "_data"
                int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0074 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0074 }
                if (r4 != 0) goto L_0x0046
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
                r4.<init>(r3)     // Catch:{ all -> 0x0074 }
                r2.close()
                int r2 = r9.f835l
                int r3 = r9.f836m
                b.h.a.m.p r5 = r9.f837n
                b.h.a.m.w.n$a r0 = r0.a(r4, r2, r3, r5)
                goto L_0x00a2
            L_0x0046:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "File path was empty in media store for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x005d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "Failed to media store entry for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                r1 = r2
                goto L_0x0078
            L_0x0077:
                r0 = move-exception
            L_0x0078:
                if (r1 == 0) goto L_0x007d
                r1.close()
            L_0x007d:
                throw r0
            L_0x007e:
                android.content.Context r0 = r9.f831h
                java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r0.checkSelfPermission(r2)
                if (r0 != 0) goto L_0x008a
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x0094
                android.net.Uri r0 = r9.f834k
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L_0x0096
            L_0x0094:
                android.net.Uri r0 = r9.f834k
            L_0x0096:
                b.h.a.m.w.n<android.net.Uri, DataT> r2 = r9.f833j
                int r3 = r9.f835l
                int r4 = r9.f836m
                b.h.a.m.p r5 = r9.f837n
                b.h.a.m.w.n$a r0 = r2.a(r0, r3, r4, r5)
            L_0x00a2:
                if (r0 == 0) goto L_0x00a6
                b.h.a.m.u.d<Data> r1 = r0.c
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: b.h.a.m.w.y.e.d.c():b.h.a.m.u.d");
        }

        public void cancel() {
            this.f839p = true;
            b.h.a.m.u.d<DataT> dVar = this.f840q;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @NonNull
        public b.h.a.m.a e() {
            return b.h.a.m.a.LOCAL;
        }

        public void f(@NonNull f fVar, @NonNull d.a<? super DataT> aVar) {
            try {
                b.h.a.m.u.d<DataT> c = c();
                if (c == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f834k));
                    return;
                }
                this.f840q = c;
                if (this.f839p) {
                    cancel();
                } else {
                    c.f(fVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.c(e2);
            }
        }
    }

    public e(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.f829b = nVar;
        this.c = nVar2;
        this.d = cls;
    }

    public n.a a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        Uri uri = (Uri) obj;
        return new n.a(new b.h.a.r.b(uri), new d(this.a, this.f829b, this.c, uri, i2, i3, pVar, this.d));
    }

    public boolean b(@NonNull Object obj) {
        return Build.VERSION.SDK_INT >= 29 && b.a.a.n.f.C((Uri) obj);
    }
}
