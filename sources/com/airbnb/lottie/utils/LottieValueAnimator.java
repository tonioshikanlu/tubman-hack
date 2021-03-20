package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;

public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    @Nullable
    private LottieComposition composition;
    private float frame = 0.0f;
    private long lastFrameTimeNs = 0;
    private float maxFrame = 2.14748365E9f;
    private float minFrame = -2.14748365E9f;
    private int repeatCount = 0;
    @VisibleForTesting
    public boolean running = false;
    private float speed = 1.0f;
    private boolean speedReversedForRepeatMode = false;

    private float getFrameDurationNs() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.getFrameRate()) / Math.abs(this.speed);
    }

    private boolean isReversed() {
        return getSpeed() < 0.0f;
    }

    private void verifyFrame() {
        if (this.composition != null) {
            float f = this.frame;
            if (f < this.minFrame || f > this.maxFrame) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.minFrame), Float.valueOf(this.maxFrame), Float.valueOf(this.frame)}));
            }
        }
    }

    @MainThread
    public void cancel() {
        notifyCancel();
        removeFrameCallback();
    }

    public void clearComposition() {
        this.composition = null;
        this.minFrame = -2.14748365E9f;
        this.maxFrame = 2.14748365E9f;
    }

    public void doFrame(long j2) {
        postFrameCallback();
        if (this.composition != null && isRunning()) {
            L.beginSection("LottieValueAnimator#doFrame");
            long j3 = this.lastFrameTimeNs;
            long j4 = 0;
            if (j3 != 0) {
                j4 = j2 - j3;
            }
            float frameDurationNs = ((float) j4) / getFrameDurationNs();
            float f = this.frame;
            if (isReversed()) {
                frameDurationNs = -frameDurationNs;
            }
            float f2 = f + frameDurationNs;
            this.frame = f2;
            boolean z = !MiscUtils.contains(f2, getMinFrame(), getMaxFrame());
            this.frame = MiscUtils.clamp(this.frame, getMinFrame(), getMaxFrame());
            this.lastFrameTimeNs = j2;
            notifyUpdate();
            if (z) {
                if (getRepeatCount() == -1 || this.repeatCount < getRepeatCount()) {
                    notifyRepeat();
                    this.repeatCount++;
                    if (getRepeatMode() == 2) {
                        this.speedReversedForRepeatMode = !this.speedReversedForRepeatMode;
                        reverseAnimationSpeed();
                    } else {
                        this.frame = isReversed() ? getMaxFrame() : getMinFrame();
                    }
                    this.lastFrameTimeNs = j2;
                } else {
                    this.frame = this.speed < 0.0f ? getMinFrame() : getMaxFrame();
                    removeFrameCallback();
                    notifyEnd(isReversed());
                }
            }
            verifyFrame();
            L.endSection("LottieValueAnimator#doFrame");
        }
    }

    @MainThread
    public void endAnimation() {
        removeFrameCallback();
        notifyEnd(isReversed());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float f;
        float minFrame2;
        if (this.composition == null) {
            return 0.0f;
        }
        if (isReversed()) {
            f = getMaxFrame();
            minFrame2 = this.frame;
        } else {
            f = this.frame;
            minFrame2 = getMinFrame();
        }
        return (f - minFrame2) / (getMaxFrame() - getMinFrame());
    }

    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedValueAbsolute() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.frame - lottieComposition.getStartFrame()) / (this.composition.getEndFrame() - this.composition.getStartFrame());
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0;
        }
        return (long) lottieComposition.getDuration();
    }

    public float getFrame() {
        return this.frame;
    }

    public float getMaxFrame() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.maxFrame;
        return f == 2.14748365E9f ? lottieComposition.getEndFrame() : f;
    }

    public float getMinFrame() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.minFrame;
        return f == -2.14748365E9f ? lottieComposition.getStartFrame() : f;
    }

    public float getSpeed() {
        return this.speed;
    }

    public boolean isRunning() {
        return this.running;
    }

    @MainThread
    public void pauseAnimation() {
        removeFrameCallback();
    }

    @MainThread
    public void playAnimation() {
        this.running = true;
        notifyStart(isReversed());
        setFrame((float) ((int) (isReversed() ? getMaxFrame() : getMinFrame())));
        this.lastFrameTimeNs = 0;
        this.repeatCount = 0;
        postFrameCallback();
    }

    public void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    public void removeFrameCallback() {
        removeFrameCallback(true);
    }

    @MainThread
    public void removeFrameCallback(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.running = false;
        }
    }

    @MainThread
    public void resumeAnimation() {
        float minFrame2;
        this.running = true;
        postFrameCallback();
        this.lastFrameTimeNs = 0;
        if (isReversed() && getFrame() == getMinFrame()) {
            minFrame2 = getMaxFrame();
        } else if (!isReversed() && getFrame() == getMaxFrame()) {
            minFrame2 = getMinFrame();
        } else {
            return;
        }
        this.frame = minFrame2;
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(LottieComposition lottieComposition) {
        float f;
        float f2;
        boolean z = this.composition == null;
        this.composition = lottieComposition;
        if (z) {
            f2 = (float) ((int) Math.max(this.minFrame, lottieComposition.getStartFrame()));
            f = Math.min(this.maxFrame, lottieComposition.getEndFrame());
        } else {
            f2 = (float) ((int) lottieComposition.getStartFrame());
            f = lottieComposition.getEndFrame();
        }
        setMinAndMaxFrames(f2, (float) ((int) f));
        float f3 = this.frame;
        this.frame = 0.0f;
        setFrame((float) ((int) f3));
        notifyUpdate();
    }

    public void setFrame(float f) {
        if (this.frame != f) {
            this.frame = MiscUtils.clamp(f, getMinFrame(), getMaxFrame());
            this.lastFrameTimeNs = 0;
            notifyUpdate();
        }
    }

    public void setMaxFrame(float f) {
        setMinAndMaxFrames(this.minFrame, f);
    }

    public void setMinAndMaxFrames(float f, float f2) {
        if (f <= f2) {
            LottieComposition lottieComposition = this.composition;
            float startFrame = lottieComposition == null ? -3.4028235E38f : lottieComposition.getStartFrame();
            LottieComposition lottieComposition2 = this.composition;
            float endFrame = lottieComposition2 == null ? Float.MAX_VALUE : lottieComposition2.getEndFrame();
            this.minFrame = MiscUtils.clamp(f, startFrame, endFrame);
            this.maxFrame = MiscUtils.clamp(f2, startFrame, endFrame);
            setFrame((float) ((int) MiscUtils.clamp(this.frame, f, f2)));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    public void setMinFrame(int i2) {
        setMinAndMaxFrames((float) i2, (float) ((int) this.maxFrame));
    }

    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 != 2 && this.speedReversedForRepeatMode) {
            this.speedReversedForRepeatMode = false;
            reverseAnimationSpeed();
        }
    }

    public void setSpeed(float f) {
        this.speed = f;
    }
}
