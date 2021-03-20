package androidx.constraintlayout.motion.widget;

public interface ProxyInterface {
    int designAccess(int i2, String str, Object obj, float[] fArr, int i3, float[] fArr2, int i4);

    float getKeyFramePosition(Object obj, int i2, float f, float f2);

    Object getKeyframeAtLocation(Object obj, float f, float f2);

    Boolean getPositionKeyframe(Object obj, Object obj2, float f, float f2, String[] strArr, float[] fArr);

    long getTransitionTimeMs();

    void setAttributes(int i2, String str, Object obj, Object obj2);

    void setKeyFrame(Object obj, int i2, String str, Object obj2);

    boolean setKeyFramePosition(Object obj, int i2, int i3, float f, float f2);

    void setToolPosition(float f);
}
