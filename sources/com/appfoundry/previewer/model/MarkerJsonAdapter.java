package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.n;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import b.p.a.z.b;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/appfoundry/previewer/model/MarkerJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Marker;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/Geometry;", "nullableGeometryAdapter", "Lb/p/a/l;", "stringAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/Properties;", "nullablePropertiesAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class MarkerJsonAdapter extends l<Marker> {
    private final l<Geometry> nullableGeometryAdapter;
    private final l<Properties> nullablePropertiesAdapter;
    private final q.a options;
    private final l<String> stringAdapter;

    public MarkerJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("type", "geometry", "properties");
        i.d(a, "JsonReader.Options.of(\"t…\"geometry\", \"properties\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(String.class, qVar, "type");
        i.d(d, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.stringAdapter = d;
        l<Geometry> d2 = xVar.d(Geometry.class, qVar, "geometry");
        i.d(d2, "moshi.adapter(Geometry::…  emptySet(), \"geometry\")");
        this.nullableGeometryAdapter = d2;
        l<Properties> d3 = xVar.d(Properties.class, qVar, "properties");
        i.d(d3, "moshi.adapter(Properties…emptySet(), \"properties\")");
        this.nullablePropertiesAdapter = d3;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        Geometry geometry = null;
        Properties properties = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                str = this.stringAdapter.a(qVar);
                if (str == null) {
                    n m2 = b.m("type", "type", qVar);
                    i.d(m2, "Util.unexpectedNull(\"typ…ype\",\n            reader)");
                    throw m2;
                }
            } else if (m0 == 1) {
                geometry = this.nullableGeometryAdapter.a(qVar);
            } else if (m0 == 2) {
                properties = this.nullablePropertiesAdapter.a(qVar);
            }
        }
        qVar.z();
        if (str != null) {
            return new Marker(str, geometry, properties);
        }
        n g2 = b.g("type", "type", qVar);
        i.d(g2, "Util.missingProperty(\"type\", \"type\", reader)");
        throw g2;
    }

    public void e(u uVar, Object obj) {
        Marker marker = (Marker) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(marker, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("type");
        this.stringAdapter.e(uVar, marker.a);
        uVar.O("geometry");
        this.nullableGeometryAdapter.e(uVar, marker.f7125b);
        uVar.O("properties");
        this.nullablePropertiesAdapter.e(uVar, marker.c);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Marker)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Marker)";
    }
}
