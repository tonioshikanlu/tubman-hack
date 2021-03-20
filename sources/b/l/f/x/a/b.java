package b.l.f.x.a;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import b.m.a.t.e;
import b.m.a.t.f;

public final class b implements SensorEventListener {
    public e a;

    /* renamed from: b  reason: collision with root package name */
    public f f5797b;
    public Context c;
    public Handler d = new Handler();

    public b(Context context, e eVar, f fVar) {
        this.c = context;
        this.a = eVar;
        this.f5797b = fVar;
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.a == null) {
            return;
        }
        if (f <= 45.0f) {
            this.d.post(new a(this, true));
        } else if (f >= 450.0f) {
            this.d.post(new a(this, false));
        }
    }
}
