package b.a.a.b;

import b.l.a.c.h.d;
import com.appfoundry.previewer.model.Params;

public final class e implements d {
    public final /* synthetic */ Params a;

    public e(Params params) {
        this.a = params;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r5 = r3.t;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(b.l.a.c.h.a r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            android.content.Context r3 = b.f.a.e.c()
            b.l.a.c.h.c.a(r3)
            com.appfoundry.previewer.model.Params r3 = r1.a
            r4 = 0
            if (r3 == 0) goto L_0x0019
            com.appfoundry.previewer.model.Map r5 = r3.t
            if (r5 == 0) goto L_0x0019
            java.lang.Boolean r5 = r5.c
            goto L_0x001a
        L_0x0019:
            r5 = r4
        L_0x001a:
            java.lang.String r6 = "map"
            r7 = 0
            if (r5 == 0) goto L_0x0029
            com.appfoundry.previewer.model.Map r3 = r3.t
            java.lang.Boolean r3 = r3.c
            boolean r3 = e.x.c.i.a(r3, r2)
            if (r3 == 0) goto L_0x004d
        L_0x0029:
            e.x.c.i.d(r0, r6)
            b.l.a.c.h.e r3 = r0.f3863b     // Catch:{ RemoteException -> 0x0275 }
            if (r3 != 0) goto L_0x003d
            b.l.a.c.h.e r3 = new b.l.a.c.h.e     // Catch:{ RemoteException -> 0x0275 }
            b.l.a.c.h.f.b r5 = r0.a     // Catch:{ RemoteException -> 0x0275 }
            b.l.a.c.h.f.d r5 = r5.N()     // Catch:{ RemoteException -> 0x0275 }
            r3.<init>(r5)     // Catch:{ RemoteException -> 0x0275 }
            r0.f3863b = r3     // Catch:{ RemoteException -> 0x0275 }
        L_0x003d:
            b.l.a.c.h.e r3 = r0.f3863b     // Catch:{ RemoteException -> 0x0275 }
            java.util.Objects.requireNonNull(r3)
            b.l.a.c.h.f.d r3 = r3.a     // Catch:{ RemoteException -> 0x026e }
            r3.Y(r7)     // Catch:{ RemoteException -> 0x026e }
            r3 = -1
            b.l.a.c.h.f.b r5 = r0.a     // Catch:{ RemoteException -> 0x0267 }
            r5.p(r3)     // Catch:{ RemoteException -> 0x0267 }
        L_0x004d:
            e.x.c.i.d(r0, r6)
            com.appfoundry.previewer.model.Params r3 = r1.a
            e.x.c.i.e(r0, r6)
            if (r3 == 0) goto L_0x005a
            java.util.List<com.appfoundry.previewer.model.Marker> r5 = r3.u
            goto L_0x005b
        L_0x005a:
            r5 = r4
        L_0x005b:
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L_0x0111
            b.a.a.n.d r5 = new b.a.a.n.d
            r5.<init>(r3)
            b.l.a.c.h.f.b r10 = r0.a     // Catch:{ RemoteException -> 0x010a }
            b.l.a.c.h.j r11 = new b.l.a.c.h.j     // Catch:{ RemoteException -> 0x010a }
            r11.<init>(r5)     // Catch:{ RemoteException -> 0x010a }
            r10.P0(r11)     // Catch:{ RemoteException -> 0x010a }
            java.util.List<com.appfoundry.previewer.model.Marker> r3 = r3.u
            java.util.Iterator r3 = r3.iterator()
        L_0x0074:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0111
            java.lang.Object r5 = r3.next()
            com.appfoundry.previewer.model.Marker r5 = (com.appfoundry.previewer.model.Marker) r5
            e.x.c.i.e(r0, r6)
            java.lang.String r10 = "marker"
            e.x.c.i.e(r5, r10)
            e.x.c.u r11 = new e.x.c.u
            r11.<init>()
            com.appfoundry.previewer.model.Properties r12 = r5.c
            if (r12 == 0) goto L_0x0094
            java.lang.String r12 = r12.a
            goto L_0x0095
        L_0x0094:
            r12 = r4
        L_0x0095:
            if (r12 == 0) goto L_0x00e4
            android.content.Context r12 = b.f.a.e.c()
            b.h.a.i r12 = b.h.a.c.d(r12)
            b.h.a.h r12 = r12.l()
            e.x.c.i.e(r5, r10)
            com.appfoundry.previewer.model.Properties r10 = r5.c
            if (r10 == 0) goto L_0x00bb
            java.lang.String r10 = r10.a
            if (r10 == 0) goto L_0x00bb
            java.lang.String r13 = "http"
            boolean r10 = e.c0.h.C(r10, r13, r7, r8)
            if (r10 != r9) goto L_0x00bb
            com.appfoundry.previewer.model.Properties r10 = r5.c
            java.lang.String r10 = r10.a
            goto L_0x00cd
        L_0x00bb:
            com.appfoundry.previewer.model.Properties r10 = r5.c
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = r10.a
            goto L_0x00c3
        L_0x00c2:
            r10 = r4
        L_0x00c3:
            com.appfoundry.previewer.model.Asset r10 = b.a.a.n.f.h(r10, r2)
            if (r10 == 0) goto L_0x00cc
            java.lang.String r10 = r10.f7065b
            goto L_0x00cd
        L_0x00cc:
            r10 = r4
        L_0x00cd:
            b.h.a.h r10 = r12.G(r10)
            b.a.a.n.e r12 = new b.a.a.n.e
            r12.<init>(r11, r0, r5)
            java.util.Objects.requireNonNull(r10)
            java.util.concurrent.Executor r5 = b.h.a.s.e.a
            r10.D(r12, r4, r10, r5)
            java.lang.String r5 = "Glide.with(appContext())…         }\n            })"
            e.x.c.i.d(r12, r5)
            goto L_0x0074
        L_0x00e4:
            b.l.a.c.h.g.c r10 = b.a.a.n.c.w(r5)
            b.l.a.c.h.g.b r10 = r0.a(r10)
            java.lang.String r12 = "map.addMarker(withMarkerOptions(marker))"
            e.x.c.i.d(r10, r12)
            r11.f7989h = r10
            java.lang.String r5 = b.f.a.e.I(r5)
            b.l.a.c.f.h.g r10 = r10.a     // Catch:{ RemoteException -> 0x0103 }
            b.l.a.c.d.d r11 = new b.l.a.c.d.d     // Catch:{ RemoteException -> 0x0103 }
            r11.<init>(r5)     // Catch:{ RemoteException -> 0x0103 }
            r10.W(r11)     // Catch:{ RemoteException -> 0x0103 }
            goto L_0x0074
        L_0x0103:
            r0 = move-exception
            b.l.a.c.h.g.d r2 = new b.l.a.c.h.g.d
            r2.<init>(r0)
            throw r2
        L_0x010a:
            r0 = move-exception
            b.l.a.c.h.g.d r2 = new b.l.a.c.h.g.d
            r2.<init>(r0)
            throw r2
        L_0x0111:
            com.appfoundry.previewer.model.Params r2 = r1.a
            java.lang.String r3 = "null reference"
            java.lang.String r5 = "CameraUpdateFactory is not initialized"
            if (r2 == 0) goto L_0x01ac
            java.lang.String r6 = "$this$hasCenterMap"
            e.x.c.i.e(r2, r6)
            com.appfoundry.previewer.model.Map r2 = r2.t
            if (r2 == 0) goto L_0x0124
            java.util.List<java.lang.Float> r4 = r2.f7124b
        L_0x0124:
            if (r4 == 0) goto L_0x0130
            java.util.List<java.lang.Float> r2 = r2.f7124b
            int r2 = r2.size()
            if (r2 != r8) goto L_0x0130
            r2 = r9
            goto L_0x0131
        L_0x0130:
            r2 = r7
        L_0x0131:
            if (r2 != r9) goto L_0x01ac
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            com.appfoundry.previewer.model.Params r4 = r1.a
            java.lang.String r6 = "$this$getMapCenterLatitude"
            e.x.c.i.e(r4, r6)
            com.appfoundry.previewer.model.Map r4 = r4.t
            if (r4 == 0) goto L_0x0152
            java.util.List<java.lang.Float> r4 = r4.f7124b
            if (r4 == 0) goto L_0x0152
            java.lang.Object r4 = r4.get(r9)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x0152
            float r4 = r4.floatValue()
            double r8 = (double) r4
            goto L_0x0153
        L_0x0152:
            double r8 = (double) r7
        L_0x0153:
            com.appfoundry.previewer.model.Params r4 = r1.a
            java.lang.String r6 = "$this$getMapCenterLongitude"
            e.x.c.i.e(r4, r6)
            com.appfoundry.previewer.model.Map r4 = r4.t
            if (r4 == 0) goto L_0x0170
            java.util.List<java.lang.Float> r4 = r4.f7124b
            if (r4 == 0) goto L_0x0170
            java.lang.Object r4 = r4.get(r7)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x0170
            float r4 = r4.floatValue()
            double r6 = (double) r4
            goto L_0x0171
        L_0x0170:
            double r6 = (double) r7
        L_0x0171:
            r2.<init>(r8, r6)
            com.appfoundry.previewer.model.Params r4 = r1.a
            java.lang.String r6 = "$this$getMapZoom"
            e.x.c.i.e(r4, r6)
            com.appfoundry.previewer.model.Map r4 = r4.t
            if (r4 == 0) goto L_0x0189
            java.lang.Integer r4 = r4.a
            if (r4 == 0) goto L_0x0189
            int r4 = r4.intValue()
            float r4 = (float) r4
            goto L_0x018b
        L_0x0189:
            r4 = 1094713344(0x41400000, float:12.0)
        L_0x018b:
            b.l.a.c.h.f.a r6 = b.l.a.c.b.a.f     // Catch:{ RemoteException -> 0x01a5 }
            b.l.a.c.b.a.B(r6, r5)     // Catch:{ RemoteException -> 0x01a5 }
            b.l.a.c.d.b r2 = r6.N0(r2, r4)     // Catch:{ RemoteException -> 0x01a5 }
            java.util.Objects.requireNonNull(r2, r3)     // Catch:{ RemoteException -> 0x01a5 }
            b.l.a.c.h.f.b r0 = r0.a     // Catch:{ RemoteException -> 0x019e }
            r0.r0(r2)     // Catch:{ RemoteException -> 0x019e }
            goto L_0x0266
        L_0x019e:
            r0 = move-exception
            b.l.a.c.h.g.d r2 = new b.l.a.c.h.g.d
            r2.<init>(r0)
            throw r2
        L_0x01a5:
            r0 = move-exception
            b.l.a.c.h.g.d r2 = new b.l.a.c.h.g.d
            r2.<init>(r0)
            throw r2
        L_0x01ac:
            com.appfoundry.previewer.model.Params r2 = r1.a
            if (r2 == 0) goto L_0x0266
            java.util.List<com.appfoundry.previewer.model.Marker> r2 = r2.u
            if (r2 == 0) goto L_0x0266
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r9
            if (r2 != r9) goto L_0x0266
            r10 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r12 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r14 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.appfoundry.previewer.model.Params r2 = r1.a
            java.util.List<com.appfoundry.previewer.model.Marker> r2 = r2.u
            java.util.Iterator r2 = r2.iterator()
            r7 = r14
        L_0x01ca:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0228
            java.lang.Object r6 = r2.next()
            com.appfoundry.previewer.model.Marker r6 = (com.appfoundry.previewer.model.Marker) r6
            com.google.android.gms.maps.model.LatLng r6 = b.f.a.e.H(r6)
            r16 = r5
            double r4 = r6.f7314h
            double r10 = java.lang.Math.min(r10, r4)
            double r4 = r6.f7314h
            double r12 = java.lang.Math.max(r12, r4)
            double r4 = r6.f7315i
            boolean r6 = java.lang.Double.isNaN(r14)
            if (r6 == 0) goto L_0x01f2
            r14 = r4
            goto L_0x0224
        L_0x01f2:
            int r6 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x01ff
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0208
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x0208
            goto L_0x020a
        L_0x01ff:
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x020a
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x0208
            goto L_0x020a
        L_0x0208:
            r6 = 0
            goto L_0x020b
        L_0x020a:
            r6 = r9
        L_0x020b:
            if (r6 != 0) goto L_0x0225
            double r17 = r14 - r4
            r19 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r17 = r17 + r19
            double r17 = r17 % r19
            double r21 = r4 - r7
            double r21 = r21 + r19
            double r21 = r21 % r19
            int r6 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r6 >= 0) goto L_0x0224
            r14 = r4
            goto L_0x0225
        L_0x0224:
            r7 = r4
        L_0x0225:
            r5 = r16
            goto L_0x01ca
        L_0x0228:
            r16 = r5
            boolean r2 = java.lang.Double.isNaN(r14)
            r2 = r2 ^ r9
            java.lang.String r4 = "no included points"
            b.l.a.c.b.a.G(r2, r4)
            com.google.android.gms.maps.model.LatLngBounds r2 = new com.google.android.gms.maps.model.LatLngBounds
            com.google.android.gms.maps.model.LatLng r4 = new com.google.android.gms.maps.model.LatLng
            r4.<init>(r10, r14)
            com.google.android.gms.maps.model.LatLng r5 = new com.google.android.gms.maps.model.LatLng
            r5.<init>(r12, r7)
            r2.<init>(r4, r5)
            b.l.a.c.h.f.a r4 = b.l.a.c.b.a.f     // Catch:{ RemoteException -> 0x025f }
            r5 = r16
            b.l.a.c.b.a.B(r4, r5)     // Catch:{ RemoteException -> 0x025f }
            r5 = 0
            b.l.a.c.d.b r2 = r4.v(r2, r5)     // Catch:{ RemoteException -> 0x025f }
            java.util.Objects.requireNonNull(r2, r3)     // Catch:{ RemoteException -> 0x025f }
            b.l.a.c.h.f.b r0 = r0.a     // Catch:{ RemoteException -> 0x0258 }
            r0.r0(r2)     // Catch:{ RemoteException -> 0x0258 }
            goto L_0x0266
        L_0x0258:
            r0 = move-exception
            b.l.a.c.h.g.d r2 = new b.l.a.c.h.g.d
            r2.<init>(r0)
            throw r2
        L_0x025f:
            r0 = move-exception
            b.l.a.c.h.g.d r2 = new b.l.a.c.h.g.d
            r2.<init>(r0)
            throw r2
        L_0x0266:
            return
        L_0x0267:
            r0 = move-exception
            b.l.a.c.h.g.d r2 = new b.l.a.c.h.g.d
            r2.<init>(r0)
            throw r2
        L_0x026e:
            r0 = move-exception
            b.l.a.c.h.g.d r2 = new b.l.a.c.h.g.d
            r2.<init>(r0)
            throw r2
        L_0x0275:
            r0 = move-exception
            b.l.a.c.h.g.d r2 = new b.l.a.c.h.g.d
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.e.a(b.l.a.c.h.a):void");
    }
}
