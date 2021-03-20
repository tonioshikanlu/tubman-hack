package b.l.d.v;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import b.l.a.c.f.f.g;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

public final class y0 {
    @Nullable
    public static x0 b(SharedPreferences sharedPreferences, String str) {
        long j2;
        String string = sharedPreferences.getString(x.d(str, "|P|"), (String) null);
        String string2 = sharedPreferences.getString(x.d(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair k2 = k(string, string2);
        String string3 = sharedPreferences.getString(x.d(str, "cre"), (String) null);
        if (string3 != null) {
            try {
                j2 = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
            return new x0(k2, j2);
        }
        j2 = 0;
        return new x0(k2, j2);
    }

    public static x0 d(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new d("Invalid properties file");
        }
        try {
            return new x0(k(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e2) {
            throw new d((Exception) e2);
        }
    }

    public static void f(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                g.a.a(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    public static void g(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                g.a.a(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    public static File i(Context context) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context);
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    public static KeyPair k(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new d((Exception) e2);
            }
        } catch (IllegalArgumentException e3) {
            throw new d((Exception) e3);
        }
    }

    public static File m(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
        return new File(i(context), str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b1, code lost:
        if (r9 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        g(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        f(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        throw r11;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.d.v.x0 a(android.content.Context r9, java.lang.String r10, b.l.d.v.x0 r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = "Writing key to properties file"
            android.util.Log.d(r0, r2)
        L_0x000e:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.security.KeyPair r3 = r11.a
            java.security.PublicKey r3 = r3.getPublic()
            byte[] r3 = r3.getEncoded()
            r4 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)
            java.lang.String r5 = "pub"
            r2.setProperty(r5, r3)
            java.security.KeyPair r3 = r11.a
            java.security.PrivateKey r3 = r3.getPrivate()
            byte[] r3 = r3.getEncoded()
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)
            java.lang.String r4 = "pri"
            r2.setProperty(r4, r3)
            long r3 = r11.f5349b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "cre"
            r2.setProperty(r4, r3)
            java.io.File r9 = m(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch:{ IOException -> 0x00be }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00be }
            java.lang.String r4 = "rw"
            r3.<init>(r9, r4)     // Catch:{ IOException -> 0x00be }
            java.nio.channels.FileChannel r9 = r3.getChannel()     // Catch:{ all -> 0x00b7 }
            r9.lock()     // Catch:{ all -> 0x00ae }
            r4 = 0
            if (r12 == 0) goto L_0x009d
            long r6 = r9.size()     // Catch:{ all -> 0x00ae }
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x009d
            r9.position(r4)     // Catch:{ IOException -> 0x0078, d -> 0x0076 }
            b.l.d.v.x0 r11 = d(r9)     // Catch:{ IOException -> 0x0078, d -> 0x0076 }
            g(r10, r9)     // Catch:{ all -> 0x00b7 }
            f(r10, r3)     // Catch:{ IOException -> 0x00be }
            return r11
        L_0x0076:
            r12 = move-exception
            goto L_0x0079
        L_0x0078:
            r12 = move-exception
        L_0x0079:
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x009d
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00ae }
            int r1 = r12.length()     // Catch:{ all -> 0x00ae }
            int r1 = r1 + 64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ae }
            r6.<init>(r1)     // Catch:{ all -> 0x00ae }
            java.lang.String r1 = "Tried reading key pair before writing new one, but failed with: "
            r6.append(r1)     // Catch:{ all -> 0x00ae }
            r6.append(r12)     // Catch:{ all -> 0x00ae }
            java.lang.String r12 = r6.toString()     // Catch:{ all -> 0x00ae }
            android.util.Log.d(r0, r12)     // Catch:{ all -> 0x00ae }
        L_0x009d:
            r9.position(r4)     // Catch:{ all -> 0x00ae }
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ all -> 0x00ae }
            r2.store(r12, r10)     // Catch:{ all -> 0x00ae }
            g(r10, r9)     // Catch:{ all -> 0x00b7 }
            f(r10, r3)     // Catch:{ IOException -> 0x00be }
            return r11
        L_0x00ae:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r12 = move-exception
            if (r9 == 0) goto L_0x00b6
            g(r11, r9)     // Catch:{ all -> 0x00b7 }
        L_0x00b6:
            throw r12     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r11 = move-exception
            f(r9, r3)     // Catch:{ IOException -> 0x00be }
            throw r11     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            r9 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            int r11 = r11 + 21
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Failed to write key: "
            r12.append(r11)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            android.util.Log.w(r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.v.y0.a(android.content.Context, java.lang.String, b.l.d.v.x0, boolean):b.l.d.v.x0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r8 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        g(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0032, code lost:
        b.l.a.c.f.f.g.a.a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.d.v.x0 c(java.io.File r8) {
        /*
            r7 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ all -> 0x002a }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r8
            r1.lock(r2, r4, r6)     // Catch:{ all -> 0x0021 }
            b.l.d.v.x0 r1 = d(r8)     // Catch:{ all -> 0x0021 }
            r2 = 0
            g(r2, r8)     // Catch:{ all -> 0x002a }
            r0.close()
            return r1
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r2 = move-exception
            if (r8 == 0) goto L_0x0029
            g(r1, r8)     // Catch:{ all -> 0x002a }
        L_0x0029:
            throw r2     // Catch:{ all -> 0x002a }
        L_0x002a:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x002c }
        L_0x002c:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0031 }
            goto L_0x0037
        L_0x0031:
            r0 = move-exception
            b.l.a.c.f.f.f r2 = b.l.a.c.f.f.g.a
            r2.a(r8, r0)
        L_0x0037:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.v.y0.c(java.io.File):b.l.d.v.x0");
    }

    public final void e(Context context, String str, x0 x0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (x0Var.equals(b(sharedPreferences, str))) {
                return;
            }
        } catch (d unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(x.d(str, "|P|"), Base64.encodeToString(x0Var.a.getPublic().getEncoded(), 11));
        edit.putString(x.d(str, "|K|"), Base64.encodeToString(x0Var.a.getPrivate().getEncoded(), 11));
        edit.putString(x.d(str, "cre"), String.valueOf(x0Var.f5349b));
        edit.commit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0026 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.d.v.x0 h(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            b.l.d.v.x0 r1 = r4.l(r5, r6)     // Catch:{ d -> 0x000e }
            if (r1 == 0) goto L_0x000c
            r4.e(r5, r6, r1)     // Catch:{ d -> 0x000e }
            r0 = r1
            goto L_0x0024
        L_0x000c:
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = move-exception
        L_0x000f:
            java.lang.String r2 = "com.google.android.gms.appid"
            r3 = 0
            android.content.SharedPreferences r2 = r5.getSharedPreferences(r2, r3)     // Catch:{ d -> 0x0021 }
            b.l.d.v.x0 r2 = b(r2, r6)     // Catch:{ d -> 0x0021 }
            if (r2 == 0) goto L_0x0022
            r4.a(r5, r6, r2, r3)     // Catch:{ d -> 0x0021 }
            r0 = r2
            goto L_0x0024
        L_0x0021:
            r1 = move-exception
        L_0x0022:
            if (r1 != 0) goto L_0x002c
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return r0
        L_0x0027:
            b.l.d.v.x0 r5 = r4.j(r5, r6)
            return r5
        L_0x002c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.v.y0.h(android.content.Context, java.lang.String):b.l.d.v.x0");
    }

    @WorkerThread
    public final x0 j(Context context, String str) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(2048);
            x0 x0Var = new x0(instance.generateKeyPair(), System.currentTimeMillis());
            x0 a = a(context, str, x0Var, true);
            if (a == null || a.equals(x0Var)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Generated new key");
                }
                e(context, str, x0Var);
                return x0Var;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }
            return a;
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    @Nullable
    public final x0 l(Context context, String str) {
        File m2 = m(context, str);
        if (!m2.exists()) {
            return null;
        }
        try {
            return c(m2);
        } catch (d | IOException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return c(m2);
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(e3);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new d((Exception) e3);
            }
        }
    }
}
