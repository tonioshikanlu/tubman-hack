package b.o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import b.o.i2;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c4 {

    /* renamed from: i  reason: collision with root package name */
    public static int f6054i = -99;

    /* renamed from: j  reason: collision with root package name */
    public static Class<?> f6055j;
    public ServiceConnection a;

    /* renamed from: b  reason: collision with root package name */
    public Object f6056b;
    public Method c;
    public Method d;

    /* renamed from: e  reason: collision with root package name */
    public Context f6057e;
    public ArrayList<String> f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6058g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6059h;

    public class a implements ServiceConnection {
        public a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Method method;
            try {
                Method[] methods = Class.forName("com.android.vending.billing.IInAppBillingService$Stub").getMethods();
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i2];
                    Class<IBinder>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                        break;
                    }
                    i2++;
                }
                method.setAccessible(true);
                c4.this.f6056b = method.invoke((Object) null, new Object[]{iBinder});
                c4 c4Var = c4.this;
                if (!c4Var.f6059h) {
                    new Thread(new d4(c4Var)).start();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            c4.f6054i = -99;
            c4.this.f6056b = null;
        }
    }

    public c4(Context context) {
        boolean z = false;
        this.f6059h = false;
        this.f6057e = context;
        this.f = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(b3.f("GTPlayerPurchases", "purchaseTokens", "[]"));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                this.f.add(jSONArray.get(i2).toString());
            }
            z = jSONArray.length() == 0 ? true : z;
            this.f6058g = z;
            if (z) {
                this.f6058g = b3.b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        b();
    }

    public static void a(c4 c4Var, ArrayList arrayList, ArrayList arrayList2) {
        Method method;
        c4 c4Var2 = c4Var;
        Objects.requireNonNull(c4Var);
        try {
            if (c4Var2.d == null) {
                Class<String> cls = String.class;
                Method[] methods = f6055j.getMethods();
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i2];
                    Class<Bundle>[] parameterTypes = method.getParameterTypes();
                    Class<?> returnType = method.getReturnType();
                    if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls && parameterTypes[2] == cls && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                        break;
                    }
                    i2++;
                }
                c4Var2.d = method;
                method.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) c4Var2.d.invoke(c4Var2.f6056b, new Object[]{3, c4Var2.f6057e.getPackageName(), "inapp", bundle});
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap hashMap = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sku", string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put("amount", divide.toString());
                    hashMap.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (hashMap.containsKey(str)) {
                        jSONArray.put(hashMap.get(str));
                    }
                }
                if (jSONArray.length() > 0) {
                    i2.B(jSONArray, c4Var2.f6058g, new e4(c4Var, arrayList2));
                }
            }
        } catch (Throwable th) {
            i2.a(i2.k.WARN, "Failed to track IAP purchases", th);
        }
    }

    public void b() {
        if (this.a == null) {
            this.a = new a();
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f6057e.bindService(intent, this.a, 1);
        } else if (this.f6056b != null && !this.f6059h) {
            new Thread(new d4(this)).start();
        }
    }
}
