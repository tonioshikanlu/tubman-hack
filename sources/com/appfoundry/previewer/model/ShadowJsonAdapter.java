package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/appfoundry/previewer/model/ShadowJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Shadow;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/ShadowOffset;", "nullableShadowOffsetAdapter", "Lb/p/a/l;", "", "nullableFloatAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableStringAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ShadowJsonAdapter extends l<Shadow> {
    private final l<Float> nullableFloatAdapter;
    private final l<ShadowOffset> nullableShadowOffsetAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public ShadowJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("color", "radius", "offset");
        i.d(a, "JsonReader.Options.of(\"color\", \"radius\", \"offset\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(String.class, qVar, "color");
        i.d(d, "moshi.adapter(String::cl…     emptySet(), \"color\")");
        this.nullableStringAdapter = d;
        l<Float> d2 = xVar.d(Float.class, qVar, "radius");
        i.d(d2, "moshi.adapter(Float::cla…    emptySet(), \"radius\")");
        this.nullableFloatAdapter = d2;
        l<ShadowOffset> d3 = xVar.d(ShadowOffset.class, qVar, "offset");
        i.d(d3, "moshi.adapter(ShadowOffs…va, emptySet(), \"offset\")");
        this.nullableShadowOffsetAdapter = d3;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        Float f = null;
        ShadowOffset shadowOffset = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                str = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 1) {
                f = this.nullableFloatAdapter.a(qVar);
            } else if (m0 == 2) {
                shadowOffset = this.nullableShadowOffsetAdapter.a(qVar);
            }
        }
        qVar.z();
        return new Shadow(str, f, shadowOffset);
    }

    public void e(u uVar, Object obj) {
        Shadow shadow = (Shadow) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(shadow, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("color");
        this.nullableStringAdapter.e(uVar, shadow.a);
        uVar.O("radius");
        this.nullableFloatAdapter.e(uVar, shadow.f7158b);
        uVar.O("offset");
        this.nullableShadowOffsetAdapter.e(uVar, shadow.c);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Shadow)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Shadow)";
    }
}
