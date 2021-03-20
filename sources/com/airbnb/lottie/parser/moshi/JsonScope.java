package com.airbnb.lottie.parser.moshi;

import b.e.a.a.a;

public final class JsonScope {
    public static final int CLOSED = 8;
    public static final int DANGLING_NAME = 4;
    public static final int EMPTY_ARRAY = 1;
    public static final int EMPTY_DOCUMENT = 6;
    public static final int EMPTY_OBJECT = 3;
    public static final int NONEMPTY_ARRAY = 2;
    public static final int NONEMPTY_DOCUMENT = 7;
    public static final int NONEMPTY_OBJECT = 5;

    private JsonScope() {
    }

    public static String getPath(int i2, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder v = a.v('$');
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                v.append('[');
                v.append(iArr2[i3]);
                v.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                v.append('.');
                if (strArr[i3] != null) {
                    v.append(strArr[i3]);
                }
            }
        }
        return v.toString();
    }
}
