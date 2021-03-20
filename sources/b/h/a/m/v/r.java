package b.h.a.m.v;

import android.util.Log;
import androidx.annotation.Nullable;
import b.h.a.m.m;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class r extends Exception {

    /* renamed from: m  reason: collision with root package name */
    public static final StackTraceElement[] f758m = new StackTraceElement[0];

    /* renamed from: h  reason: collision with root package name */
    public final List<Throwable> f759h;

    /* renamed from: i  reason: collision with root package name */
    public m f760i;

    /* renamed from: j  reason: collision with root package name */
    public b.h.a.m.a f761j;

    /* renamed from: k  reason: collision with root package name */
    public Class<?> f762k;

    /* renamed from: l  reason: collision with root package name */
    public String f763l;

    public static final class a implements Appendable {

        /* renamed from: h  reason: collision with root package name */
        public final Appendable f764h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f765i = true;

        public a(Appendable appendable) {
            this.f764h = appendable;
        }

        public Appendable append(char c) {
            boolean z = false;
            if (this.f765i) {
                this.f765i = false;
                this.f764h.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f765i = z;
            this.f764h.append(c);
            return this;
        }

        public Appendable append(@Nullable CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public Appendable append(@Nullable CharSequence charSequence, int i2, int i3) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f765i) {
                this.f765i = false;
                this.f764h.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i3 - 1) == 10) {
                z = true;
            }
            this.f765i = z;
            this.f764h.append(charSequence, i2, i3);
            return this;
        }
    }

    public r(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.f763l = str;
        setStackTrace(f758m);
        this.f759h = emptyList;
    }

    public r(String str, List<Throwable> list) {
        this.f763l = str;
        setStackTrace(f758m);
        this.f759h = list;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof r) {
                ((r) th).f(appendable);
            } else {
                d(th, appendable);
            }
            i2 = i3;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (th instanceof r) {
            for (Throwable a2 : ((r) th).f759h) {
                a(a2, list);
            }
            return;
        }
        list.add(th);
    }

    public void e(String str) {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder y = b.e.a.a.a.y("Root cause (");
            int i3 = i2 + 1;
            y.append(i3);
            y.append(" of ");
            y.append(size);
            y.append(")");
            Log.i(str, y.toString(), (Throwable) arrayList.get(i2));
            i2 = i3;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f759h, new a(appendable));
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f763l);
        String str4 = "";
        if (this.f762k != null) {
            StringBuilder y = b.e.a.a.a.y(", ");
            y.append(this.f762k);
            str = y.toString();
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f761j != null) {
            StringBuilder y2 = b.e.a.a.a.y(", ");
            y2.append(this.f761j);
            str2 = y2.toString();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f760i != null) {
            StringBuilder y3 = b.e.a.a.a.y(", ");
            y3.append(this.f760i);
            str4 = y3.toString();
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void printStackTrace() {
        f(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    public r(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.f763l = str;
        setStackTrace(f758m);
        this.f759h = singletonList;
    }
}
