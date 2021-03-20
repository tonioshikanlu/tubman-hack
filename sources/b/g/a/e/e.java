package b.g.a.e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class e {
    public String a;

    public e(Map<String, Object> map) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (Map map2 : (List) map.get("rules")) {
            if (!((Boolean) map2.get("verified")).booleanValue()) {
                String str2 = (String) map2.get("code");
                str2.hashCode();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -2022676432:
                        if (str2.equals("lengthAtLeast")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -588526889:
                        if (str2.equals("containsAtLeast")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 914712481:
                        if (str2.equals("shouldContain")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1196895272:
                        if (str2.equals("identicalChars")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    str = String.format((String) map2.get("message"), new Object[]{Integer.valueOf(((Double) ((List) map2.get("format")).get(0)).intValue())});
                } else if (c == 1 || c == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map map3 : (List) map2.get("items")) {
                        arrayList2.add((String) map3.get("message"));
                    }
                    String join = TextUtils.join(", ", arrayList2);
                    String str3 = (String) map2.get("message");
                    if (map2.containsKey("format")) {
                        List list = (List) map2.get("format");
                        str3 = String.format(str3, new Object[]{Integer.valueOf(((Double) list.get(0)).intValue()), Integer.valueOf(((Double) list.get(1)).intValue())});
                    }
                    str = String.format("%s %s", new Object[]{str3, join});
                } else if (c == 3) {
                    List list2 = (List) map2.get("format");
                    str = String.format((String) map2.get("message"), new Object[]{Integer.valueOf(((Double) list2.get(0)).intValue()), list2.get(1)});
                }
                arrayList.add(str);
            }
        }
        this.a = TextUtils.join("; ", arrayList);
    }
}
