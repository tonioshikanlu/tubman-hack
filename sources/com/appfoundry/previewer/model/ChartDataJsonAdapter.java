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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/appfoundry/previewer/model/ChartDataJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/ChartData;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableStringAdapter", "Lb/p/a/l;", "", "", "nullableListOfAnyAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ChartDataJsonAdapter extends l<ChartData> {
    private final l<List<Object>> nullableListOfAnyAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public ChartDataJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("data", "name");
        i.d(a, "JsonReader.Options.of(\"data\", \"name\")");
        this.options = a;
        ParameterizedType V = g.V(List.class, Object.class);
        e.t.q qVar = e.t.q.f7936h;
        l<List<Object>> d = xVar.d(V, qVar, "data");
        i.d(d, "moshi.adapter(Types.newP…emptySet(),\n      \"data\")");
        this.nullableListOfAnyAdapter = d;
        l<String> d2 = xVar.d(String.class, qVar, "name");
        i.d(d2, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        List list = null;
        String str = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                list = this.nullableListOfAnyAdapter.a(qVar);
            } else if (m0 == 1) {
                str = this.nullableStringAdapter.a(qVar);
            }
        }
        qVar.z();
        return new ChartData(list, str);
    }

    public void e(u uVar, Object obj) {
        ChartData chartData = (ChartData) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(chartData, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("data");
        this.nullableListOfAnyAdapter.e(uVar, chartData.a);
        uVar.O("name");
        this.nullableStringAdapter.e(uVar, chartData.f7082b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(ChartData)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ChartData)";
    }
}
