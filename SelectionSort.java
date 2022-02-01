import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-34, -78 , 0, -873  };
        selection(arr);
             System.out.println(Arrays.toString(arr));   ;
    }

    static void selection(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            // we will find max element and swap it to its correct index
            int last = arr.length - i - 1;
             int maxIndex = maximum( arr  ,0, last);
             swap(arr, maxIndex,last);
        }
    }

    static int maximum(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max])

            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr , int first ,int second)
    {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }

}
