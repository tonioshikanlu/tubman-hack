package b.l.a.c.d;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.l.a.c.c.e;
import b.l.a.c.c.g;
import b.l.a.c.d.c;
import b.l.a.c.h.b;
import b.l.a.c.h.d;
import b.l.a.c.h.f.l;
import java.util.LinkedList;

public abstract class a<T extends c> {
    public T a;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f2831b;
    public LinkedList<C0063a> c;
    public final e<T> d = new f(this);

    /* renamed from: b.l.a.c.d.a$a  reason: collision with other inner class name */
    public interface C0063a {
        void a(c cVar);
    }

    public static void a(FrameLayout frameLayout) {
        Object obj = e.c;
        e eVar = e.d;
        Context context = frameLayout.getContext();
        int d2 = eVar.d(context);
        String c2 = b.l.a.c.c.m.e.c(context, d2);
        String b2 = b.l.a.c.c.m.e.b(context, d2);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c2);
        linearLayout.addView(textView);
        Intent a2 = eVar.a(context, d2, (String) null);
        if (a2 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b2);
            linearLayout.addView(button);
            button.setOnClickListener(new h(context, a2));
        }
    }

    public final void b(Bundle bundle, C0063a aVar) {
        T t = this.a;
        if (t != null) {
            aVar.a(t);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList<>();
        }
        this.c.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.f2831b;
            if (bundle2 == null) {
                this.f2831b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        e<T> eVar = this.d;
        b.C0066b bVar = (b.C0066b) this;
        bVar.f3867g = eVar;
        if (eVar != null && bVar.a == null) {
            try {
                b.l.a.c.h.c.a(bVar.f);
                b.l.a.c.h.f.c t0 = l.a(bVar.f).t0(new d(bVar.f), bVar.f3868h);
                if (t0 != null) {
                    ((f) bVar.f3867g).a(new b.a(bVar.f3866e, t0));
                    for (d a2 : bVar.f3869i) {
                        ((b.a) bVar.a).a(a2);
                    }
                    bVar.f3869i.clear();
                }
            } catch (RemoteException e2) {
                throw new b.l.a.c.h.g.d(e2);
            } catch (g unused) {
            }
        }
    }
}
