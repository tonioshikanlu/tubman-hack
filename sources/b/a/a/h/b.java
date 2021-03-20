package b.a.a.h;

import androidx.fragment.app.FragmentTransaction;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;

public final class b extends k implements l<FragmentTransaction, FragmentTransaction> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f254h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b.a.a.a.b f255i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i2, b.a.a.a.b bVar) {
        super(1);
        this.f254h = i2;
        this.f255i = bVar;
    }

    public Object invoke(Object obj) {
        FragmentTransaction fragmentTransaction = (FragmentTransaction) obj;
        i.e(fragmentTransaction, "$receiver");
        int i2 = this.f254h;
        b.a.a.a.b bVar = this.f255i;
        FragmentTransaction replace = fragmentTransaction.replace(i2, bVar, bVar.getTag());
        i.d(replace, "replace(frameId, fragment, fragment.tag)");
        return replace;
    }
}
