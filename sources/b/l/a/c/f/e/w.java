package b.l.a.c.f.e;

import java.nio.charset.Charset;

public final class w implements p0 {

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f3367b = new u();
    public final d0 a;

    public w() {
        d0 d0Var;
        d0[] d0VarArr = new d0[2];
        d0VarArr[0] = nn.a;
        try {
            d0Var = (d0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            d0Var = f3367b;
        }
        d0VarArr[1] = d0Var;
        v vVar = new v(d0VarArr);
        Charset charset = j.a;
        this.a = vVar;
    }
}
