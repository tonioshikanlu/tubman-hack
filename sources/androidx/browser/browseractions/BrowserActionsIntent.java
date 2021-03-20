package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrowserActionsIntent {
    public static final String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
    public static final String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
    public static final String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
    public static final int ITEM_COPY = 3;
    public static final int ITEM_DOWNLOAD = 2;
    public static final int ITEM_INVALID_ITEM = -1;
    public static final int ITEM_OPEN_IN_INCOGNITO = 1;
    public static final int ITEM_OPEN_IN_NEW_TAB = 0;
    public static final int ITEM_SHARE = 4;
    public static final String KEY_ACTION = "androidx.browser.browseractions.ACTION";
    public static final String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
    public static final String KEY_TITLE = "androidx.browser.browseractions.TITLE";
    public static final int MAX_CUSTOM_ITEMS = 5;
    private static final String TAG = "BrowserActions";
    private static final String TEST_URL = "https://www.example.com";
    public static final int URL_TYPE_AUDIO = 3;
    public static final int URL_TYPE_FILE = 4;
    public static final int URL_TYPE_IMAGE = 1;
    public static final int URL_TYPE_NONE = 0;
    public static final int URL_TYPE_PLUGIN = 5;
    public static final int URL_TYPE_VIDEO = 2;
    private static BrowserActionsFallDialogListener sDialogListenter;
    @NonNull
    private final Intent mIntent;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public interface BrowserActionsFallDialogListener {
        void onDialogShown();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsItemId {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BrowserActionsUrlType {
    }

    public static final class Builder {
        private Context mContext;
        private final Intent mIntent = new Intent(BrowserActionsIntent.ACTION_BROWSER_ACTIONS_OPEN);
        private ArrayList<Bundle> mMenuItems = null;
        private PendingIntent mOnItemSelectedPendingIntent = null;
        private int mType;
        private Uri mUri;

        public Builder(Context context, Uri uri) {
            this.mContext = context;
            this.mUri = uri;
            this.mType = 0;
            this.mMenuItems = new ArrayList<>();
        }

        private Bundle getBundleFromItem(BrowserActionItem browserActionItem) {
            Bundle bundle = new Bundle();
            bundle.putString(BrowserActionsIntent.KEY_TITLE, browserActionItem.getTitle());
            bundle.putParcelable(BrowserActionsIntent.KEY_ACTION, browserActionItem.getAction());
            if (browserActionItem.getIconId() != 0) {
                bundle.putInt(BrowserActionsIntent.KEY_ICON_ID, browserActionItem.getIconId());
            }
            return bundle;
        }

        public BrowserActionsIntent build() {
            this.mIntent.setData(this.mUri);
            this.mIntent.putExtra(BrowserActionsIntent.EXTRA_TYPE, this.mType);
            this.mIntent.putParcelableArrayListExtra(BrowserActionsIntent.EXTRA_MENU_ITEMS, this.mMenuItems);
            this.mIntent.putExtra(BrowserActionsIntent.EXTRA_APP_ID, PendingIntent.getActivity(this.mContext, 0, new Intent(), 0));
            PendingIntent pendingIntent = this.mOnItemSelectedPendingIntent;
            if (pendingIntent != null) {
                this.mIntent.putExtra(BrowserActionsIntent.EXTRA_SELECTED_ACTION_PENDING_INTENT, pendingIntent);
            }
            return new BrowserActionsIntent(this.mIntent);
        }

        public Builder setCustomItems(ArrayList<BrowserActionItem> arrayList) {
            if (arrayList.size() <= 5) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (TextUtils.isEmpty(arrayList.get(i2).getTitle()) || arrayList.get(i2).getAction() == null) {
                        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                    }
                    this.mMenuItems.add(getBundleFromItem(arrayList.get(i2)));
                }
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        public Builder setCustomItems(BrowserActionItem... browserActionItemArr) {
            return setCustomItems((ArrayList<BrowserActionItem>) new ArrayList(Arrays.asList(browserActionItemArr)));
        }

        public Builder setOnItemSelectedAction(PendingIntent pendingIntent) {
            this.mOnItemSelectedPendingIntent = pendingIntent;
            return this;
        }

        public Builder setUrlType(int i2) {
            this.mType = i2;
            return this;
        }
    }

    public BrowserActionsIntent(@NonNull Intent intent) {
        this.mIntent = intent;
    }

    private static List<ResolveInfo> getBrowserActionsIntentHandlers(Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(ACTION_BROWSER_ACTIONS_OPEN, Uri.parse(TEST_URL)), 131072);
    }

    public static String getCreatorPackageName(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(EXTRA_APP_ID);
        if (pendingIntent != null) {
            return pendingIntent.getCreatorPackage();
        }
        return null;
    }

    public static void launchIntent(Context context, Intent intent) {
        launchIntent(context, intent, getBrowserActionsIntentHandlers(context));
    }

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void launchIntent(Context context, Intent intent, List<ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            openFallbackBrowserActionsMenu(context, intent);
            return;
        }
        int i2 = 0;
        if (list.size() == 1) {
            intent.setPackage(list.get(0).activityInfo.packageName);
        } else {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(TEST_URL)), 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.packageName;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (str.equals(list.get(i2).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ContextCompat.startActivity(context, intent, (Bundle) null);
    }

    public static void openBrowserAction(Context context, Uri uri) {
        launchIntent(context, new Builder(context, uri).build().getIntent());
    }

    public static void openBrowserAction(Context context, Uri uri, int i2, ArrayList<BrowserActionItem> arrayList, PendingIntent pendingIntent) {
        launchIntent(context, new Builder(context, uri).setUrlType(i2).setCustomItems(arrayList).setOnItemSelectedAction(pendingIntent).build().getIntent());
    }

    private static void openFallbackBrowserActionsMenu(Context context, Intent intent) {
        Uri data = intent.getData();
        int intExtra = intent.getIntExtra(EXTRA_TYPE, 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(EXTRA_MENU_ITEMS);
        openFallbackBrowserActionsMenu(context, data, intExtra, parcelableArrayListExtra != null ? parseBrowserActionItems(parcelableArrayListExtra) : null);
    }

    private static void openFallbackBrowserActionsMenu(Context context, Uri uri, int i2, List<BrowserActionItem> list) {
        new BrowserActionsFallbackMenuUi(context, uri, list).displayMenu();
        BrowserActionsFallDialogListener browserActionsFallDialogListener = sDialogListenter;
        if (browserActionsFallDialogListener != null) {
            browserActionsFallDialogListener.onDialogShown();
        }
    }

    public static List<BrowserActionItem> parseBrowserActionItems(ArrayList<Bundle> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bundle bundle = arrayList.get(i2);
            String string = bundle.getString(KEY_TITLE);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(KEY_ACTION);
            int i3 = bundle.getInt(KEY_ICON_ID);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            arrayList2.add(new BrowserActionItem(string, pendingIntent, i3));
        }
        return arrayList2;
    }

    @VisibleForTesting
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void setDialogShownListenter(BrowserActionsFallDialogListener browserActionsFallDialogListener) {
        sDialogListenter = browserActionsFallDialogListener;
    }

    @NonNull
    public Intent getIntent() {
        return this.mIntent;
    }
}
