package es.voghdev.pdfviewpager.library.service;

import android.app.IntentService;
import android.content.Intent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class CopyAssetService extends IntentService {
    public CopyAssetService() {
        super("CopyAssetService");
    }

    public void onHandleIntent(Intent intent) {
        if (intent != null && "es.voghdev.pdfviewpager.library.copy_asset".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("es.voghdev.pdfviewpager.library.asset");
            String stringExtra2 = intent.getStringExtra("es.voghdev.pdfviewpager.library.destination_path");
            try {
                InputStream open = getAssets().open(stringExtra);
                new File(stringExtra2).createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(new File(stringExtra2));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        open.close();
                        fileOutputStream.close();
                        return;
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
