package org.javarrayexercises;
import java.util.Arrays;
import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class JavaArrayExercise3 {
    public static void main(String[] args) {

        String strArray[] = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("Array before sorting: " +  Arrays.toString(strArray));
        Arrays.sort(strArray,CASE_INSENSITIVE_ORDER);
        System.out.println("Array after sorting: "  +  Arrays.toString(strArray));
    }


}
