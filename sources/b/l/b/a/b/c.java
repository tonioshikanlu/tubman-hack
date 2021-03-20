package b.l.b.a.b;

import b.l.b.a.d.k;
import b.l.b.a.d.z.a;
import b.l.b.a.d.z.b;
import b.l.b.a.d.z.d;
import com.google.android.material.badge.BadgeDrawable;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class c extends k {
    public static final d URI_FRAGMENT_ESCAPER = new b("=&-_.!~*'()@:$,;/?:", false);
    public String fragment;
    public String host;
    public List<String> pathParts;
    public int port;
    public String scheme;
    public String userInfo;
    public boolean verbatim;

    public c() {
        this.port = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(String str) {
        this(new URL(str), false);
        try {
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static boolean appendParam(boolean z, StringBuilder sb, String str, Object obj, boolean z2) {
        char c;
        if (z) {
            z = false;
            c = '?';
        } else {
            c = '&';
        }
        sb.append(c);
        sb.append(str);
        String obj2 = obj.toString();
        if (!z2) {
            obj2 = a.d.a(obj2);
        }
        if (obj2.length() != 0) {
            sb.append('=');
            sb.append(obj2);
        }
        return z;
    }

    public static List<String> toPathParts(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = true;
        while (z2) {
            int indexOf = str.indexOf(47, i2);
            boolean z3 = indexOf != -1;
            String substring = z3 ? str.substring(i2, indexOf) : str.substring(i2);
            if (!z) {
                d dVar = a.a;
                if (substring == null) {
                    substring = null;
                } else {
                    try {
                        substring = URLDecoder.decode(substring.replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%2B"), StandardCharsets.UTF_8.name());
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            arrayList.add(substring);
            i2 = indexOf + 1;
            z2 = z3;
        }
        return arrayList;
    }

    public final void appendRawPathFromParts(StringBuilder sb) {
        int size = this.pathParts.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = this.pathParts.get(i2);
            if (i2 != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                if (!this.verbatim) {
                    str = a.f4832b.a(str);
                }
                sb.append(str);
            }
        }
    }

    public final String build() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = this.scheme;
        Objects.requireNonNull(str);
        sb2.append(str);
        sb2.append("://");
        String str2 = this.userInfo;
        if (str2 != null) {
            if (!this.verbatim) {
                str2 = a.c.a(str2);
            }
            sb2.append(str2);
            sb2.append('@');
        }
        String str3 = this.host;
        Objects.requireNonNull(str3);
        sb2.append(str3);
        int i2 = this.port;
        if (i2 != -1) {
            sb2.append(':');
            sb2.append(i2);
        }
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        if (this.pathParts != null) {
            appendRawPathFromParts(sb3);
        }
        Set<Map.Entry<String, Object>> entrySet = entrySet();
        boolean z = this.verbatim;
        boolean z2 = true;
        for (Map.Entry next : entrySet) {
            Object value = next.getValue();
            if (value != null) {
                String str4 = (String) next.getKey();
                if (!z) {
                    str4 = a.d.a(str4);
                }
                if (value instanceof Collection) {
                    for (Object appendParam : (Collection) value) {
                        z2 = appendParam(z2, sb3, str4, appendParam, z);
                    }
                } else {
                    z2 = appendParam(z2, sb3, str4, value, z);
                }
            }
        }
        String str5 = this.fragment;
        if (str5 != null) {
            sb3.append('#');
            if (!this.verbatim) {
                str5 = URI_FRAGMENT_ESCAPER.a(str5);
            }
            sb3.append(str5);
        }
        sb.append(sb3.toString());
        return sb.toString();
    }

    public c clone() {
        c cVar = (c) super.clone();
        if (this.pathParts != null) {
            cVar.pathParts = new ArrayList(this.pathParts);
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof c)) {
            return false;
        }
        return build().equals(((c) obj).build());
    }

    public int hashCode() {
        return build().hashCode();
    }

    public c set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    public String toString() {
        return build();
    }

    public c(URL url, boolean z) {
        String protocol = url.getProtocol();
        String host2 = url.getHost();
        int port2 = url.getPort();
        String path = url.getPath();
        String ref = url.getRef();
        String query = url.getQuery();
        String userInfo2 = url.getUserInfo();
        this.port = -1;
        this.scheme = protocol.toLowerCase(Locale.US);
        this.host = host2;
        this.port = port2;
        this.pathParts = toPathParts(path, z);
        this.verbatim = z;
        String str = null;
        if (z) {
            this.fragment = ref;
            if (query != null) {
                String str2 = o.a;
                try {
                    o.a(new StringReader(query), this, false);
                } catch (IOException e2) {
                    b.l.a.c.b.a.l0(e2);
                    throw null;
                }
            }
            this.userInfo = userInfo2;
            return;
        }
        this.fragment = ref != null ? a.a(ref) : null;
        if (query != null) {
            o.b(query, this);
        }
        this.userInfo = userInfo2 != null ? a.a(userInfo2) : str;
    }
}
