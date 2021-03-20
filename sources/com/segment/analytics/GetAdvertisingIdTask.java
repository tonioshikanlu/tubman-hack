package com.segment.analytics;

import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;
import android.util.Pair;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.Logger;
import java.util.concurrent.CountDownLatch;

public class GetAdvertisingIdTask extends AsyncTask<Context, Void, Pair<String, Boolean>> {
    private final AnalyticsContext analyticsContext;
    private final CountDownLatch latch;
    private final Logger logger;

    public GetAdvertisingIdTask(AnalyticsContext analyticsContext2, CountDownLatch countDownLatch, Logger logger2) {
        this.analyticsContext = analyticsContext2;
        this.latch = countDownLatch;
        this.logger = logger2;
    }

    private Pair<String, Boolean> getAmazonFireAdvertisingID(Context context) {
        String string;
        Boolean bool;
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0) {
            this.logger.debug("Not collecting advertising ID because limit_ad_tracking (Amazon Fire OS) is true.", new Object[0]);
            string = null;
            bool = Boolean.FALSE;
        } else {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
            bool = Boolean.TRUE;
        }
        return Pair.create(string, bool);
    }

    private Pair<String, Boolean> getGooglePlayServicesAdvertisingID(Context context) {
        Boolean bool;
        Object[] objArr = {context};
        String str = null;
        Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, objArr);
        if (((Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0])).booleanValue()) {
            this.logger.debug("Not collecting advertising ID because isLimitAdTrackingEnabled (Google Play Services) is true.", new Object[0]);
            bool = Boolean.FALSE;
        } else {
            str = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            bool = Boolean.TRUE;
        }
        return Pair.create(str, bool);
    }

    public Pair<String, Boolean> doInBackground(Context... contextArr) {
        Context context = contextArr[0];
        try {
            return getGooglePlayServicesAdvertisingID(context);
        } catch (Exception e2) {
            this.logger.error(e2, "Unable to collect advertising ID from Google Play Services.", new Object[0]);
            try {
                return getAmazonFireAdvertisingID(context);
            } catch (Exception e3) {
                this.logger.error(e3, "Unable to collect advertising ID from Amazon Fire OS.", new Object[0]);
                this.logger.debug("Unable to collect advertising ID from Amazon Fire OS and Google Play Services.", new Object[0]);
                return null;
            }
        }
    }

    public void onPostExecute(Pair<String, Boolean> pair) {
        super.onPostExecute(pair);
        if (pair != null) {
            try {
                AnalyticsContext.Device device = this.analyticsContext.device();
                if (device == null) {
                    this.logger.debug("Not collecting advertising ID because context.device is null.", new Object[0]);
                } else {
                    device.putAdvertisingInfo((String) pair.first, ((Boolean) pair.second).booleanValue());
                    return;
                }
            } finally {
                this.latch.countDown();
            }
        }
        this.latch.countDown();
    }
}
