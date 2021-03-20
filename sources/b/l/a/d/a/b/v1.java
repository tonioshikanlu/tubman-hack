package b.l.a.d.a.b;

import b.l.a.d.a.e.b0;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class v1 {
    public static final Pattern a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static List<File> a(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(u1.a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new g0("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    y1 b2 = new a0(fileInputStream).b();
                    if (b2.a != null) {
                        File file5 = new File(file, b2.a);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new g0(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new g0("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    b0.a.a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
