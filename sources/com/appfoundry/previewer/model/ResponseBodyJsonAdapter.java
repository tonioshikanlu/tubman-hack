package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/appfoundry/previewer/model/ResponseBodyJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/ResponseBody;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "", "nullableIntAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ResponseBodyJsonAdapter extends l<ResponseBody> {
    private final l<Integer> nullableIntAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public ResponseBodyJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("statusCode", "message", "reason", "error");
        i.d(a, "JsonReader.Options.of(\"s… \"reason\",\n      \"error\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<Integer> d = xVar.d(Integer.class, qVar, "statusCode");
        i.d(d, "moshi.adapter(Int::class…emptySet(), \"statusCode\")");
        this.nullableIntAdapter = d;
        l<String> d2 = xVar.d(String.class, qVar, "message");
        i.d(d2, "moshi.adapter(String::cl…   emptySet(), \"message\")");
        this.nullableStringAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                num = this.nullableIntAdapter.a(qVar);
            } else if (m0 == 1) {
                str = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 2) {
                str2 = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 3) {
                str3 = this.nullableStringAdapter.a(qVar);
            }
        }
        qVar.z();
        return new ResponseBody(num, str, str2, str3);
    }

    public void e(u uVar, Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(responseBody, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("statusCode");
        this.nullableIntAdapter.e(uVar, responseBody.a);
        uVar.O("message");
        this.nullableStringAdapter.e(uVar, responseBody.f7155b);
        uVar.O("reason");
        this.nullableStringAdapter.e(uVar, responseBody.c);
        uVar.O("error");
        this.nullableStringAdapter.e(uVar, responseBody.d);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(ResponseBody)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ResponseBody)";
    }
}
