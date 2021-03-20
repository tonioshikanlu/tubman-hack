package com.segment.analytics;

import android.content.Context;
import b.e.a.a.a;
import com.segment.analytics.ValueMap;
import com.segment.analytics.internal.Utils;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class Traits extends ValueMap {
    private static final String ADDRESS_KEY = "address";
    private static final String AGE_KEY = "age";
    private static final String ANONYMOUS_ID_KEY = "anonymousId";
    private static final String AVATAR_KEY = "avatar";
    private static final String BIRTHDAY_KEY = "birthday";
    private static final String CREATED_AT_KEY = "createdAt";
    private static final String DESCRIPTION_KEY = "description";
    private static final String EMAIL_KEY = "email";
    private static final String EMPLOYEES_KEY = "employees";
    private static final String FAX_KEY = "fax";
    private static final String FIRST_NAME_KEY = "firstName";
    private static final String GENDER_KEY = "gender";
    private static final String INDUSTRY_KEY = "industry";
    private static final String LAST_NAME_KEY = "lastName";
    private static final String NAME_KEY = "name";
    private static final String PHONE_KEY = "phone";
    private static final String TITLE_KEY = "title";
    private static final String USERNAME_KEY = "username";
    private static final String USER_ID_KEY = "userId";
    private static final String WEBSITE_KEY = "website";

    public static class Address extends ValueMap {
        private static final String ADDRESS_CITY_KEY = "city";
        private static final String ADDRESS_COUNTRY_KEY = "country";
        private static final String ADDRESS_POSTAL_CODE_KEY = "postalCode";
        private static final String ADDRESS_STATE_KEY = "state";
        private static final String ADDRESS_STREET_KEY = "street";

        public Address() {
        }

        public Address(Map<String, Object> map) {
            super(map);
        }

        public String city() {
            return getString("city");
        }

        public String country() {
            return getString("country");
        }

        public String postalCode() {
            return getString(ADDRESS_POSTAL_CODE_KEY);
        }

        public Address putCity(String str) {
            return putValue("city", (Object) str);
        }

        public Address putCountry(String str) {
            return putValue("country", (Object) str);
        }

        public Address putPostalCode(String str) {
            return putValue(ADDRESS_POSTAL_CODE_KEY, (Object) str);
        }

        public Address putState(String str) {
            return putValue(ADDRESS_STATE_KEY, (Object) str);
        }

        public Address putStreet(String str) {
            return putValue(ADDRESS_STREET_KEY, (Object) str);
        }

        public Address putValue(String str, Object obj) {
            super.putValue(str, obj);
            return this;
        }

        public String state() {
            return getString(ADDRESS_STATE_KEY);
        }

        public String street() {
            return getString(ADDRESS_STREET_KEY);
        }
    }

    public static class Cache extends ValueMap.Cache<Traits> {
        private static final String TRAITS_CACHE_PREFIX = "traits-";

        public Cache(Context context, Cartographer cartographer, String str) {
            super(context, cartographer, a.m(TRAITS_CACHE_PREFIX, str), str, Traits.class);
        }

        public Traits create(Map<String, Object> map) {
            return new Traits((Map<String, Object>) new Utils.NullableConcurrentHashMap(map));
        }
    }

    public Traits() {
    }

    public Traits(int i2) {
        super(i2);
    }

    public Traits(Map<String, Object> map) {
        super(map);
    }

    public static Traits create() {
        Traits traits = new Traits((Map<String, Object>) new Utils.NullableConcurrentHashMap());
        traits.putAnonymousId(UUID.randomUUID().toString());
        return traits;
    }

    public Address address() {
        return (Address) getValueMap(ADDRESS_KEY, Address.class);
    }

    public int age() {
        return getInt(AGE_KEY, 0);
    }

    public String anonymousId() {
        return getString("anonymousId");
    }

    public String avatar() {
        return getString(AVATAR_KEY);
    }

    public Date birthday() {
        try {
            String string = getString(BIRTHDAY_KEY);
            if (Utils.isNullOrEmpty((CharSequence) string)) {
                return null;
            }
            return Utils.toISO8601Date(string);
        } catch (ParseException unused) {
            return null;
        }
    }

    public String createdAt() {
        return getString(CREATED_AT_KEY);
    }

    public String currentId() {
        String userId = userId();
        return Utils.isNullOrEmpty((CharSequence) userId) ? anonymousId() : userId;
    }

    public String description() {
        return getString(DESCRIPTION_KEY);
    }

    public String email() {
        return getString("email");
    }

    public long employees() {
        return getLong(EMPLOYEES_KEY, 0);
    }

    public String fax() {
        return getString(FAX_KEY);
    }

    public String firstName() {
        return getString(FIRST_NAME_KEY);
    }

    public String gender() {
        return getString(GENDER_KEY);
    }

    public String industry() {
        return getString(INDUSTRY_KEY);
    }

    public String lastName() {
        return getString(LAST_NAME_KEY);
    }

    public String name() {
        String string = getString("name");
        if (Utils.isNullOrEmpty((CharSequence) string) && Utils.isNullOrEmpty((CharSequence) firstName()) && Utils.isNullOrEmpty((CharSequence) lastName())) {
            return null;
        }
        if (!Utils.isNullOrEmpty((CharSequence) string)) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        String firstName = firstName();
        boolean z = false;
        if (!Utils.isNullOrEmpty((CharSequence) firstName)) {
            z = true;
            sb.append(firstName);
        }
        String lastName = lastName();
        if (!Utils.isNullOrEmpty((CharSequence) lastName)) {
            if (z) {
                sb.append(' ');
            }
            sb.append(lastName);
        }
        return sb.toString();
    }

    public String phone() {
        return getString(PHONE_KEY);
    }

    public Traits putAddress(Address address) {
        return putValue(ADDRESS_KEY, (Object) address);
    }

    public Traits putAge(int i2) {
        return putValue(AGE_KEY, (Object) Integer.valueOf(i2));
    }

    public Traits putAnonymousId(String str) {
        return putValue("anonymousId", (Object) str);
    }

    public Traits putAvatar(String str) {
        return putValue(AVATAR_KEY, (Object) str);
    }

    public Traits putBirthday(Date date) {
        return putValue(BIRTHDAY_KEY, (Object) Utils.toISO8601Date(date));
    }

    public Traits putCreatedAt(String str) {
        return putValue(CREATED_AT_KEY, (Object) str);
    }

    public Traits putDescription(String str) {
        return putValue(DESCRIPTION_KEY, (Object) str);
    }

    public Traits putEmail(String str) {
        return putValue("email", (Object) str);
    }

    public Traits putEmployees(long j2) {
        return putValue(EMPLOYEES_KEY, (Object) Long.valueOf(j2));
    }

    public Traits putFax(String str) {
        return putValue(FAX_KEY, (Object) str);
    }

    public Traits putFirstName(String str) {
        return putValue(FIRST_NAME_KEY, (Object) str);
    }

    public Traits putGender(String str) {
        return putValue(GENDER_KEY, (Object) str);
    }

    public Traits putIndustry(String str) {
        return putValue(INDUSTRY_KEY, (Object) str);
    }

    public Traits putLastName(String str) {
        return putValue(LAST_NAME_KEY, (Object) str);
    }

    public Traits putName(String str) {
        return putValue("name", (Object) str);
    }

    public Traits putPhone(String str) {
        return putValue(PHONE_KEY, (Object) str);
    }

    public Traits putTitle(String str) {
        return putValue(TITLE_KEY, (Object) str);
    }

    public Traits putUserId(String str) {
        return putValue("userId", (Object) str);
    }

    public Traits putUsername(String str) {
        return putValue(USERNAME_KEY, (Object) str);
    }

    public Traits putValue(String str, Object obj) {
        super.putValue(str, obj);
        return this;
    }

    public Traits putWebsite(String str) {
        return putValue(WEBSITE_KEY, (Object) str);
    }

    public String title() {
        return getString(TITLE_KEY);
    }

    public Traits unmodifiableCopy() {
        return new Traits((Map<String, Object>) Collections.unmodifiableMap(new LinkedHashMap(this)));
    }

    public String userId() {
        return getString("userId");
    }

    public String username() {
        return getString(USERNAME_KEY);
    }

    public String website() {
        return getString(WEBSITE_KEY);
    }
}
