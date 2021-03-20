package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import b.e.a.a.a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Objects;

public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    private ColorUtils() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008c, code lost:
        r6 = java.lang.Math.round(r6 * 255.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a3, code lost:
        return android.graphics.Color.rgb(constrain(r1, 0, 255), constrain(r3, 0, 255), constrain(r6, 0, 255));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0059, code lost:
        r6 = java.lang.Math.round((r4 + r6) * 255.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006c, code lost:
        r6 = java.lang.Math.round((r5 + r6) * 255.0f);
     */
    @androidx.annotation.ColorInt
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int HSLToColor(@androidx.annotation.NonNull float[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r2 = r6[r2]
            r3 = 2
            r6 = r6[r3]
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r6 * r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            float r4 = r5 - r4
            float r4 = r4 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r4
            float r6 = r6 - r2
            r2 = 1114636288(0x42700000, float:60.0)
            float r2 = r1 / r2
            float r2 = r2 % r3
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r5 = r5 - r2
            float r5 = r5 * r4
            int r1 = (int) r1
            int r1 = r1 / 60
            r2 = 1132396544(0x437f0000, float:255.0)
            switch(r1) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0073;
                case 2: goto L_0x0060;
                case 3: goto L_0x004d;
                case 4: goto L_0x0040;
                case 5: goto L_0x0033;
                case 6: goto L_0x0033;
                default: goto L_0x002f;
            }
        L_0x002f:
            r6 = r0
            r1 = r6
            r3 = r1
            goto L_0x0091
        L_0x0033:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            goto L_0x006c
        L_0x0040:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            goto L_0x0059
        L_0x004d:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
        L_0x0059:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r6 = java.lang.Math.round(r4)
            goto L_0x0091
        L_0x0060:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
        L_0x006c:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r6 = java.lang.Math.round(r5)
            goto L_0x0091
        L_0x0073:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            goto L_0x008c
        L_0x0080:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
        L_0x008c:
            float r6 = r6 * r2
            int r6 = java.lang.Math.round(r6)
        L_0x0091:
            r2 = 255(0xff, float:3.57E-43)
            int r1 = constrain((int) r1, (int) r0, (int) r2)
            int r3 = constrain((int) r3, (int) r0, (int) r2)
            int r6 = constrain((int) r6, (int) r0, (int) r2)
            int r6 = android.graphics.Color.rgb(r1, r3, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.ColorUtils.HSLToColor(float[]):int");
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = 0.0d, to = 100.0d) double d, @FloatRange(from = -128.0d, to = 127.0d) double d2, @FloatRange(from = -128.0d, to = 127.0d) double d3) {
        double[] tempDouble3Array = getTempDouble3Array();
        LABToXYZ(d, d2, d3, tempDouble3Array);
        return XYZToColor(tempDouble3Array[0], tempDouble3Array[1], tempDouble3Array[2]);
    }

    public static void LABToXYZ(@FloatRange(from = 0.0d, to = 100.0d) double d, @FloatRange(from = -128.0d, to = 127.0d) double d2, @FloatRange(from = -128.0d, to = 127.0d) double d3, @NonNull double[] dArr) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        if (pow <= XYZ_EPSILON) {
            pow = ((d5 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        double pow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / XYZ_KAPPA;
        double pow3 = Math.pow(d6, 3.0d);
        if (pow3 <= XYZ_EPSILON) {
            pow3 = ((d6 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        dArr[0] = pow * XYZ_WHITE_REFERENCE_X;
        dArr[1] = pow2 * XYZ_WHITE_REFERENCE_Y;
        dArr[2] = pow3 * XYZ_WHITE_REFERENCE_Z;
    }

    public static void RGBToHSL(@IntRange(from = 0, to = 255) int i2, @IntRange(from = 0, to = 255) int i3, @IntRange(from = 0, to = 255) int i4, @NonNull float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i2) / 255.0f;
        float f4 = ((float) i3) / 255.0f;
        float f5 = ((float) i4) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = constrain(f8, 0.0f, 360.0f);
        fArr[1] = constrain(f2, 0.0f, 1.0f);
        fArr[2] = constrain(f7, 0.0f, 1.0f);
    }

    public static void RGBToLAB(@IntRange(from = 0, to = 255) int i2, @IntRange(from = 0, to = 255) int i3, @IntRange(from = 0, to = 255) int i4, @NonNull double[] dArr) {
        RGBToXYZ(i2, i3, i4, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(@IntRange(from = 0, to = 255) int i2, @IntRange(from = 0, to = 255) int i3, @IntRange(from = 0, to = 255) int i4, @NonNull double[] dArr) {
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d = ((double) i2) / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = ((double) i3) / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = ((double) i4) / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr2[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * XYZ_WHITE_REFERENCE_Y;
            dArr2[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * XYZ_WHITE_REFERENCE_Y;
            dArr2[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * XYZ_WHITE_REFERENCE_Y;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = 0.0d, to = 95.047d) double d, @FloatRange(from = 0.0d, to = 100.0d) double d2, @FloatRange(from = 0.0d, to = 108.883d) double d3) {
        double d4 = ((-0.4986d * d3) + ((-1.5372d * d2) + (3.2406d * d))) / XYZ_WHITE_REFERENCE_Y;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + (-0.9689d * d))) / XYZ_WHITE_REFERENCE_Y;
        double d6 = ((1.057d * d3) + ((-0.204d * d2) + (0.0557d * d))) / XYZ_WHITE_REFERENCE_Y;
        return Color.rgb(constrain((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    public static void XYZToLAB(@FloatRange(from = 0.0d, to = 95.047d) double d, @FloatRange(from = 0.0d, to = 100.0d) double d2, @FloatRange(from = 0.0d, to = 108.883d) double d3, @NonNull double[] dArr) {
        if (dArr.length == 3) {
            double pivotXyzComponent = pivotXyzComponent(d / XYZ_WHITE_REFERENCE_X);
            double pivotXyzComponent2 = pivotXyzComponent(d2 / XYZ_WHITE_REFERENCE_Y);
            double pivotXyzComponent3 = pivotXyzComponent(d3 / XYZ_WHITE_REFERENCE_Z);
            dArr[0] = Math.max(ShadowDrawableWrapper.COS_45, (116.0d * pivotXyzComponent2) - 16.0d);
            dArr[1] = (pivotXyzComponent - pivotXyzComponent2) * 500.0d;
            dArr[2] = (pivotXyzComponent2 - pivotXyzComponent3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    @ColorInt
    public static int blendARGB(@ColorInt int i2, @ColorInt int i3, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i3)) * f) + (((float) Color.alpha(i2)) * f2)), (int) ((((float) Color.red(i3)) * f) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i3)) * f) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i3)) * f) + (((float) Color.blue(i2)) * f2)));
    }

    public static void blendHSL(@NonNull float[] fArr, @NonNull float[] fArr2, @FloatRange(from = 0.0d, to = 1.0d) float f, @NonNull float[] fArr3) {
        if (fArr3.length == 3) {
            float f2 = 1.0f - f;
            fArr3[0] = circularInterpolate(fArr[0], fArr2[0], f);
            fArr3[1] = (fArr2[1] * f) + (fArr[1] * f2);
            fArr3[2] = (fArr2[2] * f) + (fArr[2] * f2);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    public static void blendLAB(@NonNull double[] dArr, @NonNull double[] dArr2, @FloatRange(from = 0.0d, to = 1.0d) double d, @NonNull double[] dArr3) {
        if (dArr3.length == 3) {
            double d2 = 1.0d - d;
            dArr3[0] = (dArr2[0] * d) + (dArr[0] * d2);
            dArr3[1] = (dArr2[1] * d) + (dArr[1] * d2);
            dArr3[2] = (dArr2[2] * d) + (dArr[2] * d2);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    public static double calculateContrast(@ColorInt int i2, @ColorInt int i3) {
        if (Color.alpha(i3) == 255) {
            if (Color.alpha(i2) < 255) {
                i2 = compositeColors(i2, i3);
            }
            double calculateLuminance = calculateLuminance(i2) + 0.05d;
            double calculateLuminance2 = calculateLuminance(i3) + 0.05d;
            return Math.max(calculateLuminance, calculateLuminance2) / Math.min(calculateLuminance, calculateLuminance2);
        }
        StringBuilder y = a.y("background can not be translucent: #");
        y.append(Integer.toHexString(i3));
        throw new IllegalArgumentException(y.toString());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double calculateLuminance(@ColorInt int i2) {
        double[] tempDouble3Array = getTempDouble3Array();
        colorToXYZ(i2, tempDouble3Array);
        return tempDouble3Array[1] / XYZ_WHITE_REFERENCE_Y;
    }

    public static int calculateMinimumAlpha(@ColorInt int i2, @ColorInt int i3, float f) {
        int i4 = 255;
        if (Color.alpha(i3) == 255) {
            double d = (double) f;
            if (calculateContrast(setAlphaComponent(i2, 255), i3) < d) {
                return -1;
            }
            int i5 = 0;
            for (int i6 = 0; i6 <= 10 && i4 - i5 > 1; i6++) {
                int i7 = (i5 + i4) / 2;
                if (calculateContrast(setAlphaComponent(i2, i7), i3) < d) {
                    i5 = i7;
                } else {
                    i4 = i7;
                }
            }
            return i4;
        }
        StringBuilder y = a.y("background can not be translucent: #");
        y.append(Integer.toHexString(i3));
        throw new IllegalArgumentException(y.toString());
    }

    @VisibleForTesting
    public static float circularInterpolate(float f, float f2, float f3) {
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > f) {
                f += 360.0f;
            } else {
                f2 += 360.0f;
            }
        }
        return (((f2 - f) * f3) + f) % 360.0f;
    }

    public static void colorToHSL(@ColorInt int i2, @NonNull float[] fArr) {
        RGBToHSL(Color.red(i2), Color.green(i2), Color.blue(i2), fArr);
    }

    public static void colorToLAB(@ColorInt int i2, @NonNull double[] dArr) {
        RGBToLAB(Color.red(i2), Color.green(i2), Color.blue(i2), dArr);
    }

    public static void colorToXYZ(@ColorInt int i2, @NonNull double[] dArr) {
        RGBToXYZ(Color.red(i2), Color.green(i2), Color.blue(i2), dArr);
    }

    private static int compositeAlpha(int i2, int i3) {
        return 255 - (((255 - i2) * (255 - i3)) / 255);
    }

    public static int compositeColors(@ColorInt int i2, @ColorInt int i3) {
        int alpha = Color.alpha(i3);
        int alpha2 = Color.alpha(i2);
        int compositeAlpha = compositeAlpha(alpha2, alpha);
        return Color.argb(compositeAlpha, compositeComponent(Color.red(i2), alpha2, Color.red(i3), alpha, compositeAlpha), compositeComponent(Color.green(i2), alpha2, Color.green(i3), alpha, compositeAlpha), compositeComponent(Color.blue(i2), alpha2, Color.blue(i3), alpha, compositeAlpha));
    }

    @RequiresApi(26)
    @NonNull
    public static Color compositeColors(@NonNull Color color, @NonNull Color color2) {
        if (Objects.equals(color.getModel(), color2.getModel())) {
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = (1.0f - alpha) * color2.alpha();
            int componentCount = color2.getComponentCount() - 1;
            components2[componentCount] = alpha + alpha2;
            if (components2[componentCount] > 0.0f) {
                alpha /= components2[componentCount];
                alpha2 /= components2[componentCount];
            }
            for (int i2 = 0; i2 < componentCount; i2++) {
                components2[i2] = (components2[i2] * alpha2) + (components[i2] * alpha);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
        StringBuilder y = a.y("Color models must match (");
        y.append(color.getModel());
        y.append(" vs. ");
        y.append(color2.getModel());
        y.append(")");
        throw new IllegalArgumentException(y.toString());
    }

    private static int compositeComponent(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        return a.w(255, i3, i4 * i5, (i2 * 255) * i3) / (i6 * 255);
    }

    private static float constrain(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private static int constrain(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static double distanceEuclidean(@NonNull double[] dArr, @NonNull double[] dArr2) {
        double pow = Math.pow(dArr[0] - dArr2[0], 2.0d);
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + pow);
    }

    private static double[] getTempDouble3Array() {
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static double pivotXyzComponent(double d) {
        return d > XYZ_EPSILON ? Math.pow(d, 0.3333333333333333d) : ((d * XYZ_KAPPA) + 16.0d) / 116.0d;
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int i2, @IntRange(from = 0, to = 255) int i3) {
        if (i3 >= 0 && i3 <= 255) {
            return (i2 & ViewCompat.MEASURED_SIZE_MASK) | (i3 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
