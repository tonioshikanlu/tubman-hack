package com.segment.analytics;

import b.e.a.a.a;
import com.segment.analytics.integrations.Integration;
import e.r;
import e.x.c.i;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/segment/analytics/WebhookIntegrationFactory;", "Lcom/segment/analytics/integrations/Integration$Factory;", "Lcom/segment/analytics/ValueMap;", "settings", "Lcom/segment/analytics/Analytics;", "analytics", "Lcom/segment/analytics/integrations/Integration;", "Le/r;", "create", "(Lcom/segment/analytics/ValueMap;Lcom/segment/analytics/Analytics;)Lcom/segment/analytics/integrations/Integration;", "", "key", "()Ljava/lang/String;", "Ljava/lang/String;", "webhookUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "analytics_release"}, k = 1, mv = {1, 1, 15})
public final class WebhookIntegrationFactory implements Integration.Factory {
    private final String key;
    private final String webhookUrl;

    public WebhookIntegrationFactory(String str, String str2) {
        i.e(str, "key");
        i.e(str2, "webhookUrl");
        this.key = str;
        this.webhookUrl = str2;
    }

    public Integration<r> create(ValueMap valueMap, Analytics analytics) {
        i.e(analytics, "analytics");
        String str = this.webhookUrl;
        StringBuilder y = a.y("Analytics/");
        y.append(analytics.tag);
        String sb = y.toString();
        String key2 = key();
        ExecutorService executorService = analytics.networkExecutor;
        i.d(executorService, "analytics.networkExecutor");
        return new Webhook(str, sb, key2, executorService);
    }

    public String key() {
        StringBuilder y = a.y("webhook_");
        y.append(this.key);
        return y.toString();
    }
}
