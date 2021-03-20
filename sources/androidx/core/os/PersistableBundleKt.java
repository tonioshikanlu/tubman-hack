package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import e.j;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Le/j;", "", "", "pairs", "Landroid/os/PersistableBundle;", "persistableBundleOf", "([Lkotlin/Pair;)Landroid/os/PersistableBundle;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class PersistableBundleKt {
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf(j<String, ? extends Object>... jVarArr) {
        i.f(jVarArr, "pairs");
        PersistableBundle persistableBundle = new PersistableBundle(jVarArr.length);
        for (j<String, ? extends Object> jVar : jVarArr) {
            String str = (String) jVar.f7906h;
            B b2 = jVar.f7907i;
            if (b2 == null) {
                persistableBundle.putString(str, (String) null);
            } else if (b2 instanceof Boolean) {
                persistableBundle.putBoolean(str, ((Boolean) b2).booleanValue());
            } else if (b2 instanceof Double) {
                persistableBundle.putDouble(str, ((Number) b2).doubleValue());
            } else if (b2 instanceof Integer) {
                persistableBundle.putInt(str, ((Number) b2).intValue());
            } else if (b2 instanceof Long) {
                persistableBundle.putLong(str, ((Number) b2).longValue());
            } else if (b2 instanceof String) {
                persistableBundle.putString(str, (String) b2);
            } else if (b2 instanceof boolean[]) {
                persistableBundle.putBooleanArray(str, (boolean[]) b2);
            } else if (b2 instanceof double[]) {
                persistableBundle.putDoubleArray(str, (double[]) b2);
            } else if (b2 instanceof int[]) {
                persistableBundle.putIntArray(str, (int[]) b2);
            } else if (b2 instanceof long[]) {
                persistableBundle.putLongArray(str, (long[]) b2);
            } else if (b2 instanceof Object[]) {
                Class<?> componentType = b2.getClass().getComponentType();
                if (componentType != null) {
                    i.b(componentType, "value::class.java.componentType!!");
                    if (String.class.isAssignableFrom(componentType)) {
                        persistableBundle.putStringArray(str, (String[]) b2);
                    } else {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                } else {
                    i.l();
                    throw null;
                }
            } else {
                throw new IllegalArgumentException("Illegal value type " + b2.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return persistableBundle;
    }
}
