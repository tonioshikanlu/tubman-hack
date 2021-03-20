package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.a;
import b.h.a.c;
import b.h.a.d;
import b.h.a.g;
import b.h.a.n.l;
import com.appfoundry.previewer.custom.SampleGlideModule;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    public final SampleGlideModule a = new SampleGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.appfoundry.previewer.custom.SampleGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.kirich1409.svgloader.glide.SvgModule");
        }
    }

    public void a(@NonNull Context context, @NonNull d dVar) {
        Objects.requireNonNull(this.a);
    }

    public void b(@NonNull Context context, @NonNull c cVar, @NonNull g gVar) {
        new b.n.a.a.c().b(context, cVar, gVar);
        Objects.requireNonNull(this.a);
    }

    public boolean c() {
        Objects.requireNonNull(this.a);
        return false;
    }

    @NonNull
    public Set<Class<?>> d() {
        return Collections.emptySet();
    }

    @NonNull
    public l.b e() {
        return new a();
    }
}
