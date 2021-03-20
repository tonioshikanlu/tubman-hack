package androidx.renderscript;

public class Matrix3f {
    public final float[] mMat;

    public Matrix3f() {
        this.mMat = new float[9];
        loadIdentity();
    }

    public Matrix3f(float[] fArr) {
        float[] fArr2 = new float[9];
        this.mMat = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
    }

    public float get(int i2, int i3) {
        return this.mMat[(i2 * 3) + i3];
    }

    public float[] getArray() {
        return this.mMat;
    }

    public void load(Matrix3f matrix3f) {
        float[] array = matrix3f.getArray();
        float[] fArr = this.mMat;
        System.arraycopy(array, 0, fArr, 0, fArr.length);
    }

    public void loadIdentity() {
        float[] fArr = this.mMat;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public void loadMultiply(Matrix3f matrix3f, Matrix3f matrix3f2) {
        for (int i2 = 0; i2 < 3; i2++) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i3 = 0; i3 < 3; i3++) {
                float f4 = matrix3f2.get(i2, i3);
                f += matrix3f.get(i3, 0) * f4;
                f2 += matrix3f.get(i3, 1) * f4;
                f3 += matrix3f.get(i3, 2) * f4;
            }
            set(i2, 0, f);
            set(i2, 1, f2);
            set(i2, 2, f3);
        }
    }

    public void loadRotate(float f) {
        loadIdentity();
        double d = (double) (f * 0.017453292f);
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float[] fArr = this.mMat;
        fArr[0] = cos;
        fArr[1] = -sin;
        fArr[3] = sin;
        fArr[4] = cos;
    }

    public void loadRotate(float f, float f2, float f3, float f4) {
        double d = (double) (f * 0.017453292f);
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f3 * f3) + (f2 * f2)));
        if (sqrt == 1.0f) {
            float f5 = 1.0f / sqrt;
            f2 *= f5;
            f3 *= f5;
            f4 *= f5;
        }
        float f6 = 1.0f - cos;
        float f7 = f2 * sin;
        float f8 = f3 * sin;
        float f9 = sin * f4;
        float[] fArr = this.mMat;
        fArr[0] = (f2 * f2 * f6) + cos;
        float f10 = f2 * f3 * f6;
        fArr[3] = f10 - f9;
        float f11 = f4 * f2 * f6;
        fArr[6] = f11 + f8;
        fArr[1] = f10 + f9;
        fArr[4] = (f3 * f3 * f6) + cos;
        float f12 = f3 * f4 * f6;
        fArr[7] = f12 - f7;
        fArr[2] = f11 - f8;
        fArr[5] = f12 + f7;
        fArr[8] = (f4 * f4 * f6) + cos;
    }

    public void loadScale(float f, float f2) {
        loadIdentity();
        float[] fArr = this.mMat;
        fArr[0] = f;
        fArr[4] = f2;
    }

    public void loadScale(float f, float f2, float f3) {
        loadIdentity();
        float[] fArr = this.mMat;
        fArr[0] = f;
        fArr[4] = f2;
        fArr[8] = f3;
    }

    public void loadTranslate(float f, float f2) {
        loadIdentity();
        float[] fArr = this.mMat;
        fArr[6] = f;
        fArr[7] = f2;
    }

    public void multiply(Matrix3f matrix3f) {
        Matrix3f matrix3f2 = new Matrix3f();
        matrix3f2.loadMultiply(this, matrix3f);
        load(matrix3f2);
    }

    public void rotate(float f) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadRotate(f);
        multiply(matrix3f);
    }

    public void rotate(float f, float f2, float f3, float f4) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadRotate(f, f2, f3, f4);
        multiply(matrix3f);
    }

    public void scale(float f, float f2) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadScale(f, f2);
        multiply(matrix3f);
    }

    public void scale(float f, float f2, float f3) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadScale(f, f2, f3);
        multiply(matrix3f);
    }

    public void set(int i2, int i3, float f) {
        this.mMat[(i2 * 3) + i3] = f;
    }

    public void translate(float f, float f2) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadTranslate(f, f2);
        multiply(matrix3f);
    }

    public void transpose() {
        int i2 = 0;
        while (i2 < 2) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < 3; i4++) {
                float[] fArr = this.mMat;
                int i5 = (i2 * 3) + i4;
                float f = fArr[i5];
                int i6 = (i4 * 3) + i2;
                fArr[i5] = fArr[i6];
                fArr[i6] = f;
            }
            i2 = i3;
        }
    }
}
