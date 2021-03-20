package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/appfoundry/previewer/model/FirebaseClientInfoJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseClientInfo;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableStringAdapter", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/FirebaseAndroidClientInfo;", "nullableFirebaseAndroidClientInfoAdapter", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class FirebaseClientInfoJsonAdapter extends l<FirebaseClientInfo> {
    private final l<FirebaseAndroidClientInfo> nullableFirebaseAndroidClientInfoAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public FirebaseClientInfoJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("mobilesdk_app_id", "android_client_info");
        i.d(a, "JsonReader.Options.of(\"m…   \"android_client_info\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(String.class, qVar, "mobilesdk_app_id");
        i.d(d, "moshi.adapter(String::cl…et(), \"mobilesdk_app_id\")");
        this.nullableStringAdapter = d;
        l<FirebaseAndroidClientInfo> d2 = xVar.d(FirebaseAndroidClientInfo.class, qVar, "android_client_info");
        i.d(d2, "moshi.adapter(FirebaseAn…), \"android_client_info\")");
        this.nullableFirebaseAndroidClientInfoAdapter = d2;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        FirebaseAndroidClientInfo firebaseAndroidClientInfo = null;
        while (qVar.N()) {
            int m0 = qVar.m0(this.options);
            if (m0 == -1) {
                qVar.n0();
                qVar.o0();
            } else if (m0 == 0) {
                str = this.nullableStringAdapter.a(qVar);
            } else if (m0 == 1) {
                firebaseAndroidClientInfo = this.nullableFirebaseAndroidClientInfoAdapter.a(qVar);
            }
        }
        qVar.z();
        return new FirebaseClientInfo(str, firebaseAndroidClientInfo);
    }

    public void e(u uVar, Object obj) {
        FirebaseClientInfo firebaseClientInfo = (FirebaseClientInfo) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(firebaseClientInfo, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("mobilesdk_app_id");
        this.nullableStringAdapter.e(uVar, firebaseClientInfo.a);
        uVar.O("android_client_info");
        this.nullableFirebaseAndroidClientInfoAdapter.e(uVar, firebaseClientInfo.f7115b);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(FirebaseClientInfo)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(FirebaseClientInfo)";
    }
}
