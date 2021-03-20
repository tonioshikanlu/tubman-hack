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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/appfoundry/previewer/model/FirebaseConfigJsonJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseConfigJson;", "", "toString", "()Ljava/lang/String;", "", "Lcom/appfoundry/previewer/model/FirebaseClient;", "nullableListOfFirebaseClientAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lcom/appfoundry/previewer/model/FirebaseProjectInfo;", "nullableFirebaseProjectInfoAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class FirebaseConfigJsonJsonAdapter extends l<FirebaseConfigJson> {
    private final l<FirebaseProjectInfo> nullableFirebaseProjectInfoAdapter;
    private final l<List<FirebaseClient>> nullableListOfFirebaseClientAdapter;
    private final q.a options;

    public FirebaseConfigJsonJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("project_info", "client");
        i.d(a, "JsonReader.Options.of(\"project_info\", \"client\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<FirebaseProjectInfo> d = xVar.d(FirebaseProjectInfo.class, qVar, "project_info");
        i.d(d, "moshi.adapter(FirebasePr…ptySet(), \"project_info\")");
        this.nullableFirebaseProjectInfoAdapter = d;
        l<List<FirebaseClient>> d2 = xVar.d(g.V(List.class, FirebaseClient.class), qVar, "client");
        i.d(d2, "moshi.adapter(Types.newP…    emptySet(), \"client\")");
        this.nullableListOfFirebaseClientAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        FirebaseProjectInfo firebaseProjectInfo = null;
        List list = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                firebaseProjectInfo = this.nullableFirebaseProjectInfoAdapter.a(qVar);
            } else if (m0 == 1) {
                list = this.nullableListOfFirebaseClientAdapter.a(qVar);
            }
        }
        qVar.z();
        return new FirebaseConfigJson(firebaseProjectInfo, list);
    }

    public void e(u uVar, Object obj) {
        FirebaseConfigJson firebaseConfigJson = (FirebaseConfigJson) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(firebaseConfigJson, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("project_info");
        this.nullableFirebaseProjectInfoAdapter.e(uVar, firebaseConfigJson.a);
        uVar.O("client");
        this.nullableListOfFirebaseClientAdapter.e(uVar, firebaseConfigJson.f7116b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(FirebaseConfigJson)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(FirebaseConfigJson)";
    }
}
