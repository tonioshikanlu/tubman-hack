package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;
import java.util.Map;

public class FontAssetManager {
    private final AssetManager assetManager;
    private String defaultFontFileExtension = ".ttf";
    @Nullable
    private FontAssetDelegate delegate;
    private final Map<String, Typeface> fontFamilies = new HashMap();
    private final Map<MutablePair<String>, Typeface> fontMap = new HashMap();
    private final MutablePair<String> tempPair = new MutablePair<>();

    public FontAssetManager(Drawable.Callback callback, @Nullable FontAssetDelegate fontAssetDelegate) {
        AssetManager assets;
        this.delegate = fontAssetDelegate;
        if (!(callback instanceof View)) {
            Logger.warning("LottieDrawable must be inside of a view for images to work.");
            assets = null;
        } else {
            assets = ((View) callback).getContext().getAssets();
        }
        this.assetManager = assets;
    }

    private Typeface getFontFamily(String str) {
        String fontPath;
        Typeface typeface = this.fontFamilies.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = null;
        FontAssetDelegate fontAssetDelegate = this.delegate;
        if (fontAssetDelegate != null) {
            typeface2 = fontAssetDelegate.fetchFont(str);
        }
        FontAssetDelegate fontAssetDelegate2 = this.delegate;
        if (!(fontAssetDelegate2 == null || typeface2 != null || (fontPath = fontAssetDelegate2.getFontPath(str)) == null)) {
            typeface2 = Typeface.createFromAsset(this.assetManager, fontPath);
        }
        if (typeface2 == null) {
            StringBuilder B = a.B("fonts/", str);
            B.append(this.defaultFontFileExtension);
            typeface2 = Typeface.createFromAsset(this.assetManager, B.toString());
        }
        this.fontFamilies.put(str, typeface2);
        return typeface2;
    }

    private Typeface typefaceForStyle(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i2 = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        return typeface.getStyle() == i2 ? typeface : Typeface.create(typeface, i2);
    }

    public Typeface getTypeface(String str, String str2) {
        this.tempPair.set(str, str2);
        Typeface typeface = this.fontMap.get(this.tempPair);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceForStyle = typefaceForStyle(getFontFamily(str), str2);
        this.fontMap.put(this.tempPair, typefaceForStyle);
        return typefaceForStyle;
    }

    public void setDefaultFontFileExtension(String str) {
        this.defaultFontFileExtension = str;
    }

    public void setDelegate(@Nullable FontAssetDelegate fontAssetDelegate) {
        this.delegate = fontAssetDelegate;
    }
}
