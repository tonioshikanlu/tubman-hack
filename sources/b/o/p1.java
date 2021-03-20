package b.o;

import android.database.Cursor;
import androidx.appcompat.widget.ActivityChooserModel;
import b.o.i2;
import b.o.v4.a;
import b.o.v4.j.b;
import b.o.v4.j.c;
import b.o.v4.j.d;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

public class p1 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r1 f6226h;

    public p1(r1 r1Var) {
        this.f6226h = r1Var;
    }

    public void run() {
        ArrayList arrayList;
        boolean z;
        int i2;
        c cVar;
        Thread.currentThread().setPriority(10);
        a aVar = this.f6226h.f6266b.b().f6333b;
        synchronized (aVar) {
            arrayList = new ArrayList();
            Cursor S = ((z2) aVar.f6331b).S("outcome", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (S.moveToFirst()) {
                do {
                    b.o.u4.f.c d = b.o.u4.f.c.d(S.getString(S.getColumnIndex("notification_influence_type")));
                    b.o.u4.f.c d2 = b.o.u4.f.c.d(S.getString(S.getColumnIndex("iam_influence_type")));
                    String string = S.getString(S.getColumnIndex("notification_ids"));
                    if (string == null) {
                        string = "[]";
                    }
                    String string2 = S.getString(S.getColumnIndex("iam_ids"));
                    if (string2 == null) {
                        string2 = "[]";
                    }
                    String string3 = S.getString(S.getColumnIndex("name"));
                    float f = S.getFloat(S.getColumnIndex(ActivityChooserModel.ATTRIBUTE_WEIGHT));
                    long j2 = S.getLong(S.getColumnIndex(BasePayload.TIMESTAMP_KEY));
                    try {
                        d dVar = new d();
                        d dVar2 = new d();
                        int ordinal = d.ordinal();
                        if (ordinal == 0) {
                            dVar.a = new JSONArray(string);
                            cVar = new c(dVar, (d) null);
                        } else if (ordinal != 1) {
                            cVar = null;
                        } else {
                            dVar2.a = new JSONArray(string);
                            cVar = new c((d) null, dVar2);
                        }
                        int ordinal2 = d2.ordinal();
                        if (ordinal2 == 0) {
                            dVar.f6337b = new JSONArray(string2);
                            if (cVar == null) {
                                cVar = new c(dVar, (d) null);
                            } else {
                                cVar.a = dVar;
                            }
                        } else if (ordinal2 == 1) {
                            dVar2.f6337b = new JSONArray(string2);
                            if (cVar == null) {
                                cVar = new c((d) null, dVar2);
                            } else {
                                cVar.f6336b = dVar2;
                            }
                        }
                        arrayList.add(new b(string3, cVar, f, j2));
                    } catch (JSONException e2) {
                        Objects.requireNonNull((i1) aVar.a);
                        i2.a(i2.k.ERROR, "Generating JSONArray from notifications ids outcome:JSON Failed.", e2);
                    }
                } while (S.moveToNext());
            }
            S.close();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            r1 r1Var = this.f6226h;
            Objects.requireNonNull(r1Var);
            boolean z2 = false;
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                i2 = 2;
            } else {
                if (!f2.n()) {
                    if (f2.j()) {
                        if (f2.i() && f2.l()) {
                            z2 = f2.o();
                        }
                    }
                    if (z2 || (!f2.n() && f2.s("com.huawei.hwid"))) {
                        i2 = 13;
                    }
                }
                i2 = 1;
            }
            r1Var.f6266b.b().a(i2.a, i2, bVar, new q1(r1Var, bVar));
        }
    }
}
