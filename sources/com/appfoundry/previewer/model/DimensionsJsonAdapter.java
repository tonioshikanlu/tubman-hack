package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/appfoundry/previewer/model/DimensionsJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Dimensions;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableFloatAdapter", "Lb/p/a/l;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class DimensionsJsonAdapter extends l<Dimensions> {
    private final l<Float> nullableFloatAdapter;
    private final q.a options;

    public DimensionsJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("left", "top", "right", "bottom");
        i.d(a, "JsonReader.Options.of(\"l…\"top\", \"right\", \"bottom\")");
        this.options = a;
        l<Float> d = xVar.d(Float.class, e.t.q.f7936h, "left");
        i.d(d, "moshi.adapter(Float::cla…      emptySet(), \"left\")");
        this.nullableFloatAdapter = d;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                f = this.nullableFloatAdapter.a(qVar);
            } else if (m0 == 1) {
                f2 = this.nullableFloatAdapter.a(qVar);
            } else if (m0 == 2) {
                f3 = this.nullableFloatAdapter.a(qVar);
            } else if (m0 == 3) {
                f4 = this.nullableFloatAdapter.a(qVar);
            }
        }
        qVar.z();
        return new Dimensions(f, f2, f3, f4);
    }

    public void e(u uVar, Object obj) {
        Dimensions dimensions = (Dimensions) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(dimensions, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("left");
        this.nullableFloatAdapter.e(uVar, dimensions.a);
        uVar.O("top");
        this.nullableFloatAdapter.e(uVar, dimensions.f7109b);
        uVar.O("right");
        this.nullableFloatAdapter.e(uVar, dimensions.c);
        uVar.O("bottom");
        this.nullableFloatAdapter.e(uVar, dimensions.d);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Dimensions)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Dimensions)";
    }
}
