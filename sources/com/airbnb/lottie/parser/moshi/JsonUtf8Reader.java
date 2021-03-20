package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import b.e.a.a.a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import java.util.Objects;
import o.e;
import o.g;
import o.h;

public final class JsonUtf8Reader extends JsonReader {
    private static final h CLOSING_BLOCK_COMMENT = h.j("*/");
    private static final h DOUBLE_QUOTE_OR_SLASH = h.j("\"\\");
    private static final h LINEFEED_OR_CARRIAGE_RETURN = h.j("\n\r");
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_BUFFERED_NAME = 15;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 18;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 16;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 17;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private static final h SINGLE_QUOTE_OR_SLASH = h.j("'\\");
    private static final h UNQUOTED_STRING_TERMINALS = h.j("{}[]:, \n\t\r\f/\\;#=");
    private final e buffer;
    private int peeked = 0;
    private long peekedLong;
    private int peekedNumberLength;
    @Nullable
    private String peekedString;
    private final g source;

    public JsonUtf8Reader(g gVar) {
        Objects.requireNonNull(gVar, "source == null");
        this.source = gVar;
        this.buffer = gVar.a();
        pushScope(6);
    }

    private void checkLenient() {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int doPeek() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.scopes
            int r2 = r0.stackSize
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 0
            r6 = 8
            r8 = 34
            r9 = 93
            r10 = 3
            r11 = 7
            r12 = 59
            r13 = 44
            r14 = 4
            r15 = 2
            r7 = 1
            if (r3 != r7) goto L_0x0022
            int r2 = r2 - r7
            r1[r2] = r15
            goto L_0x009a
        L_0x0022:
            if (r3 != r15) goto L_0x003d
            int r1 = r0.nextNonWhitespace(r7)
            o.e r2 = r0.buffer
            r2.readByte()
            if (r1 == r13) goto L_0x009a
            if (r1 == r12) goto L_0x0094
            if (r1 != r9) goto L_0x0036
            r0.peeked = r14
            return r14
        L_0x0036:
            java.lang.String r1 = "Unterminated array"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r1 = r0.syntaxError(r1)
            throw r1
        L_0x003d:
            r15 = 5
            if (r3 == r10) goto L_0x0121
            if (r3 != r15) goto L_0x0044
            goto L_0x0121
        L_0x0044:
            if (r3 != r14) goto L_0x007e
            int r2 = r2 - r7
            r1[r2] = r15
            int r1 = r0.nextNonWhitespace(r7)
            o.e r2 = r0.buffer
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x009a
            r2 = 61
            if (r1 != r2) goto L_0x0077
            r16.checkLenient()
            o.g r1 = r0.source
            r14 = 1
            boolean r1 = r1.t(r14)
            if (r1 == 0) goto L_0x009a
            o.e r1 = r0.buffer
            byte r1 = r1.N(r4)
            r2 = 62
            if (r1 != r2) goto L_0x009a
            o.e r1 = r0.buffer
            r1.readByte()
            goto L_0x009a
        L_0x0077:
            java.lang.String r1 = "Expected ':'"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r1 = r0.syntaxError(r1)
            throw r1
        L_0x007e:
            r14 = 6
            if (r3 != r14) goto L_0x0085
            int r2 = r2 - r7
            r1[r2] = r11
            goto L_0x009a
        L_0x0085:
            if (r3 != r11) goto L_0x0098
            r1 = 0
            int r1 = r0.nextNonWhitespace(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r1 = 18
        L_0x0091:
            r0.peeked = r1
            return r1
        L_0x0094:
            r16.checkLenient()
            goto L_0x009a
        L_0x0098:
            if (r3 == r6) goto L_0x0119
        L_0x009a:
            int r1 = r0.nextNonWhitespace(r7)
            if (r1 == r8) goto L_0x0110
            r2 = 39
            if (r1 == r2) goto L_0x0105
            if (r1 == r13) goto L_0x00f2
            if (r1 == r12) goto L_0x00f2
            r2 = 91
            if (r1 == r2) goto L_0x00ea
            if (r1 == r9) goto L_0x00e1
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x00d9
            int r1 = r16.peekKeyword()
            if (r1 == 0) goto L_0x00b9
            return r1
        L_0x00b9:
            int r1 = r16.peekNumber()
            if (r1 == 0) goto L_0x00c0
            return r1
        L_0x00c0:
            o.e r1 = r0.buffer
            byte r1 = r1.N(r4)
            boolean r1 = r0.isLiteral(r1)
            if (r1 == 0) goto L_0x00d2
            r16.checkLenient()
            r1 = 10
            goto L_0x0091
        L_0x00d2:
            java.lang.String r1 = "Expected value"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r1 = r0.syntaxError(r1)
            throw r1
        L_0x00d9:
            o.e r1 = r0.buffer
            r1.readByte()
            r0.peeked = r7
            return r7
        L_0x00e1:
            if (r3 != r7) goto L_0x00f2
            o.e r1 = r0.buffer
            r1.readByte()
            r1 = 4
            goto L_0x0091
        L_0x00ea:
            o.e r1 = r0.buffer
            r1.readByte()
            r0.peeked = r10
            return r10
        L_0x00f2:
            if (r3 == r7) goto L_0x00ff
            r1 = 2
            if (r3 != r1) goto L_0x00f8
            goto L_0x00ff
        L_0x00f8:
            java.lang.String r1 = "Unexpected value"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r1 = r0.syntaxError(r1)
            throw r1
        L_0x00ff:
            r16.checkLenient()
            r0.peeked = r11
            return r11
        L_0x0105:
            r16.checkLenient()
            o.e r1 = r0.buffer
            r1.readByte()
            r0.peeked = r6
            return r6
        L_0x0110:
            o.e r1 = r0.buffer
            r1.readByte()
            r1 = 9
            goto L_0x0091
        L_0x0119:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0121:
            int r2 = r2 - r7
            r4 = 4
            r1[r2] = r4
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r15) goto L_0x0145
            int r2 = r0.nextNonWhitespace(r7)
            o.e r4 = r0.buffer
            r4.readByte()
            if (r2 == r13) goto L_0x0145
            if (r2 == r12) goto L_0x0142
            if (r2 != r1) goto L_0x013b
        L_0x0138:
            r1 = 2
            goto L_0x0091
        L_0x013b:
            java.lang.String r1 = "Unterminated object"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r1 = r0.syntaxError(r1)
            throw r1
        L_0x0142:
            r16.checkLenient()
        L_0x0145:
            int r2 = r0.nextNonWhitespace(r7)
            if (r2 == r8) goto L_0x017f
            r4 = 39
            if (r2 == r4) goto L_0x0173
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x0166
            r16.checkLenient()
            char r1 = (char) r2
            boolean r1 = r0.isLiteral(r1)
            if (r1 == 0) goto L_0x0161
            r1 = 14
            goto L_0x0091
        L_0x0161:
            com.airbnb.lottie.parser.moshi.JsonEncodingException r1 = r0.syntaxError(r4)
            throw r1
        L_0x0166:
            if (r3 == r15) goto L_0x016e
            o.e r1 = r0.buffer
            r1.readByte()
            goto L_0x0138
        L_0x016e:
            com.airbnb.lottie.parser.moshi.JsonEncodingException r1 = r0.syntaxError(r4)
            throw r1
        L_0x0173:
            o.e r1 = r0.buffer
            r1.readByte()
            r16.checkLenient()
            r1 = 12
            goto L_0x0091
        L_0x017f:
            o.e r1 = r0.buffer
            r1.readByte()
            r1 = 13
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonUtf8Reader.doPeek():int");
    }

    private int findName(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(options.strings[i2])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private int findString(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(options.strings[i2])) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
        }
        return -1;
    }

    private boolean isLiteral(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (!(i2 == 47 || i2 == 61)) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.buffer.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.source.t(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        checkLenient();
        r3 = r6.buffer.N(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.buffer.readByte();
        r6.buffer.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        skipToEndOfLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r6.buffer.readByte();
        r6.buffer.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (skipToEndOfBlockComment() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        throw syntaxError("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r1 != 35) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        checkLenient();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int nextNonWhitespace(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = r0
        L_0x0002:
            o.g r2 = r6.source
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.t(r4)
            if (r2 == 0) goto L_0x007f
            o.e r2 = r6.buffer
            long r4 = (long) r1
            byte r1 = r2.N(r4)
            r2 = 10
            if (r1 == r2) goto L_0x007d
            r2 = 32
            if (r1 == r2) goto L_0x007d
            r2 = 13
            if (r1 == r2) goto L_0x007d
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x007d
        L_0x0025:
            o.e r2 = r6.buffer
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            o.g r3 = r6.source
            r4 = 2
            boolean r3 = r3.t(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.checkLenient()
            o.e r3 = r6.buffer
            r4 = 1
            byte r3 = r3.N(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            o.e r1 = r6.buffer
            r1.readByte()
            o.e r1 = r6.buffer
            r1.readByte()
        L_0x0058:
            r6.skipToEndOfLine()
            goto L_0x0001
        L_0x005c:
            o.e r1 = r6.buffer
            r1.readByte()
            o.e r1 = r6.buffer
            r1.readByte()
            boolean r1 = r6.skipToEndOfBlockComment()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.JsonEncodingException r7 = r6.syntaxError(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007c
            r6.checkLenient()
            goto L_0x0058
        L_0x007c:
            return r1
        L_0x007d:
            r1 = r3
            goto L_0x0002
        L_0x007f:
            if (r7 != 0) goto L_0x0083
            r7 = -1
            return r7
        L_0x0083:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonUtf8Reader.nextNonWhitespace(boolean):int");
    }

    private String nextQuotedValue(h hVar) {
        StringBuilder sb = null;
        while (true) {
            long P = this.source.P(hVar);
            if (P == -1) {
                throw syntaxError("Unterminated string");
            } else if (this.buffer.N(P) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.buffer.n0(P));
                this.buffer.readByte();
                sb.append(readEscapeCharacter());
            } else {
                String n0 = this.buffer.n0(P);
                if (sb == null) {
                    this.buffer.readByte();
                    return n0;
                }
                sb.append(n0);
                this.buffer.readByte();
                return sb.toString();
            }
        }
    }

    private String nextUnquotedValue() {
        long P = this.source.P(UNQUOTED_STRING_TERMINALS);
        return P != -1 ? this.buffer.n0(P) : this.buffer.m0();
    }

    private int peekKeyword() {
        String str;
        String str2;
        int i2;
        byte N = this.buffer.N(0);
        if (N == 116 || N == 84) {
            i2 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (N == 102 || N == 70) {
            i2 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (N != 110 && N != 78) {
            return 0;
        } else {
            i2 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i3 = 1;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (!this.source.t((long) i4)) {
                return 0;
            }
            byte N2 = this.buffer.N((long) i3);
            if (N2 != str2.charAt(i3) && N2 != str.charAt(i3)) {
                return 0;
            }
            i3 = i4;
        }
        if (this.source.t((long) (length + 1)) && isLiteral(this.buffer.N((long) length))) {
            return 0;
        }
        this.buffer.skip((long) length);
        this.peeked = i2;
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int peekNumber() {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r3 = 1
            r4 = 0
            r8 = r1
            r7 = r3
            r5 = r4
            r6 = r5
            r10 = r6
        L_0x000b:
            o.g r11 = r0.source
            int r12 = r5 + 1
            long r13 = (long) r12
            boolean r11 = r11.t(r13)
            r15 = 2
            if (r11 != 0) goto L_0x0019
            goto L_0x0084
        L_0x0019:
            o.e r11 = r0.buffer
            long r13 = (long) r5
            byte r11 = r11.N(r13)
            r13 = 43
            r14 = 5
            if (r11 == r13) goto L_0x00d1
            r13 = 69
            if (r11 == r13) goto L_0x00c8
            r13 = 101(0x65, float:1.42E-43)
            if (r11 == r13) goto L_0x00c8
            r13 = 45
            if (r11 == r13) goto L_0x00be
            r13 = 46
            if (r11 == r13) goto L_0x00b9
            r13 = 48
            if (r11 < r13) goto L_0x007e
            r13 = 57
            if (r11 <= r13) goto L_0x003e
            goto L_0x007e
        L_0x003e:
            if (r6 == r3) goto L_0x0077
            if (r6 != 0) goto L_0x0043
            goto L_0x0077
        L_0x0043:
            if (r6 != r15) goto L_0x0067
            int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x004a
            return r4
        L_0x004a:
            r13 = 10
            long r13 = r13 * r8
            int r11 = r11 + -48
            long r3 = (long) r11
            long r13 = r13 - r3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0063
            if (r3 != 0) goto L_0x0061
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r3 = 0
            goto L_0x0064
        L_0x0063:
            r3 = 1
        L_0x0064:
            r7 = r7 & r3
            r8 = r13
            goto L_0x007c
        L_0x0067:
            r3 = 3
            if (r6 != r3) goto L_0x006e
            r4 = 0
            r6 = 4
            goto L_0x00d5
        L_0x006e:
            if (r6 == r14) goto L_0x0073
            r3 = 6
            if (r6 != r3) goto L_0x007c
        L_0x0073:
            r4 = 0
            r6 = 7
            goto L_0x00d5
        L_0x0077:
            int r11 = r11 + -48
            int r3 = -r11
            long r8 = (long) r3
            r6 = r15
        L_0x007c:
            r4 = 0
            goto L_0x00d5
        L_0x007e:
            boolean r3 = r0.isLiteral(r11)
            if (r3 != 0) goto L_0x00b7
        L_0x0084:
            if (r6 != r15) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            r3 = -9223372036854775808
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0090
            if (r10 == 0) goto L_0x00a7
        L_0x0090:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0096
            if (r10 != 0) goto L_0x00a7
        L_0x0096:
            if (r10 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            long r8 = -r8
        L_0x009a:
            r0.peekedLong = r8
            o.e r1 = r0.buffer
            long r2 = (long) r5
            r1.skip(r2)
            r1 = 16
        L_0x00a4:
            r0.peeked = r1
            return r1
        L_0x00a7:
            if (r6 == r15) goto L_0x00b2
            r1 = 4
            if (r6 == r1) goto L_0x00b2
            r1 = 7
            if (r6 != r1) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r4 = 0
            return r4
        L_0x00b2:
            r0.peekedNumberLength = r5
            r1 = 17
            goto L_0x00a4
        L_0x00b7:
            r4 = 0
            return r4
        L_0x00b9:
            r3 = 3
            if (r6 != r15) goto L_0x00bd
            goto L_0x00d4
        L_0x00bd:
            return r4
        L_0x00be:
            r3 = 6
            if (r6 != 0) goto L_0x00c4
            r6 = 1
            r10 = 1
            goto L_0x00d5
        L_0x00c4:
            if (r6 != r14) goto L_0x00c7
            goto L_0x00d4
        L_0x00c7:
            return r4
        L_0x00c8:
            if (r6 == r15) goto L_0x00cf
            r3 = 4
            if (r6 != r3) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            return r4
        L_0x00cf:
            r6 = r14
            goto L_0x00d5
        L_0x00d1:
            r3 = 6
            if (r6 != r14) goto L_0x00d9
        L_0x00d4:
            r6 = r3
        L_0x00d5:
            r5 = r12
            r3 = 1
            goto L_0x000b
        L_0x00d9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonUtf8Reader.peekNumber():int");
    }

    private char readEscapeCharacter() {
        int i2;
        int i3;
        if (this.source.t(1)) {
            byte readByte = this.buffer.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.lenient) {
                    return (char) readByte;
                }
                StringBuilder y = a.y("Invalid escape sequence: \\");
                y.append((char) readByte);
                throw syntaxError(y.toString());
            } else if (this.source.t(4)) {
                char c = 0;
                for (int i4 = 0; i4 < 4; i4++) {
                    byte N = this.buffer.N((long) i4);
                    char c2 = (char) (c << 4);
                    if (N < 48 || N > 57) {
                        if (N >= 97 && N <= 102) {
                            i3 = N - 97;
                        } else if (N < 65 || N > 70) {
                            StringBuilder y2 = a.y("\\u");
                            y2.append(this.buffer.n0(4));
                            throw syntaxError(y2.toString());
                        } else {
                            i3 = N - 65;
                        }
                        i2 = i3 + 10;
                    } else {
                        i2 = N - 48;
                    }
                    c = (char) (i2 + c2);
                }
                this.buffer.skip(4);
                return c;
            } else {
                StringBuilder y3 = a.y("Unterminated escape sequence at path ");
                y3.append(getPath());
                throw new EOFException(y3.toString());
            }
        } else {
            throw syntaxError("Unterminated escape sequence");
        }
    }

    private void skipQuotedValue(h hVar) {
        while (true) {
            long P = this.source.P(hVar);
            if (P == -1) {
                throw syntaxError("Unterminated string");
            } else if (this.buffer.N(P) == 92) {
                this.buffer.skip(P + 1);
                readEscapeCharacter();
            } else {
                this.buffer.skip(P + 1);
                return;
            }
        }
    }

    private boolean skipToEndOfBlockComment() {
        long j2;
        g gVar = this.source;
        h hVar = CLOSING_BLOCK_COMMENT;
        long C = gVar.C(hVar);
        boolean z = C != -1;
        e eVar = this.buffer;
        if (z) {
            j2 = C + ((long) hVar.l());
        } else {
            j2 = eVar.f10453i;
        }
        eVar.skip(j2);
        return z;
    }

    private void skipToEndOfLine() {
        long P = this.source.P(LINEFEED_OR_CARRIAGE_RETURN);
        e eVar = this.buffer;
        eVar.skip(P != -1 ? P + 1 : eVar.f10453i);
    }

    private void skipUnquotedValue() {
        long P = this.source.P(UNQUOTED_STRING_TERMINALS);
        e eVar = this.buffer;
        if (P == -1) {
            P = eVar.f10453i;
        }
        eVar.skip(P);
    }

    public void beginArray() {
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return;
        }
        StringBuilder y = a.y("Expected BEGIN_ARRAY but was ");
        y.append(peek());
        y.append(" at path ");
        y.append(getPath());
        throw new JsonDataException(y.toString());
    }

    public void beginObject() {
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 == 1) {
            pushScope(3);
            this.peeked = 0;
            return;
        }
        StringBuilder y = a.y("Expected BEGIN_OBJECT but was ");
        y.append(peek());
        y.append(" at path ");
        y.append(getPath());
        throw new JsonDataException(y.toString());
    }

    public void close() {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        e eVar = this.buffer;
        eVar.skip(eVar.f10453i);
        this.source.close();
    }

    public void endArray() {
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 == 4) {
            int i3 = this.stackSize - 1;
            this.stackSize = i3;
            int[] iArr = this.pathIndices;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder y = a.y("Expected END_ARRAY but was ");
        y.append(peek());
        y.append(" at path ");
        y.append(getPath());
        throw new JsonDataException(y.toString());
    }

    public void endObject() {
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 == 2) {
            int i3 = this.stackSize - 1;
            this.stackSize = i3;
            this.pathNames[i3] = null;
            int[] iArr = this.pathIndices;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.peeked = 0;
            return;
        }
        StringBuilder y = a.y("Expected END_OBJECT but was ");
        y.append(peek());
        y.append(" at path ");
        y.append(getPath());
        throw new JsonDataException(y.toString());
    }

    public boolean hasNext() {
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    public boolean nextBoolean() {
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder y = a.y("Expected a boolean but was ");
            y.append(peek());
            y.append(" at path ");
            y.append(getPath());
            throw new JsonDataException(y.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double nextDouble() {
        /*
            r8 = this;
            int r0 = r8.peeked
            if (r0 != 0) goto L_0x0008
            int r0 = r8.doPeek()
        L_0x0008:
            r1 = 16
            r2 = 0
            if (r0 != r1) goto L_0x001f
            r8.peeked = r2
            int[] r0 = r8.pathIndices
            int r1 = r8.stackSize
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r8.peekedLong
            double r0 = (double) r0
            return r0
        L_0x001f:
            r1 = 17
            java.lang.String r3 = "Expected a double but was "
            r4 = 11
            java.lang.String r5 = " at path "
            if (r0 != r1) goto L_0x0033
            o.e r0 = r8.buffer
            int r1 = r8.peekedNumberLength
            long r6 = (long) r1
            java.lang.String r0 = r0.n0(r6)
            goto L_0x004d
        L_0x0033:
            r1 = 9
            if (r0 != r1) goto L_0x003a
            o.h r0 = DOUBLE_QUOTE_OR_SLASH
            goto L_0x0040
        L_0x003a:
            r1 = 8
            if (r0 != r1) goto L_0x0045
            o.h r0 = SINGLE_QUOTE_OR_SLASH
        L_0x0040:
            java.lang.String r0 = r8.nextQuotedValue(r0)
            goto L_0x004d
        L_0x0045:
            r1 = 10
            if (r0 != r1) goto L_0x0050
            java.lang.String r0 = r8.nextUnquotedValue()
        L_0x004d:
            r8.peekedString = r0
            goto L_0x0052
        L_0x0050:
            if (r0 != r4) goto L_0x00bb
        L_0x0052:
            r8.peeked = r4
            java.lang.String r0 = r8.peekedString     // Catch:{ NumberFormatException -> 0x009e }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x009e }
            boolean r3 = r8.lenient
            if (r3 != 0) goto L_0x008c
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L_0x006b
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L_0x006b
            goto L_0x008c
        L_0x006b:
            com.airbnb.lottie.parser.moshi.JsonEncodingException r2 = new com.airbnb.lottie.parser.moshi.JsonEncodingException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r8.getPath()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x008c:
            r3 = 0
            r8.peekedString = r3
            r8.peeked = r2
            int[] r2 = r8.pathIndices
            int r3 = r8.stackSize
            int r3 = r3 + -1
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r0
        L_0x009e:
            com.airbnb.lottie.parser.moshi.JsonDataException r0 = new com.airbnb.lottie.parser.moshi.JsonDataException
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r3)
            java.lang.String r2 = r8.peekedString
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            com.airbnb.lottie.parser.moshi.JsonDataException r0 = new com.airbnb.lottie.parser.moshi.JsonDataException
            java.lang.StringBuilder r1 = b.e.a.a.a.y(r3)
            com.airbnb.lottie.parser.moshi.JsonReader$Token r2 = r8.peek()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonUtf8Reader.nextDouble():double");
    }

    public int nextInt() {
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 == 16) {
            long j2 = this.peekedLong;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder y = a.y("Expected an int but was ");
            y.append(this.peekedLong);
            y.append(" at path ");
            y.append(getPath());
            throw new JsonDataException(y.toString());
        }
        if (i2 == 17) {
            this.peekedString = this.buffer.n0((long) this.peekedNumberLength);
        } else if (i2 == 9 || i2 == 8) {
            String nextQuotedValue = nextQuotedValue(i2 == 9 ? DOUBLE_QUOTE_OR_SLASH : SINGLE_QUOTE_OR_SLASH);
            this.peekedString = nextQuotedValue;
            try {
                int parseInt = Integer.parseInt(nextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i5 = this.stackSize - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i2 != 11) {
            StringBuilder y2 = a.y("Expected an int but was ");
            y2.append(peek());
            y2.append(" at path ");
            y2.append(getPath());
            throw new JsonDataException(y2.toString());
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            int i6 = (int) parseDouble;
            if (((double) i6) == parseDouble) {
                this.peekedString = null;
                this.peeked = 0;
                int[] iArr3 = this.pathIndices;
                int i7 = this.stackSize - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            StringBuilder y3 = a.y("Expected an int but was ");
            y3.append(this.peekedString);
            y3.append(" at path ");
            y3.append(getPath());
            throw new JsonDataException(y3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder y4 = a.y("Expected an int but was ");
            y4.append(this.peekedString);
            y4.append(" at path ");
            y4.append(getPath());
            throw new JsonDataException(y4.toString());
        }
    }

    public String nextName() {
        String str;
        h hVar;
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 == 14) {
            str = nextUnquotedValue();
        } else {
            if (i2 == 13) {
                hVar = DOUBLE_QUOTE_OR_SLASH;
            } else if (i2 == 12) {
                hVar = SINGLE_QUOTE_OR_SLASH;
            } else if (i2 == 15) {
                str = this.peekedString;
            } else {
                StringBuilder y = a.y("Expected a name but was ");
                y.append(peek());
                y.append(" at path ");
                y.append(getPath());
                throw new JsonDataException(y.toString());
            }
            str = nextQuotedValue(hVar);
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = str;
        return str;
    }

    public String nextString() {
        String str;
        h hVar;
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 == 10) {
            str = nextUnquotedValue();
        } else {
            if (i2 == 9) {
                hVar = DOUBLE_QUOTE_OR_SLASH;
            } else if (i2 == 8) {
                hVar = SINGLE_QUOTE_OR_SLASH;
            } else if (i2 == 11) {
                str = this.peekedString;
                this.peekedString = null;
            } else if (i2 == 16) {
                str = Long.toString(this.peekedLong);
            } else if (i2 == 17) {
                str = this.buffer.n0((long) this.peekedNumberLength);
            } else {
                StringBuilder y = a.y("Expected a string but was ");
                y.append(peek());
                y.append(" at path ");
                y.append(getPath());
                throw new JsonDataException(y.toString());
            }
            str = nextQuotedValue(hVar);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public JsonReader.Token peek() {
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        switch (i2) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public int selectName(JsonReader.Options options) {
        int i2 = this.peeked;
        if (i2 == 0) {
            i2 = doPeek();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return findName(this.peekedString, options);
        }
        int l0 = this.source.l0(options.doubleQuoteSuffix);
        if (l0 != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = options.strings[l0];
            return l0;
        }
        String str = this.pathNames[this.stackSize - 1];
        String nextName = nextName();
        int findName = findName(nextName, options);
        if (findName == -1) {
            this.peeked = 15;
            this.peekedString = nextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return findName;
    }

    public void skipName() {
        h hVar;
        if (!this.failOnUnknown) {
            int i2 = this.peeked;
            if (i2 == 0) {
                i2 = doPeek();
            }
            if (i2 == 14) {
                skipUnquotedValue();
            } else {
                if (i2 == 13) {
                    hVar = DOUBLE_QUOTE_OR_SLASH;
                } else if (i2 == 12) {
                    hVar = SINGLE_QUOTE_OR_SLASH;
                } else if (i2 != 15) {
                    StringBuilder y = a.y("Expected a name but was ");
                    y.append(peek());
                    y.append(" at path ");
                    y.append(getPath());
                    throw new JsonDataException(y.toString());
                }
                skipQuotedValue(hVar);
            }
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = "null";
            return;
        }
        StringBuilder y2 = a.y("Cannot skip unexpected ");
        y2.append(peek());
        y2.append(" at ");
        y2.append(getPath());
        throw new JsonDataException(y2.toString());
    }

    public void skipValue() {
        h hVar;
        if (!this.failOnUnknown) {
            int i2 = 0;
            do {
                int i3 = this.peeked;
                if (i3 == 0) {
                    i3 = doPeek();
                }
                if (i3 == 3) {
                    pushScope(1);
                } else if (i3 == 1) {
                    pushScope(3);
                } else {
                    if (i3 == 4) {
                        i2--;
                        if (i2 < 0) {
                            StringBuilder y = a.y("Expected a value but was ");
                            y.append(peek());
                            y.append(" at path ");
                            y.append(getPath());
                            throw new JsonDataException(y.toString());
                        }
                    } else if (i3 == 2) {
                        i2--;
                        if (i2 < 0) {
                            StringBuilder y2 = a.y("Expected a value but was ");
                            y2.append(peek());
                            y2.append(" at path ");
                            y2.append(getPath());
                            throw new JsonDataException(y2.toString());
                        }
                    } else if (i3 == 14 || i3 == 10) {
                        skipUnquotedValue();
                        this.peeked = 0;
                    } else {
                        if (i3 == 9 || i3 == 13) {
                            hVar = DOUBLE_QUOTE_OR_SLASH;
                        } else if (i3 == 8 || i3 == 12) {
                            hVar = SINGLE_QUOTE_OR_SLASH;
                        } else {
                            if (i3 == 17) {
                                this.buffer.skip((long) this.peekedNumberLength);
                            } else if (i3 == 18) {
                                StringBuilder y3 = a.y("Expected a value but was ");
                                y3.append(peek());
                                y3.append(" at path ");
                                y3.append(getPath());
                                throw new JsonDataException(y3.toString());
                            }
                            this.peeked = 0;
                        }
                        skipQuotedValue(hVar);
                        this.peeked = 0;
                    }
                    this.stackSize--;
                    this.peeked = 0;
                }
                i2++;
                this.peeked = 0;
            } while (i2 != 0);
            int[] iArr = this.pathIndices;
            int i4 = this.stackSize;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
            this.pathNames[i4 - 1] = "null";
            return;
        }
        StringBuilder y4 = a.y("Cannot skip unexpected ");
        y4.append(peek());
        y4.append(" at ");
        y4.append(getPath());
        throw new JsonDataException(y4.toString());
    }

    public String toString() {
        StringBuilder y = a.y("JsonReader(");
        y.append(this.source);
        y.append(")");
        return y.toString();
    }
}
