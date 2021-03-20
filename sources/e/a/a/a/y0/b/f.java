package e.a.a.a.y0.b;

public enum f {
    CLASS,
    INTERFACE,
    ENUM_CLASS,
    ENUM_ENTRY,
    ANNOTATION_CLASS,
    OBJECT;

    public boolean d() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
