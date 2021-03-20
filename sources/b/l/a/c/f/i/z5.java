package b.l.a.c.f.i;

import com.google.android.material.shadow.ShadowDrawableWrapper;

public enum z5 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(ShadowDrawableWrapper.COS_45)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(t4.class, t4.class, t4.f3759i),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f3840h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f3841i;

    /* access modifiers changed from: public */
    z5(Class<?> cls, Class<?> cls2, Object obj) {
        this.f3840h = cls2;
        this.f3841i = obj;
    }
}
