package CP_Questions.CodeForces;

import java.util.Scanner;

public class CF_WordCapitalisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a = s.charAt(0);
        if(Character.isUpperCase(a)){
            System.out.println(s);
        }else{
            s = Character.toUpperCase(a)+s.substring(1);
            System.out.println(s);
        }
    }
}
