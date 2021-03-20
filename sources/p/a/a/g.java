package p.a.a;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;

public interface g {

    public static class a implements g {
        public static final boolean a;

        static {
            boolean z;
            try {
                Class.forName("android.util.Log");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            a = z;
        }

        public a(String str) {
        }

        public void a(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(c(level), "EventBus", str);
            }
        }

        public void b(Level level, String str, Throwable th) {
            if (level != Level.OFF) {
                int c = c(level);
                StringBuilder B = b.e.a.a.a.B(str, "\n");
                B.append(Log.getStackTraceString(th));
                Log.println(c, "EventBus", B.toString());
            }
        }

        public int c(Level level) {
            int intValue = level.intValue();
            if (intValue < 800) {
                return intValue < 500 ? 2 : 3;
            }
            if (intValue < 900) {
                return 4;
            }
            return intValue < 1000 ? 5 : 6;
        }
    }

    public static class b implements g {
        public void a(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        public void b(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th);
}
