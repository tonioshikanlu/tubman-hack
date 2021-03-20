package b.l.a.d.a.g;

import android.content.Context;
import android.content.Intent;
import b.l.a.d.a.e.c;
import b.l.a.d.a.e.f;
import b.l.a.d.a.e.p;

public final class g {
    public static final f c = new f("ReviewService");
    public final p<c> a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4688b;

    public g(Context context) {
        this.f4688b = context.getPackageName();
        Context context2 = context;
        this.a = new p(context2, c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), d.a);
    }
}
