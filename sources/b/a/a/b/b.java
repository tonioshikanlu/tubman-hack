package b.a.a.b;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public class b extends MetricAffectingSpan {

    /* renamed from: h  reason: collision with root package name */
    public final float f144h;

    public b(float f) {
        this.f144h = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f144h);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f144h);
    }
}
