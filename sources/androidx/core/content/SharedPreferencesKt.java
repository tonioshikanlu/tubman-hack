package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import e.r;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Le/r;", "action", "edit", "(Landroid/content/SharedPreferences;ZLe/x/b/l;)V", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(SharedPreferences sharedPreferences, boolean z, l<? super SharedPreferences.Editor, r> lVar) {
        i.f(sharedPreferences, "$this$edit");
        i.f(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        i.b(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        i.f(sharedPreferences, "$this$edit");
        i.f(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        i.b(edit, "editor");
        lVar.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
