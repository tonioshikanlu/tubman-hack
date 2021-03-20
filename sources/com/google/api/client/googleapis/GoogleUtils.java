package com.google.api.client.googleapis;

import androidx.annotation.Keep;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Keep
public final class GoogleUtils {
    public static final Integer BUGFIX_VERSION;
    public static final Integer MAJOR_VERSION;
    public static final Integer MINOR_VERSION;
    public static final String VERSION;
    public static final Pattern VERSION_PATTERN;
    public static KeyStore certTrustStore;

    static {
        String version = getVersion();
        VERSION = version;
        Pattern compile = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)(-SNAPSHOT)?");
        VERSION_PATTERN = compile;
        Matcher matcher = compile.matcher(version);
        matcher.find();
        MAJOR_VERSION = Integer.valueOf(Integer.parseInt(matcher.group(1)));
        MINOR_VERSION = Integer.valueOf(Integer.parseInt(matcher.group(2)));
        BUGFIX_VERSION = Integer.valueOf(Integer.parseInt(matcher.group(3)));
    }

    private GoogleUtils() {
    }

    /* JADX INFO: finally extract failed */
    public static synchronized KeyStore getCertificateTrustStore() {
        KeyStore keyStore;
        Class<GoogleUtils> cls = GoogleUtils.class;
        synchronized (cls) {
            if (certTrustStore == null) {
                certTrustStore = KeyStore.getInstance("JKS");
                InputStream resourceAsStream = cls.getResourceAsStream("google.jks");
                try {
                    certTrustStore.load(resourceAsStream, "notasecret".toCharArray());
                    resourceAsStream.close();
                } catch (Throwable th) {
                    resourceAsStream.close();
                    throw th;
                }
            }
            keyStore = certTrustStore;
        }
        return keyStore;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r3 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getVersion() {
        /*
            r0 = 0
            java.lang.Class<com.google.api.client.googleapis.GoogleUtils> r1 = com.google.api.client.googleapis.GoogleUtils.class
            java.lang.String r2 = "google-api-client.properties"
            java.io.InputStream r1 = r1.getResourceAsStream(r2)     // Catch:{ IOException -> 0x002b }
            if (r1 == 0) goto L_0x0026
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x001a }
            r2.<init>()     // Catch:{ all -> 0x001a }
            r2.load(r1)     // Catch:{ all -> 0x001a }
            java.lang.String r3 = "google-api-client.version"
            java.lang.String r0 = r2.getProperty(r3)     // Catch:{ all -> 0x001a }
            goto L_0x0026
        L_0x001a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001c:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x002b }
        L_0x0025:
            throw r3     // Catch:{ IOException -> 0x002b }
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "unknown-version"
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.GoogleUtils.getVersion():java.lang.String");
    }
}
