package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import b.e.a.a.a;
import java.util.ArrayList;
import java.util.List;

public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    public static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    public static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    public static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final String TAG = "ItemTouchHelper";
    public static final int UP = 1;
    private int mActionState = 0;
    public int mActivePointerId = -1;
    @NonNull
    public Callback mCallback;
    private RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback = null;
    private List<Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    public float mDx;
    public float mDy;
    public GestureDetectorCompat mGestureDetector;
    public float mInitialTouchX;
    public float mInitialTouchY;
    private ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    private final RecyclerView.OnItemTouchListener mOnItemTouchListener = new RecyclerView.OnItemTouchListener() {
        public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int findPointerIndex;
            RecoverAnimation findAnimation;
            ItemTouchHelper.this.mGestureDetector.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                ItemTouchHelper.this.mActivePointerId = motionEvent.getPointerId(0);
                ItemTouchHelper.this.mInitialTouchX = motionEvent.getX();
                ItemTouchHelper.this.mInitialTouchY = motionEvent.getY();
                ItemTouchHelper.this.obtainVelocityTracker();
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (itemTouchHelper.mSelected == null && (findAnimation = itemTouchHelper.findAnimation(motionEvent)) != null) {
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.mInitialTouchX -= findAnimation.mX;
                    itemTouchHelper2.mInitialTouchY -= findAnimation.mY;
                    itemTouchHelper2.endRecoverAnimation(findAnimation.mViewHolder, true);
                    if (ItemTouchHelper.this.mPendingCleanup.remove(findAnimation.mViewHolder.itemView)) {
                        ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                        itemTouchHelper3.mCallback.clearView(itemTouchHelper3.mRecyclerView, findAnimation.mViewHolder);
                    }
                    ItemTouchHelper.this.select(findAnimation.mViewHolder, findAnimation.mActionState);
                    ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                    itemTouchHelper4.updateDxDy(motionEvent, itemTouchHelper4.mSelectedFlags, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                ItemTouchHelper itemTouchHelper5 = ItemTouchHelper.this;
                itemTouchHelper5.mActivePointerId = -1;
                itemTouchHelper5.select((RecyclerView.ViewHolder) null, 0);
            } else {
                int i2 = ItemTouchHelper.this.mActivePointerId;
                if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                    ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = ItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return ItemTouchHelper.this.mSelected != null;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                ItemTouchHelper.this.select((RecyclerView.ViewHolder) null, 0);
            }
        }

        public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            ItemTouchHelper.this.mGestureDetector.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = ItemTouchHelper.this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (ItemTouchHelper.this.mActivePointerId != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(ItemTouchHelper.this.mActivePointerId);
                if (findPointerIndex >= 0) {
                    ItemTouchHelper.this.checkSelectForSwipe(actionMasked, motionEvent, findPointerIndex);
                }
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                RecyclerView.ViewHolder viewHolder = itemTouchHelper.mSelected;
                if (viewHolder != null) {
                    int i2 = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = itemTouchHelper.mVelocityTracker;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                                if (pointerId == itemTouchHelper2.mActivePointerId) {
                                    if (actionIndex == 0) {
                                        i2 = 1;
                                    }
                                    itemTouchHelper2.mActivePointerId = motionEvent.getPointerId(i2);
                                    ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                                    itemTouchHelper3.updateDxDy(motionEvent, itemTouchHelper3.mSelectedFlags, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            itemTouchHelper.updateDxDy(motionEvent, itemTouchHelper.mSelectedFlags, findPointerIndex);
                            ItemTouchHelper.this.moveIfNecessary(viewHolder);
                            ItemTouchHelper itemTouchHelper4 = ItemTouchHelper.this;
                            itemTouchHelper4.mRecyclerView.removeCallbacks(itemTouchHelper4.mScrollRunnable);
                            ItemTouchHelper.this.mScrollRunnable.run();
                            ItemTouchHelper.this.mRecyclerView.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    ItemTouchHelper.this.select((RecyclerView.ViewHolder) null, 0);
                    ItemTouchHelper.this.mActivePointerId = -1;
                }
            }
        }
    };
    public View mOverdrawChild = null;
    public int mOverdrawChildPosition = -1;
    public final List<View> mPendingCleanup = new ArrayList();
    public List<RecoverAnimation> mRecoverAnimations = new ArrayList();
    public RecyclerView mRecyclerView;
    public final Runnable mScrollRunnable = new Runnable() {
        public void run() {
            ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
            if (itemTouchHelper.mSelected != null && itemTouchHelper.scrollIfNecessary()) {
                ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                RecyclerView.ViewHolder viewHolder = itemTouchHelper2.mSelected;
                if (viewHolder != null) {
                    itemTouchHelper2.moveIfNecessary(viewHolder);
                }
                ItemTouchHelper itemTouchHelper3 = ItemTouchHelper.this;
                itemTouchHelper3.mRecyclerView.removeCallbacks(itemTouchHelper3.mScrollRunnable);
                ViewCompat.postOnAnimation(ItemTouchHelper.this.mRecyclerView, this);
            }
        }
    };
    public RecyclerView.ViewHolder mSelected = null;
    public int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private List<RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private final float[] mTmpPosition = new float[2];
    private Rect mTmpRect;
    public VelocityTracker mVelocityTracker;

    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        public static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new Interpolator() {
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };
        private static final Interpolator sDragViewScrollCapInterpolator = new Interpolator() {
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        private int mCachedMaxScrollSpeed = -1;

        public static int convertToRelativeDirection(int i2, int i3) {
            int i4;
            int i5 = i2 & ABS_HORIZONTAL_DIR_FLAGS;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 << 2;
            } else {
                int i7 = i5 << 1;
                i6 |= -789517 & i7;
                i4 = (i7 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i6 | i4;
        }

        @NonNull
        public static ItemTouchUIUtil getDefaultUIUtil() {
            return ItemTouchUIUtilImpl.INSTANCE;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i2, int i3) {
            return i3 << (i2 * 8);
        }

        public static int makeMovementFlags(int i2, int i3) {
            int makeFlag = makeFlag(0, i3 | i2);
            return makeFlag(2, i2) | makeFlag(1, i3) | makeFlag;
        }

        public boolean canDropOver(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public RecyclerView.ViewHolder chooseDropTarget(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<RecyclerView.ViewHolder> list, int i2, int i3) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.ViewHolder viewHolder2 = viewHolder;
            int width = viewHolder2.itemView.getWidth() + i2;
            int height = viewHolder2.itemView.getHeight() + i3;
            int left2 = i2 - viewHolder2.itemView.getLeft();
            int top2 = i3 - viewHolder2.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder3 = null;
            int i4 = -1;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.ViewHolder viewHolder4 = list.get(i5);
                if (left2 > 0 && (right = viewHolder4.itemView.getRight() - width) < 0 && viewHolder4.itemView.getRight() > viewHolder2.itemView.getRight() && (abs4 = Math.abs(right)) > i4) {
                    viewHolder3 = viewHolder4;
                    i4 = abs4;
                }
                if (left2 < 0 && (left = viewHolder4.itemView.getLeft() - i2) > 0 && viewHolder4.itemView.getLeft() < viewHolder2.itemView.getLeft() && (abs3 = Math.abs(left)) > i4) {
                    viewHolder3 = viewHolder4;
                    i4 = abs3;
                }
                if (top2 < 0 && (top = viewHolder4.itemView.getTop() - i3) > 0 && viewHolder4.itemView.getTop() < viewHolder2.itemView.getTop() && (abs2 = Math.abs(top)) > i4) {
                    viewHolder3 = viewHolder4;
                    i4 = abs2;
                }
                if (top2 > 0 && (bottom = viewHolder4.itemView.getBottom() - height) < 0 && viewHolder4.itemView.getBottom() > viewHolder2.itemView.getBottom() && (abs = Math.abs(bottom)) > i4) {
                    viewHolder3 = viewHolder4;
                    i4 = abs;
                }
            }
            return viewHolder3;
        }

        public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            ItemTouchUIUtilImpl.INSTANCE.clearView(viewHolder.itemView);
        }

        public int convertToAbsoluteDirection(int i2, int i3) {
            int i4;
            int i5 = i2 & RELATIVE_DIR_FLAGS;
            if (i5 == 0) {
                return i2;
            }
            int i6 = i2 & (~i5);
            if (i3 == 0) {
                i4 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= -3158065 & i7;
                i4 = (i7 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i6 | i4;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), ViewCompat.getLayoutDirection(recyclerView));
        }

        public long getAnimationDuration(@NonNull RecyclerView recyclerView, int i2, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i2 == 8 ? 200 : 250 : i2 == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(@NonNull RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(@NonNull RecyclerView recyclerView, int i2, int i3, int i4, long j2) {
            float f = 1.0f;
            int interpolation = (int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (((float) Math.abs(i3)) * 1.0f) / ((float) i2))) * ((float) (((int) Math.signum((float) i3)) * getMaxDragScroll(recyclerView))));
            if (j2 <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f = ((float) j2) / 2000.0f;
            }
            int interpolation2 = (int) (sDragScrollInterpolator.getInterpolation(f) * ((float) interpolation));
            return interpolation2 == 0 ? i3 > 0 ? 1 : -1 : interpolation2;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float f, float f2, int i2, boolean z) {
            ItemTouchUIUtilImpl.INSTANCE.onDraw(canvas, recyclerView, viewHolder.itemView, f, f2, i2, z);
        }

        public void onChildDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i2, boolean z) {
            ItemTouchUIUtilImpl.INSTANCE.onDrawOver(canvas, recyclerView, viewHolder.itemView, f, f2, i2, z);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i2, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                RecoverAnimation recoverAnimation = list.get(i3);
                recoverAnimation.update();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i2, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<RecoverAnimation> list, int i2, float f, float f2) {
            Canvas canvas2 = canvas;
            List<RecoverAnimation> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                RecoverAnimation recoverAnimation = list2.get(i3);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, recoverAnimation.mViewHolder, recoverAnimation.mX, recoverAnimation.mY, recoverAnimation.mActionState, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i2, true);
                canvas.restoreToCount(save2);
            }
            for (int i4 = size - 1; i4 >= 0; i4--) {
                RecoverAnimation recoverAnimation2 = list2.get(i4);
                boolean z2 = recoverAnimation2.mEnded;
                if (z2 && !recoverAnimation2.mIsPendingCleanup) {
                    list2.remove(i4);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2);

        public void onMoved(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, int i2, @NonNull RecyclerView.ViewHolder viewHolder2, int i3, int i4, int i5) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof ViewDropHandler) {
                ((ViewDropHandler) layoutManager).prepareForDrop(viewHolder.itemView, viewHolder2.itemView, i4, i5);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.getDecoratedRight(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i3);
                }
                if (layoutManager.getDecoratedBottom(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i3);
                }
            }
        }

        public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i2) {
            if (viewHolder != null) {
                ItemTouchUIUtilImpl.INSTANCE.onSelected(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i2);
    }

    public class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        private boolean mShouldReactToLongPress = true;

        public ItemTouchHelperGestureListener() {
        }

        public void doNotReactToLongPress() {
            this.mShouldReactToLongPress = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View findChildView;
            RecyclerView.ViewHolder childViewHolder;
            int i2;
            if (this.mShouldReactToLongPress && (findChildView = ItemTouchHelper.this.findChildView(motionEvent)) != null && (childViewHolder = ItemTouchHelper.this.mRecyclerView.getChildViewHolder(findChildView)) != null) {
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                if (itemTouchHelper.mCallback.hasDragFlag(itemTouchHelper.mRecyclerView, childViewHolder) && motionEvent.getPointerId(0) == (i2 = ItemTouchHelper.this.mActivePointerId)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
                    itemTouchHelper2.mInitialTouchX = x;
                    itemTouchHelper2.mInitialTouchY = y;
                    itemTouchHelper2.mDy = 0.0f;
                    itemTouchHelper2.mDx = 0.0f;
                    if (itemTouchHelper2.mCallback.isLongPressDragEnabled()) {
                        ItemTouchHelper.this.select(childViewHolder, 2);
                    }
                }
            }
        }
    }

    public static class RecoverAnimation implements Animator.AnimatorListener {
        public final int mActionState;
        public final int mAnimationType;
        public boolean mEnded = false;
        private float mFraction;
        public boolean mIsPendingCleanup;
        public boolean mOverridden = false;
        public final float mStartDx;
        public final float mStartDy;
        public final float mTargetX;
        public final float mTargetY;
        private final ValueAnimator mValueAnimator;
        public final RecyclerView.ViewHolder mViewHolder;
        public float mX;
        public float mY;

        public RecoverAnimation(RecyclerView.ViewHolder viewHolder, int i2, int i3, float f, float f2, float f3, float f4) {
            this.mActionState = i3;
            this.mAnimationType = i2;
            this.mViewHolder = viewHolder;
            this.mStartDx = f;
            this.mStartDy = f2;
            this.mTargetX = f3;
            this.mTargetY = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.mValueAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecoverAnimation.this.setFraction(valueAnimator.getAnimatedFraction());
                }
            });
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            setFraction(0.0f);
        }

        public void cancel() {
            this.mValueAnimator.cancel();
        }

        public void onAnimationCancel(Animator animator) {
            setFraction(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.mEnded) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mEnded = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void setDuration(long j2) {
            this.mValueAnimator.setDuration(j2);
        }

        public void setFraction(float f) {
            this.mFraction = f;
        }

        public void start() {
            this.mViewHolder.setIsRecyclable(false);
            this.mValueAnimator.start();
        }

        public void update() {
            float f = this.mStartDx;
            float f2 = this.mTargetX;
            this.mX = f == f2 ? this.mViewHolder.itemView.getTranslationX() : a.a(f2, f, this.mFraction, f);
            float f3 = this.mStartDy;
            float f4 = this.mTargetY;
            this.mY = f3 == f4 ? this.mViewHolder.itemView.getTranslationY() : a.a(f4, f3, this.mFraction, f3);
        }
    }

    public static abstract class SimpleCallback extends Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int i2, int i3) {
            this.mDefaultSwipeDirs = i3;
            this.mDefaultDragDirs = i2;
        }

        public int getDragDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultDragDirs;
        }

        public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return Callback.makeMovementFlags(getDragDirs(recyclerView, viewHolder), getSwipeDirs(recyclerView, viewHolder));
        }

        public int getSwipeDirs(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i2) {
            this.mDefaultDragDirs = i2;
        }

        public void setDefaultSwipeDirs(int i2) {
            this.mDefaultSwipeDirs = i2;
        }
    }

    public interface ViewDropHandler {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i2, int i3);
    }

    public ItemTouchHelper(@NonNull Callback callback) {
        this.mCallback = callback;
    }

    private void addChildDrawingOrderCallback() {
    }

    private int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        int i4 = this.mDx > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            if (xVelocity <= 0.0f) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i2) != 0 && i4 == i3 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = this.mCallback.getSwipeThreshold(viewHolder) * ((float) this.mRecyclerView.getWidth());
        if ((i2 & i4) == 0 || Math.abs(this.mDx) <= swipeThreshold) {
            return 0;
        }
        return i4;
    }

    private int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        int i4 = this.mDy > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null && this.mActivePointerId > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.mCallback.getSwipeVelocityThreshold(this.mMaxSwipeVelocity));
            float xVelocity = this.mVelocityTracker.getXVelocity(this.mActivePointerId);
            float yVelocity = this.mVelocityTracker.getYVelocity(this.mActivePointerId);
            if (yVelocity <= 0.0f) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i2) != 0 && i3 == i4 && abs >= this.mCallback.getSwipeEscapeVelocity(this.mSwipeEscapeVelocity) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = this.mCallback.getSwipeThreshold(viewHolder) * ((float) this.mRecyclerView.getHeight());
        if ((i2 & i4) == 0 || Math.abs(this.mDy) <= swipeThreshold) {
            return 0;
        }
        return i4;
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.removeOnChildAttachStateChangeListener(this);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            this.mCallback.clearView(this.mRecyclerView, this.mRecoverAnimations.get(0).mViewHolder);
        }
        this.mRecoverAnimations.clear();
        this.mOverdrawChild = null;
        this.mOverdrawChildPosition = -1;
        releaseVelocityTracker();
        stopGestureDetection();
    }

    private List<RecyclerView.ViewHolder> findSwapTargets(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<RecyclerView.ViewHolder> list = this.mSwapTargets;
        if (list == null) {
            this.mSwapTargets = new ArrayList();
            this.mDistances = new ArrayList();
        } else {
            list.clear();
            this.mDistances.clear();
        }
        int boundingBoxMargin = this.mCallback.getBoundingBoxMargin();
        int round = Math.round(this.mSelectedStartX + this.mDx) - boundingBoxMargin;
        int round2 = Math.round(this.mSelectedStartY + this.mDy) - boundingBoxMargin;
        int i2 = boundingBoxMargin * 2;
        int width = viewHolder2.itemView.getWidth() + round + i2;
        int height = viewHolder2.itemView.getHeight() + round2 + i2;
        int i3 = (round + width) / 2;
        int i4 = (round2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = layoutManager.getChildAt(i5);
            if (childAt != viewHolder2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(childAt);
                if (this.mCallback.canDropOver(this.mRecyclerView, this.mSelected, childViewHolder)) {
                    int abs = Math.abs(i3 - ((childAt.getRight() + childAt.getLeft()) / 2));
                    int abs2 = Math.abs(i4 - ((childAt.getBottom() + childAt.getTop()) / 2));
                    int i6 = (abs2 * abs2) + (abs * abs);
                    int size = this.mSwapTargets.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size && i6 > this.mDistances.get(i7).intValue()) {
                        i8++;
                        i7++;
                        RecyclerView.ViewHolder viewHolder3 = viewHolder;
                    }
                    this.mSwapTargets.add(i8, childViewHolder);
                    this.mDistances.add(i8, Integer.valueOf(i6));
                }
            }
            i5++;
            viewHolder2 = viewHolder;
        }
        return this.mSwapTargets;
    }

    private RecyclerView.ViewHolder findSwipedView(MotionEvent motionEvent) {
        View findChildView;
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int i2 = this.mActivePointerId;
        if (i2 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i2);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.mInitialTouchX);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.mInitialTouchY);
        int i3 = this.mSlop;
        if (abs < ((float) i3) && abs2 < ((float) i3)) {
            return null;
        }
        if (abs > abs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.canScrollVertically()) && (findChildView = findChildView(motionEvent)) != null) {
            return this.mRecyclerView.getChildViewHolder(findChildView);
        }
        return null;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.mSelectedFlags & 12) != 0) {
            fArr[0] = (this.mSelectedStartX + this.mDx) - ((float) this.mSelected.itemView.getLeft());
        } else {
            fArr[0] = this.mSelected.itemView.getTranslationX();
        }
        if ((this.mSelectedFlags & 3) != 0) {
            fArr[1] = (this.mSelectedStartY + this.mDy) - ((float) this.mSelected.itemView.getTop());
        } else {
            fArr[1] = this.mSelected.itemView.getTranslationY();
        }
    }

    private static boolean hitTest(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setupCallbacks() {
        this.mSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this.mOnItemTouchListener);
        this.mRecyclerView.addOnChildAttachStateChangeListener(this);
        startGestureDetection();
    }

    private void startGestureDetection() {
        this.mItemTouchHelperGestureListener = new ItemTouchHelperGestureListener();
        this.mGestureDetector = new GestureDetectorCompat(this.mRecyclerView.getContext(), this.mItemTouchHelperGestureListener);
    }

    private void stopGestureDetection() {
        ItemTouchHelperGestureListener itemTouchHelperGestureListener = this.mItemTouchHelperGestureListener;
        if (itemTouchHelperGestureListener != null) {
            itemTouchHelperGestureListener.doNotReactToLongPress();
            this.mItemTouchHelperGestureListener = null;
        }
        if (this.mGestureDetector != null) {
            this.mGestureDetector = null;
        }
    }

    private int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (this.mActionState == 2) {
            return 0;
        }
        int movementFlags = this.mCallback.getMovementFlags(this.mRecyclerView, viewHolder);
        int convertToAbsoluteDirection = (this.mCallback.convertToAbsoluteDirection(movementFlags, ViewCompat.getLayoutDirection(this.mRecyclerView)) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i2 = (movementFlags & 65280) >> 8;
        if (Math.abs(this.mDx) > Math.abs(this.mDy)) {
            int checkHorizontalSwipe = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe > 0) {
                return (i2 & checkHorizontalSwipe) == 0 ? Callback.convertToRelativeDirection(checkHorizontalSwipe, ViewCompat.getLayoutDirection(this.mRecyclerView)) : checkHorizontalSwipe;
            }
            int checkVerticalSwipe = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkVerticalSwipe > 0) {
                return checkVerticalSwipe;
            }
        } else {
            int checkVerticalSwipe2 = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkVerticalSwipe2 > 0) {
                return checkVerticalSwipe2;
            }
            int checkHorizontalSwipe2 = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe2 > 0) {
                return (i2 & checkHorizontalSwipe2) == 0 ? Callback.convertToRelativeDirection(checkHorizontalSwipe2, ViewCompat.getLayoutDirection(this.mRecyclerView)) : checkHorizontalSwipe2;
            }
        }
        return 0;
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                destroyCallbacks();
            }
            this.mRecyclerView = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.mSwipeEscapeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.mMaxSwipeVelocity = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                setupCallbacks();
            }
        }
    }

    public void checkSelectForSwipe(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.ViewHolder findSwipedView;
        int absoluteMovementFlags;
        if (this.mSelected == null && i2 == 2 && this.mActionState != 2 && this.mCallback.isItemViewSwipeEnabled() && this.mRecyclerView.getScrollState() != 1 && (findSwipedView = findSwipedView(motionEvent)) != null && (absoluteMovementFlags = (this.mCallback.getAbsoluteMovementFlags(this.mRecyclerView, findSwipedView) & 65280) >> 8) != 0) {
            float x = motionEvent.getX(i3);
            float y = motionEvent.getY(i3);
            float f = x - this.mInitialTouchX;
            float f2 = y - this.mInitialTouchY;
            float abs = Math.abs(f);
            float abs2 = Math.abs(f2);
            int i4 = this.mSlop;
            if (abs >= ((float) i4) || abs2 >= ((float) i4)) {
                if (abs > abs2) {
                    if (f < 0.0f && (absoluteMovementFlags & 4) == 0) {
                        return;
                    }
                    if (f > 0.0f && (absoluteMovementFlags & 8) == 0) {
                        return;
                    }
                } else if (f2 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                    return;
                } else {
                    if (f2 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                        return;
                    }
                }
                this.mDy = 0.0f;
                this.mDx = 0.0f;
                this.mActivePointerId = motionEvent.getPointerId(0);
                select(findSwipedView, 1);
            }
        }
    }

    public void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder == viewHolder) {
                recoverAnimation.mOverridden |= z;
                if (!recoverAnimation.mEnded) {
                    recoverAnimation.cancel();
                }
                this.mRecoverAnimations.remove(size);
                return;
            }
        }
    }

    public RecoverAnimation findAnimation(MotionEvent motionEvent) {
        if (this.mRecoverAnimations.isEmpty()) {
            return null;
        }
        View findChildView = findChildView(motionEvent);
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            if (recoverAnimation.mViewHolder.itemView == findChildView) {
                return recoverAnimation;
            }
        }
        return null;
    }

    public View findChildView(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.mSelected;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (hitTest(view, x, y, this.mSelectedStartX + this.mDx, this.mSelectedStartY + this.mDy)) {
                return view;
            }
        }
        for (int size = this.mRecoverAnimations.size() - 1; size >= 0; size--) {
            RecoverAnimation recoverAnimation = this.mRecoverAnimations.get(size);
            View view2 = recoverAnimation.mViewHolder.itemView;
            if (hitTest(view2, x, y, recoverAnimation.mX, recoverAnimation.mY)) {
                return view2;
            }
        }
        return this.mRecyclerView.findChildViewUnder(x, y);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    public boolean hasRunningRecoverAnim() {
        int size = this.mRecoverAnimations.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.mRecoverAnimations.get(i2).mEnded) {
                return true;
            }
        }
        return false;
    }

    public void moveIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (!this.mRecyclerView.isLayoutRequested() && this.mActionState == 2) {
            float moveThreshold = this.mCallback.getMoveThreshold(viewHolder);
            int i2 = (int) (this.mSelectedStartX + this.mDx);
            int i3 = (int) (this.mSelectedStartY + this.mDy);
            if (((float) Math.abs(i3 - viewHolder.itemView.getTop())) >= ((float) viewHolder.itemView.getHeight()) * moveThreshold || ((float) Math.abs(i2 - viewHolder.itemView.getLeft())) >= ((float) viewHolder.itemView.getWidth()) * moveThreshold) {
                List<RecyclerView.ViewHolder> findSwapTargets = findSwapTargets(viewHolder);
                if (findSwapTargets.size() != 0) {
                    RecyclerView.ViewHolder chooseDropTarget = this.mCallback.chooseDropTarget(viewHolder, findSwapTargets, i2, i3);
                    if (chooseDropTarget == null) {
                        this.mSwapTargets.clear();
                        this.mDistances.clear();
                        return;
                    }
                    int adapterPosition = chooseDropTarget.getAdapterPosition();
                    int adapterPosition2 = viewHolder.getAdapterPosition();
                    if (this.mCallback.onMove(this.mRecyclerView, viewHolder, chooseDropTarget)) {
                        this.mCallback.onMoved(this.mRecyclerView, viewHolder, adapterPosition2, chooseDropTarget, adapterPosition, i2, i3);
                    }
                }
            }
        }
    }

    public void obtainVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    public void onChildViewAttachedToWindow(@NonNull View view) {
    }

    public void onChildViewDetachedFromWindow(@NonNull View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.ViewHolder childViewHolder = this.mRecyclerView.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.ViewHolder viewHolder = this.mSelected;
            if (viewHolder == null || childViewHolder != viewHolder) {
                endRecoverAnimation(childViewHolder, false);
                if (this.mPendingCleanup.remove(childViewHolder.itemView)) {
                    this.mCallback.clearView(this.mRecyclerView, childViewHolder);
                    return;
                }
                return;
            }
            select((RecyclerView.ViewHolder) null, 0);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.mOverdrawChildPosition = -1;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.mCallback.onDraw(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f2, f);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        if (this.mSelected != null) {
            getSelectedDxDy(this.mTmpPosition);
            float[] fArr = this.mTmpPosition;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.mCallback.onDrawOver(canvas, recyclerView, this.mSelected, this.mRecoverAnimations, this.mActionState, f2, f);
    }

    public void postDispatchSwipe(final RecoverAnimation recoverAnimation, final int i2) {
        this.mRecyclerView.post(new Runnable() {
            public void run() {
                RecyclerView recyclerView = ItemTouchHelper.this.mRecyclerView;
                if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                    RecoverAnimation recoverAnimation = recoverAnimation;
                    if (!recoverAnimation.mOverridden && recoverAnimation.mViewHolder.getAdapterPosition() != -1) {
                        RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.mRecyclerView.getItemAnimator();
                        if ((itemAnimator == null || !itemAnimator.isRunning((RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) null)) && !ItemTouchHelper.this.hasRunningRecoverAnim()) {
                            ItemTouchHelper.this.mCallback.onSwiped(recoverAnimation.mViewHolder, i2);
                        } else {
                            ItemTouchHelper.this.mRecyclerView.post(this);
                        }
                    }
                }
            }
        });
    }

    public void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.mOverdrawChild) {
            this.mOverdrawChild = null;
            if (this.mChildDrawingOrderCallback != null) {
                this.mRecyclerView.setChildDrawingOrderCallback((RecyclerView.ChildDrawingOrderCallback) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean scrollIfNecessary() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.mSelected
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.mDragScrollStartTimeInMs = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.mDragScrollStartTimeInMs
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.mTmpRect
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.mTmpRect = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r0.mSelected
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r0.mTmpRect
            r1.calculateItemDecorationsForChild(r9, r10)
            boolean r9 = r1.canScrollHorizontally()
            r10 = 0
            if (r9 == 0) goto L_0x007c
            float r9 = r0.mSelectedStartX
            float r11 = r0.mDx
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.mTmpRect
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.mRecyclerView
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.mDx
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
        L_0x0057:
            r12 = r11
            goto L_0x007d
        L_0x0059:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = r0.mSelected
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r11 = r11 + r9
            android.graphics.Rect r9 = r0.mTmpRect
            int r9 = r9.right
            int r11 = r11 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.mRecyclerView
            int r9 = r9.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.mRecyclerView
            int r12 = r12.getPaddingRight()
            int r9 = r9 - r12
            int r11 = r11 - r9
            if (r11 <= 0) goto L_0x007c
            goto L_0x0057
        L_0x007c:
            r12 = r2
        L_0x007d:
            boolean r1 = r1.canScrollVertically()
            if (r1 == 0) goto L_0x00c3
            float r1 = r0.mSelectedStartY
            float r9 = r0.mDy
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.mTmpRect
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.mRecyclerView
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.mDy
            int r13 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a0
            if (r9 >= 0) goto L_0x00a0
        L_0x009e:
            r1 = r9
            goto L_0x00c4
        L_0x00a0:
            int r9 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c3
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r0.mSelected
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r9 = r9 + r1
            android.graphics.Rect r1 = r0.mTmpRect
            int r1 = r1.bottom
            int r9 = r9 + r1
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            int r1 = r1.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.mRecyclerView
            int r10 = r10.getPaddingBottom()
            int r1 = r1 - r10
            int r9 = r9 - r1
            if (r9 <= 0) goto L_0x00c3
            goto L_0x009e
        L_0x00c3:
            r1 = r2
        L_0x00c4:
            if (r12 == 0) goto L_0x00dd
            androidx.recyclerview.widget.ItemTouchHelper$Callback r9 = r0.mCallback
            androidx.recyclerview.widget.RecyclerView r10 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = r0.mSelected
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.mRecyclerView
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14)
        L_0x00dd:
            r14 = r12
            if (r1 == 0) goto L_0x00fc
            androidx.recyclerview.widget.ItemTouchHelper$Callback r9 = r0.mCallback
            androidx.recyclerview.widget.RecyclerView r10 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = r0.mSelected
            android.view.View r11 = r11.itemView
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.mRecyclerView
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x00fd
        L_0x00fc:
            r12 = r14
        L_0x00fd:
            if (r12 != 0) goto L_0x0105
            if (r1 == 0) goto L_0x0102
            goto L_0x0105
        L_0x0102:
            r0.mDragScrollStartTimeInMs = r3
            return r2
        L_0x0105:
            long r7 = r0.mDragScrollStartTimeInMs
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x010d
            r0.mDragScrollStartTimeInMs = r5
        L_0x010d:
            androidx.recyclerview.widget.RecyclerView r2 = r0.mRecyclerView
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.scrollIfNecessary():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void select(@androidx.annotation.Nullable androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r11.mSelected
            if (r12 != r0) goto L_0x000f
            int r0 = r11.mActionState
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.mDragScrollStartTimeInMs = r0
            int r4 = r11.mActionState
            r14 = 1
            r11.endRecoverAnimation(r12, r14)
            r11.mActionState = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.itemView
            r11.mOverdrawChild = r0
            r23.addChildDrawingOrderCallback()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r11.mSelected
            r8 = 0
            if (r9 == 0) goto L_0x00ed
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00d9
            if (r4 != r15) goto L_0x004a
            r7 = r8
            goto L_0x004f
        L_0x004a:
            int r0 = r11.swipeIfNecessary(r9)
            r7 = r0
        L_0x004f:
            r23.releaseVelocityTracker()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007c
            if (r7 == r15) goto L_0x007c
            if (r7 == r0) goto L_0x0069
            if (r7 == r10) goto L_0x0069
            r2 = 16
            if (r7 == r2) goto L_0x0069
            r2 = 32
            if (r7 == r2) goto L_0x0069
            r17 = r1
            r18 = r17
            goto L_0x008e
        L_0x0069:
            float r2 = r11.mDx
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.mRecyclerView
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r1
            r17 = r2
            goto L_0x008e
        L_0x007c:
            float r2 = r11.mDy
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.mRecyclerView
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r1
            r18 = r2
        L_0x008e:
            if (r4 != r15) goto L_0x0092
            r6 = r10
            goto L_0x0097
        L_0x0092:
            if (r7 <= 0) goto L_0x0096
            r6 = r15
            goto L_0x0097
        L_0x0096:
            r6 = r0
        L_0x0097:
            float[] r0 = r11.mTmpPosition
            r11.getSelectedDxDy(r0)
            float[] r0 = r11.mTmpPosition
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.ItemTouchHelper$3 r5 = new androidx.recyclerview.widget.ItemTouchHelper$3
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r11.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r11.mRecyclerView
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.getAnimationDuration(r1, r15, r2, r3)
            r14.setDuration(r0)
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r11.mRecoverAnimations
            r0.add(r14)
            r14.start()
            r8 = 1
            goto L_0x00e9
        L_0x00d9:
            r0 = r9
            r21 = r10
            android.view.View r1 = r0.itemView
            r11.removeChildDrawingOrderCallbackIfNecessary(r1)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r11.mCallback
            androidx.recyclerview.widget.RecyclerView r2 = r11.mRecyclerView
            r1.clearView(r2, r0)
            r8 = 0
        L_0x00e9:
            r0 = 0
            r11.mSelected = r0
            goto L_0x00f0
        L_0x00ed:
            r21 = r10
            r8 = 0
        L_0x00f0:
            if (r12 == 0) goto L_0x0121
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r11.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r11.mRecyclerView
            int r0 = r0.getAbsoluteMovementFlags(r1, r12)
            r0 = r0 & r16
            int r1 = r11.mActionState
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.mSelectedFlags = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.mSelectedStartX = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.mSelectedStartY = r0
            r11.mSelected = r12
            r0 = 2
            if (r13 != r0) goto L_0x0121
            android.view.View r0 = r12.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            androidx.recyclerview.widget.RecyclerView r0 = r11.mRecyclerView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0134
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r11.mSelected
            if (r2 == 0) goto L_0x0130
            r14 = 1
            goto L_0x0131
        L_0x0130:
            r14 = r1
        L_0x0131:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0134:
            if (r8 != 0) goto L_0x013f
            androidx.recyclerview.widget.RecyclerView r0 = r11.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r0.requestSimpleAnimationsInNextLayout()
        L_0x013f:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r11.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r11.mSelected
            int r2 = r11.mActionState
            r0.onSelectedChanged(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.mRecyclerView
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.select(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public void startDrag(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasDragFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start drag has been called but dragging is not enabled");
        } else if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            obtainVelocityTracker();
            this.mDy = 0.0f;
            this.mDx = 0.0f;
            select(viewHolder, 2);
        }
    }

    public void startSwipe(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (!this.mCallback.hasSwipeFlag(this.mRecyclerView, viewHolder)) {
            Log.e(TAG, "Start swipe has been called but swiping is not enabled");
        } else if (viewHolder.itemView.getParent() != this.mRecyclerView) {
            Log.e(TAG, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        } else {
            obtainVelocityTracker();
            this.mDy = 0.0f;
            this.mDx = 0.0f;
            select(viewHolder, 1);
        }
    }

    public void updateDxDy(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f = x - this.mInitialTouchX;
        this.mDx = f;
        this.mDy = y - this.mInitialTouchY;
        if ((i2 & 4) == 0) {
            this.mDx = Math.max(0.0f, f);
        }
        if ((i2 & 8) == 0) {
            this.mDx = Math.min(0.0f, this.mDx);
        }
        if ((i2 & 1) == 0) {
            this.mDy = Math.max(0.0f, this.mDy);
        }
        if ((i2 & 2) == 0) {
            this.mDy = Math.min(0.0f, this.mDy);
        }
    }
}
