package CP_Questions.CodeForces;

import java.util.Scanner;

public class CF_StringTask{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        String str2 = "";
        str = str.toLowerCase();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!='a'&&str.charAt(i)!='u'&&str.charAt(i)!='o'&&str.charAt(i)!='i'&&str.charAt(i)!='e'&&str.charAt(i)!='y'){
                str1+=str.charAt(i);
            }
        }
        System.out.println(str1);
        for(int i = 0 ; i <str1.length();i++){
            str2 += "."+str1.charAt(i);
        }
        System.out.println(str2);
    }
}
