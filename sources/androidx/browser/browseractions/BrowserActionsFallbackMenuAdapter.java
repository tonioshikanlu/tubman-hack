package androidx.browser.browseractions;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.R;
import androidx.core.content.res.ResourcesCompat;
import java.util.List;

public class BrowserActionsFallbackMenuAdapter extends BaseAdapter {
    private final Context mContext;
    private final List<BrowserActionItem> mMenuItems;

    public static class ViewHolderItem {
        public ImageView mIcon;
        public TextView mText;
    }

    public BrowserActionsFallbackMenuAdapter(List<BrowserActionItem> list, Context context) {
        this.mMenuItems = list;
        this.mContext = context;
    }

    public int getCount() {
        return this.mMenuItems.size();
    }

    public Object getItem(int i2) {
        return this.mMenuItems.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        ViewHolderItem viewHolderItem;
        BrowserActionItem browserActionItem = this.mMenuItems.get(i2);
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.browser_actions_context_menu_row, (ViewGroup) null);
            viewHolderItem = new ViewHolderItem();
            viewHolderItem.mIcon = (ImageView) view.findViewById(R.id.browser_actions_menu_item_icon);
            viewHolderItem.mText = (TextView) view.findViewById(R.id.browser_actions_menu_item_text);
            view.setTag(viewHolderItem);
        } else {
            viewHolderItem = (ViewHolderItem) view.getTag();
        }
        viewHolderItem.mText.setText(browserActionItem.getTitle());
        if (browserActionItem.getIconId() != 0) {
            viewHolderItem.mIcon.setImageDrawable(ResourcesCompat.getDrawable(this.mContext.getResources(), browserActionItem.getIconId(), (Resources.Theme) null));
        } else {
            viewHolderItem.mIcon.setImageDrawable((Drawable) null);
        }
        return view;
    }
}
