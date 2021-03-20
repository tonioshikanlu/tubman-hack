package b.l.d;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.l.a.c.b.a;
import b.l.a.c.c.m.q0;
import b.l.a.c.c.m.r;
import b.l.a.c.c.p.f;
import java.util.Arrays;
import java.util.Objects;

public final class l {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4918b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4919e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4920g;

    public l(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        a.G(!f.b(str), "ApplicationId must be set.");
        this.f4918b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.f4919e = str5;
        this.f = str6;
        this.f4920g = str7;
    }

    @Nullable
    public static l a(@NonNull Context context) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        int identifier = resources.getIdentifier("google_app_id", "string", resourcePackageName);
        String str = null;
        String string = identifier == 0 ? null : resources.getString(identifier);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        int identifier2 = resources.getIdentifier("google_api_key", "string", resourcePackageName);
        String string2 = identifier2 == 0 ? null : resources.getString(identifier2);
        int identifier3 = resources.getIdentifier("firebase_database_url", "string", resourcePackageName);
        String string3 = identifier3 == 0 ? null : resources.getString(identifier3);
        int identifier4 = resources.getIdentifier("ga_trackingId", "string", resourcePackageName);
        String string4 = identifier4 == 0 ? null : resources.getString(identifier4);
        int identifier5 = resources.getIdentifier("gcm_defaultSenderId", "string", resourcePackageName);
        String string5 = identifier5 == 0 ? null : resources.getString(identifier5);
        int identifier6 = resources.getIdentifier("google_storage_bucket", "string", resourcePackageName);
        String string6 = identifier6 == 0 ? null : resources.getString(identifier6);
        int identifier7 = resources.getIdentifier("project_id", "string", resourcePackageName);
        if (identifier7 != 0) {
            str = resources.getString(identifier7);
        }
        return new l(string, string2, string3, string4, string5, string6, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return a.T(this.f4918b, lVar.f4918b) && a.T(this.a, lVar.a) && a.T(this.c, lVar.c) && a.T(this.d, lVar.d) && a.T(this.f4919e, lVar.f4919e) && a.T(this.f, lVar.f) && a.T(this.f4920g, lVar.f4920g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4918b, this.a, this.c, this.d, this.f4919e, this.f, this.f4920g});
    }

    public String toString() {
        r rVar = new r(this, (q0) null);
        rVar.a("applicationId", this.f4918b);
        rVar.a("apiKey", this.a);
        rVar.a("databaseUrl", this.c);
        rVar.a("gcmSenderId", this.f4919e);
        rVar.a("storageBucket", this.f);
        rVar.a("projectId", this.f4920g);
        return rVar.toString();
    }
}
