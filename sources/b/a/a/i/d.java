package b.a.a.i;

import android.widget.EditText;
import b.e.a.a.a;
import com.segment.analytics.AnalyticsContext;
import e.x.c.i;
import java.io.File;

public final class d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f310b;
    public final EditText c;
    public File d;

    /* renamed from: e  reason: collision with root package name */
    public String f311e;
    public Integer f;

    /* renamed from: g  reason: collision with root package name */
    public String f312g;

    /* renamed from: h  reason: collision with root package name */
    public String f313h;

    public d(String str, String str2, EditText editText, File file, String str3, Integer num, String str4, String str5, int i2) {
        int i3 = i2 & 8;
        int i4 = i2 & 16;
        int i5 = (i2 & 32) != 0 ? 0 : null;
        int i6 = i2 & 64;
        int i7 = i2 & 128;
        i.e(str, "type");
        i.e(str2, AnalyticsContext.Device.DEVICE_ID_KEY);
        this.a = str;
        this.f310b = str2;
        this.c = editText;
        this.d = null;
        this.f311e = null;
        this.f = i5;
        this.f312g = null;
        this.f313h = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.a, dVar.a) && i.a(this.f310b, dVar.f310b) && i.a(this.c, dVar.c) && i.a(this.d, dVar.d) && i.a(this.f311e, dVar.f311e) && i.a(this.f, dVar.f) && i.a(this.f312g, dVar.f312g) && i.a(this.f313h, dVar.f313h);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f310b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        EditText editText = this.c;
        int hashCode3 = (hashCode2 + (editText != null ? editText.hashCode() : 0)) * 31;
        File file = this.d;
        int hashCode4 = (hashCode3 + (file != null ? file.hashCode() : 0)) * 31;
        String str3 = this.f311e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f312g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f313h;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("FormInput(type=");
        y.append(this.a);
        y.append(", id=");
        y.append(this.f310b);
        y.append(", editText=");
        y.append(this.c);
        y.append(", imageFile=");
        y.append(this.d);
        y.append(", fileName=");
        y.append(this.f311e);
        y.append(", fileSize=");
        y.append(this.f);
        y.append(", fileType=");
        y.append(this.f312g);
        y.append(", fileUrl=");
        return a.q(y, this.f313h, ")");
    }
}
