public class linearSearch {
    public static void main(String[] args) {
        int[] nums = { 7, 74, 24, 873, 9 };
        int target = 74;
        int ans = linear(nums, target);
        System.out.println(ans);
        int ans2 = linearSearch2(nums, target);
        System.out.println(ans2);
    }

    static int linear(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }

    // if we want to return element 
    static int linearSearch2(int[] arr , int target)
    {
        if (arr.length == 0) {
            return -1;
        }
        for(int i = 0 ; i <arr.length ;i++)
        {
            int element1 = arr[i];
            if(element1==target)
            {
                 return element1;
            }
            
        }   
        return -1;
    }
}