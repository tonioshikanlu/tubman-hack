package b.o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class j0 extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k0.b(this, getIntent());
        finish();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        k0.b(this, getIntent());
        finish();
    }
}
