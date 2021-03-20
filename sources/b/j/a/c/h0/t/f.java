package b.j.a.c.h0.t;

import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.y;
import b.j.a.c.z.a;

@a
public class f extends s0<byte[]> {
    public f() {
        super(byte[].class);
    }

    public boolean d(y yVar, Object obj) {
        return ((byte[]) obj).length == 0;
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        byte[] bArr = (byte[]) obj;
        fVar.m0(yVar.f2320h.f1609i.f1594p, bArr, 0, bArr.length);
    }

    public void g(Object obj, b.j.a.b.f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        byte[] bArr = (byte[]) obj;
        b e2 = fVar2.e(fVar, fVar2.d(bArr, l.VALUE_EMBEDDED_OBJECT));
        fVar.m0(yVar.f2320h.f1609i.f1594p, bArr, 0, bArr.length);
        fVar2.f(fVar, e2);
    }
}
