package e.a.a.a.y0.d.b;

import e.x.c.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;

public final class r {
    public static final r a = new r();

    public final String[] a(String... strArr) {
        i.e(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public final LinkedHashSet<String> b(String str, String... strArr) {
        i.e(str, "internalName");
        i.e(strArr, "signatures");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final LinkedHashSet<String> c(String str, String... strArr) {
        i.e(str, "name");
        i.e(strArr, "signatures");
        return b(f(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final LinkedHashSet<String> d(String str, String... strArr) {
        i.e(str, "name");
        i.e(strArr, "signatures");
        return b(g(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String e(String str) {
        i.e(str, "name");
        return "java/util/function/" + str;
    }

    public final String f(String str) {
        i.e(str, "name");
        return "java/lang/" + str;
    }

    public final String g(String str) {
        i.e(str, "name");
        return "java/util/" + str;
    }
}
