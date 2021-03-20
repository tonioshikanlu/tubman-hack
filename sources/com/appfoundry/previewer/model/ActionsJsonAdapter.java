package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/appfoundry/previewer/model/ActionsJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Actions;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/Tap;", "nullableTapAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ActionsJsonAdapter extends l<Actions> {
    private final l<Tap> nullableTapAdapter;
    private final q.a options;

    public ActionsJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("tap");
        i.d(a, "JsonReader.Options.of(\"tap\")");
        this.options = a;
        l<Tap> d = xVar.d(Tap.class, e.t.q.f7936h, "tap");
        i.d(d, "moshi.adapter(Tap::class… emptySet(),\n      \"tap\")");
        this.nullableTapAdapter = d;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        Tap tap = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                tap = this.nullableTapAdapter.a(qVar);
            }
        }
        qVar.z();
        return new Actions(tap);
    }

    public void e(u uVar, Object obj) {
        Actions actions = (Actions) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(actions, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("tap");
        this.nullableTapAdapter.e(uVar, actions.a);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Actions)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Actions)";
    }
}
