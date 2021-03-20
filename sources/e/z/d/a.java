package e.z.d;

import e.x.c.i;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends e.z.a {
    public Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "ThreadLocalRandom.current()");
        return current;
    }
}
