package androidx.renderscript;

import b.e.a.a.a;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ScriptIntrinsicBLAS extends ScriptIntrinsic {
    public static final int CONJ_TRANSPOSE = 113;
    private static final int INTRINSIC_API_LEVEL = 23;
    public static final int LEFT = 141;
    public static final int LOWER = 122;
    public static final int NON_UNIT = 131;
    public static final int NO_TRANSPOSE = 111;
    public static final int RIGHT = 142;
    private static final int RsBlas_bnnm = 1000;
    private static final int RsBlas_caxpy = 29;
    private static final int RsBlas_ccopy = 28;
    private static final int RsBlas_cdotc_sub = 6;
    private static final int RsBlas_cdotu_sub = 5;
    private static final int RsBlas_cgbmv = 64;
    private static final int RsBlas_cgemm = 125;
    private static final int RsBlas_cgemv = 63;
    private static final int RsBlas_cgerc = 99;
    private static final int RsBlas_cgeru = 98;
    private static final int RsBlas_chbmv = 96;
    private static final int RsBlas_chemm = 137;
    private static final int RsBlas_chemv = 95;
    private static final int RsBlas_cher = 100;
    private static final int RsBlas_cher2 = 102;
    private static final int RsBlas_cher2k = 139;
    private static final int RsBlas_cherk = 138;
    private static final int RsBlas_chpmv = 97;
    private static final int RsBlas_chpr = 101;
    private static final int RsBlas_chpr2 = 103;
    private static final int RsBlas_cscal = 43;
    private static final int RsBlas_csscal = 45;
    private static final int RsBlas_cswap = 27;
    private static final int RsBlas_csymm = 126;
    private static final int RsBlas_csyr2k = 128;
    private static final int RsBlas_csyrk = 127;
    private static final int RsBlas_ctbmv = 66;
    private static final int RsBlas_ctbsv = 69;
    private static final int RsBlas_ctpmv = 67;
    private static final int RsBlas_ctpsv = 70;
    private static final int RsBlas_ctrmm = 129;
    private static final int RsBlas_ctrmv = 65;
    private static final int RsBlas_ctrsm = 130;
    private static final int RsBlas_ctrsv = 68;
    private static final int RsBlas_dasum = 12;
    private static final int RsBlas_daxpy = 26;
    private static final int RsBlas_dcopy = 25;
    private static final int RsBlas_ddot = 4;
    private static final int RsBlas_dgbmv = 56;
    private static final int RsBlas_dgemm = 119;
    private static final int RsBlas_dgemv = 55;
    private static final int RsBlas_dger = 90;
    private static final int RsBlas_dnrm2 = 11;
    private static final int RsBlas_drot = 39;
    private static final int RsBlas_drotg = 37;
    private static final int RsBlas_drotm = 40;
    private static final int RsBlas_drotmg = 38;
    private static final int RsBlas_dsbmv = 88;
    private static final int RsBlas_dscal = 42;
    private static final int RsBlas_dsdot = 2;
    private static final int RsBlas_dspmv = 89;
    private static final int RsBlas_dspr = 92;
    private static final int RsBlas_dspr2 = 94;
    private static final int RsBlas_dswap = 24;
    private static final int RsBlas_dsymm = 120;
    private static final int RsBlas_dsymv = 87;
    private static final int RsBlas_dsyr = 91;
    private static final int RsBlas_dsyr2 = 93;
    private static final int RsBlas_dsyr2k = 122;
    private static final int RsBlas_dsyrk = 121;
    private static final int RsBlas_dtbmv = 58;
    private static final int RsBlas_dtbsv = 61;
    private static final int RsBlas_dtpmv = 59;
    private static final int RsBlas_dtpsv = 62;
    private static final int RsBlas_dtrmm = 123;
    private static final int RsBlas_dtrmv = 57;
    private static final int RsBlas_dtrsm = 124;
    private static final int RsBlas_dtrsv = 60;
    private static final int RsBlas_dzasum = 16;
    private static final int RsBlas_dznrm2 = 15;
    private static final int RsBlas_icamax = 19;
    private static final int RsBlas_idamax = 18;
    private static final int RsBlas_isamax = 17;
    private static final int RsBlas_izamax = 20;
    private static final int RsBlas_sasum = 10;
    private static final int RsBlas_saxpy = 23;
    private static final int RsBlas_scasum = 14;
    private static final int RsBlas_scnrm2 = 13;
    private static final int RsBlas_scopy = 22;
    private static final int RsBlas_sdot = 3;
    private static final int RsBlas_sdsdot = 1;
    private static final int RsBlas_sgbmv = 48;
    private static final int RsBlas_sgemm = 113;
    private static final int RsBlas_sgemv = 47;
    private static final int RsBlas_sger = 82;
    private static final int RsBlas_snrm2 = 9;
    private static final int RsBlas_srot = 35;
    private static final int RsBlas_srotg = 33;
    private static final int RsBlas_srotm = 36;
    private static final int RsBlas_srotmg = 34;
    private static final int RsBlas_ssbmv = 80;
    private static final int RsBlas_sscal = 41;
    private static final int RsBlas_sspmv = 81;
    private static final int RsBlas_sspr = 84;
    private static final int RsBlas_sspr2 = 86;
    private static final int RsBlas_sswap = 21;
    private static final int RsBlas_ssymm = 114;
    private static final int RsBlas_ssymv = 79;
    private static final int RsBlas_ssyr = 83;
    private static final int RsBlas_ssyr2 = 85;
    private static final int RsBlas_ssyr2k = 116;
    private static final int RsBlas_ssyrk = 115;
    private static final int RsBlas_stbmv = 50;
    private static final int RsBlas_stbsv = 53;
    private static final int RsBlas_stpmv = 51;
    private static final int RsBlas_stpsv = 54;
    private static final int RsBlas_strmm = 117;
    private static final int RsBlas_strmv = 49;
    private static final int RsBlas_strsm = 118;
    private static final int RsBlas_strsv = 52;
    private static final int RsBlas_zaxpy = 32;
    private static final int RsBlas_zcopy = 31;
    private static final int RsBlas_zdotc_sub = 8;
    private static final int RsBlas_zdotu_sub = 7;
    private static final int RsBlas_zdscal = 46;
    private static final int RsBlas_zgbmv = 72;
    private static final int RsBlas_zgemm = 131;
    private static final int RsBlas_zgemv = 71;
    private static final int RsBlas_zgerc = 108;
    private static final int RsBlas_zgeru = 107;
    private static final int RsBlas_zhbmv = 105;
    private static final int RsBlas_zhemm = 140;
    private static final int RsBlas_zhemv = 104;
    private static final int RsBlas_zher = 109;
    private static final int RsBlas_zher2 = 111;
    private static final int RsBlas_zher2k = 142;
    private static final int RsBlas_zherk = 141;
    private static final int RsBlas_zhpmv = 106;
    private static final int RsBlas_zhpr = 110;
    private static final int RsBlas_zhpr2 = 112;
    private static final int RsBlas_zscal = 44;
    private static final int RsBlas_zswap = 30;
    private static final int RsBlas_zsymm = 132;
    private static final int RsBlas_zsyr2k = 134;
    private static final int RsBlas_zsyrk = 133;
    private static final int RsBlas_ztbmv = 74;
    private static final int RsBlas_ztbsv = 77;
    private static final int RsBlas_ztpmv = 75;
    private static final int RsBlas_ztpsv = 78;
    private static final int RsBlas_ztrmm = 135;
    private static final int RsBlas_ztrmv = 73;
    private static final int RsBlas_ztrsm = 136;
    private static final int RsBlas_ztrsv = 76;
    public static final int TRANSPOSE = 112;
    public static final int UNIT = 132;
    public static final int UPPER = 121;
    private Allocation mLUT;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Diag {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Side {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Transpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Uplo {
    }

    private ScriptIntrinsicBLAS(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    public static ScriptIntrinsicBLAS create(RenderScript renderScript) {
        boolean isUseNative = renderScript.isUseNative();
        ScriptIntrinsicBLAS scriptIntrinsicBLAS = new ScriptIntrinsicBLAS(renderScript.nScriptIntrinsicCreate(13, Element.U32(renderScript).getID(renderScript), false), renderScript);
        scriptIntrinsicBLAS.setIncSupp(false);
        return scriptIntrinsicBLAS;
    }

    public static void validateConjTranspose(int i2) {
        if (i2 != 111 && i2 != 113) {
            throw new RSRuntimeException("Invalid transpose passed to BLAS");
        }
    }

    public static void validateDiag(int i2) {
        if (i2 != 131 && i2 != 132) {
            throw new RSRuntimeException("Invalid diag passed to BLAS");
        }
    }

    public static void validateGEMV(Element element, int i2, Allocation allocation, Allocation allocation2, int i3, Allocation allocation3, int i4) {
        int i5;
        int i6;
        validateTranspose(i2);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        if (!a.M(allocation, element) || !a.M(allocation2, element) || !a.M(allocation3, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1 || allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (i3 <= 0 || i4 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        } else {
            if (i2 == 111) {
                i6 = a.w(x, 1, i3, 1);
                i5 = a.w(y, 1, i4, 1);
            } else {
                i6 = a.w(y, 1, i3, 1);
                i5 = a.w(x, 1, i4, 1);
            }
            if (allocation2.getType().getX() != i6 || allocation3.getType().getX() != i5) {
                throw new RSRuntimeException("Incorrect vector dimensions for GEMV");
            }
        }
    }

    public static void validateGER(Element element, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        if (!a.M(allocation3, element) || !a.M(allocation, element) || !a.M(allocation2, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else {
            int y = allocation3.getType().getY();
            int x = allocation3.getType().getX();
            if (x < 1 || y < 1) {
                throw new RSRuntimeException("M and N must be 1 or greater for GER");
            } else if (i2 <= 0 || i3 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else {
                if (allocation.getType().getX() == a.w(y, 1, i2, 1)) {
                    if (allocation2.getType().getX() != a.w(x, 1, i3, 1)) {
                        throw new RSRuntimeException("Incorrect vector dimensions for GER");
                    }
                    return;
                }
                throw new RSRuntimeException("Incorrect vector dimensions for GER");
            }
        }
    }

    public static void validateGERU(Element element, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        if (!a.M(allocation3, element) || !a.M(allocation, element) || !a.M(allocation2, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else {
            int y = allocation3.getType().getY();
            int x = allocation3.getType().getX();
            if (i2 <= 0 || i3 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            }
            if (allocation.getType().getX() == a.w(y, 1, i2, 1)) {
                if (allocation2.getType().getX() != a.w(x, 1, i3, 1)) {
                    throw new RSRuntimeException("Incorrect vector dimensions for GERU");
                }
                return;
            }
            throw new RSRuntimeException("Incorrect vector dimensions for GERU");
        }
    }

    public static void validateHEMM(Element element, int i2, Allocation allocation, Allocation allocation2, Allocation allocation3) {
        validateSide(i2);
        if (!allocation.getType().getElement().isCompatible(element) || !a.M(allocation2, element) || !a.M(allocation3, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        int x = allocation.getType().getX();
        if (x != allocation.getType().getY()) {
            throw new RSRuntimeException("Called HEMM with non-square A");
        } else if ((i2 == 141 && x != allocation2.getType().getY()) || (i2 == 142 && x != allocation2.getType().getX())) {
            throw new RSRuntimeException("Called HEMM with invalid B");
        } else if (allocation2.getType().getX() != allocation3.getType().getX() || allocation2.getType().getY() != allocation3.getType().getY()) {
            throw new RSRuntimeException("Called HEMM with mismatched B and C");
        }
    }

    public static void validateHER2K(Element element, int i2, Allocation allocation, Allocation allocation2, Allocation allocation3) {
        if (!a.M(allocation, element) || !a.M(allocation2, element) || !a.M(allocation3, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        validateConjTranspose(i2);
        int x = allocation3.getType().getX();
        if (x == allocation3.getType().getY()) {
            if (i2 == 111) {
                if (allocation.getType().getY() != x) {
                    throw new RSRuntimeException("Called HER2K with invalid matrices");
                }
            } else if (allocation.getType().getX() != x) {
                throw new RSRuntimeException("Called HER2K with invalid matrices");
            }
            if (allocation.getType().getX() != allocation2.getType().getX() || allocation.getType().getY() != allocation2.getType().getY()) {
                throw new RSRuntimeException("Called HER2K with invalid A and B matrices");
            }
            return;
        }
        throw new RSRuntimeException("Called HER2K with non-square C");
    }

    public static void validateHERK(Element element, int i2, Allocation allocation, Allocation allocation2) {
        if (!a.M(allocation, element) || !a.M(allocation2, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        validateConjTranspose(i2);
        int x = allocation2.getType().getX();
        if (x != allocation2.getType().getY()) {
            throw new RSRuntimeException("Called HERK with non-square C");
        } else if (i2 == 111) {
            if (x != allocation.getType().getY()) {
                throw new RSRuntimeException("Called HERK with invalid A");
            }
        } else if (x != allocation.getType().getX()) {
            throw new RSRuntimeException("Called HERK with invalid A");
        }
    }

    public static void validateL3(Element element, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, Allocation allocation3) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if ((allocation != null && !a.M(allocation, element)) || ((allocation2 != null && !a.M(allocation2, element)) || (allocation3 != null && !a.M(allocation3, element)))) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation3 != null) {
            int y = allocation3.getType().getY();
            int x = allocation3.getType().getX();
            int i11 = -1;
            if (i4 != 142) {
                if (allocation == null) {
                    i8 = -1;
                    i9 = -1;
                } else if (i2 == 112 || i2 == 113) {
                    i9 = allocation.getType().getY();
                    i8 = allocation.getType().getX();
                } else {
                    i8 = allocation.getType().getY();
                    i9 = allocation.getType().getX();
                }
                if (allocation2 == null) {
                    i10 = -1;
                } else if (i3 == 112 || i3 == 113) {
                    i6 = allocation2.getType().getY();
                    i11 = i9;
                    i5 = i8;
                    i7 = allocation2.getType().getX();
                } else {
                    i11 = allocation2.getType().getY();
                    i10 = allocation2.getType().getX();
                }
                i5 = i8;
                i7 = i11;
                i11 = i9;
            } else if ((allocation != null || allocation2 == null) && (allocation == null || allocation2 != null)) {
                if (allocation2 != null) {
                    i7 = allocation.getType().getY();
                    i6 = allocation.getType().getX();
                } else {
                    i7 = -1;
                    i6 = -1;
                }
                if (allocation != null) {
                    int y2 = allocation2.getType().getY();
                    i11 = allocation2.getType().getX();
                    i5 = y2;
                } else {
                    i5 = -1;
                }
            } else {
                throw new RSRuntimeException("Provided Matrix A without Matrix B, or vice versa");
            }
            if (allocation == null || allocation2 == null) {
                if (allocation != null) {
                    if (y != x) {
                        throw new RSRuntimeException("Matrix C is not symmetric");
                    } else if (i5 != y) {
                        throw new RSRuntimeException("Called BLAS with invalid dimensions");
                    }
                } else if (allocation != null && allocation2 != null && i11 != i7) {
                    throw new RSRuntimeException("Called BLAS with invalid dimensions");
                }
            } else if (i11 != i7 || i5 != y || i6 != x) {
                throw new RSRuntimeException("Called BLAS with invalid dimensions");
            }
        } else {
            throw new RSRuntimeException("Allocation C cannot be null");
        }
    }

    public static int validateSPMV(Element element, int i2, Allocation allocation, Allocation allocation2, int i3, Allocation allocation3, int i4) {
        validateUplo(i2);
        if (!allocation.getType().getElement().isCompatible(element) || !a.M(allocation2, element) || !a.M(allocation3, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1 || allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (allocation.getType().getY() <= 1) {
            int sqrt = (int) Math.sqrt(((double) allocation.getType().getX()) * 2.0d);
            if (allocation.getType().getX() != ((sqrt + 1) * sqrt) / 2) {
                throw new RSRuntimeException("Invalid dimension for Ap");
            } else if (i3 <= 0 || i4 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else {
                int i5 = sqrt - 1;
                if (allocation2.getType().getX() == (i3 * i5) + 1) {
                    if (allocation3.getType().getX() == (i5 * i4) + 1) {
                        return sqrt;
                    }
                    throw new RSRuntimeException("Incorrect vector dimensions for SPMV");
                }
                throw new RSRuntimeException("Incorrect vector dimensions for SPMV");
            }
        } else {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        }
    }

    public static int validateSPR(Element element, int i2, Allocation allocation, int i3, Allocation allocation2) {
        validateUplo(i2);
        if (!allocation2.getType().getElement().isCompatible(element) || !a.M(allocation, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (allocation2.getType().getY() <= 1) {
            int sqrt = (int) Math.sqrt(((double) allocation2.getType().getX()) * 2.0d);
            if (allocation2.getType().getX() != ((sqrt + 1) * sqrt) / 2) {
                throw new RSRuntimeException("Invalid dimension for Ap");
            } else if (i3 > 0) {
                if (allocation.getType().getX() == ((sqrt - 1) * i3) + 1) {
                    return sqrt;
                }
                throw new RSRuntimeException("Incorrect vector dimensions for SPR");
            } else {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            }
        } else {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        }
    }

    public static int validateSPR2(Element element, int i2, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        validateUplo(i2);
        if (!allocation3.getType().getElement().isCompatible(element) || !a.M(allocation, element) || !a.M(allocation2, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (allocation3.getType().getY() <= 1) {
            int sqrt = (int) Math.sqrt(((double) allocation3.getType().getX()) * 2.0d);
            if (allocation3.getType().getX() != ((sqrt + 1) * sqrt) / 2) {
                throw new RSRuntimeException("Invalid dimension for Ap");
            } else if (i3 <= 0 || i4 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else {
                int i5 = sqrt - 1;
                int i6 = (i3 * i5) + 1;
                int i7 = (i5 * i4) + 1;
                if (allocation.getType().getX() == i6 && allocation2.getType().getX() == i7) {
                    return sqrt;
                }
                throw new RSRuntimeException("Incorrect vector dimensions for SPR2");
            }
        } else {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        }
    }

    public static int validateSYMV(Element element, int i2, Allocation allocation, Allocation allocation2, Allocation allocation3, int i3, int i4) {
        validateUplo(i2);
        int y = allocation.getType().getY();
        if (allocation.getType().getX() != y) {
            throw new RSRuntimeException("A must be a square matrix for SYMV");
        } else if (!a.M(allocation, element) || !a.M(allocation2, element) || !a.M(allocation3, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1 || allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (i3 <= 0 || i4 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        } else {
            int i5 = y - 1;
            if (allocation2.getType().getX() == (i3 * i5) + 1) {
                if (allocation3.getType().getX() == (i5 * i4) + 1) {
                    return y;
                }
                throw new RSRuntimeException("Incorrect vector dimensions for SYMV");
            }
            throw new RSRuntimeException("Incorrect vector dimensions for SYMV");
        }
    }

    public static int validateSYR(Element element, int i2, Allocation allocation, int i3, Allocation allocation2) {
        validateUplo(i2);
        if (!allocation2.getType().getElement().isCompatible(element) || !a.M(allocation, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        int x = allocation2.getType().getX();
        if (allocation.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (x != allocation2.getType().getY()) {
            throw new RSRuntimeException("A must be a symmetric matrix");
        } else if (i3 > 0) {
            if (allocation.getType().getX() == ((x - 1) * i3) + 1) {
                return x;
            }
            throw new RSRuntimeException("Incorrect vector dimensions for SYR");
        } else {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
    }

    public static int validateSYR2(Element element, int i2, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        validateUplo(i2);
        if (!allocation3.getType().getElement().isCompatible(element) || !a.M(allocation, element) || !a.M(allocation2, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else {
            int x = allocation3.getType().getX();
            if (x != allocation3.getType().getY()) {
                throw new RSRuntimeException("A must be a symmetric matrix");
            } else if (i3 <= 0 || i4 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else {
                int i5 = x - 1;
                int i6 = (i3 * i5) + 1;
                int i7 = (i5 * i4) + 1;
                if (allocation.getType().getX() == i6 && allocation2.getType().getX() == i7) {
                    return x;
                }
                throw new RSRuntimeException("Incorrect vector dimensions for SYR");
            }
        }
    }

    public static void validateSYR2K(Element element, int i2, Allocation allocation, Allocation allocation2, Allocation allocation3) {
        validateTranspose(i2);
        if (!allocation.getType().getElement().isCompatible(element) || !a.M(allocation2, element) || !a.M(allocation3, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        int x = i2 == 112 ? allocation.getType().getX() : allocation.getType().getY();
        if (allocation3.getType().getX() != x || allocation3.getType().getY() != x) {
            throw new RSRuntimeException("Invalid symmetric matrix in SYR2K");
        } else if (allocation.getType().getX() != allocation2.getType().getX() || allocation.getType().getY() != allocation2.getType().getY()) {
            throw new RSRuntimeException("Invalid A and B in SYR2K");
        }
    }

    public static void validateSide(int i2) {
        if (i2 != 141 && i2 != 142) {
            throw new RSRuntimeException("Invalid side passed to BLAS");
        }
    }

    public static int validateTPMV(Element element, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        validateTranspose(i3);
        validateUplo(i2);
        validateDiag(i4);
        if (!allocation.getType().getElement().isCompatible(element) || !a.M(allocation2, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (allocation.getType().getY() <= 1) {
            int sqrt = (int) Math.sqrt(((double) allocation.getType().getX()) * 2.0d);
            if (allocation.getType().getX() != ((sqrt + 1) * sqrt) / 2) {
                throw new RSRuntimeException("Invalid dimension for Ap");
            } else if (i5 > 0) {
                if (allocation2.getType().getX() == ((sqrt - 1) * i5) + 1) {
                    return sqrt;
                }
                throw new RSRuntimeException("Incorrect vector dimensions for TPMV");
            } else {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            }
        } else {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        }
    }

    public static void validateTRMM(Element element, int i2, int i3, Allocation allocation, Allocation allocation2) {
        validateSide(i2);
        validateTranspose(i3);
        if (!allocation.getType().getElement().isCompatible(element) || !a.M(allocation2, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        if (y == x) {
            int y2 = allocation2.getType().getY();
            int x2 = allocation2.getType().getX();
            if (i2 == 141) {
                if (x != y2) {
                    throw new RSRuntimeException("Called TRMM with invalid matrices");
                }
            } else if (x2 != y) {
                throw new RSRuntimeException("Called TRMM with invalid matrices");
            }
        } else {
            throw new RSRuntimeException("Called TRMM with a non-symmetric matrix A");
        }
    }

    public static void validateTRMV(Element element, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        validateTranspose(i3);
        validateUplo(i2);
        validateDiag(i4);
        int y = allocation.getType().getY();
        if (allocation.getType().getX() != y) {
            throw new RSRuntimeException("A must be a square matrix for TRMV");
        } else if (!a.M(allocation, element) || !a.M(allocation2, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (i5 > 0) {
            if (allocation2.getType().getX() != a.w(y, 1, i5, 1)) {
                throw new RSRuntimeException("Incorrect vector dimensions for TRMV");
            }
        } else {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        }
    }

    public static void validateTRSM(Element element, int i2, int i3, Allocation allocation, Allocation allocation2) {
        validateSide(i2);
        validateTranspose(i3);
        if (!allocation.getType().getElement().isCompatible(element) || !a.M(allocation2, element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        }
        int x = allocation.getType().getX();
        if (x == allocation.getType().getY()) {
            int y = allocation2.getType().getY();
            int x2 = allocation2.getType().getX();
            if (i2 == 141) {
                if (x != y) {
                    throw new RSRuntimeException("Called TRSM with invalid matrix dimensions");
                }
            } else if (x != x2) {
                throw new RSRuntimeException("Called TRSM with invalid matrix dimensions");
            }
        } else {
            throw new RSRuntimeException("Called TRSM with a non-symmetric matrix A");
        }
    }

    public static void validateTranspose(int i2) {
        if (i2 != 111 && i2 != 112 && i2 != 113) {
            throw new RSRuntimeException("Invalid transpose passed to BLAS");
        }
    }

    public static void validateUplo(int i2) {
        if (i2 != 121 && i2 != 122) {
            throw new RSRuntimeException("Invalid uplo passed to BLAS");
        }
    }

    public void BNNM(Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3, int i4, int i5) {
        long j2;
        long j3;
        long j4;
        int i6 = i2;
        Allocation allocation4 = allocation2;
        int i7 = i3;
        Allocation allocation5 = allocation3;
        validateL3(Element.U8(this.mRS), 111, 112, 0, allocation, allocation2, allocation3);
        if (i6 < 0 || i6 > 255) {
            throw new RSRuntimeException("Invalid a_offset passed to BNNM");
        } else if (i7 < 0 || i7 > 255) {
            throw new RSRuntimeException("Invalid b_offset passed to BNNM");
        } else {
            int y = allocation.getType().getY();
            int y2 = allocation2.getType().getY();
            int x = allocation.getType().getX();
            boolean isIncSupp = isIncSupp();
            long id = allocation.getID(this.mRS);
            long id2 = allocation4.getID(this.mRS);
            long id3 = allocation5.getID(this.mRS);
            if (isIncSupp) {
                long dummyAlloc = getDummyAlloc(allocation);
                long dummyAlloc2 = getDummyAlloc(allocation4);
                j2 = getDummyAlloc(allocation5);
                j3 = dummyAlloc2;
                j4 = dummyAlloc;
            } else {
                j4 = id;
                j3 = id2;
                j2 = id3;
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_BNNM(getID(renderScript), y, y2, x, j4, i2, j3, i3, j2, i4, i5, isIncSupp);
        }
    }

    public void CGBMV(int i2, int i3, int i4, Float2 float2, Allocation allocation, Allocation allocation2, int i5, Float2 float22, Allocation allocation3, int i6) {
        Float2 float23 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Float2 float24 = float22;
        Allocation allocation6 = allocation3;
        validateGEMV(Element.F32_2(this.mRS), i2, allocation, allocation2, i5, allocation3, i6);
        if (i3 < 0 || i4 < 0) {
            throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
        }
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        int i7 = i2;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 64, i7, 0, 0, 0, 0, y, x, 0, float23.x, float23.y, id, id2, float24.x, float24.y, id3, i5, i6, i3, i4, isIncSupp);
    }

    public void CGEMM(int i2, int i3, Float2 float2, Allocation allocation, Allocation allocation2, Float2 float22, Allocation allocation3) {
        int i4;
        int i5;
        long j2;
        long j3;
        long j4;
        Float2 float23 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Float2 float24 = float22;
        Allocation allocation6 = allocation3;
        validateTranspose(i2);
        validateTranspose(i3);
        int i6 = i2;
        validateL3(Element.F32_2(this.mRS), i6, i3, 0, allocation, allocation2, allocation3);
        Type type = allocation.getType();
        if (i6 != 111) {
            i5 = type.getX();
            i4 = allocation.getType().getY();
        } else {
            i5 = type.getY();
            i4 = allocation.getType().getX();
        }
        int i7 = i5;
        int i8 = i4;
        int y = i3 != 111 ? allocation2.getType().getY() : allocation2.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            j4 = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j2 = getDummyAlloc(allocation6);
        } else {
            j4 = id;
            j3 = id2;
            j2 = id3;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), RsBlas_cgemm, i2, i3, 0, 0, 0, i7, y, i8, float23.x, float23.y, j4, j3, float24.x, float24.y, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void CGEMV(int i2, Float2 float2, Allocation allocation, Allocation allocation2, int i3, Float2 float22, Allocation allocation3, int i4) {
        Float2 float23 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Float2 float24 = float22;
        Allocation allocation6 = allocation3;
        validateGEMV(Element.F32_2(this.mRS), i2, allocation, allocation2, i3, allocation3, i4);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 63, i5, 0, 0, 0, 0, y, x, 0, float23.x, float23.y, id, id2, float24.x, float24.y, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void CGERC(Float2 float2, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        Float2 float22 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateGERU(Element.F32_2(this.mRS), allocation, i2, allocation2, i3, allocation3);
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 99, 0, 0, 0, 0, 0, y, x, 0, float22.x, float22.y, id2, id3, 0.0f, 0.0f, j2, i2, i3, 0, 0, isIncSupp);
    }

    public void CGERU(Float2 float2, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        Float2 float22 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateGERU(Element.F32_2(this.mRS), allocation, i2, allocation2, i3, allocation3);
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 98, 0, 0, 0, 0, 0, y, x, 0, float22.x, float22.y, id2, id3, 0.0f, 0.0f, j2, i2, i3, 0, 0, isIncSupp);
    }

    public void CHBMV(int i2, int i3, Float2 float2, Allocation allocation, Allocation allocation2, int i4, Float2 float22, Allocation allocation3, int i5) {
        Float2 float23 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Float2 float24 = float22;
        Allocation allocation6 = allocation3;
        int validateSYR2 = validateSYR2(Element.F32_2(this.mRS), i2, allocation2, i4, allocation3, i5, allocation);
        if (i3 >= 0) {
            boolean isIncSupp = isIncSupp();
            long id = allocation4.getID(this.mRS);
            long id2 = allocation5.getID(this.mRS);
            long id3 = allocation6.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation4);
                id2 = getDummyAlloc(allocation5);
                id3 = getDummyAlloc(allocation6);
            }
            RenderScript renderScript = this.mRS;
            int i6 = i2;
            int i7 = i3;
            renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 96, 0, 0, 0, i6, 0, 0, validateSYR2, i7, float23.x, float23.y, id, id2, float24.x, float24.y, id3, i4, i5, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("K must be 0 or greater for HBMV");
    }

    public void CHEMM(int i2, int i3, Float2 float2, Allocation allocation, Allocation allocation2, Float2 float22, Allocation allocation3) {
        long j2;
        long j3;
        long j4;
        Float2 float23 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Float2 float24 = float22;
        Allocation allocation6 = allocation3;
        validateUplo(i3);
        validateHEMM(Element.F32_2(this.mRS), i2, allocation4, allocation5, allocation6);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j4 = dummyAlloc;
            j2 = getDummyAlloc(allocation6);
        } else {
            j4 = id;
            j3 = id2;
            j2 = id3;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), RsBlas_chemm, 0, 0, i2, i3, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, float23.x, float23.y, j4, j3, float24.x, float24.y, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void CHEMV(int i2, Float2 float2, Allocation allocation, Allocation allocation2, int i3, Float2 float22, Allocation allocation3, int i4) {
        Float2 float23 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Float2 float24 = float22;
        Allocation allocation6 = allocation3;
        int validateSYR2 = validateSYR2(Element.F32_2(this.mRS), i2, allocation2, i3, allocation3, i4, allocation);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 95, 0, 0, 0, i5, 0, 0, validateSYR2, 0, float23.x, float23.y, id, id2, float24.x, float24.y, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void CHER(int i2, float f, Allocation allocation, int i3, Allocation allocation2) {
        long j2;
        long j3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateSYR = validateSYR(Element.F32_2(this.mRS), i2, allocation3, i3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation3);
            j2 = dummyAlloc;
        } else {
            j2 = id;
            j3 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 100, 0, 0, 0, i2, 0, 0, validateSYR, 0, f, 0.0f, j3, 0, 0.0f, 0.0f, j2, i3, 0, 0, 0, isIncSupp);
    }

    public void CHER2(int i2, Float2 float2, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        Float2 float22 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSYR2 = validateSYR2(Element.F32_2(this.mRS), i2, allocation, i3, allocation2, i4, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 102, 0, 0, 0, i5, 0, 0, validateSYR2, 0, float22.x, float22.y, id2, id3, 0.0f, 0.0f, j2, i3, i4, 0, 0, isIncSupp);
    }

    public void CHER2K(int i2, int i3, Float2 float2, Allocation allocation, Allocation allocation2, float f, Allocation allocation3) {
        long j2;
        long j3;
        int i4 = i3;
        Float2 float22 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateUplo(i2);
        validateHER2K(Element.F32_2(this.mRS), i4, allocation4, allocation5, allocation6);
        int x = i4 == 111 ? allocation.getType().getX() : allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        allocation4.getID(this.mRS);
        long id = allocation5.getID(this.mRS);
        long id2 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j2 = getDummyAlloc(allocation6);
        } else {
            j3 = id;
            j2 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), RsBlas_cher2k, i3, 0, 0, i2, 0, 0, allocation3.getType().getX(), x, float22.x, float22.y, allocation4.getID(this.mRS), j3, f, 0.0f, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void CHERK(int i2, int i3, float f, Allocation allocation, float f2, Allocation allocation2) {
        long j2;
        long j3;
        int i4 = i3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i2);
        validateHERK(Element.F32_2(this.mRS), i4, allocation3, allocation4);
        int y = i4 == 113 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            j3 = getDummyAlloc(allocation3);
            j2 = getDummyAlloc(allocation4);
        } else {
            j3 = id;
            j2 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), RsBlas_cherk, i3, 0, 0, i2, 0, 0, allocation2.getType().getX(), y, f, 0.0f, j3, 0, f2, 0.0f, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void CHPMV(int i2, Float2 float2, Allocation allocation, Allocation allocation2, int i3, Float2 float22, Allocation allocation3, int i4) {
        Float2 float23 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Float2 float24 = float22;
        Allocation allocation6 = allocation3;
        int validateSPR2 = validateSPR2(Element.F32_2(this.mRS), i2, allocation2, i3, allocation3, i4, allocation);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 97, 0, 0, 0, i5, 0, 0, validateSPR2, 0, float23.x, float23.y, id, id2, float24.x, float24.y, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void CHPR(int i2, float f, Allocation allocation, int i3, Allocation allocation2) {
        long j2;
        long j3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateSPR = validateSPR(Element.F32_2(this.mRS), i2, allocation3, i3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation3);
            j2 = dummyAlloc;
        } else {
            j2 = id;
            j3 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 101, 0, 0, 0, i2, 0, 0, validateSPR, 0, f, 0.0f, j3, 0, 0.0f, 0.0f, j2, i3, 0, 0, 0, isIncSupp);
    }

    public void CHPR2(int i2, Float2 float2, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        Float2 float22 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSPR2 = validateSPR2(Element.F32_2(this.mRS), i2, allocation, i3, allocation2, i4, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 103, 0, 0, 0, i5, 0, 0, validateSPR2, 0, float22.x, float22.y, id2, id3, 0.0f, 0.0f, j2, i3, i4, 0, 0, isIncSupp);
    }

    public void CSYMM(int i2, int i3, Float2 float2, Allocation allocation, Allocation allocation2, Float2 float22, Allocation allocation3) {
        Float2 float23 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Float2 float24 = float22;
        Allocation allocation6 = allocation3;
        validateSide(i2);
        validateUplo(i3);
        if (allocation.getType().getX() == allocation.getType().getY()) {
            validateL3(Element.F32_2(this.mRS), 0, 0, i2, allocation, allocation2, allocation3);
            boolean isIncSupp = isIncSupp();
            long id = allocation4.getID(this.mRS);
            long id2 = allocation5.getID(this.mRS);
            long id3 = allocation6.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation4);
                id2 = getDummyAlloc(allocation5);
                id3 = getDummyAlloc(allocation6);
            }
            RenderScript renderScript = this.mRS;
            int i4 = i2;
            int i5 = i3;
            renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), RsBlas_csymm, 0, 0, i4, i5, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, float23.x, float23.y, id, id2, float24.x, float24.y, id3, 0, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("Matrix A is not symmetric");
    }

    public void CSYR2K(int i2, int i3, Float2 float2, Allocation allocation, Allocation allocation2, Float2 float22, Allocation allocation3) {
        long j2;
        long j3;
        long j4;
        int i4 = i3;
        Float2 float23 = float2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Float2 float24 = float22;
        Allocation allocation6 = allocation3;
        validateUplo(i2);
        validateSYR2K(Element.F32_2(this.mRS), i4, allocation4, allocation5, allocation6);
        int y = i4 != 111 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j4 = dummyAlloc;
            j2 = getDummyAlloc(allocation6);
        } else {
            j4 = id;
            j3 = id2;
            j2 = id3;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 128, i3, 0, 0, i2, 0, 0, allocation3.getType().getX(), y, float23.x, float23.y, j4, j3, float24.x, float24.y, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void CSYRK(int i2, int i3, Float2 float2, Allocation allocation, Float2 float22, Allocation allocation2) {
        Float2 float23 = float2;
        Allocation allocation3 = allocation;
        Float2 float24 = float22;
        Allocation allocation4 = allocation2;
        validateTranspose(i3);
        validateUplo(i2);
        int i4 = i3;
        validateL3(Element.F32_2(this.mRS), i4, 0, 0, allocation, (Allocation) null, allocation2);
        int y = i4 != 111 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), RsBlas_csyrk, i3, 0, 0, i2, 0, 0, allocation2.getType().getX(), y, float23.x, float23.y, id, 0, float24.x, float24.y, allocation4.getID(this.mRS), 0, 0, 0, 0, isIncSupp);
    }

    public void CTBMV(int i2, int i3, int i4, int i5, Allocation allocation, Allocation allocation2, int i6) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        if (i5 >= 0) {
            validateTRMV(Element.F32_2(this.mRS), i2, i3, i4, allocation, allocation2, i6);
            int y = allocation.getType().getY();
            boolean isIncSupp = isIncSupp();
            long id = allocation3.getID(this.mRS);
            long id2 = allocation4.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation3);
                id2 = getDummyAlloc(allocation4);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 66, i3, 0, 0, i2, i4, 0, y, i5, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i6, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }

    public void CTBSV(int i2, int i3, int i4, int i5, Allocation allocation, Allocation allocation2, int i6) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F32_2(this.mRS), i2, i3, i4, allocation, allocation2, i6);
        int y = allocation.getType().getY();
        if (i5 >= 0) {
            boolean isIncSupp = isIncSupp();
            long id = allocation3.getID(this.mRS);
            long id2 = allocation4.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation3);
                id2 = getDummyAlloc(allocation4);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 69, i3, 0, 0, i2, i4, 0, y, i5, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i6, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("Number of diagonals must be positive");
    }

    public void CTPMV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateTPMV = validateTPMV(Element.F32_2(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 67, i3, 0, 0, i2, i4, 0, validateTPMV, 0, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void CTPSV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateTPMV = validateTPMV(Element.F32_2(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 70, i3, 0, 0, i2, i4, 0, validateTPMV, 0, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void CTRMM(int i2, int i3, int i4, int i5, Float2 float2, Allocation allocation, Allocation allocation2) {
        Float2 float22 = float2;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i3);
        validateDiag(i5);
        validateTRMM(Element.F32_2(this.mRS), i2, i4, allocation3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        long j2 = id2;
        RenderScript renderScript = this.mRS;
        int i6 = i4;
        int i7 = i2;
        int i8 = i3;
        int i9 = i5;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), RsBlas_ctrmm, i6, 0, i7, i8, i9, allocation2.getType().getY(), allocation2.getType().getX(), 0, float22.x, float22.y, id, j2, 0.0f, 0.0f, 0, 0, 0, 0, 0, isIncSupp);
    }

    public void CTRMV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F32_2(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 65, i3, 0, 0, i2, i4, 0, y, 0, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void CTRSM(int i2, int i3, int i4, int i5, Float2 float2, Allocation allocation, Allocation allocation2) {
        Float2 float22 = float2;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i3);
        validateDiag(i5);
        validateTRSM(Element.F32_2(this.mRS), i2, i4, allocation3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        long j2 = id2;
        RenderScript renderScript = this.mRS;
        int i6 = i4;
        int i7 = i2;
        int i8 = i3;
        int i9 = i5;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), RsBlas_ctrsm, i6, 0, i7, i8, i9, allocation2.getType().getY(), allocation2.getType().getX(), 0, float22.x, float22.y, id, j2, 0.0f, 0.0f, 0, 0, 0, 0, 0, isIncSupp);
    }

    public void CTRSV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F32_2(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Complex(getID(renderScript), 68, i3, 0, 0, i2, i4, 0, y, 0, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void DGBMV(int i2, int i3, int i4, double d, Allocation allocation, Allocation allocation2, int i5, double d2, Allocation allocation3, int i6) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateGEMV(Element.F64(this.mRS), i2, allocation, allocation2, i5, allocation3, i6);
        if (i3 < 0 || i4 < 0) {
            throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
        }
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 56, i2, 0, 0, 0, 0, y, x, 0, d, id, id2, d2, id3, i5, i6, i3, i4, isIncSupp);
    }

    public void DGEMM(int i2, int i3, double d, Allocation allocation, Allocation allocation2, double d2, Allocation allocation3) {
        int i4;
        int i5;
        long j2;
        long j3;
        long j4;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateTranspose(i2);
        validateTranspose(i3);
        validateL3(Element.F64(this.mRS), i2, i3, 0, allocation, allocation2, allocation3);
        int i6 = i2;
        Type type = allocation.getType();
        if (i6 != 111) {
            i5 = type.getX();
            i4 = allocation.getType().getY();
        } else {
            i5 = type.getY();
            i4 = allocation.getType().getX();
        }
        int i7 = i5;
        int i8 = i4;
        int y = i3 != 111 ? allocation2.getType().getY() : allocation2.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            j4 = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j2 = getDummyAlloc(allocation6);
        } else {
            j4 = id;
            j3 = id2;
            j2 = id3;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 119, i2, i3, 0, 0, 0, i7, y, i8, d, j4, j3, d2, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void DGEMV(int i2, double d, Allocation allocation, Allocation allocation2, int i3, double d2, Allocation allocation3, int i4) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateGEMV(Element.F64(this.mRS), i2, allocation, allocation2, i3, allocation3, i4);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 55, i2, 0, 0, 0, 0, y, x, 0, d, id, id2, d2, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void DGER(double d, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        validateGER(Element.F64(this.mRS), allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 90, 0, 0, 0, 0, 0, y, x, 0, d, id2, id3, ShadowDrawableWrapper.COS_45, j2, i2, i3, 0, 0, isIncSupp);
    }

    public void DSBMV(int i2, int i3, double d, Allocation allocation, Allocation allocation2, int i4, double d2, Allocation allocation3, int i5) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        if (i3 >= 0) {
            int validateSYMV = validateSYMV(Element.F64(this.mRS), i2, allocation, allocation2, allocation3, i4, i5);
            boolean isIncSupp = isIncSupp();
            long id = allocation4.getID(this.mRS);
            long id2 = allocation5.getID(this.mRS);
            long id3 = allocation6.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation4);
                id2 = getDummyAlloc(allocation5);
                id3 = getDummyAlloc(allocation6);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 88, 0, 0, 0, i2, 0, 0, validateSYMV, i3, d, id, id2, d2, id3, i4, i5, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }

    public void DSPMV(int i2, double d, Allocation allocation, Allocation allocation2, int i3, double d2, Allocation allocation3, int i4) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSPMV = validateSPMV(Element.F64(this.mRS), i2, allocation, allocation2, i3, allocation3, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 89, 0, 0, 0, i2, 0, 0, validateSPMV, 0, d, id, id2, d2, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void DSPR(int i2, double d, Allocation allocation, int i3, Allocation allocation2) {
        long j2;
        long j3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateSPR = validateSPR(Element.F64(this.mRS), i2, allocation3, i3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation3);
            j2 = dummyAlloc;
        } else {
            j2 = id;
            j3 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 92, 0, 0, 0, i2, 0, 0, validateSPR, 0, d, j3, j2, ShadowDrawableWrapper.COS_45, 0, i3, 0, 0, 0, isIncSupp);
    }

    public void DSPR2(int i2, double d, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSPR2 = validateSPR2(Element.F64(this.mRS), i2, allocation, i3, allocation2, i4, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 94, 0, 0, 0, i2, 0, 0, validateSPR2, 0, d, id2, id3, ShadowDrawableWrapper.COS_45, j2, i3, i4, 0, 0, isIncSupp);
    }

    public void DSYMM(int i2, int i3, double d, Allocation allocation, Allocation allocation2, double d2, Allocation allocation3) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateSide(i2);
        validateUplo(i3);
        if (allocation.getType().getX() == allocation.getType().getY()) {
            validateL3(Element.F64(this.mRS), 0, 0, i2, allocation, allocation2, allocation3);
            boolean isIncSupp = isIncSupp();
            long id = allocation4.getID(this.mRS);
            long id2 = allocation5.getID(this.mRS);
            long id3 = allocation6.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation4);
                id2 = getDummyAlloc(allocation5);
                id3 = getDummyAlloc(allocation6);
            }
            RenderScript renderScript = this.mRS;
            int i4 = i2;
            int i5 = i3;
            renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 120, 0, 0, i4, i5, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, d, id, id2, d2, id3, 0, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("Matrix A is not symmetric");
    }

    public void DSYMV(int i2, double d, Allocation allocation, Allocation allocation2, int i3, double d2, Allocation allocation3, int i4) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSYMV = validateSYMV(Element.F64(this.mRS), i2, allocation, allocation2, allocation3, i3, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 87, 0, 0, 0, i2, 0, 0, validateSYMV, 0, d, id, id2, d2, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void DSYR(int i2, double d, Allocation allocation, int i3, Allocation allocation2) {
        long j2;
        long j3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateSYR = validateSYR(Element.F64(this.mRS), i2, allocation3, i3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation3);
            j2 = dummyAlloc;
        } else {
            j2 = id;
            j3 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 91, 0, 0, 0, i2, 0, 0, validateSYR, 0, d, j3, j2, ShadowDrawableWrapper.COS_45, 0, i3, 0, 0, 0, isIncSupp);
    }

    public void DSYR2(int i2, double d, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSYR2 = validateSYR2(Element.F64(this.mRS), i2, allocation, i3, allocation2, i4, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 93, 0, 0, 0, i2, 0, 0, validateSYR2, 0, d, id2, id3, ShadowDrawableWrapper.COS_45, j2, i3, i4, 0, 0, isIncSupp);
    }

    public void DSYR2K(int i2, int i3, double d, Allocation allocation, Allocation allocation2, double d2, Allocation allocation3) {
        long j2;
        long j3;
        long j4;
        int i4 = i3;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateUplo(i2);
        validateSYR2K(Element.F64(this.mRS), i4, allocation4, allocation5, allocation6);
        int y = i4 != 111 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j4 = dummyAlloc;
            j2 = getDummyAlloc(allocation6);
        } else {
            j4 = id;
            j3 = id2;
            j2 = id3;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 122, i3, 0, 0, i2, 0, 0, allocation3.getType().getX(), y, d, j4, j3, d2, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void DSYRK(int i2, int i3, double d, Allocation allocation, double d2, Allocation allocation2) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTranspose(i3);
        validateUplo(i2);
        int i4 = i3;
        validateL3(Element.F64(this.mRS), i4, 0, 0, allocation, (Allocation) null, allocation2);
        int y = i4 != 111 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 121, i3, 0, 0, i2, 0, 0, allocation2.getType().getX(), y, d, id, 0, d2, id2, 0, 0, 0, 0, isIncSupp);
    }

    public void DTBMV(int i2, int i3, int i4, int i5, Allocation allocation, Allocation allocation2, int i6) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        if (i5 >= 0) {
            validateTRMV(Element.F64(this.mRS), i2, i3, i4, allocation, allocation2, i6);
            int y = allocation.getType().getY();
            boolean isIncSupp = isIncSupp();
            long id = allocation3.getID(this.mRS);
            long id2 = allocation4.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation3);
                id2 = getDummyAlloc(allocation4);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 58, i3, 0, 0, i2, i4, 0, y, i5, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, 0, i6, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }

    public void DTBSV(int i2, int i3, int i4, int i5, Allocation allocation, Allocation allocation2, int i6) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F64(this.mRS), i2, i3, i4, allocation, allocation2, i6);
        int y = allocation.getType().getY();
        if (i5 >= 0) {
            boolean isIncSupp = isIncSupp();
            long id = allocation3.getID(this.mRS);
            long id2 = allocation4.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation3);
                id2 = getDummyAlloc(allocation4);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 61, i3, 0, 0, i2, i4, 0, y, i5, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, 0, i6, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("Number of diagonals must be positive");
    }

    public void DTPMV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateTPMV = validateTPMV(Element.F64(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 59, i3, 0, 0, i2, i4, 0, validateTPMV, 0, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void DTPSV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateTPMV = validateTPMV(Element.F64(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 62, i3, 0, 0, i2, i4, 0, validateTPMV, 0, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void DTRMM(int i2, int i3, int i4, int i5, double d, Allocation allocation, Allocation allocation2) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i3);
        validateDiag(i5);
        validateTRMM(Element.F64(this.mRS), i2, i4, allocation3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        long j2 = id2;
        RenderScript renderScript = this.mRS;
        int i6 = i4;
        int i7 = i2;
        int i8 = i3;
        int i9 = i5;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 123, i6, 0, i7, i8, i9, allocation2.getType().getY(), allocation2.getType().getX(), 0, d, id, j2, ShadowDrawableWrapper.COS_45, 0, 0, 0, 0, 0, isIncSupp);
    }

    public void DTRMV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F64(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 57, i3, 0, 0, i2, i4, 0, y, 0, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void DTRSM(int i2, int i3, int i4, int i5, double d, Allocation allocation, Allocation allocation2) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i3);
        validateDiag(i5);
        validateTRSM(Element.F64(this.mRS), i2, i4, allocation3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        long j2 = id2;
        RenderScript renderScript = this.mRS;
        int i6 = i4;
        int i7 = i2;
        int i8 = i3;
        int i9 = i5;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 124, i6, 0, i7, i8, i9, allocation2.getType().getY(), allocation2.getType().getX(), 0, d, id, j2, ShadowDrawableWrapper.COS_45, 0, 0, 0, 0, 0, isIncSupp);
    }

    public void DTRSV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F64(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Double(getID(renderScript), 60, i3, 0, 0, i2, i4, 0, y, 0, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void SGBMV(int i2, int i3, int i4, float f, Allocation allocation, Allocation allocation2, int i5, float f2, Allocation allocation3, int i6) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateGEMV(Element.F32(this.mRS), i2, allocation, allocation2, i5, allocation3, i6);
        if (i3 < 0 || i4 < 0) {
            throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
        }
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 48, i2, 0, 0, 0, 0, y, x, 0, f, id, id2, f2, id3, i5, i6, i3, i4, isIncSupp);
    }

    public void SGEMM(int i2, int i3, float f, Allocation allocation, Allocation allocation2, float f2, Allocation allocation3) {
        int i4;
        int i5;
        long j2;
        long j3;
        long j4;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateTranspose(i2);
        validateTranspose(i3);
        validateL3(Element.F32(this.mRS), i2, i3, 0, allocation, allocation2, allocation3);
        int i6 = i2;
        Type type = allocation.getType();
        if (i6 != 111) {
            i5 = type.getX();
            i4 = allocation.getType().getY();
        } else {
            i5 = type.getY();
            i4 = allocation.getType().getX();
        }
        int i7 = i5;
        int i8 = i4;
        int y = i3 != 111 ? allocation2.getType().getY() : allocation2.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            j4 = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j2 = getDummyAlloc(allocation6);
        } else {
            j3 = id2;
            j2 = id3;
            j4 = id;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 113, i2, i3, 0, 0, 0, i7, y, i8, f, j4, j3, f2, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void SGEMV(int i2, float f, Allocation allocation, Allocation allocation2, int i3, float f2, Allocation allocation3, int i4) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateGEMV(Element.F32(this.mRS), i2, allocation, allocation2, i3, allocation3, i4);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 47, i2, 0, 0, 0, 0, y, x, 0, f, id, id2, f2, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void SGER(float f, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        validateGER(Element.F32(this.mRS), allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 82, 0, 0, 0, 0, 0, y, x, 0, f, id2, id3, 0.0f, j2, i2, i3, 0, 0, isIncSupp);
    }

    public void SSBMV(int i2, int i3, float f, Allocation allocation, Allocation allocation2, int i4, float f2, Allocation allocation3, int i5) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        if (i3 >= 0) {
            int validateSYMV = validateSYMV(Element.F32(this.mRS), i2, allocation, allocation2, allocation3, i4, i5);
            boolean isIncSupp = isIncSupp();
            long id = allocation4.getID(this.mRS);
            long id2 = allocation5.getID(this.mRS);
            long id3 = allocation6.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation4);
                id2 = getDummyAlloc(allocation5);
                id3 = getDummyAlloc(allocation6);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 80, 0, 0, 0, i2, 0, 0, validateSYMV, i3, f, id, id2, f2, id3, i4, i5, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }

    public void SSPMV(int i2, float f, Allocation allocation, Allocation allocation2, int i3, float f2, Allocation allocation3, int i4) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSPMV = validateSPMV(Element.F32(this.mRS), i2, allocation, allocation2, i3, allocation3, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 81, 0, 0, 0, i2, 0, 0, validateSPMV, 0, f, id, id2, f2, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void SSPR(int i2, float f, Allocation allocation, int i3, Allocation allocation2) {
        long j2;
        long j3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateSPR = validateSPR(Element.F32(this.mRS), i2, allocation3, i3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation3);
            j2 = dummyAlloc;
        } else {
            j2 = id;
            j3 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 84, 0, 0, 0, i2, 0, 0, validateSPR, 0, f, j3, j2, 0.0f, 0, i3, 0, 0, 0, isIncSupp);
    }

    public void SSPR2(int i2, float f, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSPR2 = validateSPR2(Element.F32(this.mRS), i2, allocation, i3, allocation2, i4, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 86, 0, 0, 0, i2, 0, 0, validateSPR2, 0, f, id2, id3, 0.0f, j2, i3, i4, 0, 0, isIncSupp);
    }

    public void SSYMM(int i2, int i3, float f, Allocation allocation, Allocation allocation2, float f2, Allocation allocation3) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateSide(i2);
        validateUplo(i3);
        if (allocation.getType().getX() == allocation.getType().getY()) {
            validateL3(Element.F32(this.mRS), 0, 0, i2, allocation, allocation2, allocation3);
            boolean isIncSupp = isIncSupp();
            long id = allocation4.getID(this.mRS);
            long id2 = allocation5.getID(this.mRS);
            long id3 = allocation6.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation4);
                id2 = getDummyAlloc(allocation5);
                id3 = getDummyAlloc(allocation6);
            }
            RenderScript renderScript = this.mRS;
            int i4 = i2;
            int i5 = i3;
            renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 114, 0, 0, i4, i5, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, f, id, id2, f2, id3, 0, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("Matrix A is not symmetric");
    }

    public void SSYMV(int i2, float f, Allocation allocation, Allocation allocation2, int i3, float f2, Allocation allocation3, int i4) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSYMV = validateSYMV(Element.F32(this.mRS), i2, allocation, allocation2, allocation3, i3, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 79, 0, 0, 0, i2, 0, 0, validateSYMV, 0, f, id, id2, f2, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void SSYR(int i2, float f, Allocation allocation, int i3, Allocation allocation2) {
        long j2;
        long j3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateSYR = validateSYR(Element.F32(this.mRS), i2, allocation3, i3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation3);
            j2 = dummyAlloc;
        } else {
            j2 = id;
            j3 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 83, 0, 0, 0, i2, 0, 0, validateSYR, 0, f, j3, j2, 0.0f, 0, i3, 0, 0, 0, isIncSupp);
    }

    public void SSYR2(int i2, float f, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSYR2 = validateSYR2(Element.F32(this.mRS), i2, allocation, i3, allocation2, i4, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 85, 0, 0, 0, i2, 0, 0, validateSYR2, 0, f, id2, id3, 0.0f, j2, i3, i4, 0, 0, isIncSupp);
    }

    public void SSYR2K(int i2, int i3, float f, Allocation allocation, Allocation allocation2, float f2, Allocation allocation3) {
        long j2;
        long j3;
        long j4;
        int i4 = i3;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateUplo(i2);
        validateSYR2K(Element.F32(this.mRS), i4, allocation4, allocation5, allocation6);
        int y = i4 != 111 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j4 = dummyAlloc;
            j2 = getDummyAlloc(allocation6);
        } else {
            j4 = id;
            j3 = id2;
            j2 = id3;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 116, i3, 0, 0, i2, 0, 0, allocation3.getType().getX(), y, f, j4, j3, f2, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void SSYRK(int i2, int i3, float f, Allocation allocation, float f2, Allocation allocation2) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTranspose(i3);
        validateUplo(i2);
        int i4 = i3;
        validateL3(Element.F32(this.mRS), i4, 0, 0, allocation, (Allocation) null, allocation2);
        int y = i4 != 111 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 115, i3, 0, 0, i2, 0, 0, allocation2.getType().getX(), y, f, id, 0, f2, id2, 0, 0, 0, 0, isIncSupp);
    }

    public void STBMV(int i2, int i3, int i4, int i5, Allocation allocation, Allocation allocation2, int i6) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        if (i5 >= 0) {
            validateTRMV(Element.F32(this.mRS), i2, i3, i4, allocation, allocation2, i6);
            int y = allocation.getType().getY();
            boolean isIncSupp = isIncSupp();
            long id = allocation3.getID(this.mRS);
            long id2 = allocation4.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation3);
                id2 = getDummyAlloc(allocation4);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 50, i3, 0, 0, i2, i4, 0, y, i5, 0.0f, id, id2, 0.0f, 0, i6, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }

    public void STBSV(int i2, int i3, int i4, int i5, Allocation allocation, Allocation allocation2, int i6) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F32(this.mRS), i2, i3, i4, allocation, allocation2, i6);
        int y = allocation.getType().getY();
        if (i5 >= 0) {
            boolean isIncSupp = isIncSupp();
            long id = allocation3.getID(this.mRS);
            long id2 = allocation4.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation3);
                id2 = getDummyAlloc(allocation4);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 53, i3, 0, 0, i2, i4, 0, y, i5, 0.0f, id, id2, 0.0f, 0, i6, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("Number of diagonals must be positive");
    }

    public void STPMV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateTPMV = validateTPMV(Element.F32(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 51, i3, 0, 0, i2, i4, 0, validateTPMV, 0, 0.0f, id, id2, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void STPSV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateTPMV = validateTPMV(Element.F32(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 54, i3, 0, 0, i2, i4, 0, validateTPMV, 0, 0.0f, id, id2, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void STRMM(int i2, int i3, int i4, int i5, float f, Allocation allocation, Allocation allocation2) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i3);
        validateDiag(i5);
        validateTRMM(Element.F32(this.mRS), i2, i4, allocation3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        long j2 = id2;
        RenderScript renderScript = this.mRS;
        int i6 = i4;
        int i7 = i2;
        int i8 = i3;
        int i9 = i5;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 117, i6, 0, i7, i8, i9, allocation2.getType().getY(), allocation2.getType().getX(), 0, f, id, j2, 0.0f, 0, 0, 0, 0, 0, isIncSupp);
    }

    public void STRMV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F32(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 49, i3, 0, 0, i2, i4, 0, y, 0, 0.0f, id, id2, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void STRSM(int i2, int i3, int i4, int i5, float f, Allocation allocation, Allocation allocation2) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i3);
        validateDiag(i5);
        validateTRSM(Element.F32(this.mRS), i2, i4, allocation3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        long j2 = id2;
        RenderScript renderScript = this.mRS;
        int i6 = i4;
        int i7 = i2;
        int i8 = i3;
        int i9 = i5;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 118, i6, 0, i7, i8, i9, allocation2.getType().getY(), allocation2.getType().getX(), 0, f, id, j2, 0.0f, 0, 0, 0, 0, 0, isIncSupp);
    }

    public void STRSV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F32(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Single(getID(renderScript), 52, i3, 0, 0, i2, i4, 0, y, 0, 0.0f, id, id2, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void ZGBMV(int i2, int i3, int i4, Double2 double2, Allocation allocation, Allocation allocation2, int i5, Double2 double22, Allocation allocation3, int i6) {
        Double2 double23 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Double2 double24 = double22;
        Allocation allocation6 = allocation3;
        validateGEMV(Element.F64_2(this.mRS), i2, allocation, allocation2, i5, allocation3, i6);
        if (i3 < 0 || i4 < 0) {
            throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
        }
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        int i7 = i2;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 72, i7, 0, 0, 0, 0, y, x, 0, double23.x, double23.y, id, id2, double24.x, double24.y, id3, i5, i6, i3, i4, isIncSupp);
    }

    public void ZGEMM(int i2, int i3, Double2 double2, Allocation allocation, Allocation allocation2, Double2 double22, Allocation allocation3) {
        int i4;
        int i5;
        long j2;
        long j3;
        long j4;
        Double2 double23 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Double2 double24 = double22;
        Allocation allocation6 = allocation3;
        validateTranspose(i2);
        validateTranspose(i3);
        int i6 = i2;
        validateL3(Element.F64_2(this.mRS), i6, i3, 0, allocation, allocation2, allocation3);
        Type type = allocation.getType();
        if (i6 != 111) {
            i5 = type.getX();
            i4 = allocation.getType().getY();
        } else {
            i5 = type.getY();
            i4 = allocation.getType().getX();
        }
        int i7 = i5;
        int i8 = i4;
        int y = i3 != 111 ? allocation2.getType().getY() : allocation2.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            j4 = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j2 = getDummyAlloc(allocation6);
        } else {
            j4 = id;
            j3 = id2;
            j2 = id3;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 131, i2, i3, 0, 0, 0, i7, y, i8, double23.x, double23.y, j4, j3, double24.x, double24.y, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void ZGEMV(int i2, Double2 double2, Allocation allocation, Allocation allocation2, int i3, Double2 double22, Allocation allocation3, int i4) {
        Double2 double23 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Double2 double24 = double22;
        Allocation allocation6 = allocation3;
        validateGEMV(Element.F64_2(this.mRS), i2, allocation, allocation2, i3, allocation3, i4);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 71, i5, 0, 0, 0, 0, y, x, 0, double23.x, double23.y, id, id2, double24.x, double24.y, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void ZGERC(Double2 double2, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        Double2 double22 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateGERU(Element.F64_2(this.mRS), allocation, i2, allocation2, i3, allocation3);
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 108, 0, 0, 0, 0, 0, y, x, 0, double22.x, double22.y, id2, id3, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, j2, i2, i3, 0, 0, isIncSupp);
    }

    public void ZGERU(Double2 double2, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        Double2 double22 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateGERU(Element.F64_2(this.mRS), allocation, i2, allocation2, i3, allocation3);
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 107, 0, 0, 0, 0, 0, y, x, 0, double22.x, double22.y, id2, id3, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, j2, i2, i3, 0, 0, isIncSupp);
    }

    public void ZHBMV(int i2, int i3, Double2 double2, Allocation allocation, Allocation allocation2, int i4, Double2 double22, Allocation allocation3, int i5) {
        Double2 double23 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Double2 double24 = double22;
        Allocation allocation6 = allocation3;
        int validateSYR2 = validateSYR2(Element.F64_2(this.mRS), i2, allocation2, i4, allocation3, i5, allocation);
        if (i3 >= 0) {
            boolean isIncSupp = isIncSupp();
            long id = allocation4.getID(this.mRS);
            long id2 = allocation5.getID(this.mRS);
            long id3 = allocation6.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation4);
                id2 = getDummyAlloc(allocation5);
                id3 = getDummyAlloc(allocation6);
            }
            RenderScript renderScript = this.mRS;
            int i6 = i2;
            int i7 = i3;
            renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 105, 0, 0, 0, i6, 0, 0, validateSYR2, i7, double23.x, double23.y, id, id2, double24.x, double24.y, id3, i4, i5, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("K must be 0 or greater for HBMV");
    }

    public void ZHEMM(int i2, int i3, Double2 double2, Allocation allocation, Allocation allocation2, Double2 double22, Allocation allocation3) {
        long j2;
        long j3;
        long j4;
        Double2 double23 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Double2 double24 = double22;
        Allocation allocation6 = allocation3;
        validateUplo(i3);
        validateHEMM(Element.F64_2(this.mRS), i2, allocation4, allocation5, allocation6);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j4 = dummyAlloc;
            j2 = getDummyAlloc(allocation6);
        } else {
            j4 = id;
            j3 = id2;
            j2 = id3;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), RsBlas_zhemm, 0, 0, i2, i3, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, double23.x, double23.y, j4, j3, double24.x, double24.y, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void ZHEMV(int i2, Double2 double2, Allocation allocation, Allocation allocation2, int i3, Double2 double22, Allocation allocation3, int i4) {
        Double2 double23 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Double2 double24 = double22;
        Allocation allocation6 = allocation3;
        int validateSYR2 = validateSYR2(Element.F64_2(this.mRS), i2, allocation2, i3, allocation3, i4, allocation);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 104, 0, 0, 0, i5, 0, 0, validateSYR2, 0, double23.x, double23.y, id, id2, double24.x, double24.y, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void ZHER(int i2, double d, Allocation allocation, int i3, Allocation allocation2) {
        long j2;
        long j3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateSYR = validateSYR(Element.F64_2(this.mRS), i2, allocation3, i3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation3);
            j2 = dummyAlloc;
        } else {
            j2 = id;
            j3 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 109, 0, 0, 0, i2, 0, 0, validateSYR, 0, d, ShadowDrawableWrapper.COS_45, j3, 0, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, j2, i3, 0, 0, 0, isIncSupp);
    }

    public void ZHER2(int i2, Double2 double2, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        Double2 double22 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSYR2 = validateSYR2(Element.F64_2(this.mRS), i2, allocation, i3, allocation2, i4, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 111, 0, 0, 0, i5, 0, 0, validateSYR2, 0, double22.x, double22.y, id2, id3, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, j2, i3, i4, 0, 0, isIncSupp);
    }

    public void ZHER2K(int i2, int i3, Double2 double2, Allocation allocation, Allocation allocation2, double d, Allocation allocation3) {
        long j2;
        long j3;
        int i4 = i3;
        Double2 double22 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        validateUplo(i2);
        validateHER2K(Element.F64_2(this.mRS), i4, allocation4, allocation5, allocation6);
        int x = i4 == 111 ? allocation.getType().getX() : allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        allocation4.getID(this.mRS);
        long id = allocation5.getID(this.mRS);
        long id2 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j2 = getDummyAlloc(allocation6);
        } else {
            j3 = id;
            j2 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 142, i3, 0, 0, i2, 0, 0, allocation3.getType().getX(), x, double22.x, double22.y, allocation4.getID(this.mRS), j3, d, ShadowDrawableWrapper.COS_45, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void ZHERK(int i2, int i3, double d, Allocation allocation, double d2, Allocation allocation2) {
        long j2;
        long j3;
        int i4 = i3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i2);
        validateHERK(Element.F64_2(this.mRS), i4, allocation3, allocation4);
        int y = i4 == 113 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            j3 = getDummyAlloc(allocation3);
            j2 = getDummyAlloc(allocation4);
        } else {
            j3 = id;
            j2 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 141, i3, 0, 0, i2, 0, 0, allocation2.getType().getX(), y, d, ShadowDrawableWrapper.COS_45, j3, 0, d2, ShadowDrawableWrapper.COS_45, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void ZHPMV(int i2, Double2 double2, Allocation allocation, Allocation allocation2, int i3, Double2 double22, Allocation allocation3, int i4) {
        Double2 double23 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Double2 double24 = double22;
        Allocation allocation6 = allocation3;
        int validateSPR2 = validateSPR2(Element.F64_2(this.mRS), i2, allocation2, i3, allocation3, i4, allocation);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation4);
            id2 = getDummyAlloc(allocation5);
            id3 = getDummyAlloc(allocation6);
        }
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 106, 0, 0, 0, i5, 0, 0, validateSPR2, 0, double23.x, double23.y, id, id2, double24.x, double24.y, id3, i3, i4, 0, 0, isIncSupp);
    }

    public void ZHPR(int i2, double d, Allocation allocation, int i3, Allocation allocation2) {
        long j2;
        long j3;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateSPR = validateSPR(Element.F64_2(this.mRS), i2, allocation3, i3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation3);
            j2 = dummyAlloc;
        } else {
            j2 = id;
            j3 = id2;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 110, 0, 0, 0, i2, 0, 0, validateSPR, 0, d, ShadowDrawableWrapper.COS_45, j3, 0, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, j2, i3, 0, 0, 0, isIncSupp);
    }

    public void ZHPR2(int i2, Double2 double2, Allocation allocation, int i3, Allocation allocation2, int i4, Allocation allocation3) {
        Double2 double22 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Allocation allocation6 = allocation3;
        int validateSPR2 = validateSPR2(Element.F64_2(this.mRS), i2, allocation, i3, allocation2, i4, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation6.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        long id3 = allocation5.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation6);
            id2 = getDummyAlloc(allocation4);
            id3 = getDummyAlloc(allocation5);
        }
        long j2 = id;
        RenderScript renderScript = this.mRS;
        int i5 = i2;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 112, 0, 0, 0, i5, 0, 0, validateSPR2, 0, double22.x, double22.y, id2, id3, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, j2, i3, i4, 0, 0, isIncSupp);
    }

    public void ZSYMM(int i2, int i3, Double2 double2, Allocation allocation, Allocation allocation2, Double2 double22, Allocation allocation3) {
        Double2 double23 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Double2 double24 = double22;
        Allocation allocation6 = allocation3;
        validateSide(i2);
        validateUplo(i3);
        if (allocation.getType().getX() == allocation.getType().getY()) {
            validateL3(Element.F64_2(this.mRS), 0, 0, i2, allocation, allocation2, allocation3);
            boolean isIncSupp = isIncSupp();
            long id = allocation4.getID(this.mRS);
            long id2 = allocation5.getID(this.mRS);
            long id3 = allocation6.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation4);
                id2 = getDummyAlloc(allocation5);
                id3 = getDummyAlloc(allocation6);
            }
            RenderScript renderScript = this.mRS;
            int i4 = i2;
            int i5 = i3;
            renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 132, 0, 0, i4, i5, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, double23.x, double23.y, id, id2, double24.x, double24.y, id3, 0, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("Matrix A is not symmetric");
    }

    public void ZSYR2K(int i2, int i3, Double2 double2, Allocation allocation, Allocation allocation2, Double2 double22, Allocation allocation3) {
        long j2;
        long j3;
        long j4;
        int i4 = i3;
        Double2 double23 = double2;
        Allocation allocation4 = allocation;
        Allocation allocation5 = allocation2;
        Double2 double24 = double22;
        Allocation allocation6 = allocation3;
        validateUplo(i2);
        validateSYR2K(Element.F64_2(this.mRS), i4, allocation4, allocation5, allocation6);
        int y = i4 != 111 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation4.getID(this.mRS);
        long id2 = allocation5.getID(this.mRS);
        long id3 = allocation6.getID(this.mRS);
        if (isIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation4);
            j3 = getDummyAlloc(allocation5);
            j4 = dummyAlloc;
            j2 = getDummyAlloc(allocation6);
        } else {
            j4 = id;
            j3 = id2;
            j2 = id3;
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), RsBlas_zsyr2k, i3, 0, 0, i2, 0, 0, allocation3.getType().getX(), y, double23.x, double23.y, j4, j3, double24.x, double24.y, j2, 0, 0, 0, 0, isIncSupp);
    }

    public void ZSYRK(int i2, int i3, Double2 double2, Allocation allocation, Double2 double22, Allocation allocation2) {
        Double2 double23 = double2;
        Allocation allocation3 = allocation;
        Double2 double24 = double22;
        Allocation allocation4 = allocation2;
        validateTranspose(i3);
        validateUplo(i2);
        int i4 = i3;
        validateL3(Element.F64_2(this.mRS), i4, 0, 0, allocation, (Allocation) null, allocation2);
        int y = i4 != 111 ? allocation.getType().getY() : allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), RsBlas_zsyrk, i3, 0, 0, i2, 0, 0, allocation2.getType().getX(), y, double23.x, double23.y, id, 0, double24.x, double24.y, allocation4.getID(this.mRS), 0, 0, 0, 0, isIncSupp);
    }

    public void ZTBMV(int i2, int i3, int i4, int i5, Allocation allocation, Allocation allocation2, int i6) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        if (i5 >= 0) {
            validateTRMV(Element.F64_2(this.mRS), i2, i3, i4, allocation, allocation2, i6);
            int y = allocation.getType().getY();
            boolean isIncSupp = isIncSupp();
            long id = allocation3.getID(this.mRS);
            long id2 = allocation4.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation3);
                id2 = getDummyAlloc(allocation4);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 74, i3, 0, 0, i2, i4, 0, y, i5, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, 0, i6, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("K must be greater than or equal to 0");
    }

    public void ZTBSV(int i2, int i3, int i4, int i5, Allocation allocation, Allocation allocation2, int i6) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F64_2(this.mRS), i2, i3, i4, allocation, allocation2, i6);
        int y = allocation.getType().getY();
        if (i5 >= 0) {
            boolean isIncSupp = isIncSupp();
            long id = allocation3.getID(this.mRS);
            long id2 = allocation4.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation3);
                id2 = getDummyAlloc(allocation4);
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 77, i3, 0, 0, i2, i4, 0, y, i5, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, 0, i6, 0, 0, 0, isIncSupp);
            return;
        }
        throw new RSRuntimeException("Number of diagonals must be positive");
    }

    public void ZTPMV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateTPMV = validateTPMV(Element.F64_2(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 75, i3, 0, 0, i2, i4, 0, validateTPMV, 0, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void ZTPSV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        int validateTPMV = validateTPMV(Element.F64_2(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 78, i3, 0, 0, i2, i4, 0, validateTPMV, 0, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void ZTRMM(int i2, int i3, int i4, int i5, Double2 double2, Allocation allocation, Allocation allocation2) {
        Double2 double22 = double2;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i3);
        validateDiag(i5);
        validateTRMM(Element.F64_2(this.mRS), i2, i4, allocation3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        long j2 = id2;
        RenderScript renderScript = this.mRS;
        int i6 = i4;
        int i7 = i2;
        int i8 = i3;
        int i9 = i5;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), RsBlas_ztrmm, i6, 0, i7, i8, i9, allocation2.getType().getY(), allocation2.getType().getX(), 0, double22.x, double22.y, id, j2, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, 0, 0, 0, 0, 0, isIncSupp);
    }

    public void ZTRMV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F64_2(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 73, i3, 0, 0, i2, i4, 0, y, 0, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, 0, i5, 0, 0, 0, isIncSupp);
    }

    public void ZTRSM(int i2, int i3, int i4, int i5, Double2 double2, Allocation allocation, Allocation allocation2) {
        Double2 double22 = double2;
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateUplo(i3);
        validateDiag(i5);
        validateTRSM(Element.F64_2(this.mRS), i2, i4, allocation3, allocation4);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        long j2 = id2;
        RenderScript renderScript = this.mRS;
        int i6 = i4;
        int i7 = i2;
        int i8 = i3;
        int i9 = i5;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), RsBlas_ztrsm, i6, 0, i7, i8, i9, allocation2.getType().getY(), allocation2.getType().getX(), 0, double22.x, double22.y, id, j2, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, 0, 0, 0, 0, 0, isIncSupp);
    }

    public void ZTRSV(int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        validateTRMV(Element.F64_2(this.mRS), i2, i3, i4, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation4.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation4);
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptIntrinsicBLAS_Z(getID(renderScript), 76, i3, 0, 0, i2, i4, 0, y, 0, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, id, id2, ShadowDrawableWrapper.COS_45, ShadowDrawableWrapper.COS_45, 0, i5, 0, 0, 0, isIncSupp);
    }
}
