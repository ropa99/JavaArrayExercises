package org.javarrayexercises;
import java.util.Arrays;
public class JavaArrayExercise7 {
    public static void main(String[] args) {
        int iArray[]={1,2,3,4,5,6,7,8,9,10};
        StringBuffer sbOddNumbers =  new StringBuffer();
        StringBuffer sbEvenNumbers = new StringBuffer();// ;
        int i;
  
        for (i=0; i < iArray.length; i++){
            if((iArray[i] % 2) > 0 ){
                sbOddNumbers.append(Integer.toString(iArray[i]) + " ") ;
            } else{
               sbEvenNumbers.append(Integer.toString(iArray[i]) + " ") ;
            }

        }
        System.out.println("Original Array: " +  Arrays.toString(iArray));
        System.out.println("Even Array: " +  sbEvenNumbers);
        System.out.println("Odd Array: " + sbOddNumbers);
    }
}
