package b.l.d.q.f.i.x;

import android.util.JsonReader;
import androidx.annotation.NonNull;
import b.l.d.q.f.i.n;
import b.l.d.q.f.i.q;
import b.l.d.q.f.i.v;
import b.l.d.q.f.i.w;
import b.l.d.s.j.d;
import b.l.d.s.j.e;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Objects;

public class h {
    public static final b.l.d.s.a a;

    public interface a<T> {
        T a(@NonNull JsonReader jsonReader);
    }

    static {
        e eVar = new e();
        ((b.l.d.q.f.i.a) b.l.d.q.f.i.a.a).a(eVar);
        eVar.d = true;
        a = new d(eVar);
    }

    @NonNull
    public static <T> w<T> a(@NonNull JsonReader jsonReader, @NonNull a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return new w<>(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: b.l.d.q.f.i.s$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: b.l.d.q.f.i.s$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: b.l.d.q.f.i.s$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: b.l.d.q.f.i.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: b.l.d.q.f.i.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v3, types: [b.l.d.q.f.i.v$d$d$a$b] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.d.q.f.i.v.d.C0082d b(@androidx.annotation.NonNull android.util.JsonReader r25) {
        /*
            r0 = r25
            r25.beginObject()
            r1 = 0
            r2 = r1
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x000b:
            boolean r3 = r25.hasNext()
            java.lang.String r4 = "Missing required properties:"
            java.lang.String r9 = ""
            if (r3 == 0) goto L_0x0343
            java.lang.String r3 = b.e.a.a.a.S(r25)
            r10 = -1
            int r11 = r3.hashCode()
            switch(r11) {
                case -1335157162: goto L_0x004e;
                case 96801: goto L_0x0043;
                case 107332: goto L_0x0038;
                case 3575610: goto L_0x002d;
                case 55126294: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0058
        L_0x0022:
            java.lang.String r11 = "timestamp"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x002b
            goto L_0x0058
        L_0x002b:
            r10 = 4
            goto L_0x0058
        L_0x002d:
            java.lang.String r11 = "type"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x0036
            goto L_0x0058
        L_0x0036:
            r10 = 3
            goto L_0x0058
        L_0x0038:
            java.lang.String r11 = "log"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x0041
            goto L_0x0058
        L_0x0041:
            r10 = 2
            goto L_0x0058
        L_0x0043:
            java.lang.String r11 = "app"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x004c
            goto L_0x0058
        L_0x004c:
            r10 = 1
            goto L_0x0058
        L_0x004e:
            java.lang.String r11 = "device"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r10 = 0
        L_0x0058:
            switch(r10) {
                case 0: goto L_0x0290;
                case 1: goto L_0x00bc;
                case 2: goto L_0x0076;
                case 3: goto L_0x006a;
                case 4: goto L_0x0060;
                default: goto L_0x005b;
            }
        L_0x005b:
            r25.skipValue()
            goto L_0x0340
        L_0x0060:
            long r1 = r25.nextLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x0340
        L_0x006a:
            java.lang.String r2 = r25.nextString()
            java.lang.String r3 = "Null type"
            java.util.Objects.requireNonNull(r2, r3)
            r5 = r2
            goto L_0x0340
        L_0x0076:
            r25.beginObject()
            r3 = r2
        L_0x007a:
            boolean r8 = r25.hasNext()
            if (r8 == 0) goto L_0x009d
            java.lang.String r8 = r25.nextName()
            r8.hashCode()
            java.lang.String r10 = "content"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0093
            r25.skipValue()
            goto L_0x007a
        L_0x0093:
            java.lang.String r3 = r25.nextString()
            java.lang.String r8 = "Null content"
            java.util.Objects.requireNonNull(r3, r8)
            goto L_0x007a
        L_0x009d:
            r25.endObject()
            if (r3 != 0) goto L_0x00a4
            java.lang.String r9 = " content"
        L_0x00a4:
            boolean r8 = r9.isEmpty()
            if (r8 == 0) goto L_0x00b2
            b.l.d.q.f.i.s r4 = new b.l.d.q.f.i.s
            r4.<init>(r3, r2)
            r8 = r4
            goto L_0x0340
        L_0x00b2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r4, r9)
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            r25.beginObject()
            r10 = r2
            r11 = r10
            r12 = r11
        L_0x00c2:
            boolean r3 = r25.hasNext()
            if (r3 == 0) goto L_0x0263
            java.lang.String r3 = b.e.a.a.a.S(r25)
            r6 = -1
            int r13 = r3.hashCode()
            switch(r13) {
                case -1332194002: goto L_0x00f6;
                case -1090974952: goto L_0x00eb;
                case 555169704: goto L_0x00e0;
                case 928737948: goto L_0x00d5;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            goto L_0x0100
        L_0x00d5:
            java.lang.String r13 = "uiOrientation"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x00de
            goto L_0x0100
        L_0x00de:
            r6 = 3
            goto L_0x0100
        L_0x00e0:
            java.lang.String r13 = "customAttributes"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x00e9
            goto L_0x0100
        L_0x00e9:
            r6 = 2
            goto L_0x0100
        L_0x00eb:
            java.lang.String r13 = "execution"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x00f4
            goto L_0x0100
        L_0x00f4:
            r6 = 1
            goto L_0x0100
        L_0x00f6:
            java.lang.String r13 = "background"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r6 = 0
        L_0x0100:
            switch(r6) {
                case 0: goto L_0x0258;
                case 1: goto L_0x0118;
                case 2: goto L_0x0110;
                case 3: goto L_0x0107;
                default: goto L_0x0103;
            }
        L_0x0103:
            r25.skipValue()
            goto L_0x00c2
        L_0x0107:
            int r2 = r25.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x00c2
        L_0x0110:
            b.l.d.q.f.i.x.c r3 = b.l.d.q.f.i.x.c.a
            b.l.d.q.f.i.w r3 = a(r0, r3)
            r11 = r3
            goto L_0x00c2
        L_0x0118:
            r25.beginObject()
            r3 = 0
            r6 = 0
            r10 = 0
            r13 = 0
            r15 = r3
            r16 = r6
            r17 = r10
            r18 = r13
        L_0x0126:
            boolean r3 = r25.hasNext()
            if (r3 == 0) goto L_0x021c
            java.lang.String r3 = b.e.a.a.a.S(r25)
            r6 = -1
            int r10 = r3.hashCode()
            switch(r10) {
                case -1337936983: goto L_0x015a;
                case -902467928: goto L_0x014f;
                case 937615455: goto L_0x0144;
                case 1481625679: goto L_0x0139;
                default: goto L_0x0138;
            }
        L_0x0138:
            goto L_0x0164
        L_0x0139:
            java.lang.String r10 = "exception"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x0142
            goto L_0x0164
        L_0x0142:
            r6 = 3
            goto L_0x0164
        L_0x0144:
            java.lang.String r10 = "binaries"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x014d
            goto L_0x0164
        L_0x014d:
            r6 = 2
            goto L_0x0164
        L_0x014f:
            java.lang.String r10 = "signal"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x0158
            goto L_0x0164
        L_0x0158:
            r6 = 1
            goto L_0x0164
        L_0x015a:
            java.lang.String r10 = "threads"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x0163
            goto L_0x0164
        L_0x0163:
            r6 = 0
        L_0x0164:
            switch(r6) {
                case 0: goto L_0x0214;
                case 1: goto L_0x0177;
                case 2: goto L_0x0170;
                case 3: goto L_0x016b;
                default: goto L_0x0167;
            }
        L_0x0167:
            r25.skipValue()
            goto L_0x0126
        L_0x016b:
            b.l.d.q.f.i.v$d$d$a$b$b r16 = c(r25)
            goto L_0x0126
        L_0x0170:
            b.l.d.q.f.i.x.e r3 = b.l.d.q.f.i.x.e.a
            b.l.d.q.f.i.w r18 = a(r0, r3)
            goto L_0x0126
        L_0x0177:
            r25.beginObject()
            r3 = 0
            r6 = 0
            r10 = 0
            r20 = r6
            r21 = r10
        L_0x0181:
            boolean r6 = r25.hasNext()
            if (r6 == 0) goto L_0x01dc
            java.lang.String r6 = b.e.a.a.a.S(r25)
            r10 = -1
            int r13 = r6.hashCode()
            switch(r13) {
                case -1147692044: goto L_0x01aa;
                case 3059181: goto L_0x019f;
                case 3373707: goto L_0x0194;
                default: goto L_0x0193;
            }
        L_0x0193:
            goto L_0x01b4
        L_0x0194:
            java.lang.String r13 = "name"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x019d
            goto L_0x01b4
        L_0x019d:
            r10 = 2
            goto L_0x01b4
        L_0x019f:
            java.lang.String r13 = "code"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x01a8
            goto L_0x01b4
        L_0x01a8:
            r10 = 1
            goto L_0x01b4
        L_0x01aa:
            java.lang.String r13 = "address"
            boolean r6 = r6.equals(r13)
            if (r6 != 0) goto L_0x01b3
            goto L_0x01b4
        L_0x01b3:
            r10 = 0
        L_0x01b4:
            switch(r10) {
                case 0: goto L_0x01d3;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01bb;
                default: goto L_0x01b7;
            }
        L_0x01b7:
            r25.skipValue()
            goto L_0x0181
        L_0x01bb:
            java.lang.String r6 = r25.nextString()
            java.lang.String r10 = "Null name"
            java.util.Objects.requireNonNull(r6, r10)
            r20 = r6
            goto L_0x0181
        L_0x01c7:
            java.lang.String r6 = r25.nextString()
            java.lang.String r10 = "Null code"
            java.util.Objects.requireNonNull(r6, r10)
            r21 = r6
            goto L_0x0181
        L_0x01d3:
            long r13 = r25.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            goto L_0x0181
        L_0x01dc:
            r25.endObject()
            if (r20 != 0) goto L_0x01e4
            java.lang.String r6 = " name"
            goto L_0x01e5
        L_0x01e4:
            r6 = r9
        L_0x01e5:
            if (r21 != 0) goto L_0x01ed
            java.lang.String r10 = " code"
            java.lang.String r6 = b.e.a.a.a.m(r6, r10)
        L_0x01ed:
            if (r3 != 0) goto L_0x01f5
            java.lang.String r10 = " address"
            java.lang.String r6 = b.e.a.a.a.m(r6, r10)
        L_0x01f5:
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x020a
            b.l.d.q.f.i.o r17 = new b.l.d.q.f.i.o
            long r22 = r3.longValue()
            r24 = 0
            r19 = r17
            r19.<init>(r20, r21, r22, r24)
            goto L_0x0126
        L_0x020a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r4, r6)
            r0.<init>(r1)
            throw r0
        L_0x0214:
            b.l.d.q.f.i.x.d r3 = b.l.d.q.f.i.x.d.a
            b.l.d.q.f.i.w r15 = a(r0, r3)
            goto L_0x0126
        L_0x021c:
            r25.endObject()
            if (r15 != 0) goto L_0x0224
            java.lang.String r3 = " threads"
            goto L_0x0225
        L_0x0224:
            r3 = r9
        L_0x0225:
            if (r16 != 0) goto L_0x022d
            java.lang.String r6 = " exception"
            java.lang.String r3 = b.e.a.a.a.m(r3, r6)
        L_0x022d:
            if (r17 != 0) goto L_0x0235
            java.lang.String r6 = " signal"
            java.lang.String r3 = b.e.a.a.a.m(r3, r6)
        L_0x0235:
            if (r18 != 0) goto L_0x023d
            java.lang.String r6 = " binaries"
            java.lang.String r3 = b.e.a.a.a.m(r3, r6)
        L_0x023d:
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x024e
            b.l.d.q.f.i.l r3 = new b.l.d.q.f.i.l
            r19 = 0
            r14 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            r10 = r3
            goto L_0x00c2
        L_0x024e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r4, r3)
            r0.<init>(r1)
            throw r0
        L_0x0258:
            boolean r3 = r25.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r12 = r3
            goto L_0x00c2
        L_0x0263:
            r25.endObject()
            if (r10 != 0) goto L_0x026a
            java.lang.String r9 = " execution"
        L_0x026a:
            if (r2 != 0) goto L_0x0272
            java.lang.String r3 = " uiOrientation"
            java.lang.String r9 = b.e.a.a.a.m(r9, r3)
        L_0x0272:
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x0286
            b.l.d.q.f.i.k r3 = new b.l.d.q.f.i.k
            int r13 = r2.intValue()
            r14 = 0
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            r6 = r3
            goto L_0x0340
        L_0x0286:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r4, r9)
            r0.<init>(r1)
            throw r0
        L_0x0290:
            b.l.d.q.f.i.r$b r2 = new b.l.d.q.f.i.r$b
            r2.<init>()
            r25.beginObject()
        L_0x0298:
            boolean r3 = r25.hasNext()
            if (r3 == 0) goto L_0x0338
            java.lang.String r3 = b.e.a.a.a.S(r25)
            r4 = -1
            int r7 = r3.hashCode()
            switch(r7) {
                case -1708606089: goto L_0x02e2;
                case -1455558134: goto L_0x02d7;
                case -1439500848: goto L_0x02cc;
                case 279795450: goto L_0x02c1;
                case 976541947: goto L_0x02b6;
                case 1516795582: goto L_0x02ab;
                default: goto L_0x02aa;
            }
        L_0x02aa:
            goto L_0x02ec
        L_0x02ab:
            java.lang.String r7 = "proximityOn"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x02b4
            goto L_0x02ec
        L_0x02b4:
            r4 = 5
            goto L_0x02ec
        L_0x02b6:
            java.lang.String r7 = "ramUsed"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x02bf
            goto L_0x02ec
        L_0x02bf:
            r4 = 4
            goto L_0x02ec
        L_0x02c1:
            java.lang.String r7 = "diskUsed"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x02ca
            goto L_0x02ec
        L_0x02ca:
            r4 = 3
            goto L_0x02ec
        L_0x02cc:
            java.lang.String r7 = "orientation"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x02d5
            goto L_0x02ec
        L_0x02d5:
            r4 = 2
            goto L_0x02ec
        L_0x02d7:
            java.lang.String r7 = "batteryVelocity"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x02e0
            goto L_0x02ec
        L_0x02e0:
            r4 = 1
            goto L_0x02ec
        L_0x02e2:
            java.lang.String r7 = "batteryLevel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x02eb
            goto L_0x02ec
        L_0x02eb:
            r4 = 0
        L_0x02ec:
            switch(r4) {
                case 0: goto L_0x032c;
                case 1: goto L_0x0320;
                case 2: goto L_0x0314;
                case 3: goto L_0x0309;
                case 4: goto L_0x02fe;
                case 5: goto L_0x02f3;
                default: goto L_0x02ef;
            }
        L_0x02ef:
            r25.skipValue()
            goto L_0x0298
        L_0x02f3:
            boolean r3 = r25.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.c = r3
            goto L_0x0298
        L_0x02fe:
            long r3 = r25.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f5253e = r3
            goto L_0x0298
        L_0x0309:
            long r3 = r25.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.f = r3
            goto L_0x0298
        L_0x0314:
            int r3 = r25.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.d = r3
            goto L_0x0298
        L_0x0320:
            int r3 = r25.nextInt()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f5252b = r3
            goto L_0x0298
        L_0x032c:
            double r3 = r25.nextDouble()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r2.a = r3
            goto L_0x0298
        L_0x0338:
            r25.endObject()
            b.l.d.q.f.i.v$d$d$b r2 = r2.a()
            r7 = r2
        L_0x0340:
            r2 = 0
            goto L_0x000b
        L_0x0343:
            r25.endObject()
            if (r1 != 0) goto L_0x034a
            java.lang.String r9 = " timestamp"
        L_0x034a:
            if (r5 != 0) goto L_0x0352
            java.lang.String r0 = " type"
            java.lang.String r9 = b.e.a.a.a.m(r9, r0)
        L_0x0352:
            if (r6 != 0) goto L_0x035a
            java.lang.String r0 = " app"
            java.lang.String r9 = b.e.a.a.a.m(r9, r0)
        L_0x035a:
            if (r7 != 0) goto L_0x0362
            java.lang.String r0 = " device"
            java.lang.String r9 = b.e.a.a.a.m(r9, r0)
        L_0x0362:
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0374
            b.l.d.q.f.i.j r0 = new b.l.d.q.f.i.j
            long r3 = r1.longValue()
            r9 = 0
            r2 = r0
            r2.<init>(r3, r5, r6, r7, r8, r9)
            return r0
        L_0x0374:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r4, r9)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.i.x.h.b(android.util.JsonReader):b.l.d.q.f.i.v$d$d");
    }

    @NonNull
    public static v.d.C0082d.a.b.C0085b c(@NonNull JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        String str = null;
        String str2 = null;
        w wVar = null;
        v.d.C0082d.a.b.C0085b bVar = null;
        while (jsonReader.hasNext()) {
            String S = b.e.a.a.a.S(jsonReader);
            char c = 65535;
            switch (S.hashCode()) {
                case -1266514778:
                    if (S.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (S.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (S.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (S.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (S.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    wVar = a(jsonReader, f.a);
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null type");
                    break;
                case 3:
                    bVar = c(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = str == null ? " type" : "";
        if (wVar == null) {
            str3 = b.e.a.a.a.m(str3, " frames");
        }
        if (num == null) {
            str3 = b.e.a.a.a.m(str3, " overflowCount");
        }
        if (str3.isEmpty()) {
            return new n(str, str2, wVar, bVar, num.intValue(), (n.a) null);
        }
        throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str3));
    }

    @NonNull
    public static v.d.C0082d.a.b.C0086d.C0087a d(@NonNull JsonReader jsonReader) {
        q.b bVar = new q.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    bVar.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null symbol");
                    bVar.f5248b = nextString;
                    break;
                case 2:
                    bVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    bVar.c = jsonReader.nextString();
                    break;
                case 4:
                    bVar.f5249e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d5, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f2, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021a, code lost:
        r8 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x021b, code lost:
        if (r8 == 0) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x021e, code lost:
        if (r8 == 1) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0221, code lost:
        if (r8 == 2) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0224, code lost:
        if (r8 == 3) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0227, code lost:
        if (r8 == 4) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x022a, code lost:
        if (r8 == 5) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x022c, code lost:
        r31.skipValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0230, code lost:
        r25 = r31.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0237, code lost:
        r27 = r31.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x023e, code lost:
        r3 = r31.nextString();
        java.util.Objects.requireNonNull(r3, "Null version");
        r24 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0248, code lost:
        r29 = r31.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x024f, code lost:
        r28 = r31.nextString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0256, code lost:
        r3 = r31.nextString();
        java.util.Objects.requireNonNull(r3, "Null identifier");
        r23 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x025f, code lost:
        r3 = r18;
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.d.q.f.i.v e(@androidx.annotation.NonNull android.util.JsonReader r31) {
        /*
            r0 = r31
            java.nio.charset.Charset r1 = b.l.d.q.f.i.v.a
            b.l.d.q.f.i.b$b r1 = new b.l.d.q.f.i.b$b
            r1.<init>()
            r31.beginObject()
        L_0x000c:
            boolean r2 = r31.hasNext()
            if (r2 == 0) goto L_0x054c
            java.lang.String r2 = r31.nextName()
            r2.hashCode()
            int r3 = r2.hashCode()
            java.lang.String r4 = "displayVersion"
            java.lang.String r5 = "platform"
            java.lang.String r6 = "installationUuid"
            java.lang.String r7 = "buildVersion"
            r8 = 0
            switch(r3) {
                case -2118372775: goto L_0x006f;
                case -1962630338: goto L_0x0064;
                case -911706486: goto L_0x005b;
                case 344431858: goto L_0x0050;
                case 719853845: goto L_0x0047;
                case 1874684019: goto L_0x003e;
                case 1975623094: goto L_0x0035;
                case 1984987798: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x007a
        L_0x002a:
            java.lang.String r3 = "session"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0033
            goto L_0x007a
        L_0x0033:
            r2 = 7
            goto L_0x007b
        L_0x0035:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x003c
            goto L_0x007a
        L_0x003c:
            r2 = 6
            goto L_0x007b
        L_0x003e:
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0045
            goto L_0x007a
        L_0x0045:
            r2 = 5
            goto L_0x007b
        L_0x0047:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x004e
            goto L_0x007a
        L_0x004e:
            r2 = 4
            goto L_0x007b
        L_0x0050:
            java.lang.String r3 = "gmpAppId"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0059
            goto L_0x007a
        L_0x0059:
            r2 = 3
            goto L_0x007b
        L_0x005b:
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0062
            goto L_0x007a
        L_0x0062:
            r2 = 2
            goto L_0x007b
        L_0x0064:
            java.lang.String r3 = "sdkVersion"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x006d
            goto L_0x007a
        L_0x006d:
            r2 = 1
            goto L_0x007b
        L_0x006f:
            java.lang.String r3 = "ndkPayload"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r8
            goto L_0x007b
        L_0x007a:
            r2 = -1
        L_0x007b:
            java.lang.String r3 = ""
            java.lang.String r9 = "Missing required properties:"
            java.lang.String r10 = "Null buildVersion"
            switch(r2) {
                case 0: goto L_0x04f4;
                case 1: goto L_0x04e7;
                case 2: goto L_0x04dc;
                case 3: goto L_0x04cf;
                case 4: goto L_0x04c2;
                case 5: goto L_0x04b6;
                case 6: goto L_0x04a9;
                case 7: goto L_0x0088;
                default: goto L_0x0084;
            }
        L_0x0084:
            r31.skipValue()
            goto L_0x000c
        L_0x0088:
            b.l.d.q.f.i.f$b r2 = new b.l.d.q.f.i.f$b
            r2.<init>()
            r2.b(r8)
            r31.beginObject()
        L_0x0093:
            boolean r8 = r31.hasNext()
            if (r8 == 0) goto L_0x049e
            java.lang.String r8 = r31.nextName()
            r8.hashCode()
            int r11 = r8.hashCode()
            java.lang.String r13 = "identifier"
            switch(r11) {
                case -2128794476: goto L_0x0120;
                case -1618432855: goto L_0x0117;
                case -1606742899: goto L_0x010c;
                case -1335157162: goto L_0x0101;
                case -1291329255: goto L_0x00f6;
                case 3556: goto L_0x00eb;
                case 96801: goto L_0x00e0;
                case 3599307: goto L_0x00d5;
                case 286956243: goto L_0x00c7;
                case 1025385094: goto L_0x00b9;
                case 2047016109: goto L_0x00ab;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x012b
        L_0x00ab:
            java.lang.String r11 = "generatorType"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00b5
            goto L_0x012b
        L_0x00b5:
            r8 = 10
            goto L_0x012c
        L_0x00b9:
            java.lang.String r11 = "crashed"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00c3
            goto L_0x012b
        L_0x00c3:
            r8 = 9
            goto L_0x012c
        L_0x00c7:
            java.lang.String r11 = "generator"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00d1
            goto L_0x012b
        L_0x00d1:
            r8 = 8
            goto L_0x012c
        L_0x00d5:
            java.lang.String r11 = "user"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00de
            goto L_0x012b
        L_0x00de:
            r8 = 7
            goto L_0x012c
        L_0x00e0:
            java.lang.String r11 = "app"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00e9
            goto L_0x012b
        L_0x00e9:
            r8 = 6
            goto L_0x012c
        L_0x00eb:
            java.lang.String r11 = "os"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00f4
            goto L_0x012b
        L_0x00f4:
            r8 = 5
            goto L_0x012c
        L_0x00f6:
            java.lang.String r11 = "events"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x00ff
            goto L_0x012b
        L_0x00ff:
            r8 = 4
            goto L_0x012c
        L_0x0101:
            java.lang.String r11 = "device"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x010a
            goto L_0x012b
        L_0x010a:
            r8 = 3
            goto L_0x012c
        L_0x010c:
            java.lang.String r11 = "endedAt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0115
            goto L_0x012b
        L_0x0115:
            r8 = 2
            goto L_0x012c
        L_0x0117:
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L_0x011e
            goto L_0x012b
        L_0x011e:
            r8 = 1
            goto L_0x012c
        L_0x0120:
            java.lang.String r11 = "startedAt"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r8 = 0
            goto L_0x012c
        L_0x012b:
            r8 = -1
        L_0x012c:
            java.lang.String r11 = "Null version"
            java.lang.String r14 = " version"
            java.lang.String r15 = "Null identifier"
            java.lang.String r16 = " identifier"
            java.lang.String r12 = "version"
            switch(r8) {
                case 0: goto L_0x048e;
                case 1: goto L_0x0479;
                case 2: goto L_0x046c;
                case 3: goto L_0x0363;
                case 4: goto L_0x0357;
                case 5: goto L_0x0294;
                case 6: goto L_0x01a7;
                case 7: goto L_0x015f;
                case 8: goto L_0x0153;
                case 9: goto L_0x014b;
                case 10: goto L_0x0140;
                default: goto L_0x0139;
            }
        L_0x0139:
            r18 = r3
            r31.skipValue()
            goto L_0x049a
        L_0x0140:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2.f5222k = r8
            goto L_0x0199
        L_0x014b:
            boolean r8 = r31.nextBoolean()
            r2.b(r8)
            goto L_0x0199
        L_0x0153:
            java.lang.String r8 = r31.nextString()
            java.lang.String r11 = "Null generator"
            java.util.Objects.requireNonNull(r8, r11)
            r2.a = r8
            goto L_0x0199
        L_0x015f:
            r31.beginObject()
            r8 = 0
        L_0x0163:
            boolean r11 = r31.hasNext()
            if (r11 == 0) goto L_0x0182
            java.lang.String r11 = r31.nextName()
            r11.hashCode()
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x017a
            r31.skipValue()
            goto L_0x0163
        L_0x017a:
            java.lang.String r8 = r31.nextString()
            java.util.Objects.requireNonNull(r8, r15)
            goto L_0x0163
        L_0x0182:
            r31.endObject()
            if (r8 != 0) goto L_0x018a
            r11 = r16
            goto L_0x018b
        L_0x018a:
            r11 = r3
        L_0x018b:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x019d
            b.l.d.q.f.i.u r11 = new b.l.d.q.f.i.u
            r12 = 0
            r11.<init>(r8, r12)
            r2.f5218g = r11
        L_0x0199:
            r18 = r3
            goto L_0x049a
        L_0x019d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r9, r11)
            r0.<init>(r1)
            throw r0
        L_0x01a7:
            r31.beginObject()
            r8 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = r8
            r24 = r17
            r25 = r18
            r27 = r19
            r28 = r20
            r29 = r21
        L_0x01c1:
            boolean r8 = r31.hasNext()
            if (r8 == 0) goto L_0x0263
            java.lang.String r8 = r31.nextName()
            r8.hashCode()
            int r17 = r8.hashCode()
            switch(r17) {
                case -1618432855: goto L_0x020f;
                case -519438642: goto L_0x0202;
                case 213652010: goto L_0x01f5;
                case 351608024: goto L_0x01ea;
                case 719853845: goto L_0x01e1;
                case 1975623094: goto L_0x01d8;
                default: goto L_0x01d5;
            }
        L_0x01d5:
            r18 = r3
            goto L_0x021a
        L_0x01d8:
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x01df
            goto L_0x01d5
        L_0x01df:
            r8 = 5
            goto L_0x01f2
        L_0x01e1:
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x01e8
            goto L_0x01d5
        L_0x01e8:
            r8 = 4
            goto L_0x01f2
        L_0x01ea:
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x01f1
            goto L_0x01d5
        L_0x01f1:
            r8 = 3
        L_0x01f2:
            r18 = r3
            goto L_0x021b
        L_0x01f5:
            r18 = r3
            java.lang.String r3 = "developmentPlatformVersion"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0200
            goto L_0x021a
        L_0x0200:
            r8 = 2
            goto L_0x021b
        L_0x0202:
            r18 = r3
            java.lang.String r3 = "developmentPlatform"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x020d
            goto L_0x021a
        L_0x020d:
            r8 = 1
            goto L_0x021b
        L_0x020f:
            r18 = r3
            boolean r3 = r8.equals(r13)
            if (r3 != 0) goto L_0x0218
            goto L_0x021a
        L_0x0218:
            r8 = 0
            goto L_0x021b
        L_0x021a:
            r8 = -1
        L_0x021b:
            if (r8 == 0) goto L_0x0256
            r3 = 1
            if (r8 == r3) goto L_0x024f
            r3 = 2
            if (r8 == r3) goto L_0x0248
            r3 = 3
            if (r8 == r3) goto L_0x023e
            r3 = 4
            if (r8 == r3) goto L_0x0237
            r3 = 5
            if (r8 == r3) goto L_0x0230
            r31.skipValue()
            goto L_0x025f
        L_0x0230:
            java.lang.String r3 = r31.nextString()
            r25 = r3
            goto L_0x025f
        L_0x0237:
            java.lang.String r3 = r31.nextString()
            r27 = r3
            goto L_0x025f
        L_0x023e:
            java.lang.String r3 = r31.nextString()
            java.util.Objects.requireNonNull(r3, r11)
            r24 = r3
            goto L_0x025f
        L_0x0248:
            java.lang.String r3 = r31.nextString()
            r29 = r3
            goto L_0x025f
        L_0x024f:
            java.lang.String r3 = r31.nextString()
            r28 = r3
            goto L_0x025f
        L_0x0256:
            java.lang.String r3 = r31.nextString()
            java.util.Objects.requireNonNull(r3, r15)
            r23 = r3
        L_0x025f:
            r3 = r18
            goto L_0x01c1
        L_0x0263:
            r18 = r3
            r31.endObject()
            if (r23 != 0) goto L_0x026d
            r3 = r16
            goto L_0x026f
        L_0x026d:
            r3 = r18
        L_0x026f:
            if (r24 != 0) goto L_0x0275
            java.lang.String r3 = b.e.a.a.a.m(r3, r14)
        L_0x0275:
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L_0x028a
            b.l.d.q.f.i.g r3 = new b.l.d.q.f.i.g
            r26 = 0
            r30 = 0
            r22 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r2.f = r3
            goto L_0x049a
        L_0x028a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r9, r3)
            r0.<init>(r1)
            throw r0
        L_0x0294:
            r18 = r3
            r31.beginObject()
            r3 = 0
            r8 = 0
            r13 = 0
            r15 = 0
            r21 = r13
            r22 = r15
        L_0x02a1:
            boolean r13 = r31.hasNext()
            if (r13 == 0) goto L_0x0312
            java.lang.String r13 = r31.nextName()
            r13.hashCode()
            int r15 = r13.hashCode()
            switch(r15) {
                case -911706486: goto L_0x02d3;
                case -293026577: goto L_0x02c8;
                case 351608024: goto L_0x02bf;
                case 1874684019: goto L_0x02b6;
                default: goto L_0x02b5;
            }
        L_0x02b5:
            goto L_0x02dc
        L_0x02b6:
            boolean r13 = r13.equals(r5)
            if (r13 != 0) goto L_0x02bd
            goto L_0x02dc
        L_0x02bd:
            r13 = 3
            goto L_0x02dd
        L_0x02bf:
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L_0x02c6
            goto L_0x02dc
        L_0x02c6:
            r13 = 2
            goto L_0x02dd
        L_0x02c8:
            java.lang.String r15 = "jailbroken"
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x02d1
            goto L_0x02dc
        L_0x02d1:
            r13 = 1
            goto L_0x02dd
        L_0x02d3:
            boolean r13 = r13.equals(r7)
            if (r13 != 0) goto L_0x02da
            goto L_0x02dc
        L_0x02da:
            r13 = 0
            goto L_0x02dd
        L_0x02dc:
            r13 = -1
        L_0x02dd:
            if (r13 == 0) goto L_0x0308
            r15 = 1
            if (r13 == r15) goto L_0x02ff
            r15 = 2
            if (r13 == r15) goto L_0x02f5
            r15 = 3
            if (r13 == r15) goto L_0x02ec
            r31.skipValue()
            goto L_0x02a1
        L_0x02ec:
            int r8 = r31.nextInt()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x02a1
        L_0x02f5:
            java.lang.String r13 = r31.nextString()
            java.util.Objects.requireNonNull(r13, r11)
            r21 = r13
            goto L_0x02a1
        L_0x02ff:
            boolean r3 = r31.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x02a1
        L_0x0308:
            java.lang.String r13 = r31.nextString()
            java.util.Objects.requireNonNull(r13, r10)
            r22 = r13
            goto L_0x02a1
        L_0x0312:
            r31.endObject()
            if (r8 != 0) goto L_0x031a
            java.lang.String r11 = " platform"
            goto L_0x031c
        L_0x031a:
            r11 = r18
        L_0x031c:
            if (r21 != 0) goto L_0x0322
            java.lang.String r11 = b.e.a.a.a.m(r11, r14)
        L_0x0322:
            if (r22 != 0) goto L_0x032a
            java.lang.String r12 = " buildVersion"
            java.lang.String r11 = b.e.a.a.a.m(r11, r12)
        L_0x032a:
            if (r3 != 0) goto L_0x0332
            java.lang.String r12 = " jailbroken"
            java.lang.String r11 = b.e.a.a.a.m(r11, r12)
        L_0x0332:
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x034d
            b.l.d.q.f.i.t r11 = new b.l.d.q.f.i.t
            int r20 = r8.intValue()
            boolean r23 = r3.booleanValue()
            r24 = 0
            r19 = r11
            r19.<init>(r20, r21, r22, r23, r24)
            r2.f5219h = r11
            goto L_0x049a
        L_0x034d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r9, r11)
            r0.<init>(r1)
            throw r0
        L_0x0357:
            r18 = r3
            b.l.d.q.f.i.x.a r3 = b.l.d.q.f.i.x.a.a
            b.l.d.q.f.i.w r3 = a(r0, r3)
            r2.f5221j = r3
            goto L_0x049a
        L_0x0363:
            r18 = r3
            r3 = 3
            b.l.d.q.f.i.i$b r8 = new b.l.d.q.f.i.i$b
            r8.<init>()
            r31.beginObject()
        L_0x036e:
            boolean r11 = r31.hasNext()
            if (r11 == 0) goto L_0x0462
            java.lang.String r11 = r31.nextName()
            r11.hashCode()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1981332476: goto L_0x03df;
                case -1969347631: goto L_0x03d4;
                case 112670: goto L_0x03c9;
                case 3002454: goto L_0x03be;
                case 81784169: goto L_0x03b3;
                case 94848180: goto L_0x03a8;
                case 104069929: goto L_0x039d;
                case 109757585: goto L_0x0392;
                case 2078953423: goto L_0x0384;
                default: goto L_0x0382;
            }
        L_0x0382:
            goto L_0x03ea
        L_0x0384:
            java.lang.String r12 = "modelClass"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x038e
            goto L_0x03ea
        L_0x038e:
            r11 = 8
            goto L_0x03eb
        L_0x0392:
            java.lang.String r12 = "state"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x039b
            goto L_0x03ea
        L_0x039b:
            r11 = 7
            goto L_0x03eb
        L_0x039d:
            java.lang.String r12 = "model"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03a6
            goto L_0x03ea
        L_0x03a6:
            r11 = 6
            goto L_0x03eb
        L_0x03a8:
            java.lang.String r12 = "cores"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03b1
            goto L_0x03ea
        L_0x03b1:
            r11 = 5
            goto L_0x03eb
        L_0x03b3:
            java.lang.String r12 = "diskSpace"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03bc
            goto L_0x03ea
        L_0x03bc:
            r11 = 4
            goto L_0x03eb
        L_0x03be:
            java.lang.String r12 = "arch"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03c7
            goto L_0x03ea
        L_0x03c7:
            r11 = r3
            goto L_0x03eb
        L_0x03c9:
            java.lang.String r12 = "ram"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03d2
            goto L_0x03ea
        L_0x03d2:
            r11 = 2
            goto L_0x03eb
        L_0x03d4:
            java.lang.String r12 = "manufacturer"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03dd
            goto L_0x03ea
        L_0x03dd:
            r11 = 1
            goto L_0x03eb
        L_0x03df:
            java.lang.String r12 = "simulator"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x03e8
            goto L_0x03ea
        L_0x03e8:
            r11 = 0
            goto L_0x03eb
        L_0x03ea:
            r11 = -1
        L_0x03eb:
            switch(r11) {
                case 0: goto L_0x0456;
                case 1: goto L_0x0449;
                case 2: goto L_0x043d;
                case 3: goto L_0x0431;
                case 4: goto L_0x0425;
                case 5: goto L_0x0419;
                case 6: goto L_0x040c;
                case 7: goto L_0x0400;
                case 8: goto L_0x03f3;
                default: goto L_0x03ee;
            }
        L_0x03ee:
            r31.skipValue()
            goto L_0x036e
        L_0x03f3:
            java.lang.String r11 = r31.nextString()
            java.lang.String r12 = "Null modelClass"
            java.util.Objects.requireNonNull(r11, r12)
            r8.f5235i = r11
            goto L_0x036e
        L_0x0400:
            int r11 = r31.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.f5233g = r11
            goto L_0x036e
        L_0x040c:
            java.lang.String r11 = r31.nextString()
            java.lang.String r12 = "Null model"
            java.util.Objects.requireNonNull(r11, r12)
            r8.f5231b = r11
            goto L_0x036e
        L_0x0419:
            int r11 = r31.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.c = r11
            goto L_0x036e
        L_0x0425:
            long r11 = r31.nextLong()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r8.f5232e = r11
            goto L_0x036e
        L_0x0431:
            int r11 = r31.nextInt()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.a = r11
            goto L_0x036e
        L_0x043d:
            long r11 = r31.nextLong()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r8.d = r11
            goto L_0x036e
        L_0x0449:
            java.lang.String r11 = r31.nextString()
            java.lang.String r12 = "Null manufacturer"
            java.util.Objects.requireNonNull(r11, r12)
            r8.f5234h = r11
            goto L_0x036e
        L_0x0456:
            boolean r11 = r31.nextBoolean()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r8.f = r11
            goto L_0x036e
        L_0x0462:
            r31.endObject()
            b.l.d.q.f.i.v$d$c r3 = r8.a()
            r2.f5220i = r3
            goto L_0x049a
        L_0x046c:
            r18 = r3
            long r11 = r31.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r2.d = r3
            goto L_0x049a
        L_0x0479:
            r18 = r3
            java.lang.String r3 = r31.nextString()
            r8 = 2
            byte[] r3 = android.util.Base64.decode(r3, r8)
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r11 = b.l.d.q.f.i.v.a
            r8.<init>(r3, r11)
            r2.f5216b = r8
            goto L_0x049a
        L_0x048e:
            r18 = r3
            long r11 = r31.nextLong()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r2.c = r3
        L_0x049a:
            r3 = r18
            goto L_0x0093
        L_0x049e:
            r31.endObject()
            b.l.d.q.f.i.v$d r2 = r2.a()
            r1.f5204g = r2
            goto L_0x000c
        L_0x04a9:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null displayVersion"
            java.util.Objects.requireNonNull(r2, r3)
            r1.f = r2
            goto L_0x000c
        L_0x04b6:
            int r2 = r31.nextInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.c = r2
            goto L_0x000c
        L_0x04c2:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null installationUuid"
            java.util.Objects.requireNonNull(r2, r3)
            r1.d = r2
            goto L_0x000c
        L_0x04cf:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null gmpAppId"
            java.util.Objects.requireNonNull(r2, r3)
            r1.f5202b = r2
            goto L_0x000c
        L_0x04dc:
            java.lang.String r2 = r31.nextString()
            java.util.Objects.requireNonNull(r2, r10)
            r1.f5203e = r2
            goto L_0x000c
        L_0x04e7:
            java.lang.String r2 = r31.nextString()
            java.lang.String r3 = "Null sdkVersion"
            java.util.Objects.requireNonNull(r2, r3)
            r1.a = r2
            goto L_0x000c
        L_0x04f4:
            r18 = r3
            r31.beginObject()
            r2 = 0
            r3 = 0
        L_0x04fb:
            boolean r4 = r31.hasNext()
            if (r4 == 0) goto L_0x0528
            java.lang.String r4 = r31.nextName()
            r4.hashCode()
            java.lang.String r5 = "files"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0521
            java.lang.String r5 = "orgId"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x051c
            r31.skipValue()
            goto L_0x04fb
        L_0x051c:
            java.lang.String r2 = r31.nextString()
            goto L_0x04fb
        L_0x0521:
            b.l.d.q.f.i.x.b r3 = b.l.d.q.f.i.x.b.a
            b.l.d.q.f.i.w r3 = a(r0, r3)
            goto L_0x04fb
        L_0x0528:
            r31.endObject()
            if (r3 != 0) goto L_0x0530
            java.lang.String r4 = " files"
            goto L_0x0532
        L_0x0530:
            r4 = r18
        L_0x0532:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0542
            b.l.d.q.f.i.d r4 = new b.l.d.q.f.i.d
            r5 = 0
            r4.<init>(r3, r2, r5)
            r1.f5205h = r4
            goto L_0x000c
        L_0x0542:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = b.e.a.a.a.m(r9, r4)
            r0.<init>(r1)
            throw r0
        L_0x054c:
            r31.endObject()
            b.l.d.q.f.i.v r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.i.x.h.e(android.util.JsonReader):b.l.d.q.f.i.v");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0016 */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.l.d.q.f.i.v f(@androidx.annotation.NonNull java.lang.String r3) {
        /*
            r2 = this;
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x0017 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x0017 }
            r1.<init>(r3)     // Catch:{ IllegalStateException -> 0x0017 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0017 }
            b.l.d.q.f.i.v r3 = e(r0)     // Catch:{ all -> 0x0012 }
            r0.close()     // Catch:{ IllegalStateException -> 0x0017 }
            return r3
        L_0x0012:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x0016 }
        L_0x0016:
            throw r3     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0017:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.i.x.h.f(java.lang.String):b.l.d.q.f.i.v");
    }

    @NonNull
    public String g(@NonNull v vVar) {
        d dVar = (d) a;
        Objects.requireNonNull(dVar);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(vVar, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
