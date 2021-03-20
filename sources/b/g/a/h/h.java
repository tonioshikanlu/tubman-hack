package b.g.a.h;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class h extends CustomTabsServiceConnection {

    /* renamed from: g  reason: collision with root package name */
    public static final String f427g = h.class.getSimpleName();
    public final WeakReference<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<CustomTabsSession> f428b;
    public final CountDownLatch c;
    public final String d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public i f429e;
    public boolean f;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(@androidx.annotation.NonNull android.content.Context r10) {
        /*
            r9 = this;
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "http://www.example.com"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            r2 = 131072(0x20000, float:1.83671E-40)
            android.content.pm.ResolveInfo r2 = r0.resolveActivity(r1, r2)
            r3 = 0
            if (r2 == 0) goto L_0x001f
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            java.lang.String r2 = r2.packageName
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            r4 = 0
            java.util.List r1 = r0.queryIntentActivities(r1, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x002e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r1.next()
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = "android.support.customtabs.action.CustomTabsService"
            r7.setAction(r8)
            android.content.pm.ActivityInfo r8 = r6.activityInfo
            java.lang.String r8 = r8.packageName
            r7.setPackage(r8)
            android.content.pm.ResolveInfo r7 = r0.resolveService(r7, r4)
            if (r7 == 0) goto L_0x002e
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            java.lang.String r6 = r6.packageName
            r5.add(r6)
            goto L_0x002e
        L_0x0059:
            boolean r0 = r5.contains(r2)
            if (r0 == 0) goto L_0x0061
            r3 = r2
            goto L_0x0093
        L_0x0061:
            java.lang.String r0 = "com.android.chrome"
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L_0x006b
        L_0x0069:
            r3 = r0
            goto L_0x0093
        L_0x006b:
            java.lang.String r0 = "com.google.android.apps.chrome"
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L_0x0074
            goto L_0x0069
        L_0x0074:
            java.lang.String r0 = "com.android.chrome.beta"
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L_0x007d
            goto L_0x0069
        L_0x007d:
            java.lang.String r0 = "com.android.chrome.dev"
            boolean r1 = r5.contains(r0)
            if (r1 == 0) goto L_0x0086
            goto L_0x0069
        L_0x0086:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0093
            java.lang.Object r0 = r5.get(r4)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x0093:
            r9.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r10)
            r9.a = r0
            java.util.concurrent.atomic.AtomicReference r10 = new java.util.concurrent.atomic.AtomicReference
            r10.<init>()
            r9.f428b = r10
            java.util.concurrent.CountDownLatch r10 = new java.util.concurrent.CountDownLatch
            r0 = 1
            r10.<init>(r0)
            r9.c = r10
            r9.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.h.h.<init>(android.content.Context):void");
    }

    public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        Log.d(f427g, "CustomTabs Service connected");
        customTabsClient.warmup(0);
        this.f428b.set(customTabsClient.newSession((CustomTabsCallback) null));
        this.c.countDown();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.d(f427g, "CustomTabs Service disconnected");
        this.f428b.set((Object) null);
    }
}
