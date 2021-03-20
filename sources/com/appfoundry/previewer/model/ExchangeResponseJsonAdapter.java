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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/appfoundry/previewer/model/ExchangeResponseJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/ExchangeResponse;", "", "toString", "()Ljava/lang/String;", "stringAdapter", "Lb/p/a/l;", "", "intAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ExchangeResponseJsonAdapter extends l<ExchangeResponse> {
    private final l<Integer> intAdapter;
    private final q.a options;
    private final l<String> stringAdapter;

    public ExchangeResponseJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("statusCode", "response");
        i.d(a, "JsonReader.Options.of(\"statusCode\", \"response\")");
        this.options = a;
        Class cls = Integer.TYPE;
        e.t.q qVar = e.t.q.f7936h;
        l<Integer> d = xVar.d(cls, qVar, "statusCode");
        i.d(d, "moshi.adapter(Int::class…et(),\n      \"statusCode\")");
        this.intAdapter = d;
        l<String> d2 = xVar.d(String.class, qVar, "response");
        i.d(d2, "moshi.adapter(String::cl…ySet(),\n      \"response\")");
        this.stringAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Integer num = null;
        String str = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                Integer a = this.intAdapter.a(qVar);
                if (a != null) {
                    num = Integer.valueOf(a.intValue());
                } else {
                    n m2 = b.m("statusCode", "statusCode", qVar);
                    i.d(m2, "Util.unexpectedNull(\"sta…    \"statusCode\", reader)");
                    throw m2;
                }
            } else if (m0 == 1 && (str = this.stringAdapter.a(qVar)) == null) {
                n m3 = b.m("response", "response", qVar);
                i.d(m3, "Util.unexpectedNull(\"res…      \"response\", reader)");
                throw m3;
            }
        }
        qVar.z();
        if (num != null) {
            int intValue = num.intValue();
            if (str != null) {
                return new ExchangeResponse(intValue, str);
            }
            n g2 = b.g("response", "response", qVar);
            i.d(g2, "Util.missingProperty(\"re…nse\", \"response\", reader)");
            throw g2;
        }
        n g3 = b.g("statusCode", "statusCode", qVar);
        i.d(g3, "Util.missingProperty(\"st…e\", \"statusCode\", reader)");
        throw g3;
    }

    public void e(u uVar, Object obj) {
        ExchangeResponse exchangeResponse = (ExchangeResponse) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(exchangeResponse, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("statusCode");
        this.intAdapter.e(uVar, Integer.valueOf(exchangeResponse.a));
        uVar.O("response");
        this.stringAdapter.e(uVar, exchangeResponse.f7111b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(ExchangeResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ExchangeResponse)";
    }
}
