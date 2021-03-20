package b.l.a.c.f.e;

import com.google.android.material.shadow.ShadowDrawableWrapper;

public enum m {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(ShadowDrawableWrapper.COS_45)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(um.class, um.class, um.f3344i),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f3157h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f3158i;

    /* access modifiers changed from: public */
    m(Class<?> cls, Class<?> cls2, Object obj) {
        this.f3157h = cls2;
        this.f3158i = obj;
    }
}
