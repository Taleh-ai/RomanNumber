package LeetCodeSolution.RomanClass;

import java.lang.String;

public class RomanClass {
    public static int romanToInt(String s) {
        int toplam = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 <= s.length() - 1) {
                int s1 = romanicevir(s.charAt(i));
                int s2 = romanicevir(s.charAt(i + 1));
                if (s1 >= s2) {
                    toplam = toplam + s1;
                } else {
                    toplam = toplam - s1;
                }
            } else {
                toplam = toplam + romanicevir(s.charAt(i));
            }

        }

        return toplam;
    }

    static int romanicevir(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}
