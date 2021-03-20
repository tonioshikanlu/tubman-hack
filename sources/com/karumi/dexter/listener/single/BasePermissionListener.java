package com.karumi.dexter.listener.single;

import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;

public class BasePermissionListener implements PermissionListener {
    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
    }

    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
    }

    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        permissionToken.continuePermissionRequest();
    }
}
