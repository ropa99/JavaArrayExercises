package org.javarrayexercises;
import java.util.Arrays;
public class JavaArrayExercise5 {

    public static void main(String[] args) {

        String strArray[][] = new String[2][2];
        strArray[0][0] = "France";
        strArray[1][0] = "Sweden";
        strArray[0][1] = "Paris";
        strArray[1][1] = "Stockholm";

        for(int i=0;i < strArray.length;i++){
            for(int x=0;x < strArray[i].length;x++){
                System.out.print(strArray[i][x] + " ");
            }
            System.out.println("");
        }

    }


}
