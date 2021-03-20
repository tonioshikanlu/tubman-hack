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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/appfoundry/previewer/model/GradientColorStopJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/GradientColorStop;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableStringAdapter", "Lb/p/a/l;", "", "floatAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class GradientColorStopJsonAdapter extends l<GradientColorStop> {
    private final l<Float> floatAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public GradientColorStopJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("color", "position");
        i.d(a, "JsonReader.Options.of(\"color\", \"position\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(String.class, qVar, "color");
        i.d(d, "moshi.adapter(String::cl…     emptySet(), \"color\")");
        this.nullableStringAdapter = d;
        l<Float> d2 = xVar.d(Float.TYPE, qVar, "position");
        i.d(d2, "moshi.adapter(Float::cla…ySet(),\n      \"position\")");
        this.floatAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Float f = null;
        String str = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                str = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 1) {
                Float a = this.floatAdapter.a(qVar);
                if (a != null) {
                    f = Float.valueOf(a.floatValue());
                } else {
                    n m2 = b.m("position", "position", qVar);
                    i.d(m2, "Util.unexpectedNull(\"pos…      \"position\", reader)");
                    throw m2;
                }
            } else {
                continue;
            }
        }
        qVar.z();
        if (f != null) {
            return new GradientColorStop(str, f.floatValue());
        }
        n g2 = b.g("position", "position", qVar);
        i.d(g2, "Util.missingProperty(\"po…ion\", \"position\", reader)");
        throw g2;
    }

    public void e(u uVar, Object obj) {
        GradientColorStop gradientColorStop = (GradientColorStop) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(gradientColorStop, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("color");
        this.nullableStringAdapter.e(uVar, gradientColorStop.a);
        uVar.O("position");
        this.floatAdapter.e(uVar, Float.valueOf(gradientColorStop.f7119b));
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(GradientColorStop)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(GradientColorStop)";
    }
}
