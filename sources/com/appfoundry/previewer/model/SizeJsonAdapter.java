package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/appfoundry/previewer/model/SizeJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Size;", "", "toString", "()Ljava/lang/String;", "", "nullableIntAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class SizeJsonAdapter extends l<Size> {
    private final l<Integer> nullableIntAdapter;
    private final q.a options;

    public SizeJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("width", "height");
        i.d(a, "JsonReader.Options.of(\"width\", \"height\")");
        this.options = a;
        l<Integer> d = xVar.d(Integer.class, e.t.q.f7936h, "width");
        i.d(d, "moshi.adapter(Int::class…     emptySet(), \"width\")");
        this.nullableIntAdapter = d;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Integer num = null;
        Integer num2 = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                num = this.nullableIntAdapter.a(qVar);
            } else if (m0 == 1) {
                num2 = this.nullableIntAdapter.a(qVar);
            }
        }
        qVar.z();
        return new Size(num, num2);
    }

    public void e(u uVar, Object obj) {
        Size size = (Size) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(size, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("width");
        this.nullableIntAdapter.e(uVar, size.a);
        uVar.O("height");
        this.nullableIntAdapter.e(uVar, size.f7160b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Size)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Size)";
    }
}
