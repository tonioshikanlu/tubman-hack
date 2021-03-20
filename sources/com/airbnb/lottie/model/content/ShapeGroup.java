package com.airbnb.lottie.model.content;

import b.e.a.a.a;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.Arrays;
import java.util.List;

public class ShapeGroup implements ContentModel {
    private final boolean hidden;
    private final List<ContentModel> items;
    private final String name;

    public ShapeGroup(String str, List<ContentModel> list, boolean z) {
        this.name = str;
        this.items = list;
        this.hidden = z;
    }

    public List<ContentModel> getItems() {
        return this.items;
    }

    public String getName() {
        return this.name;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new ContentGroup(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        StringBuilder y = a.y("ShapeGroup{name='");
        y.append(this.name);
        y.append("' Shapes: ");
        y.append(Arrays.toString(this.items.toArray()));
        y.append('}');
        return y.toString();
    }
}
