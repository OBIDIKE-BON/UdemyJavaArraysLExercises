import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    private static final Scanner scanner= new Scanner(System.in);

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        System.out.println("enter " + size + " integers. \r");
        for (int i=0;i<array.length;i++ ) {
            array[i]=scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        boolean flag=true;
        int temp;
        while (flag) {
            flag=false;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i]<unsortedArray[i+1]){
                    temp=unsortedArray[i+1];
                    unsortedArray[i+1]=unsortedArray[i];
                    unsortedArray[i]=temp;
                    flag=true;
                }
            }
        }
        return unsortedArray;
    }
    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element " + i +" contents " + array[i]);
        }
    }
}
