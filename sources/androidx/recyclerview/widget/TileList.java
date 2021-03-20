package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

public class TileList<T> {
    public Tile<T> mLastAccessedTile;
    public final int mTileSize;
    private final SparseArray<Tile<T>> mTiles = new SparseArray<>(10);

    public static class Tile<T> {
        public int mItemCount;
        public final T[] mItems;
        public Tile<T> mNext;
        public int mStartPosition;

        public Tile(Class<T> cls, int i2) {
            this.mItems = (Object[]) Array.newInstance(cls, i2);
        }

        public boolean containsPosition(int i2) {
            int i3 = this.mStartPosition;
            return i3 <= i2 && i2 < i3 + this.mItemCount;
        }

        public T getByPosition(int i2) {
            return this.mItems[i2 - this.mStartPosition];
        }
    }

    public TileList(int i2) {
        this.mTileSize = i2;
    }

    public Tile<T> addOrReplace(Tile<T> tile) {
        int indexOfKey = this.mTiles.indexOfKey(tile.mStartPosition);
        if (indexOfKey < 0) {
            this.mTiles.put(tile.mStartPosition, tile);
            return null;
        }
        Tile<T> valueAt = this.mTiles.valueAt(indexOfKey);
        this.mTiles.setValueAt(indexOfKey, tile);
        if (this.mLastAccessedTile == valueAt) {
            this.mLastAccessedTile = tile;
        }
        return valueAt;
    }

    public void clear() {
        this.mTiles.clear();
    }

    public Tile<T> getAtIndex(int i2) {
        return this.mTiles.valueAt(i2);
    }

    public T getItemAt(int i2) {
        Tile<T> tile = this.mLastAccessedTile;
        if (tile == null || !tile.containsPosition(i2)) {
            int indexOfKey = this.mTiles.indexOfKey(i2 - (i2 % this.mTileSize));
            if (indexOfKey < 0) {
                return null;
            }
            this.mLastAccessedTile = this.mTiles.valueAt(indexOfKey);
        }
        return this.mLastAccessedTile.getByPosition(i2);
    }

    public Tile<T> removeAtPos(int i2) {
        Tile<T> tile = this.mTiles.get(i2);
        if (this.mLastAccessedTile == tile) {
            this.mLastAccessedTile = null;
        }
        this.mTiles.delete(i2);
        return tile;
    }

    public int size() {
        return this.mTiles.size();
    }
}
