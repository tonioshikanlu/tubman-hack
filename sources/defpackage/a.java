package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* renamed from: a  reason: default package */
/* compiled from: ServiceLoader */
public final /* synthetic */ class a {
    public static Iterator a() {
        try {
            return Arrays.asList(new CoroutineExceptionHandler[]{new AndroidExceptionPreHandler()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Iterator b() {
        try {
            return Arrays.asList(new MainDispatcherFactory[]{new AndroidDispatcherFactory()}).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
