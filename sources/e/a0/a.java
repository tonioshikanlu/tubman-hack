package e.a0;

import java.lang.Comparable;

public interface a<T extends Comparable<? super T>> {
    T getEndInclusive();

    T getStart();
}
