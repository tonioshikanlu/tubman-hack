package com.solidstategroup.bullettrain;

import com.solidstategroup.bullettrain.Flag;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryStore<T extends Flag> implements CrudStore<T> {
    private final Map<String, Flag> data = new ConcurrentHashMap();

    public synchronized T create(Flag flag) {
        return null;
    }

    public synchronized void delete(String str) {
    }

    public synchronized Flag read(String str) {
        return null;
    }

    public synchronized Flag update(Flag flag) {
        return null;
    }
}
