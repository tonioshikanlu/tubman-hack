package b.l.e;

import java.lang.reflect.Field;
import java.util.Locale;

public enum d implements e {
    IDENTITY {
        public String d(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        public String d(Field field) {
            return d.h(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        public String d(Field field) {
            return d.h(d.e(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        public String d(Field field) {
            return d.e(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        public String d(Field field) {
            return d.e(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        public String d(Field field) {
            return d.e(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* access modifiers changed from: public */
    d(a aVar) {
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String h(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char charAt = str.charAt(i2);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i2 == 0) {
            StringBuilder v = b.e.a.a.a.v(upperCase);
            v.append(str.substring(1));
            return v.toString();
        }
        return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
    }
}
