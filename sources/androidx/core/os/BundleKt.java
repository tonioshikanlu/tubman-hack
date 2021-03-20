package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import e.j;
import e.x.c.i;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Le/j;", "", "", "pairs", "Landroid/os/Bundle;", "bundleOf", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class BundleKt {
    public static final Bundle bundleOf(j<String, ? extends Object>... jVarArr) {
        i.f(jVarArr, "pairs");
        Bundle bundle = new Bundle(jVarArr.length);
        for (j<String, ? extends Object> jVar : jVarArr) {
            String str = (String) jVar.f7906h;
            B b2 = jVar.f7907i;
            if (b2 == null) {
                bundle.putString(str, (String) null);
            } else if (b2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b2).booleanValue());
            } else if (b2 instanceof Byte) {
                bundle.putByte(str, ((Number) b2).byteValue());
            } else if (b2 instanceof Character) {
                bundle.putChar(str, ((Character) b2).charValue());
            } else if (b2 instanceof Double) {
                bundle.putDouble(str, ((Number) b2).doubleValue());
            } else if (b2 instanceof Float) {
                bundle.putFloat(str, ((Number) b2).floatValue());
            } else if (b2 instanceof Integer) {
                bundle.putInt(str, ((Number) b2).intValue());
            } else if (b2 instanceof Long) {
                bundle.putLong(str, ((Number) b2).longValue());
            } else if (b2 instanceof Short) {
                bundle.putShort(str, ((Number) b2).shortValue());
            } else if (b2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b2);
            } else if (b2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b2);
            } else if (b2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b2);
            } else if (b2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b2);
            } else if (b2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b2);
            } else if (b2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b2);
            } else if (b2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b2);
            } else if (b2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b2);
            } else if (b2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b2);
            } else if (b2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b2);
            } else if (b2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b2);
            } else {
                if (b2 instanceof Object[]) {
                    Class<?> componentType = b2.getClass().getComponentType();
                    if (componentType != null) {
                        i.b(componentType, "value::class.java.componentType!!");
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str, (Parcelable[]) b2);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str, (String[]) b2);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str, (CharSequence[]) b2);
                        } else if (!Serializable.class.isAssignableFrom(componentType)) {
                            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                        }
                    } else {
                        i.l();
                        throw null;
                    }
                } else if (!(b2 instanceof Serializable)) {
                    if (b2 instanceof IBinder) {
                        bundle.putBinder(str, (IBinder) b2);
                    } else if (b2 instanceof Size) {
                        bundle.putSize(str, (Size) b2);
                    } else if (b2 instanceof SizeF) {
                        bundle.putSizeF(str, (SizeF) b2);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + b2.getClass().getCanonicalName() + " for key \"" + str + '\"');
                    }
                }
                bundle.putSerializable(str, (Serializable) b2);
            }
        }
        return bundle;
    }
}
