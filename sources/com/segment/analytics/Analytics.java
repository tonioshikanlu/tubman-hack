package com.segment.analytics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import b.e.a.a.a;
import com.amplitude.api.Constants;
import com.segment.analytics.AnalyticsActivityLifecycleCallbacks;
import com.segment.analytics.Client;
import com.segment.analytics.Middleware;
import com.segment.analytics.ProjectSettings;
import com.segment.analytics.Traits;
import com.segment.analytics.WebhookIntegration;
import com.segment.analytics.integrations.AliasPayload;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.integrations.GroupPayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Logger;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import com.segment.analytics.internal.NanoDate;
import com.segment.analytics.internal.Utils;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Analytics {
    private static final String BUILD_KEY = "build";
    public static final Properties EMPTY_PROPERTIES = new Properties();
    public static final Handler HANDLER = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            StringBuilder y = a.y("Unknown handler message received: ");
            y.append(message.what);
            throw new AssertionError(y.toString());
        }
    };
    public static final List<String> INSTANCES = new ArrayList(1);
    public static final String OPT_OUT_PREFERENCE_KEY = "opt-out";
    private static final long SETTINGS_REFRESH_INTERVAL = 86400000;
    private static final long SETTINGS_RETRY_INTERVAL = 60000;
    private static final String TRAITS_KEY = "traits";
    private static final String VERSION_KEY = "version";
    public static final String WRITE_KEY_RESOURCE_IDENTIFIER = "analytics_write_key";
    @SuppressLint({"StaticFieldLeak"})
    public static volatile Analytics singleton = null;
    public final AnalyticsActivityLifecycleCallbacks activityLifecycleCallback;
    private final CountDownLatch advertisingIdLatch;
    public final AnalyticsContext analyticsContext;
    private final ExecutorService analyticsExecutor;
    private final Application application;
    public final Map<String, Boolean> bundledIntegrations = new ConcurrentHashMap();
    public final Cartographer cartographer;
    public final Client client;
    public final Crypto crypto;
    public final Options defaultOptions;
    @NonNull
    private final Map<String, List<Middleware>> destinationMiddleware;
    private JSMiddleware edgeFunctionMiddleware;
    private List<Integration.Factory> factories;
    public final long flushIntervalInMillis;
    public final int flushQueueSize;
    private Map<String, Integration<?>> integrations;
    public final Lifecycle lifecycle;
    private final Logger logger;
    public final boolean nanosecondTimestamps;
    public final ExecutorService networkExecutor;
    private final BooleanPreference optOut;
    public ProjectSettings projectSettings;
    private final ProjectSettings.Cache projectSettingsCache;
    public volatile boolean shutdown;
    @NonNull
    private final List<Middleware> sourceMiddleware;
    public final Stats stats;
    public final String tag;
    public final Traits.Cache traitsCache;
    public final boolean useNewLifecycleMethods;
    public final String writeKey;

    public static class Builder {
        private final Application application;
        private boolean collectDeviceID = true;
        private ConnectionFactory connectionFactory;
        private Crypto crypto;
        private Options defaultOptions;
        private ValueMap defaultProjectSettings = new ValueMap();
        private Map<String, List<Middleware>> destinationMiddleware;
        private JSMiddleware edgeFunctionMiddleware;
        private ExecutorService executor;
        private final List<Integration.Factory> factories = new ArrayList();
        private long flushIntervalInMillis = Constants.EVENT_UPLOAD_PERIOD_MILLIS;
        private int flushQueueSize = 20;
        private LogLevel logLevel;
        private boolean nanosecondTimestamps = false;
        private ExecutorService networkExecutor;
        private boolean recordScreenViews = false;
        private List<Middleware> sourceMiddleware;
        private String tag;
        private boolean trackApplicationLifecycleEvents = false;
        private boolean trackDeepLinks = false;
        private boolean useNewLifecycleMethods = true;
        private String writeKey;

        public Builder(Context context, String str) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            } else if (Utils.hasPermission(context, "android.permission.INTERNET")) {
                Application application2 = (Application) context.getApplicationContext();
                this.application = application2;
                if (application2 == null) {
                    throw new IllegalArgumentException("Application context must not be null.");
                } else if (!Utils.isNullOrEmpty((CharSequence) str)) {
                    this.writeKey = str;
                } else {
                    throw new IllegalArgumentException("writeKey must not be null or empty.");
                }
            } else {
                throw new IllegalArgumentException("INTERNET permission is required.");
            }
        }

        public Analytics build() {
            if (Utils.isNullOrEmpty((CharSequence) this.tag)) {
                this.tag = this.writeKey;
            }
            List<String> list = Analytics.INSTANCES;
            synchronized (list) {
                if (!list.contains(this.tag)) {
                    list.add(this.tag);
                } else {
                    throw new IllegalStateException("Duplicate analytics client created with tag: " + this.tag + ". If you want to use multiple Analytics clients, use a different writeKey or set a tag via the builder during construction.");
                }
            }
            if (this.defaultOptions == null) {
                this.defaultOptions = new Options();
            }
            if (this.logLevel == null) {
                this.logLevel = LogLevel.NONE;
            }
            if (this.networkExecutor == null) {
                this.networkExecutor = new Utils.AnalyticsNetworkExecutorService();
            }
            if (this.connectionFactory == null) {
                this.connectionFactory = new ConnectionFactory();
            }
            if (this.crypto == null) {
                this.crypto = Crypto.none();
            }
            Stats stats = new Stats();
            Cartographer cartographer = Cartographer.INSTANCE;
            Client client = new Client(this.writeKey, this.connectionFactory);
            ProjectSettings.Cache cache = new ProjectSettings.Cache(this.application, cartographer, this.tag);
            BooleanPreference booleanPreference = new BooleanPreference(Utils.getSegmentSharedPreferences(this.application, this.tag), Analytics.OPT_OUT_PREFERENCE_KEY, false);
            Traits.Cache cache2 = new Traits.Cache(this.application, cartographer, this.tag);
            if (!cache2.isSet() || cache2.get() == null) {
                cache2.set(Traits.create());
            }
            Logger with = Logger.with(this.logLevel);
            AnalyticsContext create = AnalyticsContext.create(this.application, (Traits) cache2.get(), this.collectDeviceID);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            create.attachAdvertisingId(this.application, countDownLatch, with);
            ArrayList arrayList = new ArrayList(this.factories.size() + 1);
            arrayList.add(SegmentIntegration.FACTORY);
            arrayList.addAll(this.factories);
            JSMiddleware jSMiddleware = this.edgeFunctionMiddleware;
            if (jSMiddleware != null) {
                List<Middleware> list2 = jSMiddleware.sourceMiddleware;
                if (list2 != null) {
                    this.sourceMiddleware = list2;
                }
                Map<String, List<Middleware>> map = jSMiddleware.destinationMiddleware;
                if (map != null) {
                    this.destinationMiddleware = map;
                }
            }
            List<T> immutableCopyOf = Utils.immutableCopyOf(this.sourceMiddleware);
            Map<String, List<Middleware>> emptyMap = Utils.isNullOrEmpty((Map) this.destinationMiddleware) ? Collections.emptyMap() : Utils.immutableCopyOf(this.destinationMiddleware);
            ExecutorService executorService = this.executor;
            if (executorService == null) {
                executorService = Executors.newSingleThreadExecutor();
            }
            return new Analytics(this.application, this.networkExecutor, stats, cache2, create, this.defaultOptions, with, this.tag, Collections.unmodifiableList(arrayList), client, cartographer, cache, this.writeKey, this.flushQueueSize, this.flushIntervalInMillis, executorService, this.trackApplicationLifecycleEvents, countDownLatch, this.recordScreenViews, this.trackDeepLinks, booleanPreference, this.crypto, immutableCopyOf, emptyMap, this.edgeFunctionMiddleware, this.defaultProjectSettings, ProcessLifecycleOwner.get().getLifecycle(), this.nanosecondTimestamps, this.useNewLifecycleMethods);
        }

        public Builder collectDeviceId(boolean z) {
            this.collectDeviceID = z;
            return this;
        }

        public Builder connectionFactory(ConnectionFactory connectionFactory2) {
            if (connectionFactory2 != null) {
                this.connectionFactory = connectionFactory2;
                return this;
            }
            throw new IllegalArgumentException("ConnectionFactory must not be null.");
        }

        public Builder crypto(Crypto crypto2) {
            if (crypto2 != null) {
                this.crypto = crypto2;
                return this;
            }
            throw new IllegalArgumentException("Crypto must not be null.");
        }

        public Builder defaultOptions(Options options) {
            if (options != null) {
                this.defaultOptions = new Options();
                for (Map.Entry next : options.integrations().entrySet()) {
                    if (next.getValue() instanceof Boolean) {
                        this.defaultOptions.setIntegration((String) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                    } else {
                        this.defaultOptions.setIntegration((String) next.getKey(), true);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("defaultOptions must not be null.");
        }

        public Builder defaultProjectSettings(ValueMap valueMap) {
            Utils.assertNotNull(valueMap, "defaultProjectSettings");
            this.defaultProjectSettings = valueMap;
            return this;
        }

        @Deprecated
        public Builder disableBundledIntegrations() {
            return this;
        }

        public Builder executor(ExecutorService executorService) {
            this.executor = (ExecutorService) Utils.assertNotNull(executorService, "executor");
            return this;
        }

        public Builder experimentalNanosecondTimestamps() {
            this.nanosecondTimestamps = true;
            return this;
        }

        public Builder experimentalUseNewLifecycleMethods(boolean z) {
            this.useNewLifecycleMethods = z;
            return this;
        }

        public Builder flushInterval(long j2, TimeUnit timeUnit) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("timeUnit must not be null.");
            } else if (j2 > 0) {
                this.flushIntervalInMillis = timeUnit.toMillis(j2);
                return this;
            } else {
                throw new IllegalArgumentException("flushInterval must be greater than zero.");
            }
        }

        public Builder flushQueueSize(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("flushQueueSize must be greater than or equal to zero.");
            } else if (i2 <= 250) {
                this.flushQueueSize = i2;
                return this;
            } else {
                throw new IllegalArgumentException("flushQueueSize must be less than or equal to 250.");
            }
        }

        public Builder logLevel(LogLevel logLevel2) {
            if (logLevel2 != null) {
                this.logLevel = logLevel2;
                return this;
            }
            throw new IllegalArgumentException("LogLevel must not be null.");
        }

        public Builder middleware(Middleware middleware) {
            return useSourceMiddleware(middleware);
        }

        public Builder networkExecutor(ExecutorService executorService) {
            if (executorService != null) {
                this.networkExecutor = executorService;
                return this;
            }
            throw new IllegalArgumentException("Executor service must not be null.");
        }

        public Builder recordScreenViews() {
            this.recordScreenViews = true;
            return this;
        }

        public Builder tag(String str) {
            if (!Utils.isNullOrEmpty((CharSequence) str)) {
                this.tag = str;
                return this;
            }
            throw new IllegalArgumentException("tag must not be null or empty.");
        }

        public Builder trackApplicationLifecycleEvents() {
            this.trackApplicationLifecycleEvents = true;
            return this;
        }

        @Deprecated
        public Builder trackAttributionInformation() {
            return this;
        }

        public Builder trackDeepLinks() {
            this.trackDeepLinks = true;
            return this;
        }

        public Builder use(Integration.Factory factory) {
            if (factory != null) {
                this.factories.add(factory);
                return this;
            }
            throw new IllegalArgumentException("Factory must not be null.");
        }

        public Builder useDestinationMiddleware(String str, Middleware middleware) {
            if (this.edgeFunctionMiddleware != null) {
                throw new IllegalStateException("Can not use native middleware and edge function middleware");
            } else if (!Utils.isNullOrEmpty((CharSequence) str)) {
                Utils.assertNotNull(middleware, "middleware");
                if (this.destinationMiddleware == null) {
                    this.destinationMiddleware = new HashMap();
                }
                List list = this.destinationMiddleware.get(str);
                if (list == null) {
                    list = new ArrayList();
                    this.destinationMiddleware.put(str, list);
                }
                if (!list.contains(middleware)) {
                    list.add(middleware);
                    return this;
                }
                throw new IllegalStateException("Destination Middleware is already registered.");
            } else {
                throw new IllegalArgumentException("key must not be null or empty.");
            }
        }

        public Builder useEdgeFunctionMiddleware(JSMiddleware jSMiddleware) {
            Utils.assertNotNull(jSMiddleware, "middleware");
            if (this.sourceMiddleware == null && this.destinationMiddleware == null) {
                this.edgeFunctionMiddleware = jSMiddleware;
                return this;
            }
            throw new IllegalStateException("Can not use native middleware and edge function middleware");
        }

        public Builder useSourceMiddleware(Middleware middleware) {
            if (this.edgeFunctionMiddleware == null) {
                Utils.assertNotNull(middleware, "middleware");
                if (this.sourceMiddleware == null) {
                    this.sourceMiddleware = new ArrayList();
                }
                if (!this.sourceMiddleware.contains(middleware)) {
                    this.sourceMiddleware.add(middleware);
                    return this;
                }
                throw new IllegalStateException("Source Middleware is already registered.");
            }
            throw new IllegalStateException("Can not use native middleware and edge function middleware");
        }
    }

    public enum BundledIntegration {
        AMPLITUDE("Amplitude"),
        APPS_FLYER("AppsFlyer"),
        APPTIMIZE("Apptimize"),
        BUGSNAG("Bugsnag"),
        COUNTLY("Countly"),
        CRITTERCISM("Crittercism"),
        FLURRY("Flurry"),
        GOOGLE_ANALYTICS("Google Analytics"),
        KAHUNA("Kahuna"),
        LEANPLUM("Leanplum"),
        LOCALYTICS("Localytics"),
        MIXPANEL("Mixpanel"),
        QUANTCAST("Quantcast"),
        TAPLYTICS("Taplytics"),
        TAPSTREAM("Tapstream"),
        UXCAM("UXCam");
        
        public final String key;

        private BundledIntegration(String str) {
            this.key = str;
        }
    }

    public interface Callback<T> {
        void onReady(T t);
    }

    public enum LogLevel {
        NONE,
        INFO,
        DEBUG,
        BASIC,
        VERBOSE;

        public boolean log() {
            return this != NONE;
        }
    }

    public Analytics(Application application2, ExecutorService executorService, Stats stats2, Traits.Cache cache, AnalyticsContext analyticsContext2, Options options, @NonNull Logger logger2, String str, @NonNull List<Integration.Factory> list, Client client2, Cartographer cartographer2, ProjectSettings.Cache cache2, String str2, int i2, long j2, ExecutorService executorService2, boolean z, CountDownLatch countDownLatch, boolean z2, boolean z3, BooleanPreference booleanPreference, Crypto crypto2, @NonNull List<Middleware> list2, @NonNull Map<String, List<Middleware>> map, JSMiddleware jSMiddleware, @NonNull ValueMap valueMap, @NonNull Lifecycle lifecycle2, boolean z4, boolean z5) {
        Logger logger3 = logger2;
        String str3 = str;
        ExecutorService executorService3 = executorService2;
        final JSMiddleware jSMiddleware2 = jSMiddleware;
        Lifecycle lifecycle3 = lifecycle2;
        boolean z6 = z5;
        this.application = application2;
        this.networkExecutor = executorService;
        this.stats = stats2;
        this.traitsCache = cache;
        this.analyticsContext = analyticsContext2;
        this.defaultOptions = options;
        this.logger = logger3;
        this.tag = str3;
        this.client = client2;
        this.cartographer = cartographer2;
        this.projectSettingsCache = cache2;
        this.writeKey = str2;
        this.flushQueueSize = i2;
        this.flushIntervalInMillis = j2;
        this.advertisingIdLatch = countDownLatch;
        this.optOut = booleanPreference;
        this.factories = list;
        this.analyticsExecutor = executorService3;
        this.crypto = crypto2;
        this.sourceMiddleware = list2;
        this.destinationMiddleware = map;
        this.edgeFunctionMiddleware = jSMiddleware2;
        this.lifecycle = lifecycle3;
        this.nanosecondTimestamps = z4;
        this.useNewLifecycleMethods = z6;
        namespaceSharedPreferences();
        final ValueMap valueMap2 = valueMap;
        executorService3.submit(new Runnable() {
            public void run() {
                Analytics analytics = Analytics.this;
                analytics.projectSettings = analytics.getSettings();
                if (Utils.isNullOrEmpty((Map) Analytics.this.projectSettings)) {
                    if (!valueMap2.containsKey(BasePayload.INTEGRATIONS_KEY)) {
                        valueMap2.put(BasePayload.INTEGRATIONS_KEY, (Object) new ValueMap());
                    }
                    if (!valueMap2.getValueMap(BasePayload.INTEGRATIONS_KEY).containsKey(SegmentIntegration.SEGMENT_KEY)) {
                        valueMap2.getValueMap(BasePayload.INTEGRATIONS_KEY).put(SegmentIntegration.SEGMENT_KEY, (Object) new ValueMap());
                    }
                    if (!valueMap2.getValueMap(BasePayload.INTEGRATIONS_KEY).getValueMap(SegmentIntegration.SEGMENT_KEY).containsKey("apiKey")) {
                        valueMap2.getValueMap(BasePayload.INTEGRATIONS_KEY).getValueMap(SegmentIntegration.SEGMENT_KEY).putValue("apiKey", Analytics.this.writeKey);
                    }
                    Analytics.this.projectSettings = ProjectSettings.create(valueMap2);
                }
                JSMiddleware jSMiddleware = jSMiddleware2;
                if (jSMiddleware != null) {
                    jSMiddleware.setEdgeFunctionData(Analytics.this.projectSettings.edgeFunctions());
                }
                Analytics.HANDLER.post(new Runnable() {
                    public void run() {
                        Analytics analytics = Analytics.this;
                        analytics.performInitializeIntegrations(analytics.projectSettings);
                    }
                });
            }
        });
        logger3.debug("Created analytics client for project with tag:%s.", str3);
        AnalyticsActivityLifecycleCallbacks build = new AnalyticsActivityLifecycleCallbacks.Builder().analytics(this).analyticsExecutor(executorService3).shouldTrackApplicationLifecycleEvents(Boolean.valueOf(z)).trackDeepLinks(Boolean.valueOf(z3)).shouldRecordScreenViews(Boolean.valueOf(z2)).packageInfo(getPackageInfo(application2)).useNewLifecycleMethods(z6).build();
        this.activityLifecycleCallback = build;
        application2.registerActivityLifecycleCallbacks(build);
        if (z6) {
            lifecycle3.addObserver(build);
        }
    }

    private void assertNotShutdown() {
        if (this.shutdown) {
            throw new IllegalStateException("Cannot enqueue messages after client is shutdown.");
        }
    }

    private ProjectSettings downloadSettings() {
        try {
            ProjectSettings projectSettings2 = (ProjectSettings) this.networkExecutor.submit(new Callable<ProjectSettings>() {
                public ProjectSettings call() {
                    Client.Connection connection = null;
                    try {
                        connection = Analytics.this.client.fetchSettings();
                        return ProjectSettings.create(Analytics.this.cartographer.fromJson((Reader) Utils.buffer(connection.is)));
                    } finally {
                        Utils.closeQuietly(connection);
                    }
                }
            }).get();
            this.projectSettingsCache.set(projectSettings2);
            return projectSettings2;
        } catch (InterruptedException e2) {
            this.logger.error(e2, "Thread interrupted while fetching settings.", new Object[0]);
            return null;
        } catch (ExecutionException e3) {
            this.logger.error(e3, "Unable to fetch settings. Retrying in %s ms.", Long.valueOf(SETTINGS_RETRY_INTERVAL));
            return null;
        }
    }

    public static PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder y = a.y("Package not found: ");
            y.append(context.getPackageName());
            throw new AssertionError(y.toString());
        }
    }

    private long getSettingsRefreshInterval() {
        return this.logger.logLevel == LogLevel.DEBUG ? SETTINGS_RETRY_INTERVAL : SETTINGS_REFRESH_INTERVAL;
    }

    private void namespaceSharedPreferences() {
        SharedPreferences segmentSharedPreferences = Utils.getSegmentSharedPreferences(this.application, this.tag);
        BooleanPreference booleanPreference = new BooleanPreference(segmentSharedPreferences, "namespaceSharedPreferences", true);
        if (booleanPreference.get()) {
            Utils.copySharedPreferences(this.application.getSharedPreferences("analytics-android", 0), segmentSharedPreferences);
            booleanPreference.set(false);
        }
    }

    public static void setSingletonInstance(Analytics analytics) {
        synchronized (Analytics.class) {
            if (singleton == null) {
                singleton = analytics;
            } else {
                throw new IllegalStateException("Singleton instance already exists.");
            }
        }
    }

    private void waitForAdvertisingId() {
        try {
            this.advertisingIdLatch.await(15, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            this.logger.error(e2, "Thread interrupted while waiting for advertising ID.", new Object[0]);
        }
        if (this.advertisingIdLatch.getCount() == 1) {
            this.logger.debug("Advertising ID may not be collected because the API did not respond within 15 seconds.", new Object[0]);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|(1:12)|(1:14)|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.segment.analytics.Analytics with(android.content.Context r4) {
        /*
            com.segment.analytics.Analytics r0 = singleton
            if (r0 != 0) goto L_0x0046
            if (r4 == 0) goto L_0x003e
            java.lang.Class<com.segment.analytics.Analytics> r0 = com.segment.analytics.Analytics.class
            monitor-enter(r0)
            com.segment.analytics.Analytics r1 = singleton     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0039
            java.lang.String r1 = "analytics_write_key"
            java.lang.String r1 = com.segment.analytics.internal.Utils.getResourceString(r4, r1)     // Catch:{ all -> 0x003b }
            com.segment.analytics.Analytics$Builder r2 = new com.segment.analytics.Analytics$Builder     // Catch:{ all -> 0x003b }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x003b }
            java.lang.String r1 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0033 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0033 }
            r3 = 0
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0033 }
            int r4 = r4.flags     // Catch:{ NameNotFoundException -> 0x0033 }
            r4 = r4 & 2
            if (r4 == 0) goto L_0x002c
            r3 = 1
        L_0x002c:
            if (r3 == 0) goto L_0x0033
            com.segment.analytics.Analytics$LogLevel r4 = com.segment.analytics.Analytics.LogLevel.INFO     // Catch:{ NameNotFoundException -> 0x0033 }
            r2.logLevel(r4)     // Catch:{ NameNotFoundException -> 0x0033 }
        L_0x0033:
            com.segment.analytics.Analytics r4 = r2.build()     // Catch:{ all -> 0x003b }
            singleton = r4     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            goto L_0x0046
        L_0x003b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r4
        L_0x003e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Context must not be null."
            r4.<init>(r0)
            throw r4
        L_0x0046:
            com.segment.analytics.Analytics r4 = singleton
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.Analytics.with(android.content.Context):com.segment.analytics.Analytics");
    }

    public void alias(@NonNull String str) {
        alias(str, (Options) null);
    }

    public void alias(@NonNull final String str, @Nullable final Options options) {
        assertNotShutdown();
        if (!Utils.isNullOrEmpty((CharSequence) str)) {
            final NanoDate nanoDate = new NanoDate();
            this.analyticsExecutor.submit(new Runnable() {
                public void run() {
                    Analytics.this.fillAndEnqueue(((AliasPayload.Builder) ((AliasPayload.Builder) new AliasPayload.Builder().timestamp(nanoDate)).userId(str)).previousId(Analytics.this.analyticsContext.traits().currentId()), options);
                }
            });
            return;
        }
        throw new IllegalArgumentException("newId must not be null or empty.");
    }

    public void enqueue(BasePayload basePayload) {
        if (!this.optOut.get()) {
            this.logger.verbose("Created payload %s.", basePayload);
            new MiddlewareChainRunner(0, basePayload, this.sourceMiddleware, new Middleware.Callback() {
                public void invoke(BasePayload basePayload) {
                    Analytics.this.run(basePayload);
                }
            }).proceed(basePayload);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.segment.analytics.integrations.BasePayload$Builder, com.segment.analytics.integrations.BasePayload$Builder<?, ?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fillAndEnqueue(com.segment.analytics.integrations.BasePayload.Builder<?, ?> r4, com.segment.analytics.Options r5) {
        /*
            r3 = this;
            r3.waitForAdvertisingId()
            if (r5 != 0) goto L_0x0007
            com.segment.analytics.Options r5 = r3.defaultOptions
        L_0x0007:
            com.segment.analytics.AnalyticsContext r0 = new com.segment.analytics.AnalyticsContext
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            com.segment.analytics.AnalyticsContext r2 = r3.analyticsContext
            int r2 = r2.size()
            r1.<init>(r2)
            r0.<init>(r1)
            com.segment.analytics.AnalyticsContext r1 = r3.analyticsContext
            r0.putAll(r1)
            java.util.Map r1 = r5.context()
            r0.putAll(r1)
            com.segment.analytics.AnalyticsContext r0 = r0.unmodifiableCopy()
            r4.context(r0)
            com.segment.analytics.Traits r1 = r0.traits()
            java.lang.String r1 = r1.anonymousId()
            r4.anonymousId(r1)
            java.util.Map r5 = r5.integrations()
            r4.integrations(r5)
            boolean r5 = r3.nanosecondTimestamps
            r4.nanosecondTimestamps(r5)
            com.segment.analytics.Traits r5 = r0.traits()
            java.lang.String r5 = r5.userId()
            boolean r0 = r4.isUserIdSet()
            if (r0 != 0) goto L_0x0058
            boolean r0 = com.segment.analytics.internal.Utils.isNullOrEmpty((java.lang.CharSequence) r5)
            if (r0 != 0) goto L_0x0058
            r4.userId(r5)
        L_0x0058:
            com.segment.analytics.integrations.BasePayload r4 = r4.build()
            r3.enqueue(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.Analytics.fillAndEnqueue(com.segment.analytics.integrations.BasePayload$Builder, com.segment.analytics.Options):void");
    }

    public void flush() {
        if (!this.shutdown) {
            runOnMainThread(IntegrationOperation.FLUSH);
            return;
        }
        throw new IllegalStateException("Cannot enqueue messages after client is shutdown.");
    }

    public AnalyticsContext getAnalyticsContext() {
        return this.analyticsContext;
    }

    public Application getApplication() {
        return this.application;
    }

    public Options getDefaultOptions() {
        return new Options(this.defaultOptions.integrations(), this.defaultOptions.context());
    }

    public JSMiddleware getEdgeFunctionMiddleware() {
        return this.edgeFunctionMiddleware;
    }

    @Deprecated
    public LogLevel getLogLevel() {
        return this.logger.logLevel;
    }

    public Logger getLogger() {
        return this.logger;
    }

    public ProjectSettings getSettings() {
        ProjectSettings projectSettings2 = (ProjectSettings) this.projectSettingsCache.get();
        if (Utils.isNullOrEmpty((Map) projectSettings2)) {
            return downloadSettings();
        }
        if (projectSettings2.timestamp() + getSettingsRefreshInterval() > System.currentTimeMillis()) {
            return projectSettings2;
        }
        ProjectSettings downloadSettings = downloadSettings();
        return Utils.isNullOrEmpty((Map) downloadSettings) ? projectSettings2 : downloadSettings;
    }

    public StatsSnapshot getSnapshot() {
        return this.stats.createSnapshot();
    }

    public void group(@NonNull String str) {
        group(str, (Traits) null, (Options) null);
    }

    public void group(@NonNull String str, @Nullable Traits traits) {
        group(str, traits, (Options) null);
    }

    public void group(@NonNull String str, @Nullable Traits traits, @Nullable Options options) {
        assertNotShutdown();
        if (!Utils.isNullOrEmpty((CharSequence) str)) {
            final NanoDate nanoDate = new NanoDate();
            final Traits traits2 = traits;
            final String str2 = str;
            final Options options2 = options;
            this.analyticsExecutor.submit(new Runnable() {
                public void run() {
                    Traits traits = traits2;
                    if (traits == null) {
                        traits = new Traits();
                    }
                    Analytics.this.fillAndEnqueue(((GroupPayload.Builder) new GroupPayload.Builder().timestamp(nanoDate)).groupId(str2).traits(traits), options2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("groupId must not be null or empty.");
    }

    public void identify(@NonNull Traits traits) {
        identify((String) null, traits, (Options) null);
    }

    public void identify(@NonNull String str) {
        identify(str, (Traits) null, (Options) null);
    }

    public void identify(@Nullable String str, @Nullable Traits traits, @Nullable Options options) {
        assertNotShutdown();
        if (!Utils.isNullOrEmpty((CharSequence) str) || !Utils.isNullOrEmpty((Map) traits)) {
            final NanoDate nanoDate = new NanoDate();
            final String str2 = str;
            final Traits traits2 = traits;
            final Options options2 = options;
            this.analyticsExecutor.submit(new Runnable() {
                public void run() {
                    Traits traits = (Traits) Analytics.this.traitsCache.get();
                    if (!Utils.isNullOrEmpty((CharSequence) str2)) {
                        traits.putUserId(str2);
                    }
                    if (!Utils.isNullOrEmpty((Map) traits2)) {
                        traits.putAll(traits2);
                    }
                    Analytics.this.traitsCache.set(traits);
                    Analytics.this.analyticsContext.setTraits(traits);
                    Analytics.this.fillAndEnqueue(((IdentifyPayload.Builder) new IdentifyPayload.Builder().timestamp(nanoDate)).traits(Analytics.this.traitsCache.get()), options2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Either userId or some traits must be provided.");
    }

    public Logger logger(String str) {
        return this.logger.subLog(str);
    }

    @Deprecated
    public void logout() {
        reset();
    }

    public void onIntegrationReady(BundledIntegration bundledIntegration, Callback callback) {
        if (bundledIntegration != null) {
            onIntegrationReady(bundledIntegration.key, callback);
            return;
        }
        throw new IllegalArgumentException("integration cannot be null");
    }

    public <T> void onIntegrationReady(final String str, final Callback<T> callback) {
        if (!Utils.isNullOrEmpty((CharSequence) str)) {
            this.analyticsExecutor.submit(new Runnable() {
                public void run() {
                    Analytics.HANDLER.post(new Runnable() {
                        public void run() {
                            AnonymousClass11 r0 = AnonymousClass11.this;
                            Analytics.this.performCallback(str, callback);
                        }
                    });
                }
            });
            return;
        }
        throw new IllegalArgumentException("key cannot be null or empty.");
    }

    public void optOut(boolean z) {
        this.optOut.set(z);
    }

    public <T> void performCallback(String str, Callback<T> callback) {
        for (Map.Entry next : this.integrations.entrySet()) {
            if (str.equals(next.getKey())) {
                callback.onReady(((Integration) next.getValue()).getUnderlyingInstance());
                return;
            }
        }
    }

    public void performInitializeIntegrations(ProjectSettings projectSettings2) {
        if (!Utils.isNullOrEmpty((Map) projectSettings2)) {
            ValueMap integrations2 = projectSettings2.integrations();
            this.integrations = new LinkedHashMap(this.factories.size());
            for (int i2 = 0; i2 < this.factories.size(); i2++) {
                if (Utils.isNullOrEmpty((Map) integrations2)) {
                    this.logger.debug("Integration settings are empty", new Object[0]);
                } else {
                    Integration.Factory factory = this.factories.get(i2);
                    String key = factory.key();
                    if (!Utils.isNullOrEmpty((CharSequence) key)) {
                        ValueMap valueMap = integrations2.getValueMap(key);
                        if ((factory instanceof WebhookIntegration.WebhookIntegrationFactory) || !Utils.isNullOrEmpty((Map) valueMap)) {
                            Integration<?> create = factory.create(valueMap, this);
                            if (create == null) {
                                this.logger.info("Factory %s couldn't create integration.", factory);
                            } else {
                                this.integrations.put(key, create);
                                this.bundledIntegrations.put(key, Boolean.FALSE);
                            }
                        } else {
                            this.logger.debug("Integration %s is not enabled.", key);
                        }
                    } else {
                        throw new AssertionError("The factory key is empty!");
                    }
                }
            }
            this.factories = null;
            return;
        }
        throw new AssertionError("ProjectSettings is empty!");
    }

    public void performRun(IntegrationOperation integrationOperation) {
        for (Map.Entry next : this.integrations.entrySet()) {
            String str = (String) next.getKey();
            long nanoTime = System.nanoTime();
            integrationOperation.run(str, (Integration) next.getValue(), this.projectSettings);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.stats.dispatchIntegrationOperation(str, TimeUnit.NANOSECONDS.toMillis(nanoTime2));
            this.logger.debug("Ran %s on integration %s in %d ns.", integrationOperation, str, Long.valueOf(nanoTime2));
        }
    }

    public void recordScreenViews(Activity activity) {
        PackageManager packageManager = activity.getPackageManager();
        try {
            screen(packageManager.getActivityInfo(activity.getComponentName(), 128).loadLabel(packageManager).toString());
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder y = a.y("Activity Not Found: ");
            y.append(e2.toString());
            throw new AssertionError(y.toString());
        } catch (Exception e3) {
            this.logger.error(e3, "Unable to track screen view for %s", activity.toString());
        }
    }

    public void reset() {
        SharedPreferences.Editor edit = Utils.getSegmentSharedPreferences(this.application, this.tag).edit();
        StringBuilder y = a.y("traits-");
        y.append(this.tag);
        edit.remove(y.toString());
        edit.apply();
        this.traitsCache.delete();
        this.traitsCache.set(Traits.create());
        this.analyticsContext.setTraits((Traits) this.traitsCache.get());
        runOnMainThread(IntegrationOperation.RESET);
    }

    public void run(BasePayload basePayload) {
        this.logger.verbose("Running payload %s.", basePayload);
        final IntegrationOperation segmentEvent = IntegrationOperation.segmentEvent(basePayload, this.destinationMiddleware);
        HANDLER.post(new Runnable() {
            public void run() {
                Analytics.this.performRun(segmentEvent);
            }
        });
    }

    public void runOnMainThread(final IntegrationOperation integrationOperation) {
        if (!this.shutdown) {
            this.analyticsExecutor.submit(new Runnable() {
                public void run() {
                    Analytics.HANDLER.post(new Runnable() {
                        public void run() {
                            AnonymousClass3 r0 = AnonymousClass3.this;
                            Analytics.this.performRun(integrationOperation);
                        }
                    });
                }
            });
        }
    }

    public void screen(@Nullable String str) {
        screen((String) null, str, (Properties) null, (Options) null);
    }

    public void screen(@Nullable String str, @Nullable Properties properties) {
        screen((String) null, str, properties, (Options) null);
    }

    public void screen(@Nullable String str, @Nullable String str2) {
        screen(str, str2, (Properties) null, (Options) null);
    }

    public void screen(@Nullable String str, @Nullable String str2, @Nullable Properties properties) {
        screen(str, str2, properties, (Options) null);
    }

    public void screen(@Nullable String str, @Nullable String str2, @Nullable Properties properties, @Nullable Options options) {
        assertNotShutdown();
        if (!Utils.isNullOrEmpty((CharSequence) str) || !Utils.isNullOrEmpty((CharSequence) str2)) {
            final NanoDate nanoDate = new NanoDate();
            final Properties properties2 = properties;
            final String str3 = str2;
            final String str4 = str;
            final Options options2 = options;
            this.analyticsExecutor.submit(new Runnable() {
                public void run() {
                    Properties properties = properties2;
                    if (properties == null) {
                        properties = Analytics.EMPTY_PROPERTIES;
                    }
                    Analytics.this.fillAndEnqueue(((ScreenPayload.Builder) new ScreenPayload.Builder().timestamp(nanoDate)).name(str3).category(str4).properties(properties), options2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("either category or name must be provided.");
    }

    public void shutdown() {
        if (this == singleton) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        } else if (!this.shutdown) {
            this.application.unregisterActivityLifecycleCallbacks(this.activityLifecycleCallback);
            if (this.useNewLifecycleMethods) {
                this.lifecycle.removeObserver(this.activityLifecycleCallback);
            }
            this.analyticsExecutor.shutdown();
            ExecutorService executorService = this.networkExecutor;
            if (executorService instanceof Utils.AnalyticsNetworkExecutorService) {
                executorService.shutdown();
            }
            this.stats.shutdown();
            this.shutdown = true;
            List<String> list = INSTANCES;
            synchronized (list) {
                list.remove(this.tag);
            }
        }
    }

    public void track(@NonNull String str) {
        track(str, (Properties) null, (Options) null);
    }

    public void track(@NonNull String str, @Nullable Properties properties) {
        track(str, properties, (Options) null);
    }

    public void track(@NonNull String str, @Nullable Properties properties, @Nullable Options options) {
        assertNotShutdown();
        if (!Utils.isNullOrEmpty((CharSequence) str)) {
            final NanoDate nanoDate = new NanoDate();
            final Properties properties2 = properties;
            final String str2 = str;
            final Options options2 = options;
            this.analyticsExecutor.submit(new Runnable() {
                public void run() {
                    Properties properties = properties2;
                    if (properties == null) {
                        properties = Analytics.EMPTY_PROPERTIES;
                    }
                    Analytics.this.fillAndEnqueue(((TrackPayload.Builder) new TrackPayload.Builder().timestamp(nanoDate)).event(str2).properties(properties), options2);
                }
            });
            return;
        }
        throw new IllegalArgumentException("event must not be null or empty.");
    }

    public void trackApplicationLifecycleEvents() {
        Properties putValue;
        String str;
        PackageInfo packageInfo = getPackageInfo(this.application);
        String str2 = packageInfo.versionName;
        int i2 = packageInfo.versionCode;
        SharedPreferences segmentSharedPreferences = Utils.getSegmentSharedPreferences(this.application, this.tag);
        String string = segmentSharedPreferences.getString(VERSION_KEY, (String) null);
        int i3 = segmentSharedPreferences.getInt(BUILD_KEY, -1);
        if (i3 == -1) {
            putValue = new Properties().putValue(VERSION_KEY, (Object) str2).putValue(BUILD_KEY, (Object) String.valueOf(i2));
            str = "Application Installed";
        } else {
            if (i2 != i3) {
                putValue = new Properties().putValue(VERSION_KEY, (Object) str2).putValue(BUILD_KEY, (Object) String.valueOf(i2)).putValue("previous_version", (Object) string).putValue("previous_build", (Object) String.valueOf(i3));
                str = "Application Updated";
            }
            SharedPreferences.Editor edit = segmentSharedPreferences.edit();
            edit.putString(VERSION_KEY, str2);
            edit.putInt(BUILD_KEY, i2);
            edit.apply();
        }
        track(str, putValue);
        SharedPreferences.Editor edit2 = segmentSharedPreferences.edit();
        edit2.putString(VERSION_KEY, str2);
        edit2.putInt(BUILD_KEY, i2);
        edit2.apply();
    }
}
