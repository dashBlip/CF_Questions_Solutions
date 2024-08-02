package CP_Questions.CodeForces;

import java.util.Arrays;

public class CF_WealthiestPerson {
    public static void main(String[] args) {

    }

    static int wealthiestOne(int [][]dataSet){
        int[] person = new int[dataSet.length];


        for (int i = 0; i < dataSet.length; i++) {
            for (int j = 0; j < dataSet[0].length; j++) {
                person[i] += dataSet[i][j];
            }
        }

        Arrays.sort(person);
        return person[person.length - 1];
    }
}
