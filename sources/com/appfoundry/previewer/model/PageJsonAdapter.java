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
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R$\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007¨\u0006 "}, d2 = {"Lcom/appfoundry/previewer/model/PageJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Page;", "", "toString", "()Ljava/lang/String;", "stringAdapter", "Lb/p/a/l;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "", "Lcom/appfoundry/previewer/model/Container;", "nullableMutableListOfContainerAdapter", "nullableContainerAdapter", "", "nullableListOfStringAdapter", "", "nullableBooleanAdapter", "Lcom/appfoundry/previewer/model/Animation;", "nullableAnimationAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableMutableListOfStringAdapter", "nullableStringAdapter", "Lcom/appfoundry/previewer/model/States;", "nullableStatesAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class PageJsonAdapter extends l<Page> {
    private volatile Constructor<Page> constructorRef;
    private final l<Animation> nullableAnimationAdapter;
    private final l<Boolean> nullableBooleanAdapter;
    private final l<Container> nullableContainerAdapter;
    private final l<List<String>> nullableListOfStringAdapter;
    private final l<List<Container>> nullableMutableListOfContainerAdapter;
    private final l<List<String>> nullableMutableListOfStringAdapter;
    private final l<States> nullableStatesAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;
    private final l<String> stringAdapter;

    public PageJsonAdapter(x xVar) {
        x xVar2 = xVar;
        Class<Container> cls = Container.class;
        Class<String> cls2 = String.class;
        i.e(xVar2, "moshi");
        q.a a = q.a.a(AnalyticsContext.Device.DEVICE_ID_KEY, "name", "type", "topBar", "header", "body", "layers", "footer", "background", "start", "remote", "nextLink", "tags", "intro", "swipeHref", "states", "remoteForm", "styleId", "state", "stateSetId", "animation");
        i.d(a, "JsonReader.Options.of(\"i…stateSetId\", \"animation\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar2.d(cls2, qVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        i.d(d, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.stringAdapter = d;
        l<String> d2 = xVar2.d(cls2, qVar, "name");
        i.d(d2, "moshi.adapter(String::cl…      emptySet(), \"name\")");
        this.nullableStringAdapter = d2;
        l<Container> d3 = xVar2.d(cls, qVar, "topBar");
        i.d(d3, "moshi.adapter(Container:…va, emptySet(), \"topBar\")");
        this.nullableContainerAdapter = d3;
        l<List<Container>> d4 = xVar2.d(g.V(List.class, cls), qVar, "body");
        i.d(d4, "moshi.adapter(Types.newP…      emptySet(), \"body\")");
        this.nullableMutableListOfContainerAdapter = d4;
        l<Boolean> d5 = xVar2.d(Boolean.class, qVar, "start");
        i.d(d5, "moshi.adapter(Boolean::c…ype, emptySet(), \"start\")");
        this.nullableBooleanAdapter = d5;
        l<List<String>> d6 = xVar2.d(g.V(List.class, cls2), qVar, "tags");
        i.d(d6, "moshi.adapter(Types.newP…emptySet(),\n      \"tags\")");
        this.nullableListOfStringAdapter = d6;
        l<List<String>> d7 = xVar2.d(g.V(List.class, cls2), qVar, "swipeHref");
        i.d(d7, "moshi.adapter(Types.newP… emptySet(), \"swipeHref\")");
        this.nullableMutableListOfStringAdapter = d7;
        l<States> d8 = xVar2.d(States.class, qVar, "states");
        i.d(d8, "moshi.adapter(States::cl…    emptySet(), \"states\")");
        this.nullableStatesAdapter = d8;
        l<Animation> d9 = xVar2.d(Animation.class, qVar, "animation");
        i.d(d9, "moshi.adapter(Animation:… emptySet(), \"animation\")");
        this.nullableAnimationAdapter = d9;
    }

    public Object a(q qVar) {
        String str;
        q qVar2 = qVar;
        Class<Container> cls = Container.class;
        Class<String> cls2 = String.class;
        i.e(qVar2, "reader");
        qVar.e();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Container container = null;
        Container container2 = null;
        List list = null;
        List list2 = null;
        Container container3 = null;
        Container container4 = null;
        Boolean bool = null;
        String str6 = null;
        List list3 = null;
        String str7 = null;
        List list4 = null;
        States states = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Animation animation = null;
        while (qVar.N()) {
            String str12 = str2;
            switch (qVar2.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    String a = this.stringAdapter.a(qVar2);
                    if (a != null) {
                        str3 = a;
                        break;
                    } else {
                        n m2 = b.m(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar2);
                        i.d(m2, "Util.unexpectedNull(\"id\", \"id\", reader)");
                        throw m2;
                    }
                case 1:
                    str4 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 2:
                    str5 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 3:
                    container = this.nullableContainerAdapter.a(qVar2);
                    break;
                case 4:
                    container2 = this.nullableContainerAdapter.a(qVar2);
                    break;
                case 5:
                    list = this.nullableMutableListOfContainerAdapter.a(qVar2);
                    break;
                case 6:
                    list2 = this.nullableMutableListOfContainerAdapter.a(qVar2);
                    break;
                case 7:
                    container3 = this.nullableContainerAdapter.a(qVar2);
                    break;
                case 8:
                    container4 = this.nullableContainerAdapter.a(qVar2);
                    break;
                case 9:
                    bool = this.nullableBooleanAdapter.a(qVar2);
                    break;
                case 10:
                    str2 = this.nullableStringAdapter.a(qVar2);
                    continue;
                case 11:
                    str6 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 12:
                    list3 = this.nullableListOfStringAdapter.a(qVar2);
                    break;
                case 13:
                    str7 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 14:
                    list4 = this.nullableMutableListOfStringAdapter.a(qVar2);
                    break;
                case 15:
                    states = this.nullableStatesAdapter.a(qVar2);
                    break;
                case 16:
                    str8 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 17:
                    str9 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 18:
                    str10 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 19:
                    str11 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 20:
                    animation = this.nullableAnimationAdapter.a(qVar2);
                    break;
            }
            str2 = str12;
        }
        String str13 = str2;
        qVar.z();
        Constructor<Page> constructor = this.constructorRef;
        if (constructor != null) {
            str = AnalyticsContext.Device.DEVICE_ID_KEY;
        } else {
            str = AnalyticsContext.Device.DEVICE_ID_KEY;
            Class cls3 = Boolean.TYPE;
            constructor = Page.class.getDeclaredConstructor(new Class[]{cls2, cls2, cls2, cls, cls, List.class, List.class, cls, cls, Boolean.class, cls2, cls2, List.class, cls2, List.class, States.class, cls2, cls2, cls2, cls2, Animation.class, cls3, List.class, cls3, cls2, cls3, Integer.TYPE, b.c});
            this.constructorRef = constructor;
            i.d(constructor, "Page::class.java.getDecl…his.constructorRef = it }");
        }
        Object[] objArr = new Object[28];
        if (str3 != null) {
            objArr[0] = str3;
            objArr[1] = str4;
            objArr[2] = str5;
            objArr[3] = container;
            objArr[4] = container2;
            objArr[5] = list;
            objArr[6] = list2;
            objArr[7] = container3;
            objArr[8] = container4;
            objArr[9] = bool;
            objArr[10] = str13;
            objArr[11] = str6;
            objArr[12] = list3;
            objArr[13] = str7;
            objArr[14] = list4;
            objArr[15] = states;
            objArr[16] = str8;
            objArr[17] = str9;
            objArr[18] = str10;
            objArr[19] = str11;
            objArr[20] = animation;
            Boolean bool2 = Boolean.FALSE;
            objArr[21] = bool2;
            objArr[22] = null;
            objArr[23] = bool2;
            objArr[24] = null;
            objArr[25] = bool2;
            objArr[26] = -1;
            objArr[27] = null;
            Page newInstance = constructor.newInstance(objArr);
            i.d(newInstance, "localConstructor.newInst…mask0,\n        null\n    )");
            return newInstance;
        }
        String str14 = str;
        n g2 = b.g(str14, str14, qVar);
        i.d(g2, "Util.missingProperty(\"id\", \"id\", reader)");
        throw g2;
    }

    public void e(u uVar, Object obj) {
        Page page = (Page) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(page, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.stringAdapter.e(uVar, page.a);
        uVar.O("name");
        this.nullableStringAdapter.e(uVar, page.f7126b);
        uVar.O("type");
        this.nullableStringAdapter.e(uVar, page.c);
        uVar.O("topBar");
        this.nullableContainerAdapter.e(uVar, page.d);
        uVar.O("header");
        this.nullableContainerAdapter.e(uVar, page.f7127e);
        uVar.O("body");
        this.nullableMutableListOfContainerAdapter.e(uVar, page.f);
        uVar.O("layers");
        this.nullableMutableListOfContainerAdapter.e(uVar, page.f7128g);
        uVar.O("footer");
        this.nullableContainerAdapter.e(uVar, page.f7129h);
        uVar.O("background");
        this.nullableContainerAdapter.e(uVar, page.f7130i);
        uVar.O("start");
        this.nullableBooleanAdapter.e(uVar, page.f7131j);
        uVar.O("remote");
        this.nullableStringAdapter.e(uVar, page.f7132k);
        uVar.O("nextLink");
        this.nullableStringAdapter.e(uVar, page.f7133l);
        uVar.O("tags");
        this.nullableListOfStringAdapter.e(uVar, page.f7134m);
        uVar.O("intro");
        this.nullableStringAdapter.e(uVar, page.f7135n);
        uVar.O("swipeHref");
        this.nullableMutableListOfStringAdapter.e(uVar, page.f7136o);
        uVar.O("states");
        this.nullableStatesAdapter.e(uVar, page.f7137p);
        uVar.O("remoteForm");
        this.nullableStringAdapter.e(uVar, page.f7138q);
        uVar.O("styleId");
        this.nullableStringAdapter.e(uVar, page.r);
        uVar.O("state");
        this.nullableStringAdapter.e(uVar, page.s);
        uVar.O("stateSetId");
        this.nullableStringAdapter.e(uVar, page.t);
        uVar.O("animation");
        this.nullableAnimationAdapter.e(uVar, page.u);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Page)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Page)";
    }
}
