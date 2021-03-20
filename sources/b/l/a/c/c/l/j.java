package b.l.a.c.c.l;

import b.l.a.c.c.d;

public final class j extends UnsupportedOperationException {

    /* renamed from: h  reason: collision with root package name */
    public final d f2613h;

    public j(d dVar) {
        this.f2613h = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f2613h);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
