package androidx.renderscript;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import androidx.renderscript.Element;
import b.e.a.a.a;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RenderScript {
    private static final String CACHE_PATH = "com.android.renderscript.cache";
    public static final int CREATE_FLAG_NONE = 0;
    public static final boolean DEBUG = false;
    public static final boolean LOG_ENABLED = false;
    public static final String LOG_TAG = "RenderScript_jni";
    public static final int SUPPORT_LIB_API = 23;
    public static final int SUPPORT_LIB_VERSION = 2301;
    public static Object lock = new Object();
    private static String mBlackList = "";
    public static String mCachePath;
    private static ArrayList<RenderScript> mProcessContextList = new ArrayList<>();
    public static Method registerNativeAllocation;
    public static Method registerNativeFree;
    public static boolean sInitialized;
    private static int sNative = -1;
    public static int sPointerSize;
    public static Object sRuntime;
    private static int sSdkVersion = -1;
    public static boolean sUseGCHooks;
    private static boolean useIOlib = false;
    private static boolean useNative;
    private Context mApplicationContext;
    public long mContext;
    private int mContextFlags = 0;
    private int mContextSdkVersion = 0;
    public ContextType mContextType = ContextType.NORMAL;
    private boolean mDestroyed = false;
    private int mDispatchAPILevel = 0;
    public Element mElement_ALLOCATION;
    public Element mElement_A_8;
    public Element mElement_BOOLEAN;
    public Element mElement_CHAR_2;
    public Element mElement_CHAR_3;
    public Element mElement_CHAR_4;
    public Element mElement_DOUBLE_2;
    public Element mElement_DOUBLE_3;
    public Element mElement_DOUBLE_4;
    public Element mElement_ELEMENT;
    public Element mElement_F32;
    public Element mElement_F64;
    public Element mElement_FLOAT_2;
    public Element mElement_FLOAT_3;
    public Element mElement_FLOAT_4;
    public Element mElement_I16;
    public Element mElement_I32;
    public Element mElement_I64;
    public Element mElement_I8;
    public Element mElement_INT_2;
    public Element mElement_INT_3;
    public Element mElement_INT_4;
    public Element mElement_LONG_2;
    public Element mElement_LONG_3;
    public Element mElement_LONG_4;
    public Element mElement_MATRIX_2X2;
    public Element mElement_MATRIX_3X3;
    public Element mElement_MATRIX_4X4;
    public Element mElement_RGBA_4444;
    public Element mElement_RGBA_5551;
    public Element mElement_RGBA_8888;
    public Element mElement_RGB_565;
    public Element mElement_RGB_888;
    public Element mElement_SAMPLER;
    public Element mElement_SCRIPT;
    public Element mElement_SHORT_2;
    public Element mElement_SHORT_3;
    public Element mElement_SHORT_4;
    public Element mElement_TYPE;
    public Element mElement_U16;
    public Element mElement_U32;
    public Element mElement_U64;
    public Element mElement_U8;
    public Element mElement_UCHAR_2;
    public Element mElement_UCHAR_3;
    public Element mElement_UCHAR_4;
    public Element mElement_UINT_2;
    public Element mElement_UINT_3;
    public Element mElement_UINT_4;
    public Element mElement_ULONG_2;
    public Element mElement_ULONG_3;
    public Element mElement_ULONG_4;
    public Element mElement_USHORT_2;
    public Element mElement_USHORT_3;
    public Element mElement_USHORT_4;
    private boolean mEnableMultiInput = false;
    public RSErrorHandler mErrorCallback = null;
    public long mIncCon;
    public boolean mIncLoaded;
    private boolean mIsProcessContext = false;
    public RSMessageHandler mMessageCallback = null;
    public MessageThread mMessageThread;
    private String mNativeLibDir;
    public ReentrantReadWriteLock mRWLock;
    public Sampler mSampler_CLAMP_LINEAR;
    public Sampler mSampler_CLAMP_LINEAR_MIP_LINEAR;
    public Sampler mSampler_CLAMP_NEAREST;
    public Sampler mSampler_MIRRORED_REPEAT_LINEAR;
    public Sampler mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
    public Sampler mSampler_MIRRORED_REPEAT_NEAREST;
    public Sampler mSampler_WRAP_LINEAR;
    public Sampler mSampler_WRAP_LINEAR_MIP_LINEAR;
    public Sampler mSampler_WRAP_NEAREST;

    public enum ContextType {
        NORMAL(0),
        DEBUG(1),
        PROFILE(2);
        
        public int mID;

        private ContextType(int i2) {
            this.mID = i2;
        }
    }

    public static class MessageThread extends Thread {
        public static final int RS_ERROR_FATAL_DEBUG = 2048;
        public static final int RS_ERROR_FATAL_UNKNOWN = 4096;
        public static final int RS_MESSAGE_TO_CLIENT_ERROR = 3;
        public static final int RS_MESSAGE_TO_CLIENT_EXCEPTION = 1;
        public static final int RS_MESSAGE_TO_CLIENT_NONE = 0;
        public static final int RS_MESSAGE_TO_CLIENT_RESIZE = 2;
        public static final int RS_MESSAGE_TO_CLIENT_USER = 4;
        public int[] mAuxData = new int[2];
        public RenderScript mRS;
        public boolean mRun = true;

        public MessageThread(RenderScript renderScript) {
            super("RSMessageThread");
            this.mRS = renderScript;
        }

        public void run() {
            int[] iArr = new int[16];
            RenderScript renderScript = this.mRS;
            renderScript.nContextInitToClient(renderScript.mContext);
            while (this.mRun) {
                iArr[0] = 0;
                RenderScript renderScript2 = this.mRS;
                int nContextPeekMessage = renderScript2.nContextPeekMessage(renderScript2.mContext, this.mAuxData);
                int[] iArr2 = this.mAuxData;
                int i2 = iArr2[1];
                int i3 = iArr2[0];
                if (nContextPeekMessage == 4) {
                    if ((i2 >> 2) >= iArr.length) {
                        iArr = new int[((i2 + 3) >> 2)];
                    }
                    RenderScript renderScript3 = this.mRS;
                    if (renderScript3.nContextGetUserMessage(renderScript3.mContext, iArr) == 4) {
                        RSMessageHandler rSMessageHandler = this.mRS.mMessageCallback;
                        if (rSMessageHandler != null) {
                            rSMessageHandler.mData = iArr;
                            rSMessageHandler.mID = i3;
                            rSMessageHandler.mLength = i2;
                            rSMessageHandler.run();
                        } else {
                            throw new RSInvalidStateException("Received a message from the script with no message handler installed.");
                        }
                    } else {
                        throw new RSDriverException("Error processing message from RenderScript.");
                    }
                } else if (nContextPeekMessage == 3) {
                    RenderScript renderScript4 = this.mRS;
                    String nContextGetErrorMessage = renderScript4.nContextGetErrorMessage(renderScript4.mContext);
                    if (i3 < 4096) {
                        if (i3 >= 2048) {
                            RenderScript renderScript5 = this.mRS;
                            if (renderScript5.mContextType == ContextType.DEBUG) {
                                if (renderScript5.mErrorCallback == null) {
                                }
                            }
                        }
                        RSErrorHandler rSErrorHandler = this.mRS.mErrorCallback;
                        if (rSErrorHandler != null) {
                            rSErrorHandler.mErrorMessage = nContextGetErrorMessage;
                            rSErrorHandler.mErrorNum = i3;
                            rSErrorHandler.run();
                        } else {
                            Log.e(RenderScript.LOG_TAG, "non fatal RS error, " + nContextGetErrorMessage);
                        }
                    }
                    Log.e(RenderScript.LOG_TAG, "fatal RS error, " + nContextGetErrorMessage);
                    throw new RSRuntimeException("Fatal error " + i3 + ", details: " + nContextGetErrorMessage);
                } else {
                    try {
                        Thread.sleep(1, 0);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public enum Priority {
        LOW(15),
        NORMAL(-4);
        
        public int mID;

        private Priority(int i2) {
            this.mID = i2;
        }
    }

    public static class RSErrorHandler implements Runnable {
        public String mErrorMessage;
        public int mErrorNum;

        public void run() {
        }
    }

    public static class RSMessageHandler implements Runnable {
        public int[] mData;
        public int mID;
        public int mLength;

        public void run() {
        }
    }

    public RenderScript(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.mApplicationContext = applicationContext;
            this.mNativeLibDir = applicationContext.getApplicationInfo().nativeLibraryDir;
        }
        this.mIncCon = 0;
        this.mIncLoaded = false;
        this.mRWLock = new ReentrantReadWriteLock();
    }

    public static RenderScript create(Context context) {
        return create(context, ContextType.NORMAL);
    }

    public static RenderScript create(Context context, int i2) {
        return create(context, i2, ContextType.NORMAL, 0);
    }

    public static RenderScript create(Context context, int i2, ContextType contextType) {
        return create(context, i2, contextType, 0);
    }

    public static RenderScript create(Context context, int i2, ContextType contextType, int i3) {
        synchronized (mProcessContextList) {
            Iterator<RenderScript> it = mProcessContextList.iterator();
            while (it.hasNext()) {
                RenderScript next = it.next();
                if (next.mContextType == contextType && next.mContextFlags == i3 && next.mContextSdkVersion == i2) {
                    return next;
                }
            }
            RenderScript internalCreate = internalCreate(context, i2, contextType, i3);
            internalCreate.mIsProcessContext = true;
            mProcessContextList.add(internalCreate);
            return internalCreate;
        }
    }

    public static RenderScript create(Context context, ContextType contextType) {
        return create(context, contextType, 0);
    }

    public static RenderScript create(Context context, ContextType contextType, int i2) {
        return create(context, context.getApplicationInfo().targetSdkVersion, contextType, i2);
    }

    public static RenderScript createMultiContext(Context context, ContextType contextType, int i2, int i3) {
        return internalCreate(context, i3, contextType, i2);
    }

    public static void forceCompat() {
        sNative = 0;
    }

    public static int getPointerSize() {
        synchronized (lock) {
            if (!sInitialized) {
                throw new RSInvalidStateException("Calling getPointerSize() before any RenderScript instantiated");
            }
        }
        return sPointerSize;
    }

    private void helpDestroy() {
        boolean z;
        boolean z2;
        synchronized (this) {
            z = false;
            if (!this.mDestroyed) {
                this.mDestroyed = true;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            nContextFinish();
            if (this.mIncCon != 0) {
                nIncContextFinish();
                nIncContextDestroy();
                this.mIncCon = 0;
            }
            nContextDeinitToClient(this.mContext);
            MessageThread messageThread = this.mMessageThread;
            messageThread.mRun = false;
            messageThread.interrupt();
            boolean z3 = false;
            while (!z) {
                try {
                    this.mMessageThread.join();
                    z = true;
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
            if (z3) {
                Log.v(LOG_TAG, "Interrupted during wait for MessageThread to join");
                Thread.currentThread().interrupt();
            }
            nContextDestroy();
        }
    }

    private static RenderScript internalCreate(Context context, int i2, ContextType contextType, int i3) {
        String str;
        String str2;
        RenderScript renderScript = new RenderScript(context);
        int i4 = sSdkVersion;
        if (i4 == -1) {
            sSdkVersion = i2;
        } else if (i4 != i2) {
            throw new RSRuntimeException("Can't have two contexts with different SDK versions in support lib");
        }
        useNative = setupNative(sSdkVersion, context);
        synchronized (lock) {
            if (!sInitialized) {
                try {
                    Class<?> cls = Class.forName("dalvik.system.VMRuntime");
                    sRuntime = cls.getDeclaredMethod("getRuntime", new Class[0]).invoke((Object) null, new Object[0]);
                    Class cls2 = Integer.TYPE;
                    registerNativeAllocation = cls.getDeclaredMethod("registerNativeAllocation", new Class[]{cls2});
                    registerNativeFree = cls.getDeclaredMethod("registerNativeFree", new Class[]{cls2});
                    sUseGCHooks = true;
                } catch (UnsatisfiedLinkError e2) {
                    Log.e(LOG_TAG, "Error loading RS jni library: " + e2);
                    throw new RSRuntimeException("Error loading RS jni library: " + e2 + " Support lib API: " + SUPPORT_LIB_VERSION);
                } catch (Exception unused) {
                    Log.e(LOG_TAG, "No GC methods");
                    sUseGCHooks = false;
                }
                System.loadLibrary("rsjni_androidx");
                sInitialized = true;
                sPointerSize = rsnSystemGetPointerSize();
            }
        }
        if (useNative) {
            str = LOG_TAG;
            str2 = "RS native mode";
        } else {
            str = LOG_TAG;
            str2 = "RS compat mode";
        }
        Log.v(str, str2);
        int i5 = Build.VERSION.SDK_INT;
        useIOlib = true;
        if (i2 >= i5) {
            i5 = i2;
        }
        if (!renderScript.nLoadSO(useNative, i5, (String) null)) {
            if (useNative) {
                Log.v(LOG_TAG, "Unable to load libRS.so, falling back to compat mode");
                useNative = false;
            }
            try {
                System.loadLibrary("RSSupport");
                if (!renderScript.nLoadSO(false, i5, (String) null)) {
                    Log.e(LOG_TAG, "Error loading RS Compat library: nLoadSO() failed; Support lib version: 2301");
                    throw new RSRuntimeException("Error loading libRSSupport library, Support lib version: 2301");
                }
            } catch (UnsatisfiedLinkError e3) {
                Log.e(LOG_TAG, "Error loading RS Compat library: " + e3 + " Support lib version: " + SUPPORT_LIB_VERSION);
                throw new RSRuntimeException("Error loading RS Compat library: " + e3 + " Support lib version: " + SUPPORT_LIB_VERSION);
            }
        }
        if (useIOlib) {
            try {
                System.loadLibrary("RSSupportIO");
            } catch (UnsatisfiedLinkError unused2) {
                useIOlib = false;
            }
            if (!useIOlib || !renderScript.nLoadIOSO()) {
                Log.v(LOG_TAG, "Unable to load libRSSupportIO.so, USAGE_IO not supported");
                useIOlib = false;
            }
        }
        if (i5 >= 23) {
            renderScript.mEnableMultiInput = true;
            try {
                System.loadLibrary("blasV8");
            } catch (UnsatisfiedLinkError e4) {
                Log.v(LOG_TAG, "Unable to load BLAS lib, ONLY BNNM will be supported: " + e4);
            }
        }
        long nContextCreate = renderScript.nContextCreate(renderScript.nDeviceCreate(), 0, i2, contextType.mID, renderScript.mNativeLibDir);
        renderScript.mContext = nContextCreate;
        renderScript.mContextType = contextType;
        renderScript.mContextFlags = i3;
        renderScript.mContextSdkVersion = i2;
        renderScript.mDispatchAPILevel = i5;
        if (nContextCreate != 0) {
            MessageThread messageThread = new MessageThread(renderScript);
            renderScript.mMessageThread = messageThread;
            messageThread.start();
            return renderScript;
        }
        throw new RSDriverException("Failed to create RS context.");
    }

    public static void releaseAllContexts() {
        ArrayList<RenderScript> arrayList;
        synchronized (mProcessContextList) {
            arrayList = mProcessContextList;
            mProcessContextList = new ArrayList<>();
        }
        Iterator<RenderScript> it = arrayList.iterator();
        while (it.hasNext()) {
            RenderScript next = it.next();
            next.mIsProcessContext = false;
            next.destroy();
        }
        arrayList.clear();
    }

    public static native int rsnSystemGetPointerSize();

    public static void setBlackList(String str) {
        if (str != null) {
            mBlackList = str;
        }
    }

    public static void setupDiskCache(File file) {
        File file2 = new File(file, CACHE_PATH);
        mCachePath = file2.getAbsolutePath();
        file2.mkdirs();
    }

    private static boolean setupNative(int i2, Context context) {
        int i3;
        long j2;
        if (sNative == -1) {
            try {
                i3 = ((Integer) Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke((Object) null, new Object[]{"debug.rs.forcecompat", new Integer(0)})).intValue();
            } catch (Exception unused) {
                i3 = 0;
            }
            if (i3 == 0) {
                sNative = 1;
            } else {
                sNative = 0;
            }
            if (sNative == 1) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    try {
                        j2 = ((Long) Class.forName("android.renderscript.RenderScript").getDeclaredMethod("getMinorID", new Class[0]).invoke((Object) null, new Object[0])).longValue();
                    } catch (Exception unused2) {
                        j2 = 0;
                    }
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        if (bundle.getBoolean("androidx.renderscript.EnableAsyncTeardown") && j2 == 0) {
                            sNative = 0;
                        }
                        applicationInfo.metaData.getBoolean("androidx.renderscript.EnableBlurWorkaround");
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    return true;
                }
            }
        }
        if (sNative != 1) {
            return false;
        }
        if (mBlackList.length() > 0) {
            StringBuilder v = a.v('(');
            v.append(Build.MANUFACTURER);
            v.append(':');
            v.append(Build.PRODUCT);
            v.append(':');
            if (mBlackList.contains(a.p(v, Build.MODEL, ')'))) {
                sNative = 0;
                return false;
            }
        }
        return true;
    }

    public void contextDump() {
        validate();
        nContextDump(0);
    }

    public void destroy() {
        if (!this.mIsProcessContext) {
            validate();
            helpDestroy();
        }
    }

    public void finalize() {
        helpDestroy();
        super.finalize();
    }

    public void finish() {
        nContextFinish();
    }

    public final Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public int getDispatchAPILevel() {
        return this.mDispatchAPILevel;
    }

    public RSErrorHandler getErrorHandler() {
        return this.mErrorCallback;
    }

    public RSMessageHandler getMessageHandler() {
        return this.mMessageCallback;
    }

    public boolean isAlive() {
        return this.mContext != 0;
    }

    public boolean isUseNative() {
        return useNative;
    }

    public synchronized void nAllocationCopyFromBitmap(long j2, Bitmap bitmap) {
        validate();
        rsnAllocationCopyFromBitmap(this.mContext, j2, bitmap);
    }

    public synchronized void nAllocationCopyToBitmap(long j2, Bitmap bitmap) {
        validate();
        rsnAllocationCopyToBitmap(this.mContext, j2, bitmap);
    }

    public synchronized long nAllocationCreateBitmapBackedAllocation(long j2, int i2, Bitmap bitmap, int i3) {
        validate();
        return rsnAllocationCreateBitmapBackedAllocation(this.mContext, j2, i2, bitmap, i3);
    }

    public synchronized long nAllocationCreateBitmapRef(long j2, Bitmap bitmap) {
        validate();
        return rsnAllocationCreateBitmapRef(this.mContext, j2, bitmap);
    }

    public synchronized long nAllocationCreateFromAssetStream(int i2, int i3, int i4) {
        validate();
        return rsnAllocationCreateFromAssetStream(this.mContext, i2, i3, i4);
    }

    public synchronized long nAllocationCreateFromBitmap(long j2, int i2, Bitmap bitmap, int i3) {
        validate();
        return rsnAllocationCreateFromBitmap(this.mContext, j2, i2, bitmap, i3);
    }

    public synchronized long nAllocationCreateTyped(long j2, int i2, int i3, long j3) {
        validate();
        return rsnAllocationCreateTyped(this.mContext, j2, i2, i3, j3);
    }

    public synchronized long nAllocationCubeCreateFromBitmap(long j2, int i2, Bitmap bitmap, int i3) {
        validate();
        return rsnAllocationCubeCreateFromBitmap(this.mContext, j2, i2, bitmap, i3);
    }

    public synchronized void nAllocationData1D(long j2, int i2, int i3, int i4, Object obj, int i5, Element.DataType dataType, int i6, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationData1D(this.mContext, j2, i2, i3, i4, obj, i5, dataType.mID, i6, z);
        }
    }

    public synchronized void nAllocationData2D(long j2, int i2, int i3, int i4, int i5, int i6, int i7, long j3, int i8, int i9, int i10, int i11) {
        synchronized (this) {
            validate();
            rsnAllocationData2D(this.mContext, j2, i2, i3, i4, i5, i6, i7, j3, i8, i9, i10, i11);
        }
    }

    public synchronized void nAllocationData2D(long j2, int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, Element.DataType dataType, int i9, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationData2D(this.mContext, j2, i2, i3, i4, i5, i6, i7, obj, i8, dataType.mID, i9, z);
        }
    }

    public synchronized void nAllocationData2D(long j2, int i2, int i3, int i4, int i5, Bitmap bitmap) {
        synchronized (this) {
            validate();
            rsnAllocationData2D(this.mContext, j2, i2, i3, i4, i5, bitmap);
        }
    }

    public synchronized void nAllocationData3D(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j3, int i9, int i10, int i11, int i12) {
        synchronized (this) {
            validate();
            rsnAllocationData3D(this.mContext, j2, i2, i3, i4, i5, i6, i7, i8, j3, i9, i10, i11, i12);
        }
    }

    public synchronized void nAllocationData3D(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj, int i9, Element.DataType dataType, int i10, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationData3D(this.mContext, j2, i2, i3, i4, i5, i6, i7, i8, obj, i9, dataType.mID, i10, z);
        }
    }

    public synchronized void nAllocationElementData1D(long j2, int i2, int i3, int i4, byte[] bArr, int i5) {
        synchronized (this) {
            validate();
            rsnAllocationElementData1D(this.mContext, j2, i2, i3, i4, bArr, i5);
        }
    }

    public synchronized void nAllocationGenerateMipmaps(long j2) {
        validate();
        rsnAllocationGenerateMipmaps(this.mContext, j2);
    }

    public synchronized ByteBuffer nAllocationGetByteBuffer(long j2, int i2, int i3, int i4) {
        validate();
        return rsnAllocationGetByteBuffer(this.mContext, j2, i2, i3, i4);
    }

    public synchronized long nAllocationGetStride(long j2) {
        validate();
        return rsnAllocationGetStride(this.mContext, j2);
    }

    public synchronized long nAllocationGetType(long j2) {
        validate();
        return rsnAllocationGetType(this.mContext, j2);
    }

    public synchronized void nAllocationIoReceive(long j2) {
        validate();
        rsnAllocationIoReceive(this.mContext, j2);
    }

    public synchronized void nAllocationIoSend(long j2) {
        validate();
        rsnAllocationIoSend(this.mContext, j2);
    }

    public synchronized void nAllocationRead(long j2, Object obj, Element.DataType dataType, int i2, boolean z) {
        validate();
        rsnAllocationRead(this.mContext, j2, obj, dataType.mID, i2, z);
    }

    public synchronized void nAllocationRead1D(long j2, int i2, int i3, int i4, Object obj, int i5, Element.DataType dataType, int i6, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationRead1D(this.mContext, j2, i2, i3, i4, obj, i5, dataType.mID, i6, z);
        }
    }

    public synchronized void nAllocationRead2D(long j2, int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, Element.DataType dataType, int i9, boolean z) {
        synchronized (this) {
            validate();
            rsnAllocationRead2D(this.mContext, j2, i2, i3, i4, i5, i6, i7, obj, i8, dataType.mID, i9, z);
        }
    }

    public synchronized void nAllocationResize1D(long j2, int i2) {
        validate();
        rsnAllocationResize1D(this.mContext, j2, i2);
    }

    public synchronized void nAllocationResize2D(long j2, int i2, int i3) {
        validate();
        rsnAllocationResize2D(this.mContext, j2, i2, i3);
    }

    public synchronized void nAllocationSetSurface(long j2, Surface surface) {
        validate();
        rsnAllocationSetSurface(this.mContext, j2, surface);
    }

    public synchronized void nAllocationSyncAll(long j2, int i2) {
        validate();
        rsnAllocationSyncAll(this.mContext, j2, i2);
    }

    public synchronized long nClosureCreate(long j2, long j3, long[] jArr, long[] jArr2, int[] iArr, long[] jArr3, long[] jArr4) {
        long rsnClosureCreate;
        synchronized (this) {
            validate();
            rsnClosureCreate = rsnClosureCreate(this.mContext, j2, j3, jArr, jArr2, iArr, jArr3, jArr4);
            if (rsnClosureCreate == 0) {
                throw new RSRuntimeException("Failed creating closure.");
            }
        }
        return rsnClosureCreate;
    }

    public synchronized void nClosureSetArg(long j2, int i2, long j3, int i3) {
        validate();
        rsnClosureSetArg(this.mContext, j2, i2, j3, i3);
    }

    public synchronized void nClosureSetGlobal(long j2, long j3, long j4, int i2) {
        synchronized (this) {
            validate();
            rsnClosureSetGlobal(this.mContext, j2, j3, j4, i2);
        }
    }

    public synchronized long nContextCreate(long j2, int i2, int i3, int i4, String str) {
        return rsnContextCreate(j2, i2, i3, i4, str);
    }

    public native void nContextDeinitToClient(long j2);

    public synchronized void nContextDestroy() {
        validate();
        ReentrantReadWriteLock.WriteLock writeLock = this.mRWLock.writeLock();
        writeLock.lock();
        long j2 = this.mContext;
        this.mContext = 0;
        writeLock.unlock();
        rsnContextDestroy(j2);
    }

    public synchronized void nContextDump(int i2) {
        validate();
        rsnContextDump(this.mContext, i2);
    }

    public synchronized void nContextFinish() {
        validate();
        rsnContextFinish(this.mContext);
    }

    public native String nContextGetErrorMessage(long j2);

    public native int nContextGetUserMessage(long j2, int[] iArr);

    public native void nContextInitToClient(long j2);

    public native int nContextPeekMessage(long j2, int[] iArr);

    public synchronized void nContextSendMessage(int i2, int[] iArr) {
        validate();
        rsnContextSendMessage(this.mContext, i2, iArr);
    }

    public synchronized void nContextSetPriority(int i2) {
        validate();
        rsnContextSetPriority(this.mContext, i2);
    }

    public native long nDeviceCreate();

    public native void nDeviceDestroy(long j2);

    public native void nDeviceSetConfig(long j2, int i2, int i3);

    public synchronized long nElementCreate(long j2, int i2, boolean z, int i3) {
        validate();
        return rsnElementCreate(this.mContext, j2, i2, z, i3);
    }

    public synchronized long nElementCreate2(long[] jArr, String[] strArr, int[] iArr) {
        validate();
        return rsnElementCreate2(this.mContext, jArr, strArr, iArr);
    }

    public synchronized void nElementGetNativeData(long j2, int[] iArr) {
        validate();
        rsnElementGetNativeData(this.mContext, j2, iArr);
    }

    public synchronized void nElementGetSubElements(long j2, long[] jArr, String[] strArr, int[] iArr) {
        validate();
        rsnElementGetSubElements(this.mContext, j2, jArr, strArr, iArr);
    }

    public synchronized long nIncAllocationCreateTyped(long j2, long j3, int i2) {
        validate();
        return rsnIncAllocationCreateTyped(this.mContext, this.mIncCon, j2, j3, i2);
    }

    public synchronized long nIncContextCreate(long j2, int i2, int i3, int i4) {
        return rsnIncContextCreate(j2, i2, i3, i4);
    }

    public synchronized void nIncContextDestroy() {
        validate();
        ReentrantReadWriteLock.WriteLock writeLock = this.mRWLock.writeLock();
        writeLock.lock();
        long j2 = this.mIncCon;
        this.mIncCon = 0;
        writeLock.unlock();
        rsnIncContextDestroy(j2);
    }

    public synchronized void nIncContextFinish() {
        validate();
        rsnIncContextFinish(this.mIncCon);
    }

    public native long nIncDeviceCreate();

    public native void nIncDeviceDestroy(long j2);

    public synchronized long nIncElementCreate(long j2, int i2, boolean z, int i3) {
        validate();
        return rsnIncElementCreate(this.mIncCon, j2, i2, z, i3);
    }

    public native boolean nIncLoadSO(int i2, String str);

    public void nIncObjDestroy(long j2) {
        long j3 = this.mIncCon;
        if (j3 != 0) {
            rsnIncObjDestroy(j3, j2);
        }
    }

    public synchronized long nIncTypeCreate(long j2, int i2, int i3, int i4, boolean z, boolean z2, int i5) {
        long rsnIncTypeCreate;
        synchronized (this) {
            validate();
            rsnIncTypeCreate = rsnIncTypeCreate(this.mIncCon, j2, i2, i3, i4, z, z2, i5);
        }
        return rsnIncTypeCreate;
    }

    public synchronized long nInvokeClosureCreate(long j2, byte[] bArr, long[] jArr, long[] jArr2, int[] iArr) {
        long rsnInvokeClosureCreate;
        validate();
        rsnInvokeClosureCreate = rsnInvokeClosureCreate(this.mContext, j2, bArr, jArr, jArr2, iArr);
        if (rsnInvokeClosureCreate == 0) {
            throw new RSRuntimeException("Failed creating closure.");
        }
        return rsnInvokeClosureCreate;
    }

    public native boolean nLoadIOSO();

    public native boolean nLoadSO(boolean z, int i2, String str);

    public void nObjDestroy(long j2) {
        long j3 = this.mContext;
        if (j3 != 0) {
            rsnObjDestroy(j3, j2);
        }
    }

    public synchronized long nSamplerCreate(int i2, int i3, int i4, int i5, int i6, float f) {
        validate();
        return rsnSamplerCreate(this.mContext, i2, i3, i4, i5, i6, f);
    }

    public synchronized void nScriptBindAllocation(long j2, long j3, int i2, boolean z) {
        validate();
        long j4 = this.mContext;
        if (z) {
            j4 = this.mIncCon;
        }
        rsnScriptBindAllocation(j4, j2, j3, i2, z);
    }

    public synchronized long nScriptCCreate(String str, String str2, byte[] bArr, int i2) {
        validate();
        return rsnScriptCCreate(this.mContext, str, str2, bArr, i2);
    }

    public synchronized long nScriptFieldIDCreate(long j2, int i2, boolean z) {
        long j3;
        validate();
        j3 = this.mContext;
        if (z) {
            j3 = this.mIncCon;
        }
        return rsnScriptFieldIDCreate(j3, j2, i2, z);
    }

    public synchronized void nScriptForEach(long j2, int i2, long j3, long j4, byte[] bArr, boolean z) {
        synchronized (this) {
            validate();
            if (bArr == null) {
                rsnScriptForEach(this.mContext, this.mIncCon, j2, i2, j3, j4, z);
            } else {
                rsnScriptForEach(this.mContext, this.mIncCon, j2, i2, j3, j4, bArr, z);
            }
        }
    }

    public synchronized void nScriptForEach(long j2, int i2, long[] jArr, long j3, byte[] bArr, int[] iArr) {
        synchronized (this) {
            if (this.mEnableMultiInput) {
                validate();
                rsnScriptForEach(this.mContext, j2, i2, jArr, j3, bArr, iArr);
            } else {
                Log.e(LOG_TAG, "Multi-input kernels are not supported, please change targetSdkVersion to >= 23");
                throw new RSRuntimeException("Multi-input kernels are not supported before API 23)");
            }
        }
    }

    public synchronized void nScriptForEachClipped(long j2, int i2, long j3, long j4, byte[] bArr, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        synchronized (this) {
            validate();
            if (bArr == null) {
                rsnScriptForEachClipped(this.mContext, this.mIncCon, j2, i2, j3, j4, i3, i4, i5, i6, i7, i8, z);
            } else {
                rsnScriptForEachClipped(this.mContext, this.mIncCon, j2, i2, j3, j4, bArr, i3, i4, i5, i6, i7, i8, z);
            }
        }
    }

    public synchronized long nScriptGroup2Create(String str, String str2, long[] jArr) {
        validate();
        return rsnScriptGroup2Create(this.mContext, str, str2, jArr);
    }

    public synchronized void nScriptGroup2Execute(long j2) {
        validate();
        rsnScriptGroup2Execute(this.mContext, j2);
    }

    public synchronized long nScriptGroupCreate(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5) {
        validate();
        return rsnScriptGroupCreate(this.mContext, jArr, jArr2, jArr3, jArr4, jArr5);
    }

    public synchronized void nScriptGroupExecute(long j2) {
        validate();
        rsnScriptGroupExecute(this.mContext, j2);
    }

    public synchronized void nScriptGroupSetInput(long j2, long j3, long j4) {
        validate();
        rsnScriptGroupSetInput(this.mContext, j2, j3, j4);
    }

    public synchronized void nScriptGroupSetOutput(long j2, long j3, long j4) {
        validate();
        rsnScriptGroupSetOutput(this.mContext, j2, j3, j4);
    }

    public synchronized void nScriptIntrinsicBLAS_BNNM(long j2, int i2, int i3, int i4, long j3, int i5, long j4, int i6, long j5, int i7, int i8, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_BNNM(this.mContext, this.mIncCon, j2, i2, i3, i4, j3, i5, j4, i6, j5, i7, i8, z);
        }
    }

    public synchronized void nScriptIntrinsicBLAS_Complex(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, float f2, long j3, long j4, float f3, float f4, long j5, int i11, int i12, int i13, int i14, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_Complex(this.mContext, this.mIncCon, j2, i2, i3, i4, i5, i6, i7, i8, i9, i10, f, f2, j3, j4, f3, f4, j5, i11, i12, i13, i14, z);
        }
    }

    public synchronized void nScriptIntrinsicBLAS_Double(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, double d, long j3, long j4, double d2, long j5, int i11, int i12, int i13, int i14, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_Double(this.mContext, this.mIncCon, j2, i2, i3, i4, i5, i6, i7, i8, i9, i10, d, j3, j4, d2, j5, i11, i12, i13, i14, z);
        }
    }

    public synchronized void nScriptIntrinsicBLAS_Single(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, long j3, long j4, float f2, long j5, int i11, int i12, int i13, int i14, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_Single(this.mContext, this.mIncCon, j2, i2, i3, i4, i5, i6, i7, i8, i9, i10, f, j3, j4, f2, j5, i11, i12, i13, i14, z);
        }
    }

    public synchronized void nScriptIntrinsicBLAS_Z(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, double d, double d2, long j3, long j4, double d3, double d4, long j5, int i11, int i12, int i13, int i14, boolean z) {
        synchronized (this) {
            validate();
            rsnScriptIntrinsicBLAS_Z(this.mContext, this.mIncCon, j2, i2, i3, i4, i5, i6, i7, i8, i9, i10, d, d2, j3, j4, d3, d4, j5, i11, i12, i13, i14, z);
        }
    }

    public synchronized long nScriptIntrinsicCreate(int i2, long j2, boolean z) {
        validate();
        if (z) {
            if (!this.mIncLoaded) {
                try {
                    System.loadLibrary("RSSupport");
                    if (nIncLoadSO(23, this.mNativeLibDir + "/libRSSupport.so")) {
                        this.mIncLoaded = true;
                    } else {
                        throw new RSRuntimeException("Error loading libRSSupport library for Incremental Intrinsic Support");
                    }
                } catch (UnsatisfiedLinkError e2) {
                    Log.e(LOG_TAG, "Error loading RS Compat library for Incremental Intrinsic Support: " + e2);
                    throw new RSRuntimeException("Error loading RS Compat library for Incremental Intrinsic Support: " + e2);
                }
            }
            if (this.mIncCon == 0) {
                this.mIncCon = nIncContextCreate(nIncDeviceCreate(), 0, 0, 0);
            }
            return rsnScriptIntrinsicCreate(this.mIncCon, i2, j2, z);
        }
        return rsnScriptIntrinsicCreate(this.mContext, i2, j2, z);
    }

    public synchronized void nScriptInvoke(long j2, int i2, boolean z) {
        validate();
        long j3 = this.mContext;
        if (z) {
            j3 = this.mIncCon;
        }
        rsnScriptInvoke(j3, j2, i2, z);
    }

    public synchronized long nScriptInvokeIDCreate(long j2, int i2) {
        validate();
        return rsnScriptInvokeIDCreate(this.mContext, j2, i2);
    }

    public synchronized void nScriptInvokeV(long j2, int i2, byte[] bArr, boolean z) {
        validate();
        long j3 = this.mContext;
        if (z) {
            j3 = this.mIncCon;
        }
        rsnScriptInvokeV(j3, j2, i2, bArr, z);
    }

    public synchronized long nScriptKernelIDCreate(long j2, int i2, int i3, boolean z) {
        long j3;
        validate();
        j3 = this.mContext;
        if (z) {
            j3 = this.mIncCon;
        }
        return rsnScriptKernelIDCreate(j3, j2, i2, i3, z);
    }

    public synchronized void nScriptReduce(long j2, int i2, long[] jArr, long j3, int[] iArr) {
        synchronized (this) {
            validate();
            rsnScriptReduce(this.mContext, j2, i2, jArr, j3, iArr);
        }
    }

    public synchronized void nScriptSetTimeZone(long j2, byte[] bArr, boolean z) {
        validate();
        long j3 = this.mContext;
        if (z) {
            j3 = this.mIncCon;
        }
        rsnScriptSetTimeZone(j3, j2, bArr, z);
    }

    public synchronized void nScriptSetVarD(long j2, int i2, double d, boolean z) {
        validate();
        long j3 = this.mContext;
        if (z) {
            j3 = this.mIncCon;
        }
        rsnScriptSetVarD(j3, j2, i2, d, z);
    }

    public synchronized void nScriptSetVarF(long j2, int i2, float f, boolean z) {
        validate();
        long j3 = this.mContext;
        if (z) {
            j3 = this.mIncCon;
        }
        rsnScriptSetVarF(j3, j2, i2, f, z);
    }

    public synchronized void nScriptSetVarI(long j2, int i2, int i3, boolean z) {
        validate();
        long j3 = this.mContext;
        if (z) {
            j3 = this.mIncCon;
        }
        rsnScriptSetVarI(j3, j2, i2, i3, z);
    }

    public synchronized void nScriptSetVarJ(long j2, int i2, long j3, boolean z) {
        validate();
        long j4 = this.mContext;
        if (z) {
            j4 = this.mIncCon;
        }
        rsnScriptSetVarJ(j4, j2, i2, j3, z);
    }

    public synchronized void nScriptSetVarObj(long j2, int i2, long j3, boolean z) {
        validate();
        long j4 = this.mContext;
        if (z) {
            j4 = this.mIncCon;
        }
        rsnScriptSetVarObj(j4, j2, i2, j3, z);
    }

    public synchronized void nScriptSetVarV(long j2, int i2, byte[] bArr, boolean z) {
        validate();
        long j3 = this.mContext;
        if (z) {
            j3 = this.mIncCon;
        }
        rsnScriptSetVarV(j3, j2, i2, bArr, z);
    }

    public synchronized void nScriptSetVarVE(long j2, int i2, byte[] bArr, long j3, int[] iArr, boolean z) {
        synchronized (this) {
            validate();
            long j4 = this.mContext;
            if (z) {
                j4 = this.mIncCon;
            }
            rsnScriptSetVarVE(j4, j2, i2, bArr, j3, iArr, z);
        }
    }

    public synchronized long nTypeCreate(long j2, int i2, int i3, int i4, boolean z, boolean z2, int i5) {
        long rsnTypeCreate;
        synchronized (this) {
            validate();
            rsnTypeCreate = rsnTypeCreate(this.mContext, j2, i2, i3, i4, z, z2, i5);
        }
        return rsnTypeCreate;
    }

    public synchronized void nTypeGetNativeData(long j2, long[] jArr) {
        validate();
        rsnTypeGetNativeData(this.mContext, j2, jArr);
    }

    public native void rsnAllocationCopyFromBitmap(long j2, long j3, Bitmap bitmap);

    public native void rsnAllocationCopyToBitmap(long j2, long j3, Bitmap bitmap);

    public native long rsnAllocationCreateBitmapBackedAllocation(long j2, long j3, int i2, Bitmap bitmap, int i3);

    public native long rsnAllocationCreateBitmapRef(long j2, long j3, Bitmap bitmap);

    public native long rsnAllocationCreateFromAssetStream(long j2, int i2, int i3, int i4);

    public native long rsnAllocationCreateFromBitmap(long j2, long j3, int i2, Bitmap bitmap, int i3);

    public native long rsnAllocationCreateTyped(long j2, long j3, int i2, int i3, long j4);

    public native long rsnAllocationCubeCreateFromBitmap(long j2, long j3, int i2, Bitmap bitmap, int i3);

    public native void rsnAllocationData1D(long j2, long j3, int i2, int i3, int i4, Object obj, int i5, int i6, int i7, boolean z);

    public native void rsnAllocationData2D(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, long j4, int i8, int i9, int i10, int i11);

    public native void rsnAllocationData2D(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, int i9, int i10, boolean z);

    public native void rsnAllocationData2D(long j2, long j3, int i2, int i3, int i4, int i5, Bitmap bitmap);

    public native void rsnAllocationData3D(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j4, int i9, int i10, int i11, int i12);

    public native void rsnAllocationData3D(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj, int i9, int i10, int i11, boolean z);

    public native void rsnAllocationElementData1D(long j2, long j3, int i2, int i3, int i4, byte[] bArr, int i5);

    public native void rsnAllocationGenerateMipmaps(long j2, long j3);

    public native ByteBuffer rsnAllocationGetByteBuffer(long j2, long j3, int i2, int i3, int i4);

    public native long rsnAllocationGetStride(long j2, long j3);

    public native long rsnAllocationGetType(long j2, long j3);

    public native void rsnAllocationIoReceive(long j2, long j3);

    public native void rsnAllocationIoSend(long j2, long j3);

    public native void rsnAllocationRead(long j2, long j3, Object obj, int i2, int i3, boolean z);

    public native void rsnAllocationRead1D(long j2, long j3, int i2, int i3, int i4, Object obj, int i5, int i6, int i7, boolean z);

    public native void rsnAllocationRead2D(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, int i9, int i10, boolean z);

    public native void rsnAllocationResize1D(long j2, long j3, int i2);

    public native void rsnAllocationResize2D(long j2, long j3, int i2, int i3);

    public native void rsnAllocationSetSurface(long j2, long j3, Surface surface);

    public native void rsnAllocationSyncAll(long j2, long j3, int i2);

    public native long rsnClosureCreate(long j2, long j3, long j4, long[] jArr, long[] jArr2, int[] iArr, long[] jArr3, long[] jArr4);

    public native void rsnClosureSetArg(long j2, long j3, int i2, long j4, int i3);

    public native void rsnClosureSetGlobal(long j2, long j3, long j4, long j5, int i2);

    public native long rsnContextCreate(long j2, int i2, int i3, int i4, String str);

    public native void rsnContextDestroy(long j2);

    public native void rsnContextDump(long j2, int i2);

    public native void rsnContextFinish(long j2);

    public native void rsnContextSendMessage(long j2, int i2, int[] iArr);

    public native void rsnContextSetPriority(long j2, int i2);

    public native long rsnElementCreate(long j2, long j3, int i2, boolean z, int i3);

    public native long rsnElementCreate2(long j2, long[] jArr, String[] strArr, int[] iArr);

    public native void rsnElementGetNativeData(long j2, long j3, int[] iArr);

    public native void rsnElementGetSubElements(long j2, long j3, long[] jArr, String[] strArr, int[] iArr);

    public native long rsnIncAllocationCreateTyped(long j2, long j3, long j4, long j5, int i2);

    public native long rsnIncContextCreate(long j2, int i2, int i3, int i4);

    public native void rsnIncContextDestroy(long j2);

    public native void rsnIncContextFinish(long j2);

    public native long rsnIncElementCreate(long j2, long j3, int i2, boolean z, int i3);

    public native void rsnIncObjDestroy(long j2, long j3);

    public native long rsnIncTypeCreate(long j2, long j3, int i2, int i3, int i4, boolean z, boolean z2, int i5);

    public native long rsnInvokeClosureCreate(long j2, long j3, byte[] bArr, long[] jArr, long[] jArr2, int[] iArr);

    public native void rsnObjDestroy(long j2, long j3);

    public native long rsnSamplerCreate(long j2, int i2, int i3, int i4, int i5, int i6, float f);

    public native void rsnScriptBindAllocation(long j2, long j3, long j4, int i2, boolean z);

    public native long rsnScriptCCreate(long j2, String str, String str2, byte[] bArr, int i2);

    public native long rsnScriptFieldIDCreate(long j2, long j3, int i2, boolean z);

    public native void rsnScriptForEach(long j2, long j3, int i2, long[] jArr, long j4, byte[] bArr, int[] iArr);

    public native void rsnScriptForEach(long j2, long j3, long j4, int i2, long j5, long j6, boolean z);

    public native void rsnScriptForEach(long j2, long j3, long j4, int i2, long j5, long j6, byte[] bArr, boolean z);

    public native void rsnScriptForEachClipped(long j2, long j3, long j4, int i2, long j5, long j6, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    public native void rsnScriptForEachClipped(long j2, long j3, long j4, int i2, long j5, long j6, byte[] bArr, int i3, int i4, int i5, int i6, int i7, int i8, boolean z);

    public native long rsnScriptGroup2Create(long j2, String str, String str2, long[] jArr);

    public native void rsnScriptGroup2Execute(long j2, long j3);

    public native long rsnScriptGroupCreate(long j2, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5);

    public native void rsnScriptGroupExecute(long j2, long j3);

    public native void rsnScriptGroupSetInput(long j2, long j3, long j4, long j5);

    public native void rsnScriptGroupSetOutput(long j2, long j3, long j4, long j5);

    public native void rsnScriptIntrinsicBLAS_BNNM(long j2, long j3, long j4, int i2, int i3, int i4, long j5, int i5, long j6, int i6, long j7, int i7, int i8, boolean z);

    public native void rsnScriptIntrinsicBLAS_Complex(long j2, long j3, long j4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, float f2, long j5, long j6, float f3, float f4, long j7, int i11, int i12, int i13, int i14, boolean z);

    public native void rsnScriptIntrinsicBLAS_Double(long j2, long j3, long j4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, double d, long j5, long j6, double d2, long j7, int i11, int i12, int i13, int i14, boolean z);

    public native void rsnScriptIntrinsicBLAS_Single(long j2, long j3, long j4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, long j5, long j6, float f2, long j7, int i11, int i12, int i13, int i14, boolean z);

    public native void rsnScriptIntrinsicBLAS_Z(long j2, long j3, long j4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, double d, double d2, long j5, long j6, double d3, double d4, long j7, int i11, int i12, int i13, int i14, boolean z);

    public native long rsnScriptIntrinsicCreate(long j2, int i2, long j3, boolean z);

    public native void rsnScriptInvoke(long j2, long j3, int i2, boolean z);

    public native long rsnScriptInvokeIDCreate(long j2, long j3, int i2);

    public native void rsnScriptInvokeV(long j2, long j3, int i2, byte[] bArr, boolean z);

    public native long rsnScriptKernelIDCreate(long j2, long j3, int i2, int i3, boolean z);

    public native void rsnScriptReduce(long j2, long j3, int i2, long[] jArr, long j4, int[] iArr);

    public native void rsnScriptSetTimeZone(long j2, long j3, byte[] bArr, boolean z);

    public native void rsnScriptSetVarD(long j2, long j3, int i2, double d, boolean z);

    public native void rsnScriptSetVarF(long j2, long j3, int i2, float f, boolean z);

    public native void rsnScriptSetVarI(long j2, long j3, int i2, int i3, boolean z);

    public native void rsnScriptSetVarJ(long j2, long j3, int i2, long j4, boolean z);

    public native void rsnScriptSetVarObj(long j2, long j3, int i2, long j4, boolean z);

    public native void rsnScriptSetVarV(long j2, long j3, int i2, byte[] bArr, boolean z);

    public native void rsnScriptSetVarVE(long j2, long j3, int i2, byte[] bArr, long j4, int[] iArr, boolean z);

    public native long rsnTypeCreate(long j2, long j3, int i2, int i3, int i4, boolean z, boolean z2, int i5);

    public native void rsnTypeGetNativeData(long j2, long j3, long[] jArr);

    public long safeID(BaseObj baseObj) {
        if (baseObj != null) {
            return baseObj.getID(this);
        }
        return 0;
    }

    public void sendMessage(int i2, int[] iArr) {
        nContextSendMessage(i2, iArr);
    }

    public void setErrorHandler(RSErrorHandler rSErrorHandler) {
        this.mErrorCallback = rSErrorHandler;
    }

    public void setMessageHandler(RSMessageHandler rSMessageHandler) {
        this.mMessageCallback = rSMessageHandler;
    }

    public void setPriority(Priority priority) {
        validate();
        nContextSetPriority(priority.mID);
    }

    public boolean usingIO() {
        return useIOlib;
    }

    public void validate() {
        if (this.mContext == 0) {
            throw new RSInvalidStateException("Calling RS with no Context active.");
        }
    }

    public void validateObject(BaseObj baseObj) {
        if (baseObj != null && baseObj.mRS != this) {
            throw new RSIllegalArgumentException("Attempting to use an object across contexts.");
        }
    }
}
