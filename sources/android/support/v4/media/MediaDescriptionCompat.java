package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    public final String f12h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f13i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f14j;

    /* renamed from: k  reason: collision with root package name */
    public final CharSequence f15k;

    /* renamed from: l  reason: collision with root package name */
    public final Bitmap f16l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f17m;

    /* renamed from: n  reason: collision with root package name */
    public final Bundle f18n;

    /* renamed from: o  reason: collision with root package name */
    public final Uri f19o;

    /* renamed from: p  reason: collision with root package name */
    public Object f20p;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        public Object createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f12h = str;
        this.f13i = charSequence;
        this.f14j = charSequence2;
        this.f15k = charSequence3;
        this.f16l = bitmap;
        this.f17m = uri;
        this.f18n = bundle;
        this.f19o = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x005b
            r1 = r14
            android.media.MediaDescription r1 = (android.media.MediaDescription) r1
            java.lang.String r3 = r1.getMediaId()
            java.lang.CharSequence r4 = r1.getTitle()
            java.lang.CharSequence r5 = r1.getSubtitle()
            java.lang.CharSequence r6 = r1.getDescription()
            android.graphics.Bitmap r7 = r1.getIconBitmap()
            android.net.Uri r8 = r1.getIconUri()
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0030
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x0031
        L_0x0030:
            r10 = r0
        L_0x0031:
            if (r10 == 0) goto L_0x004a
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x0044
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x0044
            r9 = r0
            goto L_0x004b
        L_0x0044:
            r2.remove(r9)
            r2.remove(r11)
        L_0x004a:
            r9 = r2
        L_0x004b:
            if (r10 == 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            android.net.Uri r0 = r1.getMediaUri()
            r10 = r0
        L_0x0053:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f20p = r14
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f13i + ", " + this.f14j + ", " + this.f15k;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Object obj = this.f20p;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f12h);
            builder.setTitle(this.f13i);
            builder.setSubtitle(this.f14j);
            builder.setDescription(this.f15k);
            builder.setIconBitmap(this.f16l);
            builder.setIconUri(this.f17m);
            builder.setExtras(this.f18n);
            builder.setMediaUri(this.f19o);
            obj = builder.build();
            this.f20p = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i2);
    }
}
