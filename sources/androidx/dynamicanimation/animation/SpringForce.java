package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.google.android.material.shadow.ShadowDrawableWrapper;

public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    public double mDampingRatio = 0.5d;
    private double mFinalPosition = UNSET;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized = false;
    private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
    public double mNaturalFreq = Math.sqrt(1500.0d);
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
    }

    public SpringForce(float f) {
        this.mFinalPosition = (double) f;
    }

    private void init() {
        if (!this.mInitialized) {
            if (this.mFinalPosition != UNSET) {
                double d = this.mDampingRatio;
                if (d > 1.0d) {
                    double d2 = this.mNaturalFreq;
                    this.mGammaPlus = (Math.sqrt((d * d) - 1.0d) * d2) + ((-d) * d2);
                    double d3 = this.mDampingRatio;
                    double d4 = this.mNaturalFreq;
                    this.mGammaMinus = ((-d3) * d4) - (Math.sqrt((d3 * d3) - 1.0d) * d4);
                } else if (d >= ShadowDrawableWrapper.COS_45 && d < 1.0d) {
                    this.mDampedFreq = Math.sqrt(1.0d - (d * d)) * this.mNaturalFreq;
                }
                this.mInitialized = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f, float f2) {
        float finalPosition = f - getFinalPosition();
        double d = this.mNaturalFreq;
        return (float) (((-(d * d)) * ((double) finalPosition)) - (((d * 2.0d) * this.mDampingRatio) * ((double) f2)));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d = this.mNaturalFreq;
        return (float) (d * d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f, float f2) {
        return ((double) Math.abs(f2)) < this.mVelocityThreshold && ((double) Math.abs(f - getFinalPosition())) < this.mValueThreshold;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.mDampingRatio = (double) f;
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public SpringForce setFinalPosition(float f) {
        this.mFinalPosition = (double) f;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.mNaturalFreq = Math.sqrt((double) f);
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public void setValueThreshold(double d) {
        double abs = Math.abs(d);
        this.mValueThreshold = abs;
        this.mVelocityThreshold = abs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    public DynamicAnimation.MassState updateValues(double d, double d2, long j2) {
        double d3;
        double d4;
        init();
        double d5 = ((double) j2) / 1000.0d;
        double d6 = d - this.mFinalPosition;
        double d7 = this.mDampingRatio;
        if (d7 > 1.0d) {
            double d8 = this.mGammaMinus;
            double d9 = this.mGammaPlus;
            double d10 = d6 - (((d8 * d6) - d2) / (d8 - d9));
            double d11 = ((d6 * d8) - d2) / (d8 - d9);
            d3 = (Math.pow(2.718281828459045d, this.mGammaPlus * d5) * d11) + (Math.pow(2.718281828459045d, d8 * d5) * d10);
            double d12 = this.mGammaMinus;
            double pow = Math.pow(2.718281828459045d, d12 * d5) * d10 * d12;
            double d13 = this.mGammaPlus;
            d4 = (Math.pow(2.718281828459045d, d13 * d5) * d11 * d13) + pow;
        } else if (d7 == 1.0d) {
            double d14 = this.mNaturalFreq;
            double d15 = (d14 * d6) + d2;
            double d16 = (d15 * d5) + d6;
            double pow2 = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double pow3 = Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d5) * d16;
            double d17 = this.mNaturalFreq;
            d4 = (Math.pow(2.718281828459045d, (-d17) * d5) * d15) + (pow3 * (-d17));
            d3 = pow2;
        } else {
            double d18 = 1.0d / this.mDampedFreq;
            double d19 = this.mNaturalFreq;
            double d20 = ((d7 * d19 * d6) + d2) * d18;
            double sin = ((Math.sin(this.mDampedFreq * d5) * d20) + (Math.cos(this.mDampedFreq * d5) * d6)) * Math.pow(2.718281828459045d, (-d7) * d19 * d5);
            double d21 = this.mNaturalFreq;
            double d22 = this.mDampingRatio;
            double pow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d23 = this.mDampedFreq;
            double d24 = (-d23) * d6;
            double d25 = this.mDampedFreq;
            d4 = (((Math.cos(d25 * d5) * d20 * d25) + (Math.sin(d23 * d5) * d24)) * pow4) + ((-d21) * sin * d22);
            d3 = sin;
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (d3 + this.mFinalPosition);
        massState.mVelocity = (float) d4;
        return massState;
    }
}
