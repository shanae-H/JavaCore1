package task1;

import java.util.Scanner;

public class ArraySort {
    private int size;
    private int [] myArray;

    ArraySort(){
        size=4;
        myArray= new int[]{1, 2, 9, 4};
    }

    ArraySort(int size, int [] newMyArray){
        this.size=size;
        this.myArray=newMyArray;
    }

   //Checks whether next element is smaller than current element,if true immediately returns false 
    public boolean isAscend(){
        for (int i=0; i < size-1;i++) {
            if (myArray[i] > myArray[i+1]) {
                return false;
            }
        }
        return true;
    }

public static void main (String [] args){
        Scanner in =new Scanner (System.in);
        System.out.println("Enter size of array");
        int arrSize=in.nextInt();
        System.out.println("Enter elements of the array ");
        int [] newArray= new int [arrSize];
        for(int i=0;i<arrSize;i++){
            newArray[i]=in.nextInt();
        }
        in.close();

        ArraySort obj2 = new ArraySort(arrSize,newArray);
        System.out.println(obj2.isAscend());
    }
}
