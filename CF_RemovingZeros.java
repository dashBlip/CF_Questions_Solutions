package CP_Questions.CodeForces;

import java.util.Scanner;

class CF_RemovingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int k =0;k<t;k++){
            String s = sc.nextLine();
            int pos1 =0;
            int pos2= 0;
            int c =  0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    pos1 = i;
                    break;
                }
            }
            for(int i = s.length()-1;i>=0;i--){
                if(s.charAt(i)=='1'){
                    pos2 =i;
                    break;
                }
            }
            for(int i = pos1;i<pos2;i++){
                if(s.charAt(i)=='0'){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
