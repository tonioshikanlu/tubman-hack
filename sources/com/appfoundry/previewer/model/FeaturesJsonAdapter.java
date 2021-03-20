package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/appfoundry/previewer/model/FeaturesJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Features;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableBooleanAdapter", "Lb/p/a/l;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class FeaturesJsonAdapter extends l<Features> {
    private final l<Boolean> nullableBooleanAdapter;
    private final q.a options;

    public FeaturesJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("auth", "audio", "watermark");
        i.d(a, "JsonReader.Options.of(\"a…h\", \"audio\", \"watermark\")");
        this.options = a;
        l<Boolean> d = xVar.d(Boolean.class, e.t.q.f7936h, "auth");
        i.d(d, "moshi.adapter(Boolean::c…Type, emptySet(), \"auth\")");
        this.nullableBooleanAdapter = d;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                bool = this.nullableBooleanAdapter.a(qVar);
            } else if (m0 == 1) {
                bool2 = this.nullableBooleanAdapter.a(qVar);
            } else if (m0 == 2) {
                bool3 = this.nullableBooleanAdapter.a(qVar);
            }
        }
        qVar.z();
        return new Features(bool, bool2, bool3);
    }

    public void e(u uVar, Object obj) {
        Features features = (Features) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(features, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("auth");
        this.nullableBooleanAdapter.e(uVar, features.a);
        uVar.O("audio");
        this.nullableBooleanAdapter.e(uVar, features.f7112b);
        uVar.O("watermark");
        this.nullableBooleanAdapter.e(uVar, features.c);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Features)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Features)";
    }
}
