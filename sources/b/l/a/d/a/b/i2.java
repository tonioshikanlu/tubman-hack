package b.l.a.d.a.b;

import android.content.ComponentName;
import android.content.Context;
import b.l.a.c.b.a;
import b.l.a.d.a.e.e0;
import b.l.a.d.a.e.f0;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.util.Objects;

public final class i2 implements f0<Object> {
    public final f0 a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f4564b;
    public final /* synthetic */ int c = 0;

    public i2(f0<c2> f0Var, f0<Context> f0Var2) {
        this.a = f0Var;
        this.f4564b = f0Var2;
    }

    public i2(f0<Context> f0Var, f0<t> f0Var2, byte[] bArr) {
        this.f4564b = f0Var;
        this.a = f0Var2;
    }

    public i2(f0<Context> f0Var, f0<k0> f0Var2, char[] cArr) {
        this.a = f0Var;
        this.f4564b = f0Var2;
    }

    public i2(f0<t> f0Var, f0<n2> f0Var2, int[] iArr) {
        this.f4564b = f0Var;
        this.a = f0Var2;
    }

    public i2(f0<Context> f0Var, f0<p1> f0Var2, short[] sArr) {
        this.a = f0Var;
        this.f4564b = f0Var2;
    }

    public final Object a() {
        int i2 = this.c;
        if (i2 == 0) {
            Object a2 = this.a.a();
            Context b2 = ((j2) this.f4564b).a();
            c2 c2Var = (c2) a2;
            a.b0(b2.getPackageManager(), new ComponentName(b2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            a.b0(b2.getPackageManager(), new ComponentName(b2.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            int i3 = PlayCoreDialogWrapperActivity.f7327i;
            a.b0(b2.getPackageManager(), new ComponentName(b2.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
            Objects.requireNonNull(c2Var, "Cannot return null from a non-@Nullable @Provides method");
            return c2Var;
        } else if (i2 == 1) {
            return new y(((j2) this.f4564b).a(), (t) this.a.a());
        } else {
            if (i2 == 2) {
                return new m(((j2) this.a).a(), (k0) this.f4564b.a());
            }
            if (i2 == 3) {
                return new t(((j2) this.a).a(), (p1) this.f4564b.a());
            }
            return new r1((t) this.f4564b.a(), e0.b(this.a));
        }
    }
}
