package b.l.f.z.e;

import androidx.exifinterface.media.ExifInterface;
import b.l.f.f;
import java.nio.charset.StandardCharsets;

public final class h {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public k f5876b;
    public f c;
    public f d;

    /* renamed from: e  reason: collision with root package name */
    public final StringBuilder f5877e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f5878g;

    /* renamed from: h  reason: collision with root package name */
    public j f5879h;

    /* renamed from: i  reason: collision with root package name */
    public int f5880i;

    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i2 = 0;
        while (i2 < length) {
            char c2 = (char) (bytes[i2] & ExifInterface.MARKER);
            if (c2 != '?' || str.charAt(i2) == '?') {
                sb.append(c2);
                i2++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.a = sb.toString();
        this.f5876b = k.FORCE_NONE;
        this.f5877e = new StringBuilder(str.length());
        this.f5878g = -1;
    }

    public int a() {
        return this.f5877e.length();
    }

    public char b() {
        return this.a.charAt(this.f);
    }

    public int c() {
        return (this.a.length() - this.f5880i) - this.f;
    }

    public boolean d() {
        return this.f < this.a.length() - this.f5880i;
    }

    public void e() {
        f(a());
    }

    public void f(int i2) {
        j jVar = this.f5879h;
        if (jVar == null || i2 > jVar.f5883b) {
            this.f5879h = j.i(i2, this.f5876b, this.c, this.d, true);
        }
    }
}
