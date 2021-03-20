package b.j.a.c;

import b.j.a.c.a0.b;

public enum h implements b {
    USE_BIG_DECIMAL_FOR_FLOATS(false),
    USE_BIG_INTEGER_FOR_INTS(false),
    USE_LONG_FOR_INTS(false),
    USE_JAVA_ARRAY_FOR_JSON_ARRAY(false),
    FAIL_ON_UNKNOWN_PROPERTIES(true),
    FAIL_ON_NULL_FOR_PRIMITIVES(false),
    FAIL_ON_NUMBERS_FOR_ENUMS(false),
    FAIL_ON_INVALID_SUBTYPE(true),
    FAIL_ON_READING_DUP_TREE_KEY(false),
    FAIL_ON_IGNORED_PROPERTIES(false),
    FAIL_ON_UNRESOLVED_OBJECT_IDS(true),
    FAIL_ON_MISSING_CREATOR_PROPERTIES(false),
    FAIL_ON_NULL_CREATOR_PROPERTIES(false),
    FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY(true),
    FAIL_ON_TRAILING_TOKENS(false),
    WRAP_EXCEPTIONS(true),
    ACCEPT_SINGLE_VALUE_AS_ARRAY(false),
    UNWRAP_SINGLE_VALUE_ARRAYS(false),
    UNWRAP_ROOT_VALUE(false),
    ACCEPT_EMPTY_STRING_AS_NULL_OBJECT(false),
    ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT(false),
    ACCEPT_FLOAT_AS_INT(true),
    READ_ENUMS_USING_TO_STRING(false),
    READ_UNKNOWN_ENUM_VALUES_AS_NULL(false),
    READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE(false),
    READ_DATE_TIMESTAMPS_AS_NANOSECONDS(true),
    ADJUST_DATES_TO_CONTEXT_TIME_ZONE(true),
    EAGER_DESERIALIZER_FETCH(true);
    

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2031h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2032i;

    /* access modifiers changed from: public */
    h(boolean z) {
        this.f2031h = z;
        this.f2032i = 1 << ordinal();
    }

    public boolean d() {
        return this.f2031h;
    }

    public int e() {
        return this.f2032i;
    }

    public boolean h(int i2) {
        return (i2 & this.f2032i) != 0;
    }
}
