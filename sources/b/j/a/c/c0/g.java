package b.j.a.c.c0;

import b.j.a.b.i;
import java.util.Collection;
import java.util.Iterator;

public abstract class g extends f {

    /* renamed from: k  reason: collision with root package name */
    public final Collection<Object> f1860k;

    /* renamed from: l  reason: collision with root package name */
    public transient String f1861l;

    public g(i iVar, String str, b.j.a.b.g gVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(iVar, str, gVar);
        this.f1860k = collection;
    }

    public String a() {
        String str = this.f1861l;
        if (str != null || this.f1860k == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(100);
        int size = this.f1860k.size();
        if (size != 1) {
            sb.append(" (");
            sb.append(size);
            sb.append(" known properties: ");
            Iterator<Object> it = this.f1860k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb.append('\"');
                sb.append(String.valueOf(it.next()));
                sb.append('\"');
                if (sb.length() > 1000) {
                    sb.append(" [truncated]");
                    break;
                } else if (it.hasNext()) {
                    sb.append(", ");
                }
            }
        } else {
            sb.append(" (one known property: \"");
            sb.append(String.valueOf(this.f1860k.iterator().next()));
            sb.append('\"');
        }
        sb.append("])");
        String sb2 = sb.toString();
        this.f1861l = sb2;
        return sb2;
    }
}
