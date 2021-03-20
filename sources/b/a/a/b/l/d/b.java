package b.a.a.b.l.d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import e.t.g;
import e.x.c.i;
import java.util.List;
import java.util.Objects;

public abstract class b<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {
    public c a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView.Adapter<T> f166b;
    public RecyclerView c;
    public List<Integer> d;

    /* renamed from: e  reason: collision with root package name */
    public Interpolator f167e;
    public int f;

    public b(RecyclerView.Adapter<T> adapter, RecyclerView recyclerView, List<Integer> list, Interpolator interpolator, int i2) {
        i.e(adapter, "adapter");
        i.e(recyclerView, "recyclerView");
        this.f166b = adapter;
        this.c = recyclerView;
        this.d = list;
        this.f167e = interpolator;
        this.f = i2;
        c cVar = new c(recyclerView);
        this.a = cVar;
        cVar.f168b = this.f;
    }

    public abstract List<Animator> a(View view);

    public int getItemCount() {
        return this.f166b.getItemCount();
    }

    public long getItemId(int i2) {
        return this.f166b.getItemId(i2);
    }

    public int getItemViewType(int i2) {
        return this.f166b.getItemViewType(i2);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        i.e(recyclerView, "recyclerView");
        this.f166b.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindViewHolder(T t, int i2) {
        this.f166b.onBindViewHolder(t, i2);
        if (t != null) {
            c cVar = this.a;
            View view = t.itemView;
            i.d(view, "it.itemView");
            Objects.requireNonNull(cVar);
            i.e(view, "view");
            int hashCode = view.hashCode();
            Animator animator = cVar.a.get(hashCode);
            if (animator != null) {
                animator.end();
                cVar.a.remove(hashCode);
            }
            View view2 = t.itemView;
            i.d(view2, "it.itemView");
            List<Integer> list = this.d;
            if (list == null || !list.contains(Integer.valueOf(i2))) {
                List<Animator> a2 = a(view2);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, Key.ALPHA, new float[]{0.0f, 1.0f});
                i.d(ofFloat, "ObjectAnimator.ofFloat(view, ALPHA, 0f, 1f)");
                ofFloat.setDuration((long) this.f);
                Interpolator interpolator = this.f167e;
                if (interpolator != null) {
                    ofFloat.setInterpolator(interpolator);
                }
                c cVar2 = this.a;
                List<T> J = g.J(a2, ofFloat);
                Objects.requireNonNull(cVar2);
                i.e(view2, "view");
                i.e(J, "animators");
                if (cVar2.f && i2 > cVar2.f169e) {
                    if (cVar2.d == -1) {
                        cVar2.d = i2;
                    }
                    if (cVar2.c == -1) {
                        cVar2.c = SystemClock.uptimeMillis();
                    }
                    view2.setAlpha(0.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(J);
                    animatorSet.setStartDelay((long) (i2 * 20));
                    animatorSet.setDuration((long) cVar2.f168b);
                    animatorSet.start();
                    cVar2.a.put(view2.hashCode(), animatorSet);
                    cVar2.f169e = i2;
                }
            }
        }
    }

    public T onCreateViewHolder(ViewGroup viewGroup, int i2) {
        i.e(viewGroup, "parent");
        return this.f166b.onCreateViewHolder(viewGroup, i2);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        i.e(recyclerView, "recyclerView");
        this.f166b.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean onFailedToRecycleView(T t) {
        return this.f166b.onFailedToRecycleView(t);
    }

    public void onViewAttachedToWindow(T t) {
        this.f166b.onViewAttachedToWindow(t);
    }

    public void onViewDetachedFromWindow(T t) {
        this.f166b.onViewDetachedFromWindow(t);
    }

    public void onViewRecycled(T t) {
        this.f166b.onViewRecycled(t);
    }

    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        i.e(adapterDataObserver, "observer");
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f166b.registerAdapterDataObserver(adapterDataObserver);
    }

    public void setHasStableIds(boolean z) {
        this.f166b.setHasStableIds(z);
    }

    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        i.e(adapterDataObserver, "observer");
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f166b.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
