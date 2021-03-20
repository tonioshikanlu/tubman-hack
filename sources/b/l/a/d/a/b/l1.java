package b.l.a.d.a.b;

import java.io.File;

public final /* synthetic */ class l1 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final n1 f4574h;

    /* renamed from: i  reason: collision with root package name */
    public final k1 f4575i;

    public l1(n1 n1Var, k1 k1Var) {
        this.f4574h = n1Var;
        this.f4575i = k1Var;
    }

    public final void run() {
        n1 n1Var = this.f4574h;
        k1 k1Var = this.f4575i;
        t tVar = n1Var.a;
        String str = k1Var.f4647b;
        int i2 = k1Var.c;
        long j2 = k1Var.d;
        File a = tVar.a(str);
        if (a.exists()) {
            for (File file : a.listFiles()) {
                if (!file.getName().equals(String.valueOf(i2)) && !file.getName().equals("stale.tmp")) {
                    t.h(file);
                } else if (file.getName().equals(String.valueOf(i2))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j2))) {
                            t.h(file2);
                        }
                    }
                }
            }
        }
    }
}
