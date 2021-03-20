package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.RequiresApi;
import e.x.c.i;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\n¢\u0006\u0004\b\n\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\f¢\u0006\u0004\b\u000b\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\f¢\u0006\u0004\b\f\u0010\t\u001a\u001c\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\f¢\u0006\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Landroid/graphics/Path;", "", "error", "", "Landroidx/core/graphics/PathSegment;", "flatten", "(Landroid/graphics/Path;F)Ljava/lang/Iterable;", "p", "plus", "(Landroid/graphics/Path;Landroid/graphics/Path;)Landroid/graphics/Path;", "minus", "or", "and", "xor", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class PathKt {
    @RequiresApi(19)
    public static final Path and(Path path, Path path2) {
        i.f(path, "$this$and");
        i.f(path2, "p");
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @RequiresApi(26)
    public static final Iterable<PathSegment> flatten(Path path, float f) {
        i.f(path, "$this$flatten");
        Collection<PathSegment> flatten = PathUtils.flatten(path, f);
        i.b(flatten, "PathUtils.flatten(this, error)");
        return flatten;
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 0.5f;
        }
        return flatten(path, f);
    }

    @RequiresApi(19)
    public static final Path minus(Path path, Path path2) {
        i.f(path, "$this$minus");
        i.f(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @RequiresApi(19)
    public static final Path or(Path path, Path path2) {
        i.f(path, "$this$or");
        i.f(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @RequiresApi(19)
    public static final Path plus(Path path, Path path2) {
        i.f(path, "$this$plus");
        i.f(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @RequiresApi(19)
    public static final Path xor(Path path, Path path2) {
        i.f(path, "$this$xor");
        i.f(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
