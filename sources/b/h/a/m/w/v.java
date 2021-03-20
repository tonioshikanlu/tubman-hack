package b.h.a.m.w;

import androidx.annotation.NonNull;
import b.h.a.f;
import b.h.a.m.p;
import b.h.a.m.u.d;
import b.h.a.m.w.n;

public class v<Model> implements n<Model, Model> {
    public static final v<?> a = new v<>();

    public static class a<Model> implements o<Model, Model> {
        public static final a<?> a = new a<>();

        @NonNull
        public n<Model, Model> b(r rVar) {
            return v.a;
        }
    }

    public static class b<Model> implements d<Model> {

        /* renamed from: h  reason: collision with root package name */
        public final Model f824h;

        public b(Model model) {
            this.f824h = model;
        }

        @NonNull
        public Class<Model> a() {
            return this.f824h.getClass();
        }

        public void b() {
        }

        public void cancel() {
        }

        @NonNull
        public b.h.a.m.a e() {
            return b.h.a.m.a.LOCAL;
        }

        public void f(@NonNull f fVar, @NonNull d.a<? super Model> aVar) {
            aVar.d(this.f824h);
        }
    }

    public n.a<Model> a(@NonNull Model model, int i2, int i3, @NonNull p pVar) {
        return new n.a<>(new b.h.a.r.b(model), new b(model));
    }

    public boolean b(@NonNull Model model) {
        return true;
    }
}
