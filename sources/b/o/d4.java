package b.o;

import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONObject;

public class d4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c4 f6081h;

    public d4(c4 c4Var) {
        this.f6081h = c4Var;
    }

    public void run() {
        Method method;
        c4 c4Var = this.f6081h;
        c4Var.f6059h = true;
        try {
            if (c4Var.c == null) {
                Class<String> cls = String.class;
                Method[] methods = c4.f6055j.getMethods();
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i2];
                    Class<String>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls && parameterTypes[2] == cls && parameterTypes[3] == cls) {
                        break;
                    }
                    i2++;
                }
                c4Var.c = method;
                this.f6081h.c.setAccessible(true);
            }
            c4 c4Var2 = this.f6081h;
            Bundle bundle = (Bundle) c4Var2.c.invoke(c4Var2.f6056b, new Object[]{3, this.f6081h.f6057e.getPackageName(), "inapp", null});
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                for (int i3 = 0; i3 < stringArrayList2.size(); i3++) {
                    String str = stringArrayList.get(i3);
                    String string = new JSONObject(stringArrayList2.get(i3)).getString("purchaseToken");
                    if (!this.f6081h.f.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str);
                    }
                }
                if (arrayList.size() > 0) {
                    c4.a(this.f6081h, arrayList, arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    this.f6081h.f6058g = false;
                    b3.i("GTPlayerPurchases", "ExistingPurchases", false);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f6081h.f6059h = false;
    }
}
