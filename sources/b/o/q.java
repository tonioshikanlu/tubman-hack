package b.o;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import b.o.i2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class q implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Activity f6232h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ JSONObject f6233i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f6234j;

    public class a implements DialogInterface.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ List f6235h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Intent f6236i;

        public a(List list, Intent intent) {
            this.f6235h = list;
            this.f6236i = intent;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            int i3 = i2 + 3;
            if (this.f6235h.size() > 1) {
                try {
                    JSONObject jSONObject = new JSONObject(q.this.f6233i.toString());
                    jSONObject.put("actionId", this.f6235h.get(i3));
                    this.f6236i.putExtra("onesignalData", jSONObject.toString());
                    k0.c(q.this.f6232h, this.f6236i);
                } catch (Throwable unused) {
                }
            } else {
                k0.c(q.this.f6232h, this.f6236i);
            }
        }
    }

    public class b implements DialogInterface.OnCancelListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Intent f6238h;

        public b(Intent intent) {
            this.f6238h = intent;
        }

        public void onCancel(DialogInterface dialogInterface) {
            k0.c(q.this.f6232h, this.f6238h);
        }
    }

    public q(Activity activity, JSONObject jSONObject, int i2) {
        this.f6232h = activity;
        this.f6233i = jSONObject;
        this.f6234j = i2;
    }

    public void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f6232h);
        builder.setTitle(r.p(this.f6233i));
        builder.setMessage(this.f6233i.optString("alert"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Activity activity = this.f6232h;
        try {
            r.b(this.f6233i, arrayList, arrayList2);
        } catch (Throwable th) {
            i2.a(i2.k.ERROR, "Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (arrayList.size() == 0 || arrayList.size() < 3) {
            arrayList.add(f2.f(activity, "onesignal_in_app_alert_ok_button_text", "Ok"));
            arrayList2.add("__DEFAULT__");
        }
        Intent n2 = r.n(this.f6234j);
        n2.putExtra("action_button", true);
        n2.putExtra("from_alert", true);
        n2.putExtra("onesignalData", this.f6233i.toString());
        if (this.f6233i.has("grp")) {
            n2.putExtra("grp", this.f6233i.optString("grp"));
        }
        a aVar = new a(arrayList2, n2);
        builder.setOnCancelListener(new b(n2));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 == 0) {
                builder.setNeutralButton((CharSequence) arrayList.get(i2), aVar);
            } else if (i2 == 1) {
                builder.setNegativeButton((CharSequence) arrayList.get(i2), aVar);
            } else if (i2 == 2) {
                builder.setPositiveButton((CharSequence) arrayList.get(i2), aVar);
            }
        }
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.show();
    }
}
