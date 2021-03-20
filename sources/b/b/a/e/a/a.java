package b.b.a.e.a;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.b.a.b;
import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00028\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Lb/b/a/e/a/a;", "Landroid/view/ViewGroup;", "", "getDividerColor", "()I", "Landroid/graphics/Paint;", "a", "()Landroid/graphics/Paint;", "i", "I", "getDividerHeight", "dividerHeight", "h", "Landroid/graphics/Paint;", "dividerPaint", "Lb/b/a/b;", "dialog", "Lb/b/a/b;", "getDialog", "()Lb/b/a/b;", "setDialog", "(Lb/b/a/b;)V", "", "value", "j", "Z", "getDrawDivider", "()Z", "setDrawDivider", "(Z)V", "drawDivider", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class a extends ViewGroup {

    /* renamed from: h  reason: collision with root package name */
    public final Paint f362h;

    /* renamed from: i  reason: collision with root package name */
    public final int f363i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f364j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.f(context, BasePayload.CONTEXT_KEY);
        Paint paint = new Paint();
        this.f362h = paint;
        i.f(this, "$this$dimenPx");
        Context context2 = getContext();
        i.b(context2, BasePayload.CONTEXT_KEY);
        this.f363i = context2.getResources().getDimensionPixelSize(R.dimen.md_divider_height);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.md_divider_height));
        paint.setAntiAlias(true);
    }

    private final int getDividerColor() {
        i.m("dialog");
        throw null;
    }

    public final Paint a() {
        this.f362h.setColor(getDividerColor());
        return this.f362h;
    }

    public final b getDialog() {
        i.m("dialog");
        throw null;
    }

    public final int getDividerHeight() {
        return this.f363i;
    }

    public final boolean getDrawDivider() {
        return this.f364j;
    }

    public final void setDialog(b bVar) {
        i.f(bVar, "<set-?>");
    }

    public final void setDrawDivider(boolean z) {
        this.f364j = z;
        invalidate();
    }
}
