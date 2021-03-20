package b.o;

import java.util.ArrayList;

public class e4 extends l3 {
    public final /* synthetic */ ArrayList a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c4 f6087b;

    public e4(c4 c4Var, ArrayList arrayList) {
        this.f6087b = c4Var;
        this.a = arrayList;
    }

    public void b(String str) {
        this.f6087b.f.addAll(this.a);
        b3.h("GTPlayerPurchases", "purchaseTokens", this.f6087b.f.toString());
        b3.i("GTPlayerPurchases", "ExistingPurchases", true);
        c4 c4Var = this.f6087b;
        c4Var.f6058g = false;
        c4Var.f6059h = false;
    }
}
