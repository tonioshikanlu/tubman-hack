package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/appfoundry/previewer/model/ResponseBodyWithErrorObjectJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/ResponseBodyWithErrorObject;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/ErrorData;", "nullableErrorDataAdapter", "Lb/p/a/l;", "nullableStringAdapter", "", "nullableIntAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ResponseBodyWithErrorObjectJsonAdapter extends l<ResponseBodyWithErrorObject> {
    private final l<ErrorData> nullableErrorDataAdapter;
    private final l<Integer> nullableIntAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public ResponseBodyWithErrorObjectJsonAdapter(x xVar) {
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
        l<ErrorData> d3 = xVar.d(ErrorData.class, qVar, "error");
        i.d(d3, "moshi.adapter(ErrorData:…ava, emptySet(), \"error\")");
        this.nullableErrorDataAdapter = d3;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Integer num = null;
        String str = null;
        String str2 = null;
        ErrorData errorData = null;
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
                errorData = this.nullableErrorDataAdapter.a(qVar);
            }
        }
        qVar.z();
        return new ResponseBodyWithErrorObject(num, str, str2, errorData);
    }

    public void e(u uVar, Object obj) {
        ResponseBodyWithErrorObject responseBodyWithErrorObject = (ResponseBodyWithErrorObject) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(responseBodyWithErrorObject, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("statusCode");
        this.nullableIntAdapter.e(uVar, responseBodyWithErrorObject.a);
        uVar.O("message");
        this.nullableStringAdapter.e(uVar, responseBodyWithErrorObject.f7156b);
        uVar.O("reason");
        this.nullableStringAdapter.e(uVar, responseBodyWithErrorObject.c);
        uVar.O("error");
        this.nullableErrorDataAdapter.e(uVar, responseBodyWithErrorObject.d);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(ResponseBodyWithErrorObject)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ResponseBodyWithErrorObject)";
    }
}
