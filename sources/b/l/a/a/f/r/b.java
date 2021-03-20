package b.l.a.a.f.r;

import androidx.annotation.WorkerThread;

@WorkerThread
public interface b {

    public interface a<T> {
        T a();
    }

    <T> T b(a<T> aVar);
}
