package com.airbnb.lottie.parser;

import b.m.a.j;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;

public class DocumentDataParser implements ValueParser<DocumentData> {
    public static final DocumentDataParser INSTANCE = new DocumentDataParser();
    private static final JsonReader.Options NAMES = JsonReader.Options.of("t", "f", "s", j.f5920k, "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private DocumentDataParser() {
    }

    public DocumentData parse(JsonReader jsonReader, float f) {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.beginObject();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z = true;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    justification2 = DocumentData.Justification.CENTER;
                    if (nextInt <= 2 && nextInt >= 0) {
                        justification2 = DocumentData.Justification.values()[nextInt];
                        break;
                    }
                case 4:
                    i2 = jsonReader.nextInt();
                    break;
                case 5:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    i3 = JsonUtils.jsonToColor(jsonReader);
                    break;
                case 8:
                    i4 = JsonUtils.jsonToColor(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        JsonReader jsonReader2 = jsonReader;
        jsonReader.endObject();
        return new DocumentData(str, str2, f2, justification2, i2, f3, f4, i3, i4, f5, z);
    }
}