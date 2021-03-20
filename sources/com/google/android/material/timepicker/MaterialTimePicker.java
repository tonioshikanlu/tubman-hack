package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.DialogFragment;
import b.e.a.a.a;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.TimePickerView;
import java.util.LinkedHashSet;
import java.util.Set;

public final class MaterialTimePicker extends DialogFragment {
    public static final int INPUT_MODE_CLOCK = 0;
    public static final String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    public static final String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    public static final String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    public static final String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";
    @Nullable
    private TimePickerPresenter activePresenter;
    private final Set<DialogInterface.OnCancelListener> cancelListeners = new LinkedHashSet();
    @DrawableRes
    private int clockIcon;
    private final Set<DialogInterface.OnDismissListener> dismissListeners = new LinkedHashSet();
    /* access modifiers changed from: private */
    public int inputMode = 0;
    @DrawableRes
    private int keyboardIcon;
    /* access modifiers changed from: private */
    public MaterialButton modeButton;
    /* access modifiers changed from: private */
    public final Set<View.OnClickListener> negativeButtonListeners = new LinkedHashSet();
    /* access modifiers changed from: private */
    public final Set<View.OnClickListener> positiveButtonListeners = new LinkedHashSet();
    private ViewStub textInputStub;
    private LinearLayout textInputView;
    private TimeModel time;
    @Nullable
    private TimePickerClockPresenter timePickerClockPresenter;
    /* access modifiers changed from: private */
    @Nullable
    public TimePickerTextInputPresenter timePickerTextInputPresenter;
    private TimePickerView timePickerView;
    private int titleResId = 0;
    private String titleText;

    public static final class Builder {
        /* access modifiers changed from: private */
        public int inputMode;
        /* access modifiers changed from: private */
        public TimeModel time = new TimeModel();
        /* access modifiers changed from: private */
        public CharSequence titleText;
        /* access modifiers changed from: private */
        public int titleTextResId = 0;

        @NonNull
        public MaterialTimePicker build() {
            return MaterialTimePicker.newInstance(this);
        }

        @NonNull
        public Builder setHour(@IntRange(from = 0, to = 23) int i2) {
            this.time.setHourOfDay(i2);
            return this;
        }

        @NonNull
        public Builder setInputMode(int i2) {
            this.inputMode = i2;
            return this;
        }

        @NonNull
        public Builder setMinute(@IntRange(from = 0, to = 60) int i2) {
            this.time.setMinute(i2);
            return this;
        }

        @NonNull
        public Builder setTimeFormat(int i2) {
            TimeModel timeModel = this.time;
            int i3 = timeModel.hour;
            int i4 = timeModel.minute;
            TimeModel timeModel2 = new TimeModel(i2);
            this.time = timeModel2;
            timeModel2.setMinute(i4);
            this.time.setHourOfDay(i3);
            return this;
        }

        @NonNull
        public Builder setTitleText(@StringRes int i2) {
            this.titleTextResId = i2;
            return this;
        }

        @NonNull
        public Builder setTitleText(@Nullable CharSequence charSequence) {
            this.titleText = charSequence;
            return this;
        }
    }

    private Pair<Integer, Integer> dataForMode(int i2) {
        if (i2 == 0) {
            return new Pair<>(Integer.valueOf(this.keyboardIcon), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        }
        if (i2 == 1) {
            return new Pair<>(Integer.valueOf(this.clockIcon), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException(a.g("no icon for mode: ", i2));
    }

    private TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int i2) {
        if (i2 == 0) {
            TimePickerClockPresenter timePickerClockPresenter2 = this.timePickerClockPresenter;
            if (timePickerClockPresenter2 == null) {
                timePickerClockPresenter2 = new TimePickerClockPresenter(this.timePickerView, this.time);
            }
            this.timePickerClockPresenter = timePickerClockPresenter2;
            return timePickerClockPresenter2;
        }
        if (this.timePickerTextInputPresenter == null) {
            LinearLayout linearLayout = (LinearLayout) this.textInputStub.inflate();
            this.textInputView = linearLayout;
            this.timePickerTextInputPresenter = new TimePickerTextInputPresenter(linearLayout, this.time);
        }
        this.timePickerTextInputPresenter.clearCheck();
        return this.timePickerTextInputPresenter;
    }

    /* access modifiers changed from: private */
    @NonNull
    public static MaterialTimePicker newInstance(@NonNull Builder builder) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable(TIME_MODEL_EXTRA, builder.time);
        bundle.putInt(INPUT_MODE_EXTRA, builder.inputMode);
        bundle.putInt(TITLE_RES_EXTRA, builder.titleTextResId);
        if (builder.titleText != null) {
            bundle.putString(TITLE_TEXT_EXTRA, builder.titleText.toString());
        }
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    private void restoreState(@Nullable Bundle bundle) {
        if (bundle != null) {
            TimeModel timeModel = (TimeModel) bundle.getParcelable(TIME_MODEL_EXTRA);
            this.time = timeModel;
            if (timeModel == null) {
                this.time = new TimeModel();
            }
            this.inputMode = bundle.getInt(INPUT_MODE_EXTRA, 0);
            this.titleResId = bundle.getInt(TITLE_RES_EXTRA, 0);
            this.titleText = bundle.getString(TITLE_TEXT_EXTRA);
        }
    }

    /* access modifiers changed from: private */
    public void updateInputMode(MaterialButton materialButton) {
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.hide();
        }
        TimePickerPresenter initializeOrRetrieveActivePresenterForMode = initializeOrRetrieveActivePresenterForMode(this.inputMode);
        this.activePresenter = initializeOrRetrieveActivePresenterForMode;
        initializeOrRetrieveActivePresenterForMode.show();
        this.activePresenter.invalidate();
        Pair<Integer, Integer> dataForMode = dataForMode(this.inputMode);
        materialButton.setIconResource(((Integer) dataForMode.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) dataForMode.second).intValue()));
    }

    public boolean addOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.add(onCancelListener);
    }

    public boolean addOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.cancelListeners.clear();
    }

    public void clearOnDismissListeners() {
        this.dismissListeners.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.negativeButtonListeners.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.positiveButtonListeners.clear();
    }

    @IntRange(from = 0, to = 23)
    public int getHour() {
        return this.time.hour % 24;
    }

    public int getInputMode() {
        return this.inputMode;
    }

    @IntRange(from = 0, to = 60)
    public int getMinute() {
        return this.time.minute;
    }

    @Nullable
    public TimePickerClockPresenter getTimePickerClockPresenter() {
        return this.timePickerClockPresenter;
    }

    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.cancelListeners) {
            onCancel.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        restoreState(bundle);
    }

    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        TypedValue resolve = MaterialAttributes.resolve(requireContext(), R.attr.materialTimePickerTheme);
        Dialog dialog = new Dialog(requireContext(), resolve == null ? 0 : resolve.data);
        Context context = dialog.getContext();
        int resolveOrThrow = MaterialAttributes.resolveOrThrow(context, R.attr.colorSurface, MaterialTimePicker.class.getCanonicalName());
        int i2 = R.attr.materialTimePickerStyle;
        int i3 = R.style.Widget_MaterialComponents_TimePicker;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, (AttributeSet) null, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R.styleable.MaterialTimePicker, i2, i3);
        this.clockIcon = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.keyboardIcon = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
        obtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(resolveOrThrow));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        return dialog;
    }

    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView2 = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.timePickerView = timePickerView2;
        timePickerView2.setOnDoubleTapListener(new TimePickerView.OnDoubleTapListener() {
            public void onDoubleTap() {
                int unused = MaterialTimePicker.this.inputMode = 1;
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                materialTimePicker.updateInputMode(materialTimePicker.modeButton);
                MaterialTimePicker.this.timePickerTextInputPresenter.resetChecked();
            }
        });
        this.textInputStub = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.modeButton = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        if (!TextUtils.isEmpty(this.titleText)) {
            textView.setText(this.titleText);
        }
        int i2 = this.titleResId;
        if (i2 != 0) {
            textView.setText(i2);
        }
        updateInputMode(this.modeButton);
        ((Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                for (View.OnClickListener onClick : MaterialTimePicker.this.positiveButtonListeners) {
                    onClick.onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        ((Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                for (View.OnClickListener onClick : MaterialTimePicker.this.negativeButtonListeners) {
                    onClick.onClick(view);
                }
                MaterialTimePicker.this.dismiss();
            }
        });
        this.modeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
                int unused = materialTimePicker.inputMode = materialTimePicker.inputMode == 0 ? 1 : 0;
                MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
                materialTimePicker2.updateInputMode(materialTimePicker2.modeButton);
            }
        });
        return viewGroup2;
    }

    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.dismissListeners) {
            onDismiss.onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(TIME_MODEL_EXTRA, this.time);
        bundle.putInt(INPUT_MODE_EXTRA, this.inputMode);
        bundle.putInt(TITLE_RES_EXTRA, this.titleResId);
        bundle.putString(TITLE_TEXT_EXTRA, this.titleText);
    }

    public boolean removeOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.remove(onClickListener);
    }
}
