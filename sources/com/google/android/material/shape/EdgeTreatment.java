package com.google.android.material.shape;

import androidx.annotation.NonNull;

public class EdgeTreatment {
    public boolean forceIntersection() {
        return false;
    }

    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        shapePath.lineTo(f, 0.0f);
    }

    @Deprecated
    public void getEdgePath(float f, float f2, @NonNull ShapePath shapePath) {
        getEdgePath(f, f / 2.0f, f2, shapePath);
    }
}
