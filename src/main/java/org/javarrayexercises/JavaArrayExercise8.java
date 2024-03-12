package org.javarrayexercises;
import java.util.Arrays;
public class JavaArrayExercise8 {
    public static void main(String[] args) {
        int iArray[]={20,20,40,20,30,40,50,60,50};
        StringBuffer sbDuplicates = new StringBuffer();
        //int iArrayDuplicates[] = new int[iArray.length];
        int iArrayDuplicates[] = new int[5];
        int i;
        boolean bol;

        //int iNoDuplicate = iArray[0];

        for (i=0; i < iArray.length; i++){
            for (int x =0; x < iArrayDuplicates.length;x++){
                if(iArray[i] == iArrayDuplicates[x]){
                    //check for duplicate in the new array
                    bol = checkDuplicatesArray(iArray[i],iArrayDuplicates);
                    if (!bol){
                        iArrayDuplicates[i] = iArray[i];
                        break;
                    }
                }

            }

        }
        System.out.println("Original Array: " +  Arrays.toString(iArray));

        System.out.println("Odd Array: " + Arrays.toString(iArrayDuplicates));
    }
    public static boolean checkDuplicatesArray(int iArrayValue,int iArray[]){
        boolean value = false;
        //if(iArrayValue < 1) return value;
        for (int i = 0; i < iArray.length; i++) {
            if(iArrayValue == iArray[i]){
                value = true;
                break;
            }else{
                value = false;
            }

        }
        return value;
    }
}
