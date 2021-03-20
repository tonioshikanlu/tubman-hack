package b.l.a.c.c.l;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.annotation.NonNull;
import b.l.a.c.c.l.a.d;
import b.l.a.c.c.l.k.l;
import b.l.a.c.c.m.b;
import b.l.a.c.c.m.n;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

public final class a<O extends d> {
    public final C0058a<?, O> a;

    /* renamed from: b  reason: collision with root package name */
    public final g<?> f2606b;
    public final String c;

    /* renamed from: b.l.a.c.c.l.a$a  reason: collision with other inner class name */
    public static abstract class C0058a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, b.l.a.c.c.m.d dVar, O o2, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
            return b(context, looper, dVar, o2, bVar, cVar);
        }

        public T b(Context context, Looper looper, b.l.a.c.c.m.d dVar, O o2, b.l.a.c.c.l.k.f fVar, l lVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: b.l.a.c.c.l.a$d$a  reason: collision with other inner class name */
        public interface C0059a extends d {
            Account a();
        }

        public interface b extends d {
            GoogleSignInAccount b();
        }

        public static final class c implements d {
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        boolean a();

        void b();

        void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        void f(b.e eVar);

        boolean h();

        @NonNull
        Set<Scope> i();

        void j(n nVar, Set<Scope> set);

        boolean m();

        int n();

        boolean o();

        b.l.a.c.c.d[] p();

        String q();

        void r(b.c cVar);

        Intent s();

        boolean t();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, C0058a<C, O> aVar, g<C> gVar) {
        b.l.a.c.b.a.B(aVar, "Cannot construct an Api with a null ClientBuilder");
        b.l.a.c.b.a.B(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.f2606b = gVar;
    }

    public final c<?> a() {
        g<?> gVar = this.f2606b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
