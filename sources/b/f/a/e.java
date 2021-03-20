package b.f.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.h.d;
import b.a.a.h.m;
import b.a.a.n.b;
import b.a.a.n.f;
import b.e.a.a.a;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.activities.BravoActivity;
import com.appfoundry.previewer.activities.InitActivity;
import com.appfoundry.previewer.activities.LongPressActivity;
import com.appfoundry.previewer.activities.ModalActivity;
import com.appfoundry.previewer.model.Actions;
import com.appfoundry.previewer.model.App;
import com.appfoundry.previewer.model.Asset;
import com.appfoundry.previewer.model.BoundJson;
import com.appfoundry.previewer.model.BoundNode;
import com.appfoundry.previewer.model.Container;
import com.appfoundry.previewer.model.Coordinate;
import com.appfoundry.previewer.model.Data;
import com.appfoundry.previewer.model.Dimensions;
import com.appfoundry.previewer.model.ExchangeResponse;
import com.appfoundry.previewer.model.GradientColorStop;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Marker;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Params;
import com.appfoundry.previewer.model.Properties;
import com.appfoundry.previewer.model.Size;
import com.appfoundry.previewer.model.Style;
import com.appfoundry.previewer.model.Tap;
import com.appfoundry.previewer.model.UploadFile;
import com.segment.analytics.integrations.BasePayload;
import e.c0.h;
import e.j;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import n.b0;
import n.c0;
import n.e0;
import n.g0;
import n.h0;
import n.j0;
import p.a.a.c;

public final class e {
    public static final int A(Style style, boolean z) {
        i.e(style, "$this$getContainerHeight");
        if (style.w == null || z) {
            return x0(style);
        }
        Float f = style.w;
        i.c(f);
        return (int) (((float) y0(style)) / f.floatValue());
    }

    public static final void A0(AppCompatActivity appCompatActivity) {
        i.e(appCompatActivity, "$this$setTransparentStatusBar");
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = appCompatActivity.getWindow();
            i.d(window, "window");
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        Window window2 = appCompatActivity.getWindow();
        i.d(window2, "window");
        View decorView = window2.getDecorView();
        i.d(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        Window window3 = appCompatActivity.getWindow();
        i.d(window3, "window");
        window3.setStatusBarColor(0);
    }

    @SuppressLint({"HardwareIds"})
    public static final String B() {
        String string = Settings.Secure.getString(c().getContentResolver(), "android_id");
        return string != null ? string : "Unknown";
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View B0(android.widget.ImageView r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.appfoundry.previewer.model.Style r21, int r22, int r23, com.appfoundry.previewer.model.Asset r24, int r25) {
        /*
            r8 = r17
            r9 = r21
            r10 = r24
            java.lang.String r0 = "$this$setup"
            e.x.c.i.e(r8, r0)
            r4 = 0
            r5 = 0
            r7 = 24
            r0 = r17
            r1 = r21
            r2 = r22
            r3 = r23
            r6 = r25
            b.a.a.i.b r0 = b.a.a.h.o.h(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = "fit"
            if (r9 == 0) goto L_0x0026
            java.lang.String r2 = r9.f7180q
            if (r2 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = r1
        L_0x0027:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r1 = e.x.c.i.a(r2, r1)
            if (r1 == 0) goto L_0x0038
            b.h.a.m.x.c.q r1 = new b.h.a.m.x.c.q
            r1.<init>()
            goto L_0x003d
        L_0x0038:
            b.h.a.m.x.c.i r1 = new b.h.a.m.x.c.i
            r1.<init>()
        L_0x003d:
            r3.add(r1)
            r1 = 1
            if (r9 == 0) goto L_0x0052
            boolean r2 = Z(r21)
            if (r2 != r1) goto L_0x0052
            int r2 = r0.a
            b.a.a.b.f r2 = q(r9, r2)
            r3.add(r2)
        L_0x0052:
            b.h.a.q.e r2 = new b.h.a.q.e
            r2.<init>()
            b.h.a.m.n r4 = new b.h.a.m.n
            r4.<init>(r3)
            b.h.a.q.a r2 = r2.v(r4, r1)
            java.lang.String r3 = "RequestOptions().transfo…Bitmap>(transformations))"
            e.x.c.i.d(r2, r3)
            b.h.a.q.e r2 = (b.h.a.q.e) r2
            r4 = 0
            if (r10 == 0) goto L_0x01a4
            java.lang.String r5 = r10.f7065b
            if (r5 == 0) goto L_0x01a4
            java.lang.String r6 = "$this$needsToAdjustSize"
            e.x.c.i.e(r5, r6)
            r6 = 2
            java.lang.String r7 = "https://images-dev"
            boolean r7 = e.c0.h.C(r5, r7, r4, r6)
            if (r7 == 0) goto L_0x0086
            java.lang.String r7 = "g:sm"
            boolean r5 = e.c0.h.d(r5, r7, r4, r6)
            if (r5 == 0) goto L_0x0086
            r5 = r1
            goto L_0x0087
        L_0x0086:
            r5 = r4
        L_0x0087:
            if (r5 != r1) goto L_0x01a4
            r5 = 4
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r22)
            r7[r4] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r23)
            r7[r1] = r11
            int r11 = r0.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r6] = r11
            int r11 = r0.f308b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 3
            r7[r12] = r11
            q.a.a$b r11 = q.a.a.d
            java.lang.String r13 = "parentWidth=%s, parentHeight=%s, viewWidth=%s, viewHeight=%s"
            r11.a(r13, r7)
            java.lang.String r7 = r10.f7065b
            if (r7 == 0) goto L_0x017d
            int r13 = r0.a
            int r0 = r0.f308b
            java.lang.String r14 = "$this$imgProxyUrl"
            e.x.c.i.e(r7, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "s:"
            r14.append(r15)
            r14.append(r13)
            r13 = 58
            r14.append(r13)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "$this$host"
            e.x.c.i.e(r7, r14)
            java.lang.String r14 = "/"
            int r12 = b.a.a.h.m.k(r7, r14, r12, r4, r5)
            java.lang.String r12 = r7.substring(r4, r12)
            java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            e.x.c.i.d(r12, r15)
            r13.append(r12)
            r13.append(r14)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r0)
            r12.append(r14)
            java.lang.String r15 = b.a.a.h.m.b(r7)
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            java.lang.String r15 = "path"
            e.x.c.i.e(r12, r15)
            java.lang.String r15 = "3683dcd25867e4caead59fc552dfb3c7"
            byte[] r15 = s(r15)
            java.lang.String r16 = "5577e0cb9c28b0061234e2859e9d6ca2"
            byte[] r3 = s(r16)
            java.lang.String r1 = "HmacSHA256"
            javax.crypto.Mac r4 = javax.crypto.Mac.getInstance(r1)
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec
            r5.<init>(r15, r1)
            r4.init(r5)
            r4.update(r3)
            java.nio.charset.Charset r1 = e.c0.a.a
            byte[] r3 = r12.getBytes(r1)
            java.lang.String r5 = "(this as java.lang.String).getBytes(charset)"
            e.x.c.i.d(r3, r5)
            byte[] r3 = r4.doFinal(r3)
            byte[] r3 = android.util.Base64.encode(r3, r6)
            java.lang.String r4 = "Base64.encode(sha256Hmac…Array()), Base64.NO_WRAP)"
            e.x.c.i.d(r3, r4)
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3, r1)
            java.lang.String r1 = "="
            java.lang.String r3 = ""
            r5 = 4
            r6 = 0
            java.lang.String r1 = e.c0.h.w(r4, r1, r3, r6, r5)
            java.lang.String r3 = "+"
            java.lang.String r4 = "-"
            java.lang.String r1 = e.c0.h.w(r1, r3, r4, r6, r5)
            java.lang.String r3 = "_"
            java.lang.String r1 = e.c0.h.w(r1, r14, r3, r6, r5)
            r13.append(r1)
            r13.append(r14)
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = b.a.a.h.m.b(r7)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            goto L_0x017e
        L_0x017d:
            r0 = 0
        L_0x017e:
            r10.f7065b = r0
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r1 = 0
            r3[r1] = r0
            java.lang.String r0 = "imgproxy url=%s"
            r11.a(r0, r3)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            java.lang.String r0 = r10.a
            java.lang.String r3 = "assetId"
            e.x.c.i.e(r0, r3)
            java.lang.String r3 = "asset"
            e.x.c.i.e(r10, r3)
            java.util.Map<java.lang.String, com.appfoundry.previewer.model.Asset> r3 = com.appfoundry.previewer.BravoApp.r
            if (r3 == 0) goto L_0x01a5
            java.lang.Object r0 = r3.put(r0, r10)
            com.appfoundry.previewer.model.Asset r0 = (com.appfoundry.previewer.model.Asset) r0
            goto L_0x01a5
        L_0x01a4:
            r1 = r4
        L_0x01a5:
            if (r10 == 0) goto L_0x01aa
            java.lang.String r0 = r10.f7066e
            goto L_0x01ab
        L_0x01aa:
            r0 = 0
        L_0x01ab:
            java.lang.String r3 = "image"
            boolean r0 = e.x.c.i.a(r0, r3)
            if (r0 == 0) goto L_0x01ce
            android.content.Context r0 = c()
            b.h.a.i r0 = b.h.a.c.d(r0)
            java.lang.String r3 = r10.f7065b
            b.h.a.h r0 = r0.o(r3)
            b.h.a.h r0 = r0.a(r2)
            b.h.a.m.x.e.c r2 = b.h.a.m.x.e.c.b()
            b.h.a.h r0 = r0.J(r2)
            goto L_0x01eb
        L_0x01ce:
            android.content.Context r0 = c()
            b.h.a.i r0 = b.h.a.c.d(r0)
            b.a.a.b.j r0 = (b.a.a.b.j) r0
            if (r10 == 0) goto L_0x01dd
            java.lang.String r3 = r10.f7065b
            goto L_0x01de
        L_0x01dd:
            r3 = 0
        L_0x01de:
            b.h.a.h r0 = r0.m()
            r0.G(r3)
            b.a.a.b.i r0 = (b.a.a.b.i) r0
            b.a.a.b.i r0 = r0.K(r2)
        L_0x01eb:
            r0.E(r8)
            r0 = 1
            r8.setClipToOutline(r0)
            if (r9 == 0) goto L_0x020b
            boolean r2 = X(r21)
            if (r2 != r0) goto L_0x020b
            java.lang.Integer r0 = r9.O
            if (r0 == 0) goto L_0x0203
            int r4 = r0.intValue()
            goto L_0x0204
        L_0x0203:
            r4 = r1
        L_0x0204:
            android.graphics.drawable.Drawable r0 = p(r9, r4)
            r8.setForeground(r0)
        L_0x020b:
            if (r9 == 0) goto L_0x0210
            java.lang.String r3 = r9.a
            goto L_0x0211
        L_0x0210:
            r3 = 0
        L_0x0211:
            java.lang.String r0 = "RYAKP746R2Y8QZP4NA7VRPFBQWSZKJ6M"
            boolean r0 = e.x.c.i.a(r3, r0)
            if (r0 == 0) goto L_0x021e
            r0 = 8
            r8.setVisibility(r0)
        L_0x021e:
            java.lang.String r0 = "component:input-image"
            r1 = r20
            boolean r0 = e.x.c.i.a(r1, r0)
            if (r0 == 0) goto L_0x023f
            b.a.a.h.j r10 = new b.a.a.h.j
            r0 = r10
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.setOnClickListener(r10)
        L_0x023f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.B0(android.widget.ImageView, java.lang.String, java.lang.String, java.lang.String, com.appfoundry.previewer.model.Style, int, int, com.appfoundry.previewer.model.Asset, int):android.view.View");
    }

    public static final String C() {
        StringBuilder sb = new StringBuilder();
        File filesDir = BravoApp.Q.b().getFilesDir();
        i.d(filesDir, "BravoApp.context().filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append("/");
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: b.a.a.l.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: b.a.a.l.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: b.a.a.l.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: b.a.a.b.l.d.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: b.a.a.l.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: b.a.a.b.l.d.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: b.a.a.l.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: com.google.android.flexbox.FlexboxLayoutManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: androidx.recyclerview.widget.LinearLayoutManager} */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r0v18, types: [b.a.a.b.l.d.d] */
    /* JADX WARNING: type inference failed for: r0v19, types: [b.a.a.b.l.d.f] */
    /* JADX WARNING: type inference failed for: r0v20, types: [b.a.a.b.l.d.e] */
    /* JADX WARNING: type inference failed for: r0v21, types: [b.a.a.b.l.d.d] */
    /* JADX WARNING: type inference failed for: r0v22, types: [b.a.a.b.l.d.f] */
    /* JADX WARNING: type inference failed for: r0v23, types: [b.a.a.b.l.d.e] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void C0(androidx.recyclerview.widget.RecyclerView r18, java.lang.String r19, java.util.List r20, com.appfoundry.previewer.model.Animation r21, java.lang.Boolean r22, boolean r23, boolean r24, java.lang.Float r25, int r26) {
        /*
            r9 = r18
            r0 = r26 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r1
            goto L_0x000b
        L_0x0009:
            r0 = r21
        L_0x000b:
            r2 = r26 & 8
            if (r2 == 0) goto L_0x0013
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r13 = r2
            goto L_0x0015
        L_0x0013:
            r13 = r22
        L_0x0015:
            r2 = r26 & 16
            r3 = 0
            if (r2 == 0) goto L_0x001c
            r2 = r3
            goto L_0x001e
        L_0x001c:
            r2 = r23
        L_0x001e:
            r4 = r26 & 32
            if (r4 == 0) goto L_0x0025
            r17 = r3
            goto L_0x0027
        L_0x0025:
            r17 = r24
        L_0x0027:
            r4 = r26 & 64
            if (r4 == 0) goto L_0x0033
            r4 = 1120403456(0x42c80000, float:100.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r15 = r4
            goto L_0x0035
        L_0x0033:
            r15 = r25
        L_0x0035:
            java.lang.String r4 = "$this$setupWithFlexbox"
            e.x.c.i.e(r9, r4)
            android.content.Context r4 = r18.getContext()
            java.lang.String r8 = "context"
            e.x.c.i.d(r4, r8)
            if (r2 == 0) goto L_0x004b
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r4, r3, r3)
            goto L_0x005b
        L_0x004b:
            com.google.android.flexbox.FlexboxLayoutManager r2 = new com.google.android.flexbox.FlexboxLayoutManager
            r2.<init>(r4)
            r4 = 1
            r2.w(r4)
            r2.v(r3)
            r3 = 4
            r2.u(r3)
        L_0x005b:
            r9.setLayoutManager(r2)
            b.a.a.l.a r2 = new b.a.a.l.a
            r14 = 0
            r16 = 8
            r10 = r2
            r11 = r19
            r12 = r20
            r10.<init>(r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x0071
            java.lang.String r1 = r0.getType()
        L_0x0071:
            if (r1 != 0) goto L_0x0076
        L_0x0073:
            r12 = r8
            goto L_0x0180
        L_0x0076:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1289167206: goto L_0x0162;
                case -1282132831: goto L_0x0142;
                case -1272587772: goto L_0x0124;
                case -795763400: goto L_0x0106;
                case -566947566: goto L_0x00e7;
                case -501084388: goto L_0x00c8;
                case 3536962: goto L_0x009e;
                case 1106799371: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0073
        L_0x007e:
            java.lang.String r3 = "slideright"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            b.a.a.b.l.d.e r10 = new b.a.a.b.l.d.e
            r3 = 0
            r4 = 0
            r6 = 0
            java.lang.String r7 = r0.getStrength()
            r11 = 44
            java.lang.String r5 = "right"
            r0 = r10
            r1 = r2
            r2 = r18
            r12 = r8
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x009e:
            r12 = r8
            java.lang.String r3 = "spin"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.g r1 = new b.a.a.b.l.d.g
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r0 = r0.getStrength()
            r6 = 28
            r19 = r1
            r20 = r2
            r21 = r18
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r2 = r1
            goto L_0x0180
        L_0x00c8:
            r12 = r8
            java.lang.String r3 = "slidebottom"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.f r10 = new b.a.a.b.l.d.f
            r3 = 0
            r4 = 0
            r6 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 44
            java.lang.String r5 = "bottom"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x00e7:
            r12 = r8
            java.lang.String r3 = "contract"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.d r10 = new b.a.a.b.l.d.d
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 28
            java.lang.String r6 = "contract"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x0106:
            r12 = r8
            java.lang.String r3 = "slideleft"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.e r10 = new b.a.a.b.l.d.e
            r3 = 0
            r4 = 0
            r6 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 44
            java.lang.String r5 = "left"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x0124:
            r12 = r8
            java.lang.String r3 = "slidetop"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.f r10 = new b.a.a.b.l.d.f
            r3 = 0
            r4 = 0
            r6 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 44
            java.lang.String r5 = "top"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x017f
        L_0x0142:
            r12 = r8
            java.lang.String r0 = "fadein"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0180
            b.a.a.b.l.d.a r0 = new b.a.a.b.l.d.a
            r1 = 0
            r3 = 0
            r4 = 12
            r19 = r0
            r20 = r2
            r21 = r18
            r22 = r1
            r23 = r3
            r24 = r4
            r19.<init>(r20, r21, r22, r23, r24)
            r2 = r0
            goto L_0x0180
        L_0x0162:
            r12 = r8
            java.lang.String r3 = "expand"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0180
            b.a.a.b.l.d.d r10 = new b.a.a.b.l.d.d
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r7 = r0.getStrength()
            r8 = 28
            java.lang.String r6 = "expand"
            r0 = r10
            r1 = r2
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x017f:
            r2 = r10
        L_0x0180:
            r9.setAdapter(r2)
            r0 = 20
            r9.setItemViewCacheSize(r0)
            java.lang.String r0 = K()
            java.lang.String r1 = "menu:tabs"
            boolean r0 = e.x.c.i.a(r0, r1)
            if (r0 == 0) goto L_0x01a9
            if (r17 != 0) goto L_0x01a9
            b.a.a.h.n r0 = new b.a.a.h.n
            android.content.Context r1 = r18.getContext()
            e.x.c.i.d(r1, r12)
            int r1 = O(r1)
            r0.<init>(r1)
            r9.addItemDecoration(r0)
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.C0(androidx.recyclerview.widget.RecyclerView, java.lang.String, java.util.List, com.appfoundry.previewer.model.Animation, java.lang.Boolean, boolean, boolean, java.lang.Float, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String D(n.h0 r6) {
        /*
            java.lang.String r0 = "$this$getErrorMessage"
            e.x.c.i.e(r6, r0)
            java.lang.String r0 = r6.f10102j
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0011
            r0 = r1
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            java.lang.String r3 = "Unknown error. Please contact support@bravostudio.app"
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x001c
            java.lang.String r6 = r6.f10102j
            goto L_0x00cb
        L_0x001c:
            n.j0 r6 = r6.f10106n
            r0 = 0
            if (r6 == 0) goto L_0x0026
            java.lang.String r6 = r6.z()
            goto L_0x0027
        L_0x0026:
            r6 = r0
        L_0x0027:
            if (r6 == 0) goto L_0x00ca
            java.lang.String r5 = "$this$getErrorMessageFromResponse"
            e.x.c.i.e(r6, r5)
            b.a.a.m.b r5 = b.a.a.m.b.f349m     // Catch:{ n -> 0x0043 }
            b.p.a.l<com.appfoundry.previewer.model.ResponseBody> r5 = b.a.a.m.b.f345i     // Catch:{ n -> 0x0043 }
            java.lang.Object r5 = r5.b(r6)     // Catch:{ n -> 0x0043 }
            com.appfoundry.previewer.model.ResponseBody r5 = (com.appfoundry.previewer.model.ResponseBody) r5     // Catch:{ n -> 0x0043 }
            if (r5 == 0) goto L_0x00c9
            java.lang.String r6 = q0(r5)     // Catch:{ n -> 0x0043 }
            if (r6 == 0) goto L_0x00c9
            r3 = r6
            goto L_0x00c9
        L_0x0043:
            b.a.a.m.b r5 = b.a.a.m.b.f349m
            b.p.a.l<com.appfoundry.previewer.model.ResponseBodyWithErrorObject> r5 = b.a.a.m.b.f346j
            java.lang.Object r6 = r5.b(r6)
            com.appfoundry.previewer.model.ResponseBodyWithErrorObject r6 = (com.appfoundry.previewer.model.ResponseBodyWithErrorObject) r6
            if (r6 == 0) goto L_0x00c9
            java.lang.String r5 = "$this$printError"
            e.x.c.i.e(r6, r5)
            java.lang.String r5 = r6.f7156b
            if (r5 == 0) goto L_0x0082
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0060
            r5 = r1
            goto L_0x0061
        L_0x0060:
            r5 = r2
        L_0x0061:
            if (r5 == 0) goto L_0x0082
            java.lang.String r0 = r6.f7156b
            java.lang.String r5 = r6.c
            if (r5 == 0) goto L_0x00bf
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r1 = r2
        L_0x0071:
            if (r1 == 0) goto L_0x00bf
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = b.e.a.a.a.B(r0, r1)
            java.lang.String r6 = r6.c
            r1 = 41
            java.lang.String r0 = b.e.a.a.a.p(r0, r6, r1)
            goto L_0x00bf
        L_0x0082:
            java.lang.String r5 = r6.c
            if (r5 == 0) goto L_0x0093
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r1 = r2
        L_0x008e:
            if (r1 == 0) goto L_0x0093
            java.lang.String r0 = r6.c
            goto L_0x00bf
        L_0x0093:
            java.lang.Integer r1 = r6.a
            java.lang.String r2 = "Error "
            if (r1 == 0) goto L_0x00a3
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r2)
            java.lang.Integer r6 = r6.a
            r0.append(r6)
            goto L_0x00b9
        L_0x00a3:
            com.appfoundry.previewer.model.ErrorData r1 = r6.d
            if (r1 == 0) goto L_0x00a9
            java.lang.Integer r0 = r1.a
        L_0x00a9:
            if (r0 == 0) goto L_0x00be
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r2)
            com.appfoundry.previewer.model.ErrorData r6 = r6.d
            r0.append(r6)
            java.lang.String r6 = "?.statusCode"
            r0.append(r6)
        L_0x00b9:
            java.lang.String r0 = r0.toString()
            goto L_0x00bf
        L_0x00be:
            r0 = r4
        L_0x00bf:
            boolean r6 = e.x.c.i.a(r0, r4)
            if (r6 == 0) goto L_0x00c6
            r0 = r3
        L_0x00c6:
            if (r0 == 0) goto L_0x00c9
            r3 = r0
        L_0x00c9:
            return r3
        L_0x00ca:
            r6 = r4
        L_0x00cb:
            boolean r0 = e.x.c.i.a(r6, r4)
            if (r0 == 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r3 = r6
        L_0x00d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.D(n.h0):java.lang.String");
    }

    public static final void D0(AppCompatActivity appCompatActivity, String str) {
        i.e(appCompatActivity, BasePayload.CONTEXT_KEY);
        i.e(str, "message");
        AlertDialog.Builder builder = new AlertDialog.Builder(appCompatActivity);
        builder.setMessage((CharSequence) str);
        builder.setPositiveButton((CharSequence) "Ok", (DialogInterface.OnClickListener) b.f351h);
        builder.create().show();
    }

    public static final ExchangeResponse E() {
        StringBuilder y = a.y("app_");
        y.append(f.g());
        String sb = y.toString();
        String valueOf = String.valueOf(System.currentTimeMillis() / ((long) 60000));
        i.e(sb, "key");
        i.e(valueOf, "data");
        byte[] bytes = sb.getBytes(e.c0.a.a);
        i.d(bytes, "(this as java.lang.String).getBytes(charset)");
        i.e(bytes, "key");
        i.e(valueOf, "data");
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bytes, "HmacSHA256"));
            Charset forName = Charset.forName("UTF8");
            i.d(forName, "Charset.forName(charsetName)");
            byte[] bytes2 = valueOf.getBytes(forName);
            i.d(bytes2, "(this as java.lang.String).getBytes(charset)");
            byte[] doFinal = instance.doFinal(bytes2);
            i.d(doFinal, "Mac.getInstance(algorith…y(charset(\"UTF8\")))\n    }");
            i.e(doFinal, "$this$toHexString");
            b.a.a.n.a aVar = b.a.a.n.a.f350h;
            i.e(doFinal, "$this$joinToString");
            String str = "";
            i.e(str, "separator");
            i.e(str, "prefix");
            i.e(str, "postfix");
            i.e("...", "truncated");
            StringBuilder sb2 = new StringBuilder();
            i.e(doFinal, "$this$joinTo");
            i.e(sb2, "buffer");
            i.e(str, "separator");
            i.e(str, "prefix");
            i.e(str, "postfix");
            i.e("...", "truncated");
            sb2.append(str);
            int i2 = 0;
            for (byte b2 : doFinal) {
                i2++;
                if (i2 > 1) {
                    sb2.append(str);
                }
                sb2.append(aVar != null ? (CharSequence) aVar.invoke(Byte.valueOf(b2)) : String.valueOf(b2));
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            i.d(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
            StringBuilder sb4 = new StringBuilder();
            BravoApp.b bVar = BravoApp.Q;
            String str2 = BravoApp.y;
            String str3 = null;
            sb4.append(str2 != null ? m.d(str2) : null);
            sb4.append(f.g());
            sb4.append("/");
            sb4.append("authconfig?token=");
            sb4.append(sb3);
            String sb5 = sb4.toString();
            c0 c = bVar.c();
            e0.a aVar2 = new e0.a();
            aVar2.g(sb5);
            h0 h2 = ((n.m0.g.e) c.a(aVar2.b())).h();
            int i3 = h2.f10103k;
            if (i3 == 200) {
                q.a.a.d.a("getExchangeResponse SUCCESS", new Object[0]);
                j0 j0Var = h2.f10106n;
                if (j0Var != null) {
                    str3 = j0Var.z();
                }
                if (str3 != null) {
                    str = str3;
                }
                return new ExchangeResponse(i3, str);
            }
            String str4 = String.valueOf(h2.f10103k) + ": " + D(h2);
            q.a.a.d.b("getExchangeResponse FAILED: %s", str4);
            return new ExchangeResponse(i3, str4);
        } catch (Exception e2) {
            throw new RuntimeException("Could not run HMAC SHA256", e2);
        }
    }

    public static final void E0(AppCompatActivity appCompatActivity) {
        i.e(appCompatActivity, BasePayload.CONTEXT_KEY);
        boolean N0 = N0();
        String str = N0 ? "Notifications are already enabled" : "Enable Push Notifications? Data will be shared with OneSignal";
        AlertDialog.Builder builder = new AlertDialog.Builder(appCompatActivity);
        builder.setMessage((CharSequence) str);
        if (N0) {
            builder.setPositiveButton((CharSequence) "Ok", (DialogInterface.OnClickListener) d.f7445i);
        } else {
            builder.setPositiveButton((CharSequence) "Yes", (DialogInterface.OnClickListener) d.f7446j);
            builder.setNegativeButton((CharSequence) "No", (DialogInterface.OnClickListener) d.f7447k);
        }
        AlertDialog create = builder.create();
        i.d(create, "builder.create()");
        create.show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r1 = (r1 = r1.get(1)).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Coordinate F(com.appfoundry.previewer.model.Style r4, int r5, int r6) {
        /*
            java.lang.String r0 = "$this$getGradientEnd"
            e.x.c.i.e(r4, r0)
            com.appfoundry.previewer.model.Coordinate r0 = new com.appfoundry.previewer.model.Coordinate
            java.util.List<com.appfoundry.previewer.model.Coordinate> r1 = r4.t
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r1.get(r2)
            com.appfoundry.previewer.model.Coordinate r1 = (com.appfoundry.previewer.model.Coordinate) r1
            if (r1 == 0) goto L_0x0020
            java.lang.Float r1 = r1.a
            if (r1 == 0) goto L_0x0020
            float r1 = r1.floatValue()
            float r5 = (float) r5
            float r1 = r1 * r5
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            java.util.List<com.appfoundry.previewer.model.Coordinate> r4 = r4.t
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r4.get(r2)
            com.appfoundry.previewer.model.Coordinate r4 = (com.appfoundry.previewer.model.Coordinate) r4
            if (r4 == 0) goto L_0x003c
            java.lang.Float r4 = r4.f7107b
            if (r4 == 0) goto L_0x003c
            float r4 = r4.floatValue()
            float r6 = (float) r6
            float r3 = r4 * r6
        L_0x003c:
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            r0.<init>(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.F(com.appfoundry.previewer.model.Style, int, int):com.appfoundry.previewer.model.Coordinate");
    }

    public static final boolean F0() {
        return i.a(K(), "menu:slide") || i.a(K(), "menu:side");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r1 = (r1 = r1.get(0)).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Coordinate G(com.appfoundry.previewer.model.Style r4, int r5, int r6) {
        /*
            java.lang.String r0 = "$this$getGradientStart"
            e.x.c.i.e(r4, r0)
            com.appfoundry.previewer.model.Coordinate r0 = new com.appfoundry.previewer.model.Coordinate
            java.util.List<com.appfoundry.previewer.model.Coordinate> r1 = r4.t
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r1.get(r2)
            com.appfoundry.previewer.model.Coordinate r1 = (com.appfoundry.previewer.model.Coordinate) r1
            if (r1 == 0) goto L_0x0020
            java.lang.Float r1 = r1.a
            if (r1 == 0) goto L_0x0020
            float r1 = r1.floatValue()
            float r5 = (float) r5
            float r1 = r1 * r5
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            java.util.List<com.appfoundry.previewer.model.Coordinate> r4 = r4.t
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r4.get(r2)
            com.appfoundry.previewer.model.Coordinate r4 = (com.appfoundry.previewer.model.Coordinate) r4
            if (r4 == 0) goto L_0x003c
            java.lang.Float r4 = r4.f7107b
            if (r4 == 0) goto L_0x003c
            float r4 = r4.floatValue()
            float r6 = (float) r6
            float r3 = r4 * r6
        L_0x003c:
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            r0.<init>(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.G(com.appfoundry.previewer.model.Style, int, int):com.appfoundry.previewer.model.Coordinate");
    }

    public static final void G0(BravoActivity bravoActivity, String str, boolean z) {
        i.e(bravoActivity, "$this$startActivityScan");
        if (str != null) {
            Intent intent = new Intent(bravoActivity, InitActivity.class);
            intent.putExtra("scan_new_app", true);
            intent.putExtra("new_app_url", str);
            intent.putExtra("from_scanning", z);
            bravoActivity.startActivity(intent);
            bravoActivity.finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = (r1 = r1.f7118b).get(1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.gms.maps.model.LatLng H(com.appfoundry.previewer.model.Marker r5) {
        /*
            java.lang.String r0 = "$this$getLatLong"
            e.x.c.i.e(r5, r0)
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            com.appfoundry.previewer.model.Geometry r1 = r5.f7125b
            r2 = 0
            if (r1 == 0) goto L_0x001f
            java.util.List<java.lang.Float> r1 = r1.f7118b
            if (r1 == 0) goto L_0x001f
            r3 = 1
            java.lang.Object r1 = r1.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x001f
            float r1 = r1.floatValue()
            double r3 = (double) r1
            goto L_0x0020
        L_0x001f:
            double r3 = (double) r2
        L_0x0020:
            com.appfoundry.previewer.model.Geometry r5 = r5.f7125b
            if (r5 == 0) goto L_0x0036
            java.util.List<java.lang.Float> r5 = r5.f7118b
            if (r5 == 0) goto L_0x0036
            java.lang.Object r5 = r5.get(r2)
            java.lang.Float r5 = (java.lang.Float) r5
            if (r5 == 0) goto L_0x0036
            float r5 = r5.floatValue()
            double r1 = (double) r5
            goto L_0x0037
        L_0x0036:
            double r1 = (double) r2
        L_0x0037:
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.H(com.appfoundry.previewer.model.Marker):com.google.android.gms.maps.model.LatLng");
    }

    public static /* synthetic */ void H0(BravoActivity bravoActivity, String str, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        G0(bravoActivity, str, z);
    }

    public static final String I(Marker marker) {
        i.e(marker, "$this$getMarkerId");
        StringBuilder sb = new StringBuilder();
        sb.append(H(marker).toString());
        sb.append(":");
        Properties properties = marker.c;
        sb.append(properties != null ? properties.f7153b : null);
        return sb.toString();
    }

    public static final int I0(char c) {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        throw new IllegalArgumentException(("Invalid Hexadecimal Character: " + c).toString());
    }

    public static final Page J() {
        App app2;
        Data data;
        List<Page> list;
        BravoApp.b bVar = BravoApp.Q;
        JsonApp jsonApp = BravoApp.f6915o;
        if (jsonApp == null || (app2 = jsonApp.d) == null || (data = app2.f7062e) == null || (list = data.a) == null) {
            return null;
        }
        return list.get(0);
    }

    public static void J0(BravoActivity bravoActivity, String str, String str2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str2 = "";
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        i.e(bravoActivity, "$this$toastUiThread");
        i.e(str, "message");
        bravoActivity.runOnUiThread(new d(bravoActivity, str2, str, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r0 = (r0 = (r0 = (r0 = (r0 = r0.d).f7062e).a).get(0)).c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String K() {
        /*
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f6915o
            if (r0 == 0) goto L_0x0020
            com.appfoundry.previewer.model.App r0 = r0.d
            if (r0 == 0) goto L_0x0020
            com.appfoundry.previewer.model.Data r0 = r0.f7062e
            if (r0 == 0) goto L_0x0020
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.a
            if (r0 == 0) goto L_0x0020
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.c
            if (r0 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = "menu:slide"
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.K():java.lang.String");
    }

    public static final void K0(Style style) {
        Float f;
        i.e(style, "$this$transformBorderRadiusIntoCornerRadiiIfExists");
        if (style.B == null && (f = style.A) != null && f.floatValue() > 0.0f) {
            Float f2 = style.A;
            style.B = g.B(f2, f2, f2, f2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Float} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0179, code lost:
        if (r10 != null) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0190, code lost:
        if (r11 != null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0110, code lost:
        r10 = r10.f7181b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object L(java.lang.String r9, java.lang.String r10, java.lang.String r11, com.appfoundry.previewer.model.Actions r12, java.lang.String r13, java.util.List<java.lang.String> r14) {
        /*
            java.lang.String r0 = ""
            if (r12 == 0) goto L_0x000d
            com.appfoundry.previewer.model.Tap r1 = r12.a
            if (r1 == 0) goto L_0x000d
            java.lang.String r1 = r1.a
            if (r1 == 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r1 = r0
        L_0x000e:
            if (r14 == 0) goto L_0x0017
            java.lang.String r2 = x(r14)
            if (r2 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            java.lang.String r3 = "$this$isPhone"
            e.x.c.i.e(r1, r3)
            r3 = 1
            java.lang.String r4 = "phone"
            boolean r4 = e.c0.h.b(r1, r4, r3)
            r5 = 0
            if (r4 == 0) goto L_0x0042
            b.a.a.g.e0 r9 = new b.a.a.g.e0
            if (r12 == 0) goto L_0x003d
            java.lang.String r10 = "$this$getPhone"
            e.x.c.i.e(r12, r10)
            com.appfoundry.previewer.model.Tap r10 = r12.a
            if (r10 == 0) goto L_0x003a
            com.appfoundry.previewer.model.Params r10 = r10.f7181b
            if (r10 == 0) goto L_0x003a
            java.lang.String r5 = r10.d
        L_0x003a:
            if (r5 == 0) goto L_0x003d
            r0 = r5
        L_0x003d:
            r9.<init>(r0)
            goto L_0x059f
        L_0x0042:
            java.lang.String r4 = "$this$isEmail"
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = "email"
            boolean r4 = e.c0.h.b(r1, r4, r3)
            if (r4 == 0) goto L_0x006a
            b.a.a.g.h r9 = new b.a.a.g.h
            if (r12 == 0) goto L_0x0065
            java.lang.String r10 = "$this$getEmail"
            e.x.c.i.e(r12, r10)
            com.appfoundry.previewer.model.Tap r10 = r12.a
            if (r10 == 0) goto L_0x0062
            com.appfoundry.previewer.model.Params r10 = r10.f7181b
            if (r10 == 0) goto L_0x0062
            java.lang.String r5 = r10.f7140e
        L_0x0062:
            if (r5 == 0) goto L_0x0065
            r0 = r5
        L_0x0065:
            r9.<init>(r0)
            goto L_0x059f
        L_0x006a:
            java.lang.String r4 = "$this$isOpenUrl"
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = "openurl"
            boolean r4 = e.c0.h.b(r1, r4, r3)
            if (r4 == 0) goto L_0x0087
            b.a.a.g.b0 r9 = new b.a.a.g.b0
            if (r12 == 0) goto L_0x0082
            java.lang.String r10 = R(r12)
            if (r10 == 0) goto L_0x0082
            r0 = r10
        L_0x0082:
            r9.<init>(r0, r11)
            goto L_0x059f
        L_0x0087:
            java.lang.String r4 = "$this$isShare"
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = "share"
            boolean r4 = e.c0.h.b(r1, r4, r3)
            if (r4 == 0) goto L_0x00a4
            b.a.a.g.l0 r9 = new b.a.a.g.l0
            if (r12 == 0) goto L_0x009f
            java.lang.String r10 = R(r12)
            if (r10 == 0) goto L_0x009f
            r0 = r10
        L_0x009f:
            r9.<init>(r0)
            goto L_0x059f
        L_0x00a4:
            java.lang.String r4 = "$this$isDownload"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "download"
            boolean r7 = e.c0.h.b(r1, r6, r3)
            if (r7 != 0) goto L_0x0588
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.b(r2, r6, r3)
            if (r4 == 0) goto L_0x00bc
            goto L_0x0588
        L_0x00bc:
            java.lang.String r4 = "$this$isOpenVideo"
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = "openvideo"
            boolean r4 = e.c0.h.b(r1, r4, r3)
            if (r4 == 0) goto L_0x00d9
            b.a.a.g.v0 r9 = new b.a.a.g.v0
            if (r12 == 0) goto L_0x00d4
            java.lang.String r10 = R(r12)
            if (r10 == 0) goto L_0x00d4
            r0 = r10
        L_0x00d4:
            r9.<init>(r0)
            goto L_0x059f
        L_0x00d9:
            java.lang.String r4 = "$this$isOpenPdf"
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = "openpdf"
            boolean r4 = e.c0.h.b(r1, r4, r3)
            if (r4 == 0) goto L_0x00f6
            b.a.a.g.d0 r9 = new b.a.a.g.d0
            if (r12 == 0) goto L_0x00f1
            java.lang.String r10 = R(r12)
            if (r10 == 0) goto L_0x00f1
            r0 = r10
        L_0x00f1:
            r9.<init>(r0)
            goto L_0x059f
        L_0x00f6:
            java.lang.String r4 = "$this$isMaps"
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = "mapsdirections"
            boolean r4 = e.c0.h.b(r1, r4, r3)
            if (r4 == 0) goto L_0x0157
            b.a.a.g.u r9 = new b.a.a.g.u
            if (r12 == 0) goto L_0x011b
            java.lang.String r10 = "$this$getPlace"
            e.x.c.i.e(r12, r10)
            com.appfoundry.previewer.model.Tap r10 = r12.a
            if (r10 == 0) goto L_0x0117
            com.appfoundry.previewer.model.Params r10 = r10.f7181b
            if (r10 == 0) goto L_0x0117
            java.lang.String r10 = r10.f
            goto L_0x0118
        L_0x0117:
            r10 = r5
        L_0x0118:
            if (r10 == 0) goto L_0x011b
            r0 = r10
        L_0x011b:
            if (r12 == 0) goto L_0x012d
            java.lang.String r10 = "$this$getLat"
            e.x.c.i.e(r12, r10)
            com.appfoundry.previewer.model.Tap r10 = r12.a
            if (r10 == 0) goto L_0x012d
            com.appfoundry.previewer.model.Params r10 = r10.f7181b
            if (r10 == 0) goto L_0x012d
            java.lang.Float r10 = r10.f7141g
            goto L_0x012e
        L_0x012d:
            r10 = r5
        L_0x012e:
            if (r12 == 0) goto L_0x0140
            java.lang.String r11 = "$this$getLong"
            e.x.c.i.e(r12, r11)
            com.appfoundry.previewer.model.Tap r11 = r12.a
            if (r11 == 0) goto L_0x0140
            com.appfoundry.previewer.model.Params r11 = r11.f7181b
            if (r11 == 0) goto L_0x0140
            java.lang.Float r11 = r11.f7142h
            goto L_0x0141
        L_0x0140:
            r11 = r5
        L_0x0141:
            if (r12 == 0) goto L_0x0152
            java.lang.String r13 = "$this$getZoom"
            e.x.c.i.e(r12, r13)
            com.appfoundry.previewer.model.Tap r12 = r12.a
            if (r12 == 0) goto L_0x0152
            com.appfoundry.previewer.model.Params r12 = r12.f7181b
            if (r12 == 0) goto L_0x0152
            java.lang.Float r5 = r12.v
        L_0x0152:
            r9.<init>(r0, r10, r11, r5)
            goto L_0x059f
        L_0x0157:
            java.lang.String r4 = "$this$isAddToCalendar"
            e.x.c.i.e(r1, r4)
            java.lang.String r4 = "addtocalendar"
            boolean r4 = e.c0.h.b(r1, r4, r3)
            if (r4 == 0) goto L_0x01ad
            b.a.a.g.b r9 = new b.a.a.g.b
            if (r12 == 0) goto L_0x017c
            java.lang.String r10 = "$this$getTitle"
            e.x.c.i.e(r12, r10)
            com.appfoundry.previewer.model.Tap r10 = r12.a
            if (r10 == 0) goto L_0x0178
            com.appfoundry.previewer.model.Params r10 = r10.f7181b
            if (r10 == 0) goto L_0x0178
            java.lang.String r10 = r10.f7139b
            goto L_0x0179
        L_0x0178:
            r10 = r5
        L_0x0179:
            if (r10 == 0) goto L_0x017c
            goto L_0x017d
        L_0x017c:
            r10 = r0
        L_0x017d:
            if (r12 == 0) goto L_0x0193
            java.lang.String r11 = "$this$getStartDate"
            e.x.c.i.e(r12, r11)
            com.appfoundry.previewer.model.Tap r11 = r12.a
            if (r11 == 0) goto L_0x018f
            com.appfoundry.previewer.model.Params r11 = r11.f7181b
            if (r11 == 0) goto L_0x018f
            java.lang.String r11 = r11.f7143i
            goto L_0x0190
        L_0x018f:
            r11 = r5
        L_0x0190:
            if (r11 == 0) goto L_0x0193
            goto L_0x0194
        L_0x0193:
            r11 = r0
        L_0x0194:
            if (r12 == 0) goto L_0x01a8
            java.lang.String r13 = "$this$getEndDate"
            e.x.c.i.e(r12, r13)
            com.appfoundry.previewer.model.Tap r12 = r12.a
            if (r12 == 0) goto L_0x01a5
            com.appfoundry.previewer.model.Params r12 = r12.f7181b
            if (r12 == 0) goto L_0x01a5
            java.lang.String r5 = r12.f7144j
        L_0x01a5:
            if (r5 == 0) goto L_0x01a8
            r0 = r5
        L_0x01a8:
            r9.<init>(r10, r11, r0)
            goto L_0x059f
        L_0x01ad:
            java.lang.String r4 = "$this$isScan"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "scan"
            boolean r7 = e.c0.h.f(r1, r6, r3)
            if (r7 != 0) goto L_0x0582
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.f(r2, r6, r3)
            if (r4 == 0) goto L_0x01c5
            goto L_0x0582
        L_0x01c5:
            java.lang.String r4 = "$this$isScanQr"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "scanqr"
            boolean r7 = e.c0.h.b(r1, r6, r3)
            if (r7 != 0) goto L_0x057c
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.b(r2, r6, r3)
            if (r4 == 0) goto L_0x01dd
            goto L_0x057c
        L_0x01dd:
            java.lang.String r4 = "$this$isUnlink"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "unlink"
            boolean r7 = e.c0.h.b(r1, r6, r3)
            if (r7 != 0) goto L_0x0576
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.b(r2, r6, r3)
            if (r4 == 0) goto L_0x01f5
            goto L_0x0576
        L_0x01f5:
            java.lang.String r4 = "$this$isCloseIntro"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "closeIntro"
            boolean r7 = e.c0.h.b(r1, r6, r3)
            if (r7 != 0) goto L_0x0570
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.b(r2, r6, r3)
            if (r4 == 0) goto L_0x020d
            goto L_0x0570
        L_0x020d:
            java.lang.String r4 = "$this$isClose"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "close"
            boolean r7 = e.c0.h.b(r1, r6, r3)
            if (r7 != 0) goto L_0x056a
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.b(r2, r6, r3)
            if (r4 == 0) goto L_0x0225
            goto L_0x056a
        L_0x0225:
            java.lang.String r4 = "$this$isUpdate"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "update"
            boolean r7 = e.c0.h.b(r1, r6, r3)
            r8 = 0
            if (r7 != 0) goto L_0x0564
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.b(r2, r6, r3)
            if (r4 == 0) goto L_0x023e
            goto L_0x0564
        L_0x023e:
            java.lang.String r4 = "$this$isLoadScannedApp"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "scanapp"
            boolean r7 = e.c0.h.b(r1, r6, r3)
            if (r7 != 0) goto L_0x0556
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.b(r2, r6, r3)
            if (r4 == 0) goto L_0x0256
            goto L_0x0556
        L_0x0256:
            java.lang.String r4 = "$this$isShowQr"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "showqr"
            boolean r7 = e.c0.h.b(r1, r6, r3)
            if (r7 != 0) goto L_0x053e
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.b(r2, r6, r3)
            if (r4 == 0) goto L_0x026e
            goto L_0x053e
        L_0x026e:
            java.lang.String r4 = "$this$isLogin"
            e.x.c.i.e(r1, r4)
            java.lang.String r6 = "login"
            boolean r7 = e.c0.h.b(r1, r6, r3)
            if (r7 != 0) goto L_0x04dd
            e.x.c.i.e(r2, r4)
            boolean r4 = e.c0.h.b(r2, r6, r3)
            if (r4 == 0) goto L_0x0286
            goto L_0x04dd
        L_0x0286:
            java.lang.String r0 = "$this$isLogout"
            e.x.c.i.e(r1, r0)
            java.lang.String r4 = "logout"
            boolean r6 = e.c0.h.b(r1, r4, r3)
            if (r6 != 0) goto L_0x04d6
            e.x.c.i.e(r2, r0)
            boolean r0 = e.c0.h.b(r2, r4, r3)
            if (r0 == 0) goto L_0x029e
            goto L_0x04d6
        L_0x029e:
            java.lang.String r0 = "$this$isSubmit"
            e.x.c.i.e(r1, r0)
            java.lang.String r4 = "submit"
            boolean r6 = e.c0.h.b(r1, r4, r3)
            if (r6 != 0) goto L_0x04cf
            e.x.c.i.e(r2, r0)
            boolean r0 = e.c0.h.b(r2, r4, r3)
            if (r0 == 0) goto L_0x02b6
            goto L_0x04cf
        L_0x02b6:
            java.lang.String r0 = "$this$isRemoteAction"
            e.x.c.i.e(r1, r0)
            java.lang.String r0 = "remote"
            boolean r0 = e.c0.h.b(r1, r0, r3)
            if (r0 == 0) goto L_0x02ee
            b.a.a.g.i0 r10 = new b.a.a.g.i0
            if (r12 == 0) goto L_0x02d7
            java.lang.String r11 = "$this$getTriggerUrl"
            e.x.c.i.e(r12, r11)
            com.appfoundry.previewer.model.Tap r11 = r12.a
            if (r11 == 0) goto L_0x02d7
            com.appfoundry.previewer.model.Params r11 = r11.f7181b
            if (r11 == 0) goto L_0x02d7
            java.lang.String r11 = r11.f7149o
            goto L_0x02d8
        L_0x02d7:
            r11 = r5
        L_0x02d8:
            if (r12 == 0) goto L_0x02e9
            java.lang.String r13 = "$this$getConfirmPrompt"
            e.x.c.i.e(r12, r13)
            com.appfoundry.previewer.model.Tap r12 = r12.a
            if (r12 == 0) goto L_0x02e9
            com.appfoundry.previewer.model.Params r12 = r12.f7181b
            if (r12 == 0) goto L_0x02e9
            java.lang.String r5 = r12.f7150p
        L_0x02e9:
            r10.<init>(r9, r11, r5)
            goto L_0x053c
        L_0x02ee:
            java.lang.String r0 = "$this$isEnableNotifications"
            e.x.c.i.e(r1, r0)
            java.lang.String r4 = "enablenotifications"
            boolean r6 = e.c0.h.b(r1, r4, r3)
            if (r6 != 0) goto L_0x04c8
            e.x.c.i.e(r2, r0)
            boolean r0 = e.c0.h.b(r2, r4, r3)
            if (r0 == 0) goto L_0x0306
            goto L_0x04c8
        L_0x0306:
            java.lang.String r0 = "$this$isOpenIntro"
            e.x.c.i.e(r1, r0)
            java.lang.String r4 = "openIntro"
            boolean r6 = e.c0.h.b(r1, r4, r3)
            if (r6 != 0) goto L_0x04c1
            e.x.c.i.e(r2, r0)
            boolean r0 = e.c0.h.b(r2, r4, r3)
            if (r0 == 0) goto L_0x031e
            goto L_0x04c1
        L_0x031e:
            java.lang.String r0 = "$this$isBackHome"
            e.x.c.i.e(r1, r0)
            java.lang.String r4 = "backHome"
            boolean r6 = e.c0.h.b(r1, r4, r3)
            if (r6 != 0) goto L_0x04ba
            e.x.c.i.e(r2, r0)
            boolean r0 = e.c0.h.b(r2, r4, r3)
            if (r0 == 0) goto L_0x0336
            goto L_0x04ba
        L_0x0336:
            java.lang.String r0 = "$this$isAppSettings"
            e.x.c.i.e(r1, r0)
            java.lang.String r4 = "appSettings"
            boolean r6 = e.c0.h.b(r1, r4, r3)
            if (r6 != 0) goto L_0x04b3
            e.x.c.i.e(r2, r0)
            boolean r0 = e.c0.h.b(r2, r4, r3)
            if (r0 == 0) goto L_0x034e
            goto L_0x04b3
        L_0x034e:
            java.lang.String r0 = "$this$isGoBack"
            e.x.c.i.e(r1, r0)
            java.lang.String r4 = "goBack"
            boolean r6 = e.c0.h.b(r1, r4, r3)
            if (r6 != 0) goto L_0x04ac
            e.x.c.i.e(r2, r0)
            boolean r0 = e.c0.h.b(r2, r4, r3)
            if (r0 == 0) goto L_0x0366
            goto L_0x04ac
        L_0x0366:
            java.lang.String r0 = "$this$isPreviewApp"
            e.x.c.i.e(r1, r0)
            java.lang.String r4 = "previewapp"
            boolean r6 = e.c0.h.b(r1, r4, r3)
            if (r6 != 0) goto L_0x0494
            e.x.c.i.e(r2, r0)
            boolean r0 = e.c0.h.b(r2, r4, r3)
            if (r0 == 0) goto L_0x037e
            goto L_0x0494
        L_0x037e:
            java.lang.String r0 = "$this$isPlayAudio"
            e.x.c.i.e(r1, r0)
            java.lang.String r4 = "play"
            boolean r6 = e.c0.h.b(r1, r4, r3)
            if (r6 != 0) goto L_0x047d
            e.x.c.i.e(r2, r0)
            boolean r0 = e.c0.h.b(r2, r4, r3)
            if (r0 == 0) goto L_0x0396
            goto L_0x047d
        L_0x0396:
            java.lang.String r14 = "$this$isPauseAudio"
            e.x.c.i.e(r1, r14)
            java.lang.String r0 = "pause"
            boolean r4 = e.c0.h.b(r1, r0, r3)
            if (r4 != 0) goto L_0x0476
            e.x.c.i.e(r2, r14)
            boolean r14 = e.c0.h.b(r2, r0, r3)
            if (r14 == 0) goto L_0x03ae
            goto L_0x0476
        L_0x03ae:
            java.lang.String r10 = "$this$isOpenAudio"
            e.x.c.i.e(r1, r10)
            java.lang.String r10 = "openaudio"
            boolean r10 = e.c0.h.b(r1, r10, r3)
            if (r10 != 0) goto L_0x046b
            java.lang.String r10 = "$this$isOpenAudio"
            e.x.c.i.e(r2, r10)
            java.lang.String r10 = "openaudio"
            boolean r10 = e.c0.h.b(r2, r10, r3)
            if (r10 == 0) goto L_0x03ca
            goto L_0x046b
        L_0x03ca:
            java.lang.String r10 = "$this$isResetPassword"
            e.x.c.i.e(r1, r10)
            java.lang.String r10 = "reset-password"
            boolean r10 = e.c0.h.b(r1, r10, r3)
            if (r10 != 0) goto L_0x0464
            java.lang.String r10 = "$this$isResetPassword"
            e.x.c.i.e(r2, r10)
            java.lang.String r10 = "reset-password"
            boolean r10 = e.c0.h.b(r2, r10, r3)
            if (r10 == 0) goto L_0x03e6
            goto L_0x0464
        L_0x03e6:
            java.lang.String r10 = "$this$isFirebaseLogout"
            e.x.c.i.e(r1, r10)
            java.lang.String r10 = "logout:firebase"
            boolean r10 = e.c0.h.b(r1, r10, r3)
            if (r10 != 0) goto L_0x045d
            java.lang.String r10 = "$this$isFirebaseLogout"
            e.x.c.i.e(r2, r10)
            java.lang.String r10 = "logout:firebase"
            boolean r10 = e.c0.h.b(r2, r10, r3)
            if (r10 == 0) goto L_0x0401
            goto L_0x045d
        L_0x0401:
            java.lang.String r10 = "$this$isFirebaseRegister"
            e.x.c.i.e(r1, r10)
            java.lang.String r10 = "register:firebase-email-password"
            boolean r10 = e.c0.h.b(r1, r10, r3)
            if (r10 != 0) goto L_0x0456
            java.lang.String r10 = "$this$isFirebaseRegister"
            e.x.c.i.e(r2, r10)
            java.lang.String r10 = "register:firebase-email-password"
            boolean r10 = e.c0.h.b(r2, r10, r3)
            if (r10 == 0) goto L_0x041c
            goto L_0x0456
        L_0x041c:
            java.lang.String r9 = "$this$isShowEmulatorAppList"
            e.x.c.i.e(r2, r9)
            java.lang.String r9 = "show-emulator-appList"
            boolean r9 = e.c0.h.b(r2, r9, r3)
            if (r9 == 0) goto L_0x0438
            com.appfoundry.previewer.BravoApp$b r9 = com.appfoundry.previewer.BravoApp.Q
            java.lang.Boolean r9 = com.appfoundry.previewer.BravoApp.P
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r9 = e.x.c.i.a(r9, r10)
            if (r9 != 0) goto L_0x0439
            b.a.a.n.c.b()
        L_0x0438:
            r3 = r8
        L_0x0439:
            if (r3 == 0) goto L_0x0442
            b.a.a.g.m0 r9 = new b.a.a.g.m0
            r9.<init>()
            goto L_0x059f
        L_0x0442:
            b.a.a.n.f.L(r13)
            if (r11 == 0) goto L_0x044f
            b.a.a.g.v r9 = new b.a.a.g.v
            r10 = 4
            r9.<init>(r11, r13, r5, r10)
            goto L_0x059f
        L_0x044f:
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            goto L_0x059f
        L_0x0456:
            b.a.a.g.m r10 = new b.a.a.g.m
            r10.<init>(r9)
            goto L_0x053c
        L_0x045d:
            b.a.a.g.l r9 = new b.a.a.g.l
            r9.<init>()
            goto L_0x059f
        L_0x0464:
            b.a.a.g.j0 r10 = new b.a.a.g.j0
            r10.<init>(r9)
            goto L_0x053c
        L_0x046b:
            b.a.a.g.y r9 = new b.a.a.g.y
            java.lang.String r10 = y(r12, r2)
            r9.<init>(r10)
            goto L_0x059f
        L_0x0476:
            b.a.a.g.c0 r9 = new b.a.a.g.c0
            r9.<init>(r10)
            goto L_0x059f
        L_0x047d:
            b.a.a.g.f0 r9 = new b.a.a.g.f0
            java.lang.String r11 = y(r12, r2)
            if (r14 == 0) goto L_0x048e
            java.lang.String r12 = "audio:background"
            boolean r12 = d0(r14, r12)
            if (r12 != r3) goto L_0x048e
            goto L_0x048f
        L_0x048e:
            r3 = r8
        L_0x048f:
            r9.<init>(r10, r11, r3)
            goto L_0x059f
        L_0x0494:
            b.a.a.g.g0 r9 = new b.a.a.g.g0
            if (r12 == 0) goto L_0x04a7
            java.lang.String r10 = "$this$getAppId"
            e.x.c.i.e(r12, r10)
            com.appfoundry.previewer.model.Tap r10 = r12.a
            if (r10 == 0) goto L_0x04a7
            com.appfoundry.previewer.model.Params r10 = r10.f7181b
            if (r10 == 0) goto L_0x04a7
            java.lang.String r5 = r10.f7145k
        L_0x04a7:
            r9.<init>(r5)
            goto L_0x059f
        L_0x04ac:
            b.a.a.g.n r9 = new b.a.a.g.n
            r9.<init>()
            goto L_0x059f
        L_0x04b3:
            b.a.a.g.x r9 = new b.a.a.g.x
            r9.<init>()
            goto L_0x059f
        L_0x04ba:
            b.a.a.g.c r9 = new b.a.a.g.c
            r9.<init>()
            goto L_0x059f
        L_0x04c1:
            b.a.a.g.z r9 = new b.a.a.g.z
            r9.<init>()
            goto L_0x059f
        L_0x04c8:
            b.a.a.g.h0 r9 = new b.a.a.g.h0
            r9.<init>()
            goto L_0x059f
        L_0x04cf:
            b.a.a.g.o0 r10 = new b.a.a.g.o0
            r10.<init>(r9)
            goto L_0x053c
        L_0x04d6:
            b.a.a.g.s r9 = new b.a.a.g.s
            r9.<init>(r8)
            goto L_0x059f
        L_0x04dd:
            b.a.a.g.r r10 = new b.a.a.g.r
            java.lang.String r11 = "actionsInTags"
            e.x.c.i.e(r2, r11)
            if (r12 == 0) goto L_0x04f0
            com.appfoundry.previewer.model.Tap r11 = r12.a
            if (r11 == 0) goto L_0x04f0
            com.appfoundry.previewer.model.Params r11 = r11.f7181b
            if (r11 == 0) goto L_0x04f0
            java.lang.String r5 = r11.f7146l
        L_0x04f0:
            java.lang.String r11 = "firebase-email-password"
            java.lang.String r13 = "apple"
            java.lang.String r14 = "Figma"
            java.lang.String r1 = "google-oauth2"
            if (r5 == 0) goto L_0x050e
            com.appfoundry.previewer.model.Tap r4 = r12.a
            com.appfoundry.previewer.model.Params r4 = r4.f7181b
            java.lang.String r4 = r4.f7146l
            boolean r0 = e.x.c.i.a(r4, r0)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x050e
            com.appfoundry.previewer.model.Tap r11 = r12.a
            com.appfoundry.previewer.model.Params r11 = r11.f7181b
            java.lang.String r11 = r11.f7146l
            goto L_0x0539
        L_0x050e:
            r12 = 2
            boolean r0 = e.c0.h.d(r2, r1, r8, r12)
            if (r0 == 0) goto L_0x0517
            r11 = r1
            goto L_0x0539
        L_0x0517:
            boolean r0 = e.c0.h.d(r2, r14, r8, r12)
            if (r0 == 0) goto L_0x051f
            r11 = r14
            goto L_0x0539
        L_0x051f:
            boolean r14 = e.c0.h.d(r2, r13, r8, r12)
            if (r14 == 0) goto L_0x0527
            r11 = r13
            goto L_0x0539
        L_0x0527:
            boolean r12 = e.c0.h.d(r2, r11, r8, r12)
            if (r12 == 0) goto L_0x052e
            goto L_0x0539
        L_0x052e:
            boolean r11 = b.a.a.n.c.s()
            if (r11 != 0) goto L_0x0537
            java.lang.String r11 = "app-with-oauth"
            goto L_0x0539
        L_0x0537:
            java.lang.String r11 = "passwordless"
        L_0x0539:
            r10.<init>(r9, r11)
        L_0x053c:
            r9 = r10
            goto L_0x059f
        L_0x053e:
            b.a.a.g.n0 r9 = new b.a.a.g.n0
            if (r14 == 0) goto L_0x0549
            java.lang.String r10 = "appUrl"
            java.lang.String r10 = S(r14, r10, r8)
            goto L_0x054a
        L_0x0549:
            r10 = r5
        L_0x054a:
            if (r14 == 0) goto L_0x0552
            java.lang.String r11 = "appName"
            java.lang.String r5 = S(r14, r11, r8)
        L_0x0552:
            r9.<init>(r10, r5)
            goto L_0x059f
        L_0x0556:
            b.a.a.g.k0 r9 = new b.a.a.g.k0
            if (r14 == 0) goto L_0x0560
            java.lang.String r10 = "scannedAppUrl"
            java.lang.String r5 = S(r14, r10, r8)
        L_0x0560:
            r9.<init>(r5)
            goto L_0x059f
        L_0x0564:
            b.a.a.g.u0 r9 = new b.a.a.g.u0
            r9.<init>(r8, r3)
            goto L_0x059f
        L_0x056a:
            b.a.a.g.e r9 = new b.a.a.g.e
            r9.<init>()
            goto L_0x059f
        L_0x0570:
            b.a.a.g.q r9 = new b.a.a.g.q
            r9.<init>()
            goto L_0x059f
        L_0x0576:
            b.a.a.g.t r9 = new b.a.a.g.t
            r9.<init>()
            goto L_0x059f
        L_0x057c:
            b.a.a.g.a0 r9 = new b.a.a.g.a0
            r9.<init>()
            goto L_0x059f
        L_0x0582:
            b.a.a.g.a0 r9 = new b.a.a.g.a0
            r9.<init>()
            goto L_0x059f
        L_0x0588:
            b.a.a.g.g r9 = new b.a.a.g.g
            if (r12 == 0) goto L_0x0593
            java.lang.String r10 = R(r12)
            if (r10 == 0) goto L_0x0593
            goto L_0x059c
        L_0x0593:
            java.lang.String r10 = "$this$getUrlFromTag"
            e.x.c.i.e(r2, r10)
            java.lang.String r10 = b.a.a.h.m.e(r2)
        L_0x059c:
            r9.<init>(r10)
        L_0x059f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.L(java.lang.String, java.lang.String, java.lang.String, com.appfoundry.previewer.model.Actions, java.lang.String, java.util.List):java.lang.Object");
    }

    public static final void L0(AppCompatActivity appCompatActivity) {
        i.e(appCompatActivity, "$this$unregisterFromEventBus");
        if (c.b().f(appCompatActivity)) {
            c.b().m(appCompatActivity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r4 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final b.a.a.i.l M(com.appfoundry.previewer.model.Style r18, int r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "$this$getShadowData"
            e.x.c.i.e(r0, r3)
            com.appfoundry.previewer.model.Dimensions r3 = new com.appfoundry.previewer.model.Dimensions
            com.appfoundry.previewer.model.Dimensions r4 = r0.f7176m
            r5 = 0
            if (r4 == 0) goto L_0x001b
            java.lang.Float r4 = r4.a
            if (r4 == 0) goto L_0x001b
            float r4 = r4.floatValue()
            goto L_0x001c
        L_0x001b:
            r4 = r5
        L_0x001c:
            float r4 = b.a.a.n.c.q(r4, r1)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            com.appfoundry.previewer.model.Dimensions r6 = r0.f7176m
            if (r6 == 0) goto L_0x0031
            java.lang.Float r6 = r6.f7109b
            if (r6 == 0) goto L_0x0031
            float r6 = r6.floatValue()
            goto L_0x0032
        L_0x0031:
            r6 = r5
        L_0x0032:
            float r6 = b.a.a.n.c.q(r6, r2)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            com.appfoundry.previewer.model.Dimensions r7 = r0.f7176m
            if (r7 == 0) goto L_0x0047
            java.lang.Float r7 = r7.c
            if (r7 == 0) goto L_0x0047
            float r7 = r7.floatValue()
            goto L_0x0048
        L_0x0047:
            r7 = r5
        L_0x0048:
            float r7 = b.a.a.n.c.q(r7, r1)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            com.appfoundry.previewer.model.Dimensions r8 = r0.f7176m
            if (r8 == 0) goto L_0x005d
            java.lang.Float r8 = r8.d
            if (r8 == 0) goto L_0x005d
            float r8 = r8.floatValue()
            goto L_0x005e
        L_0x005d:
            r8 = r5
        L_0x005e:
            float r8 = b.a.a.n.c.q(r8, r2)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r3.<init>(r4, r6, r7, r8)
            if (r4 == 0) goto L_0x0070
            float r4 = r4.floatValue()
            goto L_0x0071
        L_0x0070:
            r4 = r5
        L_0x0071:
            java.lang.Float r6 = r3.c
            if (r6 == 0) goto L_0x007a
            float r6 = r6.floatValue()
            goto L_0x007b
        L_0x007a:
            r6 = r5
        L_0x007b:
            float r4 = r4 + r6
            int r4 = (int) r4
            int r1 = r1 - r4
            java.lang.Float r4 = r3.f7109b
            if (r4 == 0) goto L_0x0087
            float r4 = r4.floatValue()
            goto L_0x0088
        L_0x0087:
            r4 = r5
        L_0x0088:
            java.lang.Float r6 = r3.d
            if (r6 == 0) goto L_0x0091
            float r6 = r6.floatValue()
            goto L_0x0092
        L_0x0091:
            r6 = r5
        L_0x0092:
            float r4 = r4 + r6
            int r4 = (int) r4
            int r2 = r2 - r4
            com.appfoundry.previewer.model.Shadow r4 = r0.z
            r6 = 0
            if (r4 == 0) goto L_0x009d
            java.lang.Float r7 = r4.f7158b
            goto L_0x009e
        L_0x009d:
            r7 = r6
        L_0x009e:
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r7 == 0) goto L_0x00b9
            java.lang.Float r4 = r4.f7158b
            float r4 = r4.floatValue()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
            com.appfoundry.previewer.model.Shadow r4 = r0.z
            java.lang.Float r4 = r4.f7158b
            float r4 = r4.floatValue()
            float r7 = (float) r1
            float r4 = r4 * r7
            float r4 = r4 / r8
            r14 = r4
            goto L_0x00ba
        L_0x00b9:
            r14 = r5
        L_0x00ba:
            float r1 = (float) r1
            r4 = 2
            float r4 = (float) r4
            float r4 = r4 * r14
            float r7 = r1 + r4
            int r10 = (int) r7
            float r2 = (float) r2
            float r2 = r2 + r4
            int r11 = (int) r2
            com.appfoundry.previewer.model.Shadow r2 = r0.z
            if (r2 == 0) goto L_0x00cf
            com.appfoundry.previewer.model.ShadowOffset r4 = r2.c
            if (r4 == 0) goto L_0x00cf
            java.lang.Float r4 = r4.a
            goto L_0x00d0
        L_0x00cf:
            r4 = r6
        L_0x00d0:
            if (r4 == 0) goto L_0x00de
            com.appfoundry.previewer.model.ShadowOffset r2 = r2.c
            java.lang.Float r2 = r2.a
            float r2 = r2.floatValue()
            float r2 = r2 * r1
            float r2 = r2 / r8
            r15 = r2
            goto L_0x00df
        L_0x00de:
            r15 = r5
        L_0x00df:
            com.appfoundry.previewer.model.Shadow r2 = r0.z
            if (r2 == 0) goto L_0x00ea
            com.appfoundry.previewer.model.ShadowOffset r4 = r2.c
            if (r4 == 0) goto L_0x00ea
            java.lang.Float r4 = r4.f7159b
            goto L_0x00eb
        L_0x00ea:
            r4 = r6
        L_0x00eb:
            if (r4 == 0) goto L_0x00fa
            com.appfoundry.previewer.model.ShadowOffset r2 = r2.c
            java.lang.Float r2 = r2.f7159b
            float r2 = r2.floatValue()
            float r2 = r2 * r1
            float r2 = r2 / r8
            r16 = r2
            goto L_0x00fc
        L_0x00fa:
            r16 = r5
        L_0x00fc:
            java.lang.Float r1 = r3.a
            if (r1 == 0) goto L_0x010a
            float r1 = r1.floatValue()
            float r1 = r1 - r14
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x010b
        L_0x010a:
            r1 = r6
        L_0x010b:
            java.lang.Float r2 = r3.f7109b
            if (r2 == 0) goto L_0x0119
            float r2 = r2.floatValue()
            float r2 = r2 - r14
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x011a
        L_0x0119:
            r2 = r6
        L_0x011a:
            java.lang.Float r4 = r3.c
            if (r4 == 0) goto L_0x0128
            float r4 = r4.floatValue()
            float r4 = r4 - r14
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0129
        L_0x0128:
            r4 = r6
        L_0x0129:
            java.lang.Float r3 = r3.d
            if (r3 == 0) goto L_0x0136
            float r3 = r3.floatValue()
            float r3 = r3 - r14
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
        L_0x0136:
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0155
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x014a
            if (r4 == 0) goto L_0x0155
            float r3 = r4.floatValue()
            float r3 = r3 - r15
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            goto L_0x0155
        L_0x014a:
            if (r1 == 0) goto L_0x0155
            float r1 = r1.floatValue()
            float r1 = r1 + r15
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L_0x0155:
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0176
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x016a
            if (r6 == 0) goto L_0x0176
            float r3 = r6.floatValue()
            float r3 = r3 - r16
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
            goto L_0x0176
        L_0x016a:
            if (r2 == 0) goto L_0x0176
            float r2 = r2.floatValue()
            float r2 = r2 + r16
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0176:
            K0(r18)
            com.appfoundry.previewer.model.Dimensions r12 = new com.appfoundry.previewer.model.Dimensions
            r12.<init>(r1, r2, r4, r6)
            b.a.a.i.l r1 = new b.a.a.i.l
            com.appfoundry.previewer.model.Shadow r2 = r0.z
            if (r2 == 0) goto L_0x018d
            java.lang.String r2 = r2.a
            if (r2 == 0) goto L_0x018d
            int r2 = b.a.a.h.m.m(r2)
            goto L_0x0190
        L_0x018d:
            r2 = -7829368(0xffffffffff888888, float:NaN)
        L_0x0190:
            r13 = r2
            float[] r17 = w(r0, r10)
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.M(com.appfoundry.previewer.model.Style, int, int):b.a.a.i.l");
    }

    public static final void M0(List<b.a.a.i.d> list, String str, String str2) {
        T t;
        i.e(list, "$this$updateFileUrl");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (i.a(((b.a.a.i.d) t).f310b, str)) {
                break;
            }
        }
        b.a.a.i.d dVar = (b.a.a.i.d) t;
        if (dVar != null) {
            dVar.f313h = str2;
        }
    }

    public static final j<int[], float[]> N(Style style) {
        i.e(style, "$this$getStopsAndPositions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<GradientColorStop> list = style.u;
        if (list != null) {
            for (GradientColorStop next : list) {
                String str = next.a;
                if (str != null) {
                    arrayList.add(Integer.valueOf(m.m(str)));
                }
                arrayList2.add(Float.valueOf(next.f7119b));
            }
        }
        int i2 = 0;
        if (arrayList.size() == 1) {
            if (arrayList2.size() == 1) {
                arrayList.add(arrayList.get(0));
                arrayList2.add(arrayList2.get(0));
            } else {
                int size = arrayList2.size() - 1;
                if (size >= 0) {
                    int i3 = 0;
                    while (true) {
                        arrayList.add(arrayList.get(0));
                        if (i3 == size) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        int[] V = g.V(arrayList);
        i.e(arrayList2, "$this$toFloatArray");
        float[] fArr = new float[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            fArr[i2] = ((Number) it.next()).floatValue();
            i2++;
        }
        return new j<>(V, fArr);
    }

    public static final boolean N0() {
        SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str = d() + "user_allowed_push";
        i.e(str, "key");
        return sharedPreferences.getBoolean(str, false);
    }

    public static final int O(Context context) {
        int A;
        i.e(context, BasePayload.CONTEXT_KEY);
        Page J = J();
        List<Container> list = J != null ? J.f : null;
        if (list == null) {
            return 0;
        }
        int i2 = 0;
        for (Container container : list) {
            Style u = f.u(container.c, (Boolean) null, 2);
            if ((u != null ? u.f7173j : null) != null && (A = A(u, false)) > i2) {
                i2 = A;
            }
        }
        return i2;
    }

    public static final String P(List<String> list, String str) {
        i.e(list, "$this$getTagWithName");
        i.e(str, "name");
        for (String next : list) {
            if (h.b(next, str, true)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r1 = (r1 = r1.getText()).toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String Q(b.a.a.i.d r1) {
        /*
            java.lang.String r0 = "$this$getText"
            e.x.c.i.e(r1, r0)
            android.widget.EditText r1 = r1.c
            if (r1 == 0) goto L_0x0016
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            java.lang.String r1 = ""
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.Q(b.a.a.i.d):java.lang.String");
    }

    public static final String R(Actions actions) {
        Params params;
        i.e(actions, "$this$getUrl");
        Tap tap = actions.a;
        if (tap == null || (params = tap.f7181b) == null) {
            return null;
        }
        return params.a;
    }

    public static final String S(List<String> list, String str, boolean z) {
        i.e(list, "$this$getValueFor");
        i.e(str, "actionType");
        for (String next : list) {
            if (h.b(next, str + ':', z) && !h.b(next, "action:", z)) {
                String substring = next.substring(h.l(next, ":", 0, false, 6) + 1, next.length());
                i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return null;
    }

    public static final Size T(FrameLayout.LayoutParams layoutParams, int i2, int i3) {
        i.e(layoutParams, "$this$getWidthAndHeight");
        return new Size(Integer.valueOf(i2 - (layoutParams.rightMargin + layoutParams.leftMargin)), Integer.valueOf(i3 - (layoutParams.bottomMargin + layoutParams.topMargin)));
    }

    public static final boolean U() {
        return !b.a.a.n.c.s() && e() != null && (i.a(e(), "") ^ true);
    }

    public static final boolean V(List<String> list) {
        i.e(list, "$this$hasAspectRatioScreenTag");
        return (P(list, "display:fullscreen") == null && P(list, "aspectratio:screen") == null) ? false : true;
    }

    public static final boolean W(Style style) {
        i.e(style, "$this$hasBackgroundColor");
        String str = style.c;
        if (str == null || !(!i.a(str, ""))) {
            return false;
        }
        return true;
    }

    public static final boolean X(Style style) {
        i.e(style, "$this$hasBorder");
        Float f = style.x;
        if (f == null || f.floatValue() <= ((float) 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r4 = r4.B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = r4.B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean Y(com.appfoundry.previewer.model.Style r4) {
        /*
            java.lang.String r0 = "$this$hasBorderOrRoundedCorners"
            e.x.c.i.e(r4, r0)
            java.lang.Float r0 = r4.x
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            float r0 = r0.floatValue()
            float r3 = (float) r2
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0043
        L_0x0014:
            java.lang.String r0 = "$this$hasRoundedCorners"
            e.x.c.i.e(r4, r0)
            java.lang.Float r0 = r4.A
            if (r0 == 0) goto L_0x0026
            float r0 = r0.floatValue()
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x003c
        L_0x0026:
            java.util.List<java.lang.Float> r0 = r4.B
            if (r0 == 0) goto L_0x003e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x003e
            java.util.List<java.lang.Float> r4 = r4.B
            if (r4 == 0) goto L_0x003e
            int r4 = r4.size()
            r0 = 4
            if (r4 != r0) goto L_0x003e
        L_0x003c:
            r4 = r1
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            if (r4 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r1 = r2
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.Y(com.appfoundry.previewer.model.Style):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean Z(com.appfoundry.previewer.model.Style r1) {
        /*
            java.lang.String r0 = "$this$hasBorderRadius"
            e.x.c.i.e(r1, r0)
            java.util.List<java.lang.Float> r0 = r1.B
            if (r0 != 0) goto L_0x0019
            java.lang.Float r1 = r1.A
            if (r1 == 0) goto L_0x0017
            float r1 = r1.floatValue()
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r1 = 0
            goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.Z(com.appfoundry.previewer.model.Style):boolean");
    }

    public static final boolean a(List<b.a.a.i.e> list) {
        T t;
        i.e(list, "$this$allFilesUploaded");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!((b.a.a.i.e) t).c) {
                break;
            }
        }
        return t == null;
    }

    public static final boolean a0() {
        return !b.a.a.n.c.s() && i() != null && (i.a(i(), "") ^ true);
    }

    public static final boolean b(List<b.a.a.i.f> list) {
        T t;
        i.e(list, "$this$allImagesUploaded");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!((b.a.a.i.f) t).c) {
                break;
            }
        }
        return t == null;
    }

    public static final boolean b0(List<b.a.a.i.d> list) {
        T t;
        i.e(list, "$this$hasInputFile");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (i.a(((b.a.a.i.d) t).a, "component:input-file")) {
                break;
            }
        }
        return t != null;
    }

    public static final Context c() {
        return BravoApp.Q.b();
    }

    public static final boolean c0(List<b.a.a.i.d> list) {
        T t;
        i.e(list, "$this$hasInputImage");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (i.a(((b.a.a.i.d) t).a, "component:input-image")) {
                break;
            }
        }
        return t != null;
    }

    public static final String d() {
        String string = c().getString(R.string.app_id);
        i.d(string, "appContext().getString(R.string.app_id)");
        return string;
    }

    public static final boolean d0(List<String> list, String str) {
        i.e(list, "$this$hasTagWithName");
        i.e(str, "name");
        for (String b2 : list) {
            if (h.b(b2, str, true)) {
                return true;
            }
        }
        return false;
    }

    public static final String e() {
        SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str = c().getPackageName() + f.g() + "app_oauth_token";
        i.e(str, "key");
        return sharedPreferences.getString(str, "");
    }

    public static final void e0(AppCompatActivity appCompatActivity) {
        DrawerLayout drawerLayout;
        i.e(appCompatActivity, "$this$hideMenu");
        if (i.a(K(), "menu:tabs")) {
            FrameLayout frameLayout = (FrameLayout) appCompatActivity.findViewById(R.id.tab_menu);
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        } else if ((i.a(K(), "menu:slide") || i.a(K(), "menu:side")) && (drawerLayout = (DrawerLayout) appCompatActivity.findViewById(R.id.drawer_menu)) != null) {
            drawerLayout.setDrawerLockMode(1);
        }
    }

    public static final boolean f() {
        SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        i.e("app_process_id", "key");
        if (sharedPreferences.getInt("app_process_id", 0) != Process.myPid()) {
            return true;
        }
        return false;
    }

    public static final void f0(AppCompatActivity appCompatActivity) {
        i.e(appCompatActivity, "$this$hideStatusBar");
        appCompatActivity.getWindow().setFlags(1024, 1024);
    }

    public static final g0 g(List<b.a.a.i.d> list) {
        String str;
        String str2;
        i.e(list, "$this$asRequestBodyWithFile");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<b.a.a.i.d> it = list.iterator();
        while (true) {
            Editable editable = null;
            if (!it.hasNext()) {
                break;
            }
            b.a.a.i.d next = it.next();
            if (i.a(next.a, "component:input-date") || i.a(next.a, "component:date")) {
                str = next.f310b;
                EditText editText = next.c;
                if (editText != null) {
                    editable = editText.getText();
                }
                str2 = m.c(String.valueOf(editable));
            } else if (i.a(next.a, "component:input-image")) {
                File file = next.d;
                if (file != null) {
                    String str3 = next.f310b;
                    String name = file.getName();
                    String str4 = next.f313h;
                    String valueOf = String.valueOf(file.length());
                    i.d(valueOf, "java.lang.String.valueOf(imageFile.length())");
                    linkedHashMap.put(str3, new UploadFile(name, "image/jpeg", str4, Integer.valueOf(Integer.parseInt(valueOf))));
                }
            } else if (i.a(next.a, "component:input-file")) {
                linkedHashMap.put(next.f310b, new UploadFile(next.f311e, next.f312g, next.f313h, next.f));
            } else {
                str = next.f310b;
                EditText editText2 = next.c;
                if (editText2 != null) {
                    editable = editText2.getText();
                }
                str2 = String.valueOf(editable);
            }
            linkedHashMap.put(str, str2);
        }
        b.a.a.m.b bVar = b.a.a.m.b.f349m;
        String d = b.a.a.m.b.f344h.d(linkedHashMap);
        i.d(d, "Moshify.formInputsWithIm…stance.toJson(idValueMap)");
        b0.a aVar = b0.f10048e;
        b0 b2 = b0.a.b("application/json; charset=utf-8");
        i.e(d, "$this$toRequestBody");
        Charset charset = e.c0.a.a;
        if (b2 != null) {
            Pattern pattern = b0.c;
            Charset a = b2.a((Charset) null);
            if (a == null) {
                b2 = b0.a.b(b2 + "; charset=utf-8");
            } else {
                charset = a;
            }
        }
        byte[] bytes = d.getBytes(charset);
        i.d(bytes, "(this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        i.e(bytes, "$this$toRequestBody");
        n.m0.c.c((long) bytes.length, (long) 0, (long) length);
        return new g0.a.C0231a(bytes, b2, length, 0);
    }

    public static final void g0(FragmentManager fragmentManager, l<? super FragmentTransaction, ? extends FragmentTransaction> lVar) {
        i.e(fragmentManager, "$this$inTransaction");
        i.e(lVar, "func");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        i.d(beginTransaction, "beginTransaction()");
        ((FragmentTransaction) lVar.invoke(beginTransaction)).addToBackStack((String) null).commitAllowingStateLoss();
    }

    public static final String h() {
        SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        i.e("auth_token", "key");
        return sharedPreferences.getString("auth_token", "");
    }

    public static final boolean h0(Style style) {
        i.e(style, "$this$isBold");
        Integer num = style.I;
        return num != null && num.intValue() > 400;
    }

    public static final String i() {
        SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str = c().getPackageName() + f.g() + "bravo_id_token";
        i.e(str, "key");
        return sharedPreferences.getString(str, "");
    }

    public static final boolean i0(Style style) {
        i.e(style, "$this$isFlexo");
        return style.C != null;
    }

    public static final float j(Style style, int i2, int i3) {
        Float f;
        i.e(style, "$this$calculateRadius");
        Coordinate G = G(style, i2, i3);
        Coordinate F = F(style, i2, i3);
        if (G.a == null || G.f7107b == null || (f = F.a) == null || F.f7107b == null) {
            return 0.0f;
        }
        return (float) Math.sqrt((double) (((F.f7107b.floatValue() - G.f7107b.floatValue()) * (F.f7107b.floatValue() - G.f7107b.floatValue())) + ((F.a.floatValue() - G.a.floatValue()) * (f.floatValue() - G.a.floatValue()))));
    }

    public static final Page j0(JsonApp jsonApp, String str, BoundJson boundJson, boolean z) {
        Page page;
        i.e(jsonApp, "$this$mergeAndReturnBoundPage");
        if (boundJson != null) {
            App app2 = jsonApp.d;
            if ((app2 != null ? app2.f : null) != null) {
                ArrayList arrayList = new ArrayList();
                List<Style> list = jsonApp.d.f;
                i.c(list);
                arrayList.addAll(list);
                List<Style> list2 = boundJson.f7074b;
                if (list2 != null) {
                    arrayList.addAll(list2);
                    jsonApp.d.f = g.j(arrayList);
                }
            }
            App app3 = jsonApp.d;
            if ((app3 != null ? app3.f7061b : null) != null) {
                ArrayList arrayList2 = new ArrayList();
                List<Asset> list3 = jsonApp.d.f7061b;
                i.c(list3);
                arrayList2.addAll(list3);
                List<Asset> list4 = boundJson.c;
                if (list4 != null) {
                    arrayList2.addAll(list4);
                    jsonApp.d.f7061b = g.a0(g.j(arrayList2));
                }
            }
            BoundNode boundNode = boundJson.a;
            if ((boundNode != null ? boundNode.a : null) != null) {
                if (str == null || !h.C(str, "http", false, 2)) {
                    page = f.n(boundJson.a.a);
                } else {
                    page = f.n(str);
                }
                if (page != null) {
                    BoundNode boundNode2 = boundJson.a;
                    Container container = boundNode2.f7076e;
                    if (container != null) {
                        page.f7130i = container;
                    }
                    Container container2 = boundNode2.f;
                    if (container2 != null) {
                        page.d = container2;
                    }
                    List<String> list5 = boundNode2.c;
                    if (list5 != null) {
                        page.f7134m = list5;
                    }
                    List<Container> list6 = boundNode2.f7078h;
                    if (list6 != null) {
                        page.f7128g = list6;
                    }
                    if (z) {
                        page.w = boundNode2.f7077g;
                    } else {
                        page.f = boundNode2.f7077g;
                    }
                    String str2 = boundNode2.f7080j;
                    if (str2 != null) {
                        page.f7138q = str2;
                    }
                    page.f7133l = boundJson.d;
                    page.y = str;
                    BravoApp.Q.e(jsonApp, (String) null);
                    b.a.a.h.e.I(page);
                    return page;
                }
            }
        }
        return null;
    }

    public static final void k() {
        SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        StringBuilder y = a.y("intro_already_displayed_");
        BravoApp.b bVar = BravoApp.Q;
        JsonApp jsonApp = BravoApp.f6915o;
        y.append(jsonApp != null ? jsonApp.a : null);
        String sb = y.toString();
        i.e(sb, "key");
        sharedPreferences.edit().remove(sb).apply();
        BravoApp.f6915o = null;
        bVar.d();
        SharedPreferences sharedPreferences2 = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences2, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        i.e("current_json", "key");
        sharedPreferences2.edit().remove("current_json").apply();
    }

    public static final String k0(int i2) {
        String str;
        String str2;
        int i3 = i2 / 3600000;
        int i4 = i2 % 3600000;
        int i5 = i4 / 60000;
        int i6 = (i4 % 60000) / 1000;
        if (i3 > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append(':');
            str = sb.toString();
        } else {
            str = "";
        }
        if (i6 < 10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i6);
            str2 = sb2.toString();
        } else {
            str2 = a.g("", i6);
        }
        return str + i5 + ':' + str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r5.f7109b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final b.a.a.i.b l(com.appfoundry.previewer.model.Dimensions r5, int r6, int r7, boolean r8, int r9) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x000c
            java.lang.Float r1 = r5.f7109b
            if (r1 == 0) goto L_0x000c
            float r1 = r1.floatValue()
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            float r1 = b.a.a.n.c.q(r1, r7)
            if (r5 == 0) goto L_0x001c
            java.lang.Float r2 = r5.d
            if (r2 == 0) goto L_0x001c
            float r2 = r2.floatValue()
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            float r2 = b.a.a.n.c.q(r2, r7)
            if (r8 == 0) goto L_0x0026
            float r8 = (float) r9
            float r2 = r2 - r8
            goto L_0x002a
        L_0x0026:
            if (r9 == 0) goto L_0x002a
            float r8 = (float) r9
            float r2 = r2 + r8
        L_0x002a:
            com.appfoundry.previewer.model.Dimensions r8 = new com.appfoundry.previewer.model.Dimensions
            if (r5 == 0) goto L_0x0037
            java.lang.Float r9 = r5.a
            if (r9 == 0) goto L_0x0037
            float r9 = r9.floatValue()
            goto L_0x0038
        L_0x0037:
            r9 = r0
        L_0x0038:
            float r9 = b.a.a.n.c.q(r9, r6)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            if (r5 == 0) goto L_0x004b
            java.lang.Float r3 = r5.f7109b
            if (r3 == 0) goto L_0x004b
            float r3 = r3.floatValue()
            goto L_0x004c
        L_0x004b:
            r3 = r0
        L_0x004c:
            float r3 = b.a.a.n.c.q(r3, r7)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            if (r5 == 0) goto L_0x005f
            java.lang.Float r5 = r5.c
            if (r5 == 0) goto L_0x005f
            float r5 = r5.floatValue()
            goto L_0x0060
        L_0x005f:
            r5 = r0
        L_0x0060:
            float r5 = b.a.a.n.c.q(r5, r6)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            r8.<init>(r9, r3, r5, r4)
            r5 = 0
            float r5 = (float) r5
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0076
            float r1 = r1 + r2
        L_0x0076:
            b.a.a.i.b r5 = new b.a.a.i.b
            if (r9 == 0) goto L_0x007f
            float r9 = r9.floatValue()
            goto L_0x0080
        L_0x007f:
            r9 = r0
        L_0x0080:
            java.lang.Float r2 = r8.c
            if (r2 == 0) goto L_0x0089
            float r2 = r2.floatValue()
            goto L_0x008a
        L_0x0089:
            r2 = r0
        L_0x008a:
            float r9 = r9 + r2
            int r9 = (int) r9
            int r6 = r6 - r9
            java.lang.Float r9 = r8.f7109b
            if (r9 == 0) goto L_0x0096
            float r9 = r9.floatValue()
            goto L_0x0097
        L_0x0096:
            r9 = r0
        L_0x0097:
            java.lang.Float r2 = r8.d
            if (r2 == 0) goto L_0x009f
            float r0 = r2.floatValue()
        L_0x009f:
            float r9 = r9 + r0
            int r9 = (int) r9
            int r7 = r7 - r9
            java.lang.Float r9 = java.lang.Float.valueOf(r1)
            r5.<init>(r6, r7, r8, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.l(com.appfoundry.previewer.model.Dimensions, int, int, boolean, int):b.a.a.i.b");
    }

    public static final void l0(AppCompatActivity appCompatActivity) {
        i.e(appCompatActivity, "$this$modifyEnterTransition");
        appCompatActivity.overridePendingTransition(R.anim.enter_100_from_bottom, R.anim.quiet);
    }

    public static /* synthetic */ b.a.a.i.b m(Dimensions dimensions, int i2, int i3, boolean z, int i4, int i5) {
        if ((i5 & 8) != 0) {
            z = false;
        }
        if ((i5 & 16) != 0) {
            i4 = 0;
        }
        return l(dimensions, i2, i3, z, i4);
    }

    public static final void m0(AppCompatActivity appCompatActivity) {
        i.e(appCompatActivity, "$this$modifyExitTransition");
        appCompatActivity.overridePendingTransition(0, R.anim.exit_100_to_bottom);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.appfoundry.previewer.model.Dimensions n(com.appfoundry.previewer.model.Dimensions r5, int r6) {
        /*
            com.appfoundry.previewer.model.Dimensions r0 = new com.appfoundry.previewer.model.Dimensions
            r1 = 0
            if (r5 == 0) goto L_0x000e
            java.lang.Float r2 = r5.a
            if (r2 == 0) goto L_0x000e
            float r2 = r2.floatValue()
            goto L_0x000f
        L_0x000e:
            r2 = r1
        L_0x000f:
            float r2 = b.a.a.n.c.q(r2, r6)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            if (r5 == 0) goto L_0x0022
            java.lang.Float r3 = r5.f7109b
            if (r3 == 0) goto L_0x0022
            float r3 = r3.floatValue()
            goto L_0x0023
        L_0x0022:
            r3 = r1
        L_0x0023:
            float r3 = b.a.a.n.c.q(r3, r6)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            if (r5 == 0) goto L_0x0036
            java.lang.Float r4 = r5.c
            if (r4 == 0) goto L_0x0036
            float r4 = r4.floatValue()
            goto L_0x0037
        L_0x0036:
            r4 = r1
        L_0x0037:
            float r4 = b.a.a.n.c.q(r4, r6)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            if (r5 == 0) goto L_0x0049
            java.lang.Float r5 = r5.d
            if (r5 == 0) goto L_0x0049
            float r1 = r5.floatValue()
        L_0x0049:
            float r5 = b.a.a.n.c.q(r1, r6)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r0.<init>(r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.n(com.appfoundry.previewer.model.Dimensions, int):com.appfoundry.previewer.model.Dimensions");
    }

    public static final void n0(BravoActivity bravoActivity) {
        i.e(bravoActivity, "$this$onLongPressActivity");
        Intent intent = new Intent(bravoActivity, LongPressActivity.class);
        bravoActivity.getIntent().addFlags(67108864);
        bravoActivity.getIntent().addFlags(131072);
        bravoActivity.startActivity(intent);
    }

    public static final int o(Style style, float f) {
        i.e(style, "$this$containerWidth");
        Float f2 = style.f7172i;
        if (f2 == null) {
            return 0;
        }
        return (int) (((float) (b.a.a.n.c.t() * ((int) ((f2.floatValue() * f) / 100.0f)))) / 100.0f);
    }

    public static final void o0(BravoActivity bravoActivity, String str, boolean z, boolean z2) {
        i.e(bravoActivity, "$this$openModalActivity");
        Intent intent = new Intent(bravoActivity, ModalActivity.class);
        intent.putExtra("page_id", str);
        intent.putExtra("building_intro_from_shake_page", z2);
        if (z) {
            intent.putExtra("is_menu", z);
        }
        bravoActivity.startActivity(intent);
    }

    public static final Drawable p(Style style, int i2) {
        Integer num;
        i.e(style, "$this$createBackgroundWithBorders");
        K0(style);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Float f = style.x;
        if (f != null && f.floatValue() > ((float) 0)) {
            int floatValue = (int) ((style.x.floatValue() * ((float) i2)) / 100.0f);
            String str = style.y;
            gradientDrawable.setStroke(floatValue, str != null ? m.m(str) : ViewCompat.MEASURED_STATE_MASK);
        }
        String str2 = style.c;
        if (str2 != null) {
            gradientDrawable.setColor(m.m(str2));
        }
        if (!(style.B == null || (num = style.O) == null)) {
            gradientDrawable.setCornerRadii(w(style, num.intValue()));
        }
        return gradientDrawable;
    }

    public static final String p0(Asset asset) {
        i.e(asset, "$this$path");
        return C() + asset.a;
    }

    public static final b.a.a.b.f q(Style style, int i2) {
        i.e(style, "$this$createCornerRadiiTransformation");
        K0(style);
        if (style.B != null) {
            return new b.a.a.b.f(w(style, i2));
        }
        Float f = style.A;
        i.c(f);
        return new b.a.a.b.f((f.floatValue() * ((float) i2)) / 100.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String q0(com.appfoundry.previewer.model.ResponseBody r5) {
        /*
            java.lang.String r0 = "$this$printError"
            e.x.c.i.e(r5, r0)
            java.lang.String r0 = r5.f7155b
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0037
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r5.f7155b
            java.lang.String r4 = r5.c
            if (r4 == 0) goto L_0x005d
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            if (r2 == 0) goto L_0x005d
            java.lang.String r2 = " ("
            java.lang.StringBuilder r0 = b.e.a.a.a.B(r0, r2)
            java.lang.String r5 = r5.c
            r2 = 41
            java.lang.String r0 = b.e.a.a.a.p(r0, r5, r2)
            goto L_0x005d
        L_0x0037:
            java.lang.String r0 = r5.c
            if (r0 == 0) goto L_0x0048
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r2 = r3
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            java.lang.String r0 = r5.c
            goto L_0x005d
        L_0x0048:
            java.lang.Integer r0 = r5.a
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "Error "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.Integer r5 = r5.a
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            goto L_0x005d
        L_0x005c:
            r0 = r1
        L_0x005d:
            boolean r5 = e.x.c.i.a(r0, r1)
            if (r5 == 0) goto L_0x0065
            java.lang.String r0 = "Unknown error. Please contact support@bravostudio.app"
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.q0(com.appfoundry.previewer.model.ResponseBody):java.lang.String");
    }

    public static final Fragment r(BravoActivity bravoActivity) {
        i.e(bravoActivity, "$this$currentlyVisibleFragment");
        FragmentManager supportFragmentManager = bravoActivity.getSupportFragmentManager();
        i.d(supportFragmentManager, "supportFragmentManager");
        List<Fragment> fragments = supportFragmentManager.getFragments();
        i.d(fragments, "supportFragmentManager.fragments");
        return (Fragment) g.z(fragments);
    }

    public static final void r0(AppCompatActivity appCompatActivity) {
        i.e(appCompatActivity, "$this$registerInEventBus");
        if (!c.b().f(appCompatActivity)) {
            c.b().k(appCompatActivity);
        }
    }

    public static final byte[] s(String str) {
        i.e(str, "hexString");
        if (str.length() % 2 != 1) {
            byte[] bArr = new byte[(str.length() / 2)];
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = i2 / 2;
                int i4 = i2 + 2;
                String substring = str.substring(i2, i4);
                i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                i.e(substring, "hexString");
                bArr[i3] = (byte) ((I0(substring.charAt(0)) << 4) + I0(substring.charAt(1)));
                i2 = i4;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Invalid hexadecimal String supplied.".toString());
    }

    public static final void s0(FragmentActivity fragmentActivity, Fragment fragment) {
        i.e(fragmentActivity, "$this$removeLoadingFragment");
        i.e(fragment, "fragment");
        fragmentActivity.getSupportFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
        FrameLayout frameLayout = (FrameLayout) fragmentActivity.findViewById(R.id.containerLoading);
        if (frameLayout != null) {
            frameLayout.setBackground((Drawable) null);
        }
    }

    public static final Fragment t(FragmentActivity fragmentActivity, String str) {
        i.e(fragmentActivity, "$this$findFragmentByTag");
        return fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
    }

    public static final void t0(AppCompatActivity appCompatActivity, b.a.a.a.b bVar, int i2) {
        i.e(appCompatActivity, "$this$replaceFragment");
        if (bVar != null) {
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            i.d(supportFragmentManager, "supportFragmentManager");
            g0(supportFragmentManager, new b.a.a.h.b(i2, bVar));
            BravoApp.b bVar2 = BravoApp.Q;
            Page page = bVar.f74h;
            String str = page != null ? page.a : null;
            BravoApp.f6909i++;
            List<String> list = BravoApp.f6910j;
            if (str == null) {
                str = "";
            }
            list.add(str);
        }
    }

    public static final String u() {
        SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str = c().getPackageName() + f.g() + "firebase_id_token";
        i.e(str, "key");
        return sharedPreferences.getString(str, "");
    }

    public static final void u0(AppCompatActivity appCompatActivity, Page page, int i2) {
        i.e(appCompatActivity, "$this$replaceFragment");
        String str = null;
        b.a.a.a.b f = page != null ? b.a.a.h.e.f(page, (Boolean) null, 1) : null;
        if (f != null) {
            FragmentTransaction beginTransaction = appCompatActivity.getSupportFragmentManager().beginTransaction();
            if (b.a.a.h.e.x(page, "transition:slide:left")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_right, R.anim.exit_30_to_left, R.anim.enter_30_from_left, R.anim.exit_100_to_right);
            } else if (b.a.a.h.e.x(page, "transition:slide:up")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_bottom, R.anim.exit_30_to_top, R.anim.enter_30_from_top, R.anim.exit_100_to_bottom);
            } else if (b.a.a.h.e.x(page, "transition:slide:down")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_top, R.anim.exit_30_to_bottom, R.anim.enter_30_from_bottom, R.anim.exit_100_to_top);
            } else if (b.a.a.h.e.x(page, "transition:slide:right")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_left, R.anim.exit_30_to_right, R.anim.enter_30_from_right, R.anim.exit_100_to_left);
            } else if (b.a.a.h.e.x(page, "transition:move:left")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_right, R.anim.quiet, R.anim.quiet, R.anim.exit_100_to_right);
            } else if (b.a.a.h.e.x(page, "transition:move:up")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_bottom, R.anim.quiet, R.anim.quiet, R.anim.exit_100_to_bottom);
            } else if (b.a.a.h.e.x(page, "transition:move:down")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_top, R.anim.quiet, R.anim.quiet, R.anim.exit_100_to_top);
            } else if (b.a.a.h.e.x(page, "transition:move:right")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_left, R.anim.quiet, R.anim.quiet, R.anim.exit_100_to_left);
            } else if (b.a.a.h.e.x(page, "transition:push:left")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_right, R.anim.exit_100_to_left, R.anim.enter_100_from_left, R.anim.exit_100_to_right);
            } else if (b.a.a.h.e.x(page, "transition:push:up")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_bottom, R.anim.exit_100_to_top, R.anim.enter_100_from_top, R.anim.exit_100_to_bottom);
            } else if (b.a.a.h.e.x(page, "transition:push:down")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_top, R.anim.exit_100_to_bottom, R.anim.enter_100_from_bottom, R.anim.exit_100_to_top);
            } else if (b.a.a.h.e.x(page, "transition:push:right")) {
                beginTransaction.setCustomAnimations(R.anim.enter_100_from_left, R.anim.exit_100_to_right, R.anim.enter_100_from_right, R.anim.exit_100_to_left);
            } else if (!b.a.a.h.e.x(page, "transition:dissolve") && b.a.a.h.e.x(page, "transition:instant")) {
                beginTransaction.setCustomAnimations(R.anim.quiet, R.anim.quiet, R.anim.quiet, R.anim.quiet);
            } else {
                beginTransaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
            }
            beginTransaction.replace(i2, f, page.a).addToBackStack((String) null).commitAllowingStateLoss();
            BravoApp.b bVar = BravoApp.Q;
            Page page2 = f.f74h;
            if (page2 != null) {
                str = page2.a;
            }
            BravoApp.f6909i++;
            List<String> list = BravoApp.f6910j;
            if (str == null) {
                str = "";
            }
            list.add(str);
        }
    }

    public static final boolean v() {
        SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str = c().getPackageName() + "after_logout";
        i.e(str, "key");
        return sharedPreferences.getBoolean(str, false);
    }

    public static final void v0(b.l.b.a.a.b.f fVar) {
        if (fVar != null) {
            SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
            i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
            String str = c().getPackageName() + f.g() + "app_oauth_token";
            String accessToken = fVar.getAccessToken();
            i.d(accessToken, "credential.accessToken");
            i.e(str, "key");
            i.e(accessToken, "value");
            sharedPreferences.edit().putString(str, accessToken).apply();
            SharedPreferences sharedPreferences2 = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
            i.d(sharedPreferences2, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
            String str2 = c().getPackageName() + f.g() + "refreshToken";
            String refreshToken = fVar.getRefreshToken();
            i.d(refreshToken, "credential.refreshToken");
            i.e(str2, "key");
            i.e(refreshToken, "value");
            sharedPreferences2.edit().putString(str2, refreshToken).apply();
            SharedPreferences sharedPreferences3 = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
            i.d(sharedPreferences3, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
            String str3 = c().getPackageName() + f.g() + "expirationTimeMilliseconds";
            String valueOf = String.valueOf(fVar.getExpirationTimeMilliseconds().longValue());
            i.e(str3, "key");
            i.e(valueOf, "value");
            sharedPreferences3.edit().putString(str3, valueOf).apply();
        }
    }

    public static final float[] w(Style style, int i2) {
        float f;
        float f2;
        float f3;
        i.e(style, "$this$generateCornerRadii");
        List<Float> list = style.B;
        Float f4 = null;
        float f5 = 0.0f;
        if ((list != null ? list.get(0) : null) != null) {
            List<Float> list2 = style.B;
            Float f6 = list2 != null ? list2.get(0) : null;
            i.c(f6);
            f = (f6.floatValue() * ((float) i2)) / 100.0f;
        } else {
            f = 0.0f;
        }
        List<Float> list3 = style.B;
        if ((list3 != null ? list3.get(1) : null) != null) {
            List<Float> list4 = style.B;
            Float f7 = list4 != null ? list4.get(1) : null;
            i.c(f7);
            f2 = (f7.floatValue() * ((float) i2)) / 100.0f;
        } else {
            f2 = 0.0f;
        }
        List<Float> list5 = style.B;
        if ((list5 != null ? list5.get(2) : null) != null) {
            List<Float> list6 = style.B;
            Float f8 = list6 != null ? list6.get(2) : null;
            i.c(f8);
            f3 = (f8.floatValue() * ((float) i2)) / 100.0f;
        } else {
            f3 = 0.0f;
        }
        List<Float> list7 = style.B;
        if ((list7 != null ? list7.get(3) : null) != null) {
            List<Float> list8 = style.B;
            if (list8 != null) {
                f4 = list8.get(3);
            }
            i.c(f4);
            f5 = (f4.floatValue() * ((float) i2)) / 100.0f;
        }
        return new float[]{f, f, f2, f2, f3, f3, f5, f5};
    }

    public static final void w0() {
        SharedPreferences sharedPreferences = c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str = c().getPackageName() + f.g() + "app_user_logged_in";
        i.e(str, "key");
        sharedPreferences.edit().putBoolean(str, true).apply();
    }

    public static final String x(List<String> list) {
        i.e(list, "$this$getActionTag");
        for (String next : list) {
            i.e(next, "$this$isActionTag");
            if (h.b(next, "action:", true)) {
                return next;
            }
        }
        return null;
    }

    public static final int x0(Style style) {
        i.e(style, "$this$screenHeightInPixels");
        Float f = style.f7173j;
        if (f == null) {
            return 0;
        }
        float floatValue = f.floatValue();
        BravoApp.b bVar = BravoApp.Q;
        return (int) ((floatValue * ((float) BravoApp.N)) / 100.0f);
    }

    public static final String y(Actions actions, String str) {
        i.e(str, "actionInTags");
        if ((actions != null ? R(actions) : null) != null) {
            return R(actions);
        }
        i.e(str, "$this$getUrlFromTag");
        return m.e(str);
    }

    public static final int y0(Style style) {
        i.e(style, "$this$screenWidthInPixels");
        Float f = style.f7172i;
        if (f == null) {
            return 0;
        }
        i.c(f);
        return (int) ((f.floatValue() * ((float) b.a.a.n.c.t())) / 100.0f);
    }

    public static final String z(List<String> list) {
        i.e(list, "$this$getComponentTag");
        for (String next : list) {
            i.e(next, "$this$isComponentTag");
            if (h.b(next, "component:", true)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void z0(android.widget.FrameLayout.LayoutParams r4, com.appfoundry.previewer.model.Dimensions r5) {
        /*
            java.lang.String r0 = "$this$setComputedMargins"
            e.x.c.i.e(r4, r0)
            r0 = 0
            if (r5 == 0) goto L_0x0012
            java.lang.Float r1 = r5.d
            if (r1 == 0) goto L_0x0012
            float r1 = r1.floatValue()
            int r1 = (int) r1
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            if (r5 == 0) goto L_0x001f
            java.lang.Float r2 = r5.a
            if (r2 == 0) goto L_0x001f
            float r2 = r2.floatValue()
            int r2 = (int) r2
            goto L_0x0020
        L_0x001f:
            r2 = r0
        L_0x0020:
            if (r5 == 0) goto L_0x002c
            java.lang.Float r3 = r5.f7109b
            if (r3 == 0) goto L_0x002c
            float r3 = r3.floatValue()
            int r3 = (int) r3
            goto L_0x002d
        L_0x002c:
            r3 = r0
        L_0x002d:
            if (r5 == 0) goto L_0x0038
            java.lang.Float r5 = r5.c
            if (r5 == 0) goto L_0x0038
            float r5 = r5.floatValue()
            int r0 = (int) r5
        L_0x0038:
            r4.setMargins(r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.e.z0(android.widget.FrameLayout$LayoutParams, com.appfoundry.previewer.model.Dimensions):void");
    }
}
