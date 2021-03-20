package b.a.a.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.loader.content.AsyncTaskLoader;
import b.l.b.a.a.b.k;
import com.google.api.client.auth.oauth2.TokenErrorResponse;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;

public abstract class a<T> extends AsyncTaskLoader<C0014a<T>> {
    public C0014a<T> a;

    /* renamed from: b.a.a.k.a$a  reason: collision with other inner class name */
    public static final class C0014a<T> {
        public T a;

        /* renamed from: b  reason: collision with root package name */
        public Exception f325b;
        public boolean c = true;
        public String d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        i.e(context, BasePayload.CONTEXT_KEY);
    }

    /* renamed from: a */
    public void deliverResult(C0014a<T> aVar) {
        if (!isReset()) {
            C0014a<T> aVar2 = this.a;
            this.a = aVar;
            if (isStarted()) {
                super.deliverResult(aVar);
            }
            if (aVar2 != null) {
                c(aVar2);
            }
        } else if (aVar != null) {
            c(aVar);
        }
    }

    public abstract T b();

    public final void c(C0014a<T> aVar) {
        if (aVar != null) {
            if (aVar.a != null) {
                aVar.a = null;
            }
            if (aVar.f325b != null) {
                aVar.f325b = null;
            }
        }
    }

    public abstract void d(C0014a<T> aVar);

    public Object loadInBackground() {
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        C0014a aVar = new C0014a();
        try {
            aVar.a = b();
            d(aVar);
        } catch (Exception e2) {
            q.a.a.d.b("loadInBackground thrown error: %s", e2.toString());
            StackTraceElement stackTraceElement = e2.getStackTrace()[0];
            aVar.c = false;
            if (e2 instanceof g) {
                g gVar = (g) e2;
                str3 = null;
                aVar.d = null;
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    str2 = aVar.d;
                    sb = b.e.a.a.a.y(": ");
                }
                String str4 = aVar.d;
                StringBuilder y = b.e.a.a.a.y("\n");
                y.append(e2.getClass().getName());
                y.append(" at ");
                i.d(stackTraceElement, "t");
                y.append(stackTraceElement.getClassName());
                y.append("(");
                y.append(stackTraceElement.getFileName());
                y.append(":");
                y.append(stackTraceElement.getLineNumber());
                y.append(")");
                aVar.d = i.k(str4, y.toString());
                aVar.f325b = e2;
            } else if (e2 instanceof k) {
                TokenErrorResponse tokenErrorResponse = ((k) e2).f4714h;
                i.d(tokenErrorResponse, "errorResponse");
                aVar.d = tokenErrorResponse.getError();
                if (!TextUtils.isEmpty(tokenErrorResponse.getErrorDescription())) {
                    str2 = aVar.d;
                    sb = b.e.a.a.a.y(": ");
                    str3 = tokenErrorResponse.getErrorDescription();
                }
                String str42 = aVar.d;
                StringBuilder y2 = b.e.a.a.a.y("\n");
                y2.append(e2.getClass().getName());
                y2.append(" at ");
                i.d(stackTraceElement, "t");
                y2.append(stackTraceElement.getClassName());
                y2.append("(");
                y2.append(stackTraceElement.getFileName());
                y2.append(":");
                y2.append(stackTraceElement.getLineNumber());
                y2.append(")");
                aVar.d = i.k(str42, y2.toString());
                aVar.f325b = e2;
            } else {
                str = e2.getMessage();
                aVar.d = str;
                String str422 = aVar.d;
                StringBuilder y22 = b.e.a.a.a.y("\n");
                y22.append(e2.getClass().getName());
                y22.append(" at ");
                i.d(stackTraceElement, "t");
                y22.append(stackTraceElement.getClassName());
                y22.append("(");
                y22.append(stackTraceElement.getFileName());
                y22.append(":");
                y22.append(stackTraceElement.getLineNumber());
                y22.append(")");
                aVar.d = i.k(str422, y22.toString());
                aVar.f325b = e2;
            }
            sb.append(str3);
            str = i.k(str2, sb.toString());
            aVar.d = str;
            String str4222 = aVar.d;
            StringBuilder y222 = b.e.a.a.a.y("\n");
            y222.append(e2.getClass().getName());
            y222.append(" at ");
            i.d(stackTraceElement, "t");
            y222.append(stackTraceElement.getClassName());
            y222.append("(");
            y222.append(stackTraceElement.getFileName());
            y222.append(":");
            y222.append(stackTraceElement.getLineNumber());
            y222.append(")");
            aVar.d = i.k(str4222, y222.toString());
            aVar.f325b = e2;
        }
        return aVar;
    }

    public void onCanceled(Object obj) {
        C0014a aVar = (C0014a) obj;
        super.onCanceled(aVar);
        c(aVar);
    }

    public void onReset() {
        super.onReset();
        cancelLoad();
        C0014a<T> aVar = this.a;
        if (aVar != null) {
            c(aVar);
            this.a = null;
        }
    }

    public void onStartLoading() {
        C0014a<T> aVar = this.a;
        if (aVar != null) {
            deliverResult(aVar);
        }
        if (takeContentChanged() || this.a == null) {
            forceLoad();
        }
    }

    public void onStopLoading() {
        cancelLoad();
    }
}
