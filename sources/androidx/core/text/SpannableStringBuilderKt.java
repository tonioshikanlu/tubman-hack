package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.ColorInt;
import e.r;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a$\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a<\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\n\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a(\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u0010\u0010\u000f\u001a(\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u0011\u0010\u000f\u001a2\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a2\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u0015\u0010\u0014\u001a(\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u0016\u0010\u000f\u001a0\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a(\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u001b\u0010\u000f\u001a(\u0010\u001c\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\b¢\u0006\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "Le/r;", "builderAction", "Landroid/text/SpannedString;", "buildSpannedString", "(Le/x/b/l;)Landroid/text/SpannedString;", "", "", "spans", "inSpans", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Le/x/b/l;)Landroid/text/SpannableStringBuilder;", "span", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;Le/x/b/l;)Landroid/text/SpannableStringBuilder;", "bold", "(Landroid/text/SpannableStringBuilder;Le/x/b/l;)Landroid/text/SpannableStringBuilder;", "italic", "underline", "", "color", "(Landroid/text/SpannableStringBuilder;ILe/x/b/l;)Landroid/text/SpannableStringBuilder;", "backgroundColor", "strikeThrough", "", "proportion", "scale", "(Landroid/text/SpannableStringBuilder;FLe/x/b/l;)Landroid/text/SpannableStringBuilder;", "superscript", "subscript", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class SpannableStringBuilderKt {
    public static final SpannableStringBuilder backgroundColor(SpannableStringBuilder spannableStringBuilder, @ColorInt int i2, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$backgroundColor");
        i.f(lVar, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i2);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder bold(SpannableStringBuilder spannableStringBuilder, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$bold");
        i.f(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannedString buildSpannedString(l<? super SpannableStringBuilder, r> lVar) {
        i.f(lVar, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        lVar.invoke(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannableStringBuilder color(SpannableStringBuilder spannableStringBuilder, @ColorInt int i2, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$color");
        i.f(lVar, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object obj, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$inSpans");
        i.f(obj, "span");
        i.f(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object[] objArr, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$inSpans");
        i.f(objArr, "spans");
        i.f(lVar, "builderAction");
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        for (Object span : objArr) {
            spannableStringBuilder.setSpan(span, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder italic(SpannableStringBuilder spannableStringBuilder, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$italic");
        i.f(lVar, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder scale(SpannableStringBuilder spannableStringBuilder, float f, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$scale");
        i.f(lVar, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f);
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder strikeThrough(SpannableStringBuilder spannableStringBuilder, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$strikeThrough");
        i.f(lVar, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder subscript(SpannableStringBuilder spannableStringBuilder, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$subscript");
        i.f(lVar, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder superscript(SpannableStringBuilder spannableStringBuilder, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$superscript");
        i.f(lVar, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder underline(SpannableStringBuilder spannableStringBuilder, l<? super SpannableStringBuilder, r> lVar) {
        i.f(spannableStringBuilder, "$this$underline");
        i.f(lVar, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
