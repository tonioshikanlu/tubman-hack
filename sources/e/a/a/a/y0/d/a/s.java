package e.a.a.a.y0.d.a;

import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.m.o1.c;

public final class s {
    public static final b a = new b("kotlin.jvm.JvmField");

    static {
        a.l(new b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 1 || i2 == 3 || i2 == 7 || i2 == 9) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 3 || i2 == 7 || i2 == 9) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 3:
            case 7:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
                break;
            case 2:
                objArr[0] = "typeAliasName";
                break;
            case 4:
            case 5:
                objArr[0] = "name";
                break;
            case 6:
            case 8:
                objArr[0] = "propertyName";
                break;
            case 10:
                objArr[0] = "propertyDescriptor";
                break;
            case 11:
            case 12:
                objArr[0] = "companionObject";
                break;
            case 13:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "baseName";
                break;
        }
        if (i2 == 1) {
            objArr[1] = "getSyntheticMethodNameForAnnotatedProperty";
        } else if (i2 == 3) {
            objArr[1] = "getSyntheticMethodNameForAnnotatedTypeAlias";
        } else if (i2 == 7) {
            objArr[1] = "getterName";
        } else if (i2 != 9) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
        } else {
            objArr[1] = "setterName";
        }
        switch (i2) {
            case 1:
            case 3:
            case 7:
            case 9:
                break;
            case 2:
                objArr[2] = "getSyntheticMethodNameForAnnotatedTypeAlias";
                break;
            case 4:
                objArr[2] = "isGetterName";
                break;
            case 5:
                objArr[2] = "isSetterName";
                break;
            case 6:
                objArr[2] = "getterName";
                break;
            case 8:
                objArr[2] = "setterName";
                break;
            case 10:
                objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                break;
            case 11:
                objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
                break;
            case 12:
                objArr[2] = "isMappedIntrinsicCompanionObject";
                break;
            case 13:
                objArr[2] = "hasJvmFieldAnnotation";
                break;
            default:
                objArr[2] = "getSyntheticMethodNameForAnnotatedProperty";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 3 || i2 == 7 || i2 == 9) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static String b(String str) {
        if (str != null) {
            if (!d(str)) {
                StringBuilder y = b.e.a.a.a.y("get");
                y.append(c.o(str));
                str = y.toString();
            }
            if (str != null) {
                return str;
            }
            a(7);
            throw null;
        }
        a(6);
        throw null;
    }

    public static String c(String str) {
        if (str != null) {
            StringBuilder y = b.e.a.a.a.y("set");
            y.append(d(str) ? str.substring(2) : c.o(str));
            String sb = y.toString();
            if (sb != null) {
                return sb;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean d(String str) {
        if (!str.startsWith("is") || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        return 'a' > charAt || charAt > 'z';
    }
}
