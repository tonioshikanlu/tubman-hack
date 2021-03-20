package b.a.a.h;

import com.airbnb.lottie.LottieListener;
import com.appfoundry.previewer.model.Asset;
import e.x.c.i;
import q.a.a;

public final class k<T> implements LottieListener<Throwable> {
    public final /* synthetic */ Asset a;

    public k(Asset asset) {
        this.a = asset;
    }

    public void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        Object[] objArr = new Object[2];
        Asset asset = this.a;
        objArr[0] = asset != null ? asset.f7065b : null;
        i.d(th, "result");
        objArr[1] = th.getLocalizedMessage();
        a.d.b("Exception in Lottie with url: %s -> %s", objArr);
    }
}
