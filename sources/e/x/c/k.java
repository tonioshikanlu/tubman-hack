package e.x.c;

import java.io.Serializable;

public abstract class k<R> implements f<R>, Serializable {
    private final int arity;

    public k(int i2) {
        this.arity = i2;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String g2 = v.a.g(this);
        i.d(g2, "Reflection.renderLambdaToString(this)");
        return g2;
    }
}
