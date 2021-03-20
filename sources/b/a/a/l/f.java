package b.a.a.l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.f.a;
import b.a.a.i.c;
import com.appfoundry.previewer.BravoApp;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import java.util.List;

public final class f extends RecyclerView.Adapter<e> {
    public final AppCompatActivity a;

    public f(AppCompatActivity appCompatActivity) {
        i.e(appCompatActivity, BasePayload.CONTEXT_KEY);
        this.a = appCompatActivity;
    }

    public int getItemCount() {
        List<c> list;
        BravoApp.b bVar = BravoApp.Q;
        if (i.a(BravoApp.P, Boolean.TRUE)) {
            a aVar = a.c;
            list = a.f236b;
        } else {
            a aVar2 = a.c;
            list = a.a;
        }
        return list.size();
    }

    public int getItemViewType(int i2) {
        if (i2 == 0) {
            BravoApp.b bVar = BravoApp.Q;
            if (i.a(BravoApp.P, Boolean.FALSE)) {
                return 0;
            }
        }
        return 1;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        List<c> list;
        e eVar = (e) viewHolder;
        i.e(eVar, "holder");
        if (i2 == 0) {
            BravoApp.b bVar = BravoApp.Q;
            if (i.a(BravoApp.P, Boolean.FALSE)) {
                ((Button) eVar.itemView.findViewById(R.id.debug_input_app_load)).setOnClickListener(new d(eVar, (TextView) eVar.itemView.findViewById(R.id.debug_input_app_edittext)));
                return;
            }
        }
        BravoApp.b bVar2 = BravoApp.Q;
        if (i.a(BravoApp.P, Boolean.TRUE)) {
            a aVar = a.c;
            list = a.f236b;
        } else {
            a aVar2 = a.c;
            list = a.a;
        }
        c cVar = list.get(i2);
        i.e(cVar, "debugApp");
        TextView textView = (TextView) eVar.itemView.findViewById(R.id.debug_app_textview);
        i.d(textView, "textView");
        textView.setText(cVar.a);
        textView.setContentDescription(cVar.a);
        textView.setOnClickListener(new c(eVar, cVar));
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflater;
        int i3;
        i.e(viewGroup, "parent");
        if (i2 == 0) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.viewholder_input_json_app;
        } else {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
            i3 = R.layout.viewholder_debug_app;
        }
        View inflate = layoutInflater.inflate(i3, viewGroup, false);
        AppCompatActivity appCompatActivity = this.a;
        i.d(inflate, "view");
        return new e(appCompatActivity, inflate);
    }
}
