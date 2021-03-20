package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class StateSet {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;
    public int mCurrentConstraintNumber = -1;
    public int mCurrentStateId = -1;
    public ConstraintSet mDefaultConstraintSet;
    public int mDefaultState = -1;
    private SparseArray<State> mStateList = new SparseArray<>();

    public static class State {
        public int mConstraintID = -1;
        public int mId;
        public boolean mIsLayout;
        public ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser xmlPullParser) {
            this.mIsLayout = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.State_android_id) {
                    this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == R.styleable.State_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f, float f2) {
            for (int i2 = 0; i2 < this.mVariants.size(); i2++) {
                if (this.mVariants.get(i2).match(f, f2)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    public static class Variant {
        public int mConstraintID = -1;
        public int mId;
        public boolean mIsLayout;
        public float mMaxHeight = Float.NaN;
        public float mMaxWidth = Float.NaN;
        public float mMinHeight = Float.NaN;
        public float mMinWidth = Float.NaN;

        public Variant(Context context, XmlPullParser xmlPullParser) {
            this.mIsLayout = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.Variant_constraints) {
                    this.mConstraintID = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = obtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = obtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = obtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = obtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean match(float f, float f2) {
            if (!Float.isNaN(this.mMinWidth) && f < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f2 < this.mMinHeight) {
                return false;
            }
            if (Float.isNaN(this.mMaxWidth) || f <= this.mMaxWidth) {
                return Float.isNaN(this.mMaxHeight) || f2 <= this.mMaxHeight;
            }
            return false;
        }
    }

    public StateSet(Context context, XmlPullParser xmlPullParser) {
        load(context, xmlPullParser);
    }

    private void load(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.StateSet_defaultState) {
                this.mDefaultState = obtainStyledAttributes.getResourceId(index, this.mDefaultState);
            }
        }
        obtainStyledAttributes.recycle();
        State state = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            state = new State(context, xmlPullParser);
                            this.mStateList.put(state.mId, state);
                        } else if (c != 3) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            Variant variant = new Variant(context, xmlPullParser);
                            if (state != null) {
                                state.add(variant);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public int convertToConstraintSet(int i2, int i3, float f, float f2) {
        State state = this.mStateList.get(i3);
        if (state == null) {
            return i3;
        }
        if (f != -1.0f && f2 != -1.0f) {
            Variant variant = null;
            Iterator<Variant> it = state.mVariants.iterator();
            while (it.hasNext()) {
                Variant next = it.next();
                if (next.match(f, f2)) {
                    if (i2 == next.mConstraintID) {
                        return i2;
                    }
                    variant = next;
                }
            }
            return variant != null ? variant.mConstraintID : state.mConstraintID;
        } else if (state.mConstraintID == i2) {
            return i2;
        } else {
            Iterator<Variant> it2 = state.mVariants.iterator();
            while (it2.hasNext()) {
                if (i2 == it2.next().mConstraintID) {
                    return i2;
                }
            }
            return state.mConstraintID;
        }
    }

    public boolean needsToChange(int i2, float f, float f2) {
        int i3 = this.mCurrentStateId;
        if (i3 != i2) {
            return true;
        }
        State state = (State) (i2 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i3));
        int i4 = this.mCurrentConstraintNumber;
        return (i4 == -1 || !state.mVariants.get(i4).match(f, f2)) && this.mCurrentConstraintNumber != state.findMatch(f, f2);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public int stateGetConstraintID(int i2, int i3, int i4) {
        return updateConstraints(-1, i2, (float) i3, (float) i4);
    }

    public int updateConstraints(int i2, int i3, float f, float f2) {
        int findMatch;
        if (i2 == i3) {
            State state = (State) (i3 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(this.mCurrentStateId));
            if (state == null) {
                return -1;
            }
            return ((this.mCurrentConstraintNumber == -1 || !state.mVariants.get(i2).match(f, f2)) && i2 != (findMatch = state.findMatch(f, f2))) ? findMatch == -1 ? state.mConstraintID : state.mVariants.get(findMatch).mConstraintID : i2;
        }
        State state2 = this.mStateList.get(i3);
        if (state2 == null) {
            return -1;
        }
        int findMatch2 = state2.findMatch(f, f2);
        return findMatch2 == -1 ? state2.mConstraintID : state2.mVariants.get(findMatch2).mConstraintID;
    }
}
