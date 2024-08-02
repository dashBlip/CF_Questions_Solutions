package CP_Questions.CodeForces;

import java.util.Arrays;
import java.util.Scanner;


public class CF_PlusMinusSplit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int sum = 0;
            for(int i = 0 ; i<n;i++){
                if(s.charAt(i) == '+'){
                    sum++;
                }
                if(s.charAt(i) == '-'){
                    sum--;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}