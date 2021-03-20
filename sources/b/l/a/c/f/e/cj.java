package b.l.a.c.f.e;

import android.text.TextUtils;
import android.util.Log;
import b.l.a.c.b.a;
import b.l.a.c.c.m.l;
import b.l.a.c.c.m.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

public final class cj {
    public final int a;

    public cj(String str) {
        int i2 = -1;
        try {
            List<String> b2 = w1.a("[.-]").b(str);
            if (b2.size() == 1) {
                i2 = Integer.parseInt(str);
            } else if (b2.size() >= 3) {
                i2 = (Integer.parseInt(b2.get(1)) * 1000) + (Integer.parseInt(b2.get(0)) * 1000000) + Integer.parseInt(b2.get(2));
            }
        } catch (IllegalArgumentException e2) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e2}));
            }
        }
        this.a = i2;
    }

    public static String b() {
        String str;
        q qVar = q.c;
        Objects.requireNonNull(qVar);
        a.y("firebase-auth", "Please provide a valid libraryName");
        if (qVar.a.containsKey("firebase-auth")) {
            str = qVar.a.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            String str2 = null;
            try {
                InputStream resourceAsStream = q.class.getResourceAsStream(String.format("/%s.properties", new Object[]{"firebase-auth"}));
                if (resourceAsStream != null) {
                    properties.load(resourceAsStream);
                    str2 = properties.getProperty("version", (String) null);
                    l lVar = q.f2804b;
                    StringBuilder sb = new StringBuilder("firebase-auth".length() + 12 + String.valueOf(str2).length());
                    sb.append("firebase-auth");
                    sb.append(" version is ");
                    sb.append(str2);
                    String sb2 = sb.toString();
                    if (lVar.a(2)) {
                        String str3 = lVar.f2801b;
                        if (str3 != null) {
                            sb2 = str3.concat(sb2);
                        }
                        Log.v("LibraryVersion", sb2);
                    }
                } else {
                    l lVar2 = q.f2804b;
                    String concat = "firebase-auth".length() != 0 ? "Failed to get app version for libraryName: ".concat("firebase-auth") : new String("Failed to get app version for libraryName: ");
                    if (lVar2.a(5)) {
                        String str4 = lVar2.f2801b;
                        if (str4 != null) {
                            concat = str4.concat(concat);
                        }
                        Log.w("LibraryVersion", concat);
                    }
                }
            } catch (IOException e2) {
                l lVar3 = q.f2804b;
                String concat2 = "firebase-auth".length() != 0 ? "Failed to get app version for libraryName: ".concat("firebase-auth") : new String("Failed to get app version for libraryName: ");
                if (lVar3.a(6)) {
                    String str5 = lVar3.f2801b;
                    if (str5 != null) {
                        concat2 = str5.concat(concat2);
                    }
                    Log.e("LibraryVersion", concat2, e2);
                }
            }
            if (str2 == null) {
                l lVar4 = q.f2804b;
                String str6 = ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used";
                if (lVar4.a(3)) {
                    String str7 = lVar4.f2801b;
                    if (str7 != null) {
                        str6 = str7.concat(str6);
                    }
                    Log.d("LibraryVersion", str6);
                }
                str2 = "UNKNOWN";
            }
            qVar.a.put("firebase-auth", str2);
            str = str2;
        }
        return (TextUtils.isEmpty(str) || str.equals("UNKNOWN")) ? "-1" : str;
    }

    public final String a() {
        return String.format("X%s", new Object[]{Integer.toString(this.a)});
    }
}
