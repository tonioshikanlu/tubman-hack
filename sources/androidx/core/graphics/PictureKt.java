package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import e.r;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Le/r;", "block", "record", "(Landroid/graphics/Picture;IILe/x/b/l;)Landroid/graphics/Picture;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class PictureKt {
    public static final Picture record(Picture picture, int i2, int i3, l<? super Canvas, r> lVar) {
        i.f(picture, "$this$record");
        i.f(lVar, "block");
        Canvas beginRecording = picture.beginRecording(i2, i3);
        try {
            i.b(beginRecording, "c");
            lVar.invoke(beginRecording);
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
