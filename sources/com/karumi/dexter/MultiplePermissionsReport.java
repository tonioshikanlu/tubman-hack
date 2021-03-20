package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class MultiplePermissionsReport {
    private final Set<PermissionDeniedResponse> deniedPermissionResponses = new LinkedHashSet();
    private final Set<PermissionGrantedResponse> grantedPermissionResponses = new LinkedHashSet();

    public boolean addDeniedPermissionResponse(PermissionDeniedResponse permissionDeniedResponse) {
        return this.deniedPermissionResponses.add(permissionDeniedResponse);
    }

    public boolean addGrantedPermissionResponse(PermissionGrantedResponse permissionGrantedResponse) {
        return this.grantedPermissionResponses.add(permissionGrantedResponse);
    }

    public boolean areAllPermissionsGranted() {
        return this.deniedPermissionResponses.isEmpty();
    }

    public void clear() {
        this.grantedPermissionResponses.clear();
        this.deniedPermissionResponses.clear();
    }

    public List<PermissionDeniedResponse> getDeniedPermissionResponses() {
        return new LinkedList(this.deniedPermissionResponses);
    }

    public List<PermissionGrantedResponse> getGrantedPermissionResponses() {
        return new LinkedList(this.grantedPermissionResponses);
    }

    public boolean isAnyPermissionPermanentlyDenied() {
        for (PermissionDeniedResponse isPermanentlyDenied : this.deniedPermissionResponses) {
            if (isPermanentlyDenied.isPermanentlyDenied()) {
                return true;
            }
        }
        return false;
    }
}
