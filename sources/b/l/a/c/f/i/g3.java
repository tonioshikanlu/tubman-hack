package b.l.a.c.f.i;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class g3 implements t3 {

    /* renamed from: h  reason: collision with root package name */
    public final Context f3567h;

    public g3(Context context) {
        this.f3567h = context;
    }

    /* JADX INFO: finally extract failed */
    public final Object a() {
        r3 r3Var;
        BufferedReader bufferedReader;
        r3 r3Var2 = q3.f3701h;
        Context context = this.f3567h;
        Object obj = o3.f;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        if (!str.equals("eng") && !str.equals("userdebug")) {
            return r3Var2;
        }
        if (!str2.contains("dev-keys") && !str2.contains("test-keys")) {
            return r3Var2;
        }
        if (!context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            r3Var = file.exists() ? new s3(file) : r3Var2;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (RuntimeException e2) {
            Log.e("HermeticFileOverrides", "no data dir", e2);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            r3Var = r3Var2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        if (!r3Var.a()) {
            return r3Var2;
        }
        File file2 = (File) r3Var.b();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                    } else {
                        String str3 = new String(split[0]);
                        String decode = Uri.decode(new String(split[1]));
                        String str4 = (String) hashMap2.get(split[2]);
                        if (str4 == null) {
                            String str5 = new String(split[2]);
                            str4 = Uri.decode(str5);
                            if (str4.length() < 1024 || str4 == str5) {
                                hashMap2.put(str5, str4);
                            }
                        }
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new HashMap());
                        }
                        ((Map) hashMap.get(str3)).put(decode, str4);
                    }
                } else {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf);
                    Log.i("HermeticFileOverrides", sb.toString());
                    d3 d3Var = new d3(hashMap);
                    bufferedReader.close();
                    return new s3(d3Var);
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        } catch (Throwable th2) {
            d4.a.a(th, th2);
        }
        throw th;
    }
}
