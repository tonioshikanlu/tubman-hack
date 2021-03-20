package com.airbnb.lottie;

import androidx.annotation.RestrictTo;
import androidx.core.os.TraceCompat;
import b.e.a.a.a;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public class L {
    public static boolean DBG = false;
    private static final int MAX_DEPTH = 20;
    public static final String TAG = "LOTTIE";
    private static int depthPastMaxDepth = 0;
    private static String[] sections = null;
    private static long[] startTimeNs = null;
    private static int traceDepth = 0;
    private static boolean traceEnabled = false;

    public static void beginSection(String str) {
        if (traceEnabled) {
            int i2 = traceDepth;
            if (i2 == 20) {
                depthPastMaxDepth++;
                return;
            }
            sections[i2] = str;
            startTimeNs[i2] = System.nanoTime();
            TraceCompat.beginSection(str);
            traceDepth++;
        }
    }

    public static float endSection(String str) {
        int i2 = depthPastMaxDepth;
        if (i2 > 0) {
            depthPastMaxDepth = i2 - 1;
            return 0.0f;
        } else if (!traceEnabled) {
            return 0.0f;
        } else {
            int i3 = traceDepth - 1;
            traceDepth = i3;
            if (i3 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(sections[i3])) {
                TraceCompat.endSection();
                return ((float) (System.nanoTime() - startTimeNs[traceDepth])) / 1000000.0f;
            } else {
                throw new IllegalStateException(a.q(a.C("Unbalanced trace call ", str, ". Expected "), sections[traceDepth], "."));
            }
        }
    }

    public static void setTraceEnabled(boolean z) {
        if (traceEnabled != z) {
            traceEnabled = z;
            if (z) {
                sections = new String[20];
                startTimeNs = new long[20];
            }
        }
    }
}
