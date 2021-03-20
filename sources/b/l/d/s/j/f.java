package b.l.d.s.j;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.s.c;
import b.l.d.s.d;
import b.l.d.s.e;
import b.l.d.s.g;
import b.l.d.s.h;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public final class f implements b.l.d.s.f, h {
    public boolean a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f5292b;
    public final Map<Class<?>, e<?>> c;
    public final Map<Class<?>, g<?>> d;

    /* renamed from: e  reason: collision with root package name */
    public final e<Object> f5293e;
    public final boolean f;

    public f(@NonNull Writer writer, @NonNull Map<Class<?>, e<?>> map, @NonNull Map<Class<?>, g<?>> map2, e<Object> eVar, boolean z) {
        this.f5292b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.f5293e = eVar;
        this.f = z;
    }

    @NonNull
    public b.l.d.s.f a(@NonNull d dVar, boolean z) {
        String str = dVar.a;
        i();
        this.f5292b.name(str);
        i();
        this.f5292b.value(z);
        return this;
    }

    @NonNull
    public b.l.d.s.f b(@NonNull d dVar, long j2) {
        String str = dVar.a;
        i();
        this.f5292b.name(str);
        i();
        this.f5292b.value(j2);
        return this;
    }

    @NonNull
    public b.l.d.s.f c(@NonNull d dVar, int i2) {
        String str = dVar.a;
        i();
        this.f5292b.name(str);
        i();
        this.f5292b.value((long) i2);
        return this;
    }

    @NonNull
    public h d(@Nullable String str) {
        i();
        this.f5292b.value(str);
        return this;
    }

    @NonNull
    public h e(boolean z) {
        i();
        this.f5292b.value(z);
        return this;
    }

    @NonNull
    public b.l.d.s.f f(@NonNull d dVar, @Nullable Object obj) {
        return h(dVar.a, obj);
    }

    @NonNull
    public f g(@Nullable Object obj, boolean z) {
        int i2 = 0;
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                objArr[0] = obj == null ? null : obj.getClass();
                throw new c(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.f5292b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f5292b.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                i();
                this.f5292b.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            this.f5292b.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i2 < length) {
                    this.f5292b.value((long) iArr[i2]);
                    i2++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i2 < length2) {
                    long j2 = jArr[i2];
                    i();
                    this.f5292b.value(j2);
                    i2++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i2 < length3) {
                    this.f5292b.value(dArr[i2]);
                    i2++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i2 < length4) {
                    this.f5292b.value(zArr[i2]);
                    i2++;
                }
            } else if (obj instanceof Number[]) {
                for (Number g2 : (Number[]) obj) {
                    g(g2, false);
                }
            } else {
                for (Object g3 : (Object[]) obj) {
                    g(g3, false);
                }
            }
            this.f5292b.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f5292b.beginArray();
            for (Object g4 : (Collection) obj) {
                g(g4, false);
            }
            this.f5292b.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f5292b.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    h((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            this.f5292b.endObject();
            return this;
        } else {
            e eVar = this.c.get(obj.getClass());
            if (eVar != null) {
                if (!z) {
                    this.f5292b.beginObject();
                }
                eVar.a(obj, this);
                if (!z) {
                    this.f5292b.endObject();
                }
                return this;
            }
            g gVar = this.d.get(obj.getClass());
            if (gVar != null) {
                gVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                i();
                this.f5292b.value(name);
                return this;
            } else {
                e<Object> eVar2 = this.f5293e;
                if (!z) {
                    this.f5292b.beginObject();
                }
                eVar2.a(obj, this);
                if (!z) {
                    this.f5292b.endObject();
                }
                return this;
            }
        }
    }

    @NonNull
    public f h(@NonNull String str, @Nullable Object obj) {
        if (!this.f) {
            i();
            this.f5292b.name(str);
            if (obj != null) {
                return g(obj, false);
            }
            this.f5292b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            i();
            this.f5292b.name(str);
            return g(obj, false);
        }
    }

    public final void i() {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
