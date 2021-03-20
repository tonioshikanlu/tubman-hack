package b.l.a.c.i.b;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import b.l.a.c.f.i.zb;
import java.util.Objects;

public final class m5 {
    public final Context a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f4142b;
    @Nullable
    public String c;
    @Nullable
    public String d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public Boolean f4143e;
    public long f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public zb f4144g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4145h = true;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final Long f4146i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public String f4147j;

    public m5(Context context, @Nullable zb zbVar, @Nullable Long l2) {
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null reference");
        this.a = applicationContext;
        this.f4146i = l2;
        if (zbVar != null) {
            this.f4144g = zbVar;
            this.f4142b = zbVar.f3850m;
            this.c = zbVar.f3849l;
            this.d = zbVar.f3848k;
            this.f4145h = zbVar.f3847j;
            this.f = zbVar.f3846i;
            this.f4147j = zbVar.f3852o;
            Bundle bundle = zbVar.f3851n;
            if (bundle != null) {
                this.f4143e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
