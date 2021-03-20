package b.h.a;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b.h.a.c;
import b.h.a.m.v.c0.b;
import b.h.a.m.v.l;
import b.h.a.q.d;
import b.h.a.q.h.f;
import java.util.List;
import java.util.Map;

public class e extends ContextWrapper {
    @VisibleForTesting

    /* renamed from: k  reason: collision with root package name */
    public static final j<?, ?> f486k = new b();
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final g f487b;
    public final f c;
    public final c.a d;

    /* renamed from: e  reason: collision with root package name */
    public final List<d<Object>> f488e;
    public final Map<Class<?>, j<?, ?>> f;

    /* renamed from: g  reason: collision with root package name */
    public final l f489g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f490h;

    /* renamed from: i  reason: collision with root package name */
    public final int f491i;
    @GuardedBy("this")
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public b.h.a.q.e f492j;

    public e(@NonNull Context context, @NonNull b bVar, @NonNull g gVar, @NonNull f fVar, @NonNull c.a aVar, @NonNull Map<Class<?>, j<?, ?>> map, @NonNull List<d<Object>> list, @NonNull l lVar, boolean z, int i2) {
        super(context.getApplicationContext());
        this.a = bVar;
        this.f487b = gVar;
        this.c = fVar;
        this.d = aVar;
        this.f488e = list;
        this.f = map;
        this.f489g = lVar;
        this.f490h = z;
        this.f491i = i2;
    }
}
