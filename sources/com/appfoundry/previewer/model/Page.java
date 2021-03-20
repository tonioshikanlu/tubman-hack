package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@m(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b(\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0010R!\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u0004R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u0010R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\u0010R\u001b\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u0004R\u001b\u0010+\u001a\u0004\u0018\u00010&8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u0004\"\u0004\b.\u0010\u0010R\u001b\u00105\u001a\u0004\u0018\u0001008\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\r\u001a\u0004\b7\u0010\u0004R*\u0010=\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0014\u001a\u0004\b:\u0010\u0016\"\u0004\b;\u0010<R\u001b\u0010@\u001a\u0004\u0018\u0001008\u0006@\u0006¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u00104R\u001b\u0010F\u001a\u0004\u0018\u00010A8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010I\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010\r\u001a\u0004\bH\u0010\u0004R\"\u0010P\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001b\u0010U\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR*\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010V8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0014\u001a\u0004\bX\u0010\u0016\"\u0004\bY\u0010<R\"\u0010^\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010M\"\u0004\b]\u0010OR\"\u0010b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b_\u0010K\u001a\u0004\b`\u0010M\"\u0004\ba\u0010OR*\u0010f\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010V8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0014\u001a\u0004\bd\u0010\u0016\"\u0004\be\u0010<R*\u0010j\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bg\u0010\u0014\u001a\u0004\bh\u0010\u0016\"\u0004\bi\u0010<R$\u0010o\u001a\u0004\u0018\u0001008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bk\u00102\u001a\u0004\bl\u00104\"\u0004\bm\u0010nR\"\u0010s\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bp\u0010\r\u001a\u0004\bq\u0010\u0004\"\u0004\br\u0010\u0010R\u001b\u0010v\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bt\u0010\r\u001a\u0004\bu\u0010\u0004R$\u0010z\u001a\u0004\u0018\u0001008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bw\u00102\u001a\u0004\bx\u00104\"\u0004\by\u0010nR\u001b\u0010}\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b{\u0010\r\u001a\u0004\b|\u0010\u0004¨\u0006~"}, d2 = {"Lcom/appfoundry/previewer/model/Page;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "l", "Ljava/lang/String;", "getNextLink", "setNextLink", "(Ljava/lang/String;)V", "nextLink", "", "o", "Ljava/util/List;", "getSwipeHref", "()Ljava/util/List;", "swipeHref", "r", "getStyleId", "styleId", "k", "getRemote", "setRemote", "remote", "q", "getRemoteForm", "setRemoteForm", "remoteForm", "t", "getStateSetId", "stateSetId", "Lcom/appfoundry/previewer/model/Animation;", "u", "Lcom/appfoundry/previewer/model/Animation;", "getAnimation", "()Lcom/appfoundry/previewer/model/Animation;", "animation", "y", "getOriginalId", "setOriginalId", "originalId", "Lcom/appfoundry/previewer/model/Container;", "h", "Lcom/appfoundry/previewer/model/Container;", "getFooter", "()Lcom/appfoundry/previewer/model/Container;", "footer", "c", "getType", "type", "g", "getLayers", "setLayers", "(Ljava/util/List;)V", "layers", "e", "getHeader", "header", "Lcom/appfoundry/previewer/model/States;", "p", "Lcom/appfoundry/previewer/model/States;", "getStates", "()Lcom/appfoundry/previewer/model/States;", "states", "s", "getState", "state", "z", "Z", "getPopupContainersWidthCalculated", "()Z", "setPopupContainersWidthCalculated", "(Z)V", "popupContainersWidthCalculated", "j", "Ljava/lang/Boolean;", "getStart", "()Ljava/lang/Boolean;", "start", "", "m", "getTags", "setTags", "tags", "v", "getBound", "setBound", "bound", "x", "getInPreviewer", "setInPreviewer", "inPreviewer", "w", "getNextPageBody", "setNextPageBody", "nextPageBody", "f", "getBody", "setBody", "body", "d", "getTopBar", "setTopBar", "(Lcom/appfoundry/previewer/model/Container;)V", "topBar", "a", "getId", "setId", "id", "b", "getName", "name", "i", "getBackground", "setBackground", "background", "n", "getIntro", "intro", "app_release"}, k = 1, mv = {1, 1, 15})
public final class Page {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7126b;
    public final String c;
    public Container d;

    /* renamed from: e  reason: collision with root package name */
    public final Container f7127e;
    public List<Container> f;

    /* renamed from: g  reason: collision with root package name */
    public List<Container> f7128g;

    /* renamed from: h  reason: collision with root package name */
    public final Container f7129h;

    /* renamed from: i  reason: collision with root package name */
    public Container f7130i;

    /* renamed from: j  reason: collision with root package name */
    public final Boolean f7131j;

    /* renamed from: k  reason: collision with root package name */
    public String f7132k;

    /* renamed from: l  reason: collision with root package name */
    public String f7133l;

    /* renamed from: m  reason: collision with root package name */
    public List<String> f7134m;

    /* renamed from: n  reason: collision with root package name */
    public final String f7135n;

    /* renamed from: o  reason: collision with root package name */
    public final List<String> f7136o;

    /* renamed from: p  reason: collision with root package name */
    public final States f7137p;

    /* renamed from: q  reason: collision with root package name */
    public String f7138q;
    public final String r;
    public final String s;
    public final String t;
    public final Animation u;
    public transient boolean v;
    public transient List<Container> w;
    public transient boolean x;
    public transient String y;
    public transient boolean z;

    public Page(String str, String str2, String str3, Container container, Container container2, List list, List list2, Container container3, Container container4, Boolean bool, String str4, String str5, List list3, String str6, List list4, States states, String str7, String str8, String str9, String str10, Animation animation, boolean z2, List list5, boolean z3, String str11, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str12 = str;
        boolean z5 = false;
        boolean z6 = (i2 & 2097152) != 0 ? false : z2;
        String str13 = null;
        List list6 = (i2 & 4194304) != 0 ? null : list5;
        boolean z7 = (i2 & 8388608) != 0 ? false : z3;
        str13 = (i2 & 16777216) == 0 ? str11 : str13;
        z5 = (i2 & 33554432) == 0 ? z4 : z5;
        i.e(str, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.a = str12;
        this.f7126b = str2;
        this.c = str3;
        this.d = container;
        this.f7127e = container2;
        this.f = list;
        this.f7128g = list2;
        this.f7129h = container3;
        this.f7130i = container4;
        this.f7131j = bool;
        this.f7132k = str4;
        this.f7133l = str5;
        this.f7134m = list3;
        this.f7135n = str6;
        this.f7136o = list4;
        this.f7137p = states;
        this.f7138q = str7;
        this.r = str8;
        this.s = str9;
        this.t = str10;
        this.u = animation;
        this.v = z6;
        this.w = list6;
        this.x = z7;
        this.y = str13;
        this.z = z5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Page)) {
            return false;
        }
        Page page = (Page) obj;
        return i.a(this.a, page.a) && i.a(this.f7126b, page.f7126b) && i.a(this.c, page.c) && i.a(this.d, page.d) && i.a(this.f7127e, page.f7127e) && i.a(this.f, page.f) && i.a(this.f7128g, page.f7128g) && i.a(this.f7129h, page.f7129h) && i.a(this.f7130i, page.f7130i) && i.a(this.f7131j, page.f7131j) && i.a(this.f7132k, page.f7132k) && i.a(this.f7133l, page.f7133l) && i.a(this.f7134m, page.f7134m) && i.a(this.f7135n, page.f7135n) && i.a(this.f7136o, page.f7136o) && i.a(this.f7137p, page.f7137p) && i.a(this.f7138q, page.f7138q) && i.a(this.r, page.r) && i.a(this.s, page.s) && i.a(this.t, page.t) && i.a(this.u, page.u) && this.v == page.v && i.a(this.w, page.w) && this.x == page.x && i.a(this.y, page.y) && this.z == page.z;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7126b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Container container = this.d;
        int hashCode4 = (hashCode3 + (container != null ? container.hashCode() : 0)) * 31;
        Container container2 = this.f7127e;
        int hashCode5 = (hashCode4 + (container2 != null ? container2.hashCode() : 0)) * 31;
        List<Container> list = this.f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<Container> list2 = this.f7128g;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Container container3 = this.f7129h;
        int hashCode8 = (hashCode7 + (container3 != null ? container3.hashCode() : 0)) * 31;
        Container container4 = this.f7130i;
        int hashCode9 = (hashCode8 + (container4 != null ? container4.hashCode() : 0)) * 31;
        Boolean bool = this.f7131j;
        int hashCode10 = (hashCode9 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f7132k;
        int hashCode11 = (hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7133l;
        int hashCode12 = (hashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list3 = this.f7134m;
        int hashCode13 = (hashCode12 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str6 = this.f7135n;
        int hashCode14 = (hashCode13 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list4 = this.f7136o;
        int hashCode15 = (hashCode14 + (list4 != null ? list4.hashCode() : 0)) * 31;
        States states = this.f7137p;
        int hashCode16 = (hashCode15 + (states != null ? states.hashCode() : 0)) * 31;
        String str7 = this.f7138q;
        int hashCode17 = (hashCode16 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.r;
        int hashCode18 = (hashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.s;
        int hashCode19 = (hashCode18 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.t;
        int hashCode20 = (hashCode19 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Animation animation = this.u;
        int hashCode21 = (hashCode20 + (animation != null ? animation.hashCode() : 0)) * 31;
        boolean z2 = this.v;
        boolean z3 = true;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode21 + (z2 ? 1 : 0)) * 31;
        List<Container> list5 = this.w;
        int hashCode22 = (i3 + (list5 != null ? list5.hashCode() : 0)) * 31;
        boolean z4 = this.x;
        if (z4) {
            z4 = true;
        }
        int i4 = (hashCode22 + (z4 ? 1 : 0)) * 31;
        String str11 = this.y;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        boolean z5 = this.z;
        if (!z5) {
            z3 = z5;
        }
        return i5 + (z3 ? 1 : 0);
    }

    public String toString() {
        StringBuilder y2 = a.y("Page(id=");
        y2.append(this.a);
        y2.append(", name=");
        y2.append(this.f7126b);
        y2.append(", type=");
        y2.append(this.c);
        y2.append(", topBar=");
        y2.append(this.d);
        y2.append(", header=");
        y2.append(this.f7127e);
        y2.append(", body=");
        y2.append(this.f);
        y2.append(", layers=");
        y2.append(this.f7128g);
        y2.append(", footer=");
        y2.append(this.f7129h);
        y2.append(", background=");
        y2.append(this.f7130i);
        y2.append(", start=");
        y2.append(this.f7131j);
        y2.append(", remote=");
        y2.append(this.f7132k);
        y2.append(", nextLink=");
        y2.append(this.f7133l);
        y2.append(", tags=");
        y2.append(this.f7134m);
        y2.append(", intro=");
        y2.append(this.f7135n);
        y2.append(", swipeHref=");
        y2.append(this.f7136o);
        y2.append(", states=");
        y2.append(this.f7137p);
        y2.append(", remoteForm=");
        y2.append(this.f7138q);
        y2.append(", styleId=");
        y2.append(this.r);
        y2.append(", state=");
        y2.append(this.s);
        y2.append(", stateSetId=");
        y2.append(this.t);
        y2.append(", animation=");
        y2.append(this.u);
        y2.append(", bound=");
        y2.append(this.v);
        y2.append(", nextPageBody=");
        y2.append(this.w);
        y2.append(", inPreviewer=");
        y2.append(this.x);
        y2.append(", originalId=");
        y2.append(this.y);
        y2.append(", popupContainersWidthCalculated=");
        return a.s(y2, this.z, ")");
    }
}
