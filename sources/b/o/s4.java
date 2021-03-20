package b.o;

import android.app.Activity;

public class s4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Activity f6282h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f6283i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ q4 f6284j;

    public s4(q4 q4Var, Activity activity, String str) {
        this.f6284j = q4Var;
        this.f6282h = activity;
        this.f6283i = str;
    }

    public void run() {
        q4.e(this.f6284j, this.f6282h);
        this.f6284j.a.loadData(this.f6283i, "text/html; charset=utf-8", "base64");
    }
}
