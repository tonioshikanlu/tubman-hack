package com.appfoundry.previewer.model;

import b.l.f.x.a.g;
import b.p.a.l;
import b.p.a.n;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import b.p.a.z.b;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R$\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00120\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/appfoundry/previewer/model/BoundNodeJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/BoundNode;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "stringAdapter", "", "nullableListOfStringAdapter", "", "nullableBooleanAdapter", "Lcom/appfoundry/previewer/model/Container;", "nullableContainerAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableMutableListOfContainerAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class BoundNodeJsonAdapter extends l<BoundNode> {
    private final l<Boolean> nullableBooleanAdapter;
    private final l<Container> nullableContainerAdapter;
    private final l<List<String>> nullableListOfStringAdapter;
    private final l<List<Container>> nullableMutableListOfContainerAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;
    private final l<String> stringAdapter;

    public BoundNodeJsonAdapter(x xVar) {
        Class<Container> cls = Container.class;
        Class<String> cls2 = String.class;
        i.e(xVar, "moshi");
        q.a a = q.a.a(AnalyticsContext.Device.DEVICE_ID_KEY, "type", "tags", "start", "background", "topBar", "body", "layers", "remote", "remoteForm");
        i.d(a, "JsonReader.Options.of(\"i…, \"remote\", \"remoteForm\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(cls2, qVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        i.d(d, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.stringAdapter = d;
        l<String> d2 = xVar.d(cls2, qVar, "type");
        i.d(d2, "moshi.adapter(String::cl…      emptySet(), \"type\")");
        this.nullableStringAdapter = d2;
        l<List<String>> d3 = xVar.d(g.V(List.class, cls2), qVar, "tags");
        i.d(d3, "moshi.adapter(Types.newP…emptySet(),\n      \"tags\")");
        this.nullableListOfStringAdapter = d3;
        l<Boolean> d4 = xVar.d(Boolean.class, qVar, "start");
        i.d(d4, "moshi.adapter(Boolean::c…ype, emptySet(), \"start\")");
        this.nullableBooleanAdapter = d4;
        l<Container> d5 = xVar.d(cls, qVar, "background");
        i.d(d5, "moshi.adapter(Container:…emptySet(), \"background\")");
        this.nullableContainerAdapter = d5;
        l<List<Container>> d6 = xVar.d(g.V(List.class, cls), qVar, "body");
        i.d(d6, "moshi.adapter(Types.newP…      emptySet(), \"body\")");
        this.nullableMutableListOfContainerAdapter = d6;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        String str2 = null;
        List list = null;
        Boolean bool = null;
        Container container = null;
        Container container2 = null;
        List list2 = null;
        List list3 = null;
        String str3 = null;
        String str4 = null;
        while (qVar.N()) {
            switch (qVar.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    str = this.stringAdapter.a(qVar);
                    if (str != null) {
                        break;
                    } else {
                        n m2 = b.m(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar);
                        i.d(m2, "Util.unexpectedNull(\"id\", \"id\", reader)");
                        throw m2;
                    }
                case 1:
                    str2 = this.nullableStringAdapter.a(qVar);
                    break;
                case 2:
                    list = this.nullableListOfStringAdapter.a(qVar);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.a(qVar);
                    break;
                case 4:
                    container = this.nullableContainerAdapter.a(qVar);
                    break;
                case 5:
                    container2 = this.nullableContainerAdapter.a(qVar);
                    break;
                case 6:
                    list2 = this.nullableMutableListOfContainerAdapter.a(qVar);
                    break;
                case 7:
                    list3 = this.nullableMutableListOfContainerAdapter.a(qVar);
                    break;
                case 8:
                    str3 = this.nullableStringAdapter.a(qVar);
                    break;
                case 9:
                    str4 = this.nullableStringAdapter.a(qVar);
                    break;
            }
        }
        qVar.z();
        if (str != null) {
            return new BoundNode(str, str2, list, bool, container, container2, list2, list3, str3, str4);
        }
        n g2 = b.g(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar);
        i.d(g2, "Util.missingProperty(\"id\", \"id\", reader)");
        throw g2;
    }

    public void e(u uVar, Object obj) {
        BoundNode boundNode = (BoundNode) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(boundNode, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.stringAdapter.e(uVar, boundNode.a);
        uVar.O("type");
        this.nullableStringAdapter.e(uVar, boundNode.f7075b);
        uVar.O("tags");
        this.nullableListOfStringAdapter.e(uVar, boundNode.c);
        uVar.O("start");
        this.nullableBooleanAdapter.e(uVar, boundNode.d);
        uVar.O("background");
        this.nullableContainerAdapter.e(uVar, boundNode.f7076e);
        uVar.O("topBar");
        this.nullableContainerAdapter.e(uVar, boundNode.f);
        uVar.O("body");
        this.nullableMutableListOfContainerAdapter.e(uVar, boundNode.f7077g);
        uVar.O("layers");
        this.nullableMutableListOfContainerAdapter.e(uVar, boundNode.f7078h);
        uVar.O("remote");
        this.nullableStringAdapter.e(uVar, boundNode.f7079i);
        uVar.O("remoteForm");
        this.nullableStringAdapter.e(uVar, boundNode.f7080j);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(BoundNode)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(BoundNode)";
    }
}
