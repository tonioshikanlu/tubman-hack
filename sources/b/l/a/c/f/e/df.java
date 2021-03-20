package b.l.a.c.f.e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import b.l.d.o.n0;
import java.util.List;

public final class df implements ij<jk> {
    public final /* synthetic */ ij a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f2913b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n0 f2914e;
    public final /* synthetic */ ei f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ sk f2915g;

    public df(ij ijVar, String str, String str2, Boolean bool, n0 n0Var, ei eiVar, sk skVar) {
        this.a = ijVar;
        this.f2913b = str;
        this.c = str2;
        this.d = bool;
        this.f2914e = n0Var;
        this.f = eiVar;
        this.f2915g = skVar;
    }

    public final void a(Object obj) {
        List<lk> list = ((jk) obj).f3093h.f3196h;
        if (list == null || list.isEmpty()) {
            this.a.d("No users.");
            return;
        }
        int i2 = 0;
        lk lkVar = list.get(0);
        al alVar = lkVar.f3130m;
        List<yk> list2 = alVar != null ? alVar.f2846h : null;
        if (list2 != null && !list2.isEmpty()) {
            if (!TextUtils.isEmpty(this.f2913b)) {
                while (true) {
                    if (i2 >= list2.size()) {
                        break;
                    } else if (list2.get(i2).f3422k.equals(this.f2913b)) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            list2.get(i2).f3423l = this.c;
        }
        lkVar.r = this.d.booleanValue();
        lkVar.s = this.f2914e;
        this.f.a(this.f2915g, lkVar);
    }

    public final void d(@Nullable String str) {
        this.a.d(str);
    }
}
