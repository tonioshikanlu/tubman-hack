package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import androidx.core.util.DebugUtils;
import androidx.core.util.LogWriter;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import b.e.a.a.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class FragmentManagerImpl extends FragmentManager implements LayoutInflater.Factory2 {
    public static final int ANIM_DUR = 220;
    public static final int ANIM_STYLE_CLOSE_ENTER = 3;
    public static final int ANIM_STYLE_CLOSE_EXIT = 4;
    public static final int ANIM_STYLE_FADE_ENTER = 5;
    public static final int ANIM_STYLE_FADE_EXIT = 6;
    public static final int ANIM_STYLE_OPEN_ENTER = 1;
    public static final int ANIM_STYLE_OPEN_EXIT = 2;
    public static boolean DEBUG = false;
    public static final Interpolator DECELERATE_CUBIC = new DecelerateInterpolator(1.5f);
    public static final Interpolator DECELERATE_QUINT = new DecelerateInterpolator(2.5f);
    public static final String TAG = "FragmentManager";
    public static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    public static final String TARGET_STATE_TAG = "android:target_state";
    public static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    public static final String VIEW_STATE_TAG = "android:view_state";
    public final HashMap<String, Fragment> mActive = new HashMap<>();
    public final ArrayList<Fragment> mAdded = new ArrayList<>();
    public ArrayList<Integer> mAvailBackStackIndices;
    public ArrayList<BackStackRecord> mBackStack;
    public ArrayList<FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    public ArrayList<BackStackRecord> mBackStackIndices;
    public FragmentContainer mContainer;
    public ArrayList<Fragment> mCreatedMenus;
    public int mCurState = 0;
    public boolean mDestroyed;
    public Runnable mExecCommit = new Runnable() {
        public void run() {
            FragmentManagerImpl.this.execPendingActions();
        }
    };
    public boolean mExecutingActions;
    public boolean mHavePendingDeferredStart;
    public FragmentHostCallback mHost;
    private final CopyOnWriteArrayList<FragmentLifecycleCallbacksHolder> mLifecycleCallbacks = new CopyOnWriteArrayList<>();
    public boolean mNeedMenuInvalidate;
    public int mNextFragmentIndex = 0;
    private FragmentManagerViewModel mNonConfig;
    private final OnBackPressedCallback mOnBackPressedCallback = new OnBackPressedCallback(false) {
        public void handleOnBackPressed() {
            FragmentManagerImpl.this.handleOnBackPressed();
        }
    };
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    public Fragment mParent;
    public ArrayList<OpGenerator> mPendingActions;
    public ArrayList<StartEnterTransitionListener> mPostponedTransactions;
    @Nullable
    public Fragment mPrimaryNav;
    public SparseArray<Parcelable> mStateArray = null;
    public Bundle mStateBundle = null;
    public boolean mStateSaved;
    public boolean mStopped;
    public ArrayList<Fragment> mTmpAddedFragments;
    public ArrayList<Boolean> mTmpIsPop;
    public ArrayList<BackStackRecord> mTmpRecords;

    public static class AnimationOrAnimator {
        public final Animation animation;
        public final Animator animator;

        public AnimationOrAnimator(Animator animator2) {
            this.animation = null;
            this.animator = animator2;
            if (animator2 == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public AnimationOrAnimator(Animation animation2) {
            this.animation = animation2;
            this.animator = null;
            if (animation2 == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    public static class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        private boolean mAnimating = true;
        private final View mChild;
        private boolean mEnded;
        private final ViewGroup mParent;
        private boolean mTransitionEnded;

        public EndViewTransitionAnimation(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.mParent = viewGroup;
            this.mChild = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j2, Transformation transformation) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        public boolean getTransformation(long j2, Transformation transformation, float f) {
            this.mAnimating = true;
            if (this.mEnded) {
                return !this.mTransitionEnded;
            }
            if (!super.getTransformation(j2, transformation, f)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, this);
            }
            return true;
        }

        public void run() {
            if (this.mEnded || !this.mAnimating) {
                this.mParent.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
                return;
            }
            this.mAnimating = false;
            this.mParent.post(this);
        }
    }

    public static final class FragmentLifecycleCallbacksHolder {
        public final FragmentManager.FragmentLifecycleCallbacks mCallback;
        public final boolean mRecursive;

        public FragmentLifecycleCallbacksHolder(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            this.mCallback = fragmentLifecycleCallbacks;
            this.mRecursive = z;
        }
    }

    public static class FragmentTag {
        public static final int[] Fragment = {16842755, 16842960, 16842961};
        public static final int Fragment_id = 1;
        public static final int Fragment_name = 0;
        public static final int Fragment_tag = 2;

        private FragmentTag() {
        }
    }

    public interface OpGenerator {
        boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class PopBackStackState implements OpGenerator {
        public final int mFlags;
        public final int mId;
        public final String mName;

        public PopBackStackState(String str, int i2, int i3) {
            this.mName = str;
            this.mId = i2;
            this.mFlags = i3;
        }

        public boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManagerImpl.this.mPrimaryNav;
            if (fragment != null && this.mId < 0 && this.mName == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
                return false;
            }
            return FragmentManagerImpl.this.popBackStackState(arrayList, arrayList2, this.mName, this.mId, this.mFlags);
        }
    }

    public static class StartEnterTransitionListener implements Fragment.OnStartEnterTransitionListener {
        public final boolean mIsBack;
        private int mNumPostponed;
        public final BackStackRecord mRecord;

        public StartEnterTransitionListener(BackStackRecord backStackRecord, boolean z) {
            this.mIsBack = z;
            this.mRecord = backStackRecord;
        }

        public void cancelTransaction() {
            BackStackRecord backStackRecord = this.mRecord;
            backStackRecord.mManager.completeExecute(backStackRecord, this.mIsBack, false, false);
        }

        public void completeTransaction() {
            boolean z = this.mNumPostponed > 0;
            FragmentManagerImpl fragmentManagerImpl = this.mRecord.mManager;
            int size = fragmentManagerImpl.mAdded.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = fragmentManagerImpl.mAdded.get(i2);
                fragment.setOnStartEnterTransitionListener((Fragment.OnStartEnterTransitionListener) null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            BackStackRecord backStackRecord = this.mRecord;
            backStackRecord.mManager.completeExecute(backStackRecord, this.mIsBack, !z, true);
        }

        public boolean isReady() {
            return this.mNumPostponed == 0;
        }

        public void onStartEnterTransition() {
            int i2 = this.mNumPostponed - 1;
            this.mNumPostponed = i2;
            if (i2 == 0) {
                this.mRecord.mManager.scheduleCommit();
            }
        }

        public void startListening() {
            this.mNumPostponed++;
        }
    }

    private void addAddedFragments(ArraySet<Fragment> arraySet) {
        int i2 = this.mCurState;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.mAdded.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = this.mAdded.get(i3);
                if (fragment.mState < min) {
                    moveToState(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        arraySet.add(fragment);
                    }
                }
            }
        }
    }

    private void animateRemoveFragment(@NonNull final Fragment fragment, @NonNull AnimationOrAnimator animationOrAnimator, int i2) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i2);
        if (animationOrAnimator.animation != null) {
            EndViewTransitionAnimation endViewTransitionAnimation = new EndViewTransitionAnimation(animationOrAnimator.animation, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    viewGroup.post(new Runnable() {
                        public void run() {
                            if (fragment.getAnimatingAway() != null) {
                                fragment.setAnimatingAway((View) null);
                                AnonymousClass3 r0 = AnonymousClass3.this;
                                FragmentManagerImpl fragmentManagerImpl = FragmentManagerImpl.this;
                                Fragment fragment = fragment;
                                fragmentManagerImpl.moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                            }
                        }
                    });
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
            fragment.mView.startAnimation(endViewTransitionAnimation);
            return;
        }
        Animator animator = animationOrAnimator.animator;
        fragment.setAnimator(animator);
        animator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator animator2 = fragment.getAnimator();
                fragment.setAnimator((Animator) null);
                if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
                    FragmentManagerImpl fragmentManagerImpl = FragmentManagerImpl.this;
                    Fragment fragment = fragment;
                    fragmentManagerImpl.moveToState(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private void burpActive() {
        this.mActive.values().removeAll(Collections.singleton((Object) null));
    }

    private void checkStateLoss() {
        if (isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(@Nullable Fragment fragment) {
        if (fragment != null && this.mActive.get(fragment.mWho) == fragment) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* JADX INFO: finally extract failed */
    private void dispatchStateChange(int i2) {
        try {
            this.mExecutingActions = true;
            moveToState(i2, false);
            this.mExecutingActions = false;
            execPendingActions();
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    private void endAnimatingAwayFragments() {
        for (Fragment next : this.mActive.values()) {
            if (next != null) {
                if (next.getAnimatingAway() != null) {
                    int stateAfterAnimating = next.getStateAfterAnimating();
                    View animatingAway = next.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    next.setAnimatingAway((View) null);
                    moveToState(next, stateAfterAnimating, 0, 0, false);
                } else if (next.getAnimator() != null) {
                    next.getAnimator().end();
                }
            }
        }
    }

    private void ensureExecReady(boolean z) {
        if (this.mExecutingActions) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.mHost == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.mHost.getHandler().getLooper()) {
            if (!z) {
                checkStateLoss();
            }
            if (this.mTmpRecords == null) {
                this.mTmpRecords = new ArrayList<>();
                this.mTmpIsPop = new ArrayList<>();
            }
            this.mExecutingActions = true;
            try {
                executePostponedTransaction((ArrayList<BackStackRecord>) null, (ArrayList<Boolean>) null);
            } finally {
                this.mExecutingActions = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private static void executeOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            BackStackRecord backStackRecord = arrayList.get(i2);
            boolean z = true;
            if (arrayList2.get(i2).booleanValue()) {
                backStackRecord.bumpBackStackNesting(-1);
                if (i2 != i3 - 1) {
                    z = false;
                }
                backStackRecord.executePopOps(z);
            } else {
                backStackRecord.bumpBackStackNesting(1);
                backStackRecord.executeOps();
            }
            i2++;
        }
    }

    private void executeOpsTogether(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        ArrayList<BackStackRecord> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i6 = i2;
        int i7 = i3;
        boolean z = arrayList3.get(i6).mReorderingAllowed;
        ArrayList<Fragment> arrayList5 = this.mTmpAddedFragments;
        if (arrayList5 == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.mTmpAddedFragments.addAll(this.mAdded);
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z2 = false;
        for (int i8 = i6; i8 < i7; i8++) {
            BackStackRecord backStackRecord = arrayList3.get(i8);
            primaryNavigationFragment = !arrayList4.get(i8).booleanValue() ? backStackRecord.expandOps(this.mTmpAddedFragments, primaryNavigationFragment) : backStackRecord.trackAddedFragmentsInPop(this.mTmpAddedFragments, primaryNavigationFragment);
            z2 = z2 || backStackRecord.mAddToBackStack;
        }
        this.mTmpAddedFragments.clear();
        if (!z) {
            FragmentTransition.startTransitions(this, arrayList, arrayList2, i2, i3, false);
        }
        executeOps(arrayList, arrayList2, i2, i3);
        if (z) {
            ArraySet arraySet = new ArraySet();
            addAddedFragments(arraySet);
            int postponePostponableTransactions = postponePostponableTransactions(arrayList, arrayList2, i2, i3, arraySet);
            makeRemovedFragmentsInvisible(arraySet);
            i4 = postponePostponableTransactions;
        } else {
            i4 = i7;
        }
        if (i4 != i6 && z) {
            FragmentTransition.startTransitions(this, arrayList, arrayList2, i2, i4, true);
            moveToState(this.mCurState, true);
        }
        while (i6 < i7) {
            BackStackRecord backStackRecord2 = arrayList3.get(i6);
            if (arrayList4.get(i6).booleanValue() && (i5 = backStackRecord2.mIndex) >= 0) {
                freeBackStackIndex(i5);
                backStackRecord2.mIndex = -1;
            }
            backStackRecord2.runOnCommitRunnables();
            i6++;
        }
        if (z2) {
            reportBackStackChanged();
        }
    }

    private void executePostponedTransaction(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<StartEnterTransitionListener> arrayList3 = this.mPostponedTransactions;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            StartEnterTransitionListener startEnterTransitionListener = this.mPostponedTransactions.get(i2);
            if (arrayList == null || startEnterTransitionListener.mIsBack || (indexOf2 = arrayList.indexOf(startEnterTransitionListener.mRecord)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if (startEnterTransitionListener.isReady() || (arrayList != null && startEnterTransitionListener.mRecord.interactsWith(arrayList, 0, arrayList.size()))) {
                    this.mPostponedTransactions.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || startEnterTransitionListener.mIsBack || (indexOf = arrayList.indexOf(startEnterTransitionListener.mRecord)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        startEnterTransitionListener.completeTransaction();
                    }
                }
                i2++;
            } else {
                this.mPostponedTransactions.remove(i2);
                i2--;
                size--;
            }
            startEnterTransitionListener.cancelTransaction();
            i2++;
        }
    }

    private Fragment findFragmentUnder(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.mAdded.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.mAdded.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void forcePostponedTransactions() {
        if (this.mPostponedTransactions != null) {
            while (!this.mPostponedTransactions.isEmpty()) {
                this.mPostponedTransactions.remove(0).completeTransaction();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean generateOpsForPendingActions(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<androidx.fragment.app.FragmentManagerImpl$OpGenerator> r0 = r4.mPendingActions     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000d
            goto L_0x0038
        L_0x000d:
            java.util.ArrayList<androidx.fragment.app.FragmentManagerImpl$OpGenerator> r0 = r4.mPendingActions     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            r2 = r1
        L_0x0014:
            if (r1 >= r0) goto L_0x0026
            java.util.ArrayList<androidx.fragment.app.FragmentManagerImpl$OpGenerator> r3 = r4.mPendingActions     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003a }
            androidx.fragment.app.FragmentManagerImpl$OpGenerator r3 = (androidx.fragment.app.FragmentManagerImpl.OpGenerator) r3     // Catch:{ all -> 0x003a }
            boolean r3 = r3.generateOps(r5, r6)     // Catch:{ all -> 0x003a }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0026:
            java.util.ArrayList<androidx.fragment.app.FragmentManagerImpl$OpGenerator> r5 = r4.mPendingActions     // Catch:{ all -> 0x003a }
            r5.clear()     // Catch:{ all -> 0x003a }
            androidx.fragment.app.FragmentHostCallback r5 = r4.mHost     // Catch:{ all -> 0x003a }
            android.os.Handler r5 = r5.getHandler()     // Catch:{ all -> 0x003a }
            java.lang.Runnable r6 = r4.mExecCommit     // Catch:{ all -> 0x003a }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.generateOpsForPendingActions(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    private boolean isMenuAvailable(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.checkForMenus();
    }

    public static AnimationOrAnimator makeFadeAnimation(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220);
        return new AnimationOrAnimator((Animation) alphaAnimation);
    }

    public static AnimationOrAnimator makeOpenCloseAnimation(float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(DECELERATE_QUINT);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(DECELERATE_CUBIC);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new AnimationOrAnimator((Animation) animationSet);
    }

    private void makeRemovedFragmentsInvisible(ArraySet<Fragment> arraySet) {
        int size = arraySet.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment valueAt = arraySet.valueAt(i2);
            if (!valueAt.mAdded) {
                View requireView = valueAt.requireView();
                valueAt.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    private boolean popBackStackImmediate(String str, int i2, int i3) {
        execPendingActions();
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i2, i3);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        burpActive();
        return popBackStackState;
    }

    private int postponePostponableTransactions(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, ArraySet<Fragment> arraySet) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            BackStackRecord backStackRecord = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (backStackRecord.isPostponed() && !backStackRecord.interactsWith(arrayList, i5 + 1, i3)) {
                if (this.mPostponedTransactions == null) {
                    this.mPostponedTransactions = new ArrayList<>();
                }
                StartEnterTransitionListener startEnterTransitionListener = new StartEnterTransitionListener(backStackRecord, booleanValue);
                this.mPostponedTransactions.add(startEnterTransitionListener);
                backStackRecord.setOnStartPostponedListener(startEnterTransitionListener);
                if (booleanValue) {
                    backStackRecord.executeOps();
                } else {
                    backStackRecord.executePopOps(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, backStackRecord);
                }
                addAddedFragments(arraySet);
            }
        }
        return i4;
    }

    private void removeRedundantOperationsAndExecute(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            executePostponedTransaction(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).mReorderingAllowed) {
                    if (i3 != i2) {
                        executeOpsTogether(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).mReorderingAllowed) {
                            i3++;
                        }
                    }
                    executeOpsTogether(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                executeOpsTogether(arrayList, arrayList2, i3, size);
            }
        }
    }

    public static int reverseTransit(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 == 4099) {
            return FragmentTransaction.TRANSIT_FRAGMENT_FADE;
        }
        if (i2 != 8194) {
            return 0;
        }
        return FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
    }

    private void throwException(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
        FragmentHostCallback fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.onDump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            dump("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    public static int transitToStyleIndex(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        }
        if (i2 == 4099) {
            return z ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    private void updateOnBackPressedCallbackEnabled() {
        ArrayList<OpGenerator> arrayList = this.mPendingActions;
        boolean z = true;
        if (arrayList == null || arrayList.isEmpty()) {
            OnBackPressedCallback onBackPressedCallback = this.mOnBackPressedCallback;
            if (getBackStackEntryCount() <= 0 || !isPrimaryNavigation(this.mParent)) {
                z = false;
            }
            onBackPressedCallback.setEnabled(z);
            return;
        }
        this.mOnBackPressedCallback.setEnabled(true);
    }

    public void addBackStackState(BackStackRecord backStackRecord) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStack.add(backStackRecord);
    }

    public void addFragment(Fragment fragment, boolean z) {
        if (DEBUG) {
            a.J("add: ", fragment, "FragmentManager");
        }
        makeActive(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.mAdded.contains(fragment)) {
            synchronized (this.mAdded) {
                this.mAdded.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            if (z) {
                moveToState(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void addOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(onBackStackChangedListener);
    }

    public void addRetainedFragment(@NonNull Fragment fragment) {
        if (isStateSaved()) {
            if (DEBUG) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.mNonConfig.addRetainedFragment(fragment) && DEBUG) {
            a.J("Updating retained Fragments: Added ", fragment, "FragmentManager");
        }
    }

    public int allocBackStackIndex(BackStackRecord backStackRecord) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.mAvailBackStackIndices;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    ArrayList<Integer> arrayList2 = this.mAvailBackStackIndices;
                    int intValue = arrayList2.remove(arrayList2.size() - 1).intValue();
                    if (DEBUG) {
                        Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + backStackRecord);
                    }
                    this.mBackStackIndices.set(intValue, backStackRecord);
                    return intValue;
                }
            }
            if (this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList<>();
            }
            int size = this.mBackStackIndices.size();
            if (DEBUG) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + backStackRecord);
            }
            this.mBackStackIndices.add(backStackRecord);
            return size;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.activity.OnBackPressedDispatcherOwner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void attachController(@androidx.annotation.NonNull androidx.fragment.app.FragmentHostCallback r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentContainer r4, @androidx.annotation.Nullable androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.FragmentHostCallback r0 = r2.mHost
            if (r0 != 0) goto L_0x0046
            r2.mHost = r3
            r2.mContainer = r4
            r2.mParent = r5
            if (r5 == 0) goto L_0x000f
            r2.updateOnBackPressedCallbackEnabled()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r4 == 0) goto L_0x0024
            r4 = r3
            androidx.activity.OnBackPressedDispatcherOwner r4 = (androidx.activity.OnBackPressedDispatcherOwner) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.mOnBackPressedDispatcher = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r0.addCallback(r4, r1)
        L_0x0024:
            if (r5 == 0) goto L_0x002f
            androidx.fragment.app.FragmentManagerImpl r3 = r5.mFragmentManager
            androidx.fragment.app.FragmentManagerViewModel r3 = r3.getChildNonConfig(r5)
        L_0x002c:
            r2.mNonConfig = r3
            goto L_0x0045
        L_0x002f:
            boolean r4 = r3 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r4 == 0) goto L_0x003e
            androidx.lifecycle.ViewModelStoreOwner r3 = (androidx.lifecycle.ViewModelStoreOwner) r3
            androidx.lifecycle.ViewModelStore r3 = r3.getViewModelStore()
            androidx.fragment.app.FragmentManagerViewModel r3 = androidx.fragment.app.FragmentManagerViewModel.getInstance(r3)
            goto L_0x002c
        L_0x003e:
            androidx.fragment.app.FragmentManagerViewModel r3 = new androidx.fragment.app.FragmentManagerViewModel
            r4 = 0
            r3.<init>(r4)
            goto L_0x002c
        L_0x0045:
            return
        L_0x0046:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.attachController(androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer, androidx.fragment.app.Fragment):void");
    }

    public void attachFragment(Fragment fragment) {
        if (DEBUG) {
            a.J("attach: ", fragment, "FragmentManager");
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.mAdded.contains(fragment)) {
                if (DEBUG) {
                    a.J("add from attach: ", fragment, "FragmentManager");
                }
                synchronized (this.mAdded) {
                    this.mAdded.add(fragment);
                }
                fragment.mAdded = true;
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    @NonNull
    public FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }

    public boolean checkForMenus() {
        boolean z = false;
        for (Fragment next : this.mActive.values()) {
            if (next != null) {
                z = isMenuAvailable(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void completeExecute(BackStackRecord backStackRecord, boolean z, boolean z2, boolean z3) {
        if (z) {
            backStackRecord.executePopOps(z3);
        } else {
            backStackRecord.executeOps();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(backStackRecord);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            FragmentTransition.startTransitions(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            moveToState(this.mCurState, true);
        }
        for (Fragment next : this.mActive.values()) {
            if (next != null && next.mView != null && next.mIsNewlyAdded && backStackRecord.interactsWith(next.mContainerId)) {
                float f = next.mPostponedAlpha;
                if (f > 0.0f) {
                    next.mView.setAlpha(f);
                }
                if (z3) {
                    next.mPostponedAlpha = 0.0f;
                } else {
                    next.mPostponedAlpha = -1.0f;
                    next.mIsNewlyAdded = false;
                }
            }
        }
    }

    public void completeShowHideFragment(final Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            AnimationOrAnimator loadAnimation = loadAnimation(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (loadAnimation == null || (animator = loadAnimation.animator) == null) {
                if (loadAnimation != null) {
                    fragment.mView.startAnimation(loadAnimation.animation);
                    loadAnimation.animation.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    loadAnimation.animator.addListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            Fragment fragment = fragment;
                            View view = fragment.mView;
                            if (view != null && fragment.mHidden) {
                                view.setVisibility(8);
                            }
                        }
                    });
                }
                loadAnimation.animator.start();
            }
        }
        if (fragment.mAdded && isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public void detachFragment(Fragment fragment) {
        if (DEBUG) {
            a.J("detach: ", fragment, "FragmentManager");
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (DEBUG) {
                    a.J("remove from detach: ", fragment, "FragmentManager");
                }
                synchronized (this.mAdded) {
                    this.mAdded.remove(fragment);
                }
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(2);
    }

    public void dispatchConfigurationChanged(@NonNull Configuration configuration) {
        for (int i2 = 0; i2 < this.mAdded.size(); i2++) {
            Fragment fragment = this.mAdded.get(i2);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean dispatchContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.mAdded.size(); i2++) {
            Fragment fragment = this.mAdded.get(i2);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(1);
    }

    public boolean dispatchCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.mAdded.size(); i2++) {
            Fragment fragment = this.mAdded.get(i2);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i3 = 0; i3 < this.mCreatedMenus.size(); i3++) {
                Fragment fragment2 = this.mCreatedMenus.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions();
        dispatchStateChange(0);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
    }

    public void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    public void dispatchLowMemory() {
        for (int i2 = 0; i2 < this.mAdded.size(); i2++) {
            Fragment fragment = this.mAdded.get(i2);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public void dispatchMultiWindowModeChanged(boolean z) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    public void dispatchOnFragmentActivityCreated(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentActivityCreated(fragment, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentActivityCreated(this, fragment, bundle);
            }
        }
    }

    public void dispatchOnFragmentAttached(@NonNull Fragment fragment, @NonNull Context context, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentAttached(fragment, context, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentAttached(this, fragment, context);
            }
        }
    }

    public void dispatchOnFragmentCreated(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentCreated(fragment, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentCreated(this, fragment, bundle);
            }
        }
    }

    public void dispatchOnFragmentDestroyed(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentDestroyed(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentDestroyed(this, fragment);
            }
        }
    }

    public void dispatchOnFragmentDetached(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentDetached(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentDetached(this, fragment);
            }
        }
    }

    public void dispatchOnFragmentPaused(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPaused(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentPaused(this, fragment);
            }
        }
    }

    public void dispatchOnFragmentPreAttached(@NonNull Fragment fragment, @NonNull Context context, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPreAttached(fragment, context, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentPreAttached(this, fragment, context);
            }
        }
    }

    public void dispatchOnFragmentPreCreated(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentPreCreated(fragment, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentPreCreated(this, fragment, bundle);
            }
        }
    }

    public void dispatchOnFragmentResumed(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentResumed(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentResumed(this, fragment);
            }
        }
    }

    public void dispatchOnFragmentSaveInstanceState(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentSaveInstanceState(fragment, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentSaveInstanceState(this, fragment, bundle);
            }
        }
    }

    public void dispatchOnFragmentStarted(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentStarted(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentStarted(this, fragment);
            }
        }
    }

    public void dispatchOnFragmentStopped(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentStopped(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentStopped(this, fragment);
            }
        }
    }

    public void dispatchOnFragmentViewCreated(@NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentViewCreated(fragment, view, bundle, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentViewCreated(this, fragment, view, bundle);
            }
        }
    }

    public void dispatchOnFragmentViewDestroyed(@NonNull Fragment fragment, boolean z) {
        Fragment fragment2 = this.mParent;
        if (fragment2 != null) {
            FragmentManager fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof FragmentManagerImpl) {
                ((FragmentManagerImpl) fragmentManager).dispatchOnFragmentViewDestroyed(fragment, true);
            }
        }
        Iterator<FragmentLifecycleCallbacksHolder> it = this.mLifecycleCallbacks.iterator();
        while (it.hasNext()) {
            FragmentLifecycleCallbacksHolder next = it.next();
            if (!z || next.mRecursive) {
                next.mCallback.onFragmentViewDestroyed(this, fragment);
            }
        }
    }

    public boolean dispatchOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.mAdded.size(); i2++) {
            Fragment fragment = this.mAdded.get(i2);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mCurState >= 1) {
            for (int i2 = 0; i2 < this.mAdded.size(); i2++) {
                Fragment fragment = this.mAdded.get(i2);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public void dispatchPause() {
        dispatchStateChange(3);
    }

    public void dispatchPictureInPictureModeChanged(boolean z) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    public boolean dispatchPrepareOptionsMenu(@NonNull Menu menu) {
        if (this.mCurState < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.mAdded.size(); i2++) {
            Fragment fragment = this.mAdded.get(i2);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(4);
    }

    public void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        dispatchStateChange(3);
    }

    public void dispatchStop() {
        this.mStopped = true;
        dispatchStateChange(2);
    }

    public void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String m2 = a.m(str, "    ");
        if (!this.mActive.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment next : this.mActive.values()) {
                printWriter.print(str);
                printWriter.println(next);
                if (next != null) {
                    next.dump(m2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.mAdded.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.mAdded.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.mCreatedMenus;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.mCreatedMenus.get(i3).toString());
            }
        }
        ArrayList<BackStackRecord> arrayList2 = this.mBackStack;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                BackStackRecord backStackRecord = this.mBackStack.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.dump(m2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<BackStackRecord> arrayList3 = this.mBackStackIndices;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.mBackStackIndices.get(i5));
                }
            }
            ArrayList<Integer> arrayList4 = this.mAvailBackStackIndices;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
            }
        }
        ArrayList<OpGenerator> arrayList5 = this.mPendingActions;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(this.mPendingActions.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    public void enqueueAction(OpGenerator opGenerator, boolean z) {
        if (!z) {
            checkStateLoss();
        }
        synchronized (this) {
            if (!this.mDestroyed) {
                if (this.mHost != null) {
                    if (this.mPendingActions == null) {
                        this.mPendingActions = new ArrayList<>();
                    }
                    this.mPendingActions.add(opGenerator);
                    scheduleCommit();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void ensureInflatedFragmentView(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), (ViewGroup) null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                fragment.mInnerView = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                dispatchOnFragmentViewCreated(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean execPendingActions() {
        ensureExecReady(true);
        boolean z = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
                z = true;
            } catch (Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        burpActive();
        return z;
    }

    public void execSingleAction(OpGenerator opGenerator, boolean z) {
        if (!z || (this.mHost != null && !this.mDestroyed)) {
            ensureExecReady(z);
            if (opGenerator.generateOps(this.mTmpRecords, this.mTmpIsPop)) {
                this.mExecutingActions = true;
                try {
                    removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                } finally {
                    cleanupExec();
                }
            }
            updateOnBackPressedCallbackEnabled();
            doPendingDeferredStart();
            burpActive();
        }
    }

    public boolean executePendingTransactions() {
        boolean execPendingActions = execPendingActions();
        forcePostponedTransactions();
        return execPendingActions;
    }

    @Nullable
    public Fragment findFragmentById(int i2) {
        for (int size = this.mAdded.size() - 1; size >= 0; size--) {
            Fragment fragment = this.mAdded.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (Fragment next : this.mActive.values()) {
            if (next != null && next.mFragmentId == i2) {
                return next;
            }
        }
        return null;
    }

    @Nullable
    public Fragment findFragmentByTag(@Nullable String str) {
        if (str != null) {
            for (int size = this.mAdded.size() - 1; size >= 0; size--) {
                Fragment fragment = this.mAdded.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment next : this.mActive.values()) {
            if (next != null && str.equals(next.mTag)) {
                return next;
            }
        }
        return null;
    }

    public Fragment findFragmentByWho(@NonNull String str) {
        Fragment findFragmentByWho;
        for (Fragment next : this.mActive.values()) {
            if (next != null && (findFragmentByWho = next.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public void freeBackStackIndex(int i2) {
        synchronized (this) {
            this.mBackStackIndices.set(i2, (Object) null);
            if (this.mAvailBackStackIndices == null) {
                this.mAvailBackStackIndices = new ArrayList<>();
            }
            if (DEBUG) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.mAvailBackStackIndices.add(Integer.valueOf(i2));
        }
    }

    public int getActiveFragmentCount() {
        return this.mActive.size();
    }

    @NonNull
    public List<Fragment> getActiveFragments() {
        return new ArrayList(this.mActive.values());
    }

    public FragmentManager.BackStackEntry getBackStackEntryAt(int i2) {
        return this.mBackStack.get(i2);
    }

    public int getBackStackEntryCount() {
        ArrayList<BackStackRecord> arrayList = this.mBackStack;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @NonNull
    public FragmentManagerViewModel getChildNonConfig(@NonNull Fragment fragment) {
        return this.mNonConfig.getChildNonConfig(fragment);
    }

    @Nullable
    public Fragment getFragment(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.mActive.get(string);
        if (fragment == null) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    @NonNull
    public FragmentFactory getFragmentFactory() {
        if (super.getFragmentFactory() == FragmentManager.DEFAULT_FACTORY) {
            Fragment fragment = this.mParent;
            if (fragment != null) {
                return fragment.mFragmentManager.getFragmentFactory();
            }
            setFragmentFactory(new FragmentFactory() {
                @NonNull
                public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
                    FragmentHostCallback fragmentHostCallback = FragmentManagerImpl.this.mHost;
                    return fragmentHostCallback.instantiate(fragmentHostCallback.getContext(), str, (Bundle) null);
                }
            });
        }
        return super.getFragmentFactory();
    }

    public List<Fragment> getFragments() {
        List<Fragment> list;
        if (this.mAdded.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.mAdded) {
            list = (List) this.mAdded.clone();
        }
        return list;
    }

    public LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this;
    }

    @Nullable
    public Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    @NonNull
    public ViewModelStore getViewModelStore(@NonNull Fragment fragment) {
        return this.mNonConfig.getViewModelStore(fragment);
    }

    public void handleOnBackPressed() {
        execPendingActions();
        if (this.mOnBackPressedCallback.isEnabled()) {
            popBackStackImmediate();
        } else {
            this.mOnBackPressedDispatcher.onBackPressed();
        }
    }

    public void hideFragment(Fragment fragment) {
        if (DEBUG) {
            a.J("hide: ", fragment, "FragmentManager");
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public boolean isPrimaryNavigation(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManagerImpl fragmentManagerImpl = fragment.mFragmentManager;
        return fragment == fragmentManagerImpl.getPrimaryNavigationFragment() && isPrimaryNavigation(fragmentManagerImpl.mParent);
    }

    public boolean isStateAtLeast(int i2) {
        return this.mCurState >= i2;
    }

    public boolean isStateSaved() {
        return this.mStateSaved || this.mStopped;
    }

    public AnimationOrAnimator loadAnimation(Fragment fragment, int i2, boolean z, int i3) {
        int transitToStyleIndex;
        int nextAnim = fragment.getNextAnim();
        boolean z2 = false;
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(i2, z, nextAnim);
        if (onCreateAnimation != null) {
            return new AnimationOrAnimator(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i2, z, nextAnim);
        if (onCreateAnimator != null) {
            return new AnimationOrAnimator(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.mHost.getContext().getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.mHost.getContext(), nextAnim);
                    if (loadAnimation != null) {
                        return new AnimationOrAnimator(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.mHost.getContext(), nextAnim);
                    if (loadAnimator != null) {
                        return new AnimationOrAnimator(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.mHost.getContext(), nextAnim);
                        if (loadAnimation2 != null) {
                            return new AnimationOrAnimator(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0 || (transitToStyleIndex = transitToStyleIndex(i2, z)) < 0) {
            return null;
        }
        switch (transitToStyleIndex) {
            case 1:
                return makeOpenCloseAnimation(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return makeOpenCloseAnimation(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return makeOpenCloseAnimation(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return makeOpenCloseAnimation(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return makeFadeAnimation(0.0f, 1.0f);
            case 6:
                return makeFadeAnimation(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.mHost.onHasWindowAnimations()) {
                    int onGetWindowAnimations = this.mHost.onGetWindowAnimations();
                }
                return null;
        }
    }

    public void makeActive(Fragment fragment) {
        if (this.mActive.get(fragment.mWho) == null) {
            this.mActive.put(fragment.mWho, fragment);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    addRetainedFragment(fragment);
                } else {
                    removeRetainedFragment(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (DEBUG) {
                a.J("Added fragment to active set ", fragment, "FragmentManager");
            }
        }
    }

    public void makeInactive(Fragment fragment) {
        if (this.mActive.get(fragment.mWho) != null) {
            if (DEBUG) {
                a.J("Removed fragment from active set ", fragment, "FragmentManager");
            }
            for (Fragment next : this.mActive.values()) {
                if (next != null && fragment.mWho.equals(next.mTargetWho)) {
                    next.mTarget = fragment;
                    next.mTargetWho = null;
                }
            }
            this.mActive.put(fragment.mWho, (Object) null);
            removeRetainedFragment(fragment);
            String str = fragment.mTargetWho;
            if (str != null) {
                fragment.mTarget = this.mActive.get(str);
            }
            fragment.initState();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        r0 = r0.mView;
        r1 = r11.mContainer;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void moveFragmentToExpectedState(androidx.fragment.app.Fragment r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r10.mActive
            java.lang.String r1 = r11.mWho
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x003a
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = " to state "
            r0.append(r11)
            int r11 = r10.mCurState
            r0.append(r11)
            java.lang.String r11 = "since it is not added to "
            r0.append(r11)
            r0.append(r10)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r11)
        L_0x0039:
            return
        L_0x003a:
            int r0 = r10.mCurState
            boolean r1 = r11.mRemoving
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0051
            boolean r1 = r11.isInBackStack()
            if (r1 == 0) goto L_0x004d
            int r0 = java.lang.Math.min(r0, r2)
            goto L_0x0051
        L_0x004d:
            int r0 = java.lang.Math.min(r0, r3)
        L_0x0051:
            r6 = r0
            int r7 = r11.getNextTransition()
            int r8 = r11.getNextTransitionStyle()
            r9 = 0
            r4 = r10
            r5 = r11
            r4.moveToState(r5, r6, r7, r8, r9)
            android.view.View r0 = r11.mView
            if (r0 == 0) goto L_0x00be
            androidx.fragment.app.Fragment r0 = r10.findFragmentUnder(r11)
            if (r0 == 0) goto L_0x0082
            android.view.View r0 = r0.mView
            android.view.ViewGroup r1 = r11.mContainer
            int r0 = r1.indexOfChild(r0)
            android.view.View r4 = r11.mView
            int r4 = r1.indexOfChild(r4)
            if (r4 >= r0) goto L_0x0082
            r1.removeViewAt(r4)
            android.view.View r4 = r11.mView
            r1.addView(r4, r0)
        L_0x0082:
            boolean r0 = r11.mIsNewlyAdded
            if (r0 == 0) goto L_0x00be
            android.view.ViewGroup r0 = r11.mContainer
            if (r0 == 0) goto L_0x00be
            float r0 = r11.mPostponedAlpha
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0096
            android.view.View r4 = r11.mView
            r4.setAlpha(r0)
        L_0x0096:
            r11.mPostponedAlpha = r1
            r11.mIsNewlyAdded = r3
            int r0 = r11.getNextTransition()
            int r1 = r11.getNextTransitionStyle()
            androidx.fragment.app.FragmentManagerImpl$AnimationOrAnimator r0 = r10.loadAnimation(r11, r0, r2, r1)
            if (r0 == 0) goto L_0x00be
            android.view.animation.Animation r1 = r0.animation
            if (r1 == 0) goto L_0x00b2
            android.view.View r0 = r11.mView
            r0.startAnimation(r1)
            goto L_0x00be
        L_0x00b2:
            android.animation.Animator r1 = r0.animator
            android.view.View r2 = r11.mView
            r1.setTarget(r2)
            android.animation.Animator r0 = r0.animator
            r0.start()
        L_0x00be:
            boolean r0 = r11.mHiddenChanged
            if (r0 == 0) goto L_0x00c5
            r10.completeShowHideFragment(r11)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.moveFragmentToExpectedState(androidx.fragment.app.Fragment):void");
    }

    public void moveToState(int i2, boolean z) {
        FragmentHostCallback fragmentHostCallback;
        if (this.mHost == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i2 != this.mCurState) {
            this.mCurState = i2;
            int size = this.mAdded.size();
            for (int i3 = 0; i3 < size; i3++) {
                moveFragmentToExpectedState(this.mAdded.get(i3));
            }
            for (Fragment next : this.mActive.values()) {
                if (next != null && ((next.mRemoving || next.mDetached) && !next.mIsNewlyAdded)) {
                    moveFragmentToExpectedState(next);
                }
            }
            startPendingDeferredFragments();
            if (this.mNeedMenuInvalidate && (fragmentHostCallback = this.mHost) != null && this.mCurState == 4) {
                fragmentHostCallback.onSupportInvalidateOptionsMenu();
                this.mNeedMenuInvalidate = false;
            }
        }
    }

    public void moveToState(Fragment fragment) {
        moveToState(fragment, this.mCurState, 0, 0, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e7, code lost:
        if (r11 > 2) goto L_0x00eb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void moveToState(androidx.fragment.app.Fragment r17, int r18, int r19, int r20, boolean r21) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            boolean r0 = r7.mAdded
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.mDetached
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r18
            goto L_0x0016
        L_0x0011:
            r0 = r18
            if (r0 <= r8) goto L_0x0016
            r0 = r8
        L_0x0016:
            boolean r1 = r7.mRemoving
            if (r1 == 0) goto L_0x002a
            int r1 = r7.mState
            if (r0 <= r1) goto L_0x002a
            if (r1 != 0) goto L_0x0028
            boolean r0 = r17.isInBackStack()
            if (r0 == 0) goto L_0x0028
            r0 = r8
            goto L_0x002a
        L_0x0028:
            int r0 = r7.mState
        L_0x002a:
            boolean r1 = r7.mDeferStart
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0037
            int r1 = r7.mState
            if (r1 >= r9) goto L_0x0037
            if (r0 <= r10) goto L_0x0037
            r0 = r10
        L_0x0037:
            androidx.lifecycle.Lifecycle$State r1 = r7.mMaxState
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.CREATED
            if (r1 != r2) goto L_0x0042
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x004a
        L_0x0042:
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004a:
            r11 = r0
            int r0 = r7.mState
            java.lang.String r12 = "FragmentManager"
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x02ba
            boolean r0 = r7.mFromLayout
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7.mInLayout
            if (r0 != 0) goto L_0x005c
            return
        L_0x005c:
            android.view.View r0 = r17.getAnimatingAway()
            if (r0 != 0) goto L_0x0068
            android.animation.Animator r0 = r17.getAnimator()
            if (r0 == 0) goto L_0x007c
        L_0x0068:
            r7.setAnimatingAway(r14)
            r7.setAnimator(r14)
            int r2 = r17.getStateAfterAnimating()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r1 = r17
            r0.moveToState(r1, r2, r3, r4, r5)
        L_0x007c:
            int r0 = r7.mState
            if (r0 == 0) goto L_0x0088
            if (r0 == r8) goto L_0x01bd
            if (r0 == r10) goto L_0x0291
            if (r0 == r9) goto L_0x02a3
            goto L_0x042f
        L_0x0088:
            if (r11 <= 0) goto L_0x01bd
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "moveto CREATED: "
            b.e.a.a.a.J(r0, r7, r12)
        L_0x0093:
            android.os.Bundle r0 = r7.mSavedFragmentState
            if (r0 == 0) goto L_0x00ea
            androidx.fragment.app.FragmentHostCallback r1 = r6.mHost
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.mSavedViewState = r0
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.Fragment r0 = r6.getFragment(r0, r1)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = r0.mWho
            goto L_0x00bc
        L_0x00bb:
            r0 = r14
        L_0x00bc:
            r7.mTargetWho = r0
            if (r0 == 0) goto L_0x00ca
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r13)
            r7.mTargetRequestCode = r0
        L_0x00ca:
            java.lang.Boolean r0 = r7.mSavedUserVisibleHint
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r0.booleanValue()
            r7.mUserVisibleHint = r0
            r7.mSavedUserVisibleHint = r14
            goto L_0x00e1
        L_0x00d7:
            android.os.Bundle r0 = r7.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.mUserVisibleHint = r0
        L_0x00e1:
            boolean r0 = r7.mUserVisibleHint
            if (r0 != 0) goto L_0x00ea
            r7.mDeferStart = r8
            if (r11 <= r10) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r10 = r11
        L_0x00eb:
            androidx.fragment.app.FragmentHostCallback r0 = r6.mHost
            r7.mHost = r0
            androidx.fragment.app.Fragment r1 = r6.mParent
            r7.mParentFragment = r1
            if (r1 == 0) goto L_0x00f8
            androidx.fragment.app.FragmentManagerImpl r0 = r1.mChildFragmentManager
            goto L_0x00fa
        L_0x00f8:
            androidx.fragment.app.FragmentManagerImpl r0 = r0.mFragmentManager
        L_0x00fa:
            r7.mFragmentManager = r0
            androidx.fragment.app.Fragment r0 = r7.mTarget
            java.lang.String r9 = " that does not belong to this FragmentManager!"
            java.lang.String r11 = " declared target fragment "
            java.lang.String r15 = "Fragment "
            if (r0 == 0) goto L_0x0148
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.mActive
            java.lang.String r0 = r0.mWho
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = r7.mTarget
            if (r0 != r1) goto L_0x0128
            int r0 = r1.mState
            if (r0 >= r8) goto L_0x011f
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.moveToState(r1, r2, r3, r4, r5)
        L_0x011f:
            androidx.fragment.app.Fragment r0 = r7.mTarget
            java.lang.String r0 = r0.mWho
            r7.mTargetWho = r0
            r7.mTarget = r14
            goto L_0x0148
        L_0x0128:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            r1.append(r11)
            androidx.fragment.app.Fragment r2 = r7.mTarget
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0148:
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x017f
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.mActive
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x0165
            int r0 = r1.mState
            if (r0 >= r8) goto L_0x017f
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r0.moveToState(r1, r2, r3, r4, r5)
            goto L_0x017f
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r7)
            r1.append(r11)
            java.lang.String r2 = r7.mTargetWho
            java.lang.String r1 = b.e.a.a.a.q(r1, r2, r9)
            r0.<init>(r1)
            throw r0
        L_0x017f:
            androidx.fragment.app.FragmentHostCallback r0 = r6.mHost
            android.content.Context r0 = r0.getContext()
            r6.dispatchOnFragmentPreAttached(r7, r0, r13)
            r17.performAttach()
            androidx.fragment.app.Fragment r0 = r7.mParentFragment
            if (r0 != 0) goto L_0x0195
            androidx.fragment.app.FragmentHostCallback r0 = r6.mHost
            r0.onAttachFragment(r7)
            goto L_0x0198
        L_0x0195:
            r0.onAttachFragment(r7)
        L_0x0198:
            androidx.fragment.app.FragmentHostCallback r0 = r6.mHost
            android.content.Context r0 = r0.getContext()
            r6.dispatchOnFragmentAttached(r7, r0, r13)
            boolean r0 = r7.mIsCreated
            if (r0 != 0) goto L_0x01b5
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.dispatchOnFragmentPreCreated(r7, r0, r13)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performCreate(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.dispatchOnFragmentCreated(r7, r0, r13)
            goto L_0x01bc
        L_0x01b5:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreChildFragmentState(r0)
            r7.mState = r8
        L_0x01bc:
            r11 = r10
        L_0x01bd:
            if (r11 <= 0) goto L_0x01c2
            r16.ensureInflatedFragmentView(r17)
        L_0x01c2:
            if (r11 <= r8) goto L_0x0290
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x01cd
            java.lang.String r0 = "moveto ACTIVITY_CREATED: "
            b.e.a.a.a.J(r0, r7, r12)
        L_0x01cd:
            boolean r0 = r7.mFromLayout
            if (r0 != 0) goto L_0x027b
            int r0 = r7.mContainerId
            if (r0 == 0) goto L_0x0231
            r1 = -1
            if (r0 != r1) goto L_0x01e8
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot create fragment "
            java.lang.String r2 = " for a container view with no id"
            java.lang.String r1 = b.e.a.a.a.l(r1, r7, r2)
            r0.<init>(r1)
            r6.throwException(r0)
        L_0x01e8:
            androidx.fragment.app.FragmentContainer r0 = r6.mContainer
            int r1 = r7.mContainerId
            android.view.View r0 = r0.onFindViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0232
            boolean r1 = r7.mRestored
            if (r1 != 0) goto L_0x0232
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x0203 }
            int r2 = r7.mContainerId     // Catch:{ NotFoundException -> 0x0203 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0203 }
            goto L_0x0205
        L_0x0203:
            java.lang.String r1 = "unknown"
        L_0x0205:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "No view found for id 0x"
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            int r4 = r7.mContainerId
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r6.throwException(r2)
            goto L_0x0232
        L_0x0231:
            r0 = r14
        L_0x0232:
            r7.mContainer = r0
            android.os.Bundle r1 = r7.mSavedFragmentState
            android.view.LayoutInflater r1 = r7.performGetLayoutInflater(r1)
            android.os.Bundle r2 = r7.mSavedFragmentState
            r7.performCreateView(r1, r0, r2)
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x0279
            r7.mInnerView = r1
            r1.setSaveFromParentEnabled(r13)
            if (r0 == 0) goto L_0x024f
            android.view.View r1 = r7.mView
            r0.addView(r1)
        L_0x024f:
            boolean r0 = r7.mHidden
            if (r0 == 0) goto L_0x025a
            android.view.View r0 = r7.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x025a:
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r7.onViewCreated(r0, r1)
            android.view.View r0 = r7.mView
            android.os.Bundle r1 = r7.mSavedFragmentState
            r6.dispatchOnFragmentViewCreated(r7, r0, r1, r13)
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0275
            android.view.ViewGroup r0 = r7.mContainer
            if (r0 == 0) goto L_0x0275
            goto L_0x0276
        L_0x0275:
            r8 = r13
        L_0x0276:
            r7.mIsNewlyAdded = r8
            goto L_0x027b
        L_0x0279:
            r7.mInnerView = r14
        L_0x027b:
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.performActivityCreated(r0)
            android.os.Bundle r0 = r7.mSavedFragmentState
            r6.dispatchOnFragmentActivityCreated(r7, r0, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x028e
            android.os.Bundle r0 = r7.mSavedFragmentState
            r7.restoreViewState(r0)
        L_0x028e:
            r7.mSavedFragmentState = r14
        L_0x0290:
            r10 = 2
        L_0x0291:
            if (r11 <= r10) goto L_0x02a2
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x029c
            java.lang.String r0 = "moveto STARTED: "
            b.e.a.a.a.J(r0, r7, r12)
        L_0x029c:
            r17.performStart()
            r6.dispatchOnFragmentStarted(r7, r13)
        L_0x02a2:
            r9 = 3
        L_0x02a3:
            if (r11 <= r9) goto L_0x042f
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x02ae
            java.lang.String r0 = "moveto RESUMED: "
            b.e.a.a.a.J(r0, r7, r12)
        L_0x02ae:
            r17.performResume()
            r6.dispatchOnFragmentResumed(r7, r13)
            r7.mSavedFragmentState = r14
            r7.mSavedViewState = r14
            goto L_0x042f
        L_0x02ba:
            if (r0 <= r11) goto L_0x042f
            if (r0 == r8) goto L_0x036d
            r1 = 2
            if (r0 == r1) goto L_0x02ed
            r1 = 3
            if (r0 == r1) goto L_0x02db
            r1 = 4
            if (r0 == r1) goto L_0x02c9
            goto L_0x042f
        L_0x02c9:
            if (r11 >= r1) goto L_0x02da
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x02d4
            java.lang.String r0 = "movefrom RESUMED: "
            b.e.a.a.a.J(r0, r7, r12)
        L_0x02d4:
            r17.performPause()
            r6.dispatchOnFragmentPaused(r7, r13)
        L_0x02da:
            r1 = 3
        L_0x02db:
            if (r11 >= r1) goto L_0x02ec
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x02e6
            java.lang.String r0 = "movefrom STARTED: "
            b.e.a.a.a.J(r0, r7, r12)
        L_0x02e6:
            r17.performStop()
            r6.dispatchOnFragmentStopped(r7, r13)
        L_0x02ec:
            r1 = 2
        L_0x02ed:
            if (r11 >= r1) goto L_0x036d
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x02f8
            java.lang.String r0 = "movefrom ACTIVITY_CREATED: "
            b.e.a.a.a.J(r0, r7, r12)
        L_0x02f8:
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x030b
            androidx.fragment.app.FragmentHostCallback r0 = r6.mHost
            boolean r0 = r0.onShouldSaveFragmentState(r7)
            if (r0 == 0) goto L_0x030b
            android.util.SparseArray<android.os.Parcelable> r0 = r7.mSavedViewState
            if (r0 != 0) goto L_0x030b
            r16.saveFragmentViewState(r17)
        L_0x030b:
            r17.performDestroyView()
            r6.dispatchOnFragmentViewDestroyed(r7, r13)
            android.view.View r0 = r7.mView
            if (r0 == 0) goto L_0x035e
            android.view.ViewGroup r1 = r7.mContainer
            if (r1 == 0) goto L_0x035e
            r1.endViewTransition(r0)
            android.view.View r0 = r7.mView
            r0.clearAnimation()
            androidx.fragment.app.Fragment r0 = r17.getParentFragment()
            if (r0 == 0) goto L_0x032f
            androidx.fragment.app.Fragment r0 = r17.getParentFragment()
            boolean r0 = r0.mRemoving
            if (r0 != 0) goto L_0x035e
        L_0x032f:
            int r0 = r6.mCurState
            r1 = 0
            if (r0 <= 0) goto L_0x034f
            boolean r0 = r6.mDestroyed
            if (r0 != 0) goto L_0x034f
            android.view.View r0 = r7.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x034f
            float r0 = r7.mPostponedAlpha
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x034f
            r0 = r19
            r2 = r20
            androidx.fragment.app.FragmentManagerImpl$AnimationOrAnimator r0 = r6.loadAnimation(r7, r0, r13, r2)
            goto L_0x0350
        L_0x034f:
            r0 = r14
        L_0x0350:
            r7.mPostponedAlpha = r1
            if (r0 == 0) goto L_0x0357
            r6.animateRemoveFragment(r7, r0, r11)
        L_0x0357:
            android.view.ViewGroup r0 = r7.mContainer
            android.view.View r1 = r7.mView
            r0.removeView(r1)
        L_0x035e:
            r7.mContainer = r14
            r7.mView = r14
            r7.mViewLifecycleOwner = r14
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r7.mViewLifecycleOwnerLiveData
            r0.setValue(r14)
            r7.mInnerView = r14
            r7.mInLayout = r13
        L_0x036d:
            if (r11 >= r8) goto L_0x042f
            boolean r0 = r6.mDestroyed
            if (r0 == 0) goto L_0x0394
            android.view.View r0 = r17.getAnimatingAway()
            if (r0 == 0) goto L_0x0384
            android.view.View r0 = r17.getAnimatingAway()
            r7.setAnimatingAway(r14)
            r0.clearAnimation()
            goto L_0x0394
        L_0x0384:
            android.animation.Animator r0 = r17.getAnimator()
            if (r0 == 0) goto L_0x0394
            android.animation.Animator r0 = r17.getAnimator()
            r7.setAnimator(r14)
            r0.cancel()
        L_0x0394:
            android.view.View r0 = r17.getAnimatingAway()
            if (r0 != 0) goto L_0x042b
            android.animation.Animator r0 = r17.getAnimator()
            if (r0 == 0) goto L_0x03a2
            goto L_0x042b
        L_0x03a2:
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x03ab
            java.lang.String r0 = "movefrom CREATED: "
            b.e.a.a.a.J(r0, r7, r12)
        L_0x03ab:
            boolean r0 = r7.mRemoving
            if (r0 == 0) goto L_0x03b7
            boolean r0 = r17.isInBackStack()
            if (r0 != 0) goto L_0x03b7
            r0 = r8
            goto L_0x03b8
        L_0x03b7:
            r0 = r13
        L_0x03b8:
            if (r0 != 0) goto L_0x03c6
            androidx.fragment.app.FragmentManagerViewModel r1 = r6.mNonConfig
            boolean r1 = r1.shouldDestroy(r7)
            if (r1 == 0) goto L_0x03c3
            goto L_0x03c6
        L_0x03c3:
            r7.mState = r13
            goto L_0x03f7
        L_0x03c6:
            androidx.fragment.app.FragmentHostCallback r1 = r6.mHost
            boolean r2 = r1 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r2 == 0) goto L_0x03d3
            androidx.fragment.app.FragmentManagerViewModel r1 = r6.mNonConfig
            boolean r8 = r1.isCleared()
            goto L_0x03e8
        L_0x03d3:
            android.content.Context r1 = r1.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x03e8
            androidx.fragment.app.FragmentHostCallback r1 = r6.mHost
            android.content.Context r1 = r1.getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r8 = r8 ^ r1
        L_0x03e8:
            if (r0 != 0) goto L_0x03ec
            if (r8 == 0) goto L_0x03f1
        L_0x03ec:
            androidx.fragment.app.FragmentManagerViewModel r1 = r6.mNonConfig
            r1.clearNonConfigState(r7)
        L_0x03f1:
            r17.performDestroy()
            r6.dispatchOnFragmentDestroyed(r7, r13)
        L_0x03f7:
            r17.performDetach()
            r6.dispatchOnFragmentDetached(r7, r13)
            if (r21 != 0) goto L_0x042f
            if (r0 != 0) goto L_0x0427
            androidx.fragment.app.FragmentManagerViewModel r0 = r6.mNonConfig
            boolean r0 = r0.shouldDestroy(r7)
            if (r0 == 0) goto L_0x040a
            goto L_0x0427
        L_0x040a:
            r7.mHost = r14
            r7.mParentFragment = r14
            r7.mFragmentManager = r14
            java.lang.String r0 = r7.mTargetWho
            if (r0 == 0) goto L_0x042f
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.mActive
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x042f
            boolean r1 = r0.getRetainInstance()
            if (r1 == 0) goto L_0x042f
            r7.mTarget = r0
            goto L_0x042f
        L_0x0427:
            r16.makeInactive(r17)
            goto L_0x042f
        L_0x042b:
            r7.setStateAfterAnimating(r11)
            goto L_0x0430
        L_0x042f:
            r8 = r11
        L_0x0430:
            int r0 = r7.mState
            if (r0 == r8) goto L_0x045c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r12, r0)
            r7.mState = r8
        L_0x045c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManagerImpl.moveToState(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    public void noteStateNotSaved() {
        this.mStateSaved = false;
        this.mStopped = false;
        int size = this.mAdded.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.mAdded.get(i2);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentTag.Fragment);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !FragmentFactory.isFragmentClass(context.getClassLoader(), str2)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        if (resourceId != -1) {
            fragment = findFragmentById(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = findFragmentByTag(string);
        }
        if (fragment == null && i2 != -1) {
            fragment = findFragmentById(i2);
        }
        if (DEBUG) {
            StringBuilder y = a.y("onCreateView: id=0x");
            y.append(Integer.toHexString(resourceId));
            y.append(" fname=");
            y.append(str2);
            y.append(" existing=");
            y.append(fragment);
            Log.v("FragmentManager", y.toString());
        }
        if (fragment == null) {
            fragment = getFragmentFactory().instantiate(context.getClassLoader(), str2);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : i2;
            fragment.mContainerId = i2;
            fragment.mTag = string;
            fragment.mInLayout = true;
            fragment.mFragmentManager = this;
            FragmentHostCallback fragmentHostCallback = this.mHost;
            fragment.mHost = fragmentHostCallback;
            fragment.onInflate(fragmentHostCallback.getContext(), attributeSet, fragment.mSavedFragmentState);
            addFragment(fragment, true);
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            FragmentHostCallback fragmentHostCallback2 = this.mHost;
            fragment.mHost = fragmentHostCallback2;
            fragment.onInflate(fragmentHostCallback2.getContext(), attributeSet, fragment.mSavedFragmentState);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str2);
        }
        Fragment fragment2 = fragment;
        if (this.mCurState >= 1 || !fragment2.mFromLayout) {
            moveToState(fragment2);
        } else {
            moveToState(fragment2, 1, 0, 0, false);
        }
        View view2 = fragment2.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment2.mView.getTag() == null) {
                fragment2.mView.setTag(string);
            }
            return fragment2.mView;
        }
        throw new IllegalStateException(a.n("Fragment ", str2, " did not create a view."));
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public void performPendingDeferredStart(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.mExecutingActions) {
            this.mHavePendingDeferredStart = true;
            return;
        }
        fragment.mDeferStart = false;
        moveToState(fragment, this.mCurState, 0, 0, false);
    }

    public void popBackStack() {
        enqueueAction(new PopBackStackState((String) null, -1, 0), false);
    }

    public void popBackStack(int i2, int i3) {
        if (i2 >= 0) {
            enqueueAction(new PopBackStackState((String) null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException(a.g("Bad id: ", i2));
    }

    public void popBackStack(@Nullable String str, int i2) {
        enqueueAction(new PopBackStackState(str, -1, i2), false);
    }

    public boolean popBackStackImmediate() {
        checkStateLoss();
        return popBackStackImmediate((String) null, -1, 0);
    }

    public boolean popBackStackImmediate(int i2, int i3) {
        checkStateLoss();
        execPendingActions();
        if (i2 >= 0) {
            return popBackStackImmediate((String) null, i2, i3);
        }
        throw new IllegalArgumentException(a.g("Bad id: ", i2));
    }

    public boolean popBackStackImmediate(@Nullable String str, int i2) {
        checkStateLoss();
        return popBackStackImmediate(str, -1, i2);
    }

    public boolean popBackStackState(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        Boolean bool = Boolean.TRUE;
        ArrayList<BackStackRecord> arrayList3 = this.mBackStack;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(bool);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    BackStackRecord backStackRecord = this.mBackStack.get(size2);
                    if ((str != null && str.equals(backStackRecord.getName())) || (i2 >= 0 && i2 == backStackRecord.mIndex)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        BackStackRecord backStackRecord2 = this.mBackStack.get(size2);
                        if ((str == null || !str.equals(backStackRecord2.getName())) && (i2 < 0 || i2 != backStackRecord2.mIndex)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.mBackStack.size() - 1) {
                return false;
            }
            for (int size3 = this.mBackStack.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.mBackStack.remove(size3));
                arrayList2.add(bool);
            }
        }
        return true;
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException(a.l("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void registerFragmentLifecycleCallbacks(@NonNull FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.mLifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(fragmentLifecycleCallbacks, z));
    }

    public void removeFragment(Fragment fragment) {
        if (DEBUG) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.mAdded) {
                this.mAdded.remove(fragment);
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    public void removeOnBackStackChangedListener(FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        ArrayList<FragmentManager.OnBackStackChangedListener> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(onBackStackChangedListener);
        }
    }

    public void removeRetainedFragment(@NonNull Fragment fragment) {
        if (isStateSaved()) {
            if (DEBUG) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.mNonConfig.removeRetainedFragment(fragment) && DEBUG) {
            a.J("Updating retained Fragments: Removed ", fragment, "FragmentManager");
        }
    }

    public void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i2 = 0; i2 < this.mBackStackChangeListeners.size(); i2++) {
                this.mBackStackChangeListeners.get(i2).onBackStackChanged();
            }
        }
    }

    public void restoreAllState(Parcelable parcelable, FragmentManagerNonConfig fragmentManagerNonConfig) {
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.restoreFromSnapshot(fragmentManagerNonConfig);
        restoreSaveState(parcelable);
    }

    public void restoreSaveState(Parcelable parcelable) {
        FragmentState fragmentState;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.mActive != null) {
                for (Fragment next : this.mNonConfig.getRetainedFragments()) {
                    if (DEBUG) {
                        a.J("restoreSaveState: re-attaching retained ", next, "FragmentManager");
                    }
                    Iterator<FragmentState> it = fragmentManagerState.mActive.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fragmentState = null;
                            break;
                        }
                        fragmentState = it.next();
                        if (fragmentState.mWho.equals(next.mWho)) {
                            break;
                        }
                    }
                    if (fragmentState == null) {
                        if (DEBUG) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next + " that was not found in the set of active Fragments " + fragmentManagerState.mActive);
                        }
                        Fragment fragment = next;
                        moveToState(fragment, 1, 0, 0, false);
                        next.mRemoving = true;
                        moveToState(fragment, 0, 0, 0, false);
                    } else {
                        fragmentState.mInstance = next;
                        next.mSavedViewState = null;
                        next.mBackStackNesting = 0;
                        next.mInLayout = false;
                        next.mAdded = false;
                        Fragment fragment2 = next.mTarget;
                        next.mTargetWho = fragment2 != null ? fragment2.mWho : null;
                        next.mTarget = null;
                        Bundle bundle = fragmentState.mSavedFragmentState;
                        if (bundle != null) {
                            bundle.setClassLoader(this.mHost.getContext().getClassLoader());
                            next.mSavedViewState = fragmentState.mSavedFragmentState.getSparseParcelableArray(VIEW_STATE_TAG);
                            next.mSavedFragmentState = fragmentState.mSavedFragmentState;
                        }
                    }
                }
                this.mActive.clear();
                Iterator<FragmentState> it2 = fragmentManagerState.mActive.iterator();
                while (it2.hasNext()) {
                    FragmentState next2 = it2.next();
                    if (next2 != null) {
                        Fragment instantiate = next2.instantiate(this.mHost.getContext().getClassLoader(), getFragmentFactory());
                        instantiate.mFragmentManager = this;
                        if (DEBUG) {
                            StringBuilder y = a.y("restoreSaveState: active (");
                            y.append(instantiate.mWho);
                            y.append("): ");
                            y.append(instantiate);
                            Log.v("FragmentManager", y.toString());
                        }
                        this.mActive.put(instantiate.mWho, instantiate);
                        next2.mInstance = null;
                    }
                }
                this.mAdded.clear();
                ArrayList<String> arrayList = fragmentManagerState.mAdded;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String next3 = it3.next();
                        Fragment fragment3 = this.mActive.get(next3);
                        if (fragment3 == null) {
                            throwException(new IllegalStateException(a.n("No instantiated fragment for (", next3, ")")));
                        }
                        fragment3.mAdded = true;
                        if (DEBUG) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + next3 + "): " + fragment3);
                        }
                        if (!this.mAdded.contains(fragment3)) {
                            synchronized (this.mAdded) {
                                this.mAdded.add(fragment3);
                            }
                        } else {
                            throw new IllegalStateException("Already added " + fragment3);
                        }
                    }
                }
                if (fragmentManagerState.mBackStack != null) {
                    this.mBackStack = new ArrayList<>(fragmentManagerState.mBackStack.length);
                    int i2 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.mBackStack;
                        if (i2 >= backStackStateArr.length) {
                            break;
                        }
                        BackStackRecord instantiate2 = backStackStateArr[i2].instantiate(this);
                        if (DEBUG) {
                            StringBuilder z = a.z("restoreAllState: back stack #", i2, " (index ");
                            z.append(instantiate2.mIndex);
                            z.append("): ");
                            z.append(instantiate2);
                            Log.v("FragmentManager", z.toString());
                            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
                            instantiate2.dump("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.mBackStack.add(instantiate2);
                        int i3 = instantiate2.mIndex;
                        if (i3 >= 0) {
                            setBackStackIndex(i3, instantiate2);
                        }
                        i2++;
                    }
                } else {
                    this.mBackStack = null;
                }
                String str = fragmentManagerState.mPrimaryNavActiveWho;
                if (str != null) {
                    Fragment fragment4 = this.mActive.get(str);
                    this.mPrimaryNav = fragment4;
                    dispatchParentPrimaryNavigationFragmentChanged(fragment4);
                }
                this.mNextFragmentIndex = fragmentManagerState.mNextFragmentIndex;
            }
        }
    }

    @Deprecated
    public FragmentManagerNonConfig retainNonConfig() {
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.getSnapshot();
    }

    public Parcelable saveAllState() {
        ArrayList<String> arrayList;
        int size;
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions();
        this.mStateSaved = true;
        BackStackState[] backStackStateArr = null;
        if (this.mActive.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(this.mActive.size());
        boolean z = false;
        for (Fragment next : this.mActive.values()) {
            if (next != null) {
                if (next.mFragmentManager != this) {
                    throwException(new IllegalStateException(a.l("Failure saving state: active ", next, " was removed from the FragmentManager")));
                }
                FragmentState fragmentState = new FragmentState(next);
                arrayList2.add(fragmentState);
                if (next.mState <= 0 || fragmentState.mSavedFragmentState != null) {
                    fragmentState.mSavedFragmentState = next.mSavedFragmentState;
                } else {
                    fragmentState.mSavedFragmentState = saveFragmentBasicState(next);
                    String str = next.mTargetWho;
                    if (str != null) {
                        Fragment fragment = this.mActive.get(str);
                        if (fragment == null) {
                            throwException(new IllegalStateException("Failure saving state: " + next + " has target not in fragment manager: " + next.mTargetWho));
                        }
                        if (fragmentState.mSavedFragmentState == null) {
                            fragmentState.mSavedFragmentState = new Bundle();
                        }
                        putFragment(fragmentState.mSavedFragmentState, TARGET_STATE_TAG, fragment);
                        int i2 = next.mTargetRequestCode;
                        if (i2 != 0) {
                            fragmentState.mSavedFragmentState.putInt(TARGET_REQUEST_CODE_STATE_TAG, i2);
                        }
                    }
                }
                if (DEBUG) {
                    Log.v("FragmentManager", "Saved state of " + next + ": " + fragmentState.mSavedFragmentState);
                }
                z = true;
            }
        }
        if (!z) {
            if (DEBUG) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.mAdded.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it = this.mAdded.iterator();
            while (it.hasNext()) {
                Fragment next2 = it.next();
                arrayList.add(next2.mWho);
                if (next2.mFragmentManager != this) {
                    throwException(new IllegalStateException(a.l("Failure saving state: active ", next2, " was removed from the FragmentManager")));
                }
                if (DEBUG) {
                    StringBuilder y = a.y("saveAllState: adding fragment (");
                    y.append(next2.mWho);
                    y.append("): ");
                    y.append(next2);
                    Log.v("FragmentManager", y.toString());
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<BackStackRecord> arrayList3 = this.mBackStack;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i3 = 0; i3 < size; i3++) {
                backStackStateArr[i3] = new BackStackState(this.mBackStack.get(i3));
                if (DEBUG) {
                    StringBuilder z2 = a.z("saveAllState: adding back stack #", i3, ": ");
                    z2.append(this.mBackStack.get(i3));
                    Log.v("FragmentManager", z2.toString());
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.mActive = arrayList2;
        fragmentManagerState.mAdded = arrayList;
        fragmentManagerState.mBackStack = backStackStateArr;
        Fragment fragment2 = this.mPrimaryNav;
        if (fragment2 != null) {
            fragmentManagerState.mPrimaryNavActiveWho = fragment2.mWho;
        }
        fragmentManagerState.mNextFragmentIndex = this.mNextFragmentIndex;
        return fragmentManagerState;
    }

    public Bundle saveFragmentBasicState(Fragment fragment) {
        if (this.mStateBundle == null) {
            this.mStateBundle = new Bundle();
        }
        fragment.performSaveInstanceState(this.mStateBundle);
        dispatchOnFragmentSaveInstanceState(fragment, this.mStateBundle, false);
        Bundle bundle = null;
        if (!this.mStateBundle.isEmpty()) {
            Bundle bundle2 = this.mStateBundle;
            this.mStateBundle = null;
            bundle = bundle2;
        }
        if (fragment.mView != null) {
            saveFragmentViewState(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(VIEW_STATE_TAG, fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(USER_VISIBLE_HINT_TAG, fragment.mUserVisibleHint);
        }
        return bundle;
    }

    @Nullable
    public Fragment.SavedState saveFragmentInstanceState(@NonNull Fragment fragment) {
        Bundle saveFragmentBasicState;
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException(a.l("Fragment ", fragment, " is not currently in the FragmentManager")));
        }
        if (fragment.mState <= 0 || (saveFragmentBasicState = saveFragmentBasicState(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(saveFragmentBasicState);
    }

    public void saveFragmentViewState(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.mStateArray;
            if (sparseArray == null) {
                this.mStateArray = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.mStateArray);
            if (this.mStateArray.size() > 0) {
                fragment.mSavedViewState = this.mStateArray;
                this.mStateArray = null;
            }
        }
    }

    public void scheduleCommit() {
        synchronized (this) {
            ArrayList<StartEnterTransitionListener> arrayList = this.mPostponedTransactions;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            ArrayList<OpGenerator> arrayList2 = this.mPendingActions;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                this.mHost.getHandler().post(this.mExecCommit);
                updateOnBackPressedCallbackEnabled();
            }
        }
    }

    public void setBackStackIndex(int i2, BackStackRecord backStackRecord) {
        synchronized (this) {
            if (this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList<>();
            }
            int size = this.mBackStackIndices.size();
            if (i2 < size) {
                if (DEBUG) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + backStackRecord);
                }
                this.mBackStackIndices.set(i2, backStackRecord);
            } else {
                while (size < i2) {
                    this.mBackStackIndices.add((Object) null);
                    if (this.mAvailBackStackIndices == null) {
                        this.mAvailBackStackIndices = new ArrayList<>();
                    }
                    if (DEBUG) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.mAvailBackStackIndices.add(Integer.valueOf(size));
                    size++;
                }
                if (DEBUG) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + backStackRecord);
                }
                this.mBackStackIndices.add(backStackRecord);
            }
        }
    }

    public void setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (this.mActive.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment == null || (this.mActive.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            Fragment fragment2 = this.mPrimaryNav;
            this.mPrimaryNav = fragment;
            dispatchParentPrimaryNavigationFragmentChanged(fragment2);
            dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void showFragment(Fragment fragment) {
        if (DEBUG) {
            a.J("show: ", fragment, "FragmentManager");
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void startPendingDeferredFragments() {
        for (Fragment next : this.mActive.values()) {
            if (next != null) {
                performPendingDeferredStart(next);
            }
        }
    }

    public String toString() {
        StringBuilder x = a.x(128, "FragmentManager{");
        x.append(Integer.toHexString(System.identityHashCode(this)));
        x.append(" in ");
        Object obj = this.mParent;
        if (obj == null) {
            obj = this.mHost;
        }
        DebugUtils.buildShortClassTag(obj, x);
        x.append("}}");
        return x.toString();
    }

    public void unregisterFragmentLifecycleCallbacks(@NonNull FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        synchronized (this.mLifecycleCallbacks) {
            int i2 = 0;
            int size = this.mLifecycleCallbacks.size();
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.mLifecycleCallbacks.get(i2).mCallback == fragmentLifecycleCallbacks) {
                    this.mLifecycleCallbacks.remove(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }
}
