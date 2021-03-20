package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.util.Pair;
import b.e.a.a.a;
import com.airbnb.lottie.utils.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class NetworkCache {
    private final Context appContext;

    public NetworkCache(Context context) {
        this.appContext = context.getApplicationContext();
    }

    private static String filenameForUrl(String str, FileExtension fileExtension, boolean z) {
        StringBuilder y = a.y("lottie_cache_");
        y.append(str.replaceAll("\\W+", ""));
        y.append(z ? fileExtension.tempExtension() : fileExtension.extension);
        return y.toString();
    }

    @Nullable
    private File getCachedFile(String str) {
        File file = new File(parentDir(), filenameForUrl(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(parentDir(), filenameForUrl(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File parentDir() {
        File file = new File(this.appContext.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void clear() {
        File parentDir = parentDir();
        if (parentDir.exists()) {
            File[] listFiles = parentDir.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File delete : parentDir.listFiles()) {
                    delete.delete();
                }
            }
            parentDir.delete();
        }
    }

    @WorkerThread
    @Nullable
    public Pair<FileExtension, InputStream> fetch(String str) {
        try {
            File cachedFile = getCachedFile(str);
            if (cachedFile == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(cachedFile);
            FileExtension fileExtension = cachedFile.getAbsolutePath().endsWith(".zip") ? FileExtension.ZIP : FileExtension.JSON;
            StringBuilder C = a.C("Cache hit for ", str, " at ");
            C.append(cachedFile.getAbsolutePath());
            Logger.debug(C.toString());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public void renameTempFile(String str, FileExtension fileExtension) {
        File file = new File(parentDir(), filenameForUrl(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        Logger.debug("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            StringBuilder y = a.y("Unable to rename cache file ");
            y.append(file.getAbsolutePath());
            y.append(" to ");
            y.append(file2.getAbsolutePath());
            y.append(".");
            Logger.warning(y.toString());
        }
    }

    public File writeTempCacheFile(String str, InputStream inputStream, FileExtension fileExtension) {
        FileOutputStream fileOutputStream;
        File file = new File(parentDir(), filenameForUrl(str, fileExtension, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
