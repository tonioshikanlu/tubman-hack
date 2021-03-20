package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.net.DatagramSocket;
import java.net.Socket;

public final class TrafficStatsCompat {
    private TrafficStatsCompat() {
    }

    @Deprecated
    public static void clearThreadStatsTag() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int getThreadStatsTag() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void incrementOperationCount(int i2) {
        TrafficStats.incrementOperationCount(i2);
    }

    @Deprecated
    public static void incrementOperationCount(int i2, int i3) {
        TrafficStats.incrementOperationCount(i2, i3);
    }

    @Deprecated
    public static void setThreadStatsTag(int i2) {
        TrafficStats.setThreadStatsTag(i2);
    }

    public static void tagDatagramSocket(@NonNull DatagramSocket datagramSocket) {
        TrafficStats.tagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void tagSocket(Socket socket) {
        TrafficStats.tagSocket(socket);
    }

    public static void untagDatagramSocket(@NonNull DatagramSocket datagramSocket) {
        TrafficStats.untagDatagramSocket(datagramSocket);
    }

    @Deprecated
    public static void untagSocket(Socket socket) {
        TrafficStats.untagSocket(socket);
    }
}
