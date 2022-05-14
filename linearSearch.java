import java.util.Arrays;
import java.util.OptionalInt;

// Searching for element in a data using Linear Serch.
// Using for each loops help searching for the element in the array.

public class linearSearch {

    public static int linearSearching(int[] arra, int item) {
        for(int look : arra) {
            if(look == item) {
                return item;
            }
        }

        return -1;
    }

    // Turing an array into a stream, to filter out data based on a condition you are looking for 

    public static OptionalInt lInteger(int[] arra, int items) {
        return Arrays.stream(arra).filter(x -> x == items).findFirst();
    }
    public static void main(String[] args) {
        int[] arra = {1,3,5,7,9,2,4,6,8,10};
        System.out.println(linearSearching(arra, 1));
        System.out.println(linearSearching(arra, 8));
        System.out.println(linearSearching(arra, 11));
        System.out.println(linearSearching(arra, 3));
        lInteger(arra, 3).ifPresent(System.out::println);
        lInteger(arra, 11).ifPresent(System.out::println);
    }

}