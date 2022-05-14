//if the elements in the array is sorted in ascending order.

public class BinaraySearch_Java {

    public static boolean binarySearch(int[] arr, int numbers) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (numbers == arr[mid]) {
                return true;
            }
            else if (numbers < arr[mid]) {
                max = mid -1;
            }

            else {
                min = mid + 1; 
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 20));
        System.out.println(binarySearch(arr, 15));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 10));
    }
    
}
