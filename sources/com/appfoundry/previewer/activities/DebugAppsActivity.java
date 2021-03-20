package com.appfoundry.previewer.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.l.f;
import b.f.a.e;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/appfoundry/previewer/activities/DebugAppsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "Le/r;", "onCreate", "(Landroid/os/Bundle;)V", "finish", "()V", "<init>", "app_release"}, k = 1, mv = {1, 1, 15})
public final class DebugAppsActivity extends AppCompatActivity {
    public void finish() {
        super.finish();
        e.m0(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.A0(this);
        e.f0(this);
        setContentView((int) R.layout.activity_emulator);
        e.l0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        if (recyclerView != null) {
            i.e(recyclerView, "$this$setupForDebugApps");
            i.e(this, BasePayload.CONTEXT_KEY);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new f(this));
        }
    }
}
