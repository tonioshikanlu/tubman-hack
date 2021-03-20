package com.solidstategroup.bullettrain;

import b.j.a.a.o;
import b.j.a.a.p;
import b.j.a.a.r;
import b.j.a.b.j;
import java.io.Serializable;
import java.util.List;

@r(r.a.NON_NULL)
@p(ignoreUnknown = true)
public class FlagsAndTraits implements Serializable {
    private List<Flag> flags;
    private List<Trait> traits;

    @o
    private void fromPrototype(FlagsAndTraits flagsAndTraits) {
        setFlags(flagsAndTraits.getFlags());
        setTraits(flagsAndTraits.getTraits());
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FlagsAndTraits;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FlagsAndTraits)) {
            return false;
        }
        FlagsAndTraits flagsAndTraits = (FlagsAndTraits) obj;
        if (!flagsAndTraits.canEqual(this)) {
            return false;
        }
        List<Flag> flags2 = getFlags();
        List<Flag> flags3 = flagsAndTraits.getFlags();
        if (flags2 != null ? !flags2.equals(flags3) : flags3 != null) {
            return false;
        }
        List<Trait> traits2 = getTraits();
        List<Trait> traits3 = flagsAndTraits.getTraits();
        return traits2 != null ? traits2.equals(traits3) : traits3 == null;
    }

    public List<Flag> getFlags() {
        return this.flags;
    }

    public List<Trait> getTraits() {
        return this.traits;
    }

    public int hashCode() {
        List<Flag> flags2 = getFlags();
        int i2 = 43;
        int hashCode = flags2 == null ? 43 : flags2.hashCode();
        List<Trait> traits2 = getTraits();
        int i3 = (hashCode + 59) * 59;
        if (traits2 != null) {
            i2 = traits2.hashCode();
        }
        return i3 + i2;
    }

    @o
    public void parse(String str) {
        fromPrototype((FlagsAndTraits) MapperFactory.getMappper().g(str, FlagsAndTraits.class));
    }

    public void setFlags(List<Flag> list) {
        this.flags = list;
    }

    public void setTraits(List<Trait> list) {
        this.traits = list;
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
