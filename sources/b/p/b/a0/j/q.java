package b.p.b.a0.j;

import e.a.a.a.y0.m.o1.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import o.e;
import o.g;
import o.h;
import o.k;
import o.n;
import o.z;

public class q {
    public final n a;

    /* renamed from: b  reason: collision with root package name */
    public int f6591b;
    public final g c;

    public class a extends k {
        public a(z zVar) {
            super(zVar);
        }

        public long T(e eVar, long j2) {
            int i2 = q.this.f6591b;
            if (i2 == 0) {
                return -1;
            }
            long T = super.T(eVar, Math.min(j2, (long) i2));
            if (T == -1) {
                return -1;
            }
            q qVar = q.this;
            qVar.f6591b = (int) (((long) qVar.f6591b) - T);
            return T;
        }
    }

    public class b extends Inflater {
        public b(q qVar) {
        }

        public int inflate(byte[] bArr, int i2, int i3) {
            int inflate = super.inflate(bArr, i2, i3);
            if (inflate != 0 || !needsDictionary()) {
                return inflate;
            }
            setDictionary(u.a);
            return super.inflate(bArr, i2, i3);
        }
    }

    public q(g gVar) {
        n nVar = new n((z) new a(gVar), (Inflater) new b(this));
        this.a = nVar;
        this.c = c.m(nVar);
    }

    public List<l> a(int i2) {
        this.f6591b += i2;
        int readInt = this.c.readInt();
        if (readInt < 0) {
            throw new IOException(b.e.a.a.a.g("numberOfPairs < 0: ", readInt));
        } else if (readInt <= 1024) {
            ArrayList arrayList = new ArrayList(readInt);
            int i3 = 0;
            while (i3 < readInt) {
                h w = this.c.p((long) this.c.readInt()).w();
                h p2 = this.c.p((long) this.c.readInt());
                if (w.l() != 0) {
                    arrayList.add(new l(w, p2));
                    i3++;
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            if (this.f6591b > 0) {
                this.a.b();
                if (this.f6591b != 0) {
                    StringBuilder y = b.e.a.a.a.y("compressedLimit > 0: ");
                    y.append(this.f6591b);
                    throw new IOException(y.toString());
                }
            }
            return arrayList;
        } else {
            throw new IOException(b.e.a.a.a.g("numberOfPairs > 1024: ", readInt));
        }
    }
}
