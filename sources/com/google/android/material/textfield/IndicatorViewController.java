package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.resources.MaterialResources;
import java.util.ArrayList;
import java.util.List;

public final class IndicatorViewController {
    private static final int CAPTION_OPACITY_FADE_ANIMATION_DURATION = 167;
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    private static final int CAPTION_TRANSLATE_Y_ANIMATION_DURATION = 217;
    public static final int COUNTER_INDEX = 2;
    public static final int ERROR_INDEX = 0;
    public static final int HELPER_INDEX = 1;
    /* access modifiers changed from: private */
    @Nullable
    public Animator captionAnimator;
    private FrameLayout captionArea;
    /* access modifiers changed from: private */
    public int captionDisplayed;
    private int captionToShow;
    private final float captionTranslationYPx;
    private final Context context;
    private boolean errorEnabled;
    @Nullable
    private CharSequence errorText;
    private int errorTextAppearance;
    /* access modifiers changed from: private */
    @Nullable
    public TextView errorView;
    @Nullable
    private CharSequence errorViewContentDescription;
    @Nullable
    private ColorStateList errorViewTextColor;
    private CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;
    @Nullable
    private TextView helperTextView;
    @Nullable
    private ColorStateList helperTextViewTextColor;
    private LinearLayout indicatorArea;
    private int indicatorsAdded;
    @NonNull
    private final TextInputLayout textInputView;
    private Typeface typeface;

    public IndicatorViewController(@NonNull TextInputLayout textInputLayout) {
        Context context2 = textInputLayout.getContext();
        this.context = context2;
        this.textInputView = textInputLayout;
        this.captionTranslationYPx = (float) context2.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    private boolean canAdjustIndicatorPadding() {
        return (this.indicatorArea == null || this.textInputView.getEditText() == null) ? false : true;
    }

    private void createCaptionAnimators(@NonNull List<Animator> list, boolean z, @Nullable TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                list.add(createCaptionOpacityAnimator(textView, i4 == i2));
                if (i4 == i2) {
                    list.add(createCaptionTranslationYAnimator(textView));
                }
            }
        }
    }

    private ObjectAnimator createCaptionOpacityAnimator(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z ? 1.0f : 0.0f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.captionTranslationYPx, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        return ofFloat;
    }

    @Nullable
    private TextView getCaptionViewFromDisplayState(int i2) {
        if (i2 == 1) {
            return this.errorView;
        }
        if (i2 != 2) {
            return null;
        }
        return this.helperTextView;
    }

    private int getIndicatorPadding(boolean z, @DimenRes int i2, int i3) {
        return z ? this.context.getResources().getDimensionPixelSize(i2) : i3;
    }

    private boolean isCaptionStateError(int i2) {
        return i2 == 1 && this.errorView != null && !TextUtils.isEmpty(this.errorText);
    }

    private boolean isCaptionStateHelperText(int i2) {
        return i2 == 2 && this.helperTextView != null && !TextUtils.isEmpty(this.helperText);
    }

    private void setCaptionViewVisibilities(int i2, int i3) {
        TextView captionViewFromDisplayState;
        TextView captionViewFromDisplayState2;
        if (i2 != i3) {
            if (!(i3 == 0 || (captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i3)) == null)) {
                captionViewFromDisplayState2.setVisibility(0);
                captionViewFromDisplayState2.setAlpha(1.0f);
            }
            if (!(i2 == 0 || (captionViewFromDisplayState = getCaptionViewFromDisplayState(i2)) == null)) {
                captionViewFromDisplayState.setVisibility(4);
                if (i2 == 1) {
                    captionViewFromDisplayState.setText((CharSequence) null);
                }
            }
            this.captionDisplayed = i3;
        }
    }

    private void setTextViewTypeface(@Nullable TextView textView, Typeface typeface2) {
        if (textView != null) {
            textView.setTypeface(typeface2);
        }
    }

    private void setViewGroupGoneIfEmpty(@NonNull ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean shouldAnimateCaptionView(@Nullable TextView textView, @Nullable CharSequence charSequence) {
        return ViewCompat.isLaidOut(this.textInputView) && this.textInputView.isEnabled() && (this.captionToShow != this.captionDisplayed || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void updateCaptionViewsVisibility(int i2, int i3, boolean z) {
        boolean z2 = z;
        if (i2 != i3) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.captionAnimator = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i4 = i2;
                int i5 = i3;
                createCaptionAnimators(arrayList2, this.helperTextEnabled, this.helperTextView, 2, i4, i5);
                createCaptionAnimators(arrayList2, this.errorEnabled, this.errorView, 1, i4, i5);
                AnimatorSetCompat.playTogether(animatorSet, arrayList);
                final TextView captionViewFromDisplayState = getCaptionViewFromDisplayState(i2);
                final TextView captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i3);
                final int i6 = i3;
                final int i7 = i2;
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        int unused = IndicatorViewController.this.captionDisplayed = i6;
                        Animator unused2 = IndicatorViewController.this.captionAnimator = null;
                        TextView textView = captionViewFromDisplayState;
                        if (textView != null) {
                            textView.setVisibility(4);
                            if (i7 == 1 && IndicatorViewController.this.errorView != null) {
                                IndicatorViewController.this.errorView.setText((CharSequence) null);
                            }
                        }
                        TextView textView2 = captionViewFromDisplayState2;
                        if (textView2 != null) {
                            textView2.setTranslationY(0.0f);
                            captionViewFromDisplayState2.setAlpha(1.0f);
                        }
                    }

                    public void onAnimationStart(Animator animator) {
                        TextView textView = captionViewFromDisplayState2;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    }
                });
                animatorSet.start();
            } else {
                setCaptionViewVisibilities(i2, i3);
            }
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateLabelState(z2);
            this.textInputView.updateTextInputBoxState();
        }
    }

    public void addIndicator(TextView textView, int i2) {
        if (this.indicatorArea == null && this.captionArea == null) {
            LinearLayout linearLayout = new LinearLayout(this.context);
            this.indicatorArea = linearLayout;
            linearLayout.setOrientation(0);
            this.textInputView.addView(this.indicatorArea, -1, -2);
            this.captionArea = new FrameLayout(this.context);
            this.indicatorArea.addView(this.captionArea, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.textInputView.getEditText() != null) {
                adjustIndicatorPadding();
            }
        }
        if (isCaptionView(i2)) {
            this.captionArea.setVisibility(0);
            this.captionArea.addView(textView);
        } else {
            this.indicatorArea.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.indicatorArea.setVisibility(0);
        this.indicatorsAdded++;
    }

    public void adjustIndicatorPadding() {
        if (canAdjustIndicatorPadding()) {
            EditText editText = this.textInputView.getEditText();
            boolean isFontScaleAtLeast1_3 = MaterialResources.isFontScaleAtLeast1_3(this.context);
            LinearLayout linearLayout = this.indicatorArea;
            int i2 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
            ViewCompat.setPaddingRelative(linearLayout, getIndicatorPadding(isFontScaleAtLeast1_3, i2, ViewCompat.getPaddingStart(editText)), getIndicatorPadding(isFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_top, this.context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), getIndicatorPadding(isFontScaleAtLeast1_3, i2, ViewCompat.getPaddingEnd(editText)), 0);
        }
    }

    public void cancelCaptionAnimator() {
        Animator animator = this.captionAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    public boolean errorIsDisplayed() {
        return isCaptionStateError(this.captionDisplayed);
    }

    public boolean errorShouldBeShown() {
        return isCaptionStateError(this.captionToShow);
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.errorViewContentDescription;
    }

    @Nullable
    public CharSequence getErrorText() {
        return this.errorText;
    }

    @ColorInt
    public int getErrorViewCurrentTextColor() {
        TextView textView = this.errorView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public ColorStateList getErrorViewTextColors() {
        TextView textView = this.errorView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence getHelperText() {
        return this.helperText;
    }

    @Nullable
    public ColorStateList getHelperTextViewColors() {
        TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextViewCurrentTextColor() {
        TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public boolean helperTextIsDisplayed() {
        return isCaptionStateHelperText(this.captionDisplayed);
    }

    public boolean helperTextShouldBeShown() {
        return isCaptionStateHelperText(this.captionToShow);
    }

    public void hideError() {
        this.errorText = null;
        cancelCaptionAnimator();
        if (this.captionDisplayed == 1) {
            this.captionToShow = (!this.helperTextEnabled || TextUtils.isEmpty(this.helperText)) ? 0 : 2;
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.errorView, (CharSequence) null));
    }

    public void hideHelperText() {
        cancelCaptionAnimator();
        int i2 = this.captionDisplayed;
        if (i2 == 2) {
            this.captionToShow = 0;
        }
        updateCaptionViewsVisibility(i2, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, (CharSequence) null));
    }

    public boolean isCaptionView(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    public boolean isHelperTextEnabled() {
        return this.helperTextEnabled;
    }

    public void removeIndicator(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.indicatorArea != null) {
            if (!isCaptionView(i2) || (frameLayout = this.captionArea) == null) {
                this.indicatorArea.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i3 = this.indicatorsAdded - 1;
            this.indicatorsAdded = i3;
            setViewGroupGoneIfEmpty(this.indicatorArea, i3);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.errorViewContentDescription = charSequence;
        TextView textView = this.errorView;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        if (this.errorEnabled != z) {
            cancelCaptionAnimator();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.context);
                this.errorView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_error);
                this.errorView.setTextAlignment(5);
                Typeface typeface2 = this.typeface;
                if (typeface2 != null) {
                    this.errorView.setTypeface(typeface2);
                }
                setErrorTextAppearance(this.errorTextAppearance);
                setErrorViewTextColor(this.errorViewTextColor);
                setErrorContentDescription(this.errorViewContentDescription);
                this.errorView.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.errorView, 1);
                addIndicator(this.errorView, 0);
            } else {
                hideError();
                removeIndicator(this.errorView, 0);
                this.errorView = null;
                this.textInputView.updateEditTextBackground();
                this.textInputView.updateTextInputBoxState();
            }
            this.errorEnabled = z;
        }
    }

    public void setErrorTextAppearance(@StyleRes int i2) {
        this.errorTextAppearance = i2;
        TextView textView = this.errorView;
        if (textView != null) {
            this.textInputView.setTextAppearanceCompatWithErrorFallback(textView, i2);
        }
    }

    public void setErrorViewTextColor(@Nullable ColorStateList colorStateList) {
        this.errorViewTextColor = colorStateList;
        TextView textView = this.errorView;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextAppearance(@StyleRes int i2) {
        this.helperTextTextAppearance = i2;
        TextView textView = this.helperTextView;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i2);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        if (this.helperTextEnabled != z) {
            cancelCaptionAnimator();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.context);
                this.helperTextView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_helper_text);
                this.helperTextView.setTextAlignment(5);
                Typeface typeface2 = this.typeface;
                if (typeface2 != null) {
                    this.helperTextView.setTypeface(typeface2);
                }
                this.helperTextView.setVisibility(4);
                ViewCompat.setAccessibilityLiveRegion(this.helperTextView, 1);
                setHelperTextAppearance(this.helperTextTextAppearance);
                setHelperTextViewTextColor(this.helperTextViewTextColor);
                addIndicator(this.helperTextView, 1);
            } else {
                hideHelperText();
                removeIndicator(this.helperTextView, 1);
                this.helperTextView = null;
                this.textInputView.updateEditTextBackground();
                this.textInputView.updateTextInputBoxState();
            }
            this.helperTextEnabled = z;
        }
    }

    public void setHelperTextViewTextColor(@Nullable ColorStateList colorStateList) {
        this.helperTextViewTextColor = colorStateList;
        TextView textView = this.helperTextView;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTypefaces(Typeface typeface2) {
        if (typeface2 != this.typeface) {
            this.typeface = typeface2;
            setTextViewTypeface(this.errorView, typeface2);
            setTextViewTypeface(this.helperTextView, typeface2);
        }
    }

    public void showError(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.errorText = charSequence;
        this.errorView.setText(charSequence);
        int i2 = this.captionDisplayed;
        if (i2 != 1) {
            this.captionToShow = 1;
        }
        updateCaptionViewsVisibility(i2, this.captionToShow, shouldAnimateCaptionView(this.errorView, charSequence));
    }

    public void showHelper(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.helperText = charSequence;
        this.helperTextView.setText(charSequence);
        int i2 = this.captionDisplayed;
        if (i2 != 2) {
            this.captionToShow = 2;
        }
        updateCaptionViewsVisibility(i2, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, charSequence));
    }
}
