package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/appfoundry/previewer/model/StoreJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Store;", "", "toString", "()Ljava/lang/String;", "", "nullableIntAdapter", "Lb/p/a/l;", "nullableStringAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class StoreJsonAdapter extends l<Store> {
    private final l<Integer> nullableIntAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public StoreJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("name", "icon", "splash", "description", "bundleId", "ratingAppAlert");
        i.d(a, "JsonReader.Options.of(\"n…dleId\", \"ratingAppAlert\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(String.class, qVar, "name");
        i.d(d, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = d;
        l<Integer> d2 = xVar.d(Integer.class, qVar, "ratingAppAlert");
        i.d(d2, "moshi.adapter(Int::class…ySet(), \"ratingAppAlert\")");
        this.nullableIntAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        while (qVar.N()) {
            switch (qVar.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.a(qVar);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.a(qVar);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.a(qVar);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.a(qVar);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.a(qVar);
                    break;
                case 5:
                    num = this.nullableIntAdapter.a(qVar);
                    break;
            }
        }
        qVar.z();
        return new Store(str, str2, str3, str4, str5, num);
    }

    public void e(u uVar, Object obj) {
        Store store = (Store) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(store, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("name");
        this.nullableStringAdapter.e(uVar, store.a);
        uVar.O("icon");
        this.nullableStringAdapter.e(uVar, store.f7166b);
        uVar.O("splash");
        this.nullableStringAdapter.e(uVar, store.c);
        uVar.O("description");
        this.nullableStringAdapter.e(uVar, store.d);
        uVar.O("bundleId");
        this.nullableStringAdapter.e(uVar, store.f7167e);
        uVar.O("ratingAppAlert");
        this.nullableIntAdapter.e(uVar, store.f);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Store)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Store)";
    }
}
