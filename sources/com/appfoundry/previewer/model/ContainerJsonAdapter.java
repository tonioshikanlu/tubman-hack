package com.appfoundry.previewer.model;

import b.l.f.x.a.g;
import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import b.p.a.z.b;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R$\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R$\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/appfoundry/previewer/model/ContainerJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Container;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "", "nullableMutableListOfContainerAdapter", "", "nullableListOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "nullableContainerAdapter", "Lcom/appfoundry/previewer/model/Component;", "nullableMutableListOfComponentAdapter", "", "nullableBooleanAdapter", "Lcom/appfoundry/previewer/model/Params;", "nullableParamsAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/Actions;", "nullableActionsAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ContainerJsonAdapter extends l<Container> {
    private volatile Constructor<Container> constructorRef;
    private final l<Actions> nullableActionsAdapter;
    private final l<Boolean> nullableBooleanAdapter;
    private final l<Container> nullableContainerAdapter;
    private final l<List<String>> nullableListOfStringAdapter;
    private final l<List<Component>> nullableMutableListOfComponentAdapter;
    private final l<List<Container>> nullableMutableListOfContainerAdapter;
    private final l<Params> nullableParamsAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public ContainerJsonAdapter(x xVar) {
        x xVar2 = xVar;
        Class<Container> cls = Container.class;
        Class<String> cls2 = String.class;
        i.e(xVar2, "moshi");
        q.a a = q.a.a(AnalyticsContext.Device.DEVICE_ID_KEY, "type", "styleId", "href", "hrefRemote", "components", "background", "statusBar", "scrollable", "tags", "actions", "containers", "params");
        i.d(a, "JsonReader.Options.of(\"i…  \"containers\", \"params\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar2.d(cls2, qVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        i.d(d, "moshi.adapter(String::cl…,\n      emptySet(), \"id\")");
        this.nullableStringAdapter = d;
        l<List<Component>> d2 = xVar2.d(g.V(List.class, Component.class), qVar, "components");
        i.d(d2, "moshi.adapter(Types.newP…emptySet(), \"components\")");
        this.nullableMutableListOfComponentAdapter = d2;
        l<Container> d3 = xVar2.d(cls, qVar, "background");
        i.d(d3, "moshi.adapter(Container:…emptySet(), \"background\")");
        this.nullableContainerAdapter = d3;
        l<Boolean> d4 = xVar2.d(Boolean.class, qVar, "scrollable");
        i.d(d4, "moshi.adapter(Boolean::c…emptySet(), \"scrollable\")");
        this.nullableBooleanAdapter = d4;
        l<List<String>> d5 = xVar2.d(g.V(List.class, cls2), qVar, "tags");
        i.d(d5, "moshi.adapter(Types.newP…emptySet(),\n      \"tags\")");
        this.nullableListOfStringAdapter = d5;
        l<Actions> d6 = xVar2.d(Actions.class, qVar, "actions");
        i.d(d6, "moshi.adapter(Actions::c…   emptySet(), \"actions\")");
        this.nullableActionsAdapter = d6;
        l<List<Container>> d7 = xVar2.d(g.V(List.class, cls), qVar, "containers");
        i.d(d7, "moshi.adapter(Types.newP…emptySet(), \"containers\")");
        this.nullableMutableListOfContainerAdapter = d7;
        l<Params> d8 = xVar2.d(Params.class, qVar, "params");
        i.d(d8, "moshi.adapter(Params::cl…    emptySet(), \"params\")");
        this.nullableParamsAdapter = d8;
    }

    public Object a(q qVar) {
        q qVar2 = qVar;
        Class<Boolean> cls = Boolean.class;
        Class<Container> cls2 = Container.class;
        Class<String> cls3 = String.class;
        i.e(qVar2, "reader");
        qVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        Container container = null;
        String str6 = null;
        Boolean bool = null;
        List list2 = null;
        Actions actions = null;
        List list3 = null;
        Params params = null;
        while (qVar.N()) {
            switch (qVar2.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.a(qVar2);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 5:
                    list = this.nullableMutableListOfComponentAdapter.a(qVar2);
                    break;
                case 6:
                    container = this.nullableContainerAdapter.a(qVar2);
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 8:
                    bool = this.nullableBooleanAdapter.a(qVar2);
                    break;
                case 9:
                    list2 = this.nullableListOfStringAdapter.a(qVar2);
                    break;
                case 10:
                    actions = this.nullableActionsAdapter.a(qVar2);
                    break;
                case 11:
                    list3 = this.nullableMutableListOfContainerAdapter.a(qVar2);
                    break;
                case 12:
                    params = this.nullableParamsAdapter.a(qVar2);
                    break;
            }
        }
        qVar.z();
        Constructor<Container> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = cls2.getDeclaredConstructor(new Class[]{cls3, cls3, cls3, cls3, cls3, List.class, cls2, cls3, cls, List.class, Actions.class, List.class, Params.class, cls3, cls, Integer.TYPE, b.c});
            this.constructorRef = constructor;
            i.d(constructor, "Container::class.java.ge…his.constructorRef = it }");
        }
        Container newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, str5, list, container, str6, bool, list2, actions, list3, params, null, null, -1, null});
        i.d(newInstance, "localConstructor.newInst…mask0,\n        null\n    )");
        return newInstance;
    }

    public void e(u uVar, Object obj) {
        Container container = (Container) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(container, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.nullableStringAdapter.e(uVar, container.a);
        uVar.O("type");
        this.nullableStringAdapter.e(uVar, container.f7096b);
        uVar.O("styleId");
        this.nullableStringAdapter.e(uVar, container.c);
        uVar.O("href");
        this.nullableStringAdapter.e(uVar, container.d);
        uVar.O("hrefRemote");
        this.nullableStringAdapter.e(uVar, container.f7097e);
        uVar.O("components");
        this.nullableMutableListOfComponentAdapter.e(uVar, container.f);
        uVar.O("background");
        this.nullableContainerAdapter.e(uVar, container.f7098g);
        uVar.O("statusBar");
        this.nullableStringAdapter.e(uVar, container.f7099h);
        uVar.O("scrollable");
        this.nullableBooleanAdapter.e(uVar, container.f7100i);
        uVar.O("tags");
        this.nullableListOfStringAdapter.e(uVar, container.f7101j);
        uVar.O("actions");
        this.nullableActionsAdapter.e(uVar, container.f7102k);
        uVar.O("containers");
        this.nullableMutableListOfContainerAdapter.e(uVar, container.f7103l);
        uVar.O("params");
        this.nullableParamsAdapter.e(uVar, container.f7104m);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Container)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Container)";
    }
}
