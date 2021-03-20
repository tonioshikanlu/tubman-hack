package com.appfoundry.previewer.model;

import b.l.f.x.a.g;
import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/appfoundry/previewer/model/GeometryJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Geometry;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "", "nullableListOfFloatAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class GeometryJsonAdapter extends l<Geometry> {
    private final l<List<Float>> nullableListOfFloatAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public GeometryJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("type", "coordinates");
        i.d(a, "JsonReader.Options.of(\"type\", \"coordinates\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(String.class, qVar, "type");
        i.d(d, "moshi.adapter(String::cl…      emptySet(), \"type\")");
        this.nullableStringAdapter = d;
        l<List<Float>> d2 = xVar.d(g.V(List.class, Float.class), qVar, "coordinates");
        i.d(d2, "moshi.adapter(Types.newP…mptySet(), \"coordinates\")");
        this.nullableListOfFloatAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        List list = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                str = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 1) {
                list = this.nullableListOfFloatAdapter.a(qVar);
            }
        }
        qVar.z();
        return new Geometry(str, list);
    }

    public void e(u uVar, Object obj) {
        Geometry geometry = (Geometry) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(geometry, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("type");
        this.nullableStringAdapter.e(uVar, geometry.a);
        uVar.O("coordinates");
        this.nullableListOfFloatAdapter.e(uVar, geometry.f7118b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Geometry)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Geometry)";
    }
}
