package j.a.a.a.e.g;

import es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder;

public class e extends Thread {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ SkiaPooledImageRegionDecoder f8085h;

    public e(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
        this.f8085h = skiaPooledImageRegionDecoder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c A[SYNTHETIC, Splitter:B:24:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
        L_0x0000:
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder r0 = r8.f8085h
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder$a r1 = r0.a
            if (r1 == 0) goto L_0x00e0
            monitor-enter(r1)
            java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean> r2 = r1.f8032b     // Catch:{ all -> 0x00dd }
            int r2 = r2.size()     // Catch:{ all -> 0x00dd }
            monitor-exit(r1)
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder r1 = r8.f8085h
            long r3 = r1.f
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            r5 = 4
            if (r2 < r5) goto L_0x001c
            java.lang.String r2 = "No additional decoders allowed, reached hard limit (4)"
            goto L_0x006a
        L_0x001c:
            long r5 = (long) r2
            long r5 = r5 * r3
            r3 = 20971520(0x1400000, double:1.03613076E-316)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0028
            java.lang.String r2 = "No additional encoders allowed, reached hard memory limit (20Mb)"
            goto L_0x006a
        L_0x0028:
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            if (r2 < r3) goto L_0x004d
            java.lang.String r2 = "No additional encoders allowed, limited by CPU cores ("
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            r2.append(r3)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x006a
        L_0x004d:
            android.content.Context r3 = r0.d
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            r4 = 1
            if (r3 == 0) goto L_0x0065
            android.app.ActivityManager$MemoryInfo r7 = new android.app.ActivityManager$MemoryInfo
            r7.<init>()
            r3.getMemoryInfo(r7)
            boolean r3 = r7.lowMemory
            goto L_0x0066
        L_0x0065:
            r3 = r4
        L_0x0066:
            if (r3 == 0) goto L_0x006e
            java.lang.String r2 = "No additional encoders allowed, memory is low"
        L_0x006a:
            r0.d(r2)
            goto L_0x008a
        L_0x006e:
            java.lang.String r1 = "Additional decoder allowed, current count is "
            java.lang.String r3 = ", estimated native memory "
            java.lang.StringBuilder r1 = b.e.a.a.a.z(r1, r2, r3)
            r2 = 1048576(0x100000, double:5.180654E-318)
            long r5 = r5 / r2
            r1.append(r5)
            java.lang.String r2 = "Mb"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            r1 = r4
        L_0x008a:
            if (r1 == 0) goto L_0x00e0
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder r0 = r8.f8085h     // Catch:{ Exception -> 0x00c4 }
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder$a r0 = r0.a     // Catch:{ Exception -> 0x00c4 }
            if (r0 == 0) goto L_0x0000
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00c4 }
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder r2 = r8.f8085h     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r3 = "Starting decoder"
            r2.d(r3)     // Catch:{ Exception -> 0x00c4 }
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder r2 = r8.f8085h     // Catch:{ Exception -> 0x00c4 }
            r2.e()     // Catch:{ Exception -> 0x00c4 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00c4 }
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder r4 = r8.f8085h     // Catch:{ Exception -> 0x00c4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c4 }
            r5.<init>()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r6 = "Started decoder, took "
            r5.append(r6)     // Catch:{ Exception -> 0x00c4 }
            long r2 = r2 - r0
            r5.append(r2)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r0 = "ms"
            r5.append(r0)     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x00c4 }
            r4.d(r0)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x0000
        L_0x00c4:
            r0 = move-exception
            es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaPooledImageRegionDecoder r1 = r8.f8085h
            java.lang.String r2 = "Failed to start decoder: "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.d(r0)
            goto L_0x0000
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.a.a.e.g.e.run():void");
    }
}
