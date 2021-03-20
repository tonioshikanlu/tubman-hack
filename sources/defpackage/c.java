package defpackage;

import android.view.View;
import androidx.appcompat.app.AlertDialog;
import b.k.b.a.d.a;

/* renamed from: c  reason: default package */
/* compiled from: java-style lambda group */
public final class c implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f6847h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f6848i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f6849j;

    public c(int i2, Object obj, Object obj2) {
        this.f6847h = i2;
        this.f6848i = obj;
        this.f6849j = obj2;
    }

    public final void onClick(View view) {
        int i2 = this.f6847h;
        if (i2 == 0) {
            ((a) this.f6848i).onResult(b.k.b.a.c.a.CAMERA);
            ((AlertDialog) this.f6849j).dismiss();
        } else if (i2 == 1) {
            ((a) this.f6848i).onResult(b.k.b.a.c.a.GALLERY);
            ((AlertDialog) this.f6849j).dismiss();
        } else {
            throw null;
        }
    }
}
