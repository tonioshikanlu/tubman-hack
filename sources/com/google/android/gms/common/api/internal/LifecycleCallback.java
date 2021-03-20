package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import b.l.a.c.c.l.k.d2;
import b.l.a.c.c.l.k.g2;
import b.l.a.c.c.l.k.h;
import b.l.a.c.c.l.k.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;

public class LifecycleCallback {
    public final i a;

    public LifecycleCallback(i iVar) {
        this.a = iVar;
    }

    public static i b(h hVar) {
        d2 d2Var;
        g2 g2Var;
        Object obj = hVar.a;
        if (obj instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) obj;
            WeakReference weakReference = g2.f2662k.get(fragmentActivity);
            if (weakReference == null || (g2Var = (g2) weakReference.get()) == null) {
                try {
                    g2Var = (g2) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
                    if (g2Var == null || g2Var.isRemoving()) {
                        g2Var = new g2();
                        fragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment) g2Var, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    g2.f2662k.put(fragmentActivity, new WeakReference(g2Var));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
                }
            }
            return g2Var;
        } else if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            WeakReference weakReference2 = d2.f2628k.get(activity);
            if (weakReference2 == null || (d2Var = (d2) weakReference2.get()) == null) {
                try {
                    d2Var = (d2) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (d2Var == null || d2Var.isRemoving()) {
                        d2Var = new d2();
                        activity.getFragmentManager().beginTransaction().add(d2Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    d2.f2628k.put(activity, new WeakReference(d2Var));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e3);
                }
            }
            return d2Var;
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    @Keep
    private static i getChimeraLifecycleFragmentImpl(h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @MainThread
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @MainThread
    public void c(int i2, int i3, Intent intent) {
    }

    @MainThread
    public void d(Bundle bundle) {
    }

    @MainThread
    public void e(Bundle bundle) {
    }

    @MainThread
    public void f() {
    }

    @MainThread
    public void g() {
    }
}
