package com.karumi.dexter.listener;

import androidx.annotation.NonNull;
import b.e.a.a.a;

public final class PermissionRequest {
    private final String name;

    public PermissionRequest(@NonNull String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder y = a.y("Permission name: ");
        y.append(this.name);
        return y.toString();
    }
}
