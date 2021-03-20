package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import e.x.c.i;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/appfoundry/previewer/model/AuthSettingsJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/AuthSettings;", "", "toString", "()Ljava/lang/String;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "nullableStringAdapter", "Lb/p/a/l;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class AuthSettingsJsonAdapter extends l<AuthSettings> {
    private final l<String> nullableStringAdapter;
    private final q.a options;

    public AuthSettingsJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("grant", "scope", "authUrl", "clientId", "tokenUrl", "callbackUrl", "clientSecret", "json", "jsonVision");
        i.d(a, "JsonReader.Options.of(\"g…t\", \"json\", \"jsonVision\")");
        this.options = a;
        l<String> d = xVar.d(String.class, e.t.q.f7936h, "grant");
        i.d(d, "moshi.adapter(String::cl…     emptySet(), \"grant\")");
        this.nullableStringAdapter = d;
    }

    public Object a(q qVar) {
        i.e(qVar, "reader");
        qVar.e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (qVar.N()) {
            switch (qVar.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.a(qVar);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.a(qVar);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.a(qVar);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.a(qVar);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.a(qVar);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.a(qVar);
                    break;
                case 6:
                    str7 = this.nullableStringAdapter.a(qVar);
                    break;
                case 7:
                    str8 = this.nullableStringAdapter.a(qVar);
                    break;
                case 8:
                    str9 = this.nullableStringAdapter.a(qVar);
                    break;
            }
        }
        qVar.z();
        return new AuthSettings(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public void e(u uVar, Object obj) {
        AuthSettings authSettings = (AuthSettings) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(authSettings, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("grant");
        this.nullableStringAdapter.e(uVar, authSettings.a);
        uVar.O("scope");
        this.nullableStringAdapter.e(uVar, authSettings.f7068b);
        uVar.O("authUrl");
        this.nullableStringAdapter.e(uVar, authSettings.c);
        uVar.O("clientId");
        this.nullableStringAdapter.e(uVar, authSettings.d);
        uVar.O("tokenUrl");
        this.nullableStringAdapter.e(uVar, authSettings.f7069e);
        uVar.O("callbackUrl");
        this.nullableStringAdapter.e(uVar, authSettings.f);
        uVar.O("clientSecret");
        this.nullableStringAdapter.e(uVar, authSettings.f7070g);
        uVar.O("json");
        this.nullableStringAdapter.e(uVar, authSettings.f7071h);
        uVar.O("jsonVision");
        this.nullableStringAdapter.e(uVar, authSettings.f7072i);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(AuthSettings)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(AuthSettings)";
    }
}
