package com.solidstategroup.bullettrain;

import b.j.a.a.o;
import b.j.a.a.p;
import b.j.a.a.r;
import b.j.a.b.j;
import java.io.Serializable;

@r(r.a.NON_NULL)
@p(ignoreUnknown = true)
public class Feature implements Serializable {
    private String description;
    private String name;
    private String type;

    @o
    private void fromPrototype(Feature feature) {
        setName(feature.getName());
        setType(feature.getType());
        setDescription(feature.getDescription());
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Feature;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (!feature.canEqual(this)) {
            return false;
        }
        String name2 = getName();
        String name3 = feature.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        String type2 = getType();
        String type3 = feature.getType();
        if (type2 != null ? !type2.equals(type3) : type3 != null) {
            return false;
        }
        String description2 = getDescription();
        String description3 = feature.getDescription();
        return description2 != null ? description2.equals(description3) : description3 == null;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String name2 = getName();
        int i2 = 43;
        int hashCode = name2 == null ? 43 : name2.hashCode();
        String type2 = getType();
        int hashCode2 = ((hashCode + 59) * 59) + (type2 == null ? 43 : type2.hashCode());
        String description2 = getDescription();
        int i3 = hashCode2 * 59;
        if (description2 != null) {
            i2 = description2.hashCode();
        }
        return i3 + i2;
    }

    @o
    public void parse(String str) {
        fromPrototype((Feature) MapperFactory.getMappper().g(str, Feature.class));
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    @o
    public String toString() {
        try {
            return MapperFactory.getMappper().h(this);
        } catch (j unused) {
            return super.toString();
        }
    }
}
