package b.a.a.h;

import android.app.TimePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;

public final class t implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EditText f293h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Context f294i;

    public static final class a implements TimePickerDialog.OnTimeSetListener {
        public final /* synthetic */ t a;

        public a(t tVar) {
            this.a = tVar;
        }

        public final void onTimeSet(TimePicker timePicker, int i2, int i3) {
            EditText editText = this.a.f293h;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(':');
            sb.append(i3);
            editText.setText(sb.toString());
        }
    }

    public t(EditText editText, Context context) {
        this.f293h = editText;
        this.f294i = context;
    }

    public final void onClick(View view) {
        Calendar instance = Calendar.getInstance();
        TimePickerDialog timePickerDialog = new TimePickerDialog(this.f294i, new a(this), instance.get(11), instance.get(12), true);
        timePickerDialog.setTitle("Select Time");
        timePickerDialog.show();
    }
}
