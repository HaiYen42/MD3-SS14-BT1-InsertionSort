import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = input.nextInt();
        int [] arr= new int[size];
        for (int i = 0; i < size-1; i++) {
            arr[i]= (int)(Math.random()*100);
        }
        System.out.println("\nCurrent Array is "+ Arrays.toString(arr));
        new insertionSort().insertionSort(arr);
        System.out.println("\n Array after sort is "+ Arrays.toString(arr));
    }

public int [] insertionSort(int []list){
    for (int i = 1; i < list.length ; i++) {
        System.out.println("Step "+ i+ " has current value is "+ list[i]);
        int currentElement = list[i];
        int k;
        for (k = i-1; k >=0 && list[k]>currentElement; k--) {
            System.out.println("Value of index "+ (k+1) +" from " + list[k+1] + " to "+ list[k] );
            list[k+1]= list[k];
            System.out.println("Temp array is "+ Arrays.toString(list));
        }
        System.out.println("Element of index "+ (k+1)+ "from "+ list[k+1]+ " become "+ currentElement);
        list[k+1]=currentElement;
        System.out.println("Array at end of step "+ i+ " is "+ Arrays.toString(list));
        System.out.println("--------------------------------------------------------");
    }

    return list;
}
}
