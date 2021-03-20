package b.l.a.c.f.e;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import b.l.a.c.b.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class cf implements ij<jl> {
    public final /* synthetic */ il a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ lk f2882b;
    public final /* synthetic */ ei c;
    public final /* synthetic */ sk d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ij f2883e;

    public cf(og ogVar, il ilVar, lk lkVar, ei eiVar, sk skVar, ij ijVar) {
        this.a = ilVar;
        this.f2882b = lkVar;
        this.c = eiVar;
        this.d = skVar;
        this.f2883e = ijVar;
    }

    public final void a(Object obj) {
        String str;
        jl jlVar = (jl) obj;
        List<yk> list = null;
        if (this.a.b("EMAIL")) {
            this.f2882b.f3126i = null;
        } else {
            String str2 = this.a.f3074j;
            if (str2 != null) {
                this.f2882b.f3126i = str2;
            }
        }
        if (this.a.b("DISPLAY_NAME")) {
            this.f2882b.f3128k = null;
        } else {
            String str3 = this.a.f3073i;
            if (str3 != null) {
                this.f2882b.f3128k = str3;
            }
        }
        if (this.a.b("PHOTO_URL")) {
            this.f2882b.f3129l = null;
        } else {
            String str4 = this.a.f3077m;
            if (str4 != null) {
                this.f2882b.f3129l = str4;
            }
        }
        if (!TextUtils.isEmpty(this.a.f3075k)) {
            lk lkVar = this.f2882b;
            byte[] bytes = "redacted".getBytes();
            if (bytes == null) {
                str = null;
            } else {
                str = Base64.encodeToString(bytes, 0);
            }
            Objects.requireNonNull(lkVar);
            a.x(str);
            lkVar.f3131n = str;
        }
        al alVar = jlVar.f3096i;
        if (alVar != null) {
            list = alVar.f2846h;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        lk lkVar2 = this.f2882b;
        Objects.requireNonNull(lkVar2);
        al alVar2 = new al();
        lkVar2.f3130m = alVar2;
        alVar2.f2846h.addAll(list);
        ei eiVar = this.c;
        sk skVar = this.d;
        Objects.requireNonNull(skVar, "null reference");
        String str5 = jlVar.f3097j;
        String str6 = jlVar.f3098k;
        if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
            skVar = new sk(str6, str5, Long.valueOf(jlVar.f3099l), skVar.f3277k);
        }
        eiVar.a(skVar, this.f2882b);
    }

    public final void d(@Nullable String str) {
        this.f2883e.d(str);
    }
}
