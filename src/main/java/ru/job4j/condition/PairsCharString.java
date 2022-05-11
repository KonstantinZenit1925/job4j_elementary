package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l == null && r == null) {
            return true;
        } else if ((l.isEmpty() && r.isEmpty()) || (l.charAt(0) == r.charAt(r.length() - 1) && (r.charAt(r.length() - 1) == l.charAt(0)))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean rsl = PairsCharString.check("sex", "xis");
        System.out.println(rsl);
        boolean rsl1 = PairsCharString.check("uio", "ujk");
        System.out.println(rsl1);
    }
}