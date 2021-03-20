package o;

import androidx.exifinterface.media.ExifInterface;
import e.t.b;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class q extends b<h> implements RandomAccess {

    /* renamed from: j  reason: collision with root package name */
    public static final a f10477j = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public final h[] f10478h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f10479i;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(long j2, e eVar, int i2, List<? extends h> list, int i3, int i4, List<Integer> list2) {
            int i5;
            int i6;
            int i7;
            int i8;
            e eVar2;
            e eVar3 = eVar;
            int i9 = i2;
            List<? extends h> list3 = list;
            int i10 = i3;
            int i11 = i4;
            List<Integer> list4 = list2;
            if (i10 < i11) {
                int i12 = i10;
                while (i12 < i11) {
                    if (((h) list3.get(i12)).l() >= i9) {
                        i12++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                h hVar = (h) list.get(i3);
                h hVar2 = (h) list3.get(i11 - 1);
                int i13 = -1;
                if (i9 == hVar.l()) {
                    int intValue = list4.get(i10).intValue();
                    int i14 = i10 + 1;
                    i5 = i14;
                    i6 = intValue;
                    hVar = (h) list3.get(i14);
                } else {
                    i5 = i10;
                    i6 = -1;
                }
                if (hVar.r(i9) != hVar2.r(i9)) {
                    int i15 = 1;
                    for (int i16 = i5 + 1; i16 < i11; i16++) {
                        if (((h) list3.get(i16 - 1)).r(i9) != ((h) list3.get(i16)).r(i9)) {
                            i15++;
                        }
                    }
                    long b2 = b(eVar3) + j2 + ((long) 2) + ((long) (i15 * 2));
                    eVar3.w0(i15);
                    eVar3.w0(i6);
                    for (int i17 = i5; i17 < i11; i17++) {
                        byte r = ((h) list3.get(i17)).r(i9);
                        if (i17 == i5 || r != ((h) list3.get(i17 - 1)).r(i9)) {
                            eVar3.w0(r & ExifInterface.MARKER);
                        }
                    }
                    e eVar4 = new e();
                    while (i5 < i11) {
                        byte r2 = ((h) list3.get(i5)).r(i9);
                        int i18 = i5 + 1;
                        int i19 = i18;
                        while (true) {
                            if (i19 >= i11) {
                                i7 = i11;
                                break;
                            } else if (r2 != ((h) list3.get(i19)).r(i9)) {
                                i7 = i19;
                                break;
                            } else {
                                i19++;
                            }
                        }
                        if (i18 == i7 && i9 + 1 == ((h) list3.get(i5)).l()) {
                            eVar3.w0(list4.get(i5).intValue());
                            i8 = i7;
                            eVar2 = eVar4;
                        } else {
                            eVar3.w0(((int) (b(eVar4) + b2)) * i13);
                            i8 = i7;
                            eVar2 = eVar4;
                            a(b2, eVar4, i9 + 1, list, i5, i7, list2);
                        }
                        eVar4 = eVar2;
                        i5 = i8;
                        i13 = -1;
                    }
                    eVar3.n(eVar4);
                    return;
                }
                int min = Math.min(hVar.l(), hVar2.l());
                int i20 = i9;
                int i21 = 0;
                while (i20 < min && hVar.r(i20) == hVar2.r(i20)) {
                    i21++;
                    i20++;
                }
                long b3 = b(eVar3) + j2 + ((long) 2) + ((long) i21) + 1;
                eVar3.w0(-i21);
                eVar3.w0(i6);
                int i22 = i9 + i21;
                while (i9 < i22) {
                    eVar3.w0(hVar.r(i9) & ExifInterface.MARKER);
                    i9++;
                }
                if (i5 + 1 == i11) {
                    if (i22 == ((h) list3.get(i5)).l()) {
                        eVar3.w0(list4.get(i5).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                e eVar5 = new e();
                eVar3.w0(((int) (b(eVar5) + b3)) * -1);
                a(b3, eVar5, i22, list, i5, i4, list2);
                eVar3.n(eVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long b(e eVar) {
            return eVar.f10453i / ((long) 4);
        }

        public final q c(h... hVarArr) {
            int i2;
            h[] hVarArr2 = hVarArr;
            i.e(hVarArr2, "byteStrings");
            int i3 = 0;
            if (hVarArr2.length == 0) {
                return new q(new h[0], new int[]{0, -1}, (DefaultConstructorMarker) null);
            }
            List h3 = b.q.a.a.h3(hVarArr);
            i.e(h3, "$this$sort");
            ArrayList arrayList = (ArrayList) h3;
            if (arrayList.size() > 1) {
                Collections.sort(h3);
            }
            ArrayList arrayList2 = new ArrayList(hVarArr2.length);
            for (h hVar : hVarArr2) {
                arrayList2.add(-1);
            }
            Object[] array = arrayList2.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Integer[] numArr = (Integer[]) array;
            List F = g.F((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = hVarArr2.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                h hVar2 = hVarArr2[i4];
                int i6 = i5 + 1;
                int size = arrayList.size();
                i.e(h3, "$this$binarySearch");
                int size2 = arrayList.size();
                if (size < 0) {
                    throw new IllegalArgumentException("fromIndex (" + 0 + ") is greater than toIndex (" + size + ").");
                } else if (size <= size2) {
                    int i7 = size - 1;
                    int i8 = 0;
                    while (true) {
                        if (i8 > i7) {
                            i2 = -(i8 + 1);
                            break;
                        }
                        i2 = (i8 + i7) >>> 1;
                        int D = b.q.a.a.D((Comparable) arrayList.get(i2), hVar2);
                        if (D >= 0) {
                            if (D <= 0) {
                                break;
                            }
                            i7 = i2 - 1;
                        } else {
                            i8 = i2 + 1;
                        }
                    }
                    F.set(i2, Integer.valueOf(i5));
                    i4++;
                    i5 = i6;
                } else {
                    throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                }
            }
            if (((h) arrayList.get(0)).l() > 0) {
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    h hVar3 = (h) arrayList.get(i9);
                    int i10 = i9 + 1;
                    int i11 = i10;
                    while (i11 < arrayList.size()) {
                        h hVar4 = (h) arrayList.get(i11);
                        Objects.requireNonNull(hVar4);
                        i.e(hVar3, "prefix");
                        if (!hVar4.u(0, hVar3, 0, hVar3.l())) {
                            continue;
                            break;
                        }
                        if (!(hVar4.l() != hVar3.l())) {
                            throw new IllegalArgumentException(("duplicate option: " + hVar4).toString());
                        } else if (((Number) F.get(i11)).intValue() > ((Number) F.get(i9)).intValue()) {
                            arrayList.remove(i11);
                            F.remove(i11);
                        } else {
                            i11++;
                        }
                    }
                    i9 = i10;
                }
                e eVar = new e();
                a(0, eVar, 0, h3, 0, arrayList.size(), F);
                int[] iArr = new int[((int) b(eVar))];
                while (!eVar.D()) {
                    iArr[i3] = eVar.readInt();
                    i3++;
                }
                Object[] copyOf = Arrays.copyOf(hVarArr2, hVarArr2.length);
                i.d(copyOf, "java.util.Arrays.copyOf(this, size)");
                return new q((h[]) copyOf, iArr, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }

    public q(h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f10478h = hVarArr;
        this.f10479i = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return super.contains((h) obj);
        }
        return false;
    }

    public int d() {
        return this.f10478h.length;
    }

    public Object get(int i2) {
        return this.f10478h[i2];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }
}
