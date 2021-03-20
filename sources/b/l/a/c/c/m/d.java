package b.l.a.c.c.m;

import android.accounts.Account;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class d {
    public final Account a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f2770b;
    public final Set<Scope> c;
    public final Map<b.l.a.c.c.l.a<?>, b> d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2771e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final b.l.a.c.j.a f2772g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2773h;

    /* renamed from: i  reason: collision with root package name */
    public Integer f2774i;

    public static final class a {
        public Account a;

        /* renamed from: b  reason: collision with root package name */
        public ArraySet<Scope> f2775b;
        public String c;
        public String d;

        public final d a() {
            return new d(this.a, this.f2775b, (Map<b.l.a.c.c.l.a<?>, b>) null, 0, (View) null, this.c, this.d, b.l.a.c.j.a.f4406h, false);
        }
    }

    public static final class b {
    }

    public d(Account account, Set<Scope> set, Map<b.l.a.c.c.l.a<?>, b> map, int i2, View view, String str, String str2, b.l.a.c.j.a aVar, boolean z) {
        this.a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f2770b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.f2771e = str;
        this.f = str2;
        this.f2772g = aVar;
        this.f2773h = z;
        HashSet hashSet = new HashSet(emptySet);
        for (b requireNonNull : map.values()) {
            Objects.requireNonNull(requireNonNull);
            hashSet.addAll((Collection) null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
