package CP_Questions.CodeForces;

import java.util.Scanner;

class CF_WayTooLongWords {
    static String converter(String s) {
        if (s.length() >= 10) {

            return "" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1);
        } else {
            return s;
        }
    }

    public static void main(String[] args) {
        System.out.println(converter(new Scanner(System.in).next().trim()));
    }

}
