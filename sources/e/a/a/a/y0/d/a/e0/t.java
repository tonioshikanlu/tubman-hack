package e.a.a.a.y0.d.a.e0;

import androidx.exifinterface.media.ExifInterface;
import e.a.a.a.y0.d.b.q;
import e.a.a.a.y0.j.w.c;
import e.j;
import e.t.g;
import e.t.r;
import e.t.s;
import e.x.b.l;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class t {
    public final Map<String, j> a = new LinkedHashMap();

    public final class a {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t f8561b;

        /* renamed from: e.a.a.a.y0.d.a.e0.t$a$a  reason: collision with other inner class name */
        public final class C0178a {
            public final List<j<String, x>> a = new ArrayList();

            /* renamed from: b  reason: collision with root package name */
            public j<String, x> f8562b = new j<>(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, null);
            public final String c;
            public final /* synthetic */ a d;

            public C0178a(a aVar, String str) {
                i.e(str, "functionName");
                this.d = aVar;
                this.c = str;
            }

            public final void a(String str, d... dVarArr) {
                x xVar;
                i.e(str, "type");
                i.e(dVarArr, "qualifiers");
                List<j<String, x>> list = this.a;
                if (dVarArr.length == 0) {
                    xVar = null;
                } else {
                    i.e(dVarArr, "$this$withIndex");
                    s sVar = new s(new e.t.j(dVarArr));
                    int q2 = b.q.a.a.q2(b.q.a.a.C(sVar, 10));
                    if (q2 < 16) {
                        q2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(q2);
                    Iterator it = sVar.iterator();
                    while (true) {
                        e.t.t tVar = (e.t.t) it;
                        if (!tVar.hasNext()) {
                            break;
                        }
                        r rVar = (r) tVar.next();
                        linkedHashMap.put(Integer.valueOf(rVar.a), (d) rVar.f7937b);
                    }
                    xVar = new x(linkedHashMap);
                }
                list.add(new j(str, xVar));
            }

            public final void b(String str, d... dVarArr) {
                i.e(str, "type");
                i.e(dVarArr, "qualifiers");
                i.e(dVarArr, "$this$withIndex");
                s sVar = new s(new e.t.j(dVarArr));
                int q2 = b.q.a.a.q2(b.q.a.a.C(sVar, 10));
                if (q2 < 16) {
                    q2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(q2);
                Iterator it = sVar.iterator();
                while (true) {
                    e.t.t tVar = (e.t.t) it;
                    if (tVar.hasNext()) {
                        r rVar = (r) tVar.next();
                        linkedHashMap.put(Integer.valueOf(rVar.a), (d) rVar.f7937b);
                    } else {
                        this.f8562b = new j<>(str, new x(linkedHashMap));
                        return;
                    }
                }
            }

            public final void c(c cVar) {
                i.e(cVar, "type");
                String j2 = cVar.j();
                i.d(j2, "type.desc");
                this.f8562b = new j<>(j2, null);
            }
        }

        public a(t tVar, String str) {
            i.e(str, "className");
            this.f8561b = tVar;
            this.a = str;
        }

        public final void a(String str, l<? super C0178a, e.r> lVar) {
            i.e(str, "name");
            i.e(lVar, "block");
            Map<String, j> map = this.f8561b.a;
            C0178a aVar = new C0178a(this, str);
            lVar.invoke(aVar);
            String str2 = aVar.d.a;
            String str3 = aVar.c;
            List<j<String, x>> list = aVar.a;
            ArrayList arrayList = new ArrayList(b.q.a.a.C(list, 10));
            for (j jVar : list) {
                arrayList.add((String) jVar.f7906h);
            }
            String str4 = (String) aVar.f8562b.f7906h;
            i.e(str3, "name");
            i.e(arrayList, "parameters");
            i.e(str4, "ret");
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append('(');
            sb.append(g.x(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, q.f8648h, 30));
            sb.append(')');
            if (str4.length() > 1) {
                str4 = 'L' + str4 + ';';
            }
            sb.append(str4);
            String sb2 = sb.toString();
            i.e(str2, "internalName");
            i.e(sb2, "jvmDescriptor");
            String str5 = str2 + '.' + sb2;
            x xVar = (x) aVar.f8562b.f7907i;
            List<j<String, x>> list2 = aVar.a;
            ArrayList arrayList2 = new ArrayList(b.q.a.a.C(list2, 10));
            for (j jVar2 : list2) {
                arrayList2.add((x) jVar2.f7907i);
            }
            map.put(str5, new j(xVar, arrayList2));
        }
    }
}
