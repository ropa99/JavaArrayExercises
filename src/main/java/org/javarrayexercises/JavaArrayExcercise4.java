package org.javarrayexercises;
import java.util.Arrays;
public class JavaArrayExcercise4 {
    public static void main(String[] args) {
        int iArr[]={1,2,3,4,5};
        int copyiArr[] = Arrays.copyOf(iArr,iArr.length);
        for(int number : copyiArr){
            System.out.println(number);
        }


    }
}
