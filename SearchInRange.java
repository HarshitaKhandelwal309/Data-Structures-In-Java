public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {4,56,7,32,874, 87, 89,-34};
        int startRange = 3;
        int endRange = 5;

        int target = 4;
        System.out.println(RangeSearch(nums,startRange,endRange, target));
    }

    static boolean RangeSearch(int[] arr , int startRange ,int endRange ,int target)
    {
        for(int i =startRange ; i<= endRange ;i++)
        {
           if(target==arr[i])
           {
               return true;
           }
        }
        return false;
    }



}
