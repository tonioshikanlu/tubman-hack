package com.appfoundry.previewer.activities;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.d.p;
import b.a.a.g.h0;
import b.a.a.g.t;
import b.a.a.g.t0;
import b.a.a.g.u0;
import b.a.a.g.z;
import b.a.a.h.o;
import b.a.a.n.f;
import b.f.a.e;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.Animation;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Page;
import e.x.c.i;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p.a.a.c;
import p.a.a.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/appfoundry/previewer/activities/LongPressActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onBackPressed", "onDestroy", "finish", "Lb/a/a/g/t;", "event", "onLongPressPageUnlinkEvent", "(Lb/a/a/g/t;)V", "Lb/a/a/g/u0;", "onUpdateEvent", "(Lb/a/a/g/u0;)V", "Lb/a/a/g/h0;", "onPushDialogEvent", "(Lb/a/a/g/h0;)V", "Lb/a/a/g/z;", "onOpenIntroEvent", "(Lb/a/a/g/z;)V", "<init>", "app_release"}, k = 1, mv = {1, 1, 15})
public final class LongPressActivity extends AppCompatActivity {

    /* renamed from: h  reason: collision with root package name */
    public HashMap f7035h;

    public static final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ LongPressActivity f7036h;

        public a(LongPressActivity longPressActivity) {
            this.f7036h = longPressActivity;
        }

        public final void run() {
            c.b().g(new t0());
            this.f7036h.finish();
        }
    }

    public View a(int i2) {
        if (this.f7035h == null) {
            this.f7035h = new HashMap();
        }
        View view = (View) this.f7035h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f7035h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void finish() {
        super.finish();
        e.m0(this);
    }

    public void onBackPressed() {
        BravoApp.b bVar = BravoApp.Q;
        BravoApp.w = false;
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.A0(this);
        e.f0(this);
        setContentView((int) R.layout.fragment_list_toolbar_solid);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(R.id.swipeRefreshLayout);
        i.d(swipeRefreshLayout, "swipeRefreshLayout");
        swipeRefreshLayout.setEnabled(false);
        e.l0(this);
        BravoApp.b bVar = BravoApp.Q;
        BravoApp.w = true;
        Page q2 = f.q("page-unlink");
        FrameLayout frameLayout = (FrameLayout) a(R.id.activity_parent);
        i.d(frameLayout, "activity_parent");
        o.i(frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) a(R.id.activity_parent);
        i.d(frameLayout2, "activity_parent");
        Animation animation = null;
        o.d(frameLayout2, q2 != null ? q2.a : null, q2 != null ? q2.d : null, Boolean.FALSE);
        FrameLayout frameLayout3 = (FrameLayout) a(R.id.activity_parent);
        i.d(frameLayout3, "activity_parent");
        o.b(frameLayout3, q2 != null ? q2.a : null, q2 != null ? q2.f7130i : null, (Boolean) null, 4);
        RecyclerView recyclerView = (RecyclerView) a(R.id.recyclerView);
        i.d(recyclerView, "recyclerView");
        String str = q2 != null ? q2.a : null;
        List<Container> list = q2 != null ? q2.f : null;
        if (q2 != null) {
            animation = q2.u;
        }
        e.C0(recyclerView, str, list, animation, (Boolean) null, false, false, (Float) null, 120);
    }

    public void onDestroy() {
        super.onDestroy();
        e.L0(this);
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onLongPressPageUnlinkEvent(t tVar) {
        i.e(tVar, "event");
        BravoApp.b bVar = BravoApp.Q;
        BravoApp.w = false;
        new Handler().postDelayed(new a(this), 350);
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onOpenIntroEvent(z zVar) {
        i.e(zVar, "event");
        BravoApp.b bVar = BravoApp.Q;
        BravoApp.w = false;
        new Handler().postDelayed(new p(this), 350);
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onPushDialogEvent(h0 h0Var) {
        i.e(h0Var, "event");
        e.E0(this);
    }

    public void onStart() {
        super.onStart();
        e.r0(this);
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onUpdateEvent(u0 u0Var) {
        i.e(u0Var, "event");
        BravoApp.b bVar = BravoApp.Q;
        BravoApp.w = false;
        new Handler().postDelayed(new p(this), 350);
    }
}
