package com.appfoundry.previewer.model;

import b.e.a.a.a;
import b.p.a.m;
import e.x.c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@m(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u001b\u0010 \u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010R$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/appfoundry/previewer/model/States;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/appfoundry/previewer/model/State;", "e", "Lcom/appfoundry/previewer/model/State;", "getError", "()Lcom/appfoundry/previewer/model/State;", "error", "b", "getPressed", "pressed", "d", "getEmpty", "empty", "f", "getLoading", "loading", "a", "getDefault", "default", "c", "getActive", "active", "g", "Ljava/lang/String;", "getCurrent", "setCurrent", "(Ljava/lang/String;)V", "current", "app_release"}, k = 1, mv = {1, 1, 15})
public final class States {
    public final State a;

    /* renamed from: b  reason: collision with root package name */
    public final State f7163b;
    public final State c;
    public final State d;

    /* renamed from: e  reason: collision with root package name */
    public final State f7164e;
    public final State f;

    /* renamed from: g  reason: collision with root package name */
    public transient String f7165g;

    public States(State state, State state2, State state3, State state4, State state5, State state6, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i2 & 64) != 0 ? null : str;
        this.a = state;
        this.f7163b = state2;
        this.c = state3;
        this.d = state4;
        this.f7164e = state5;
        this.f = state6;
        this.f7165g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof States)) {
            return false;
        }
        States states = (States) obj;
        return i.a(this.a, states.a) && i.a(this.f7163b, states.f7163b) && i.a(this.c, states.c) && i.a(this.d, states.d) && i.a(this.f7164e, states.f7164e) && i.a(this.f, states.f) && i.a(this.f7165g, states.f7165g);
    }

    public int hashCode() {
        State state = this.a;
        int i2 = 0;
        int hashCode = (state != null ? state.hashCode() : 0) * 31;
        State state2 = this.f7163b;
        int hashCode2 = (hashCode + (state2 != null ? state2.hashCode() : 0)) * 31;
        State state3 = this.c;
        int hashCode3 = (hashCode2 + (state3 != null ? state3.hashCode() : 0)) * 31;
        State state4 = this.d;
        int hashCode4 = (hashCode3 + (state4 != null ? state4.hashCode() : 0)) * 31;
        State state5 = this.f7164e;
        int hashCode5 = (hashCode4 + (state5 != null ? state5.hashCode() : 0)) * 31;
        State state6 = this.f;
        int hashCode6 = (hashCode5 + (state6 != null ? state6.hashCode() : 0)) * 31;
        String str = this.f7165g;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode6 + i2;
    }

    public String toString() {
        StringBuilder y = a.y("States(default=");
        y.append(this.a);
        y.append(", pressed=");
        y.append(this.f7163b);
        y.append(", active=");
        y.append(this.c);
        y.append(", empty=");
        y.append(this.d);
        y.append(", error=");
        y.append(this.f7164e);
        y.append(", loading=");
        y.append(this.f);
        y.append(", current=");
        return a.q(y, this.f7165g, ")");
    }
}
