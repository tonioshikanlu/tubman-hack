package b.l.a.d.a.b;

import b.e.a.a.a;
import b.l.a.d.a.e.f;
import java.io.File;
import java.io.IOException;

public final class i1 {

    /* renamed from: b  reason: collision with root package name */
    public static final f f4563b = new f("MergeSliceTaskHandler");
    public final t a;

    public i1(t tVar) {
        this.a = tVar;
    }

    public static void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                throw new g0(a.q(new StringBuilder(valueOf.length() + 28), "Unable to delete directory: ", valueOf));
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            throw new g0(a.q(new StringBuilder(valueOf2.length() + 51), "File clashing with existing file from other slice: ", valueOf2));
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            throw new g0(a.q(new StringBuilder(valueOf3.length() + 21), "Unable to move file: ", valueOf3));
        }
    }

    public final void a(h1 h1Var) {
        File l2 = this.a.l(h1Var.f4647b, h1Var.c, h1Var.d, h1Var.f4556e);
        if (l2.exists()) {
            File m2 = this.a.m(h1Var.f4647b, h1Var.c, h1Var.d);
            if (!m2.exists()) {
                m2.mkdirs();
            }
            b(l2, m2);
            try {
                this.a.o(h1Var.f4647b, h1Var.c, h1Var.d, this.a.n(h1Var.f4647b, h1Var.c, h1Var.d) + 1);
            } catch (IOException e2) {
                f4563b.b(6, "Writing merge checkpoint failed with %s.", new Object[]{e2.getMessage()});
                throw new g0("Writing merge checkpoint failed.", e2, h1Var.a);
            }
        } else {
            throw new g0(String.format("Cannot find verified files for slice %s.", new Object[]{h1Var.f4556e}), h1Var.a);
        }
    }
}
