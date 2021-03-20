package b.l.a.c.c.m;

import android.accounts.Account;
import android.os.IInterface;
import androidx.annotation.NonNull;
import b.l.a.c.c.f;
import b.l.a.c.c.l.a;
import b.l.a.c.c.m.j;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;

public abstract class i<T extends IInterface> extends b<T> implements a.f, j.a {
    public final Set<Scope> B;
    public final Account C;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(android.content.Context r10, android.os.Looper r11, int r12, b.l.a.c.c.m.d r13, b.l.a.c.c.l.k.f r14, b.l.a.c.c.l.k.l r15) {
        /*
            r9 = this;
            b.l.a.c.c.m.k r3 = b.l.a.c.c.m.k.a(r10)
            java.lang.Object r0 = b.l.a.c.c.e.c
            b.l.a.c.c.e r4 = b.l.a.c.c.e.d
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r14, r0)
            java.util.Objects.requireNonNull(r15, r0)
            b.l.a.c.c.m.y r6 = new b.l.a.c.c.m.y
            r6.<init>(r14)
            b.l.a.c.c.m.z r7 = new b.l.a.c.c.m.z
            r7.<init>(r15)
            java.lang.String r8 = r13.f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r10 = r13.a
            r9.C = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.c
            java.util.Iterator r11 = r10.iterator()
        L_0x002d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0048
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x0040
            goto L_0x002d
        L_0x0040:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L_0x0048:
            r9.B = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.c.m.i.<init>(android.content.Context, android.os.Looper, int, b.l.a.c.c.m.d, b.l.a.c.c.l.k.f, b.l.a.c.c.l.k.l):void");
    }

    public final Set<Scope> A() {
        return this.B;
    }

    @NonNull
    public Set<Scope> i() {
        return t() ? this.B : Collections.emptySet();
    }

    public int n() {
        return f.a;
    }

    public final Account x() {
        return this.C;
    }
}
