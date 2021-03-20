package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import b.l.a.c.b.a;
import b.l.d.v.g0;
import b.l.d.v.k0;
import b.l.d.v.x;
import b.l.d.v.y;
import java.util.Objects;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {
    public static k0 a;

    public static int b(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        k0 k0Var;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            if (a == null) {
                a = new k0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            k0Var = a;
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (k0Var) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
            }
            k0Var.d.add(new g0(intent, goAsync, k0Var.c));
            k0Var.a();
        }
        return -1;
    }

    public final void a(Context context, Intent intent) {
        ComponentName componentName;
        String str = null;
        intent.setComponent((ComponentName) null);
        intent.setPackage(context.getPackageName());
        int i2 = -1;
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(valueOf.length() + stringExtra.length() + 21);
                    sb.append("Received command: ");
                    sb.append(stringExtra);
                    sb.append(" - ");
                    sb.append(valueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                    FirebaseInstanceId.a().o();
                } else if ("SYNC".equals(stringExtra)) {
                    FirebaseInstanceId a2 = FirebaseInstanceId.a();
                    Objects.requireNonNull(a2);
                    x xVar = FirebaseInstanceId.f7351j;
                    synchronized (xVar) {
                        String concat = "".concat("|T|");
                        SharedPreferences.Editor edit = xVar.a.edit();
                        for (String next : xVar.a.getAll().keySet()) {
                            if (next.startsWith(concat)) {
                                edit.remove(next);
                            }
                        }
                        edit.commit();
                    }
                    a2.c();
                }
            }
        } else {
            String stringExtra2 = intent.getStringExtra("gcm.rawData64");
            if (stringExtra2 != null) {
                intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
                intent.removeExtra("gcm.rawData64");
            }
            boolean z = true;
            boolean z2 = a.d0() && context.getApplicationInfo().targetSdkVersion >= 26;
            if ((intent.getFlags() & 268435456) == 0) {
                z = false;
            }
            if (!z2 || z) {
                y a3 = y.a();
                Objects.requireNonNull(a3);
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Starting service");
                }
                a3.d.offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (a3) {
                    String str2 = a3.a;
                    if (str2 != null) {
                        str = str2;
                    } else {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                        if (resolveService != null) {
                            ServiceInfo serviceInfo = resolveService.serviceInfo;
                            if (serviceInfo != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName)) {
                                    String str3 = serviceInfo.name;
                                    if (str3 != null) {
                                        if (str3.startsWith(".")) {
                                            String valueOf2 = String.valueOf(context.getPackageName());
                                            String valueOf3 = String.valueOf(serviceInfo.name);
                                            str = valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
                                        } else {
                                            str = serviceInfo.name;
                                        }
                                        a3.a = str;
                                    }
                                }
                                String str4 = serviceInfo.packageName;
                                String str5 = serviceInfo.name;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 94 + String.valueOf(str5).length());
                                sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                                sb2.append(str4);
                                sb2.append("/");
                                sb2.append(str5);
                                Log.e("FirebaseInstanceId", sb2.toString());
                            }
                        }
                        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", str.length() != 0 ? "Restricting intent to a specific service: ".concat(str) : new String("Restricting intent to a specific service: "));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (a3.b(context)) {
                        componentName = WakefulBroadcastReceiver.startWakefulService(context, intent2);
                    } else {
                        componentName = context.startService(intent2);
                        Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentName == null) {
                        Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    }
                } catch (SecurityException e2) {
                    Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
                    i2 = 401;
                } catch (IllegalStateException e3) {
                    String valueOf4 = String.valueOf(e3);
                    StringBuilder sb3 = new StringBuilder(valueOf4.length() + 45);
                    sb3.append("Failed to start service while in background: ");
                    sb3.append(valueOf4);
                    Log.e("FirebaseInstanceId", sb3.toString());
                    i2 = 402;
                }
                if (a.d0() && i2 == 402) {
                    b(this, context, intent);
                    i2 = 403;
                }
            } else {
                b(this, context, intent);
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(i2);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                a(context, intent2);
            } else {
                a(context, intent);
            }
        }
    }
}
