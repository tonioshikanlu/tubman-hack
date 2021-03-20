package b.k.b.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import b.k.b.a.c.a;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import e.r;
import e.x.b.l;
import e.x.c.i;

public final class b {
    public a a = a.BOTH;

    /* renamed from: b  reason: collision with root package name */
    public String[] f2368b = new String[0];
    public l<? super a, r> c;
    public final Activity d;

    public b(Activity activity) {
        i.f(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.d = activity;
    }

    public final void a(int i2) {
        Intent intent = new Intent(this.d, ImagePickerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra.image_provider", this.a);
        bundle.putStringArray("extra.mime_types", this.f2368b);
        bundle.putBoolean("extra.crop", false);
        bundle.putFloat("extra.crop_x", 0.0f);
        bundle.putFloat("extra.crop_y", 0.0f);
        bundle.putInt("extra.max_width", 0);
        bundle.putInt("extra.max_height", 0);
        bundle.putLong("extra.image_max_size", 0);
        bundle.putString("extra.save_directory", (String) null);
        intent.putExtras(bundle);
        this.d.startActivityForResult(intent, i2);
    }
}
