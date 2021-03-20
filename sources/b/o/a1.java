package b.o;

import android.content.ContentValues;

public class a1 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ s0 f6009h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ u0 f6010i;

    public a1(u0 u0Var, s0 s0Var) {
        this.f6010i = u0Var;
        this.f6009h = s0Var;
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        g1 g1Var = this.f6010i.c;
        s0 s0Var = this.f6009h;
        synchronized (g1Var) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_id", s0Var.a);
            contentValues.put("display_quantity", Integer.valueOf(s0Var.f6273e.f6088b));
            contentValues.put("last_display", Long.valueOf(s0Var.f6273e.a));
            contentValues.put("click_ids", s0Var.d.toString());
            contentValues.put("displayed_in_session", Boolean.valueOf(s0Var.f6274g));
            if (g1Var.a.k0("in_app_message", contentValues, "message_id = ?", new String[]{s0Var.a}) == 0) {
                g1Var.a.H("in_app_message", (String) null, contentValues);
            }
        }
    }
}
