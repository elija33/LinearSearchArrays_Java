import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Aggregatefilter {

    public static int[] findEvenNums(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : arr1) {
            if(num % 2 == 0) {
                result.add(num);
            }
        }
        for(int nums : arr2) {
            if(nums % 2 == 0) {
                result.add(nums);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findEvenNum(int[] arr1, int[] arr2) {
        IntPredicate isEvenPred = num -> num % 2 == 0;
        return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .filter(isEvenPred)
                .toArray();

    }

     public static void main(String[] args) {
         int[] arr1 = {-9,3,4,2,6,4,6,7,12};
         int[] arr2 = {-9,0,14,1,5,8,9,11,10};

         Arrays.stream(findEvenNum(arr1, arr2)).forEach(System.out::println);

         System.out.println();
         
         Arrays.stream(findEvenNums(arr1, arr2)).forEach(System.out::println);
     }
}
