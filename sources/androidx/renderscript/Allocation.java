package androidx.renderscript;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.Surface;
import androidx.renderscript.Element;
import androidx.renderscript.Type;
import b.e.a.a.a;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Allocation extends BaseObj {
    public static final int USAGE_GRAPHICS_TEXTURE = 2;
    public static final int USAGE_IO_INPUT = 32;
    public static final int USAGE_IO_OUTPUT = 64;
    public static final int USAGE_SCRIPT = 1;
    public static final int USAGE_SHARED = 128;
    public static BitmapFactory.Options mBitmapOptions;
    public Allocation mAdaptedAllocation;
    public boolean mAutoPadding = false;
    public Bitmap mBitmap;
    public ByteBuffer mByteBuffer = null;
    public long mByteBufferStride = 0;
    public boolean mConstrainedFace;
    public boolean mConstrainedLOD;
    public boolean mConstrainedY;
    public boolean mConstrainedZ;
    public int mCurrentCount;
    public int mCurrentDimX;
    public int mCurrentDimY;
    public int mCurrentDimZ;
    public boolean mIncAllocDestroyed;
    public long mIncCompatAllocation;
    public boolean mReadAllowed = true;
    public Type.CubemapFace mSelectedFace = Type.CubemapFace.POSITIVE_X;
    public int mSelectedLOD;
    public int mSelectedY;
    public int mSelectedZ;
    public int mSize;
    public Type mType;
    public int mUsage;
    public boolean mWriteAllowed = true;

    /* renamed from: androidx.renderscript.Allocation$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$android$graphics$Bitmap$Config = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.renderscript.Allocation.AnonymousClass1.<clinit>():void");
        }
    }

    public enum MipmapControl {
        MIPMAP_NONE(0),
        MIPMAP_FULL(1),
        MIPMAP_ON_SYNC_TO_TEXTURE(2);
        
        public int mID;

        private MipmapControl(int i2) {
            this.mID = i2;
        }
    }

    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        mBitmapOptions = options;
        options.inScaled = false;
    }

    public Allocation(long j2, RenderScript renderScript, Type type, int i2) {
        super(j2, renderScript);
        if ((i2 & -228) == 0) {
            if ((i2 & 32) != 0) {
                this.mWriteAllowed = false;
                if ((i2 & -36) != 0) {
                    throw new RSIllegalArgumentException("Invalid usage combination.");
                }
            }
            this.mType = type;
            this.mUsage = i2;
            this.mIncCompatAllocation = 0;
            this.mIncAllocDestroyed = false;
            if (type != null) {
                this.mSize = this.mType.getElement().getBytesSize() * type.getCount();
                updateCacheInfo(type);
            }
            if (RenderScript.sUseGCHooks) {
                try {
                    RenderScript.registerNativeAllocation.invoke(RenderScript.sRuntime, new Object[]{Integer.valueOf(this.mSize)});
                } catch (Exception e2) {
                    Log.e(RenderScript.LOG_TAG, "Couldn't invoke registerNativeAllocation:" + e2);
                    throw new RSRuntimeException("Couldn't invoke registerNativeAllocation:" + e2);
                }
            }
        } else {
            throw new RSIllegalArgumentException("Unknown usage specified.");
        }
    }

    private void copy1DRangeFromUnchecked(int i2, int i3, Object obj, Element.DataType dataType, int i4) {
        int bytesSize = this.mType.mElement.getBytesSize() * i3;
        boolean z = this.mAutoPadding && this.mType.getElement().getVectorSize() == 3;
        data1DChecks(i2, i3, i4 * dataType.mSize, bytesSize, z);
        this.mRS.nAllocationData1D(getIDSafe(), i2, this.mSelectedLOD, i3, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z);
    }

    private void copy1DRangeToUnchecked(int i2, int i3, Object obj, Element.DataType dataType, int i4) {
        int bytesSize = this.mType.mElement.getBytesSize() * i3;
        boolean z = this.mAutoPadding && this.mType.getElement().getVectorSize() == 3;
        data1DChecks(i2, i3, i4 * dataType.mSize, bytesSize, z);
        this.mRS.nAllocationRead1D(getIDSafe(), i2, this.mSelectedLOD, i3, obj, bytesSize, dataType, this.mType.mElement.mType.mSize, z);
    }

    private void copy3DRangeFromUnchecked(int i2, int i3, int i4, int i5, int i6, int i7, Object obj, Element.DataType dataType, int i8) {
        boolean z;
        int i9;
        this.mRS.validate();
        validate3DRange(i2, i3, i4, i5, i6, i7);
        int bytesSize = this.mType.mElement.getBytesSize() * i5 * i6 * i7;
        int i10 = dataType.mSize * i8;
        if (!this.mAutoPadding || this.mType.getElement().getVectorSize() != 3) {
            if (bytesSize <= i10) {
                z = false;
                i9 = i10;
            } else {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if ((bytesSize / 4) * 3 <= i10) {
            i9 = bytesSize;
            z = true;
        } else {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        this.mRS.nAllocationData3D(getIDSafe(), i2, i3, i4, this.mSelectedLOD, i5, i6, i7, obj, i9, dataType, this.mType.mElement.mType.mSize, z);
    }

    private void copyFromUnchecked(Object obj, Element.DataType dataType, int i2) {
        this.mRS.validate();
        int i3 = this.mCurrentDimZ;
        if (i3 > 0) {
            copy3DRangeFromUnchecked(0, 0, 0, this.mCurrentDimX, this.mCurrentDimY, i3, obj, dataType, i2);
            return;
        }
        int i4 = this.mCurrentDimY;
        if (i4 > 0) {
            copy2DRangeFromUnchecked(0, 0, this.mCurrentDimX, i4, obj, dataType, i2);
            return;
        }
        copy1DRangeFromUnchecked(0, this.mCurrentCount, obj, dataType, i2);
    }

    private void copyTo(Object obj, Element.DataType dataType, int i2) {
        this.mRS.validate();
        boolean z = this.mAutoPadding && this.mType.getElement().getVectorSize() == 3;
        if (z) {
            if (dataType.mSize * i2 < (this.mSize / 4) * 3) {
                throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
            }
        } else if (dataType.mSize * i2 < this.mSize) {
            throw new RSIllegalArgumentException("Size of output array cannot be smaller than size of allocation.");
        }
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationRead(getID(renderScript), obj, dataType, this.mType.mElement.mType.mSize, z);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        return createCubemapFromBitmap(renderScript, bitmap, MipmapControl.MIPMAP_NONE, 2);
    }

    public static Allocation createCubemapFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl, int i2) {
        renderScript.validate();
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (width % 6 != 0) {
            throw new RSIllegalArgumentException("Cubemap height must be multiple of 6");
        } else if (width / 6 == height) {
            boolean z = false;
            if (((height + -1) & height) == 0) {
                Element elementFromBitmap = elementFromBitmap(renderScript, bitmap);
                Type.Builder builder = new Type.Builder(renderScript, elementFromBitmap);
                builder.setX(height);
                builder.setY(height);
                builder.setFaces(true);
                if (mipmapControl == MipmapControl.MIPMAP_FULL) {
                    z = true;
                }
                builder.setMipmaps(z);
                Type create = builder.create();
                long nAllocationCubeCreateFromBitmap = renderScript.nAllocationCubeCreateFromBitmap(create.getID(renderScript), mipmapControl.mID, bitmap, i2);
                if (nAllocationCubeCreateFromBitmap != 0) {
                    return new Allocation(nAllocationCubeCreateFromBitmap, renderScript, create, i2);
                }
                throw new RSRuntimeException("Load failed for bitmap " + bitmap + " element " + elementFromBitmap);
            }
            throw new RSIllegalArgumentException("Only power of 2 cube faces supported");
        } else {
            throw new RSIllegalArgumentException("Only square cube map faces supported");
        }
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderScript, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6) {
        return createCubemapFromCubeFaces(renderScript, bitmap, bitmap2, bitmap3, bitmap4, bitmap5, bitmap6, MipmapControl.MIPMAP_NONE, 2);
    }

    public static Allocation createCubemapFromCubeFaces(RenderScript renderScript, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, MipmapControl mipmapControl, int i2) {
        return null;
    }

    public static Allocation createFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        return createFromBitmap(renderScript, bitmap, MipmapControl.MIPMAP_NONE, ScriptIntrinsicBLAS.NON_UNIT);
    }

    public static Allocation createFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl, int i2) {
        renderScript.validate();
        if (bitmap.getConfig() != null) {
            Type typeFromBitmap = typeFromBitmap(renderScript, bitmap, mipmapControl);
            if (mipmapControl == MipmapControl.MIPMAP_NONE && typeFromBitmap.getElement().isCompatible(Element.RGBA_8888(renderScript)) && i2 == 131) {
                long nAllocationCreateBitmapBackedAllocation = renderScript.nAllocationCreateBitmapBackedAllocation(typeFromBitmap.getID(renderScript), mipmapControl.mID, bitmap, i2);
                if (nAllocationCreateBitmapBackedAllocation != 0) {
                    Allocation allocation = new Allocation(nAllocationCreateBitmapBackedAllocation, renderScript, typeFromBitmap, i2);
                    allocation.setBitmap(bitmap);
                    return allocation;
                }
                throw new RSRuntimeException("Load failed.");
            }
            long nAllocationCreateFromBitmap = renderScript.nAllocationCreateFromBitmap(typeFromBitmap.getID(renderScript), mipmapControl.mID, bitmap, i2);
            if (nAllocationCreateFromBitmap != 0) {
                return new Allocation(nAllocationCreateFromBitmap, renderScript, typeFromBitmap, i2);
            }
            throw new RSRuntimeException("Load failed.");
        } else if ((i2 & 128) == 0) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return createFromBitmap(renderScript, createBitmap, mipmapControl, i2);
        } else {
            throw new RSIllegalArgumentException("USAGE_SHARED cannot be used with a Bitmap that has a null config.");
        }
    }

    public static Allocation createFromBitmapResource(RenderScript renderScript, Resources resources, int i2) {
        return createFromBitmapResource(renderScript, resources, i2, MipmapControl.MIPMAP_NONE, 3);
    }

    public static Allocation createFromBitmapResource(RenderScript renderScript, Resources resources, int i2, MipmapControl mipmapControl, int i3) {
        renderScript.validate();
        if ((i3 & 224) == 0) {
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2);
            Allocation createFromBitmap = createFromBitmap(renderScript, decodeResource, mipmapControl, i3);
            decodeResource.recycle();
            return createFromBitmap;
        }
        throw new RSIllegalArgumentException("Unsupported usage specified.");
    }

    public static Allocation createFromString(RenderScript renderScript, String str, int i2) {
        renderScript.validate();
        try {
            byte[] bytes = str.getBytes("UTF-8");
            Allocation createSized = createSized(renderScript, Element.U8(renderScript), bytes.length, i2);
            createSized.copyFrom(bytes);
            return createSized;
        } catch (Exception unused) {
            throw new RSRuntimeException("Could not convert string to utf-8.");
        }
    }

    public static Allocation createSized(RenderScript renderScript, Element element, int i2) {
        return createSized(renderScript, element, i2, 1);
    }

    public static Allocation createSized(RenderScript renderScript, Element element, int i2, int i3) {
        renderScript.validate();
        Type.Builder builder = new Type.Builder(renderScript, element);
        builder.setX(i2);
        Type create = builder.create();
        long nAllocationCreateTyped = renderScript.nAllocationCreateTyped(create.getID(renderScript), MipmapControl.MIPMAP_NONE.mID, i3, 0);
        if (nAllocationCreateTyped != 0) {
            return new Allocation(nAllocationCreateTyped, renderScript, create, i3);
        }
        throw new RSRuntimeException("Allocation creation failed.");
    }

    public static Allocation createTyped(RenderScript renderScript, Type type) {
        return createTyped(renderScript, type, MipmapControl.MIPMAP_NONE, 1);
    }

    public static Allocation createTyped(RenderScript renderScript, Type type, int i2) {
        return createTyped(renderScript, type, MipmapControl.MIPMAP_NONE, i2);
    }

    public static Allocation createTyped(RenderScript renderScript, Type type, MipmapControl mipmapControl, int i2) {
        renderScript.validate();
        if (type.getID(renderScript) == 0) {
            throw new RSInvalidStateException("Bad Type");
        } else if (renderScript.usingIO() || (i2 & 32) == 0) {
            long nAllocationCreateTyped = renderScript.nAllocationCreateTyped(type.getID(renderScript), mipmapControl.mID, i2, 0);
            if (nAllocationCreateTyped != 0) {
                return new Allocation(nAllocationCreateTyped, renderScript, type, i2);
            }
            throw new RSRuntimeException("Allocation creation failed.");
        } else {
            throw new RSRuntimeException("USAGE_IO not supported, Allocation creation failed.");
        }
    }

    private void data1DChecks(int i2, int i3, int i4, int i5, boolean z) {
        this.mRS.validate();
        if (i2 < 0) {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        } else if (i3 < 1) {
            throw new RSIllegalArgumentException("Count must be >= 1.");
        } else if (i2 + i3 > this.mCurrentCount) {
            StringBuilder y = a.y("Overflow, Available count ");
            y.append(this.mCurrentCount);
            y.append(", got ");
            y.append(i3);
            y.append(" at offset ");
            throw new RSIllegalArgumentException(a.o(y, i2, "."));
        } else if (z) {
            if (i4 < (i5 / 4) * 3) {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if (i4 < i5) {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
    }

    public static Element elementFromBitmap(RenderScript renderScript, Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return Element.A_8(renderScript);
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return Element.RGBA_4444(renderScript);
        }
        if (config == Bitmap.Config.ARGB_8888) {
            return Element.RGBA_8888(renderScript);
        }
        if (config == Bitmap.Config.RGB_565) {
            return Element.RGB_565(renderScript);
        }
        throw new RSInvalidStateException("Bad bitmap type: " + config);
    }

    private long getIDSafe() {
        Allocation allocation = this.mAdaptedAllocation;
        return allocation != null ? allocation.getID(this.mRS) : getID(this.mRS);
    }

    private void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public static Type typeFromBitmap(RenderScript renderScript, Bitmap bitmap, MipmapControl mipmapControl) {
        Type.Builder builder = new Type.Builder(renderScript, elementFromBitmap(renderScript, bitmap));
        builder.setX(bitmap.getWidth());
        builder.setY(bitmap.getHeight());
        builder.setMipmaps(mipmapControl == MipmapControl.MIPMAP_FULL);
        return builder.create();
    }

    private void updateCacheInfo(Type type) {
        this.mCurrentDimX = type.getX();
        this.mCurrentDimY = type.getY();
        int z = type.getZ();
        this.mCurrentDimZ = z;
        int i2 = this.mCurrentDimX;
        this.mCurrentCount = i2;
        int i3 = this.mCurrentDimY;
        if (i3 > 1) {
            this.mCurrentCount = i2 * i3;
        }
        if (z > 1) {
            this.mCurrentCount *= z;
        }
    }

    private void validate2DRange(int i2, int i3, int i4, int i5) {
        if (this.mAdaptedAllocation == null) {
            if (i2 < 0 || i3 < 0) {
                throw new RSIllegalArgumentException("Offset cannot be negative.");
            } else if (i5 < 0 || i4 < 0) {
                throw new RSIllegalArgumentException("Height or width cannot be negative.");
            } else if (i2 + i4 > this.mCurrentDimX || i3 + i5 > this.mCurrentDimY) {
                throw new RSIllegalArgumentException("Updated region larger than allocation.");
            }
        }
    }

    private void validate3DRange(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.mAdaptedAllocation == null) {
            if (i2 < 0 || i3 < 0 || i4 < 0) {
                throw new RSIllegalArgumentException("Offset cannot be negative.");
            } else if (i6 < 0 || i5 < 0 || i7 < 0) {
                throw new RSIllegalArgumentException("Height or width cannot be negative.");
            } else if (i2 + i5 > this.mCurrentDimX || i3 + i6 > this.mCurrentDimY || i4 + i7 > this.mCurrentDimZ) {
                throw new RSIllegalArgumentException("Updated region larger than allocation.");
            }
        }
    }

    private void validateBitmapFormat(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config != null) {
            int i2 = AnonymousClass1.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (this.mType.getElement().mKind != Element.DataKind.PIXEL_RGBA || this.mType.getElement().getBytesSize() != 2) {
                                StringBuilder y = a.y("Allocation kind is ");
                                y.append(this.mType.getElement().mKind);
                                y.append(", type ");
                                y.append(this.mType.getElement().mType);
                                y.append(" of ");
                                y.append(this.mType.getElement().getBytesSize());
                                y.append(" bytes, passed bitmap was ");
                                y.append(config);
                                throw new RSIllegalArgumentException(y.toString());
                            }
                        }
                    } else if (this.mType.getElement().mKind != Element.DataKind.PIXEL_RGB || this.mType.getElement().getBytesSize() != 2) {
                        StringBuilder y2 = a.y("Allocation kind is ");
                        y2.append(this.mType.getElement().mKind);
                        y2.append(", type ");
                        y2.append(this.mType.getElement().mType);
                        y2.append(" of ");
                        y2.append(this.mType.getElement().getBytesSize());
                        y2.append(" bytes, passed bitmap was ");
                        y2.append(config);
                        throw new RSIllegalArgumentException(y2.toString());
                    }
                } else if (this.mType.getElement().mKind != Element.DataKind.PIXEL_RGBA || this.mType.getElement().getBytesSize() != 4) {
                    StringBuilder y3 = a.y("Allocation kind is ");
                    y3.append(this.mType.getElement().mKind);
                    y3.append(", type ");
                    y3.append(this.mType.getElement().mType);
                    y3.append(" of ");
                    y3.append(this.mType.getElement().getBytesSize());
                    y3.append(" bytes, passed bitmap was ");
                    y3.append(config);
                    throw new RSIllegalArgumentException(y3.toString());
                }
            } else if (this.mType.getElement().mKind != Element.DataKind.PIXEL_A) {
                StringBuilder y4 = a.y("Allocation kind is ");
                y4.append(this.mType.getElement().mKind);
                y4.append(", type ");
                y4.append(this.mType.getElement().mType);
                y4.append(" of ");
                y4.append(this.mType.getElement().getBytesSize());
                y4.append(" bytes, passed bitmap was ");
                y4.append(config);
                throw new RSIllegalArgumentException(y4.toString());
            }
        } else {
            throw new RSIllegalArgumentException("Bitmap has an unsupported format for this operation");
        }
    }

    private void validateBitmapSize(Bitmap bitmap) {
        if (this.mCurrentDimX != bitmap.getWidth() || this.mCurrentDimY != bitmap.getHeight()) {
            throw new RSIllegalArgumentException("Cannot update allocation from bitmap, sizes mismatch");
        }
    }

    private void validateIsFloat32() {
        if (this.mType.mElement.mType != Element.DataType.FLOAT_32) {
            StringBuilder y = a.y("32 bit float source does not match allocation type ");
            y.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(y.toString());
        }
    }

    private void validateIsFloat64() {
        if (this.mType.mElement.mType != Element.DataType.FLOAT_64) {
            StringBuilder y = a.y("64 bit float source does not match allocation type ");
            y.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(y.toString());
        }
    }

    private void validateIsInt16() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.SIGNED_16 && dataType != Element.DataType.UNSIGNED_16) {
            StringBuilder y = a.y("16 bit integer source does not match allocation type ");
            y.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(y.toString());
        }
    }

    private void validateIsInt32() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.SIGNED_32 && dataType != Element.DataType.UNSIGNED_32) {
            StringBuilder y = a.y("32 bit integer source does not match allocation type ");
            y.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(y.toString());
        }
    }

    private void validateIsInt64() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.SIGNED_64 && dataType != Element.DataType.UNSIGNED_64) {
            StringBuilder y = a.y("64 bit integer source does not match allocation type ");
            y.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(y.toString());
        }
    }

    private void validateIsInt8() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.SIGNED_8 && dataType != Element.DataType.UNSIGNED_8) {
            StringBuilder y = a.y("8 bit integer source does not match allocation type ");
            y.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(y.toString());
        }
    }

    private void validateIsObject() {
        Element.DataType dataType = this.mType.mElement.mType;
        if (dataType != Element.DataType.RS_ELEMENT && dataType != Element.DataType.RS_TYPE && dataType != Element.DataType.RS_ALLOCATION && dataType != Element.DataType.RS_SAMPLER && dataType != Element.DataType.RS_SCRIPT) {
            StringBuilder y = a.y("Object source does not match allocation type ");
            y.append(this.mType.mElement.mType);
            throw new RSIllegalArgumentException(y.toString());
        }
    }

    private Element.DataType validateObjectIsPrimitiveArray(Object obj, boolean z) {
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive()) {
                if (componentType == Long.TYPE) {
                    if (!z) {
                        return Element.DataType.SIGNED_64;
                    }
                    validateIsInt64();
                } else if (componentType == Integer.TYPE) {
                    if (!z) {
                        return Element.DataType.SIGNED_32;
                    }
                    validateIsInt32();
                } else if (componentType == Short.TYPE) {
                    if (!z) {
                        return Element.DataType.SIGNED_16;
                    }
                    validateIsInt16();
                } else if (componentType == Byte.TYPE) {
                    if (!z) {
                        return Element.DataType.SIGNED_8;
                    }
                    validateIsInt8();
                } else if (componentType == Float.TYPE) {
                    if (z) {
                        validateIsFloat32();
                    }
                    return Element.DataType.FLOAT_32;
                } else if (componentType != Double.TYPE) {
                    return null;
                } else {
                    if (z) {
                        validateIsFloat64();
                    }
                    return Element.DataType.FLOAT_64;
                }
                return this.mType.mElement.mType;
            }
            throw new RSIllegalArgumentException("Object passed is not an Array of primitives.");
        }
        throw new RSIllegalArgumentException("Object passed is not an array of primitives.");
    }

    public void copy1DRangeFrom(int i2, int i3, Allocation allocation, int i4) {
        Allocation allocation2 = allocation;
        this.mRS.nAllocationData2D(getIDSafe(), i2, 0, this.mSelectedLOD, this.mSelectedFace.mID, i3, 1, allocation2.getID(this.mRS), i4, 0, allocation2.mSelectedLOD, allocation2.mSelectedFace.mID);
    }

    public void copy1DRangeFrom(int i2, int i3, Object obj) {
        copy1DRangeFromUnchecked(i2, i3, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeFrom(int i2, int i3, byte[] bArr) {
        validateIsInt8();
        copy1DRangeFromUnchecked(i2, i3, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeFrom(int i2, int i3, float[] fArr) {
        validateIsFloat32();
        copy1DRangeFromUnchecked(i2, i3, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeFrom(int i2, int i3, int[] iArr) {
        validateIsInt32();
        copy1DRangeFromUnchecked(i2, i3, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeFrom(int i2, int i3, short[] sArr) {
        validateIsInt16();
        copy1DRangeFromUnchecked(i2, i3, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeFromUnchecked(int i2, int i3, Object obj) {
        copy1DRangeFromUnchecked(i2, i3, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copy1DRangeFromUnchecked(int i2, int i3, byte[] bArr) {
        copy1DRangeFromUnchecked(i2, i3, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeFromUnchecked(int i2, int i3, float[] fArr) {
        copy1DRangeFromUnchecked(i2, i3, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeFromUnchecked(int i2, int i3, int[] iArr) {
        copy1DRangeFromUnchecked(i2, i3, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeFromUnchecked(int i2, int i3, short[] sArr) {
        copy1DRangeFromUnchecked(i2, i3, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeTo(int i2, int i3, Object obj) {
        copy1DRangeToUnchecked(i2, i3, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy1DRangeTo(int i2, int i3, byte[] bArr) {
        validateIsInt8();
        copy1DRangeToUnchecked(i2, i3, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeTo(int i2, int i3, float[] fArr) {
        validateIsFloat32();
        copy1DRangeToUnchecked(i2, i3, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeTo(int i2, int i3, int[] iArr) {
        validateIsInt32();
        copy1DRangeToUnchecked(i2, i3, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeTo(int i2, int i3, short[] sArr) {
        validateIsInt16();
        copy1DRangeToUnchecked(i2, i3, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy1DRangeToUnchecked(int i2, int i3, Object obj) {
        copy1DRangeToUnchecked(i2, i3, obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copy1DRangeToUnchecked(int i2, int i3, byte[] bArr) {
        copy1DRangeToUnchecked(i2, i3, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy1DRangeToUnchecked(int i2, int i3, float[] fArr) {
        copy1DRangeToUnchecked(i2, i3, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy1DRangeToUnchecked(int i2, int i3, int[] iArr) {
        copy1DRangeToUnchecked(i2, i3, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy1DRangeToUnchecked(int i2, int i3, short[] sArr) {
        copy1DRangeToUnchecked(i2, i3, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeFrom(int i2, int i3, int i4, int i5, Allocation allocation, int i6, int i7) {
        Allocation allocation2 = allocation;
        this.mRS.validate();
        validate2DRange(i2, i3, i4, i5);
        this.mRS.nAllocationData2D(getIDSafe(), i2, i3, this.mSelectedLOD, this.mSelectedFace.mID, i4, i5, allocation2.getID(this.mRS), i6, i7, allocation2.mSelectedLOD, allocation2.mSelectedFace.mID);
    }

    public void copy2DRangeFrom(int i2, int i3, int i4, int i5, Object obj) {
        copy2DRangeFromUnchecked(i2, i3, i4, i5, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeFrom(int i2, int i3, int i4, int i5, byte[] bArr) {
        validateIsInt8();
        copy2DRangeFromUnchecked(i2, i3, i4, i5, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy2DRangeFrom(int i2, int i3, int i4, int i5, float[] fArr) {
        validateIsFloat32();
        copy2DRangeFromUnchecked(i2, i3, i4, i5, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy2DRangeFrom(int i2, int i3, int i4, int i5, int[] iArr) {
        validateIsInt32();
        copy2DRangeFromUnchecked(i2, i3, i4, i5, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy2DRangeFrom(int i2, int i3, int i4, int i5, short[] sArr) {
        validateIsInt16();
        copy2DRangeFromUnchecked(i2, i3, i4, i5, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeFrom(int i2, int i3, Bitmap bitmap) {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            copy2DRangeFrom(i2, i3, createBitmap);
            return;
        }
        validateBitmapFormat(bitmap);
        validate2DRange(i2, i3, bitmap.getWidth(), bitmap.getHeight());
        this.mRS.nAllocationData2D(getIDSafe(), i2, i3, this.mSelectedLOD, this.mSelectedFace.mID, bitmap);
    }

    public void copy2DRangeFromUnchecked(int i2, int i3, int i4, int i5, Object obj, Element.DataType dataType, int i6) {
        boolean z;
        int i7;
        this.mRS.validate();
        validate2DRange(i2, i3, i4, i5);
        int bytesSize = this.mType.mElement.getBytesSize() * i4 * i5;
        int i8 = dataType.mSize * i6;
        if (!this.mAutoPadding || this.mType.getElement().getVectorSize() != 3) {
            if (bytesSize <= i8) {
                z = false;
                i7 = i8;
            } else {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if ((bytesSize / 4) * 3 <= i8) {
            i7 = bytesSize;
            z = true;
        } else {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        this.mRS.nAllocationData2D(getIDSafe(), i2, i3, this.mSelectedLOD, this.mSelectedFace.mID, i4, i5, obj, i7, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy2DRangeTo(int i2, int i3, int i4, int i5, Object obj) {
        copy2DRangeToUnchecked(i2, i3, i4, i5, obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copy2DRangeTo(int i2, int i3, int i4, int i5, byte[] bArr) {
        validateIsInt8();
        copy2DRangeToUnchecked(i2, i3, i4, i5, bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copy2DRangeTo(int i2, int i3, int i4, int i5, float[] fArr) {
        validateIsFloat32();
        copy2DRangeToUnchecked(i2, i3, i4, i5, fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copy2DRangeTo(int i2, int i3, int i4, int i5, int[] iArr) {
        validateIsInt32();
        copy2DRangeToUnchecked(i2, i3, i4, i5, iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copy2DRangeTo(int i2, int i3, int i4, int i5, short[] sArr) {
        validateIsInt16();
        copy2DRangeToUnchecked(i2, i3, i4, i5, sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copy2DRangeToUnchecked(int i2, int i3, int i4, int i5, Object obj, Element.DataType dataType, int i6) {
        boolean z;
        int i7;
        this.mRS.validate();
        validate2DRange(i2, i3, i4, i5);
        int bytesSize = this.mType.mElement.getBytesSize() * i4 * i5;
        int i8 = dataType.mSize * i6;
        if (!this.mAutoPadding || this.mType.getElement().getVectorSize() != 3) {
            if (bytesSize <= i8) {
                z = false;
                i7 = i8;
            } else {
                throw new RSIllegalArgumentException("Array too small for allocation type.");
            }
        } else if ((bytesSize / 4) * 3 <= i8) {
            i7 = bytesSize;
            z = true;
        } else {
            throw new RSIllegalArgumentException("Array too small for allocation type.");
        }
        this.mRS.nAllocationRead2D(getIDSafe(), i2, i3, this.mSelectedLOD, this.mSelectedFace.mID, i4, i5, obj, i7, dataType, this.mType.mElement.mType.mSize, z);
    }

    public void copy3DRangeFrom(int i2, int i3, int i4, int i5, int i6, int i7, Allocation allocation, int i8, int i9, int i10) {
        Allocation allocation2 = allocation;
        this.mRS.validate();
        validate3DRange(i2, i3, i4, i5, i6, i7);
        this.mRS.nAllocationData3D(getIDSafe(), i2, i3, i4, this.mSelectedLOD, i5, i6, i7, allocation2.getID(this.mRS), i8, i9, i10, allocation2.mSelectedLOD);
    }

    public void copy3DRangeFrom(int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        Object obj2 = obj;
        copy3DRangeFromUnchecked(i2, i3, i4, i5, i6, i7, obj2, validateObjectIsPrimitiveArray(obj2, true), Array.getLength(obj));
    }

    public void copyFrom(Bitmap bitmap) {
        this.mRS.validate();
        if (bitmap.getConfig() == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            copyFrom(createBitmap);
            return;
        }
        validateBitmapSize(bitmap);
        validateBitmapFormat(bitmap);
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationCopyFromBitmap(getID(renderScript), bitmap);
    }

    public void copyFrom(Allocation allocation) {
        this.mRS.validate();
        if (this.mType.equals(allocation.getType())) {
            copy2DRangeFrom(0, 0, this.mCurrentDimX, this.mCurrentDimY, allocation, 0, 0);
            return;
        }
        throw new RSIllegalArgumentException("Types of allocations must match.");
    }

    public void copyFrom(Object obj) {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copyFrom(byte[] bArr) {
        validateIsInt8();
        copyFromUnchecked(bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copyFrom(float[] fArr) {
        validateIsFloat32();
        copyFromUnchecked(fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copyFrom(int[] iArr) {
        validateIsInt32();
        copyFromUnchecked(iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copyFrom(BaseObj[] baseObjArr) {
        this.mRS.validate();
        validateIsObject();
        if (baseObjArr.length != this.mCurrentCount) {
            StringBuilder y = a.y("Array size mismatch, allocation sizeX = ");
            y.append(this.mCurrentCount);
            y.append(", array length = ");
            y.append(baseObjArr.length);
            throw new RSIllegalArgumentException(y.toString());
        } else if (RenderScript.sPointerSize == 8) {
            long[] jArr = new long[(baseObjArr.length * 4)];
            for (int i2 = 0; i2 < baseObjArr.length; i2++) {
                jArr[i2 * 4] = baseObjArr[i2].getID(this.mRS);
            }
            copy1DRangeFromUnchecked(0, this.mCurrentCount, (Object) jArr);
        } else {
            int[] iArr = new int[baseObjArr.length];
            for (int i3 = 0; i3 < baseObjArr.length; i3++) {
                iArr[i3] = (int) baseObjArr[i3].getID(this.mRS);
            }
            copy1DRangeFromUnchecked(0, this.mCurrentCount, iArr);
        }
    }

    public void copyFrom(short[] sArr) {
        validateIsInt16();
        copyFromUnchecked(sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copyFromUnchecked(Object obj) {
        copyFromUnchecked(obj, validateObjectIsPrimitiveArray(obj, false), Array.getLength(obj));
    }

    public void copyFromUnchecked(byte[] bArr) {
        copyFromUnchecked(bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copyFromUnchecked(float[] fArr) {
        copyFromUnchecked(fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copyFromUnchecked(int[] iArr) {
        copyFromUnchecked(iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copyFromUnchecked(short[] sArr) {
        copyFromUnchecked(sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void copyTo(Bitmap bitmap) {
        this.mRS.validate();
        validateBitmapFormat(bitmap);
        validateBitmapSize(bitmap);
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationCopyToBitmap(getID(renderScript), bitmap);
    }

    public void copyTo(Object obj) {
        copyTo(obj, validateObjectIsPrimitiveArray(obj, true), Array.getLength(obj));
    }

    public void copyTo(byte[] bArr) {
        validateIsInt8();
        copyTo(bArr, Element.DataType.SIGNED_8, bArr.length);
    }

    public void copyTo(float[] fArr) {
        validateIsFloat32();
        copyTo(fArr, Element.DataType.FLOAT_32, fArr.length);
    }

    public void copyTo(int[] iArr) {
        validateIsInt32();
        copyTo(iArr, Element.DataType.SIGNED_32, iArr.length);
    }

    public void copyTo(short[] sArr) {
        validateIsInt16();
        copyTo(sArr, Element.DataType.SIGNED_16, sArr.length);
    }

    public void destroy() {
        if (this.mIncCompatAllocation != 0) {
            boolean z = false;
            synchronized (this) {
                if (!this.mIncAllocDestroyed) {
                    this.mIncAllocDestroyed = true;
                    z = true;
                }
            }
            if (z) {
                ReentrantReadWriteLock.ReadLock readLock = this.mRS.mRWLock.readLock();
                readLock.lock();
                if (this.mRS.isAlive()) {
                    this.mRS.nIncObjDestroy(this.mIncCompatAllocation);
                }
                readLock.unlock();
                this.mIncCompatAllocation = 0;
            }
        }
        if ((this.mUsage & 96) != 0) {
            setSurface((Surface) null);
        }
        super.destroy();
    }

    public void finalize() {
        if (RenderScript.sUseGCHooks) {
            RenderScript.registerNativeFree.invoke(RenderScript.sRuntime, new Object[]{Integer.valueOf(this.mSize)});
        }
        super.finalize();
    }

    public void generateMipmaps() {
        RenderScript renderScript = this.mRS;
        renderScript.nAllocationGenerateMipmaps(getID(renderScript));
    }

    public ByteBuffer getByteBuffer() {
        byte[] bArr;
        int bytesSize = this.mType.getElement().getBytesSize() * this.mType.getX();
        if (this.mRS.getDispatchAPILevel() >= 21) {
            if (this.mByteBuffer == null || (this.mUsage & 32) != 0) {
                RenderScript renderScript = this.mRS;
                this.mByteBuffer = renderScript.nAllocationGetByteBuffer(getID(renderScript), bytesSize, this.mType.getY(), this.mType.getZ());
            }
            return this.mByteBuffer;
        } else if (this.mType.getZ() > 0) {
            return null;
        } else {
            if (this.mType.getY() > 0) {
                bArr = new byte[(this.mType.getY() * bytesSize)];
                copy2DRangeToUnchecked(0, 0, this.mType.getX(), this.mType.getY(), bArr, Element.DataType.SIGNED_8, this.mType.getY() * bytesSize);
            } else {
                bArr = new byte[bytesSize];
                copy1DRangeToUnchecked(0, this.mType.getX(), bArr);
            }
            ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(bArr).asReadOnlyBuffer();
            this.mByteBufferStride = (long) bytesSize;
            return asReadOnlyBuffer;
        }
    }

    public int getBytesSize() {
        Type type = this.mType;
        int i2 = type.mDimYuv;
        int count = type.getCount();
        return i2 != 0 ? (int) Math.ceil(((double) (this.mType.getElement().getBytesSize() * count)) * 1.5d) : this.mType.getElement().getBytesSize() * count;
    }

    public Element getElement() {
        return this.mType.getElement();
    }

    public long getIncAllocID() {
        return this.mIncCompatAllocation;
    }

    public long getStride() {
        long j2;
        if (this.mByteBufferStride == 0) {
            if (this.mRS.getDispatchAPILevel() > 21) {
                RenderScript renderScript = this.mRS;
                j2 = renderScript.nAllocationGetStride(getID(renderScript));
            } else {
                j2 = (long) (this.mType.getElement().getBytesSize() * this.mType.getX());
            }
            this.mByteBufferStride = j2;
        }
        return this.mByteBufferStride;
    }

    public Type getType() {
        return this.mType;
    }

    public int getUsage() {
        return this.mUsage;
    }

    public void ioReceive() {
        if ((this.mUsage & 32) != 0) {
            this.mRS.validate();
            RenderScript renderScript = this.mRS;
            renderScript.nAllocationIoReceive(getID(renderScript));
            return;
        }
        throw new RSIllegalArgumentException("Can only receive if IO_INPUT usage specified.");
    }

    public void ioSend() {
        if ((this.mUsage & 64) != 0) {
            this.mRS.validate();
            RenderScript renderScript = this.mRS;
            renderScript.nAllocationIoSend(getID(renderScript));
            return;
        }
        throw new RSIllegalArgumentException("Can only send buffer if IO_OUTPUT usage specified.");
    }

    public void ioSendOutput() {
        ioSend();
    }

    public void setAutoPadding(boolean z) {
        this.mAutoPadding = z;
    }

    public void setFromFieldPacker(int i2, int i3, FieldPacker fieldPacker) {
        this.mRS.validate();
        if (i3 >= this.mType.mElement.mElements.length) {
            throw new RSIllegalArgumentException(a.h("Component_number ", i3, " out of range."));
        } else if (i2 >= 0) {
            byte[] data = fieldPacker.getData();
            int pos = fieldPacker.getPos();
            int bytesSize = this.mType.mElement.mElements[i3].getBytesSize() * this.mType.mElement.mArraySizes[i3];
            if (pos == bytesSize) {
                this.mRS.nAllocationElementData1D(getIDSafe(), i2, this.mSelectedLOD, i3, data, pos);
                return;
            }
            throw new RSIllegalArgumentException("Field packer sizelength " + pos + " does not match component size " + bytesSize + ".");
        } else {
            throw new RSIllegalArgumentException("Offset must be >= 0.");
        }
    }

    public void setFromFieldPacker(int i2, FieldPacker fieldPacker) {
        this.mRS.validate();
        int bytesSize = this.mType.mElement.getBytesSize();
        byte[] data = fieldPacker.getData();
        int pos = fieldPacker.getPos();
        int i3 = pos / bytesSize;
        if (bytesSize * i3 == pos) {
            copy1DRangeFromUnchecked(i2, i3, data);
            return;
        }
        throw new RSIllegalArgumentException("Field packer length " + pos + " not divisible by element size " + bytesSize + ".");
    }

    public void setIncAllocID(long j2) {
        this.mIncCompatAllocation = j2;
    }

    public void setSurface(Surface surface) {
        this.mRS.validate();
        if ((this.mUsage & 64) != 0) {
            RenderScript renderScript = this.mRS;
            renderScript.nAllocationSetSurface(getID(renderScript), surface);
            return;
        }
        throw new RSInvalidStateException("Allocation is not USAGE_IO_OUTPUT.");
    }

    public void syncAll(int i2) {
        if (i2 == 1 || i2 == 2) {
            this.mRS.validate();
            this.mRS.nAllocationSyncAll(getIDSafe(), i2);
            return;
        }
        throw new RSIllegalArgumentException("Source must be exactly one usage type.");
    }
}
