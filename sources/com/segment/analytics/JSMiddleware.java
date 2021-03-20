package com.segment.analytics;

import android.content.Context;
import java.util.List;
import java.util.Map;

public abstract class JSMiddleware {
    public Context context;
    public Map<String, List<Middleware>> destinationMiddleware;
    public ValueMap settings;
    public List<Middleware> sourceMiddleware;

    public JSMiddleware(Context context2) {
        this.context = context2;
    }

    public abstract void addToDataBridge(String str, Object obj);

    public abstract Map<String, Object> getDataBridgeSnapshot();

    public abstract void removeFromDataBridge(String str);

    public abstract void setEdgeFunctionData(ValueMap valueMap);
}
