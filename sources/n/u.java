package n;

import androidx.core.app.NotificationCompat;
import e.x.c.i;
import java.io.IOException;

public abstract class u {
    public static final u a = new a();

    public static final class a extends u {
    }

    public interface b {
        u a(f fVar);
    }

    public void a(f fVar, l lVar) {
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(lVar, "connection");
    }

    public void b(f fVar, IOException iOException) {
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(iOException, "ioe");
    }

    public void c(f fVar, IOException iOException) {
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(iOException, "ioe");
    }
}
