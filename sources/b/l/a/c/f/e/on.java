package b.l.a.c.f.e;

import b.l.a.c.f.e.e;
import b.l.a.c.f.e.on;

public class on<MessageType extends e<MessageType, BuilderType>, BuilderType extends on<MessageType, BuilderType>> extends fm<MessageType, BuilderType> {

    /* renamed from: h  reason: collision with root package name */
    public final MessageType f3214h;

    /* renamed from: i  reason: collision with root package name */
    public MessageType f3215i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3216j = false;

    public on(MessageType messagetype) {
        this.f3214h = messagetype;
        this.f3215i = (e) messagetype.h(4, (Object) null, (Object) null);
    }

    public void a() {
        MessageType messagetype = (e) this.f3215i.h(4, (Object) null, (Object) null);
        l0.c.a(messagetype.getClass()).d(messagetype, this.f3215i);
        this.f3215i = messagetype;
    }

    public MessageType b() {
        if (this.f3216j) {
            return this.f3215i;
        }
        MessageType messagetype = this.f3215i;
        l0.c.a(messagetype.getClass()).b(messagetype);
        this.f3216j = true;
        return this.f3215i;
    }

    public final MessageType c() {
        MessageType b2 = b();
        if (b2.j()) {
            return b2;
        }
        throw new b1();
    }

    public final Object clone() {
        on onVar = (on) this.f3214h.h(5, (Object) null, (Object) null);
        onVar.d(b());
        return onVar;
    }

    public final BuilderType d(MessageType messagetype) {
        if (this.f3216j) {
            a();
            this.f3216j = false;
        }
        MessageType messagetype2 = this.f3215i;
        l0.c.a(messagetype2.getClass()).d(messagetype2, messagetype);
        return this;
    }

    public final /* bridge */ /* synthetic */ e0 q() {
        return this.f3214h;
    }
}
