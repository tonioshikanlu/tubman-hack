package b.l.a.c.f.e;

import b.l.a.c.b.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class w1 {
    public final v1 a;

    public w1(v1 v1Var) {
        this.a = v1Var;
    }

    public static w1 a(String str) {
        int i2 = wk.a;
        ni niVar = new ni(Pattern.compile("[.-]"));
        Matcher matcher = niVar.f3193h.matcher("");
        Objects.requireNonNull(matcher);
        if (!matcher.matches()) {
            return new w1(new y(niVar));
        }
        throw new IllegalArgumentException(a.T1("The pattern may not match the empty string: %s", niVar));
    }

    public final List<String> b(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator<String> a2 = this.a.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a2.hasNext()) {
            arrayList.add(a2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
