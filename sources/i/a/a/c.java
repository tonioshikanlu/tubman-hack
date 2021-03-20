package i.a.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.Locale;
import java.util.zip.ZipFile;

public final class c {
    @SuppressLint({"StaticFieldLeak"})
    public static Application a;

    /* renamed from: b  reason: collision with root package name */
    public static i.a.a.e.a f8043b = new i.a.a.e.a();
    public static final Deque<String> c = new ArrayDeque(50);
    public static WeakReference<Activity> d = new WeakReference<>((Object) null);

    /* renamed from: e  reason: collision with root package name */
    public static boolean f8044e = true;

    public interface a extends Serializable {
        void C();

        void p();

        void s();
    }

    @NonNull
    public static String a(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    @NonNull
    public static String b(@NonNull Context context, @NonNull Intent intent) {
        long j2;
        String str;
        String str2;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        try {
            ZipFile zipFile = new ZipFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir);
            j2 = zipFile.getEntry("classes.dex").getTime();
            zipFile.close();
        } catch (Exception unused) {
            j2 = 0;
        }
        String format = j2 > 312764400000L ? simpleDateFormat.format(new Date(j2)) : null;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused2) {
            str = "Unknown";
        }
        String str3 = "" + "Build version: " + str + " \n";
        if (format != null) {
            str3 = str3 + "Build date: " + format + " \n";
        }
        StringBuilder B = b.e.a.a.a.B(str3, "Current date: ");
        B.append(simpleDateFormat.format(date));
        B.append(" \n");
        StringBuilder B2 = b.e.a.a.a.B(B.toString(), "Device: ");
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        if (str5.startsWith(str4)) {
            str2 = a(str5);
        } else {
            str2 = a(str4) + " " + str5;
        }
        StringBuilder y = b.e.a.a.a.y(b.e.a.a.a.m(b.e.a.a.a.q(B2, str2, " \n \n"), "Stack trace:  \n"));
        y.append(intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        String sb = y.toString();
        String stringExtra = intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG");
        return stringExtra != null ? b.e.a.a.a.m(b.e.a.a.a.m(sb, "\nUser actions: \n"), stringExtra) : sb;
    }

    @Nullable
    public static i.a.a.e.a c(@NonNull Intent intent) {
        i.a.a.e.a aVar = (i.a.a.e.a) intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG");
        if (aVar.f8049l && intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE") != null) {
            StringBuilder y = b.e.a.a.a.y("The previous app process crashed. This is the stack trace of the crash:\n");
            y.append(intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
            Log.e("CustomActivityOnCrash", y.toString());
        }
        return aVar;
    }

    public static void d() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    public static void e(@NonNull Activity activity, @NonNull i.a.a.e.a aVar) {
        Intent intent = new Intent(activity, aVar.f8054q);
        intent.addFlags(270565376);
        if (intent.getComponent() != null) {
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        a aVar2 = aVar.r;
        if (aVar2 != null) {
            aVar2.C();
        }
        activity.finish();
        activity.startActivity(intent);
        d();
    }
}
