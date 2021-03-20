package com.karumi.dexter.listener.single;

import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import java.util.Arrays;
import java.util.Collection;

public class CompositePermissionListener implements PermissionListener {
    private final Collection<PermissionListener> listeners;

    public CompositePermissionListener(Collection<PermissionListener> collection) {
        this.listeners = collection;
    }

    public CompositePermissionListener(PermissionListener... permissionListenerArr) {
        this((Collection<PermissionListener>) Arrays.asList(permissionListenerArr));
    }

    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        for (PermissionListener onPermissionDenied : this.listeners) {
            onPermissionDenied.onPermissionDenied(permissionDeniedResponse);
        }
    }

    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
        for (PermissionListener onPermissionGranted : this.listeners) {
            onPermissionGranted.onPermissionGranted(permissionGrantedResponse);
        }
    }

    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        for (PermissionListener onPermissionRationaleShouldBeShown : this.listeners) {
            onPermissionRationaleShouldBeShown.onPermissionRationaleShouldBeShown(permissionRequest, permissionToken);
        }
    }
}
