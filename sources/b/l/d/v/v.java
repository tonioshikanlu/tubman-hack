package b.l.d.v;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import b.l.a.c.f.f.a;
import b.l.d.v.o0;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class v extends a {
    public final /* synthetic */ w a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(w wVar, Looper looper) {
        super(looper);
        this.a = wVar;
    }

    public final void handleMessage(Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Bundle bundle;
        String str8;
        w wVar = this.a;
        Objects.requireNonNull(wVar);
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new o0.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof o0) {
                        wVar.f = (o0) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        wVar.f5347e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    str6 = intent2.getStringExtra("registration_id");
                    if (str6 == null) {
                        str6 = intent2.getStringExtra("unregistered");
                    }
                    if (str6 == null) {
                        String stringExtra = intent2.getStringExtra("error");
                        if (stringExtra == null) {
                            str2 = "FirebaseInstanceId";
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            str = sb.toString();
                        } else {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Received InstanceID error ".concat(stringExtra) : new String("Received InstanceID error "));
                            }
                            if (stringExtra.startsWith("|")) {
                                String[] split = stringExtra.split("\\|");
                                if (split.length <= 2 || !"ID".equals(split[1])) {
                                    str2 = "FirebaseInstanceId";
                                    str = stringExtra.length() != 0 ? "Unexpected structured response ".concat(stringExtra) : new String("Unexpected structured response ");
                                } else {
                                    str8 = split[2];
                                    String str9 = split[3];
                                    if (str9.startsWith(":")) {
                                        str9 = str9.substring(1);
                                    }
                                    bundle = intent2.putExtra("error", str9).getExtras();
                                }
                            } else {
                                synchronized (wVar.a) {
                                    for (int i2 = 0; i2 < wVar.a.size(); i2++) {
                                        wVar.a(wVar.a.keyAt(i2), intent2.getExtras());
                                    }
                                }
                                return;
                            }
                        }
                        Log.w(str2, str);
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(str6);
                    if (matcher.matches()) {
                        str8 = matcher.group(1);
                        String group = matcher.group(2);
                        bundle = intent2.getExtras();
                        bundle.putString("registration_id", group);
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        str3 = "FirebaseInstanceId";
                        str7 = "Unexpected response string: ";
                        if (str6.length() == 0) {
                            str5 = new String(str7);
                            str4 = str5;
                            Log.d(str3, str4);
                            return;
                        }
                    } else {
                        return;
                    }
                    wVar.a(str8, bundle);
                    return;
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    str3 = "FirebaseInstanceId";
                    str7 = "Unexpected response action: ";
                    str6 = String.valueOf(action);
                    if (str6.length() == 0) {
                        str5 = new String(str7);
                        str4 = str5;
                        Log.d(str3, str4);
                        return;
                    }
                } else {
                    return;
                }
                str4 = str7.concat(str6);
                Log.d(str3, str4);
                return;
            }
        }
        str2 = "FirebaseInstanceId";
        str = "Dropping invalid message";
        Log.w(str2, str);
    }
}
