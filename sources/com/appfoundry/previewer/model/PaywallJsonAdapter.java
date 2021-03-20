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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/appfoundry/previewer/model/PaywallJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Paywall;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableListOfStringAdapter", "Lb/p/a/l;", "nullableStringAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class PaywallJsonAdapter extends l<Paywall> {
    private final l<List<String>> nullableListOfStringAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public PaywallJsonAdapter(x xVar) {
        Class<String> cls = String.class;
        i.e(xVar, "moshi");
        q.a a = q.a.a("message", "features");
        i.d(a, "JsonReader.Options.of(\"message\", \"features\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(cls, qVar, "message");
        i.d(d, "moshi.adapter(String::cl…   emptySet(), \"message\")");
        this.nullableStringAdapter = d;
        l<List<String>> d2 = xVar.d(g.V(List.class, cls), qVar, "features");
        i.d(d2, "moshi.adapter(Types.newP…ySet(),\n      \"features\")");
        this.nullableListOfStringAdapter = d2;
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
                list = this.nullableListOfStringAdapter.a(qVar);
            }
        }
        qVar.z();
        return new Paywall(str, list);
    }

    public void e(u uVar, Object obj) {
        Paywall paywall = (Paywall) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(paywall, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("message");
        this.nullableStringAdapter.e(uVar, paywall.a);
        uVar.O("features");
        this.nullableListOfStringAdapter.e(uVar, paywall.f7152b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Paywall)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Paywall)";
    }
}
