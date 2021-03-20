package androidx.renderscript;

import androidx.renderscript.Script;

public class ScriptIntrinsicBlend extends ScriptIntrinsic {
    private static final int INTRINSIC_API_LEVEL = 19;

    public ScriptIntrinsicBlend(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    private void blend(int i2, Allocation allocation, Allocation allocation2) {
        if (!allocation.getElement().isCompatible(Element.U8_4(this.mRS))) {
            throw new RSIllegalArgumentException("Input is not of expected format.");
        } else if (allocation2.getElement().isCompatible(Element.U8_4(this.mRS))) {
            forEach(i2, allocation, allocation2, (FieldPacker) null);
        } else {
            throw new RSIllegalArgumentException("Output is not of expected format.");
        }
    }

    public static ScriptIntrinsicBlend create(RenderScript renderScript, Element element) {
        boolean isUseNative = renderScript.isUseNative();
        ScriptIntrinsicBlend scriptIntrinsicBlend = new ScriptIntrinsicBlend(renderScript.nScriptIntrinsicCreate(7, element.getID(renderScript), false), renderScript);
        scriptIntrinsicBlend.setIncSupp(false);
        return scriptIntrinsicBlend;
    }

    public void forEachAdd(Allocation allocation, Allocation allocation2) {
        blend(34, allocation, allocation2);
    }

    public void forEachClear(Allocation allocation, Allocation allocation2) {
        blend(0, allocation, allocation2);
    }

    public void forEachDst(Allocation allocation, Allocation allocation2) {
    }

    public void forEachDstAtop(Allocation allocation, Allocation allocation2) {
        blend(10, allocation, allocation2);
    }

    public void forEachDstIn(Allocation allocation, Allocation allocation2) {
        blend(6, allocation, allocation2);
    }

    public void forEachDstOut(Allocation allocation, Allocation allocation2) {
        blend(8, allocation, allocation2);
    }

    public void forEachDstOver(Allocation allocation, Allocation allocation2) {
        blend(4, allocation, allocation2);
    }

    public void forEachMultiply(Allocation allocation, Allocation allocation2) {
        blend(14, allocation, allocation2);
    }

    public void forEachSrc(Allocation allocation, Allocation allocation2) {
        blend(1, allocation, allocation2);
    }

    public void forEachSrcAtop(Allocation allocation, Allocation allocation2) {
        blend(9, allocation, allocation2);
    }

    public void forEachSrcIn(Allocation allocation, Allocation allocation2) {
        blend(5, allocation, allocation2);
    }

    public void forEachSrcOut(Allocation allocation, Allocation allocation2) {
        blend(7, allocation, allocation2);
    }

    public void forEachSrcOver(Allocation allocation, Allocation allocation2) {
        blend(3, allocation, allocation2);
    }

    public void forEachSubtract(Allocation allocation, Allocation allocation2) {
        blend(35, allocation, allocation2);
    }

    public void forEachXor(Allocation allocation, Allocation allocation2) {
        blend(11, allocation, allocation2);
    }

    public Script.KernelID getKernelIDAdd() {
        return createKernelID(34, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDClear() {
        return createKernelID(0, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDDst() {
        return createKernelID(2, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDDstAtop() {
        return createKernelID(10, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDDstIn() {
        return createKernelID(6, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDDstOut() {
        return createKernelID(8, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDDstOver() {
        return createKernelID(4, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDMultiply() {
        return createKernelID(14, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDSrc() {
        return createKernelID(1, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDSrcAtop() {
        return createKernelID(9, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDSrcIn() {
        return createKernelID(5, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDSrcOut() {
        return createKernelID(7, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDSrcOver() {
        return createKernelID(3, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDSubtract() {
        return createKernelID(35, 3, (Element) null, (Element) null);
    }

    public Script.KernelID getKernelIDXor() {
        return createKernelID(11, 3, (Element) null, (Element) null);
    }
}
