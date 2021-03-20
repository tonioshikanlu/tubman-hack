package b.j.a.b.s;

import b.j.a.b.w.a;
import b.j.a.b.w.k;
import java.io.Writer;

public final class h extends Writer {

    /* renamed from: h  reason: collision with root package name */
    public final k f1482h;

    public h(a aVar) {
        this.f1482h = new k(aVar);
    }

    public Writer append(char c) {
        write((int) c);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.f1482h.a(charSequence2, 0, charSequence2.length());
        return this;
    }

    public Writer append(CharSequence charSequence, int i2, int i3) {
        String charSequence2 = charSequence.subSequence(i2, i3).toString();
        this.f1482h.a(charSequence2, 0, charSequence2.length());
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m0append(char c) {
        write((int) c);
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    public void write(int i2) {
        k kVar = this.f1482h;
        char c = (char) i2;
        if (kVar.c >= 0) {
            kVar.t(16);
        }
        kVar.f1582j = null;
        kVar.f1583k = null;
        char[] cArr = kVar.f1580h;
        if (kVar.f1581i >= cArr.length) {
            kVar.j();
            cArr = kVar.f1580h;
        }
        int i3 = kVar.f1581i;
        kVar.f1581i = i3 + 1;
        cArr[i3] = c;
    }

    public void write(String str) {
        this.f1482h.a(str, 0, str.length());
    }

    public void write(String str, int i2, int i3) {
        this.f1482h.a(str, i2, i3);
    }

    public void write(char[] cArr) {
        this.f1482h.b(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i2, int i3) {
        this.f1482h.b(cArr, i2, i3);
    }
}
