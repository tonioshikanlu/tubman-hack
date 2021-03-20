package androidx.core.content;

import android.content.ContentValues;
import e.j;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Le/j;", "", "", "pairs", "Landroid/content/ContentValues;", "contentValuesOf", "([Lkotlin/Pair;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(j<String, ? extends Object>... jVarArr) {
        i.f(jVarArr, "pairs");
        ContentValues contentValues = new ContentValues(jVarArr.length);
        for (j<String, ? extends Object> jVar : jVarArr) {
            String str = (String) jVar.f7906h;
            B b2 = jVar.f7907i;
            if (b2 == null) {
                contentValues.putNull(str);
            } else if (b2 instanceof String) {
                contentValues.put(str, (String) b2);
            } else if (b2 instanceof Integer) {
                contentValues.put(str, (Integer) b2);
            } else if (b2 instanceof Long) {
                contentValues.put(str, (Long) b2);
            } else if (b2 instanceof Boolean) {
                contentValues.put(str, (Boolean) b2);
            } else if (b2 instanceof Float) {
                contentValues.put(str, (Float) b2);
            } else if (b2 instanceof Double) {
                contentValues.put(str, (Double) b2);
            } else if (b2 instanceof byte[]) {
                contentValues.put(str, (byte[]) b2);
            } else if (b2 instanceof Byte) {
                contentValues.put(str, (Byte) b2);
            } else if (b2 instanceof Short) {
                contentValues.put(str, (Short) b2);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b2.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return contentValues;
    }
}
