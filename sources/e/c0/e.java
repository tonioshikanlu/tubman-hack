package e.c0;

import b.e.a.a.a;

public final class e {
    public static final d a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append("(\\p{Digit}+)");
        sb.append("(\\.)?(");
        sb.append("(\\p{Digit}+)");
        sb.append("?)(");
        a.L(sb, "[eE][+-]?(\\p{Digit}+)", ")?)|", "(\\.(", "(\\p{Digit}+)");
        a.L(sb, ")(", "[eE][+-]?(\\p{Digit}+)", ")?)|", "((");
        sb.append("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))");
        sb.append(")[pP][+-]?");
        sb.append("(\\p{Digit}+)");
        sb.append(')');
        a = new d(a.n("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", sb.toString(), ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
