package androidx.constraintlayout.motion.utils;

import android.util.Log;
import b.e.a.a.a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Arrays;

public class Easing {
    private static final String ACCELERATE = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String ACCELERATE_NAME = "accelerate";
    private static final String DECELERATE = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String DECELERATE_NAME = "decelerate";
    private static final String LINEAR = "cubic(1, 1, 0, 0)";
    private static final String LINEAR_NAME = "linear";
    public static String[] NAMED_EASING = {STANDARD_NAME, ACCELERATE_NAME, DECELERATE_NAME, LINEAR_NAME};
    private static final String STANDARD = "cubic(0.4, 0.0, 0.2, 1)";
    private static final String STANDARD_NAME = "standard";
    public static Easing sDefault = new Easing();
    public String str = "identity";

    public static class CubicEasing extends Easing {
        private static double d_error = 1.0E-4d;
        private static double error = 0.01d;
        public double x1;
        public double x2;
        public double y1;
        public double y2;

        public CubicEasing(double d, double d2, double d3, double d4) {
            setup(d, d2, d3, d4);
        }

        public CubicEasing(String str) {
            this.str = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.x1 = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i2 = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i2);
            this.y1 = Double.parseDouble(str.substring(i2, indexOf3).trim());
            int i3 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i3);
            this.x2 = Double.parseDouble(str.substring(i3, indexOf4).trim());
            int i4 = indexOf4 + 1;
            this.y2 = Double.parseDouble(str.substring(i4, str.indexOf(41, i4)).trim());
        }

        private double getDiffX(double d) {
            double d2 = 1.0d - d;
            double d3 = this.x1;
            double d4 = d2 * 3.0d * d2 * d3;
            double d5 = this.x2;
            return ((1.0d - d5) * 3.0d * d * d) + ((d5 - d3) * d2 * 6.0d * d) + d4;
        }

        private double getDiffY(double d) {
            double d2 = 1.0d - d;
            double d3 = this.y1;
            double d4 = d2 * 3.0d * d2 * d3;
            double d5 = this.y2;
            return ((1.0d - d5) * 3.0d * d * d) + ((d5 - d3) * d2 * 6.0d * d) + d4;
        }

        private double getX(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.x2 * d5) + (this.x1 * d4) + (d * d * d);
        }

        private double getY(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.y2 * d5) + (this.y1 * d4) + (d * d * d);
        }

        public double get(double d) {
            if (d <= ShadowDrawableWrapper.COS_45) {
                return ShadowDrawableWrapper.COS_45;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > error) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double x = getX(d4);
            double d5 = d3 + d2;
            double x3 = getX(d5);
            double y = getY(d4);
            return (((d - x) * (getY(d5) - y)) / (x3 - x)) + y;
        }

        public double getDiff(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > d_error) {
                d2 *= 0.5d;
                d3 = getX(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (getY(d5) - getY(d4)) / (getX(d5) - getX(d4));
        }

        public void setup(double d, double d2, double d3, double d4) {
            this.x1 = d;
            this.y1 = d2;
            this.x2 = d3;
            this.y2 = d4;
        }
    }

    public static Easing getInterpolator(String str2) {
        if (str2 == null) {
            return null;
        }
        if (str2.startsWith("cubic")) {
            return new CubicEasing(str2);
        }
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1354466595:
                if (str2.equals(ACCELERATE_NAME)) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str2.equals(DECELERATE_NAME)) {
                    c = 1;
                    break;
                }
                break;
            case -1102672091:
                if (str2.equals(LINEAR_NAME)) {
                    c = 2;
                    break;
                }
                break;
            case 1312628413:
                if (str2.equals(STANDARD_NAME)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new CubicEasing(ACCELERATE);
            case 1:
                return new CubicEasing(DECELERATE);
            case 2:
                return new CubicEasing(LINEAR);
            case 3:
                return new CubicEasing(STANDARD);
            default:
                StringBuilder y = a.y("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                y.append(Arrays.toString(NAMED_EASING));
                Log.e("ConstraintSet", y.toString());
                return sDefault;
        }
    }

    public double get(double d) {
        return d;
    }

    public double getDiff(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.str;
    }
}
