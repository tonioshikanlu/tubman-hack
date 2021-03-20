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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR$\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/appfoundry/previewer/model/BoundJsonJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/BoundJson;", "", "toString", "()Ljava/lang/String;", "", "Lcom/appfoundry/previewer/model/Style;", "nullableListOfStyleAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/BoundNode;", "nullableBoundNodeAdapter", "nullableStringAdapter", "Lcom/appfoundry/previewer/model/Asset;", "nullableListOfAssetAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class BoundJsonJsonAdapter extends l<BoundJson> {
    private final l<BoundNode> nullableBoundNodeAdapter;
    private final l<List<Asset>> nullableListOfAssetAdapter;
    private final l<List<Style>> nullableListOfStyleAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public BoundJsonJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("data", "styles", "assets", "nextLink");
        i.d(a, "JsonReader.Options.of(\"d…ssets\",\n      \"nextLink\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<BoundNode> d = xVar.d(BoundNode.class, qVar, "data");
        i.d(d, "moshi.adapter(BoundNode:…java, emptySet(), \"data\")");
        this.nullableBoundNodeAdapter = d;
        l<List<Style>> d2 = xVar.d(g.V(List.class, Style.class), qVar, "styles");
        i.d(d2, "moshi.adapter(Types.newP…ptySet(),\n      \"styles\")");
        this.nullableListOfStyleAdapter = d2;
        l<List<Asset>> d3 = xVar.d(g.V(List.class, Asset.class), qVar, "assets");
        i.d(d3, "moshi.adapter(Types.newP…ptySet(),\n      \"assets\")");
        this.nullableListOfAssetAdapter = d3;
        l<String> d4 = xVar.d(String.class, qVar, "nextLink");
        i.d(d4, "moshi.adapter(String::cl…  emptySet(), \"nextLink\")");
        this.nullableStringAdapter = d4;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        BoundNode boundNode = null;
        List list = null;
        List list2 = null;
        String str = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                boundNode = this.nullableBoundNodeAdapter.a(qVar);
            } else if (m0 == 1) {
                list = this.nullableListOfStyleAdapter.a(qVar);
            } else if (m0 == 2) {
                list2 = this.nullableListOfAssetAdapter.a(qVar);
            } else if (m0 == 3) {
                str = this.nullableStringAdapter.a(qVar);
            }
        }
        qVar.z();
        return new BoundJson(boundNode, list, list2, str);
    }

    public void e(u uVar, Object obj) {
        BoundJson boundJson = (BoundJson) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(boundJson, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("data");
        this.nullableBoundNodeAdapter.e(uVar, boundJson.a);
        uVar.O("styles");
        this.nullableListOfStyleAdapter.e(uVar, boundJson.f7074b);
        uVar.O("assets");
        this.nullableListOfAssetAdapter.e(uVar, boundJson.c);
        uVar.O("nextLink");
        this.nullableStringAdapter.e(uVar, boundJson.d);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(BoundJson)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(BoundJson)";
    }
}
