package com.google.android.material.shape;

import androidx.annotation.NonNull;

public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    public MarkerEdgeTreatment(float f) {
        this.radius = f - 0.001f;
    }

    public boolean forceIntersection() {
        return true;
    }

    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        float sqrt = (float) ((Math.sqrt(2.0d) * ((double) this.radius)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.radius, 2.0d) - Math.pow((double) sqrt, 2.0d));
        shapePath.reset(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.radius)) - ((double) this.radius)))) + sqrt2);
        shapePath.lineTo(f2, (float) (-((Math.sqrt(2.0d) * ((double) this.radius)) - ((double) this.radius))));
        shapePath.lineTo(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.radius)) - ((double) this.radius)))) + sqrt2);
    }
}
