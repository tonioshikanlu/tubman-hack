package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.core.view.ViewCompat;
import b.e.a.a.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintAttribute {
    private static final String TAG = "TransitionLayout";
    public boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    public String mName;
    private String mStringValue;
    private AttributeType mType;

    /* renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|5|6|7|8|9|11|12|13|(2:15|16)|17|19|20|(3:21|22|24)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0031 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
        static {
            /*
                androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                r0 = 7
                int[] r1 = new int[r0]
                $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = r1
                r2 = 1
                r3 = 2
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x000e }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 3
                int[] r4 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r5 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x0015 }
                r4[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r3 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x001c }
                r4 = 0
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r1 = 4
                int[] r3 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0023 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r2 = 5
                int[] r3 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r1 = 6
                int[] r3 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch:{ NoSuchFieldError -> 0x0031 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r4 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0031 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0031:
                int[] r2 = $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch:{ NoSuchFieldError -> 0x0037 }
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r3 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0037 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintAttribute.AnonymousClass1.<clinit>():void");
        }
    }

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.mName = constraintAttribute.mName;
        this.mType = constraintAttribute.mType;
        setValue(obj);
    }

    public ConstraintAttribute(String str, AttributeType attributeType) {
        this.mName = str;
        this.mType = attributeType;
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj) {
        this.mName = str;
        this.mType = attributeType;
        setValue(obj);
    }

    private static int clamp(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static HashMap<String, ConstraintAttribute> extractAttributes(HashMap<String, ConstraintAttribute> hashMap, View view) {
        ConstraintAttribute constraintAttribute;
        HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute2 = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    constraintAttribute = new ConstraintAttribute(constraintAttribute2, (Object) Integer.valueOf(((ColorDrawable) view.getBackground()).getColor()));
                } else {
                    constraintAttribute = new ConstraintAttribute(constraintAttribute2, cls.getMethod("getMap" + next, new Class[0]).invoke(view, new Object[0]));
                }
                hashMap2.put(next, constraintAttribute);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void parse(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> hashMap) {
        AttributeType attributeType;
        Object string;
        int integer;
        AttributeType attributeType2;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType3 = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == R.styleable.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType3 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == R.styleable.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                } else if (index == R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == R.styleable.CustomAttribute_customPixelDimension) {
                        attributeType2 = AttributeType.DIMENSION_TYPE;
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == R.styleable.CustomAttribute_customDimension) {
                        attributeType2 = AttributeType.DIMENSION_TYPE;
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == R.styleable.CustomAttribute_customFloatValue) {
                        attributeType2 = AttributeType.FLOAT_TYPE;
                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == R.styleable.CustomAttribute_customIntegerValue) {
                        attributeType = AttributeType.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj2 = string;
                        attributeType3 = attributeType;
                        obj = obj2;
                    } else if (index == R.styleable.CustomAttribute_customStringValue) {
                        attributeType = AttributeType.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        Object obj22 = string;
                        attributeType3 = attributeType;
                        obj = obj22;
                    }
                    string = Float.valueOf(f);
                    Object obj222 = string;
                    attributeType3 = attributeType;
                    obj = obj222;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2222 = string;
                attributeType3 = attributeType;
                obj = obj2222;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType3, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public static void setAttributes(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            ConstraintAttribute constraintAttribute = hashMap.get(next);
            String m2 = a.m("set", next);
            try {
                switch (constraintAttribute.mType.ordinal()) {
                    case 0:
                        cls.getMethod(m2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.mIntegerValue)});
                        break;
                    case 1:
                        cls.getMethod(m2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.mFloatValue)});
                        break;
                    case 2:
                        cls.getMethod(m2, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.mColorValue)});
                        break;
                    case 3:
                        Method method = cls.getMethod(m2, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.mColorValue);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 4:
                        cls.getMethod(m2, new Class[]{CharSequence.class}).invoke(view, new Object[]{constraintAttribute.mStringValue});
                        break;
                    case 5:
                        cls.getMethod(m2, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(constraintAttribute.mBooleanValue)});
                        break;
                    case 6:
                        cls.getMethod(m2, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.mFloatValue)});
                        break;
                }
            } catch (NoSuchMethodException e2) {
                Log.e(TAG, e2.getMessage());
                Log.e(TAG, " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(m2);
                Log.e(TAG, sb.toString());
            } catch (IllegalAccessException e3) {
                StringBuilder C = a.C(" Custom Attribute \"", next, "\" not found on ");
                C.append(cls.getName());
                Log.e(TAG, C.toString());
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                StringBuilder C2 = a.C(" Custom Attribute \"", next, "\" not found on ");
                C2.append(cls.getName());
                Log.e(TAG, C2.toString());
                e4.printStackTrace();
            }
        }
    }

    public boolean diff(ConstraintAttribute constraintAttribute) {
        AttributeType attributeType;
        if (constraintAttribute == null || (attributeType = this.mType) != constraintAttribute.mType) {
            return false;
        }
        switch (attributeType.ordinal()) {
            case 0:
                return this.mIntegerValue == constraintAttribute.mIntegerValue;
            case 1:
                return this.mFloatValue == constraintAttribute.mFloatValue;
            case 2:
            case 3:
                return this.mColorValue == constraintAttribute.mColorValue;
            case 4:
                return this.mIntegerValue == constraintAttribute.mIntegerValue;
            case 5:
                return this.mBooleanValue == constraintAttribute.mBooleanValue;
            case 6:
                return this.mFloatValue == constraintAttribute.mFloatValue;
            default:
                return false;
        }
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (this.mType.ordinal()) {
            case 0:
                return (float) this.mIntegerValue;
            case 1:
                return this.mFloatValue;
            case 2:
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
                throw new RuntimeException("Cannot interpolate String");
            case 5:
                return this.mBooleanValue ? 1.0f : 0.0f;
            case 6:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (this.mType.ordinal()) {
            case 0:
                fArr[0] = (float) this.mIntegerValue;
                return;
            case 1:
                fArr[0] = this.mFloatValue;
                return;
            case 2:
            case 3:
                int i2 = this.mColorValue;
                float pow = (float) Math.pow((double) (((float) ((i2 >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i2 >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i2 & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i2 >> 24) & 255)) / 255.0f;
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                fArr[0] = this.mBooleanValue ? 1.0f : 0.0f;
                return;
            case 6:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public int noOfInterpValues() {
        int ordinal = this.mType.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public void setColorValue(int i2) {
        this.mColorValue = i2;
    }

    public void setFloatValue(float f) {
        this.mFloatValue = f;
    }

    public void setIntValue(int i2) {
        this.mIntegerValue = i2;
    }

    public void setInterpolatedValue(View view, float[] fArr) {
        View view2 = view;
        Class<?> cls = view.getClass();
        StringBuilder y = a.y("set");
        y.append(this.mName);
        String sb = y.toString();
        try {
            boolean z = true;
            switch (this.mType.ordinal()) {
                case 0:
                    cls.getMethod(sb, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((int) fArr[0])});
                    return;
                case 1:
                    cls.getMethod(sb, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                case 2:
                    cls.getMethod(sb, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((clamp((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)))});
                    return;
                case 3:
                    Method method = cls.getMethod(sb, new Class[]{Drawable.class});
                    int clamp = clamp((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int clamp2 = clamp((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((clamp << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp2 << 8) | clamp((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view2, new Object[]{colorDrawable});
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + this.mName);
                case 5:
                    Method method2 = cls.getMethod(sb, new Class[]{Boolean.TYPE});
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view2, objArr);
                    return;
                case 6:
                    cls.getMethod(sb, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e2) {
            StringBuilder C = a.C("no method ", sb, "on View \"");
            C.append(Debug.getName(view));
            C.append("\"");
            Log.e(TAG, C.toString());
            e2.printStackTrace();
        } catch (IllegalAccessException e3) {
            StringBuilder C2 = a.C("cannot access method ", sb, "on View \"");
            C2.append(Debug.getName(view));
            C2.append("\"");
            Log.e(TAG, C2.toString());
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(Object obj) {
        switch (this.mType.ordinal()) {
            case 0:
                this.mIntegerValue = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.mFloatValue = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.mColorValue = ((Integer) obj).intValue();
                return;
            case 4:
                this.mStringValue = (String) obj;
                return;
            case 5:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }

    public void setValue(float[] fArr) {
        float f;
        boolean z = false;
        switch (this.mType.ordinal()) {
            case 0:
                this.mIntegerValue = (int) fArr[0];
                return;
            case 1:
                f = fArr[0];
                break;
            case 2:
            case 3:
                int HSVToColor = Color.HSVToColor(fArr);
                this.mColorValue = HSVToColor;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case 4:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 5:
                if (((double) fArr[0]) > 0.5d) {
                    z = true;
                }
                this.mBooleanValue = z;
                return;
            case 6:
                f = fArr[0];
                break;
            default:
                return;
        }
        this.mFloatValue = f;
    }
}
