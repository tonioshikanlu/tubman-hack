package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import com.segment.analytics.AnalyticsContext;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {
    public int mCount;
    public Helper mHelperWidget;
    public int[] mIds = new int[32];
    private HashMap<Integer, String> mMap = new HashMap<>();
    public String mReferenceIds;
    public boolean mUseViewMeasure = false;
    private View[] mViews = null;
    public Context myContext;

    public ConstraintHelper(Context context) {
        super(context);
        this.myContext = context;
        init((AttributeSet) null);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.myContext = context;
        init(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.myContext = context;
        init(attributeSet);
    }

    private void addID(String str) {
        if (str != null && str.length() != 0 && this.myContext != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int findId = findId(trim);
            if (findId != 0) {
                this.mMap.put(Integer.valueOf(findId), trim);
                addRscID(findId);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void addRscID(int i2) {
        if (i2 != getId()) {
            int i3 = this.mCount + 1;
            int[] iArr = this.mIds;
            if (i3 > iArr.length) {
                this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.mIds;
            int i4 = this.mCount;
            iArr2[i4] = i2;
            this.mCount = i4 + 1;
        }
    }

    private int[] convertReferenceString(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        for (String trim : split) {
            int findId = findId(trim.trim());
            if (findId != 0) {
                iArr[i2] = findId;
                i2++;
            }
        }
        return i2 != split.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private int findId(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.myContext.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int findId(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i2 = ((Integer) designInformation).intValue();
            }
        }
        if (i2 == 0 && constraintLayout != null) {
            i2 = findId(constraintLayout, str);
        }
        if (i2 == 0) {
            try {
                i2 = R.id.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i2 == 0 ? this.myContext.getResources().getIdentifier(str, AnalyticsContext.Device.DEVICE_ID_KEY, this.myContext.getPackageName()) : i2;
    }

    public void addView(View view) {
        if (view != this) {
            if (view.getId() == -1) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
            } else if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
            } else {
                this.mReferenceIds = null;
                addRscID(view.getId());
                requestLayout();
            }
        }
    }

    public void applyLayoutFeatures() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            applyLayoutFeatures((ConstraintLayout) parent);
        }
    }

    public void applyLayoutFeatures(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.mCount; i2++) {
            View viewById = constraintLayout.getViewById(this.mIds[i2]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }

    public View[] getViews(ConstraintLayout constraintLayout) {
        View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new View[this.mCount];
        }
        for (int i2 = 0; i2 < this.mCount; i2++) {
            this.mViews[i2] = constraintLayout.getViewById(this.mIds[i2]);
        }
        return this.mViews;
    }

    public void init(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.mReferenceIds = string;
                    setIds(string);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintSet.Layout layout = constraint.layout;
        int[] iArr = layout.mReferenceIds;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = layout.mReferenceIdString;
            if (str != null && str.length() > 0) {
                ConstraintSet.Layout layout2 = constraint.layout;
                layout2.mReferenceIds = convertReferenceString(this, layout2.mReferenceIdString);
            }
        }
        helperWidget.removeAllIds();
        if (constraint.layout.mReferenceIds != null) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = constraint.layout.mReferenceIds;
                if (i2 < iArr2.length) {
                    ConstraintWidget constraintWidget = sparseArray.get(iArr2[i2]);
                    if (constraintWidget != null) {
                        helperWidget.add(constraintWidget);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i2, int i3) {
        if (this.mUseViewMeasure) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void removeView(View view) {
        int i2;
        int id = view.getId();
        if (id != -1) {
            this.mReferenceIds = null;
            int i3 = 0;
            while (true) {
                if (i3 >= this.mCount) {
                    break;
                } else if (this.mIds[i3] == id) {
                    while (true) {
                        i2 = this.mCount;
                        if (i3 >= i2 - 1) {
                            break;
                        }
                        int[] iArr = this.mIds;
                        int i4 = i3 + 1;
                        iArr[i3] = iArr[i4];
                        i3 = i4;
                    }
                    this.mIds[i2 - 1] = 0;
                    this.mCount = i2 - 1;
                } else {
                    i3++;
                }
            }
            requestLayout();
        }
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
    }

    public void setIds(String str) {
        this.mReferenceIds = str;
        if (str != null) {
            int i2 = 0;
            this.mCount = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    addID(str.substring(i2));
                    return;
                } else {
                    addID(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int addRscID : iArr) {
            addRscID(addRscID);
        }
    }

    public void updatePostConstraints(ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(ConstraintLayout constraintLayout) {
    }

    public void updatePreLayout(ConstraintWidgetContainer constraintWidgetContainer, Helper helper, SparseArray<ConstraintWidget> sparseArray) {
        helper.removeAllIds();
        for (int i2 = 0; i2 < this.mCount; i2++) {
            helper.add(sparseArray.get(this.mIds[i2]));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.mMap.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.mReferenceIds
            r5.setIds(r0)
        L_0x000b:
            androidx.constraintlayout.solver.widgets.Helper r0 = r5.mHelperWidget
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.removeAllIds()
            r0 = 0
        L_0x0014:
            int r1 = r5.mCount
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.mIds
            r1 = r1[r0]
            android.view.View r2 = r6.getViewById(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.mMap
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.findId(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.mIds
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.mMap
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.getViewById(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            androidx.constraintlayout.solver.widgets.Helper r1 = r5.mHelperWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = r6.getViewWidget(r2)
            r1.add(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            androidx.constraintlayout.solver.widgets.Helper r0 = r5.mHelperWidget
            androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r6 = r6.mLayoutWidget
            r0.updateConstraints(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void validateParams() {
        if (this.mHelperWidget != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).widget = (ConstraintWidget) this.mHelperWidget;
            }
        }
    }
}
