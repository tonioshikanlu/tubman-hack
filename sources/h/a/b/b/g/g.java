package h.a.b.b.g;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.ArrayMap;
import h.a.b.b.g.c;
import h.a.b.b.g.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class g<T extends f> extends MediaController.Callback {
    public final T a;

    public g(T t) {
        this.a = t;
    }

    public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        T t = this.a;
        playbackInfo.getPlaybackType();
        AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
        if (!((audioAttributes.getFlags() & 1) == 1 || (audioAttributes.getFlags() & 4) == 4)) {
            int usage = audioAttributes.getUsage();
        }
        playbackInfo.getVolumeControl();
        playbackInfo.getMaxVolume();
        playbackInfo.getCurrentVolume();
        c cVar = (c) ((c.a) t).a.get();
    }

    public void onExtrasChanged(Bundle bundle) {
        MediaSessionCompat.a(bundle);
        c cVar = (c) ((c.a) this.a).a.get();
    }

    public void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (((c) ((c.a) this.a).a.get()) != null) {
            ArrayMap<String, Integer> arrayMap = MediaMetadataCompat.f21i;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                obtain.recycle();
                Objects.requireNonNull(MediaMetadataCompat.CREATOR.createFromParcel(obtain));
            }
        }
    }

    public void onPlaybackStateChanged(PlaybackState playbackState) {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        c cVar = (c) ((c.a) this.a).a.get();
        if (cVar != null && cVar.a == null && playbackState != null) {
            List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
            if (customActions != null) {
                ArrayList arrayList2 = new ArrayList(customActions.size());
                for (PlaybackState.CustomAction next : customActions) {
                    if (next != null) {
                        PlaybackState.CustomAction customAction2 = next;
                        customAction = new PlaybackStateCompat.CustomAction(customAction2.getAction(), customAction2.getName(), customAction2.getIcon(), customAction2.getExtras());
                        customAction.f53l = next;
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), playbackState.getExtras());
        }
    }

    public void onQueueChanged(List<MediaSession.QueueItem> list) {
        MediaSessionCompat.QueueItem queueItem;
        if (((c) ((c.a) this.a).a.get()) != null && list != null) {
            ArrayList arrayList = new ArrayList();
            for (MediaSession.QueueItem next : list) {
                if (next != null) {
                    MediaSession.QueueItem queueItem2 = next;
                    queueItem = new MediaSessionCompat.QueueItem(next, MediaDescriptionCompat.a(queueItem2.getDescription()), queueItem2.getQueueId());
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
        }
    }

    public void onQueueTitleChanged(CharSequence charSequence) {
        c cVar = (c) ((c.a) this.a).a.get();
    }

    public void onSessionDestroyed() {
        c cVar = (c) ((c.a) this.a).a.get();
    }

    public void onSessionEvent(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        c cVar = (c) ((c.a) this.a).a.get();
    }
}
