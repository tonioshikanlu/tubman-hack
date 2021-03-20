package com.appfoundry.previewer.model;

import androidx.constraintlayout.motion.widget.Key;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR$\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR$\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\fR\u001e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\f¨\u0006#"}, d2 = {"Lcom/appfoundry/previewer/model/StyleJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Style;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "", "Lcom/appfoundry/previewer/model/Coordinate;", "nullableListOfCoordinateAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Dimensions;", "nullableDimensionsAdapter", "stringAdapter", "", "nullableBooleanAdapter", "", "nullableFloatAdapter", "nullableListOfFloatAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableIntAdapter", "Lcom/appfoundry/previewer/model/GradientColorStop;", "nullableListOfGradientColorStopAdapter", "Lcom/appfoundry/previewer/model/Shadow;", "nullableShadowAdapter", "nullableStringAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class StyleJsonAdapter extends l<Style> {
    private volatile Constructor<Style> constructorRef;
    private final l<Boolean> nullableBooleanAdapter;
    private final l<Dimensions> nullableDimensionsAdapter;
    private final l<Float> nullableFloatAdapter;
    private final l<Integer> nullableIntAdapter;
    private final l<List<Coordinate>> nullableListOfCoordinateAdapter;
    private final l<List<Float>> nullableListOfFloatAdapter;
    private final l<List<GradientColorStop>> nullableListOfGradientColorStopAdapter;
    private final l<Shadow> nullableShadowAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;
    private final l<String> stringAdapter;

    public StyleJsonAdapter(x xVar) {
        x xVar2 = xVar;
        Class<Float> cls = Float.class;
        Class<String> cls2 = String.class;
        i.e(xVar2, "moshi");
        q.a a = q.a.a(AnalyticsContext.Device.DEVICE_ID_KEY, "color", "backgroundColor", "textBackgroundColor", "fontId", "fontSize", "lineHeight", "letterSpacing", "width", "height", "margins", "paddings", "positioning", "textAlign", "horizontalPosition", "verticalPosition", "scaleMode", "opacity", "gradientType", "gradientPositions", "gradientColorStops", "overlay", "aspectRatio", "borderWidth", "borderColor", "shadow", "borderRadius", "cornerRadii", "minHeight", "textCase", "textDecoration", Key.ROTATION, "behavior", "italic", "fontWeight", "anchor", "modalHeight", "modalResizable", "popupColor", "popupBlur");
        i.d(a, "JsonReader.Options.of(\"i…popupColor\", \"popupBlur\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar2.d(cls2, qVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        i.d(d, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.stringAdapter = d;
        l<String> d2 = xVar2.d(cls2, qVar, "color");
        i.d(d2, "moshi.adapter(String::cl…     emptySet(), \"color\")");
        this.nullableStringAdapter = d2;
        l<Float> d3 = xVar2.d(cls, qVar, "fontSize");
        i.d(d3, "moshi.adapter(Float::cla…  emptySet(), \"fontSize\")");
        this.nullableFloatAdapter = d3;
        l<Dimensions> d4 = xVar2.d(Dimensions.class, qVar, "margins");
        i.d(d4, "moshi.adapter(Dimensions…a, emptySet(), \"margins\")");
        this.nullableDimensionsAdapter = d4;
        l<Integer> d5 = xVar2.d(Integer.class, qVar, "opacity");
        i.d(d5, "moshi.adapter(Int::class…   emptySet(), \"opacity\")");
        this.nullableIntAdapter = d5;
        l<List<Coordinate>> d6 = xVar2.d(g.V(List.class, Coordinate.class), qVar, "gradientPositions");
        i.d(d6, "moshi.adapter(Types.newP…t(), \"gradientPositions\")");
        this.nullableListOfCoordinateAdapter = d6;
        l<List<GradientColorStop>> d7 = xVar2.d(g.V(List.class, GradientColorStop.class), qVar, "gradientColorStops");
        i.d(d7, "moshi.adapter(Types.newP…(), \"gradientColorStops\")");
        this.nullableListOfGradientColorStopAdapter = d7;
        l<Boolean> d8 = xVar2.d(Boolean.class, qVar, "overlay");
        i.d(d8, "moshi.adapter(Boolean::c…e, emptySet(), \"overlay\")");
        this.nullableBooleanAdapter = d8;
        l<Shadow> d9 = xVar2.d(Shadow.class, qVar, "shadow");
        i.d(d9, "moshi.adapter(Shadow::cl…    emptySet(), \"shadow\")");
        this.nullableShadowAdapter = d9;
        l<List<Float>> d10 = xVar2.d(g.V(List.class, cls), qVar, "cornerRadii");
        i.d(d10, "moshi.adapter(Types.newP…mptySet(), \"cornerRadii\")");
        this.nullableListOfFloatAdapter = d10;
    }

    public Object a(q qVar) {
        String str;
        q qVar2 = qVar;
        Class<Dimensions> cls = Dimensions.class;
        Class<Boolean> cls2 = Boolean.class;
        Class<Integer> cls3 = Integer.class;
        Class<Float> cls4 = Float.class;
        Class<String> cls5 = String.class;
        i.e(qVar2, "reader");
        qVar.e();
        Float f = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Float f5 = null;
        Dimensions dimensions = null;
        Dimensions dimensions2 = null;
        Dimensions dimensions3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Integer num = null;
        String str11 = null;
        List list = null;
        List list2 = null;
        Boolean bool = null;
        Float f6 = null;
        Float f7 = null;
        String str12 = null;
        Shadow shadow = null;
        Float f8 = null;
        List list3 = null;
        Float f9 = null;
        String str13 = null;
        String str14 = null;
        Float f10 = null;
        String str15 = null;
        Boolean bool2 = null;
        Integer num2 = null;
        String str16 = null;
        Integer num3 = null;
        Boolean bool3 = null;
        String str17 = null;
        Boolean bool4 = null;
        while (qVar.N()) {
            Float f11 = f;
            switch (qVar2.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    String a = this.stringAdapter.a(qVar2);
                    if (a != null) {
                        str2 = a;
                        break;
                    } else {
                        n m2 = b.m(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar2);
                        i.d(m2, "Util.unexpectedNull(\"id\", \"id\", reader)");
                        throw m2;
                    }
                case 1:
                    str3 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 2:
                    str4 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 3:
                    str5 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 4:
                    str6 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 5:
                    f2 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 6:
                    f3 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 7:
                    f = this.nullableFloatAdapter.a(qVar2);
                    continue;
                case 8:
                    f4 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 9:
                    f5 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 10:
                    dimensions = this.nullableDimensionsAdapter.a(qVar2);
                    break;
                case 11:
                    dimensions2 = this.nullableDimensionsAdapter.a(qVar2);
                    break;
                case 12:
                    dimensions3 = this.nullableDimensionsAdapter.a(qVar2);
                    break;
                case 13:
                    str7 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 14:
                    str8 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 15:
                    str9 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 16:
                    str10 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 17:
                    num = this.nullableIntAdapter.a(qVar2);
                    break;
                case 18:
                    str11 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 19:
                    list = this.nullableListOfCoordinateAdapter.a(qVar2);
                    break;
                case 20:
                    list2 = this.nullableListOfGradientColorStopAdapter.a(qVar2);
                    break;
                case 21:
                    bool = this.nullableBooleanAdapter.a(qVar2);
                    break;
                case 22:
                    f6 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 23:
                    f7 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 24:
                    str12 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 25:
                    shadow = this.nullableShadowAdapter.a(qVar2);
                    break;
                case 26:
                    f8 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 27:
                    list3 = this.nullableListOfFloatAdapter.a(qVar2);
                    break;
                case 28:
                    f9 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 29:
                    str13 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 30:
                    str14 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 31:
                    f10 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 32:
                    str15 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 33:
                    bool2 = this.nullableBooleanAdapter.a(qVar2);
                    break;
                case 34:
                    num2 = this.nullableIntAdapter.a(qVar2);
                    break;
                case 35:
                    str16 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 36:
                    num3 = this.nullableIntAdapter.a(qVar2);
                    break;
                case 37:
                    bool3 = this.nullableBooleanAdapter.a(qVar2);
                    break;
                case 38:
                    str17 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 39:
                    bool4 = this.nullableBooleanAdapter.a(qVar2);
                    break;
            }
            f = f11;
        }
        Float f12 = f;
        qVar.z();
        Constructor<Style> constructor = this.constructorRef;
        if (constructor != null) {
            str = AnalyticsContext.Device.DEVICE_ID_KEY;
        } else {
            str = AnalyticsContext.Device.DEVICE_ID_KEY;
            Class cls6 = Integer.TYPE;
            constructor = Style.class.getDeclaredConstructor(new Class[]{cls5, cls5, cls5, cls5, cls5, cls4, cls4, cls4, cls4, cls4, cls, cls, cls, cls5, cls5, cls5, cls5, cls3, cls5, List.class, List.class, cls2, cls4, cls4, cls5, Shadow.class, cls4, List.class, cls4, cls5, cls5, cls4, cls5, cls2, cls3, cls5, cls3, cls2, cls5, cls2, cls3, cls3, cls6, cls6, b.c});
            this.constructorRef = constructor;
            i.d(constructor, "Style::class.java.getDec…his.constructorRef = it }");
        }
        Object[] objArr = new Object[45];
        if (str2 != null) {
            objArr[0] = str2;
            objArr[1] = str3;
            objArr[2] = str4;
            objArr[3] = str5;
            objArr[4] = str6;
            objArr[5] = f2;
            objArr[6] = f3;
            objArr[7] = f12;
            objArr[8] = f4;
            objArr[9] = f5;
            objArr[10] = dimensions;
            objArr[11] = dimensions2;
            objArr[12] = dimensions3;
            objArr[13] = str7;
            objArr[14] = str8;
            objArr[15] = str9;
            objArr[16] = str10;
            objArr[17] = num;
            objArr[18] = str11;
            objArr[19] = list;
            objArr[20] = list2;
            objArr[21] = bool;
            objArr[22] = f6;
            objArr[23] = f7;
            objArr[24] = str12;
            objArr[25] = shadow;
            objArr[26] = f8;
            objArr[27] = list3;
            objArr[28] = f9;
            objArr[29] = str13;
            objArr[30] = str14;
            objArr[31] = f10;
            objArr[32] = str15;
            objArr[33] = bool2;
            objArr[34] = num2;
            objArr[35] = str16;
            objArr[36] = num3;
            objArr[37] = bool3;
            objArr[38] = str17;
            objArr[39] = bool4;
            objArr[40] = null;
            objArr[41] = null;
            objArr[42] = -1;
            objArr[43] = -1;
            objArr[44] = null;
            Style newInstance = constructor.newInstance(objArr);
            i.d(newInstance, "localConstructor.newInst…mask1,\n        null\n    )");
            return newInstance;
        }
        String str18 = str;
        n g2 = b.g(str18, str18, qVar);
        i.d(g2, "Util.missingProperty(\"id\", \"id\", reader)");
        throw g2;
    }

    public void e(u uVar, Object obj) {
        Style style = (Style) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(style, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.stringAdapter.e(uVar, style.a);
        uVar.O("color");
        this.nullableStringAdapter.e(uVar, style.f7168b);
        uVar.O("backgroundColor");
        this.nullableStringAdapter.e(uVar, style.c);
        uVar.O("textBackgroundColor");
        this.nullableStringAdapter.e(uVar, style.d);
        uVar.O("fontId");
        this.nullableStringAdapter.e(uVar, style.f7169e);
        uVar.O("fontSize");
        this.nullableFloatAdapter.e(uVar, style.f);
        uVar.O("lineHeight");
        this.nullableFloatAdapter.e(uVar, style.f7170g);
        uVar.O("letterSpacing");
        this.nullableFloatAdapter.e(uVar, style.f7171h);
        uVar.O("width");
        this.nullableFloatAdapter.e(uVar, style.f7172i);
        uVar.O("height");
        this.nullableFloatAdapter.e(uVar, style.f7173j);
        uVar.O("margins");
        this.nullableDimensionsAdapter.e(uVar, style.f7174k);
        uVar.O("paddings");
        this.nullableDimensionsAdapter.e(uVar, style.f7175l);
        uVar.O("positioning");
        this.nullableDimensionsAdapter.e(uVar, style.f7176m);
        uVar.O("textAlign");
        this.nullableStringAdapter.e(uVar, style.f7177n);
        uVar.O("horizontalPosition");
        this.nullableStringAdapter.e(uVar, style.f7178o);
        uVar.O("verticalPosition");
        this.nullableStringAdapter.e(uVar, style.f7179p);
        uVar.O("scaleMode");
        this.nullableStringAdapter.e(uVar, style.f7180q);
        uVar.O("opacity");
        this.nullableIntAdapter.e(uVar, style.r);
        uVar.O("gradientType");
        this.nullableStringAdapter.e(uVar, style.s);
        uVar.O("gradientPositions");
        this.nullableListOfCoordinateAdapter.e(uVar, style.t);
        uVar.O("gradientColorStops");
        this.nullableListOfGradientColorStopAdapter.e(uVar, style.u);
        uVar.O("overlay");
        this.nullableBooleanAdapter.e(uVar, style.v);
        uVar.O("aspectRatio");
        this.nullableFloatAdapter.e(uVar, style.w);
        uVar.O("borderWidth");
        this.nullableFloatAdapter.e(uVar, style.x);
        uVar.O("borderColor");
        this.nullableStringAdapter.e(uVar, style.y);
        uVar.O("shadow");
        this.nullableShadowAdapter.e(uVar, style.z);
        uVar.O("borderRadius");
        this.nullableFloatAdapter.e(uVar, style.A);
        uVar.O("cornerRadii");
        this.nullableListOfFloatAdapter.e(uVar, style.B);
        uVar.O("minHeight");
        this.nullableFloatAdapter.e(uVar, style.C);
        uVar.O("textCase");
        this.nullableStringAdapter.e(uVar, style.D);
        uVar.O("textDecoration");
        this.nullableStringAdapter.e(uVar, style.E);
        uVar.O(Key.ROTATION);
        this.nullableFloatAdapter.e(uVar, style.F);
        uVar.O("behavior");
        this.nullableStringAdapter.e(uVar, style.G);
        uVar.O("italic");
        this.nullableBooleanAdapter.e(uVar, style.H);
        uVar.O("fontWeight");
        this.nullableIntAdapter.e(uVar, style.I);
        uVar.O("anchor");
        this.nullableStringAdapter.e(uVar, style.J);
        uVar.O("modalHeight");
        this.nullableIntAdapter.e(uVar, style.K);
        uVar.O("modalResizable");
        this.nullableBooleanAdapter.e(uVar, style.L);
        uVar.O("popupColor");
        this.nullableStringAdapter.e(uVar, style.M);
        uVar.O("popupBlur");
        this.nullableBooleanAdapter.e(uVar, style.N);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Style)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Style)";
    }
}
