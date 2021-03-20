package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import java.util.List;
import kotlin.Metadata;

@m(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\u0002\u0012\b\u00105\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010A\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000106\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010A\u0012\b\u0010+\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bR\u0010SJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0004\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010 R\u001b\u0010+\u001a\u0004\u0018\u00010&8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u0004\"\u0004\b.\u0010 R\u001b\u00102\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u0004R\u001b\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\u0004R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001b\u0010@\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010\u001d\u001a\u0004\b?\u0010\u0004R!\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010A8\u0006@\u0006¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010:R\u001b\u0010I\u001a\u0004\u0018\u00010\u00008\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR*\u0010N\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010A8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u00108\u001a\u0004\bL\u0010:\"\u0004\bM\u0010<R\u001b\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010\u001d\u001a\u0004\bP\u0010\u0004¨\u0006T"}, d2 = {"Lcom/appfoundry/previewer/model/Container;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "o", "Ljava/lang/Boolean;", "getCarouselSlide", "()Ljava/lang/Boolean;", "setCarouselSlide", "(Ljava/lang/Boolean;)V", "carouselSlide", "i", "getScrollable", "scrollable", "Lcom/appfoundry/previewer/model/Actions;", "k", "Lcom/appfoundry/previewer/model/Actions;", "getActions", "()Lcom/appfoundry/previewer/model/Actions;", "actions", "n", "Ljava/lang/String;", "getAudioUrl", "setAudioUrl", "(Ljava/lang/String;)V", "audioUrl", "d", "getHref", "setHref", "href", "Lcom/appfoundry/previewer/model/Params;", "m", "Lcom/appfoundry/previewer/model/Params;", "getParams", "()Lcom/appfoundry/previewer/model/Params;", "params", "e", "getHrefRemote", "setHrefRemote", "hrefRemote", "b", "getType", "type", "c", "getStyleId", "styleId", "", "j", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "tags", "h", "getStatusBar", "statusBar", "", "l", "getContainers", "containers", "g", "Lcom/appfoundry/previewer/model/Container;", "getBackground", "()Lcom/appfoundry/previewer/model/Container;", "background", "Lcom/appfoundry/previewer/model/Component;", "f", "getComponents", "setComponents", "components", "a", "getId", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/appfoundry/previewer/model/Container;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/appfoundry/previewer/model/Actions;Ljava/util/List;Lcom/appfoundry/previewer/model/Params;Ljava/lang/String;Ljava/lang/Boolean;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class Container {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7096b;
    public final String c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public String f7097e;
    public List<Component> f;

    /* renamed from: g  reason: collision with root package name */
    public final Container f7098g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7099h;

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f7100i;

    /* renamed from: j  reason: collision with root package name */
    public List<String> f7101j;

    /* renamed from: k  reason: collision with root package name */
    public final Actions f7102k;

    /* renamed from: l  reason: collision with root package name */
    public final List<Container> f7103l;

    /* renamed from: m  reason: collision with root package name */
    public final Params f7104m;

    /* renamed from: n  reason: collision with root package name */
    public transient String f7105n;

    /* renamed from: o  reason: collision with root package name */
    public transient Boolean f7106o;

    public Container(String str, String str2, String str3, String str4, String str5, List<Component> list, Container container, String str6, Boolean bool, List<String> list2, Actions actions, List<Container> list3, Params params, String str7, Boolean bool2) {
        this.a = str;
        this.f7096b = str2;
        this.c = str3;
        this.d = str4;
        this.f7097e = str5;
        this.f = list;
        this.f7098g = container;
        this.f7099h = str6;
        this.f7100i = bool;
        this.f7101j = list2;
        this.f7102k = actions;
        this.f7103l = list3;
        this.f7104m = params;
        this.f7105n = str7;
        this.f7106o = bool2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Container(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, com.appfoundry.previewer.model.Container r26, java.lang.String r27, java.lang.Boolean r28, java.util.List r29, com.appfoundry.previewer.model.Actions r30, java.util.List r31, com.appfoundry.previewer.model.Params r32, java.lang.String r33, java.lang.Boolean r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r17 = r2
            goto L_0x000c
        L_0x000a:
            r17 = r33
        L_0x000c:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0013
            r18 = r2
            goto L_0x0015
        L_0x0013:
            r18 = r34
        L_0x0015:
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.model.Container.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.appfoundry.previewer.model.Container, java.lang.String, java.lang.Boolean, java.util.List, com.appfoundry.previewer.model.Actions, java.util.List, com.appfoundry.previewer.model.Params, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Container)) {
            return false;
        }
        Container container = (Container) obj;
        return i.a(this.a, container.a) && i.a(this.f7096b, container.f7096b) && i.a(this.c, container.c) && i.a(this.d, container.d) && i.a(this.f7097e, container.f7097e) && i.a(this.f, container.f) && i.a(this.f7098g, container.f7098g) && i.a(this.f7099h, container.f7099h) && i.a(this.f7100i, container.f7100i) && i.a(this.f7101j, container.f7101j) && i.a(this.f7102k, container.f7102k) && i.a(this.f7103l, container.f7103l) && i.a(this.f7104m, container.f7104m) && i.a(this.f7105n, container.f7105n) && i.a(this.f7106o, container.f7106o);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7096b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7097e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<Component> list = this.f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        Container container = this.f7098g;
        int hashCode7 = (hashCode6 + (container != null ? container.hashCode() : 0)) * 31;
        String str6 = this.f7099h;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.f7100i;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        List<String> list2 = this.f7101j;
        int hashCode10 = (hashCode9 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Actions actions = this.f7102k;
        int hashCode11 = (hashCode10 + (actions != null ? actions.hashCode() : 0)) * 31;
        List<Container> list3 = this.f7103l;
        int hashCode12 = (hashCode11 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Params params = this.f7104m;
        int hashCode13 = (hashCode12 + (params != null ? params.hashCode() : 0)) * 31;
        String str7 = this.f7105n;
        int hashCode14 = (hashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Boolean bool2 = this.f7106o;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode14 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Container(id=");
        y.append(this.a);
        y.append(", type=");
        y.append(this.f7096b);
        y.append(", styleId=");
        y.append(this.c);
        y.append(", href=");
        y.append(this.d);
        y.append(", hrefRemote=");
        y.append(this.f7097e);
        y.append(", components=");
        y.append(this.f);
        y.append(", background=");
        y.append(this.f7098g);
        y.append(", statusBar=");
        y.append(this.f7099h);
        y.append(", scrollable=");
        y.append(this.f7100i);
        y.append(", tags=");
        y.append(this.f7101j);
        y.append(", actions=");
        y.append(this.f7102k);
        y.append(", containers=");
        y.append(this.f7103l);
        y.append(", params=");
        y.append(this.f7104m);
        y.append(", audioUrl=");
        y.append(this.f7105n);
        y.append(", carouselSlide=");
        y.append(this.f7106o);
        y.append(")");
        return y.toString();
    }
}
