package com.airbnb.lottie.model;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import b.e.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyPath {
    public static final KeyPath COMPOSITION = new KeyPath("COMPOSITION");
    private final List<String> keys;
    @Nullable
    private KeyPathElement resolvedElement;

    private KeyPath(KeyPath keyPath) {
        this.keys = new ArrayList(keyPath.keys);
        this.resolvedElement = keyPath.resolvedElement;
    }

    public KeyPath(String... strArr) {
        this.keys = Arrays.asList(strArr);
    }

    private boolean endsWithGlobstar() {
        List<String> list = this.keys;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean isContainer(String str) {
        return "__container".equals(str);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public KeyPath addKey(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.keys.add(str);
        return keyPath;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean fullyResolvesTo(String str, int i2) {
        if (i2 >= this.keys.size()) {
            return false;
        }
        boolean z = i2 == this.keys.size() - 1;
        String str2 = this.keys.get(i2);
        if (!str2.equals("**")) {
            return (z || (i2 == this.keys.size() + -2 && endsWithGlobstar())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.keys.get(i2 + 1).equals(str)) {
            return i2 == this.keys.size() + -2 || (i2 == this.keys.size() + -3 && endsWithGlobstar());
        }
        if (z) {
            return true;
        }
        int i3 = i2 + 1;
        if (i3 < this.keys.size() - 1) {
            return false;
        }
        return this.keys.get(i3).equals(str);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public KeyPathElement getResolvedElement() {
        return this.resolvedElement;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int incrementDepthBy(String str, int i2) {
        if (isContainer(str)) {
            return 0;
        }
        if (!this.keys.get(i2).equals("**")) {
            return 1;
        }
        return (i2 != this.keys.size() - 1 && this.keys.get(i2 + 1).equals(str)) ? 2 : 0;
    }

    public String keysToString() {
        return this.keys.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean matches(String str, int i2) {
        if (isContainer(str)) {
            return true;
        }
        if (i2 >= this.keys.size()) {
            return false;
        }
        return this.keys.get(i2).equals(str) || this.keys.get(i2).equals("**") || this.keys.get(i2).equals("*");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean propagateToChildren(String str, int i2) {
        return "__container".equals(str) || i2 < this.keys.size() - 1 || this.keys.get(i2).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public KeyPath resolve(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.resolvedElement = keyPathElement;
        return keyPath;
    }

    public String toString() {
        StringBuilder y = a.y("KeyPath{keys=");
        y.append(this.keys);
        y.append(",resolved=");
        y.append(this.resolvedElement != null);
        y.append('}');
        return y.toString();
    }
}
