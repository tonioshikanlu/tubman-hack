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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/appfoundry/previewer/model/MapJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Map;", "", "toString", "()Ljava/lang/String;", "", "nullableIntAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableBooleanAdapter", "", "", "nullableListOfFloatAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class MapJsonAdapter extends l<Map> {
    private final l<Boolean> nullableBooleanAdapter;
    private final l<Integer> nullableIntAdapter;
    private final l<List<Float>> nullableListOfFloatAdapter;
    private final q.a options;

    public MapJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("zoom", "center", "interactive");
        i.d(a, "JsonReader.Options.of(\"z… \"center\", \"interactive\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<Integer> d = xVar.d(Integer.class, qVar, "zoom");
        i.d(d, "moshi.adapter(Int::class…      emptySet(), \"zoom\")");
        this.nullableIntAdapter = d;
        l<List<Float>> d2 = xVar.d(g.V(List.class, Float.class), qVar, "center");
        i.d(d2, "moshi.adapter(Types.newP…    emptySet(), \"center\")");
        this.nullableListOfFloatAdapter = d2;
        l<Boolean> d3 = xVar.d(Boolean.class, qVar, "interactive");
        i.d(d3, "moshi.adapter(Boolean::c…mptySet(), \"interactive\")");
        this.nullableBooleanAdapter = d3;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Integer num = null;
        List list = null;
        Boolean bool = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                num = this.nullableIntAdapter.a(qVar);
            } else if (m0 == 1) {
                list = this.nullableListOfFloatAdapter.a(qVar);
            } else if (m0 == 2) {
                bool = this.nullableBooleanAdapter.a(qVar);
            }
        }
        qVar.z();
        return new Map(num, list, bool);
    }

    public void e(u uVar, Object obj) {
        Map map = (Map) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(map, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("zoom");
        this.nullableIntAdapter.e(uVar, map.a);
        uVar.O("center");
        this.nullableListOfFloatAdapter.e(uVar, map.f7124b);
        uVar.O("interactive");
        this.nullableBooleanAdapter.e(uVar, map.c);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Map)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Map)";
    }
}
