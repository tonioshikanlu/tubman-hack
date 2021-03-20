package b.l.f.y;

import b.l.f.h;
import java.util.HashMap;
import java.util.Map;

public enum d {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{"US-ASCII"}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{"GB2312", "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    
    public static final Map<Integer, d> K = null;
    public static final Map<String, d> L = null;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f5824h;

    /* renamed from: i  reason: collision with root package name */
    public final String[] f5825i;

    /* access modifiers changed from: public */
    static {
        K = new HashMap();
        L = new HashMap();
        d[] values = values();
        for (int i2 = 0; i2 < 27; i2++) {
            d dVar = values[i2];
            for (int valueOf : dVar.f5824h) {
                K.put(Integer.valueOf(valueOf), dVar);
            }
            L.put(dVar.name(), dVar);
            for (String put : dVar.f5825i) {
                L.put(put, dVar);
            }
        }
    }

    /* access modifiers changed from: public */
    d(int i2) {
        this.f5824h = new int[]{i2};
        this.f5825i = new String[0];
    }

    /* access modifiers changed from: public */
    d(int i2, String... strArr) {
        this.f5824h = new int[]{i2};
        this.f5825i = strArr;
    }

    /* access modifiers changed from: public */
    d(int[] iArr, String... strArr) {
        this.f5824h = iArr;
        this.f5825i = strArr;
    }

    public static d d(int i2) {
        if (i2 >= 0 && i2 < 900) {
            return K.get(Integer.valueOf(i2));
        }
        throw h.a();
    }
}
