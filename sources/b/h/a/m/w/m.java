package b.h.a.m.w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import b.h.a.s.g;
import b.h.a.s.j;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class m<A, B> {
    public final g<b<A>, B> a;

    public class a extends g<b<A>, B> {
        public a(m mVar, long j2) {
            super(j2);
        }

        public void c(@NonNull Object obj, @Nullable Object obj2) {
            b bVar = (b) obj;
            Objects.requireNonNull(bVar);
            Queue<b<?>> queue = b.d;
            synchronized (queue) {
                queue.offer(bVar);
            }
        }
    }

    @VisibleForTesting
    public static final class b<A> {
        public static final Queue<b<?>> d = new ArrayDeque(0);
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f809b;
        public A c;

        static {
            char[] cArr = j.a;
        }

        public static <A> b<A> a(A a2, int i2, int i3) {
            b<A> poll;
            Queue<b<?>> queue = d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new b<>();
            }
            poll.c = a2;
            poll.f809b = i2;
            poll.a = i3;
            return poll;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f809b == bVar.f809b && this.a == bVar.a && this.c.equals(bVar.c);
        }

        public int hashCode() {
            return this.c.hashCode() + (((this.a * 31) + this.f809b) * 31);
        }
    }

    public m(long j2) {
        this.a = new a(this, j2);
    }
}
