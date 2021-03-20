package b.l.a.c.a.a.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class a {
    public static final Lock c = new ReentrantLock();
    public static a d;
    public final Lock a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f2576b;

    public a(Context context) {
        this.f2576b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        Objects.requireNonNull(context, "null reference");
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new a(context.getApplicationContext());
            }
            a aVar = d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public GoogleSignInAccount b() {
        String c2 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 20);
        sb.append("googleSignInAccount");
        sb.append(":");
        sb.append(c2);
        String c3 = c(sb.toString());
        if (c3 == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.W(c3);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.a.lock();
        try {
            return this.f2576b.getString(str, (String) null);
        } finally {
            this.a.unlock();
        }
    }
}
