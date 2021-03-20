package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.util.Pair;
import b.e.a.a.a;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.utils.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

public class NetworkFetcher {
    private final Context appContext;
    @Nullable
    private final NetworkCache networkCache;
    private final String url;

    private NetworkFetcher(Context context, String str, @Nullable String str2) {
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.url = str;
        if (str2 == null) {
            this.networkCache = null;
        } else {
            this.networkCache = new NetworkCache(applicationContext);
        }
    }

    @WorkerThread
    @Nullable
    private LottieComposition fetchFromCache() {
        Pair<FileExtension, InputStream> fetch;
        NetworkCache networkCache2 = this.networkCache;
        if (networkCache2 == null || (fetch = networkCache2.fetch(this.url)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) fetch.first;
        InputStream inputStream = (InputStream) fetch.second;
        LottieResult<LottieComposition> fromZipStreamSync = fileExtension == FileExtension.ZIP ? LottieCompositionFactory.fromZipStreamSync(new ZipInputStream(inputStream), this.url) : LottieCompositionFactory.fromJsonInputStreamSync(inputStream, this.url);
        if (fromZipStreamSync.getValue() != null) {
            return fromZipStreamSync.getValue();
        }
        return null;
    }

    @WorkerThread
    private LottieResult<LottieComposition> fetchFromNetwork() {
        try {
            return fetchFromNetworkInternal();
        } catch (IOException e2) {
            return new LottieResult<>((Throwable) e2);
        }
    }

    @WorkerThread
    private LottieResult<LottieComposition> fetchFromNetworkInternal() {
        StringBuilder y = a.y("Fetching ");
        y.append(this.url);
        Logger.debug(y.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.url).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    LottieResult<LottieComposition> resultFromConnection = getResultFromConnection(httpURLConnection);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    sb.append(resultFromConnection.getValue() != null);
                    Logger.debug(sb.toString());
                    httpURLConnection.disconnect();
                    return resultFromConnection;
                }
            }
            String errorFromConnection = getErrorFromConnection(httpURLConnection);
            return new LottieResult<>((Throwable) new IllegalArgumentException("Unable to fetch " + this.url + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + errorFromConnection));
        } catch (Exception e2) {
            return new LottieResult<>((Throwable) e2);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public static LottieResult<LottieComposition> fetchSync(Context context, String str, @Nullable String str2) {
        return new NetworkFetcher(context, str, str2).fetchSync();
    }

    private String getErrorFromConnection(HttpURLConnection httpURLConnection) {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Nullable
    private LottieResult<LottieComposition> getResultFromConnection(HttpURLConnection httpURLConnection) {
        LottieResult<LottieComposition> lottieResult;
        FileExtension fileExtension;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            Logger.debug("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            NetworkCache networkCache2 = this.networkCache;
            lottieResult = networkCache2 == null ? LottieCompositionFactory.fromZipStreamSync(new ZipInputStream(httpURLConnection.getInputStream()), (String) null) : LottieCompositionFactory.fromZipStreamSync(new ZipInputStream(new FileInputStream(networkCache2.writeTempCacheFile(this.url, httpURLConnection.getInputStream(), fileExtension))), this.url);
        } else {
            Logger.debug("Received json response.");
            fileExtension = FileExtension.JSON;
            NetworkCache networkCache3 = this.networkCache;
            lottieResult = networkCache3 == null ? LottieCompositionFactory.fromJsonInputStreamSync(httpURLConnection.getInputStream(), (String) null) : LottieCompositionFactory.fromJsonInputStreamSync(new FileInputStream(new File(networkCache3.writeTempCacheFile(this.url, httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.url);
        }
        if (!(this.networkCache == null || lottieResult.getValue() == null)) {
            this.networkCache.renameTempFile(this.url, fileExtension);
        }
        return lottieResult;
    }

    @WorkerThread
    public LottieResult<LottieComposition> fetchSync() {
        LottieComposition fetchFromCache = fetchFromCache();
        if (fetchFromCache != null) {
            return new LottieResult<>(fetchFromCache);
        }
        StringBuilder y = a.y("Animation for ");
        y.append(this.url);
        y.append(" not found in cache. Fetching from network.");
        Logger.debug(y.toString());
        return fetchFromNetwork();
    }
}
