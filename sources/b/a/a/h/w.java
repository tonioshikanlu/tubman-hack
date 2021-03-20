package b.a.a.h;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.f.a.e;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Data;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Page;
import e.x.c.i;
import java.util.Iterator;
import java.util.List;
import p.a.a.c;
import q.a.a;

public final class w implements View.OnTouchListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Component f296h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f297i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Component f298j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f299k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f300l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f301m;

    public w(Component component, String str, Component component2, FrameLayout frameLayout, int i2, String str2) {
        this.f296h = component;
        this.f297i = str;
        this.f298j = component2;
        this.f299k = frameLayout;
        this.f300l = i2;
        this.f301m = str2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        T t;
        Object obj;
        App app2;
        Data data;
        List<Page> list;
        Page page;
        List<Container> list2;
        Container container;
        i.d(motionEvent, "event");
        int i2 = 0;
        if (motionEvent.getActionMasked() == 0) {
            BravoApp.b bVar = BravoApp.Q;
            BravoApp.H = true;
            a.b bVar2 = a.d;
            bVar2.a(">>>> pressingViewWithStates TRUE 0", new Object[0]);
            if (e.u(this.f296h)) {
                Component component = this.f296h;
                bVar2.a(">>>>>>>>>> HANDLEFAKESTATES: Event fired by componentChild: %s with href: %s", component.a, component.f7084e);
                BravoApp.H = false;
                bVar2.a(">>>> pressingViewWithStates FALSE 0", new Object[0]);
                c b2 = c.b();
                String str2 = this.f297i;
                Component component2 = this.f296h;
                b2.g(e.L(str2, component2.v, component2.f7084e, component2.f7089k, component2.f7092n, component2.f7087i));
            }
            bVar2.a(">>>>>>>>>> HANDLEFAKESTATES: ACTION_DOWN", new Object[0]);
            List<Component> list3 = this.f298j.f7091m;
            i.c(list3);
            int size = list3.size();
            while (i2 < size) {
                List<Component> list4 = this.f298j.f7091m;
                i.c(list4);
                if (i.a(list4.get(i2).t, "pressed")) {
                    View childAt = this.f299k.getChildAt(this.f300l + i2);
                    i.d(childAt, "containerParent.getChild…nitialChildrenNumber + i)");
                    o.l(childAt);
                } else {
                    View childAt2 = this.f299k.getChildAt(this.f300l + i2);
                    i.d(childAt2, "containerParent.getChild…nitialChildrenNumber + i)");
                    o.e(childAt2);
                }
                i2++;
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            List<Component> list5 = this.f298j.f7091m;
            i.c(list5);
            Iterator<T> it = list5.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (i.a(((Component) t).t, "active")) {
                    break;
                }
            }
            boolean z = t != null;
            a.b bVar3 = a.d;
            bVar3.a(">>>>>>>>>> HANDLEFAKESTATES: ACTION_UP", new Object[0]);
            BravoApp.b bVar4 = BravoApp.Q;
            BravoApp.H = false;
            bVar3.a(">>>> pressingViewWithStates FALSE 1", new Object[0]);
            if (!i.a(this.f298j.w, "default") || !z) {
                this.f298j.w = "default";
            } else {
                this.f298j.w = "active";
            }
            String str3 = this.f301m;
            JsonApp jsonApp = BravoApp.f6915o;
            if (!(jsonApp == null || (app2 = jsonApp.d) == null || (data = app2.f7062e) == null || (list = data.a) == null || (page = list.get(0)) == null || (list2 = page.f) == null || (container = list2.get(0)) == null)) {
                str = container.a;
            }
            if (i.a(str3, str)) {
                bVar3.a(">>>>>>>>>> HANDLEFAKESTATES: IT IS CONTAINER MENU ", new Object[0]);
                for (View next : ViewGroupKt.getChildren(this.f299k)) {
                    Object[] objArr = new Object[1];
                    Object tag = next.getTag(R.id.state);
                    if (tag == null) {
                        tag = "NULL";
                    }
                    objArr[0] = tag;
                    a.d.a(">>>>>>>>>> HANDLEFAKESTATES: tag value: %s", objArr);
                    if (!(next instanceof ViewStub)) {
                        if (next.getTag(R.id.state) == null || !(!i.a(next.getTag(R.id.state), "default"))) {
                            o.l(next);
                        } else {
                            o.e(next);
                        }
                    }
                }
                List<Component> list6 = this.f298j.f7091m;
                i.c(list6);
                int size2 = list6.size();
                while (i2 < size2) {
                    List<Component> list7 = this.f298j.f7091m;
                    i.c(list7);
                    if (i.a(list7.get(i2).t, "active")) {
                        View childAt3 = this.f299k.getChildAt(this.f300l + i2);
                        i.d(childAt3, "containerParent.getChild…nitialChildrenNumber + i)");
                        o.l(childAt3);
                    } else {
                        View childAt4 = this.f299k.getChildAt(this.f300l + i2);
                        i.d(childAt4, "containerParent.getChild…nitialChildrenNumber + i)");
                        o.e(childAt4);
                    }
                    i2++;
                }
            } else {
                bVar3.a(">>>>>>>>>> HANDLEFAKESTATES: NOT CONTAINER MENU", new Object[0]);
                List<Component> list8 = this.f298j.f7091m;
                i.c(list8);
                int size3 = list8.size();
                while (i2 < size3) {
                    if (!i.a(this.f298j.w, "active") || !z) {
                        obj = "default";
                    } else {
                        obj = "active";
                    }
                    List<Component> list9 = this.f298j.f7091m;
                    i.c(list9);
                    if (i.a(list9.get(i2).t, obj)) {
                        View childAt5 = this.f299k.getChildAt(this.f300l + i2);
                        i.d(childAt5, "containerParent.getChild…nitialChildrenNumber + i)");
                        o.l(childAt5);
                    } else {
                        View childAt6 = this.f299k.getChildAt(this.f300l + i2);
                        i.d(childAt6, "containerParent.getChild…nitialChildrenNumber + i)");
                        o.e(childAt6);
                    }
                    i2++;
                }
            }
        } else {
            BravoApp.b bVar5 = BravoApp.Q;
            BravoApp.H = false;
            a.b bVar6 = a.d;
            bVar6.a(">>>> pressingViewWithStates FALSE 2", new Object[0]);
            bVar6.a(">>>>>>>>>> HANDLEFAKESTATES: different event: %s", String.valueOf(motionEvent.getActionMasked()));
        }
        return true;
    }
}
