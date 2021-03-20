package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/appfoundry/previewer/model/AuthInfoFromBackendJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/AuthInfoFromBackend;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/AuthSettings;", "nullableAuthSettingsAdapter", "Lb/p/a/l;", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class AuthInfoFromBackendJsonAdapter extends l<AuthInfoFromBackend> {
    private final l<AuthSettings> nullableAuthSettingsAdapter;
    private final l<Boolean> nullableBooleanAdapter;
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public AuthInfoFromBackendJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("collectionId", "type", "interactive", "settings");
        i.d(a, "JsonReader.Options.of(\"c…interactive\", \"settings\")");
        this.options = a;
        e.t.q qVar = e.t.q.f7936h;
        l<String> d = xVar.d(String.class, qVar, "collectionId");
        i.d(d, "moshi.adapter(String::cl…ptySet(), \"collectionId\")");
        this.nullableStringAdapter = d;
        l<Boolean> d2 = xVar.d(Boolean.class, qVar, "interactive");
        i.d(d2, "moshi.adapter(Boolean::c…mptySet(), \"interactive\")");
        this.nullableBooleanAdapter = d2;
        l<AuthSettings> d3 = xVar.d(AuthSettings.class, qVar, "settings");
        i.d(d3, "moshi.adapter(AuthSettin…, emptySet(), \"settings\")");
        this.nullableAuthSettingsAdapter = d3;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        String str2 = null;
        Boolean bool = null;
        AuthSettings authSettings = null;
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
                bool = this.nullableBooleanAdapter.a(qVar);
            } else if (m0 == 3) {
                authSettings = this.nullableAuthSettingsAdapter.a(qVar);
            }
        }
        qVar.z();
        return new AuthInfoFromBackend(str, str2, bool, authSettings);
    }

    public void e(u uVar, Object obj) {
        AuthInfoFromBackend authInfoFromBackend = (AuthInfoFromBackend) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(authInfoFromBackend, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("collectionId");
        this.nullableStringAdapter.e(uVar, authInfoFromBackend.a);
        uVar.O("type");
        this.nullableStringAdapter.e(uVar, authInfoFromBackend.f7067b);
        uVar.O("interactive");
        this.nullableBooleanAdapter.e(uVar, authInfoFromBackend.c);
        uVar.O("settings");
        this.nullableAuthSettingsAdapter.e(uVar, authInfoFromBackend.d);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(AuthInfoFromBackend)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(AuthInfoFromBackend)";
    }
}
