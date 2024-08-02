package CP_Questions.CodeForces;

class CF_SpecialCharacter {
    //
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        CF_Easy a = new CF_Easy();
//        String s = sc.next();
//
//        a.fullCheck(s);
//        System.out.println(a.num);
//    }
//
    int num = 0;

    boolean checkleft(String s, int x) {
        return s.charAt(x) == s.charAt(x - 1);
    }

    boolean checkright(String s, int x) {
        return s.charAt(x) == s.charAt(x + 1);
    }

    void fullCheck(String s) {
        if (checkright(s, 0)) num++;
        if (checkleft(s, s.length() - 1)) num++;
        for (int i = 1; i < s.length() - 1; i++) {
            if (checkleft(s, i) && checkright(s, i)) num++;
        }
    }
}
