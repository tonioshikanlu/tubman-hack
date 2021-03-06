package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import b.e.a.a.a;

@SuppressLint({"BanParcelableUsage"})
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() {
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    };
    public final Bundle mArguments;
    public final String mClassName;
    public final int mContainerId;
    public final boolean mDetached;
    public final int mFragmentId;
    public final boolean mFromLayout;
    public final boolean mHidden;
    public Fragment mInstance;
    public final int mMaxLifecycleState;
    public final boolean mRemoving;
    public final boolean mRetainInstance;
    public Bundle mSavedFragmentState;
    public final String mTag;
    public final String mWho;

    public FragmentState(Parcel parcel) {
        this.mClassName = parcel.readString();
        this.mWho = parcel.readString();
        boolean z = true;
        this.mFromLayout = parcel.readInt() != 0;
        this.mFragmentId = parcel.readInt();
        this.mContainerId = parcel.readInt();
        this.mTag = parcel.readString();
        this.mRetainInstance = parcel.readInt() != 0;
        this.mRemoving = parcel.readInt() != 0;
        this.mDetached = parcel.readInt() != 0;
        this.mArguments = parcel.readBundle();
        this.mHidden = parcel.readInt() == 0 ? false : z;
        this.mSavedFragmentState = parcel.readBundle();
        this.mMaxLifecycleState = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.mClassName = fragment.getClass().getName();
        this.mWho = fragment.mWho;
        this.mFromLayout = fragment.mFromLayout;
        this.mFragmentId = fragment.mFragmentId;
        this.mContainerId = fragment.mContainerId;
        this.mTag = fragment.mTag;
        this.mRetainInstance = fragment.mRetainInstance;
        this.mRemoving = fragment.mRemoving;
        this.mDetached = fragment.mDetached;
        this.mArguments = fragment.mArguments;
        this.mHidden = fragment.mHidden;
        this.mMaxLifecycleState = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull FragmentFactory fragmentFactory) {
        Bundle bundle;
        Fragment fragment;
        if (this.mInstance == null) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment instantiate = fragmentFactory.instantiate(classLoader, this.mClassName);
            this.mInstance = instantiate;
            instantiate.setArguments(this.mArguments);
            Bundle bundle3 = this.mSavedFragmentState;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.mInstance;
                bundle = this.mSavedFragmentState;
            } else {
                fragment = this.mInstance;
                bundle = new Bundle();
            }
            fragment.mSavedFragmentState = bundle;
            Fragment fragment2 = this.mInstance;
            fragment2.mWho = this.mWho;
            fragment2.mFromLayout = this.mFromLayout;
            fragment2.mRestored = true;
            fragment2.mFragmentId = this.mFragmentId;
            fragment2.mContainerId = this.mContainerId;
            fragment2.mTag = this.mTag;
            fragment2.mRetainInstance = this.mRetainInstance;
            fragment2.mRemoving = this.mRemoving;
            fragment2.mDetached = this.mDetached;
            fragment2.mHidden = this.mHidden;
            fragment2.mMaxState = Lifecycle.State.values()[this.mMaxLifecycleState];
            if (FragmentManagerImpl.DEBUG) {
                StringBuilder y = a.y("Instantiated fragment ");
                y.append(this.mInstance);
                Log.v("FragmentManager", y.toString());
            }
        }
        return this.mInstance;
    }

    @NonNull
    public String toString() {
        StringBuilder x = a.x(128, "FragmentState{");
        x.append(this.mClassName);
        x.append(" (");
        x.append(this.mWho);
        x.append(")}:");
        if (this.mFromLayout) {
            x.append(" fromLayout");
        }
        if (this.mContainerId != 0) {
            x.append(" id=0x");
            x.append(Integer.toHexString(this.mContainerId));
        }
        String str = this.mTag;
        if (str != null && !str.isEmpty()) {
            x.append(" tag=");
            x.append(this.mTag);
        }
        if (this.mRetainInstance) {
            x.append(" retainInstance");
        }
        if (this.mRemoving) {
            x.append(" removing");
        }
        if (this.mDetached) {
            x.append(" detached");
        }
        if (this.mHidden) {
            x.append(" hidden");
        }
        return x.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.mClassName);
        parcel.writeString(this.mWho);
        parcel.writeInt(this.mFromLayout ? 1 : 0);
        parcel.writeInt(this.mFragmentId);
        parcel.writeInt(this.mContainerId);
        parcel.writeString(this.mTag);
        parcel.writeInt(this.mRetainInstance ? 1 : 0);
        parcel.writeInt(this.mRemoving ? 1 : 0);
        parcel.writeInt(this.mDetached ? 1 : 0);
        parcel.writeBundle(this.mArguments);
        parcel.writeInt(this.mHidden ? 1 : 0);
        parcel.writeBundle(this.mSavedFragmentState);
        parcel.writeInt(this.mMaxLifecycleState);
    }
}
