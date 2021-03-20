package b.l.a.c.i.b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import b.e.a.a.a;
import b.l.a.c.c.p.c;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class m extends g5 {
    public long c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public AccountManager f4137e;
    public Boolean f;

    /* renamed from: g  reason: collision with root package name */
    public long f4138g;

    public m(l4 l4Var) {
        super(l4Var);
    }

    public final boolean i() {
        Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = a.r(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long o() {
        l();
        return this.c;
    }

    public final String p() {
        l();
        return this.d;
    }

    @WorkerThread
    public final long q() {
        h();
        return this.f4138g;
    }

    @WorkerThread
    public final boolean r() {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        h();
        Objects.requireNonNull((c) this.a.f4121n);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f4138g > 86400000) {
            this.f = null;
        }
        Boolean bool3 = this.f;
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(this.a.a, "android.permission.GET_ACCOUNTS") != 0) {
            this.a.a().f4092j.a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f4137e == null) {
                this.f4137e = AccountManager.get(this.a.a);
            }
            try {
                Account[] result = this.f4137e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f4137e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f = bool;
                        this.f4138g = currentTimeMillis;
                        return true;
                    }
                } else {
                    this.f = bool;
                    this.f4138g = currentTimeMillis;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                this.a.a().f4089g.b("Exception checking account types", e2);
            }
        }
        this.f4138g = currentTimeMillis;
        this.f = bool2;
        return false;
    }
}
