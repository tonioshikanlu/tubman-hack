package com.wuman.android.auth;

import androidx.fragment.app.FragmentTransaction;

public class FragmentTransactionCompat {
    public final FragmentTransaction supportFragmentTransaction;

    public FragmentTransactionCompat(FragmentTransaction fragmentTransaction) {
        this.supportFragmentTransaction = fragmentTransaction;
    }

    public Object getFragmentTransaction() {
        FragmentTransaction fragmentTransaction = this.supportFragmentTransaction;
        if (fragmentTransaction != null) {
            return fragmentTransaction;
        }
        return null;
    }
}
