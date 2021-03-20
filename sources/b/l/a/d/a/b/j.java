package b.l.a.d.a.b;

import android.os.Bundle;
import b.l.a.d.a.i.n;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class j extends h<List<String>> {
    public final /* synthetic */ m c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(m mVar, n<List<String>> nVar) {
        super(mVar, nVar);
        this.c = mVar;
    }

    public final void J0(List<Bundle> list) {
        this.f4549b.c.b();
        m.f.b(4, "onGetSessionStates", new Object[0]);
        m mVar = this.c;
        ArrayList arrayList = new ArrayList();
        for (Bundle next : list) {
            k0 k0Var = mVar.f4577b;
            ArrayList arrayList2 = new ArrayList();
            r rVar = s.f4620b;
            ArrayList<String> stringArrayList = next.getStringArrayList("pack_names");
            HashMap hashMap = new HashMap();
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                hashMap.put(str, AssetPackState.d(next, str, k0Var, rVar));
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                hashMap.put(str2, AssetPackState.b(str2, 4, 0, 0, 0, ShadowDrawableWrapper.COS_45, 1));
            }
            next.getLong("total_bytes_to_download");
            AssetPackState assetPackState = (AssetPackState) hashMap.values().iterator().next();
            if (assetPackState == null) {
                m.f.b(6, "onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (e1.d(assetPackState.g())) {
                arrayList.add(assetPackState.f());
            }
        }
        this.a.b(arrayList);
    }
}
