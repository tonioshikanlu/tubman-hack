package com.appfoundry.previewer.model;

import androidx.core.app.NotificationCompat;
import b.l.f.x.a.g;
import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR$\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR$\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\nR$\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/appfoundry/previewer/model/ParamsJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Params;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableStringAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Map;", "nullableMapAdapter", "", "nullableListOfStringAdapter", "Lcom/appfoundry/previewer/model/ChartData;", "nullableListOfChartDataAdapter", "", "nullableBooleanAdapter", "", "nullableFloatAdapter", "Lcom/appfoundry/previewer/model/Marker;", "nullableListOfMarkerAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class ParamsJsonAdapter extends l<Params> {
    private final l<Boolean> nullableBooleanAdapter;
    private final l<Float> nullableFloatAdapter;
    private final l<List<ChartData>> nullableListOfChartDataAdapter;
    private final l<List<Marker>> nullableListOfMarkerAdapter;
    private final l<List<String>> nullableListOfStringAdapter;
    private final l<Map> nullableMapAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public ParamsJsonAdapter(x xVar) {
        x xVar2 = xVar;
        Class<String> cls = String.class;
        i.e(xVar2, "moshi");
        q.a a = q.a.a("url", "title", "datetime", "phone", NotificationCompat.CATEGORY_EMAIL, "place", "lat", "long", "startDate", "endDate", AnalyticsContext.Device.DEVICE_ID_KEY, "provider", "message", "href", "triggerUrl", "confirmPrompt", "infinite", "animation", "automatic", "map", "markers", "zoom", "chartType", "categories", "series", "colors", "hrefRemote");
        i.d(a, "JsonReader.Options.of(\"u…, \"colors\", \"hrefRemote\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar2.d(cls, qVar, "url");
        i.d(d, "moshi.adapter(String::cl…\n      emptySet(), \"url\")");
        this.nullableStringAdapter = d;
        l<Float> d2 = xVar2.d(Float.class, qVar, "lat");
        i.d(d2, "moshi.adapter(Float::cla…\n      emptySet(), \"lat\")");
        this.nullableFloatAdapter = d2;
        l<Boolean> d3 = xVar2.d(Boolean.class, qVar, "infinite");
        i.d(d3, "moshi.adapter(Boolean::c…, emptySet(), \"infinite\")");
        this.nullableBooleanAdapter = d3;
        l<Map> d4 = xVar2.d(Map.class, qVar, "map");
        i.d(d4, "moshi.adapter(Map::class… emptySet(),\n      \"map\")");
        this.nullableMapAdapter = d4;
        l<List<Marker>> d5 = xVar2.d(g.V(List.class, Marker.class), qVar, "markers");
        i.d(d5, "moshi.adapter(Types.newP…tySet(),\n      \"markers\")");
        this.nullableListOfMarkerAdapter = d5;
        l<List<String>> d6 = xVar2.d(g.V(List.class, cls), qVar, "categories");
        i.d(d6, "moshi.adapter(Types.newP…et(),\n      \"categories\")");
        this.nullableListOfStringAdapter = d6;
        l<List<ChartData>> d7 = xVar2.d(g.V(List.class, ChartData.class), qVar, "series");
        i.d(d7, "moshi.adapter(Types.newP…ptySet(),\n      \"series\")");
        this.nullableListOfChartDataAdapter = d7;
    }

    public Object a(q qVar) {
        q qVar2 = qVar;
        i.e(qVar2, "reader");
        qVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Float f = null;
        Float f2 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        Boolean bool = null;
        String str15 = null;
        Boolean bool2 = null;
        Map map = null;
        List list = null;
        Float f3 = null;
        String str16 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str17 = null;
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
                    str6 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 6:
                    f = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 7:
                    f2 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 9:
                    str8 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 10:
                    str9 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 11:
                    str10 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 12:
                    str11 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 13:
                    str12 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 14:
                    str13 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 15:
                    str14 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 16:
                    bool = this.nullableBooleanAdapter.a(qVar2);
                    break;
                case 17:
                    str15 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 18:
                    bool2 = this.nullableBooleanAdapter.a(qVar2);
                    break;
                case 19:
                    map = this.nullableMapAdapter.a(qVar2);
                    break;
                case 20:
                    list = this.nullableListOfMarkerAdapter.a(qVar2);
                    break;
                case 21:
                    f3 = this.nullableFloatAdapter.a(qVar2);
                    break;
                case 22:
                    str16 = this.nullableStringAdapter.a(qVar2);
                    break;
                case 23:
                    list2 = this.nullableListOfStringAdapter.a(qVar2);
                    break;
                case 24:
                    list3 = this.nullableListOfChartDataAdapter.a(qVar2);
                    break;
                case 25:
                    list4 = this.nullableListOfStringAdapter.a(qVar2);
                    break;
                case 26:
                    str17 = this.nullableStringAdapter.a(qVar2);
                    break;
            }
        }
        qVar.z();
        return new Params(str, str2, str3, str4, str5, str6, f, f2, str7, str8, str9, str10, str11, str12, str13, str14, bool, str15, bool2, map, list, f3, str16, list2, list3, list4, str17);
    }

    public void e(u uVar, Object obj) {
        Params params = (Params) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(params, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("url");
        this.nullableStringAdapter.e(uVar, params.a);
        uVar.O("title");
        this.nullableStringAdapter.e(uVar, params.f7139b);
        uVar.O("datetime");
        this.nullableStringAdapter.e(uVar, params.c);
        uVar.O("phone");
        this.nullableStringAdapter.e(uVar, params.d);
        uVar.O(NotificationCompat.CATEGORY_EMAIL);
        this.nullableStringAdapter.e(uVar, params.f7140e);
        uVar.O("place");
        this.nullableStringAdapter.e(uVar, params.f);
        uVar.O("lat");
        this.nullableFloatAdapter.e(uVar, params.f7141g);
        uVar.O("long");
        this.nullableFloatAdapter.e(uVar, params.f7142h);
        uVar.O("startDate");
        this.nullableStringAdapter.e(uVar, params.f7143i);
        uVar.O("endDate");
        this.nullableStringAdapter.e(uVar, params.f7144j);
        uVar.O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.nullableStringAdapter.e(uVar, params.f7145k);
        uVar.O("provider");
        this.nullableStringAdapter.e(uVar, params.f7146l);
        uVar.O("message");
        this.nullableStringAdapter.e(uVar, params.f7147m);
        uVar.O("href");
        this.nullableStringAdapter.e(uVar, params.f7148n);
        uVar.O("triggerUrl");
        this.nullableStringAdapter.e(uVar, params.f7149o);
        uVar.O("confirmPrompt");
        this.nullableStringAdapter.e(uVar, params.f7150p);
        uVar.O("infinite");
        this.nullableBooleanAdapter.e(uVar, params.f7151q);
        uVar.O("animation");
        this.nullableStringAdapter.e(uVar, params.r);
        uVar.O("automatic");
        this.nullableBooleanAdapter.e(uVar, params.s);
        uVar.O("map");
        this.nullableMapAdapter.e(uVar, params.t);
        uVar.O("markers");
        this.nullableListOfMarkerAdapter.e(uVar, params.u);
        uVar.O("zoom");
        this.nullableFloatAdapter.e(uVar, params.v);
        uVar.O("chartType");
        this.nullableStringAdapter.e(uVar, params.w);
        uVar.O("categories");
        this.nullableListOfStringAdapter.e(uVar, params.x);
        uVar.O("series");
        this.nullableListOfChartDataAdapter.e(uVar, params.y);
        uVar.O("colors");
        this.nullableListOfStringAdapter.e(uVar, params.z);
        uVar.O("hrefRemote");
        this.nullableStringAdapter.e(uVar, params.A);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Params)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Params)";
    }
}
