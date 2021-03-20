package com.appfoundry.previewer.model;

import b.l.f.x.a.g;
import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import com.amplitude.api.DatabaseHelper;
import e.x.c.i;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR$\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/appfoundry/previewer/model/AppJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/App;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/Store;", "nullableStoreAdapter", "Lb/p/a/l;", "", "Lcom/appfoundry/previewer/model/Style;", "nullableListOfStyleAdapter", "Lcom/appfoundry/previewer/model/Paywall;", "nullablePaywallAdapter", "Lcom/appfoundry/previewer/model/Asset;", "nullableListOfAssetAdapter", "Lcom/appfoundry/previewer/model/Data;", "nullableDataAdapter", "Lcom/appfoundry/previewer/model/Integration;", "nullableIntegrationAdapter", "Lcom/appfoundry/previewer/model/Features;", "nullableFeaturesAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class AppJsonAdapter extends l<App> {
    private final l<Data> nullableDataAdapter;
    private final l<Features> nullableFeaturesAdapter;
    private final l<Integration> nullableIntegrationAdapter;
    private final l<List<Asset>> nullableListOfAssetAdapter;
    private final l<List<Style>> nullableListOfStyleAdapter;
    private final l<Paywall> nullablePaywallAdapter;
    private final l<Store> nullableStoreAdapter;
    private final q.a options;

    public AppJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("fonts", "assets", DatabaseHelper.STORE_TABLE_NAME, "integration", "data", "styles", "features", "paywall");
        i.d(a, "JsonReader.Options.of(\"f…\", \"features\", \"paywall\")");
        this.options = a;
        ParameterizedType V = g.V(List.class, Asset.class);
        e.t.q qVar = e.t.q.f7936h;
        l<List<Asset>> d = xVar.d(V, qVar, "fonts");
        i.d(d, "moshi.adapter(Types.newP…mptySet(),\n      \"fonts\")");
        this.nullableListOfAssetAdapter = d;
        l<Store> d2 = xVar.d(Store.class, qVar, DatabaseHelper.STORE_TABLE_NAME);
        i.d(d2, "moshi.adapter(Store::cla…     emptySet(), \"store\")");
        this.nullableStoreAdapter = d2;
        l<Integration> d3 = xVar.d(Integration.class, qVar, "integration");
        i.d(d3, "moshi.adapter(Integratio…mptySet(), \"integration\")");
        this.nullableIntegrationAdapter = d3;
        l<Data> d4 = xVar.d(Data.class, qVar, "data");
        i.d(d4, "moshi.adapter(Data::clas…emptySet(),\n      \"data\")");
        this.nullableDataAdapter = d4;
        l<List<Style>> d5 = xVar.d(g.V(List.class, Style.class), qVar, "styles");
        i.d(d5, "moshi.adapter(Types.newP…ptySet(),\n      \"styles\")");
        this.nullableListOfStyleAdapter = d5;
        l<Features> d6 = xVar.d(Features.class, qVar, "features");
        i.d(d6, "moshi.adapter(Features::…  emptySet(), \"features\")");
        this.nullableFeaturesAdapter = d6;
        l<Paywall> d7 = xVar.d(Paywall.class, qVar, "paywall");
        i.d(d7, "moshi.adapter(Paywall::c…   emptySet(), \"paywall\")");
        this.nullablePaywallAdapter = d7;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        List list = null;
        List list2 = null;
        Store store = null;
        Integration integration = null;
        Data data = null;
        List list3 = null;
        Features features = null;
        Paywall paywall = null;
        while (qVar.N()) {
            switch (qVar.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    list = this.nullableListOfAssetAdapter.a(qVar);
                    break;
                case 1:
                    list2 = this.nullableListOfAssetAdapter.a(qVar);
                    break;
                case 2:
                    store = this.nullableStoreAdapter.a(qVar);
                    break;
                case 3:
                    integration = this.nullableIntegrationAdapter.a(qVar);
                    break;
                case 4:
                    data = this.nullableDataAdapter.a(qVar);
                    break;
                case 5:
                    list3 = this.nullableListOfStyleAdapter.a(qVar);
                    break;
                case 6:
                    features = this.nullableFeaturesAdapter.a(qVar);
                    break;
                case 7:
                    paywall = this.nullablePaywallAdapter.a(qVar);
                    break;
            }
        }
        qVar.z();
        return new App(list, list2, store, integration, data, list3, features, paywall);
    }

    public void e(u uVar, Object obj) {
        App app2 = (App) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(app2, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("fonts");
        this.nullableListOfAssetAdapter.e(uVar, app2.a);
        uVar.O("assets");
        this.nullableListOfAssetAdapter.e(uVar, app2.f7061b);
        uVar.O(DatabaseHelper.STORE_TABLE_NAME);
        this.nullableStoreAdapter.e(uVar, app2.c);
        uVar.O("integration");
        this.nullableIntegrationAdapter.e(uVar, app2.d);
        uVar.O("data");
        this.nullableDataAdapter.e(uVar, app2.f7062e);
        uVar.O("styles");
        this.nullableListOfStyleAdapter.e(uVar, app2.f);
        uVar.O("features");
        this.nullableFeaturesAdapter.e(uVar, app2.f7063g);
        uVar.O("paywall");
        this.nullablePaywallAdapter.e(uVar, app2.f7064h);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(App)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(App)";
    }
}
