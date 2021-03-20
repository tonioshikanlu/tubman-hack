package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import e.r;
import e.x.b.q;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0007\u001a\u00020\u0006*\u00020\u00002 \b\u0004\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0001H\b¢\u0006\u0004\b\u0007\u0010\b\u001a6\u0010\n\u001a\u00020\t*\u00020\u00002 \b\u0004\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0001H\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Le/r;", "action", "Landroid/graphics/Bitmap;", "decodeBitmap", "(Landroid/graphics/ImageDecoder$Source;Le/x/b/q;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "decodeDrawable", "(Landroid/graphics/ImageDecoder$Source;Le/x/b/q;)Landroid/graphics/drawable/Drawable;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class ImageDecoderKt {
    @RequiresApi(28)
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, r> qVar) {
        i.f(source, "$this$decodeBitmap");
        i.f(qVar, "action");
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new ImageDecoderKt$decodeBitmap$1(qVar));
        i.b(decodeBitmap, "ImageDecoder.decodeBitma…ction(info, source)\n    }");
        return decodeBitmap;
    }

    @RequiresApi(28)
    public static final Drawable decodeDrawable(ImageDecoder.Source source, q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, r> qVar) {
        i.f(source, "$this$decodeDrawable");
        i.f(qVar, "action");
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new ImageDecoderKt$decodeDrawable$1(qVar));
        i.b(decodeDrawable, "ImageDecoder.decodeDrawa…ction(info, source)\n    }");
        return decodeDrawable;
    }
}
