package b.l.d.q.f.k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.x.h;
import b.l.d.q.f.m.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class g {

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f5260g = Charset.forName("UTF-8");

    /* renamed from: h  reason: collision with root package name */
    public static final int f5261h = 15;

    /* renamed from: i  reason: collision with root package name */
    public static final h f5262i = new h();

    /* renamed from: j  reason: collision with root package name */
    public static final Comparator<? super File> f5263j = e.f5259h;

    /* renamed from: k  reason: collision with root package name */
    public static final FilenameFilter f5264k = f.a;
    @NonNull
    public final AtomicInteger a = new AtomicInteger(0);
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final File f5265b;
    @NonNull
    public final File c;
    @NonNull
    public final File d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final File f5266e;
    @NonNull
    public final f f;

    public g(@NonNull File file, @NonNull f fVar) {
        File file2 = new File(file, "report-persistence");
        this.f5265b = new File(file2, "sessions");
        this.c = new File(file2, "priority-reports");
        this.d = new File(file2, "reports");
        this.f5266e = new File(file2, "native-reports");
        this.f = fVar;
    }

    @NonNull
    public static List<File> a(@NonNull List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (List<File> size : listArr) {
            i2 += size.size();
        }
        arrayList.ensureCapacity(i2);
        for (List<File> addAll : listArr) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    @NonNull
    public static List<File> b(@NonNull File file) {
        return d(file, (FileFilter) null);
    }

    @NonNull
    public static List<File> d(@NonNull File file, @Nullable FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    @NonNull
    public static List<File> e(@NonNull File file, @Nullable FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    @NonNull
    public static File g(@NonNull File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    @NonNull
    public static String h(@NonNull File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f5260g);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        throw th;
    }

    public static void i(@Nullable File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File i2 : file.listFiles()) {
                    i(i2);
                }
            }
            file.delete();
        }
    }

    public static void j(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f5260g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    @NonNull
    public final List<File> c() {
        List[] listArr = {a(b(this.c), b(this.f5266e)), b(this.d)};
        for (int i2 = 0; i2 < 2; i2++) {
            Collections.sort(listArr[i2], f5263j);
        }
        return a(listArr);
    }

    @NonNull
    public final File f(@NonNull String str) {
        return new File(this.f5265b, str);
    }
}
