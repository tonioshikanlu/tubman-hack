package b.a.a.l;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import b.a.a.g.k0;
import b.a.a.h.m;
import b.e.a.a.a;
import e.c0.h;
import e.x.c.i;
import p.a.a.c;

public final class d implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f339h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ TextView f340i;

    public d(e eVar, TextView textView) {
        this.f339h = eVar;
        this.f340i = textView;
    }

    public final void onClick(View view) {
        StringBuilder sb;
        TextView textView = this.f340i;
        i.d(textView, "editText");
        String obj = textView.getText().toString();
        i.e(obj, "$this$isBravoUrl");
        boolean z = false;
        if (!h.d(obj, "/devices/apps/", false, 2)) {
            i.e(obj, "$this$isBravoAppId");
            if (!(obj.length() == 26) && !m.f(obj)) {
                Toast.makeText(this.f339h.a, "Invalid json", 0).show();
                return;
            }
        }
        i.e(obj, "$this$isBravoAppId");
        if (obj.length() == 26) {
            z = true;
        }
        if (z) {
            sb = a.y("https://apps-service.bravostudio.app/devices/apps/");
        } else {
            if (m.f(obj)) {
                sb = a.y("https://apps-service-dev.bravostudio.app/devices/apps/");
                obj = obj.substring(3);
                i.d(obj, "(this as java.lang.String).substring(startIndex)");
            }
            c.b().g(new k0(obj));
            this.f339h.a.finish();
        }
        sb.append(obj);
        obj = sb.toString();
        c.b().g(new k0(obj));
        this.f339h.a.finish();
    }
}
