package b.n.a.a;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import b.h.a.g;
import b.h.a.m.w.v;
import b.h.a.o.d;
import b.i.a.f;
import b.n.a.a.e.a;
import b.n.a.a.e.b;
import b.n.a.a.e.e;
import b.n.a.a.e.j;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class c extends d {
    public void b(@NonNull Context context, @NonNull b.h.a.c cVar, @NonNull g gVar) {
        Class<String> cls = String.class;
        Class<f> cls2 = f.class;
        gVar.h(cls2, BitmapDrawable.class, new b(context, cVar));
        gVar.c(cls2, cls2, v.a.a);
        gVar.c(cls, cls, a.a);
        gVar.d("com.kirich1409.svgloader.glide", InputStream.class, cls2, new b.n.a.a.e.d());
        gVar.d("com.kirich1409.svgloader.glide", File.class, cls2, new b.n.a.a.e.c());
        gVar.d("com.kirich1409.svgloader.glide", FileDescriptor.class, cls2, new b());
        gVar.d("com.kirich1409.svgloader.glide", ParcelFileDescriptor.class, cls2, new e());
        gVar.d("com.kirich1409.svgloader.glide", cls2, cls2, new j());
        gVar.d("com.kirich1409.svgloader.glide", ByteBuffer.class, cls2, new a());
        gVar.d("com.kirich1409.svgloader.glide", cls, cls2, new b.n.a.a.e.g());
        gVar.d("com.kirich1409.svgloader.glide", Uri.class, cls2, new b.n.a.a.e.f(context));
    }
}
