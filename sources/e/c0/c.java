package e.c0;

import e.t.b;
import e.x.c.i;
import java.util.List;
import java.util.regex.Matcher;

public final class c {
    public List<String> a;

    /* renamed from: b  reason: collision with root package name */
    public final Matcher f9885b;

    public static final class a extends b<String> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ c f9886h;

        public a(c cVar) {
            this.f9886h = cVar;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        public int d() {
            return this.f9886h.f9885b.groupCount() + 1;
        }

        public Object get(int i2) {
            String group = this.f9886h.f9885b.group(i2);
            return group != null ? group : "";
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public c(Matcher matcher, CharSequence charSequence) {
        i.e(matcher, "matcher");
        i.e(charSequence, "input");
        this.f9885b = matcher;
    }

    public List<String> a() {
        if (this.a == null) {
            this.a = new a(this);
        }
        List<String> list = this.a;
        i.c(list);
        return list;
    }
}
