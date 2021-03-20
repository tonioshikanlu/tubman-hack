package b.o;

import android.content.ContentValues;
import b.o.v4.a;
import b.o.v4.d;
import b.o.v4.j.b;
import b.o.v4.j.c;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

public class s1 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f6279h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ r1 f6280i;

    public s1(r1 r1Var, b bVar) {
        this.f6280i = r1Var;
        this.f6279h = bVar;
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        d b2 = this.f6280i.f6266b.b();
        b bVar = this.f6279h;
        a aVar = b2.f6333b;
        b.o.u4.f.b bVar2 = b.o.u4.f.b.NOTIFICATION;
        b.o.u4.f.b bVar3 = b.o.u4.f.b.IAM;
        synchronized (aVar) {
            j1 j1Var = aVar.a;
            ((i1) j1Var).a("OneSignal saveUniqueOutcomeEventParams: " + bVar.toString());
            if (bVar.f6335b != null) {
                String str = bVar.a;
                ArrayList arrayList = new ArrayList();
                c cVar = bVar.f6335b;
                b.o.v4.j.d dVar = cVar.a;
                b.o.v4.j.d dVar2 = cVar.f6336b;
                if (dVar != null) {
                    JSONArray jSONArray = dVar.f6337b;
                    JSONArray jSONArray2 = dVar.a;
                    aVar.a(arrayList, jSONArray, bVar3);
                    aVar.a(arrayList, jSONArray2, bVar2);
                }
                if (dVar2 != null) {
                    JSONArray jSONArray3 = dVar2.f6337b;
                    JSONArray jSONArray4 = dVar2.a;
                    aVar.a(arrayList, jSONArray3, bVar3);
                    aVar.a(arrayList, jSONArray4, bVar2);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b.o.v4.j.a aVar2 = (b.o.v4.j.a) it.next();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("channel_influence_id", aVar2.a);
                    contentValues.put("channel_type", String.valueOf(aVar2.f6334b));
                    contentValues.put("name", str);
                    ((z2) aVar.f6331b).H("cached_unique_outcome", (String) null, contentValues);
                }
            }
        }
    }
}
