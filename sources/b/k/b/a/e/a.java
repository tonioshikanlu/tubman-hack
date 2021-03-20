package b.k.b.a.e;

import android.content.ContextWrapper;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import e.x.c.i;
import java.util.Objects;

public abstract class a extends ContextWrapper {
    public final ImagePickerActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        i.f(imagePickerActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.a = imagePickerActivity;
    }

    public void a() {
    }

    public final void b(int i2) {
        String string = getString(i2);
        i.b(string, "getString(errorRes)");
        c(string);
    }

    public final void c(String str) {
        i.f(str, "error");
        a();
        ImagePickerActivity imagePickerActivity = this.a;
        Objects.requireNonNull(imagePickerActivity);
        i.f(str, "message");
        Intent intent = new Intent();
        intent.putExtra("extra.error", str);
        imagePickerActivity.setResult(64, intent);
        imagePickerActivity.finish();
    }

    public final void d() {
        a();
        this.a.c();
    }
}
