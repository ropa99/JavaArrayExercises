package org.javarrayexercises;
import java.util.Scanner;
public class JavaArrayExercise2 {
    public static void main(String[] args) {
        int iArray[]={1,2,3,4,5,6,7};
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number between 1-7: " );
        int iNumber  = scan.nextInt();
        int indexNumber = getIndexOf(iNumber,iArray);
        System.out.println("Index position of number " + iNumber + " is: " + indexNumber + " With old for-loop");
        indexNumber = getIndexOf2(iNumber,iArray);
        System.out.println("Index position of number " + iNumber + " is: " + indexNumber + " with enhanced for-loop");

    }

    public static int getIndexOf(int searchNumber,int searchArray[]){
        int placeInArray = -1;
        for(int i = 0;i < searchArray.length;i++){
            if(searchNumber == searchArray[i]){
                placeInArray = i;
                break;
            }else{
                placeInArray = -1;
            }

        }
        return placeInArray;
    }

    public static int getIndexOf2(int searchNumber,int searchArray[]){
        int index = -1;
        for(int placeInArray : searchArray){
            if(searchNumber == placeInArray){
                index = placeInArray -1;
                break;
            }else{
                index = -1;
            }
        }
        return index;
    }
}
