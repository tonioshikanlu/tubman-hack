package com.appfoundry.previewer.model;

import b.p.a.l;
import b.p.a.q;
import b.p.a.u;
import b.p.a.x;
import b.p.a.z.b;
import e.x.c.i;
import java.lang.reflect.Constructor;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/appfoundry/previewer/model/StatesJsonAdapter;", "Lb/p/a/l;", "Lcom/appfoundry/previewer/model/States;", "", "toString", "()Ljava/lang/String;", "Lcom/appfoundry/previewer/model/State;", "nullableStateAdapter", "Lb/p/a/l;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lb/p/a/q$a;", "options", "Lb/p/a/q$a;", "Lb/p/a/x;", "moshi", "<init>", "(Lb/p/a/x;)V", "app_release"}, k = 1, mv = {1, 1, 15})
public final class StatesJsonAdapter extends l<States> {
    private volatile Constructor<States> constructorRef;
    private final l<State> nullableStateAdapter;
    private final q.a options;

    public StatesJsonAdapter(x xVar) {
        i.e(xVar, "moshi");
        q.a a = q.a.a("default", "pressed", "active", "empty", "error", "loading");
        i.d(a, "JsonReader.Options.of(\"d…pty\", \"error\", \"loading\")");
        this.options = a;
        l<State> d = xVar.d(State.class, e.t.q.f7936h, "default");
        i.d(d, "moshi.adapter(State::cla…   emptySet(), \"default\")");
        this.nullableStateAdapter = d;
    }

    public Object a(q qVar) {
        q qVar2 = qVar;
        Class<State> cls = State.class;
        i.e(qVar2, "reader");
        qVar.e();
        State state = null;
        State state2 = null;
        State state3 = null;
        State state4 = null;
        State state5 = null;
        State state6 = null;
        while (qVar.N()) {
            switch (qVar2.m0(this.options)) {
                case -1:
                    qVar.n0();
                    qVar.o0();
                    break;
                case 0:
                    state = this.nullableStateAdapter.a(qVar2);
                    break;
                case 1:
                    state2 = this.nullableStateAdapter.a(qVar2);
                    break;
                case 2:
                    state3 = this.nullableStateAdapter.a(qVar2);
                    break;
                case 3:
                    state4 = this.nullableStateAdapter.a(qVar2);
                    break;
                case 4:
                    state5 = this.nullableStateAdapter.a(qVar2);
                    break;
                case 5:
                    state6 = this.nullableStateAdapter.a(qVar2);
                    break;
            }
        }
        qVar.z();
        Constructor<States> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = States.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, cls, String.class, Integer.TYPE, b.c});
            this.constructorRef = constructor;
            i.d(constructor, "States::class.java.getDe…his.constructorRef = it }");
        }
        States newInstance = constructor.newInstance(new Object[]{state, state2, state3, state4, state5, state6, null, -1, null});
        i.d(newInstance, "localConstructor.newInst…mask0,\n        null\n    )");
        return newInstance;
    }

    public void e(u uVar, Object obj) {
        States states = (States) obj;
        i.e(uVar, "writer");
        Objects.requireNonNull(states, "value was null! Wrap in .nullSafe() to write nullable values.");
        uVar.e();
        uVar.O("default");
        this.nullableStateAdapter.e(uVar, states.a);
        uVar.O("pressed");
        this.nullableStateAdapter.e(uVar, states.f7163b);
        uVar.O("active");
        this.nullableStateAdapter.e(uVar, states.c);
        uVar.O("empty");
        this.nullableStateAdapter.e(uVar, states.d);
        uVar.O("error");
        this.nullableStateAdapter.e(uVar, states.f7164e);
        uVar.O("loading");
        this.nullableStateAdapter.e(uVar, states.f);
        uVar.H();
    }

    public String toString() {
        i.d("GeneratedJsonAdapter(States)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(States)";
    }
}
