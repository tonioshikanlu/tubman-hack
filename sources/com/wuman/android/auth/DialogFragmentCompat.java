package com.wuman.android.auth;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(11)
public class DialogFragmentCompat extends FragmentCompat {
    public DialogFragment nativeDialogFragment;
    public androidx.fragment.app.DialogFragment supportDialogFragment;

    public interface BaseDialogFragmentImpl {
        void setDialogFragmentCompat(DialogFragmentCompat dialogFragmentCompat);
    }

    public static class NativeDialogFragmentImpl extends DialogFragment implements BaseDialogFragmentImpl {
        public DialogFragmentCompat mCompat;

        public void onActivityCreated(Bundle bundle) {
            if (getDialog() == null) {
                setShowsDialog(false);
            }
            super.onActivityCreated(bundle);
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat != null) {
                dialogFragmentCompat.onActivityCreated(bundle);
            }
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat != null) {
                dialogFragmentCompat.onCancel(dialogInterface);
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setRetainInstance(true);
        }

        public Dialog onCreateDialog(Bundle bundle) {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat == null) {
                return null;
            }
            return dialogFragmentCompat.onCreateDialog(bundle);
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat == null) {
                return null;
            }
            return dialogFragmentCompat.onCreateView(layoutInflater, viewGroup, bundle);
        }

        public void onDestroy() {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat != null) {
                dialogFragmentCompat.onDestroy();
            }
            super.onDestroy();
        }

        public void onDestroyView() {
            if (getDialog() != null && getRetainInstance()) {
                getDialog().setDismissMessage((Message) null);
            }
            super.onDestroyView();
        }

        public void onViewCreated(View view, Bundle bundle) {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat != null) {
                dialogFragmentCompat.onViewCreated(view, bundle);
            }
        }

        public void setDialogFragmentCompat(DialogFragmentCompat dialogFragmentCompat) {
            this.mCompat = dialogFragmentCompat;
        }
    }

    public static class SupportDialogFragmentImpl extends androidx.fragment.app.DialogFragment implements BaseDialogFragmentImpl {
        public DialogFragmentCompat mCompat;

        public void onActivityCreated(Bundle bundle) {
            if (getDialog() == null) {
                setShowsDialog(false);
            }
            super.onActivityCreated(bundle);
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat != null) {
                dialogFragmentCompat.onActivityCreated(bundle);
            }
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat != null) {
                dialogFragmentCompat.onCancel(dialogInterface);
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setRetainInstance(true);
        }

        public Dialog onCreateDialog(Bundle bundle) {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat == null) {
                return null;
            }
            return dialogFragmentCompat.onCreateDialog(bundle);
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat == null) {
                return null;
            }
            return dialogFragmentCompat.onCreateView(layoutInflater, viewGroup, bundle);
        }

        public void onDestroy() {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat != null) {
                dialogFragmentCompat.onDestroy();
            }
            super.onDestroy();
        }

        public void onDestroyView() {
            if (getDialog() != null && getRetainInstance()) {
                getDialog().setDismissMessage((Message) null);
            }
            super.onDestroyView();
        }

        public void onViewCreated(View view, Bundle bundle) {
            DialogFragmentCompat dialogFragmentCompat = this.mCompat;
            if (dialogFragmentCompat != null) {
                dialogFragmentCompat.onViewCreated(view, bundle);
            }
        }

        public void setDialogFragmentCompat(DialogFragmentCompat dialogFragmentCompat) {
            this.mCompat = dialogFragmentCompat;
        }
    }

    public DialogFragmentCompat(DialogFragment dialogFragment) {
        super((Fragment) dialogFragment);
        this.nativeDialogFragment = dialogFragment;
    }

    public DialogFragmentCompat(androidx.fragment.app.DialogFragment dialogFragment) {
        super((androidx.fragment.app.Fragment) dialogFragment);
        this.supportDialogFragment = dialogFragment;
    }

    public final Dialog getDialog() {
        androidx.fragment.app.DialogFragment dialogFragment = this.supportDialogFragment;
        return dialogFragment != null ? dialogFragment.getDialog() : this.nativeDialogFragment.getDialog();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return this.supportDialogFragment != null ? new Dialog(this.supportDialogFragment.getActivity(), this.supportDialogFragment.getTheme()) : new Dialog(this.nativeDialogFragment.getActivity(), this.nativeDialogFragment.getTheme());
    }
}
