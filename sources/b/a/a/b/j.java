package b.a.a.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.c;
import b.h.a.i;
import b.h.a.n.h;
import b.h.a.n.m;
import b.h.a.q.e;

public class j extends i {
    public j(@NonNull c cVar, @NonNull h hVar, @NonNull m mVar, @NonNull Context context) {
        super(cVar, hVar, mVar, context);
    }

    @CheckResult
    @NonNull
    public b.h.a.h k(@NonNull Class cls) {
        return new i(this.f505h, this, cls, this.f506i);
    }

    @CheckResult
    @NonNull
    public b.h.a.h l() {
        return (i) super.l();
    }

    @CheckResult
    @NonNull
    public b.h.a.h m() {
        return (i) k(Drawable.class);
    }

    @CheckResult
    @NonNull
    public b.h.a.h o(@Nullable String str) {
        i iVar = (i) m();
        iVar.M = str;
        iVar.P = true;
        return iVar;
    }

    public void r(@NonNull e eVar) {
        if (!(eVar instanceof h)) {
            eVar = new h().z(eVar);
        }
        super.r(eVar);
    }
}
