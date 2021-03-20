package com.karumi.dexter.listener.multi;

import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import java.util.List;

public interface MultiplePermissionsListener {
    void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken);

    void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport);
}
