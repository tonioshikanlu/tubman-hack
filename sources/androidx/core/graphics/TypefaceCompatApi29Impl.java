package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.io.InputStream;

@RequiresApi(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceCompatApi29Impl extends TypefaceCompatBaseImpl {
    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i2) {
        FontResourcesParserCompat.FontFileResourceEntry[] entries = fontFamilyFilesResourceEntry.getEntries();
        int length = entries.length;
        int i3 = 0;
        FontFamily.Builder builder = null;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= length) {
                break;
            }
            FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = entries[i4];
            try {
                Font.Builder weight = new Font.Builder(resources, fontFileResourceEntry.getResourceId()).setWeight(fontFileResourceEntry.getWeight());
                if (!fontFileResourceEntry.isItalic()) {
                    i5 = 0;
                }
                Font build = weight.setSlant(i5).setTtcIndex(fontFileResourceEntry.getTtcIndex()).setFontVariationSettings(fontFileResourceEntry.getVariationSettings()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i4++;
        }
        if (builder == null) {
            return null;
        }
        int i6 = (i2 & 1) != 0 ? 700 : 400;
        if ((i2 & 2) != 0) {
            i3 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i6, i3)).build();
    }

    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = fontInfoArr.length;
        int i3 = 0;
        FontFamily.Builder builder = null;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 < length) {
                FontsContractCompat.FontInfo fontInfo = fontInfoArr[i4];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fontInfo.getUri(), "r", cancellationSignal);
                    if (openFileDescriptor != null) {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(fontInfo.getWeight());
                        if (!fontInfo.isItalic()) {
                            i5 = 0;
                        }
                        Font build = weight.setSlant(i5).setTtcIndex(fontInfo.getTtcIndex()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                        i4++;
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    break;
                }
                i4++;
            } else if (builder == null) {
                return null;
            } else {
                int i6 = (i2 & 1) != 0 ? 700 : 400;
                if ((i2 & 2) != 0) {
                    i3 = 1;
                }
                return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i6, i3)).build();
            }
        }
        throw th;
    }

    public Typeface createFromInputStream(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Nullable
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    public FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fontInfoArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
