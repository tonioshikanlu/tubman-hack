package es.voghdev.pdfviewpager.library.subscaleview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import j.a.a.a.e.g.d;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SkiaImageRegionDecoder implements d {
    public BitmapRegionDecoder a;

    /* renamed from: b  reason: collision with root package name */
    public final ReadWriteLock f8026b = new ReentrantReadWriteLock(true);
    public final Bitmap.Config c;

    @Keep
    public SkiaImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        this.c = preferredBitmapConfig == null ? Bitmap.Config.RGB_565 : preferredBitmapConfig;
    }

    public synchronized boolean a() {
        BitmapRegionDecoder bitmapRegionDecoder;
        bitmapRegionDecoder = this.a;
        return bitmapRegionDecoder != null && !bitmapRegionDecoder.isRecycled();
    }

    @NonNull
    public Bitmap b(@NonNull Rect rect, int i2) {
        d().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.a;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i2;
            options.inPreferredConfig = this.c;
            Bitmap decodeRegion = this.a.decodeRegion(rect, options);
            if (decodeRegion != null) {
                return decodeRegion;
            }
            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
        } finally {
            d().unlock();
        }
    }

    @NonNull
    public Point c(Context context, @NonNull Uri uri) {
        BitmapRegionDecoder bitmapRegionDecoder;
        InputStream inputStream;
        int i2;
        String uri2 = uri.toString();
        if (uri2.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size != 2 || !pathSegments.get(0).equals("drawable")) {
                if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i2 = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                    }
                }
                i2 = 0;
            } else {
                i2 = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            }
            inputStream = context.getResources().openRawResource(i2);
        } else if (uri2.startsWith("file:///android_asset/")) {
            inputStream = context.getAssets().open(uri2.substring(22), 1);
        } else if (uri2.startsWith("file://")) {
            bitmapRegionDecoder = BitmapRegionDecoder.newInstance(uri2.substring(7), false);
            this.a = bitmapRegionDecoder;
            return new Point(this.a.getWidth(), this.a.getHeight());
        } else {
            InputStream inputStream2 = null;
            try {
                inputStream2 = context.getContentResolver().openInputStream(uri);
                this.a = BitmapRegionDecoder.newInstance(inputStream2, false);
                return new Point(this.a.getWidth(), this.a.getHeight());
            } finally {
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        bitmapRegionDecoder = BitmapRegionDecoder.newInstance(inputStream, false);
        this.a = bitmapRegionDecoder;
        return new Point(this.a.getWidth(), this.a.getHeight());
    }

    public final Lock d() {
        return this.f8026b.readLock();
    }

    public synchronized void recycle() {
        this.f8026b.writeLock().lock();
        try {
            this.a.recycle();
            this.a = null;
        } finally {
            this.f8026b.writeLock().unlock();
        }
    }
}
