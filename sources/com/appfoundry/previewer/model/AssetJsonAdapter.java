package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.n;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import b.p.a.z.b;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/appfoundry/previewer/model/AssetJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/Asset;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "", "nullableBooleanAdapter", "Lb/p/a/l;", "stringAdapter", "Lcom/appfoundry/previewer/model/Resolution;", "nullableResolutionAdapter", "nullableStringAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class AssetJsonAdapter extends l<Asset> {
    private final l<Boolean> nullableBooleanAdapter;
    private final l<Resolution> nullableResolutionAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;
    private final l<String> stringAdapter;

    public AssetJsonAdapter(x xVar) {
        Class<String> cls = String.class;
        i.e(xVar, "moshi");
        q.a a = q.a.a(AnalyticsContext.Device.DEVICE_ID_KEY, "url", "thumbUrl", "preload", "type", "originalSize");
        i.d(a, "JsonReader.Options.of(\"i…, \"type\", \"originalSize\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(cls, qVar, AnalyticsContext.Device.DEVICE_ID_KEY);
        i.d(d, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.stringAdapter = d;
        l<String> d2 = xVar.d(cls, qVar, "url");
        i.d(d2, "moshi.adapter(String::cl…\n      emptySet(), \"url\")");
        this.nullableStringAdapter = d2;
        l<Boolean> d3 = xVar.d(Boolean.class, qVar, "preload");
        i.d(d3, "moshi.adapter(Boolean::c…e, emptySet(), \"preload\")");
        this.nullableBooleanAdapter = d3;
        l<Resolution> d4 = xVar.d(Resolution.class, qVar, "originalSize");
        i.d(d4, "moshi.adapter(Resolution…ptySet(), \"originalSize\")");
        this.nullableResolutionAdapter = d4;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        Resolution resolution = null;
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
                    str3 = this.nullableStringAdapter.a(qVar);
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.a(qVar);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.a(qVar);
                    break;
                case 5:
                    resolution = this.nullableResolutionAdapter.a(qVar);
                    break;
            }
        }
        qVar.z();
        if (str != null) {
            return new Asset(str, str2, str3, bool, str4, resolution);
        }
        n g2 = b.g(AnalyticsContext.Device.DEVICE_ID_KEY, AnalyticsContext.Device.DEVICE_ID_KEY, qVar);
        i.d(g2, "Util.missingProperty(\"id\", \"id\", reader)");
        throw g2;
    }

    public void e(u uVar, Object obj) {
        Asset asset = (Asset) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(asset, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O(AnalyticsContext.Device.DEVICE_ID_KEY);
        this.stringAdapter.e(uVar, asset.a);
        uVar.O("url");
        this.nullableStringAdapter.e(uVar, asset.f7065b);
        uVar.O("thumbUrl");
        this.nullableStringAdapter.e(uVar, asset.c);
        uVar.O("preload");
        this.nullableBooleanAdapter.e(uVar, asset.d);
        uVar.O("type");
        this.nullableStringAdapter.e(uVar, asset.f7066e);
        uVar.O("originalSize");
        this.nullableResolutionAdapter.e(uVar, asset.f);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(Asset)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(Asset)";
    }
}
