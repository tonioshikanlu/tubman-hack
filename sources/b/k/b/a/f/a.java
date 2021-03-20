package b.k.b.a.f;

import android.content.DialogInterface;

public final class a implements DialogInterface.OnCancelListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b.k.b.a.d.a f2383h;

    public a(b.k.b.a.d.a aVar) {
        this.f2383h = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f2383h.onResult(null);
    }
}
