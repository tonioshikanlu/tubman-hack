package b.a.a.l;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;

public final class e extends RecyclerView.ViewHolder {
    public final AppCompatActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(AppCompatActivity appCompatActivity, View view) {
        super(view);
        i.e(appCompatActivity, BasePayload.CONTEXT_KEY);
        i.e(view, "itemView");
        this.a = appCompatActivity;
    }
}
