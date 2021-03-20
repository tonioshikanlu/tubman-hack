package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class MediaBrowserCompat {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1b = Log.isLoggable("MediaBrowserCompat", 3);
    public final c a;

    public static class CustomActionResultReceiver extends h.a.b.c.b {
        public void a(int i2, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends h.a.b.c.b {
        public void a(int i2, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i2 != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final int f2h;

        /* renamed from: i  reason: collision with root package name */
        public final MediaDescriptionCompat f3i;

        public static class a implements Parcelable.Creator<MediaItem> {
            public Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public Object[] newArray(int i2) {
                return new MediaItem[i2];
            }
        }

        public MediaItem(Parcel parcel) {
            this.f2h = parcel.readInt();
            this.f3i = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f12h)) {
                this.f2h = i2;
                this.f3i = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static List<MediaItem> a(List<?> list) {
            MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object next : list) {
                if (next != null) {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) next;
                    mediaItem = new MediaItem(MediaDescriptionCompat.a(mediaItem2.getDescription()), mediaItem2.getFlags());
                } else {
                    mediaItem = null;
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f2h + ", mDescription=" + this.f3i + '}';
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f2h);
            this.f3i.writeToParcel(parcel, i2);
        }
    }

    public static class SearchResultReceiver extends h.a.b.c.b {
        public void a(int i2, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i2 != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            throw null;
        }
    }

    public static class a extends Handler {
        public final WeakReference<g> a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<Messenger> f4b;

        public a(g gVar) {
            this.a = new WeakReference<>(gVar);
        }

        public void a(Messenger messenger) {
            this.f4b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f4b;
            if (weakReference != null && weakReference.get() != null && this.a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.a(data);
                g gVar = (g) this.a.get();
                Messenger messenger = (Messenger) this.f4b.get();
                try {
                    int i2 = message.what;
                    if (i2 == 1) {
                        Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        MediaSessionCompat.a(bundle);
                        gVar.b(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle);
                    } else if (i2 == 2) {
                        gVar.a(messenger);
                    } else if (i2 != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                        MediaSessionCompat.a(bundle2);
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                        MediaSessionCompat.a(bundle3);
                        gVar.c(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        gVar.a(messenger);
                    }
                }
            }
        }
    }

    public static class b {
        public a mConnectionCallbackInternal;
        public final Object mConnectionCallbackObj = new h.a.b.b.b(new C0000b());

        public interface a {
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b  reason: collision with other inner class name */
        public class C0000b implements h.a.b.b.a {
            public C0000b() {
            }
        }

        public void onConnected() {
            throw null;
        }

        public void onConnectionFailed() {
            throw null;
        }

        public void onConnectionSuspended() {
            throw null;
        }

        public void setInternalConnectionCallback(a aVar) {
            this.mConnectionCallbackInternal = aVar;
        }
    }

    public interface c {
    }

    @RequiresApi(21)
    public static class d implements c, g, b.a {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f5b;
        public final Bundle c;
        public final a d = new a(this);

        /* renamed from: e  reason: collision with root package name */
        public final ArrayMap<String, i> f6e = new ArrayMap<>();
        public h f;

        /* renamed from: g  reason: collision with root package name */
        public Messenger f7g;

        /* renamed from: h  reason: collision with root package name */
        public MediaSessionCompat.Token f8h;

        public d(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            Bundle bundle2;
            this.a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bVar.setInternalConnectionCallback(this);
            this.f5b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) bVar.mConnectionCallbackObj, bundle2);
        }

        public void a(Messenger messenger) {
        }

        public void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        public void c(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f7g == messenger) {
                i iVar = this.f6e.get(str);
                if (iVar != null) {
                    iVar.a(bundle);
                } else if (MediaBrowserCompat.f1b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }
    }

    @RequiresApi(23)
    public static class e extends d {
        public e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    @RequiresApi(26)
    public static class f extends e {
        public f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    public interface g {
        void a(Messenger messenger);

        void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void c(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    public static class h {
        public Messenger a;

        /* renamed from: b  reason: collision with root package name */
        public Bundle f9b;

        public h(IBinder iBinder, Bundle bundle) {
            this.a = new Messenger(iBinder);
            this.f9b = bundle;
        }

        public final void a(int i2, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.a.send(obtain);
        }
    }

    public static class i {
        public final List<j> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<Bundle> f10b = new ArrayList();

        public j a(Bundle bundle) {
            for (int i2 = 0; i2 < this.f10b.size(); i2++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.f10b.get(i2), bundle)) {
                    return this.a.get(i2);
                }
            }
            return null;
        }
    }

    public static abstract class j {
        public final IBinder a = new Binder();

        public class a implements h.a.b.b.c {
            public a() {
            }

            public void c(@NonNull String str, List<?> list) {
                Objects.requireNonNull(j.this);
                j jVar = j.this;
                MediaItem.a(list);
                Objects.requireNonNull(jVar);
            }

            public void d(@NonNull String str) {
                Objects.requireNonNull(j.this);
            }
        }

        public class b extends a implements h.a.b.b.e {
            public b() {
                super();
            }

            public void a(@NonNull String str, List<?> list, @NonNull Bundle bundle) {
                j jVar = j.this;
                MediaItem.a(list);
                Objects.requireNonNull(jVar);
            }

            public void b(@NonNull String str, @NonNull Bundle bundle) {
                Objects.requireNonNull(j.this);
            }
        }

        public j() {
            if (Build.VERSION.SDK_INT >= 26) {
                new h.a.b.b.f(new b());
            } else {
                new h.a.b.b.d(new a());
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        this.a = Build.VERSION.SDK_INT >= 26 ? new f(context, componentName, bVar, (Bundle) null) : new e(context, componentName, bVar, (Bundle) null);
    }
}
