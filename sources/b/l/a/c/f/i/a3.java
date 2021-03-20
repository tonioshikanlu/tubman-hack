package b.l.a.c.f.i;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

public final /* synthetic */ class a3 implements z2 {
    public final c3 a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3484b;

    public a3(c3 c3Var, String str) {
        this.a = c3Var;
        this.f3484b = str;
    }

    public final Object a() {
        String str;
        c3 c3Var = this.a;
        String str2 = this.f3484b;
        ContentResolver contentResolver = c3Var.a.getContentResolver();
        Uri uri = t2.a;
        synchronized (t2.class) {
            if (t2.f == null) {
                t2.f3752e.set(false);
                t2.f = new HashMap<>();
                t2.f3757k = new Object();
                contentResolver.registerContentObserver(t2.a, true, new s2());
            } else if (t2.f3752e.getAndSet(false)) {
                t2.f.clear();
                t2.f3753g.clear();
                t2.f3754h.clear();
                t2.f3755i.clear();
                t2.f3756j.clear();
                t2.f3757k = new Object();
            }
            Object obj = t2.f3757k;
            str = null;
            if (t2.f.containsKey(str2)) {
                String str3 = t2.f.get(str2);
                if (str3 != null) {
                    str = str3;
                }
            } else {
                int length = t2.f3758l.length;
                Cursor query = contentResolver.query(t2.a, (String[]) null, (String) null, new String[]{str2}, (String) null);
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            t2.a(obj, str2, (String) null);
                        } else {
                            String string = query.getString(1);
                            if (string != null && string.equals((Object) null)) {
                                string = null;
                            }
                            t2.a(obj, str2, string);
                            if (string != null) {
                                str = string;
                            }
                        }
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return str;
    }
}
