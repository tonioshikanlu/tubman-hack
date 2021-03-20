package com.wuman.android.auth;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(11)
public class FragmentCompat {
    public Fragment nativeFragment;
    public androidx.fragment.app.Fragment supportFragment;

    public FragmentCompat(Fragment fragment) {
        this.nativeFragment = fragment;
    }

    public FragmentCompat(androidx.fragment.app.Fragment fragment) {
        this.supportFragment = fragment;
    }

    public View getView() {
        androidx.fragment.app.Fragment fragment = this.supportFragment;
        return fragment != null ? fragment.getView() : this.nativeFragment.getView();
    }

    public void onActivityCreated(Bundle bundle) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroy() {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }
}
