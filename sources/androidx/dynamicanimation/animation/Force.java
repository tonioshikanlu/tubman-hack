package androidx.dynamicanimation.animation;

public interface Force {
    float getAcceleration(float f, float f2);

    boolean isAtEquilibrium(float f, float f2);
}
