package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import b.l.f.e;
import b.m.a.d;
import b.m.a.g;
import b.m.a.h;
import b.m.a.i;
import b.m.a.j;
import b.m.a.k;
import b.m.a.l;
import b.m.a.m;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BarcodeView extends d {
    public b I = b.NONE;
    public b.m.a.a J = null;
    public j K;
    public h L;
    public Handler M;
    public final Handler.Callback N;

    public class a implements Handler.Callback {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r1 = r4.a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r5) {
            /*
                r4 = this;
                com.journeyapps.barcodescanner.BarcodeView$b r0 = com.journeyapps.barcodescanner.BarcodeView.b.NONE
                int r1 = r5.what
                r2 = 1
                r3 = 2131231310(0x7f08024e, float:1.8078697E38)
                if (r1 != r3) goto L_0x002e
                java.lang.Object r5 = r5.obj
                b.m.a.b r5 = (b.m.a.b) r5
                if (r5 == 0) goto L_0x002d
                com.journeyapps.barcodescanner.BarcodeView r1 = com.journeyapps.barcodescanner.BarcodeView.this
                b.m.a.a r3 = r1.J
                if (r3 == 0) goto L_0x002d
                com.journeyapps.barcodescanner.BarcodeView$b r1 = r1.I
                if (r1 == r0) goto L_0x002d
                r3.a(r5)
                com.journeyapps.barcodescanner.BarcodeView r5 = com.journeyapps.barcodescanner.BarcodeView.this
                com.journeyapps.barcodescanner.BarcodeView$b r1 = r5.I
                com.journeyapps.barcodescanner.BarcodeView$b r3 = com.journeyapps.barcodescanner.BarcodeView.b.SINGLE
                if (r1 != r3) goto L_0x002d
                r5.I = r0
                r0 = 0
                r5.J = r0
                r5.k()
            L_0x002d:
                return r2
            L_0x002e:
                r3 = 2131231309(0x7f08024d, float:1.8078695E38)
                if (r1 != r3) goto L_0x0034
                return r2
            L_0x0034:
                r3 = 2131231311(0x7f08024f, float:1.80787E38)
                if (r1 != r3) goto L_0x004b
                java.lang.Object r5 = r5.obj
                java.util.List r5 = (java.util.List) r5
                com.journeyapps.barcodescanner.BarcodeView r1 = com.journeyapps.barcodescanner.BarcodeView.this
                b.m.a.a r3 = r1.J
                if (r3 == 0) goto L_0x004a
                com.journeyapps.barcodescanner.BarcodeView$b r1 = r1.I
                if (r1 == r0) goto L_0x004a
                r3.b(r5)
            L_0x004a:
                return r2
            L_0x004b:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.BarcodeView.a.handleMessage(android.os.Message):boolean");
        }
    }

    public enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a();
        this.N = aVar;
        this.L = new k();
        this.M = new Handler(aVar);
    }

    public void d() {
        k();
        super.d();
    }

    public void e() {
        j();
    }

    public h getDecoderFactory() {
        return this.L;
    }

    public final g i() {
        if (this.L == null) {
            this.L = new k();
        }
        i iVar = new i();
        HashMap hashMap = new HashMap();
        hashMap.put(e.NEED_RESULT_POINT_CALLBACK, iVar);
        k kVar = (k) this.L;
        Objects.requireNonNull(kVar);
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.putAll(hashMap);
        Map<e, ?> map = kVar.f5927b;
        if (map != null) {
            enumMap.putAll(map);
        }
        Collection<b.l.f.a> collection = kVar.a;
        if (collection != null) {
            enumMap.put(e.POSSIBLE_FORMATS, collection);
        }
        String str = kVar.c;
        if (str != null) {
            enumMap.put(e.CHARACTER_SET, str);
        }
        b.l.f.k kVar2 = new b.l.f.k();
        kVar2.e(enumMap);
        int i2 = kVar.d;
        g gVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? new g(kVar2) : new m(kVar2) : new l(kVar2) : new g(kVar2);
        iVar.a = gVar;
        return gVar;
    }

    public final void j() {
        k();
        if (this.I != b.NONE && this.f5899n) {
            j jVar = new j(getCameraInstance(), i(), this.M);
            this.K = jVar;
            jVar.f = getPreviewFramingRect();
            j jVar2 = this.K;
            Objects.requireNonNull(jVar2);
            b.l.f.x.a.g.r0();
            HandlerThread handlerThread = new HandlerThread(j.f5920k);
            jVar2.f5921b = handlerThread;
            handlerThread.start();
            jVar2.c = new Handler(jVar2.f5921b.getLooper(), jVar2.f5925i);
            jVar2.f5923g = true;
            jVar2.a();
        }
    }

    public final void k() {
        j jVar = this.K;
        if (jVar != null) {
            Objects.requireNonNull(jVar);
            b.l.f.x.a.g.r0();
            synchronized (jVar.f5924h) {
                jVar.f5923g = false;
                jVar.c.removeCallbacksAndMessages((Object) null);
                jVar.f5921b.quit();
            }
            this.K = null;
        }
    }

    public void setDecoderFactory(h hVar) {
        b.l.f.x.a.g.r0();
        this.L = hVar;
        j jVar = this.K;
        if (jVar != null) {
            jVar.d = i();
        }
    }
}
