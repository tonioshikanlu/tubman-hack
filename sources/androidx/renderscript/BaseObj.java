package androidx.renderscript;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BaseObj {
    private boolean mDestroyed = false;
    private long mID;
    public RenderScript mRS;

    public BaseObj(long j2, RenderScript renderScript) {
        renderScript.validate();
        this.mRS = renderScript;
        this.mID = j2;
    }

    private void helpDestroy() {
        boolean z;
        synchronized (this) {
            z = true;
            if (!this.mDestroyed) {
                this.mDestroyed = true;
            } else {
                z = false;
            }
        }
        if (z) {
            ReentrantReadWriteLock.ReadLock readLock = this.mRS.mRWLock.readLock();
            readLock.lock();
            if (this.mRS.isAlive()) {
                this.mRS.nObjDestroy(this.mID);
            }
            readLock.unlock();
            this.mRS = null;
            this.mID = 0;
        }
    }

    public void checkValid() {
        if (this.mID == 0 && getNObj() == null) {
            throw new RSIllegalArgumentException("Invalid object.");
        }
    }

    public void destroy() {
        if (!this.mDestroyed) {
            helpDestroy();
            return;
        }
        throw new RSInvalidStateException("Object already destroyed.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.mID == ((BaseObj) obj).mID;
        }
        return false;
    }

    public void finalize() {
        helpDestroy();
        super.finalize();
    }

    public long getID(RenderScript renderScript) {
        this.mRS.validate();
        if (!this.mDestroyed) {
            long j2 = this.mID;
            if (j2 == 0) {
                throw new RSRuntimeException("Internal error: Object id 0.");
            } else if (renderScript == null || renderScript == this.mRS) {
                return j2;
            } else {
                throw new RSInvalidStateException("using object with mismatched context.");
            }
        } else {
            throw new RSInvalidStateException("using a destroyed object.");
        }
    }

    public android.renderscript.BaseObj getNObj() {
        return null;
    }

    public int hashCode() {
        long j2 = this.mID;
        return (int) ((j2 >> 32) ^ (268435455 & j2));
    }

    public void setID(long j2) {
        if (this.mID == 0) {
            this.mID = j2;
            return;
        }
        throw new RSRuntimeException("Internal Error, reset of object ID.");
    }
}
