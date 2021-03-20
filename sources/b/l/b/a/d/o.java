package b.l.b.a.d;

import b.l.a.c.b.a;
import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class o extends ByteArrayOutputStream {

    /* renamed from: h  reason: collision with root package name */
    public int f4820h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4821i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4822j;

    /* renamed from: k  reason: collision with root package name */
    public final Level f4823k;

    /* renamed from: l  reason: collision with root package name */
    public final Logger f4824l;

    public o(Logger logger, Level level, int i2) {
        Objects.requireNonNull(logger);
        this.f4824l = logger;
        Objects.requireNonNull(level);
        this.f4823k = level;
        a.q(i2 >= 0);
        this.f4821i = i2;
    }

    public static void b(StringBuilder sb, int i2) {
        String str;
        if (i2 == 1) {
            str = "1 byte";
        } else {
            sb.append(NumberFormat.getInstance().format((long) i2));
            str = " bytes";
        }
        sb.append(str);
    }

    public synchronized void close() {
        if (!this.f4822j) {
            if (this.f4820h != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Total: ");
                b(sb, this.f4820h);
                int i2 = this.count;
                if (i2 != 0 && i2 < this.f4820h) {
                    sb.append(" (logging first ");
                    b(sb, this.count);
                    sb.append(")");
                }
                this.f4824l.config(sb.toString());
                if (this.count != 0) {
                    this.f4824l.log(this.f4823k, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.f4822j = true;
        }
    }

    public synchronized void write(int i2) {
        a.q(!this.f4822j);
        this.f4820h++;
        if (this.count < this.f4821i) {
            super.write(i2);
        }
    }

    public synchronized void write(byte[] bArr, int i2, int i3) {
        a.q(!this.f4822j);
        this.f4820h += i3;
        int i4 = this.count;
        int i5 = this.f4821i;
        if (i4 < i5) {
            int i6 = i4 + i3;
            if (i6 > i5) {
                i3 += i5 - i6;
            }
            super.write(bArr, i2, i3);
        }
    }
}
