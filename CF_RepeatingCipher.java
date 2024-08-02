package CP_Questions.CodeForces;

import java.util.Scanner;

public class CF_RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = sc.next();
        String res = "";
        int len = 0;
        for (int i = 0; i < t; i++) {
            res += s.charAt(i);
            i+=len++;
        }
        System.out.println(res);
    }
}
