package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004H\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "body", "transaction", "(Landroid/database/sqlite/SQLiteDatabase;ZLe/x/b/l;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z, l<? super SQLiteDatabase, ? extends T> lVar) {
        i.f(sQLiteDatabase, "$this$transaction");
        i.f(lVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        i.f(sQLiteDatabase, "$this$transaction");
        i.f(lVar, "body");
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
