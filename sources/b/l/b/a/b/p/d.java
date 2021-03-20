package b.l.b.a.b.p;

import b.l.b.a.b.l;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class d extends l {
    public final HttpURLConnection a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4750b;
    public final String c;
    public final ArrayList<String> d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<String> f4751e;

    public final class a extends FilterInputStream {

        /* renamed from: h  reason: collision with root package name */
        public long f4752h = 0;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        public final void b() {
            String headerField = d.this.a.getHeaderField("Content-Length");
            long parseLong = headerField == null ? -1 : Long.parseLong(headerField);
            if (parseLong != -1) {
                long j2 = this.f4752h;
                if (j2 != 0 && j2 < parseLong) {
                    StringBuilder y = b.e.a.a.a.y("Connection closed prematurely: bytesRead = ");
                    y.append(this.f4752h);
                    y.append(", Content-Length = ");
                    y.append(parseLong);
                    throw new IOException(y.toString());
                }
            }
        }

        public int read() {
            int read = this.in.read();
            if (read == -1) {
                b();
            } else {
                this.f4752h++;
            }
            return read;
        }

        public int read(byte[] bArr, int i2, int i3) {
            int read = this.in.read(bArr, i2, i3);
            if (read == -1) {
                b();
            } else {
                this.f4752h += (long) read;
            }
            return read;
        }

        public long skip(long j2) {
            long skip = this.in.skip(j2);
            this.f4752h += skip;
            return skip;
        }
    }

    public d(HttpURLConnection httpURLConnection) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.d = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.f4751e = arrayList2;
        this.a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.f4750b = responseCode == -1 ? 0 : responseCode;
        this.c = httpURLConnection.getResponseMessage();
        for (Map.Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                for (String str2 : (List) entry.getValue()) {
                    if (str2 != null) {
                        arrayList.add(str);
                        arrayList2.add(str2);
                    }
                }
            }
        }
    }

    public void a() {
        this.a.disconnect();
    }

    public InputStream b() {
        InputStream inputStream;
        try {
            inputStream = this.a.getInputStream();
        } catch (IOException unused) {
            inputStream = this.a.getErrorStream();
        }
        if (inputStream == null) {
            return null;
        }
        return new a(inputStream);
    }

    public String c() {
        return this.a.getContentEncoding();
    }

    public long d() {
        String headerField = this.a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1;
        }
        return Long.parseLong(headerField);
    }

    public String e() {
        return this.a.getHeaderField("Content-Type");
    }

    public int f() {
        return this.d.size();
    }

    public String g(int i2) {
        return this.d.get(i2);
    }

    public String h(int i2) {
        return this.f4751e.get(i2);
    }

    public String i() {
        return this.c;
    }

    public int j() {
        return this.f4750b;
    }

    public String k() {
        String headerField = this.a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }
}
