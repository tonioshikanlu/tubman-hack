package b.j.a.a;

public enum m0 {
    TRUE,
    FALSE,
    DEFAULT;

    public Boolean d() {
        if (this == DEFAULT) {
            return null;
        }
        return this == TRUE ? Boolean.TRUE : Boolean.FALSE;
    }
}
