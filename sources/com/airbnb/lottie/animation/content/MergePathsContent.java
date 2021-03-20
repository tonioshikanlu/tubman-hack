package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public class MergePathsContent implements PathContent, GreedyContent {
    private final Path firstPath = new Path();
    private final MergePaths mergePaths;
    private final String name;
    private final Path path = new Path();
    private final List<PathContent> pathContents = new ArrayList();
    private final Path remainderPath = new Path();

    /* renamed from: com.airbnb.lottie.animation.content.MergePathsContent$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
        static {
            /*
                com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values()
                r0 = 5
                int[] r1 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode = r1
                r2 = 1
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r3 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r3 = $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode     // Catch:{ NoSuchFieldError -> 0x0015 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r4 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD     // Catch:{ NoSuchFieldError -> 0x0015 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                r2 = 3
                int[] r3 = $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode     // Catch:{ NoSuchFieldError -> 0x001c }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r4 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001c }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r1 = 4
                int[] r3 = $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r4 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0023 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = $SwitchMap$com$airbnb$lottie$model$content$MergePaths$MergePathsMode     // Catch:{ NoSuchFieldError -> 0x0029 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r3 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x0029 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0029 }
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.MergePathsContent.AnonymousClass1.<clinit>():void");
        }
    }

    public MergePathsContent(MergePaths mergePaths2) {
        this.name = mergePaths2.getName();
        this.mergePaths = mergePaths2;
    }

    private void addPaths() {
        for (int i2 = 0; i2 < this.pathContents.size(); i2++) {
            this.path.addPath(this.pathContents.get(i2).getPath());
        }
    }

    @TargetApi(19)
    private void opFirstPathWithRest(Path.Op op) {
        this.remainderPath.reset();
        this.firstPath.reset();
        for (int size = this.pathContents.size() - 1; size >= 1; size--) {
            PathContent pathContent = this.pathContents.get(size);
            if (pathContent instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) pathContent;
                List<PathContent> pathList = contentGroup.getPathList();
                for (int size2 = pathList.size() - 1; size2 >= 0; size2--) {
                    Path path2 = pathList.get(size2).getPath();
                    path2.transform(contentGroup.getTransformationMatrix());
                    this.remainderPath.addPath(path2);
                }
            } else {
                this.remainderPath.addPath(pathContent.getPath());
            }
        }
        PathContent pathContent2 = this.pathContents.get(0);
        if (pathContent2 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) pathContent2;
            List<PathContent> pathList2 = contentGroup2.getPathList();
            for (int i2 = 0; i2 < pathList2.size(); i2++) {
                Path path3 = pathList2.get(i2).getPath();
                path3.transform(contentGroup2.getTransformationMatrix());
                this.firstPath.addPath(path3);
            }
        } else {
            this.firstPath.set(pathContent2.getPath());
        }
        this.path.op(this.firstPath, this.remainderPath, op);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void absorbContent(java.util.ListIterator<com.airbnb.lottie.animation.content.Content> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            com.airbnb.lottie.animation.content.Content r0 = (com.airbnb.lottie.animation.content.Content) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.animation.content.PathContent
            if (r1 == 0) goto L_0x000d
            java.util.List<com.airbnb.lottie.animation.content.PathContent> r1 = r2.pathContents
            com.airbnb.lottie.animation.content.PathContent r0 = (com.airbnb.lottie.animation.content.PathContent) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.MergePathsContent.absorbContent(java.util.ListIterator):void");
    }

    public String getName() {
        return this.name;
    }

    public Path getPath() {
        Path.Op op;
        this.path.reset();
        if (this.mergePaths.isHidden()) {
            return this.path;
        }
        int ordinal = this.mergePaths.getMode().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                op = Path.Op.UNION;
            } else if (ordinal == 2) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (ordinal == 3) {
                op = Path.Op.INTERSECT;
            } else if (ordinal == 4) {
                op = Path.Op.XOR;
            }
            opFirstPathWithRest(op);
        } else {
            addPaths();
        }
        return this.path;
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < this.pathContents.size(); i2++) {
            this.pathContents.get(i2).setContents(list, list2);
        }
    }
}
