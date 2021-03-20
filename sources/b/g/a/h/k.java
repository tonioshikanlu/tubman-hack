package b.g.a.h;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import b.g.a.g.e;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class k {
    public static final Integer a = 60;

    public void a(@NonNull e eVar, @NonNull j jVar) {
        r rVar = jVar.c;
        Objects.requireNonNull(rVar);
        String str = eVar.f418i.get("alg");
        String[] split = eVar.f417h.split("\\.");
        if (rVar.a.contains(str)) {
            rVar.a(split);
            if (TextUtils.isEmpty(eVar.f419j.a)) {
                throw new t("Issuer (iss) claim must be a string present in the ID token");
            } else if (!eVar.f419j.a.equals(jVar.a)) {
                throw new t(String.format("Issuer (iss) claim mismatch in the ID token, expected \"%s\", found \"%s\"", new Object[]{jVar.a, eVar.f419j.a}));
            } else if (!TextUtils.isEmpty(eVar.f419j.f420b)) {
                List<String> list = eVar.f419j.f421e;
                if (list == null || list.isEmpty()) {
                    throw new t("Audience (aud) claim must be a string or array of strings present in the ID token");
                } else if (list.contains(jVar.f432b)) {
                    Calendar instance = Calendar.getInstance();
                    Date date = jVar.f434g;
                    if (date == null) {
                        date = instance.getTime();
                    }
                    Integer num = jVar.f;
                    if (num == null) {
                        num = a;
                    }
                    int intValue = num.intValue();
                    Date date2 = eVar.f419j.c;
                    if (date2 != null) {
                        instance.setTime(date2);
                        instance.add(13, intValue);
                        Date time = instance.getTime();
                        if (date.after(time)) {
                            throw new t(String.format("Expiration Time (exp) claim error in the ID token; current time (%d) is after expiration time (%d)", new Object[]{Long.valueOf(date.getTime() / 1000), Long.valueOf(time.getTime() / 1000)}));
                        } else if (eVar.f419j.d != null) {
                            if (jVar.d != null) {
                                String b2 = eVar.b("nonce").b();
                                if (TextUtils.isEmpty(b2)) {
                                    throw new t("Nonce (nonce) claim must be a string present in the ID token");
                                } else if (!jVar.d.equals(b2)) {
                                    throw new t(String.format("Nonce (nonce) claim mismatch in the ID token; expected \"%s\", found \"%s\"", new Object[]{jVar.d, b2}));
                                }
                            }
                            if (list.size() > 1) {
                                String b3 = eVar.b("azp").b();
                                if (TextUtils.isEmpty(b3)) {
                                    throw new t("Authorized Party (azp) claim must be a string present in the ID token when Audience (aud) claim has multiple values");
                                } else if (!jVar.f432b.equals(b3)) {
                                    throw new t(String.format("Authorized Party (azp) claim mismatch in the ID token; expected \"%s\", found \"%s\"", new Object[]{jVar.f432b, b3}));
                                }
                            }
                            if (jVar.f433e != null) {
                                Date a2 = eVar.b("auth_time").a();
                                if (a2 != null) {
                                    instance.setTime(a2);
                                    instance.add(13, jVar.f433e.intValue());
                                    instance.add(13, intValue);
                                    Date time2 = instance.getTime();
                                    if (date.after(time2)) {
                                        throw new t(String.format("Authentication Time (auth_time) claim in the ID token indicates that too much time has passed since the last end-user authentication. Current time (%d) is after last auth at (%d)", new Object[]{Long.valueOf(date.getTime() / 1000), Long.valueOf(time2.getTime() / 1000)}));
                                    }
                                    return;
                                }
                                throw new t("Authentication Time (auth_time) claim must be a number present in the ID token when Max Age (max_age) is specified");
                            }
                        } else {
                            throw new t("Issued At (iat) claim must be a number present in the ID token");
                        }
                    } else {
                        throw new t("Expiration Time (exp) claim must be a number present in the ID token");
                    }
                } else {
                    throw new t(String.format("Audience (aud) claim mismatch in the ID token; expected \"%s\" but was not one of \"%s\"", new Object[]{jVar.f432b, eVar.f419j.f421e}));
                }
            } else {
                throw new t("Subject (sub) claim must be a string present in the ID token");
            }
        } else {
            throw new t(String.format("Signature algorithm of \"%s\" is not supported. Expected the ID token to be signed with any of %s.", new Object[]{str, rVar.a}));
        }
    }
}
