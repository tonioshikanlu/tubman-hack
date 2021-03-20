package com.onesignal;

import b.o.a2;
import b.o.b3;
import b.o.i2;
import b.o.o1;
import java.util.Objects;

public class OSSubscriptionChangedInternalObserver {
    public void changed(OSSubscriptionState oSSubscriptionState) {
        a2 a2Var = new a2();
        a2Var.f6011b = i2.U;
        a2Var.a = (OSSubscriptionState) oSSubscriptionState.clone();
        if (i2.V == null) {
            i2.V = new o1<>("onOSSubscriptionChanged", true);
        }
        if (i2.V.a(a2Var)) {
            OSSubscriptionState oSSubscriptionState2 = (OSSubscriptionState) oSSubscriptionState.clone();
            i2.U = oSSubscriptionState2;
            Objects.requireNonNull(oSSubscriptionState2);
            String str = b3.a;
            b3.i(str, "ONESIGNAL_SUBSCRIPTION_LAST", oSSubscriptionState2.f7391j);
            b3.h(str, "ONESIGNAL_PLAYER_ID_LAST", oSSubscriptionState2.f7392k);
            b3.h(str, "ONESIGNAL_PUSH_TOKEN_LAST", oSSubscriptionState2.f7393l);
            b3.i(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", oSSubscriptionState2.f7390i);
        }
    }
}
