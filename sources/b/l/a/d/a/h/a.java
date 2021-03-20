package b.l.a.d.a.h;

import android.content.Context;
import android.os.Process;

public final class a {
    static {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        if ("SplitInstallInfoProvider".length() != 0) {
            valueOf.concat("SplitInstallInfoProvider");
        } else {
            new String(valueOf);
        }
    }

    public a(Context context) {
        context.getPackageName();
    }
}
