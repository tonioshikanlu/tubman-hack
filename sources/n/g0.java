package n;

import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.m0.c;
import o.f;

public abstract class g0 {
    public static final a a = new a((DefaultConstructorMarker) null);

    public static final class a {

        /* renamed from: n.g0$a$a  reason: collision with other inner class name */
        public static final class C0231a extends g0 {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ byte[] f10097b;
            public final /* synthetic */ b0 c;
            public final /* synthetic */ int d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ int f10098e;

            public C0231a(byte[] bArr, b0 b0Var, int i2, int i3) {
                this.f10097b = bArr;
                this.c = b0Var;
                this.d = i2;
                this.f10098e = i3;
            }

            public long a() {
                return (long) this.d;
            }

            public b0 b() {
                return this.c;
            }

            public void c(f fVar) {
                i.e(fVar, "sink");
                fVar.h(this.f10097b, this.f10098e, this.d);
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static g0 b(a aVar, b0 b0Var, byte[] bArr, int i2, int i3, int i4) {
            if ((i4 & 4) != 0) {
                i2 = 0;
            }
            if ((i4 & 8) != 0) {
                i3 = bArr.length;
            }
            i.e(bArr, "content");
            return aVar.a(bArr, (b0) null, i2, i3);
        }

        public static /* synthetic */ g0 c(a aVar, byte[] bArr, b0 b0Var, int i2, int i3, int i4) {
            if ((i4 & 1) != 0) {
                b0Var = null;
            }
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = bArr.length;
            }
            return aVar.a(bArr, b0Var, i2, i3);
        }

        public final g0 a(byte[] bArr, b0 b0Var, int i2, int i3) {
            i.e(bArr, "$this$toRequestBody");
            c.c((long) bArr.length, (long) i2, (long) i3);
            return new C0231a(bArr, b0Var, i3, i2);
        }
    }

    public abstract long a();

    public abstract b0 b();

    public abstract void c(f fVar);
}
