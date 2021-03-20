package com.airbnb.lottie.parser.moshi;

import b.e.a.a.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import o.e;
import o.f;
import o.g;
import o.h;
import o.q;

public abstract class JsonReader implements Closeable {
    private static final String[] REPLACEMENT_CHARS = new String[128];
    public boolean failOnUnknown;
    public boolean lenient;
    public int[] pathIndices = new int[32];
    public String[] pathNames = new String[32];
    public int[] scopes = new int[32];
    public int stackSize;

    public static final class Options {
        public final q doubleQuoteSuffix;
        public final String[] strings;

        private Options(String[] strArr, q qVar) {
            this.strings = strArr;
            this.doubleQuoteSuffix = qVar;
        }

        public static Options of(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                e eVar = new e();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    JsonReader.string(eVar, strArr[i2]);
                    eVar.readByte();
                    hVarArr[i2] = eVar.e0();
                }
                return new Options((String[]) strArr.clone(), q.f10477j.c(hVarArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            REPLACEMENT_CHARS[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader of(g gVar) {
        return new JsonUtf8Reader(gVar);
    }

    /* access modifiers changed from: private */
    public static void string(f fVar, String str) {
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        fVar.E(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                fVar.m(str, i2, i3);
            }
            fVar.d0(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            fVar.m(str, i2, length);
        }
        fVar.E(34);
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract boolean hasNext();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract Token peek();

    public final void pushScope(int i2) {
        int i3 = this.stackSize;
        int[] iArr = this.scopes;
        if (i3 == iArr.length) {
            if (i3 != 256) {
                this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.pathNames;
                this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.pathIndices;
                this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder y = a.y("Nesting too deep at ");
                y.append(getPath());
                throw new JsonDataException(y.toString());
            }
        }
        int[] iArr3 = this.scopes;
        int i4 = this.stackSize;
        this.stackSize = i4 + 1;
        iArr3[i4] = i2;
    }

    public abstract int selectName(Options options);

    public abstract void skipName();

    public abstract void skipValue();

    public final JsonEncodingException syntaxError(String str) {
        StringBuilder B = a.B(str, " at path ");
        B.append(getPath());
        throw new JsonEncodingException(B.toString());
    }
}
