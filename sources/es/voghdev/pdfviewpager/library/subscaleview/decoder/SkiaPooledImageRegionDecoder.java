package es.voghdev.pdfviewpager.library.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import j.a.a.a.e.g.d;
import j.a.a.a.e.g.e;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SkiaPooledImageRegionDecoder implements d {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f8027i = false;
    public a a = new a((e) null);

    /* renamed from: b  reason: collision with root package name */
    public final ReadWriteLock f8028b = new ReentrantReadWriteLock(true);
    public final Bitmap.Config c;
    public Context d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f8029e;
    public long f = RecyclerView.FOREVER_NS;

    /* renamed from: g  reason: collision with root package name */
    public final Point f8030g = new Point(0, 0);

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f8031h = new AtomicBoolean(false);

    public static class a {
        public final Semaphore a = new Semaphore(0, true);

        /* renamed from: b  reason: collision with root package name */
        public final Map<BitmapRegionDecoder, Boolean> f8032b = new ConcurrentHashMap();

        public a(e eVar) {
        }

        public static void a(a aVar, BitmapRegionDecoder bitmapRegionDecoder) {
            boolean z;
            synchronized (aVar) {
                Iterator<Map.Entry<BitmapRegionDecoder, Boolean>> it = aVar.f8032b.entrySet().iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry next = it.next();
                    if (bitmapRegionDecoder == next.getKey()) {
                        if (((Boolean) next.getValue()).booleanValue()) {
                            next.setValue(Boolean.FALSE);
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                aVar.a.release();
            }
        }

        public final BitmapRegionDecoder b() {
            BitmapRegionDecoder bitmapRegionDecoder;
            this.a.acquireUninterruptibly();
            synchronized (this) {
                Iterator<Map.Entry<BitmapRegionDecoder, Boolean>> it = this.f8032b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bitmapRegionDecoder = null;
                        break;
                    }
                    Map.Entry next = it.next();
                    if (!((Boolean) next.getValue()).booleanValue()) {
                        next.setValue(Boolean.TRUE);
                        bitmapRegionDecoder = (BitmapRegionDecoder) next.getKey();
                        break;
                    }
                }
            }
            return bitmapRegionDecoder;
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        this.c = preferredBitmapConfig == null ? Bitmap.Config.RGB_565 : preferredBitmapConfig;
    }

    @Keep
    public static void setDebug(boolean z) {
        f8027i = z;
    }

    public synchronized boolean a() {
        boolean z;
        boolean isEmpty;
        a aVar = this.a;
        if (aVar != null) {
            synchronized (aVar) {
                isEmpty = aVar.f8032b.isEmpty();
            }
            if (!isEmpty) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @NonNull
    public Bitmap b(@NonNull Rect rect, int i2) {
        BitmapRegionDecoder b2;
        d("Decode region " + rect + " on thread " + Thread.currentThread().getName());
        if ((rect.width() < this.f8030g.x || rect.height() < this.f8030g.y) && this.f8031h.compareAndSet(false, true) && this.f < RecyclerView.FOREVER_NS) {
            d("Starting lazy init of additional decoders");
            new e(this).start();
        }
        this.f8028b.readLock().lock();
        try {
            a aVar = this.a;
            if (aVar != null) {
                b2 = aVar.b();
                if (b2 != null) {
                    if (!b2.isRecycled()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = i2;
                        options.inPreferredConfig = this.c;
                        Bitmap decodeRegion = b2.decodeRegion(rect, options);
                        if (decodeRegion != null) {
                            a.a(this.a, b2);
                            this.f8028b.readLock().unlock();
                            return decodeRegion;
                        }
                        throw new RuntimeException("null bitmap - image format may not be supported");
                    }
                }
                if (b2 != null) {
                    a.a(this.a, b2);
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } catch (Throwable th) {
            this.f8028b.readLock().unlock();
            throw th;
        }
    }

    @NonNull
    public Point c(Context context, @NonNull Uri uri) {
        this.d = context;
        this.f8029e = uri;
        e();
        return this.f8030g;
    }

    public final void d(String str) {
        if (f8027i) {
            Log.d("SkiaPooledImageRegionDecoder", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013e, code lost:
        r10.f8028b.writeLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0147, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0121 A[Catch:{ all -> 0x013d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r10 = this;
            android.net.Uri r0 = r10.f8029e
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "android.resource://"
            boolean r1 = r0.startsWith(r1)
            r2 = 1
            r3 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L_0x0093
            android.net.Uri r0 = r10.f8029e
            java.lang.String r0 = r0.getAuthority()
            android.content.Context r1 = r10.d
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x002e
            android.content.Context r1 = r10.d
            android.content.res.Resources r1 = r1.getResources()
            goto L_0x0038
        L_0x002e:
            android.content.Context r1 = r10.d
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.res.Resources r1 = r1.getResourcesForApplication(r0)
        L_0x0038:
            android.net.Uri r6 = r10.f8029e
            java.util.List r6 = r6.getPathSegments()
            int r7 = r6.size()
            r8 = 2
            if (r7 != r8) goto L_0x0060
            java.lang.Object r8 = r6.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "drawable"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0060
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = "drawable"
            int r0 = r1.getIdentifier(r2, r6, r0)
            goto L_0x007a
        L_0x0060:
            if (r7 != r2) goto L_0x0079
            java.lang.Object r0 = r6.get(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isDigitsOnly(r0)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r6.get(r3)     // Catch:{ NumberFormatException -> 0x0079 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x0079 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0079 }
            goto L_0x007a
        L_0x0079:
            r0 = r3
        L_0x007a:
            android.content.Context r1 = r10.d     // Catch:{ Exception -> 0x0088 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x0088 }
            android.content.res.AssetFileDescriptor r1 = r1.openRawResourceFd(r0)     // Catch:{ Exception -> 0x0088 }
            long r4 = r1.getLength()     // Catch:{ Exception -> 0x0088 }
        L_0x0088:
            android.content.Context r1 = r10.d
            android.content.res.Resources r1 = r1.getResources()
            java.io.InputStream r0 = r1.openRawResource(r0)
            goto L_0x00b9
        L_0x0093:
            java.lang.String r1 = "file:///android_asset/"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x00be
            r1 = 22
            java.lang.String r0 = r0.substring(r1)
            android.content.Context r1 = r10.d     // Catch:{ Exception -> 0x00af }
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch:{ Exception -> 0x00af }
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r0)     // Catch:{ Exception -> 0x00af }
            long r4 = r1.getLength()     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            android.content.Context r1 = r10.d
            android.content.res.AssetManager r1 = r1.getAssets()
            java.io.InputStream r0 = r1.open(r0, r2)
        L_0x00b9:
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r0, r3)
            goto L_0x0105
        L_0x00be:
            java.lang.String r1 = "file://"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x00e0
            r1 = 7
            java.lang.String r1 = r0.substring(r1)
            android.graphics.BitmapRegionDecoder r1 = android.graphics.BitmapRegionDecoder.newInstance(r1, r3)
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00de }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00de }
            boolean r0 = r2.exists()     // Catch:{ Exception -> 0x00de }
            if (r0 == 0) goto L_0x00de
            long r4 = r2.length()     // Catch:{ Exception -> 0x00de }
        L_0x00de:
            r0 = r1
            goto L_0x0105
        L_0x00e0:
            r0 = 0
            android.content.Context r1 = r10.d     // Catch:{ all -> 0x0148 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x0148 }
            android.net.Uri r2 = r10.f8029e     // Catch:{ all -> 0x0148 }
            java.io.InputStream r0 = r1.openInputStream(r2)     // Catch:{ all -> 0x0148 }
            android.graphics.BitmapRegionDecoder r2 = android.graphics.BitmapRegionDecoder.newInstance(r0, r3)     // Catch:{ all -> 0x0148 }
            android.net.Uri r3 = r10.f8029e     // Catch:{ Exception -> 0x00ff }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r1 = r1.openAssetFileDescriptor(r3, r6)     // Catch:{ Exception -> 0x00ff }
            if (r1 == 0) goto L_0x00ff
            long r4 = r1.getLength()     // Catch:{ Exception -> 0x00ff }
        L_0x00ff:
            if (r0 == 0) goto L_0x0104
            r0.close()     // Catch:{ Exception -> 0x0104 }
        L_0x0104:
            r0 = r2
        L_0x0105:
            r10.f = r4
            android.graphics.Point r1 = r10.f8030g
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r1.set(r2, r3)
            java.util.concurrent.locks.ReadWriteLock r1 = r10.f8028b
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder$a r1 = r10.a     // Catch:{ all -> 0x013d }
            if (r1 == 0) goto L_0x0133
            monitor-enter(r1)     // Catch:{ all -> 0x013d }
            java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean> r2 = r1.f8032b     // Catch:{ all -> 0x0130 }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0130 }
            r2.put(r0, r3)     // Catch:{ all -> 0x0130 }
            java.util.concurrent.Semaphore r0 = r1.a     // Catch:{ all -> 0x0130 }
            r0.release()     // Catch:{ all -> 0x0130 }
            monitor-exit(r1)     // Catch:{ all -> 0x013d }
            goto L_0x0133
        L_0x0130:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x0133:
            java.util.concurrent.locks.ReadWriteLock r0 = r10.f8028b
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L_0x013d:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r10.f8028b
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
        L_0x0148:
            r1 = move-exception
            if (r0 == 0) goto L_0x014e
            r0.close()     // Catch:{ Exception -> 0x014e }
        L_0x014e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder.e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f8028b.writeLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void recycle() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.locks.ReadWriteLock r0 = r3.f8028b     // Catch:{ all -> 0x0046 }
            java.util.concurrent.locks.Lock r0 = r0.writeLock()     // Catch:{ all -> 0x0046 }
            r0.lock()     // Catch:{ all -> 0x0046 }
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder$a r0 = r3.a     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0030
            monitor-enter(r0)     // Catch:{ all -> 0x003b }
        L_0x000f:
            java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean> r1 = r0.f8032b     // Catch:{ all -> 0x002d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0024
            android.graphics.BitmapRegionDecoder r1 = r0.b()     // Catch:{ all -> 0x002d }
            r1.recycle()     // Catch:{ all -> 0x002d }
            java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean> r2 = r0.f8032b     // Catch:{ all -> 0x002d }
            r2.remove(r1)     // Catch:{ all -> 0x002d }
            goto L_0x000f
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            r0 = 0
            r3.a = r0     // Catch:{ all -> 0x003b }
            r3.d = r0     // Catch:{ all -> 0x003b }
            r3.f8029e = r0     // Catch:{ all -> 0x003b }
            goto L_0x0030
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x0030:
            java.util.concurrent.locks.ReadWriteLock r0 = r3.f8028b     // Catch:{ all -> 0x0046 }
            java.util.concurrent.locks.Lock r0 = r0.writeLock()     // Catch:{ all -> 0x0046 }
            r0.unlock()     // Catch:{ all -> 0x0046 }
            monitor-exit(r3)
            return
        L_0x003b:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r3.f8028b     // Catch:{ all -> 0x0046 }
            java.util.concurrent.locks.Lock r1 = r1.writeLock()     // Catch:{ all -> 0x0046 }
            r1.unlock()     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder.recycle():void");
    }
}
