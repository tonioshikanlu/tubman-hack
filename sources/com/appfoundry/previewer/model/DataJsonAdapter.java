package com.appfoundry.previewer.model;

import b.l.f.x.a.g;
import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/appfoundry/previewer/model/DataJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Data;", "", "toString", "()Ljava/lang/String;", "", "Lcom/appfoundry/previewer/model/Page;", "nullableListOfPageAdapter", "Lb/p/a/l;", "", "nullableMutableListOfPageAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class DataJsonAdapter extends l<Data> {
    private final l<List<Page>> nullableListOfPageAdapter;
    private final l<List<Page>> nullableMutableListOfPageAdapter;
    private final q.a options;

    public DataJsonAdapter(x xVar) {
        Class<Page> cls = Page.class;
        i.e(xVar, "moshi");
        q.a a = q.a.a("menus", "pages");
        i.d(a, "JsonReader.Options.of(\"menus\", \"pages\")");
        this.options = a;
        ParameterizedType V = g.V(List.class, cls);
        e.t.q qVar = e.t.q.f7936h;
        l<List<Page>> d = xVar.d(V, qVar, "menus");
        i.d(d, "moshi.adapter(Types.newP…mptySet(),\n      \"menus\")");
        this.nullableListOfPageAdapter = d;
        l<List<Page>> d2 = xVar.d(g.V(List.class, cls), qVar, "pages");
        i.d(d2, "moshi.adapter(Types.newP…     emptySet(), \"pages\")");
        this.nullableMutableListOfPageAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        List list = null;
        List list2 = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                list = this.nullableListOfPageAdapter.a(qVar);
            } else if (m0 == 1) {
                list2 = this.nullableMutableListOfPageAdapter.a(qVar);
            }
        }
        qVar.z();
        return new Data(list, list2);
    }

    public void e(u uVar, Object obj) {
        Data data = (Data) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(data, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("menus");
        this.nullableListOfPageAdapter.e(uVar, data.a);
        uVar.O("pages");
        this.nullableMutableListOfPageAdapter.e(uVar, data.f7108b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Data)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Data)";
    }
}
