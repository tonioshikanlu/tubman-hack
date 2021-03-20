package b.a.a.g;

import android.net.Uri;
import e.x.c.i;
import java.util.Arrays;

public final class a {
    public final Uri[] a;

    public a(Uri[] uriArr) {
        this.a = uriArr;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && i.a(this.a, ((a) obj).a);
        }
        return true;
    }

    public int hashCode() {
        Uri[] uriArr = this.a;
        if (uriArr != null) {
            return Arrays.hashCode(uriArr);
        }
        return 0;
    }

    public String toString() {
        return b.e.a.a.a.q(b.e.a.a.a.y("AddPictureFromAlbumEvent(results="), Arrays.toString(this.a), ")");
    }
}
