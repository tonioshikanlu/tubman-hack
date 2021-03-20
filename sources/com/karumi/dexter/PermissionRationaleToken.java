package com.karumi.dexter;

public final class PermissionRationaleToken implements PermissionToken {
    private final DexterInstance dexterInstance;
    private boolean isTokenResolved = false;

    public PermissionRationaleToken(DexterInstance dexterInstance2) {
        this.dexterInstance = dexterInstance2;
    }

    public void cancelPermissionRequest() {
        if (!this.isTokenResolved) {
            this.dexterInstance.onCancelPermissionRequest();
            this.isTokenResolved = true;
        }
    }

    public void continuePermissionRequest() {
        if (!this.isTokenResolved) {
            this.dexterInstance.onContinuePermissionRequest();
            this.isTokenResolved = true;
        }
    }
}
