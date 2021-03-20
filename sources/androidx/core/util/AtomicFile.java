package androidx.core.util;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AtomicFile {
    private final File mBackupName;
    private final File mBaseName;

    public AtomicFile(@NonNull File file) {
        this.mBaseName = file;
        this.mBackupName = new File(file.getPath() + ".bak");
    }

    private static boolean sync(@NonNull FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void delete() {
        this.mBaseName.delete();
        this.mBackupName.delete();
    }

    public void failWrite(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            sync(fileOutputStream);
            try {
                fileOutputStream.close();
                this.mBaseName.delete();
                this.mBackupName.renameTo(this.mBaseName);
            } catch (IOException e2) {
                Log.w("AtomicFile", "failWrite: Got exception:", e2);
            }
        }
    }

    public void finishWrite(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            sync(fileOutputStream);
            try {
                fileOutputStream.close();
                this.mBackupName.delete();
            } catch (IOException e2) {
                Log.w("AtomicFile", "finishWrite: Got exception:", e2);
            }
        }
    }

    @NonNull
    public File getBaseFile() {
        return this.mBaseName;
    }

    @NonNull
    public FileInputStream openRead() {
        if (this.mBackupName.exists()) {
            this.mBaseName.delete();
            this.mBackupName.renameTo(this.mBaseName);
        }
        return new FileInputStream(this.mBaseName);
    }

    @NonNull
    public byte[] readFully() {
        FileInputStream openRead = openRead();
        try {
            byte[] bArr = new byte[openRead.available()];
            int i2 = 0;
            while (true) {
                int read = openRead.read(bArr, i2, bArr.length - i2);
                if (read <= 0) {
                    return bArr;
                }
                i2 += read;
                int available = openRead.available();
                if (available > bArr.length - i2) {
                    byte[] bArr2 = new byte[(available + i2)];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    bArr = bArr2;
                }
            }
        } finally {
            openRead.close();
        }
    }

    @NonNull
    public FileOutputStream startWrite() {
        if (this.mBaseName.exists()) {
            if (this.mBackupName.exists()) {
                this.mBaseName.delete();
            } else if (!this.mBaseName.renameTo(this.mBackupName)) {
                StringBuilder y = a.y("Couldn't rename file ");
                y.append(this.mBaseName);
                y.append(" to backup file ");
                y.append(this.mBackupName);
                Log.w("AtomicFile", y.toString());
            }
        }
        try {
            return new FileOutputStream(this.mBaseName);
        } catch (FileNotFoundException unused) {
            if (this.mBaseName.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.mBaseName);
                } catch (FileNotFoundException unused2) {
                    StringBuilder y2 = a.y("Couldn't create ");
                    y2.append(this.mBaseName);
                    throw new IOException(y2.toString());
                }
            } else {
                StringBuilder y3 = a.y("Couldn't create directory ");
                y3.append(this.mBaseName);
                throw new IOException(y3.toString());
            }
        }
    }
}
