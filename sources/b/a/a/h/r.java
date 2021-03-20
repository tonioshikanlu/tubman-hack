package b.a.a.h;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;
import b.f.a.e;
import e.x.c.i;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public final class r implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ EditText a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Calendar f291b;

    public r(EditText editText, Calendar calendar) {
        this.a = editText;
        this.f291b = calendar;
    }

    public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
        this.f291b.set(1, i2);
        this.f291b.set(2, i3);
        this.f291b.set(5, i4);
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(e.c());
        i.d(dateFormat, "DateFormat.getDateFormat(appContext())");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) dateFormat).toLocalizedPattern(), Locale.getDefault());
        EditText editText = this.a;
        Calendar calendar = this.f291b;
        i.d(calendar, "myCalendar");
        editText.setText(simpleDateFormat.format(calendar.getTime()));
    }
}
