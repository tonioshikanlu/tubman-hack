package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.AutoSizeableTextView;
import java.lang.ref.WeakReference;

public class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;
    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;
    private int mFontWeight = -1;
    private int mStyle = 0;
    @NonNull
    private final TextView mView;

    public AppCompatTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable != null && tintInfo != null) {
            AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        }
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i2) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i2);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            TextView textView = this.mView;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.mView.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
                TextView textView2 = this.mView;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.mView;
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
        }
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i2, float f) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i2, f);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        Typeface typeface;
        Typeface typeface2;
        int i2 = Build.VERSION.SDK_INT;
        this.mStyle = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.mStyle);
        boolean z = false;
        if (i2 >= 28) {
            int i3 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i3;
            if (i3 != -1) {
                this.mStyle = (this.mStyle & 2) | 0;
            }
        }
        int i4 = R.styleable.TextAppearance_android_fontFamily;
        if (tintTypedArray.hasValue(i4) || tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            this.mFontTypeface = null;
            int i5 = R.styleable.TextAppearance_fontFamily;
            if (tintTypedArray.hasValue(i5)) {
                i4 = i5;
            }
            final int i6 = this.mFontWeight;
            final int i7 = this.mStyle;
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.mView);
                try {
                    Typeface font = tintTypedArray.getFont(i4, this.mStyle, new ResourcesCompat.FontCallback() {
                        public void onFontRetrievalFailed(int i2) {
                        }

                        public void onFontRetrieved(@NonNull Typeface typeface) {
                            int i2;
                            if (Build.VERSION.SDK_INT >= 28 && (i2 = i6) != -1) {
                                typeface = Typeface.create(typeface, i2, (i7 & 2) != 0);
                            }
                            AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                        }
                    });
                    if (font != null) {
                        if (i2 >= 28 && this.mFontWeight != -1) {
                            font = Typeface.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                        }
                        this.mFontTypeface = font;
                    }
                    this.mAsyncFontPending = this.mFontTypeface == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.mFontTypeface == null && (string = tintTypedArray.getString(i4)) != null) {
                if (i2 < 28 || this.mFontWeight == -1) {
                    typeface = Typeface.create(string, this.mStyle);
                } else {
                    Typeface create = Typeface.create(string, 0);
                    int i8 = this.mFontWeight;
                    if ((this.mStyle & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i8, z);
                }
                this.mFontTypeface = typeface;
                return;
            }
            return;
        }
        int i9 = R.styleable.TextAppearance_android_typeface;
        if (tintTypedArray.hasValue(i9)) {
            this.mAsyncFontPending = false;
            int i10 = tintTypedArray.getInt(i9, 1);
            if (i10 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (i10 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.mFontTypeface = typeface2;
        }
    }

    public void applyCompoundDrawablesTints() {
        if (!(this.mDrawableLeftTint == null && this.mDrawableTopTint == null && this.mDrawableRightTint == null && this.mDrawableBottomTint == null)) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint != null || this.mDrawableEndTint != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
            applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @Nullable
    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fb  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r0 = r7.mView
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.AppCompatDrawableManager r11 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTextHelper
            r12 = 0
            androidx.appcompat.widget.TintTypedArray r13 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.mView
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.getWrappedTypeArray()
            r6 = 0
            r3 = r20
            r5 = r21
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.getResourceId(r0, r14)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableLeftTint = r1
        L_0x0042:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableTopTint = r1
        L_0x0054:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableRightTint = r1
        L_0x0066:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.hasValue(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.getResourceId(r1, r12)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r10, r11, r1)
            r7.mDrawableBottomTint = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r3 = r13.hasValue(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.getResourceId(r2, r12)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r10, r11, r2)
            r7.mDrawableStartTint = r2
        L_0x008c:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r13.hasValue(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.getResourceId(r2, r12)
            androidx.appcompat.widget.TintInfo r2 = createTintInfo(r10, r11, r2)
            r7.mDrawableEndTint = r2
        L_0x009e:
            r13.recycle()
            android.widget.TextView r2 = r7.mView
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            if (r0 == r14) goto L_0x00ea
            int[] r5 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes((android.content.Context) r10, (int) r0, (int[]) r5)
            if (r2 != 0) goto L_0x00c3
            int r5 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r6 = r0.hasValue(r5)
            if (r6 == 0) goto L_0x00c3
            boolean r5 = r0.getBoolean(r5, r12)
            r6 = 1
            goto L_0x00c5
        L_0x00c3:
            r5 = r12
            r6 = r5
        L_0x00c5:
            r7.updateTypefaceAndStyle(r10, r0)
            int r15 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r16 = r0.hasValue(r15)
            if (r16 == 0) goto L_0x00d5
            java.lang.String r15 = r0.getString(r15)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            if (r1 < r3) goto L_0x00e5
            int r4 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r17 = r0.hasValue(r4)
            if (r17 == 0) goto L_0x00e5
            java.lang.String r4 = r0.getString(r4)
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r0.recycle()
            goto L_0x00ee
        L_0x00ea:
            r5 = r12
            r6 = r5
            r4 = 0
            r15 = 0
        L_0x00ee:
            int[] r0 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0105
            int r13 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r18 = r0.hasValue(r13)
            if (r18 == 0) goto L_0x0105
            boolean r5 = r0.getBoolean(r13, r12)
            r16 = 1
            goto L_0x0107
        L_0x0105:
            r16 = r6
        L_0x0107:
            int r6 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r13 = r0.hasValue(r6)
            if (r13 == 0) goto L_0x0113
            java.lang.String r15 = r0.getString(r6)
        L_0x0113:
            if (r1 < r3) goto L_0x0121
            int r3 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r6 = r0.hasValue(r3)
            if (r6 == 0) goto L_0x0121
            java.lang.String r4 = r0.getString(r3)
        L_0x0121:
            r3 = 28
            if (r1 < r3) goto L_0x0139
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L_0x0139
            int r1 = r0.getDimensionPixelSize(r1, r14)
            if (r1 != 0) goto L_0x0139
            android.widget.TextView r1 = r7.mView
            r3 = 0
            r1.setTextSize(r12, r3)
        L_0x0139:
            r7.updateTypefaceAndStyle(r10, r0)
            r0.recycle()
            if (r2 != 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r7.setAllCaps(r5)
        L_0x0146:
            android.graphics.Typeface r0 = r7.mFontTypeface
            if (r0 == 0) goto L_0x015b
            int r1 = r7.mFontWeight
            if (r1 != r14) goto L_0x0156
            android.widget.TextView r1 = r7.mView
            int r2 = r7.mStyle
            r1.setTypeface(r0, r2)
            goto L_0x015b
        L_0x0156:
            android.widget.TextView r1 = r7.mView
            r1.setTypeface(r0)
        L_0x015b:
            if (r4 == 0) goto L_0x0162
            android.widget.TextView r0 = r7.mView
            r0.setFontVariationSettings(r4)
        L_0x0162:
            if (r15 == 0) goto L_0x016d
            android.widget.TextView r0 = r7.mView
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r15)
            r0.setTextLocales(r1)
        L_0x016d:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            r0.loadFromAttributes(r8, r9)
            boolean r0 = androidx.core.widget.AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L_0x01b1
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            if (r0 == 0) goto L_0x01b1
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r7.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01b1
            android.widget.TextView r1 = r7.mView
            int r1 = r1.getAutoSizeStepGranularity()
            float r1 = (float) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01ac
            android.widget.TextView r0 = r7.mView
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r1 = r7.mAutoSizeTextHelper
            int r1 = r1.getAutoSizeMinTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r2 = r7.mAutoSizeTextHelper
            int r2 = r2.getAutoSizeMaxTextSize()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r3 = r7.mAutoSizeTextHelper
            int r3 = r3.getAutoSizeStepGranularity()
            r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r12)
            goto L_0x01b1
        L_0x01ac:
            android.widget.TextView r1 = r7.mView
            r1.setAutoSizeTextTypeUniformWithPresetSizes(r0, r12)
        L_0x01b1:
            int[] r0 = androidx.appcompat.R.styleable.AppCompatTextView
            androidx.appcompat.widget.TintTypedArray r8 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes((android.content.Context) r10, (android.util.AttributeSet) r8, (int[]) r0)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L_0x01c5
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r1 = r0
            goto L_0x01c6
        L_0x01c5:
            r1 = 0
        L_0x01c6:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L_0x01d4
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r2 = r0
            goto L_0x01d5
        L_0x01d4:
            r2 = 0
        L_0x01d5:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L_0x01e3
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r3 = r0
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L_0x01f2
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r4 = r0
            goto L_0x01f3
        L_0x01f2:
            r4 = 0
        L_0x01f3:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L_0x0201
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r5 = r0
            goto L_0x0202
        L_0x0201:
            r5 = 0
        L_0x0202:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat
            int r0 = r8.getResourceId(r0, r14)
            if (r0 == r14) goto L_0x0210
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r10, r0)
            r6 = r0
            goto L_0x0211
        L_0x0210:
            r6 = 0
        L_0x0211:
            r0 = r19
            r0.setCompoundDrawables(r1, r2, r3, r4, r5, r6)
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            boolean r1 = r8.hasValue(r0)
            if (r1 == 0) goto L_0x0227
            android.content.res.ColorStateList r0 = r8.getColorStateList(r0)
            android.widget.TextView r1 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintList(r1, r0)
        L_0x0227:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            boolean r1 = r8.hasValue(r0)
            if (r1 == 0) goto L_0x023d
            int r0 = r8.getInt(r0, r14)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r0, r1)
            android.widget.TextView r1 = r7.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintMode(r1, r0)
        L_0x023d:
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.getDimensionPixelSize(r0, r14)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r1 = r8.getDimensionPixelSize(r1, r14)
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            int r2 = r8.getDimensionPixelSize(r2, r14)
            r8.recycle()
            if (r0 == r14) goto L_0x0259
            android.widget.TextView r3 = r7.mView
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r3, r0)
        L_0x0259:
            if (r1 == r14) goto L_0x0260
            android.widget.TextView r0 = r7.mView
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r0, r1)
        L_0x0260:
            if (r2 == r14) goto L_0x0267
            android.widget.TextView r0 = r7.mView
            androidx.core.widget.TextViewCompat.setLineHeight(r0, r2)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.mStyle);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            autoSizeText();
        }
    }

    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    public void onSetTextAppearance(Context context, int i2) {
        String string;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i2, R.styleable.TextAppearance);
        int i3 = R.styleable.TextAppearance_textAllCaps;
        if (obtainStyledAttributes.hasValue(i3)) {
            setAllCaps(obtainStyledAttributes.getBoolean(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        int i5 = R.styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i5) && obtainStyledAttributes.getDimensionPixelSize(i5, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, obtainStyledAttributes);
        if (i4 >= 26) {
            int i6 = R.styleable.TextAppearance_fontVariationSettings;
            if (obtainStyledAttributes.hasValue(i6) && (string = obtainStyledAttributes.getString(i6)) != null) {
                this.mView.setFontVariationSettings(string);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    public void setAllCaps(boolean z) {
        this.mView.setAllCaps(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i2) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i2);
    }

    public void setCompoundDrawableTintList(@Nullable ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    public void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTextSize(int i2, float f) {
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && !isAutoSizeEnabled()) {
            setTextSizeInternal(i2, f);
        }
    }
}
