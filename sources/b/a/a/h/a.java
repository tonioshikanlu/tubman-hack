package b.a.a.h;

import androidx.fragment.app.FragmentTransaction;
import b.a.a.a.b;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;

public final class a extends k implements l<FragmentTransaction, FragmentTransaction> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f251h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b f252i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f253j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i2, b bVar, String str) {
        super(1);
        this.f251h = i2;
        this.f252i = bVar;
        this.f253j = str;
    }

    public Object invoke(Object obj) {
        FragmentTransaction fragmentTransaction = (FragmentTransaction) obj;
        i.e(fragmentTransaction, "$receiver");
        int i2 = this.f251h;
        b bVar = this.f252i;
        i.c(bVar);
        FragmentTransaction add = fragmentTransaction.add(i2, bVar, this.f253j);
        i.d(add, "add(frameId, fragment!!, fragmentTag)");
        return add;
    }
}
