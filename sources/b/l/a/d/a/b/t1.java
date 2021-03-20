package b.l.a.d.a.b;

import androidx.exifinterface.media.ExifInterface;
import b.l.a.d.a.e.b0;
import b.l.a.d.a.e.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.Properties;

public final class t1 {

    /* renamed from: h  reason: collision with root package name */
    public static final f f4628h = new f("SliceMetadataManager");
    public final byte[] a = new byte[8192];

    /* renamed from: b  reason: collision with root package name */
    public final t f4629b;
    public final String c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4630e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public int f4631g;

    public t1(t tVar, String str, int i2, long j2, String str2) {
        this.f4629b = tVar;
        this.c = str;
        this.d = i2;
        this.f4630e = j2;
        this.f = str2;
        this.f4631g = -1;
    }

    public final void a(String str, long j2, long j3, int i2) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j2));
        properties.put("remainingBytes", String.valueOf(j3));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f4631g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }

    public final void b(byte[] bArr, int i2) {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_2D);
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f4631g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            t tVar = this.f4629b;
            String str = this.c;
            int i3 = this.d;
            long j2 = this.f4630e;
            String str2 = this.f;
            Objects.requireNonNull(tVar);
            File file = new File(tVar.q(str, i3, j2, str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                b0.a.a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            b0.a.a(th, th2);
        }
    }

    public final void c(int i2) {
        Properties properties = new Properties();
        properties.put("fileStatus", ExifInterface.GPS_MEASUREMENT_3D);
        properties.put("fileOffset", String.valueOf(i().length()));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f4631g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }

    public final void d(int i2) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f4631g));
        FileOutputStream fileOutputStream = new FileOutputStream(m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }

    public final s1 e() {
        File p2 = this.f4629b.p(this.c, this.d, this.f4630e, this.f);
        if (p2.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(p2);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new g0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f4631g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new s1(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e2) {
                    throw new g0("Slice checkpoint file corrupt.", (Exception) e2);
                }
            } catch (Throwable th) {
                b0.a.a(th, th);
            }
        } else {
            throw new g0("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    public final void f(byte[] bArr) {
        FileOutputStream fileOutputStream;
        this.f4631g++;
        try {
            fileOutputStream = new FileOutputStream(new File(l(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.f4631g)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e2) {
            throw new g0("Could not write metadata file.", (Exception) e2);
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }

    public final void g(byte[] bArr, InputStream inputStream) {
        this.f4631g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.a);
            while (read > 0) {
                fileOutputStream.write(this.a, 0, read);
                read = inputStream.read(this.a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }

    public final void h(long j2, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, i2, i3);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }

    public final File i() {
        return new File(l(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f4631g)}));
    }

    public final int j() {
        File p2 = this.f4629b.p(this.c, this.d, this.f4630e, this.f);
        if (!p2.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(p2);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new g0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }

    public final void k(byte[] bArr, int i2) {
        this.f4631g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr, 0, i2);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            b0.a.a(th, th);
        }
        throw th;
    }

    public final File l() {
        File q2 = this.f4629b.q(this.c, this.d, this.f4630e, this.f);
        if (!q2.exists()) {
            q2.mkdirs();
        }
        return q2;
    }

    public final File m() {
        File p2 = this.f4629b.p(this.c, this.d, this.f4630e, this.f);
        p2.getParentFile().mkdirs();
        p2.createNewFile();
        return p2;
    }
}
