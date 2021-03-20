package b.k.b.a.e;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;

public final class f extends a {
    public static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: b  reason: collision with root package name */
    public final String[] f2382b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(ImagePickerActivity imagePickerActivity) {
        super(imagePickerActivity);
        i.f(imagePickerActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intent intent = imagePickerActivity.getIntent();
        i.b(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String[] stringArray = extras.getStringArray("extra.mime_types");
            this.f2382b = stringArray == null ? new String[0] : stringArray;
            return;
        }
        i.l();
        throw null;
    }

    public final void e() {
        ImagePickerActivity imagePickerActivity = this.a;
        String[] strArr = this.f2382b;
        i.f(imagePickerActivity, BasePayload.CONTEXT_KEY);
        i.f(strArr, "mimeTypes");
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("image/*");
        boolean z = false;
        if (!(strArr.length == 0)) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        intent.addCategory("android.intent.category.OPENABLE");
        if (intent.resolveActivity(imagePickerActivity.getPackageManager()) == null) {
            intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            if (strArr.length == 0) {
                z = true;
            }
            if (!z) {
                intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
            }
        }
        this.a.startActivityForResult(intent, 4261);
    }
}
