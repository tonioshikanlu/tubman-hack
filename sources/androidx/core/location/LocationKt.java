package androidx.core.location;

import android.location.Location;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/location/Location;", "", "component1", "(Landroid/location/Location;)D", "component2", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class LocationKt {
    public static final double component1(Location location) {
        i.f(location, "$this$component1");
        return location.getLatitude();
    }

    public static final double component2(Location location) {
        i.f(location, "$this$component2");
        return location.getLongitude();
    }
}
