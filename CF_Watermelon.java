package CP_Questions.CodeForces;

import java.util.Scanner;

class CF_Watermelon{
    static boolean giveAns(int kilos){
        return ((kilos)%2)==0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        if(giveAns(sc.nextInt())){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}




