package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/appfoundry/previewer/model/StateJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/State;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/Override;", "nullableOverrideAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class StateJsonAdapter extends l<State> {
    private final l<Override> nullableOverrideAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public StateJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("override", "on", "target", "show", "nodeId");
        i.d(a, "JsonReader.Options.of(\"o…,\n      \"show\", \"nodeId\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<Override> d = xVar.d(Override.class, qVar, "override");
        i.d(d, "moshi.adapter(Override::…  emptySet(), \"override\")");
        this.nullableOverrideAdapter = d;
        l<String> d2 = xVar.d(String.class, qVar, "on");
        i.d(d2, "moshi.adapter(String::cl…,\n      emptySet(), \"on\")");
        this.nullableStringAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Override override = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                override = this.nullableOverrideAdapter.a(qVar);
            } else if (m0 == 1) {
                str = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 2) {
                str2 = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 3) {
                str3 = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 4) {
                str4 = this.nullableStringAdapter.a(qVar);
            }
        }
        qVar.z();
        return new State(override, str, str2, str3, str4);
    }

    public void e(u uVar, Object obj) {
        State state = (State) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(state, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("override");
        this.nullableOverrideAdapter.e(uVar, state.a);
        uVar.O("on");
        this.nullableStringAdapter.e(uVar, state.f7161b);
        uVar.O("target");
        this.nullableStringAdapter.e(uVar, state.c);
        uVar.O("show");
        this.nullableStringAdapter.e(uVar, state.d);
        uVar.O("nodeId");
        this.nullableStringAdapter.e(uVar, state.f7162e);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(State)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(State)";
    }
}
