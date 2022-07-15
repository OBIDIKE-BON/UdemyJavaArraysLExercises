public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] integers = SortedArray.getIntegers(6);
        int[] sortIntegers = SortedArray.sortIntegers(integers);
        SortedArray.printArray(sortIntegers);
        ReverseArray.sortIntegers(integers);
    }
}