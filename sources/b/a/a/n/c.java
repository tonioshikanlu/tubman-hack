package b.a.a.n;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActivityChooserModel;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.h.m;
import b.a.a.i.j;
import b.a.a.m.b;
import b.f.a.e;
import b.p.a.l;
import b.p.a.r;
import com.amplitude.api.DeviceInfo;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Component;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Marker;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Properties;
import com.appfoundry.previewer.model.UploadInfoResponse;
import e.c0.h;
import e.x.c.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import n.b0;
import n.c0;
import n.e0;
import n.g0;
import n.h0;
import n.j0;
import o.g;
import q.a.a;

public final class c {
    public static final boolean a() {
        return !i.a(e.d(), "01DZ4603RKEVSFT7ST3YCM592G");
    }

    public static final boolean b() {
        return i.a(e.d(), "01DZ4603RKEVSFT7ST3YCM592G");
    }

    public static final void c(String str) {
        int i2;
        if (str != null) {
            int i3 = 0;
            if (h.d(str, "modal", false, 2)) {
                BravoApp.b bVar = BravoApp.Q;
                int i4 = BravoApp.M;
                int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", DeviceInfo.OS_NAME);
                if (identifier > 0) {
                    i3 = Resources.getSystem().getDimensionPixelSize(identifier);
                }
                i2 = i4 - i3;
                BravoApp.N = i2;
            }
        }
        BravoApp.b bVar2 = BravoApp.Q;
        i2 = BravoApp.M;
        BravoApp.N = i2;
    }

    public static final float d() {
        Resources system = Resources.getSystem();
        i.d(system, "Resources.getSystem()");
        return system.getDisplayMetrics().density;
    }

    public static final float e(float f) {
        Resources system = Resources.getSystem();
        i.d(system, "Resources.getSystem()");
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        i.d(displayMetrics, "Resources.getSystem().displayMetrics");
        return (((float) displayMetrics.densityDpi) / 160.0f) * f;
    }

    public static final JsonApp f() {
        BravoApp.b bVar = BravoApp.Q;
        JsonApp jsonApp = BravoApp.f6915o;
        if (jsonApp != null) {
            return jsonApp;
        }
        SharedPreferences sharedPreferences = e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        i.e("current_json", "key");
        String string = sharedPreferences.getString("current_json", "");
        if (string == null || !m.h(string)) {
            JsonApp jsonApp2 = BravoApp.f6914n;
            if (jsonApp2 != null) {
                return jsonApp2;
            }
            JsonApp o2 = o(R.raw.previewer_figma);
            BravoApp.f6914n = o2;
            return o2;
        }
        b bVar2 = b.f349m;
        return b.a.b(string);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r2 = (r2 = r0.d).f7062e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Page g() {
        /*
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f6915o
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.appfoundry.previewer.model.App r2 = r0.d
            if (r2 == 0) goto L_0x0012
            com.appfoundry.previewer.model.Data r2 = r2.f7062e
            if (r2 == 0) goto L_0x0012
            java.util.List<com.appfoundry.previewer.model.Page> r2 = r2.f7108b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            if (r2 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x0022
            com.appfoundry.previewer.model.App r0 = r0.d
            if (r0 == 0) goto L_0x0022
            com.appfoundry.previewer.model.Data r0 = r0.f7062e
            if (r0 == 0) goto L_0x0022
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f7108b
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            e.x.c.i.c(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x002a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r0.next()
            com.appfoundry.previewer.model.Page r2 = (com.appfoundry.previewer.model.Page) r2
            boolean r3 = b.a.a.h.e.A(r2)
            if (r3 == 0) goto L_0x002a
            return r2
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.n.c.g():com.appfoundry.previewer.model.Page");
    }

    public static final JsonApp h() {
        BravoApp.b bVar = BravoApp.Q;
        JsonApp jsonApp = BravoApp.f6914n;
        if (jsonApp != null) {
            return jsonApp;
        }
        JsonApp o2 = o(R.raw.previewer_figma);
        BravoApp.f6914n = o2;
        return o2;
    }

    public static j i(Page page, boolean z, int i2) {
        j jVar;
        boolean z2;
        j jVar2;
        j jVar3;
        Page page2;
        if ((i2 & 2) != 0) {
            z = false;
        }
        Page page3 = null;
        String str = page != null ? page.f7132k : null;
        if (str == null) {
            return null;
        }
        try {
            h0 j2 = j(str);
            int i3 = j2.f10103k;
            if (i3 == 200) {
                j0 j0Var = j2.f10106n;
                String z3 = j0Var != null ? j0Var.z() : null;
                if (z3 != null) {
                    JsonApp f = f();
                    if (f != null) {
                        String str2 = page.a;
                        b bVar = b.f349m;
                        page2 = e.j0(f, str2, b.f341b.b(z3), z);
                    } else {
                        page2 = null;
                    }
                    return new j(page2, false, 2);
                }
                Object[] objArr = new Object[1];
                objArr[0] = page != null ? page.a : null;
                a.d.b("Error parsing json: %s", objArr);
                Page s = f.s();
                if (s != null) {
                    b.a.a.h.e.d(s, "Error parsing json");
                    s.x = true;
                } else {
                    s = null;
                }
                jVar2 = new j(s, false, 2);
            } else {
                if (i3 == 401 && s()) {
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = page != null ? page.a : null;
                    a.d.b("Unauthorized Error: %s", objArr2);
                    jVar3 = new j((Page) null, false, 2);
                } else if (j2.f10103k != 500 || !s() || !b.a.a.h.e.y(page)) {
                    Page s2 = f.s();
                    if (s2 != null) {
                        b.a.a.h.e.d(s2, e.D(j2));
                        s2.x = true;
                    } else {
                        s2 = null;
                    }
                    jVar2 = new j(s2, false, 2);
                } else {
                    a.d.b("Error with login: %s", page.a);
                    jVar3 = new j((Page) null, false, 2);
                }
                return jVar3;
            }
            return jVar2;
        } catch (UnknownHostException e2) {
            Object[] objArr3 = new Object[2];
            objArr3[0] = page != null ? page.a : null;
            objArr3[1] = e2.getLocalizedMessage();
            a.d.b("getRemoteJson: possible no connection exception %s : %s", objArr3);
            Page q2 = f.q("error:noConnection");
            if (q2 != null) {
                i.e(q2, "$this$addNoConnectionImage");
                List<Container> list = q2.f;
                if (list != null) {
                    i.c(list);
                    Iterator<Container> it = list.iterator();
                    loop0:
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        List<Component> list2 = it.next().f;
                        if (list2 != null) {
                            i.c(list2);
                            for (Component next : list2) {
                                i.e(next, "$this$hasNoConnectionImageTag");
                                List<String> list3 = next.f7087i;
                                if (list3 != null) {
                                    z2 = e.d0(list3, "dev:noConnectionImage");
                                    continue;
                                } else {
                                    z2 = false;
                                    continue;
                                }
                                if (z2) {
                                    next.f7083b = "component:localImage";
                                    next.f7086h = Integer.valueOf(R.drawable.trex_offline);
                                    break loop0;
                                }
                            }
                            continue;
                        }
                    }
                }
                q2.x = true;
                page3 = q2;
            }
            jVar = new j(page3, false, 2);
            return jVar;
        } catch (Exception e3) {
            Object[] objArr4 = new Object[2];
            objArr4[0] = page != null ? page.a : null;
            objArr4[1] = e3.getLocalizedMessage();
            a.d.b("getRemoteJson: Error getting json for page %s : %s", objArr4);
            Page s3 = f.s();
            if (s3 != null) {
                StringBuilder y = b.e.a.a.a.y("Error getting json: ");
                y.append(e3.getLocalizedMessage());
                b.a.a.h.e.d(s3, y.toString());
                s3.x = true;
                page3 = s3;
            }
            jVar = new j(page3, false, 2);
            return jVar;
        }
    }

    public static final h0 j(String str) {
        c0 c = BravoApp.Q.c();
        e0.a k2 = k();
        k2.g(str);
        return ((n.m0.g.e) c.a(k2.b())).h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final n.e0.a k() {
        /*
            boolean r0 = s()
            java.lang.String r1 = ""
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = b.f.a.e.h()
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = b.f.a.e.h()
            boolean r0 = e.x.c.i.a(r0, r1)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x001d
            r0 = r3
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            java.lang.String r4 = "Bearer "
            java.lang.String r5 = "X-App-Authorization"
            if (r0 == 0) goto L_0x0032
            n.e0$a r0 = new n.e0$a
            r0.<init>()
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r4)
            java.lang.String r2 = b.f.a.e.h()
            goto L_0x006d
        L_0x0032:
            boolean r0 = b.f.a.e.U()
            if (r0 == 0) goto L_0x0046
            n.e0$a r0 = new n.e0$a
            r0.<init>()
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r4)
            java.lang.String r2 = b.f.a.e.e()
            goto L_0x006d
        L_0x0046:
            boolean r0 = s()
            if (r0 != 0) goto L_0x005e
            java.lang.String r0 = b.f.a.e.u()
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = b.f.a.e.u()
            boolean r0 = e.x.c.i.a(r0, r1)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x005e
            r2 = r3
        L_0x005e:
            n.e0$a r0 = new n.e0$a
            r0.<init>()
            if (r2 == 0) goto L_0x0077
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r4)
            java.lang.String r2 = b.f.a.e.u()
        L_0x006d:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.c(r5, r1)
        L_0x0077:
            boolean r1 = b.f.a.e.a0()
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = b.f.a.e.i()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "X-App-Identity"
            r0.c(r2, r1)
        L_0x008a:
            java.lang.String r1 = m()
            java.lang.String r2 = "User-Agent"
            r0.c(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "id="
            r1.append(r2)
            java.lang.String r2 = b.f.a.e.B()
            r1.append(r2)
            java.lang.String r2 = ", lang="
            r1.append(r2)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "Locale.getDefault()"
            e.x.c.i.d(r2, r3)
            java.lang.String r2 = r2.getLanguage()
            r1.append(r2)
            java.lang.String r2 = ", platform=android"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "X-App-Device"
            r0.c(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.n.c.k():n.e0$a");
    }

    public static final UploadInfoResponse l(String str) {
        String m2 = b.e.a.a.a.m("https://dd7h0o2dfb.execute-api.eu-central-1.amazonaws.com/dev/upload?mimetype=", str);
        c0 c = BravoApp.Q.c();
        e0.a aVar = new e0.a();
        aVar.g(m2);
        aVar.e(g0.a.b(g0.a, (b0) null, new byte[0], 0, 0, 12));
        h0 h2 = ((n.m0.g.e) c.a(aVar.b())).h();
        int i2 = h2.f10103k;
        j0 j0Var = h2.f10106n;
        String z = j0Var != null ? j0Var.z() : null;
        if (i2 != 200 || z == null) {
            return null;
        }
        b bVar = b.f349m;
        return b.f342e.b(z);
    }

    public static final String m() {
        return b.e.a.a.a.q(b.e.a.a.a.y("Bravo/1.0 (Android "), Build.VERSION.RELEASE, ")");
    }

    public static final JsonApp n(String str) {
        c0 c0Var;
        String str2 = str;
        try {
            a.b bVar = a.d;
            bVar.a("Getting json from url: %s", str2);
            if (str2 == null || !h.d(str2, "bravostudio", false, 2)) {
                c0.a aVar = new c0.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aVar.a(60, timeUnit);
                aVar.b(60, timeUnit);
                aVar.c(60, timeUnit);
                c0Var = new c0(aVar);
            } else {
                c0Var = BravoApp.Q.c();
            }
            e0.a aVar2 = new e0.a();
            if (str2 == null) {
                str2 = "";
            }
            aVar2.g(str2);
            h0 h2 = ((n.m0.g.e) c0Var.a(aVar2.b())).h();
            j0 j0Var = h2.f10106n;
            String str3 = null;
            String z = j0Var != null ? j0Var.z() : null;
            if (h2.f10103k == 200) {
                return u(z);
            }
            b bVar2 = b.f349m;
            JsonApp b2 = b.a.b(z);
            Object[] objArr = new Object[2];
            objArr[0] = b2 != null ? b2.f7122e : null;
            if (b2 != null) {
                str3 = b2.f;
            }
            objArr[1] = str3;
            bVar.b("ERROR in getJsonFromUrlAndParseIt: %d - %s", objArr);
            return b2;
        } catch (Exception e2) {
            i.e(e2, "e");
            return e2 instanceof UnknownHostException ? new JsonApp("UnknownHostException", (String) null, (String) null, (App) null, 12163, "The Internet connection has been lost", "Disconnected") : new JsonApp("Exception", (String) null, (String) null, (App) null, 12164, "An error occurred, please try again later", "Server Unreachable");
        }
    }

    public static final JsonApp o(int i2) {
        InputStream openRawResource = e.c().getResources().openRawResource(i2);
        i.d(openRawResource, "appContext().resources.openRawResource(rawId)");
        g m2 = e.a.a.a.y0.m.o1.c.m(e.a.a.a.y0.m.o1.c.f0(openRawResource));
        b bVar = b.f349m;
        l<JsonApp> lVar = b.a;
        Objects.requireNonNull(lVar);
        return lVar.a(new r(m2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r1 = (r1 = r3.d).f7062e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.JsonApp p(com.appfoundry.previewer.model.JsonApp r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x000e
            com.appfoundry.previewer.model.App r1 = r3.d
            if (r1 == 0) goto L_0x000e
            com.appfoundry.previewer.model.Data r1 = r1.f7062e
            if (r1 == 0) goto L_0x000e
            java.util.List<com.appfoundry.previewer.model.Page> r1 = r1.a
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            if (r1 == 0) goto L_0x002f
            com.appfoundry.previewer.model.App r1 = r3.d
            com.appfoundry.previewer.model.Data r1 = r1.f7062e
            java.util.List<com.appfoundry.previewer.model.Page> r1 = r1.a
            java.util.List r1 = e.t.g.a0(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r1.next()
            com.appfoundry.previewer.model.Page r2 = (com.appfoundry.previewer.model.Page) r2
            b.a.a.h.e.I(r2)
            goto L_0x001f
        L_0x002f:
            if (r3 == 0) goto L_0x003b
            com.appfoundry.previewer.model.App r1 = r3.d
            if (r1 == 0) goto L_0x003b
            com.appfoundry.previewer.model.Data r1 = r1.f7062e
            if (r1 == 0) goto L_0x003b
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r1.f7108b
        L_0x003b:
            if (r0 == 0) goto L_0x0057
            com.appfoundry.previewer.model.App r0 = r3.d
            com.appfoundry.previewer.model.Data r0 = r0.f7062e
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f7108b
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r0.next()
            com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
            b.a.a.h.e.I(r1)
            goto L_0x0047
        L_0x0057:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.n.c.p(com.appfoundry.previewer.model.JsonApp):com.appfoundry.previewer.model.JsonApp");
    }

    public static final float q(float f, int i2) {
        return (f * ((float) i2)) / 100.0f;
    }

    public static final float r(float f) {
        Resources resources = e.c().getResources();
        i.d(resources, "appContext().resources");
        float f2 = f / resources.getDisplayMetrics().scaledDensity;
        boolean z = true;
        float f3 = 2.5f;
        if (((double) d()) <= 1.0d) {
            f3 = 0.5f;
        } else {
            if (((double) d()) <= 2.0d) {
                f3 = 1.5f;
            } else {
                if (!(((double) d()) <= 3.0d)) {
                    if (((double) d()) > 4.0d) {
                        z = false;
                    }
                    if (z) {
                        f3 = 3.5f;
                    }
                }
            }
        }
        return f2 * f3;
    }

    public static final boolean s() {
        BravoApp.b bVar = BravoApp.Q;
        JsonApp jsonApp = BravoApp.f6915o;
        return i.a(jsonApp != null ? jsonApp.a : null, "01DZ4603RKEVSFT7ST3YCM592G");
    }

    public static final int t() {
        Resources system = Resources.getSystem();
        i.d(system, "Resources.getSystem()");
        return system.getDisplayMetrics().widthPixels;
    }

    public static final JsonApp u(String str) {
        if (str == null) {
            return null;
        }
        try {
            b bVar = b.f349m;
            JsonApp b2 = b.a.b(str);
            p(b2);
            return b2;
        } catch (IOException e2) {
            a.d.b("getJsonFromUrlAndParseIt: Error getting json: %s", e2.getLocalizedMessage());
            return null;
        }
    }

    public static final File v(AppCompatActivity appCompatActivity) {
        i.e(appCompatActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Date date = new Date();
        DateFormat.format("yyyy-MM-dd_hh:mm:ss", date);
        String str = e.C() + date + ".jpg";
        try {
            Window window = appCompatActivity.getWindow();
            i.d(window, "activity.window");
            View decorView = window.getDecorView();
            i.d(decorView, "activity.window.decorView");
            View rootView = decorView.getRootView();
            i.d(rootView, "v1");
            rootView.setDrawingCacheEnabled(true);
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
            rootView.setDrawingCacheEnabled(false);
            File file = new File(str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file;
        } catch (Throwable th) {
            a.d.b("Error taking screenshot %s: %s", str, th.getLocalizedMessage());
            return null;
        }
    }

    public static final b.l.a.c.h.g.c w(Marker marker) {
        i.e(marker, "marker");
        b.l.a.c.h.g.c cVar = new b.l.a.c.h.g.c();
        cVar.f3871h = e.H(marker);
        Properties properties = marker.c;
        if ((properties != null ? properties.c : null) != null) {
            cVar.f3872i = properties.c;
        }
        return cVar;
    }
}
