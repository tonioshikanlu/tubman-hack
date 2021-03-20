package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@m(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b@\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0004R\u001b\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010\u0004R\u001b\u0010*\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u0004R\u001b\u00100\u001a\u0004\u0018\u00010+8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R$\u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010\r\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u001fR\u001b\u00107\u001a\u0004\u0018\u00010+8\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R\u001b\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010\u0004R\u001b\u0010=\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010\u0013\u001a\u0004\b<\u0010\u0015R\u001b\u0010C\u001a\u0004\u0018\u00010>8\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010F\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010\"\u001a\u0004\bE\u0010\u0004R\u001b\u0010I\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010\"\u001a\u0004\bH\u0010\u0004R*\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010J8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010V\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u0010\u0013\u001a\u0004\bS\u0010\u0015\"\u0004\bT\u0010UR\u001b\u0010Y\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bW\u0010\u0013\u001a\u0004\bX\u0010\u0015R\u001b\u0010\\\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bZ\u0010\"\u001a\u0004\b[\u0010\u0004R\u001b\u0010_\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b]\u0010\r\u001a\u0004\b^\u0010\u000fR!\u0010c\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010J8\u0006@\u0006¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010NR\u001b\u0010f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bd\u0010\"\u001a\u0004\be\u0010\u0004R!\u0010j\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010J8\u0006@\u0006¢\u0006\f\n\u0004\bh\u0010L\u001a\u0004\bi\u0010NR\u001b\u0010m\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bk\u0010\"\u001a\u0004\bl\u0010\u0004R\u001b\u0010p\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bn\u0010\u0018\u001a\u0004\bo\u0010\u001aR\u001b\u0010s\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bq\u0010\u0018\u001a\u0004\br\u0010\u001aR\u001b\u0010v\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bt\u0010\"\u001a\u0004\bu\u0010\u0004R\u001b\u0010y\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\bw\u0010\u0013\u001a\u0004\bx\u0010\u0015R$\u0010~\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bz\u0010\"\u001a\u0004\b{\u0010\u0004\"\u0004\b|\u0010}R\u001d\u0010\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\r\n\u0004\b\u0010\u0013\u001a\u0005\b\u0001\u0010\u0015R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\r\u001a\u0005\b\u0001\u0010\u000fR\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\u0013\u001a\u0005\b\u0001\u0010\u0015R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\u0013\u001a\u0005\b\u0001\u0010\u0015R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\"\u001a\u0005\b\u0001\u0010\u0004R\u001e\u0010\u0001\u001a\u0004\u0018\u00010+8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010-\u001a\u0005\b\u0001\u0010/R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\u0018\u001a\u0005\b\u0001\u0010\u001aR\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\"\u001a\u0005\b\u0001\u0010\u0004R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\"\u001a\u0005\b\u0001\u0010\u0004R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\u0013\u001a\u0005\b\u0001\u0010\u0015R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010\"\u001a\u0005\b\u0001\u0010\u0004R(\u0010£\u0001\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010\u0013\u001a\u0005\b¡\u0001\u0010\u0015\"\u0005\b¢\u0001\u0010UR\u001e\u0010¦\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010\"\u001a\u0005\b¥\u0001\u0010\u0004¨\u0006§\u0001"}, d2 = {"Lcom/appfoundry/previewer/model/Style;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "Ljava/lang/Integer;", "getFontWeight", "()Ljava/lang/Integer;", "fontWeight", "", "h", "Ljava/lang/Float;", "getLetterSpacing", "()Ljava/lang/Float;", "letterSpacing", "N", "Ljava/lang/Boolean;", "getPopupBlur", "()Ljava/lang/Boolean;", "popupBlur", "O", "getComponentWidth", "setComponentWidth", "(Ljava/lang/Integer;)V", "componentWidth", "d", "Ljava/lang/String;", "getTextBackgroundColor", "textBackgroundColor", "D", "getTextCase", "textCase", "G", "getBehavior", "behavior", "Lcom/appfoundry/previewer/model/Dimensions;", "k", "Lcom/appfoundry/previewer/model/Dimensions;", "getMargins", "()Lcom/appfoundry/previewer/model/Dimensions;", "margins", "P", "getComponentHeight", "setComponentHeight", "componentHeight", "l", "getPaddings", "paddings", "s", "getGradientType", "gradientType", "F", "getRotation", "rotation", "Lcom/appfoundry/previewer/model/Shadow;", "z", "Lcom/appfoundry/previewer/model/Shadow;", "getShadow", "()Lcom/appfoundry/previewer/model/Shadow;", "shadow", "a", "getId", "id", "c", "getBackgroundColor", "backgroundColor", "", "B", "Ljava/util/List;", "getCornerRadii", "()Ljava/util/List;", "setCornerRadii", "(Ljava/util/List;)V", "cornerRadii", "i", "getWidth", "setWidth", "(Ljava/lang/Float;)V", "width", "x", "getBorderWidth", "borderWidth", "J", "getAnchor", "anchor", "K", "getModalHeight", "modalHeight", "Lcom/appfoundry/previewer/model/Coordinate;", "t", "getGradientPositions", "gradientPositions", "y", "getBorderColor", "borderColor", "Lcom/appfoundry/previewer/model/GradientColorStop;", "u", "getGradientColorStops", "gradientColorStops", "M", "getPopupColor", "popupColor", "v", "getOverlay", "overlay", "H", "getItalic", "italic", "b", "getColor", "color", "g", "getLineHeight", "lineHeight", "q", "getScaleMode", "setScaleMode", "(Ljava/lang/String;)V", "scaleMode", "j", "getHeight", "height", "r", "getOpacity", "opacity", "C", "getMinHeight", "minHeight", "f", "getFontSize", "fontSize", "o", "getHorizontalPosition", "horizontalPosition", "m", "getPositioning", "positioning", "L", "getModalResizable", "modalResizable", "p", "getVerticalPosition", "verticalPosition", "e", "getFontId", "fontId", "A", "getBorderRadius", "borderRadius", "n", "getTextAlign", "textAlign", "w", "getAspectRatio", "setAspectRatio", "aspectRatio", "E", "getTextDecoration", "textDecoration", "app_release"}, k = 1, mv = {1, 1, 15})
public final class Style {
    public final Float A;
    public List<Float> B;
    public final Float C;
    public final String D;
    public final String E;
    public final Float F;
    public final String G;
    public final Boolean H;
    public final Integer I;
    public final String J;
    public final Integer K;
    public final Boolean L;
    public final String M;
    public final Boolean N;
    public transient Integer O;
    public transient Integer P;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7168b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7169e;
    public final Float f;

    /* renamed from: g  reason: collision with root package name */
    public final Float f7170g;

    /* renamed from: h  reason: collision with root package name */
    public final Float f7171h;

    /* renamed from: i  reason: collision with root package name */
    public Float f7172i;

    /* renamed from: j  reason: collision with root package name */
    public final Float f7173j;

    /* renamed from: k  reason: collision with root package name */
    public final Dimensions f7174k;

    /* renamed from: l  reason: collision with root package name */
    public final Dimensions f7175l;

    /* renamed from: m  reason: collision with root package name */
    public final Dimensions f7176m;

    /* renamed from: n  reason: collision with root package name */
    public final String f7177n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7178o;

    /* renamed from: p  reason: collision with root package name */
    public final String f7179p;

    /* renamed from: q  reason: collision with root package name */
    public String f7180q;
    public final Integer r;
    public final String s;
    public final List<Coordinate> t;
    public final List<GradientColorStop> u;
    public final Boolean v;
    public Float w;
    public final Float x;
    public final String y;
    public final Shadow z;

    public Style(String str, String str2, String str3, String str4, String str5, Float f2, Float f3, Float f4, Float f5, Float f6, Dimensions dimensions, Dimensions dimensions2, Dimensions dimensions3, String str6, String str7, String str8, String str9, Integer num, String str10, List list, List list2, Boolean bool, Float f7, Float f8, String str11, Shadow shadow, Float f9, List list3, Float f10, String str12, String str13, Float f11, String str14, Boolean bool2, Integer num2, String str15, Integer num3, Boolean bool3, String str16, Boolean bool4, Integer num4, Integer num5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str17 = str;
        int i4 = i3;
        int i5 = 0;
        Integer num6 = (i4 & 256) != 0 ? 0 : num4;
        i5 = (i4 & 512) == 0 ? num5 : i5;
        i.e(str, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.a = str17;
        this.f7168b = str2;
        this.c = str3;
        this.d = str4;
        this.f7169e = str5;
        this.f = f2;
        this.f7170g = f3;
        this.f7171h = f4;
        this.f7172i = f5;
        this.f7173j = f6;
        this.f7174k = dimensions;
        this.f7175l = dimensions2;
        this.f7176m = dimensions3;
        this.f7177n = str6;
        this.f7178o = str7;
        this.f7179p = str8;
        this.f7180q = str9;
        this.r = num;
        this.s = str10;
        this.t = list;
        this.u = list2;
        this.v = bool;
        this.w = f7;
        this.x = f8;
        this.y = str11;
        this.z = shadow;
        this.A = f9;
        this.B = list3;
        this.C = f10;
        this.D = str12;
        this.E = str13;
        this.F = f11;
        this.G = str14;
        this.H = bool2;
        this.I = num2;
        this.J = str15;
        this.K = num3;
        this.L = bool3;
        this.M = str16;
        this.N = bool4;
        this.O = num6;
        this.P = i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Style)) {
            return false;
        }
        Style style = (Style) obj;
        return i.a(this.a, style.a) && i.a(this.f7168b, style.f7168b) && i.a(this.c, style.c) && i.a(this.d, style.d) && i.a(this.f7169e, style.f7169e) && i.a(this.f, style.f) && i.a(this.f7170g, style.f7170g) && i.a(this.f7171h, style.f7171h) && i.a(this.f7172i, style.f7172i) && i.a(this.f7173j, style.f7173j) && i.a(this.f7174k, style.f7174k) && i.a(this.f7175l, style.f7175l) && i.a(this.f7176m, style.f7176m) && i.a(this.f7177n, style.f7177n) && i.a(this.f7178o, style.f7178o) && i.a(this.f7179p, style.f7179p) && i.a(this.f7180q, style.f7180q) && i.a(this.r, style.r) && i.a(this.s, style.s) && i.a(this.t, style.t) && i.a(this.u, style.u) && i.a(this.v, style.v) && i.a(this.w, style.w) && i.a(this.x, style.x) && i.a(this.y, style.y) && i.a(this.z, style.z) && i.a(this.A, style.A) && i.a(this.B, style.B) && i.a(this.C, style.C) && i.a(this.D, style.D) && i.a(this.E, style.E) && i.a(this.F, style.F) && i.a(this.G, style.G) && i.a(this.H, style.H) && i.a(this.I, style.I) && i.a(this.J, style.J) && i.a(this.K, style.K) && i.a(this.L, style.L) && i.a(this.M, style.M) && i.a(this.N, style.N) && i.a(this.O, style.O) && i.a(this.P, style.P);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7168b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f7169e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Float f2 = this.f;
        int hashCode6 = (hashCode5 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f7170g;
        int hashCode7 = (hashCode6 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Float f4 = this.f7171h;
        int hashCode8 = (hashCode7 + (f4 != null ? f4.hashCode() : 0)) * 31;
        Float f5 = this.f7172i;
        int hashCode9 = (hashCode8 + (f5 != null ? f5.hashCode() : 0)) * 31;
        Float f6 = this.f7173j;
        int hashCode10 = (hashCode9 + (f6 != null ? f6.hashCode() : 0)) * 31;
        Dimensions dimensions = this.f7174k;
        int hashCode11 = (hashCode10 + (dimensions != null ? dimensions.hashCode() : 0)) * 31;
        Dimensions dimensions2 = this.f7175l;
        int hashCode12 = (hashCode11 + (dimensions2 != null ? dimensions2.hashCode() : 0)) * 31;
        Dimensions dimensions3 = this.f7176m;
        int hashCode13 = (hashCode12 + (dimensions3 != null ? dimensions3.hashCode() : 0)) * 31;
        String str6 = this.f7177n;
        int hashCode14 = (hashCode13 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f7178o;
        int hashCode15 = (hashCode14 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f7179p;
        int hashCode16 = (hashCode15 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f7180q;
        int hashCode17 = (hashCode16 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.r;
        int hashCode18 = (hashCode17 + (num != null ? num.hashCode() : 0)) * 31;
        String str10 = this.s;
        int hashCode19 = (hashCode18 + (str10 != null ? str10.hashCode() : 0)) * 31;
        List<Coordinate> list = this.t;
        int hashCode20 = (hashCode19 + (list != null ? list.hashCode() : 0)) * 31;
        List<GradientColorStop> list2 = this.u;
        int hashCode21 = (hashCode20 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Boolean bool = this.v;
        int hashCode22 = (hashCode21 + (bool != null ? bool.hashCode() : 0)) * 31;
        Float f7 = this.w;
        int hashCode23 = (hashCode22 + (f7 != null ? f7.hashCode() : 0)) * 31;
        Float f8 = this.x;
        int hashCode24 = (hashCode23 + (f8 != null ? f8.hashCode() : 0)) * 31;
        String str11 = this.y;
        int hashCode25 = (hashCode24 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Shadow shadow = this.z;
        int hashCode26 = (hashCode25 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        Float f9 = this.A;
        int hashCode27 = (hashCode26 + (f9 != null ? f9.hashCode() : 0)) * 31;
        List<Float> list3 = this.B;
        int hashCode28 = (hashCode27 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Float f10 = this.C;
        int hashCode29 = (hashCode28 + (f10 != null ? f10.hashCode() : 0)) * 31;
        String str12 = this.D;
        int hashCode30 = (hashCode29 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.E;
        int hashCode31 = (hashCode30 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Float f11 = this.F;
        int hashCode32 = (hashCode31 + (f11 != null ? f11.hashCode() : 0)) * 31;
        String str14 = this.G;
        int hashCode33 = (hashCode32 + (str14 != null ? str14.hashCode() : 0)) * 31;
        Boolean bool2 = this.H;
        int hashCode34 = (hashCode33 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num2 = this.I;
        int hashCode35 = (hashCode34 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str15 = this.J;
        int hashCode36 = (hashCode35 + (str15 != null ? str15.hashCode() : 0)) * 31;
        Integer num3 = this.K;
        int hashCode37 = (hashCode36 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool3 = this.L;
        int hashCode38 = (hashCode37 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str16 = this.M;
        int hashCode39 = (hashCode38 + (str16 != null ? str16.hashCode() : 0)) * 31;
        Boolean bool4 = this.N;
        int hashCode40 = (hashCode39 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Integer num4 = this.O;
        int hashCode41 = (hashCode40 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.P;
        if (num5 != null) {
            i2 = num5.hashCode();
        }
        return hashCode41 + i2;
    }

    public String toString() {
        StringBuilder y2 = a.y("Style(id=");
        y2.append(this.a);
        y2.append(", color=");
        y2.append(this.f7168b);
        y2.append(", backgroundColor=");
        y2.append(this.c);
        y2.append(", textBackgroundColor=");
        y2.append(this.d);
        y2.append(", fontId=");
        y2.append(this.f7169e);
        y2.append(", fontSize=");
        y2.append(this.f);
        y2.append(", lineHeight=");
        y2.append(this.f7170g);
        y2.append(", letterSpacing=");
        y2.append(this.f7171h);
        y2.append(", width=");
        y2.append(this.f7172i);
        y2.append(", height=");
        y2.append(this.f7173j);
        y2.append(", margins=");
        y2.append(this.f7174k);
        y2.append(", paddings=");
        y2.append(this.f7175l);
        y2.append(", positioning=");
        y2.append(this.f7176m);
        y2.append(", textAlign=");
        y2.append(this.f7177n);
        y2.append(", horizontalPosition=");
        y2.append(this.f7178o);
        y2.append(", verticalPosition=");
        y2.append(this.f7179p);
        y2.append(", scaleMode=");
        y2.append(this.f7180q);
        y2.append(", opacity=");
        y2.append(this.r);
        y2.append(", gradientType=");
        y2.append(this.s);
        y2.append(", gradientPositions=");
        y2.append(this.t);
        y2.append(", gradientColorStops=");
        y2.append(this.u);
        y2.append(", overlay=");
        y2.append(this.v);
        y2.append(", aspectRatio=");
        y2.append(this.w);
        y2.append(", borderWidth=");
        y2.append(this.x);
        y2.append(", borderColor=");
        y2.append(this.y);
        y2.append(", shadow=");
        y2.append(this.z);
        y2.append(", borderRadius=");
        y2.append(this.A);
        y2.append(", cornerRadii=");
        y2.append(this.B);
        y2.append(", minHeight=");
        y2.append(this.C);
        y2.append(", textCase=");
        y2.append(this.D);
        y2.append(", textDecoration=");
        y2.append(this.E);
        y2.append(", rotation=");
        y2.append(this.F);
        y2.append(", behavior=");
        y2.append(this.G);
        y2.append(", italic=");
        y2.append(this.H);
        y2.append(", fontWeight=");
        y2.append(this.I);
        y2.append(", anchor=");
        y2.append(this.J);
        y2.append(", modalHeight=");
        y2.append(this.K);
        y2.append(", modalResizable=");
        y2.append(this.L);
        y2.append(", popupColor=");
        y2.append(this.M);
        y2.append(", popupBlur=");
        y2.append(this.N);
        y2.append(", componentWidth=");
        y2.append(this.O);
        y2.append(", componentHeight=");
        y2.append(this.P);
        y2.append(")");
        return y2.toString();
    }
}
