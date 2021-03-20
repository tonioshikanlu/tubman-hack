package com.karumi.dexter.listener;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import b.e.a.a.a;

public class SettingsClickListener implements View.OnClickListener {
    public void onClick(View view) {
        Context context = view.getContext();
        StringBuilder y = a.y("package:");
        y.append(context.getPackageName());
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(y.toString()));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
