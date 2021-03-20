package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/appfoundry/previewer/model/BackendResponseJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/BackendResponse;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/Params;", "nullableParamsAdapter", "Lb/p/a/l;", "nullableStringAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class BackendResponseJsonAdapter extends l<BackendResponse> {
    private final l<Params> nullableParamsAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public BackendResponseJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("action", "params");
        i.d(a, "JsonReader.Options.of(\"action\", \"params\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(String.class, qVar, "action");
        i.d(d, "moshi.adapter(String::cl…    emptySet(), \"action\")");
        this.nullableStringAdapter = d;
        l<Params> d2 = xVar.d(Params.class, qVar, "params");
        i.d(d2, "moshi.adapter(Params::cl…    emptySet(), \"params\")");
        this.nullableParamsAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        Params params = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                str = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 1) {
                params = this.nullableParamsAdapter.a(qVar);
            }
        }
        qVar.z();
        return new BackendResponse(str, params);
    }

    public void e(u uVar, Object obj) {
        BackendResponse backendResponse = (BackendResponse) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(backendResponse, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("action");
        this.nullableStringAdapter.e(uVar, backendResponse.a);
        uVar.O("params");
        this.nullableParamsAdapter.e(uVar, backendResponse.f7073b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(BackendResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(BackendResponse)";
    }
}
