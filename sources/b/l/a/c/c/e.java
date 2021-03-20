package b.l.a.c.c;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.g.a.h.n;
import b.l.a.c.c.l.k.a1;
import b.l.a.c.c.l.k.b1;
import b.l.a.c.c.m.f;
import b.l.a.c.c.m.x;
import b.l.a.c.f.c.c;

public class e extends f {
    public static final Object c = new Object();
    public static final e d = new e();

    @SuppressLint({"HandlerLeak"})
    public class a extends c {
        public final Context a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i2);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int d = e.this.d(this.a);
            if (e.this.c(d)) {
                e eVar = e.this;
                Context context = this.a;
                Intent a2 = eVar.a(context, d, n.f437k);
                eVar.i(context, d, a2 == null ? null : PendingIntent.getActivity(context, 0, a2, 134217728));
            }
        }
    }

    public static Dialog f(Context context, int i2, f fVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(b.l.a.c.c.m.e.c(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b2 = b.l.a.c.c.m.e.b(context, i2);
        if (b2 != null) {
            builder.setPositiveButton(b2, fVar);
        }
        String d2 = b.l.a.c.c.m.e.d(context, i2);
        if (d2 != null) {
            builder.setTitle(d2);
        }
        return builder.create();
    }

    public static void h(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            k kVar = new k();
            b.l.a.c.b.a.B(dialog, "Cannot display null dialog");
            dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            kVar.f2604h = dialog;
            if (onCancelListener != null) {
                kVar.f2605i = onCancelListener;
            }
            kVar.show(supportFragmentManager, str);
            return;
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        b.l.a.c.b.a.B(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f2591h = dialog;
        if (onCancelListener != null) {
            cVar.f2592i = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @Nullable
    public Intent a(Context context, int i2, @Nullable String str) {
        return super.a(context, i2, str);
    }

    public int b(Context context, int i2) {
        return super.b(context, i2);
    }

    public final boolean c(int i2) {
        return super.c(i2);
    }

    public int d(Context context) {
        return b(context, f.a);
    }

    public boolean e(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog f = f(activity, i2, new x(super.a(activity, i2, "d"), activity, i3), onCancelListener);
        if (f == null) {
            return false;
        }
        h(activity, f, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Nullable
    public final b1 g(Context context, a1 a1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        b1 b1Var = new b1(a1Var);
        context.registerReceiver(b1Var, intentFilter);
        b1Var.a = context;
        if (i.d(context, "com.google.android.gms")) {
            return b1Var;
        }
        a1Var.a();
        b1Var.a();
        return null;
    }

    @TargetApi(20)
    public final void i(Context context, int i2, PendingIntent pendingIntent) {
        int i3;
        if (i2 == 18) {
            new a(context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            String e2 = i2 == 6 ? b.l.a.c.c.m.e.e(context, "common_google_play_services_resolution_required_title") : b.l.a.c.c.m.e.d(context, i2);
            if (e2 == null) {
                e2 = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            String f = (i2 == 6 || i2 == 19) ? b.l.a.c.c.m.e.f(context, "common_google_play_services_resolution_required_text", b.l.a.c.c.m.e.a(context)) : b.l.a.c.c.m.e.c(context, i2);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(e2).setStyle(new NotificationCompat.BigTextStyle().bigText(f));
            if (b.l.a.c.b.a.h0(context)) {
                b.l.a.c.b.a.F(true);
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (b.l.a.c.b.a.i0(context)) {
                    style.addAction(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(f);
            }
            if (b.l.a.c.b.a.d0()) {
                b.l.a.c.b.a.F(b.l.a.c.b.a.d0());
                synchronized (c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                SimpleArrayMap<String, String> simpleArrayMap = b.l.a.c.c.m.e.a;
                String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
                } else {
                    if (!string.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(string);
                    }
                    style.setChannelId("com.google.android.gms.availability");
                }
                notificationManager.createNotificationChannel(notificationChannel);
                style.setChannelId("com.google.android.gms.availability");
            }
            Notification build = style.build();
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                i3 = 10436;
                i.c.set(false);
            } else {
                i3 = 39789;
            }
            notificationManager.notify(i3, build);
        } else if (i2 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
