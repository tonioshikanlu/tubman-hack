package b.l.b.a.d;

import b.l.a.c.b.a;
import b.l.c.a.c;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

public class g {
    public static final Boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f4784b;
    public static final Character c;
    public static final Byte d;

    /* renamed from: e  reason: collision with root package name */
    public static final Short f4785e;
    public static final Integer f;

    /* renamed from: g  reason: collision with root package name */
    public static final Float f4786g;

    /* renamed from: h  reason: collision with root package name */
    public static final Long f4787h;

    /* renamed from: i  reason: collision with root package name */
    public static final Double f4788i;

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f4789j;

    /* renamed from: k  reason: collision with root package name */
    public static final BigDecimal f4790k;

    /* renamed from: l  reason: collision with root package name */
    public static final i f4791l;

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap<Class<?>, Object> f4792m;

    static {
        Boolean bool = new Boolean(true);
        a = bool;
        String str = new String();
        f4784b = str;
        Character ch = new Character(0);
        c = ch;
        Byte b2 = new Byte((byte) 0);
        d = b2;
        Short sh = new Short(0);
        f4785e = sh;
        Integer num = new Integer(0);
        f = num;
        Float f2 = new Float(0.0f);
        f4786g = f2;
        Long l2 = new Long(0);
        f4787h = l2;
        Double d2 = new Double(ShadowDrawableWrapper.COS_45);
        f4788i = d2;
        BigInteger bigInteger = new BigInteger("0");
        f4789j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal("0");
        f4790k = bigDecimal;
        i iVar = new i(false, 0, (Integer) null);
        f4791l = iVar;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        f4792m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b2);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f2);
        concurrentHashMap.put(Long.class, l2);
        concurrentHashMap.put(Double.class, d2);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(i.class, iVar);
    }

    public static <T> T a(T t) {
        T t2;
        if (t == null || d(t.getClass())) {
            return t;
        }
        if (t instanceof k) {
            return ((k) t).clone();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof a) {
            t2 = ((a) t).clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = ((List) t).toArray();
            b(array, array);
            return Arrays.asList(array);
        } else {
            t2 = l.m(cls);
        }
        b(t, t2);
        return t2;
    }

    public static void b(Object obj, Object obj2) {
        Object b2;
        Class<?> cls = obj.getClass();
        boolean z = true;
        int i2 = 0;
        a.q(cls == obj2.getClass());
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            a.q(z);
            for (Object a2 : l.l(obj)) {
                Array.set(obj2, i2, a(a2));
                i2++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object a3 : collection) {
                collection2.add(a(a3));
            }
        } else {
            boolean isAssignableFrom = k.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                e b3 = isAssignableFrom ? ((k) obj).classInfo : e.b(cls);
                for (String a4 : b3.c) {
                    j a5 = b3.a(a4);
                    if (!Modifier.isFinal(a5.f4812b.getModifiers()) && ((!isAssignableFrom || !a5.a) && (b2 = a5.b(obj)) != null)) {
                        a5.f(obj2, a(b2));
                    }
                }
            } else if (a.class.isAssignableFrom(cls)) {
                a aVar = (a) obj2;
                a aVar2 = (a) obj;
                int i3 = aVar2.f4770h;
                while (i2 < i3) {
                    aVar.f(i2, a(aVar2.c(i2)));
                    i2++;
                }
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue()));
                }
            }
        }
    }

    public static boolean c(Object obj) {
        return obj == f4792m.get(obj.getClass());
    }

    public static boolean d(Type type) {
        if (type instanceof WildcardType) {
            type = l.d((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class<Boolean> cls = (Class) type;
        return cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == i.class || cls == Boolean.class;
    }

    public static Map<String, Object> e(Object obj) {
        return (obj == null || c(obj)) ? Collections.emptyMap() : obj instanceof Map ? (Map) obj : new h(obj, false);
    }

    public static Collection<Object> f(Type type) {
        if (type instanceof WildcardType) {
            type = l.d((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls != null) {
            return cls.isAssignableFrom(HashSet.class) ? new HashSet() : cls.isAssignableFrom(TreeSet.class) ? new TreeSet() : (Collection) l.m(cls);
        }
        throw new IllegalArgumentException("unable to create new instance of type: " + type);
    }

    public static Map<String, Object> g(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(a.class)) {
            return new a();
        }
        return cls.isAssignableFrom(TreeMap.class) ? new TreeMap() : (Map) l.m(cls);
    }

    public static <T> T h(Class<T> cls) {
        T t;
        T t2 = f4792m.get(cls);
        if (t2 != null) {
            return t2;
        }
        int i2 = 0;
        if (cls.isArray()) {
            Class cls2 = cls;
            do {
                cls2 = cls2.getComponentType();
                i2++;
            } while (cls2.isArray());
            t = Array.newInstance(cls2, new int[i2]);
        } else if (cls.isEnum()) {
            j a2 = e.b(cls).a((String) null);
            Object[] objArr = {cls};
            if (a2 != null) {
                t = Enum.valueOf(a2.f4812b.getDeclaringClass(), a2.f4812b.getName());
            } else {
                throw new NullPointerException(c.a("enum missing constant with @NullValue annotation: %s", objArr));
            }
        } else {
            t = l.m(cls);
        }
        T putIfAbsent = f4792m.putIfAbsent(cls, t);
        return putIfAbsent == null ? t : putIfAbsent;
    }

    public static Object i(Type type, String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Class<BigDecimal> cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                throw new IllegalArgumentException("expected type Character/char but got " + cls);
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == i.class) {
                    Matcher matcher = i.f4807l.matcher(str);
                    if (matcher.matches()) {
                        int parseInt = Integer.parseInt(matcher.group(1));
                        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
                        int parseInt3 = Integer.parseInt(matcher.group(3));
                        boolean z = matcher.group(4) != null;
                        String group = matcher.group(9);
                        boolean z2 = group != null;
                        if (!z2 || z) {
                            if (z) {
                                int parseInt4 = Integer.parseInt(matcher.group(5));
                                int parseInt5 = Integer.parseInt(matcher.group(6));
                                int parseInt6 = Integer.parseInt(matcher.group(7));
                                if (matcher.group(8) != null) {
                                    String substring = matcher.group(8).substring(1);
                                    Objects.requireNonNull(substring);
                                    if (substring.length() < 9) {
                                        StringBuilder x = b.e.a.a.a.x(9, substring);
                                        for (int length = substring.length(); length < 9; length++) {
                                            x.append('0');
                                        }
                                        substring = x.toString();
                                    }
                                    i5 = Integer.parseInt(substring);
                                } else {
                                    i5 = 0;
                                }
                                i3 = parseInt5;
                                i2 = parseInt6;
                                i4 = parseInt4;
                            } else {
                                i5 = 0;
                                i4 = 0;
                                i3 = 0;
                                i2 = 0;
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(i.f4806k);
                            gregorianCalendar.clear();
                            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i4, i3, i2);
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (!z || !z2) {
                                i6 = null;
                            } else if (Character.toUpperCase(group.charAt(0)) != 'Z') {
                                int parseInt7 = Integer.parseInt(matcher.group(12)) + (Integer.parseInt(matcher.group(11)) * 60);
                                if (matcher.group(10).charAt(0) == '-') {
                                    parseInt7 = -parseInt7;
                                }
                                timeInMillis -= ((long) parseInt7) * 60000;
                                i6 = Integer.valueOf(parseInt7);
                            } else {
                                i6 = 0;
                            }
                            return new i(!z, TimeUnit.SECONDS.toMillis(timeInMillis / 1000) + TimeUnit.NANOSECONDS.toMillis((long) i5), i6);
                        }
                        throw new NumberFormatException(b.e.a.a.a.m("Invalid date/time format, cannot specify time zone shift without specifying time: ", str));
                    }
                    throw new NumberFormatException(b.e.a.a.a.m("Invalid date/time format: ", str));
                } else if (cls == BigInteger.class) {
                    return new BigInteger(str);
                } else {
                    if (cls == BigDecimal.class) {
                        return new BigDecimal(str);
                    }
                    if (cls.isEnum()) {
                        if (e.b(cls).c.contains(str)) {
                            j a2 = e.b(cls).a(str);
                            return Enum.valueOf(a2.f4812b.getDeclaringClass(), a2.f4812b.getName());
                        }
                        throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", new Object[]{str}));
                    }
                }
            }
        }
        throw new IllegalArgumentException("expected primitive class, but got: " + type);
    }

    public static Type j(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = l.d((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type n2 = l.n(list, (TypeVariable) type);
            if (n2 != null) {
                type = n2;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
