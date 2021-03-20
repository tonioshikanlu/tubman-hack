package com.segment.analytics;

import androidx.annotation.NonNull;
import com.segment.analytics.Middleware;
import com.segment.analytics.integrations.BasePayload;
import java.util.List;

public class MiddlewareChainRunner implements Middleware.Chain {
    @NonNull
    private final Middleware.Callback callback;
    private int index;
    @NonNull
    private final List<Middleware> middleware;
    @NonNull
    private final BasePayload payload;

    public MiddlewareChainRunner(int i2, @NonNull BasePayload basePayload, @NonNull List<Middleware> list, @NonNull Middleware.Callback callback2) {
        this.index = i2;
        this.payload = basePayload;
        this.middleware = list;
        this.callback = callback2;
    }

    public BasePayload payload() {
        return this.payload;
    }

    public void proceed(BasePayload basePayload) {
        if (this.index < this.middleware.size()) {
            this.middleware.get(this.index).intercept(new MiddlewareChainRunner(this.index + 1, basePayload, this.middleware, this.callback));
            return;
        }
        this.callback.invoke(basePayload);
    }
}
