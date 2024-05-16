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

    //Checks the current element with the previous, alters result until last element is checked
    public void isArrayAscending(){
        boolean result=false;
        for (int i=1;i<size;i++){
            if (i==myArray.length-1){
                if(myArray[i-1]<myArray[i]){
                    result=true;
                }
            }else{
                if (myArray[i-1]<myArray[i] && myArray[i]<myArray[i++]){
                    result=true;
                }
            }
        }
        System.out.println(result);;
    }

   //Checks whether next element is smaller than current element,if true immediately returns false 
    public boolean isAscend(){
        for (int i=0; i < size;i++) {
            if (myArray[i] > myArray[i+1]) {
                return false;
            }
        }
        return true;
    }


public static void main (String [] args){
        ArraySort obj1 = new ArraySort();
        obj1.isArrayAscending();

        ArraySort obj2= new ArraySort(4,new int[]{1,2,3,0});
        System.out.println(obj2.isAscend());
    }
}
