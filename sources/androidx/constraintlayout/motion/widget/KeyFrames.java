package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class KeyFrames {
    private static final String TAG = "KeyFrames";
    public static final int UNSET = -1;
    public static HashMap<String, Constructor<? extends Key>> sKeyMakers;
    private HashMap<Integer, ArrayList<Key>> mFramesMap = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends Key>> hashMap = new HashMap<>();
        sKeyMakers = hashMap;
        try {
            hashMap.put(KeyAttributes.NAME, KeyAttributes.class.getConstructor(new Class[0]));
            sKeyMakers.put(KeyPosition.NAME, KeyPosition.class.getConstructor(new Class[0]));
            sKeyMakers.put(KeyCycle.NAME, KeyCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put(KeyTimeCycle.NAME, KeyTimeCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put(KeyTrigger.NAME, KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e2) {
            Log.e(TAG, "unable to load", e2);
        }
    }

    public KeyFrames(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        Key key;
        Exception e2;
        Key key2 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (sKeyMakers.containsKey(name)) {
                        try {
                            key = (Key) sKeyMakers.get(name).newInstance(new Object[0]);
                            try {
                                key.load(context, Xml.asAttributeSet(xmlPullParser));
                                addKey(key);
                            } catch (Exception e3) {
                                e2 = e3;
                            }
                        } catch (Exception e4) {
                            Exception exc = e4;
                            key = key2;
                            e2 = exc;
                            Log.e(TAG, "unable to create ", e2);
                            key2 = key;
                            eventType = xmlPullParser.next();
                        }
                        key2 = key;
                    } else if (!(!name.equalsIgnoreCase("CustomAttribute") || key2 == null || (hashMap = key2.mCustomConstraints) == null)) {
                        ConstraintAttribute.parse(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        } catch (IOException e6) {
            e6.printStackTrace();
        }
    }

    private void addKey(Key key) {
        if (!this.mFramesMap.containsKey(Integer.valueOf(key.mTargetId))) {
            this.mFramesMap.put(Integer.valueOf(key.mTargetId), new ArrayList());
        }
        this.mFramesMap.get(Integer.valueOf(key.mTargetId)).add(key);
    }

    public static String name(int i2, Context context) {
        return context.getResources().getResourceEntryName(i2);
    }

    public void addFrames(MotionController motionController) {
        ArrayList arrayList = this.mFramesMap.get(Integer.valueOf(motionController.mId));
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
        ArrayList arrayList2 = this.mFramesMap.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Key key = (Key) it.next();
                if (key.matches(((ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag)) {
                    motionController.addKey(key);
                }
            }
        }
    }

    public ArrayList<Key> getKeyFramesForView(int i2) {
        return this.mFramesMap.get(Integer.valueOf(i2));
    }

    public Set<Integer> getKeys() {
        return this.mFramesMap.keySet();
    }
}
