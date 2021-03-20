package b.j.a.b.w;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class a {
    public static final int[] c = {8000, 8000, RecyclerView.MAX_SCROLL_DURATION, RecyclerView.MAX_SCROLL_DURATION};
    public static final int[] d = {4000, 4000, 200, 200};
    public final AtomicReferenceArray<byte[]> a = new AtomicReferenceArray<>(4);

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReferenceArray<char[]> f1548b = new AtomicReferenceArray<>(4);

    public final byte[] a(int i2) {
        int i3 = c[i2];
        if (i3 <= 0) {
            i3 = 0;
        }
        byte[] andSet = this.a.getAndSet(i2, (Object) null);
        return (andSet == null || andSet.length < i3) ? new byte[i3] : andSet;
    }

    public char[] b(int i2, int i3) {
        int i4 = d[i2];
        if (i3 < i4) {
            i3 = i4;
        }
        char[] andSet = this.f1548b.getAndSet(i2, (Object) null);
        return (andSet == null || andSet.length < i3) ? new char[i3] : andSet;
    }
}
