package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/appfoundry/previewer/model/FirebaseProjectInfoJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseProjectInfo;", "", "toString", "()Ljava/lang/String;", "nullableStringAdapter", "Lb/p/a/l;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class FirebaseProjectInfoJsonAdapter extends l<FirebaseProjectInfo> {
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public FirebaseProjectInfoJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("project_number", "firebase_url", "project_id", "storage_bucket");
        i.d(a, "JsonReader.Options.of(\"p…ct_id\", \"storage_bucket\")");
        this.options = a;
        l<String> d = xVar.d(String.class, e.t.q.f7936h, "project_number");
        i.d(d, "moshi.adapter(String::cl…ySet(), \"project_number\")");
        this.nullableStringAdapter = d;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                str = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 1) {
                str2 = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 2) {
                str3 = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 3) {
                str4 = this.nullableStringAdapter.a(qVar);
            }
        }
        qVar.z();
        return new FirebaseProjectInfo(str, str2, str3, str4);
    }

    public void e(u uVar, Object obj) {
        FirebaseProjectInfo firebaseProjectInfo = (FirebaseProjectInfo) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(firebaseProjectInfo, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("project_number");
        this.nullableStringAdapter.e(uVar, firebaseProjectInfo.a);
        uVar.O("firebase_url");
        this.nullableStringAdapter.e(uVar, firebaseProjectInfo.f7117b);
        uVar.O("project_id");
        this.nullableStringAdapter.e(uVar, firebaseProjectInfo.c);
        uVar.O("storage_bucket");
        this.nullableStringAdapter.e(uVar, firebaseProjectInfo.d);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(FirebaseProjectInfo)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(FirebaseProjectInfo)";
    }
}
