package com.segment.analytics;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Cartographer {
    public static final Cartographer INSTANCE = new Builder().lenient(true).prettyPrint(false).build();
    private final boolean isLenient;
    private final boolean prettyPrint;

    /* renamed from: com.segment.analytics.Cartographer$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$android$util$JsonToken;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.util.JsonToken[] r0 = android.util.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$android$util$JsonToken = r0
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$android$util$JsonToken     // Catch:{ NoSuchFieldError -> 0x001d }
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$android$util$JsonToken     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.util.JsonToken r1 = android.util.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$android$util$JsonToken     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.util.JsonToken r1 = android.util.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$android$util$JsonToken     // Catch:{ NoSuchFieldError -> 0x003e }
                android.util.JsonToken r1 = android.util.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$android$util$JsonToken     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.util.JsonToken r1 = android.util.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.Cartographer.AnonymousClass1.<clinit>():void");
        }
    }

    public static class Builder {
        private boolean isLenient;
        private boolean prettyPrint;

        public Cartographer build() {
            return new Cartographer(this.isLenient, this.prettyPrint);
        }

        public Builder lenient(boolean z) {
            this.isLenient = z;
            return this;
        }

        public Builder prettyPrint(boolean z) {
            this.prettyPrint = z;
            return this;
        }
    }

    public Cartographer(boolean z, boolean z2) {
        this.isLenient = z;
        this.prettyPrint = z2;
    }

    private static void arrayToWriter(Object obj, JsonWriter jsonWriter) {
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            writeValue(Array.get(obj, i2), jsonWriter);
        }
        jsonWriter.endArray();
    }

    private static void listToWriter(List<?> list, JsonWriter jsonWriter) {
        jsonWriter.beginArray();
        for (Object writeValue : list) {
            writeValue(writeValue, jsonWriter);
        }
        jsonWriter.endArray();
    }

    private static void mapToWriter(Map<?, ?> map, JsonWriter jsonWriter) {
        jsonWriter.beginObject();
        for (Map.Entry next : map.entrySet()) {
            jsonWriter.name(String.valueOf(next.getKey()));
            writeValue(next.getValue(), jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static Object readValue(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        switch (AnonymousClass1.$SwitchMap$android$util$JsonToken[peek.ordinal()]) {
            case 1:
                return readerToMap(jsonReader);
            case 2:
                return readerToList(jsonReader);
            case 3:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 4:
                jsonReader.nextNull();
                return null;
            case 5:
                return Double.valueOf(jsonReader.nextDouble());
            case 6:
                return jsonReader.nextString();
            default:
                throw new IllegalStateException("Invalid token " + peek);
        }
    }

    private static List<Object> readerToList(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(readValue(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    private static Map<String, Object> readerToMap(JsonReader jsonReader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            linkedHashMap.put(jsonReader.nextName(), readValue(jsonReader));
        }
        jsonReader.endObject();
        return linkedHashMap;
    }

    private static void writeValue(Object obj, JsonWriter jsonWriter) {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof List) {
            listToWriter((List) obj, jsonWriter);
        } else if (obj instanceof Map) {
            mapToWriter((Map) obj, jsonWriter);
        } else if (obj.getClass().isArray()) {
            arrayToWriter(obj, jsonWriter);
        } else {
            jsonWriter.value(String.valueOf(obj));
        }
    }

    public Map<String, Object> fromJson(Reader reader) {
        if (reader != null) {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(this.isLenient);
            try {
                return readerToMap(jsonReader);
            } finally {
                reader.close();
            }
        } else {
            throw new IllegalArgumentException("reader == null");
        }
    }

    public Map<String, Object> fromJson(String str) {
        if (str == null) {
            throw new IllegalArgumentException("json == null");
        } else if (str.length() != 0) {
            return fromJson((Reader) new StringReader(str));
        } else {
            throw new IllegalArgumentException("json empty");
        }
    }

    public String toJson(Map<?, ?> map) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(map, stringWriter);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public void toJson(Map<?, ?> map, Writer writer) {
        if (map == null) {
            throw new IllegalArgumentException("map == null");
        } else if (writer != null) {
            JsonWriter jsonWriter = new JsonWriter(writer);
            jsonWriter.setLenient(this.isLenient);
            if (this.prettyPrint) {
                jsonWriter.setIndent("  ");
            }
            try {
                mapToWriter(map, jsonWriter);
            } finally {
                jsonWriter.close();
            }
        } else {
            throw new IllegalArgumentException("writer == null");
        }
    }
}
