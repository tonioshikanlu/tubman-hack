package b.l.a.c.f.i;

import b.l.a.c.f.i.m5;
import b.l.a.c.f.i.p5;
import java.io.IOException;

public class m5<MessageType extends p5<MessageType, BuilderType>, BuilderType extends m5<MessageType, BuilderType>> extends f4<MessageType, BuilderType> {

    /* renamed from: h  reason: collision with root package name */
    public final MessageType f3653h;

    /* renamed from: i  reason: collision with root package name */
    public MessageType f3654i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3655j = false;

    public m5(MessageType messagetype) {
        this.f3653h = messagetype;
        this.f3654i = (p5) messagetype.r(4, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ q6 d() {
        return this.f3653h;
    }

    public final MessageType g() {
        MessageType l2 = l();
        boolean z = true;
        byte byteValue = ((Byte) l2.r(1, (Object) null, (Object) null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean b2 = x6.c.a(l2.getClass()).b(l2);
                l2.r(2, true != b2 ? null : l2, (Object) null);
                z = b2;
            }
        }
        if (z) {
            return l2;
        }
        throw new m7();
    }

    public final BuilderType h(MessageType messagetype) {
        if (this.f3655j) {
            j();
            this.f3655j = false;
        }
        MessageType messagetype2 = this.f3654i;
        x6.c.a(messagetype2.getClass()).d(messagetype2, messagetype);
        return this;
    }

    public final BuilderType i(byte[] bArr, int i2, int i3, c5 c5Var) {
        if (this.f3655j) {
            j();
            this.f3655j = false;
        }
        try {
            x6.c.a(this.f3654i.getClass()).i(this.f3654i, bArr, 0, i3, new j4(c5Var));
            return this;
        } catch (y5 e2) {
            throw e2;
        } catch (IndexOutOfBoundsException unused) {
            throw y5.a();
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        }
    }

    public void j() {
        MessageType messagetype = (p5) this.f3654i.r(4, (Object) null, (Object) null);
        x6.c.a(messagetype.getClass()).d(messagetype, this.f3654i);
        this.f3654i = messagetype;
    }

    /* renamed from: k */
    public final BuilderType clone() {
        BuilderType buildertype = (m5) this.f3653h.r(5, (Object) null, (Object) null);
        buildertype.h(l());
        return buildertype;
    }

    public MessageType l() {
        if (this.f3655j) {
            return this.f3654i;
        }
        MessageType messagetype = this.f3654i;
        x6.c.a(messagetype.getClass()).h(messagetype);
        this.f3655j = true;
        return this.f3654i;
    }
}
