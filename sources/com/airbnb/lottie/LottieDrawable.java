package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.parser.LayerParser;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private static final String TAG = LottieDrawable.class.getSimpleName();
    private int alpha;
    /* access modifiers changed from: private */
    public final LottieValueAnimator animator;
    private final Set<ColorFilterData> colorFilterData;
    private LottieComposition composition;
    /* access modifiers changed from: private */
    @Nullable
    public CompositionLayer compositionLayer;
    private boolean enableMergePaths;
    @Nullable
    public FontAssetDelegate fontAssetDelegate;
    @Nullable
    private FontAssetManager fontAssetManager;
    @Nullable
    private ImageAssetDelegate imageAssetDelegate;
    @Nullable
    private ImageAssetManager imageAssetManager;
    @Nullable
    private String imageAssetsFolder;
    private boolean isApplyingOpacityToLayersEnabled;
    private boolean isDirty;
    private boolean isExtraScaleEnabled;
    private final ArrayList<LazyCompositionTask> lazyCompositionTasks;
    private final Matrix matrix = new Matrix();
    private boolean performanceTrackingEnabled;
    private final ValueAnimator.AnimatorUpdateListener progressUpdateListener;
    private boolean safeMode;
    private float scale;
    @Nullable
    private ImageView.ScaleType scaleType;
    private boolean systemAnimationsEnabled;
    @Nullable
    public TextDelegate textDelegate;

    public static class ColorFilterData {
        @Nullable
        public final ColorFilter colorFilter;
        @Nullable
        public final String contentName;
        public final String layerName;

        public ColorFilterData(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter2) {
            this.layerName = str;
            this.contentName = str2;
            this.colorFilter = colorFilter2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorFilterData)) {
                return false;
            }
            ColorFilterData colorFilterData = (ColorFilterData) obj;
            return hashCode() == colorFilterData.hashCode() && this.colorFilter == colorFilterData.colorFilter;
        }

        public int hashCode() {
            String str = this.layerName;
            int hashCode = str != null ? str.hashCode() * 527 : 17;
            String str2 = this.contentName;
            return str2 != null ? hashCode * 31 * str2.hashCode() : hashCode;
        }
    }

    public interface LazyCompositionTask {
        void run(LottieComposition lottieComposition);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        this.animator = lottieValueAnimator;
        this.scale = 1.0f;
        this.systemAnimationsEnabled = true;
        this.safeMode = false;
        this.colorFilterData = new HashSet();
        this.lazyCompositionTasks = new ArrayList<>();
        AnonymousClass1 r3 = new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (LottieDrawable.this.compositionLayer != null) {
                    LottieDrawable.this.compositionLayer.setProgress(LottieDrawable.this.animator.getAnimatedValueAbsolute());
                }
            }
        };
        this.progressUpdateListener = r3;
        this.alpha = 255;
        this.isExtraScaleEnabled = true;
        this.isDirty = false;
        lottieValueAnimator.addUpdateListener(r3);
    }

    private void buildCompositionLayer() {
        this.compositionLayer = new CompositionLayer(this, LayerParser.parse(this.composition), this.composition.getLayers(), this.composition);
    }

    private void drawInternal(@NonNull Canvas canvas) {
        if (ImageView.ScaleType.FIT_XY == this.scaleType) {
            drawWithNewAspectRatio(canvas);
        } else {
            drawWithOriginalAspectRatio(canvas);
        }
    }

    private void drawWithNewAspectRatio(Canvas canvas) {
        float f;
        if (this.compositionLayer != null) {
            int i2 = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.composition.getBounds().width());
            float height = ((float) bounds.height()) / ((float) this.composition.getBounds().height());
            if (this.isExtraScaleEnabled) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f = 1.0f / min;
                    width /= f;
                    height /= f;
                } else {
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i2 = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
            this.matrix.reset();
            this.matrix.preScale(width, height);
            this.compositionLayer.draw(canvas, this.matrix, this.alpha);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
            }
        }
    }

    private void drawWithOriginalAspectRatio(Canvas canvas) {
        float f;
        if (this.compositionLayer != null) {
            float f2 = this.scale;
            float maxScale = getMaxScale(canvas);
            if (f2 > maxScale) {
                f = this.scale / maxScale;
            } else {
                maxScale = f2;
                f = 1.0f;
            }
            int i2 = -1;
            if (f > 1.0f) {
                i2 = canvas.save();
                float width = ((float) this.composition.getBounds().width()) / 2.0f;
                float height = ((float) this.composition.getBounds().height()) / 2.0f;
                float f3 = width * maxScale;
                float f4 = height * maxScale;
                canvas.translate((getScale() * width) - f3, (getScale() * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.matrix.reset();
            this.matrix.preScale(maxScale, maxScale);
            this.compositionLayer.draw(canvas, this.matrix, this.alpha);
            if (i2 > 0) {
                canvas.restoreToCount(i2);
            }
        }
    }

    @Nullable
    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private FontAssetManager getFontAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        if (this.fontAssetManager == null) {
            this.fontAssetManager = new FontAssetManager(getCallback(), this.fontAssetDelegate);
        }
        return this.fontAssetManager;
    }

    private ImageAssetManager getImageAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        ImageAssetManager imageAssetManager2 = this.imageAssetManager;
        if (imageAssetManager2 != null && !imageAssetManager2.hasSameContext(getContext())) {
            this.imageAssetManager = null;
        }
        if (this.imageAssetManager == null) {
            this.imageAssetManager = new ImageAssetManager(getCallback(), this.imageAssetsFolder, this.imageAssetDelegate, this.composition.getImages());
        }
        return this.imageAssetManager;
    }

    private float getMaxScale(@NonNull Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.composition.getBounds().width()), ((float) canvas.getHeight()) / ((float) this.composition.getBounds().height()));
    }

    private void updateBounds() {
        if (this.composition != null) {
            float scale2 = getScale();
            setBounds(0, 0, (int) (((float) this.composition.getBounds().width()) * scale2), (int) (((float) this.composition.getBounds().height()) * scale2));
        }
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(final KeyPath keyPath, final T t, final LottieValueCallback<T> lottieValueCallback) {
        CompositionLayer compositionLayer2 = this.compositionLayer;
        if (compositionLayer2 == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.addValueCallback(keyPath, t, lottieValueCallback);
                }
            });
            return;
        }
        boolean z = true;
        if (keyPath == KeyPath.COMPOSITION) {
            compositionLayer2.addValueCallback(t, lottieValueCallback);
        } else if (keyPath.getResolvedElement() != null) {
            keyPath.getResolvedElement().addValueCallback(t, lottieValueCallback);
        } else {
            List<KeyPath> resolveKeyPath = resolveKeyPath(keyPath);
            for (int i2 = 0; i2 < resolveKeyPath.size(); i2++) {
                resolveKeyPath.get(i2).getResolvedElement().addValueCallback(t, lottieValueCallback);
            }
            z = true ^ resolveKeyPath.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == LottieProperty.TIME_REMAP) {
                setProgress(getProgress());
            }
        }
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, final SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        addValueCallback(keyPath, t, new LottieValueCallback<T>() {
            public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
                return simpleLottieValueCallback.getValue(lottieFrameInfo);
            }
        });
    }

    public void cancelAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.cancel();
    }

    public void clearComposition() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
        }
        this.composition = null;
        this.compositionLayer = null;
        this.imageAssetManager = null;
        this.animator.clearComposition();
        invalidateSelf();
    }

    public void disableExtraScaleModeInFitXY() {
        this.isExtraScaleEnabled = false;
    }

    public void draw(@NonNull Canvas canvas) {
        this.isDirty = false;
        L.beginSection("Drawable#draw");
        if (this.safeMode) {
            try {
                drawInternal(canvas);
            } catch (Throwable th) {
                Logger.error("Lottie crashed in draw!", th);
            }
        } else {
            drawInternal(canvas);
        }
        L.endSection("Drawable#draw");
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        if (this.enableMergePaths != z) {
            this.enableMergePaths = z;
            if (this.composition != null) {
                buildCompositionLayer();
            }
        }
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    @MainThread
    public void endAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.endAnimation();
    }

    public int getAlpha() {
        return this.alpha;
    }

    public LottieComposition getComposition() {
        return this.composition;
    }

    public int getFrame() {
        return (int) this.animator.getFrame();
    }

    @Nullable
    public Bitmap getImageAsset(String str) {
        ImageAssetManager imageAssetManager2 = getImageAssetManager();
        if (imageAssetManager2 != null) {
            return imageAssetManager2.bitmapForId(str);
        }
        return null;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    public int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return -1;
        }
        return (int) (getScale() * ((float) lottieComposition.getBounds().height()));
    }

    public int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return -1;
        }
        return (int) (getScale() * ((float) lottieComposition.getBounds().width()));
    }

    public float getMaxFrame() {
        return this.animator.getMaxFrame();
    }

    public float getMinFrame() {
        return this.animator.getMinFrame();
    }

    public int getOpacity() {
        return -3;
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            return lottieComposition.getPerformanceTracker();
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.animator.getAnimatedValueAbsolute();
    }

    public int getRepeatCount() {
        return this.animator.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.animator.getRepeatMode();
    }

    public float getScale() {
        return this.scale;
    }

    public float getSpeed() {
        return this.animator.getSpeed();
    }

    @Nullable
    public TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    @Nullable
    public Typeface getTypeface(String str, String str2) {
        FontAssetManager fontAssetManager2 = getFontAssetManager();
        if (fontAssetManager2 != null) {
            return fontAssetManager2.getTypeface(str, str2);
        }
        return null;
    }

    public boolean hasMasks() {
        CompositionLayer compositionLayer2 = this.compositionLayer;
        return compositionLayer2 != null && compositionLayer2.hasMasks();
    }

    public boolean hasMatte() {
        CompositionLayer compositionLayer2 = this.compositionLayer;
        return compositionLayer2 != null && compositionLayer2.hasMatte();
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.isDirty) {
            this.isDirty = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isAnimating() {
        LottieValueAnimator lottieValueAnimator = this.animator;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.isRunning();
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.isApplyingOpacityToLayersEnabled;
    }

    public boolean isLooping() {
        return this.animator.getRepeatCount() == -1;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z) {
        this.animator.setRepeatCount(z ? -1 : 0);
    }

    public void pauseAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.pauseAnimation();
    }

    @MainThread
    public void playAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.playAnimation();
                }
            });
            return;
        }
        if (this.systemAnimationsEnabled || getRepeatCount() == 0) {
            this.animator.playAnimation();
        }
        if (!this.systemAnimationsEnabled) {
            setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
            this.animator.endAnimation();
        }
    }

    public void removeAllAnimatorListeners() {
        this.animator.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.animator.removeAllUpdateListeners();
        this.animator.addUpdateListener(this.progressUpdateListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.removeUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        if (this.compositionLayer == null) {
            Logger.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.compositionLayer.resolveKeyPath(keyPath, 0, arrayList, new KeyPath(new String[0]));
        return arrayList;
    }

    @MainThread
    public void resumeAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.resumeAnimation();
                }
            });
            return;
        }
        if (this.systemAnimationsEnabled || getRepeatCount() == 0) {
            this.animator.resumeAnimation();
        }
        if (!this.systemAnimationsEnabled) {
            setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
            this.animator.endAnimation();
        }
    }

    public void reverseAnimationSpeed() {
        this.animator.reverseAnimationSpeed();
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(@IntRange(from = 0, to = 255) int i2) {
        this.alpha = i2;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.isApplyingOpacityToLayersEnabled = z;
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Logger.warning("Use addColorFilter instead.");
    }

    public boolean setComposition(LottieComposition lottieComposition) {
        if (this.composition == lottieComposition) {
            return false;
        }
        this.isDirty = false;
        clearComposition();
        this.composition = lottieComposition;
        buildCompositionLayer();
        this.animator.setComposition(lottieComposition);
        setProgress(this.animator.getAnimatedFraction());
        setScale(this.scale);
        updateBounds();
        Iterator it = new ArrayList(this.lazyCompositionTasks).iterator();
        while (it.hasNext()) {
            ((LazyCompositionTask) it.next()).run(lottieComposition);
            it.remove();
        }
        this.lazyCompositionTasks.clear();
        lottieComposition.setPerformanceTrackingEnabled(this.performanceTrackingEnabled);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable((Drawable) null);
        imageView.setImageDrawable(this);
        return true;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate2) {
        this.fontAssetDelegate = fontAssetDelegate2;
        FontAssetManager fontAssetManager2 = this.fontAssetManager;
        if (fontAssetManager2 != null) {
            fontAssetManager2.setDelegate(fontAssetDelegate2);
        }
    }

    public void setFrame(final int i2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setFrame(i2);
                }
            });
        } else {
            this.animator.setFrame((float) i2);
        }
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate2) {
        this.imageAssetDelegate = imageAssetDelegate2;
        ImageAssetManager imageAssetManager2 = this.imageAssetManager;
        if (imageAssetManager2 != null) {
            imageAssetManager2.setDelegate(imageAssetDelegate2);
        }
    }

    public void setImagesAssetsFolder(@Nullable String str) {
        this.imageAssetsFolder = str;
    }

    public void setMaxFrame(final int i2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMaxFrame(i2);
                }
            });
        } else {
            this.animator.setMaxFrame(((float) i2) + 0.99f);
        }
    }

    public void setMaxFrame(final String str) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMaxFrame(str);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMaxFrame((int) (marker.startFrame + marker.durationFrames));
            return;
        }
        throw new IllegalArgumentException(a.n("Cannot find marker with name ", str, "."));
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMaxProgress(f);
                }
            });
        } else {
            setMaxFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f));
        }
    }

    public void setMinAndMaxFrame(final int i2, final int i3) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMinAndMaxFrame(i2, i3);
                }
            });
        } else {
            this.animator.setMinAndMaxFrames((float) i2, ((float) i3) + 0.99f);
        }
    }

    public void setMinAndMaxFrame(final String str) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMinAndMaxFrame(str);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            int i2 = (int) marker.startFrame;
            setMinAndMaxFrame(i2, ((int) marker.durationFrames) + i2);
            return;
        }
        throw new IllegalArgumentException(a.n("Cannot find marker with name ", str, "."));
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMinAndMaxFrame(str, str2, z);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            int i2 = (int) marker.startFrame;
            Marker marker2 = this.composition.getMarker(str2);
            if (str2 != null) {
                setMinAndMaxFrame(i2, (int) (marker2.startFrame + (z ? 1.0f : 0.0f)));
                return;
            }
            throw new IllegalArgumentException(a.n("Cannot find marker with name ", str2, "."));
        }
        throw new IllegalArgumentException(a.n("Cannot find marker with name ", str, "."));
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f, @FloatRange(from = 0.0d, to = 1.0d) final float f2) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMinAndMaxProgress(f, f2);
                }
            });
        } else {
            setMinAndMaxFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f), (int) MiscUtils.lerp(this.composition.getStartFrame(), this.composition.getEndFrame(), f2));
        }
    }

    public void setMinFrame(final int i2) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMinFrame(i2);
                }
            });
        } else {
            this.animator.setMinFrame(i2);
        }
    }

    public void setMinFrame(final String str) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMinFrame(str);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMinFrame((int) marker.startFrame);
            return;
        }
        throw new IllegalArgumentException(a.n("Cannot find marker with name ", str, "."));
    }

    public void setMinProgress(final float f) {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setMinProgress(f);
                }
            });
        } else {
            setMinFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.composition.getEndFrame(), f));
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.performanceTrackingEnabled = z;
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition != null) {
            lottieComposition.setPerformanceTrackingEnabled(z);
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new LazyCompositionTask() {
                public void run(LottieComposition lottieComposition) {
                    LottieDrawable.this.setProgress(f);
                }
            });
            return;
        }
        L.beginSection("Drawable#setProgress");
        this.animator.setFrame(MiscUtils.lerp(this.composition.getStartFrame(), this.composition.getEndFrame(), f));
        L.endSection("Drawable#setProgress");
    }

    public void setRepeatCount(int i2) {
        this.animator.setRepeatCount(i2);
    }

    public void setRepeatMode(int i2) {
        this.animator.setRepeatMode(i2);
    }

    public void setSafeMode(boolean z) {
        this.safeMode = z;
    }

    public void setScale(float f) {
        this.scale = f;
        updateBounds();
    }

    public void setScaleType(ImageView.ScaleType scaleType2) {
        this.scaleType = scaleType2;
    }

    public void setSpeed(float f) {
        this.animator.setSpeed(f);
    }

    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.systemAnimationsEnabled = bool.booleanValue();
    }

    public void setTextDelegate(TextDelegate textDelegate2) {
        this.textDelegate = textDelegate2;
    }

    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            playAnimation();
        }
    }

    @MainThread
    public void stop() {
        endAnimation();
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        ImageAssetManager imageAssetManager2 = getImageAssetManager();
        if (imageAssetManager2 == null) {
            Logger.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap updateBitmap = imageAssetManager2.updateBitmap(str, bitmap);
        invalidateSelf();
        return updateBitmap;
    }

    public boolean useTextGlyphs() {
        return this.textDelegate == null && this.composition.getCharacters().size() > 0;
    }
}
