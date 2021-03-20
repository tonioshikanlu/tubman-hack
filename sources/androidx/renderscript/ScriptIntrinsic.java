package androidx.renderscript;

public abstract class ScriptIntrinsic extends Script {
    public ScriptIntrinsic(long j2, RenderScript renderScript) {
        super(j2, renderScript);
        if (j2 == 0) {
            throw new RSRuntimeException("Loading of ScriptIntrinsic failed.");
        }
    }
}
