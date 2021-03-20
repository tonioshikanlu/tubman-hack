package androidx.constraintlayout.solver;

public final class Pools {
    private static final boolean DEBUG = false;

    public interface Pool<T> {
        T acquire();

        boolean release(T t);

        void releaseAll(T[] tArr, int i2);
    }

    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i2) {
            if (i2 > 0) {
                this.mPool = new Object[i2];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        private boolean isInPool(T t) {
            for (int i2 = 0; i2 < this.mPoolSize; i2++) {
                if (this.mPool[i2] == t) {
                    return true;
                }
            }
            return false;
        }

        public T acquire() {
            int i2 = this.mPoolSize;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            T[] tArr = this.mPool;
            T t = tArr[i3];
            tArr[i3] = null;
            this.mPoolSize = i2 - 1;
            return t;
        }

        public boolean release(T t) {
            int i2 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = t;
            this.mPoolSize = i2 + 1;
            return true;
        }

        public void releaseAll(T[] tArr, int i2) {
            if (i2 > tArr.length) {
                i2 = tArr.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                T t = tArr[i3];
                int i4 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i4 < objArr.length) {
                    objArr[i4] = t;
                    this.mPoolSize = i4 + 1;
                }
            }
        }
    }

    private Pools() {
    }
}
