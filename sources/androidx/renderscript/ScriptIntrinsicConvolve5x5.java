package androidx.renderscript;

import androidx.renderscript.Script;

public class ScriptIntrinsicConvolve5x5 extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;
    private final float[] mValues = new float[25];

    public ScriptIntrinsicConvolve5x5(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    public static ScriptIntrinsicConvolve5x5 create(RenderScript renderScript, Element element) {
        if (element.isCompatible(Element.U8(renderScript)) || element.isCompatible(Element.U8_2(renderScript)) || element.isCompatible(Element.U8_3(renderScript)) || element.isCompatible(Element.U8_4(renderScript)) || element.isCompatible(Element.F32(renderScript)) || element.isCompatible(Element.F32_2(renderScript)) || element.isCompatible(Element.F32_3(renderScript)) || element.isCompatible(Element.F32_4(renderScript))) {
            boolean isUseNative = renderScript.isUseNative();
            ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5 = new ScriptIntrinsicConvolve5x5(renderScript.nScriptIntrinsicCreate(4, element.getID(renderScript), false), renderScript);
            scriptIntrinsicConvolve5x5.setIncSupp(false);
            return scriptIntrinsicConvolve5x5;
        }
        throw new RSIllegalArgumentException("Unsupported element type.");
    }

    public void forEach(Allocation allocation) {
        forEach(0, (Allocation) null, allocation, (FieldPacker) null);
    }

    public void forEach(Allocation allocation, Script.LaunchOptions launchOptions) {
        forEach(0, (Allocation) null, allocation, (FieldPacker) null, launchOptions);
    }

    public Script.FieldID getFieldID_Input() {
        return createFieldID(1, (Element) null);
    }

    public Script.KernelID getKernelID() {
        return createKernelID(0, 2, (Element) null, (Element) null);
    }

    public void setCoefficients(float[] fArr) {
        FieldPacker fieldPacker = new FieldPacker(100);
        int i2 = 0;
        while (true) {
            float[] fArr2 = this.mValues;
            if (i2 < fArr2.length) {
                fArr2[i2] = fArr[i2];
                fieldPacker.addF32(fArr2[i2]);
                i2++;
            } else {
                setVar(0, fieldPacker);
                return;
            }
        }
    }

    public void setInput(Allocation allocation) {
        this.mInput = allocation;
        setVar(1, (BaseObj) allocation);
    }
}
