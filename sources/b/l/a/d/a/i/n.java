package b.l.a.d.a.i;

public final class n<ResultT> {
    public final r<ResultT> a = new r<>();

    public final void a(Exception exc) {
        r<ResultT> rVar = this.a;
        synchronized (rVar.a) {
            if (!rVar.c) {
                rVar.c = true;
                rVar.f4702e = exc;
                rVar.f4701b.b(rVar);
            }
        }
    }

    public final void b(ResultT resultt) {
        r<ResultT> rVar = this.a;
        synchronized (rVar.a) {
            if (!rVar.c) {
                rVar.c = true;
                rVar.d = resultt;
                rVar.f4701b.b(rVar);
            }
        }
    }
}
