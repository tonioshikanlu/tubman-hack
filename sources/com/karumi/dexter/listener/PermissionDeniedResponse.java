package com.karumi.dexter.listener;

import androidx.annotation.NonNull;

public final class PermissionDeniedResponse {
    private final boolean permanentlyDenied;
    private final PermissionRequest requestedPermission;

    public PermissionDeniedResponse(@NonNull PermissionRequest permissionRequest, boolean z) {
        this.requestedPermission = permissionRequest;
        this.permanentlyDenied = z;
    }

    public static PermissionDeniedResponse from(@NonNull String str, boolean z) {
        return new PermissionDeniedResponse(new PermissionRequest(str), z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PermissionDeniedResponse.class != obj.getClass()) {
            return false;
        }
        return this.requestedPermission.getName().equals(((PermissionDeniedResponse) obj).requestedPermission.getName());
    }

    public String getPermissionName() {
        return this.requestedPermission.getName();
    }

    public PermissionRequest getRequestedPermission() {
        return this.requestedPermission;
    }

    public int hashCode() {
        return this.requestedPermission.getName().hashCode();
    }

    public boolean isPermanentlyDenied() {
        return this.permanentlyDenied;
    }
}
