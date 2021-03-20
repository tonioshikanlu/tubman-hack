package com.segment.analytics;

import android.util.Base64;
import b.e.a.a.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionFactory {
    private static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 15000;
    private static final int DEFAULT_READ_TIMEOUT_MILLIS = 20000;
    public static final String USER_AGENT = "analytics-android/4.9.1-beta";

    private String authorizationHeader(String str) {
        StringBuilder y = a.y("Basic ");
        y.append(Base64.encodeToString((str + ":").getBytes(), 2));
        return y.toString();
    }

    public HttpURLConnection openConnection(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT_MILLIS);
            httpURLConnection.setReadTimeout(DEFAULT_READ_TIMEOUT_MILLIS);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (MalformedURLException e2) {
            throw new IOException(a.m("Attempted to use malformed url: ", str), e2);
        }
    }

    public HttpURLConnection projectSettings(String str) {
        return openConnection("https://cdn-settings.segment.com/v1/projects/" + str + "/settings");
    }

    public HttpURLConnection upload(String str) {
        HttpURLConnection openConnection = openConnection("https://api.segment.io/v1/import");
        openConnection.setRequestProperty("Authorization", authorizationHeader(str));
        openConnection.setRequestProperty("Content-Encoding", "gzip");
        openConnection.setDoOutput(true);
        openConnection.setChunkedStreamingMode(0);
        return openConnection;
    }
}
