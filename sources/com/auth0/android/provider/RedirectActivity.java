package com.auth0.android.provider;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RedirectActivity extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, AuthenticationActivity.class);
        intent.addFlags(603979776);
        if (getIntent() != null) {
            intent.setData(getIntent().getData());
        }
        startActivity(intent);
        finish();
    }
}
