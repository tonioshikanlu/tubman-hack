package e.c0;

import b.q.a.a;
import e.x.c.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final Pattern f9887h;

    public d(String str) {
        i.e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        i.d(compile, "Pattern.compile(pattern)");
        i.e(compile, "nativePattern");
        this.f9887h = compile;
    }

    public final boolean a(CharSequence charSequence) {
        i.e(charSequence, "input");
        return this.f9887h.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        i.e(charSequence, "input");
        i.e(str, "replacement");
        String replaceAll = this.f9887h.matcher(charSequence).replaceAll(str);
        i.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> c(CharSequence charSequence, int i2) {
        i.e(charSequence, "input");
        int i3 = 0;
        if (i2 >= 0) {
            Matcher matcher = this.f9887h.matcher(charSequence);
            if (!matcher.find() || i2 == 1) {
                return a.l2(charSequence.toString());
            }
            int i4 = 10;
            if (i2 > 0 && i2 <= 10) {
                i4 = i2;
            }
            ArrayList arrayList = new ArrayList(i4);
            int i5 = i2 - 1;
            do {
                arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
                i3 = matcher.end();
                if ((i5 >= 0 && arrayList.size() == i5) || !matcher.find()) {
                    arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
                i3 = matcher.end();
                break;
            } while (!matcher.find());
            arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public String toString() {
        String pattern = this.f9887h.toString();
        i.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
