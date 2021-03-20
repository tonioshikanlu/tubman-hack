package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;
import java.util.List;

public class AnimatableValueParser {
    private AnimatableValueParser() {
    }

    @Nullable
    private static <T> List<Keyframe<T>> parse(JsonReader jsonReader, float f, LottieComposition lottieComposition, ValueParser<T> valueParser) {
        return KeyframesParser.parse(jsonReader, lottieComposition, f, valueParser);
    }

    @Nullable
    private static <T> List<Keyframe<T>> parse(JsonReader jsonReader, LottieComposition lottieComposition, ValueParser<T> valueParser) {
        return KeyframesParser.parse(jsonReader, lottieComposition, 1.0f, valueParser);
    }

    public static AnimatableColorValue parseColor(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableColorValue(parse(jsonReader, lottieComposition, ColorParser.INSTANCE));
    }

    public static AnimatableTextFrame parseDocumentData(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableTextFrame(parse(jsonReader, lottieComposition, DocumentDataParser.INSTANCE));
    }

    public static AnimatableFloatValue parseFloat(JsonReader jsonReader, LottieComposition lottieComposition) {
        return parseFloat(jsonReader, lottieComposition, true);
    }

    public static AnimatableFloatValue parseFloat(JsonReader jsonReader, LottieComposition lottieComposition, boolean z) {
        return new AnimatableFloatValue(parse(jsonReader, z ? Utils.dpScale() : 1.0f, lottieComposition, FloatParser.INSTANCE));
    }

    public static AnimatableGradientColorValue parseGradientColor(JsonReader jsonReader, LottieComposition lottieComposition, int i2) {
        return new AnimatableGradientColorValue(parse(jsonReader, lottieComposition, new GradientColorParser(i2)));
    }

    public static AnimatableIntegerValue parseInteger(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableIntegerValue(parse(jsonReader, lottieComposition, IntegerParser.INSTANCE));
    }

    public static AnimatablePointValue parsePoint(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatablePointValue(parse(jsonReader, Utils.dpScale(), lottieComposition, PointFParser.INSTANCE));
    }

    public static AnimatableScaleValue parseScale(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableScaleValue((List<Keyframe<ScaleXY>>) parse(jsonReader, lottieComposition, ScaleXYParser.INSTANCE));
    }

    public static AnimatableShapeValue parseShapeData(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableShapeValue(parse(jsonReader, Utils.dpScale(), lottieComposition, ShapeDataParser.INSTANCE));
    }
}
