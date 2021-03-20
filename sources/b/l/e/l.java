package b.l.e;

import b.l.a.c.b.a;
import b.l.e.e0.o;
import b.l.e.e0.z.m;
import b.l.e.e0.z.p;
import b.l.e.e0.z.q;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class l {
    public o a = o.f5431j;

    /* renamed from: b  reason: collision with root package name */
    public z f5560b = z.DEFAULT;
    public e c = d.IDENTITY;
    public final Map<Type, m<?>> d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final List<c0> f5561e = new ArrayList();
    public final List<c0> f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public String f5562g;

    /* renamed from: h  reason: collision with root package name */
    public int f5563h = 2;

    /* renamed from: i  reason: collision with root package name */
    public int f5564i = 2;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5565j = true;

    public k a() {
        a aVar;
        a aVar2;
        a aVar3;
        ArrayList arrayList = new ArrayList(this.f.size() + this.f5561e.size() + 3);
        arrayList.addAll(this.f5561e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        String str = this.f5562g;
        int i2 = this.f5563h;
        int i3 = this.f5564i;
        if (str == null || "".equals(str.trim())) {
            if (!(i2 == 2 || i3 == 2)) {
                a aVar4 = new a(Date.class, i2, i3);
                a aVar5 = new a(Timestamp.class, i2, i3);
                a aVar6 = new a(java.sql.Date.class, i2, i3);
                aVar3 = aVar4;
                aVar2 = aVar5;
                aVar = aVar6;
            }
            return new k(this.a, this.c, this.d, false, false, false, this.f5565j, false, false, false, this.f5560b, this.f5562g, this.f5563h, this.f5564i, this.f5561e, this.f, arrayList);
        }
        aVar3 = new a(Date.class, str);
        aVar2 = new a(Timestamp.class, str);
        aVar = new a(java.sql.Date.class, str);
        b0<Class> b0Var = b.l.e.e0.z.o.a;
        arrayList.add(new q(Date.class, aVar3));
        arrayList.add(new q(Timestamp.class, aVar2));
        arrayList.add(new q(java.sql.Date.class, aVar));
        return new k(this.a, this.c, this.d, false, false, false, this.f5565j, false, false, false, this.f5560b, this.f5562g, this.f5563h, this.f5564i, this.f5561e, this.f, arrayList);
    }

    public l b(Type type, Object obj) {
        boolean z = obj instanceof x;
        boolean z2 = true;
        a.r(true);
        if (obj instanceof m) {
            this.d.put(type, (m) obj);
        }
        b.l.e.f0.a aVar = new b.l.e.f0.a(type);
        List<c0> list = this.f5561e;
        if (aVar.f5519b != aVar.a) {
            z2 = false;
        }
        list.add(new m.c(obj, aVar, z2, (Class<?>) null));
        if (obj instanceof b0) {
            List<c0> list2 = this.f5561e;
            b0<Class> b0Var = b.l.e.e0.z.o.a;
            list2.add(new p(new b.l.e.f0.a(type), (b0) obj));
        }
        return this;
    }
}
