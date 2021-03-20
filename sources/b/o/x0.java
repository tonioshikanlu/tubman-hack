package b.o;

import android.content.DialogInterface;
import java.util.List;

public class x0 implements DialogInterface.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ s0 f6351h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ List f6352i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u0 f6353j;

    public x0(u0 u0Var, s0 s0Var, List list) {
        this.f6353j = u0Var;
        this.f6351h = s0Var;
        this.f6352i = list;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f6353j.w(this.f6351h, this.f6352i);
    }
}
