package b.m.a.t;

import android.graphics.Rect;
import android.util.Log;
import b.m.a.r;

public class k extends o {

    /* renamed from: b  reason: collision with root package name */
    public static final String f5975b = "k";

    public float a(r rVar, r rVar2) {
        if (rVar.f5930h <= 0 || rVar.f5931i <= 0) {
            return 0.0f;
        }
        r e2 = rVar.e(rVar2);
        float f = (((float) e2.f5930h) * 1.0f) / ((float) rVar.f5930h);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) rVar2.f5931i) * 1.0f) / ((float) e2.f5931i)) * ((((float) rVar2.f5930h) * 1.0f) / ((float) e2.f5930h));
        return (((1.0f / f2) / f2) / f2) * f;
    }

    public Rect b(r rVar, r rVar2) {
        r e2 = rVar.e(rVar2);
        String str = f5975b;
        Log.i(str, "Preview: " + rVar + "; Scaled: " + e2 + "; Want: " + rVar2);
        int i2 = (e2.f5930h - rVar2.f5930h) / 2;
        int i3 = (e2.f5931i - rVar2.f5931i) / 2;
        return new Rect(-i2, -i3, e2.f5930h - i2, e2.f5931i - i3);
    }
}
