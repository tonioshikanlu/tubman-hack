package com.appfoundry.previewer.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.a.b;
import b.a.a.g.h0;
import b.a.a.g.q;
import b.a.a.g.v;
import b.a.a.g.x;
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
import p.a.a.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/appfoundry/previewer/activities/ModalActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "()V", "onStart", "onDestroy", "finish", "Lb/a/a/g/q;", "event", "onIntroCloseEvent", "(Lb/a/a/g/q;)V", "Lb/a/a/g/v;", "onNavigationEvent", "(Lb/a/a/g/v;)V", "Lb/a/a/g/h0;", "onPushDialogEvent", "(Lb/a/a/g/h0;)V", "Lb/a/a/g/x;", "onOpenAppSettingsEvent", "(Lb/a/a/g/x;)V", "", "j", "Z", "buildingIntroFromShakePage", "", "h", "Ljava/lang/String;", "pageId", "k", "isModalMenu", "Lcom/appfoundry/previewer/model/Page;", "i", "Lcom/appfoundry/previewer/model/Page;", "page", "<init>", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ModalActivity extends AppCompatActivity {

    /* renamed from: h  reason: collision with root package name */
    public String f7037h;

    /* renamed from: i  reason: collision with root package name */
    public Page f7038i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7039j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7040k;

    /* renamed from: l  reason: collision with root package name */
    public HashMap f7041l;

    public View a(int i2) {
        if (this.f7041l == null) {
            this.f7041l = new HashMap();
        }
        View view = (View) this.f7041l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f7041l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void finish() {
        super.finish();
        if (this.f7040k) {
            BravoApp.b bVar = BravoApp.Q;
            BravoApp.v = false;
        }
        e.m0(this);
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        e.A0(this);
        e.f0(this);
        setContentView((int) R.layout.activity_modal);
        e.l0(this);
        this.f7040k = getIntent().getBooleanExtra("is_menu", false);
        this.f7039j = getIntent().getBooleanExtra("building_intro_from_shake_page", false);
        Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("page_id")) == null) {
            str = "";
        }
        this.f7037h = str;
        Boolean bool = null;
        this.f7038i = this.f7040k ? e.J() : this.f7039j ? f.p(str) : f.n(str);
        FrameLayout frameLayout = (FrameLayout) a(R.id.activity_modal_parent);
        i.d(frameLayout, "activity_modal_parent");
        Page page = this.f7038i;
        o.b(frameLayout, page != null ? page.a : null, page != null ? page.f7130i : null, (Boolean) null, 4);
        RecyclerView recyclerView = (RecyclerView) a(R.id.recyclerView);
        i.d(recyclerView, "recyclerView");
        Page page2 = this.f7038i;
        String str2 = page2 != null ? page2.a : null;
        List<Container> list = page2 != null ? page2.f : null;
        Animation animation = page2 != null ? page2.u : null;
        if (page2 != null) {
            bool = Boolean.valueOf(page2.x);
        }
        e.C0(recyclerView, str2, list, animation, bool, false, false, (Float) null, 112);
        if (this.f7040k) {
            BravoApp.b bVar = BravoApp.Q;
            BravoApp bravoApp = BravoApp.f6908h;
            BravoApp.v = true;
        }
        if (this.f7039j) {
            BravoApp.b bVar2 = BravoApp.Q;
            BravoApp.x = true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f7039j) {
            BravoApp.b bVar = BravoApp.Q;
            BravoApp.x = false;
        }
        e.L0(this);
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onIntroCloseEvent(q qVar) {
        i.e(qVar, "event");
        finish();
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onNavigationEvent(v vVar) {
        i.e(vVar, "event");
        if (this.f7039j) {
            Page p2 = f.p(vVar.a);
            b bVar = null;
            if (p2 != null) {
                bVar = b.a.a.h.e.f(p2, (Boolean) null, 1);
            }
            e.t0(this, bVar, R.id.container);
            return;
        }
        finish();
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onOpenAppSettingsEvent(x xVar) {
        i.e(xVar, "event");
        i.e(this, "$this$openAppSystemSettings");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.fromParts("package", getPackageName(), (String) null));
        startActivity(intent);
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
}
