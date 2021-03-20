package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import b.f.a.e;
import b.o.b3;
import b.o.i2;
import b.o.k;
import com.appfoundry.previewer.BravoApp;
import e.x.c.i;
import java.util.List;
import q.a.a;

/* renamed from: d  reason: default package */
/* compiled from: java-style lambda group */
public final class d implements DialogInterface.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public static final d f7445i = new d(0);

    /* renamed from: j  reason: collision with root package name */
    public static final d f7446j = new d(1);

    /* renamed from: k  reason: collision with root package name */
    public static final d f7447k = new d(2);

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f7448h;

    public d(int i2) {
        this.f7448h = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        k kVar;
        int i3 = this.f7448h;
        if (i3 == 0) {
            return;
        }
        if (i3 == 1) {
            String str = i2.a;
            String str2 = b3.a;
            boolean b2 = b3.b(str2, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
            b3.i(str2, "ONESIGNAL_USER_PROVIDED_CONSENT", true);
            if (!b2 && (kVar = i2.O) != null) {
                i2.u(kVar.a, kVar.f6167b, kVar.c, kVar.d, kVar.f6168e);
                i2.O = null;
            }
            SharedPreferences sharedPreferences = e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
            i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
            String str3 = e.d() + "user_allowed_push";
            i.e(str3, "key");
            sharedPreferences.edit().putBoolean(str3, true).apply();
            BravoApp.b bVar = BravoApp.Q;
            List<b.a.a.i.i> list = BravoApp.z;
            i.e(list, "$this$hide");
            for (b.a.a.i.i iVar : list) {
                iVar.f319b.setVisibility(4);
            }
            list.clear();
        } else if (i3 == 2) {
            a.d.a("User denied push notifications", new Object[0]);
        } else {
            throw null;
        }
    }
}
