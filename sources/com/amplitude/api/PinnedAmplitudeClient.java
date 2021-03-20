package com.amplitude.api;

import android.content.Context;
import b.e.a.a.a;
import e.x.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n.c0;
import n.m0.k.h;

public class PinnedAmplitudeClient extends AmplitudeClient {
    public static final SSLContextBuilder SSL_CONTEXT_API_AMPLITUDE_COM = new SSLContextBuilder().addCertificate("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").addCertificate("MIIFdDCCBFygAwIBAgIQJ2buVutJ846r13Ci/ITeIjANBgkqhkiG9w0BAQwFADBvMQswCQYDVQQGEwJTRTEUMBIGA1UEChMLQWRkVHJ1c3QgQUIxJjAkBgNVBAsTHUFkZFRydXN0IEV4dGVybmFsIFRUUCBOZXR3b3JrMSIwIAYDVQQDExlBZGRUcnVzdCBFeHRlcm5hbCBDQSBSb290MB4XDTAwMDUzMDEwNDgzOFoXDTIwMDUzMDEwNDgzOFowgYUxCzAJBgNVBAYTAkdCMRswGQYDVQQIExJHcmVhdGVyIE1hbmNoZXN0ZXIxEDAOBgNVBAcTB1NhbGZvcmQxGjAYBgNVBAoTEUNPTU9ETyBDQSBMaW1pdGVkMSswKQYDVQQDEyJDT01PRE8gUlNBIENlcnRpZmljYXRpb24gQXV0aG9yaXR5MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAkehUktIKVrGsDSTdxc9EZ3SZKzejfSNwAHG8U9/E+ioSj0t/EFa9n3Byt2F/yUsPF6c947AEYe7/EZfH9IY+Cvo+XPmT5jR62RRr55yzhaCCenavcZDX7P0N+pxs+t+wgvQUfvm+xKYvT3+Zf7X8Z0NyvQwA1onrayzT7Y+YHBSrfuXjbvzYqOSSJNpDa2K4Vf3qwbxstovzDo2a5JtsaZn4eEgwRdWt4Q08RWD8MpZRJ7xnw8outmvqRsfHIKCxH2XeSAi6pE6p8oNGN4Tr6MyBSENnTnIqm1y9TBsoilwie7SrmNnu4FGDwwlGTm0+mfqVF9p8M1dBPI1R7Qu2XK8sYxrfV8g/vOldxJuvRZnio1oktLqpVj3Pb6r/SVi+8Kj/9Lit6Tf7urj0Czr56ENCHonYhMsT8dm74YlguIwoVqwUHZwK53Hrzw7dPamWoUi9PPevtQ0iTMARgexWO/bTouJbt7IEIlKVgJNp6I5MZfGRAy1wdALqi2cVKWlSArvX31BqVUa/oKMoYX9w0MOiqiwhqkfOKJwGRXa/ghgntNWutMtQ5mv0TIZxMOmm3xaG4Nj/QN370EKIf6MzOi5cHkERgWPOGHFrK+ymircxXDpqR+DDeVnWIBqv8mqYqnK8V0rSS527EPywTEHl7R09XiidnMy/s1Hap0flhFMCAwEAAaOB9DCB8TAfBgNVHSMEGDAWgBStvZh6NLQm9/rEJlTvA73gJMtUGjAdBgNVHQ4EFgQUu69+Aj36pvE8hI6t7jiY7NkyMtQwDgYDVR0PAQH/BAQDAgGGMA8GA1UdEwEB/wQFMAMBAf8wEQYDVR0gBAowCDAGBgRVHSAAMEQGA1UdHwQ9MDswOaA3oDWGM2h0dHA6Ly9jcmwudXNlcnRydXN0LmNvbS9BZGRUcnVzdEV4dGVybmFsQ0FSb290LmNybDA1BggrBgEFBQcBAQQpMCcwJQYIKwYBBQUHMAGGGWh0dHA6Ly9vY3NwLnVzZXJ0cnVzdC5jb20wDQYJKoZIhvcNAQEMBQADggEBAGS/g/FfmoXQzbihKVcN6Fr30ek+8nYEbvFScLsePP9NDXRqzIGCJdPDoCpdTPW6i6FtxFQJdcfjJw5dhHk3QBN39bSsHNA7qxcS1u80GH4r6XnTq1dFDK8o+tDb5VCViLvfhVdpfZLYUspzgb8c8+a4bmYRBbMelC1/kZWSWfFMzqORcUx8Rww7Cxn2obFshj5cqsQugsv5B5a6SE2Q8pTIqXOi6wZ7I53eovNNVZ96YUWYGGjHXkBrI/V5eu+MtWuLt29G9HvxPUsE2JOAWVrgQSQdso8VYFhH2+9uRv0V9dlfmrPb2LjkQLPNlzmuhbsdjrzch5vRpu/xO28QOG8=");
    public static final String TAG = "com.amplitude.api.PinnedAmplitudeClient";
    public static Map<String, PinnedAmplitudeClient> instances = new HashMap();
    /* access modifiers changed from: private */
    public static final AmplitudeLog logger = AmplitudeLog.getLogger();
    public boolean initializedSSLSocketFactory = false;
    public SSLSocketFactory sslSocketFactory;

    public static class SSLContextBuilder {
        private final List<String> certificateBase64s = new ArrayList();

        public SSLContextBuilder addCertificate(String str) {
            this.certificateBase64s.add(str);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.security.GeneralSecurityException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.IOException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.security.GeneralSecurityException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.security.GeneralSecurityException} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public javax.net.ssl.SSLContext build() {
            /*
                r9 = this;
                java.lang.String r0 = "com.amplitude.api.PinnedAmplitudeClient"
                r1 = 0
                java.lang.String r2 = "X.509"
                java.security.cert.CertificateFactory r2 = java.security.cert.CertificateFactory.getInstance(r2)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                java.lang.String r3 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                javax.net.ssl.TrustManagerFactory r3 = javax.net.ssl.TrustManagerFactory.getInstance(r3)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                java.lang.String r4 = java.security.KeyStore.getDefaultType()     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                java.security.KeyStore r4 = java.security.KeyStore.getInstance(r4)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                r4.load(r1, r1)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                java.util.List<java.lang.String> r5 = r9.certificateBase64s     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                r6 = 1
            L_0x0023:
                boolean r7 = r5.hasNext()     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                if (r7 == 0) goto L_0x0051
                java.lang.Object r7 = r5.next()     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                o.e r8 = new o.e     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                r8.<init>()     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                o.h r7 = o.h.e(r7)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                r8.r0(r7)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                o.e$a r7 = new o.e$a     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                r7.<init>(r8)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                java.security.cert.Certificate r7 = r2.generateCertificate(r7)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                int r8 = r6 + 1
                java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                r4.setCertificateEntry(r6, r7)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                r6 = r8
                goto L_0x0023
            L_0x0051:
                r3.init(r4)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                java.lang.String r2 = "TLS"
                javax.net.ssl.SSLContext r2 = javax.net.ssl.SSLContext.getInstance(r2)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                javax.net.ssl.TrustManager[] r3 = r3.getTrustManagers()     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                r2.init(r1, r3, r1)     // Catch:{ GeneralSecurityException -> 0x006c, IOException -> 0x0062 }
                return r2
            L_0x0062:
                r2 = move-exception
                com.amplitude.api.AmplitudeLog r3 = com.amplitude.api.PinnedAmplitudeClient.logger
                java.lang.String r4 = r2.getMessage()
                goto L_0x0075
            L_0x006c:
                r2 = move-exception
                com.amplitude.api.AmplitudeLog r3 = com.amplitude.api.PinnedAmplitudeClient.logger
                java.lang.String r4 = r2.getMessage()
            L_0x0075:
                r3.e(r0, r4, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.PinnedAmplitudeClient.SSLContextBuilder.build():javax.net.ssl.SSLContext");
        }
    }

    public PinnedAmplitudeClient(String str) {
        super(str);
    }

    public static PinnedAmplitudeClient getInstance() {
        return getInstance((String) null);
    }

    public static synchronized PinnedAmplitudeClient getInstance(String str) {
        PinnedAmplitudeClient pinnedAmplitudeClient;
        synchronized (PinnedAmplitudeClient.class) {
            String normalizeInstanceName = Utils.normalizeInstanceName(str);
            pinnedAmplitudeClient = instances.get(normalizeInstanceName);
            if (pinnedAmplitudeClient == null) {
                pinnedAmplitudeClient = new PinnedAmplitudeClient(normalizeInstanceName);
                instances.put(normalizeInstanceName, pinnedAmplitudeClient);
            }
        }
        return pinnedAmplitudeClient;
    }

    public SSLSocketFactory getPinnedCertSslSocketFactory() {
        return getPinnedCertSslSocketFactory(SSL_CONTEXT_API_AMPLITUDE_COM);
    }

    public SSLSocketFactory getPinnedCertSslSocketFactory(SSLContextBuilder sSLContextBuilder) {
        if (sSLContextBuilder == null) {
            return null;
        }
        if (this.sslSocketFactory == null) {
            try {
                this.sslSocketFactory = sSLContextBuilder.build().getSocketFactory();
                logger.i(TAG, "Pinning SSL session using Comodo CA Cert");
            } catch (Exception e2) {
                logger.e(TAG, e2.getMessage(), e2);
            }
        }
        return this.sslSocketFactory;
    }

    public synchronized AmplitudeClient initialize(Context context, String str, String str2) {
        super.initialize(context, str, str2);
        runOnLogThread(new Runnable() {
            public void run() {
                if (!this.initializedSSLSocketFactory) {
                    SSLSocketFactory pinnedCertSslSocketFactory = PinnedAmplitudeClient.this.getPinnedCertSslSocketFactory();
                    if (pinnedCertSslSocketFactory != null) {
                        PinnedAmplitudeClient pinnedAmplitudeClient = this;
                        c0.a aVar = new c0.a();
                        i.e(pinnedCertSslSocketFactory, "sslSocketFactory");
                        i.a(pinnedCertSslSocketFactory, aVar.f10069n);
                        aVar.f10069n = pinnedCertSslSocketFactory;
                        h.a aVar2 = h.c;
                        X509TrustManager o2 = h.a.o(pinnedCertSslSocketFactory);
                        if (o2 != null) {
                            aVar.f10070o = o2;
                            h hVar = h.a;
                            X509TrustManager x509TrustManager = aVar.f10070o;
                            i.c(x509TrustManager);
                            aVar.t = hVar.b(x509TrustManager);
                            pinnedAmplitudeClient.httpClient = new c0(aVar);
                        } else {
                            StringBuilder y = a.y("Unable to extract the trust manager on ");
                            y.append(h.a);
                            y.append(", ");
                            y.append("sslSocketFactory is ");
                            y.append(pinnedCertSslSocketFactory.getClass());
                            throw new IllegalStateException(y.toString());
                        }
                    } else {
                        PinnedAmplitudeClient.logger.e(PinnedAmplitudeClient.TAG, "Unable to pin SSL as requested. Will send data without SSL pinning.");
                    }
                    this.initializedSSLSocketFactory = true;
                }
            }
        });
        return this;
    }
}
