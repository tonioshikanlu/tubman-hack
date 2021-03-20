package b.j.a.c.f0.g;

import b.j.a.c.e;
import b.j.a.c.i;
import b.j.a.c.i0.n;

public class k extends j {
    public final String c;
    public final String d;

    public k(i iVar, n nVar) {
        super(iVar, nVar);
        String name = iVar.f2152h.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.c = "";
            this.d = ".";
            return;
        }
        this.d = name.substring(0, lastIndexOf + 1);
        this.c = name.substring(0, lastIndexOf);
    }

    public String c(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.d) ? name.substring(this.d.length() - 1) : name;
    }

    public i h(String str, e eVar) {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder(this.c.length() + str.length());
            if (this.c.length() == 0) {
                str = str.substring(1);
            } else {
                sb.append(this.c);
            }
            sb.append(str);
            str = sb.toString();
        }
        return super.h(str, eVar);
    }
}
