package b.l.f.z.e;

import androidx.fragment.app.FragmentManagerImpl;
import androidx.renderscript.ScriptIntrinsicBLAS;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public final class i {
    public static final int[] a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* renamed from: b  reason: collision with root package name */
    public static final int[][] f5881b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, 110, 61}, new int[]{HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, ScriptIntrinsicBLAS.RIGHT, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, 110, 213, ScriptIntrinsicBLAS.LEFT, 136, 120, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, FragmentManagerImpl.ANIM_DUR, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 184, 59, 25, HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, ScriptIntrinsicBLAS.UNIT, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, ScriptIntrinsicBLAS.NON_UNIT, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 69, 213, 92, 253, HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION, 19}, new int[]{HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 9, 223, 238, 12, 17, FragmentManagerImpl.ANIM_DUR, 208, 100, 29, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, ScriptIntrinsicBLAS.UNIT, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 11, 204}, new int[]{FragmentManagerImpl.ANIM_DUR, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, BaseTransientBottomBar.ANIMATION_FADE_DURATION, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, FragmentManagerImpl.ANIM_DUR, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, ScriptIntrinsicBLAS.UNIT, 63, 96, 103, 82, 186}};
    public static final int[] c = new int[256];
    public static final int[] d = new int[255];

    static {
        int i2 = 1;
        for (int i3 = 0; i3 < 255; i3++) {
            d[i3] = i2;
            c[i2] = i3;
            i2 <<= 1;
            if (i2 >= 256) {
                i2 ^= 301;
            }
        }
    }

    public static String a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int[] iArr = c;
        int[] iArr2 = d;
        int i3 = 0;
        while (true) {
            int[] iArr3 = a;
            if (i3 >= iArr3.length) {
                i3 = -1;
                break;
            } else if (iArr3[i3] == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int[] iArr4 = f5881b[i3];
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = 0;
            }
            for (int i5 = 0; i5 < 0 + length; i5++) {
                int i6 = i2 - 1;
                char charAt = cArr[i6] ^ charSequence.charAt(i5);
                while (i6 > 0) {
                    if (charAt == 0 || iArr4[i6] == 0) {
                        cArr[i6] = cArr[i6 - 1];
                    } else {
                        cArr[i6] = (char) (cArr[i6 - 1] ^ iArr2[(iArr[charAt] + iArr[iArr4[i6]]) % 255]);
                    }
                    i6--;
                }
                if (charAt == 0 || iArr4[0] == 0) {
                    cArr[0] = 0;
                } else {
                    cArr[0] = (char) iArr2[(iArr[charAt] + iArr[iArr4[0]]) % 255];
                }
            }
            char[] cArr2 = new char[i2];
            for (int i7 = 0; i7 < i2; i7++) {
                cArr2[i7] = cArr[(i2 - i7) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i2)));
    }
}
