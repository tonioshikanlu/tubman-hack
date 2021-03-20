package b.g.a.e.f;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import b.e.a.a.a;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Calendar;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

@RequiresApi(api = 19)
public class d {

    /* renamed from: e  reason: collision with root package name */
    public static final String f411e = "d";
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f412b;
    public final j c;
    public final Context d;

    public d(@NonNull Context context, @NonNull j jVar, @NonNull String str) {
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            this.a = trim;
            this.f412b = a.m(trim, "_iv");
            this.d = context;
            this.c = jVar;
            return;
        }
        throw new IllegalArgumentException("RSA and AES Key alias must be valid.");
    }

    @VisibleForTesting
    public byte[] a(byte[] bArr) {
        try {
            Certificate certificate = g().getCertificate();
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, certificate);
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            Log.e(f411e, "The device can't encrypt input using a RSA Key.", e2);
            throw new e(e2);
        } catch (BadPaddingException | IllegalBlockSizeException e3) {
            c();
            throw new c("The RSA decrypted input is invalid.", e3);
        }
    }

    public byte[] b(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(e(), "AES");
            Cipher instance = Cipher.getInstance("AES/GCM/NOPADDING");
            String g2 = this.c.g(this.f412b);
            if (!TextUtils.isEmpty(g2)) {
                instance.init(2, secretKeySpec, new IvParameterSpec(Base64.decode(g2, 0)));
                return instance.doFinal(bArr);
            }
            throw new c("The encryption keys changed recently. You need to re-encrypt something first.", (Throwable) null);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            Log.e(f411e, "Error while decrypting the input.", e2);
            throw new e(e2);
        } catch (BadPaddingException | IllegalBlockSizeException e3) {
            throw new c("The AES encrypted input is corrupted and cannot be recovered. Please discard it.", e3);
        }
    }

    public final void c() {
        this.c.e(this.a);
        this.c.e(this.f412b);
    }

    public byte[] d(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(e(), "AES");
            Cipher instance = Cipher.getInstance("AES/GCM/NOPADDING");
            instance.init(1, secretKeySpec);
            byte[] doFinal = instance.doFinal(bArr);
            this.c.b(this.f412b, new String(Base64.encode(instance.getIV(), 0)));
            return doFinal;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            Log.e(f411e, "Error while encrypting the input.", e2);
            throw new e(e2);
        } catch (BadPaddingException | IllegalBlockSizeException e3) {
            throw new c("The AES decrypted input is invalid.", e3);
        }
    }

    @VisibleForTesting
    public byte[] e() {
        String g2 = this.c.g(this.a);
        if (g2 != null) {
            byte[] decode = Base64.decode(g2, 0);
            try {
                PrivateKey privateKey = g().getPrivateKey();
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(2, privateKey);
                return instance.doFinal(decode);
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
                Log.e(f411e, "The device can't decrypt input using a RSA Key.", e2);
                throw new e(e2);
            } catch (BadPaddingException | IllegalBlockSizeException e3) {
                c();
                throw new c("The RSA encrypted input is corrupted and cannot be recovered. Please discard it.", e3);
            }
        } else {
            try {
                KeyGenerator instance2 = KeyGenerator.getInstance("AES");
                instance2.init(256);
                byte[] encoded = instance2.generateKey().getEncoded();
                this.c.b(this.a, new String(Base64.encode(a(encoded), 0)));
                return encoded;
            } catch (NoSuchAlgorithmException e4) {
                Log.e(f411e, "Error while creating the AES key.", e4);
                throw new e(e4);
            }
        }
    }

    public final KeyStore.PrivateKeyEntry f(KeyStore keyStore) {
        PrivateKey privateKey;
        if (Build.VERSION.SDK_INT < 28 || (privateKey = (PrivateKey) keyStore.getKey(this.a, (char[]) null)) == null) {
            return (KeyStore.PrivateKeyEntry) keyStore.getEntry(this.a, (KeyStore.ProtectionParameter) null);
        }
        return new KeyStore.PrivateKeyEntry(privateKey, new Certificate[]{keyStore.getCertificate(this.a)});
    }

    @VisibleForTesting
    public KeyStore.PrivateKeyEntry g() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            if (instance.containsAlias(this.a)) {
                return f(instance);
            }
            Calendar instance2 = Calendar.getInstance();
            Calendar instance3 = Calendar.getInstance();
            instance3.add(1, 25);
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(this.a, 3).setCertificateSubject(new X500Principal("CN=Auth0.Android,O=Auth0")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance2.getTime()).setCertificateNotAfter(instance3.getTime()).setKeySize(2048).setEncryptionPaddings(new String[]{"PKCS1Padding"}).setBlockModes(new String[]{"ECB"}).build();
            KeyPairGenerator instance4 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance4.initialize(build);
            instance4.generateKeyPair();
            return f(instance);
        } catch (InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e2) {
            Log.e(f411e, "The device can't generate a new RSA Key pair.", e2);
            throw new e(e2);
        } catch (IOException | UnrecoverableEntryException e3) {
            try {
                KeyStore instance5 = KeyStore.getInstance("AndroidKeyStore");
                instance5.load((KeyStore.LoadStoreParameter) null);
                instance5.deleteEntry(this.a);
                Log.d(f411e, "Deleting the existing RSA key pair from the KeyStore.");
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e4) {
                Log.e(f411e, "Failed to remove the RSA KeyEntry from the Android KeyStore.", e4);
            }
            c();
            throw new c("The existing RSA key pair could not be recovered and has been deleted. This occasionally happens when the Lock Screen settings are changed. You can safely retry this operation.", e3);
        }
    }
}
