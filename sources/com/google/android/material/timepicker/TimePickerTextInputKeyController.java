package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

public class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {
    private final ChipTextInputComboView hourLayoutComboView;
    private boolean keyListenerRunning = false;
    private final ChipTextInputComboView minuteLayoutComboView;
    private final TimeModel time;

    public TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.hourLayoutComboView = chipTextInputComboView;
        this.minuteLayoutComboView = chipTextInputComboView2;
        this.time = timeModel;
    }

    private void moveSelection(int i2) {
        boolean z = true;
        this.minuteLayoutComboView.setChecked(i2 == 12);
        ChipTextInputComboView chipTextInputComboView = this.hourLayoutComboView;
        if (i2 != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        this.time.selection = i2;
    }

    private boolean onHourKeyPress(int i2, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (!(i2 >= 7 && i2 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2)) {
            return false;
        }
        moveSelection(12);
        return true;
    }

    private boolean onMinuteKeyPress(int i2, KeyEvent keyEvent, EditText editText) {
        if (!(i2 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText()))) {
            return false;
        }
        moveSelection(10);
        return true;
    }

    public void bind() {
        TextInputLayout textInput = this.hourLayoutComboView.getTextInput();
        TextInputLayout textInput2 = this.minuteLayoutComboView.getTextInput();
        EditText editText = textInput.getEditText();
        EditText editText2 = textInput2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        boolean z = i2 == 5;
        if (z) {
            moveSelection(12);
        }
        return z;
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (this.keyListenerRunning) {
            return false;
        }
        this.keyListenerRunning = true;
        EditText editText = (EditText) view;
        boolean onMinuteKeyPress = this.time.selection == 12 ? onMinuteKeyPress(i2, keyEvent, editText) : onHourKeyPress(i2, keyEvent, editText);
        this.keyListenerRunning = false;
        return onMinuteKeyPress;
    }
}
