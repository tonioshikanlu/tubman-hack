package com.segment.analytics;

import b.e.a.a.a;
import com.segment.analytics.integrations.AliasPayload;
import com.segment.analytics.integrations.GroupPayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import java.util.concurrent.ExecutorService;

public class WebhookIntegration extends Integration<Void> {
    /* access modifiers changed from: private */
    public String key;
    private ExecutorService networkExecutor;
    /* access modifiers changed from: private */
    public String tag;
    /* access modifiers changed from: private */
    public String webhookUrl;

    public static class WebhookIntegrationFactory implements Integration.Factory {
        private String key;
        private String webhookUrl;

        public WebhookIntegrationFactory(String str, String str2) {
            this.key = str;
            this.webhookUrl = str2;
        }

        public Integration<?> create(ValueMap valueMap, Analytics analytics) {
            return new WebhookIntegration(this.webhookUrl, analytics.tag, key(), analytics.networkExecutor);
        }

        public String key() {
            StringBuilder y = a.y("webhook_");
            y.append(this.key);
            return y.toString();
        }
    }

    public WebhookIntegration(String str, String str2, String str3, ExecutorService executorService) {
        this.webhookUrl = str;
        this.tag = str2;
        this.key = str3;
        this.networkExecutor = executorService;
    }

    private void sendPayloadToWebhook(final ValueMap valueMap) {
        this.networkExecutor.submit(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
                if (r4 != null) goto L_0x006d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r4.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
                if (r4 == null) goto L_0x008c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
                android.util.Log.w(com.segment.analytics.WebhookIntegration.access$000(r9.this$0), java.lang.String.format("Failed to send payload, statusCode=%d, body=%s", new java.lang.Object[]{java.lang.Integer.valueOf(r3), r0}));
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    com.segment.analytics.WebhookIntegration r0 = com.segment.analytics.WebhookIntegration.this     // Catch:{ Exception -> 0x00be }
                    java.lang.String r0 = r0.tag     // Catch:{ Exception -> 0x00be }
                    java.lang.String r1 = "Running %s payload through %s"
                    r2 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00be }
                    com.segment.analytics.ValueMap r4 = r3     // Catch:{ Exception -> 0x00be }
                    java.lang.String r5 = "type"
                    java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x00be }
                    r5 = 0
                    r3[r5] = r4     // Catch:{ Exception -> 0x00be }
                    com.segment.analytics.WebhookIntegration r4 = com.segment.analytics.WebhookIntegration.this     // Catch:{ Exception -> 0x00be }
                    java.lang.String r4 = r4.key     // Catch:{ Exception -> 0x00be }
                    r6 = 1
                    r3[r6] = r4     // Catch:{ Exception -> 0x00be }
                    java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ Exception -> 0x00be }
                    android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x00be }
                    java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00b5 }
                    com.segment.analytics.WebhookIntegration r1 = com.segment.analytics.WebhookIntegration.this     // Catch:{ MalformedURLException -> 0x00b5 }
                    java.lang.String r1 = r1.webhookUrl     // Catch:{ MalformedURLException -> 0x00b5 }
                    r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x00b5 }
                    java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x00be }
                    java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x00be }
                    r0.setDoOutput(r6)     // Catch:{ Exception -> 0x00be }
                    r0.setChunkedStreamingMode(r5)     // Catch:{ Exception -> 0x00be }
                    java.lang.String r1 = "Content-Type"
                    java.lang.String r3 = "application/json"
                    r0.setRequestProperty(r1, r3)     // Catch:{ Exception -> 0x00be }
                    java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00be }
                    java.io.OutputStream r3 = r0.getOutputStream()     // Catch:{ Exception -> 0x00be }
                    r1.<init>(r3)     // Catch:{ Exception -> 0x00be }
                    com.segment.analytics.ValueMap r3 = r3     // Catch:{ Exception -> 0x00be }
                    org.json.JSONObject r3 = r3.toJsonObject()     // Catch:{ Exception -> 0x00be }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00be }
                    r1.writeBytes(r3)     // Catch:{ Exception -> 0x00be }
                    int r3 = r0.getResponseCode()     // Catch:{ all -> 0x00b0 }
                    r4 = 300(0x12c, float:4.2E-43)
                    if (r3 < r4) goto L_0x00ac
                    r4 = 0
                    java.io.InputStream r4 = com.segment.analytics.internal.Utils.getInputStream(r0)     // Catch:{ IOException -> 0x0073 }
                    java.lang.String r0 = com.segment.analytics.internal.Utils.readFully((java.io.InputStream) r4)     // Catch:{ IOException -> 0x0073 }
                    if (r4 == 0) goto L_0x008c
                L_0x006d:
                    r4.close()     // Catch:{ all -> 0x00b0 }
                    goto L_0x008c
                L_0x0071:
                    r0 = move-exception
                    goto L_0x00a6
                L_0x0073:
                    r0 = move-exception
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                    r7.<init>()     // Catch:{ all -> 0x0071 }
                    java.lang.String r8 = "Could not read response body for rejected message: "
                    r7.append(r8)     // Catch:{ all -> 0x0071 }
                    java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
                    r7.append(r0)     // Catch:{ all -> 0x0071 }
                    java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0071 }
                    if (r4 == 0) goto L_0x008c
                    goto L_0x006d
                L_0x008c:
                    com.segment.analytics.WebhookIntegration r4 = com.segment.analytics.WebhookIntegration.this     // Catch:{ all -> 0x00b0 }
                    java.lang.String r4 = r4.tag     // Catch:{ all -> 0x00b0 }
                    java.lang.String r7 = "Failed to send payload, statusCode=%d, body=%s"
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00b0 }
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b0 }
                    r2[r5] = r3     // Catch:{ all -> 0x00b0 }
                    r2[r6] = r0     // Catch:{ all -> 0x00b0 }
                    java.lang.String r0 = java.lang.String.format(r7, r2)     // Catch:{ all -> 0x00b0 }
                    android.util.Log.w(r4, r0)     // Catch:{ all -> 0x00b0 }
                    goto L_0x00ac
                L_0x00a6:
                    if (r4 == 0) goto L_0x00ab
                    r4.close()     // Catch:{ all -> 0x00b0 }
                L_0x00ab:
                    throw r0     // Catch:{ all -> 0x00b0 }
                L_0x00ac:
                    r1.close()     // Catch:{ Exception -> 0x00be }
                    goto L_0x00c2
                L_0x00b0:
                    r0 = move-exception
                    r1.close()     // Catch:{ Exception -> 0x00be }
                    throw r0     // Catch:{ Exception -> 0x00be }
                L_0x00b5:
                    r0 = move-exception
                    java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x00be }
                    java.lang.String r2 = "Attempted to use malformed url: $webhookUrl"
                    r1.<init>(r2, r0)     // Catch:{ Exception -> 0x00be }
                    throw r1     // Catch:{ Exception -> 0x00be }
                L_0x00be:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x00c2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.WebhookIntegration.AnonymousClass1.run():void");
            }
        });
    }

    public void alias(AliasPayload aliasPayload) {
        sendPayloadToWebhook(aliasPayload);
    }

    public void group(GroupPayload groupPayload) {
        sendPayloadToWebhook(groupPayload);
    }

    public void identify(IdentifyPayload identifyPayload) {
        sendPayloadToWebhook(identifyPayload);
    }

    public void screen(ScreenPayload screenPayload) {
        sendPayloadToWebhook(screenPayload);
    }

    public void track(TrackPayload trackPayload) {
        sendPayloadToWebhook(trackPayload);
    }
}
