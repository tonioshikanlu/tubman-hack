package b.f.a;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import e.c0.h;
import e.t.g;
import e.t.o;
import e.x.c.i;
import java.util.List;
import java.util.ListIterator;

public final class d {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r8 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r8 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x002e, all -> 0x002c }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x002e, all -> 0x002c }
            if (r8 == 0) goto L_0x0029
            boolean r9 = r8.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x0027 }
            if (r9 == 0) goto L_0x0029
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ IllegalArgumentException -> 0x0027 }
            r8.close()
            return r9
        L_0x0027:
            r9 = move-exception
            goto L_0x0031
        L_0x0029:
            if (r8 == 0) goto L_0x0039
            goto L_0x0036
        L_0x002c:
            r8 = move-exception
            goto L_0x003d
        L_0x002e:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L_0x0031:
            r9.printStackTrace()     // Catch:{ all -> 0x003a }
            if (r8 == 0) goto L_0x0039
        L_0x0036:
            r8.close()
        L_0x0039:
            return r7
        L_0x003a:
            r9 = move-exception
            r7 = r8
            r8 = r9
        L_0x003d:
            if (r7 == 0) goto L_0x0042
            r7.close()
        L_0x0042:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.a.d.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static final String b(Context context, Uri uri) {
        boolean z;
        boolean z2;
        List<T> list = o.f7934h;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (i.a("com.android.externalstorage.documents", uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                i.b(documentId, "docId");
                List<String> c = new e.c0.d(":").c(documentId, 0);
                if (!c.isEmpty()) {
                    ListIterator<String> listIterator = c.listIterator(c.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() == 0) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (!z2) {
                                list = g.R(c, listIterator.nextIndex() + 1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (h.f("primary", strArr[0], true)) {
                        return Environment.getExternalStorageDirectory().toString() + "/" + strArr[1];
                    }
                } else {
                    throw new e.o("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else if (i.a("com.android.providers.downloads.documents", uri.getAuthority())) {
                String documentId2 = DocumentsContract.getDocumentId(uri);
                Uri parse = Uri.parse("content://downloads/public_downloads");
                Long valueOf = Long.valueOf(documentId2);
                if (valueOf != null) {
                    return a(context, ContentUris.withAppendedId(parse, valueOf.longValue()), (String) null, (String[]) null);
                }
                i.l();
                throw null;
            } else if (i.a("com.android.providers.media.documents", uri.getAuthority())) {
                String documentId3 = DocumentsContract.getDocumentId(uri);
                i.b(documentId3, "docId");
                List<String> c2 = new e.c0.d(":").c(documentId3, 0);
                if (!c2.isEmpty()) {
                    ListIterator<String> listIterator2 = c2.listIterator(c2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            if (listIterator2.previous().length() == 0) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (!z) {
                                list = g.R(c2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Object[] array2 = list.toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    String str = strArr2[0];
                    int hashCode = str.hashCode();
                    if (hashCode != 93166550) {
                        if (hashCode != 100313435) {
                            if (hashCode == 112202875 && str.equals("video")) {
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            }
                        } else if (str.equals("image")) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        }
                    } else if (str.equals("audio")) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return a(context, uri2, "_id=?", new String[]{strArr2[1]});
                }
                throw new e.o("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else if (h.f("content", uri.getScheme(), true)) {
            return i.a("com.google.android.apps.photos.content", uri.getAuthority()) ? uri.getLastPathSegment() : a(context, uri, (String) null, (String[]) null);
        } else {
            if (h.f("file", uri.getScheme(), true)) {
                return uri.getPath();
            }
        }
        return null;
    }
}
