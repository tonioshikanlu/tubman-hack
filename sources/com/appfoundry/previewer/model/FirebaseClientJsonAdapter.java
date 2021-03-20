package com.appfoundry.previewer.model;

import b.l.f.x.a.g;
import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/appfoundry/previewer/model/FirebaseClientJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseClient;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/FirebaseClientInfo;", "nullableFirebaseClientInfoAdapter", "Lb/p/a/l;", "", "Lcom/appfoundry/previewer/model/FirebaseApiKey;", "nullableListOfFirebaseApiKeyAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class FirebaseClientJsonAdapter extends l<FirebaseClient> {
    private final l<FirebaseClientInfo> nullableFirebaseClientInfoAdapter;
    private final l<List<FirebaseApiKey>> nullableListOfFirebaseApiKeyAdapter;
    private final q.a options;

    public FirebaseClientJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("client_info", "api_key");
        i.d(a, "JsonReader.Options.of(\"client_info\", \"api_key\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<FirebaseClientInfo> d = xVar.d(FirebaseClientInfo.class, qVar, "client_info");
        i.d(d, "moshi.adapter(FirebaseCl…mptySet(), \"client_info\")");
        this.nullableFirebaseClientInfoAdapter = d;
        l<List<FirebaseApiKey>> d2 = xVar.d(g.V(List.class, FirebaseApiKey.class), qVar, "api_key");
        i.d(d2, "moshi.adapter(Types.newP…   emptySet(), \"api_key\")");
        this.nullableListOfFirebaseApiKeyAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        FirebaseClientInfo firebaseClientInfo = null;
        List list = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                firebaseClientInfo = this.nullableFirebaseClientInfoAdapter.a(qVar);
            } else if (m0 == 1) {
                list = this.nullableListOfFirebaseApiKeyAdapter.a(qVar);
            }
        }
        qVar.z();
        return new FirebaseClient(firebaseClientInfo, list);
    }

    public void e(u uVar, Object obj) {
        FirebaseClient firebaseClient = (FirebaseClient) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(firebaseClient, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("client_info");
        this.nullableFirebaseClientInfoAdapter.e(uVar, firebaseClient.a);
        uVar.O("api_key");
        this.nullableListOfFirebaseApiKeyAdapter.e(uVar, firebaseClient.f7114b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(FirebaseClient)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(FirebaseClient)";
    }
}
