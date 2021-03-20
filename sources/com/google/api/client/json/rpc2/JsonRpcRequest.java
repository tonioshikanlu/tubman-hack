package com.google.api.client.json.rpc2;

import b.l.b.a.d.k;
import b.l.b.a.d.n;

public class JsonRpcRequest extends k {
    @n
    private Object id;
    @n
    private final String jsonrpc = "2.0";
    @n
    private String method;
    @n
    private Object params;

    public k clone() {
        return (JsonRpcRequest) super.clone();
    }

    public k set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public Object m17clone() {
        return (JsonRpcRequest) super.clone();
    }
}
