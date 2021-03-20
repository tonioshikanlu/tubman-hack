package b.k.b.a.f;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.exifinterface.media.ExifInterface;
import e.x.c.i;
import java.io.File;
import java.io.IOException;

public final class e {
    public static final Bitmap a(File file, float f, float f2) {
        int i2;
        int i3;
        int i4;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i5;
        int i6;
        float f3 = f;
        float f4 = f2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i7 = options.outHeight;
        int i8 = options.outWidth;
        float f5 = (float) i8;
        float f6 = (float) i7;
        float f7 = f5 / f6;
        float f8 = f3 / f4;
        if (f6 > f4 || f5 > f3) {
            if (f7 < f8) {
                i6 = (int) ((f4 / f6) * f5);
                i5 = (int) f4;
            } else {
                if (f7 > f8) {
                    f4 = (f3 / f5) * f6;
                }
                i5 = (int) f4;
                i6 = (int) f3;
            }
            i2 = i5;
            i3 = i6;
        } else {
            i2 = i7;
            i3 = i8;
        }
        if (i7 > i2 || i8 > i3) {
            int i9 = i7 / 2;
            int i10 = i8 / 2;
            i4 = 2;
            while (i9 / i4 >= i2 && i10 / i4 >= i3) {
                i4 *= 2;
            }
        } else {
            i4 = 1;
        }
        options.inSampleSize = i4;
        options.inJustDecodeBounds = false;
        if (decodeFile != null) {
            int i11 = (options.outHeight / i4) * (options.outWidth / i4);
            Bitmap.Config config = decodeFile.getConfig();
            i.b(config, "candidate.config");
            int i12 = d.a[config.ordinal()];
            int i13 = 4;
            if (i12 != 1) {
                i13 = (i12 == 2 || i12 == 3) ? 2 : 1;
            }
            if (i11 * i13 <= decodeFile.getAllocationByteCount()) {
                options.inMutable = true;
                options.inBitmap = decodeFile;
            }
        }
        options.inTempStorage = new byte[16384];
        try {
            decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        try {
            bitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e3) {
            e3.printStackTrace();
            bitmap = null;
        }
        float f9 = (float) i3;
        float f10 = f9 / ((float) options.outWidth);
        float f11 = (float) i2;
        float f12 = f11 / ((float) options.outHeight);
        float f13 = f9 / 2.0f;
        float f14 = f11 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f12, f13, f14);
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            canvas.setMatrix(matrix);
            if (decodeFile != null) {
                canvas.drawBitmap(decodeFile, f13 - ((float) (decodeFile.getWidth() / 2)), f14 - ((float) (decodeFile.getHeight() / 2)), new Paint(2));
                decodeFile.recycle();
                try {
                    int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 0);
                    Matrix matrix2 = new Matrix();
                    if (attributeInt == 6) {
                        matrix2.postRotate(90.0f);
                    } else if (attributeInt == 3) {
                        matrix2.postRotate(180.0f);
                    } else if (attributeInt == 8) {
                        matrix2.postRotate(270.0f);
                    }
                    bitmap2 = bitmap;
                    try {
                        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                    } catch (IOException e4) {
                        e = e4;
                        e.printStackTrace();
                        return bitmap2;
                    }
                } catch (IOException e5) {
                    e = e5;
                    bitmap2 = bitmap;
                    e.printStackTrace();
                    return bitmap2;
                }
            } else {
                i.l();
                throw null;
            }
        } else {
            i.l();
            throw null;
        }
    }
}
