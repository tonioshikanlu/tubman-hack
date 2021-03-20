package com.segment.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import b.e.a.a.a;
import com.segment.analytics.internal.Utils;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class ValueMap implements Map<String, Object> {
    private final Map<String, Object> delegate;

    public static class Cache<T extends ValueMap> {
        private final Cartographer cartographer;
        private final Class<T> clazz;
        private final String key;
        private final SharedPreferences preferences;
        private T value;

        public Cache(Context context, Cartographer cartographer2, String str, String str2, Class<T> cls) {
            this.cartographer = cartographer2;
            this.preferences = Utils.getSegmentSharedPreferences(context, str2);
            this.key = str;
            this.clazz = cls;
        }

        public T create(Map<String, Object> map) {
            return ValueMap.createValueMap(map, this.clazz);
        }

        public void delete() {
            this.preferences.edit().remove(this.key).apply();
        }

        public T get() {
            if (this.value == null) {
                String string = this.preferences.getString(this.key, (String) null);
                if (Utils.isNullOrEmpty((CharSequence) string)) {
                    return null;
                }
                try {
                    this.value = create(this.cartographer.fromJson(string));
                } catch (IOException unused) {
                    return null;
                }
            }
            return this.value;
        }

        public boolean isSet() {
            return this.preferences.contains(this.key);
        }

        public void set(T t) {
            this.value = t;
            this.preferences.edit().putString(this.key, this.cartographer.toJson(t)).apply();
        }
    }

    public ValueMap() {
        this.delegate = new LinkedHashMap();
    }

    public ValueMap(int i2) {
        this.delegate = new LinkedHashMap(i2);
    }

    public ValueMap(Map<String, Object> map) {
        if (map != null) {
            this.delegate = map;
            return;
        }
        throw new IllegalArgumentException("Map must not be null.");
    }

    private <T extends ValueMap> T coerceToValueMap(Object obj, Class<T> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return (ValueMap) obj;
        }
        if (obj instanceof Map) {
            return createValueMap((Map) obj, cls);
        }
        return null;
    }

    public static <T extends ValueMap> T createValueMap(Map map, Class<T> cls) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Map.class});
            declaredConstructor.setAccessible(true);
            return (ValueMap) declaredConstructor.newInstance(new Object[]{map});
        } catch (Exception e2) {
            StringBuilder y = a.y("Could not create instance of ");
            y.append(cls.getCanonicalName());
            y.append(".\n");
            y.append(e2);
            throw new AssertionError(y.toString());
        }
    }

    public void clear() {
        this.delegate.clear();
    }

    public boolean containsKey(Object obj) {
        return this.delegate.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.delegate.containsValue(obj);
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return this.delegate.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || this.delegate.equals(obj);
    }

    public Object get(Object obj) {
        return this.delegate.get(obj);
    }

    public boolean getBoolean(String str, boolean z) {
        Boolean valueOf;
        Object obj = get(str);
        if (obj instanceof Boolean) {
            valueOf = (Boolean) obj;
        } else if (!(obj instanceof String)) {
            return z;
        } else {
            valueOf = Boolean.valueOf((String) obj);
        }
        return valueOf.booleanValue();
    }

    public char getChar(String str, char c) {
        Object obj = get(str);
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        if (obj != null && (obj instanceof String)) {
            String str2 = (String) obj;
            if (str2.length() == 1) {
                return str2.charAt(0);
            }
        }
        return c;
    }

    public double getDouble(String str, double d) {
        Object obj = get(str);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj).doubleValue();
            } catch (NumberFormatException unused) {
            }
        }
        return d;
    }

    public <T extends Enum<T>> T getEnum(Class<T> cls, String str) {
        if (cls != null) {
            T t = get(str);
            if (cls.isInstance(t)) {
                return (Enum) t;
            }
            if (t instanceof String) {
                return Enum.valueOf(cls, (String) t);
            }
            return null;
        }
        throw new IllegalArgumentException("enumType may not be null");
    }

    public float getFloat(String str, float f) {
        return Utils.coerceToFloat(get(str), f);
    }

    public int getInt(String str, int i2) {
        Object obj = get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public <T extends ValueMap> List<T> getList(Object obj, Class<T> cls) {
        Object obj2 = get(obj);
        if (!(obj2 instanceof List)) {
            return null;
        }
        List<Object> list = (List) obj2;
        try {
            ArrayList arrayList = new ArrayList();
            for (Object coerceToValueMap : list) {
                T coerceToValueMap2 = coerceToValueMap(coerceToValueMap, cls);
                if (coerceToValueMap2 != null) {
                    arrayList.add(coerceToValueMap2);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public long getLong(String str, long j2) {
        Object obj = get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf((String) obj).longValue();
            } catch (NumberFormatException unused) {
            }
        }
        return j2;
    }

    public String getString(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public ValueMap getValueMap(Object obj) {
        Object obj2 = get(obj);
        if (obj2 instanceof ValueMap) {
            return (ValueMap) obj2;
        }
        if (obj2 instanceof Map) {
            return new ValueMap((Map<String, Object>) (Map) obj2);
        }
        return null;
    }

    public <T extends ValueMap> T getValueMap(String str, Class<T> cls) {
        return coerceToValueMap(get(str), cls);
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public Set<String> keySet() {
        return this.delegate.keySet();
    }

    public Object put(String str, Object obj) {
        return this.delegate.put(str, obj);
    }

    public void putAll(Map<? extends String, ?> map) {
        this.delegate.putAll(map);
    }

    public ValueMap putValue(String str, Object obj) {
        this.delegate.put(str, obj);
        return this;
    }

    public Object remove(Object obj) {
        return this.delegate.remove(obj);
    }

    public int size() {
        return this.delegate.size();
    }

    public JSONObject toJsonObject() {
        return Utils.toJsonObject(this.delegate);
    }

    public String toString() {
        return this.delegate.toString();
    }

    public Map<String, String> toStringMap() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : entrySet()) {
            hashMap.put(next.getKey(), String.valueOf(next.getValue()));
        }
        return hashMap;
    }

    public Collection<Object> values() {
        return this.delegate.values();
    }
}
