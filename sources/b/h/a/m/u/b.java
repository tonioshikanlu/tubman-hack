package b.h.a.m.u;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.f;
import b.h.a.m.a;
import b.h.a.m.u.d;
import java.io.IOException;

public abstract class b<T> implements d<T> {

    /* renamed from: h  reason: collision with root package name */
    public final String f590h;

    /* renamed from: i  reason: collision with root package name */
    public final AssetManager f591i;

    /* renamed from: j  reason: collision with root package name */
    public T f592j;

    public b(AssetManager assetManager, String str) {
        this.f591i = assetManager;
        this.f590h = str;
    }

    public void b() {
        T t = this.f592j;
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

    public abstract T d(AssetManager assetManager, String str);

    @NonNull
    public a e() {
        return a.LOCAL;
    }

    public void f(@NonNull f fVar, @NonNull d.a<? super T> aVar) {
        try {
            T d = d(this.f591i, this.f590h);
            this.f592j = d;
            aVar.d(d);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.c(e2);
        }
    }
}
