package org.javarrayexercises;

public class JavaArrayExcercise6 {
    public static void main(String[] args) {
        int iArray[] = {43,5,23,17,2,14};
        double averageSum=0;
        for(int i =0;i < iArray.length;i++){
            averageSum += iArray[i];// iArray.length;

        }

        System.out.println("Average: " + Double.toString(averageSum / iArray.length));
    }
}
