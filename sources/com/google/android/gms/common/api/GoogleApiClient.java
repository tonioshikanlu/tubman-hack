package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import b.l.a.c.c.e;
import b.l.a.c.c.l.a;
import b.l.a.c.c.l.h;
import b.l.a.c.c.l.k.f;
import b.l.a.c.c.l.k.j0;
import b.l.a.c.c.l.k.l;
import b.l.a.c.c.l.k.w1;
import b.l.a.c.c.m.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
public abstract class GoogleApiClient {
    public static final Set<GoogleApiClient> a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public static final class a {
        public final Set<Scope> a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final Set<Scope> f7247b = new HashSet();
        public String c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public final Map<b.l.a.c.c.l.a<?>, d.b> f7248e = new ArrayMap();
        public final Context f;

        /* renamed from: g  reason: collision with root package name */
        public final Map<b.l.a.c.c.l.a<?>, a.d> f7249g = new ArrayMap();

        /* renamed from: h  reason: collision with root package name */
        public int f7250h = -1;

        /* renamed from: i  reason: collision with root package name */
        public Looper f7251i;

        /* renamed from: j  reason: collision with root package name */
        public e f7252j;

        /* renamed from: k  reason: collision with root package name */
        public a.C0058a<? extends b.l.a.c.j.e, b.l.a.c.j.a> f7253k;

        /* renamed from: l  reason: collision with root package name */
        public final ArrayList<b> f7254l;

        /* renamed from: m  reason: collision with root package name */
        public final ArrayList<c> f7255m;

        public a(@NonNull Context context) {
            Object obj = e.c;
            this.f7252j = e.d;
            this.f7253k = b.l.a.c.j.d.c;
            this.f7254l = new ArrayList<>();
            this.f7255m = new ArrayList<>();
            this.f = context;
            this.f7251i = context.getMainLooper();
            this.c = context.getPackageName();
            this.d = context.getClass().getName();
        }

        public final GoogleApiClient a() {
            b.l.a.c.b.a.k(!this.f7249g.isEmpty(), "must call addApi() to add at least one API");
            b.l.a.c.j.a aVar = b.l.a.c.j.a.f4406h;
            Map<b.l.a.c.c.l.a<?>, a.d> map = this.f7249g;
            b.l.a.c.c.l.a<b.l.a.c.j.a> aVar2 = b.l.a.c.j.d.f4417e;
            if (map.containsKey(aVar2)) {
                aVar = (b.l.a.c.j.a) this.f7249g.get(aVar2);
            }
            d dVar = new d((Account) null, this.a, this.f7248e, 0, (View) null, this.c, this.d, aVar, false);
            Map<b.l.a.c.c.l.a<?>, d.b> map2 = dVar.d;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            Iterator<b.l.a.c.c.l.a<?>> it = this.f7249g.keySet().iterator();
            b.l.a.c.c.l.a aVar3 = null;
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    b.l.a.c.c.l.a next = it.next();
                    a.d dVar2 = this.f7249g.get(next);
                    boolean z2 = map2.get(next) != null;
                    arrayMap.put(next, Boolean.valueOf(z2));
                    w1 w1Var = new w1(next, z2);
                    arrayList.add(w1Var);
                    if (next.a != null) {
                        z = true;
                    }
                    b.l.a.c.b.a.G(z, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
                    b.l.a.c.c.l.a aVar4 = next;
                    a.f a2 = next.a.a(this.f, this.f7251i, dVar, dVar2, w1Var, w1Var);
                    arrayMap2.put(aVar4.a(), a2);
                    if (a2.h()) {
                        if (aVar3 == null) {
                            aVar3 = aVar4;
                        } else {
                            String str = aVar4.c;
                            String str2 = aVar3.c;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 21);
                            sb.append(str);
                            sb.append(" cannot be used with ");
                            sb.append(str2);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                } else {
                    if (aVar3 != null) {
                        boolean equals = this.a.equals(this.f7247b);
                        Object[] objArr = {aVar3.c};
                        if (!equals) {
                            throw new IllegalStateException(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
                        }
                    }
                    j0 j0Var = new j0(this.f, new ReentrantLock(), this.f7251i, dVar, this.f7252j, this.f7253k, arrayMap, this.f7254l, this.f7255m, arrayMap2, this.f7250h, j0.j(arrayMap2.values(), true), arrayList);
                    Set<GoogleApiClient> set = GoogleApiClient.a;
                    synchronized (set) {
                        set.add(j0Var);
                    }
                    if (this.f7250h < 0) {
                        return j0Var;
                    }
                    throw null;
                }
            }
        }
    }

    @Deprecated
    public interface b extends f {
    }

    @Deprecated
    public interface c extends l {
    }

    public abstract void connect();

    public <A extends a.b, T extends b.l.a.c.c.l.k.d<? extends h, A>> T d(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    @NonNull
    public <C extends a.f> C e(@NonNull a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    public Looper f() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean g();
}
