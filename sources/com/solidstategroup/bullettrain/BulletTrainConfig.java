package com.solidstategroup.bullettrain;

import java.util.concurrent.TimeUnit;
import n.c0;
import n.z;

public final class BulletTrainConfig {
    /* access modifiers changed from: private */
    public static final z DEFAULT_BASE_URI = z.h("https://api.bullet-train.io/api/v1/");
    private static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 2000;
    private static final int DEFAULT_READ_TIMEOUT_MILLIS = 5000;
    private static final int DEFAULT_WRITE_TIMEOUT_MILLIS = 5000;
    private final z baseURI;
    public final z flagsURI;
    public final c0 httpClient;
    public final z identitiesURI;

    public static class Builder {
        /* access modifiers changed from: private */
        public z baseURI;
        /* access modifiers changed from: private */
        public int connectTimeoutMillis;
        /* access modifiers changed from: private */
        public z flagsURI;
        /* access modifiers changed from: private */
        public z identitiesURI;
        /* access modifiers changed from: private */
        public int readTimeoutMillis;
        /* access modifiers changed from: private */
        public int writeTimeoutMillis;

        private Builder() {
            z access$700 = BulletTrainConfig.DEFAULT_BASE_URI;
            this.baseURI = access$700;
            this.flagsURI = access$700.g("flags/").b();
            this.identitiesURI = this.baseURI.g("identities/").b();
            this.connectTimeoutMillis = 2000;
            this.writeTimeoutMillis = 5000;
            this.readTimeoutMillis = 5000;
        }

        public Builder baseURI(String str) {
            if (str != null) {
                this.baseURI = z.h(str);
            }
            return this;
        }

        public BulletTrainConfig build() {
            return new BulletTrainConfig(this);
        }

        public Builder connectTimeout(int i2) {
            this.connectTimeoutMillis = i2;
            return this;
        }

        public Builder readTimeout(int i2) {
            this.readTimeoutMillis = i2;
            return this;
        }

        public Builder writeTimeout(int i2) {
            this.writeTimeoutMillis = i2;
            return this;
        }
    }

    public BulletTrainConfig(Builder builder) {
        this.baseURI = builder.baseURI;
        this.flagsURI = builder.flagsURI;
        this.identitiesURI = builder.identitiesURI;
        c0.a aVar = new c0.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.a((long) builder.connectTimeoutMillis, timeUnit);
        aVar.c((long) builder.writeTimeoutMillis, timeUnit);
        aVar.b((long) builder.readTimeoutMillis, timeUnit);
        this.httpClient = new c0(aVar);
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
