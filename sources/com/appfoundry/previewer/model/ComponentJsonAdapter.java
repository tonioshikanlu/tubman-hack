package com.appfoundry.previewer.model;

import androidx.core.app.NotificationCompat;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\tR\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\t¨\u0006 "}, d2 = {"Lcom/appfoundry/previewer/model/ComponentJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Component;", "", "toString", "()Ljava/lang/String;", "", "Lcom/appfoundry/previewer/model/RichText;", "nullableListOfRichTextAdapter", "Lb/p/a/l;", "nullableStringAdapter", "Lcom/appfoundry/previewer/model/Params;", "nullableParamsAdapter", "Lcom/appfoundry/previewer/model/States;", "nullableStatesAdapter", "", "nullableMutableListOfComponentAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "nullableMutableListOfStringAdapter", "Lcom/appfoundry/previewer/model/Text;", "nullableTextAdapter", "Lcom/appfoundry/previewer/model/Actions;", "nullableActionsAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ComponentJsonAdapter extends l<Component> {
    private volatile Constructor<Component> constructorRef;
    private final l<Actions> nullableActionsAdapter;
    private final l<List<RichText>> nullableListOfRichTextAdapter;
    private final l<List<Component>> nullableMutableListOfComponentAdapter;
    private final l<List<String>> nullableMutableListOfStringAdapter;
    private final l<Params> nullableParamsAdapter;
    private final l<States> nullableStatesAdapter;
    private final l<String> nullableStringAdapter;
    private final l<Text> nullableTextAdapter;
    private final q.a options;

    public ComponentJsonAdapter(x xVar) {
        x xVar2 = xVar;
        Class<String> cls = String.class;
        i.e(xVar2, "moshi");
        q.a a = q.a.a(AnalyticsContext.Device.DEVICE_ID_KEY, "type", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "styleId", "href", "assetId", "tags", "params", "actions", "states", "components", "hrefRemote", "value", "anchor", "richText", "format", "stateSetId", "state", "name");
        i.d(a, "JsonReader.Options.of(\"i…eSetId\", \"state\", \"name\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar2.d(cls, qVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        i.d(d, "moshi.adapter(String::cl…,\n      emptySet(), \"id\")");
        this.nullableStringAdapter = d;
        l<Text> d2 = xVar2.d(Text.class, qVar, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        i.d(d2, "moshi.adapter(Text::clas…emptySet(),\n      \"text\")");
        this.nullableTextAdapter = d2;
        l<List<String>> d3 = xVar2.d(g.V(List.class, cls), qVar, "tags");
        i.d(d3, "moshi.adapter(Types.newP…      emptySet(), \"tags\")");
        this.nullableMutableListOfStringAdapter = d3;
        l<Params> d4 = xVar2.d(Params.class, qVar, "params");
        i.d(d4, "moshi.adapter(Params::cl…    emptySet(), \"params\")");
        this.nullableParamsAdapter = d4;
        l<Actions> d5 = xVar2.d(Actions.class, qVar, "actions");
        i.d(d5, "moshi.adapter(Actions::c…   emptySet(), \"actions\")");
        this.nullableActionsAdapter = d5;
        l<States> d6 = xVar2.d(States.class, qVar, "states");
        i.d(d6, "moshi.adapter(States::cl…    emptySet(), \"states\")");
        this.nullableStatesAdapter = d6;
        l<List<Component>> d7 = xVar2.d(g.V(List.class, Component.class), qVar, "components");
        i.d(d7, "moshi.adapter(Types.newP…emptySet(), \"components\")");
        this.nullableMutableListOfComponentAdapter = d7;
        l<List<RichText>> d8 = xVar2.d(g.V(List.class, RichText.class), qVar, "richText");
        i.d(d8, "moshi.adapter(Types.newP…ySet(),\n      \"richText\")");
        this.nullableListOfRichTextAdapter = d8;
    }

    public Object a(q qVar) {
        String str;
        q qVar2 = qVar;
        Class<String> cls = String.class;
        i.e(qVar2, "reader");
        qVar.e();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Text text = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        Params params = null;
        Actions actions = null;
        States states = null;
        List list2 = null;
        String str8 = null;
        String str9 = null;
        List list3 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        while (qVar.N()) {
            switch (qVar2.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    str3 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 1:
                    str4 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 2:
                    text = this.nullableTextAdapter.a(qVar2);
                    break;
                case 3:
                    str5 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 4:
                    str6 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 5:
                    str7 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 6:
                    list = this.nullableMutableListOfStringAdapter.a(qVar2);
                    break;
                case 7:
                    params = this.nullableParamsAdapter.a(qVar2);
                    break;
                case 8:
                    actions = this.nullableActionsAdapter.a(qVar2);
                    break;
                case 9:
                    states = this.nullableStatesAdapter.a(qVar2);
                    break;
                case 10:
                    list2 = this.nullableMutableListOfComponentAdapter.a(qVar2);
                    break;
                case 11:
                    str2 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 12:
                    str8 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 13:
                    str9 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 14:
                    list3 = this.nullableListOfRichTextAdapter.a(qVar2);
                    break;
                case 15:
                    str10 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 16:
                    str11 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 17:
                    str12 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 18:
                    str13 = this.nullableStringAdapter.a(qVar2);
                    break;
            }
        }
        qVar.z();
        Constructor<Component> constructor = this.constructorRef;
        if (constructor != null) {
            str = str2;
        } else {
            str = str2;
            constructor = Component.class.getDeclaredConstructor(new Class[]{cls, cls, Text.class, cls, cls, cls, cls, Integer.class, List.class, Params.class, Actions.class, States.class, List.class, cls, cls, cls, List.class, cls, cls, cls, cls, cls, cls, Integer.TYPE, b.c});
            this.constructorRef = constructor;
            i.d(constructor, "Component::class.java.ge…his.constructorRef = it }");
        }
        Component newInstance = constructor.newInstance(new Object[]{str3, str4, text, str5, str6, str7, null, null, list, params, actions, states, list2, str, str8, str9, list3, str10, str11, str12, str13, null, null, -1, null});
        i.d(newInstance, "localConstructor.newInst…mask0,\n        null\n    )");
        return newInstance;
    }

    public void e(u uVar, Object obj) {
        Component component = (Component) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(component, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.nullableStringAdapter.e(uVar, component.a);
        uVar.O("type");
        this.nullableStringAdapter.e(uVar, component.f7083b);
        uVar.O(NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        this.nullableTextAdapter.e(uVar, component.c);
        uVar.O("styleId");
        this.nullableStringAdapter.e(uVar, component.d);
        uVar.O("href");
        this.nullableStringAdapter.e(uVar, component.f7084e);
        uVar.O("assetId");
        this.nullableStringAdapter.e(uVar, component.f);
        uVar.O("tags");
        this.nullableMutableListOfStringAdapter.e(uVar, component.f7087i);
        uVar.O("params");
        this.nullableParamsAdapter.e(uVar, component.f7088j);
        uVar.O("actions");
        this.nullableActionsAdapter.e(uVar, component.f7089k);
        uVar.O("states");
        this.nullableStatesAdapter.e(uVar, component.f7090l);
        uVar.O("components");
        this.nullableMutableListOfComponentAdapter.e(uVar, component.f7091m);
        uVar.O("hrefRemote");
        this.nullableStringAdapter.e(uVar, component.f7092n);
        uVar.O("value");
        this.nullableStringAdapter.e(uVar, component.f7093o);
        uVar.O("anchor");
        this.nullableStringAdapter.e(uVar, component.f7094p);
        uVar.O("richText");
        this.nullableListOfRichTextAdapter.e(uVar, component.f7095q);
        uVar.O("format");
        this.nullableStringAdapter.e(uVar, component.r);
        uVar.O("stateSetId");
        this.nullableStringAdapter.e(uVar, component.s);
        uVar.O("state");
        this.nullableStringAdapter.e(uVar, component.t);
        uVar.O("name");
        this.nullableStringAdapter.e(uVar, component.u);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Component)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Component)";
    }
}
