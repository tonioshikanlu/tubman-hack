package androidx.renderscript;

import android.renderscript.Script;
import android.util.SparseArray;
import java.io.UnsupportedEncodingException;

public class Script extends BaseObj {
    private final SparseArray<FieldID> mFIDs = new SparseArray<>();
    private final SparseArray<InvokeID> mIIDs = new SparseArray<>();
    private final SparseArray<KernelID> mKIDs = new SparseArray<>();
    private boolean mUseIncSupp = false;

    public static class Builder {
        public RenderScript mRS;

        public Builder(RenderScript renderScript) {
            this.mRS = renderScript;
        }
    }

    public static class FieldBase {
        public Allocation mAllocation;
        public Element mElement;

        public Allocation getAllocation() {
            return this.mAllocation;
        }

        public Element getElement() {
            return this.mElement;
        }

        public Type getType() {
            return this.mAllocation.getType();
        }

        public void init(RenderScript renderScript, int i2) {
            this.mAllocation = Allocation.createSized(renderScript, this.mElement, i2, 1);
        }

        public void init(RenderScript renderScript, int i2, int i3) {
            this.mAllocation = Allocation.createSized(renderScript, this.mElement, i2, i3 | 1);
        }

        public void updateAllocation() {
        }
    }

    public static final class FieldID extends BaseObj {
        public Script.FieldID mN;
        public Script mScript;
        public int mSlot;

        public FieldID(long j2, RenderScript renderScript, Script script, int i2) {
            super(j2, renderScript);
            this.mScript = script;
            this.mSlot = i2;
        }
    }

    public static final class InvokeID extends BaseObj {
        public Script mScript;
        public int mSlot;

        public InvokeID(long j2, RenderScript renderScript, Script script, int i2) {
            super(j2, renderScript);
            this.mScript = script;
            this.mSlot = i2;
        }
    }

    public static final class KernelID extends BaseObj {
        public Script.KernelID mN;
        public Script mScript;
        public int mSig;
        public int mSlot;

        public KernelID(long j2, RenderScript renderScript, Script script, int i2, int i3) {
            super(j2, renderScript);
            this.mScript = script;
            this.mSlot = i2;
            this.mSig = i3;
        }
    }

    public static final class LaunchOptions {
        private int strategy;
        /* access modifiers changed from: private */
        public int xend = 0;
        /* access modifiers changed from: private */
        public int xstart = 0;
        /* access modifiers changed from: private */
        public int yend = 0;
        /* access modifiers changed from: private */
        public int ystart = 0;
        /* access modifiers changed from: private */
        public int zend = 0;
        /* access modifiers changed from: private */
        public int zstart = 0;

        public int getXEnd() {
            return this.xend;
        }

        public int getXStart() {
            return this.xstart;
        }

        public int getYEnd() {
            return this.yend;
        }

        public int getYStart() {
            return this.ystart;
        }

        public int getZEnd() {
            return this.zend;
        }

        public int getZStart() {
            return this.zstart;
        }

        public LaunchOptions setX(int i2, int i3) {
            if (i2 < 0 || i3 <= i2) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.xstart = i2;
            this.xend = i3;
            return this;
        }

        public LaunchOptions setY(int i2, int i3) {
            if (i2 < 0 || i3 <= i2) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.ystart = i2;
            this.yend = i3;
            return this;
        }

        public LaunchOptions setZ(int i2, int i3) {
            if (i2 < 0 || i3 <= i2) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.zstart = i2;
            this.zend = i3;
            return this;
        }
    }

    public Script(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    public void bindAllocation(Allocation allocation, int i2) {
        Allocation allocation2 = allocation;
        this.mRS.validate();
        if (allocation2 != null) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptBindAllocation(getID(renderScript), allocation2.getID(this.mRS), i2, this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        renderScript2.nScriptBindAllocation(getID(renderScript2), 0, i2, this.mUseIncSupp);
    }

    public FieldID createFieldID(int i2, Element element) {
        FieldID fieldID = this.mFIDs.get(i2);
        if (fieldID != null) {
            return fieldID;
        }
        RenderScript renderScript = this.mRS;
        long nScriptFieldIDCreate = renderScript.nScriptFieldIDCreate(getID(renderScript), i2, this.mUseIncSupp);
        if (nScriptFieldIDCreate != 0) {
            FieldID fieldID2 = new FieldID(nScriptFieldIDCreate, this.mRS, this, i2);
            this.mFIDs.put(i2, fieldID2);
            return fieldID2;
        }
        throw new RSDriverException("Failed to create FieldID");
    }

    public InvokeID createInvokeID(int i2) {
        InvokeID invokeID = this.mIIDs.get(i2);
        if (invokeID != null) {
            return invokeID;
        }
        RenderScript renderScript = this.mRS;
        long nScriptInvokeIDCreate = renderScript.nScriptInvokeIDCreate(getID(renderScript), i2);
        if (nScriptInvokeIDCreate != 0) {
            InvokeID invokeID2 = new InvokeID(nScriptInvokeIDCreate, this.mRS, this, i2);
            this.mIIDs.put(i2, invokeID2);
            return invokeID2;
        }
        throw new RSDriverException("Failed to create KernelID");
    }

    public KernelID createKernelID(int i2, int i3, Element element, Element element2) {
        KernelID kernelID = this.mKIDs.get(i2);
        if (kernelID != null) {
            return kernelID;
        }
        RenderScript renderScript = this.mRS;
        long nScriptKernelIDCreate = renderScript.nScriptKernelIDCreate(getID(renderScript), i2, i3, this.mUseIncSupp);
        if (nScriptKernelIDCreate != 0) {
            KernelID kernelID2 = new KernelID(nScriptKernelIDCreate, this.mRS, this, i2, i3);
            this.mKIDs.put(i2, kernelID2);
            return kernelID2;
        }
        throw new RSDriverException("Failed to create KernelID");
    }

    public void forEach(int i2, Allocation allocation, Allocation allocation2, FieldPacker fieldPacker) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        if (allocation3 == null && allocation4 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        long j2 = 0;
        long id = allocation3 != null ? allocation3.getID(this.mRS) : 0;
        if (allocation4 != null) {
            j2 = allocation4.getID(this.mRS);
        }
        long j3 = j2;
        byte[] bArr = null;
        if (fieldPacker != null) {
            bArr = fieldPacker.getData();
        }
        byte[] bArr2 = bArr;
        if (this.mUseIncSupp) {
            long dummyAlloc = getDummyAlloc(allocation3);
            long dummyAlloc2 = getDummyAlloc(allocation4);
            RenderScript renderScript = this.mRS;
            renderScript.nScriptForEach(getID(renderScript), i2, dummyAlloc, dummyAlloc2, bArr2, this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        renderScript2.nScriptForEach(getID(renderScript2), i2, id, j3, bArr2, this.mUseIncSupp);
    }

    public void forEach(int i2, Allocation allocation, Allocation allocation2, FieldPacker fieldPacker, LaunchOptions launchOptions) {
        Allocation allocation3 = allocation;
        Allocation allocation4 = allocation2;
        if (allocation3 == null && allocation4 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        } else if (launchOptions == null) {
            forEach(i2, allocation, allocation2, fieldPacker);
        } else {
            long j2 = 0;
            long id = allocation3 != null ? allocation3.getID(this.mRS) : 0;
            if (allocation4 != null) {
                j2 = allocation4.getID(this.mRS);
            }
            long j3 = j2;
            byte[] bArr = null;
            if (fieldPacker != null) {
                bArr = fieldPacker.getData();
            }
            byte[] bArr2 = bArr;
            if (this.mUseIncSupp) {
                long dummyAlloc = getDummyAlloc(allocation3);
                long dummyAlloc2 = getDummyAlloc(allocation4);
                RenderScript renderScript = this.mRS;
                renderScript.nScriptForEachClipped(getID(renderScript), i2, dummyAlloc, dummyAlloc2, bArr2, launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend, this.mUseIncSupp);
                return;
            }
            RenderScript renderScript2 = this.mRS;
            renderScript2.nScriptForEachClipped(getID(renderScript2), i2, id, j3, bArr2, launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend, this.mUseIncSupp);
        }
    }

    public void forEach(int i2, Allocation[] allocationArr, Allocation allocation, FieldPacker fieldPacker) {
        forEach(i2, allocationArr, allocation, fieldPacker, (LaunchOptions) null);
    }

    public void forEach(int i2, Allocation[] allocationArr, Allocation allocation, FieldPacker fieldPacker, LaunchOptions launchOptions) {
        long[] jArr;
        Allocation[] allocationArr2 = allocationArr;
        Allocation allocation2 = allocation;
        this.mRS.validate();
        if (allocationArr2 != null) {
            for (Allocation validateObject : allocationArr2) {
                this.mRS.validateObject(validateObject);
            }
        }
        this.mRS.validateObject(allocation2);
        if (allocationArr2 == null && allocation2 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        int[] iArr = null;
        if (allocationArr2 != null) {
            long[] jArr2 = new long[allocationArr2.length];
            for (int i3 = 0; i3 < allocationArr2.length; i3++) {
                jArr2[i3] = allocationArr2[i3].getID(this.mRS);
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        long id = allocation2 != null ? allocation2.getID(this.mRS) : 0;
        byte[] data = fieldPacker != null ? fieldPacker.getData() : null;
        if (launchOptions != null) {
            iArr = new int[]{launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend};
        }
        RenderScript renderScript = this.mRS;
        renderScript.nScriptForEach(getID(renderScript), i2, jArr, id, data, iArr);
    }

    public long getDummyAlloc(Allocation allocation) {
        if (allocation == null) {
            return 0;
        }
        Type type = allocation.getType();
        long dummyType = type.getDummyType(this.mRS, type.getElement().getDummyElement(this.mRS));
        int x = type.getX();
        RenderScript renderScript = this.mRS;
        long nIncAllocationCreateTyped = renderScript.nIncAllocationCreateTyped(allocation.getID(renderScript), dummyType, type.getElement().getBytesSize() * x);
        allocation.setIncAllocID(nIncAllocationCreateTyped);
        return nIncAllocationCreateTyped;
    }

    public void invoke(int i2) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptInvoke(getID(renderScript), i2, this.mUseIncSupp);
    }

    public void invoke(int i2, FieldPacker fieldPacker) {
        if (fieldPacker != null) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptInvokeV(getID(renderScript), i2, fieldPacker.getData(), this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        renderScript2.nScriptInvoke(getID(renderScript2), i2, this.mUseIncSupp);
    }

    public boolean isIncSupp() {
        return this.mUseIncSupp;
    }

    public void reduce(int i2, Allocation[] allocationArr, Allocation allocation, LaunchOptions launchOptions) {
        this.mRS.validate();
        if (allocationArr == null || allocationArr.length < 1) {
            throw new RSIllegalArgumentException("At least one input is required.");
        } else if (allocation != null) {
            for (Allocation validateObject : allocationArr) {
                this.mRS.validateObject(validateObject);
            }
            long[] jArr = new long[allocationArr.length];
            for (int i3 = 0; i3 < allocationArr.length; i3++) {
                jArr[i3] = allocationArr[i3].getID(this.mRS);
            }
            long id = allocation.getID(this.mRS);
            int[] iArr = null;
            if (launchOptions != null) {
                iArr = new int[]{launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend};
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptReduce(getID(renderScript), i2, jArr, id, iArr);
        } else {
            throw new RSIllegalArgumentException("aout is required to be non-null.");
        }
    }

    public void setIncSupp(boolean z) {
        this.mUseIncSupp = z;
    }

    public void setTimeZone(String str) {
        this.mRS.validate();
        try {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptSetTimeZone(getID(renderScript), str.getBytes("UTF-8"), this.mUseIncSupp);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void setVar(int i2, double d) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarD(getID(renderScript), i2, d, this.mUseIncSupp);
    }

    public void setVar(int i2, float f) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarF(getID(renderScript), i2, f, this.mUseIncSupp);
    }

    public void setVar(int i2, int i3) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarI(getID(renderScript), i2, i3, this.mUseIncSupp);
    }

    public void setVar(int i2, long j2) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarJ(getID(renderScript), i2, j2, this.mUseIncSupp);
    }

    public void setVar(int i2, BaseObj baseObj) {
        BaseObj baseObj2 = baseObj;
        long j2 = 0;
        if (this.mUseIncSupp) {
            long dummyAlloc = getDummyAlloc((Allocation) baseObj2);
            RenderScript renderScript = this.mRS;
            renderScript.nScriptSetVarObj(getID(renderScript), i2, baseObj2 == null ? 0 : dummyAlloc, this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        long id = getID(renderScript2);
        if (baseObj2 != null) {
            j2 = baseObj2.getID(this.mRS);
        }
        renderScript2.nScriptSetVarObj(id, i2, j2, this.mUseIncSupp);
    }

    public void setVar(int i2, FieldPacker fieldPacker) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarV(getID(renderScript), i2, fieldPacker.getData(), this.mUseIncSupp);
    }

    public void setVar(int i2, FieldPacker fieldPacker, Element element, int[] iArr) {
        Element element2 = element;
        if (this.mUseIncSupp) {
            long dummyElement = element2.getDummyElement(this.mRS);
            RenderScript renderScript = this.mRS;
            renderScript.nScriptSetVarVE(getID(renderScript), i2, fieldPacker.getData(), dummyElement, iArr, this.mUseIncSupp);
            return;
        }
        RenderScript renderScript2 = this.mRS;
        renderScript2.nScriptSetVarVE(getID(renderScript2), i2, fieldPacker.getData(), element2.getID(this.mRS), iArr, this.mUseIncSupp);
    }

    public void setVar(int i2, boolean z) {
        RenderScript renderScript = this.mRS;
        renderScript.nScriptSetVarI(getID(renderScript), i2, z ? 1 : 0, this.mUseIncSupp);
    }
}
