public class searchTarget {
   public static void main(String[] args) {

        int[] nums = {2,4,6,8,43,244,456};
        int target = 987;
           
        System.out.println(search(nums, target));
    }

    static boolean search(int[] arr , int target)
    {
        for(int i =0 ; i<arr.length; i++)
        {
            if(target==arr[i]){
                return true;
            }
           
        }
        return false;
    }
}
