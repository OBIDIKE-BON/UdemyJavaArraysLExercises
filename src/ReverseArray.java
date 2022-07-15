import java.util.Arrays;

public class ReverseArray {
    public static int[] sortIntegers(int[] ints) {
        System.out.println(Arrays.toString(ints));
        int[] reversedArray= new int[ints.length];
        int revIndex=reversedArray.length;
            for (int i = 0; i < ints.length; i++) {
               revIndex--;
               reversedArray[i]=ints[revIndex];
            }
        System.out.println(Arrays.toString(reversedArray));
            return reversedArray;
        }
    }

