package androidx.core.os;

import android.os.Handler;
import e.r;
import e.x.b.a;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a8\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\b¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\b¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroid/os/Handler;", "", "delayInMillis", "", "token", "Lkotlin/Function0;", "Le/r;", "action", "Ljava/lang/Runnable;", "postDelayed", "(Landroid/os/Handler;JLjava/lang/Object;Le/x/b/a;)Ljava/lang/Runnable;", "uptimeMillis", "postAtTime", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class HandlerKt {
    public static final Runnable postAtTime(Handler handler, long j2, Object obj, a<r> aVar) {
        i.f(handler, "$this$postAtTime");
        i.f(aVar, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j2);
        return handlerKt$postAtTime$runnable$1;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j2, Object obj, a aVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        i.f(handler, "$this$postAtTime");
        i.f(aVar, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j2);
        return handlerKt$postAtTime$runnable$1;
    }

    public static final Runnable postDelayed(Handler handler, long j2, Object obj, a<r> aVar) {
        i.f(handler, "$this$postDelayed");
        i.f(aVar, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j2);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j2);
        }
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j2, Object obj, a aVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        i.f(handler, "$this$postDelayed");
        i.f(aVar, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j2);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j2);
        }
        return handlerKt$postDelayed$runnable$1;
    }
}
