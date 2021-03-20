package androidx.renderscript;

import android.util.Log;
import android.util.Pair;
import androidx.renderscript.Allocation;
import androidx.renderscript.Script;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ScriptGroup extends BaseObj {
    private static final int MIN_API_VERSION = 23;
    private static final String TAG = "ScriptGroup";
    private List<Closure> mClosures;
    public IO[] mInputs;
    private List<Input> mInputs2;
    private String mName;
    /* access modifiers changed from: private */
    public ArrayList<Node> mNodes = new ArrayList<>();
    public IO[] mOutputs;
    private Future[] mOutputs2;
    /* access modifiers changed from: private */
    public boolean mUseIncSupp = false;

    public static final class Binding {
        private final Script.FieldID mField;
        private final Object mValue;

        public Binding(Script.FieldID fieldID, Object obj) {
            this.mField = fieldID;
            this.mValue = obj;
        }

        public Script.FieldID getField() {
            return this.mField;
        }

        public Object getValue() {
            return this.mValue;
        }
    }

    @Deprecated
    public static final class Builder {
        private int mKernelCount;
        private ArrayList<ConnectLine> mLines = new ArrayList<>();
        private ArrayList<Node> mNodes = new ArrayList<>();
        private RenderScript mRS;
        private boolean mUseIncSupp = false;

        public Builder(RenderScript renderScript) {
            this.mRS = renderScript;
        }

        private boolean calcOrder() {
            Iterator<Node> it = this.mNodes.iterator();
            boolean z = true;
            while (it.hasNext()) {
                Node next = it.next();
                if (next.mInputs.size() == 0) {
                    Iterator<Node> it2 = this.mNodes.iterator();
                    while (it2.hasNext()) {
                        it2.next().mSeen = false;
                    }
                    z &= calcOrderRecurse(next, 1);
                }
            }
            Collections.sort(this.mNodes, new Comparator<Node>() {
                public int compare(Node node, Node node2) {
                    return node.mOrder - node2.mOrder;
                }
            });
            return z;
        }

        private boolean calcOrderRecurse(Node node, int i2) {
            node.mSeen = true;
            if (node.mOrder < i2) {
                node.mOrder = i2;
            }
            Iterator<ConnectLine> it = node.mOutputs.iterator();
            boolean z = true;
            while (it.hasNext()) {
                ConnectLine next = it.next();
                Script.FieldID fieldID = next.mToF;
                Node findNode = findNode(fieldID != null ? fieldID.mScript : next.mToK.mScript);
                if (findNode.mSeen) {
                    return false;
                }
                z &= calcOrderRecurse(findNode, node.mOrder + 1);
            }
            return z;
        }

        private Node findNode(Script.KernelID kernelID) {
            for (int i2 = 0; i2 < this.mNodes.size(); i2++) {
                Node node = this.mNodes.get(i2);
                for (int i3 = 0; i3 < node.mKernels.size(); i3++) {
                    if (kernelID == node.mKernels.get(i3)) {
                        return node;
                    }
                }
            }
            return null;
        }

        private Node findNode(Script script) {
            for (int i2 = 0; i2 < this.mNodes.size(); i2++) {
                if (script == this.mNodes.get(i2).mScript) {
                    return this.mNodes.get(i2);
                }
            }
            return null;
        }

        private void mergeDAGs(int i2, int i3) {
            for (int i4 = 0; i4 < this.mNodes.size(); i4++) {
                if (this.mNodes.get(i4).dagNumber == i3) {
                    this.mNodes.get(i4).dagNumber = i2;
                }
            }
        }

        private void validateCycle(Node node, Node node2) {
            for (int i2 = 0; i2 < node.mOutputs.size(); i2++) {
                ConnectLine connectLine = node.mOutputs.get(i2);
                Script.KernelID kernelID = connectLine.mToK;
                if (kernelID != null) {
                    Node findNode = findNode(kernelID.mScript);
                    if (!findNode.equals(node2)) {
                        validateCycle(findNode, node2);
                    } else {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                }
                Script.FieldID fieldID = connectLine.mToF;
                if (fieldID != null) {
                    Node findNode2 = findNode(fieldID.mScript);
                    if (!findNode2.equals(node2)) {
                        validateCycle(findNode2, node2);
                    } else {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                }
            }
        }

        private void validateDAG() {
            int i2 = 0;
            for (int i3 = 0; i3 < this.mNodes.size(); i3++) {
                Node node = this.mNodes.get(i3);
                if (node.mInputs.size() == 0) {
                    if (node.mOutputs.size() != 0 || this.mNodes.size() <= 1) {
                        validateDAGRecurse(node, i3 + 1);
                    } else {
                        throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
                    }
                }
            }
            int i4 = this.mNodes.get(0).dagNumber;
            while (i2 < this.mNodes.size()) {
                if (this.mNodes.get(i2).dagNumber == i4) {
                    i2++;
                } else {
                    throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
                }
            }
        }

        private void validateDAGRecurse(Node node, int i2) {
            int i3 = node.dagNumber;
            if (i3 == 0 || i3 == i2) {
                node.dagNumber = i2;
                for (int i4 = 0; i4 < node.mOutputs.size(); i4++) {
                    ConnectLine connectLine = node.mOutputs.get(i4);
                    Script.KernelID kernelID = connectLine.mToK;
                    if (kernelID != null) {
                        validateDAGRecurse(findNode(kernelID.mScript), i2);
                    }
                    Script.FieldID fieldID = connectLine.mToF;
                    if (fieldID != null) {
                        validateDAGRecurse(findNode(fieldID.mScript), i2);
                    }
                }
                return;
            }
            mergeDAGs(i3, i2);
        }

        public Builder addConnection(Type type, Script.KernelID kernelID, Script.FieldID fieldID) {
            Node findNode = findNode(kernelID);
            if (findNode != null) {
                Node findNode2 = findNode(fieldID.mScript);
                if (findNode2 != null) {
                    ConnectLine connectLine = new ConnectLine(type, kernelID, fieldID);
                    this.mLines.add(new ConnectLine(type, kernelID, fieldID));
                    findNode.mOutputs.add(connectLine);
                    findNode2.mInputs.add(connectLine);
                    validateCycle(findNode, findNode);
                    return this;
                }
                throw new RSInvalidStateException("To script not found.");
            }
            throw new RSInvalidStateException("From script not found.");
        }

        public Builder addConnection(Type type, Script.KernelID kernelID, Script.KernelID kernelID2) {
            Node findNode = findNode(kernelID);
            if (findNode != null) {
                Node findNode2 = findNode(kernelID2);
                if (findNode2 != null) {
                    ConnectLine connectLine = new ConnectLine(type, kernelID, kernelID2);
                    this.mLines.add(new ConnectLine(type, kernelID, kernelID2));
                    findNode.mOutputs.add(connectLine);
                    findNode2.mInputs.add(connectLine);
                    validateCycle(findNode, findNode);
                    return this;
                }
                throw new RSInvalidStateException("To script not found.");
            }
            throw new RSInvalidStateException("From script not found.");
        }

        public Builder addKernel(Script.KernelID kernelID) {
            if (this.mLines.size() == 0) {
                if (kernelID.mScript.isIncSupp()) {
                    this.mUseIncSupp = true;
                }
                if (findNode(kernelID) != null) {
                    return this;
                }
                this.mKernelCount++;
                Node findNode = findNode(kernelID.mScript);
                if (findNode == null) {
                    findNode = new Node(kernelID.mScript);
                    this.mNodes.add(findNode);
                }
                findNode.mKernels.add(kernelID);
                return this;
            }
            throw new RSInvalidStateException("Kernels may not be added once connections exist.");
        }

        public ScriptGroup create() {
            if (this.mNodes.size() != 0) {
                for (int i2 = 0; i2 < this.mNodes.size(); i2++) {
                    this.mNodes.get(i2).dagNumber = 0;
                }
                validateDAG();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long[] jArr = new long[this.mKernelCount];
                int i3 = 0;
                for (int i4 = 0; i4 < this.mNodes.size(); i4++) {
                    Node node = this.mNodes.get(i4);
                    int i5 = 0;
                    while (i5 < node.mKernels.size()) {
                        Script.KernelID kernelID = node.mKernels.get(i5);
                        int i6 = i3 + 1;
                        jArr[i3] = kernelID.getID(this.mRS);
                        boolean z = false;
                        for (int i7 = 0; i7 < node.mInputs.size(); i7++) {
                            if (node.mInputs.get(i7).mToK == kernelID) {
                                z = true;
                            }
                        }
                        boolean z2 = false;
                        for (int i8 = 0; i8 < node.mOutputs.size(); i8++) {
                            if (node.mOutputs.get(i8).mFrom == kernelID) {
                                z2 = true;
                            }
                        }
                        if (!z) {
                            arrayList.add(new IO(kernelID));
                        }
                        if (!z2) {
                            arrayList2.add(new IO(kernelID));
                        }
                        i5++;
                        i3 = i6;
                    }
                }
                if (i3 == this.mKernelCount) {
                    long j2 = 0;
                    if (!this.mUseIncSupp) {
                        long[] jArr2 = new long[this.mLines.size()];
                        long[] jArr3 = new long[this.mLines.size()];
                        long[] jArr4 = new long[this.mLines.size()];
                        long[] jArr5 = new long[this.mLines.size()];
                        for (int i9 = 0; i9 < this.mLines.size(); i9++) {
                            ConnectLine connectLine = this.mLines.get(i9);
                            jArr2[i9] = connectLine.mFrom.getID(this.mRS);
                            Script.KernelID kernelID2 = connectLine.mToK;
                            if (kernelID2 != null) {
                                jArr3[i9] = kernelID2.getID(this.mRS);
                            }
                            Script.FieldID fieldID = connectLine.mToF;
                            if (fieldID != null) {
                                jArr4[i9] = fieldID.getID(this.mRS);
                            }
                            jArr5[i9] = connectLine.mAllocationType.getID(this.mRS);
                        }
                        long nScriptGroupCreate = this.mRS.nScriptGroupCreate(jArr, jArr2, jArr3, jArr4, jArr5);
                        if (nScriptGroupCreate != 0) {
                            j2 = nScriptGroupCreate;
                        } else {
                            throw new RSRuntimeException("Object creation error, should not happen.");
                        }
                    } else {
                        calcOrder();
                    }
                    ScriptGroup scriptGroup = new ScriptGroup(j2, this.mRS);
                    scriptGroup.mOutputs = new IO[arrayList2.size()];
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        scriptGroup.mOutputs[i10] = (IO) arrayList2.get(i10);
                    }
                    scriptGroup.mInputs = new IO[arrayList.size()];
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        scriptGroup.mInputs[i11] = (IO) arrayList.get(i11);
                    }
                    ArrayList unused = scriptGroup.mNodes = this.mNodes;
                    boolean unused2 = scriptGroup.mUseIncSupp = this.mUseIncSupp;
                    return scriptGroup;
                }
                throw new RSRuntimeException("Count mismatch, should not happen.");
            }
            throw new RSInvalidStateException("Empty script groups are not allowed");
        }
    }

    public static final class Builder2 {
        private static final String TAG = "ScriptGroup.Builder2";
        public List<Closure> mClosures = new ArrayList();
        public List<Input> mInputs = new ArrayList();
        public RenderScript mRS;

        public Builder2(RenderScript renderScript) {
            this.mRS = renderScript;
        }

        private Closure addInvokeInternal(Script.InvokeID invokeID, Object[] objArr, Map<Script.FieldID, Object> map) {
            Closure closure = new Closure(this.mRS, invokeID, objArr, map);
            this.mClosures.add(closure);
            return closure;
        }

        private Closure addKernelInternal(Script.KernelID kernelID, Type type, Object[] objArr, Map<Script.FieldID, Object> map) {
            Closure closure = new Closure(this.mRS, kernelID, type, objArr, map);
            this.mClosures.add(closure);
            return closure;
        }

        private boolean seperateArgsAndBindings(Object[] objArr, ArrayList<Object> arrayList, Map<Script.FieldID, Object> map) {
            int i2 = 0;
            while (i2 < objArr.length && !(objArr[i2] instanceof Binding)) {
                arrayList.add(objArr[i2]);
                i2++;
            }
            while (i2 < objArr.length) {
                if (!(objArr[i2] instanceof Binding)) {
                    return false;
                }
                Binding binding = objArr[i2];
                map.put(binding.getField(), binding.getValue());
                i2++;
            }
            return true;
        }

        public Input addInput() {
            Input input = new Input();
            this.mInputs.add(input);
            return input;
        }

        public Closure addInvoke(Script.InvokeID invokeID, Object... objArr) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            if (!seperateArgsAndBindings(objArr, arrayList, hashMap)) {
                return null;
            }
            return addInvokeInternal(invokeID, arrayList.toArray(), hashMap);
        }

        public Closure addKernel(Script.KernelID kernelID, Type type, Object... objArr) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            if (!seperateArgsAndBindings(objArr, arrayList, hashMap)) {
                return null;
            }
            return addKernelInternal(kernelID, type, arrayList.toArray(), hashMap);
        }

        public ScriptGroup create(String str, Future... futureArr) {
            if (str == null || str.isEmpty() || str.length() > 100 || !str.equals(str.replaceAll("[^a-zA-Z0-9-]", "_"))) {
                throw new RSIllegalArgumentException("invalid script group name");
            }
            return new ScriptGroup(this.mRS, str, this.mClosures, this.mInputs, futureArr);
        }
    }

    public static final class Closure extends BaseObj {
        private static final String TAG = "Closure";
        private Object[] mArgs;
        private Map<Script.FieldID, Object> mBindings;
        private FieldPacker mFP;
        private Map<Script.FieldID, Future> mGlobalFuture;
        private Future mReturnFuture;
        private Allocation mReturnValue;

        public static final class ValueAndSize {
            public int size;
            public long value;

            public ValueAndSize(RenderScript renderScript, Object obj) {
                long j2;
                long doubleToRawLongBits;
                if (obj instanceof Allocation) {
                    this.value = ((Allocation) obj).getID(renderScript);
                    this.size = -1;
                    return;
                }
                if (obj instanceof Boolean) {
                    j2 = ((Boolean) obj).booleanValue() ? 1 : 0;
                } else if (obj instanceof Integer) {
                    j2 = ((Integer) obj).longValue();
                } else {
                    if (obj instanceof Long) {
                        doubleToRawLongBits = ((Long) obj).longValue();
                    } else if (obj instanceof Float) {
                        j2 = (long) Float.floatToRawIntBits(((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        doubleToRawLongBits = Double.doubleToRawLongBits(((Double) obj).doubleValue());
                    } else {
                        return;
                    }
                    this.value = doubleToRawLongBits;
                    this.size = 8;
                    return;
                }
                this.value = j2;
                this.size = 4;
            }
        }

        public Closure(long j2, RenderScript renderScript) {
            super(j2, renderScript);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Closure(androidx.renderscript.RenderScript r19, androidx.renderscript.Script.InvokeID r20, java.lang.Object[] r21, java.util.Map<androidx.renderscript.Script.FieldID, java.lang.Object> r22) {
            /*
                r18 = this;
                r9 = r18
                r10 = r19
                r0 = 0
                r9.<init>(r0, r10)
                androidx.renderscript.FieldPacker r0 = androidx.renderscript.FieldPacker.createFromArray(r21)
                r9.mFP = r0
                r0 = r21
                r9.mArgs = r0
                r0 = r22
                r9.mBindings = r0
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r9.mGlobalFuture = r1
                int r1 = r22.size()
                long[] r11 = new long[r1]
                long[] r12 = new long[r1]
                int[] r13 = new int[r1]
                long[] r14 = new long[r1]
                long[] r15 = new long[r1]
                r1 = 0
                java.util.Set r0 = r22.entrySet()
                java.util.Iterator r16 = r0.iterator()
                r17 = r1
            L_0x0037:
                boolean r0 = r16.hasNext()
                if (r0 == 0) goto L_0x0064
                java.lang.Object r0 = r16.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r4 = r0.getValue()
                java.lang.Object r0 = r0.getKey()
                r3 = r0
                androidx.renderscript.Script$FieldID r3 = (androidx.renderscript.Script.FieldID) r3
                long r0 = r3.getID(r10)
                r11[r17] = r0
                r0 = r18
                r1 = r19
                r2 = r17
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r0.retrieveValueAndDependenceInfo(r1, r2, r3, r4, r5, r6, r7, r8)
                int r17 = r17 + 1
                goto L_0x0037
            L_0x0064:
                r0 = r20
                long r1 = r0.getID(r10)
                androidx.renderscript.FieldPacker r0 = r9.mFP
                byte[] r3 = r0.getData()
                r0 = r19
                r4 = r11
                r5 = r12
                r6 = r13
                long r0 = r0.nInvokeClosureCreate(r1, r3, r4, r5, r6)
                r9.setID(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.renderscript.ScriptGroup.Closure.<init>(androidx.renderscript.RenderScript, androidx.renderscript.Script$InvokeID, java.lang.Object[], java.util.Map):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Closure(androidx.renderscript.RenderScript r22, androidx.renderscript.Script.KernelID r23, androidx.renderscript.Type r24, java.lang.Object[] r25, java.util.Map<androidx.renderscript.Script.FieldID, java.lang.Object> r26) {
            /*
                r21 = this;
                r9 = r21
                r10 = r22
                r11 = r25
                r12 = 0
                r9.<init>(r12, r10)
                r9.mArgs = r11
                r0 = r24
                androidx.renderscript.Allocation r0 = androidx.renderscript.Allocation.createTyped(r10, r0)
                r9.mReturnValue = r0
                r14 = r26
                r9.mBindings = r14
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r9.mGlobalFuture = r0
                int r0 = r11.length
                int r1 = r26.size()
                int r1 = r1 + r0
                long[] r15 = new long[r1]
                long[] r8 = new long[r1]
                int[] r7 = new int[r1]
                long[] r6 = new long[r1]
                long[] r5 = new long[r1]
                r0 = 0
                r4 = r0
            L_0x0032:
                int r0 = r11.length
                if (r4 >= r0) goto L_0x005f
                r15[r4] = r12
                r3 = 0
                r16 = r11[r4]
                r0 = r21
                r1 = r22
                r2 = r4
                r17 = r4
                r4 = r16
                r19 = r5
                r5 = r8
                r18 = r6
                r6 = r7
                r20 = r7
                r7 = r18
                r16 = r8
                r8 = r19
                r0.retrieveValueAndDependenceInfo(r1, r2, r3, r4, r5, r6, r7, r8)
                int r4 = r17 + 1
                r8 = r16
                r6 = r18
                r5 = r19
                r7 = r20
                goto L_0x0032
            L_0x005f:
                r17 = r4
                r19 = r5
                r18 = r6
                r20 = r7
                r16 = r8
                java.util.Set r0 = r26.entrySet()
                java.util.Iterator r11 = r0.iterator()
            L_0x0071:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x00a2
                java.lang.Object r0 = r11.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r4 = r0.getValue()
                java.lang.Object r0 = r0.getKey()
                r3 = r0
                androidx.renderscript.Script$FieldID r3 = (androidx.renderscript.Script.FieldID) r3
                long r0 = r3.getID(r10)
                r15[r17] = r0
                r0 = r21
                r1 = r22
                r2 = r17
                r5 = r16
                r6 = r20
                r7 = r18
                r8 = r19
                r0.retrieveValueAndDependenceInfo(r1, r2, r3, r4, r5, r6, r7, r8)
                int r17 = r17 + 1
                goto L_0x0071
            L_0x00a2:
                r0 = r23
                long r11 = r0.getID(r10)
                androidx.renderscript.Allocation r0 = r9.mReturnValue
                long r13 = r0.getID(r10)
                r10 = r22
                r17 = r20
                long r0 = r10.nClosureCreate(r11, r13, r15, r16, r17, r18, r19)
                r9.setID(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.renderscript.ScriptGroup.Closure.<init>(androidx.renderscript.RenderScript, androidx.renderscript.Script$KernelID, androidx.renderscript.Type, java.lang.Object[], java.util.Map):void");
        }

        private void retrieveValueAndDependenceInfo(RenderScript renderScript, int i2, Script.FieldID fieldID, Object obj, long[] jArr, int[] iArr, long[] jArr2, long[] jArr3) {
            if (obj instanceof Future) {
                Future future = (Future) obj;
                Object value = future.getValue();
                jArr2[i2] = future.getClosure().getID(renderScript);
                Script.FieldID fieldID2 = future.getFieldID();
                jArr3[i2] = fieldID2 != null ? fieldID2.getID(renderScript) : 0;
                obj = value;
            } else {
                jArr2[i2] = 0;
                jArr3[i2] = 0;
            }
            if (obj instanceof Input) {
                Input input = (Input) obj;
                if (i2 < this.mArgs.length) {
                    input.addReference(this, i2);
                } else {
                    input.addReference(this, fieldID);
                }
                jArr[i2] = 0;
                iArr[i2] = 0;
                return;
            }
            ValueAndSize valueAndSize = new ValueAndSize(renderScript, obj);
            jArr[i2] = valueAndSize.value;
            iArr[i2] = valueAndSize.size;
        }

        public Future getGlobal(Script.FieldID fieldID) {
            Future future = this.mGlobalFuture.get(fieldID);
            if (future != null) {
                return future;
            }
            Object obj = this.mBindings.get(fieldID);
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            Future future2 = new Future(this, fieldID, obj);
            this.mGlobalFuture.put(fieldID, future2);
            return future2;
        }

        public Future getReturn() {
            if (this.mReturnFuture == null) {
                this.mReturnFuture = new Future(this, (Script.FieldID) null, this.mReturnValue);
            }
            return this.mReturnFuture;
        }

        public void setArg(int i2, Object obj) {
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            this.mArgs[i2] = obj;
            ValueAndSize valueAndSize = new ValueAndSize(this.mRS, obj);
            RenderScript renderScript = this.mRS;
            renderScript.nClosureSetArg(getID(renderScript), i2, valueAndSize.value, valueAndSize.size);
        }

        public void setGlobal(Script.FieldID fieldID, Object obj) {
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            this.mBindings.put(fieldID, obj);
            ValueAndSize valueAndSize = new ValueAndSize(this.mRS, obj);
            RenderScript renderScript = this.mRS;
            renderScript.nClosureSetGlobal(getID(renderScript), fieldID.getID(this.mRS), valueAndSize.value, valueAndSize.size);
        }
    }

    public static class ConnectLine {
        public Allocation mAllocation;
        public Type mAllocationType;
        public Script.KernelID mFrom;
        public Script.FieldID mToF;
        public Script.KernelID mToK;

        public ConnectLine(Type type, Script.KernelID kernelID, Script.FieldID fieldID) {
            this.mFrom = kernelID;
            this.mToF = fieldID;
            this.mAllocationType = type;
        }

        public ConnectLine(Type type, Script.KernelID kernelID, Script.KernelID kernelID2) {
            this.mFrom = kernelID;
            this.mToK = kernelID2;
            this.mAllocationType = type;
        }
    }

    public static final class Future {
        public Closure mClosure;
        public Script.FieldID mFieldID;
        public Object mValue;

        public Future(Closure closure, Script.FieldID fieldID, Object obj) {
            this.mClosure = closure;
            this.mFieldID = fieldID;
            this.mValue = obj;
        }

        public Closure getClosure() {
            return this.mClosure;
        }

        public Script.FieldID getFieldID() {
            return this.mFieldID;
        }

        public Object getValue() {
            return this.mValue;
        }
    }

    public static class IO {
        public Allocation mAllocation;
        public Script.KernelID mKID;

        public IO(Script.KernelID kernelID) {
            this.mKID = kernelID;
        }
    }

    public static final class Input {
        public List<Pair<Closure, Integer>> mArgIndex = new ArrayList();
        public List<Pair<Closure, Script.FieldID>> mFieldID = new ArrayList();
        public Object mValue;

        public void addReference(Closure closure, int i2) {
            this.mArgIndex.add(Pair.create(closure, Integer.valueOf(i2)));
        }

        public void addReference(Closure closure, Script.FieldID fieldID) {
            this.mFieldID.add(Pair.create(closure, fieldID));
        }

        public Object get() {
            return this.mValue;
        }

        public void set(Object obj) {
            this.mValue = obj;
            for (Pair next : this.mArgIndex) {
                ((Closure) next.first).setArg(((Integer) next.second).intValue(), obj);
            }
            for (Pair next2 : this.mFieldID) {
                ((Closure) next2.first).setGlobal((Script.FieldID) next2.second, obj);
            }
        }
    }

    public static class Node {
        public int dagNumber;
        public ArrayList<ConnectLine> mInputs = new ArrayList<>();
        public ArrayList<Script.KernelID> mKernels = new ArrayList<>();
        public Node mNext;
        public int mOrder;
        public ArrayList<ConnectLine> mOutputs = new ArrayList<>();
        public Script mScript;
        public boolean mSeen;

        public Node(Script script) {
            this.mScript = script;
        }
    }

    public ScriptGroup(long j2, RenderScript renderScript) {
        super(j2, renderScript);
    }

    public ScriptGroup(RenderScript renderScript, String str, List<Closure> list, List<Input> list2, Future[] futureArr) {
        super(0, renderScript);
        this.mName = str;
        this.mClosures = list;
        this.mInputs2 = list2;
        this.mOutputs2 = futureArr;
        int size = list.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = list.get(i2).getID(renderScript);
        }
        setID(renderScript.nScriptGroup2Create(str, renderScript.getApplicationContext().getCacheDir().toString(), jArr));
    }

    @Deprecated
    public void execute() {
        if (!this.mUseIncSupp) {
            RenderScript renderScript = this.mRS;
            renderScript.nScriptGroupExecute(getID(renderScript));
            return;
        }
        for (int i2 = 0; i2 < this.mNodes.size(); i2++) {
            Node node = this.mNodes.get(i2);
            for (int i3 = 0; i3 < node.mOutputs.size(); i3++) {
                ConnectLine connectLine = node.mOutputs.get(i3);
                if (connectLine.mAllocation == null) {
                    Allocation createTyped = Allocation.createTyped(this.mRS, connectLine.mAllocationType, Allocation.MipmapControl.MIPMAP_NONE, 1);
                    connectLine.mAllocation = createTyped;
                    for (int i4 = i3 + 1; i4 < node.mOutputs.size(); i4++) {
                        if (node.mOutputs.get(i4).mFrom == connectLine.mFrom) {
                            node.mOutputs.get(i4).mAllocation = createTyped;
                        }
                    }
                }
            }
        }
        Iterator<Node> it = this.mNodes.iterator();
        while (it.hasNext()) {
            Node next = it.next();
            Iterator<Script.KernelID> it2 = next.mKernels.iterator();
            while (it2.hasNext()) {
                Script.KernelID next2 = it2.next();
                Iterator<ConnectLine> it3 = next.mInputs.iterator();
                Allocation allocation = null;
                while (it3.hasNext()) {
                    ConnectLine next3 = it3.next();
                    if (next3.mToK == next2) {
                        allocation = next3.mAllocation;
                    }
                }
                for (IO io : this.mInputs) {
                    if (io.mKID == next2) {
                        allocation = io.mAllocation;
                    }
                }
                Iterator<ConnectLine> it4 = next.mOutputs.iterator();
                Allocation allocation2 = null;
                while (it4.hasNext()) {
                    ConnectLine next4 = it4.next();
                    if (next4.mFrom == next2) {
                        allocation2 = next4.mAllocation;
                    }
                }
                for (IO io2 : this.mOutputs) {
                    if (io2.mKID == next2) {
                        allocation2 = io2.mAllocation;
                    }
                }
                next2.mScript.forEach(next2.mSlot, allocation, allocation2, (FieldPacker) null);
            }
        }
    }

    public Object[] execute(Object... objArr) {
        String str;
        if (objArr.length < this.mInputs2.size()) {
            str = toString() + " receives " + objArr.length + " inputs, less than expected " + this.mInputs2.size();
        } else {
            if (objArr.length > this.mInputs2.size()) {
                Log.i(TAG, toString() + " receives " + objArr.length + " inputs, more than expected " + this.mInputs2.size());
            }
            int i2 = 0;
            int i3 = 0;
            while (i3 < this.mInputs2.size()) {
                Object obj = objArr[i3];
                if ((obj instanceof Future) || (obj instanceof Input)) {
                    str = toString() + ": input " + i3 + " is a future or unbound value";
                } else {
                    this.mInputs2.get(i3).set(obj);
                    i3++;
                }
            }
            RenderScript renderScript = this.mRS;
            renderScript.nScriptGroup2Execute(getID(renderScript));
            Future[] futureArr = this.mOutputs2;
            Object[] objArr2 = new Object[futureArr.length];
            int length = futureArr.length;
            int i4 = 0;
            while (i2 < length) {
                Object value = futureArr[i2].getValue();
                if (value instanceof Input) {
                    value = ((Input) value).get();
                }
                objArr2[i4] = value;
                i2++;
                i4++;
            }
            return objArr2;
        }
        Log.e(TAG, str);
        return null;
    }

    @Deprecated
    public void setInput(Script.KernelID kernelID, Allocation allocation) {
        int i2 = 0;
        while (true) {
            IO[] ioArr = this.mInputs;
            if (i2 >= ioArr.length) {
                throw new RSIllegalArgumentException("Script not found");
            } else if (ioArr[i2].mKID == kernelID) {
                ioArr[i2].mAllocation = allocation;
                if (!this.mUseIncSupp) {
                    RenderScript renderScript = this.mRS;
                    renderScript.nScriptGroupSetInput(getID(renderScript), kernelID.getID(this.mRS), this.mRS.safeID(allocation));
                    return;
                }
                return;
            } else {
                i2++;
            }
        }
    }

    @Deprecated
    public void setOutput(Script.KernelID kernelID, Allocation allocation) {
        int i2 = 0;
        while (true) {
            IO[] ioArr = this.mOutputs;
            if (i2 >= ioArr.length) {
                throw new RSIllegalArgumentException("Script not found");
            } else if (ioArr[i2].mKID == kernelID) {
                ioArr[i2].mAllocation = allocation;
                if (!this.mUseIncSupp) {
                    RenderScript renderScript = this.mRS;
                    renderScript.nScriptGroupSetOutput(getID(renderScript), kernelID.getID(this.mRS), this.mRS.safeID(allocation));
                    return;
                }
                return;
            } else {
                i2++;
            }
        }
    }
}
