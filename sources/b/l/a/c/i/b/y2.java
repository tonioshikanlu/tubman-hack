package b.l.a.c.i.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.l.a.c.f.i.a;
import b.l.a.c.f.i.o0;
import java.util.ArrayList;
import java.util.List;

public final class y2 extends a implements a3 {
    public y2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void B0(p9 p9Var) {
        Parcel g2 = g();
        o0.b(g2, p9Var);
        k(4, g2);
    }

    public final void C0(b bVar, p9 p9Var) {
        Parcel g2 = g();
        o0.b(g2, bVar);
        o0.b(g2, p9Var);
        k(12, g2);
    }

    public final void D(p9 p9Var) {
        Parcel g2 = g();
        o0.b(g2, p9Var);
        k(20, g2);
    }

    public final void D0(long j2, String str, String str2, String str3) {
        Parcel g2 = g();
        g2.writeLong(j2);
        g2.writeString(str);
        g2.writeString(str2);
        g2.writeString(str3);
        k(10, g2);
    }

    public final void K(p9 p9Var) {
        Parcel g2 = g();
        o0.b(g2, p9Var);
        k(6, g2);
    }

    public final List<g9> O0(String str, String str2, boolean z, p9 p9Var) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        ClassLoader classLoader = o0.a;
        g2.writeInt(z ? 1 : 0);
        o0.b(g2, p9Var);
        Parcel n2 = n(14, g2);
        ArrayList<g9> createTypedArrayList = n2.createTypedArrayList(g9.CREATOR);
        n2.recycle();
        return createTypedArrayList;
    }

    public final String Q(p9 p9Var) {
        Parcel g2 = g();
        o0.b(g2, p9Var);
        Parcel n2 = n(11, g2);
        String readString = n2.readString();
        n2.recycle();
        return readString;
    }

    public final List<b> R0(String str, String str2, String str3) {
        Parcel g2 = g();
        g2.writeString((String) null);
        g2.writeString(str2);
        g2.writeString(str3);
        Parcel n2 = n(17, g2);
        ArrayList<b> createTypedArrayList = n2.createTypedArrayList(b.CREATOR);
        n2.recycle();
        return createTypedArrayList;
    }

    public final void S(g9 g9Var, p9 p9Var) {
        Parcel g2 = g();
        o0.b(g2, g9Var);
        o0.b(g2, p9Var);
        k(2, g2);
    }

    public final void U0(p9 p9Var) {
        Parcel g2 = g();
        o0.b(g2, p9Var);
        k(18, g2);
    }

    public final void Y0(s sVar, p9 p9Var) {
        Parcel g2 = g();
        o0.b(g2, sVar);
        o0.b(g2, p9Var);
        k(1, g2);
    }

    public final List<g9> b1(String str, String str2, String str3, boolean z) {
        Parcel g2 = g();
        g2.writeString((String) null);
        g2.writeString(str2);
        g2.writeString(str3);
        ClassLoader classLoader = o0.a;
        g2.writeInt(z ? 1 : 0);
        Parcel n2 = n(15, g2);
        ArrayList<g9> createTypedArrayList = n2.createTypedArrayList(g9.CREATOR);
        n2.recycle();
        return createTypedArrayList;
    }

    public final void c1(Bundle bundle, p9 p9Var) {
        Parcel g2 = g();
        o0.b(g2, bundle);
        o0.b(g2, p9Var);
        k(19, g2);
    }

    public final byte[] l1(s sVar, String str) {
        Parcel g2 = g();
        o0.b(g2, sVar);
        g2.writeString(str);
        Parcel n2 = n(9, g2);
        byte[] createByteArray = n2.createByteArray();
        n2.recycle();
        return createByteArray;
    }

    public final List<b> r(String str, String str2, p9 p9Var) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        o0.b(g2, p9Var);
        Parcel n2 = n(16, g2);
        ArrayList<b> createTypedArrayList = n2.createTypedArrayList(b.CREATOR);
        n2.recycle();
        return createTypedArrayList;
    }
}
