package b.l.a.c.f.i;

import android.os.Bundle;
import android.os.IInterface;
import b.l.a.c.d.b;
import java.util.Map;

public interface qb extends IInterface {
    void beginAdUnitExposure(String str, long j2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j2);

    void endAdUnitExposure(String str, long j2);

    void generateEventId(tb tbVar);

    void getAppInstanceId(tb tbVar);

    void getCachedAppInstanceId(tb tbVar);

    void getConditionalUserProperties(String str, String str2, tb tbVar);

    void getCurrentScreenClass(tb tbVar);

    void getCurrentScreenName(tb tbVar);

    void getGmpAppId(tb tbVar);

    void getMaxUserProperties(String str, tb tbVar);

    void getTestFlag(tb tbVar, int i2);

    void getUserProperties(String str, String str2, boolean z, tb tbVar);

    void initForTests(Map map);

    void initialize(b bVar, zb zbVar, long j2);

    void isDataCollectionEnabled(tb tbVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2);

    void logEventAndBundle(String str, String str2, Bundle bundle, tb tbVar, long j2);

    void logHealthData(int i2, String str, b bVar, b bVar2, b bVar3);

    void onActivityCreated(b bVar, Bundle bundle, long j2);

    void onActivityDestroyed(b bVar, long j2);

    void onActivityPaused(b bVar, long j2);

    void onActivityResumed(b bVar, long j2);

    void onActivitySaveInstanceState(b bVar, tb tbVar, long j2);

    void onActivityStarted(b bVar, long j2);

    void onActivityStopped(b bVar, long j2);

    void performAction(Bundle bundle, tb tbVar, long j2);

    void registerOnMeasurementEventListener(wb wbVar);

    void resetAnalyticsData(long j2);

    void setConditionalUserProperty(Bundle bundle, long j2);

    void setConsent(Bundle bundle, long j2);

    void setConsentThirdParty(Bundle bundle, long j2);

    void setCurrentScreen(b bVar, String str, String str2, long j2);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(wb wbVar);

    void setInstanceIdProvider(yb ybVar);

    void setMeasurementEnabled(boolean z, long j2);

    void setMinimumSessionDuration(long j2);

    void setSessionTimeoutDuration(long j2);

    void setUserId(String str, long j2);

    void setUserProperty(String str, String str2, b bVar, boolean z, long j2);

    void unregisterOnMeasurementEventListener(wb wbVar);
}
