package b.a.a.i;

import b.e.a.a.a;
import com.appfoundry.previewer.model.Dimensions;
import e.x.c.i;
import java.util.Arrays;

public final class l {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f321b;
    public final Dimensions c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final float f322e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float f323g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f324h;

    public l(int i2, int i3, Dimensions dimensions, int i4, float f2, float f3, float f4, float[] fArr) {
        i.e(dimensions, "margins");
        i.e(fArr, "cornerRadii");
        this.a = i2;
        this.f321b = i3;
        this.c = dimensions;
        this.d = i4;
        this.f322e = f2;
        this.f = f3;
        this.f323g = f4;
        this.f324h = fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.f321b == lVar.f321b && i.a(this.c, lVar.c) && this.d == lVar.d && Float.compare(this.f322e, lVar.f322e) == 0 && Float.compare(this.f, lVar.f) == 0 && Float.compare(this.f323g, lVar.f323g) == 0 && i.a(this.f324h, lVar.f324h);
    }

    public int hashCode() {
        int hashCode = (Integer.hashCode(this.f321b) + (Integer.hashCode(this.a) * 31)) * 31;
        Dimensions dimensions = this.c;
        int i2 = 0;
        int hashCode2 = dimensions != null ? dimensions.hashCode() : 0;
        int hashCode3 = Integer.hashCode(this.d);
        int hashCode4 = Float.hashCode(this.f322e);
        int hashCode5 = (Float.hashCode(this.f323g) + ((Float.hashCode(this.f) + ((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31)) * 31;
        float[] fArr = this.f324h;
        if (fArr != null) {
            i2 = Arrays.hashCode(fArr);
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("ShadowData(width=");
        y.append(this.a);
        y.append(", height=");
        y.append(this.f321b);
        y.append(", margins=");
        y.append(this.c);
        y.append(", shadowColor=");
        y.append(this.d);
        y.append(", shadowRadius=");
        y.append(this.f322e);
        y.append(", shadowOffsetX=");
        y.append(this.f);
        y.append(", shadowOffsetY=");
        y.append(this.f323g);
        y.append(", cornerRadii=");
        y.append(Arrays.toString(this.f324h));
        y.append(")");
        return y.toString();
    }
}
