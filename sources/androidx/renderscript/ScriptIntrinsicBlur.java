package androidx.renderscript;

import androidx.renderscript.Script;

public class ScriptIntrinsicBlur extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;
    private final float[] mValues = new float[9];

    public ScriptIntrinsicBlur(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    public static ScriptIntrinsicBlur create(RenderScript renderScript, Element element) {
        if (element.isCompatible(Element.U8_4(renderScript)) || element.isCompatible(Element.U8(renderScript))) {
            boolean isUseNative = renderScript.isUseNative();
            ScriptIntrinsicBlur scriptIntrinsicBlur = new ScriptIntrinsicBlur(renderScript.nScriptIntrinsicCreate(5, element.getID(renderScript), false), renderScript);
            scriptIntrinsicBlur.setIncSupp(false);
            scriptIntrinsicBlur.setRadius(5.0f);
            return scriptIntrinsicBlur;
        }
        throw new RSIllegalArgumentException("Unsupported element type.");
    }

    public void forEach(Allocation allocation) {
        if (allocation.getType().getY() != 0) {
            forEach(0, (Allocation) null, allocation, (FieldPacker) null);
            return;
        }
        throw new RSIllegalArgumentException("Output is a 1D Allocation");
    }

    public Script.FieldID getFieldID_Input() {
        return createFieldID(1, (Element) null);
    }

    public Script.KernelID getKernelID() {
        return createKernelID(0, 2, (Element) null, (Element) null);
    }

    public void setInput(Allocation allocation) {
        if (allocation.getType().getY() != 0) {
            this.mInput = allocation;
            setVar(1, (BaseObj) allocation);
            return;
        }
        throw new RSIllegalArgumentException("Input set to a 1D Allocation");
    }

    public void setRadius(float f) {
        if (f <= 0.0f || f > 25.0f) {
            throw new RSIllegalArgumentException("Radius out of range (0 < r <= 25).");
        }
        setVar(0, f);
    }
}
