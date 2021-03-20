package b.a.a.h;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import e.x.c.i;
import java.util.Calendar;
import java.util.Date;

public final class q implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f287h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog.OnDateSetListener f288i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Calendar f289j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Date f290k;

    public q(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, Calendar calendar, Date date) {
        this.f287h = context;
        this.f288i = onDateSetListener;
        this.f289j = calendar;
        this.f290k = date;
    }

    public final void onClick(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.f287h, this.f288i, this.f289j.get(1), this.f289j.get(2), this.f289j.get(5));
        Date date = this.f290k;
        if (date != null) {
            long longValue = Long.valueOf(date.getTime()).longValue();
            DatePicker datePicker = datePickerDialog.getDatePicker();
            i.d(datePicker, "datePicker");
            datePicker.setMaxDate(longValue);
        }
        datePickerDialog.show();
    }
}
