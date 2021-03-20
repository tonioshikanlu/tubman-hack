package com.appfoundry.previewer.model;

import b.e.a.a.a;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/appfoundry/previewer/model/Animation;", "", "", "component1", "()Ljava/lang/String;", "component2", "type", "strength", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/appfoundry/previewer/model/Animation;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getStrength", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class Animation {
    private final String strength;
    private final String type;

    public Animation(String str, String str2) {
        this.type = str;
        this.strength = str2;
    }

    public static /* synthetic */ Animation copy$default(Animation animation, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = animation.type;
        }
        if ((i2 & 2) != 0) {
            str2 = animation.strength;
        }
        return animation.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.strength;
    }

    public final Animation copy(String str, String str2) {
        return new Animation(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Animation)) {
            return false;
        }
        Animation animation = (Animation) obj;
        return i.a(this.type, animation.type) && i.a(this.strength, animation.strength);
    }

    public final String getStrength() {
        return this.strength;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.strength;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder y = a.y("Animation(type=");
        y.append(this.type);
        y.append(", strength=");
        return a.q(y, this.strength, ")");
    }
}
