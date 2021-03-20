package com.segment.analytics;

import com.segment.analytics.integrations.AliasPayload;
import com.segment.analytics.integrations.GroupPayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import e.r;
import e.x.c.i;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J'\u0010\u0007\u001a\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Lcom/segment/analytics/Webhook;", "Lcom/segment/analytics/integrations/Integration;", "Le/r;", "Lcom/segment/analytics/ValueMap;", "payload", "Ljava/util/concurrent/Future;", "kotlin.jvm.PlatformType", "sendPayloadToWebhook", "(Lcom/segment/analytics/ValueMap;)Ljava/util/concurrent/Future;", "Lcom/segment/analytics/integrations/IdentifyPayload;", "identify", "(Lcom/segment/analytics/integrations/IdentifyPayload;)V", "Lcom/segment/analytics/integrations/GroupPayload;", "group", "(Lcom/segment/analytics/integrations/GroupPayload;)V", "Lcom/segment/analytics/integrations/TrackPayload;", "track", "(Lcom/segment/analytics/integrations/TrackPayload;)V", "Lcom/segment/analytics/integrations/AliasPayload;", "alias", "(Lcom/segment/analytics/integrations/AliasPayload;)V", "Lcom/segment/analytics/integrations/ScreenPayload;", "screen", "(Lcom/segment/analytics/integrations/ScreenPayload;)V", "Ljava/util/concurrent/ExecutorService;", "networkExecutor", "Ljava/util/concurrent/ExecutorService;", "", "tag", "Ljava/lang/String;", "integrationKey", "webhookUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/ExecutorService;)V", "analytics_release"}, k = 1, mv = {1, 1, 15})
public final class Webhook extends Integration<r> {
    /* access modifiers changed from: private */
    public final String integrationKey;
    private final ExecutorService networkExecutor;
    /* access modifiers changed from: private */
    public final String tag;
    /* access modifiers changed from: private */
    public final String webhookUrl;

    public Webhook(String str, String str2, String str3, ExecutorService executorService) {
        i.e(str, "webhookUrl");
        i.e(str2, "tag");
        i.e(str3, "integrationKey");
        i.e(executorService, "networkExecutor");
        this.webhookUrl = str;
        this.tag = str2;
        this.integrationKey = str3;
        this.networkExecutor = executorService;
    }

    private final Future<?> sendPayloadToWebhook(ValueMap valueMap) {
        return this.networkExecutor.submit(new Webhook$sendPayloadToWebhook$1(this, valueMap));
    }

    public void alias(AliasPayload aliasPayload) {
        i.e(aliasPayload, "alias");
        sendPayloadToWebhook(aliasPayload);
    }

    public void group(GroupPayload groupPayload) {
        i.e(groupPayload, "group");
        sendPayloadToWebhook(groupPayload);
    }

    public void identify(IdentifyPayload identifyPayload) {
        i.e(identifyPayload, "identify");
        sendPayloadToWebhook(identifyPayload);
    }

    public void screen(ScreenPayload screenPayload) {
        i.e(screenPayload, "screen");
        sendPayloadToWebhook(screenPayload);
    }

    public void track(TrackPayload trackPayload) {
        i.e(trackPayload, "track");
        sendPayloadToWebhook(trackPayload);
    }
}
