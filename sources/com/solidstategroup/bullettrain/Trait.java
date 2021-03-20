package com.solidstategroup.bullettrain;

import b.j.a.a.o;
import b.j.a.a.p;
import b.j.a.a.r;
import b.j.a.a.u;
import b.j.a.b.j;
import java.io.Serializable;

@r(r.a.NON_NULL)
@p(ignoreUnknown = true)
public class Trait implements Serializable {
    @u("trait_key")
    private String key;
    @u("trait_value")
    private String value;

    @o
    private void fromPrototype(Trait trait) {
        setKey(trait.getKey());
        setValue(trait.getValue());
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Trait;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Trait)) {
            return false;
        }
        Trait trait = (Trait) obj;
        if (!trait.canEqual(this)) {
            return false;
        }
        String key2 = getKey();
        String key3 = trait.getKey();
        if (key2 != null ? !key2.equals(key3) : key3 != null) {
            return false;
        }
        String value2 = getValue();
        String value3 = trait.getValue();
        return value2 != null ? value2.equals(value3) : value3 == null;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        String key2 = getKey();
        int i2 = 43;
        int hashCode = key2 == null ? 43 : key2.hashCode();
        String value2 = getValue();
        int i3 = (hashCode + 59) * 59;
        if (value2 != null) {
            i2 = value2.hashCode();
        }
        return i3 + i2;
    }

    @o
    public void parse(String str) {
        fromPrototype((Trait) MapperFactory.getMappper().g(str, Trait.class));
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
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
