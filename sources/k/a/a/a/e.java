package k.a.a.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatDialogFragment;
import k.a.a.a.c;

public abstract class e extends AppCompatDialogFragment {

    /* renamed from: h  reason: collision with root package name */
    public c f8096h;

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        c cVar = this.f8096h;
        if (cVar != null) {
            cVar.f8090g = activity;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = new c(getActivity());
        this.f8096h = cVar;
        cVar.f = 10;
        if (((double) 16.0f) > 1.0d) {
            cVar.f8089e = 16.0f;
            cVar.f8094k = true;
            cVar.d = false;
            cVar.f8093j = false;
            return;
        }
        throw new IllegalArgumentException("Down scale must be strictly greater than 1.0. Found : " + 16.0f);
    }

    public void onDestroyView() {
        if (getDialog() != null) {
            getDialog().setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onDetach() {
        super.onDetach();
        c cVar = this.f8096h;
        c.a aVar = cVar.c;
        if (aVar != null) {
            aVar.cancel(true);
        }
        cVar.c = null;
        cVar.f8090g = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        c cVar = this.f8096h;
        c.a aVar = cVar.c;
        if (aVar != null) {
            aVar.cancel(true);
        }
        ImageView imageView = cVar.a;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).setDuration((long) cVar.f8092i).setInterpolator(new AccelerateInterpolator()).setListener(new b(cVar)).start();
        }
    }

    public void onResume() {
        super.onResume();
        c cVar = this.f8096h;
        boolean retainInstance = getRetainInstance();
        if (cVar.a != null && !retainInstance) {
            return;
        }
        if (cVar.f8090g.getWindow().getDecorView().isShown()) {
            c.a aVar = new c.a((a) null);
            cVar.c = aVar;
            aVar.execute(new Void[0]);
            return;
        }
        cVar.f8090g.getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener(new a(cVar));
    }

    public void onStart() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().clearFlags(2);
            if (dialog.getWindow().getAttributes().windowAnimations == 0) {
                dialog.getWindow().getAttributes().windowAnimations = 2131820771;
            }
        }
        super.onStart();
    }
}
