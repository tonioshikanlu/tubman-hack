package b.l.a.c.f.i;

import java.nio.charset.Charset;

public final class j6 implements b7 {

    /* renamed from: b  reason: collision with root package name */
    public static final p6 f3620b = new h6();
    public final p6 a;

    public j6() {
        p6 p6Var;
        p6[] p6VarArr = new p6[2];
        p6VarArr[0] = l5.a;
        try {
            p6Var = (p6) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            p6Var = f3620b;
        }
        p6VarArr[1] = p6Var;
        i6 i6Var = new i6(p6VarArr);
        Charset charset = w5.a;
        this.a = i6Var;
    }
}
