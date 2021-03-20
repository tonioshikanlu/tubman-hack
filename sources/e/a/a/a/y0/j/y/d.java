package e.a.a.a.y0.j.y;

import e.t.g;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d {
    public static int c = 1;
    public static final int d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f9438e;
    public static final int f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f9439g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f9440h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f9441i;

    /* renamed from: j  reason: collision with root package name */
    public static final int f9442j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f9443k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f9444l;

    /* renamed from: m  reason: collision with root package name */
    public static final int f9445m;

    /* renamed from: n  reason: collision with root package name */
    public static final d f9446n;

    /* renamed from: o  reason: collision with root package name */
    public static final d f9447o;

    /* renamed from: p  reason: collision with root package name */
    public static final d f9448p;

    /* renamed from: q  reason: collision with root package name */
    public static final d f9449q;
    public static final d r;
    public static final List<a.C0214a> s;
    public static final List<a.C0214a> t;
    public static final a u = new a((DefaultConstructorMarker) null);
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f9450b;

    public static final class a {

        /* renamed from: e.a.a.a.y0.j.y.d$a$a  reason: collision with other inner class name */
        public static final class C0214a {
            public final int a;

            /* renamed from: b  reason: collision with root package name */
            public final String f9451b;

            public C0214a(int i2, String str) {
                i.e(str, "name");
                this.a = i2;
                this.f9451b = str;
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        a.C0214a aVar;
        a.C0214a aVar2;
        Class<d> cls = d.class;
        int i2 = c;
        int i3 = i2 << 1;
        c = i3;
        d = i2;
        int i4 = i3 << 1;
        c = i4;
        f9438e = i3;
        int i5 = i4 << 1;
        c = i5;
        f = i4;
        int i6 = i5 << 1;
        c = i6;
        f9439g = i5;
        int i7 = i6 << 1;
        c = i7;
        f9440h = i6;
        int i8 = i7 << 1;
        c = i8;
        f9441i = i7;
        c = i8 << 1;
        int i9 = i8 - 1;
        f9442j = i9;
        int i10 = i2 | i3 | i4;
        f9443k = i10;
        int i11 = i3 | i6 | i7;
        f9444l = i11;
        int i12 = i6 | i7;
        f9445m = i12;
        f9446n = new d(i9, (List) null, 2);
        f9447o = new d(i12, (List) null, 2);
        new d(i2, (List) null, 2);
        new d(i3, (List) null, 2);
        new d(i4, (List) null, 2);
        f9448p = new d(i10, (List) null, 2);
        new d(i5, (List) null, 2);
        f9449q = new d(i6, (List) null, 2);
        r = new d(i7, (List) null, 2);
        new d(i11, (List) null, 2);
        Field[] fields = cls.getFields();
        i.d(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            i.d(field, "it");
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field2 = (Field) it.next();
            Object obj = field2.get((Object) null);
            if (!(obj instanceof d)) {
                obj = null;
            }
            d dVar = (d) obj;
            if (dVar != null) {
                int i13 = dVar.a;
                i.d(field2, "field");
                String name = field2.getName();
                i.d(name, "field.name");
                aVar2 = new a.C0214a(i13, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        s = arrayList2;
        Field[] fields2 = cls.getFields();
        i.d(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            i.d(field3, "it");
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            Field field4 = (Field) next;
            i.d(field4, "it");
            if (i.a(field4.getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field5 = (Field) it3.next();
            Object obj2 = field5.get((Object) null);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                i.d(field5, "field");
                String name2 = field5.getName();
                i.d(name2, "field.name");
                aVar = new a.C0214a(intValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        t = arrayList5;
    }

    public d(int i2, List<? extends c> list) {
        i.e(list, "excludes");
        this.f9450b = list;
        for (c a2 : list) {
            i2 &= ~a2.a();
        }
        this.a = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, List list, int i3) {
        this(i2, (i3 & 2) != 0 ? o.f7934h : null);
    }

    public final boolean a(int i2) {
        return (i2 & this.a) != 0;
    }

    public String toString() {
        T t2;
        boolean z;
        Iterator<T> it = s.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (((a.C0214a) t2).a == this.a) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        a.C0214a aVar = (a.C0214a) t2;
        String str = aVar != null ? aVar.f9451b : null;
        if (str == null) {
            List<a.C0214a> list = t;
            ArrayList arrayList = new ArrayList();
            for (a.C0214a aVar2 : list) {
                String str2 = a(aVar2.a) ? aVar2.f9451b : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = g.x(arrayList, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        }
        StringBuilder C = b.e.a.a.a.C("DescriptorKindFilter(", str, ", ");
        C.append(this.f9450b);
        C.append(')');
        return C.toString();
    }
}
