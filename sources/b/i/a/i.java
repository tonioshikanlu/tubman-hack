package b.i.a;

import android.graphics.Matrix;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import b.i.a.b;
import b.i.a.e;
import b.i.a.f;
import com.appfoundry.previewer.constants.AnimationStrength;
import com.segment.analytics.AnalyticsContext;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;

public class i {
    public f a = null;

    /* renamed from: b  reason: collision with root package name */
    public f.i0 f1242b = null;
    public boolean c = false;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1243e = false;
    public h f = null;

    /* renamed from: g  reason: collision with root package name */
    public StringBuilder f1244g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1245h = false;

    /* renamed from: i  reason: collision with root package name */
    public StringBuilder f1246i = null;

    public static class b {
        public static final Map<String, e.a> a;

        static {
            HashMap hashMap = new HashMap(10);
            a = hashMap;
            hashMap.put("none", e.a.none);
            hashMap.put("xMinYMin", e.a.xMinYMin);
            hashMap.put("xMidYMin", e.a.xMidYMin);
            hashMap.put("xMaxYMin", e.a.xMaxYMin);
            hashMap.put("xMinYMid", e.a.xMinYMid);
            hashMap.put("xMidYMid", e.a.xMidYMid);
            hashMap.put("xMaxYMid", e.a.xMaxYMid);
            hashMap.put("xMinYMax", e.a.xMinYMax);
            hashMap.put("xMidYMax", e.a.xMidYMax);
            hashMap.put("xMaxYMax", e.a.xMaxYMax);
        }
    }

    public static class c {
        public static final Map<String, Integer> a;

        static {
            HashMap hashMap = new HashMap(47);
            a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            HashMap hashMap2 = hashMap;
            b.e.a.a.a.G(-8388652, hashMap2, "aquamarine", -983041, "azure", -657956, "beige", -6972, "bisque");
            b.e.a.a.a.G(ViewCompat.MEASURED_STATE_MASK, hashMap2, "black", -5171, "blanchedalmond", -16776961, "blue", -7722014, "blueviolet");
            b.e.a.a.a.G(-5952982, hashMap2, "brown", -2180985, "burlywood", -10510688, "cadetblue", -8388864, "chartreuse");
            b.e.a.a.a.G(-2987746, hashMap2, "chocolate", -32944, "coral", -10185235, "cornflowerblue", -1828, "cornsilk");
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            HashMap hashMap3 = hashMap;
            b.e.a.a.a.G(-7667573, hashMap3, "darkmagenta", -11179217, "darkolivegreen", -29696, "darkorange", -6737204, "darkorchid");
            b.e.a.a.a.G(-7667712, hashMap3, "darkred", -1468806, "darksalmon", -7357297, "darkseagreen", -12042869, "darkslateblue");
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            b.e.a.a.a.G(-14774017, hashMap, "dodgerblue", -5103070, "firebrick", -1296, "floralwhite", -14513374, "forestgreen");
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            HashMap hashMap4 = hashMap;
            b.e.a.a.a.G(-983056, hashMap4, "honeydew", -38476, "hotpink", -3318692, "indianred", -11861886, "indigo");
            b.e.a.a.a.G(-16, hashMap4, "ivory", -989556, "khaki", -1644806, "lavender", -3851, "lavenderblush");
            b.e.a.a.a.G(-8586240, hashMap4, "lawngreen", -1331, "lemonchiffon", -5383962, "lightblue", -1015680, "lightcoral");
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            HashMap hashMap5 = hashMap;
            b.e.a.a.a.G(-16777011, hashMap5, "mediumblue", -4565549, "mediumorchid", -7114533, "mediumpurple", -12799119, "mediumseagreen");
            b.e.a.a.a.G(-8689426, hashMap5, "mediumslateblue", -16713062, "mediumspringgreen", -12004916, "mediumturquoise", -3730043, "mediumvioletred");
            b.e.a.a.a.G(-15132304, hashMap5, "midnightblue", -655366, "mintcream", -6943, "mistyrose", -6987, "moccasin");
            b.e.a.a.a.G(-8531, hashMap5, "navajowhite", -16777088, "navy", -133658, "oldlace", -8355840, "olive");
            b.e.a.a.a.G(-9728477, hashMap5, "olivedrab", -23296, "orange", -47872, "orangered", -2461482, "orchid");
            b.e.a.a.a.G(-1120086, hashMap5, "palegoldenrod", -6751336, "palegreen", -5247250, "paleturquoise", -2396013, "palevioletred");
            b.e.a.a.a.G(-4139, hashMap5, "papayawhip", -9543, "peachpuff", -3308225, "peru", -16181, "pink");
            b.e.a.a.a.G(-2252579, hashMap5, "plum", -5185306, "powderblue", -8388480, "purple", -10079335, "rebeccapurple");
            b.e.a.a.a.G(SupportMenu.CATEGORY_MASK, hashMap5, "red", -4419697, "rosybrown", -12490271, "royalblue", -7650029, "saddlebrown");
            b.e.a.a.a.G(-360334, hashMap5, "salmon", -744352, "sandybrown", -13726889, "seagreen", -2578, "seashell");
            b.e.a.a.a.G(-6270419, hashMap5, "sienna", -4144960, "silver", -7876885, "skyblue", -9807155, "slateblue");
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            HashMap hashMap6 = hashMap;
            b.e.a.a.a.G(-12156236, hashMap6, "steelblue", -2968436, "tan", -16744320, "teal", -2572328, "thistle");
            b.e.a.a.a.G(-40121, hashMap6, "tomato", -12525360, "turquoise", -1146130, "violet", -663885, "wheat");
            b.e.a.a.a.G(-1, hashMap6, "white", -657931, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow", -6632142, "yellowgreen");
            hashMap.put("transparent", 0);
        }
    }

    public static class d {
        public static final Map<String, f.o> a;

        static {
            HashMap hashMap = new HashMap(9);
            a = hashMap;
            f.c1 c1Var = f.c1.pt;
            hashMap.put("xx-small", new f.o(0.694f, c1Var));
            hashMap.put("x-small", new f.o(0.833f, c1Var));
            hashMap.put("small", new f.o(10.0f, c1Var));
            hashMap.put(AnimationStrength.MEDIUM, new f.o(12.0f, c1Var));
            hashMap.put("large", new f.o(14.4f, c1Var));
            hashMap.put("x-large", new f.o(17.3f, c1Var));
            hashMap.put("xx-large", new f.o(20.7f, c1Var));
            f.c1 c1Var2 = f.c1.percent;
            hashMap.put("smaller", new f.o(83.33f, c1Var2));
            hashMap.put("larger", new f.o(120.0f, c1Var2));
        }
    }

    public static class e {
        public static final Map<String, Integer> a;

        static {
            HashMap hashMap = new HashMap(13);
            a = hashMap;
            hashMap.put("normal", 400);
            hashMap.put("bold", 700);
            b.e.a.a.a.G(1, hashMap, "bolder", -1, "lighter", 100, "100", 200, "200");
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", 700);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }
    }

    public class f extends DefaultHandler2 {
        public f(a aVar) {
        }

        public void characters(char[] cArr, int i2, int i3) {
            i.this.N(new String(cArr, i2, i3));
        }

        public void endDocument() {
            Objects.requireNonNull(i.this);
        }

        public void endElement(String str, String str2, String str3) {
            i.this.c(str, str2, str3);
        }

        public void processingInstruction(String str, String str2) {
            i.this.F(new C0045i(str2));
            Objects.requireNonNull(i.this);
            str.equals("xml-stylesheet");
        }

        public void startDocument() {
            i iVar = i.this;
            Objects.requireNonNull(iVar);
            iVar.a = new f();
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            i.this.L(str, str2, str3, attributes);
        }
    }

    public enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        C,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;
        
        public static final Map<String, g> V0 = null;

        /* access modifiers changed from: public */
        static {
            V0 = new HashMap();
            g[] values = values();
            for (int i2 = 0; i2 < 92; i2++) {
                g gVar = values[i2];
                if (gVar == CLASS) {
                    V0.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    V0.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g d(String str) {
            g gVar = V0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    public enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        F,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;
        
        public static final Map<String, h> N = null;

        /* access modifiers changed from: public */
        static {
            N = new HashMap();
            h[] values = values();
            for (int i2 = 0; i2 < 32; i2++) {
                h hVar = values[i2];
                if (hVar == SWITCH) {
                    N.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    N.put(hVar.name(), hVar);
                }
            }
        }
    }

    /* renamed from: b.i.a.i$i  reason: collision with other inner class name */
    public static class C0045i {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public int f1267b = 0;
        public int c = 0;
        public d d = new d();

        public C0045i(String str) {
            String trim = str.trim();
            this.a = trim;
            this.c = trim.length();
        }

        public int a() {
            int i2 = this.f1267b;
            int i3 = this.c;
            if (i2 == i3) {
                return -1;
            }
            int i4 = i2 + 1;
            this.f1267b = i4;
            if (i4 < i3) {
                return this.a.charAt(i4);
            }
            return -1;
        }

        public Boolean b(Object obj) {
            if (obj == null) {
                return null;
            }
            q();
            int i2 = this.f1267b;
            if (i2 == this.c) {
                return null;
            }
            char charAt = this.a.charAt(i2);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            boolean z = true;
            this.f1267b++;
            if (charAt != '1') {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        public float c(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            q();
            return i();
        }

        public boolean d(char c2) {
            int i2 = this.f1267b;
            boolean z = i2 < this.c && this.a.charAt(i2) == c2;
            if (z) {
                this.f1267b++;
            }
            return z;
        }

        public boolean e(String str) {
            int length = str.length();
            int i2 = this.f1267b;
            boolean z = i2 <= this.c - length && this.a.substring(i2, i2 + length).equals(str);
            if (z) {
                this.f1267b += length;
            }
            return z;
        }

        public boolean f() {
            return this.f1267b == this.c;
        }

        public boolean g(int i2) {
            return i2 == 32 || i2 == 10 || i2 == 13 || i2 == 9;
        }

        public Integer h() {
            int i2 = this.f1267b;
            if (i2 == this.c) {
                return null;
            }
            String str = this.a;
            this.f1267b = i2 + 1;
            return Integer.valueOf(str.charAt(i2));
        }

        public float i() {
            float a2 = this.d.a(this.a, this.f1267b, this.c);
            if (!Float.isNaN(a2)) {
                this.f1267b = this.d.a;
            }
            return a2;
        }

        public f.o j() {
            float i2 = i();
            if (Float.isNaN(i2)) {
                return null;
            }
            f.c1 o2 = o();
            return o2 == null ? new f.o(i2, f.c1.px) : new f.o(i2, o2);
        }

        public String k() {
            int a2;
            if (f()) {
                return null;
            }
            int i2 = this.f1267b;
            char charAt = this.a.charAt(i2);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            do {
                a2 = a();
                if (a2 == -1) {
                    break;
                }
            } while (a2 != charAt);
            if (a2 == -1) {
                this.f1267b = i2;
                return null;
            }
            int i3 = this.f1267b + 1;
            this.f1267b = i3;
            return this.a.substring(i2 + 1, i3 - 1);
        }

        public String l() {
            return n(' ', false);
        }

        public String m(char c2) {
            return n(c2, false);
        }

        public String n(char c2, boolean z) {
            if (f()) {
                return null;
            }
            char charAt = this.a.charAt(this.f1267b);
            if ((!z && g(charAt)) || charAt == c2) {
                return null;
            }
            int i2 = this.f1267b;
            while (true) {
                int a2 = a();
                if (a2 == -1 || a2 == c2 || (!z && g(a2))) {
                }
            }
            return this.a.substring(i2, this.f1267b);
        }

        public f.c1 o() {
            if (f()) {
                return null;
            }
            if (this.a.charAt(this.f1267b) == '%') {
                this.f1267b++;
                return f.c1.percent;
            }
            int i2 = this.f1267b;
            if (i2 > this.c - 2) {
                return null;
            }
            try {
                f.c1 valueOf = f.c1.valueOf(this.a.substring(i2, i2 + 2).toLowerCase(Locale.US));
                this.f1267b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public float p() {
            q();
            float a2 = this.d.a(this.a, this.f1267b, this.c);
            if (!Float.isNaN(a2)) {
                this.f1267b = this.d.a;
            }
            return a2;
        }

        public boolean q() {
            r();
            int i2 = this.f1267b;
            if (i2 == this.c || this.a.charAt(i2) != ',') {
                return false;
            }
            this.f1267b++;
            r();
            return true;
        }

        public void r() {
            while (true) {
                int i2 = this.f1267b;
                if (i2 < this.c && g(this.a.charAt(i2))) {
                    this.f1267b++;
                } else {
                    return;
                }
            }
        }
    }

    public class j implements Attributes {
        public XmlPullParser a;

        public j(i iVar, XmlPullParser xmlPullParser) {
            this.a = xmlPullParser;
        }

        public int getIndex(String str) {
            return -1;
        }

        public int getIndex(String str, String str2) {
            return -1;
        }

        public int getLength() {
            return this.a.getAttributeCount();
        }

        public String getLocalName(int i2) {
            return this.a.getAttributeName(i2);
        }

        public String getQName(int i2) {
            String attributeName = this.a.getAttributeName(i2);
            if (this.a.getAttributePrefix(i2) == null) {
                return attributeName;
            }
            return this.a.getAttributePrefix(i2) + ':' + attributeName;
        }

        public String getType(int i2) {
            return null;
        }

        public String getType(String str) {
            return null;
        }

        public String getType(String str, String str2) {
            return null;
        }

        public String getURI(int i2) {
            return this.a.getAttributeNamespace(i2);
        }

        public String getValue(int i2) {
            return this.a.getAttributeValue(i2);
        }

        public String getValue(String str) {
            return null;
        }

        public String getValue(String str, String str2) {
            return null;
        }
    }

    public static List<f.o> A(String str) {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            C0045i iVar = new C0045i(str);
            iVar.r();
            while (!iVar.f()) {
                float i2 = iVar.i();
                if (Float.isNaN(i2)) {
                    StringBuilder y = b.e.a.a.a.y("Invalid length list value: ");
                    int i3 = iVar.f1267b;
                    while (!iVar.f() && !iVar.g(iVar.a.charAt(iVar.f1267b))) {
                        iVar.f1267b++;
                    }
                    String substring = iVar.a.substring(i3, iVar.f1267b);
                    iVar.f1267b = i3;
                    y.append(substring);
                    throw new h(y.toString());
                }
                f.c1 o2 = iVar.o();
                if (o2 == null) {
                    o2 = f.c1.px;
                }
                arrayList.add(new f.o(i2, o2));
                iVar.q();
            }
            return arrayList;
        }
        throw new h("Invalid length list (empty string)");
    }

    public static f.o B(C0045i iVar) {
        return iVar.e("auto") ? new f.o(0.0f) : iVar.j();
    }

    public static Float C(String str) {
        try {
            float u = u(str);
            if (u < 0.0f) {
                u = 0.0f;
            } else if (u > 1.0f) {
                u = 1.0f;
            }
            return Float.valueOf(u);
        } catch (h unused) {
            return null;
        }
    }

    public static f.n0 D(String str) {
        if (!str.startsWith("url(")) {
            return s(str);
        }
        int indexOf = str.indexOf(")");
        f.n0 n0Var = null;
        if (indexOf == -1) {
            return new f.t(str.substring(4).trim(), (f.n0) null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            n0Var = s(trim2);
        }
        return new f.t(trim, n0Var);
    }

    public static void E(f.o0 o0Var, String str) {
        C0045i iVar = new C0045i(str);
        iVar.r();
        String l2 = iVar.l();
        if ("defer".equals(l2)) {
            iVar.r();
            l2 = iVar.l();
        }
        e.a aVar = b.a.get(l2);
        e.b bVar = null;
        iVar.r();
        if (!iVar.f()) {
            String l3 = iVar.l();
            l3.hashCode();
            if (l3.equals("meet")) {
                bVar = e.b.meet;
            } else if (l3.equals("slice")) {
                bVar = e.b.slice;
            } else {
                throw new h(b.e.a.a.a.m("Invalid preserveAspectRatio definition: ", str));
            }
        }
        o0Var.f1189n = new e(aVar, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: b.i.a.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: b.i.a.f$d0$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: b.i.a.f$d0$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: b.i.a.f$d0$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: b.i.a.f$d0$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: b.i.a.f$o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: b.i.a.f$d0$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: b.i.a.f$o[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: b.i.a.f$d0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: b.i.a.f$d0$d} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: type inference failed for: r2v46 */
    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: type inference failed for: r2v49 */
    /* JADX WARNING: type inference failed for: r2v50 */
    /* JADX WARNING: type inference failed for: r2v51 */
    /* JADX WARNING: type inference failed for: r2v52 */
    /* JADX WARNING: type inference failed for: r2v53 */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: type inference failed for: r2v55 */
    /* JADX WARNING: type inference failed for: r2v56 */
    /* JADX WARNING: type inference failed for: r2v57 */
    /* JADX WARNING: type inference failed for: r2v58 */
    /* JADX WARNING: type inference failed for: r2v59 */
    /* JADX WARNING: type inference failed for: r2v60 */
    /* JADX WARNING: type inference failed for: r2v61 */
    /* JADX WARNING: type inference failed for: r2v62 */
    /* JADX WARNING: type inference failed for: r2v63 */
    /* JADX WARNING: type inference failed for: r2v64 */
    /* JADX WARNING: type inference failed for: r2v65 */
    /* JADX WARNING: type inference failed for: r2v66 */
    /* JADX WARNING: type inference failed for: r2v67 */
    /* JADX WARNING: type inference failed for: r2v68 */
    /* JADX WARNING: type inference failed for: r2v69 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0220, code lost:
        if (r15.equals("auto") == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03f0, code lost:
        if (r15.equals("underline") == false) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0434, code lost:
        if (r15.equals("end") == false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04cd, code lost:
        if (r15.equals("scroll") == false) goto L_0x04b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void J(b.i.a.f.d0 r13, java.lang.String r14, java.lang.String r15) {
        /*
            b.i.a.f$f r0 = b.i.a.f.C0043f.f1151h
            int r1 = r15.length()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "inherit"
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x0012
            return
        L_0x0012:
            b.i.a.i$g r14 = b.i.a.i.g.d(r14)
            int r14 = r14.ordinal()
            r1 = 5
            r2 = 0
            java.lang.String r3 = "auto"
            r4 = 1
            if (r14 == r4) goto L_0x0551
            r5 = 2
            if (r14 == r5) goto L_0x0545
            r6 = 4
            if (r14 == r6) goto L_0x0539
            if (r14 == r1) goto L_0x052a
            r1 = 8
            if (r14 == r1) goto L_0x0507
            r1 = 35
            if (r14 == r1) goto L_0x04fa
            r1 = 40
            if (r14 == r1) goto L_0x04ee
            r1 = 42
            r7 = 3
            java.lang.String r8 = "visible"
            r9 = 0
            r10 = -1
            if (r14 == r1) goto L_0x04ac
            r1 = 78
            java.lang.String r11 = "none"
            if (r14 == r1) goto L_0x048b
            r1 = 58
            java.lang.String r12 = "currentColor"
            if (r14 == r1) goto L_0x0467
            r1 = 59
            if (r14 == r1) goto L_0x0458
            r1 = 74
            if (r14 == r1) goto L_0x041a
            r1 = 75
            if (r14 == r1) goto L_0x03c2
            r1 = 124(0x7c, float:1.74E-43)
            switch(r14) {
                case 14: goto L_0x019c;
                case 15: goto L_0x018e;
                case 16: goto L_0x0180;
                case 17: goto L_0x0172;
                case 18: goto L_0x00b2;
                case 19: goto L_0x00a4;
                case 20: goto L_0x008a;
                case 21: goto L_0x0077;
                case 22: goto L_0x0068;
                default: goto L_0x005b;
            }
        L_0x005b:
            switch(r14) {
                case 27: goto L_0x0208;
                case 28: goto L_0x01f7;
                case 29: goto L_0x01ea;
                case 30: goto L_0x01dd;
                case 31: goto L_0x01d0;
                default: goto L_0x005e;
            }
        L_0x005e:
            java.lang.String r3 = "round"
            switch(r14) {
                case 62: goto L_0x0352;
                case 63: goto L_0x0345;
                case 64: goto L_0x0337;
                case 65: goto L_0x02cc;
                case 66: goto L_0x02c0;
                case 67: goto L_0x0298;
                case 68: goto L_0x0270;
                case 69: goto L_0x0260;
                case 70: goto L_0x0252;
                case 71: goto L_0x0246;
                default: goto L_0x0063;
            }
        L_0x0063:
            switch(r14) {
                case 88: goto L_0x03aa;
                case 89: goto L_0x039b;
                case 90: goto L_0x0368;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x05a9
        L_0x0068:
            b.i.a.f$d0$b r14 = x(r15)
            r13.y = r14
            if (r14 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 65536(0x10000, double:3.2379E-319)
            goto L_0x05a6
        L_0x0077:
            java.util.Map<java.lang.String, java.lang.Integer> r14 = b.i.a.i.e.a
            java.lang.Object r14 = r14.get(r15)
            java.lang.Integer r14 = (java.lang.Integer) r14
            r13.x = r14
            if (r14 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 32768(0x8000, double:1.61895E-319)
            goto L_0x05a6
        L_0x008a:
            java.util.Map<java.lang.String, b.i.a.f$o> r14 = b.i.a.i.d.a     // Catch:{ h -> 0x009a }
            java.lang.Object r14 = r14.get(r15)     // Catch:{ h -> 0x009a }
            b.i.a.f$o r14 = (b.i.a.f.o) r14     // Catch:{ h -> 0x009a }
            if (r14 != 0) goto L_0x0099
            b.i.a.f$o r2 = z(r15)     // Catch:{ h -> 0x009a }
            goto L_0x009a
        L_0x0099:
            r2 = r14
        L_0x009a:
            r13.w = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 16384(0x4000, double:8.0948E-320)
            goto L_0x05a6
        L_0x00a4:
            java.util.List r14 = w(r15)
            r13.v = r14
            if (r14 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 8192(0x2000, double:4.0474E-320)
            goto L_0x05a6
        L_0x00b2:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r15)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "|caption|icon|menu|message-box|small-caption|status-bar|"
            boolean r14 = r0.contains(r14)
            if (r14 != 0) goto L_0x00ce
            goto L_0x05a9
        L_0x00ce:
            b.i.a.i$i r14 = new b.i.a.i$i
            r14.<init>(r15)
            r15 = r2
            r0 = r15
            r1 = r0
        L_0x00d6:
            r3 = 47
            java.lang.String r4 = r14.m(r3)
            r14.r()
            if (r4 != 0) goto L_0x00e3
            goto L_0x05a9
        L_0x00e3:
            if (r15 == 0) goto L_0x00e8
            if (r0 == 0) goto L_0x00e8
            goto L_0x0113
        L_0x00e8:
            java.lang.String r5 = "normal"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00f1
            goto L_0x00d6
        L_0x00f1:
            if (r15 != 0) goto L_0x00fe
            java.util.Map<java.lang.String, java.lang.Integer> r15 = b.i.a.i.e.a
            java.lang.Object r15 = r15.get(r4)
            java.lang.Integer r15 = (java.lang.Integer) r15
            if (r15 == 0) goto L_0x00fe
            goto L_0x00d6
        L_0x00fe:
            if (r0 != 0) goto L_0x0107
            b.i.a.f$d0$b r0 = x(r4)
            if (r0 == 0) goto L_0x0107
            goto L_0x00d6
        L_0x0107:
            if (r1 != 0) goto L_0x0113
            java.lang.String r1 = "small-caps"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0113
            r1 = r4
            goto L_0x00d6
        L_0x0113:
            java.util.Map<java.lang.String, b.i.a.f$o> r1 = b.i.a.i.d.a     // Catch:{ h -> 0x0122 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ h -> 0x0122 }
            b.i.a.f$o r1 = (b.i.a.f.o) r1     // Catch:{ h -> 0x0122 }
            if (r1 != 0) goto L_0x0123
            b.i.a.f$o r1 = z(r4)     // Catch:{ h -> 0x0122 }
            goto L_0x0123
        L_0x0122:
            r1 = r2
        L_0x0123:
            boolean r3 = r14.d(r3)
            if (r3 == 0) goto L_0x0138
            r14.r()
            java.lang.String r3 = r14.l()
            if (r3 == 0) goto L_0x0135
            z(r3)     // Catch:{ h -> 0x05a9 }
        L_0x0135:
            r14.r()
        L_0x0138:
            boolean r3 = r14.f()
            if (r3 == 0) goto L_0x013f
            goto L_0x014b
        L_0x013f:
            int r2 = r14.f1267b
            int r3 = r14.c
            r14.f1267b = r3
            java.lang.String r14 = r14.a
            java.lang.String r2 = r14.substring(r2)
        L_0x014b:
            java.util.List r14 = w(r2)
            r13.v = r14
            r13.w = r1
            if (r15 != 0) goto L_0x0158
            r14 = 400(0x190, float:5.6E-43)
            goto L_0x015c
        L_0x0158:
            int r14 = r15.intValue()
        L_0x015c:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.x = r14
            if (r0 != 0) goto L_0x0166
            b.i.a.f$d0$b r0 = b.i.a.f.d0.b.Normal
        L_0x0166:
            r13.y = r0
            long r14 = r13.f1098h
            r0 = 122880(0x1e000, double:6.0711E-319)
            long r14 = r14 | r0
            r13.f1098h = r14
            goto L_0x05a9
        L_0x0172:
            java.lang.Float r14 = C(r15)
            r13.f1101k = r14
            if (r14 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 4
            goto L_0x05a6
        L_0x0180:
            b.i.a.f$d0$a r14 = t(r15)
            r13.f1100j = r14
            if (r14 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 2
            goto L_0x05a6
        L_0x018e:
            b.i.a.f$n0 r14 = D(r15)
            r13.f1099i = r14
            if (r14 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 1
            goto L_0x05a6
        L_0x019c:
            int r14 = r15.indexOf(r1)
            if (r14 >= 0) goto L_0x05a9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r15)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            boolean r14 = r0.contains(r14)
            if (r14 != 0) goto L_0x01be
            goto L_0x05a9
        L_0x01be:
            boolean r14 = r15.equals(r11)
            r14 = r14 ^ r4
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r13.H = r14
            long r14 = r13.f1098h
            r0 = 16777216(0x1000000, double:8.289046E-317)
            goto L_0x05a6
        L_0x01d0:
            java.lang.String r14 = y(r15)
            r13.G = r14
            long r14 = r13.f1098h
            r0 = 8388608(0x800000, double:4.144523E-317)
            goto L_0x05a6
        L_0x01dd:
            java.lang.String r14 = y(r15)
            r13.F = r14
            long r14 = r13.f1098h
            r0 = 4194304(0x400000, double:2.0722615E-317)
            goto L_0x05a6
        L_0x01ea:
            java.lang.String r14 = y(r15)
            r13.E = r14
            long r14 = r13.f1098h
            r0 = 2097152(0x200000, double:1.0361308E-317)
            goto L_0x05a6
        L_0x01f7:
            java.lang.String r14 = y(r15)
            r13.E = r14
            r13.F = r14
            r13.G = r14
            long r14 = r13.f1098h
            r0 = 14680064(0xe00000, double:7.2529153E-317)
            goto L_0x05a6
        L_0x0208:
            int r14 = r15.hashCode()
            switch(r14) {
                case -933002398: goto L_0x0223;
                case 3005871: goto L_0x021c;
                case 362741610: goto L_0x0211;
                default: goto L_0x020f;
            }
        L_0x020f:
            r4 = r10
            goto L_0x022d
        L_0x0211:
            java.lang.String r14 = "optimizeSpeed"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x021a
            goto L_0x020f
        L_0x021a:
            r4 = r5
            goto L_0x022d
        L_0x021c:
            boolean r14 = r15.equals(r3)
            if (r14 != 0) goto L_0x022d
            goto L_0x020f
        L_0x0223:
            java.lang.String r14 = "optimizeQuality"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x022c
            goto L_0x020f
        L_0x022c:
            r4 = r9
        L_0x022d:
            switch(r4) {
                case 0: goto L_0x0237;
                case 1: goto L_0x0234;
                case 2: goto L_0x0231;
                default: goto L_0x0230;
            }
        L_0x0230:
            goto L_0x0239
        L_0x0231:
            b.i.a.f$d0$e r2 = b.i.a.f.d0.e.optimizeSpeed
            goto L_0x0239
        L_0x0234:
            b.i.a.f$d0$e r2 = b.i.a.f.d0.e.auto
            goto L_0x0239
        L_0x0237:
            b.i.a.f$d0$e r2 = b.i.a.f.d0.e.optimizeQuality
        L_0x0239:
            r13.T = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x05a6
        L_0x0246:
            b.i.a.f$o r14 = z(r15)     // Catch:{ h -> 0x05a9 }
            r13.f1104n = r14     // Catch:{ h -> 0x05a9 }
            long r14 = r13.f1098h     // Catch:{ h -> 0x05a9 }
            r0 = 32
            goto L_0x0534
        L_0x0252:
            java.lang.Float r14 = C(r15)
            r13.f1103m = r14
            if (r14 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 16
            goto L_0x05a6
        L_0x0260:
            float r14 = u(r15)     // Catch:{ h -> 0x05a9 }
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch:{ h -> 0x05a9 }
            r13.f1107q = r14     // Catch:{ h -> 0x05a9 }
            long r14 = r13.f1098h     // Catch:{ h -> 0x05a9 }
            r0 = 256(0x100, double:1.265E-321)
            goto L_0x0534
        L_0x0270:
            java.lang.String r14 = "miter"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x027b
            b.i.a.f$d0$d r2 = b.i.a.f.d0.d.Miter
            goto L_0x028e
        L_0x027b:
            boolean r14 = r3.equals(r15)
            if (r14 == 0) goto L_0x0284
            b.i.a.f$d0$d r2 = b.i.a.f.d0.d.Round
            goto L_0x028e
        L_0x0284:
            java.lang.String r14 = "bevel"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x028e
            b.i.a.f$d0$d r2 = b.i.a.f.d0.d.Bevel
        L_0x028e:
            r13.f1106p = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 128(0x80, double:6.32E-322)
            goto L_0x05a6
        L_0x0298:
            java.lang.String r14 = "butt"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x02a3
            b.i.a.f$d0$c r2 = b.i.a.f.d0.c.Butt
            goto L_0x02b6
        L_0x02a3:
            boolean r14 = r3.equals(r15)
            if (r14 == 0) goto L_0x02ac
            b.i.a.f$d0$c r2 = b.i.a.f.d0.c.Round
            goto L_0x02b6
        L_0x02ac:
            java.lang.String r14 = "square"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x02b6
            b.i.a.f$d0$c r2 = b.i.a.f.d0.c.Square
        L_0x02b6:
            r13.f1105o = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 64
            goto L_0x05a6
        L_0x02c0:
            b.i.a.f$o r14 = z(r15)     // Catch:{ h -> 0x05a9 }
            r13.s = r14     // Catch:{ h -> 0x05a9 }
            long r14 = r13.f1098h     // Catch:{ h -> 0x05a9 }
            r0 = 1024(0x400, double:5.06E-321)
            goto L_0x0534
        L_0x02cc:
            boolean r14 = r11.equals(r15)
            r0 = 512(0x200, double:2.53E-321)
            if (r14 == 0) goto L_0x02d7
            r13.r = r2
            goto L_0x0333
        L_0x02d7:
            b.i.a.i$i r14 = new b.i.a.i$i
            r14.<init>(r15)
            r14.r()
            boolean r15 = r14.f()
            if (r15 == 0) goto L_0x02e6
            goto L_0x032f
        L_0x02e6:
            b.i.a.f$o r15 = r14.j()
            if (r15 != 0) goto L_0x02ed
            goto L_0x032f
        L_0x02ed:
            boolean r3 = r15.g()
            if (r3 == 0) goto L_0x02f4
            goto L_0x032f
        L_0x02f4:
            float r3 = r15.f1187h
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r15)
        L_0x02fe:
            boolean r15 = r14.f()
            if (r15 != 0) goto L_0x031c
            r14.q()
            b.i.a.f$o r15 = r14.j()
            if (r15 != 0) goto L_0x030e
            goto L_0x032f
        L_0x030e:
            boolean r5 = r15.g()
            if (r5 == 0) goto L_0x0315
            goto L_0x032f
        L_0x0315:
            r4.add(r15)
            float r15 = r15.f1187h
            float r3 = r3 + r15
            goto L_0x02fe
        L_0x031c:
            r14 = 0
            int r14 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r14 != 0) goto L_0x0322
            goto L_0x032f
        L_0x0322:
            int r14 = r4.size()
            b.i.a.f$o[] r14 = new b.i.a.f.o[r14]
            java.lang.Object[] r14 = r4.toArray(r14)
            r2 = r14
            b.i.a.f$o[] r2 = (b.i.a.f.o[]) r2
        L_0x032f:
            r13.r = r2
            if (r2 == 0) goto L_0x05a9
        L_0x0333:
            long r14 = r13.f1098h
            goto L_0x05a6
        L_0x0337:
            b.i.a.f$n0 r14 = D(r15)
            r13.f1102l = r14
            if (r14 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 8
            goto L_0x05a6
        L_0x0345:
            java.lang.Float r14 = C(r15)
            r13.K = r14
            long r14 = r13.f1098h
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            goto L_0x05a6
        L_0x0352:
            boolean r14 = r15.equals(r12)
            if (r14 == 0) goto L_0x035b
            r13.J = r0
            goto L_0x0361
        L_0x035b:
            b.i.a.f$e r14 = r(r15)     // Catch:{ h -> 0x047f }
            r13.J = r14     // Catch:{ h -> 0x047f }
        L_0x0361:
            long r14 = r13.f1098h
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            goto L_0x05a6
        L_0x0368:
            int r14 = r15.indexOf(r1)
            if (r14 >= 0) goto L_0x05a9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            r14.append(r15)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "|visible|hidden|collapse|"
            boolean r14 = r0.contains(r14)
            if (r14 != 0) goto L_0x038a
            goto L_0x05a9
        L_0x038a:
            boolean r14 = r15.equals(r8)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r13.I = r14
            long r14 = r13.f1098h
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            goto L_0x05a6
        L_0x039b:
            java.lang.Float r14 = C(r15)
            r13.R = r14
            long r14 = r13.f1098h
            r0 = 17179869184(0x400000000, double:8.4879831639E-314)
            goto L_0x05a6
        L_0x03aa:
            boolean r14 = r15.equals(r12)
            if (r14 == 0) goto L_0x03b3
            r13.Q = r0
            goto L_0x03b9
        L_0x03b3:
            b.i.a.f$e r14 = r(r15)     // Catch:{ h -> 0x047f }
            r13.Q = r14     // Catch:{ h -> 0x047f }
        L_0x03b9:
            long r14 = r13.f1098h
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x05a6
        L_0x03c2:
            int r14 = r15.hashCode()
            switch(r14) {
                case -1171789332: goto L_0x03f3;
                case -1026963764: goto L_0x03ea;
                case 3387192: goto L_0x03e1;
                case 93826908: goto L_0x03d6;
                case 529818312: goto L_0x03cb;
                default: goto L_0x03c9;
            }
        L_0x03c9:
            r4 = r10
            goto L_0x03fd
        L_0x03cb:
            java.lang.String r14 = "overline"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x03d4
            goto L_0x03c9
        L_0x03d4:
            r4 = r6
            goto L_0x03fd
        L_0x03d6:
            java.lang.String r14 = "blink"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x03df
            goto L_0x03c9
        L_0x03df:
            r4 = r7
            goto L_0x03fd
        L_0x03e1:
            boolean r14 = r15.equals(r11)
            if (r14 != 0) goto L_0x03e8
            goto L_0x03c9
        L_0x03e8:
            r4 = r5
            goto L_0x03fd
        L_0x03ea:
            java.lang.String r14 = "underline"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x03fd
            goto L_0x03c9
        L_0x03f3:
            java.lang.String r14 = "line-through"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x03fc
            goto L_0x03c9
        L_0x03fc:
            r4 = r9
        L_0x03fd:
            switch(r4) {
                case 0: goto L_0x040d;
                case 1: goto L_0x040a;
                case 2: goto L_0x0407;
                case 3: goto L_0x0404;
                case 4: goto L_0x0401;
                default: goto L_0x0400;
            }
        L_0x0400:
            goto L_0x040f
        L_0x0401:
            b.i.a.f$d0$g r2 = b.i.a.f.d0.g.Overline
            goto L_0x040f
        L_0x0404:
            b.i.a.f$d0$g r2 = b.i.a.f.d0.g.Blink
            goto L_0x040f
        L_0x0407:
            b.i.a.f$d0$g r2 = b.i.a.f.d0.g.None
            goto L_0x040f
        L_0x040a:
            b.i.a.f$d0$g r2 = b.i.a.f.d0.g.Underline
            goto L_0x040f
        L_0x040d:
            b.i.a.f$d0$g r2 = b.i.a.f.d0.g.LineThrough
        L_0x040f:
            r13.z = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 131072(0x20000, double:6.47582E-319)
            goto L_0x05a6
        L_0x041a:
            int r14 = r15.hashCode()
            switch(r14) {
                case -1074341483: goto L_0x0437;
                case 100571: goto L_0x042e;
                case 109757538: goto L_0x0423;
                default: goto L_0x0421;
            }
        L_0x0421:
            r4 = r10
            goto L_0x0441
        L_0x0423:
            java.lang.String r14 = "start"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x042c
            goto L_0x0421
        L_0x042c:
            r4 = r5
            goto L_0x0441
        L_0x042e:
            java.lang.String r14 = "end"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x0441
            goto L_0x0421
        L_0x0437:
            java.lang.String r14 = "middle"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x0440
            goto L_0x0421
        L_0x0440:
            r4 = r9
        L_0x0441:
            switch(r4) {
                case 0: goto L_0x044b;
                case 1: goto L_0x0448;
                case 2: goto L_0x0445;
                default: goto L_0x0444;
            }
        L_0x0444:
            goto L_0x044d
        L_0x0445:
            b.i.a.f$d0$f r2 = b.i.a.f.d0.C0042f.Start
            goto L_0x044d
        L_0x0448:
            b.i.a.f$d0$f r2 = b.i.a.f.d0.C0042f.End
            goto L_0x044d
        L_0x044b:
            b.i.a.f$d0$f r2 = b.i.a.f.d0.C0042f.Middle
        L_0x044d:
            r13.B = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 262144(0x40000, double:1.295163E-318)
            goto L_0x05a6
        L_0x0458:
            java.lang.Float r14 = C(r15)
            r13.P = r14
            long r14 = r13.f1098h
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L_0x05a6
        L_0x0467:
            boolean r14 = r15.equals(r12)
            if (r14 == 0) goto L_0x0470
            r13.O = r0
            goto L_0x0476
        L_0x0470:
            b.i.a.f$e r14 = r(r15)     // Catch:{ h -> 0x047f }
            r13.O = r14     // Catch:{ h -> 0x047f }
        L_0x0476:
            long r14 = r13.f1098h
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            goto L_0x05a6
        L_0x047f:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            java.lang.String r14 = "SVGParser"
            android.util.Log.w(r14, r13)
            goto L_0x05a9
        L_0x048b:
            boolean r14 = r15.equals(r11)
            if (r14 != 0) goto L_0x049d
            java.lang.String r14 = "non-scaling-stroke"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x049a
            goto L_0x049f
        L_0x049a:
            b.i.a.f$d0$i r2 = b.i.a.f.d0.i.NonScalingStroke
            goto L_0x049f
        L_0x049d:
            b.i.a.f$d0$i r2 = b.i.a.f.d0.i.None
        L_0x049f:
            r13.S = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            goto L_0x05a6
        L_0x04ac:
            int r14 = r15.hashCode()
            switch(r14) {
                case -1217487446: goto L_0x04d0;
                case -907680051: goto L_0x04c7;
                case 3005871: goto L_0x04be;
                case 466743410: goto L_0x04b5;
                default: goto L_0x04b3;
            }
        L_0x04b3:
            r4 = r10
            goto L_0x04da
        L_0x04b5:
            boolean r14 = r15.equals(r8)
            if (r14 != 0) goto L_0x04bc
            goto L_0x04b3
        L_0x04bc:
            r4 = r7
            goto L_0x04da
        L_0x04be:
            boolean r14 = r15.equals(r3)
            if (r14 != 0) goto L_0x04c5
            goto L_0x04b3
        L_0x04c5:
            r4 = r5
            goto L_0x04da
        L_0x04c7:
            java.lang.String r14 = "scroll"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x04da
            goto L_0x04b3
        L_0x04d0:
            java.lang.String r14 = "hidden"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x04d9
            goto L_0x04b3
        L_0x04d9:
            r4 = r9
        L_0x04da:
            switch(r4) {
                case 0: goto L_0x04e1;
                case 1: goto L_0x04e1;
                case 2: goto L_0x04de;
                case 3: goto L_0x04de;
                default: goto L_0x04dd;
            }
        L_0x04dd:
            goto L_0x04e3
        L_0x04de:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L_0x04e3
        L_0x04e1:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L_0x04e3:
            r13.C = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 524288(0x80000, double:2.590327E-318)
            goto L_0x05a6
        L_0x04ee:
            java.lang.Float r14 = C(r15)
            r13.t = r14
            long r14 = r13.f1098h
            r0 = 2048(0x800, double:1.0118E-320)
            goto L_0x05a6
        L_0x04fa:
            java.lang.String r14 = y(r15)
            r13.N = r14
            long r14 = r13.f1098h
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x05a6
        L_0x0507:
            java.lang.String r14 = "ltr"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x051b
            java.lang.String r14 = "rtl"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x0518
            goto L_0x051d
        L_0x0518:
            b.i.a.f$d0$h r2 = b.i.a.f.d0.h.RTL
            goto L_0x051d
        L_0x051b:
            b.i.a.f$d0$h r2 = b.i.a.f.d0.h.LTR
        L_0x051d:
            r13.A = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
            goto L_0x05a6
        L_0x052a:
            b.i.a.f$e r14 = r(r15)     // Catch:{ h -> 0x05a9 }
            r13.u = r14     // Catch:{ h -> 0x05a9 }
            long r14 = r13.f1098h     // Catch:{ h -> 0x05a9 }
            r0 = 4096(0x1000, double:2.0237E-320)
        L_0x0534:
            long r14 = r14 | r0
            r13.f1098h = r14     // Catch:{ h -> 0x05a9 }
            goto L_0x05a9
        L_0x0539:
            b.i.a.f$d0$a r14 = t(r15)
            r13.M = r14
            long r14 = r13.f1098h
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            goto L_0x05a6
        L_0x0545:
            java.lang.String r14 = y(r15)
            r13.L = r14
            long r14 = r13.f1098h
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            goto L_0x05a6
        L_0x0551:
            boolean r14 = r3.equals(r15)
            if (r14 == 0) goto L_0x0558
            goto L_0x059d
        L_0x0558:
            java.lang.String r14 = "rect("
            boolean r14 = r15.startsWith(r14)
            if (r14 != 0) goto L_0x0561
            goto L_0x059d
        L_0x0561:
            b.i.a.i$i r14 = new b.i.a.i$i
            java.lang.String r15 = r15.substring(r1)
            r14.<init>(r15)
            r14.r()
            b.i.a.f$o r15 = B(r14)
            r14.q()
            b.i.a.f$o r0 = B(r14)
            r14.q()
            b.i.a.f$o r1 = B(r14)
            r14.q()
            b.i.a.f$o r3 = B(r14)
            r14.r()
            r4 = 41
            boolean r4 = r14.d(r4)
            if (r4 != 0) goto L_0x0598
            boolean r14 = r14.f()
            if (r14 != 0) goto L_0x0598
            goto L_0x059d
        L_0x0598:
            b.i.a.f$b r2 = new b.i.a.f$b
            r2.<init>(r15, r0, r1, r3)
        L_0x059d:
            r13.D = r2
            if (r2 == 0) goto L_0x05a9
            long r14 = r13.f1098h
            r0 = 1048576(0x100000, double:5.180654E-318)
        L_0x05a6:
            long r14 = r14 | r0
            r13.f1098h = r14
        L_0x05a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.i.J(b.i.a.f$d0, java.lang.String, java.lang.String):void");
    }

    public static int b(float f2) {
        if (f2 < 0.0f) {
            return 0;
        }
        if (f2 > 255.0f) {
            return 255;
        }
        return Math.round(f2);
    }

    public static int d(float f2, float f3, float f4) {
        float f5 = 0.0f;
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        float f6 = f2 % 360.0f;
        if (i2 < 0) {
            f6 += 360.0f;
        }
        float f7 = f6 / 60.0f;
        float f8 = f3 / 100.0f;
        float f9 = f4 / 100.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        } else if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (f9 >= 0.0f) {
            f5 = f9 > 1.0f ? 1.0f : f9;
        }
        float f10 = f5 <= 0.5f ? (f8 + 1.0f) * f5 : (f5 + f8) - (f8 * f5);
        float f11 = (f5 * 2.0f) - f10;
        return b(e(f11, f10, f7 - 2.0f) * 256.0f) | (b(e(f11, f10, f7 + 2.0f) * 256.0f) << 16) | (b(e(f11, f10, f7) * 256.0f) << 8);
    }

    public static float e(float f2, float f3, float f4) {
        if (f4 < 0.0f) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        return f4 < 1.0f ? b.e.a.a.a.a(f3, f2, f4, f2) : f4 < 3.0f ? f3 : f4 < 4.0f ? b.e.a.a.a.a(4.0f, f4, f3 - f2, f2) : f2;
    }

    public static f.e r(String str) {
        int i2;
        long j2;
        int i3 = 4;
        if (str.charAt(0) == '#') {
            int length = str.length();
            c cVar = null;
            if (1 < length) {
                long j3 = 0;
                int i4 = 1;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    char charAt = str.charAt(i4);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt < 'A' || charAt > 'F') {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j2 = j3 * 16;
                            i2 = charAt - 'a';
                        } else {
                            j2 = j3 * 16;
                            i2 = charAt - 'A';
                        }
                        j3 = j2 + ((long) i2) + 10;
                    } else {
                        j3 = (j3 * 16) + ((long) (charAt - '0'));
                    }
                    if (j3 > 4294967295L) {
                        break;
                    }
                    i4++;
                }
                if (i4 != 1) {
                    cVar = new c(j3, i4);
                }
            }
            if (cVar != null) {
                int i5 = cVar.a;
                if (i5 == 4) {
                    int i6 = (int) cVar.f1061b;
                    int i7 = i6 & 3840;
                    int i8 = i6 & 240;
                    int i9 = i6 & 15;
                    return new f.e(i9 | (i7 << 8) | -16777216 | (i7 << 12) | (i8 << 8) | (i8 << 4) | (i9 << 4));
                } else if (i5 == 5) {
                    int i10 = (int) cVar.f1061b;
                    int i11 = 61440 & i10;
                    int i12 = i10 & 3840;
                    int i13 = i10 & 240;
                    int i14 = i10 & 15;
                    return new f.e((i14 << 24) | (i14 << 28) | (i11 << 8) | (i11 << 4) | (i12 << 4) | i12 | i13 | (i13 >> 4));
                } else if (i5 == 7) {
                    return new f.e(((int) cVar.f1061b) | ViewCompat.MEASURED_STATE_MASK);
                } else {
                    if (i5 == 9) {
                        int i15 = (int) cVar.f1061b;
                        return new f.e((i15 >>> 8) | (i15 << 24));
                    }
                    throw new h(b.e.a.a.a.m("Bad hex colour value: ", str));
                }
            } else {
                throw new h(b.e.a.a.a.m("Bad hex colour value: ", str));
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            boolean startsWith = lowerCase.startsWith("rgba(");
            if (startsWith || lowerCase.startsWith("rgb(")) {
                if (startsWith) {
                    i3 = 5;
                }
                C0045i iVar = new C0045i(str.substring(i3));
                iVar.r();
                float i16 = iVar.i();
                if (!Float.isNaN(i16) && iVar.d('%')) {
                    i16 = (i16 * 256.0f) / 100.0f;
                }
                float c2 = iVar.c(i16);
                if (!Float.isNaN(c2) && iVar.d('%')) {
                    c2 = (c2 * 256.0f) / 100.0f;
                }
                float c3 = iVar.c(c2);
                if (!Float.isNaN(c3) && iVar.d('%')) {
                    c3 = (c3 * 256.0f) / 100.0f;
                }
                if (startsWith) {
                    float c4 = iVar.c(c3);
                    iVar.r();
                    if (!Float.isNaN(c4) && iVar.d(')')) {
                        return new f.e((b(c4 * 256.0f) << 24) | (b(i16) << 16) | (b(c2) << 8) | b(c3));
                    }
                    throw new h(b.e.a.a.a.m("Bad rgba() colour value: ", str));
                }
                iVar.r();
                if (!Float.isNaN(c3) && iVar.d(')')) {
                    return new f.e((b(i16) << 16) | ViewCompat.MEASURED_STATE_MASK | (b(c2) << 8) | b(c3));
                }
                throw new h(b.e.a.a.a.m("Bad rgb() colour value: ", str));
            }
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (startsWith2 || lowerCase.startsWith("hsl(")) {
                if (startsWith2) {
                    i3 = 5;
                }
                C0045i iVar2 = new C0045i(str.substring(i3));
                iVar2.r();
                float i17 = iVar2.i();
                float c5 = iVar2.c(i17);
                if (!Float.isNaN(c5)) {
                    iVar2.d('%');
                }
                float c6 = iVar2.c(c5);
                if (!Float.isNaN(c6)) {
                    iVar2.d('%');
                }
                if (startsWith2) {
                    float c7 = iVar2.c(c6);
                    iVar2.r();
                    if (!Float.isNaN(c7) && iVar2.d(')')) {
                        return new f.e((b(c7 * 256.0f) << 24) | d(i17, c5, c6));
                    }
                    throw new h(b.e.a.a.a.m("Bad hsla() colour value: ", str));
                }
                iVar2.r();
                if (!Float.isNaN(c6) && iVar2.d(')')) {
                    return new f.e(d(i17, c5, c6) | ViewCompat.MEASURED_STATE_MASK);
                }
                throw new h(b.e.a.a.a.m("Bad hsl() colour value: ", str));
            }
            Integer num = c.a.get(lowerCase);
            if (num != null) {
                return new f.e(num.intValue());
            }
            throw new h(b.e.a.a.a.m("Invalid colour keyword: ", lowerCase));
        }
    }

    public static f.n0 s(String str) {
        if (str.equals("none")) {
            return f.e.f1147j;
        }
        if (str.equals("currentColor")) {
            return f.C0043f.f1151h;
        }
        try {
            return r(str);
        } catch (h unused) {
            return null;
        }
    }

    public static f.d0.a t(String str) {
        if ("nonzero".equals(str)) {
            return f.d0.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return f.d0.a.EvenOdd;
        }
        return null;
    }

    public static float u(String str) {
        int length = str.length();
        if (length != 0) {
            return v(str, 0, length);
        }
        throw new h("Invalid float value (empty string)");
    }

    public static float v(String str, int i2, int i3) {
        float a2 = new d().a(str, i2, i3);
        if (!Float.isNaN(a2)) {
            return a2;
        }
        throw new h(b.e.a.a.a.m("Invalid float value: ", str));
    }

    public static List<String> w(String str) {
        C0045i iVar = new C0045i(str);
        ArrayList arrayList = null;
        do {
            String k2 = iVar.k();
            if (k2 == null) {
                k2 = iVar.n(',', true);
            }
            if (k2 == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(k2);
            iVar.q();
        } while (!iVar.f());
        return arrayList;
    }

    public static f.d0.b x(String str) {
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1178781136:
                if (str.equals("italic")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return f.d0.b.Oblique;
            case 1:
                return f.d0.b.Italic;
            case 2:
                return f.d0.b.Normal;
            default:
                return null;
        }
    }

    public static String y(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        return (str.endsWith(")") ? str.substring(4, str.length() - 1) : str.substring(4)).trim();
    }

    public static f.o z(String str) {
        if (str.length() != 0) {
            int length = str.length();
            f.c1 c1Var = f.c1.px;
            char charAt = str.charAt(length - 1);
            if (charAt == '%') {
                length--;
                c1Var = f.c1.percent;
            } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
                length -= 2;
                try {
                    c1Var = f.c1.valueOf(str.substring(length).toLowerCase(Locale.US));
                } catch (IllegalArgumentException unused) {
                    throw new h(b.e.a.a.a.m("Invalid length unit specifier: ", str));
                }
            }
            try {
                return new f.o(v(str, 0, length), c1Var);
            } catch (NumberFormatException e2) {
                throw new h(b.e.a.a.a.m("Invalid length value: ", str), e2);
            }
        } else {
            throw new h("Invalid length value (empty string)");
        }
    }

    public final Map<String, String> F(C0045i iVar) {
        HashMap hashMap = new HashMap();
        iVar.r();
        while (true) {
            String m2 = iVar.m('=');
            if (m2 == null) {
                return hashMap;
            }
            iVar.d('=');
            hashMap.put(m2, iVar.k());
            iVar.r();
        }
    }

    public final Matrix G(String str) {
        String str2 = str;
        Matrix matrix = new Matrix();
        C0045i iVar = new C0045i(str2);
        iVar.r();
        while (!iVar.f()) {
            String str3 = null;
            if (!iVar.f()) {
                int i2 = iVar.f1267b;
                int charAt = iVar.a.charAt(i2);
                while (true) {
                    if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                        int i3 = iVar.f1267b;
                    } else {
                        charAt = iVar.a();
                    }
                }
                int i32 = iVar.f1267b;
                while (iVar.g(charAt)) {
                    charAt = iVar.a();
                }
                if (charAt == 40) {
                    iVar.f1267b++;
                    str3 = iVar.a.substring(i2, i32);
                } else {
                    iVar.f1267b = i2;
                }
            }
            if (str3 != null) {
                char c2 = 65535;
                switch (str3.hashCode()) {
                    case -1081239615:
                        if (str3.equals("matrix")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -925180581:
                        if (str3.equals("rotate")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 109250890:
                        if (str3.equals("scale")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 109493390:
                        if (str3.equals("skewX")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 109493391:
                        if (str3.equals("skewY")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1052832078:
                        if (str3.equals("translate")) {
                            c2 = 5;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        iVar.r();
                        float i4 = iVar.i();
                        iVar.q();
                        float i5 = iVar.i();
                        iVar.q();
                        float i6 = iVar.i();
                        iVar.q();
                        float i7 = iVar.i();
                        iVar.q();
                        float i8 = iVar.i();
                        iVar.q();
                        float i9 = iVar.i();
                        iVar.r();
                        if (!Float.isNaN(i9) && iVar.d(')')) {
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{i4, i6, i8, i5, i7, i9, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat(matrix2);
                            break;
                        } else {
                            throw new h(b.e.a.a.a.m("Invalid transform list: ", str2));
                        }
                    case 1:
                        iVar.r();
                        float i10 = iVar.i();
                        float p2 = iVar.p();
                        float p3 = iVar.p();
                        iVar.r();
                        if (Float.isNaN(i10) || !iVar.d(')')) {
                            throw new h(b.e.a.a.a.m("Invalid transform list: ", str2));
                        } else if (Float.isNaN(p2)) {
                            matrix.preRotate(i10);
                            break;
                        } else if (!Float.isNaN(p3)) {
                            matrix.preRotate(i10, p2, p3);
                            break;
                        } else {
                            throw new h(b.e.a.a.a.m("Invalid transform list: ", str2));
                        }
                    case 2:
                        iVar.r();
                        float i11 = iVar.i();
                        float p4 = iVar.p();
                        iVar.r();
                        if (!Float.isNaN(i11) && iVar.d(')')) {
                            if (!Float.isNaN(p4)) {
                                matrix.preScale(i11, p4);
                                break;
                            } else {
                                matrix.preScale(i11, i11);
                                break;
                            }
                        } else {
                            throw new h(b.e.a.a.a.m("Invalid transform list: ", str2));
                        }
                        break;
                    case 3:
                        iVar.r();
                        float i12 = iVar.i();
                        iVar.r();
                        if (!Float.isNaN(i12) && iVar.d(')')) {
                            matrix.preSkew((float) Math.tan(Math.toRadians((double) i12)), 0.0f);
                            break;
                        } else {
                            throw new h(b.e.a.a.a.m("Invalid transform list: ", str2));
                        }
                        break;
                    case 4:
                        iVar.r();
                        float i13 = iVar.i();
                        iVar.r();
                        if (!Float.isNaN(i13) && iVar.d(')')) {
                            matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) i13)));
                            break;
                        } else {
                            throw new h(b.e.a.a.a.m("Invalid transform list: ", str2));
                        }
                        break;
                    case 5:
                        iVar.r();
                        float i14 = iVar.i();
                        float p5 = iVar.p();
                        iVar.r();
                        if (!Float.isNaN(i14) && iVar.d(')')) {
                            if (!Float.isNaN(p5)) {
                                matrix.preTranslate(i14, p5);
                                break;
                            } else {
                                matrix.preTranslate(i14, 0.0f);
                                break;
                            }
                        } else {
                            throw new h(b.e.a.a.a.m("Invalid transform list: ", str2));
                        }
                        break;
                    default:
                        throw new h(b.e.a.a.a.n("Invalid transform list fn: ", str3, ")"));
                }
                if (iVar.f()) {
                    return matrix;
                }
                iVar.q();
            } else {
                throw new h(b.e.a.a.a.m("Bad transform function encountered in transform list: ", str2));
            }
        }
        return matrix;
    }

    public final void H(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            f fVar = new f((a) null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (ParserConfigurationException e2) {
            throw new h("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new h("SVG parse error", e3);
        } catch (IOException e4) {
            throw new h("Stream error", e4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0116, code lost:
        throw new b.i.a.h("Stream error", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0117, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
        throw new b.i.a.h("XML parser problem", r9);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117 A[ExcHandler: XmlPullParserException (r9v1 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(java.io.InputStream r9, boolean r10) {
        /*
            r8 = this;
            org.xmlpull.v1.XmlPullParser r0 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            b.i.a.i$j r1 = new b.i.a.i$j     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r1.<init>(r8, r0)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-docdecl"
            r3 = 0
            r0.setFeature(r2, r3)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r4 = 1
            r0.setFeature(r2, r4)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2 = 0
            r0.setInput(r9, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x001d:
            if (r2 == r4) goto L_0x010d
            if (r2 == 0) goto L_0x0100
            r5 = 8
            java.lang.String r6 = "SVGParser"
            if (r2 == r5) goto L_0x00d2
            r5 = 10
            if (r2 == r5) goto L_0x00ac
            r5 = 58
            r6 = 2
            if (r2 == r6) goto L_0x0080
            r7 = 3
            if (r2 == r7) goto L_0x0053
            r5 = 4
            if (r2 == r5) goto L_0x0044
            r5 = 5
            if (r2 == r5) goto L_0x003b
            goto L_0x0107
        L_0x003b:
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.N(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x0044:
            int[] r2 = new int[r6]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            char[] r5 = r0.getTextCharacters(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6 = r2[r3]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2 = r2[r4]     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.O(r5, r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x0053:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r6 == 0) goto L_0x0073
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r7 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x0073:
            java.lang.String r5 = r0.getNamespace()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.c(r5, r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x0080:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r6 == 0) goto L_0x00a0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r7 = r0.getPrefix()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r6.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x00a0:
            java.lang.String r5 = r0.getNamespace()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r6 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.L(r5, r6, r2, r1)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x00ac:
            if (r10 == 0) goto L_0x0107
            b.i.a.f r2 = r8.a     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            b.i.a.f$e0 r2 = r2.a     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r2 != 0) goto L_0x0107
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = "<!ENTITY "
            boolean r2 = r2.contains(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            if (r2 == 0) goto L_0x0107
            java.lang.String r10 = "Switching to SAX parser to process entities"
            android.util.Log.d(r6, r10)     // Catch:{ IOException -> 0x00cc, XmlPullParserException -> 0x0117 }
            r9.reset()     // Catch:{ IOException -> 0x00cc, XmlPullParserException -> 0x0117 }
            r8.H(r9)     // Catch:{ IOException -> 0x00cc, XmlPullParserException -> 0x0117 }
            goto L_0x00d1
        L_0x00cc:
            java.lang.String r9 = "Detected internal entity definitions, but could not parse them."
            android.util.Log.w(r6, r9)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x00d1:
            return
        L_0x00d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = "PROC INSTR: "
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            android.util.Log.d(r6, r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            b.i.a.i$i r2 = new b.i.a.i$i     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r5 = r2.l()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.F(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            java.lang.String r2 = "xml-stylesheet"
            r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x0107
        L_0x0100:
            b.i.a.f r2 = new b.i.a.f     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            r8.a = r2     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
        L_0x0107:
            int r2 = r0.nextToken()     // Catch:{ XmlPullParserException -> 0x0117, IOException -> 0x010e }
            goto L_0x001d
        L_0x010d:
            return
        L_0x010e:
            r9 = move-exception
            b.i.a.h r10 = new b.i.a.h
            java.lang.String r0 = "Stream error"
            r10.<init>(r0, r9)
            throw r10
        L_0x0117:
            r9 = move-exception
            b.i.a.h r10 = new b.i.a.h
            java.lang.String r0 = "XML parser problem"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.i.I(java.io.InputStream, boolean):void");
    }

    public final void K(Attributes attributes) {
        f.i0 i0Var = this.f1242b;
        if (i0Var != null) {
            f.b0 b0Var = new f.b0();
            b0Var.a = this.a;
            b0Var.f1183b = i0Var;
            j(b0Var, attributes);
            m(b0Var, attributes);
            this.f1242b.f(b0Var);
            this.f1242b = b0Var;
            return;
        }
        throw new h("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06bd, code lost:
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x071e, code lost:
        r0.d(r7, r8, r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0771, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x078c, code lost:
        r7 = r6;
        r25 = r9;
        r9 = r8;
        r8 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0792, code lost:
        r10 = r6;
        r6 = r7;
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x07b9, code lost:
        r13 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x07d1, code lost:
        r25 = r17;
        r17 = r7;
        r7 = r25;
        r0.b(r17, r18, r6, r9, r14, r7);
        r11 = r28;
        r8 = r9;
        r10 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x07e8, code lost:
        r13 = 0.0f;
        r9 = r8;
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0851, code lost:
        r4.q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0858, code lost:
        if (r4.f() == false) goto L_0x085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x085b, code lost:
        r7 = r4.f1267b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x085f, code lost:
        if (r7 != r4.c) goto L_0x0862;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0862, code lost:
        r7 = r4.a.charAt(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x086a, code lost:
        if (r7 < 'a') goto L_0x0870;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x086e, code lost:
        if (r7 <= 'z') goto L_0x0878;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0872, code lost:
        if (r7 < 'A') goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0876, code lost:
        if (r7 > 'Z') goto L_0x087a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0878, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x087a, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x087b, code lost:
        if (r7 == false) goto L_0x0885;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x087d, code lost:
        r5 = r4.h().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x00e3, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0407, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x05c9, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x0973, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x0c7e, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L(java.lang.String r27, java.lang.String r28, java.lang.String r29, org.xml.sax.Attributes r30) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r30
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r5 = r1.c
            r6 = 1
            if (r5 == 0) goto L_0x0015
            int r0 = r1.d
            int r0 = r0 + r6
            r1.d = r0
            return
        L_0x0015:
            java.lang.String r5 = "http://www.w3.org/2000/svg"
            boolean r5 = r5.equals(r0)
            java.lang.String r7 = ""
            if (r5 != 0) goto L_0x0026
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            int r0 = r28.length()
            if (r0 <= 0) goto L_0x002f
            r0 = r28
            goto L_0x0031
        L_0x002f:
            r0 = r29
        L_0x0031:
            java.util.Map<java.lang.String, b.i.a.i$h> r5 = b.i.a.i.h.N
            java.lang.Object r0 = r5.get(r0)
            b.i.a.i$h r0 = (b.i.a.i.h) r0
            if (r0 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            b.i.a.i$h r0 = b.i.a.i.h.UNSUPPORTED
        L_0x003e:
            int r5 = r0.ordinal()
            java.lang.String r8 = "objectBoundingBox"
            java.lang.String r9 = "userSpaceOnUse"
            r10 = 0
            java.lang.String r11 = "http://www.w3.org/1999/xlink"
            r12 = 26
            r13 = 25
            java.lang.String r14 = "Invalid document. Root element must be <svg>"
            r15 = 0
            switch(r5) {
                case 0: goto L_0x0c12;
                case 1: goto L_0x0be6;
                case 2: goto L_0x0b74;
                case 3: goto L_0x0b0e;
                case 4: goto L_0x0ae5;
                case 5: goto L_0x0adf;
                case 6: goto L_0x0a54;
                case 7: goto L_0x0be6;
                case 8: goto L_0x0a4f;
                case 9: goto L_0x09eb;
                case 10: goto L_0x0986;
                case 11: goto L_0x08c2;
                case 12: goto L_0x08bd;
                case 13: goto L_0x05e4;
                case 14: goto L_0x0503;
                case 15: goto L_0x04d6;
                case 16: goto L_0x04a9;
                case 17: goto L_0x0420;
                case 18: goto L_0x036b;
                case 19: goto L_0x0366;
                case 20: goto L_0x02c7;
                case 21: goto L_0x02c2;
                case 22: goto L_0x0296;
                case 23: goto L_0x026a;
                case 24: goto L_0x023b;
                case 25: goto L_0x01c0;
                case 26: goto L_0x0adf;
                case 27: goto L_0x0146;
                case 28: goto L_0x00fd;
                case 29: goto L_0x005e;
                case 30: goto L_0x0059;
                default: goto L_0x0053;
            }
        L_0x0053:
            r1.c = r6
            r1.d = r6
            goto L_0x0c97
        L_0x0059:
            r1.P(r2)
            goto L_0x0c97
        L_0x005e:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x00f7
            b.i.a.f$d1 r0 = new b.i.a.f$d1
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.o(r0, r2)
            r1.i(r0, r2)
        L_0x007b:
            int r3 = r30.getLength()
            if (r15 >= r3) goto L_0x00ee
            java.lang.String r3 = r2.getValue(r15)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            if (r4 == r13) goto L_0x00d7
            if (r4 == r12) goto L_0x00c0
            switch(r4) {
                case 81: goto L_0x00ab;
                case 82: goto L_0x00a4;
                case 83: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e3
        L_0x009d:
            b.i.a.f$o r3 = z(r3)
            r0.f1145q = r3
            goto L_0x00e3
        L_0x00a4:
            b.i.a.f$o r3 = z(r3)
            r0.f1144p = r3
            goto L_0x00e3
        L_0x00ab:
            b.i.a.f$o r3 = z(r3)
            r0.r = r3
            boolean r3 = r3.g()
            if (r3 != 0) goto L_0x00b8
            goto L_0x00e3
        L_0x00b8:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <use> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x00c0:
            java.lang.String r4 = r2.getURI(r15)
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x00d4
            java.lang.String r4 = r2.getURI(r15)
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x00e3
        L_0x00d4:
            r0.f1143o = r3
            goto L_0x00e3
        L_0x00d7:
            b.i.a.f$o r3 = z(r3)
            r0.s = r3
            boolean r3 = r3.g()
            if (r3 != 0) goto L_0x00e6
        L_0x00e3:
            int r15 = r15 + 1
            goto L_0x007b
        L_0x00e6:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <use> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x00ee:
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x00f7:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x00fd:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0140
            boolean r0 = r0 instanceof b.i.a.f.x0
            if (r0 == 0) goto L_0x0138
            b.i.a.f$u0 r0 = new b.i.a.f$u0
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.i(r0, r2)
            r1.n(r0, r2)
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            b.i.a.f$i0 r2 = r0.f1183b
            boolean r3 = r2 instanceof b.i.a.f.a1
            if (r3 == 0) goto L_0x012e
            b.i.a.f$a1 r2 = (b.i.a.f.a1) r2
            goto L_0x0134
        L_0x012e:
            b.i.a.f$w0 r2 = (b.i.a.f.w0) r2
            b.i.a.f$a1 r2 = r2.k()
        L_0x0134:
            r0.r = r2
            goto L_0x0c97
        L_0x0138:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."
            r0.<init>(r2)
            throw r0
        L_0x0140:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0146:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r0 instanceof b.i.a.f.x0
            if (r0 == 0) goto L_0x01b2
            b.i.a.f$t0 r0 = new b.i.a.f$t0
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.i(r0, r2)
        L_0x0164:
            int r3 = r30.getLength()
            if (r15 >= r3) goto L_0x019a
            java.lang.String r3 = r2.getValue(r15)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            if (r4 == r12) goto L_0x0181
            goto L_0x0197
        L_0x0181:
            java.lang.String r4 = r2.getURI(r15)
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0195
            java.lang.String r4 = r2.getURI(r15)
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x0197
        L_0x0195:
            r0.f1207n = r3
        L_0x0197:
            int r15 = r15 + 1
            goto L_0x0164
        L_0x019a:
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            b.i.a.f$i0 r2 = r0.f1183b
            boolean r3 = r2 instanceof b.i.a.f.a1
            if (r3 == 0) goto L_0x01a8
            b.i.a.f$a1 r2 = (b.i.a.f.a1) r2
            goto L_0x01ae
        L_0x01a8:
            b.i.a.f$w0 r2 = (b.i.a.f.w0) r2
            b.i.a.f$a1 r2 = r2.k()
        L_0x01ae:
            r0.f1208o = r2
            goto L_0x0c97
        L_0x01b2:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."
            r0.<init>(r2)
            throw r0
        L_0x01ba:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x01c0:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0235
            b.i.a.f$y0 r0 = new b.i.a.f$y0
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.i(r0, r2)
        L_0x01da:
            int r3 = r30.getLength()
            if (r15 >= r3) goto L_0x021b
            java.lang.String r3 = r2.getValue(r15)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            if (r4 == r12) goto L_0x0202
            r5 = 61
            if (r4 == r5) goto L_0x01fb
            goto L_0x0218
        L_0x01fb:
            b.i.a.f$o r3 = z(r3)
            r0.f1216o = r3
            goto L_0x0218
        L_0x0202:
            java.lang.String r4 = r2.getURI(r15)
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x0216
            java.lang.String r4 = r2.getURI(r15)
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x0218
        L_0x0216:
            r0.f1215n = r3
        L_0x0218:
            int r15 = r15 + 1
            goto L_0x01da
        L_0x021b:
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            b.i.a.f$i0 r2 = r0.f1183b
            boolean r3 = r2 instanceof b.i.a.f.a1
            if (r3 == 0) goto L_0x022b
            b.i.a.f$a1 r2 = (b.i.a.f.a1) r2
            goto L_0x0231
        L_0x022b:
            b.i.a.f$w0 r2 = (b.i.a.f.w0) r2
            b.i.a.f$a1 r2 = r2.k()
        L_0x0231:
            r0.f1217p = r2
            goto L_0x0c97
        L_0x0235:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x023b:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0264
            b.i.a.f$v0 r0 = new b.i.a.f$v0
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.o(r0, r2)
            r1.i(r0, r2)
            r1.n(r0, r2)
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x0264:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x026a:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0290
            b.i.a.f$s0 r0 = new b.i.a.f$s0
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.i(r0, r2)
            r1.p(r0, r2)
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x0290:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0296:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x02bc
            b.i.a.f$r0 r0 = new b.i.a.f$r0
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.o(r0, r2)
            r1.i(r0, r2)
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x02bc:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x02c2:
            r1.M(r2)
            goto L_0x0c97
        L_0x02c7:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0360
            boolean r3 = r0 instanceof b.i.a.f.i
            if (r3 == 0) goto L_0x0358
            b.i.a.f$c0 r3 = new b.i.a.f$c0
            r3.<init>()
            b.i.a.f r4 = r1.a
            r3.a = r4
            r3.f1183b = r0
            r1.j(r3, r2)
            r1.m(r3, r2)
            r0 = r15
        L_0x02e1:
            int r4 = r30.getLength()
            if (r0 >= r4) goto L_0x034f
            java.lang.String r4 = r2.getValue(r0)
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = r2.getLocalName(r0)
            b.i.a.i$g r5 = b.i.a.i.g.d(r5)
            int r5 = r5.ordinal()
            r7 = 39
            if (r5 == r7) goto L_0x0300
            goto L_0x0337
        L_0x0300:
            int r5 = r4.length()
            if (r5 == 0) goto L_0x0347
            int r5 = r4.length()
            int r7 = r4.length()
            int r7 = r7 - r6
            char r7 = r4.charAt(r7)
            r8 = 37
            if (r7 != r8) goto L_0x031b
            int r5 = r5 + -1
            r7 = r6
            goto L_0x031c
        L_0x031b:
            r7 = r15
        L_0x031c:
            float r5 = v(r4, r15, r5)     // Catch:{ NumberFormatException -> 0x033a }
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r7 == 0) goto L_0x0325
            float r5 = r5 / r8
        L_0x0325:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x032b
            r8 = r10
            goto L_0x0331
        L_0x032b:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0330
            goto L_0x0331
        L_0x0330:
            r8 = r5
        L_0x0331:
            java.lang.Float r4 = java.lang.Float.valueOf(r8)     // Catch:{ NumberFormatException -> 0x033a }
            r3.f1086h = r4
        L_0x0337:
            int r0 = r0 + 1
            goto L_0x02e1
        L_0x033a:
            r0 = move-exception
            b.i.a.h r2 = new b.i.a.h
            java.lang.String r3 = "Invalid offset value in <stop>: "
            java.lang.String r3 = b.e.a.a.a.m(r3, r4)
            r2.<init>(r3, r0)
            throw r2
        L_0x0347:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid offset value in <stop> (empty string)"
            r0.<init>(r2)
            throw r0
        L_0x034f:
            b.i.a.f$i0 r0 = r1.f1242b
            r0.f(r3)
            r1.f1242b = r3
            goto L_0x0c97
        L_0x0358:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."
            r0.<init>(r2)
            throw r0
        L_0x0360:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0366:
            r1.K(r2)
            goto L_0x0c97
        L_0x036b:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x041a
            b.i.a.f$a0 r3 = new b.i.a.f$a0
            r3.<init>()
            b.i.a.f r4 = r1.a
            r3.a = r4
            r3.f1183b = r0
            r1.j(r3, r2)
            r1.m(r3, r2)
            r1.o(r3, r2)
            r1.i(r3, r2)
        L_0x0386:
            int r0 = r30.getLength()
            if (r15 >= r0) goto L_0x0413
            java.lang.String r0 = r2.getValue(r15)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            if (r4 == r13) goto L_0x03fb
            r5 = 56
            if (r4 == r5) goto L_0x03e6
            r5 = 57
            if (r4 == r5) goto L_0x03d1
            switch(r4) {
                case 81: goto L_0x03bc;
                case 82: goto L_0x03b5;
                case 83: goto L_0x03ae;
                default: goto L_0x03ad;
            }
        L_0x03ad:
            goto L_0x0407
        L_0x03ae:
            b.i.a.f$o r0 = z(r0)
            r3.f1080p = r0
            goto L_0x0407
        L_0x03b5:
            b.i.a.f$o r0 = z(r0)
            r3.f1079o = r0
            goto L_0x0407
        L_0x03bc:
            b.i.a.f$o r0 = z(r0)
            r3.f1081q = r0
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x03c9
            goto L_0x0407
        L_0x03c9:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <rect> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x03d1:
            b.i.a.f$o r0 = z(r0)
            r3.t = r0
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x03de
            goto L_0x0407
        L_0x03de:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <rect> element. ry cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x03e6:
            b.i.a.f$o r0 = z(r0)
            r3.s = r0
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x03f3
            goto L_0x0407
        L_0x03f3:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <rect> element. rx cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x03fb:
            b.i.a.f$o r0 = z(r0)
            r3.r = r0
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x040b
        L_0x0407:
            int r15 = r15 + 1
            goto L_0x0386
        L_0x040b:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <rect> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0413:
            b.i.a.f$i0 r0 = r1.f1242b
            r0.f(r3)
            goto L_0x0c97
        L_0x041a:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0420:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x04a3
            b.i.a.f$p0 r0 = new b.i.a.f$p0
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.k(r0, r2)
        L_0x043a:
            int r3 = r30.getLength()
            if (r15 >= r3) goto L_0x049a
            java.lang.String r3 = r2.getValue(r15)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            r5 = 6
            if (r4 == r5) goto L_0x0491
            r5 = 7
            if (r4 == r5) goto L_0x048a
            r5 = 11
            if (r4 == r5) goto L_0x0483
            r5 = 12
            if (r4 == r5) goto L_0x047c
            r5 = 49
            if (r4 == r5) goto L_0x0467
            goto L_0x0497
        L_0x0467:
            b.i.a.f$o r3 = z(r3)
            r0.f1195o = r3
            boolean r3 = r3.g()
            if (r3 != 0) goto L_0x0474
            goto L_0x0497
        L_0x0474:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <radialGradient> element. r cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x047c:
            b.i.a.f$o r3 = z(r3)
            r0.f1197q = r3
            goto L_0x0497
        L_0x0483:
            b.i.a.f$o r3 = z(r3)
            r0.f1196p = r3
            goto L_0x0497
        L_0x048a:
            b.i.a.f$o r3 = z(r3)
            r0.f1194n = r3
            goto L_0x0497
        L_0x0491:
            b.i.a.f$o r3 = z(r3)
            r0.f1193m = r3
        L_0x0497:
            int r15 = r15 + 1
            goto L_0x043a
        L_0x049a:
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x04a3:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x04a9:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x04d0
            b.i.a.f$y r3 = new b.i.a.f$y
            r3.<init>()
            b.i.a.f r4 = r1.a
            r3.a = r4
            r3.f1183b = r0
            r1.j(r3, r2)
            r1.m(r3, r2)
            r1.o(r3, r2)
            r1.i(r3, r2)
            java.lang.String r0 = "polyline"
            r1.l(r3, r2, r0)
            b.i.a.f$i0 r0 = r1.f1242b
            r0.f(r3)
            goto L_0x0c97
        L_0x04d0:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x04d6:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x04fd
            b.i.a.f$z r3 = new b.i.a.f$z
            r3.<init>()
            b.i.a.f r4 = r1.a
            r3.a = r4
            r3.f1183b = r0
            r1.j(r3, r2)
            r1.m(r3, r2)
            r1.o(r3, r2)
            r1.i(r3, r2)
            java.lang.String r0 = "polygon"
            r1.l(r3, r2, r0)
            b.i.a.f$i0 r0 = r1.f1242b
            r0.f(r3)
            goto L_0x0c97
        L_0x04fd:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0503:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x05de
            b.i.a.f$x r0 = new b.i.a.f$x
            r0.<init>()
            b.i.a.f r5 = r1.a
            r0.a = r5
            b.i.a.f$i0 r5 = r1.f1242b
            r0.f1183b = r5
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.i(r0, r2)
            r1.p(r0, r2)
        L_0x0520:
            int r5 = r30.getLength()
            if (r15 >= r5) goto L_0x05d5
            java.lang.String r5 = r2.getValue(r15)
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = r2.getLocalName(r15)
            b.i.a.i$g r6 = b.i.a.i.g.d(r6)
            int r6 = r6.ordinal()
            if (r6 == r13) goto L_0x05bd
            if (r6 == r12) goto L_0x05a6
            switch(r6) {
                case 44: goto L_0x0569;
                case 45: goto L_0x0562;
                case 46: goto L_0x0546;
                default: goto L_0x0541;
            }
        L_0x0541:
            switch(r6) {
                case 81: goto L_0x0591;
                case 82: goto L_0x058a;
                case 83: goto L_0x0583;
                default: goto L_0x0544;
            }
        L_0x0544:
            goto L_0x05c9
        L_0x0546:
            boolean r6 = r8.equals(r5)
            if (r6 == 0) goto L_0x0550
            r0.f1212p = r4
            goto L_0x05c9
        L_0x0550:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x055a
            r0.f1212p = r3
            goto L_0x05c9
        L_0x055a:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid value for attribute patternUnits"
            r0.<init>(r2)
            throw r0
        L_0x0562:
            android.graphics.Matrix r5 = r1.G(r5)
            r0.r = r5
            goto L_0x05c9
        L_0x0569:
            boolean r6 = r8.equals(r5)
            if (r6 == 0) goto L_0x0572
            r0.f1213q = r4
            goto L_0x05c9
        L_0x0572:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x057b
            r0.f1213q = r3
            goto L_0x05c9
        L_0x057b:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid value for attribute patternContentUnits"
            r0.<init>(r2)
            throw r0
        L_0x0583:
            b.i.a.f$o r5 = z(r5)
            r0.t = r5
            goto L_0x05c9
        L_0x058a:
            b.i.a.f$o r5 = z(r5)
            r0.s = r5
            goto L_0x05c9
        L_0x0591:
            b.i.a.f$o r5 = z(r5)
            r0.u = r5
            boolean r5 = r5.g()
            if (r5 != 0) goto L_0x059e
            goto L_0x05c9
        L_0x059e:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <pattern> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x05a6:
            java.lang.String r6 = r2.getURI(r15)
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L_0x05ba
            java.lang.String r6 = r2.getURI(r15)
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x05c9
        L_0x05ba:
            r0.w = r5
            goto L_0x05c9
        L_0x05bd:
            b.i.a.f$o r5 = z(r5)
            r0.v = r5
            boolean r5 = r5.g()
            if (r5 != 0) goto L_0x05cd
        L_0x05c9:
            int r15 = r15 + 1
            goto L_0x0520
        L_0x05cd:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <pattern> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x05d5:
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x05de:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x05e4:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x08b7
            b.i.a.f$u r3 = new b.i.a.f$u
            r3.<init>()
            b.i.a.f r4 = r1.a
            r3.a = r4
            r3.f1183b = r0
            r1.j(r3, r2)
            r1.m(r3, r2)
            r1.o(r3, r2)
            r1.i(r3, r2)
        L_0x05ff:
            int r0 = r30.getLength()
            if (r15 >= r0) goto L_0x08b0
            java.lang.String r0 = r2.getValue(r15)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            r5 = 13
            if (r4 == r5) goto L_0x063f
            r5 = 43
            if (r4 == r5) goto L_0x0623
            goto L_0x08ac
        L_0x0623:
            float r0 = u(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.f1210p = r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0637
            goto L_0x08ac
        L_0x0637:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <path> element. pathLength cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x063f:
            b.i.a.i$i r4 = new b.i.a.i$i
            r4.<init>(r0)
            b.i.a.f$v r0 = new b.i.a.f$v
            r0.<init>()
            boolean r5 = r4.f()
            if (r5 == 0) goto L_0x0651
            goto L_0x08a8
        L_0x0651:
            java.lang.Integer r5 = r4.h()
            int r5 = r5.intValue()
            r6 = 77
            r7 = 109(0x6d, float:1.53E-43)
            if (r5 == r6) goto L_0x0663
            if (r5 == r7) goto L_0x0663
            goto L_0x08a8
        L_0x0663:
            r6 = r10
            r8 = r6
            r9 = r8
            r11 = r9
            r12 = r11
            r13 = r12
        L_0x0669:
            r4.r()
            r14 = 108(0x6c, float:1.51E-43)
            r16 = 1073741824(0x40000000, float:2.0)
            switch(r5) {
                case 65: goto L_0x07ee;
                case 67: goto L_0x0796;
                case 72: goto L_0x0774;
                case 76: goto L_0x0754;
                case 77: goto L_0x0723;
                case 81: goto L_0x06f3;
                case 83: goto L_0x06c0;
                case 84: goto L_0x069b;
                case 86: goto L_0x0680;
                case 90: goto L_0x0676;
                case 97: goto L_0x07ee;
                case 99: goto L_0x0796;
                case 104: goto L_0x0774;
                case 108: goto L_0x0754;
                case 109: goto L_0x0723;
                case 113: goto L_0x06f3;
                case 115: goto L_0x06c0;
                case 116: goto L_0x069b;
                case 118: goto L_0x0680;
                case 122: goto L_0x0676;
                default: goto L_0x0673;
            }
        L_0x0673:
            r10 = r13
            goto L_0x08a8
        L_0x0676:
            r6 = 8
            r0.f(r6)
            r6 = r11
            r10 = r6
            r7 = r12
            goto L_0x0771
        L_0x0680:
            float r7 = r4.i()
            boolean r9 = java.lang.Float.isNaN(r7)
            if (r9 == 0) goto L_0x0691
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0890
        L_0x0691:
            r9 = 118(0x76, float:1.65E-43)
            if (r5 != r9) goto L_0x0696
            float r7 = r7 + r8
        L_0x0696:
            r0.e(r10, r7)
            goto L_0x0771
        L_0x069b:
            float r7 = r10 * r16
            float r7 = r7 - r6
            float r16 = r16 * r8
            float r16 = r16 - r9
            float r6 = r4.i()
            float r9 = r4.c(r6)
            boolean r14 = java.lang.Float.isNaN(r9)
            if (r14 == 0) goto L_0x06b7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0890
        L_0x06b7:
            r13 = 116(0x74, float:1.63E-43)
            if (r5 != r13) goto L_0x06bd
            float r6 = r6 + r10
            float r9 = r9 + r8
        L_0x06bd:
            r8 = r16
            goto L_0x071e
        L_0x06c0:
            float r7 = r10 * r16
            float r7 = r7 - r6
            float r16 = r16 * r8
            float r16 = r16 - r9
            float r6 = r4.i()
            float r9 = r4.c(r6)
            float r14 = r4.c(r9)
            float r17 = r4.c(r14)
            boolean r18 = java.lang.Float.isNaN(r17)
            if (r18 == 0) goto L_0x06e4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0890
        L_0x06e4:
            r13 = 115(0x73, float:1.61E-43)
            if (r5 != r13) goto L_0x06ed
            float r14 = r14 + r10
            float r17 = r17 + r8
            float r6 = r6 + r10
            float r9 = r9 + r8
        L_0x06ed:
            r28 = r11
            r18 = r16
            goto L_0x07d1
        L_0x06f3:
            float r6 = r4.i()
            float r7 = r4.c(r6)
            float r9 = r4.c(r7)
            float r13 = r4.c(r9)
            boolean r14 = java.lang.Float.isNaN(r13)
            if (r14 == 0) goto L_0x0710
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x07b9
        L_0x0710:
            r14 = 113(0x71, float:1.58E-43)
            if (r5 != r14) goto L_0x0718
            float r9 = r9 + r10
            float r13 = r13 + r8
            float r6 = r6 + r10
            float r7 = r7 + r8
        L_0x0718:
            r16 = r7
            r7 = r6
            r6 = r9
            r9 = r13
            goto L_0x06bd
        L_0x071e:
            r0.d(r7, r8, r6, r9)
            goto L_0x0792
        L_0x0723:
            float r6 = r4.i()
            float r9 = r4.c(r6)
            boolean r11 = java.lang.Float.isNaN(r9)
            if (r11 == 0) goto L_0x0738
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x07b9
        L_0x0738:
            if (r5 != r7) goto L_0x0745
            int r11 = r0.f1211b
            if (r11 != 0) goto L_0x0740
            r11 = 1
            goto L_0x0741
        L_0x0740:
            r11 = 0
        L_0x0741:
            if (r11 != 0) goto L_0x0745
            float r6 = r6 + r10
            float r9 = r9 + r8
        L_0x0745:
            r11 = r6
            r8 = r9
            r0.a(r11, r8)
            if (r5 != r7) goto L_0x074e
            r5 = r14
            goto L_0x0750
        L_0x074e:
            r5 = 76
        L_0x0750:
            r9 = r8
            r12 = r9
            r6 = r11
            goto L_0x078c
        L_0x0754:
            float r6 = r4.i()
            float r7 = r4.c(r6)
            boolean r9 = java.lang.Float.isNaN(r7)
            if (r9 == 0) goto L_0x0768
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x07b9
        L_0x0768:
            if (r5 != r14) goto L_0x076c
            float r6 = r6 + r10
            float r7 = r7 + r8
        L_0x076c:
            r10 = r6
            r0.e(r10, r7)
            r6 = r10
        L_0x0771:
            r8 = r7
            goto L_0x07e8
        L_0x0774:
            float r6 = r4.i()
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 == 0) goto L_0x0784
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x07b9
        L_0x0784:
            r7 = 104(0x68, float:1.46E-43)
            if (r5 != r7) goto L_0x0789
            float r6 = r6 + r10
        L_0x0789:
            r0.e(r6, r8)
        L_0x078c:
            r7 = r6
            r25 = r9
            r9 = r8
            r8 = r25
        L_0x0792:
            r10 = r6
            r6 = r7
            r7 = r9
            goto L_0x07e8
        L_0x0796:
            float r6 = r4.i()
            float r7 = r4.c(r6)
            float r9 = r4.c(r7)
            float r13 = r4.c(r9)
            float r14 = r4.c(r13)
            float r16 = r4.c(r14)
            boolean r17 = java.lang.Float.isNaN(r16)
            if (r17 == 0) goto L_0x07bc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x07b9:
            r13 = 0
            goto L_0x0890
        L_0x07bc:
            r28 = r11
            r11 = 99
            if (r5 != r11) goto L_0x07c9
            float r14 = r14 + r10
            float r16 = r16 + r8
            float r6 = r6 + r10
            float r7 = r7 + r8
            float r9 = r9 + r10
            float r13 = r13 + r8
        L_0x07c9:
            r8 = r7
            r17 = r16
            r7 = r6
            r6 = r9
            r9 = r13
            r18 = r8
        L_0x07d1:
            r25 = r17
            r17 = r7
            r7 = r25
            r16 = r0
            r19 = r6
            r20 = r9
            r21 = r14
            r22 = r7
            r16.b(r17, r18, r19, r20, r21, r22)
            r11 = r28
            r8 = r9
            r10 = r14
        L_0x07e8:
            r9 = 0
            r13 = r9
            r9 = r8
            r8 = r7
            goto L_0x0851
        L_0x07ee:
            r28 = r11
            float r6 = r4.i()
            float r7 = r4.c(r6)
            float r19 = r4.c(r7)
            java.lang.Float r9 = java.lang.Float.valueOf(r19)
            java.lang.Boolean r9 = r4.b(r9)
            java.lang.Boolean r11 = r4.b(r9)
            if (r11 != 0) goto L_0x080d
            r13 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0814
        L_0x080d:
            r4.q()
            float r13 = r4.i()
        L_0x0814:
            float r14 = r4.c(r13)
            boolean r16 = java.lang.Float.isNaN(r14)
            r24 = 0
            if (r16 != 0) goto L_0x0889
            int r16 = (r6 > r24 ? 1 : (r6 == r24 ? 0 : -1))
            if (r16 < 0) goto L_0x0889
            int r16 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r16 >= 0) goto L_0x082a
            goto L_0x0889
        L_0x082a:
            r29 = r12
            r12 = 97
            if (r5 != r12) goto L_0x0832
            float r13 = r13 + r10
            float r14 = r14 + r8
        L_0x0832:
            boolean r20 = r9.booleanValue()
            boolean r21 = r11.booleanValue()
            r16 = r0
            r17 = r6
            r18 = r7
            r22 = r13
            r23 = r14
            r16.c(r17, r18, r19, r20, r21, r22, r23)
            r11 = r28
            r12 = r29
            r6 = r13
            r10 = r6
            r8 = r14
            r9 = r8
            r13 = r24
        L_0x0851:
            r4.q()
            boolean r7 = r4.f()
            if (r7 == 0) goto L_0x085b
            goto L_0x08a9
        L_0x085b:
            int r7 = r4.f1267b
            int r14 = r4.c
            if (r7 != r14) goto L_0x0862
            goto L_0x087a
        L_0x0862:
            java.lang.String r14 = r4.a
            char r7 = r14.charAt(r7)
            r14 = 97
            if (r7 < r14) goto L_0x0870
            r14 = 122(0x7a, float:1.71E-43)
            if (r7 <= r14) goto L_0x0878
        L_0x0870:
            r14 = 65
            if (r7 < r14) goto L_0x087a
            r14 = 90
            if (r7 > r14) goto L_0x087a
        L_0x0878:
            r7 = 1
            goto L_0x087b
        L_0x087a:
            r7 = 0
        L_0x087b:
            if (r7 == 0) goto L_0x0885
            java.lang.Integer r5 = r4.h()
            int r5 = r5.intValue()
        L_0x0885:
            r7 = 109(0x6d, float:1.53E-43)
            goto L_0x0669
        L_0x0889:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r13 = r24
        L_0x0890:
            java.lang.String r6 = "Bad path coords for "
            r4.append(r6)
            char r5 = (char) r5
            r4.append(r5)
            java.lang.String r5 = " path segment"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "SVGParser"
            android.util.Log.e(r5, r4)
            goto L_0x08a9
        L_0x08a8:
            r13 = r10
        L_0x08a9:
            r3.f1209o = r0
            r10 = r13
        L_0x08ac:
            int r15 = r15 + 1
            goto L_0x05ff
        L_0x08b0:
            b.i.a.f$i0 r0 = r1.f1242b
            r0.f(r3)
            goto L_0x0c97
        L_0x08b7:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x08bd:
            r1.g(r2)
            goto L_0x0c97
        L_0x08c2:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0980
            b.i.a.f$q r0 = new b.i.a.f$q
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.i(r0, r2)
            r1.p(r0, r2)
            r3 = 0
        L_0x08e0:
            int r4 = r30.getLength()
            if (r3 >= r4) goto L_0x0977
            java.lang.String r4 = r2.getValue(r3)
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = r2.getLocalName(r3)
            b.i.a.i$g r5 = b.i.a.i.g.d(r5)
            int r5 = r5.ordinal()
            r6 = 41
            if (r5 == r6) goto L_0x095e
            r6 = 50
            if (r5 == r6) goto L_0x0957
            r6 = 51
            if (r5 == r6) goto L_0x0950
            switch(r5) {
                case 32: goto L_0x093b;
                case 33: goto L_0x091f;
                case 34: goto L_0x090a;
                default: goto L_0x0909;
            }
        L_0x0909:
            goto L_0x0973
        L_0x090a:
            b.i.a.f$o r4 = z(r4)
            r0.s = r4
            boolean r4 = r4.g()
            if (r4 != 0) goto L_0x0917
            goto L_0x0973
        L_0x0917:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <marker> element. markerWidth cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x091f:
            java.lang.String r5 = "strokeWidth"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x092b
            r4 = 0
        L_0x0928:
            r0.f1198p = r4
            goto L_0x0973
        L_0x092b:
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0933
            r4 = 1
            goto L_0x0928
        L_0x0933:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid value for attribute markerUnits"
            r0.<init>(r2)
            throw r0
        L_0x093b:
            b.i.a.f$o r4 = z(r4)
            r0.t = r4
            boolean r4 = r4.g()
            if (r4 != 0) goto L_0x0948
            goto L_0x0973
        L_0x0948:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <marker> element. markerHeight cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0950:
            b.i.a.f$o r4 = z(r4)
            r0.r = r4
            goto L_0x0973
        L_0x0957:
            b.i.a.f$o r4 = z(r4)
            r0.f1199q = r4
            goto L_0x0973
        L_0x095e:
            java.lang.String r5 = "auto"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0969
            r4 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x096d
        L_0x0969:
            float r4 = u(r4)
        L_0x096d:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0.u = r4
        L_0x0973:
            int r3 = r3 + 1
            goto L_0x08e0
        L_0x0977:
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x0980:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0986:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x09e5
            b.i.a.f$l0 r0 = new b.i.a.f$l0
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.k(r0, r2)
        L_0x09a0:
            int r3 = r30.getLength()
            if (r15 >= r3) goto L_0x09dc
            java.lang.String r3 = r2.getValue(r15)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            switch(r4) {
                case 84: goto L_0x09d3;
                case 85: goto L_0x09cc;
                case 86: goto L_0x09c5;
                case 87: goto L_0x09be;
                default: goto L_0x09bd;
            }
        L_0x09bd:
            goto L_0x09d9
        L_0x09be:
            b.i.a.f$o r3 = z(r3)
            r0.f1182p = r3
            goto L_0x09d9
        L_0x09c5:
            b.i.a.f$o r3 = z(r3)
            r0.f1181o = r3
            goto L_0x09d9
        L_0x09cc:
            b.i.a.f$o r3 = z(r3)
            r0.f1180n = r3
            goto L_0x09d9
        L_0x09d3:
            b.i.a.f$o r3 = z(r3)
            r0.f1179m = r3
        L_0x09d9:
            int r15 = r15 + 1
            goto L_0x09a0
        L_0x09dc:
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x09e5:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x09eb:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0a49
            b.i.a.f$p r3 = new b.i.a.f$p
            r3.<init>()
            b.i.a.f r4 = r1.a
            r3.a = r4
            r3.f1183b = r0
            r1.j(r3, r2)
            r1.m(r3, r2)
            r1.o(r3, r2)
            r1.i(r3, r2)
        L_0x0a06:
            int r0 = r30.getLength()
            if (r15 >= r0) goto L_0x0a42
            java.lang.String r0 = r2.getValue(r15)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            switch(r4) {
                case 84: goto L_0x0a39;
                case 85: goto L_0x0a32;
                case 86: goto L_0x0a2b;
                case 87: goto L_0x0a24;
                default: goto L_0x0a23;
            }
        L_0x0a23:
            goto L_0x0a3f
        L_0x0a24:
            b.i.a.f$o r0 = z(r0)
            r3.r = r0
            goto L_0x0a3f
        L_0x0a2b:
            b.i.a.f$o r0 = z(r0)
            r3.f1192q = r0
            goto L_0x0a3f
        L_0x0a32:
            b.i.a.f$o r0 = z(r0)
            r3.f1191p = r0
            goto L_0x0a3f
        L_0x0a39:
            b.i.a.f$o r0 = z(r0)
            r3.f1190o = r0
        L_0x0a3f:
            int r15 = r15 + 1
            goto L_0x0a06
        L_0x0a42:
            b.i.a.f$i0 r0 = r1.f1242b
            r0.f(r3)
            goto L_0x0c97
        L_0x0a49:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0a4f:
            r1.f(r2)
            goto L_0x0c97
        L_0x0a54:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0ad9
            b.i.a.f$h r3 = new b.i.a.f$h
            r3.<init>()
            b.i.a.f r4 = r1.a
            r3.a = r4
            r3.f1183b = r0
            r1.j(r3, r2)
            r1.m(r3, r2)
            r1.o(r3, r2)
            r1.i(r3, r2)
        L_0x0a6f:
            int r0 = r30.getLength()
            if (r15 >= r0) goto L_0x0ad2
            java.lang.String r0 = r2.getValue(r15)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            r5 = 6
            if (r4 == r5) goto L_0x0ac9
            r5 = 7
            if (r4 == r5) goto L_0x0ac2
            r5 = 56
            r6 = 57
            if (r4 == r5) goto L_0x0aad
            if (r4 == r6) goto L_0x0a98
            goto L_0x0acf
        L_0x0a98:
            b.i.a.f$o r0 = z(r0)
            r3.r = r0
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0aa5
            goto L_0x0acf
        L_0x0aa5:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <ellipse> element. ry cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0aad:
            b.i.a.f$o r0 = z(r0)
            r3.f1159q = r0
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0aba
            goto L_0x0acf
        L_0x0aba:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <ellipse> element. rx cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0ac2:
            b.i.a.f$o r0 = z(r0)
            r3.f1158p = r0
            goto L_0x0acf
        L_0x0ac9:
            b.i.a.f$o r0 = z(r0)
            r3.f1157o = r0
        L_0x0acf:
            int r15 = r15 + 1
            goto L_0x0a6f
        L_0x0ad2:
            b.i.a.f$i0 r0 = r1.f1242b
            r0.f(r3)
            goto L_0x0c97
        L_0x0ad9:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0adf:
            r1.f1243e = r6
            r1.f = r0
            goto L_0x0c97
        L_0x0ae5:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0b08
            b.i.a.f$g r0 = new b.i.a.f$g
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.o(r0, r2)
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x0b08:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0b0e:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0b6e
            b.i.a.f$d r0 = new b.i.a.f$d
            r0.<init>()
            b.i.a.f r5 = r1.a
            r0.a = r5
            b.i.a.f$i0 r5 = r1.f1242b
            r0.f1183b = r5
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.o(r0, r2)
            r1.i(r0, r2)
        L_0x0b2b:
            int r5 = r30.getLength()
            if (r15 >= r5) goto L_0x0b65
            java.lang.String r5 = r2.getValue(r15)
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = r2.getLocalName(r15)
            b.i.a.i$g r6 = b.i.a.i.g.d(r6)
            int r6 = r6.ordinal()
            r7 = 3
            if (r6 == r7) goto L_0x0b49
            goto L_0x0b5a
        L_0x0b49:
            boolean r6 = r8.equals(r5)
            if (r6 == 0) goto L_0x0b51
            r5 = r4
            goto L_0x0b58
        L_0x0b51:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0b5d
            r5 = r3
        L_0x0b58:
            r0.f1097o = r5
        L_0x0b5a:
            int r15 = r15 + 1
            goto L_0x0b2b
        L_0x0b5d:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid value for attribute clipPathUnits"
            r0.<init>(r2)
            throw r0
        L_0x0b65:
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x0b6e:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0b74:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0be0
            b.i.a.f$c r3 = new b.i.a.f$c
            r3.<init>()
            b.i.a.f r4 = r1.a
            r3.a = r4
            r3.f1183b = r0
            r1.j(r3, r2)
            r1.m(r3, r2)
            r1.o(r3, r2)
            r1.i(r3, r2)
        L_0x0b8f:
            int r0 = r30.getLength()
            if (r15 >= r0) goto L_0x0bd9
            java.lang.String r0 = r2.getValue(r15)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            r5 = 6
            r6 = 7
            r7 = 49
            if (r4 == r5) goto L_0x0bd0
            if (r4 == r6) goto L_0x0bc9
            if (r4 == r7) goto L_0x0bb4
            goto L_0x0bd6
        L_0x0bb4:
            b.i.a.f$o r0 = z(r0)
            r3.f1085q = r0
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0bc1
            goto L_0x0bd6
        L_0x0bc1:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <circle> element. r cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0bc9:
            b.i.a.f$o r0 = z(r0)
            r3.f1084p = r0
            goto L_0x0bd6
        L_0x0bd0:
            b.i.a.f$o r0 = z(r0)
            r3.f1083o = r0
        L_0x0bd6:
            int r15 = r15 + 1
            goto L_0x0b8f
        L_0x0bd9:
            b.i.a.f$i0 r0 = r1.f1242b
            r0.f(r3)
            goto L_0x0c97
        L_0x0be0:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0be6:
            b.i.a.f$i0 r0 = r1.f1242b
            if (r0 == 0) goto L_0x0c0c
            b.i.a.f$l r0 = new b.i.a.f$l
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.o(r0, r2)
            r1.i(r0, r2)
            b.i.a.f$i0 r2 = r1.f1242b
            r2.f(r0)
            r1.f1242b = r0
            goto L_0x0c97
        L_0x0c0c:
            b.i.a.h r0 = new b.i.a.h
            r0.<init>(r14)
            throw r0
        L_0x0c12:
            b.i.a.f$e0 r0 = new b.i.a.f$e0
            r0.<init>()
            b.i.a.f r3 = r1.a
            r0.a = r3
            b.i.a.f$i0 r3 = r1.f1242b
            r0.f1183b = r3
            r1.j(r0, r2)
            r1.m(r0, r2)
            r1.i(r0, r2)
            r1.p(r0, r2)
        L_0x0c2b:
            int r3 = r30.getLength()
            if (r15 >= r3) goto L_0x0c89
            java.lang.String r3 = r2.getValue(r15)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r15)
            b.i.a.i$g r4 = b.i.a.i.g.d(r4)
            int r4 = r4.ordinal()
            if (r4 == r13) goto L_0x0c72
            r5 = 79
            if (r4 == r5) goto L_0x0c7e
            switch(r4) {
                case 81: goto L_0x0c5d;
                case 82: goto L_0x0c56;
                case 83: goto L_0x0c4f;
                default: goto L_0x0c4e;
            }
        L_0x0c4e:
            goto L_0x0c7e
        L_0x0c4f:
            b.i.a.f$o r3 = z(r3)
            r0.f1150q = r3
            goto L_0x0c7e
        L_0x0c56:
            b.i.a.f$o r3 = z(r3)
            r0.f1149p = r3
            goto L_0x0c7e
        L_0x0c5d:
            b.i.a.f$o r3 = z(r3)
            r0.r = r3
            boolean r3 = r3.g()
            if (r3 != 0) goto L_0x0c6a
            goto L_0x0c7e
        L_0x0c6a:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <svg> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0c72:
            b.i.a.f$o r3 = z(r3)
            r0.s = r3
            boolean r3 = r3.g()
            if (r3 != 0) goto L_0x0c81
        L_0x0c7e:
            int r15 = r15 + 1
            goto L_0x0c2b
        L_0x0c81:
            b.i.a.h r0 = new b.i.a.h
            java.lang.String r2 = "Invalid <svg> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0c89:
            b.i.a.f$i0 r2 = r1.f1242b
            if (r2 != 0) goto L_0x0c92
            b.i.a.f r2 = r1.a
            r2.a = r0
            goto L_0x0c95
        L_0x0c92:
            r2.f(r0)
        L_0x0c95:
            r1.f1242b = r0
        L_0x0c97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.i.L(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void M(Attributes attributes) {
        if (this.f1242b != null) {
            String str = "all";
            boolean z = true;
            for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                String trim = attributes.getValue(i2).trim();
                int ordinal = g.d(attributes.getLocalName(i2)).ordinal();
                if (ordinal == 38) {
                    str = trim;
                } else if (ordinal == 77) {
                    z = trim.equals("text/css");
                }
            }
            if (z) {
                b.f fVar = b.f.screen;
                b.d dVar = new b.d(str);
                dVar.r();
                if (b.b(b.d(dVar), fVar)) {
                    this.f1245h = true;
                    return;
                }
            }
            this.c = true;
            this.d = 1;
            return;
        }
        throw new h("Invalid document. Root element must be <svg>");
    }

    public final void N(String str) {
        StringBuilder sb;
        if (!this.c) {
            if (this.f1243e) {
                if (this.f1244g == null) {
                    this.f1244g = new StringBuilder(str.length());
                }
                sb = this.f1244g;
            } else if (this.f1245h) {
                if (this.f1246i == null) {
                    this.f1246i = new StringBuilder(str.length());
                }
                sb = this.f1246i;
            } else if (this.f1242b instanceof f.x0) {
                a(str);
                return;
            } else {
                return;
            }
            sb.append(str);
        }
    }

    public final void O(char[] cArr, int i2, int i3) {
        StringBuilder sb;
        if (!this.c) {
            if (this.f1243e) {
                if (this.f1244g == null) {
                    this.f1244g = new StringBuilder(i3);
                }
                sb = this.f1244g;
            } else if (this.f1245h) {
                if (this.f1246i == null) {
                    this.f1246i = new StringBuilder(i3);
                }
                sb = this.f1246i;
            } else if (this.f1242b instanceof f.x0) {
                a(new String(cArr, i2, i3));
                return;
            } else {
                return;
            }
            sb.append(cArr, i2, i3);
        }
    }

    public final void P(Attributes attributes) {
        if (this.f1242b != null) {
            f.e1 e1Var = new f.e1();
            e1Var.a = this.a;
            e1Var.f1183b = this.f1242b;
            j(e1Var, attributes);
            i(e1Var, attributes);
            p(e1Var, attributes);
            this.f1242b.f(e1Var);
            this.f1242b = e1Var;
            return;
        }
        throw new h("Invalid document. Root element must be <svg>");
    }

    public final void a(String str) {
        f.g0 g0Var = (f.g0) this.f1242b;
        int size = g0Var.f1152i.size();
        f.m0 m0Var = size == 0 ? null : g0Var.f1152i.get(size - 1);
        if (m0Var instanceof f.b1) {
            f.b1 b1Var = (f.b1) m0Var;
            b1Var.c = b.e.a.a.a.q(new StringBuilder(), b1Var.c, str);
            return;
        }
        this.f1242b.f(new f.b1(str));
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                this.c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVar = h.N.get(str2);
            if (hVar == null) {
                hVar = h.UNSUPPORTED;
            }
            switch (hVar.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f1242b = ((f.m0) this.f1242b).f1183b;
                    return;
                case 5:
                case 26:
                    this.f1243e = false;
                    StringBuilder sb = this.f1244g;
                    if (sb != null) {
                        h hVar2 = this.f;
                        if (hVar2 == h.title) {
                            f fVar = this.a;
                            sb.toString();
                            Objects.requireNonNull(fVar);
                        } else if (hVar2 == h.desc) {
                            f fVar2 = this.a;
                            sb.toString();
                            Objects.requireNonNull(fVar2);
                        }
                        this.f1244g.setLength(0);
                        return;
                    }
                    return;
                case 21:
                    StringBuilder sb2 = this.f1246i;
                    if (sb2 != null) {
                        this.f1245h = false;
                        q(sb2.toString());
                        this.f1246i.setLength(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(org.xml.sax.Attributes r6) {
        /*
            r5 = this;
            b.i.a.f$i0 r0 = r5.f1242b
            if (r0 == 0) goto L_0x00a9
            b.i.a.f$n r0 = new b.i.a.f$n
            r0.<init>()
            b.i.a.f r1 = r5.a
            r0.a = r1
            b.i.a.f$i0 r1 = r5.f1242b
            r0.f1183b = r1
            r5.j(r0, r6)
            r5.m(r0, r6)
            r5.o(r0, r6)
            r5.i(r0, r6)
            r1 = 0
        L_0x001e:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L_0x00a1
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r6.getLocalName(r1)
            b.i.a.i$g r3 = b.i.a.i.g.d(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L_0x008a
            r4 = 26
            if (r3 == r4) goto L_0x006f
            r4 = 48
            if (r3 == r4) goto L_0x006b
            switch(r3) {
                case 81: goto L_0x0056;
                case 82: goto L_0x004f;
                case 83: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x0096
        L_0x0048:
            b.i.a.f$o r2 = z(r2)
            r0.f1186q = r2
            goto L_0x0096
        L_0x004f:
            b.i.a.f$o r2 = z(r2)
            r0.f1185p = r2
            goto L_0x0096
        L_0x0056:
            b.i.a.f$o r2 = z(r2)
            r0.r = r2
            boolean r2 = r2.g()
            if (r2 != 0) goto L_0x0063
            goto L_0x0096
        L_0x0063:
            b.i.a.h r6 = new b.i.a.h
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            r6.<init>(r0)
            throw r6
        L_0x006b:
            E(r0, r2)
            goto L_0x0096
        L_0x006f:
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = ""
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0087
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0096
        L_0x0087:
            r0.f1184o = r2
            goto L_0x0096
        L_0x008a:
            b.i.a.f$o r2 = z(r2)
            r0.s = r2
            boolean r2 = r2.g()
            if (r2 != 0) goto L_0x0099
        L_0x0096:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0099:
            b.i.a.h r6 = new b.i.a.h
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            r6.<init>(r0)
            throw r6
        L_0x00a1:
            b.i.a.f$i0 r6 = r5.f1242b
            r6.f(r0)
            r5.f1242b = r0
            return
        L_0x00a9:
            b.i.a.h r6 = new b.i.a.h
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.i.f(org.xml.sax.Attributes):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(org.xml.sax.Attributes r10) {
        /*
            r9 = this;
            b.i.a.f$i0 r0 = r9.f1242b
            if (r0 == 0) goto L_0x00ba
            b.i.a.f$r r0 = new b.i.a.f$r
            r0.<init>()
            b.i.a.f r1 = r9.a
            r0.a = r1
            b.i.a.f$i0 r1 = r9.f1242b
            r0.f1183b = r1
            r9.j(r0, r10)
            r9.m(r0, r10)
            r9.i(r0, r10)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = 0
        L_0x001f:
            int r4 = r10.getLength()
            if (r3 >= r4) goto L_0x00b2
            java.lang.String r4 = r10.getValue(r3)
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = r10.getLocalName(r3)
            b.i.a.i$g r5 = b.i.a.i.g.d(r5)
            int r5 = r5.ordinal()
            r6 = 25
            if (r5 == r6) goto L_0x009a
            r6 = 36
            java.lang.String r7 = "userSpaceOnUse"
            java.lang.String r8 = "objectBoundingBox"
            if (r5 == r6) goto L_0x0080
            r6 = 37
            if (r5 == r6) goto L_0x0066
            switch(r5) {
                case 81: goto L_0x0051;
                case 82: goto L_0x004d;
                case 83: goto L_0x004d;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x00a6
        L_0x004d:
            z(r4)
            goto L_0x00a6
        L_0x0051:
            b.i.a.f$o r4 = z(r4)
            r0.f1203p = r4
            boolean r4 = r4.g()
            if (r4 != 0) goto L_0x005e
            goto L_0x00a6
        L_0x005e:
            b.i.a.h r10 = new b.i.a.h
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            r10.<init>(r0)
            throw r10
        L_0x0066:
            boolean r5 = r8.equals(r4)
            if (r5 == 0) goto L_0x006f
            r0.f1201n = r2
            goto L_0x00a6
        L_0x006f:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0078
            r0.f1201n = r1
            goto L_0x00a6
        L_0x0078:
            b.i.a.h r10 = new b.i.a.h
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            r10.<init>(r0)
            throw r10
        L_0x0080:
            boolean r5 = r8.equals(r4)
            if (r5 == 0) goto L_0x0089
            r0.f1202o = r2
            goto L_0x00a6
        L_0x0089:
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0092
            r0.f1202o = r1
            goto L_0x00a6
        L_0x0092:
            b.i.a.h r10 = new b.i.a.h
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            r10.<init>(r0)
            throw r10
        L_0x009a:
            b.i.a.f$o r4 = z(r4)
            r0.f1204q = r4
            boolean r4 = r4.g()
            if (r4 != 0) goto L_0x00aa
        L_0x00a6:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x00aa:
            b.i.a.h r10 = new b.i.a.h
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            r10.<init>(r0)
            throw r10
        L_0x00b2:
            b.i.a.f$i0 r10 = r9.f1242b
            r10.f(r0)
            r9.f1242b = r0
            return
        L_0x00ba:
            b.i.a.h r10 = new b.i.a.h
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b.i.a.i.g(org.xml.sax.Attributes):void");
    }

    public f h(BufferedInputStream bufferedInputStream, boolean z) {
        if (!bufferedInputStream.markSupported()) {
            bufferedInputStream = new BufferedInputStream(bufferedInputStream);
        }
        try {
            bufferedInputStream.mark(3);
            int read = bufferedInputStream.read() + (bufferedInputStream.read() << 8);
            bufferedInputStream.reset();
            if (read == 35615) {
                bufferedInputStream = new BufferedInputStream(new GZIPInputStream(bufferedInputStream));
            }
        } catch (IOException unused) {
        }
        try {
            bufferedInputStream.mark(4096);
            I(bufferedInputStream, z);
            return this.a;
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public final void i(f.f0 f0Var, Attributes attributes) {
        HashSet hashSet;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int ordinal = g.d(attributes.getLocalName(i2)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        C0045i iVar = new C0045i(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!iVar.f()) {
                            String l2 = iVar.l();
                            hashSet2.add(l2.startsWith("http://www.w3.org/TR/SVG11/feature#") ? l2.substring(35) : "UNSUPPORTED");
                            iVar.r();
                        }
                        f0Var.l(hashSet2);
                        break;
                    case 53:
                        f0Var.b(trim);
                        break;
                    case 54:
                        C0045i iVar2 = new C0045i(trim);
                        HashSet hashSet3 = new HashSet();
                        while (!iVar2.f()) {
                            hashSet3.add(iVar2.l());
                            iVar2.r();
                        }
                        f0Var.g(hashSet3);
                        break;
                    case 55:
                        List<String> w = w(trim);
                        if (w == null) {
                            hashSet = new HashSet(0);
                        }
                        f0Var.i(hashSet);
                        break;
                }
            } else {
                C0045i iVar3 = new C0045i(trim);
                HashSet hashSet4 = new HashSet();
                while (!iVar3.f()) {
                    String l3 = iVar3.l();
                    int indexOf = l3.indexOf(45);
                    if (indexOf != -1) {
                        l3 = l3.substring(0, indexOf);
                    }
                    hashSet4.add(new Locale(l3, "", "").getLanguage());
                    iVar3.r();
                }
                f0Var.j(hashSet4);
            }
        }
    }

    public final void j(f.k0 k0Var, Attributes attributes) {
        Boolean bool;
        int i2 = 0;
        while (i2 < attributes.getLength()) {
            String qName = attributes.getQName(i2);
            if (qName.equals(AnalyticsContext.Device.DEVICE_ID_KEY) || qName.equals("xml:id")) {
                k0Var.c = attributes.getValue(i2).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i2).trim();
                if ("default".equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("preserve".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw new h(b.e.a.a.a.m("Invalid value for \"xml:space\" attribute: ", trim));
                }
                k0Var.d = bool;
                return;
            } else {
                i2++;
            }
        }
    }

    public final void k(f.i iVar, Attributes attributes) {
        Boolean bool;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int ordinal = g.d(attributes.getLocalName(i2)).ordinal();
            if (ordinal == 23) {
                iVar.f1167j = G(trim);
            } else if (ordinal == 24) {
                if ("objectBoundingBox".equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw new h("Invalid value for attribute gradientUnits");
                }
                iVar.f1166i = bool;
            } else if (ordinal != 26) {
                if (ordinal == 60) {
                    try {
                        iVar.f1168k = f.j.valueOf(trim);
                    } catch (IllegalArgumentException unused) {
                        throw new h(b.e.a.a.a.n("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                    }
                }
            } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                iVar.f1169l = trim;
            }
        }
    }

    public final void l(f.y yVar, Attributes attributes, String str) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.d(attributes.getLocalName(i2)) == g.points) {
                C0045i iVar = new C0045i(attributes.getValue(i2));
                ArrayList arrayList = new ArrayList();
                iVar.r();
                while (!iVar.f()) {
                    float i3 = iVar.i();
                    if (!Float.isNaN(i3)) {
                        iVar.q();
                        float i4 = iVar.i();
                        if (!Float.isNaN(i4)) {
                            iVar.q();
                            arrayList.add(Float.valueOf(i3));
                            arrayList.add(Float.valueOf(i4));
                        } else {
                            throw new h(b.e.a.a.a.n("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                        }
                    } else {
                        throw new h(b.e.a.a.a.n("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                }
                yVar.f1214o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    yVar.f1214o[i5] = ((Float) it.next()).floatValue();
                    i5++;
                }
            }
        }
    }

    public final void m(f.k0 k0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            if (trim.length() != 0) {
                int ordinal = g.d(attributes.getLocalName(i2)).ordinal();
                if (ordinal == 0) {
                    b.d dVar = new b.d(trim);
                    ArrayList arrayList = null;
                    while (!dVar.f()) {
                        String l2 = dVar.l();
                        if (l2 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(l2);
                            dVar.r();
                        }
                    }
                    k0Var.f1177g = arrayList;
                } else if (ordinal != 72) {
                    if (k0Var.f1176e == null) {
                        k0Var.f1176e = new f.d0();
                    }
                    J(k0Var.f1176e, attributes.getLocalName(i2), attributes.getValue(i2).trim());
                } else {
                    C0045i iVar = new C0045i(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String m2 = iVar.m(':');
                        iVar.r();
                        if (!iVar.d(':')) {
                            break;
                        }
                        iVar.r();
                        String n2 = iVar.n(';', true);
                        if (n2 == null) {
                            break;
                        }
                        iVar.r();
                        if (iVar.f() || iVar.d(';')) {
                            if (k0Var.f == null) {
                                k0Var.f = new f.d0();
                            }
                            J(k0Var.f, m2, n2);
                            iVar.r();
                        }
                    }
                }
            }
        }
    }

    public final void n(f.z0 z0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int ordinal = g.d(attributes.getLocalName(i2)).ordinal();
            if (ordinal == 9) {
                z0Var.f1220p = A(trim);
            } else if (ordinal == 10) {
                z0Var.f1221q = A(trim);
            } else if (ordinal == 82) {
                z0Var.f1218n = A(trim);
            } else if (ordinal == 83) {
                z0Var.f1219o = A(trim);
            }
        }
    }

    public final void o(f.m mVar, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.d(attributes.getLocalName(i2)) == g.transform) {
                mVar.d(G(attributes.getValue(i2)));
            }
        }
    }

    public final void p(f.q0 q0Var, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int ordinal = g.d(attributes.getLocalName(i2)).ordinal();
            if (ordinal == 48) {
                E(q0Var, trim);
            } else if (ordinal != 80) {
                continue;
            } else {
                C0045i iVar = new C0045i(trim);
                iVar.r();
                float i3 = iVar.i();
                iVar.q();
                float i4 = iVar.i();
                iVar.q();
                float i5 = iVar.i();
                iVar.q();
                float i6 = iVar.i();
                if (Float.isNaN(i3) || Float.isNaN(i4) || Float.isNaN(i5) || Float.isNaN(i6)) {
                    throw new h("Invalid viewBox definition - should have four numbers");
                } else if (i5 < 0.0f) {
                    throw new h("Invalid viewBox. width cannot be negative");
                } else if (i6 >= 0.0f) {
                    q0Var.f1200o = new f.a(i3, i4, i5, i6);
                } else {
                    throw new h("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    public final void q(String str) {
        b bVar = new b(b.f.screen, b.u.Document);
        f fVar = this.a;
        b.d dVar = new b.d(str);
        dVar.r();
        fVar.f1077b.b(bVar.f(dVar));
    }
}
