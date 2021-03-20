package n.m0.k.i;

import android.util.Log;
import b.e.a.a.a;
import e.c0.h;
import e.x.c.i;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class d extends Handler {
    public static final d a = new d();

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        int min;
        i.e(logRecord, "record");
        c cVar = c.c;
        String loggerName = logRecord.getLoggerName();
        i.d(loggerName, "record.loggerName");
        int i2 = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        i.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        i.e(loggerName, "loggerName");
        i.e(message, "message");
        String str = c.f10391b.get(loggerName);
        if (str == null) {
            int i3 = 23;
            i.e(loggerName, "$this$take");
            int length = loggerName.length();
            if (23 > length) {
                i3 = length;
            }
            str = loggerName.substring(0, i3);
            i.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(str, i2)) {
            if (thrown != null) {
                StringBuilder B = a.B(message, "\n");
                B.append(Log.getStackTraceString(thrown));
                message = B.toString();
            }
            int length2 = message.length();
            int i4 = 0;
            while (i4 < length2) {
                int k2 = h.k(message, 10, i4, false, 4);
                if (k2 == -1) {
                    k2 = length2;
                }
                while (true) {
                    min = Math.min(k2, i4 + 4000);
                    String substring = message.substring(i4, min);
                    i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i2, str, substring);
                    if (min >= k2) {
                        break;
                    }
                    i4 = min;
                }
                i4 = min + 1;
            }
        }
    }
}
