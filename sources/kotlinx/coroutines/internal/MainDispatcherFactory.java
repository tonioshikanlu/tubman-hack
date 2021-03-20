package kotlinx.coroutines.internal;

import g.a.h1;
import java.util.List;

public interface MainDispatcherFactory {
    h1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
