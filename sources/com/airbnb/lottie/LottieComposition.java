package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class LottieComposition {
    private Rect bounds;
    private SparseArrayCompat<FontCharacter> characters;
    private float endFrame;
    private Map<String, Font> fonts;
    private float frameRate;
    private boolean hasDashPattern;
    private Map<String, LottieImageAsset> images;
    private LongSparseArray<Layer> layerMap;
    private List<Layer> layers;
    private List<Marker> markers;
    private int maskAndMatteCount = 0;
    private final PerformanceTracker performanceTracker = new PerformanceTracker();
    private Map<String, List<Layer>> precomps;
    private float startFrame;
    private final HashSet<String> warnings = new HashSet<>();

    @Deprecated
    public static class Factory {

        public static final class ListenerAdapter implements LottieListener<LottieComposition>, Cancellable {
            private boolean cancelled;
            private final OnCompositionLoadedListener listener;

            private ListenerAdapter(OnCompositionLoadedListener onCompositionLoadedListener) {
                this.cancelled = false;
                this.listener = onCompositionLoadedListener;
            }

            public void cancel() {
                this.cancelled = true;
            }

            public void onResult(LottieComposition lottieComposition) {
                if (!this.cancelled) {
                    this.listener.onCompositionLoaded(lottieComposition);
                }
            }
        }

        private Factory() {
        }

        @Deprecated
        public static Cancellable fromAssetFileName(Context context, String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromAsset(context, str).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @WorkerThread
        @Deprecated
        @Nullable
        public static LottieComposition fromFileSync(Context context, String str) {
            return LottieCompositionFactory.fromAssetSync(context, str).getValue();
        }

        @Deprecated
        public static Cancellable fromInputStream(InputStream inputStream, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonInputStream(inputStream, (String) null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @WorkerThread
        @Deprecated
        @Nullable
        public static LottieComposition fromInputStreamSync(InputStream inputStream) {
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, (String) null).getValue();
        }

        @WorkerThread
        @Deprecated
        @Nullable
        public static LottieComposition fromInputStreamSync(InputStream inputStream, boolean z) {
            if (z) {
                Logger.warning("Lottie now auto-closes input stream!");
            }
            return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, (String) null).getValue();
        }

        @Deprecated
        public static Cancellable fromJsonReader(JsonReader jsonReader, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonReader(jsonReader, (String) null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @Deprecated
        public static Cancellable fromJsonString(String str, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromJsonString(str, (String) null).addListener(listenerAdapter);
            return listenerAdapter;
        }

        @WorkerThread
        @Deprecated
        @Nullable
        public static LottieComposition fromJsonSync(Resources resources, JSONObject jSONObject) {
            return LottieCompositionFactory.fromJsonSync(jSONObject, (String) null).getValue();
        }

        @WorkerThread
        @Deprecated
        @Nullable
        public static LottieComposition fromJsonSync(JsonReader jsonReader) {
            return LottieCompositionFactory.fromJsonReaderSync(jsonReader, (String) null).getValue();
        }

        @WorkerThread
        @Deprecated
        @Nullable
        public static LottieComposition fromJsonSync(String str) {
            return LottieCompositionFactory.fromJsonStringSync(str, (String) null).getValue();
        }

        @Deprecated
        public static Cancellable fromRawFile(Context context, @RawRes int i2, OnCompositionLoadedListener onCompositionLoadedListener) {
            ListenerAdapter listenerAdapter = new ListenerAdapter(onCompositionLoadedListener);
            LottieCompositionFactory.fromRawRes(context, i2).addListener(listenerAdapter);
            return listenerAdapter;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void addWarning(String str) {
        Logger.warning(str);
        this.warnings.add(str);
    }

    public Rect getBounds() {
        return this.bounds;
    }

    public SparseArrayCompat<FontCharacter> getCharacters() {
        return this.characters;
    }

    public float getDuration() {
        return (float) ((long) ((getDurationFrames() / this.frameRate) * 1000.0f));
    }

    public float getDurationFrames() {
        return this.endFrame - this.startFrame;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getEndFrame() {
        return this.endFrame;
    }

    public Map<String, Font> getFonts() {
        return this.fonts;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public Map<String, LottieImageAsset> getImages() {
        return this.images;
    }

    public List<Layer> getLayers() {
        return this.layers;
    }

    @Nullable
    public Marker getMarker(String str) {
        this.markers.size();
        for (int i2 = 0; i2 < this.markers.size(); i2++) {
            Marker marker = this.markers.get(i2);
            if (marker.matchesName(str)) {
                return marker;
            }
        }
        return null;
    }

    public List<Marker> getMarkers() {
        return this.markers;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getMaskAndMatteCount() {
        return this.maskAndMatteCount;
    }

    public PerformanceTracker getPerformanceTracker() {
        return this.performanceTracker;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<Layer> getPrecomps(String str) {
        return this.precomps.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getStartFrame() {
        return this.startFrame;
    }

    public ArrayList<String> getWarnings() {
        HashSet<String> hashSet = this.warnings;
        return new ArrayList<>(Arrays.asList(hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDashPattern() {
        return this.hasDashPattern;
    }

    public boolean hasImages() {
        return !this.images.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void incrementMatteOrMaskCount(int i2) {
        this.maskAndMatteCount += i2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void init(Rect rect, float f, float f2, float f3, List<Layer> list, LongSparseArray<Layer> longSparseArray, Map<String, List<Layer>> map, Map<String, LottieImageAsset> map2, SparseArrayCompat<FontCharacter> sparseArrayCompat, Map<String, Font> map3, List<Marker> list2) {
        this.bounds = rect;
        this.startFrame = f;
        this.endFrame = f2;
        this.frameRate = f3;
        this.layers = list;
        this.layerMap = longSparseArray;
        this.precomps = map;
        this.images = map2;
        this.characters = sparseArrayCompat;
        this.fonts = map3;
        this.markers = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Layer layerModelForId(long j2) {
        return this.layerMap.get(j2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setHasDashPattern(boolean z) {
        this.hasDashPattern = z;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTracker.setEnabled(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.layers) {
            sb.append(layer.toString("\t"));
        }
        return sb.toString();
    }
}
