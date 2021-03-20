package com.airbnb.lottie.parser;

import android.graphics.Color;
import androidx.annotation.IntRange;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.List;

public class GradientColorParser implements ValueParser<GradientColor> {
    private int colorPoints;

    public GradientColorParser(int i2) {
        this.colorPoints = i2;
    }

    private void addOpacityStopsToGradientIfNeeded(GradientColor gradientColor, List<Float> list) {
        int i2 = this.colorPoints * 4;
        if (list.size() > i2) {
            int size = (list.size() - i2) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i3 = 0;
            while (i2 < list.size()) {
                if (i2 % 2 == 0) {
                    dArr[i3] = (double) list.get(i2).floatValue();
                } else {
                    dArr2[i3] = (double) list.get(i2).floatValue();
                    i3++;
                }
                i2++;
            }
            for (int i4 = 0; i4 < gradientColor.getSize(); i4++) {
                int i5 = gradientColor.getColors()[i4];
                gradientColor.getColors()[i4] = Color.argb(getOpacityAtPosition((double) gradientColor.getPositions()[i4], dArr, dArr2), Color.red(i5), Color.green(i5), Color.blue(i5));
            }
        }
    }

    @IntRange(from = 0, to = 255)
    private int getOpacityAtPosition(double d, double[] dArr, double[] dArr2) {
        double d2;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int i2 = 1;
        while (true) {
            if (i2 >= dArr3.length) {
                d2 = dArr4[dArr4.length - 1];
                break;
            }
            int i3 = i2 - 1;
            double d3 = dArr3[i3];
            double d4 = dArr3[i2];
            if (dArr3[i2] >= d) {
                d2 = MiscUtils.lerp(dArr4[i3], dArr4[i2], MiscUtils.clamp((d - d3) / (d4 - d3), (double) ShadowDrawableWrapper.COS_45, 1.0d));
                break;
            }
            i2++;
        }
        return (int) (d2 * 255.0d);
    }

    public GradientColor parse(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.colorPoints == -1) {
            this.colorPoints = arrayList.size() / 4;
        }
        int i2 = this.colorPoints;
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.colorPoints * 4; i5++) {
            int i6 = i5 / 4;
            double floatValue = (double) ((Float) arrayList.get(i5)).floatValue();
            int i7 = i5 % 4;
            if (i7 == 0) {
                fArr[i6] = (float) floatValue;
            } else if (i7 == 1) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i7 == 2) {
                i4 = (int) (floatValue * 255.0d);
            } else if (i7 == 3) {
                iArr[i6] = Color.argb(255, i3, i4, (int) (floatValue * 255.0d));
            }
        }
        GradientColor gradientColor = new GradientColor(fArr, iArr);
        addOpacityStopsToGradientIfNeeded(gradientColor, arrayList);
        return gradientColor;
    }
}
