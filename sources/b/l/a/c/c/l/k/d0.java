package b.l.a.c.c.l.k;

import androidx.annotation.WorkerThread;
import b.l.a.c.c.l.a;
import b.l.a.c.c.m.d;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class d0 extends h0 {

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<a.f> f2626i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ x f2627j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(x xVar, ArrayList<a.f> arrayList) {
        super(xVar, (w) null);
        this.f2627j = xVar;
        this.f2626i = arrayList;
    }

    @WorkerThread
    public final void a() {
        Set<Scope> set;
        x xVar = this.f2627j;
        j0 j0Var = xVar.a.f2701m;
        if (xVar.r == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(xVar.r.f2770b);
            Map<a<?>, d.b> map = xVar.r.d;
            for (a next : map.keySet()) {
                if (!xVar.a.f2695g.containsKey(next.a())) {
                    Objects.requireNonNull(map.get(next));
                    hashSet.addAll((Collection) null);
                }
            }
            set = hashSet;
        }
        j0Var.f2685p = set;
        ArrayList<a.f> arrayList = this.f2626i;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            a.f fVar = arrayList.get(i2);
            i2++;
            x xVar2 = this.f2627j;
            fVar.j(xVar2.f2728o, xVar2.a.f2701m.f2685p);
        }
    }
}
