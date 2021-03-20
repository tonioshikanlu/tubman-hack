package com.segment.analytics;

import com.segment.analytics.integrations.BasePayload;

public interface Middleware {

    public interface Callback {
        void invoke(BasePayload basePayload);
    }

    public interface Chain {
        BasePayload payload();

        void proceed(BasePayload basePayload);
    }

    void intercept(Chain chain);
}
