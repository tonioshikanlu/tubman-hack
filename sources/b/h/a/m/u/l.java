package b.h.a.m.u;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.f;
import b.h.a.m.a;
import b.h.a.m.u.d;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l<T> implements d<T> {

    /* renamed from: h  reason: collision with root package name */
    public final Uri f609h;

    /* renamed from: i  reason: collision with root package name */
    public final ContentResolver f610i;

    /* renamed from: j  reason: collision with root package name */
    public T f611j;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f610i = contentResolver;
        this.f609h = uri;
    }

    public void b() {
        T t = this.f611j;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t);

    public void cancel() {
    }

    public abstract T d(Uri uri, ContentResolver contentResolver);

    @NonNull
    public a e() {
        return a.LOCAL;
    }

    public final void f(@NonNull f fVar, @NonNull d.a<? super T> aVar) {
        try {
            T d = d(this.f609h, this.f610i);
            this.f611j = d;
            aVar.d(d);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.c(e2);
        }
    }
}
