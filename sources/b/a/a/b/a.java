package b.a.a.b;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AlertDialog;
import b.a.a.g.j;
import b.a.a.g.p0;
import b.a.a.g.q0;
import com.appfoundry.previewer.model.Style;
import com.segment.analytics.integrations.BasePayload;
import e.r;
import e.v.d;
import e.v.j.a.e;
import e.v.j.a.h;
import e.x.b.p;
import e.x.c.i;
import g.a.a0;
import g.a.d0;
import g.a.f0;
import g.a.i0;
import g.a.s0;
import g.a.z;
import j.a.a.a.c.c;
import j.a.a.a.d.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import p.a.a.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B+\b\u0016\u0012\u0006\u0010M\u001a\u00020L\u0012\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010>\u0012\b\b\u0002\u0010=\u001a\u00020\u0005¢\u0006\u0004\bN\u0010OJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\b2\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\nR\u0018\u0010-\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010<R\u0016\u0010K\u001a\u00020H8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006P"}, d2 = {"Lb/a/a/b/a;", "Landroid/webkit/WebView;", "Lj/a/a/a/d/a$a;", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Le/r;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lb/a/a/g/d;", "onCameraPermissionGrantedEvent", "(Lb/a/a/g/d;)V", "Lb/a/a/g/j;", "onFileUploadCancelledEvent", "(Lb/a/a/g/j;)V", "Lb/a/a/g/a;", "onAddPictureFromAlbumEvent", "(Lb/a/a/g/a;)V", "Lb/a/a/g/p0;", "onTakePictureFinishedEvent", "(Lb/a/a/g/p0;)V", "Lb/a/a/g/q0;", "onTakeVideoFinishedEvent", "(Lb/a/a/g/q0;)V", "", "url", "destinationPath", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "b", "(Ljava/lang/Exception;)V", "", "progress", "total", "a", "(II)V", "d", "p", "Ljava/lang/String;", "webViewUrl", "n", "I", "webViewWidth", "Lj/a/a/a/c/c;", "i", "Lj/a/a/a/c/c;", "adapter", "o", "webViewHeight", "Lb/a/a/b/c;", "q", "Lb/a/a/b/c;", "bravoChromeClient", "k", "Z", "isSvg", "", "l", "Ljava/util/List;", "tags", "Lcom/appfoundry/previewer/model/Style;", "m", "Lcom/appfoundry/previewer/model/Style;", "webViewStyle", "h", "registered", "Lj/a/a/a/b;", "j", "Lj/a/a/a/b;", "remotePDFViewPager", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;Z)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class a extends WebView implements a.C0158a {

    /* renamed from: h  reason: collision with root package name */
    public boolean f125h;

    /* renamed from: i  reason: collision with root package name */
    public c f126i;

    /* renamed from: j  reason: collision with root package name */
    public j.a.a.a.b f127j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f128k;

    /* renamed from: l  reason: collision with root package name */
    public List<String> f129l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public Style f130m;

    /* renamed from: n  reason: collision with root package name */
    public int f131n;

    /* renamed from: o  reason: collision with root package name */
    public int f132o;

    /* renamed from: p  reason: collision with root package name */
    public String f133p;

    /* renamed from: q  reason: collision with root package name */
    public c f134q;

    /* renamed from: b.a.a.b.a$a  reason: collision with other inner class name */
    public static final class C0007a extends WebViewClient {
        public final /* synthetic */ a a;

        /* renamed from: b.a.a.b.a$a$a  reason: collision with other inner class name */
        /* compiled from: java-style lambda group */
        public static final class C0008a implements DialogInterface.OnClickListener {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ int f135h;

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ Object f136i;

            public C0008a(int i2, Object obj) {
                this.f135h = i2;
                this.f136i = obj;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = this.f135h;
                if (i3 == 0) {
                    ((SslErrorHandler) this.f136i).proceed();
                } else if (i3 == 1) {
                    ((SslErrorHandler) this.f136i).cancel();
                } else {
                    throw null;
                }
            }
        }

        public C0007a(a aVar) {
            this.a = aVar;
        }

        public void onPageFinished(WebView webView, String str) {
            i.e(webView, "view");
            i.e(str, "url");
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            i.e(webView, "view");
            i.e(sslErrorHandler, "handler");
            i.e(sslError, "error");
            AlertDialog.Builder builder = new AlertDialog.Builder(this.a.getContext());
            builder.setMessage((CharSequence) "Error: Invalid SSL Certificate. Continue?");
            builder.setPositiveButton((CharSequence) "Continue", (DialogInterface.OnClickListener) new C0008a(0, sslErrorHandler));
            builder.setNegativeButton((CharSequence) "Cancel", (DialogInterface.OnClickListener) new C0008a(1, sslErrorHandler));
            AlertDialog create = builder.create();
            i.d(create, "builder.create()");
            create.show();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            i.e(webView, "view");
            i.e(str, "url");
            webView.loadUrl(str);
            return true;
        }
    }

    @e(c = "com.appfoundry.previewer.custom.BravoWebView2$configureBravoWebView$3", f = "BravoWebView2.kt", l = {268}, m = "invokeSuspend")
    public static final class b extends h implements p<z, d<? super r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f137l;

        /* renamed from: m  reason: collision with root package name */
        public Object f138m;

        /* renamed from: n  reason: collision with root package name */
        public Object f139n;

        /* renamed from: o  reason: collision with root package name */
        public int f140o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ a f141p;

        @e(c = "com.appfoundry.previewer.custom.BravoWebView2$configureBravoWebView$3$svgTask$1", f = "BravoWebView2.kt", l = {}, m = "invokeSuspend")
        /* renamed from: b.a.a.b.a$b$a  reason: collision with other inner class name */
        public static final class C0009a extends h implements p<z, d<? super String>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f142l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ b f143m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0009a(b bVar, d dVar) {
                super(2, dVar);
                this.f143m = bVar;
            }

            public final d<r> a(Object obj, d<?> dVar) {
                i.e(dVar, "completion");
                C0009a aVar = new C0009a(this.f143m, dVar);
                aVar.f142l = (z) obj;
                return aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
                b.q.a.a.A(r5, r0);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(java.lang.Object r5) {
                /*
                    r4 = this;
                    b.q.a.a.c3(r5)
                    java.net.URL r5 = new java.net.URL
                    b.a.a.b.a$b r0 = r4.f143m
                    b.a.a.b.a r0 = r0.f141p
                    java.lang.String r0 = r0.f133p
                    r5.<init>(r0)
                    java.nio.charset.Charset r0 = e.c0.a.a
                    java.lang.String r1 = "$this$readBytes"
                    e.x.c.i.e(r5, r1)
                    java.io.InputStream r5 = r5.openStream()
                    java.lang.String r2 = "it"
                    e.x.c.i.d(r5, r2)     // Catch:{ all -> 0x0046 }
                    e.x.c.i.e(r5, r1)     // Catch:{ all -> 0x0046 }
                    java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0046 }
                    int r2 = r5.available()     // Catch:{ all -> 0x0046 }
                    r3 = 8192(0x2000, float:1.14794E-41)
                    int r2 = java.lang.Math.max(r3, r2)     // Catch:{ all -> 0x0046 }
                    r1.<init>(r2)     // Catch:{ all -> 0x0046 }
                    b.q.a.a.O(r5, r1, r3)     // Catch:{ all -> 0x0046 }
                    byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x0046 }
                    java.lang.String r2 = "buffer.toByteArray()"
                    e.x.c.i.d(r1, r2)     // Catch:{ all -> 0x0046 }
                    r2 = 0
                    b.q.a.a.A(r5, r2)
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r0)
                    return r5
                L_0x0046:
                    r0 = move-exception
                    throw r0     // Catch:{ all -> 0x0048 }
                L_0x0048:
                    r1 = move-exception
                    b.q.a.a.A(r5, r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.a.b.C0009a.d(java.lang.Object):java.lang.Object");
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
                b.q.a.a.A(r4, r5);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
                /*
                    r3 = this;
                    e.v.d r5 = (e.v.d) r5
                    java.lang.String r0 = "completion"
                    e.x.c.i.e(r5, r0)
                    b.a.a.b.a$b r0 = r3.f143m
                    r5.getContext()
                    g.a.z r4 = (g.a.z) r4
                    e.r r4 = e.r.a
                    b.q.a.a.c3(r4)
                    java.net.URL r4 = new java.net.URL
                    b.a.a.b.a r5 = r0.f141p
                    java.lang.String r5 = r5.f133p
                    r4.<init>(r5)
                    java.nio.charset.Charset r5 = e.c0.a.a
                    java.lang.String r0 = "$this$readBytes"
                    e.x.c.i.e(r4, r0)
                    java.io.InputStream r4 = r4.openStream()
                    java.lang.String r1 = "it"
                    e.x.c.i.d(r4, r1)     // Catch:{ all -> 0x0054 }
                    e.x.c.i.e(r4, r0)     // Catch:{ all -> 0x0054 }
                    java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0054 }
                    int r1 = r4.available()     // Catch:{ all -> 0x0054 }
                    r2 = 8192(0x2000, float:1.14794E-41)
                    int r1 = java.lang.Math.max(r2, r1)     // Catch:{ all -> 0x0054 }
                    r0.<init>(r1)     // Catch:{ all -> 0x0054 }
                    b.q.a.a.O(r4, r0, r2)     // Catch:{ all -> 0x0054 }
                    byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0054 }
                    java.lang.String r1 = "buffer.toByteArray()"
                    e.x.c.i.d(r0, r1)     // Catch:{ all -> 0x0054 }
                    r1 = 0
                    b.q.a.a.A(r4, r1)
                    java.lang.String r4 = new java.lang.String
                    r4.<init>(r0, r5)
                    return r4
                L_0x0054:
                    r5 = move-exception
                    throw r5     // Catch:{ all -> 0x0056 }
                L_0x0056:
                    r0 = move-exception
                    b.q.a.a.A(r4, r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.a.b.C0009a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, d dVar) {
            super(2, dVar);
            this.f141p = aVar;
        }

        public final d<r> a(Object obj, d<?> dVar) {
            i.e(dVar, "completion");
            b bVar = new b(this.f141p, dVar);
            bVar.f137l = (z) obj;
            return bVar;
        }

        public final Object d(Object obj) {
            e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
            int i2 = this.f140o;
            if (i2 == 0) {
                b.q.a.a.c3(obj);
                z zVar = this.f137l;
                d0 k2 = e.a.a.a.y0.m.o1.c.k(s0.f9982h, i0.f9955b, (a0) null, new C0009a(this, (d) null), 2, (Object) null);
                this.f138m = zVar;
                this.f139n = k2;
                this.f140o = 1;
                obj = f0.P((f0) k2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                d0 d0Var = (d0) this.f139n;
                z zVar2 = (z) this.f138m;
                try {
                    b.q.a.a.c3(obj);
                } catch (Exception e2) {
                    q.a.a.d.b("Exception loading svg as webview, with url=%s -> %s", this.f141p.f133p, e2.getLocalizedMessage());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar2 = this.f141p;
            aVar2.loadDataWithBaseURL((String) null, "<style>svg { position:fixed; top:0; left:0; height:100%; width:100% }</style>" + ((String) obj), "text/html", "UTF-8", (String) null);
            return r.a;
        }

        public final Object invoke(Object obj, Object obj2) {
            d dVar = (d) obj2;
            i.e(dVar, "completion");
            b bVar = new b(this.f141p, dVar);
            bVar.f137l = (z) obj;
            return bVar.d(r.a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, List<String> list, boolean z) {
        super(context);
        i.e(context, BasePayload.CONTEXT_KEY);
        this.f129l = list;
        this.f128k = z;
    }

    public void a(int i2, int i3) {
        q.a.a.d.a("Progress: %s of %s", String.valueOf(i2), String.valueOf(i3));
    }

    public void b(Exception exc) {
        q.a.a.d.b("ERROR PDF: %s", String.valueOf(exc));
    }

    public void c(String str, String str2) {
        c cVar = new c(getContext(), str.substring(str.lastIndexOf(47) + 1));
        this.f126i = cVar;
        j.a.a.a.b bVar = this.f127j;
        if (bVar != null) {
            bVar.setAdapter(cVar);
            j.a.a.a.b bVar2 = this.f127j;
            if (bVar2 != null) {
                addView(bVar2);
            } else {
                i.m("remotePDFViewPager");
                throw null;
            }
        } else {
            i.m("remotePDFViewPager");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0161, code lost:
        if (r7 != null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a8, code lost:
        if (r7 != null) goto L_0x01aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0049 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r14 = this;
            com.appfoundry.previewer.model.Style r1 = r14.f130m
            int r2 = r14.f131n
            int r3 = r14.f132o
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 56
            r0 = r14
            b.a.a.h.o.h(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r14.f133p
            r1 = 1
            if (r0 == 0) goto L_0x002f
            java.lang.String r2 = "pdf"
            boolean r0 = e.c0.h.b(r0, r2, r1)
            if (r0 != r1) goto L_0x002f
            j.a.a.a.b r0 = new j.a.a.a.b
            android.content.Context r2 = r14.getContext()
            java.lang.String r3 = r14.f133p
            r0.<init>(r2, r3, r14)
            r14.f127j = r0
            r2 = 2131231129(0x7f080199, float:1.807833E38)
            r0.setId(r2)
        L_0x002f:
            java.lang.String r0 = r14.f133p
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x01bb
            java.lang.String r4 = "$this$parseUrlParams"
            e.x.c.i.e(r0, r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r5 = "\\$\\{(.*?)\\}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Matcher r5 = r5.matcher(r0)
        L_0x0049:
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x01b1
            java.lang.String r6 = r5.group()
            java.lang.String r7 = "matcher.group()"
            e.x.c.i.d(r6, r7)
            r7 = 2
            java.lang.String r8 = r5.group()
            int r8 = r8.length()
            int r8 = r8 + -1
            java.lang.String r6 = r6.substring(r7, r8)
            java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            e.x.c.i.d(r6, r7)
            int r7 = r6.hashCode()
            r8 = -1588383098(0xffffffffa1533286, float:-7.155645E-19)
            r9 = 4
            r10 = 125(0x7d, float:1.75E-43)
            java.lang.String r11 = "${"
            if (r7 == r8) goto L_0x00d5
            r8 = 25162675(0x17ff3b3, float:4.701095E-38)
            if (r7 == r8) goto L_0x00ac
            r8 = 1475083531(0x57ebfd0b, float:5.18944088E14)
            if (r7 == r8) goto L_0x0086
            goto L_0x0118
        L_0x0086:
            java.lang.String r7 = "device.platform"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0118
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r6)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "android"
            java.lang.String r0 = e.c0.h.w(r0, r7, r8, r2, r9)
            java.lang.String r7 = "platform"
            r4.put(r7, r8)
            goto L_0x0118
        L_0x00ac:
            java.lang.String r7 = "device.id"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0118
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r6)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = b.f.a.e.B()
            java.lang.String r0 = e.c0.h.w(r0, r7, r8, r2, r9)
            java.lang.String r7 = b.f.a.e.B()
            java.lang.String r8 = "id"
            goto L_0x0115
        L_0x00d5:
            java.lang.String r7 = "device.lang"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0118
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            r7.append(r6)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r12 = "Locale.getDefault()"
            e.x.c.i.d(r8, r12)
            java.lang.String r8 = r8.getDisplayLanguage()
            java.lang.String r13 = "Locale.getDefault().displayLanguage"
            e.x.c.i.d(r8, r13)
            java.lang.String r0 = e.c0.h.w(r0, r7, r8, r2, r9)
            java.util.Locale r7 = java.util.Locale.getDefault()
            e.x.c.i.d(r7, r12)
            java.lang.String r7 = r7.getDisplayLanguage()
            e.x.c.i.d(r7, r13)
            java.lang.String r8 = "lang"
        L_0x0115:
            r4.put(r8, r7)
        L_0x0118:
            boolean r7 = b.f.a.e.a0()
            if (r7 == 0) goto L_0x0049
            b.a.a.m.b r7 = b.a.a.m.b.f349m
            b.p.a.l<com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend> r7 = b.a.a.m.b.f
            java.lang.String r8 = b.f.a.e.i()
            java.lang.Object r7 = r7.b(r8)
            com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend r7 = (com.appfoundry.previewer.model.BravoIdTokenResponseFromBackend) r7
            int r8 = r6.hashCode()
            r12 = -147180002(0xfffffffff73a361e, float:-3.7768158E33)
            java.lang.String r13 = ""
            if (r8 == r12) goto L_0x018a
            r12 = 294088398(0x11876ece, float:2.1367533E-28)
            if (r8 == r12) goto L_0x0164
            r12 = 518840249(0x1eecdfb9, float:2.5080001E-20)
            if (r8 == r12) goto L_0x0143
            goto L_0x0049
        L_0x0143:
            java.lang.String r8 = "user.email"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x0049
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            r8.append(r6)
            r8.append(r10)
            java.lang.String r6 = r8.toString()
            if (r7 == 0) goto L_0x01ab
            java.lang.String r7 = r7.f7081b
            if (r7 == 0) goto L_0x01ab
            goto L_0x01aa
        L_0x0164:
            java.lang.String r8 = "user.name"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x0049
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            r8.append(r6)
            r8.append(r10)
            java.lang.String r6 = r8.toString()
            if (r7 == 0) goto L_0x0185
            java.lang.String r7 = r7.c
            if (r7 == 0) goto L_0x0185
            r13 = r7
        L_0x0185:
            e.c0.h.w(r0, r6, r13, r2, r9)
            goto L_0x0049
        L_0x018a:
            java.lang.String r8 = "user.id"
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x0049
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            r8.append(r6)
            r8.append(r10)
            java.lang.String r6 = r8.toString()
            if (r7 == 0) goto L_0x01ab
            java.lang.String r7 = r7.a
            if (r7 == 0) goto L_0x01ab
        L_0x01aa:
            r13 = r7
        L_0x01ab:
            java.lang.String r0 = e.c0.h.w(r0, r6, r13, r2, r9)
            goto L_0x0049
        L_0x01b1:
            com.appfoundry.previewer.BravoApp$b r5 = com.appfoundry.previewer.BravoApp.Q
            java.lang.String r5 = "<set-?>"
            e.x.c.i.e(r4, r5)
            com.appfoundry.previewer.BravoApp.s = r4
            goto L_0x01bc
        L_0x01bb:
            r0 = r3
        L_0x01bc:
            android.webkit.WebSettings r4 = r14.getSettings()
            r4.setJavaScriptEnabled(r1)
            r4.setJavaScriptCanOpenWindowsAutomatically(r1)
            r4.setLoadWithOverviewMode(r1)
            r4.setUseWideViewPort(r1)
            r4.setBuiltInZoomControls(r1)
            r4.setDomStorageEnabled(r1)
            r4.setDisplayZoomControls(r2)
            r4.setAllowFileAccess(r1)
            r4.setMediaPlaybackRequiresUserGesture(r2)
            b.a.a.b.a$a r4 = new b.a.a.b.a$a
            r4.<init>(r14)
            r14.setWebViewClient(r4)
            b.a.a.b.c r4 = new b.a.a.b.c
            android.content.Context r5 = r14.getContext()
            r4.<init>(r5)
            r14.f134q = r4
            r14.setWebChromeClient(r4)
            boolean r4 = r14.f128k
            if (r4 == 0) goto L_0x0218
            r14.setVerticalScrollBarEnabled(r2)
            r14.setHorizontalScrollBarEnabled(r2)
            g.a.p r0 = e.a.a.a.y0.m.o1.c.c(r3, r1, r3)
            g.a.x r1 = g.a.i0.a
            g.a.h1 r1 = g.a.a.m.f9916b
            e.v.f r0 = r1.plus(r0)
            g.a.z r4 = e.a.a.a.y0.m.o1.c.b(r0)
            r5 = 0
            r6 = 0
            b.a.a.b.a$b r7 = new b.a.a.b.a$b
            r7.<init>(r14, r3)
            r8 = 3
            r9 = 0
            e.a.a.a.y0.m.o1.c.S(r4, r5, r6, r7, r8, r9)
            goto L_0x021b
        L_0x0218:
            r14.loadUrl(r0)
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.b.a.d():void");
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onAddPictureFromAlbumEvent(b.a.a.g.a aVar) {
        i.e(aVar, "event");
        c cVar = this.f134q;
        if (cVar != null) {
            Uri[] uriArr = aVar.a;
            ValueCallback<Uri[]> valueCallback = cVar.f146e;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                cVar.f146e = null;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f125h) {
            p.a.a.c.b().k(this);
            this.f125h = true;
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onCameraPermissionGrantedEvent(b.a.a.g.d dVar) {
        i.e(dVar, "event");
        d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f125h) {
            p.a.a.c.b().m(this);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onFileUploadCancelledEvent(j jVar) {
        ValueCallback<Uri[]> valueCallback;
        i.e(jVar, "event");
        c cVar = this.f134q;
        if (cVar != null && (valueCallback = cVar.f146e) != null) {
            valueCallback.onReceiveValue((Object) null);
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onTakePictureFinishedEvent(p0 p0Var) {
        ValueCallback<Uri[]> valueCallback;
        i.e(p0Var, "event");
        c cVar = this.f134q;
        if (cVar != null && (valueCallback = cVar.f146e) != null) {
            valueCallback.onReceiveValue(new Uri[]{Uri.parse(cVar.f)});
        }
    }

    @m(threadMode = ThreadMode.MAIN)
    public final void onTakeVideoFinishedEvent(q0 q0Var) {
        ValueCallback<Uri[]> valueCallback;
        i.e(q0Var, "event");
        c cVar = this.f134q;
        if (cVar != null && (valueCallback = cVar.f146e) != null) {
            valueCallback.onReceiveValue(new Uri[]{Uri.parse(cVar.f147g)});
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        i.e(motionEvent, "event");
        if (!this.f128k) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
