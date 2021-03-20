package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import b.e.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DiffUtil {
    private static final Comparator<Snake> SNAKE_COMPARATOR = new Comparator<Snake>() {
        public int compare(Snake snake, Snake snake2) {
            int i2 = snake.x - snake2.x;
            return i2 == 0 ? snake.y - snake2.y : i2;
        }
    };

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i2, int i3);

        public abstract boolean areItemsTheSame(int i2, int i3);

        @Nullable
        public Object getChangePayload(int i2, int i3) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_IGNORE = 16;
        private static final int FLAG_MASK = 31;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 5;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;
        private final List<Snake> mSnakes;

        public DiffResult(Callback callback, List<Snake> list, int[] iArr, int[] iArr2, boolean z) {
            this.mSnakes = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z;
            addRootSnake();
            findMatchingItems();
        }

        private void addRootSnake() {
            Snake snake = this.mSnakes.isEmpty() ? null : this.mSnakes.get(0);
            if (snake == null || snake.x != 0 || snake.y != 0) {
                Snake snake2 = new Snake();
                snake2.x = 0;
                snake2.y = 0;
                snake2.removal = false;
                snake2.size = 0;
                snake2.reverse = false;
                this.mSnakes.add(0, snake2);
            }
        }

        private void dispatchAdditions(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i2, int i3, int i4) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onInserted(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int[] iArr = this.mNewItemStatuses;
                int i6 = i4 + i5;
                int i7 = iArr[i6] & 31;
                if (i7 == 0) {
                    listUpdateCallback.onInserted(i2, 1);
                    for (PostponedUpdate postponedUpdate : list) {
                        postponedUpdate.currentPos++;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = iArr[i6] >> 5;
                    listUpdateCallback.onMoved(removePostponedUpdate(list, i8, true).currentPos, i2);
                    if (i7 == 4) {
                        listUpdateCallback.onChanged(i2, 1, this.mCallback.getChangePayload(i8, i6));
                    }
                } else if (i7 == 16) {
                    list.add(new PostponedUpdate(i6, i2, false));
                } else {
                    StringBuilder z = a.z("unknown flag for pos ", i6, " ");
                    z.append(Long.toBinaryString((long) i7));
                    throw new IllegalStateException(z.toString());
                }
            }
        }

        private void dispatchRemovals(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i2, int i3, int i4) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onRemoved(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int[] iArr = this.mOldItemStatuses;
                int i6 = i4 + i5;
                int i7 = iArr[i6] & 31;
                if (i7 == 0) {
                    listUpdateCallback.onRemoved(i2 + i5, 1);
                    for (PostponedUpdate postponedUpdate : list) {
                        postponedUpdate.currentPos--;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = iArr[i6] >> 5;
                    PostponedUpdate removePostponedUpdate = removePostponedUpdate(list, i8, false);
                    listUpdateCallback.onMoved(i2 + i5, removePostponedUpdate.currentPos - 1);
                    if (i7 == 4) {
                        listUpdateCallback.onChanged(removePostponedUpdate.currentPos - 1, 1, this.mCallback.getChangePayload(i6, i8));
                    }
                } else if (i7 == 16) {
                    list.add(new PostponedUpdate(i6, i2 + i5, true));
                } else {
                    StringBuilder z = a.z("unknown flag for pos ", i6, " ");
                    z.append(Long.toBinaryString((long) i7));
                    throw new IllegalStateException(z.toString());
                }
            }
        }

        private void findAddition(int i2, int i3, int i4) {
            if (this.mOldItemStatuses[i2 - 1] == 0) {
                findMatchingItem(i2, i3, i4, false);
            }
        }

        private boolean findMatchingItem(int i2, int i3, int i4, boolean z) {
            int i5;
            int i6;
            if (z) {
                i3--;
                i5 = i2;
                i6 = i3;
            } else {
                i6 = i2 - 1;
                i5 = i6;
            }
            while (i4 >= 0) {
                Snake snake = this.mSnakes.get(i4);
                int i7 = snake.x;
                int i8 = snake.size;
                int i9 = i7 + i8;
                int i10 = snake.y + i8;
                int i11 = 8;
                if (z) {
                    for (int i12 = i5 - 1; i12 >= i9; i12--) {
                        if (this.mCallback.areItemsTheSame(i12, i6)) {
                            if (!this.mCallback.areContentsTheSame(i12, i6)) {
                                i11 = 4;
                            }
                            this.mNewItemStatuses[i6] = (i12 << 5) | 16;
                            this.mOldItemStatuses[i12] = (i6 << 5) | i11;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i13 = i3 - 1; i13 >= i10; i13--) {
                        if (this.mCallback.areItemsTheSame(i6, i13)) {
                            if (!this.mCallback.areContentsTheSame(i6, i13)) {
                                i11 = 4;
                            }
                            int i14 = i2 - 1;
                            this.mOldItemStatuses[i14] = (i13 << 5) | 16;
                            this.mNewItemStatuses[i13] = (i14 << 5) | i11;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = snake.x;
                i3 = snake.y;
                i4--;
            }
            return false;
        }

        private void findMatchingItems() {
            int i2 = this.mOldListSize;
            int i3 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i4 = snake.x;
                int i5 = snake.size;
                int i6 = i4 + i5;
                int i7 = snake.y + i5;
                if (this.mDetectMoves) {
                    while (i2 > i6) {
                        findAddition(i2, i3, size);
                        i2--;
                    }
                    while (i3 > i7) {
                        findRemoval(i2, i3, size);
                        i3--;
                    }
                }
                for (int i8 = 0; i8 < snake.size; i8++) {
                    int i9 = snake.x + i8;
                    int i10 = snake.y + i8;
                    int i11 = this.mCallback.areContentsTheSame(i9, i10) ? 1 : 2;
                    this.mOldItemStatuses[i9] = (i10 << 5) | i11;
                    this.mNewItemStatuses[i10] = (i9 << 5) | i11;
                }
                i2 = snake.x;
                i3 = snake.y;
            }
        }

        private void findRemoval(int i2, int i3, int i4) {
            if (this.mNewItemStatuses[i3 - 1] == 0) {
                findMatchingItem(i2, i3, i4, true);
            }
        }

        private static PostponedUpdate removePostponedUpdate(List<PostponedUpdate> list, int i2, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                PostponedUpdate postponedUpdate = list.get(size);
                if (postponedUpdate.posInOwnerList == i2 && postponedUpdate.removal == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).currentPos += z ? 1 : -1;
                        size++;
                    }
                    return postponedUpdate;
                }
                size--;
            }
            return null;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i2) {
            if (i2 < 0 || i2 >= this.mNewListSize) {
                StringBuilder z = a.z("Index out of bounds - passed position = ", i2, ", new list size = ");
                z.append(this.mNewListSize);
                throw new IndexOutOfBoundsException(z.toString());
            }
            int i3 = this.mNewItemStatuses[i2];
            if ((i3 & 31) == 0) {
                return -1;
            }
            return i3 >> 5;
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i2) {
            if (i2 < 0 || i2 >= this.mOldListSize) {
                StringBuilder z = a.z("Index out of bounds - passed position = ", i2, ", old list size = ");
                z.append(this.mOldListSize);
                throw new IndexOutOfBoundsException(z.toString());
            }
            int i3 = this.mOldItemStatuses[i2];
            if ((i3 & 31) == 0) {
                return -1;
            }
            return i3 >> 5;
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            ArrayList arrayList = new ArrayList();
            int i2 = this.mOldListSize;
            int i3 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i4 = snake.size;
                int i5 = snake.x + i4;
                int i6 = snake.y + i4;
                if (i5 < i2) {
                    dispatchRemovals(arrayList, batchingListUpdateCallback, i5, i2 - i5, i5);
                }
                if (i6 < i3) {
                    dispatchAdditions(arrayList, batchingListUpdateCallback, i5, i3 - i6, i6);
                }
                for (int i7 = i4 - 1; i7 >= 0; i7--) {
                    int[] iArr = this.mOldItemStatuses;
                    int i8 = snake.x;
                    if ((iArr[i8 + i7] & 31) == 2) {
                        batchingListUpdateCallback.onChanged(i8 + i7, 1, this.mCallback.getChangePayload(i8 + i7, snake.y + i7));
                    }
                }
                i2 = snake.x;
                i3 = snake.y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo((ListUpdateCallback) new AdapterListUpdateCallback(adapter));
        }

        @VisibleForTesting
        public List<Snake> getSnakes() {
            return this.mSnakes;
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t, @NonNull T t2);

        public abstract boolean areItemsTheSame(@NonNull T t, @NonNull T t2);

        @Nullable
        public Object getChangePayload(@NonNull T t, @NonNull T t2) {
            return null;
        }
    }

    public static class PostponedUpdate {
        public int currentPos;
        public int posInOwnerList;
        public boolean removal;

        public PostponedUpdate(int i2, int i3, boolean z) {
            this.posInOwnerList = i2;
            this.currentPos = i3;
            this.removal = z;
        }
    }

    public static class Range {
        public int newListEnd;
        public int newListStart;
        public int oldListEnd;
        public int oldListStart;

        public Range() {
        }

        public Range(int i2, int i3, int i4, int i5) {
            this.oldListStart = i2;
            this.oldListEnd = i3;
            this.newListStart = i4;
            this.newListEnd = i5;
        }
    }

    public static class Snake {
        public boolean removal;
        public boolean reverse;
        public int size;
        public int x;
        public int y;
    }

    private DiffUtil() {
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff(@androidx.annotation.NonNull androidx.recyclerview.widget.DiffUtil.Callback r15, boolean r16) {
        /*
            int r0 = r15.getOldListSize()
            int r1 = r15.getNewListSize()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.recyclerview.widget.DiffUtil$Range r3 = new androidx.recyclerview.widget.DiffUtil$Range
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r3 = r0 + r1
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 + r3
            int r1 = r0 * 2
            int[] r13 = new int[r1]
            int[] r1 = new int[r1]
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x002e:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x00dd
            int r5 = r2.size()
            int r5 = r5 + -1
            java.lang.Object r5 = r2.remove(r5)
            r14 = r5
            androidx.recyclerview.widget.DiffUtil$Range r14 = (androidx.recyclerview.widget.DiffUtil.Range) r14
            int r6 = r14.oldListStart
            int r7 = r14.oldListEnd
            int r8 = r14.newListStart
            int r9 = r14.newListEnd
            r5 = r15
            r10 = r13
            r11 = r1
            r12 = r0
            androidx.recyclerview.widget.DiffUtil$Snake r5 = diffPartial(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L_0x00d8
            int r6 = r5.size
            if (r6 <= 0) goto L_0x005a
            r4.add(r5)
        L_0x005a:
            int r6 = r5.x
            int r7 = r14.oldListStart
            int r6 = r6 + r7
            r5.x = r6
            int r6 = r5.y
            int r7 = r14.newListStart
            int r6 = r6 + r7
            r5.y = r6
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x0074
            androidx.recyclerview.widget.DiffUtil$Range r6 = new androidx.recyclerview.widget.DiffUtil$Range
            r6.<init>()
            goto L_0x0080
        L_0x0074:
            int r6 = r3.size()
            int r6 = r6 + -1
            java.lang.Object r6 = r3.remove(r6)
            androidx.recyclerview.widget.DiffUtil$Range r6 = (androidx.recyclerview.widget.DiffUtil.Range) r6
        L_0x0080:
            int r7 = r14.oldListStart
            r6.oldListStart = r7
            int r7 = r14.newListStart
            r6.newListStart = r7
            boolean r7 = r5.reverse
            if (r7 == 0) goto L_0x0095
            int r7 = r5.x
        L_0x008e:
            r6.oldListEnd = r7
            int r7 = r5.y
        L_0x0092:
            r6.newListEnd = r7
            goto L_0x00a7
        L_0x0095:
            boolean r7 = r5.removal
            if (r7 == 0) goto L_0x009e
            int r7 = r5.x
            int r7 = r7 + -1
            goto L_0x008e
        L_0x009e:
            int r7 = r5.x
            r6.oldListEnd = r7
            int r7 = r5.y
            int r7 = r7 + -1
            goto L_0x0092
        L_0x00a7:
            r2.add(r6)
            boolean r6 = r5.reverse
            if (r6 == 0) goto L_0x00c7
            boolean r6 = r5.removal
            if (r6 == 0) goto L_0x00ba
            int r6 = r5.x
            int r7 = r5.size
            int r6 = r6 + r7
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00ba:
            int r6 = r5.x
            int r7 = r5.size
            int r6 = r6 + r7
            r14.oldListStart = r6
            int r5 = r5.y
            int r5 = r5 + r7
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00c7:
            int r6 = r5.x
            int r7 = r5.size
            int r6 = r6 + r7
        L_0x00cc:
            r14.oldListStart = r6
            int r5 = r5.y
            int r5 = r5 + r7
        L_0x00d1:
            r14.newListStart = r5
            r2.add(r14)
            goto L_0x002e
        L_0x00d8:
            r3.add(r14)
            goto L_0x002e
        L_0x00dd:
            java.util.Comparator<androidx.recyclerview.widget.DiffUtil$Snake> r0 = SNAKE_COMPARATOR
            java.util.Collections.sort(r4, r0)
            androidx.recyclerview.widget.DiffUtil$DiffResult r0 = new androidx.recyclerview.widget.DiffUtil$DiffResult
            r2 = r0
            r3 = r15
            r5 = r13
            r6 = r1
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiffUtil.calculateDiff(androidx.recyclerview.widget.DiffUtil$Callback, boolean):androidx.recyclerview.widget.DiffUtil$DiffResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r2[r12 - 1] < r2[r12 + 1]) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[LOOP:1: B:10:0x0033->B:33:0x009a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.DiffUtil.Snake diffPartial(androidx.recyclerview.widget.DiffUtil.Callback r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x012f
            if (r4 >= r5) goto L_0x0011
            goto L_0x012f
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = r5
            goto L_0x002e
        L_0x002d:
            r8 = r10
        L_0x002e:
            r9 = r10
        L_0x002f:
            if (r9 > r7) goto L_0x0127
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a0
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = r5
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = r10
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.areItemsTheSame(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009a
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009a
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009a
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009a
            androidx.recyclerview.widget.DiffUtil$Snake r0 = new androidx.recyclerview.widget.DiffUtil$Snake
            r0.<init>()
            r3 = r2[r5]
            r0.x = r3
            int r3 = r3 - r12
            r0.y = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.size = r1
            r0.removal = r14
            r13 = 0
            r0.reverse = r13
            return r0
        L_0x009a:
            r13 = 0
            int r12 = r12 + 2
            r10 = r13
            r5 = 1
            goto L_0x0033
        L_0x00a0:
            r13 = r10
            r5 = r11
        L_0x00a2:
            if (r5 > r9) goto L_0x011c
            int r10 = r5 + r6
            int r12 = r9 + r6
            if (r10 == r12) goto L_0x00c4
            int r12 = r11 + r6
            if (r10 == r12) goto L_0x00bb
            int r12 = r26 + r10
            int r14 = r12 + -1
            r14 = r2[r14]
            r15 = 1
            int r12 = r12 + r15
            r12 = r2[r12]
            if (r14 >= r12) goto L_0x00bc
            goto L_0x00c5
        L_0x00bb:
            r15 = 1
        L_0x00bc:
            int r12 = r26 + r10
            int r12 = r12 + r15
            r12 = r2[r12]
            int r12 = r12 - r15
            r14 = r15
            goto L_0x00cb
        L_0x00c4:
            r15 = 1
        L_0x00c5:
            int r12 = r26 + r10
            int r12 = r12 - r15
            r12 = r2[r12]
            r14 = r13
        L_0x00cb:
            int r16 = r12 - r10
        L_0x00cd:
            if (r12 <= 0) goto L_0x00ea
            if (r16 <= 0) goto L_0x00ea
            int r17 = r20 + r12
            int r13 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.areItemsTheSame(r13, r3)
            if (r3 == 0) goto L_0x00ec
            int r12 = r12 + -1
            int r16 = r16 + -1
            r3 = r18
            r13 = 0
            r15 = 1
            goto L_0x00cd
        L_0x00ea:
            r18 = r3
        L_0x00ec:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L_0x0115
            if (r10 < r11) goto L_0x0115
            if (r10 > r9) goto L_0x0115
            r12 = r1[r3]
            r13 = r2[r3]
            if (r12 < r13) goto L_0x0115
            androidx.recyclerview.widget.DiffUtil$Snake r0 = new androidx.recyclerview.widget.DiffUtil$Snake
            r0.<init>()
            r4 = r2[r3]
            r0.x = r4
            int r4 = r4 - r10
            r0.y = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.size = r1
            r0.removal = r14
            r3 = 1
            r0.reverse = r3
            return r0
        L_0x0115:
            r3 = 1
            int r5 = r5 + 2
            r3 = r18
            r13 = 0
            goto L_0x00a2
        L_0x011c:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r5 = r3
            r3 = r18
            r10 = 0
            goto L_0x002f
        L_0x0127:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x012f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiffUtil.diffPartial(androidx.recyclerview.widget.DiffUtil$Callback, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.DiffUtil$Snake");
    }
}
