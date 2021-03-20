package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class WindowCallbackWrapper implements Window.Callback {
    public final Window.Callback mWrapped;

    public WindowCallbackWrapper(Window.Callback callback) {
        if (callback != null) {
            this.mWrapped = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.mWrapped.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.mWrapped.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.mWrapped.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.mWrapped.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.mWrapped.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.mWrapped.dispatchTrackballEvent(motionEvent);
    }

    public final Window.Callback getWrapped() {
        return this.mWrapped;
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.mWrapped.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.mWrapped.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.mWrapped.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.mWrapped.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return this.mWrapped.onCreatePanelMenu(i2, menu);
    }

    public View onCreatePanelView(int i2) {
        return this.mWrapped.onCreatePanelView(i2);
    }

    public void onDetachedFromWindow() {
        this.mWrapped.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.mWrapped.onMenuItemSelected(i2, menuItem);
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return this.mWrapped.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        this.mWrapped.onPanelClosed(i2, menu);
    }

    @RequiresApi(26)
    public void onPointerCaptureChanged(boolean z) {
        this.mWrapped.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return this.mWrapped.onPreparePanel(i2, view, menu);
    }

    @RequiresApi(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        this.mWrapped.onProvideKeyboardShortcuts(list, menu, i2);
    }

    public boolean onSearchRequested() {
        return this.mWrapped.onSearchRequested();
    }

    @RequiresApi(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.mWrapped.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.mWrapped.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.mWrapped.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.mWrapped.onWindowStartingActionMode(callback);
    }

    @RequiresApi(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return this.mWrapped.onWindowStartingActionMode(callback, i2);
    }
}
