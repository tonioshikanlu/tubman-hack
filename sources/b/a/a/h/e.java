package b.a.a.h;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.a.h;
import b.a.a.g.k;
import b.a.a.n.f;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Actions;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Data;
import com.appfoundry.previewer.model.Dimensions;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Params;
import com.appfoundry.previewer.model.RichText;
import com.appfoundry.previewer.model.States;
import com.appfoundry.previewer.model.Style;
import com.appfoundry.previewer.model.Tap;
import com.appfoundry.previewer.model.Text;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.segment.analytics.integrations.BasePayload;
import e.j;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p.a.a.c;

public final class e {

    public static final class a implements TextWatcher {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f261h;

        public a(String str) {
            this.f261h = str;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            q.a.a.d.a("text changed:%s for pageId=%s", String.valueOf(charSequence), this.f261h);
            c b2 = c.b();
            String valueOf = String.valueOf(charSequence);
            String str = this.f261h;
            if (str == null) {
                str = "";
            }
            b2.g(new k(valueOf, str));
        }
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Component f262h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String f263i;

        public b(Component component, String str) {
            this.f262h = component;
            this.f263i = str;
        }

        public final void onClick(View view) {
            c b2 = c.b();
            String str = this.f263i;
            Component component = this.f262h;
            b2.g(b.f.a.e.L(str, component.v, component.f7084e, component.f7089k, component.f7092n, component.f7087i));
        }
    }

    public static final boolean A(Page page) {
        i.e(page, "$this$isLogin");
        return i.a(page.c, "page:login");
    }

    public static final Boolean B(Page page) {
        i.e(page, "$this$isModal");
        String str = page.c;
        if (str != null) {
            return Boolean.valueOf(str.equals("page:modal"));
        }
        return null;
    }

    public static final boolean C(Page page) {
        i.e(page, "$this$isModalOrPopup");
        Boolean B = B(page);
        Boolean bool = Boolean.TRUE;
        return i.a(B, bool) || i.a(D(page), bool);
    }

    public static final Boolean D(Page page) {
        i.e(page, "$this$isPopUp");
        String str = page.c;
        if (str != null) {
            return Boolean.valueOf(str.equals("page:popup"));
        }
        return null;
    }

    public static final boolean E(Page page) {
        i.e(page, "$this$isRemote");
        String str = page.f7132k;
        if (str == null || !(!i.a(str, ""))) {
            return false;
        }
        return true;
    }

    public static final boolean F(Container container) {
        i.e(container, "$this$isSlider");
        return i.a(container.f7096b, "container:slider");
    }

    public static final Boolean G(Component component, String str) {
        i.e(component, "$this$isType");
        i.e(str, "someType");
        String str2 = component.f7083b;
        if (str2 != null) {
            return Boolean.valueOf(str2.equals(str));
        }
        return null;
    }

    public static final void H(Container container) {
        List<Component> list;
        Object obj;
        Container container2 = container;
        i.e(container2, "$this$parseStates");
        ArrayList<Component> arrayList = new ArrayList<>();
        List<Component> list2 = container2.f;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (T next : list2) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Component component = (Component) next;
                    i.e(component, "$this$hasBothStateTags");
                    String str = component.s;
                    if (((str == null || component.t == null) ? false : true) && str != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (i.a(((Component) obj).s, component.s)) {
                                break;
                            }
                        }
                        Component component2 = (Component) obj;
                        if (component2 != null) {
                            List<Component> list3 = component2.f7091m;
                            i.c(list3);
                            list3.add(component);
                        } else {
                            String str2 = component.a;
                            String str3 = component.d;
                            String str4 = component.s;
                            String str5 = component.t;
                            i.e(str4, "stateSetId");
                            String m2 = b.e.a.a.a.m("fake_compound_", str2);
                            ArrayList arrayList3 = r8;
                            ArrayList arrayList4 = new ArrayList();
                            Component component3 = r9;
                            Component component4 = new Component(m2, "component:compound-fake", (Text) null, str3, (String) null, (String) null, (String) null, (Integer) null, (List<String>) null, (Params) null, (Actions) null, (States) null, arrayList3, (String) null, (String) null, (String) null, (List<RichText>) null, (String) null, str4, str5, (String) null, (String) null, (String) null);
                            i.c(arrayList4);
                            arrayList4.add(component);
                            arrayList.add(component3);
                        }
                    }
                    i.e(component, "$this$hasStatesRelatedTag");
                    if (!(component.s != null || component.t != null) || component.f7087i == null) {
                        arrayList2.add(next);
                    }
                    i2 = i3;
                } else {
                    g.S();
                    throw null;
                }
            }
            list = g.a0(arrayList2);
        } else {
            list = null;
        }
        container2.f = list;
        if (!arrayList.isEmpty()) {
            for (Component component5 : arrayList) {
                component5.f7083b = "component:compound-fake";
                List<Component> list4 = container2.f;
                if (list4 != null) {
                    list4.add(component5);
                }
            }
        }
        arrayList.clear();
    }

    public static final void I(Page page) {
        i.e(page, "$this$parseStates");
        List<Container> list = page.f;
        if (list != null) {
            for (Container container : list) {
                if (F(container)) {
                    List<Container> list2 = container.f7103l;
                    if (list2 != null) {
                        for (Container H : list2) {
                            H(H);
                        }
                    }
                } else {
                    H(container);
                }
            }
        }
    }

    public static final void J(Fragment fragment, String str) {
        i.e(fragment, "$this$showStatusBar");
        i.e(str, "tone");
        if (fragment.getActivity() != null && (fragment.getActivity() instanceof AppCompatActivity)) {
            FragmentActivity activity = fragment.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            ((AppCompatActivity) activity).getWindow().clearFlags(1024);
            boolean a2 = i.a(str, "statusbar:dark");
            FragmentActivity activity2 = fragment.getActivity();
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            Window window = ((AppCompatActivity) activity2).getWindow();
            i.d(window, "(activity as AppCompatActivity).window");
            View decorView = window.getDecorView();
            i.d(decorView, "(activity as AppCompatActivity).window.decorView");
            decorView.setSystemUiVisibility(a2 ? 9472 : 1280);
        }
    }

    public static final void a(Container container, Context context, FrameLayout frameLayout, int i2, int i3, Boolean bool) {
        i.e(container, "$this$addBackgroundComponents");
        i.e(frameLayout, "containerParent");
        if (F(container)) {
            frameLayout = (FrameLayout) frameLayout.findViewById(R.id.container_viewpager_background);
        }
        Container container2 = container.f7098g;
        if ((container2 != null ? container2.f : null) != null) {
            List<Component> list = container2.f;
            i.c(list);
            for (Component next : list) {
                if (frameLayout != null) {
                    frameLayout.addView(i(next, context, (String) null, i2, i3, bool, 0, false, 96));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(com.appfoundry.previewer.model.Container r16, android.content.Context r17, java.lang.String r18, android.widget.FrameLayout r19, int r20, int r21, java.lang.Boolean r22, int r23) {
        /*
            r0 = r16
            r3 = r19
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "$this$addChildren"
            e.x.c.i.e(r0, r2)
            java.lang.String r2 = "context"
            r4 = r17
            e.x.c.i.e(r4, r2)
            java.lang.String r2 = "containerParent"
            e.x.c.i.e(r3, r2)
            boolean r2 = z(r16)
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x004d
            r1 = 2131230860(0x7f08008c, float:1.8077785E38)
            android.view.View r1 = r3.findViewById(r1)
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0285
            java.util.List<com.appfoundry.previewer.model.Container> r9 = r0.f7103l
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            com.appfoundry.previewer.model.Page r0 = b.a.a.n.f.n(r18)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r0.r
            goto L_0x003b
        L_0x003a:
            r0 = r6
        L_0x003b:
            com.appfoundry.previewer.model.Style r0 = b.a.a.n.f.u(r0, r6, r5)
            if (r0 == 0) goto L_0x0043
            java.lang.Float r6 = r0.f7172i
        L_0x0043:
            r14 = r6
            r15 = 44
            r8 = r18
            b.f.a.e.C0(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0285
        L_0x004d:
            boolean r2 = F(r16)
            if (r2 == 0) goto L_0x026f
            b.a.a.l.a r2 = new b.a.a.l.a
            java.util.List<com.appfoundry.previewer.model.Container> r9 = r0.f7103l
            r10 = 0
            java.lang.String r4 = "$this$isSliderInfinite"
            e.x.c.i.e(r0, r4)
            com.appfoundry.previewer.model.Params r4 = r0.f7104m
            if (r4 == 0) goto L_0x0064
            java.lang.Boolean r4 = r4.f7151q
            goto L_0x0065
        L_0x0064:
            r4 = r6
        L_0x0065:
            boolean r4 = e.x.c.i.a(r4, r1)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            com.appfoundry.previewer.model.Page r4 = b.a.a.n.f.n(r18)
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = r4.r
            goto L_0x0077
        L_0x0076:
            r4 = r6
        L_0x0077:
            com.appfoundry.previewer.model.Style r4 = b.a.a.n.f.u(r4, r6, r5)
            if (r4 == 0) goto L_0x0081
            java.lang.Float r4 = r4.f7172i
            r12 = r4
            goto L_0x0082
        L_0x0081:
            r12 = r6
        L_0x0082:
            r13 = 4
            r7 = r2
            r8 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4 = 2131230862(0x7f08008e, float:1.8077789E38)
            android.view.View r4 = r3.findViewById(r4)
            androidx.viewpager2.widget.ViewPager2 r4 = (androidx.viewpager2.widget.ViewPager2) r4
            java.lang.String r7 = "viewPager"
            e.x.c.i.d(r4, r7)
            r4.setAdapter(r2)
            java.lang.String r7 = "$this$getSliderAnimation"
            e.x.c.i.e(r0, r7)
            com.appfoundry.previewer.model.Params r7 = r0.f7104m
            if (r7 == 0) goto L_0x00a6
            java.lang.String r8 = r7.r
            goto L_0x00a7
        L_0x00a6:
            r8 = r6
        L_0x00a7:
            if (r8 == 0) goto L_0x0119
            java.lang.String r7 = r7.r
            if (r7 != 0) goto L_0x00af
            goto L_0x0119
        L_0x00af:
            int r8 = r7.hashCode()
            switch(r8) {
                case -925180581: goto L_0x010b;
                case 3064885: goto L_0x00fd;
                case 3744723: goto L_0x00ef;
                case 106426307: goto L_0x00e1;
                case 1171402135: goto L_0x00d3;
                case 1387629604: goto L_0x00c5;
                case 1397903036: goto L_0x00b7;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x0119
        L_0x00b7:
            java.lang.String r8 = "crossfade"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0119
            b.a.a.b.n.a r7 = new b.a.a.b.n.a
            r7.<init>()
            goto L_0x011a
        L_0x00c5:
            java.lang.String r8 = "horizontal"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0119
            b.a.a.b.n.c r7 = new b.a.a.b.n.c
            r7.<init>()
            goto L_0x011a
        L_0x00d3:
            java.lang.String r8 = "parallax"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0119
            b.a.a.b.n.e r7 = new b.a.a.b.n.e
            r7.<init>()
            goto L_0x011a
        L_0x00e1:
            java.lang.String r8 = "pager"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0119
            b.a.a.b.n.d r7 = new b.a.a.b.n.d
            r7.<init>()
            goto L_0x011a
        L_0x00ef:
            java.lang.String r8 = "zoom"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0119
            b.a.a.b.n.g r7 = new b.a.a.b.n.g
            r7.<init>()
            goto L_0x011a
        L_0x00fd:
            java.lang.String r8 = "cube"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0119
            b.a.a.b.n.b r7 = new b.a.a.b.n.b
            r7.<init>()
            goto L_0x011a
        L_0x010b:
            java.lang.String r8 = "rotate"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0119
            b.a.a.b.n.f r7 = new b.a.a.b.n.f
            r7.<init>()
            goto L_0x011a
        L_0x0119:
            r7 = r6
        L_0x011a:
            if (r7 == 0) goto L_0x011f
            r4.setPageTransformer(r7)
        L_0x011f:
            java.lang.String r7 = "$this$getIndicatorColor"
            e.x.c.i.e(r0, r7)
            java.util.List<java.lang.String> r7 = r0.f7101j
            r8 = 0
            if (r7 == 0) goto L_0x0147
            java.util.Iterator r7 = r7.iterator()
        L_0x012d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0143
            java.lang.Object r9 = r7.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "slider-indicator"
            boolean r10 = e.c0.h.d(r10, r11, r8, r5)
            if (r10 == 0) goto L_0x012d
            goto L_0x0144
        L_0x0143:
            r9 = r6
        L_0x0144:
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0148
        L_0x0147:
            r9 = r6
        L_0x0148:
            r5 = 1
            if (r9 == 0) goto L_0x015c
            java.lang.String r7 = b.a.a.h.m.l(r9)
            if (r7 == 0) goto L_0x015c
            boolean r7 = b.a.a.h.m.i(r7)
            if (r7 != r5) goto L_0x015c
            java.lang.String r7 = b.a.a.h.m.l(r9)
            goto L_0x015e
        L_0x015c:
            java.lang.String r7 = "#FFFFFF"
        L_0x015e:
            if (r7 == 0) goto L_0x023f
            int r9 = r2.getItemCount()
            if (r9 <= r5) goto L_0x023f
            java.util.List<com.appfoundry.previewer.model.Container> r9 = r0.f7103l
            if (r9 == 0) goto L_0x0173
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0174
        L_0x0173:
            r9 = r6
        L_0x0174:
            if (r9 == 0) goto L_0x023f
            java.util.List<com.appfoundry.previewer.model.Container> r9 = r0.f7103l
            int r9 = r9.size()
            if (r9 <= r5) goto L_0x023f
            r5 = 2131230864(0x7f080090, float:1.8077793E38)
            android.view.View r3 = r3.findViewById(r5)
            com.appfoundry.previewer.custom.DotIndicator r3 = (com.appfoundry.previewer.custom.DotIndicator) r3
            r3.setVisibility(r8)
            java.util.List<com.appfoundry.previewer.model.Container> r5 = r0.f7103l
            int r5 = r5.size()
            int r7 = b.a.a.h.m.m(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.f7044h = r4
            r3.x = r5
            if (r7 == 0) goto L_0x01a3
            int r7 = r7.intValue()
            goto L_0x01a5
        L_0x01a3:
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x01a5:
            r3.v = r7
            androidx.viewpager2.widget.ViewPager2 r7 = r3.f7044h
            if (r7 == 0) goto L_0x023f
            androidx.recyclerview.widget.RecyclerView$Adapter r7 = r7.getAdapter()
            if (r7 == 0) goto L_0x023f
            r7 = -1
            r3.w = r7
            r3.removeAllViews()
            int r7 = r3.x
            if (r7 > 0) goto L_0x01bc
            goto L_0x0200
        L_0x01bc:
            androidx.viewpager2.widget.ViewPager2 r7 = r3.f7044h
            if (r7 == 0) goto L_0x01c9
            int r7 = r7.getCurrentItem()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x01ca
        L_0x01c9:
            r7 = r6
        L_0x01ca:
            if (r7 == 0) goto L_0x01e5
            androidx.viewpager2.widget.ViewPager2 r7 = r3.f7044h
            if (r7 == 0) goto L_0x01d9
            int r7 = r7.getCurrentItem()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x01da
        L_0x01d9:
            r7 = r6
        L_0x01da:
            e.x.c.i.c(r7)
            int r7 = r7.intValue()
            int r9 = r3.x
            int r7 = r7 % r9
            goto L_0x01e6
        L_0x01e5:
            r7 = r8
        L_0x01e6:
            int r9 = r3.getOrientation()
            int r10 = r3.x
            r11 = r8
        L_0x01ed:
            if (r11 >= r10) goto L_0x0200
            if (r7 != r11) goto L_0x01f6
            int r12 = r3.f7050n
            android.animation.Animator r13 = r3.r
            goto L_0x01fa
        L_0x01f6:
            int r12 = r3.f7051o
            android.animation.Animator r13 = r3.s
        L_0x01fa:
            r3.a(r9, r12, r13)
            int r11 = r11 + 1
            goto L_0x01ed
        L_0x0200:
            androidx.viewpager2.widget.ViewPager2 r7 = r3.f7044h
            if (r7 == 0) goto L_0x0209
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r9 = r3.y
            r7.unregisterOnPageChangeCallback(r9)
        L_0x0209:
            androidx.viewpager2.widget.ViewPager2 r7 = r3.f7044h
            if (r7 == 0) goto L_0x0212
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r9 = r3.y
            r7.registerOnPageChangeCallback(r9)
        L_0x0212:
            androidx.viewpager2.widget.ViewPager2 r7 = r3.f7044h
            if (r7 == 0) goto L_0x021f
            int r7 = r7.getCurrentItem()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0220
        L_0x021f:
            r7 = r6
        L_0x0220:
            if (r7 == 0) goto L_0x0239
            androidx.viewpager2.widget.ViewPager2 r7 = r3.f7044h
            if (r7 == 0) goto L_0x022f
            int r7 = r7.getCurrentItem()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0230
        L_0x022f:
            r7 = r6
        L_0x0230:
            e.x.c.i.c(r7)
            int r7 = r7.intValue()
            int r7 = r7 % r5
            goto L_0x023a
        L_0x0239:
            r7 = r8
        L_0x023a:
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r3 = r3.y
            r3.onPageSelected(r7)
        L_0x023f:
            java.lang.String r3 = "$this$isSliderAutomatic"
            e.x.c.i.e(r0, r3)
            com.appfoundry.previewer.model.Params r0 = r0.f7104m
            if (r0 == 0) goto L_0x024a
            java.lang.Boolean r6 = r0.s
        L_0x024a:
            boolean r0 = e.x.c.i.a(r6, r1)
            if (r0 == 0) goto L_0x0285
            java.lang.String r0 = "$this$createAutoSlideHandler"
            e.x.c.i.e(r4, r0)
            java.lang.String r0 = "viewPagerAdapter"
            e.x.c.i.e(r2, r0)
            e.x.c.s r0 = new e.x.c.s
            r0.<init>()
            r0.f7987h = r8
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            b.a.a.h.x r3 = new b.a.a.h.x
            r3.<init>(r4, r2, r0, r1)
            r1.post(r3)
            goto L_0x0285
        L_0x026f:
            r8 = 0
            r9 = 128(0x80, float:1.794E-43)
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0285:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.e.b(com.appfoundry.previewer.model.Container, android.content.Context, java.lang.String, android.widget.FrameLayout, int, int, java.lang.Boolean, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: b.a.a.i.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: b.a.a.i.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: b.a.a.i.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: b.a.a.i.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ab, code lost:
        if (e.x.c.i.a(r10, r7) != false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02bc, code lost:
        if (e.x.c.i.a(r10, "active") != false) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02c0, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05ad, code lost:
        if (e.x.c.i.a(r0, "audio:loading") != false) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0699, code lost:
        if (e.x.c.i.a(r0, "audio:loading") != false) goto L_0x069b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x06b3  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x06c9  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x06cd  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x06f8  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x075d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0774  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(com.appfoundry.previewer.model.Container r53, android.content.Context r54, java.lang.String r55, android.widget.FrameLayout r56, int r57, int r58, java.lang.Boolean r59, int r60, boolean r61, int r62) {
        /*
            r0 = r53
            r11 = r55
            r12 = r56
            r13 = r57
            r14 = r58
            r1 = r62
            r2 = r1 & 32
            if (r2 == 0) goto L_0x0014
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r15 = r2
            goto L_0x0016
        L_0x0014:
            r15 = r59
        L_0x0016:
            r2 = r1 & 64
            if (r2 == 0) goto L_0x001d
            r16 = 0
            goto L_0x001f
        L_0x001d:
            r16 = r60
        L_0x001f:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0026
            r17 = 0
            goto L_0x0028
        L_0x0026:
            r17 = r61
        L_0x0028:
            java.lang.String r1 = "$this$addComponents"
            e.x.c.i.e(r0, r1)
            java.lang.String r9 = "containerParent"
            e.x.c.i.e(r12, r9)
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r0.f
            if (r1 == 0) goto L_0x0781
            e.x.c.i.c(r1)
            java.util.Iterator r18 = r1.iterator()
            r8 = r54
            r1 = r0
        L_0x0040:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L_0x0781
            java.lang.Object r2 = r18.next()
            r7 = r2
            com.appfoundry.previewer.model.Component r7 = (com.appfoundry.previewer.model.Component) r7
            java.lang.String r2 = r7.d
            com.appfoundry.previewer.model.Style r2 = b.a.a.n.f.t(r2, r15)
            if (r2 == 0) goto L_0x0058
            com.appfoundry.previewer.model.Shadow r3 = r2.z
            goto L_0x0059
        L_0x0058:
            r3 = 0
        L_0x0059:
            java.lang.String r5 = "component:text"
            r4 = -1
            r10 = 1
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = r7.f7083b
            boolean r3 = e.x.c.i.a(r3, r5)
            r3 = r3 ^ r10
            java.lang.String r6 = "component:svg"
            if (r3 == 0) goto L_0x009c
            java.lang.String r3 = r7.f7083b
            boolean r3 = e.x.c.i.a(r3, r6)
            r3 = r3 ^ r10
            if (r3 == 0) goto L_0x009c
            java.lang.String r3 = "style"
            e.x.c.i.e(r2, r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r4, r4)
            b.a.a.i.l r4 = b.f.a.e.M(r2, r13, r14)
            com.appfoundry.previewer.model.Dimensions r10 = r4.c
            b.f.a.e.z0(r3, r10)
            b.a.a.b.k r10 = new b.a.a.b.k
            r10.<init>(r8, r4)
            r10.setLayoutParams(r3)
            java.lang.Float r2 = r2.F
            if (r2 == 0) goto L_0x0099
            float r2 = r2.floatValue()
            r10.setRotation(r2)
        L_0x0099:
            r12.addView(r10)
        L_0x009c:
            java.lang.String r2 = r7.f7083b
            boolean r2 = e.x.c.i.a(r2, r6)
            if (r2 == 0) goto L_0x00f4
            java.lang.String r2 = "component:svg-web-view"
            r7.f7083b = r2
            java.lang.String r2 = r7.f
            com.appfoundry.previewer.model.Asset r2 = b.a.a.n.f.h(r2, r15)
            if (r2 == 0) goto L_0x00b5
            java.lang.String r2 = r2.f7065b
            r20 = r2
            goto L_0x00b7
        L_0x00b5:
            r20 = 0
        L_0x00b7:
            com.appfoundry.previewer.model.Params r2 = new com.appfoundry.previewer.model.Params
            r19 = r2
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r7.f7088j = r2
        L_0x00f4:
            java.lang.String r2 = r1.a
            r7.v = r2
            java.lang.String r2 = "$this$isEnablePushButtonThatShouldBeHidden"
            e.x.c.i.e(r7, r2)
            com.appfoundry.previewer.BravoApp$b r2 = com.appfoundry.previewer.BravoApp.Q
            boolean r2 = com.appfoundry.previewer.BravoApp.w
            if (r2 != 0) goto L_0x0107
            boolean r2 = com.appfoundry.previewer.BravoApp.x
            if (r2 == 0) goto L_0x0122
        L_0x0107:
            java.lang.String r2 = "$this$hasEnableNotificationsTag"
            e.x.c.i.e(r7, r2)
            java.util.List<java.lang.String> r2 = r7.f7087i
            if (r2 == 0) goto L_0x0117
            java.lang.String r3 = "enablenotifications"
            boolean r2 = b.f.a.e.d0(r2, r3)
            goto L_0x0118
        L_0x0117:
            r2 = 0
        L_0x0118:
            if (r2 == 0) goto L_0x0122
            boolean r2 = b.f.a.e.N0()
            if (r2 == 0) goto L_0x0122
            r2 = 1
            goto L_0x0123
        L_0x0122:
            r2 = 0
        L_0x0123:
            if (r2 != 0) goto L_0x0774
            java.lang.String r1 = r7.f7083b
            java.lang.String r10 = "component"
            if (r1 != 0) goto L_0x012d
            goto L_0x03e1
        L_0x012d:
            int r2 = r1.hashCode()
            r3 = -317907064(0xffffffffed0d1f88, float:-2.729719E27)
            java.lang.String r4 = "component:compound-fake"
            java.lang.String r6 = "component:compound"
            if (r2 == r3) goto L_0x0148
            r3 = 67849850(0x40b4e7a, float:1.6375406E-36)
            if (r2 == r3) goto L_0x0141
            goto L_0x03e1
        L_0x0141:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x03e1
            goto L_0x014e
        L_0x0148:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x03e1
        L_0x014e:
            java.lang.String r1 = "$this$createAndAddCompoundComponent"
            e.x.c.i.e(r7, r1)
            e.x.c.i.e(r12, r9)
            java.lang.String r1 = "$this$isCompoundWithPressedState"
            e.x.c.i.e(r7, r1)
            java.lang.String r1 = r7.f7083b
            boolean r1 = e.x.c.i.a(r1, r6)
            if (r1 == 0) goto L_0x017f
            com.appfoundry.previewer.model.States r1 = r7.f7090l
            if (r1 == 0) goto L_0x017f
            com.appfoundry.previewer.model.State r1 = r1.f7163b
            if (r1 == 0) goto L_0x017f
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r7.f7091m
            if (r1 == 0) goto L_0x017f
            e.x.c.i.c(r1)
            boolean r1 = r1.isEmpty()
            r21 = 1
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0181
            r1 = r21
            goto L_0x0182
        L_0x017f:
            r21 = 1
        L_0x0181:
            r1 = 0
        L_0x0182:
            java.lang.String r6 = "default"
            if (r1 == 0) goto L_0x0229
            java.lang.String r1 = "$this$addCompoundComponentWithStates"
            e.x.c.i.e(r7, r1)
            e.x.c.i.e(r12, r9)
            e.j r8 = e(r7, r8, r13, r14, r15)
            A r1 = r8.f7906h
            android.view.View r1 = (android.view.View) r1
            r12.addView(r1)
            A r1 = r8.f7906h
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            B r1 = r8.f7907i
            b.a.a.i.b r1 = (b.a.a.i.b) r1
            int r4 = r1.a
            int r3 = r1.f308b
            java.lang.String r1 = "$this$handleStates"
            e.x.c.i.e(r5, r1)
            e.x.c.i.e(r7, r10)
            com.appfoundry.previewer.model.States r1 = r7.f7090l
            if (r1 == 0) goto L_0x01b4
            r1.f7165g = r6
        L_0x01b4:
            b.a.a.h.i r10 = new b.a.a.h.i
            r1 = r10
            r2 = r5
            r19 = r3
            r3 = r7
            r6 = r4
            r4 = r54
            r62 = r9
            r9 = r5
            r5 = r55
            r11 = 2
            r11 = r7
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.setOnTouchListener(r10)
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r11.f7091m
            if (r1 == 0) goto L_0x0221
            e.x.c.i.c(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x01d8:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0221
            java.lang.Object r1 = r11.next()
            com.appfoundry.previewer.model.Component r1 = (com.appfoundry.previewer.model.Component) r1
            A r2 = r8.f7906h
            r10 = r2
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            java.lang.String r2 = r1.d
            r3 = 2
            r4 = 0
            com.appfoundry.previewer.model.Style r5 = b.a.a.n.f.u(r2, r4, r3)
            B r2 = r8.f7907i
            b.a.a.i.b r2 = (b.a.a.i.b) r2
            int r6 = r2.a
            int r7 = r2.f308b
            r9 = 0
            r19 = 0
            r21 = 0
            r22 = 224(0xe0, float:3.14E-43)
            r2 = r54
            r3 = r55
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r23 = r8
            r8 = r19
            r47 = r62
            r9 = r21
            r59 = r11
            r11 = r10
            r10 = r22
            android.view.View r1 = p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.addView(r1)
            r11 = r59
            r8 = r23
            goto L_0x01d8
        L_0x0221:
            r47 = r62
            r10 = r54
            r0 = r47
            goto L_0x03dc
        L_0x0229:
            r11 = r7
            r47 = r9
            java.lang.String r1 = "$this$isFakeCompoundComponent"
            e.x.c.i.e(r11, r1)
            java.lang.String r1 = r11.f7083b
            boolean r1 = e.x.c.i.a(r1, r4)
            if (r1 == 0) goto L_0x0381
            java.lang.String r1 = "$this$addCompoundComponentWithFakeStates"
            e.x.c.i.e(r11, r1)
            r9 = r47
            e.x.c.i.e(r12, r9)
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r11.f7091m
            if (r1 == 0) goto L_0x037b
            int r22 = r56.getChildCount()
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r11.f7091m
            e.x.c.i.c(r1)
            java.util.Iterator r23 = r1.iterator()
        L_0x0254:
            boolean r1 = r23.hasNext()
            if (r1 == 0) goto L_0x037b
            java.lang.Object r1 = r23.next()
            r8 = r1
            com.appfoundry.previewer.model.Component r8 = (com.appfoundry.previewer.model.Component) r8
            java.lang.String r1 = r8.d
            r2 = 2
            r7 = 0
            com.appfoundry.previewer.model.Style r4 = b.a.a.n.f.u(r1, r7, r2)
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 224(0xe0, float:3.14E-43)
            r1 = r8
            r2 = r54
            r3 = r55
            r5 = 8
            r5 = r57
            r48 = r6
            r6 = r58
            r19 = r7
            r7 = r24
            r49 = r8
            r8 = r25
            r50 = r9
            r9 = r26
            r0 = r10
            r13 = r21
            r10 = r27
            android.view.View r8 = p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r9 = r49
            java.lang.String r6 = r9.t
            if (r6 == 0) goto L_0x029b
            r10 = r6
            goto L_0x029d
        L_0x029b:
            r10 = r48
        L_0x029d:
            java.lang.String r1 = r11.w
            r7 = r48
            boolean r1 = e.x.c.i.a(r1, r7)
            if (r1 == 0) goto L_0x02ae
            boolean r1 = e.x.c.i.a(r10, r7)
            if (r1 == 0) goto L_0x02c0
            goto L_0x02be
        L_0x02ae:
            java.lang.String r1 = r11.w
            java.lang.String r2 = "active"
            boolean r1 = e.x.c.i.a(r1, r2)
            if (r1 == 0) goto L_0x02c5
            boolean r1 = e.x.c.i.a(r10, r2)
            if (r1 == 0) goto L_0x02c0
        L_0x02be:
            r1 = 0
            goto L_0x02c2
        L_0x02c0:
            r1 = 8
        L_0x02c2:
            r8.setVisibility(r1)
        L_0x02c5:
            r1 = 2131231206(0x7f0801e6, float:1.8078486E38)
            r8.setTag(r1, r10)
            java.lang.String r6 = r11.v
            java.lang.String r1 = "$this$handleFakeStates"
            e.x.c.i.e(r8, r1)
            e.x.c.i.e(r11, r0)
            java.lang.String r1 = "componentChild"
            e.x.c.i.e(r9, r1)
            r5 = r50
            e.x.c.i.e(r12, r5)
            java.lang.String r1 = r11.w
            if (r1 != 0) goto L_0x02e5
            r11.w = r7
        L_0x02e5:
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r11.f7091m
            if (r1 == 0) goto L_0x0307
            java.util.Iterator r1 = r1.iterator()
        L_0x02ed:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0301
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.appfoundry.previewer.model.Component r3 = (com.appfoundry.previewer.model.Component) r3
            boolean r3 = u(r3)
            if (r3 == 0) goto L_0x02ed
            goto L_0x0303
        L_0x0301:
            r2 = r19
        L_0x0303:
            r1 = r2
            com.appfoundry.previewer.model.Component r1 = (com.appfoundry.previewer.model.Component) r1
            goto L_0x0309
        L_0x0307:
            r1 = r19
        L_0x0309:
            if (r1 != 0) goto L_0x030d
            r1 = r13
            goto L_0x030e
        L_0x030d:
            r1 = 0
        L_0x030e:
            boolean r2 = u(r9)
            if (r2 != 0) goto L_0x031d
            if (r1 == 0) goto L_0x0317
            goto L_0x031d
        L_0x0317:
            r21 = r0
            r0 = r5
            r25 = r7
            goto L_0x0338
        L_0x031d:
            b.a.a.h.w r4 = new b.a.a.h.w
            r1 = r4
            r2 = r9
            r3 = r55
            r13 = r4
            r4 = r11
            r21 = r0
            r0 = r5
            r5 = r56
            r24 = r6
            r6 = r22
            r25 = r7
            r7 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.setOnTouchListener(r13)
        L_0x0338:
            r12.addView(r8)
            java.lang.String r1 = r11.v
            if (r1 == 0) goto L_0x036d
            boolean r1 = b.a.a.h.m.g(r1)
            r2 = 1
            if (r1 != r2) goto L_0x036e
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.h>> r1 = com.appfoundry.previewer.BravoApp.I
            java.lang.Object r1 = r1.get(r10)
            if (r1 != 0) goto L_0x035a
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.h>> r1 = com.appfoundry.previewer.BravoApp.I
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.put(r10, r3)
        L_0x035a:
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.h>> r1 = com.appfoundry.previewer.BravoApp.I
            java.lang.Object r1 = r1.get(r10)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x036e
            b.a.a.i.h r3 = new b.a.a.i.h
            r3.<init>(r9, r8)
            r1.add(r3)
            goto L_0x036e
        L_0x036d:
            r2 = 1
        L_0x036e:
            r13 = r57
            r9 = r0
            r10 = r21
            r6 = r25
            r0 = r53
            r21 = r2
            goto L_0x0254
        L_0x037b:
            r0 = r9
            r10 = r54
            r13 = r57
            goto L_0x03dc
        L_0x0381:
            r0 = r47
            java.lang.String r1 = "$this$addCompoundComponentWithoutStates"
            e.x.c.i.e(r11, r1)
            e.x.c.i.e(r12, r0)
            r10 = r54
            r13 = r57
            e.j r9 = e(r11, r10, r13, r14, r15)
            A r1 = r9.f7906h
            android.view.View r1 = (android.view.View) r1
            r12.addView(r1)
            java.util.List<com.appfoundry.previewer.model.Component> r1 = r11.f7091m
            if (r1 == 0) goto L_0x03dc
            e.x.c.i.c(r1)
            java.util.Iterator r11 = r1.iterator()
        L_0x03a5:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x03dc
            java.lang.Object r1 = r11.next()
            com.appfoundry.previewer.model.Component r1 = (com.appfoundry.previewer.model.Component) r1
            A r2 = r9.f7906h
            r8 = r2
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            B r2 = r9.f7907i
            b.a.a.i.b r2 = (b.a.a.i.b) r2
            int r4 = r2.a
            int r5 = r2.f308b
            r6 = 0
            r7 = 0
            r19 = 0
            r20 = 112(0x70, float:1.57E-43)
            r2 = r54
            r3 = r55
            r51 = r8
            r8 = r19
            r19 = r9
            r9 = r20
            android.view.View r1 = i(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r51
            r2.addView(r1)
            r9 = r19
            goto L_0x03a5
        L_0x03dc:
            r47 = r0
            r8 = r10
            goto L_0x0770
        L_0x03e1:
            r11 = r7
            r0 = r9
            r21 = r10
            r9 = 1
            r19 = 0
            r10 = r54
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.String r1 = "$this$addSingleComponent"
            r6 = r53
            r2 = r21
            e.x.c.i.e(r6, r1)
            e.x.c.i.e(r11, r2)
            e.x.c.i.e(r12, r0)
            java.lang.String r1 = "dev:ignore:android"
            boolean r1 = w(r11, r1)
            if (r1 != 0) goto L_0x076d
            r1 = r11
            r2 = r54
            r3 = r55
            r4 = r57
            r52 = r5
            r5 = r58
            r9 = r6
            r6 = r15
            r47 = r0
            r0 = r7
            r7 = r16
            r10 = r8
            r8 = r17
            android.view.View r6 = h(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = ""
            r2 = r55
            r3 = r19
            if (r2 == 0) goto L_0x04c8
            boolean r4 = r6 instanceof android.widget.EditText
            java.lang.String r5 = "component:input-file"
            java.lang.String r7 = "component:input-image"
            if (r4 != 0) goto L_0x0440
            java.lang.Boolean r4 = G(r11, r7)
            boolean r4 = e.x.c.i.a(r4, r0)
            if (r4 != 0) goto L_0x0440
            java.lang.Boolean r4 = G(r11, r5)
            boolean r4 = e.x.c.i.a(r4, r0)
            if (r4 == 0) goto L_0x04c8
        L_0x0440:
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.d>> r4 = com.appfoundry.previewer.BravoApp.E
            java.lang.Object r4 = r4.get(r2)
            if (r4 != 0) goto L_0x0452
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.d>> r4 = com.appfoundry.previewer.BravoApp.E
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r4.put(r2, r8)
        L_0x0452:
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.d>> r4 = com.appfoundry.previewer.BravoApp.E
            java.lang.Object r4 = r4.get(r2)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x04c8
            b.a.a.i.d r8 = new b.a.a.i.d
            java.lang.String r3 = r11.f7083b
            if (r3 == 0) goto L_0x0465
            r22 = r3
            goto L_0x0467
        L_0x0465:
            r22 = r1
        L_0x0467:
            java.lang.String r3 = r11.a
            if (r3 == 0) goto L_0x046e
            r23 = r3
            goto L_0x0470
        L_0x046e:
            r23 = r1
        L_0x0470:
            java.lang.Boolean r3 = G(r11, r7)
            boolean r3 = e.x.c.i.a(r3, r0)
            if (r3 != 0) goto L_0x0487
            java.lang.Boolean r3 = G(r11, r5)
            boolean r0 = e.x.c.i.a(r3, r0)
            if (r0 == 0) goto L_0x0485
            goto L_0x0487
        L_0x0485:
            r0 = r6
            goto L_0x0488
        L_0x0487:
            r0 = 0
        L_0x0488:
            r24 = r0
            android.widget.EditText r24 = (android.widget.EditText) r24
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 248(0xf8, float:3.48E-43)
            r21 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r0 = "$this$addOrReplace"
            e.x.c.i.e(r4, r0)
            java.lang.String r0 = "newFormInput"
            e.x.c.i.e(r8, r0)
            int r0 = r4.size()
            r3 = 0
        L_0x04ac:
            if (r3 >= r0) goto L_0x04c5
            java.lang.Object r5 = r4.get(r3)
            b.a.a.i.d r5 = (b.a.a.i.d) r5
            java.lang.String r5 = r5.f310b
            java.lang.String r7 = r8.f310b
            boolean r5 = e.x.c.i.a(r5, r7)
            if (r5 == 0) goto L_0x04c2
            r4.set(r3, r8)
            goto L_0x04c8
        L_0x04c2:
            int r3 = r3 + 1
            goto L_0x04ac
        L_0x04c5:
            r4.add(r8)
        L_0x04c8:
            java.lang.String r0 = r9.f7105n
            if (r0 == 0) goto L_0x069f
            java.lang.String r0 = "$this$getAudioType"
            e.x.c.i.e(r11, r0)
            java.lang.String r0 = "play"
            boolean r0 = t(r11, r0)
            java.lang.String r3 = "action:pause"
            java.lang.String r4 = "action:play"
            if (r0 == 0) goto L_0x04df
            r0 = r4
            goto L_0x04ff
        L_0x04df:
            java.lang.String r0 = "pause"
            boolean r0 = t(r11, r0)
            if (r0 == 0) goto L_0x04e9
            r0 = r3
            goto L_0x04ff
        L_0x04e9:
            java.lang.String r0 = "audio"
            boolean r5 = w(r11, r0)
            if (r5 == 0) goto L_0x04fe
            java.util.List<java.lang.String> r5 = r11.f7087i
            if (r5 == 0) goto L_0x04fc
            java.lang.String r0 = b.f.a.e.P(r5, r0)
            if (r0 == 0) goto L_0x04fc
            goto L_0x04ff
        L_0x04fc:
            r0 = r1
            goto L_0x04ff
        L_0x04fe:
            r0 = 0
        L_0x04ff:
            if (r0 == 0) goto L_0x069f
            com.appfoundry.previewer.BravoApp$b r5 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r5 = com.appfoundry.previewer.BravoApp.F
            java.lang.String r7 = r9.f7105n
            java.lang.Object r5 = r5.get(r7)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0537
            java.util.Iterator r5 = r5.iterator()
        L_0x0513:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0530
            java.lang.Object r7 = r5.next()
            r8 = r7
            b.a.a.i.a r8 = (b.a.a.i.a) r8
            java.lang.String r8 = r8.a
            r59 = r1
            java.lang.String r1 = r11.a
            boolean r1 = e.x.c.i.a(r8, r1)
            if (r1 == 0) goto L_0x052d
            goto L_0x0533
        L_0x052d:
            r1 = r59
            goto L_0x0513
        L_0x0530:
            r59 = r1
            r7 = 0
        L_0x0533:
            r1 = r7
            b.a.a.i.a r1 = (b.a.a.i.a) r1
            goto L_0x053a
        L_0x0537:
            r59 = r1
            r1 = 0
        L_0x053a:
            if (r1 != 0) goto L_0x0561
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r1 = com.appfoundry.previewer.BravoApp.F
            java.lang.String r5 = r9.f7105n
            java.lang.Object r1 = r1.get(r5)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0568
            b.a.a.i.a r5 = new b.a.a.i.a
            java.lang.String r7 = r11.a
            if (r7 == 0) goto L_0x0551
            goto L_0x0553
        L_0x0551:
            r7 = r59
        L_0x0553:
            java.lang.String r8 = r9.a
            if (r8 == 0) goto L_0x0558
            goto L_0x055a
        L_0x0558:
            r8 = r59
        L_0x055a:
            r5.<init>(r7, r8, r0, r6)
            r1.add(r5)
            goto L_0x0568
        L_0x0561:
            java.lang.String r5 = "<set-?>"
            e.x.c.i.e(r6, r5)
            r1.d = r6
        L_0x0568:
            java.lang.String r1 = r9.a
            r11.v = r1
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
            b.a.a.i.g r1 = com.appfoundry.previewer.BravoApp.G
            java.lang.String r5 = "0:00"
            java.lang.String r7 = "audio:currenttime"
            java.lang.String r8 = "audio:totaltime"
            java.lang.String r2 = "audio:loading"
            if (r1 != 0) goto L_0x05b1
            boolean r1 = e.x.c.i.a(r0, r8)
            if (r1 == 0) goto L_0x0586
            r1 = 8
            r6.setVisibility(r1)
            goto L_0x0588
        L_0x0586:
            r1 = 8
        L_0x0588:
            boolean r7 = e.x.c.i.a(r0, r7)
            if (r7 == 0) goto L_0x0594
            r7 = r6
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setText(r5)
        L_0x0594:
            boolean r4 = e.x.c.i.a(r0, r4)
            if (r4 == 0) goto L_0x059f
            r4 = 0
            r6.setVisibility(r4)
            goto L_0x05a0
        L_0x059f:
            r4 = 0
        L_0x05a0:
            boolean r3 = e.x.c.i.a(r0, r3)
            if (r3 == 0) goto L_0x05a9
            r6.setVisibility(r1)
        L_0x05a9:
            boolean r0 = e.x.c.i.a(r0, r2)
            if (r0 == 0) goto L_0x06a0
            goto L_0x069b
        L_0x05b1:
            r9 = 0
            java.lang.String r1 = r1.a
            if (r1 == 0) goto L_0x05b7
            goto L_0x05b9
        L_0x05b7:
            r1 = r59
        L_0x05b9:
            java.lang.String r9 = j(r53)
            if (r9 == 0) goto L_0x0666
            boolean r1 = e.x.c.i.a(r9, r1)
            if (r1 == 0) goto L_0x0666
            boolean r1 = e.x.c.i.a(r0, r8)
            if (r1 == 0) goto L_0x05e7
            r1 = 0
            r6.setVisibility(r1)
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
            b.a.a.i.g r5 = com.appfoundry.previewer.BravoApp.G
            if (r5 == 0) goto L_0x05e3
            android.media.MediaPlayer r5 = r5.c
            if (r5 == 0) goto L_0x05e3
            int r5 = r5.getDuration()
            java.lang.String r5 = b.f.a.e.k0(r5)
            goto L_0x05e4
        L_0x05e3:
            r5 = 0
        L_0x05e4:
            r1.setText(r5)
        L_0x05e7:
            b.a.a.i.g r1 = com.appfoundry.previewer.BravoApp.G
            if (r1 == 0) goto L_0x0629
            android.media.MediaPlayer r1 = r1.c
            if (r1 == 0) goto L_0x0629
            boolean r1 = r1.isPlaying()
            r5 = 1
            if (r1 != r5) goto L_0x0629
            boolean r1 = e.x.c.i.a(r0, r4)
            if (r1 == 0) goto L_0x0602
            r1 = 8
            r6.setVisibility(r1)
            goto L_0x0604
        L_0x0602:
            r1 = 8
        L_0x0604:
            boolean r3 = e.x.c.i.a(r0, r3)
            if (r3 == 0) goto L_0x060e
            r3 = 0
            r6.setVisibility(r3)
        L_0x060e:
            boolean r2 = e.x.c.i.a(r0, r2)
            if (r2 == 0) goto L_0x0617
            r6.setVisibility(r1)
        L_0x0617:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            java.util.Objects.requireNonNull(r10, r1)
            r8 = r10
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            b.a.a.h.f r1 = new b.a.a.h.f
            r1.<init>(r0, r6)
            r8.runOnUiThread(r1)
            goto L_0x069f
        L_0x0629:
            boolean r1 = e.x.c.i.a(r0, r4)
            if (r1 == 0) goto L_0x0633
            r1 = 0
            r6.setVisibility(r1)
        L_0x0633:
            boolean r1 = e.x.c.i.a(r0, r3)
            if (r1 == 0) goto L_0x063e
            r1 = 8
            r6.setVisibility(r1)
        L_0x063e:
            boolean r1 = e.x.c.i.a(r0, r7)
            if (r1 == 0) goto L_0x065c
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
            b.a.a.i.g r3 = com.appfoundry.previewer.BravoApp.G
            if (r3 == 0) goto L_0x0658
            android.media.MediaPlayer r3 = r3.c
            if (r3 == 0) goto L_0x0658
            int r3 = r3.getCurrentPosition()
            java.lang.String r3 = b.f.a.e.k0(r3)
            goto L_0x0659
        L_0x0658:
            r3 = 0
        L_0x0659:
            r1.setText(r3)
        L_0x065c:
            boolean r0 = e.x.c.i.a(r0, r2)
            if (r0 == 0) goto L_0x069f
            r1 = 8
            r4 = 0
            goto L_0x069b
        L_0x0666:
            boolean r1 = e.x.c.i.a(r0, r8)
            if (r1 == 0) goto L_0x0671
            r1 = 8
            r6.setVisibility(r1)
        L_0x0671:
            boolean r1 = e.x.c.i.a(r0, r7)
            if (r1 == 0) goto L_0x067d
            r1 = r6
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r5)
        L_0x067d:
            boolean r1 = e.x.c.i.a(r0, r4)
            r4 = 0
            if (r1 == 0) goto L_0x0687
            r6.setVisibility(r4)
        L_0x0687:
            boolean r1 = e.x.c.i.a(r0, r3)
            if (r1 == 0) goto L_0x0693
            r1 = 8
            r6.setVisibility(r1)
            goto L_0x0695
        L_0x0693:
            r1 = 8
        L_0x0695:
            boolean r0 = e.x.c.i.a(r0, r2)
            if (r0 == 0) goto L_0x06a0
        L_0x069b:
            r6.setVisibility(r1)
            goto L_0x06a0
        L_0x069f:
            r4 = 0
        L_0x06a0:
            java.lang.String r0 = "goBack"
            boolean r0 = t(r11, r0)
            if (r0 == 0) goto L_0x06d2
            if (r10 == 0) goto L_0x06d2
            java.lang.String r0 = "$this$hasNowhereToGoIfBack"
            e.x.c.i.e(r10, r0)
            boolean r0 = r10 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x06c9
            r8 = r10
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            androidx.fragment.app.FragmentManager r0 = r8.getSupportFragmentManager()
            java.lang.String r1 = "supportFragmentManager"
            e.x.c.i.d(r0, r1)
            int r0 = r0.getBackStackEntryCount()
            r1 = 1
            if (r0 > r1) goto L_0x06c7
            goto L_0x06ca
        L_0x06c7:
            r0 = r4
            goto L_0x06cb
        L_0x06c9:
            r1 = 1
        L_0x06ca:
            r0 = r1
        L_0x06cb:
            if (r0 != r1) goto L_0x06d2
            r0 = 8
            r6.setVisibility(r0)
        L_0x06d2:
            r12.addView(r6)
            java.lang.String r0 = "$this$handleLayoutGravityOnTexts"
            e.x.c.i.e(r11, r0)
            java.lang.String r0 = "componentView"
            e.x.c.i.e(r6, r0)
            java.lang.String r0 = r11.f7083b
            r1 = r52
            boolean r0 = e.x.c.i.a(r0, r1)
            if (r0 == 0) goto L_0x076a
            java.lang.String r0 = r11.d
            r1 = 2
            r2 = 0
            com.appfoundry.previewer.model.Style r0 = b.a.a.n.f.u(r0, r2, r1)
            if (r0 == 0) goto L_0x076a
            java.lang.String r1 = r0.f7179p
            if (r1 != 0) goto L_0x06f8
            goto L_0x071d
        L_0x06f8:
            int r2 = r1.hashCode()
            r3 = -1704601170(0xffffffff9a65d9ae, float:-4.753193E-23)
            if (r2 == r3) goto L_0x0712
            r3 = -1245812558(0xffffffffb5be68b2, float:-1.4186573E-6)
            if (r2 == r3) goto L_0x0707
            goto L_0x071d
        L_0x0707:
            java.lang.String r2 = "from-top"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r1 = 48
            goto L_0x071e
        L_0x0712:
            java.lang.String r2 = "from-bottom"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r1 = 80
            goto L_0x071e
        L_0x071d:
            r1 = -1
        L_0x071e:
            java.lang.String r0 = r0.f7178o
            if (r0 != 0) goto L_0x0723
            goto L_0x074a
        L_0x0723:
            int r2 = r0.hashCode()
            r3 = 34268234(0x20ae44a, float:1.0204155E-37)
            if (r2 == r3) goto L_0x073e
            r3 = 1067976249(0x3fa80639, float:1.3126899)
            if (r2 == r3) goto L_0x0732
            goto L_0x074a
        L_0x0732:
            java.lang.String r2 = "from-right"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x074a
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x074b
        L_0x073e:
            java.lang.String r2 = "from-left"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x074a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x074b
        L_0x074a:
            r0 = -1
        L_0x074b:
            r2 = -1
            if (r1 != r2) goto L_0x0750
            if (r0 == r2) goto L_0x076a
        L_0x0750:
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.util.Objects.requireNonNull(r3, r5)
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            if (r1 == r2) goto L_0x0761
            if (r0 == r2) goto L_0x0761
            r0 = r0 | r1
            goto L_0x0763
        L_0x0761:
            if (r1 != r2) goto L_0x0766
        L_0x0763:
            r3.gravity = r0
            goto L_0x076a
        L_0x0766:
            if (r0 != r2) goto L_0x076a
            r3.gravity = r1
        L_0x076a:
            r1 = r53
            goto L_0x0778
        L_0x076d:
            r47 = r0
            r10 = r8
        L_0x0770:
            r4 = 0
            r1 = r53
            goto L_0x0779
        L_0x0774:
            r10 = r8
            r47 = r9
            r4 = 0
        L_0x0778:
            r8 = r10
        L_0x0779:
            r0 = r53
            r11 = r55
            r9 = r47
            goto L_0x0040
        L_0x0781:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.e.c(com.appfoundry.previewer.model.Container, android.content.Context, java.lang.String, android.widget.FrameLayout, int, int, java.lang.Boolean, int, boolean, int):void");
    }

    public static final void d(Page page, String str) {
        boolean z;
        i.e(page, "$this$addErrorMessage");
        i.e(str, "errorMessage");
        List<Container> list = page.f;
        if (list != null) {
            i.c(list);
            for (Container container : list) {
                List<Component> list2 = container.f;
                if (list2 != null) {
                    i.c(list2);
                    for (Component next : list2) {
                        i.e(next, "$this$hasErrorMessageTag");
                        List<String> list3 = next.f7087i;
                        if (list3 != null) {
                            z = b.f.a.e.d0(list3, "dev:errorInfo");
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            i.e(next, "$this$setText");
                            i.e(str, "updatedText");
                            Text text = next.c;
                            if (text != null) {
                                text.a = str;
                                return;
                            }
                            return;
                        }
                    }
                    continue;
                }
            }
        }
    }

    public static final j<FrameLayout, b.a.a.i.b> e(Component component, Context context, int i2, int i3, Boolean bool) {
        i.e(component, "$this$createClickHandlerView");
        i.c(context);
        FrameLayout frameLayout = new FrameLayout(context);
        Style t = f.t(component.d, bool);
        Dimensions dimensions = t != null ? t.f7176m : null;
        i.e(frameLayout, "$this$setupTransparentView");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        b.a.a.i.b m2 = b.f.a.e.m(dimensions, i2, i3, false, 0, 24);
        b.f.a.e.z0(layoutParams, m2.c);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        return new j<>(frameLayout, m2);
    }

    public static b.a.a.a.b f(Page page, Boolean bool, int i2) {
        Boolean bool2 = (i2 & 1) != 0 ? Boolean.FALSE : null;
        i.e(page, "$this$createFragment");
        b.a.a.a.b jVar = i.a(page.c, "page:swipe") ? new b.a.a.a.j() : new h();
        jVar.f74h = page;
        jVar.f76j = bool2;
        return jVar;
    }

    public static final void g(Container container, Context context, String str, FrameLayout frameLayout, Boolean bool, float f) {
        int i2;
        App app2;
        Data data;
        List<Page> list;
        T t;
        boolean z;
        int i3;
        Container container2 = container;
        Context context2 = context;
        FrameLayout frameLayout2 = frameLayout;
        float f2 = f;
        Boolean bool2 = Boolean.TRUE;
        i.e(container2, "$this$createLayout");
        i.e(context2, BasePayload.CONTEXT_KEY);
        i.e(frameLayout2, "containerParent");
        Style t2 = f.t(container2.c, bool);
        int o2 = t2 != null ? b.f.a.e.o(t2, f2) : 0;
        if (t2 != null) {
            List<String> list2 = container2.f7101j;
            boolean V = list2 != null ? b.f.a.e.V(list2) : false;
            i.e(t2, "$this$containerHeight");
            if (t2.w == null || V) {
                i3 = b.f.a.e.x0(t2);
            } else {
                Float f3 = t2.w;
                i.c(f3);
                i3 = (int) (((float) b.f.a.e.o(t2, f2)) / f3.floatValue());
            }
            i2 = i3;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        int l2 = t2 != null ? b.f.a.e.i0(t2) : false ? l(container2, context2, o2, i2) : 0;
        String str2 = null;
        if (layoutParams instanceof FlexboxLayoutManager.c) {
            FlexboxLayoutManager.c cVar = (FlexboxLayoutManager.c) layoutParams;
            cVar.f7218h = 0.0f;
            cVar.width = o2;
            cVar.height = i2 + l2;
            Dimensions n2 = b.f.a.e.n(t2 != null ? t2.f7174k : null, o2);
            i.e(cVar, "$this$setComputedMargins");
            Float f4 = n2.a;
            int floatValue = f4 != null ? (int) f4.floatValue() : 0;
            Float f5 = n2.f7109b;
            int floatValue2 = f5 != null ? (int) f5.floatValue() : 0;
            Float f6 = n2.c;
            int floatValue3 = f6 != null ? (int) f6.floatValue() : 0;
            Float f7 = n2.d;
            cVar.setMargins(floatValue, floatValue2, floatValue3, f7 != null ? (int) f7.floatValue() : 0);
        } else if ((layoutParams instanceof RecyclerView.LayoutParams) && i.a(container2.f7106o, bool2)) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            layoutParams2.width = o2;
            layoutParams2.height = i2;
            Dimensions n3 = b.f.a.e.n(t2 != null ? t2.f7174k : null, o2);
            i.e(layoutParams2, "$this$setComputedMargins");
            Float f8 = n3.a;
            int floatValue4 = f8 != null ? (int) f8.floatValue() : 0;
            Float f9 = n3.f7109b;
            int floatValue5 = f9 != null ? (int) f9.floatValue() : 0;
            Float f10 = n3.c;
            int floatValue6 = f10 != null ? (int) f10.floatValue() : 0;
            Float f11 = n3.d;
            layoutParams2.setMargins(floatValue4, floatValue5, floatValue6, f11 != null ? (int) f11.floatValue() : 0);
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            b.f.a.e.z0(layoutParams3, b.f.a.e.n(t2 != null ? t2.f7174k : null, -1));
        }
        r(container);
        Container container3 = container;
        Context context3 = context;
        a(container3, context3, frameLayout, o2, i2 + l2, bool);
        b(container3, context3, str, frameLayout, o2, i2, bool, l2);
        s(container2, str, frameLayout2);
        String str3 = container2.a;
        if (str3 != null && m.g(str3)) {
            BravoApp.b bVar = BravoApp.Q;
            f.K(BravoApp.I, "active", false);
            f.K(BravoApp.I, "default", true);
            JsonApp jsonApp = BravoApp.f6915o;
            if (!(jsonApp == null || (app2 = jsonApp.d) == null || (data = app2.f7062e) == null || (list = data.f7108b) == null)) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    Page page = (Page) t;
                    if (!i.a(page.f7131j, bool2) || !(!i.a(page.c, "page:swipe"))) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                Page page2 = (Page) t;
                if (page2 != null) {
                    str2 = page2.a;
                }
            }
            BravoApp.b bVar2 = BravoApp.Q;
            String f12 = f.f(BravoApp.I, str2);
            f.N(BravoApp.I, f12);
            f.A(BravoApp.I, f12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if ((r1.length() == 0) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        if (r12 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0101, code lost:
        if (e.x.c.i.a(r9.a, "01DZ45B408N9H42KX24QMARPNA") == false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View h(com.appfoundry.previewer.model.Component r14, android.content.Context r15, java.lang.String r16, int r17, int r18, java.lang.Boolean r19, int r20, boolean r21) {
        /*
            r9 = r14
            r10 = r16
            java.lang.String r0 = "$this$createView"
            e.x.c.i.e(r14, r0)
            java.lang.String r0 = "$this$parseTags"
            e.x.c.i.e(r14, r0)
            java.util.List<java.lang.String> r0 = r9.f7087i
            java.lang.String r11 = "dev:scan"
            r12 = 0
            r13 = 1
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = "$this$getDevTag"
            e.x.c.i.e(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "$this$isDevTag"
            e.x.c.i.e(r1, r2)
            java.lang.String r2 = "dev:"
            boolean r2 = e.c0.h.b(r1, r2, r13)
            if (r2 == 0) goto L_0x001e
            goto L_0x0039
        L_0x0038:
            r1 = r12
        L_0x0039:
            if (r1 == 0) goto L_0x007e
            java.lang.String r0 = "$this$isBuildNumber"
            e.x.c.i.e(r1, r0)
            java.lang.String r0 = "buildnumber"
            boolean r0 = e.c0.h.b(r1, r0, r13)
            if (r0 == 0) goto L_0x0051
            com.appfoundry.previewer.model.Text r0 = r9.c
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = "1.0"
            r0.a = r1
            goto L_0x007e
        L_0x0051:
            java.lang.String r0 = "$this$isSvgFill"
            e.x.c.i.e(r1, r0)
            java.lang.String r0 = "dev:fill"
            boolean r0 = e.c0.h.b(r1, r0, r13)
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r9.d
            r1 = 2
            com.appfoundry.previewer.model.Style r0 = b.a.a.n.f.u(r0, r12, r1)
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = "fill"
            r0.f7180q = r1
            goto L_0x007e
        L_0x006c:
            java.lang.String r0 = "$this$isDevScan"
            e.x.c.i.e(r1, r0)
            boolean r0 = e.c0.h.f(r1, r11, r13)
            if (r0 == 0) goto L_0x007e
            java.util.List<java.lang.String> r0 = r9.f7087i
            java.lang.String r1 = "action:show-emulator-appList"
            r0.add(r1)
        L_0x007e:
            java.lang.String r0 = r9.d
            r6 = r19
            com.appfoundry.previewer.model.Style r3 = b.a.a.n.f.t(r0, r6)
            r0 = r14
            r1 = r15
            r2 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r8 = r21
            android.view.View r0 = o(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            com.appfoundry.previewer.model.Actions r1 = r9.f7089k
            r2 = 0
            if (r1 == 0) goto L_0x00bb
            com.appfoundry.previewer.model.Tap r1 = r1.a
            if (r1 == 0) goto L_0x00bb
            java.lang.String r1 = r1.a
            if (r1 == 0) goto L_0x00bb
            java.lang.String r3 = "filter"
            boolean r1 = r1.equals(r3)
            if (r1 != r13) goto L_0x00bb
            boolean r1 = r0 instanceof android.widget.EditText
            if (r1 == 0) goto L_0x00bb
            r1 = r0
            android.widget.EditText r1 = (android.widget.EditText) r1
            b.a.a.h.e$a r3 = new b.a.a.h.e$a
            r3.<init>(r10)
            r1.addTextChangedListener(r3)
            goto L_0x00e0
        L_0x00bb:
            java.lang.String r1 = r9.f7084e
            if (r1 == 0) goto L_0x00ca
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00c7
            r1 = r13
            goto L_0x00c8
        L_0x00c7:
            r1 = r2
        L_0x00c8:
            if (r1 == 0) goto L_0x00d8
        L_0x00ca:
            com.appfoundry.previewer.model.Actions r1 = r9.f7089k
            if (r1 != 0) goto L_0x00d8
            java.util.List<java.lang.String> r1 = r9.f7087i
            if (r1 == 0) goto L_0x00d6
            java.lang.String r12 = b.f.a.e.x(r1)
        L_0x00d6:
            if (r12 == 0) goto L_0x00e0
        L_0x00d8:
            b.a.a.h.e$b r1 = new b.a.a.h.e$b
            r1.<init>(r14, r10)
            r0.setOnClickListener(r1)
        L_0x00e0:
            java.util.List<java.lang.String> r1 = r9.f7087i
            if (r1 == 0) goto L_0x0103
            java.lang.String r3 = "$this$hasScanTag"
            e.x.c.i.e(r1, r3)
            java.lang.String r1 = b.f.a.e.P(r1, r11)
            if (r1 == 0) goto L_0x00f1
            r1 = r13
            goto L_0x00f2
        L_0x00f1:
            r1 = r2
        L_0x00f2:
            if (r1 != r13) goto L_0x0103
            java.lang.String r1 = "$this$isProjectsTitle"
            e.x.c.i.e(r14, r1)
            java.lang.String r1 = r9.a
            java.lang.String r3 = "01DZ45B408N9H42KX24QMARPNA"
            boolean r1 = e.x.c.i.a(r1, r3)
            if (r1 != 0) goto L_0x010f
        L_0x0103:
            java.lang.String r1 = "$this$isBravoVisionTitle"
            e.x.c.i.e(r14, r1)
            java.lang.String r1 = r9.a
            java.lang.String r3 = "01E25XVWHGMKS0C8MVPQ08SK54"
            e.x.c.i.a(r1, r3)
        L_0x010f:
            java.lang.String r1 = "$this$hasEnableNotificationsTag"
            e.x.c.i.e(r14, r1)
            java.util.List<java.lang.String> r1 = r9.f7087i
            if (r1 == 0) goto L_0x011e
            java.lang.String r2 = "enablenotifications"
            boolean r2 = b.f.a.e.d0(r1, r2)
        L_0x011e:
            if (r2 == 0) goto L_0x0155
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
            java.util.List<b.a.a.i.i> r1 = com.appfoundry.previewer.BravoApp.z
            b.a.a.i.i r2 = new b.a.a.i.i
            java.lang.String r3 = r9.a
            r2.<init>(r3, r0)
            java.lang.String r3 = "$this$addIfNotThere"
            e.x.c.i.e(r1, r3)
            java.lang.String r3 = "newView"
            e.x.c.i.e(r2, r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x0139:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0152
            java.lang.Object r4 = r3.next()
            b.a.a.i.i r4 = (b.a.a.i.i) r4
            java.lang.String r5 = r4.a
            java.lang.String r6 = r2.a
            boolean r5 = e.x.c.i.a(r5, r6)
            if (r5 == 0) goto L_0x0139
            r1.remove(r4)
        L_0x0152:
            r1.add(r2)
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.e.h(com.appfoundry.previewer.model.Component, android.content.Context, java.lang.String, int, int, java.lang.Boolean, int, boolean):android.view.View");
    }

    public static /* synthetic */ View i(Component component, Context context, String str, int i2, int i3, Boolean bool, int i4, boolean z, int i5) {
        return h(component, context, (i5 & 2) != 0 ? null : str, i2, i3, (i5 & 16) != 0 ? Boolean.FALSE : bool, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? false : z);
    }

    public static final String j(Container container) {
        i.e(container, "$this$getAudioUrl");
        List<Component> list = container.f;
        if (list != null) {
            i.c(list);
            Iterator<Component> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Component next = it.next();
                if (t(next, "play")) {
                    Actions actions = next.f7089k;
                    if (actions != null) {
                        return b.f.a.e.R(actions);
                    }
                }
            }
        }
        return null;
    }

    public static final Component k(Container container, String str) {
        i.e(container, "$this$getComponentWithTag");
        i.e(str, "tagToFind");
        List<Component> list = container.f;
        if (list == null) {
            return null;
        }
        i.c(list);
        for (Component next : list) {
            List<String> list2 = next.f7087i;
            if (list2 != null && b.f.a.e.d0(list2, str)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        r9 = r9.a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int l(com.appfoundry.previewer.model.Container r23, android.content.Context r24, int r25, int r26) {
        /*
            r0 = r23
            r1 = r24
            java.lang.String r2 = "$this$getFlexoComponentExtraHeight"
            e.x.c.i.e(r0, r2)
            java.util.List<com.appfoundry.previewer.model.Component> r0 = r0.f
            r2 = 0
            if (r0 == 0) goto L_0x0298
            e.x.c.i.c(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0298
            java.lang.Object r3 = r0.next()
            com.appfoundry.previewer.model.Component r3 = (com.appfoundry.previewer.model.Component) r3
            java.lang.String r4 = r3.d
            r5 = 2
            r6 = 0
            com.appfoundry.previewer.model.Style r4 = b.a.a.n.f.u(r4, r6, r5)
            if (r4 == 0) goto L_0x0015
            boolean r7 = b.f.a.e.i0(r4)
            r8 = 1
            if (r7 != r8) goto L_0x0015
            com.appfoundry.previewer.model.Dimensions r9 = r4.f7176m
            r12 = 0
            r13 = 0
            r14 = 24
            r10 = r25
            r11 = r26
            b.a.a.i.b r0 = b.f.a.e.m(r9, r10, r11, r12, r13, r14)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            int r9 = r0.f308b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7[r2] = r9
            q.a.a$b r9 = q.a.a.d
            java.lang.String r10 = "Measured before (measures val): %s"
            r9.a(r10, r7)
            java.lang.String r7 = "$this$getFlexoView"
            e.x.c.i.e(r3, r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r1)
            com.appfoundry.previewer.model.Text r9 = r3.c
            java.lang.String r10 = "$this$setupFlexo"
            e.x.c.i.e(r7, r10)
            if (r9 == 0) goto L_0x006d
            java.lang.String r9 = r9.a
            if (r9 == 0) goto L_0x006d
            java.lang.String r9 = b.a.a.h.m.o(r9)
            goto L_0x006e
        L_0x006d:
            r9 = r6
        L_0x006e:
            android.widget.TextView$BufferType r10 = android.widget.TextView.BufferType.EDITABLE
            r7.setText(r9, r10)
            java.lang.String r10 = r4.f7168b
            if (r10 == 0) goto L_0x007c
            int r10 = b.a.a.h.m.m(r10)
            goto L_0x007e
        L_0x007c:
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x007e:
            r7.setTextColor(r10)
            java.lang.String r10 = r4.f7177n
            r11 = 3
            if (r10 != 0) goto L_0x0087
            goto L_0x00b9
        L_0x0087:
            int r13 = r10.hashCode()
            r14 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r13 == r14) goto L_0x00af
            r14 = 3317767(0x32a007, float:4.649182E-39)
            if (r13 == r14) goto L_0x00a5
            r14 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r13 == r14) goto L_0x009b
            goto L_0x00b9
        L_0x009b:
            java.lang.String r13 = "right"
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x00b9
            r10 = r11
            goto L_0x00ba
        L_0x00a5:
            java.lang.String r13 = "left"
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x00b9
            r10 = r5
            goto L_0x00ba
        L_0x00af:
            java.lang.String r13 = "center"
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x00b9
            r10 = 4
            goto L_0x00ba
        L_0x00b9:
            r10 = r2
        L_0x00ba:
            r7.setTextAlignment(r10)
            java.lang.String r10 = r4.f7179p
            r13 = 16
            if (r10 != 0) goto L_0x00c4
            goto L_0x00e9
        L_0x00c4:
            int r14 = r10.hashCode()
            r15 = -1704601170(0xffffffff9a65d9ae, float:-4.753193E-23)
            if (r14 == r15) goto L_0x00de
            r15 = -1245812558(0xffffffffb5be68b2, float:-1.4186573E-6)
            if (r14 == r15) goto L_0x00d3
            goto L_0x00e9
        L_0x00d3:
            java.lang.String r14 = "from-top"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x00e9
            r10 = 48
            goto L_0x00ea
        L_0x00de:
            java.lang.String r14 = "from-bottom"
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto L_0x00e9
            r10 = 80
            goto L_0x00ea
        L_0x00e9:
            r10 = r13
        L_0x00ea:
            java.lang.String r14 = r4.f7178o
            if (r14 != 0) goto L_0x00ef
            goto L_0x0116
        L_0x00ef:
            int r15 = r14.hashCode()
            r12 = 34268234(0x20ae44a, float:1.0204155E-37)
            if (r15 == r12) goto L_0x010a
            r12 = 1067976249(0x3fa80639, float:1.3126899)
            if (r15 == r12) goto L_0x00fe
            goto L_0x0116
        L_0x00fe:
            java.lang.String r12 = "from-right"
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x0116
            r12 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x0117
        L_0x010a:
            java.lang.String r12 = "from-left"
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x0116
            r12 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x0117
        L_0x0116:
            r12 = r8
        L_0x0117:
            r10 = r10 | r12
            r7.setGravity(r10)
            java.lang.String r10 = r4.f7169e
            if (r10 == 0) goto L_0x0159
            b.a.a.m.a r10 = new b.a.a.m.a
            r10.<init>()
            java.lang.String r12 = r4.f7169e
            android.graphics.Typeface r10 = b.a.a.m.a.a(r10, r12, r2, r5)
            java.lang.Boolean r12 = r4.H
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r12 = e.x.c.i.a(r12, r14)
            if (r12 == 0) goto L_0x013e
            boolean r12 = b.f.a.e.h0(r4)
            if (r12 == 0) goto L_0x013e
            r7.setTypeface(r10, r11)
            goto L_0x0159
        L_0x013e:
            java.lang.Boolean r11 = r4.H
            boolean r11 = e.x.c.i.a(r11, r14)
            if (r11 == 0) goto L_0x014a
            r7.setTypeface(r10, r5)
            goto L_0x0159
        L_0x014a:
            java.lang.Boolean r5 = r4.H
            boolean r5 = e.x.c.i.a(r5, r14)
            if (r5 == 0) goto L_0x0156
            r7.setTypeface(r10, r8)
            goto L_0x0159
        L_0x0156:
            r7.setTypeface(r10)
        L_0x0159:
            r5 = 0
            java.lang.Float r10 = r4.f
            if (r10 == 0) goto L_0x0163
            float r10 = r10.floatValue()
            goto L_0x0164
        L_0x0163:
            r10 = r5
        L_0x0164:
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x016f
            float r5 = b.a.a.n.c.r(r10)
            r7.setTextSize(r5)
        L_0x016f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 1120403456(0x42c80000, float:100.0)
            r14 = 28
            if (r5 < r14) goto L_0x0196
            java.lang.Float r15 = r4.f7170g
            if (r15 == 0) goto L_0x0196
            android.text.TextPaint r15 = r7.getPaint()
            int r15 = r15.getFontMetricsInt(r6)
            java.lang.Float r6 = r4.f7170g
            float r6 = r6.floatValue()
            float r6 = b.a.a.n.c.e(r6)
            float r6 = r6 / r12
            float r6 = r6 * r10
            float r10 = (float) r15
            float r6 = r6 - r10
            r7.setLineSpacing(r6, r11)
        L_0x0196:
            java.lang.String r6 = r4.D
            if (r6 == 0) goto L_0x01dc
            java.lang.String r10 = "upper"
            boolean r6 = e.x.c.i.a(r6, r10)
            if (r6 == 0) goto L_0x01ae
            r7.setAllCaps(r8)
            if (r9 == 0) goto L_0x01d8
            java.lang.String r6 = r9.toUpperCase()
            java.lang.String r9 = "(this as java.lang.String).toUpperCase()"
            goto L_0x01c3
        L_0x01ae:
            java.lang.String r6 = r4.D
            java.lang.String r10 = "lower"
            boolean r6 = e.x.c.i.a(r6, r10)
            if (r6 == 0) goto L_0x01c7
            r7.setAllCaps(r2)
            if (r9 == 0) goto L_0x01d8
            java.lang.String r6 = r9.toLowerCase()
            java.lang.String r9 = "(this as java.lang.String).toLowerCase()"
        L_0x01c3:
            e.x.c.i.d(r6, r9)
            goto L_0x01d9
        L_0x01c7:
            java.lang.String r6 = r4.D
            java.lang.String r10 = "title"
            boolean r6 = e.x.c.i.a(r6, r10)
            if (r6 == 0) goto L_0x01dc
            if (r9 == 0) goto L_0x01d8
            java.lang.String r6 = b.a.a.h.m.n(r9)
            goto L_0x01d9
        L_0x01d8:
            r6 = 0
        L_0x01d9:
            r7.setText(r6)
        L_0x01dc:
            java.lang.String r6 = r4.E
            if (r6 == 0) goto L_0x0201
            java.lang.String r9 = "underline"
            boolean r6 = e.x.c.i.a(r6, r9)
            if (r6 == 0) goto L_0x01ef
            int r6 = r7.getPaintFlags()
            r6 = r6 | 8
            goto L_0x01fe
        L_0x01ef:
            java.lang.String r6 = r4.E
            java.lang.String r9 = "strike"
            boolean r6 = e.x.c.i.a(r6, r9)
            if (r6 == 0) goto L_0x0201
            int r6 = r7.getPaintFlags()
            r6 = r6 | r13
        L_0x01fe:
            r7.setPaintFlags(r6)
        L_0x0201:
            java.lang.Float r6 = r4.f7171h
            if (r6 == 0) goto L_0x0210
            float r6 = r6.floatValue()
            float r6 = r6 / r12
            r9 = 4
            float r9 = (float) r9
            float r6 = r6 * r9
            r7.setLetterSpacing(r6)
        L_0x0210:
            r7.setClipToOutline(r8)
            boolean r6 = r1 instanceof com.appfoundry.previewer.activities.BravoActivity
            if (r6 == 0) goto L_0x0220
            com.appfoundry.previewer.activities.BravoActivity r1 = (com.appfoundry.previewer.activities.BravoActivity) r1
            android.view.WindowManager r1 = r1.getWindowManager()
            java.lang.String r6 = "(context as BravoActivity).windowManager"
            goto L_0x0238
        L_0x0220:
            java.lang.String r6 = "null cannot be cast to non-null type android.content.ContextWrapper"
            java.util.Objects.requireNonNull(r1, r6)
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            java.lang.String r6 = "null cannot be cast to non-null type com.appfoundry.previewer.activities.BravoActivity"
            java.util.Objects.requireNonNull(r1, r6)
            com.appfoundry.previewer.activities.BravoActivity r1 = (com.appfoundry.previewer.activities.BravoActivity) r1
            android.view.WindowManager r1 = r1.getWindowManager()
            java.lang.String r6 = "((context as ContextWrap…voActivity).windowManager"
        L_0x0238:
            e.x.c.i.d(r1, r6)
            android.view.Display r1 = r1.getDefaultDisplay()
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>()
            r1.getSize(r6)
            int r1 = r6.x
            int r6 = r6.y
            r7.measure(r1, r6)
            android.text.TextPaint r1 = r7.getPaint()
            java.lang.String r6 = "(flexoViewBeforeExpanding as TextView).paint"
            e.x.c.i.d(r1, r6)
            r1.setAntiAlias(r8)
            if (r5 < r14) goto L_0x0266
            java.lang.Float r4 = r4.f7170g
            if (r4 == 0) goto L_0x0266
            float r4 = r4.floatValue()
            float r11 = r4 / r12
        L_0x0266:
            r20 = r11
            android.text.StaticLayout r4 = new android.text.StaticLayout
            com.appfoundry.previewer.model.Text r3 = r3.c
            if (r3 == 0) goto L_0x0273
            java.lang.String r3 = r3.a
            if (r3 == 0) goto L_0x0273
            goto L_0x0275
        L_0x0273:
            java.lang.String r3 = ""
        L_0x0275:
            r16 = r3
            int r3 = r0.a
            android.text.Layout$Alignment r19 = android.text.Layout.Alignment.ALIGN_NORMAL
            r21 = 0
            r22 = 0
            r15 = r4
            r17 = r1
            r18 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            int r1 = r4.getHeight()
            int r3 = r0.f308b
            if (r1 >= r3) goto L_0x0290
            goto L_0x0298
        L_0x0290:
            int r1 = r4.getHeight()
            int r0 = r0.f308b
            int r2 = r1 - r0
        L_0x0298:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.e.l(com.appfoundry.previewer.model.Container, android.content.Context, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Page m(com.appfoundry.previewer.model.Page r1) {
        /*
            java.lang.String r0 = "$this$getLoadingStatePage"
            e.x.c.i.e(r1, r0)
            com.appfoundry.previewer.model.States r1 = r1.f7137p
            if (r1 == 0) goto L_0x0010
            com.appfoundry.previewer.model.State r1 = r1.f
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r1.f7162e
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            com.appfoundry.previewer.model.Page r1 = b.a.a.n.f.n(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.e.m(com.appfoundry.previewer.model.Page):com.appfoundry.previewer.model.Page");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int n(com.appfoundry.previewer.model.Page r9, android.content.Context r10) {
        /*
            java.lang.String r0 = "$this$getModalHeight"
            e.x.c.i.e(r9, r0)
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r9.f
            r1 = 2
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x005a
            e.x.c.i.c(r0)
            java.util.Iterator r0 = r0.iterator()
            r4 = r3
        L_0x0014:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x005b
            java.lang.Object r5 = r0.next()
            com.appfoundry.previewer.model.Container r5 = (com.appfoundry.previewer.model.Container) r5
            java.lang.String r6 = r5.c
            com.appfoundry.previewer.model.Style r6 = b.a.a.n.f.u(r6, r2, r1)
            if (r6 == 0) goto L_0x0037
            java.util.List<java.lang.String> r7 = r5.f7101j
            if (r7 == 0) goto L_0x0031
            boolean r7 = b.f.a.e.V(r7)
            goto L_0x0032
        L_0x0031:
            r7 = r3
        L_0x0032:
            int r7 = b.f.a.e.A(r6, r7)
            goto L_0x0038
        L_0x0037:
            r7 = r3
        L_0x0038:
            int r4 = r4 + r7
            if (r6 == 0) goto L_0x0014
            boolean r7 = b.f.a.e.i0(r6)
            r8 = 1
            if (r7 != r8) goto L_0x0014
            int r7 = b.f.a.e.y0(r6)
            java.util.List<java.lang.String> r8 = r5.f7101j
            if (r8 == 0) goto L_0x004f
            boolean r8 = b.f.a.e.V(r8)
            goto L_0x0050
        L_0x004f:
            r8 = r3
        L_0x0050:
            int r6 = b.f.a.e.A(r6, r8)
            int r5 = l(r5, r10, r7, r6)
            int r4 = r4 + r5
            goto L_0x0014
        L_0x005a:
            r4 = r3
        L_0x005b:
            com.appfoundry.previewer.model.Container r9 = r9.d
            if (r9 == 0) goto L_0x0074
            java.lang.String r10 = r9.c
            com.appfoundry.previewer.model.Style r10 = b.a.a.n.f.u(r10, r2, r1)
            if (r10 == 0) goto L_0x0073
            java.util.List<java.lang.String> r9 = r9.f7101j
            if (r9 == 0) goto L_0x006f
            boolean r3 = b.f.a.e.V(r9)
        L_0x006f:
            int r3 = b.f.a.e.A(r10, r3)
        L_0x0073:
            int r4 = r4 + r3
        L_0x0074:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.e.n(com.appfoundry.previewer.model.Page, android.content.Context):int");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: com.appfoundry.previewer.model.Dimensions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.appfoundry.previewer.model.Dimensions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: com.appfoundry.previewer.model.Dimensions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: android.widget.EditText} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: com.appfoundry.previewer.model.Dimensions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: com.appfoundry.previewer.model.Dimensions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: android.widget.FrameLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: android.widget.CheckBox} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v79, resolved type: b.k.a.a.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: b.k.a.a.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: com.airbnb.lottie.LottieAnimationView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: com.appfoundry.previewer.model.Dimensions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: com.appfoundry.previewer.model.Dimensions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v44, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v83, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v174, resolved type: b.k.a.a.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v175, resolved type: b.k.a.a.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v48, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v142, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v146, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v147, resolved type: com.google.android.material.switchmaterial.SwitchMaterial} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v176, resolved type: b.k.a.a.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v54, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v55, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v56, resolved type: b.a.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v57, resolved type: b.a.a.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x026f, code lost:
        if (r3.equals("component:input-file") != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0271, code lost:
        r14 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x027d, code lost:
        if (r3.equals("component:input-date") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r3.equals("component:formLabel") != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02bc, code lost:
        if (r3.equals("component:svg-web-view") != false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (r3.equals("component:formInput") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r3.equals("component:input-url") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r3.equals("component:input-tel") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03fa, code lost:
        r7 = -1;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x047a, code lost:
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x047b, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0485, code lost:
        if (r3.equals("component:input-switch") != false) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0490, code lost:
        if (r3.equals("component:web-view") != false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0492, code lost:
        if (r0 == null) goto L_0x0510;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0494, code lost:
        r2 = new b.a.a.b.a(r0, r1.f7087i, e.x.c.i.a(r1.f7083b, "component:svg-web-view"));
        r0 = r1.f7088j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04a3, code lost:
        if (r0 == null) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04a5, code lost:
        r6 = r0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04a8, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04a9, code lost:
        r2.f130m = r10;
        r2.f131n = r11;
        r2.f132o = r12;
        r2.f133p = r6;
        r2.setBackgroundColor(0);
        r0 = r2.f129l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04b6, code lost:
        if (r0 == null) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04be, code lost:
        if (b.f.a.e.d0(r0, "camera") != r13) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04ca, code lost:
        if (androidx.core.content.ContextCompat.checkSelfPermission(r2.getContext(), "android.permission.CAMERA") == 0) goto L_0x04ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04cc, code lost:
        r0 = r2.getContext();
        java.util.Objects.requireNonNull(r0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04db, code lost:
        if (androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale((androidx.appcompat.app.AppCompatActivity) r0, "android.permission.CAMERA") == false) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04dd, code lost:
        r0 = r2.getContext();
        java.util.Objects.requireNonNull(r0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.core.app.ActivityCompat.requestPermissions((androidx.appcompat.app.AppCompatActivity) r0, new java.lang.String[]{"android.permission.CAMERA"}, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04ee, code lost:
        r0 = r2.getContext();
        java.util.Objects.requireNonNull(r0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.core.app.ActivityCompat.requestPermissions((androidx.appcompat.app.AppCompatActivity) r0, new java.lang.String[]{"android.permission.CAMERA"}, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04ff, code lost:
        r2.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0503, code lost:
        r2.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0506, code lost:
        r0 = com.appfoundry.previewer.BravoApp.Q;
        com.appfoundry.previewer.BravoApp.f6912l.add(r2);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x050d, code lost:
        r13 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0510, code lost:
        r13 = new android.view.View(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x051e, code lost:
        if (r3.equals("component:input-number") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x052b, code lost:
        if (r3.equals("component:button") != false) goto L_0x052d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x052d, code lost:
        r15 = new android.widget.TextView(r0);
        r0 = r15;
        b.a.a.h.o.f(r15, r25, r1.a, r26, r27, r28, r1.c, r9, w(r1, "scanned-title"), r30, r1.f7083b, r1.f7095q, r1.f7094p, r1.r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05ec, code lost:
        r13 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05f8, code lost:
        if (r3.equals("component:input-image") != false) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0603, code lost:
        if (r3.equals("component:input-email") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x060c, code lost:
        if (r3.equals("component:input-checkbox") != false) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x060e, code lost:
        if (r0 == null) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0610, code lost:
        r9 = new android.widget.FrameLayout(r0);
        r0 = r1.f7083b;
        e.x.c.i.e(r9, "$this$createToggle");
        r6 = new android.widget.FrameLayout.LayoutParams(-1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0621, code lost:
        if (r10 == null) goto L_0x0626;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0623, code lost:
        r2 = r10.f7176m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0626, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0627, code lost:
        r11 = r6;
        b.f.a.e.z0(r11, b.f.a.e.m(r2, r27, r28, false, 0, 24).c);
        r9.setLayoutParams(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x063f, code lost:
        if (r10 == null) goto L_0x064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0641, code lost:
        r2 = r10.r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0643, code lost:
        if (r2 == null) goto L_0x064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0645, code lost:
        r2 = ((float) r2.intValue()) / 100.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x064e, code lost:
        r2 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0650, code lost:
        r9.setAlpha(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0653, code lost:
        if (r10 == null) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0655, code lost:
        r2 = r10.F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0657, code lost:
        if (r2 == null) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0659, code lost:
        r9.setRotation(r2.floatValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0667, code lost:
        if (e.x.c.i.a(r0, "component:input-checkbox") == false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0669, code lost:
        r0 = new android.widget.CheckBox(r9.getContext());
        r4 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        r4.gravity = 17;
        r0.setLayoutParams(r4);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x067c, code lost:
        if (r10 == null) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x067e, code lost:
        r2 = r10.c;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0680, code lost:
        if (r2 == null) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0682, code lost:
        r0.setButtonTintList(android.content.res.ColorStateList.valueOf(b.a.a.h.m.m(r2)));
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x068e, code lost:
        r0 = new com.google.android.material.switchmaterial.SwitchMaterial(r9.getContext());
        r4 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        r4.gravity = 17;
        r0.setLayoutParams(r4);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06a1, code lost:
        if (r10 == null) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06a3, code lost:
        r2 = r10.c;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06a5, code lost:
        if (r2 == null) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06a7, code lost:
        r4 = new int[3][];
        r5 = new int[r13];
        r5[0] = -16842910;
        r4[0] = r5;
        r5 = new int[r13];
        r5[0] = 16842912;
        r4[r13] = r5;
        r4[2] = new int[0];
        r5 = new int[3];
        r5[0] = b.a.a.h.m.m(r2);
        r5[r13] = b.a.a.h.m.m(r2);
        r5[2] = -3355444;
        r0.setThumbTintList(new android.content.res.ColorStateList(r4, r5));
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06db, code lost:
        r9.addView(r0);
        r13 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06e1, code lost:
        r13 = new android.view.View(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06e8, code lost:
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0804, code lost:
        r20 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0812, code lost:
        if (r3.equals("component:image") != false) goto L_0x0814;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0814, code lost:
        r13 = new android.widget.ImageView(r0);
        b.f.a.e.B0(r13, r25, r1.a, r1.f7083b, r26, r27, r28, b.a.a.n.f.h(r1.f, r2), r30);
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0893, code lost:
        if (r3.equals("line") != false) goto L_0x08b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x08b7, code lost:
        if (r3.equals("multiline") != false) goto L_0x08b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x08b9, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0a2e, code lost:
        if (r3.equals("component:input-password") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0a30, code lost:
        r15 = new android.widget.EditText(r0);
        r0 = r15;
        b.a.a.h.o.f(r15, r25, r1.a, r26, r27, r28, r1.c, r9, false, 0, r1.f7083b, r1.f7095q, r1.f7094p, r1.r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0a5b, code lost:
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0233, code lost:
        r20 = r15;
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0240, code lost:
        if (r3.equals("component:text") != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024b, code lost:
        if (r3.equals("component:date") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0257, code lost:
        if (r3.equals("component:input-time") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0263, code lost:
        if (r3.equals("component:input-text") != false) goto L_0x0a30;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x095b  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x095e  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0962  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0996  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x09ef  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x0a00  */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0a08  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0ae1  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0aeb  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0af2  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0af5  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0af9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View o(com.appfoundry.previewer.model.Component r23, android.content.Context r24, java.lang.String r25, com.appfoundry.previewer.model.Style r26, int r27, int r28, java.lang.Boolean r29, int r30, boolean r31) {
        /*
            r1 = r23
            r0 = r24
            r10 = r26
            r11 = r27
            r12 = r28
            r2 = r29
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            java.lang.String r3 = "$this$getView"
            e.x.c.i.e(r1, r3)
            r14 = 0
            if (r10 == 0) goto L_0x001c
            boolean r3 = b.f.a.e.i0(r26)
            r9 = r3
            goto L_0x001d
        L_0x001c:
            r9 = r14
        L_0x001d:
            java.lang.String r3 = r1.f7083b
            r7 = -1
            r6 = 0
            if (r3 != 0) goto L_0x0024
            goto L_0x0034
        L_0x0024:
            int r4 = r3.hashCode()
            java.lang.String r16 = ""
            java.lang.String r5 = "component:svg-web-view"
            java.lang.String r8 = "component:input-checkbox"
            r18 = 0
            r15 = 3
            switch(r4) {
                case -1794194085: goto L_0x0a26;
                case -1544579295: goto L_0x0833;
                case -1538889570: goto L_0x0808;
                case -1527000130: goto L_0x06eb;
                case -1474287997: goto L_0x0607;
                case -996722468: goto L_0x05fc;
                case -993028453: goto L_0x05ef;
                case -688258489: goto L_0x0563;
                case -653373361: goto L_0x0522;
                case -568224247: goto L_0x0517;
                case -483140773: goto L_0x0489;
                case -423333388: goto L_0x047e;
                case -372623172: goto L_0x040d;
                case 280543738: goto L_0x03ff;
                case 371084557: goto L_0x02c0;
                case 972511780: goto L_0x02b6;
                case 1157896013: goto L_0x0281;
                case 1214732910: goto L_0x0275;
                case 1214799932: goto L_0x0267;
                case 1215213549: goto L_0x025b;
                case 1215217037: goto L_0x024f;
                case 1335671819: goto L_0x0243;
                case 1336152458: goto L_0x0238;
                case 1701801054: goto L_0x019a;
                case 1705657287: goto L_0x0110;
                case 1705662815: goto L_0x006c;
                case 1705669223: goto L_0x0060;
                case 1840315739: goto L_0x0056;
                case 1840317103: goto L_0x004c;
                case 1923750697: goto L_0x0042;
                case 1926120019: goto L_0x0038;
                default: goto L_0x0034;
            }
        L_0x0034:
            r20 = r6
            goto L_0x0a5e
        L_0x0038:
            java.lang.String r2 = "component:formLabel"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0034
            goto L_0x0271
        L_0x0042:
            java.lang.String r2 = "component:formInput"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0034
            goto L_0x0a30
        L_0x004c:
            java.lang.String r2 = "component:input-url"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0034
            goto L_0x0a30
        L_0x0056:
            java.lang.String r2 = "component:input-tel"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0034
            goto L_0x0a30
        L_0x0060:
            java.lang.String r4 = "component:svg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0034
            r14 = r30
            goto L_0x0814
        L_0x006c:
            java.lang.String r2 = "component:map"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0034
            b.a.a.b.d r13 = new b.a.a.b.d
            java.lang.String r2 = "$this$isMapInteractive"
            e.x.c.i.e(r1, r2)
            com.appfoundry.previewer.model.Params r2 = r1.f7088j
            if (r2 == 0) goto L_0x008b
            com.appfoundry.previewer.model.Map r2 = r2.t
            if (r2 == 0) goto L_0x008b
            java.lang.Boolean r2 = r2.c
            if (r2 == 0) goto L_0x008b
            boolean r14 = r2.booleanValue()
        L_0x008b:
            r13.<init>(r0, r14)
            com.appfoundry.previewer.model.Params r0 = r1.f7088j
            java.lang.String r2 = "$this$setupMap"
            e.x.c.i.e(r13, r2)
            r7 = 0
            r8 = 0
            r9 = 0
            r14 = 56
            r2 = r13
            r3 = r26
            r4 = r27
            r5 = r28
            r15 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r14
            b.a.a.h.o.h(r2, r3, r4, r5, r6, r7, r8, r9)
            android.os.Bundle r2 = android.os.Bundle.EMPTY
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.getThreadPolicy()
            android.os.StrictMode$ThreadPolicy$Builder r4 = new android.os.StrictMode$ThreadPolicy$Builder
            r4.<init>(r3)
            android.os.StrictMode$ThreadPolicy$Builder r4 = r4.permitAll()
            android.os.StrictMode$ThreadPolicy r4 = r4.build()
            android.os.StrictMode.setThreadPolicy(r4)
            b.l.a.c.h.b$b r4 = r13.f3864h     // Catch:{ all -> 0x010b }
            b.l.a.c.d.g r5 = new b.l.a.c.d.g     // Catch:{ all -> 0x010b }
            r5.<init>(r4, r2)     // Catch:{ all -> 0x010b }
            r4.b(r2, r5)     // Catch:{ all -> 0x010b }
            b.l.a.c.h.b$b r2 = r13.f3864h     // Catch:{ all -> 0x010b }
            T r2 = r2.a     // Catch:{ all -> 0x010b }
            if (r2 != 0) goto L_0x00d2
            b.l.a.c.d.a.a(r13)     // Catch:{ all -> 0x010b }
        L_0x00d2:
            android.os.StrictMode.setThreadPolicy(r3)
            b.l.a.c.h.b$b r2 = r13.f3864h
            b.l.a.c.d.i r3 = new b.l.a.c.d.i
            r3.<init>(r2)
            r2.b(r15, r3)
            b.a.a.b.e r2 = new b.a.a.b.e
            r2.<init>(r0)
            java.lang.String r0 = "getMapAsync() must be called on the main thread"
            b.l.a.c.b.a.v(r0)
            b.l.a.c.h.b$b r0 = r13.f3864h
            T r3 = r0.a
            if (r3 == 0) goto L_0x0104
            b.l.a.c.h.b$a r3 = (b.l.a.c.h.b.a) r3
            b.l.a.c.h.f.c r0 = r3.f3865b     // Catch:{ RemoteException -> 0x00fd }
            b.l.a.c.h.i r3 = new b.l.a.c.h.i     // Catch:{ RemoteException -> 0x00fd }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x00fd }
            r0.v0(r3)     // Catch:{ RemoteException -> 0x00fd }
            goto L_0x0b0e
        L_0x00fd:
            r0 = move-exception
            b.l.a.c.h.g.d r1 = new b.l.a.c.h.g.d
            r1.<init>(r0)
            throw r1
        L_0x0104:
            java.util.List<b.l.a.c.h.d> r0 = r0.f3869i
            r0.add(r2)
            goto L_0x0b0e
        L_0x010b:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r3)
            throw r0
        L_0x0110:
            r15 = r6
            java.lang.String r4 = "component:gif"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0197
            android.widget.ImageView r14 = new android.widget.ImageView
            r14.<init>(r0)
            java.lang.String r0 = r1.f
            com.appfoundry.previewer.model.Asset r0 = b.a.a.n.f.h(r0, r2)
            java.lang.String r2 = "$this$setupWithGif"
            e.x.c.i.e(r14, r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 56
            r2 = r14
            r3 = r26
            r4 = r27
            r11 = 1
            r5 = r28
            b.a.a.i.b r2 = b.a.a.h.o.h(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            b.h.a.m.x.c.i r4 = new b.h.a.m.x.c.i
            r4.<init>()
            r3.add(r4)
            if (r10 == 0) goto L_0x0158
            boolean r4 = b.f.a.e.Z(r26)
            if (r4 != r11) goto L_0x0158
            int r2 = r2.a
            b.a.a.b.f r2 = b.f.a.e.q(r10, r2)
            r3.add(r2)
        L_0x0158:
            com.appfoundry.previewer.BravoApp$b r2 = com.appfoundry.previewer.BravoApp.Q
            java.lang.Boolean r2 = com.appfoundry.previewer.BravoApp.P
            boolean r2 = e.x.c.i.a(r2, r13)
            if (r2 == 0) goto L_0x0191
            android.content.Context r2 = b.f.a.e.c()
            b.h.a.i r2 = b.h.a.c.d(r2)
            if (r0 == 0) goto L_0x016f
            java.lang.String r6 = r0.f7065b
            goto L_0x0170
        L_0x016f:
            r6 = r15
        L_0x0170:
            b.h.a.h r0 = r2.o(r6)
            b.h.a.q.e r2 = new b.h.a.q.e
            r2.<init>()
            b.h.a.m.n r4 = new b.h.a.m.n
            r4.<init>(r3)
            b.h.a.q.a r2 = r2.v(r4, r11)
            b.h.a.h r0 = r0.a(r2)
            b.h.a.m.x.e.c r2 = b.h.a.m.x.e.c.b()
            b.h.a.h r0 = r0.J(r2)
            r0.E(r14)
        L_0x0191:
            r14.setClipToOutline(r11)
            r13 = r14
            goto L_0x0b0e
        L_0x0197:
            r13 = 1
            goto L_0x0233
        L_0x019a:
            r15 = r6
            r13 = 1
            java.lang.String r2 = "componennt:qr"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0233
            android.widget.ImageView r15 = new android.widget.ImageView
            r15.<init>(r0)
            java.lang.String r0 = r1.f7085g
            java.lang.String r2 = "$this$setupQr"
            e.x.c.i.e(r15, r2)
            r6 = 0
            r8 = 0
            r9 = 0
            r16 = 56
            r2 = r15
            r3 = r26
            r4 = r27
            r5 = r28
            r7 = r8
            r8 = r9
            r9 = r16
            b.a.a.h.o.h(r2, r3, r4, r5, r6, r7, r8, r9)
            b.l.f.a r4 = b.l.f.a.QR_CODE
            b.l.f.l r2 = new b.l.f.l     // Catch:{ v -> 0x0231, Exception -> 0x022a }
            r2.<init>()     // Catch:{ v -> 0x0231, Exception -> 0x022a }
            r7 = 0
            r3 = r0
            r5 = r27
            r6 = r28
            b.l.f.y.b r0 = r2.a(r3, r4, r5, r6, r7)     // Catch:{ v -> 0x0231, Exception -> 0x022a }
            int r8 = r0.f5811h
            int r9 = r0.f5812i
            int r2 = r8 * r9
            int[] r3 = new int[r2]
            r2 = r14
        L_0x01dd:
            if (r2 >= r9) goto L_0x01f8
            int r4 = r2 * r8
            r5 = r14
        L_0x01e2:
            if (r5 >= r8) goto L_0x01f5
            int r6 = r4 + r5
            boolean r7 = r0.b(r5, r2)
            if (r7 == 0) goto L_0x01ef
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x01f0
        L_0x01ef:
            r7 = -1
        L_0x01f0:
            r3[r6] = r7
            int r5 = r5 + 1
            goto L_0x01e2
        L_0x01f5:
            int r2 = r2 + 1
            goto L_0x01dd
        L_0x01f8:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r8, r9, r0)
            r4 = 0
            r6 = 0
            r7 = 0
            r2 = r0
            r5 = r8
            r2.setPixels(r3, r4, r5, r6, r7, r8, r9)
            r15.setImageBitmap(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r15.setScaleType(r0)
            r15.setClipToOutline(r13)
            if (r10 == 0) goto L_0x05ec
            boolean r0 = b.f.a.e.X(r26)
            if (r0 != r13) goto L_0x05ec
            java.lang.Integer r0 = r10.O
            if (r0 == 0) goto L_0x0221
            int r14 = r0.intValue()
        L_0x0221:
            android.graphics.drawable.Drawable r0 = b.f.a.e.p(r10, r14)
            r15.setForeground(r0)
            goto L_0x05ec
        L_0x022a:
            r0 = move-exception
            b.l.f.v r1 = new b.l.f.v
            r1.<init>((java.lang.Throwable) r0)
            throw r1
        L_0x0231:
            r0 = move-exception
            throw r0
        L_0x0233:
            r20 = r15
            r7 = -1
            goto L_0x0a5e
        L_0x0238:
            r15 = r6
            r13 = 1
            java.lang.String r2 = "component:text"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03fa
            goto L_0x0271
        L_0x0243:
            r15 = r6
            r13 = 1
            java.lang.String r2 = "component:date"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03fa
            goto L_0x0a30
        L_0x024f:
            r15 = r6
            r13 = 1
            java.lang.String r2 = "component:input-time"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03fa
            goto L_0x0a30
        L_0x025b:
            r15 = r6
            r13 = 1
            java.lang.String r2 = "component:input-text"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03fa
            goto L_0x0a30
        L_0x0267:
            r15 = r6
            r13 = 1
            java.lang.String r2 = "component:input-file"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03fa
        L_0x0271:
            r14 = r30
            goto L_0x052d
        L_0x0275:
            r15 = r6
            r13 = 1
            java.lang.String r2 = "component:input-date"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03fa
            goto L_0x0a30
        L_0x0281:
            r15 = r6
            r13 = 1
            java.lang.String r2 = "component:localImage"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03fa
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r0)
            java.lang.Integer r0 = r1.f7086h
            java.lang.String r2 = "$this$setupLocalImage"
            e.x.c.i.e(r13, r2)
            if (r0 == 0) goto L_0x0b0e
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 56
            r2 = r13
            r3 = r26
            r4 = r27
            r5 = r28
            b.a.a.h.o.h(r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r0.intValue()
            r13.setImageResource(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r13.setScaleType(r0)
            goto L_0x0b0e
        L_0x02b6:
            r15 = r6
            r13 = 1
            boolean r2 = r3.equals(r5)
            if (r2 == 0) goto L_0x03fa
            goto L_0x0492
        L_0x02c0:
            r9 = r6
            r13 = 1
            java.lang.String r2 = "component:gradient"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x03fa
            if (r10 == 0) goto L_0x02dc
            java.lang.String r2 = "$this$isLinearGradient"
            e.x.c.i.e(r10, r2)
            java.lang.String r2 = r10.s
            if (r2 == 0) goto L_0x02dc
            java.lang.String r3 = "linear"
            boolean r2 = r2.equals(r3)
            goto L_0x02dd
        L_0x02dc:
            r2 = r14
        L_0x02dd:
            if (r2 == 0) goto L_0x03e0
            android.view.View r8 = new android.view.View
            r8.<init>(r0)
            java.lang.String r0 = "$this$addLinearGradient"
            e.x.c.i.e(r8, r0)
            r6 = 0
            r7 = 0
            r0 = 24
            r2 = r8
            r3 = r26
            r4 = r27
            r5 = r28
            r24 = r8
            r8 = r30
            r9 = r0
            b.a.a.h.o.h(r2, r3, r4, r5, r6, r7, r8, r9)
            android.view.ViewGroup$LayoutParams r0 = r24.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.util.Objects.requireNonNull(r0, r2)
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            com.appfoundry.previewer.model.Size r0 = b.f.a.e.T(r0, r11, r12)
            if (r10 == 0) goto L_0x0326
            java.lang.Integer r2 = r0.a
            if (r2 == 0) goto L_0x0316
            int r2 = r2.intValue()
            goto L_0x0317
        L_0x0316:
            r2 = r11
        L_0x0317:
            java.lang.Integer r3 = r0.f7160b
            if (r3 == 0) goto L_0x0320
            int r3 = r3.intValue()
            goto L_0x0321
        L_0x0320:
            r3 = r12
        L_0x0321:
            com.appfoundry.previewer.model.Coordinate r6 = b.f.a.e.G(r10, r2, r3)
            goto L_0x0327
        L_0x0326:
            r6 = 0
        L_0x0327:
            if (r10 == 0) goto L_0x0340
            java.lang.Integer r2 = r0.a
            if (r2 == 0) goto L_0x0332
            int r2 = r2.intValue()
            r11 = r2
        L_0x0332:
            java.lang.Integer r0 = r0.f7160b
            if (r0 == 0) goto L_0x033b
            int r0 = r0.intValue()
            r12 = r0
        L_0x033b:
            com.appfoundry.previewer.model.Coordinate r0 = b.f.a.e.F(r10, r11, r12)
            goto L_0x0341
        L_0x0340:
            r0 = 0
        L_0x0341:
            if (r10 == 0) goto L_0x0348
            e.j r2 = b.f.a.e.N(r26)
            goto L_0x0349
        L_0x0348:
            r2 = 0
        L_0x0349:
            android.graphics.drawable.PaintDrawable r3 = new android.graphics.drawable.PaintDrawable
            r3.<init>()
            if (r2 == 0) goto L_0x03c2
            A r4 = r2.f7906h
            int[] r4 = (int[]) r4
            int r4 = r4.length
            if (r4 != 0) goto L_0x0359
            r5 = r13
            goto L_0x035a
        L_0x0359:
            r5 = r14
        L_0x035a:
            r4 = r5 ^ 1
            if (r4 == 0) goto L_0x03c2
            B r4 = r2.f7907i
            float[] r4 = (float[]) r4
            int r4 = r4.length
            if (r4 != 0) goto L_0x0367
            r5 = r13
            goto L_0x0368
        L_0x0367:
            r5 = r14
        L_0x0368:
            r4 = r5 ^ 1
            if (r4 == 0) goto L_0x03c2
            b.a.a.h.v r4 = new b.a.a.h.v
            r4.<init>(r6, r0, r2)
            android.graphics.drawable.shapes.RectShape r0 = new android.graphics.drawable.shapes.RectShape
            r0.<init>()
            r3.setShape(r0)
            r3.setShaderFactory(r4)
            java.util.List<java.lang.Float> r0 = r10.B
            r2 = 4
            if (r0 != 0) goto L_0x03a0
            java.lang.Float r0 = r10.A
            if (r0 == 0) goto L_0x03a0
            float r0 = r0.floatValue()
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a0
            java.lang.Float[] r0 = new java.lang.Float[r2]
            java.lang.Float r4 = r10.A
            r0[r14] = r4
            r0[r13] = r4
            r5 = 2
            r0[r5] = r4
            r0[r15] = r4
            java.util.List r0 = e.t.g.B(r0)
            r10.B = r0
        L_0x03a0:
            java.util.List<java.lang.Float> r0 = r10.B
            if (r0 == 0) goto L_0x03bc
            int r0 = r0.size()
            if (r0 != r2) goto L_0x03bc
            java.lang.Integer r0 = r10.O
            if (r0 == 0) goto L_0x03bc
            e.x.c.i.c(r0)
            int r0 = r0.intValue()
            float[] r0 = b.f.a.e.w(r10, r0)
            r3.setCornerRadii(r0)
        L_0x03bc:
            r0 = r24
            r0.setBackground(r3)
            goto L_0x03c4
        L_0x03c2:
            r0 = r24
        L_0x03c4:
            r0.setClipToOutline(r13)
            if (r10 == 0) goto L_0x0a5b
            boolean r2 = b.f.a.e.Y(r26)
            if (r2 != r13) goto L_0x0a5b
            java.lang.Integer r2 = r10.O
            if (r2 == 0) goto L_0x03d7
            int r14 = r2.intValue()
        L_0x03d7:
            android.graphics.drawable.Drawable r2 = b.f.a.e.p(r10, r14)
            r0.setForeground(r2)
            goto L_0x0a5b
        L_0x03e0:
            if (r10 == 0) goto L_0x03ec
            java.lang.String r2 = r10.s
            if (r2 == 0) goto L_0x03ec
            java.lang.String r3 = "radial"
            boolean r14 = r2.equals(r3)
        L_0x03ec:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            if (r14 == 0) goto L_0x0b0e
            r14 = r30
            b.a.a.h.o.c(r13, r10, r11, r12, r14)
            goto L_0x0b0e
        L_0x03fa:
            r7 = -1
            r20 = 0
            goto L_0x0a5e
        L_0x03ff:
            r13 = 1
            java.lang.String r2 = "component:input-textarea"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x040a
            goto L_0x0a30
        L_0x040a:
            r15 = r13
            goto L_0x047a
        L_0x040d:
            r15 = 1
            java.lang.String r4 = "component:lottie"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x047a
            com.airbnb.lottie.LottieAnimationView r9 = new com.airbnb.lottie.LottieAnimationView
            r9.<init>(r0)
            java.lang.String r0 = r1.f
            com.appfoundry.previewer.model.Asset r8 = b.a.a.n.f.h(r0, r2)
            java.lang.String r0 = "$this$customSetup"
            e.x.c.i.e(r9, r0)
            r6 = 0
            r7 = 0
            r0 = 0
            r16 = 56
            r2 = r9
            r3 = r26
            r4 = r27
            r5 = r28
            r10 = r8
            r8 = r0
            r11 = r9
            r9 = r16
            b.a.a.h.o.h(r2, r3, r4, r5, r6, r7, r8, r9)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            java.lang.Boolean r0 = com.appfoundry.previewer.BravoApp.P
            boolean r0 = e.x.c.i.a(r0, r13)
            if (r0 == 0) goto L_0x0477
            if (r10 == 0) goto L_0x044b
            java.lang.String r6 = r10.f7065b     // Catch:{ Exception -> 0x0449 }
            goto L_0x044c
        L_0x0449:
            r0 = move-exception
            goto L_0x045f
        L_0x044b:
            r6 = 0
        L_0x044c:
            r11.setAnimationFromUrl(r6)     // Catch:{ Exception -> 0x0449 }
            r7 = -1
            r11.setRepeatCount(r7)     // Catch:{ Exception -> 0x0449 }
            r11.playAnimation()     // Catch:{ Exception -> 0x0449 }
            b.a.a.h.k r0 = new b.a.a.h.k     // Catch:{ Exception -> 0x0449 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x0449 }
            r11.setFailureListener(r0)     // Catch:{ Exception -> 0x0449 }
            goto L_0x0477
        L_0x045f:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r10 == 0) goto L_0x0467
            java.lang.String r6 = r10.f7065b
            goto L_0x0468
        L_0x0467:
            r6 = 0
        L_0x0468:
            r2[r14] = r6
            java.lang.String r0 = r0.getLocalizedMessage()
            r2[r15] = r0
            q.a.a$b r0 = q.a.a.d
            java.lang.String r3 = "Exception in Lottie with url: %s -> %s"
            r0.b(r3, r2)
        L_0x0477:
            r13 = r11
            goto L_0x0b0e
        L_0x047a:
            r7 = -1
        L_0x047b:
            r9 = 0
            goto L_0x0804
        L_0x047e:
            r13 = 1
            java.lang.String r2 = "component:input-switch"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x06e8
            goto L_0x060e
        L_0x0489:
            r13 = 1
            java.lang.String r2 = "component:web-view"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x06e8
        L_0x0492:
            if (r0 == 0) goto L_0x0510
            b.a.a.b.a r2 = new b.a.a.b.a
            java.util.List<java.lang.String> r3 = r1.f7087i
            java.lang.String r4 = r1.f7083b
            boolean r4 = e.x.c.i.a(r4, r5)
            r2.<init>(r0, r3, r4)
            com.appfoundry.previewer.model.Params r0 = r1.f7088j
            if (r0 == 0) goto L_0x04a8
            java.lang.String r6 = r0.a
            goto L_0x04a9
        L_0x04a8:
            r6 = 0
        L_0x04a9:
            r2.f130m = r10
            r2.f131n = r11
            r2.f132o = r12
            r2.f133p = r6
            r2.setBackgroundColor(r14)
            java.util.List<java.lang.String> r0 = r2.f129l
            if (r0 == 0) goto L_0x0503
            java.lang.String r3 = "camera"
            boolean r0 = b.f.a.e.d0(r0, r3)
            if (r0 != r13) goto L_0x0503
            android.content.Context r0 = r2.getContext()
            java.lang.String r3 = "android.permission.CAMERA"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r3)
            if (r0 == 0) goto L_0x04ff
            android.content.Context r0 = r2.getContext()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            java.util.Objects.requireNonNull(r0, r4)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            boolean r0 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r0, r3)
            if (r0 == 0) goto L_0x04ee
            android.content.Context r0 = r2.getContext()
            java.util.Objects.requireNonNull(r0, r4)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            java.lang.String[] r3 = new java.lang.String[]{r3}
            androidx.core.app.ActivityCompat.requestPermissions(r0, r3, r13)
            goto L_0x0506
        L_0x04ee:
            android.content.Context r0 = r2.getContext()
            java.util.Objects.requireNonNull(r0, r4)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            java.lang.String[] r3 = new java.lang.String[]{r3}
            androidx.core.app.ActivityCompat.requestPermissions(r0, r3, r13)
            goto L_0x0506
        L_0x04ff:
            r2.d()
            goto L_0x0506
        L_0x0503:
            r2.d()
        L_0x0506:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            java.util.List<android.webkit.WebView> r0 = com.appfoundry.previewer.BravoApp.f6912l
            r0.add(r2)
        L_0x050d:
            r13 = r2
            goto L_0x0b0e
        L_0x0510:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            goto L_0x0b0e
        L_0x0517:
            r13 = 1
            java.lang.String r2 = "component:input-number"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x06e8
            goto L_0x0a30
        L_0x0522:
            r14 = r30
            r13 = 1
            java.lang.String r2 = "component:button"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x06e8
        L_0x052d:
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r0)
            java.lang.String r4 = r1.a
            com.appfoundry.previewer.model.Text r8 = r1.c
            java.lang.String r0 = "scanned-title"
            boolean r0 = w(r1, r0)
            java.lang.String r13 = r1.f7083b
            java.util.List<com.appfoundry.previewer.model.RichText> r7 = r1.f7095q
            java.lang.String r6 = r1.f7094p
            java.lang.String r5 = r1.r
            r2 = r15
            r3 = r25
            r16 = r5
            r5 = r26
            r17 = r6
            r6 = r27
            r18 = r7
            r7 = r28
            r10 = r0
            r11 = r30
            r12 = r13
            r13 = r18
            r14 = r17
            r0 = r15
            r15 = r16
            b.a.a.h.o.f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0a5b
        L_0x0563:
            r13 = 1
            java.lang.String r2 = "component:scannedAppIcon"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x06e8
            android.widget.ImageView r15 = new android.widget.ImageView
            r15.<init>(r0)
            java.lang.String r0 = r1.f7085g
            java.lang.String r2 = "$this$setupIcon"
            e.x.c.i.e(r15, r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 56
            r2 = r15
            r3 = r26
            r4 = r27
            r5 = r28
            b.a.a.h.o.h(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "fit"
            if (r10 == 0) goto L_0x0590
            java.lang.String r3 = r10.f7180q
            if (r3 == 0) goto L_0x0590
            goto L_0x0591
        L_0x0590:
            r3 = r2
        L_0x0591:
            boolean r2 = e.x.c.i.a(r3, r2)
            if (r2 == 0) goto L_0x05a2
            b.h.a.q.e r2 = new b.h.a.q.e
            r2.<init>()
            b.h.a.m.x.c.q r3 = new b.h.a.m.x.c.q
            r3.<init>()
            goto L_0x05ac
        L_0x05a2:
            b.h.a.q.e r2 = new b.h.a.q.e
            r2.<init>()
            b.h.a.m.x.c.i r3 = new b.h.a.m.x.c.i
            r3.<init>()
        L_0x05ac:
            b.h.a.q.a r2 = r2.v(r3, r13)
            b.h.a.q.e r2 = (b.h.a.q.e) r2
            java.lang.String r3 = "if (scale == Scale.FIT) …sform(CenterCrop())\n    }"
            e.x.c.i.d(r2, r3)
            android.content.Context r3 = b.f.a.e.c()
            b.h.a.i r3 = b.h.a.c.d(r3)
            b.h.a.h r0 = r3.o(r0)
            b.h.a.h r0 = r0.a(r2)
            b.h.a.m.x.e.c r2 = b.h.a.m.x.e.c.b()
            b.h.a.h r0 = r0.J(r2)
            r0.E(r15)
            r15.setClipToOutline(r13)
            if (r10 == 0) goto L_0x05ec
            boolean r0 = b.f.a.e.X(r26)
            if (r0 != r13) goto L_0x05ec
            java.lang.Integer r0 = r10.O
            if (r0 == 0) goto L_0x05e5
            int r14 = r0.intValue()
        L_0x05e5:
            android.graphics.drawable.Drawable r0 = b.f.a.e.p(r10, r14)
            r15.setForeground(r0)
        L_0x05ec:
            r13 = r15
            goto L_0x0b0e
        L_0x05ef:
            r14 = r30
            r13 = 1
            java.lang.String r4 = "component:input-image"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x06e8
            goto L_0x0814
        L_0x05fc:
            r13 = 1
            java.lang.String r2 = "component:input-email"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x06e8
            goto L_0x0a30
        L_0x0607:
            r13 = 1
            boolean r2 = r3.equals(r8)
            if (r2 == 0) goto L_0x06e8
        L_0x060e:
            if (r0 == 0) goto L_0x06e1
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            r9.<init>(r0)
            java.lang.String r0 = r1.f7083b
            java.lang.String r2 = "$this$createToggle"
            e.x.c.i.e(r9, r2)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r7, r7)
            if (r10 == 0) goto L_0x0626
            com.appfoundry.previewer.model.Dimensions r2 = r10.f7176m
            goto L_0x0627
        L_0x0626:
            r2 = 0
        L_0x0627:
            r5 = 0
            r7 = 0
            r16 = 24
            r3 = r27
            r4 = r28
            r11 = r6
            r6 = r7
            r7 = r16
            b.a.a.i.b r2 = b.f.a.e.m(r2, r3, r4, r5, r6, r7)
            com.appfoundry.previewer.model.Dimensions r2 = r2.c
            b.f.a.e.z0(r11, r2)
            r9.setLayoutParams(r11)
            if (r10 == 0) goto L_0x064e
            java.lang.Integer r2 = r10.r
            if (r2 == 0) goto L_0x064e
            int r2 = r2.intValue()
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            goto L_0x0650
        L_0x064e:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0650:
            r9.setAlpha(r2)
            if (r10 == 0) goto L_0x0660
            java.lang.Float r2 = r10.F
            if (r2 == 0) goto L_0x0660
            float r2 = r2.floatValue()
            r9.setRotation(r2)
        L_0x0660:
            boolean r0 = e.x.c.i.a(r0, r8)
            r2 = 17
            r3 = -2
            if (r0 == 0) goto L_0x068e
            android.widget.CheckBox r0 = new android.widget.CheckBox
            android.content.Context r4 = r9.getContext()
            r0.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r3, r3)
            r4.gravity = r2
            r0.setLayoutParams(r4)
            if (r10 == 0) goto L_0x06db
            java.lang.String r2 = r10.c
            if (r2 == 0) goto L_0x06db
            int r2 = b.a.a.h.m.m(r2)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setButtonTintList(r2)
            goto L_0x06db
        L_0x068e:
            com.google.android.material.switchmaterial.SwitchMaterial r0 = new com.google.android.material.switchmaterial.SwitchMaterial
            android.content.Context r4 = r9.getContext()
            r0.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r3, r3)
            r4.gravity = r2
            r0.setLayoutParams(r4)
            if (r10 == 0) goto L_0x06db
            java.lang.String r2 = r10.c
            if (r2 == 0) goto L_0x06db
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            int[][] r4 = new int[r15][]
            int[] r5 = new int[r13]
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r5[r14] = r6
            r4[r14] = r5
            int[] r5 = new int[r13]
            r6 = 16842912(0x10100a0, float:2.3694006E-38)
            r5[r14] = r6
            r4[r13] = r5
            int[] r5 = new int[r14]
            r6 = 2
            r4[r6] = r5
            int[] r5 = new int[r15]
            int r7 = b.a.a.h.m.m(r2)
            r5[r14] = r7
            int r2 = b.a.a.h.m.m(r2)
            r5[r13] = r2
            r2 = -3355444(0xffffffffffcccccc, float:NaN)
            r5[r6] = r2
            r3.<init>(r4, r5)
            r0.setThumbTintList(r3)
        L_0x06db:
            r9.addView(r0)
            r13 = r9
            goto L_0x0b0e
        L_0x06e1:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            goto L_0x0b0e
        L_0x06e8:
            r15 = r13
            goto L_0x047b
        L_0x06eb:
            r15 = 1
            java.lang.String r4 = "component:video"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x047b
            if (r0 == 0) goto L_0x07fd
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            r9.<init>(r0)
            java.lang.String r0 = r1.f
            com.appfoundry.previewer.model.Asset r0 = b.a.a.n.f.h(r0, r2)
            java.lang.String r2 = "$this$videoSetup"
            e.x.c.i.e(r9, r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r17 = 56
            r2 = r9
            r3 = r26
            r4 = r27
            r5 = r28
            r24 = r9
            r9 = r17
            b.a.a.h.o.h(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r10 == 0) goto L_0x071e
            com.appfoundry.previewer.model.Dimensions r2 = r10.f7176m
            goto L_0x071f
        L_0x071e:
            r2 = 0
        L_0x071f:
            r5 = 0
            r6 = 0
            r7 = 24
            r3 = r27
            r4 = r28
            b.a.a.i.b r2 = b.f.a.e.m(r2, r3, r4, r5, r6, r7)
            androidx.cardview.widget.CardView r3 = new androidx.cardview.widget.CardView
            android.content.Context r4 = r24.getContext()
            r3.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            int r5 = r2.a
            int r6 = r2.f308b
            r4.<init>(r5, r6)
            r5 = r24
            r5.addView(r3, r4)
            b.a.a.b.m.a r6 = new b.a.a.b.m.a
            android.content.Context r7 = r5.getContext()
            java.lang.String r8 = "context"
            e.x.c.i.d(r7, r8)
            r8 = 6
            r9 = 0
            r6.<init>(r7, r9, r14, r8)
            r3.addView(r6, r4)
            if (r0 == 0) goto L_0x075a
            java.lang.String r0 = r0.f7065b
            goto L_0x075b
        L_0x075a:
            r0 = r9
        L_0x075b:
            if (r0 == 0) goto L_0x0764
            r6.setDataSource(r0)
            r6.c()
            goto L_0x0777
        L_0x0764:
            java.lang.Object[] r4 = new java.lang.Object[r15]
            if (r10 == 0) goto L_0x076e
            java.lang.String r7 = r10.a
            if (r7 == 0) goto L_0x076e
            r16 = r7
        L_0x076e:
            r4[r14] = r16
            q.a.a$b r7 = q.a.a.d
            java.lang.String r8 = "Video URL is null for style id: %s"
            r7.b(r8, r4)
        L_0x0777:
            android.widget.ImageView r4 = new android.widget.ImageView
            android.content.Context r7 = r5.getContext()
            r4.<init>(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r8 = r2.a
            int r11 = r2.f308b
            r7.<init>(r8, r11)
            r3.addView(r4, r7)
            r6.setThumbnail(r4)
            b.a.a.h.o.e(r5)
            com.appfoundry.previewer.BravoApp$b r7 = com.appfoundry.previewer.BravoApp.Q
            java.lang.Boolean r7 = com.appfoundry.previewer.BravoApp.P
            boolean r7 = e.x.c.i.a(r7, r13)
            if (r7 == 0) goto L_0x07bd
            b.a.a.h.u r7 = new b.a.a.h.u
            r7.<init>(r5)
            r6.setListener(r7)
            android.content.Context r6 = r5.getContext()
            b.h.a.i r6 = b.h.a.c.d(r6)
            b.h.a.h r6 = r6.l()
            b.h.a.h r0 = r6.G(r0)
            b.h.a.q.a r0 = r0.c()
            b.h.a.h r0 = (b.h.a.h) r0
            r0.E(r4)
        L_0x07bd:
            if (r10 == 0) goto L_0x07fa
            boolean r0 = b.f.a.e.Y(r26)
            if (r0 != r15) goto L_0x07fa
            int r0 = r2.a
            java.lang.String r2 = "$this$getCornerRadiusForComponentWidth"
            e.x.c.i.e(r10, r2)
            java.util.List<java.lang.Float> r2 = r10.B
            if (r2 == 0) goto L_0x07d8
            java.lang.Object r2 = r2.get(r14)
            r6 = r2
            java.lang.Float r6 = (java.lang.Float) r6
            goto L_0x07d9
        L_0x07d8:
            r6 = r9
        L_0x07d9:
            if (r6 == 0) goto L_0x07f5
            java.util.List<java.lang.Float> r2 = r10.B
            if (r2 == 0) goto L_0x07e7
            java.lang.Object r2 = r2.get(r14)
            r6 = r2
            java.lang.Float r6 = (java.lang.Float) r6
            goto L_0x07e8
        L_0x07e7:
            r6 = r9
        L_0x07e8:
            e.x.c.i.c(r6)
            float r2 = r6.floatValue()
            float r0 = (float) r0
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r18 = r2 / r0
        L_0x07f5:
            r0 = r18
            r3.setRadius(r0)
        L_0x07fa:
            r13 = r5
            goto L_0x0b0e
        L_0x07fd:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            goto L_0x0b0e
        L_0x0804:
            r20 = r9
            goto L_0x0a5e
        L_0x0808:
            r14 = r30
            r9 = r6
            r15 = 1
            java.lang.String r4 = "component:image"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0804
        L_0x0814:
            android.widget.ImageView r13 = new android.widget.ImageView
            r13.<init>(r0)
            java.lang.String r4 = r1.a
            java.lang.String r5 = r1.f7083b
            java.lang.String r0 = r1.f
            com.appfoundry.previewer.model.Asset r9 = b.a.a.n.f.h(r0, r2)
            r2 = r13
            r3 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r10 = r30
            b.f.a.e.B0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0b0e
        L_0x0833:
            r9 = r6
            r15 = 1
            java.lang.String r2 = "component:chart"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0804
            if (r0 == 0) goto L_0x0a1f
            b.k.a.a.a.c r8 = new b.k.a.a.a.c
            r8.<init>(r0)
            com.appfoundry.previewer.model.Params r0 = r1.f7088j
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            b.k.a.a.a.b r6 = b.k.a.a.a.b.Area
            b.k.a.a.a.b r5 = b.k.a.a.a.b.Line
            b.k.a.a.a.b r4 = b.k.a.a.a.b.Bar
            java.lang.String r2 = "$this$setup"
            e.x.c.i.e(r8, r2)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 56
            r2 = r8
            r3 = r26
            r10 = r4
            r4 = r27
            r11 = r5
            r5 = r28
            r12 = r6
            r6 = r17
            r15 = r7
            r7 = r19
            r22 = r8
            r8 = r20
            r20 = r9
            r9 = r21
            b.a.a.h.o.h(r2, r3, r4, r5, r6, r7, r8, r9)
            b.k.a.a.a.a r2 = new b.k.a.a.a.a
            r2.<init>()
            if (r0 == 0) goto L_0x08bb
            java.lang.String r3 = "$this$getChartType"
            e.x.c.i.e(r0, r3)
            java.lang.String r3 = r0.w
            if (r3 == 0) goto L_0x08bb
            int r4 = r3.hashCode()
            switch(r4) {
                case -1206239059: goto L_0x08b1;
                case -1001078227: goto L_0x08a7;
                case 97299: goto L_0x08a1;
                case 110988: goto L_0x0896;
                case 3321844: goto L_0x088d;
                default: goto L_0x088c;
            }
        L_0x088c:
            goto L_0x08bb
        L_0x088d:
            java.lang.String r4 = "line"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x08bb
            goto L_0x08b9
        L_0x0896:
            java.lang.String r4 = "pie"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x08bb
            b.k.a.a.a.b r6 = b.k.a.a.a.b.Pie
            goto L_0x08bc
        L_0x08a1:
            java.lang.String r4 = "bar"
            r3.equals(r4)
            goto L_0x08bb
        L_0x08a7:
            java.lang.String r4 = "progress"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x08bb
            r6 = r12
            goto L_0x08bc
        L_0x08b1:
            java.lang.String r4 = "multiline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x08bb
        L_0x08b9:
            r6 = r11
            goto L_0x08bc
        L_0x08bb:
            r6 = r10
        L_0x08bc:
            java.lang.String r3 = "prop"
            e.x.c.i.e(r6, r3)
            r2.c = r6
            if (r0 == 0) goto L_0x08ca
            java.lang.String r4 = r0.f7139b
            if (r4 == 0) goto L_0x08ca
            goto L_0x08cc
        L_0x08ca:
            r4 = r16
        L_0x08cc:
            e.x.c.i.e(r4, r3)
            r2.f2341b = r4
            r2.f2342e = r15
            java.lang.Float r4 = java.lang.Float.valueOf(r18)
            r2.f2343g = r4
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            if (r0 == 0) goto L_0x0952
            java.lang.String r5 = "$this$getChartData"
            e.x.c.i.e(r0, r5)
            java.util.List<com.appfoundry.previewer.model.ChartData> r5 = r0.y
            if (r5 == 0) goto L_0x0952
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<com.appfoundry.previewer.model.ChartData> r6 = r0.y
            java.util.Iterator r6 = r6.iterator()
        L_0x08f1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0946
            java.lang.Object r7 = r6.next()
            com.appfoundry.previewer.model.ChartData r7 = (com.appfoundry.previewer.model.ChartData) r7
            b.k.a.a.a.h r8 = new b.k.a.a.a.h
            r8.<init>()
            java.lang.String r9 = r7.f7082b
            java.util.List<java.lang.Object> r9 = r7.a
            if (r9 == 0) goto L_0x0914
            r24 = r6
            java.lang.Object[] r6 = new java.lang.Object[r14]
            java.lang.Object[] r6 = r9.toArray(r6)
            java.util.Objects.requireNonNull(r6, r4)
            goto L_0x0918
        L_0x0914:
            r24 = r6
            java.lang.Object[] r6 = new java.lang.Object[r14]
        L_0x0918:
            int r9 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r9)
            e.x.c.i.e(r6, r3)
            r8.a = r6
            java.util.List<java.lang.String> r6 = r0.z
            if (r6 == 0) goto L_0x0940
            int r6 = r6.size()
            java.util.List<com.appfoundry.previewer.model.ChartData> r9 = r0.y
            int r9 = r9.indexOf(r7)
            if (r6 <= r9) goto L_0x0940
            java.util.List<java.lang.String> r6 = r0.z
            java.util.List<com.appfoundry.previewer.model.ChartData> r9 = r0.y
            int r7 = r9.indexOf(r7)
            java.lang.Object r6 = r6.get(r7)
            r8.f2366b = r6
        L_0x0940:
            r5.add(r8)
            r6 = r24
            goto L_0x08f1
        L_0x0946:
            b.k.a.a.a.h[] r6 = new b.k.a.a.a.h[r14]
            java.lang.Object[] r5 = r5.toArray(r6)
            java.util.Objects.requireNonNull(r5, r4)
            b.k.a.a.a.h[] r5 = (b.k.a.a.a.h[]) r5
            goto L_0x0954
        L_0x0952:
            b.k.a.a.a.h[] r5 = new b.k.a.a.a.h[r14]
        L_0x0954:
            e.x.c.i.e(r5, r3)
            r2.f2346j = r5
            if (r0 == 0) goto L_0x095e
            java.util.List<java.lang.String> r6 = r0.z
            goto L_0x0960
        L_0x095e:
            r6 = r20
        L_0x0960:
            if (r6 == 0) goto L_0x0972
            java.util.List<java.lang.String> r0 = r0.z
            java.lang.Object[] r5 = new java.lang.Object[r14]
            java.lang.Object[] r0 = r0.toArray(r5)
            java.util.Objects.requireNonNull(r0, r4)
            e.x.c.i.e(r0, r3)
            r2.f2344h = r0
        L_0x0972:
            java.lang.String r0 = "chartModel"
            e.x.c.i.e(r2, r0)
            java.lang.String r0 = "$this$aa_toAAOptions"
            e.x.c.i.e(r2, r0)
            b.k.a.a.a.b r0 = b.k.a.a.a.b.Scatter
            b.k.a.a.a.b r4 = b.k.a.a.a.b.Spline
            b.k.a.a.a.b r5 = b.k.a.a.a.b.Areaspline
            java.lang.String r6 = "aaChartModel"
            e.x.c.i.e(r2, r6)
            b.k.a.a.b.a r6 = new b.k.a.a.b.a
            r6.<init>()
            b.k.a.a.a.b r7 = r2.c
            java.lang.Boolean r8 = r2.f2342e
            e.x.c.i.a(r8, r15)
            if (r7 != 0) goto L_0x0996
            goto L_0x09ad
        L_0x0996:
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x09aa
            r8 = 1
            if (r7 == r8) goto L_0x09aa
            r8 = 7
            if (r7 == r8) goto L_0x09a3
            goto L_0x09ad
        L_0x09a3:
            java.lang.String r7 = "pointer"
            e.x.c.i.e(r7, r3)
            java.lang.Boolean r13 = r2.f2342e
        L_0x09aa:
            e.x.c.i.a(r13, r15)
        L_0x09ad:
            b.k.a.a.a.g r7 = new b.k.a.a.a.g
            r7.<init>()
            e.x.c.i.e(r6, r3)
            r7.a = r6
            java.lang.Object[] r3 = r2.f2344h
            r7.f2365b = r3
            b.k.a.a.a.b r3 = b.k.a.a.a.b.Gauge
            b.k.a.a.a.b r2 = r2.c
            b.k.a.a.a.b r6 = b.k.a.a.a.b.Column
            if (r2 == r6) goto L_0x09ed
            if (r2 == r10) goto L_0x09ed
            if (r2 == r12) goto L_0x09ed
            if (r2 == r5) goto L_0x09ed
            if (r2 == r11) goto L_0x09ed
            if (r2 == r4) goto L_0x09ed
            if (r2 == r0) goto L_0x09ed
            b.k.a.a.a.b r0 = b.k.a.a.a.b.Bubble
            if (r2 == r0) goto L_0x09ed
            b.k.a.a.a.b r0 = b.k.a.a.a.b.Columnrange
            if (r2 == r0) goto L_0x09ed
            b.k.a.a.a.b r0 = b.k.a.a.a.b.Arearange
            if (r2 == r0) goto L_0x09ed
            b.k.a.a.a.b r0 = b.k.a.a.a.b.Areasplinerange
            if (r2 == r0) goto L_0x09ed
            b.k.a.a.a.b r0 = b.k.a.a.a.b.Boxplot
            if (r2 == r0) goto L_0x09ed
            b.k.a.a.a.b r0 = b.k.a.a.a.b.Waterfall
            if (r2 == r0) goto L_0x09ed
            b.k.a.a.a.b r0 = b.k.a.a.a.b.Polygon
            if (r2 == r0) goto L_0x09ed
            if (r2 != r3) goto L_0x09f5
        L_0x09ed:
            if (r2 == r3) goto L_0x09f2
            e.x.c.i.c(r15)
        L_0x09f2:
            e.x.c.i.c(r15)
        L_0x09f5:
            java.lang.String r0 = "chartOptions"
            e.x.c.i.e(r7, r0)
            r2 = r22
            java.lang.String r3 = r2.f2363m
            if (r3 == 0) goto L_0x0a08
            e.x.c.i.e(r7, r0)
            r2.a(r7)
            goto L_0x050d
        L_0x0a08:
            java.lang.String r0 = "file:///android_asset/AAChartView.html"
            r2.loadUrl(r0)
            b.k.a.a.a.d r0 = new b.k.a.a.a.d
            r0.<init>(r2, r7)
            r2.setWebViewClient(r0)
            b.k.a.a.a.e r0 = new b.k.a.a.a.e
            r0.<init>(r2)
            r2.setWebChromeClient(r0)
            goto L_0x050d
        L_0x0a1f:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            goto L_0x0b0e
        L_0x0a26:
            r20 = r6
            java.lang.String r2 = "component:input-password"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0a5e
        L_0x0a30:
            android.widget.EditText r15 = new android.widget.EditText
            r15.<init>(r0)
            java.lang.String r4 = r1.a
            com.appfoundry.previewer.model.Text r8 = r1.c
            java.lang.String r0 = r1.f7083b
            java.util.List<com.appfoundry.previewer.model.RichText> r13 = r1.f7095q
            java.lang.String r14 = r1.f7094p
            java.lang.String r7 = r1.r
            r16 = 0
            r17 = 0
            r2 = r15
            r3 = r25
            r5 = r26
            r6 = r27
            r18 = r7
            r7 = r28
            r10 = r16
            r11 = r17
            r12 = r0
            r0 = r15
            r15 = r18
            b.a.a.h.o.f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0a5b:
            r13 = r0
            goto L_0x0b0e
        L_0x0a5e:
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            java.lang.String r0 = "$this$createView"
            e.x.c.i.e(r13, r0)
            java.lang.String r0 = "$this$setupColor"
            e.x.c.i.e(r13, r0)
            if (r10 == 0) goto L_0x0a73
            com.appfoundry.previewer.model.Dimensions r0 = r10.f7176m
            r2 = r0
            goto L_0x0a75
        L_0x0a73:
            r2 = r20
        L_0x0a75:
            r5 = 0
            r6 = 0
            r0 = 24
            r3 = r27
            r4 = r28
            r8 = r7
            r7 = r0
            b.a.a.i.b r0 = b.f.a.e.m(r2, r3, r4, r5, r6, r7)
            int r2 = r0.f308b
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r8, r2)
            com.appfoundry.previewer.model.Dimensions r2 = r0.c
            b.f.a.e.z0(r3, r2)
            r13.setLayoutParams(r3)
            if (r10 == 0) goto L_0x0a9c
            int r2 = r0.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.O = r2
        L_0x0a9c:
            if (r10 == 0) goto L_0x0aa6
            int r2 = r0.f308b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.P = r2
        L_0x0aa6:
            if (r10 == 0) goto L_0x0ab9
            boolean r2 = b.f.a.e.Y(r26)
            r3 = 1
            if (r2 != r3) goto L_0x0aba
            int r0 = r0.a
            android.graphics.drawable.Drawable r0 = b.f.a.e.p(r10, r0)
            r13.setBackground(r0)
            goto L_0x0adb
        L_0x0ab9:
            r3 = 1
        L_0x0aba:
            if (r10 == 0) goto L_0x0adb
            boolean r0 = b.f.a.e.W(r26)
            if (r0 != r3) goto L_0x0adb
            java.lang.String r0 = r10.c
            if (r0 == 0) goto L_0x0acf
            int r0 = b.a.a.h.m.m(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            goto L_0x0ad1
        L_0x0acf:
            r6 = r20
        L_0x0ad1:
            e.x.c.i.c(r6)
            int r0 = r6.intValue()
            r13.setBackgroundColor(r0)
        L_0x0adb:
            if (r10 == 0) goto L_0x0aeb
            java.lang.Integer r0 = r10.r
            if (r0 == 0) goto L_0x0aeb
            int r0 = r0.intValue()
            float r0 = (float) r0
            r2 = 1120403456(0x42c80000, float:100.0)
            float r8 = r0 / r2
            goto L_0x0aed
        L_0x0aeb:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x0aed:
            r13.setAlpha(r8)
            if (r10 == 0) goto L_0x0af5
            java.lang.Float r6 = r10.F
            goto L_0x0af7
        L_0x0af5:
            r6 = r20
        L_0x0af7:
            if (r6 == 0) goto L_0x0b02
            java.lang.Float r0 = r10.F
            float r0 = r0.floatValue()
            r13.setRotation(r0)
        L_0x0b02:
            r2 = 1
            r13.setClipToOutline(r2)
            r0 = 2131230856(0x7f080088, float:1.8077777E38)
            java.lang.String r2 = "component:color"
            r13.setTag(r0, r2)
        L_0x0b0e:
            java.lang.String r0 = r1.u
            r13.setContentDescription(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.e.o(com.appfoundry.previewer.model.Component, android.content.Context, java.lang.String, com.appfoundry.previewer.model.Style, int, int, java.lang.Boolean, int, boolean):android.view.View");
    }

    public static /* synthetic */ View p(Component component, Context context, String str, Style style, int i2, int i3, Boolean bool, int i4, boolean z, int i5) {
        int i6 = i5;
        return o(component, context, str, style, i2, i3, (i6 & 32) != 0 ? Boolean.FALSE : null, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? false : z);
    }

    public static final Float q(Page page) {
        i.e(page, "$this$getWidth");
        Style u = f.u(page.r, (Boolean) null, 2);
        if (u != null) {
            return u.f7172i;
        }
        return null;
    }

    public static final void r(Container container) {
        i.e(container, "$this$handleAudioIfExists");
        String j2 = j(container);
        if (j2 != null) {
            container.f7105n = j2;
            BravoApp.b bVar = BravoApp.Q;
            if (BravoApp.F.get(j2) == null) {
                BravoApp.F.put(j2, new ArrayList());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if ((r0.length() == 0) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(com.appfoundry.previewer.model.Container r2, java.lang.String r3, android.widget.FrameLayout r4) {
        /*
            java.lang.String r0 = "$this$handleHrefIfExists"
            e.x.c.i.e(r2, r0)
            java.lang.String r0 = "containerParent"
            e.x.c.i.e(r4, r0)
            java.lang.String r0 = r2.d
            r1 = 1
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0017
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x002a
        L_0x001a:
            com.appfoundry.previewer.model.Actions r0 = r2.f7102k
            if (r0 != 0) goto L_0x002a
            java.util.List<java.lang.String> r0 = r2.f7101j
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = b.f.a.e.x(r0)
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0040
        L_0x002a:
            b.a.a.h.g r0 = new b.a.a.h.g
            r0.<init>(r2, r3)
            r4.setOnClickListener(r0)
            java.lang.String r3 = r2.f7097e
            if (r3 == 0) goto L_0x0040
            boolean r3 = b.a.a.h.m.h(r3)
            if (r3 != r1) goto L_0x0040
            java.lang.String r3 = r2.f7097e
            r2.d = r3
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.h.e.s(com.appfoundry.previewer.model.Container, java.lang.String, android.widget.FrameLayout):void");
    }

    public static final boolean t(Component component, String str) {
        Tap tap;
        String str2;
        i.e(component, "$this$hasAction");
        i.e(str, "actionType");
        Actions actions = component.f7089k;
        if ((actions == null || (tap = actions.a) == null || (str2 = tap.a) == null || !e.c0.h.d(str2, str, false, 2)) && !w(component, str)) {
            return false;
        }
        return true;
    }

    public static final boolean u(Component component) {
        String str;
        String str2;
        Tap tap;
        i.e(component, "$this$hasAnyClickEvent");
        Actions actions = component.f7089k;
        if (actions == null || (tap = actions.a) == null || (str = tap.a) == null) {
            str = "";
        }
        List<String> list = component.f7087i;
        if (list == null || (str2 = b.f.a.e.x(list)) == null) {
            str2 = "";
        }
        if ((!i.a(str, "")) || (!i.a(str2, ""))) {
            return true;
        }
        String str3 = component.f7092n;
        if ((str3 == null || !m.h(str3)) && component.f7084e == null) {
            return false;
        }
        return true;
    }

    public static final boolean v(Page page) {
        i.e(page, "$this$hasCallAlways");
        return x(page, "refresh:always");
    }

    public static final boolean w(Component component, String str) {
        i.e(component, "$this$hasTag");
        i.e(str, "tag");
        List<String> list = component.f7087i;
        if (list == null) {
            return false;
        }
        for (String b2 : list) {
            if (e.c0.h.b(b2, str, true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean x(Page page, String str) {
        i.e(page, "$this$hasTag");
        i.e(str, "tag");
        List<String> list = page.f7134m;
        if (list == null) {
            return false;
        }
        i.c(list);
        for (String b2 : list) {
            if (e.c0.h.b(b2, str, true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(Page page) {
        i.e(page, "$this$isAppList");
        return i.a(page.a, "01DZ4603T6VVRA0F2RAKTXMQ64") || i.a(page.a, "01DZ45B405STDZ8N44S6WBW58T");
    }

    public static final boolean z(Container container) {
        List<Container> list;
        List<Container> list2;
        i.e(container, "$this$isCarousel");
        Params params = container.f7104m;
        boolean z = true;
        if (!i.a(params != null ? params.r : null, "horizontal") || (list2 = container.f7103l) == null || !(!list2.isEmpty())) {
            z = false;
        }
        if (z && (list = container.f7103l) != null) {
            for (Container container2 : list) {
                container2.f7106o = Boolean.TRUE;
            }
        }
        return z;
    }
}
