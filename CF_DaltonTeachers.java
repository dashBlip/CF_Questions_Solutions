package CP_Questions.CodeForces;

import java.util.Scanner;

public class CF_DaltonTeachers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == i+1){

                    count++;
                }
            }
            int operation = (count+1)/2;
            System.out.println(operation);
        }
    }
}
