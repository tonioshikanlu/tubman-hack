package androidx.constraintlayout.motion.widget;

import java.util.Arrays;
import java.util.HashMap;

public class KeyCache {
    public HashMap<Object, HashMap<String, float[]>> map = new HashMap<>();

    public float getFloatValue(Object obj, String str, int i2) {
        if (!this.map.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap hashMap = this.map.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) hashMap.get(str);
        if (fArr.length > i2) {
            return fArr[i2];
        }
        return Float.NaN;
    }

    public void setFloatValue(Object obj, String str, int i2, float f) {
        HashMap hashMap;
        if (!this.map.containsKey(obj)) {
            hashMap = new HashMap();
            float[] fArr = new float[(i2 + 1)];
            fArr[i2] = f;
            hashMap.put(str, fArr);
        } else {
            hashMap = this.map.get(obj);
            if (!hashMap.containsKey(str)) {
                float[] fArr2 = new float[(i2 + 1)];
                fArr2[i2] = f;
                hashMap.put(str, fArr2);
            } else {
                float[] fArr3 = (float[]) hashMap.get(str);
                if (fArr3.length <= i2) {
                    fArr3 = Arrays.copyOf(fArr3, i2 + 1);
                }
                fArr3[i2] = f;
                hashMap.put(str, fArr3);
                return;
            }
        }
        this.map.put(obj, hashMap);
    }
}
