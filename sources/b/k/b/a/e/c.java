package b.k.b.a.e;

import android.os.AsyncTask;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import e.x.c.i;
import java.io.File;
import java.util.Objects;

public final class c extends AsyncTask<File, Void, File> {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public Object doInBackground(Object[] objArr) {
        int i2;
        File[] fileArr = (File[]) objArr;
        i.f(fileArr, "params");
        d dVar = this.a;
        int i3 = 0;
        File file = fileArr[0];
        Objects.requireNonNull(dVar);
        File file2 = null;
        int i4 = 0;
        File file3 = null;
        while (true) {
            if (file3 != null) {
                file3.delete();
            }
            file3 = dVar.e(file, i3);
            if (file3 == null) {
                if (i3 > 0) {
                    file2 = dVar.e(file, i4);
                }
                return file2;
            }
            if (dVar.d > 0) {
                long length = file3.length() - dVar.d;
                i2 = (length > ((long) 1048576) ? 3 : length > ((long) 512000) ? 2 : 1) + i3;
            } else {
                i2 = i3 + 1;
            }
            if (!dVar.f(file3)) {
                return file3;
            }
            int i5 = i2;
            i4 = i3;
            i3 = i5;
        }
    }

    public void onPostExecute(Object obj) {
        File file;
        File file2 = (File) obj;
        super.onPostExecute(file2);
        if (file2 != null) {
            ImagePickerActivity imagePickerActivity = this.a.a;
            Objects.requireNonNull(imagePickerActivity);
            i.f(file2, "file");
            if (!(imagePickerActivity.f7195i == null || (file = imagePickerActivity.f7198l) == null)) {
                file.delete();
            }
            File file3 = imagePickerActivity.f7199m;
            if (file3 != null) {
                file3.delete();
            }
            imagePickerActivity.f7199m = null;
            imagePickerActivity.b(file2);
            return;
        }
        this.a.b(R.string.error_failed_to_compress_image);
    }
}
