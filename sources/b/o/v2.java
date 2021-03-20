package b.o;

import b.e.a.a.a;

public final class v2 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ z2 f6327h;

    public v2(z2 z2Var) {
        this.f6327h = z2Var;
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        this.f6327h.b("notification", "created_time < ?", new String[]{String.valueOf((System.currentTimeMillis() / 1000) - 604800)});
        z2 z2Var = this.f6327h;
        StringBuilder y = a.y("NOT EXISTS(SELECT NULL FROM notification n WHERE n.notification_id = channel_influence_id AND channel_type = \"");
        y.append("notification".toLowerCase());
        y.append("\")");
        z2Var.b("cached_unique_outcome", y.toString(), (String[]) null);
    }
}
