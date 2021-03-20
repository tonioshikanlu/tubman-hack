package com.amplitude.api;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Identify {
    public static final String TAG = "com.amplitude.api.Identify";
    public Set<String> userProperties = new HashSet();
    public JSONObject userPropertiesOperations = new JSONObject();

    private void addToUserProperties(String str, String str2, Object obj) {
        if (Utils.isEmptyString(str2)) {
            AmplitudeLog.getLogger().w(TAG, String.format("Attempting to perform operation %s with a null or empty string property, ignoring", new Object[]{str}));
        } else if (obj == null) {
            AmplitudeLog.getLogger().w(TAG, String.format("Attempting to perform operation %s with null value for property %s, ignoring", new Object[]{str, str2}));
        } else if (this.userPropertiesOperations.has(Constants.AMP_OP_CLEAR_ALL)) {
            AmplitudeLog.getLogger().w(TAG, String.format("This Identify already contains a $clearAll operation, ignoring operation %s", new Object[]{str}));
        } else if (this.userProperties.contains(str2)) {
            AmplitudeLog.getLogger().w(TAG, String.format("Already used property %s in previous operation, ignoring operation %s", new Object[]{str2, str}));
        } else {
            try {
                if (!this.userPropertiesOperations.has(str)) {
                    this.userPropertiesOperations.put(str, new JSONObject());
                }
                this.userPropertiesOperations.getJSONObject(str).put(str2, obj);
                this.userProperties.add(str2);
            } catch (JSONException e2) {
                AmplitudeLog.getLogger().e(TAG, e2.toString());
            }
        }
    }

    private JSONArray booleanArrayToJSONArray(boolean[] zArr) {
        JSONArray jSONArray = new JSONArray();
        for (boolean put : zArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    private JSONArray doubleArrayToJSONArray(double[] dArr) {
        JSONArray jSONArray = new JSONArray();
        for (double d : dArr) {
            try {
                jSONArray.put(d);
            } catch (JSONException e2) {
                AmplitudeLog.getLogger().e(TAG, String.format("Error converting double %d to JSON: %s", new Object[]{Double.valueOf(d), e2.toString()}));
            }
        }
        return jSONArray;
    }

    private JSONArray floatArrayToJSONArray(float[] fArr) {
        JSONArray jSONArray = new JSONArray();
        for (float f : fArr) {
            try {
                jSONArray.put((double) f);
            } catch (JSONException e2) {
                AmplitudeLog.getLogger().e(TAG, String.format("Error converting float %f to JSON: %s", new Object[]{Float.valueOf(f), e2.toString()}));
            }
        }
        return jSONArray;
    }

    private JSONArray intArrayToJSONArray(int[] iArr) {
        JSONArray jSONArray = new JSONArray();
        for (int put : iArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    private JSONArray longArrayToJSONArray(long[] jArr) {
        JSONArray jSONArray = new JSONArray();
        for (long put : jArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    private JSONArray stringArrayToJSONArray(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String put : strArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public Identify add(String str, double d) {
        addToUserProperties(Constants.AMP_OP_ADD, str, Double.valueOf(d));
        return this;
    }

    public Identify add(String str, float f) {
        addToUserProperties(Constants.AMP_OP_ADD, str, Float.valueOf(f));
        return this;
    }

    public Identify add(String str, int i2) {
        addToUserProperties(Constants.AMP_OP_ADD, str, Integer.valueOf(i2));
        return this;
    }

    public Identify add(String str, long j2) {
        addToUserProperties(Constants.AMP_OP_ADD, str, Long.valueOf(j2));
        return this;
    }

    public Identify add(String str, String str2) {
        addToUserProperties(Constants.AMP_OP_ADD, str, str2);
        return this;
    }

    public Identify add(String str, JSONObject jSONObject) {
        addToUserProperties(Constants.AMP_OP_ADD, str, jSONObject);
        return this;
    }

    public Identify append(String str, double d) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, Double.valueOf(d));
        return this;
    }

    public Identify append(String str, float f) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, Float.valueOf(f));
        return this;
    }

    public Identify append(String str, int i2) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, Integer.valueOf(i2));
        return this;
    }

    public Identify append(String str, long j2) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, Long.valueOf(j2));
        return this;
    }

    public Identify append(String str, String str2) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, str2);
        return this;
    }

    public Identify append(String str, JSONArray jSONArray) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, jSONArray);
        return this;
    }

    public Identify append(String str, JSONObject jSONObject) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, jSONObject);
        return this;
    }

    public Identify append(String str, boolean z) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, Boolean.valueOf(z));
        return this;
    }

    public Identify append(String str, double[] dArr) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, doubleArrayToJSONArray(dArr));
        return this;
    }

    public Identify append(String str, float[] fArr) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, floatArrayToJSONArray(fArr));
        return this;
    }

    public Identify append(String str, int[] iArr) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, intArrayToJSONArray(iArr));
        return this;
    }

    public Identify append(String str, long[] jArr) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, longArrayToJSONArray(jArr));
        return this;
    }

    public Identify append(String str, String[] strArr) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, stringArrayToJSONArray(strArr));
        return this;
    }

    public Identify append(String str, boolean[] zArr) {
        addToUserProperties(Constants.AMP_OP_APPEND, str, booleanArrayToJSONArray(zArr));
        return this;
    }

    public Identify clearAll() {
        if (this.userPropertiesOperations.length() > 0) {
            if (!this.userProperties.contains(Constants.AMP_OP_CLEAR_ALL)) {
                AmplitudeLog.getLogger().w(TAG, String.format("Need to send $clearAll on its own Identify object without any other operations, ignoring $clearAll", new Object[0]));
            }
            return this;
        }
        try {
            this.userPropertiesOperations.put(Constants.AMP_OP_CLEAR_ALL, "-");
        } catch (JSONException e2) {
            AmplitudeLog.getLogger().e(TAG, e2.toString());
        }
        return this;
    }

    public JSONObject getUserPropertiesOperations() {
        try {
            return new JSONObject(this.userPropertiesOperations.toString());
        } catch (JSONException e2) {
            AmplitudeLog.getLogger().e(TAG, e2.toString());
            return new JSONObject();
        }
    }

    public Identify prepend(String str, double d) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, Double.valueOf(d));
        return this;
    }

    public Identify prepend(String str, float f) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, Float.valueOf(f));
        return this;
    }

    public Identify prepend(String str, int i2) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, Integer.valueOf(i2));
        return this;
    }

    public Identify prepend(String str, long j2) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, Long.valueOf(j2));
        return this;
    }

    public Identify prepend(String str, String str2) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, str2);
        return this;
    }

    public Identify prepend(String str, JSONArray jSONArray) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, jSONArray);
        return this;
    }

    public Identify prepend(String str, JSONObject jSONObject) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, jSONObject);
        return this;
    }

    public Identify prepend(String str, boolean z) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, Boolean.valueOf(z));
        return this;
    }

    public Identify prepend(String str, double[] dArr) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, doubleArrayToJSONArray(dArr));
        return this;
    }

    public Identify prepend(String str, float[] fArr) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, floatArrayToJSONArray(fArr));
        return this;
    }

    public Identify prepend(String str, int[] iArr) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, intArrayToJSONArray(iArr));
        return this;
    }

    public Identify prepend(String str, long[] jArr) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, longArrayToJSONArray(jArr));
        return this;
    }

    public Identify prepend(String str, String[] strArr) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, stringArrayToJSONArray(strArr));
        return this;
    }

    public Identify prepend(String str, boolean[] zArr) {
        addToUserProperties(Constants.AMP_OP_PREPEND, str, booleanArrayToJSONArray(zArr));
        return this;
    }

    public Identify set(String str, double d) {
        addToUserProperties(Constants.AMP_OP_SET, str, Double.valueOf(d));
        return this;
    }

    public Identify set(String str, float f) {
        addToUserProperties(Constants.AMP_OP_SET, str, Float.valueOf(f));
        return this;
    }

    public Identify set(String str, int i2) {
        addToUserProperties(Constants.AMP_OP_SET, str, Integer.valueOf(i2));
        return this;
    }

    public Identify set(String str, long j2) {
        addToUserProperties(Constants.AMP_OP_SET, str, Long.valueOf(j2));
        return this;
    }

    public Identify set(String str, Object obj) {
        AmplitudeLog.getLogger().w(TAG, "This version of set is deprecated. Please use one with a different signature.");
        return this;
    }

    public Identify set(String str, String str2) {
        addToUserProperties(Constants.AMP_OP_SET, str, str2);
        return this;
    }

    public Identify set(String str, JSONArray jSONArray) {
        addToUserProperties(Constants.AMP_OP_SET, str, jSONArray);
        return this;
    }

    public Identify set(String str, JSONObject jSONObject) {
        addToUserProperties(Constants.AMP_OP_SET, str, jSONObject);
        return this;
    }

    public Identify set(String str, boolean z) {
        addToUserProperties(Constants.AMP_OP_SET, str, Boolean.valueOf(z));
        return this;
    }

    public Identify set(String str, double[] dArr) {
        addToUserProperties(Constants.AMP_OP_SET, str, doubleArrayToJSONArray(dArr));
        return this;
    }

    public Identify set(String str, float[] fArr) {
        addToUserProperties(Constants.AMP_OP_SET, str, floatArrayToJSONArray(fArr));
        return this;
    }

    public Identify set(String str, int[] iArr) {
        addToUserProperties(Constants.AMP_OP_SET, str, intArrayToJSONArray(iArr));
        return this;
    }

    public Identify set(String str, long[] jArr) {
        addToUserProperties(Constants.AMP_OP_SET, str, longArrayToJSONArray(jArr));
        return this;
    }

    public Identify set(String str, String[] strArr) {
        addToUserProperties(Constants.AMP_OP_SET, str, stringArrayToJSONArray(strArr));
        return this;
    }

    public Identify set(String str, boolean[] zArr) {
        addToUserProperties(Constants.AMP_OP_SET, str, booleanArrayToJSONArray(zArr));
        return this;
    }

    public Identify setOnce(String str, double d) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, Double.valueOf(d));
        return this;
    }

    public Identify setOnce(String str, float f) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, Float.valueOf(f));
        return this;
    }

    public Identify setOnce(String str, int i2) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, Integer.valueOf(i2));
        return this;
    }

    public Identify setOnce(String str, long j2) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, Long.valueOf(j2));
        return this;
    }

    public Identify setOnce(String str, Object obj) {
        AmplitudeLog.getLogger().w(TAG, "This version of setOnce is deprecated. Please use one with a different signature.");
        return this;
    }

    public Identify setOnce(String str, String str2) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, str2);
        return this;
    }

    public Identify setOnce(String str, JSONArray jSONArray) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, jSONArray);
        return this;
    }

    public Identify setOnce(String str, JSONObject jSONObject) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, jSONObject);
        return this;
    }

    public Identify setOnce(String str, boolean z) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, Boolean.valueOf(z));
        return this;
    }

    public Identify setOnce(String str, double[] dArr) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, doubleArrayToJSONArray(dArr));
        return this;
    }

    public Identify setOnce(String str, float[] fArr) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, floatArrayToJSONArray(fArr));
        return this;
    }

    public Identify setOnce(String str, int[] iArr) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, intArrayToJSONArray(iArr));
        return this;
    }

    public Identify setOnce(String str, long[] jArr) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, longArrayToJSONArray(jArr));
        return this;
    }

    public Identify setOnce(String str, String[] strArr) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, stringArrayToJSONArray(strArr));
        return this;
    }

    public Identify setOnce(String str, boolean[] zArr) {
        addToUserProperties(Constants.AMP_OP_SET_ONCE, str, booleanArrayToJSONArray(zArr));
        return this;
    }

    public Identify setUserProperty(String str, Object obj) {
        addToUserProperties(Constants.AMP_OP_SET, str, obj);
        return this;
    }

    public Identify unset(String str) {
        addToUserProperties(Constants.AMP_OP_UNSET, str, "-");
        return this;
    }
}
