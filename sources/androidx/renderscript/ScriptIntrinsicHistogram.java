package androidx.renderscript;

import androidx.renderscript.Script;

public class ScriptIntrinsicHistogram extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mOut;

    public ScriptIntrinsicHistogram(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    public static ScriptIntrinsicHistogram create(RenderScript renderScript, Element element) {
        if (element.isCompatible(Element.U8_4(renderScript)) || element.isCompatible(Element.U8_3(renderScript)) || element.isCompatible(Element.U8_2(renderScript)) || element.isCompatible(Element.U8(renderScript))) {
            boolean isUseNative = renderScript.isUseNative();
            ScriptIntrinsicHistogram scriptIntrinsicHistogram = new ScriptIntrinsicHistogram(renderScript.nScriptIntrinsicCreate(9, element.getID(renderScript), false), renderScript);
            scriptIntrinsicHistogram.setIncSupp(false);
            return scriptIntrinsicHistogram;
        }
        throw new RSIllegalArgumentException("Unsupported element type.");
    }

    public void forEach(Allocation allocation) {
        forEach(allocation, (Script.LaunchOptions) null);
    }

    public void forEach(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (allocation.getType().getElement().getVectorSize() < this.mOut.getType().getElement().getVectorSize()) {
            throw new RSIllegalArgumentException("Input vector size must be >= output vector size.");
        } else if (allocation.getType().getElement().isCompatible(Element.U8(this.mRS)) || allocation.getType().getElement().isCompatible(Element.U8_2(this.mRS)) || allocation.getType().getElement().isCompatible(Element.U8_3(this.mRS)) || allocation.getType().getElement().isCompatible(Element.U8_4(this.mRS))) {
            forEach(0, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
        } else {
            throw new RSIllegalArgumentException("Input type must be U8, U8_1, U8_2 or U8_4.");
        }
    }

    public void forEach_Dot(Allocation allocation) {
        forEach_Dot(allocation, (Script.LaunchOptions) null);
    }

    public void forEach_Dot(Allocation allocation, Script.LaunchOptions launchOptions) {
        if (this.mOut.getType().getElement().getVectorSize() != 1) {
            throw new RSIllegalArgumentException("Output vector size must be one.");
        } else if (allocation.getType().getElement().isCompatible(Element.U8(this.mRS)) || allocation.getType().getElement().isCompatible(Element.U8_2(this.mRS)) || allocation.getType().getElement().isCompatible(Element.U8_3(this.mRS)) || allocation.getType().getElement().isCompatible(Element.U8_4(this.mRS))) {
            forEach(1, allocation, (Allocation) null, (FieldPacker) null, launchOptions);
        } else {
            throw new RSIllegalArgumentException("Input type must be U8, U8_1, U8_2 or U8_4.");
        }
    }

    public Script.FieldID getFieldID_Input() {
        return createFieldID(1, (Element) null);
    }

    public Script.KernelID getKernelID_Separate() {
        return createKernelID(0, 3, (Element) null, (Element) null);
    }

    public void setDotCoefficients(float f, float f2, float f3, float f4) {
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            throw new RSIllegalArgumentException("Coefficient may not be negative.");
        } else if (f + f2 + f3 + f4 <= 1.0f) {
            FieldPacker fieldPacker = new FieldPacker(16);
            fieldPacker.addF32(f);
            fieldPacker.addF32(f2);
            fieldPacker.addF32(f3);
            fieldPacker.addF32(f4);
            setVar(0, fieldPacker);
        } else {
            throw new RSIllegalArgumentException("Sum of coefficients must be 1.0 or less.");
        }
    }

    public void setOutput(Allocation allocation) {
        this.mOut = allocation;
        if (allocation.getType().getElement() != Element.U32(this.mRS) && this.mOut.getType().getElement() != Element.U32_2(this.mRS) && this.mOut.getType().getElement() != Element.U32_3(this.mRS) && this.mOut.getType().getElement() != Element.U32_4(this.mRS) && this.mOut.getType().getElement() != Element.I32(this.mRS) && this.mOut.getType().getElement() != Element.I32_2(this.mRS) && this.mOut.getType().getElement() != Element.I32_3(this.mRS) && this.mOut.getType().getElement() != Element.I32_4(this.mRS)) {
            throw new RSIllegalArgumentException("Output type must be U32 or I32.");
        } else if (this.mOut.getType().getX() == 256 && this.mOut.getType().getY() == 0 && !this.mOut.getType().hasMipmaps() && this.mOut.getType().getYuv() == 0) {
            setVar(1, (BaseObj) allocation);
        } else {
            throw new RSIllegalArgumentException("Output must be 1D, 256 elements.");
        }
    }
}
