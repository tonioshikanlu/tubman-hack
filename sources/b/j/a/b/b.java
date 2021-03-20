package b.j.a.b;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.material.badge.BadgeDrawable;

public final class b {
    public static final a a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f1372b;

    static {
        a aVar = new a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        a = aVar;
        f1372b = new a(aVar, "MIME-NO-LINEFEEDS", true, '=', (int) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        byte[] bArr = aVar.f1367j;
        System.arraycopy(bArr, 0, new byte[64], 0, bArr.length);
        char[] cArr = aVar.f1366i;
        System.arraycopy(cArr, 0, new char[64], 0, cArr.length);
        int[] iArr = aVar.f1365h;
        System.arraycopy(iArr, 0, new int[128], 0, iArr.length);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        new a("MODIFIED-FOR-URL", sb.toString(), false, 0, (int) ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }
}
