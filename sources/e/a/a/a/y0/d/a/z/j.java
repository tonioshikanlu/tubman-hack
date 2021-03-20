package e.a.a.a.y0.d.a.z;

public interface j {
    public static final j a = new a();

    public static class a implements j {
        public static /* synthetic */ void a(int i2) {
            Object[] objArr = new Object[3];
            switch (i2) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i2 == 5 || i2 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static class b {
        public static /* synthetic */ void a(int i2) {
            String str = (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : 3)];
            switch (i2) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i2 == 4) {
                objArr[1] = "getReturnType";
            } else if (i2 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i2 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i2 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (!(i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }
    }
}
