package com.wuman.android.auth;

import android.annotation.TargetApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@TargetApi(11)
public class FragmentManagerCompat {
    public static final Logger LOGGER = Logger.getLogger("OAuthAndroid");
    public FragmentManager supportFragmentManager;

    public FragmentManagerCompat(FragmentManager fragmentManager) {
        this.supportFragmentManager = fragmentManager;
    }

    public <T extends FragmentCompat> T findFragmentByTag(Class<T> cls, String str) {
        try {
            FragmentManager fragmentManager = this.supportFragmentManager;
            Objects.requireNonNull(fragmentManager);
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
            if (findFragmentByTag == null) {
                return null;
            }
            return (FragmentCompat) cls.getDeclaredMethod("newInstance", new Class[]{Object.class}).invoke((Object) null, new Object[]{findFragmentByTag});
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
            LOGGER.log(Level.WARNING, "Unable to perform findFragmentByTag()", e2);
            return null;
        }
    }
}
