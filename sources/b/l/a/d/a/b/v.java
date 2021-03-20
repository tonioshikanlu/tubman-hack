package b.l.a.d.a.b;

import b.l.a.d.a.e.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class v extends t {

    /* renamed from: h  reason: collision with root package name */
    public final File f4634h;

    /* renamed from: i  reason: collision with root package name */
    public final File f4635i;

    /* renamed from: j  reason: collision with root package name */
    public final NavigableMap<Long, File> f4636j = new TreeMap();

    public v(File file, File file2) {
        this.f4634h = file;
        this.f4635i = file2;
        ArrayList arrayList = (ArrayList) v1.a(file, file2);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.f4636j.put(Long.valueOf(j2), file3);
                j2 += file3.length();
            }
            return;
        }
        throw new g0(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    public final long b() {
        Map.Entry<Long, File> lastEntry = this.f4636j.lastEntry();
        return lastEntry.getValue().length() + lastEntry.getKey().longValue();
    }

    public final void close() {
    }

    public final InputStream e(long j2, long j3) {
        if (j2 < 0 || j3 < 0) {
            throw new g0(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j2), Long.valueOf(j3)}));
        }
        long j4 = j2 + j3;
        if (j4 <= b()) {
            Long floorKey = this.f4636j.floorKey(Long.valueOf(j2));
            Long floorKey2 = this.f4636j.floorKey(Long.valueOf(j4));
            if (floorKey.equals(floorKey2)) {
                return new u(q(j2, floorKey), j3);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(q(j2, floorKey));
            Collection values = this.f4636j.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new f1(Collections.enumeration(values)));
            }
            arrayList.add(new u(new FileInputStream((File) this.f4636j.get(floorKey2)), j3 - (floorKey2.longValue() - j2)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new g0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(b()), Long.valueOf(j4)}));
    }

    public final InputStream q(long j2, Long l2) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f4636j.get(l2));
        if (fileInputStream.skip(j2 - l2.longValue()) == j2 - l2.longValue()) {
            return fileInputStream;
        }
        throw new g0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l2}));
    }
}
