package androidx.renderscript;

import androidx.renderscript.Script;

public class ScriptIntrinsicYuvToRGB extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;
    private Allocation mInput;

    public ScriptIntrinsicYuvToRGB(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    public static ScriptIntrinsicYuvToRGB create(RenderScript renderScript, Element element) {
        boolean isUseNative = renderScript.isUseNative();
        ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB = new ScriptIntrinsicYuvToRGB(renderScript.nScriptIntrinsicCreate(6, element.getID(renderScript), false), renderScript);
        scriptIntrinsicYuvToRGB.setIncSupp(false);
        return scriptIntrinsicYuvToRGB;
    }

    public void forEach(Allocation allocation) {
        forEach(0, (Allocation) null, allocation, (FieldPacker) null);
    }

    public Script.FieldID getFieldID_Input() {
        return createFieldID(0, (Element) null);
    }

    public Script.KernelID getKernelID() {
        return createKernelID(0, 2, (Element) null, (Element) null);
    }

    public void setInput(Allocation allocation) {
        this.mInput = allocation;
        setVar(0, (BaseObj) allocation);
    }
}
