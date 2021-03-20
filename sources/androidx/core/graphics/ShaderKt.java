package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import e.r;
import e.x.b.l;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/graphics/Shader;", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "Le/r;", "block", "transform", "(Landroid/graphics/Shader;Le/x/b/l;)V", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class ShaderKt {
    public static final void transform(Shader shader, l<? super Matrix, r> lVar) {
        i.f(shader, "$this$transform");
        i.f(lVar, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
