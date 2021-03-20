package b.l.a.c.h;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.l.a.c.d.c;
import b.l.a.c.d.e;
import b.l.a.c.h.g.d;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class b extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    public final C0066b f3864h;

    public static class a implements c {
        public final ViewGroup a;

        /* renamed from: b  reason: collision with root package name */
        public final b.l.a.c.h.f.c f3865b;
        public View c;

        public a(ViewGroup viewGroup, b.l.a.c.h.f.c cVar) {
            this.f3865b = cVar;
            Objects.requireNonNull(viewGroup, "null reference");
            this.a = viewGroup;
        }

        public final void a(d dVar) {
            try {
                this.f3865b.v0(new i(dVar));
            } catch (RemoteException e2) {
                throw new d(e2);
            }
        }
    }

    /* renamed from: b.l.a.c.h.b$b  reason: collision with other inner class name */
    public static class C0066b extends b.l.a.c.d.a<a> {

        /* renamed from: e  reason: collision with root package name */
        public final ViewGroup f3866e;
        public final Context f;

        /* renamed from: g  reason: collision with root package name */
        public e<a> f3867g;

        /* renamed from: h  reason: collision with root package name */
        public final GoogleMapOptions f3868h;

        /* renamed from: i  reason: collision with root package name */
        public final List<d> f3869i = new ArrayList();

        public C0066b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f3866e = viewGroup;
            this.f = context;
            this.f3868h = null;
        }
    }

    public b(Context context) {
        super(context);
        this.f3864h = new C0066b(this, context, (GoogleMapOptions) null);
        setClickable(true);
    }
}
