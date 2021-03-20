package b.h.a;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserView;
import b.h.a.m.r;
import b.h.a.m.u.k;
import b.h.a.m.u.m;
import b.h.a.m.v.c0.b;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.d0.i;
import b.h.a.m.v.d0.j;
import b.h.a.m.v.e0.a;
import b.h.a.m.w.a;
import b.h.a.m.w.b;
import b.h.a.m.w.d;
import b.h.a.m.w.e;
import b.h.a.m.w.f;
import b.h.a.m.w.k;
import b.h.a.m.w.s;
import b.h.a.m.w.u;
import b.h.a.m.w.v;
import b.h.a.m.w.w;
import b.h.a.m.w.x;
import b.h.a.m.w.y.a;
import b.h.a.m.w.y.b;
import b.h.a.m.w.y.c;
import b.h.a.m.w.y.d;
import b.h.a.m.w.y.e;
import b.h.a.m.w.y.f;
import b.h.a.m.x.c.a0;
import b.h.a.m.x.c.b0;
import b.h.a.m.x.c.g;
import b.h.a.m.x.c.h;
import b.h.a.m.x.c.k;
import b.h.a.m.x.c.m;
import b.h.a.m.x.c.p;
import b.h.a.m.x.c.t;
import b.h.a.m.x.c.v;
import b.h.a.m.x.c.x;
import b.h.a.m.x.c.y;
import b.h.a.m.x.d.a;
import b.h.a.m.x.e.e;
import b.h.a.m.x.g.j;
import b.h.a.n.l;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c implements ComponentCallbacks2 {

    /* renamed from: p  reason: collision with root package name */
    public static volatile c f465p;

    /* renamed from: q  reason: collision with root package name */
    public static volatile boolean f466q;

    /* renamed from: h  reason: collision with root package name */
    public final d f467h;

    /* renamed from: i  reason: collision with root package name */
    public final i f468i;

    /* renamed from: j  reason: collision with root package name */
    public final e f469j;

    /* renamed from: k  reason: collision with root package name */
    public final g f470k;

    /* renamed from: l  reason: collision with root package name */
    public final b f471l;

    /* renamed from: m  reason: collision with root package name */
    public final l f472m;

    /* renamed from: n  reason: collision with root package name */
    public final b.h.a.n.d f473n;

    /* renamed from: o  reason: collision with root package name */
    public final List<i> f474o = new ArrayList();

    public interface a {
    }

    public c(@NonNull Context context, @NonNull b.h.a.m.v.l lVar, @NonNull i iVar, @NonNull d dVar, @NonNull b bVar, @NonNull l lVar2, @NonNull b.h.a.n.d dVar2, int i2, @NonNull a aVar, @NonNull Map<Class<?>, j<?, ?>> map, @NonNull List<b.h.a.q.d<Object>> list, boolean z, boolean z2) {
        r rVar;
        r rVar2;
        Context context2 = context;
        d dVar3 = dVar;
        b bVar2 = bVar;
        Class<b.h.a.l.a> cls = b.h.a.l.a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.f467h = dVar3;
        this.f471l = bVar2;
        this.f468i = iVar;
        this.f472m = lVar2;
        this.f473n = dVar2;
        Resources resources = context.getResources();
        g gVar = new g();
        this.f470k = gVar;
        k kVar = new k();
        b.h.a.p.b bVar3 = gVar.f500g;
        synchronized (bVar3) {
            bVar3.a.add(kVar);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            p pVar = new p();
            b.h.a.p.b bVar4 = gVar.f500g;
            synchronized (bVar4) {
                bVar4.a.add(pVar);
            }
        }
        List<ImageHeaderParser> e2 = gVar.e();
        b.h.a.m.x.g.a aVar2 = new b.h.a.m.x.g.a(context2, e2, dVar3, bVar2);
        b0 b0Var = new b0(dVar3, new b0.g());
        m mVar = new m(gVar.e(), resources.getDisplayMetrics(), dVar3, bVar2);
        if (!z2 || i3 < 28) {
            rVar = new g(mVar);
            rVar2 = new y(mVar, bVar2);
        } else {
            rVar2 = new t();
            rVar = new h();
        }
        Class<byte[]> cls5 = cls4;
        e eVar = new e(context2);
        int i4 = i3;
        s.c cVar = new s.c(resources);
        s.d dVar4 = new s.d(resources);
        Class<String> cls6 = cls2;
        s.b bVar5 = new s.b(resources);
        s.d dVar5 = dVar4;
        s.a aVar3 = new s.a(resources);
        b.h.a.m.x.c.c cVar2 = new b.h.a.m.x.c.c(bVar2);
        Class<Integer> cls7 = cls3;
        b.h.a.m.x.h.a aVar4 = new b.h.a.m.x.h.a();
        b.h.a.m.x.h.d dVar6 = new b.h.a.m.x.h.d();
        ContentResolver contentResolver = context.getContentResolver();
        s.b bVar6 = bVar5;
        gVar.a(ByteBuffer.class, new b.h.a.m.w.c());
        gVar.a(InputStream.class, new b.h.a.m.w.t(bVar2));
        gVar.d("Bitmap", ByteBuffer.class, Bitmap.class, rVar);
        gVar.d("Bitmap", InputStream.class, Bitmap.class, rVar2);
        gVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar));
        gVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b0Var);
        gVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new b0(dVar3, new b0.c((b0.a) null)));
        v.a<?> aVar5 = v.a.a;
        gVar.c(Bitmap.class, Bitmap.class, aVar5);
        gVar.d("Bitmap", Bitmap.class, Bitmap.class, new a0());
        gVar.b(Bitmap.class, cVar2);
        gVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new b.h.a.m.x.c.a(resources, rVar));
        gVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new b.h.a.m.x.c.a(resources, rVar2));
        gVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new b.h.a.m.x.c.a(resources, b0Var));
        gVar.b(BitmapDrawable.class, new b.h.a.m.x.c.b(dVar3, cVar2));
        gVar.d("Gif", InputStream.class, b.h.a.m.x.g.c.class, new j(e2, aVar2, bVar2));
        gVar.d("Gif", ByteBuffer.class, b.h.a.m.x.g.c.class, aVar2);
        gVar.b(b.h.a.m.x.g.c.class, new b.h.a.m.x.g.d());
        Class<b.h.a.l.a> cls8 = cls;
        gVar.c(cls8, cls8, aVar5);
        gVar.d("Bitmap", cls8, Bitmap.class, new b.h.a.m.x.g.h(dVar3));
        e eVar2 = eVar;
        gVar.d("legacy_append", Uri.class, Drawable.class, eVar2);
        gVar.d("legacy_append", Uri.class, Bitmap.class, new x(eVar2, dVar3));
        gVar.g(new a.C0035a());
        gVar.c(File.class, ByteBuffer.class, new d.b());
        gVar.c(File.class, InputStream.class, new f.e());
        gVar.d("legacy_append", File.class, File.class, new b.h.a.m.x.f.a());
        gVar.c(File.class, ParcelFileDescriptor.class, new f.b());
        gVar.c(File.class, File.class, aVar5);
        gVar.g(new k.a(bVar2));
        gVar.g(new m.a());
        Class cls9 = Integer.TYPE;
        s.c cVar3 = cVar;
        gVar.c(cls9, InputStream.class, cVar3);
        s.b bVar7 = bVar6;
        gVar.c(cls9, ParcelFileDescriptor.class, bVar7);
        Class<Integer> cls10 = cls7;
        gVar.c(cls10, InputStream.class, cVar3);
        gVar.c(cls10, ParcelFileDescriptor.class, bVar7);
        s.d dVar7 = dVar5;
        gVar.c(cls10, Uri.class, dVar7);
        s.a aVar6 = aVar3;
        gVar.c(cls9, AssetFileDescriptor.class, aVar6);
        gVar.c(cls10, AssetFileDescriptor.class, aVar6);
        gVar.c(cls9, Uri.class, dVar7);
        Class<String> cls11 = cls6;
        gVar.c(cls11, InputStream.class, new e.c());
        gVar.c(Uri.class, InputStream.class, new e.c());
        gVar.c(cls11, InputStream.class, new u.c());
        gVar.c(cls11, ParcelFileDescriptor.class, new u.b());
        gVar.c(cls11, AssetFileDescriptor.class, new u.a());
        gVar.c(Uri.class, InputStream.class, new b.a());
        gVar.c(Uri.class, InputStream.class, new a.c(context.getAssets()));
        gVar.c(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        Context context3 = context;
        gVar.c(Uri.class, InputStream.class, new c.a(context3));
        gVar.c(Uri.class, InputStream.class, new d.a(context3));
        if (i4 >= 29) {
            gVar.c(Uri.class, InputStream.class, new e.c(context3));
            gVar.c(Uri.class, ParcelFileDescriptor.class, new e.b(context3));
        }
        ContentResolver contentResolver2 = contentResolver;
        gVar.c(Uri.class, InputStream.class, new w.d(contentResolver2));
        gVar.c(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver2));
        gVar.c(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver2));
        gVar.c(Uri.class, InputStream.class, new x.a());
        gVar.c(URL.class, InputStream.class, new f.a());
        gVar.c(Uri.class, File.class, new k.a(context3));
        gVar.c(b.h.a.m.w.g.class, InputStream.class, new a.C0032a());
        Class<byte[]> cls12 = cls5;
        gVar.c(cls12, ByteBuffer.class, new b.a());
        gVar.c(cls12, InputStream.class, new b.d());
        gVar.c(Uri.class, Uri.class, aVar5);
        gVar.c(Drawable.class, Drawable.class, aVar5);
        gVar.d("legacy_append", Drawable.class, Drawable.class, new b.h.a.m.x.e.f());
        gVar.h(Bitmap.class, BitmapDrawable.class, new b.h.a.m.x.h.b(resources));
        b.h.a.m.x.h.a aVar7 = aVar4;
        gVar.h(Bitmap.class, cls12, aVar7);
        b.h.a.m.x.h.d dVar8 = dVar6;
        gVar.h(Drawable.class, cls12, new b.h.a.m.x.h.c(dVar3, aVar7, dVar8));
        gVar.h(b.h.a.m.x.g.c.class, cls12, dVar8);
        b0 b0Var2 = new b0(dVar3, new b0.d());
        gVar.d("legacy_append", ByteBuffer.class, Bitmap.class, b0Var2);
        gVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new b.h.a.m.x.c.a(resources, b0Var2));
        this.f469j = new e(context, bVar, gVar, new b.h.a.q.h.f(), aVar, map, list, lVar, z, i2);
    }

    @GuardedBy("Glide.class")
    public static void a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        List<b.h.a.o.c> list;
        GeneratedAppGlideModule generatedAppGlideModule2 = generatedAppGlideModule;
        if (!f466q) {
            f466q = true;
            d dVar = new d();
            Context applicationContext = context.getApplicationContext();
            List emptyList = Collections.emptyList();
            if (generatedAppGlideModule2 == null || generatedAppGlideModule.c()) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Loading Glide modules");
                }
                ArrayList arrayList = new ArrayList();
                try {
                    ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                    if (applicationInfo.metaData != null) {
                        if (Log.isLoggable("ManifestParser", 2)) {
                            Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                        }
                        for (String str : applicationInfo.metaData.keySet()) {
                            if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                arrayList.add(b.h.a.o.e.a(str));
                                if (Log.isLoggable("ManifestParser", 3)) {
                                    Log.d("ManifestParser", "Loaded Glide module: " + str);
                                }
                            }
                        }
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Finished loading Glide modules");
                        }
                    } else if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                    list = arrayList;
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
                }
            } else {
                list = emptyList;
            }
            if (generatedAppGlideModule2 != null && !generatedAppGlideModule.d().isEmpty()) {
                Set<Class<?>> d = generatedAppGlideModule.d();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b.h.a.o.c cVar = (b.h.a.o.c) it.next();
                    if (d.contains(cVar.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                for (b.h.a.o.c cVar2 : list) {
                    StringBuilder y = b.e.a.a.a.y("Discovered GlideModule from manifest: ");
                    y.append(cVar2.getClass());
                    Log.d("Glide", y.toString());
                }
            }
            dVar.f483m = generatedAppGlideModule2 != null ? generatedAppGlideModule.e() : null;
            for (b.h.a.o.c a2 : list) {
                a2.a(applicationContext, dVar);
            }
            if (generatedAppGlideModule2 != null) {
                generatedAppGlideModule2.a(applicationContext, dVar);
            }
            a.b bVar = a.b.f676b;
            if (dVar.f == null) {
                int a3 = b.h.a.m.v.e0.a.a();
                if (!TextUtils.isEmpty("source")) {
                    dVar.f = new b.h.a.m.v.e0.a(new ThreadPoolExecutor(a3, a3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0024a("source", bVar, false)));
                } else {
                    throw new IllegalArgumentException(b.e.a.a.a.m("Name must be non-null and non-empty, but given: ", "source"));
                }
            }
            if (dVar.f477g == null) {
                int i2 = b.h.a.m.v.e0.a.f672j;
                if (!TextUtils.isEmpty("disk-cache")) {
                    dVar.f477g = new b.h.a.m.v.e0.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0024a("disk-cache", bVar, true)));
                } else {
                    throw new IllegalArgumentException(b.e.a.a.a.m("Name must be non-null and non-empty, but given: ", "disk-cache"));
                }
            }
            if (dVar.f484n == null) {
                int i3 = b.h.a.m.v.e0.a.a() >= 4 ? 2 : 1;
                if (!TextUtils.isEmpty("animation")) {
                    dVar.f484n = new b.h.a.m.v.e0.a(new ThreadPoolExecutor(i3, i3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0024a("animation", bVar, true)));
                } else {
                    throw new IllegalArgumentException(b.e.a.a.a.m("Name must be non-null and non-empty, but given: ", "animation"));
                }
            }
            if (dVar.f479i == null) {
                dVar.f479i = new b.h.a.m.v.d0.j(new j.a(applicationContext));
            }
            if (dVar.f480j == null) {
                dVar.f480j = new b.h.a.n.f();
            }
            if (dVar.c == null) {
                int i4 = dVar.f479i.a;
                if (i4 > 0) {
                    dVar.c = new b.h.a.m.v.c0.j((long) i4);
                } else {
                    dVar.c = new b.h.a.m.v.c0.e();
                }
            }
            if (dVar.d == null) {
                dVar.d = new b.h.a.m.v.c0.i(dVar.f479i.d);
            }
            if (dVar.f476e == null) {
                dVar.f476e = new b.h.a.m.v.d0.h((long) dVar.f479i.f664b);
            }
            if (dVar.f478h == null) {
                dVar.f478h = new b.h.a.m.v.d0.g(applicationContext);
            }
            if (dVar.f475b == null) {
                dVar.f475b = new b.h.a.m.v.l(dVar.f476e, dVar.f478h, dVar.f477g, dVar.f, new b.h.a.m.v.e0.a(new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, b.h.a.m.v.e0.a.f671i, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.C0024a("source-unlimited", bVar, false))), dVar.f484n, false);
            }
            List<b.h.a.q.d<Object>> list2 = dVar.f485o;
            dVar.f485o = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
            l lVar = new l(dVar.f483m);
            b.h.a.m.v.l lVar2 = dVar.f475b;
            i iVar = dVar.f476e;
            b.h.a.m.v.c0.d dVar2 = dVar.c;
            b.h.a.m.v.c0.b bVar2 = dVar.d;
            b.h.a.n.d dVar3 = dVar.f480j;
            int i5 = dVar.f481k;
            a aVar = dVar.f482l;
            Map<Class<?>, j<?, ?>> map = dVar.a;
            List<b.h.a.q.d<Object>> list3 = dVar.f485o;
            Context context2 = applicationContext;
            c cVar3 = new c(applicationContext, lVar2, iVar, dVar2, bVar2, lVar, dVar3, i5, aVar, map, list3, false, false);
            for (b.h.a.o.c cVar4 : list) {
                try {
                    cVar4.b(context2, cVar3, cVar3.f470k);
                } catch (AbstractMethodError e3) {
                    StringBuilder y2 = b.e.a.a.a.y("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                    y2.append(cVar4.getClass().getName());
                    throw new IllegalStateException(y2.toString(), e3);
                }
            }
            if (generatedAppGlideModule2 != null) {
                generatedAppGlideModule2.b(context2, cVar3, cVar3.f470k);
            }
            context2.registerComponentCallbacks(cVar3);
            f465p = cVar3;
            f466q = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @NonNull
    public static c b(@NonNull Context context) {
        if (f465p == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (InstantiationException e2) {
                c(e2);
                throw null;
            } catch (IllegalAccessException e3) {
                c(e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                c(e4);
                throw null;
            } catch (InvocationTargetException e5) {
                c(e5);
                throw null;
            }
            synchronized (c.class) {
                if (f465p == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f465p;
    }

    public static void c(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    public static i d(@NonNull Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f472m.b(context);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        b.h.a.s.j.a();
        ((b.h.a.s.g) this.f468i).e(0);
        this.f467h.b();
        this.f471l.b();
    }

    public void onTrimMemory(int i2) {
        long j2;
        b.h.a.s.j.a();
        for (i requireNonNull : this.f474o) {
            Objects.requireNonNull(requireNonNull);
        }
        b.h.a.m.v.d0.h hVar = (b.h.a.m.v.d0.h) this.f468i;
        Objects.requireNonNull(hVar);
        if (i2 >= 40) {
            hVar.e(0);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (hVar) {
                j2 = hVar.f1015b;
            }
            hVar.e(j2 / 2);
        }
        this.f467h.a(i2);
        this.f471l.a(i2);
    }
}
