package b.k.b.a.e;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import e.x.c.i;
import java.io.File;

public final class e extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final String f2377i = e.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final int f2378b;
    public final int c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2379e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public File f2380g;

    /* renamed from: h  reason: collision with root package name */
    public File f2381h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        i.f(imagePickerActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intent intent = imagePickerActivity.getIntent();
        i.b(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.f2378b = extras.getInt("extra.max_width", 0);
            this.c = extras.getInt("extra.max_height", 0);
            this.d = extras.getBoolean("extra.crop", false);
            this.f2379e = extras.getFloat("extra.crop_x", 0.0f);
            this.f = extras.getFloat("extra.crop_y", 0.0f);
            String string = extras.getString("extra.save_directory");
            if (string != null) {
                this.f2381h = new File(string);
                return;
            }
            return;
        }
        i.l();
        throw null;
    }

    public void a() {
        File file = this.f2380g;
        if (file != null) {
            file.delete();
        }
    }
}
