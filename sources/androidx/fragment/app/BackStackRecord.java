package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.LogWriter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManagerImpl;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import b.e.a.a.a;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManagerImpl.OpGenerator {
    public static final String TAG = "FragmentManager";
    public boolean mCommitted;
    public int mIndex = -1;
    public final FragmentManagerImpl mManager;

    public BackStackRecord(FragmentManagerImpl fragmentManagerImpl) {
        this.mManager = fragmentManagerImpl;
    }

    private static boolean isFragmentPostponed(FragmentTransaction.Op op) {
        Fragment fragment = op.mFragment;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    public void bumpBackStackNesting(int i2) {
        if (this.mAddToBackStack) {
            if (FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.mOps.size();
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransaction.Op op = this.mOps.get(i3);
                Fragment fragment = op.mFragment;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (FragmentManagerImpl.DEBUG) {
                        StringBuilder y = a.y("Bump nesting of ");
                        y.append(op.mFragment);
                        y.append(" to ");
                        y.append(op.mFragment.mBackStackNesting);
                        Log.v("FragmentManager", y.toString());
                    }
                }
            }
        }
    }

    public int commit() {
        return commitInternal(false);
    }

    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    public int commitInternal(boolean z) {
        if (!this.mCommitted) {
            if (FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
                dump("  ", printWriter);
                printWriter.close();
            }
            this.mCommitted = true;
            this.mIndex = this.mAddToBackStack ? this.mManager.allocBackStackIndex(this) : -1;
            this.mManager.enqueueAction(this, z);
            return this.mIndex;
        }
        throw new IllegalStateException("commit already called");
    }

    public void commitNow() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, false);
    }

    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, true);
    }

    @NonNull
    public FragmentTransaction detach(@NonNull Fragment fragment) {
        FragmentManagerImpl fragmentManagerImpl = fragment.mFragmentManager;
        if (fragmentManagerImpl == null || fragmentManagerImpl == this.mManager) {
            return super.detach(fragment);
        }
        StringBuilder y = a.y("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        y.append(fragment.toString());
        y.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(y.toString());
    }

    public void doAddOp(int i2, Fragment fragment, @Nullable String str, int i3) {
        super.doAddOp(i2, fragment, str, i3);
        fragment.mFragmentManager = this.mManager;
    }

    public void dump(String str, PrintWriter printWriter) {
        dump(str, printWriter, true);
    }

    public void dump(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.mIndex);
            printWriter.print(" mCommitted=");
            printWriter.println(this.mCommitted);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.mTransitionStyle));
            }
            if (!(this.mEnterAnim == 0 && this.mExitAnim == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (!(this.mPopEnterAnim == 0 && this.mPopExitAnim == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (!(this.mBreadCrumbTitleRes == 0 && this.mBreadCrumbTitleText == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (!(this.mBreadCrumbShortTitleRes == 0 && this.mBreadCrumbShortTitleText == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (!this.mOps.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.mOps.size();
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.Op op = this.mOps.get(i2);
                switch (op.mCmd) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder y = a.y("cmd=");
                        y.append(op.mCmd);
                        str2 = y.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(op.mFragment);
                if (z) {
                    if (!(op.mEnterAnim == 0 && op.mExitAnim == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(op.mEnterAnim));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(op.mExitAnim));
                    }
                    if (op.mPopEnterAnim != 0 || op.mPopExitAnim != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(op.mPopEnterAnim));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(op.mPopExitAnim));
                    }
                }
            }
        }
    }

    public void executeOps() {
        int size = this.mOps.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.Op op = this.mOps.get(i2);
            Fragment fragment = op.mFragment;
            if (fragment != null) {
                fragment.setNextTransition(this.mTransition, this.mTransitionStyle);
            }
            switch (op.mCmd) {
                case 1:
                    fragment.setNextAnim(op.mEnterAnim);
                    this.mManager.addFragment(fragment, false);
                    break;
                case 3:
                    fragment.setNextAnim(op.mExitAnim);
                    this.mManager.removeFragment(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(op.mExitAnim);
                    this.mManager.hideFragment(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(op.mEnterAnim);
                    this.mManager.showFragment(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(op.mExitAnim);
                    this.mManager.detachFragment(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(op.mEnterAnim);
                    this.mManager.attachFragment(fragment);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment((Fragment) null);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, op.mCurrentMaxState);
                    break;
                default:
                    StringBuilder y = a.y("Unknown cmd: ");
                    y.append(op.mCmd);
                    throw new IllegalArgumentException(y.toString());
            }
            if (!(this.mReorderingAllowed || op.mCmd == 1 || fragment == null)) {
                this.mManager.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.mReorderingAllowed) {
            FragmentManagerImpl fragmentManagerImpl = this.mManager;
            fragmentManagerImpl.moveToState(fragmentManagerImpl.mCurState, true);
        }
    }

    public void executePopOps(boolean z) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.Op op = this.mOps.get(size);
            Fragment fragment = op.mFragment;
            if (fragment != null) {
                fragment.setNextTransition(FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle);
            }
            switch (op.mCmd) {
                case 1:
                    fragment.setNextAnim(op.mPopExitAnim);
                    this.mManager.removeFragment(fragment);
                    break;
                case 3:
                    fragment.setNextAnim(op.mPopEnterAnim);
                    this.mManager.addFragment(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(op.mPopEnterAnim);
                    this.mManager.showFragment(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(op.mPopExitAnim);
                    this.mManager.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(op.mPopEnterAnim);
                    this.mManager.attachFragment(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(op.mPopExitAnim);
                    this.mManager.detachFragment(fragment);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment((Fragment) null);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, op.mOldMaxState);
                    break;
                default:
                    StringBuilder y = a.y("Unknown cmd: ");
                    y.append(op.mCmd);
                    throw new IllegalArgumentException(y.toString());
            }
            if (!(this.mReorderingAllowed || op.mCmd == 3 || fragment == null)) {
                this.mManager.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.mReorderingAllowed && z) {
            FragmentManagerImpl fragmentManagerImpl = this.mManager;
            fragmentManagerImpl.moveToState(fragmentManagerImpl.mCurState, true);
        }
    }

    public Fragment expandOps(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.mOps.size()) {
            FragmentTransaction.Op op = this.mOps.get(i2);
            int i3 = op.mCmd;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = op.mFragment;
                    int i4 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i4) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.mOps.add(i2, new FragmentTransaction.Op(9, fragment4));
                                    i2++;
                                    fragment2 = null;
                                }
                                FragmentTransaction.Op op2 = new FragmentTransaction.Op(3, fragment4);
                                op2.mEnterAnim = op.mEnterAnim;
                                op2.mPopEnterAnim = op.mPopEnterAnim;
                                op2.mExitAnim = op.mExitAnim;
                                op2.mPopExitAnim = op.mPopExitAnim;
                                this.mOps.add(i2, op2);
                                arrayList2.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.mOps.remove(i2);
                        i2--;
                    } else {
                        op.mCmd = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList2.remove(op.mFragment);
                    Fragment fragment5 = op.mFragment;
                    if (fragment5 == fragment2) {
                        this.mOps.add(i2, new FragmentTransaction.Op(9, fragment5));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.mOps.add(i2, new FragmentTransaction.Op(9, fragment2));
                        i2++;
                        fragment2 = op.mFragment;
                    }
                }
                i2++;
            }
            arrayList2.add(op.mFragment);
            i2++;
        }
        return fragment2;
    }

    public boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.mAddToBackStack) {
            return true;
        }
        this.mManager.addBackStackState(this);
        return true;
    }

    @Nullable
    public CharSequence getBreadCrumbShortTitle() {
        return this.mBreadCrumbShortTitleRes != 0 ? this.mManager.mHost.getContext().getText(this.mBreadCrumbShortTitleRes) : this.mBreadCrumbShortTitleText;
    }

    public int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    @Nullable
    public CharSequence getBreadCrumbTitle() {
        return this.mBreadCrumbTitleRes != 0 ? this.mManager.mHost.getContext().getText(this.mBreadCrumbTitleRes) : this.mBreadCrumbTitleText;
    }

    public int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    public int getId() {
        return this.mIndex;
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    @NonNull
    public FragmentTransaction hide(@NonNull Fragment fragment) {
        FragmentManagerImpl fragmentManagerImpl = fragment.mFragmentManager;
        if (fragmentManagerImpl == null || fragmentManagerImpl == this.mManager) {
            return super.hide(fragment);
        }
        StringBuilder y = a.y("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        y.append(fragment.toString());
        y.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(y.toString());
    }

    public boolean interactsWith(int i2) {
        int size = this.mOps.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.mOps.get(i3).mFragment;
            int i4 = fragment != null ? fragment.mContainerId : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean interactsWith(ArrayList<BackStackRecord> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.mOps.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.mOps.get(i5).mFragment;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    BackStackRecord backStackRecord = arrayList.get(i7);
                    int size2 = backStackRecord.mOps.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = backStackRecord.mOps.get(i8).mFragment;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    public boolean isPostponed() {
        for (int i2 = 0; i2 < this.mOps.size(); i2++) {
            if (isFragmentPostponed(this.mOps.get(i2))) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public FragmentTransaction remove(@NonNull Fragment fragment) {
        FragmentManagerImpl fragmentManagerImpl = fragment.mFragmentManager;
        if (fragmentManagerImpl == null || fragmentManagerImpl == this.mManager) {
            return super.remove(fragment);
        }
        StringBuilder y = a.y("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        y.append(fragment.toString());
        y.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(y.toString());
    }

    public void runOnCommitRunnables() {
        if (this.mCommitRunnables != null) {
            for (int i2 = 0; i2 < this.mCommitRunnables.size(); i2++) {
                this.mCommitRunnables.get(i2).run();
            }
            this.mCommitRunnables = null;
        }
    }

    @NonNull
    public FragmentTransaction setMaxLifecycle(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.mFragmentManager == this.mManager) {
            Lifecycle.State state2 = Lifecycle.State.CREATED;
            if (state.isAtLeast(state2)) {
                return super.setMaxLifecycle(fragment, state);
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + state2);
        }
        StringBuilder y = a.y("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        y.append(this.mManager);
        throw new IllegalArgumentException(y.toString());
    }

    public void setOnStartPostponedListener(Fragment.OnStartEnterTransitionListener onStartEnterTransitionListener) {
        for (int i2 = 0; i2 < this.mOps.size(); i2++) {
            FragmentTransaction.Op op = this.mOps.get(i2);
            if (isFragmentPostponed(op)) {
                op.mFragment.setOnStartEnterTransitionListener(onStartEnterTransitionListener);
            }
        }
    }

    @NonNull
    public FragmentTransaction setPrimaryNavigationFragment(@Nullable Fragment fragment) {
        FragmentManagerImpl fragmentManagerImpl;
        if (fragment == null || (fragmentManagerImpl = fragment.mFragmentManager) == null || fragmentManagerImpl == this.mManager) {
            return super.setPrimaryNavigationFragment(fragment);
        }
        StringBuilder y = a.y("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        y.append(fragment.toString());
        y.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(y.toString());
    }

    @NonNull
    public FragmentTransaction show(@NonNull Fragment fragment) {
        FragmentManagerImpl fragmentManagerImpl = fragment.mFragmentManager;
        if (fragmentManagerImpl == null || fragmentManagerImpl == this.mManager) {
            return super.show(fragment);
        }
        StringBuilder y = a.y("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        y.append(fragment.toString());
        y.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(y.toString());
    }

    public String toString() {
        StringBuilder x = a.x(128, "BackStackEntry{");
        x.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.mIndex >= 0) {
            x.append(" #");
            x.append(this.mIndex);
        }
        if (this.mName != null) {
            x.append(" ");
            x.append(this.mName);
        }
        x.append("}");
        return x.toString();
    }

    public Fragment trackAddedFragmentsInPop(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.Op op = this.mOps.get(size);
            int i2 = op.mCmd;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = op.mFragment;
                            break;
                        case 10:
                            op.mCurrentMaxState = op.mOldMaxState;
                            break;
                    }
                }
                arrayList.add(op.mFragment);
            }
            arrayList.remove(op.mFragment);
        }
        return fragment;
    }
}
