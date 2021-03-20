package b.l.a.c.f.i;

import b.e.a.a.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class t4 implements Iterable<Byte>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final t4 f3759i = new r4(w5.f3798b);

    /* renamed from: j  reason: collision with root package name */
    public static final q4 f3760j;

    /* renamed from: h  reason: collision with root package name */
    public int f3761h = 0;

    static {
        q4 q4Var;
        if (i4.a()) {
            new s4
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r0v4 ? I:b.l.a.c.f.i.s4) =  call: b.l.a.c.f.i.s4.<init>():void type: CONSTRUCTOR in method: b.l.a.c.f.i.t4.<clinit>():void, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v4 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                b.l.a.c.f.i.r4 r0 = new b.l.a.c.f.i.r4
                byte[] r1 = b.l.a.c.f.i.w5.f3798b
                r0.<init>(r1)
                f3759i = r0
                boolean r0 = b.l.a.c.f.i.i4.a()
                if (r0 == 0) goto L_0x0015
                b.l.a.c.f.i.s4 r0 = new b.l.a.c.f.i.s4
                r0.<init>()
                goto L_0x001a
            L_0x0015:
                b.l.a.c.f.i.o4 r0 = new b.l.a.c.f.i.o4
                r0.<init>()
            L_0x001a:
                f3760j = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.i.t4.<clinit>():void");
        }

        public static t4 H(byte[] bArr, int i2, int i3) {
            I(i2, i2 + i3, bArr.length);
            return new r4(f3760j.a(bArr, i2, i3));
        }

        public static int I(int i2, int i3, int i4) {
            int i5 = i3 - i2;
            if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
                return i5;
            }
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i2);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i3 < i2) {
                throw new IndexOutOfBoundsException(a.R(66, "Beginning index larger than ending index: ", i2, ", ", i3));
            } else {
                throw new IndexOutOfBoundsException(a.R(37, "End index: ", i3, " >= ", i4));
            }
        }

        public abstract boolean D();

        public abstract int G(int i2, int i3, int i4);

        public abstract byte d(int i2);

        public abstract byte e(int i2);

        public abstract boolean equals(Object obj);

        public final int hashCode() {
            int i2 = this.f3761h;
            if (i2 == 0) {
                int l2 = l();
                i2 = G(l2, 0, l2);
                if (i2 == 0) {
                    i2 = 1;
                }
                this.f3761h = i2;
            }
            return i2;
        }

        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return new m4(this);
        }

        public abstract int l();

        public abstract t4 n(int i2, int i3);

        public final String toString() {
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.toHexString(System.identityHashCode(this));
            objArr[1] = Integer.valueOf(l());
            objArr[2] = l() <= 50 ? b.l.a.c.b.a.c1(this) : String.valueOf(b.l.a.c.b.a.c1(n(0, 47))).concat("...");
            return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
        }

        public abstract void v(l4 l4Var);

        public abstract String y(Charset charset);
    }
