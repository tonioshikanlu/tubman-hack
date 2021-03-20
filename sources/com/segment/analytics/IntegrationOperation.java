package com.segment.analytics;

import android.app.Activity;
import android.os.Bundle;
import b.e.a.a.a;
import com.segment.analytics.Middleware;
import com.segment.analytics.integrations.AliasPayload;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.integrations.GroupPayload;
import com.segment.analytics.integrations.IdentifyPayload;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.ScreenPayload;
import com.segment.analytics.integrations.TrackPayload;
import com.segment.analytics.internal.Utils;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class IntegrationOperation {
    public static final IntegrationOperation FLUSH = new IntegrationOperation() {
        public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
            integration.flush();
        }

        public String toString() {
            return "Flush";
        }
    };
    public static final IntegrationOperation RESET = new IntegrationOperation() {
        public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
            integration.reset();
        }

        public String toString() {
            return "Reset";
        }
    };

    /* renamed from: com.segment.analytics.IntegrationOperation$11  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass11 {
        public static final /* synthetic */ int[] $SwitchMap$com$segment$analytics$integrations$BasePayload$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|(2:3|4)|5|7|8|9|10|11|12|14) */
        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
        static {
            /*
                com.segment.analytics.integrations.BasePayload.Type.values()
                r0 = 5
                int[] r1 = new int[r0]
                $SwitchMap$com$segment$analytics$integrations$BasePayload$Type = r1
                r2 = 1
                r3 = 2
                com.segment.analytics.integrations.BasePayload$Type r4 = com.segment.analytics.integrations.BasePayload.Type.identify     // Catch:{ NoSuchFieldError -> 0x000e }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                int[] r1 = $SwitchMap$com$segment$analytics$integrations$BasePayload$Type     // Catch:{ NoSuchFieldError -> 0x0015 }
                com.segment.analytics.integrations.BasePayload$Type r4 = com.segment.analytics.integrations.BasePayload.Type.alias     // Catch:{ NoSuchFieldError -> 0x0015 }
                r4 = 0
                r1[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                r1 = 3
                int[] r3 = $SwitchMap$com$segment$analytics$integrations$BasePayload$Type     // Catch:{ NoSuchFieldError -> 0x001c }
                com.segment.analytics.integrations.BasePayload$Type r4 = com.segment.analytics.integrations.BasePayload.Type.group     // Catch:{ NoSuchFieldError -> 0x001c }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r2 = $SwitchMap$com$segment$analytics$integrations$BasePayload$Type     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.segment.analytics.integrations.BasePayload$Type r3 = com.segment.analytics.integrations.BasePayload.Type.track     // Catch:{ NoSuchFieldError -> 0x0023 }
                r3 = 4
                r2[r3] = r3     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = $SwitchMap$com$segment$analytics$integrations$BasePayload$Type     // Catch:{ NoSuchFieldError -> 0x0029 }
                com.segment.analytics.integrations.BasePayload$Type r3 = com.segment.analytics.integrations.BasePayload.Type.screen     // Catch:{ NoSuchFieldError -> 0x0029 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0029 }
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.IntegrationOperation.AnonymousClass11.<clinit>():void");
        }
    }

    private IntegrationOperation() {
    }

    public static void alias(AliasPayload aliasPayload, String str, Integration<?> integration) {
        if (isIntegrationEnabled(aliasPayload.integrations(), str)) {
            integration.alias(aliasPayload);
        }
    }

    public static List<Middleware> getMiddlewareList(Map<String, List<Middleware>> map, String str) {
        List<Middleware> list = map.get(str);
        return list == null ? Collections.emptyList() : list;
    }

    public static void group(GroupPayload groupPayload, String str, Integration<?> integration) {
        if (isIntegrationEnabled(groupPayload.integrations(), str)) {
            integration.group(groupPayload);
        }
    }

    public static void identify(IdentifyPayload identifyPayload, String str, Integration<?> integration) {
        if (isIntegrationEnabled(identifyPayload.integrations(), str)) {
            integration.identify(identifyPayload);
        }
    }

    public static boolean isIntegrationEnabled(ValueMap valueMap, String str) {
        if (Utils.isNullOrEmpty((Map) valueMap) || SegmentIntegration.SEGMENT_KEY.equals(str)) {
            return true;
        }
        if (!valueMap.containsKey(str)) {
            str = Options.ALL_INTEGRATIONS_KEY;
            if (!valueMap.containsKey(str)) {
                return true;
            }
        }
        return valueMap.getBoolean(str, true);
    }

    public static IntegrationOperation onActivityCreated(final Activity activity, final Bundle bundle) {
        return new IntegrationOperation() {
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityCreated(activity, bundle);
            }

            public String toString() {
                return "Activity Created";
            }
        };
    }

    public static IntegrationOperation onActivityDestroyed(final Activity activity) {
        return new IntegrationOperation() {
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityDestroyed(activity);
            }

            public String toString() {
                return "Activity Destroyed";
            }
        };
    }

    public static IntegrationOperation onActivityPaused(final Activity activity) {
        return new IntegrationOperation() {
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityPaused(activity);
            }

            public String toString() {
                return "Activity Paused";
            }
        };
    }

    public static IntegrationOperation onActivityResumed(final Activity activity) {
        return new IntegrationOperation() {
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityResumed(activity);
            }

            public String toString() {
                return "Activity Resumed";
            }
        };
    }

    public static IntegrationOperation onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        return new IntegrationOperation() {
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivitySaveInstanceState(activity, bundle);
            }

            public String toString() {
                return "Activity Save Instance";
            }
        };
    }

    public static IntegrationOperation onActivityStarted(final Activity activity) {
        return new IntegrationOperation() {
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityStarted(activity);
            }

            public String toString() {
                return "Activity Started";
            }
        };
    }

    public static IntegrationOperation onActivityStopped(final Activity activity) {
        return new IntegrationOperation() {
            public void run(String str, Integration<?> integration, ProjectSettings projectSettings) {
                integration.onActivityStopped(activity);
            }

            public String toString() {
                return "Activity Stopped";
            }
        };
    }

    public static void runMiddlewareChain(BasePayload basePayload, List<Middleware> list, Middleware.Callback callback) {
        new MiddlewareChainRunner(0, basePayload, list, callback).proceed(basePayload);
    }

    public static void screen(ScreenPayload screenPayload, String str, Integration<?> integration) {
        if (isIntegrationEnabled(screenPayload.integrations(), str)) {
            integration.screen(screenPayload);
        }
    }

    public static IntegrationOperation segmentEvent(final BasePayload basePayload, final Map<String, List<Middleware>> map) {
        return new IntegrationOperation() {
            public void run(final String str, final Integration<?> integration, final ProjectSettings projectSettings) {
                IntegrationOperation.runMiddlewareChain(basePayload, IntegrationOperation.getMiddlewareList(map, str), new Middleware.Callback() {
                    public void invoke(BasePayload basePayload) {
                        int ordinal = basePayload.type().ordinal();
                        if (ordinal == 0) {
                            IntegrationOperation.alias((AliasPayload) basePayload, str, integration);
                        } else if (ordinal == 1) {
                            IntegrationOperation.group((GroupPayload) basePayload, str, integration);
                        } else if (ordinal == 2) {
                            IntegrationOperation.identify((IdentifyPayload) basePayload, str, integration);
                        } else if (ordinal == 3) {
                            IntegrationOperation.screen((ScreenPayload) basePayload, str, integration);
                        } else if (ordinal == 4) {
                            IntegrationOperation.track((TrackPayload) basePayload, str, integration, projectSettings);
                        } else {
                            StringBuilder y = a.y("unknown type ");
                            y.append(basePayload.type());
                            throw new AssertionError(y.toString());
                        }
                    }
                });
            }

            public String toString() {
                return basePayload.toString();
            }
        };
    }

    public static void track(TrackPayload trackPayload, String str, Integration<?> integration, ProjectSettings projectSettings) {
        ValueMap integrations = trackPayload.integrations();
        ValueMap trackingPlan = projectSettings.trackingPlan();
        if (!Utils.isNullOrEmpty((Map) trackingPlan)) {
            ValueMap valueMap = trackingPlan.getValueMap(trackPayload.event());
            if (Utils.isNullOrEmpty((Map) valueMap)) {
                if (Utils.isNullOrEmpty((Map) integrations)) {
                    ValueMap valueMap2 = trackingPlan.getValueMap("__default");
                    if (Utils.isNullOrEmpty((Map) valueMap2)) {
                        integration.track(trackPayload);
                    } else if (valueMap2.getBoolean("enabled", true) || SegmentIntegration.SEGMENT_KEY.equals(str)) {
                        integration.track(trackPayload);
                    }
                } else if (isIntegrationEnabled(integrations, str)) {
                    integration.track(trackPayload);
                }
            } else if (valueMap.getBoolean("enabled", true)) {
                ValueMap valueMap3 = new ValueMap();
                ValueMap valueMap4 = valueMap.getValueMap(BasePayload.INTEGRATIONS_KEY);
                if (!Utils.isNullOrEmpty((Map) valueMap4)) {
                    valueMap3.putAll(valueMap4);
                }
                valueMap3.putAll(integrations);
                if (isIntegrationEnabled(valueMap3, str)) {
                    integration.track(trackPayload);
                }
            } else if (SegmentIntegration.SEGMENT_KEY.equals(str)) {
                integration.track(trackPayload);
            }
        } else if (isIntegrationEnabled(integrations, str)) {
            integration.track(trackPayload);
        }
    }

    public abstract void run(String str, Integration<?> integration, ProjectSettings projectSettings);
}
