package androidx.renderscript;

public class Type extends BaseObj {
    public boolean mDimFaces;
    public boolean mDimMipmaps;
    public int mDimX;
    public int mDimY;
    public int mDimYuv;
    public int mDimZ;
    public Element mElement;
    public int mElementCount;

    public static class Builder {
        public boolean mDimFaces;
        public boolean mDimMipmaps;
        public int mDimX = 1;
        public int mDimY;
        public int mDimZ;
        public Element mElement;
        public RenderScript mRS;
        public int mYuv;

        public Builder(RenderScript renderScript, Element element) {
            element.checkValid();
            this.mRS = renderScript;
            this.mElement = element;
        }

        public Type create() {
            int i2 = this.mDimZ;
            if (i2 > 0) {
                if (this.mDimX < 1 || this.mDimY < 1) {
                    throw new RSInvalidStateException("Both X and Y dimension required when Z is present.");
                } else if (this.mDimFaces) {
                    throw new RSInvalidStateException("Cube maps not supported with 3D types.");
                }
            }
            int i3 = this.mDimY;
            if (i3 <= 0 || this.mDimX >= 1) {
                boolean z = this.mDimFaces;
                if (z && i3 < 1) {
                    throw new RSInvalidStateException("Cube maps require 2D Types.");
                } else if (this.mYuv == 0 || (i2 == 0 && !z && !this.mDimMipmaps)) {
                    RenderScript renderScript = this.mRS;
                    Type type = new Type(renderScript.nTypeCreate(this.mElement.getID(renderScript), this.mDimX, this.mDimY, this.mDimZ, this.mDimMipmaps, this.mDimFaces, this.mYuv), this.mRS);
                    type.mElement = this.mElement;
                    type.mDimX = this.mDimX;
                    type.mDimY = this.mDimY;
                    type.mDimZ = this.mDimZ;
                    type.mDimMipmaps = this.mDimMipmaps;
                    type.mDimFaces = this.mDimFaces;
                    type.mDimYuv = this.mYuv;
                    type.calcElementCount();
                    return type;
                } else {
                    throw new RSInvalidStateException("YUV only supports basic 2D.");
                }
            } else {
                throw new RSInvalidStateException("X dimension required when Y is present.");
            }
        }

        public Builder setFaces(boolean z) {
            this.mDimFaces = z;
            return this;
        }

        public Builder setMipmaps(boolean z) {
            this.mDimMipmaps = z;
            return this;
        }

        public Builder setX(int i2) {
            if (i2 >= 1) {
                this.mDimX = i2;
                return this;
            }
            throw new RSIllegalArgumentException("Values of less than 1 for Dimension X are not valid.");
        }

        public Builder setY(int i2) {
            if (i2 >= 1) {
                this.mDimY = i2;
                return this;
            }
            throw new RSIllegalArgumentException("Values of less than 1 for Dimension Y are not valid.");
        }

        public Builder setYuvFormat(int i2) {
            if (i2 == 17 || i2 == 842094169) {
                this.mYuv = i2;
                return this;
            }
            throw new RSIllegalArgumentException("Only NV21 and YV12 are supported..");
        }

        public Builder setZ(int i2) {
            if (i2 >= 1) {
                this.mDimZ = i2;
                return this;
            }
            throw new RSIllegalArgumentException("Values of less than 1 for Dimension Z are not valid.");
        }
    }

    public enum CubemapFace {
        POSITIVE_X(0),
        NEGATIVE_X(1),
        POSITIVE_Y(2),
        NEGATIVE_Y(3),
        POSITIVE_Z(4),
        NEGATIVE_Z(5);
        
        public int mID;

        private CubemapFace(int i2) {
            this.mID = i2;
        }
    }

    public Type(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    public static Type createX(RenderScript renderScript, Element element, int i2) {
        if (i2 >= 1) {
            Type type = new Type(renderScript.nTypeCreate(element.getID(renderScript), i2, 0, 0, false, false, 0), renderScript);
            type.mElement = element;
            type.mDimX = i2;
            type.calcElementCount();
            return type;
        }
        throw new RSInvalidStateException("Dimension must be >= 1.");
    }

    public static Type createXY(RenderScript renderScript, Element element, int i2, int i3) {
        if (i2 < 1 || i3 < 1) {
            throw new RSInvalidStateException("Dimension must be >= 1.");
        }
        Type type = new Type(renderScript.nTypeCreate(element.getID(renderScript), i2, i3, 0, false, false, 0), renderScript);
        type.mElement = element;
        type.mDimX = i2;
        type.mDimY = i3;
        type.calcElementCount();
        return type;
    }

    public static Type createXYZ(RenderScript renderScript, Element element, int i2, int i3, int i4) {
        if (i2 < 1 || i3 < 1 || i4 < 1) {
            throw new RSInvalidStateException("Dimension must be >= 1.");
        }
        Type type = new Type(renderScript.nTypeCreate(element.getID(renderScript), i2, i3, i4, false, false, 0), renderScript);
        type.mElement = element;
        type.mDimX = i2;
        type.mDimY = i3;
        type.mDimZ = i4;
        type.calcElementCount();
        return type;
    }

    public void calcElementCount() {
        boolean hasMipmaps = hasMipmaps();
        int x = getX();
        int y = getY();
        int z = getZ();
        int i2 = hasFaces() ? 6 : 1;
        if (x == 0) {
            x = 1;
        }
        if (y == 0) {
            y = 1;
        }
        if (z == 0) {
            z = 1;
        }
        int i3 = x * y * z * i2;
        while (hasMipmaps && (x > 1 || y > 1 || z > 1)) {
            if (x > 1) {
                x >>= 1;
            }
            if (y > 1) {
                y >>= 1;
            }
            if (z > 1) {
                z >>= 1;
            }
            i3 += x * y * z * i2;
        }
        this.mElementCount = i3;
    }

    public int getCount() {
        return this.mElementCount;
    }

    public long getDummyType(RenderScript renderScript, long j2) {
        return renderScript.nIncTypeCreate(j2, this.mDimX, this.mDimY, this.mDimZ, this.mDimMipmaps, this.mDimFaces, this.mDimYuv);
    }

    public Element getElement() {
        return this.mElement;
    }

    public int getX() {
        return this.mDimX;
    }

    public int getY() {
        return this.mDimY;
    }

    public int getYuv() {
        return this.mDimYuv;
    }

    public int getZ() {
        return this.mDimZ;
    }

    public boolean hasFaces() {
        return this.mDimFaces;
    }

    public boolean hasMipmaps() {
        return this.mDimMipmaps;
    }
}
