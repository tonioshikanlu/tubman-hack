package b.l.b.a.d;

import b.l.a.c.b.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class l {
    public static void a(InputStream inputStream, OutputStream outputStream, boolean z) {
        try {
            Objects.requireNonNull(inputStream);
            Objects.requireNonNull(outputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
        } finally {
            if (z) {
                inputStream.close();
            }
        }
    }

    public static Type b(Type type, Class<?> cls, int i2) {
        ParameterizedType h2 = h(type, cls);
        if (h2 == null) {
            return null;
        }
        Type type2 = h2.getActualTypeArguments()[i2];
        if (type2 instanceof TypeVariable) {
            Type n2 = n(Arrays.asList(new Type[]{type}), (TypeVariable) type2);
            if (n2 != null) {
                return n2;
            }
        }
        return type2;
    }

    public static Type c(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type d(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length != 0 ? lowerBounds[0] : wildcardType.getUpperBounds()[0];
    }

    public static Type e(Type type) {
        return b(type, Iterable.class, 0);
    }

    public static Class<?> f(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = n(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(f(list, c(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return g((ParameterizedType) type);
        }
        a.p(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    public static Class<?> g(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static ParameterizedType h(Type type, Class<?> cls) {
        Class<?> cls2;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> cls3 = (Class) parameterizedType.getRawType();
                if (cls3 == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    for (Type type2 : cls3.getGenericInterfaces()) {
                        if (cls.isAssignableFrom(type2 instanceof Class ? (Class) type2 : g((ParameterizedType) type2))) {
                            type = type2;
                            break;
                        }
                    }
                }
                cls2 = cls3;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[SYNTHETIC, Splitter:B:24:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.IllegalArgumentException i(java.lang.Exception r4, java.lang.Class<?> r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unable to create new instance of class "
            r0.<init>(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = r5.isArray()
            r3 = 0
            if (r2 == 0) goto L_0x001d
            java.lang.String r5 = "because it is an array"
            goto L_0x0073
        L_0x001d:
            boolean r2 = r5.isPrimitive()
            if (r2 == 0) goto L_0x0026
            java.lang.String r5 = "because it is primitive"
            goto L_0x0073
        L_0x0026:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            if (r5 != r2) goto L_0x002d
            java.lang.String r5 = "because it is void"
            goto L_0x0073
        L_0x002d:
            int r2 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isInterface(r2)
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = "because it is an interface"
            goto L_0x0046
        L_0x003a:
            int r2 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isAbstract(r2)
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = "because it is abstract"
        L_0x0046:
            r1.add(r2)
        L_0x0049:
            java.lang.Class r2 = r5.getEnclosingClass()
            if (r2 == 0) goto L_0x005e
            int r2 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L_0x005e
            java.lang.String r2 = "because it is not static"
            r1.add(r2)
        L_0x005e:
            int r2 = r5.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
            if (r2 != 0) goto L_0x006b
            java.lang.String r5 = "possibly because it is not public"
            goto L_0x0073
        L_0x006b:
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0071 }
            r5.getConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x0071 }
            goto L_0x0076
        L_0x0071:
            java.lang.String r5 = "because it has no accessible default constructor"
        L_0x0073:
            r1.add(r5)
        L_0x0076:
            java.util.Iterator r5 = r1.iterator()
        L_0x007a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0099
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r3 == 0) goto L_0x008e
            java.lang.String r2 = " and"
            r0.append(r2)
            goto L_0x0090
        L_0x008e:
            r2 = 1
            r3 = r2
        L_0x0090:
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r1)
            goto L_0x007a
        L_0x0099:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r5.<init>(r0, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.d.l.i(java.lang.Exception, java.lang.Class):java.lang.IllegalArgumentException");
    }

    public static boolean j(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    public static boolean k(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static <T> Iterable<T> l(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        a.p(cls.isArray(), "not an array or Iterable: %s", cls);
        return !cls.getComponentType().isPrimitive() ? Arrays.asList((Object[]) obj) : new x(obj);
    }

    public static <T> T m(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e2) {
            throw i(e2, cls);
        } catch (InstantiationException e3) {
            throw i(e3, cls);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.reflect.TypeVariable, java.lang.reflect.TypeVariable<?>, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r5 = n(r5, (java.lang.reflect.TypeVariable) r6);
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type n(java.util.List<java.lang.reflect.Type> r5, java.lang.reflect.TypeVariable<?> r6) {
        /*
            java.lang.reflect.GenericDeclaration r0 = r6.getGenericDeclaration()
            boolean r1 = r0 instanceof java.lang.Class
            r2 = 0
            if (r1 == 0) goto L_0x004d
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            int r3 = r5.size()
            r4 = r2
        L_0x0011:
            if (r4 != 0) goto L_0x0022
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0022
            java.lang.Object r4 = r5.get(r3)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            java.lang.reflect.ParameterizedType r4 = h(r4, r1)
            goto L_0x0011
        L_0x0022:
            if (r4 == 0) goto L_0x004d
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
            r1 = 0
        L_0x0029:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0038
            r2 = r0[r1]
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0038:
            java.lang.reflect.Type[] r6 = r4.getActualTypeArguments()
            r6 = r6[r1]
            boolean r0 = r6 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x004c
            r0 = r6
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            java.lang.reflect.Type r5 = n(r5, r0)
            if (r5 == 0) goto L_0x004c
            return r5
        L_0x004c:
            return r6
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.b.a.d.l.n(java.util.List, java.lang.reflect.TypeVariable):java.lang.reflect.Type");
    }

    public static Object o(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i2 = 0;
        for (Object obj : collection) {
            Array.set(newInstance, i2, obj);
            i2++;
        }
        return newInstance;
    }
}
