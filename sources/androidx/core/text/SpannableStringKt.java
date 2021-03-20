package androidx.core.text;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableString;
import e.a0.d;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\f\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\n¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "Landroid/text/Spannable;", "toSpannable", "(Ljava/lang/CharSequence;)Landroid/text/Spannable;", "Le/r;", "clearSpans", "(Landroid/text/Spannable;)V", "", "start", "end", "", "span", "set", "(Landroid/text/Spannable;IILjava/lang/Object;)V", "Le/a0/d;", "range", "(Landroid/text/Spannable;Le/a0/d;Ljava/lang/Object;)V", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class SpannableStringKt {
    @SuppressLint({"SyntheticAccessor"})
    public static final void clearSpans(Spannable spannable) {
        i.f(spannable, "$this$clearSpans");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        i.b(spans, "getSpans(start, end, T::class.java)");
        for (Object removeSpan : spans) {
            spannable.removeSpan(removeSpan);
        }
    }

    public static final void set(Spannable spannable, int i2, int i3, Object obj) {
        i.f(spannable, "$this$set");
        i.f(obj, "span");
        spannable.setSpan(obj, i2, i3, 17);
    }

    public static final void set(Spannable spannable, d dVar, Object obj) {
        i.f(spannable, "$this$set");
        i.f(dVar, "range");
        i.f(obj, "span");
        spannable.setSpan(obj, dVar.getStart().intValue(), dVar.getEndInclusive().intValue(), 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        i.f(charSequence, "$this$toSpannable");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        i.b(valueOf, "SpannableString.valueOf(this)");
        return valueOf;
    }
}
