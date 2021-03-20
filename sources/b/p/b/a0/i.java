package b.p.b.a0;

import androidx.recyclerview.widget.RecyclerView;
import b.p.b.o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.a0;
import o.e;
import o.z;

public final class i {
    public static final byte[] a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f6481b = new String[0];
    public static final Charset c = Charset.forName("UTF-8");

    public static void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void b(Closeable closeable, Closeable closeable2) {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (th instanceof Error) {
                throw th;
            } else {
                throw new AssertionError(th);
            }
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!k(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean e(z zVar, int i2, TimeUnit timeUnit) {
        try {
            return l(zVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String g(o oVar) {
        if (oVar.f6725e == o.d(oVar.a)) {
            return oVar.d;
        }
        return oVar.d + ":" + oVar.f6725e;
    }

    public static <T> List<T> h(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> i(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <T> T[] j(Class<T> cls, T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                T t2 = tArr2[i2];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i2++;
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
    }

    public static boolean k(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean l(z zVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = zVar.f().e() ? zVar.f().c() - nanoTime : Long.MAX_VALUE;
        zVar.f().d(Math.min(c2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            e eVar = new e();
            while (zVar.T(eVar, 2048) != -1) {
                eVar.skip(eVar.f10453i);
            }
            int i3 = (c2 > RecyclerView.FOREVER_NS ? 1 : (c2 == RecyclerView.FOREVER_NS ? 0 : -1));
            a0 f = zVar.f();
            if (i3 == 0) {
                f.a();
            } else {
                f.d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i4 = (c2 > RecyclerView.FOREVER_NS ? 1 : (c2 == RecyclerView.FOREVER_NS ? 0 : -1));
            a0 f2 = zVar.f();
            if (i4 == 0) {
                f2.a();
            } else {
                f2.d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            int i5 = (c2 > RecyclerView.FOREVER_NS ? 1 : (c2 == RecyclerView.FOREVER_NS ? 0 : -1));
            a0 f3 = zVar.f();
            if (i5 == 0) {
                f3.a();
            } else {
                f3.d(nanoTime + c2);
            }
            throw th;
        }
    }
}
