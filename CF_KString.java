package CP_Questions.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class CF_KString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("imn sting");
        String str = sc.next();
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            arr[c-'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%k!=0){
                System.out.println("-1");
                return;
            }
            char c = (char)(i+'a');
            result.append(String.valueOf(c).repeat(arr[i]/k));
        }
        for (int i = 0; i < k; i++) {
            System.out.print(result);
        }
    }
}
