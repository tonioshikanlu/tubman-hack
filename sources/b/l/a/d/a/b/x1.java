package b.l.a.d.a.b;

import b.l.a.d.a.e.f;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public final class x1 {

    /* renamed from: b  reason: collision with root package name */
    public static final f f4648b = new f("VerifySliceTaskHandler");
    public final t a;

    public x1(t tVar) {
        this.a = tVar;
    }

    public final void a(w1 w1Var) {
        File k2 = this.a.k(w1Var.f4647b, w1Var.c, w1Var.d, w1Var.f4643e);
        if (k2.exists()) {
            try {
                File q2 = this.a.q(w1Var.f4647b, w1Var.c, w1Var.d, w1Var.f4643e);
                if (q2.exists()) {
                    try {
                        if (e1.a(v1.a(k2, q2)).equals(w1Var.f)) {
                            f4648b.b(4, "Verification of slice %s of pack %s successful.", new Object[]{w1Var.f4643e, w1Var.f4647b});
                            File l2 = this.a.l(w1Var.f4647b, w1Var.c, w1Var.d, w1Var.f4643e);
                            if (!l2.exists()) {
                                l2.mkdirs();
                            }
                            if (!k2.renameTo(l2)) {
                                throw new g0(String.format("Failed to move slice %s after verification.", new Object[]{w1Var.f4643e}), w1Var.a);
                            }
                            return;
                        }
                        throw new g0(String.format("Verification failed for slice %s.", new Object[]{w1Var.f4643e}), w1Var.a);
                    } catch (NoSuchAlgorithmException e2) {
                        throw new g0("SHA256 algorithm not supported.", e2, w1Var.a);
                    } catch (IOException e3) {
                        throw new g0(String.format("Could not digest file during verification for slice %s.", new Object[]{w1Var.f4643e}), e3, w1Var.a);
                    }
                } else {
                    throw new g0(String.format("Cannot find metadata files for slice %s.", new Object[]{w1Var.f4643e}), w1Var.a);
                }
            } catch (IOException e4) {
                throw new g0(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{w1Var.f4643e}), e4, w1Var.a);
            }
        } else {
            throw new g0(String.format("Cannot find unverified files for slice %s.", new Object[]{w1Var.f4643e}), w1Var.a);
        }
    }
}
