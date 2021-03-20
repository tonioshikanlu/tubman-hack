package b.m.a.t;

import android.graphics.Rect;
import b.m.a.r;

public class l extends o {
    public static float c(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    public float a(r rVar, r rVar2) {
        int i2 = rVar.f5930h;
        if (i2 <= 0 || rVar.f5931i <= 0) {
            return 0.0f;
        }
        float c = (1.0f / c((((float) i2) * 1.0f) / ((float) rVar2.f5930h))) / c((((float) rVar.f5931i) * 1.0f) / ((float) rVar2.f5931i));
        float c2 = c(((((float) rVar.f5930h) * 1.0f) / ((float) rVar.f5931i)) / ((((float) rVar2.f5930h) * 1.0f) / ((float) rVar2.f5931i)));
        return (((1.0f / c2) / c2) / c2) * c;
    }

    public Rect b(r rVar, r rVar2) {
        return new Rect(0, 0, rVar2.f5930h, rVar2.f5931i);
    }
}
