package com.solidstategroup.bullettrain;

import com.solidstategroup.bullettrain.Flag;

public interface CrudStore<T extends Flag> {
    T create(Flag flag);

    void delete(String str);

    Flag read(String str);

    Flag update(Flag flag);
}
