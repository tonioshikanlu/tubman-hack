package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;
import kotlin.Metadata;

@m(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\b\u0010a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010+\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u0010'\u001a\u0004\u0018\u00010 \u0012\b\u0010g\u001a\u0004\u0018\u00010b\u0012\b\u0010L\u001a\u0004\u0018\u00010G\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0010\u0012\b\u0010q\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010j\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u00108\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\br\u0010sJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u0004R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\r\u001a\u0004\b)\u0010\u0004R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\r\u001a\u0004\b4\u0010\u0004R\u001b\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\r\u001a\u0004\b7\u0010\u0004R\u001b\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010\r\u001a\u0004\b:\u0010\u0004R\u001b\u0010>\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010\r\u001a\u0004\b=\u0010\u0004R!\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010\u0012\u001a\u0004\b@\u0010\u0014R!\u0010F\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B8\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010\u0012\u001a\u0004\bE\u0010\u0014R\u001b\u0010L\u001a\u0004\u0018\u00010G8\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR$\u0010P\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010\r\u001a\u0004\bN\u0010\u0004\"\u0004\bO\u0010\u001eR\u001b\u0010S\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bQ\u0010\r\u001a\u0004\bR\u0010\u0004R$\u0010Z\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010^\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u0010\r\u001a\u0004\b\\\u0010\u0004\"\u0004\b]\u0010\u001eR\u001b\u0010a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b_\u0010\r\u001a\u0004\b`\u0010\u0004R\u001b\u0010g\u001a\u0004\u0018\u00010b8\u0006@\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001b\u0010j\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bh\u0010\r\u001a\u0004\bi\u0010\u0004R$\u0010n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bk\u0010\r\u001a\u0004\bl\u0010\u0004\"\u0004\bm\u0010\u001eR\u001b\u0010q\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bo\u0010\r\u001a\u0004\bp\u0010\u0004¨\u0006t"}, d2 = {"Lcom/appfoundry/previewer/model/Component;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getHref", "href", "", "m", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "setComponents", "(Ljava/util/List;)V", "components", "r", "getFormat", "format", "g", "getIconUrl", "setIconUrl", "(Ljava/lang/String;)V", "iconUrl", "Lcom/appfoundry/previewer/model/Params;", "j", "Lcom/appfoundry/previewer/model/Params;", "getParams", "()Lcom/appfoundry/previewer/model/Params;", "setParams", "(Lcom/appfoundry/previewer/model/Params;)V", "params", "s", "getStateSetId", "stateSetId", "Lcom/appfoundry/previewer/model/Text;", "c", "Lcom/appfoundry/previewer/model/Text;", "getText", "()Lcom/appfoundry/previewer/model/Text;", "setText", "(Lcom/appfoundry/previewer/model/Text;)V", "text", "t", "getState", "state", "u", "getName", "name", "d", "getStyleId", "styleId", "f", "getAssetId", "assetId", "i", "getTags", "tags", "", "Lcom/appfoundry/previewer/model/RichText;", "q", "getRichText", "richText", "Lcom/appfoundry/previewer/model/States;", "l", "Lcom/appfoundry/previewer/model/States;", "getStates", "()Lcom/appfoundry/previewer/model/States;", "states", "b", "getType", "setType", "type", "o", "getValue", "value", "h", "Ljava/lang/Integer;", "getResId", "()Ljava/lang/Integer;", "setResId", "(Ljava/lang/Integer;)V", "resId", "v", "getContainerId", "setContainerId", "containerId", "a", "getId", "id", "Lcom/appfoundry/previewer/model/Actions;", "k", "Lcom/appfoundry/previewer/model/Actions;", "getActions", "()Lcom/appfoundry/previewer/model/Actions;", "actions", "p", "getAnchor", "anchor", "w", "getCurrentState", "setCurrentState", "currentState", "n", "getHrefRemote", "hrefRemote", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appfoundry/previewer/model/Text;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/appfoundry/previewer/model/Params;Lcom/appfoundry/previewer/model/Actions;Lcom/appfoundry/previewer/model/States;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class Component {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public String f7083b;
    public Text c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7084e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public transient String f7085g;

    /* renamed from: h  reason: collision with root package name */
    public transient Integer f7086h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f7087i;

    /* renamed from: j  reason: collision with root package name */
    public Params f7088j;

    /* renamed from: k  reason: collision with root package name */
    public final Actions f7089k;

    /* renamed from: l  reason: collision with root package name */
    public final States f7090l;

    /* renamed from: m  reason: collision with root package name */
    public List<Component> f7091m;

    /* renamed from: n  reason: collision with root package name */
    public final String f7092n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7093o;

    /* renamed from: p  reason: collision with root package name */
    public final String f7094p;

    /* renamed from: q  reason: collision with root package name */
    public final List<RichText> f7095q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public transient String v;
    public transient String w;

    public Component(String str, String str2, Text text, String str3, String str4, String str5, String str6, Integer num, List<String> list, Params params, Actions actions, States states, List<Component> list2, String str7, String str8, String str9, List<RichText> list3, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.a = str;
        this.f7083b = str2;
        this.c = text;
        this.d = str3;
        this.f7084e = str4;
        this.f = str5;
        this.f7085g = str6;
        this.f7086h = num;
        this.f7087i = list;
        this.f7088j = params;
        this.f7089k = actions;
        this.f7090l = states;
        this.f7091m = list2;
        this.f7092n = str7;
        this.f7093o = str8;
        this.f7094p = str9;
        this.f7095q = list3;
        this.r = str10;
        this.s = str11;
        this.t = str12;
        this.u = str13;
        this.v = str14;
        this.w = str15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Component(java.lang.String r28, java.lang.String r29, com.appfoundry.previewer.model.Text r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.Integer r35, java.util.List r36, com.appfoundry.previewer.model.Params r37, com.appfoundry.previewer.model.Actions r38, com.appfoundry.previewer.model.States r39, java.util.List r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.util.List r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
        /*
            r27 = this;
            r0 = r51
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = r2
            goto L_0x000b
        L_0x0009:
            r10 = r34
        L_0x000b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r35
        L_0x0013:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x001b
            r25 = r2
            goto L_0x001d
        L_0x001b:
            r25 = r49
        L_0x001d:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0025
            r26 = r2
            goto L_0x0027
        L_0x0025:
            r26 = r50
        L_0x0027:
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r12 = r36
            r13 = r37
            r14 = r38
            r15 = r39
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r21 = r45
            r22 = r46
            r23 = r47
            r24 = r48
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.model.Component.<init>(java.lang.String, java.lang.String, com.appfoundry.previewer.model.Text, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, com.appfoundry.previewer.model.Params, com.appfoundry.previewer.model.Actions, com.appfoundry.previewer.model.States, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Component)) {
            return false;
        }
        Component component = (Component) obj;
        return i.a(this.a, component.a) && i.a(this.f7083b, component.f7083b) && i.a(this.c, component.c) && i.a(this.d, component.d) && i.a(this.f7084e, component.f7084e) && i.a(this.f, component.f) && i.a(this.f7085g, component.f7085g) && i.a(this.f7086h, component.f7086h) && i.a(this.f7087i, component.f7087i) && i.a(this.f7088j, component.f7088j) && i.a(this.f7089k, component.f7089k) && i.a(this.f7090l, component.f7090l) && i.a(this.f7091m, component.f7091m) && i.a(this.f7092n, component.f7092n) && i.a(this.f7093o, component.f7093o) && i.a(this.f7094p, component.f7094p) && i.a(this.f7095q, component.f7095q) && i.a(this.r, component.r) && i.a(this.s, component.s) && i.a(this.t, component.t) && i.a(this.u, component.u) && i.a(this.v, component.v) && i.a(this.w, component.w);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7083b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Text text = this.c;
        int hashCode3 = (hashCode2 + (text != null ? text.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f7084e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f7085g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.f7086h;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        List<String> list = this.f7087i;
        int hashCode9 = (hashCode8 + (list != null ? list.hashCode() : 0)) * 31;
        Params params = this.f7088j;
        int hashCode10 = (hashCode9 + (params != null ? params.hashCode() : 0)) * 31;
        Actions actions = this.f7089k;
        int hashCode11 = (hashCode10 + (actions != null ? actions.hashCode() : 0)) * 31;
        States states = this.f7090l;
        int hashCode12 = (hashCode11 + (states != null ? states.hashCode() : 0)) * 31;
        List<Component> list2 = this.f7091m;
        int hashCode13 = (hashCode12 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str7 = this.f7092n;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f7093o;
        int hashCode15 = (hashCode14 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f7094p;
        int hashCode16 = (hashCode15 + (str9 != null ? str9.hashCode() : 0)) * 31;
        List<RichText> list3 = this.f7095q;
        int hashCode17 = (hashCode16 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str10 = this.r;
        int hashCode18 = (hashCode17 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.s;
        int hashCode19 = (hashCode18 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.t;
        int hashCode20 = (hashCode19 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.u;
        int hashCode21 = (hashCode20 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.v;
        int hashCode22 = (hashCode21 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.w;
        if (str15 != null) {
            i2 = str15.hashCode();
        }
        return hashCode22 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Component(id=");
        y.append(this.a);
        y.append(", type=");
        y.append(this.f7083b);
        y.append(", text=");
        y.append(this.c);
        y.append(", styleId=");
        y.append(this.d);
        y.append(", href=");
        y.append(this.f7084e);
        y.append(", assetId=");
        y.append(this.f);
        y.append(", iconUrl=");
        y.append(this.f7085g);
        y.append(", resId=");
        y.append(this.f7086h);
        y.append(", tags=");
        y.append(this.f7087i);
        y.append(", params=");
        y.append(this.f7088j);
        y.append(", actions=");
        y.append(this.f7089k);
        y.append(", states=");
        y.append(this.f7090l);
        y.append(", components=");
        y.append(this.f7091m);
        y.append(", hrefRemote=");
        y.append(this.f7092n);
        y.append(", value=");
        y.append(this.f7093o);
        y.append(", anchor=");
        y.append(this.f7094p);
        y.append(", richText=");
        y.append(this.f7095q);
        y.append(", format=");
        y.append(this.r);
        y.append(", stateSetId=");
        y.append(this.s);
        y.append(", state=");
        y.append(this.t);
        y.append(", name=");
        y.append(this.u);
        y.append(", containerId=");
        y.append(this.v);
        y.append(", currentState=");
        return a.q(y, this.w, ")");
    }
}
