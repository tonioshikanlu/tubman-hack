package com.solidstategroup.bullettrain;

import e.x.c.i;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n.e0;
import n.f;
import n.h0;
import n.m0.g.e;
import n.z;

public class BulletTrainClient {
    private static final String ACCEPT_HEADER = "Accept";
    private static final String AUTH_HEADER = "X-Environment-Key";
    /* access modifiers changed from: private */
    public String apiKey;
    /* access modifiers changed from: private */
    public BulletTrainConfig defaultConfig;

    public static class Builder {
        private BulletTrainClient client;

        private Builder() {
            this.client = new BulletTrainClient();
        }

        public BulletTrainClient build() {
            BulletTrainConfig unused = this.client.defaultConfig = BulletTrainConfig.newBuilder().build();
            return this.client;
        }

        public Builder setApiKey(String str) {
            if (str != null) {
                String unused = this.client.apiKey = str;
                return this;
            }
            throw new IllegalArgumentException("Api key can not be null");
        }
    }

    private BulletTrainClient() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r5 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.solidstategroup.bullettrain.Trait> getUserTraits(com.solidstategroup.bullettrain.FeatureUser r5) {
        /*
            r4 = this;
            com.solidstategroup.bullettrain.BulletTrainConfig r0 = r4.defaultConfig
            n.z r0 = r0.identitiesURI
            java.lang.String r1 = ""
            n.z$a r0 = r0.g(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r5.getIdentifier()
            r1.append(r5)
            java.lang.String r5 = "/"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.a(r5)
            n.z r5 = r0.b()
            n.e0$a r0 = new n.e0$a
            r0.<init>()
            java.lang.String r1 = r4.apiKey
            java.lang.String r2 = "X-Environment-Key"
            r0.c(r2, r1)
            java.lang.String r1 = "Accept"
            java.lang.String r2 = "application/json"
            r0.a(r1, r2)
            r0.h(r5)
            n.e0 r5 = r0.b()
            com.solidstategroup.bullettrain.BulletTrainConfig r0 = r4.defaultConfig
            n.c0 r0 = r0.httpClient
            n.f r5 = r0.a(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            n.m0.g.e r5 = (n.m0.g.e) r5
            n.h0 r5 = r5.h()     // Catch:{ IOException -> 0x0081 }
            boolean r1 = r5.e()     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x006f
            b.j.a.c.r r1 = com.solidstategroup.bullettrain.MapperFactory.getMappper()     // Catch:{ all -> 0x0073 }
            n.j0 r2 = r5.f10106n     // Catch:{ all -> 0x0073 }
            java.lang.String r2 = r2.z()     // Catch:{ all -> 0x0073 }
            java.lang.Class<com.solidstategroup.bullettrain.FlagsAndTraits> r3 = com.solidstategroup.bullettrain.FlagsAndTraits.class
            java.lang.Object r1 = r1.g(r2, r3)     // Catch:{ all -> 0x0073 }
            com.solidstategroup.bullettrain.FlagsAndTraits r1 = (com.solidstategroup.bullettrain.FlagsAndTraits) r1     // Catch:{ all -> 0x0073 }
            java.util.List r0 = r1.getTraits()     // Catch:{ all -> 0x0073 }
        L_0x006f:
            r5.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x0081
        L_0x0073:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r2 = move-exception
            if (r5 == 0) goto L_0x0080
            r5.close()     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r5 = move-exception
            r1.addSuppressed(r5)     // Catch:{ IOException -> 0x0081 }
        L_0x0080:
            throw r2     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.solidstategroup.bullettrain.BulletTrainClient.getUserTraits(com.solidstategroup.bullettrain.FeatureUser):java.util.List");
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cf, code lost:
        if (r12 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.solidstategroup.bullettrain.Trait postUserTraits(com.solidstategroup.bullettrain.FeatureUser r12, com.solidstategroup.bullettrain.Trait r13) {
        /*
            r11 = this;
            com.solidstategroup.bullettrain.BulletTrainConfig r0 = r11.defaultConfig
            n.z r0 = r0.identitiesURI
            java.lang.String r1 = ""
            n.z$a r0 = r0.g(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r12 = r12.getIdentifier()
            r1.append(r12)
            java.lang.String r12 = "/traits/"
            r1.append(r12)
            java.lang.String r12 = r13.getKey()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.a(r12)
            n.z r12 = r0.b()
            n.b0$a r0 = n.b0.f10048e
            java.lang.String r0 = "application/json; charset=utf-8"
            n.b0 r0 = n.b0.a.b(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r1 = "content"
            e.x.c.i.e(r13, r1)
            java.lang.String r1 = "$this$toRequestBody"
            e.x.c.i.e(r13, r1)
            java.nio.charset.Charset r2 = e.c0.a.a
            r3 = 0
            if (r0 == 0) goto L_0x0067
            java.util.regex.Pattern r4 = n.b0.c
            java.nio.charset.Charset r4 = r0.a(r3)
            if (r4 != 0) goto L_0x0066
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "; charset=utf-8"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            n.b0 r0 = n.b0.a.b(r0)
            goto L_0x0067
        L_0x0066:
            r2 = r4
        L_0x0067:
            byte[] r13 = r13.getBytes(r2)
            java.lang.String r2 = "(this as java.lang.String).getBytes(charset)"
            e.x.c.i.d(r13, r2)
            r2 = 0
            int r4 = r13.length
            e.x.c.i.e(r13, r1)
            int r1 = r13.length
            long r5 = (long) r1
            long r7 = (long) r2
            long r9 = (long) r4
            n.m0.c.c(r5, r7, r9)
            n.g0$a$a r1 = new n.g0$a$a
            r1.<init>(r13, r0, r4, r2)
            n.e0$a r13 = new n.e0$a
            r13.<init>()
            java.lang.String r0 = r11.apiKey
            java.lang.String r2 = "X-Environment-Key"
            r13.c(r2, r0)
            java.lang.String r0 = "Accept"
            java.lang.String r2 = "application/json"
            r13.a(r0, r2)
            r13.e(r1)
            r13.h(r12)
            n.e0 r12 = r13.b()
            com.solidstategroup.bullettrain.BulletTrainConfig r13 = r11.defaultConfig
            n.c0 r13 = r13.httpClient
            n.f r12 = r13.a(r12)
            n.m0.g.e r12 = (n.m0.g.e) r12
            n.h0 r12 = r12.h()     // Catch:{ IOException -> 0x00da }
            boolean r13 = r12.e()     // Catch:{ all -> 0x00cc }
            if (r13 == 0) goto L_0x00c8
            b.j.a.c.r r13 = com.solidstategroup.bullettrain.MapperFactory.getMappper()     // Catch:{ all -> 0x00cc }
            n.j0 r0 = r12.f10106n     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r0.z()     // Catch:{ all -> 0x00cc }
            java.lang.Class<com.solidstategroup.bullettrain.Trait> r1 = com.solidstategroup.bullettrain.Trait.class
            java.lang.Object r13 = r13.g(r0, r1)     // Catch:{ all -> 0x00cc }
            com.solidstategroup.bullettrain.Trait r13 = (com.solidstategroup.bullettrain.Trait) r13     // Catch:{ all -> 0x00cc }
            r12.close()     // Catch:{ IOException -> 0x00da }
            return r13
        L_0x00c8:
            r12.close()     // Catch:{ IOException -> 0x00da }
            goto L_0x00da
        L_0x00cc:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            if (r12 == 0) goto L_0x00d9
            r12.close()     // Catch:{ all -> 0x00d5 }
            goto L_0x00d9
        L_0x00d5:
            r12 = move-exception
            r13.addSuppressed(r12)     // Catch:{ IOException -> 0x00da }
        L_0x00d9:
            throw r0     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.solidstategroup.bullettrain.BulletTrainClient.postUserTraits(com.solidstategroup.bullettrain.FeatureUser, com.solidstategroup.bullettrain.Trait):com.solidstategroup.bullettrain.Trait");
    }

    public String getFeatureFlagValue(String str) {
        for (Flag next : getFeatureFlags()) {
            if (next.getFeature().getName().equals(str)) {
                return next.getStateValue();
            }
        }
        return null;
    }

    public String getFeatureFlagValue(String str, FeatureUser featureUser) {
        for (Flag next : getFeatureFlags(featureUser)) {
            if (next.getFeature().getName().equals(str)) {
                return next.getStateValue();
            }
        }
        return null;
    }

    public List<Flag> getFeatureFlags() {
        return getFeatureFlags((FeatureUser) null);
    }

    public List<Flag> getFeatureFlags(FeatureUser featureUser) {
        z.a aVar;
        Throwable th;
        z zVar = this.defaultConfig.flagsURI;
        if (featureUser == null) {
            aVar = zVar.f();
            i.e("page", "encodedName");
            if (aVar.f10439g == null) {
                aVar.f10439g = new ArrayList();
            }
            List<String> list = aVar.f10439g;
            i.c(list);
            z.b bVar = z.f10429l;
            list.add(z.b.a(bVar, "page", 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211));
            List<String> list2 = aVar.f10439g;
            i.c(list2);
            list2.add(z.b.a(bVar, "1", 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211));
        } else {
            aVar = zVar.g("");
            aVar.a(featureUser.getIdentifier());
        }
        e0.a aVar2 = new e0.a();
        aVar2.c(AUTH_HEADER, this.apiKey);
        aVar2.a(ACCEPT_HEADER, "application/json");
        aVar2.h(aVar.b());
        f a = this.defaultConfig.httpClient.a(aVar2.b());
        List arrayList = new ArrayList();
        try {
            h0 h2 = ((e) a).h();
            try {
                if (h2.e()) {
                    arrayList = Arrays.asList((Object[]) MapperFactory.getMappper().g(h2.f10106n.z(), Flag[].class));
                }
                h2.close();
                return arrayList;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                if (h2 != null) {
                    h2.close();
                }
                throw th3;
            }
        } catch (IOException unused) {
        } catch (Throwable th4) {
            th.addSuppressed(th4);
        }
    }

    public Trait getTrait(FeatureUser featureUser, String str) {
        for (Trait next : getUserTraits(featureUser)) {
            if (next.getKey().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public List<Trait> getTraits(FeatureUser featureUser, String... strArr) {
        List<Trait> userTraits = getUserTraits(featureUser);
        if (strArr == null || strArr.length == 0) {
            return userTraits;
        }
        ArrayList arrayList = new ArrayList();
        for (Trait next : userTraits) {
            if (Arrays.asList(strArr).contains(next.getKey())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public boolean hasFeatureFlag(String str) {
        for (Flag next : getFeatureFlags()) {
            if (next.getFeature().getName().equals(str) && next.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFeatureFlag(String str, FeatureUser featureUser) {
        for (Flag next : getFeatureFlags(featureUser)) {
            if (next.getFeature().getName().equals(str) && next.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    public Trait updateTrait(FeatureUser featureUser, Trait trait) {
        return postUserTraits(featureUser, trait);
    }
}
