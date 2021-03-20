package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.media.MediaBrowserServiceCompatApi23;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(26)
public class MediaBrowserServiceCompatApi26 {
    private static final String TAG = "MBSCompatApi26";
    public static Field sResultFlags;

    public static class MediaBrowserServiceAdaptor extends MediaBrowserServiceCompatApi23.MediaBrowserServiceAdaptor {
        public MediaBrowserServiceAdaptor(Context context, ServiceCompatProxy serviceCompatProxy) {
            super(context, serviceCompatProxy);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((ServiceCompatProxy) this.mServiceProxy).onLoadChildren(str, new ResultWrapper(result), bundle);
        }
    }

    public static class ResultWrapper {
        public MediaBrowserService.Result mResultObj;

        public ResultWrapper(MediaBrowserService.Result result) {
            this.mResultObj = result;
        }

        public void detach() {
            this.mResultObj.detach();
        }

        public List<MediaBrowser.MediaItem> parcelListToItemList(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        public void sendResult(List<Parcel> list, int i2) {
            try {
                MediaBrowserServiceCompatApi26.sResultFlags.setInt(this.mResultObj, i2);
            } catch (IllegalAccessException e2) {
                Log.w(MediaBrowserServiceCompatApi26.TAG, e2);
            }
            this.mResultObj.sendResult(parcelListToItemList(list));
        }
    }

    public interface ServiceCompatProxy extends MediaBrowserServiceCompatApi23.ServiceCompatProxy {
        void onLoadChildren(String str, ResultWrapper resultWrapper, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            sResultFlags = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            Log.w(TAG, e2);
        }
    }

    private MediaBrowserServiceCompatApi26() {
    }

    public static Object createService(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new MediaBrowserServiceAdaptor(context, serviceCompatProxy);
    }

    public static Bundle getBrowserRootHints(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    public static void notifyChildrenChanged(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}
