package b.l.b.a.b;

import b.e.a.a.a;
import b.l.b.a.d.d;
import b.l.b.a.d.l;
import b.l.b.a.d.p;
import b.l.b.a.d.w;
import com.google.api.client.http.HttpTransport;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

public final class h {
    public InputStream a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4734b;
    public final String c;
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public l f4735e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4736g;

    /* renamed from: h  reason: collision with root package name */
    public final f f4737h;

    /* renamed from: i  reason: collision with root package name */
    public int f4738i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4739j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4740k;

    public h(f fVar, l lVar) {
        StringBuilder sb;
        this.f4737h = fVar;
        this.f4738i = fVar.f4722e;
        this.f4739j = fVar.f;
        this.f4735e = lVar;
        this.f4734b = lVar.c();
        int j2 = lVar.j();
        boolean z = false;
        j2 = j2 < 0 ? 0 : j2;
        this.f = j2;
        String i2 = lVar.i();
        this.f4736g = i2;
        Logger logger = HttpTransport.a;
        if (this.f4739j && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        e eVar = null;
        if (z) {
            sb = a.y("-------------- RESPONSE --------------");
            String str = w.a;
            sb.append(str);
            String k2 = lVar.k();
            if (k2 != null) {
                sb.append(k2);
            } else {
                sb.append(j2);
                if (i2 != null) {
                    sb.append(' ');
                    sb.append(i2);
                }
            }
            sb.append(str);
        } else {
            sb = null;
        }
        fVar.c.b(lVar, z ? sb : null);
        String e2 = lVar.e();
        e2 = e2 == null ? fVar.c.g() : e2;
        this.c = e2;
        if (e2 != null) {
            try {
                eVar = new e(e2);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.d = eVar;
        if (z) {
            logger.config(sb.toString());
        }
    }

    public void a() {
        d();
        this.f4735e.a();
    }

    public InputStream b() {
        if (!this.f4740k) {
            p b2 = this.f4735e.b();
            if (b2 != null) {
                try {
                    String str = this.f4734b;
                    if (str != null) {
                        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
                        if ("gzip".equals(lowerCase) || "x-gzip".equals(lowerCase)) {
                            b2 = new b(new GZIPInputStream(b2));
                        }
                    }
                    Logger logger = HttpTransport.a;
                    if (this.f4739j) {
                        Level level = Level.CONFIG;
                        if (logger.isLoggable(level)) {
                            b2 = new p(b2, logger, level, this.f4738i);
                        }
                    }
                    this.a = b2;
                } catch (EOFException unused) {
                    b2.close();
                } catch (Throwable th) {
                    b2.close();
                    throw th;
                }
            }
            this.f4740k = true;
        }
        return this.a;
    }

    public Charset c() {
        e eVar = this.d;
        return (eVar == null || eVar.d() == null) ? d.f4781b : this.d.d();
    }

    public void d() {
        InputStream b2 = b();
        if (b2 != null) {
            b2.close();
        }
    }

    public boolean e() {
        int i2 = this.f;
        return i2 >= 200 && i2 < 300;
    }

    public String f() {
        InputStream b2 = b();
        if (b2 == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l.a(b2, byteArrayOutputStream, true);
        return byteArrayOutputStream.toString(c().name());
    }
}
