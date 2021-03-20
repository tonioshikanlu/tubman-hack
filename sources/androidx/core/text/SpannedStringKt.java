package androidx.core.text;

import android.text.Spanned;
import android.text.SpannedString;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a<\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Landroid/text/Spanned;", "toSpanned", "(Ljava/lang/CharSequence;)Landroid/text/Spanned;", "", "T", "", "start", "end", "", "getSpans", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class SpannedStringKt {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i2, int i3) {
        i.f(spanned, "$this$getSpans");
        i.i();
        throw null;
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i2, int i3, int i4, Object obj) {
        int i5 = i4 & 1;
        if ((i4 & 2) != 0) {
            spanned.length();
        }
        i.f(spanned, "$this$getSpans");
        i.i();
        throw null;
    }

    public static final Spanned toSpanned(CharSequence charSequence) {
        i.f(charSequence, "$this$toSpanned");
        SpannedString valueOf = SpannedString.valueOf(charSequence);
        i.b(valueOf, "SpannedString.valueOf(this)");
        return valueOf;
    }
}
