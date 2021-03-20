package com.wuman.android.auth;

import android.os.Handler;
import android.os.Looper;
import b.l.b.a.a.b.k;
import com.wuman.android.auth.oauth2.explicit.LenientTokenResponseException;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OAuthManager {
    public static final Logger LOGGER = Logger.getLogger("OAuthAndroid");
    public final ExecutorService mExecutor;
    public final AuthorizationFlow mFlow;
    public final Handler mMainHandler = new Handler(Looper.getMainLooper());
    public final AuthorizationUIController mUIController;

    public abstract class BaseFutureTask<T> extends FutureTask<T> {
        public final Handler mHandler;

        public BaseFutureTask(Handler handler) {
            super(new Callable<T>(OAuthManager.this) {
                public T call() {
                    throw new IllegalStateException("this should never be called");
                }
            });
            this.mHandler = handler;
        }

        public abstract void doWork();
    }

    public abstract class Future2Task<T> extends BaseFutureTask<T> implements OAuthFuture<T> {
        public final OAuthCallback<T> mCallback;

        public Future2Task(OAuthManager oAuthManager, Handler handler, OAuthCallback<T> oAuthCallback) {
            super(handler);
            this.mCallback = oAuthCallback;
        }

        public void done() {
            if (this.mCallback != null) {
                AnonymousClass1 r0 = new Runnable() {
                    public void run() {
                        Future2Task future2Task = Future2Task.this;
                        future2Task.mCallback.run(future2Task);
                    }
                };
                Handler handler = this.mHandler;
                if (handler == null) {
                    handler = OAuthManager.this.mMainHandler;
                }
                handler.post(r0);
            }
        }

        public T getResult() {
            Looper myLooper;
            if (isDone() || (myLooper = Looper.myLooper()) == null || myLooper != Looper.getMainLooper()) {
                try {
                    T t = get();
                    cancel(true);
                    return t;
                } catch (CancellationException e2) {
                    throw new CancellationException(e2.getMessage());
                } catch (InterruptedException | TimeoutException unused) {
                    cancel(true);
                    throw new CancellationException();
                } catch (ExecutionException e3) {
                    Throwable cause = e3.getCause();
                    if (cause instanceof LenientTokenResponseException) {
                        throw ((LenientTokenResponseException) cause);
                    } else if (cause instanceof k) {
                        throw ((k) cause);
                    } else if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    } else if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new IllegalStateException(cause);
                    }
                } catch (Throwable th) {
                    cancel(true);
                    throw th;
                }
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("calling this from your main thread can lead to deadlock");
                OAuthManager.LOGGER.log(Level.WARNING, "calling this from your main thread can lead to deadlock and/or ANRs", illegalStateException);
                throw illegalStateException;
            }
        }

        public Future2Task<T> start() {
            try {
                doWork();
            } catch (Exception e2) {
                setException(e2);
            }
            return this;
        }
    }

    public interface OAuthCallback<T> {
        void run(OAuthFuture<T> oAuthFuture);
    }

    public interface OAuthFuture<V> {
    }

    public OAuthManager(AuthorizationFlow authorizationFlow, AuthorizationUIController authorizationUIController) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.mFlow = authorizationFlow;
        this.mUIController = authorizationUIController;
        Objects.requireNonNull(newSingleThreadExecutor);
        this.mExecutor = newSingleThreadExecutor;
    }
}
