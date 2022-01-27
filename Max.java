public class Max {
    public static void main(String[] args) {
        int[] nums = {87,983,-64 ,34 ,8764};
        int ans = Maximum(nums);
    System.out.println(ans);
        
    }
    static int Maximum(int[] arr)
    {
        if(arr.length==0)
        {
            return -1;
        }
        int max= 0;
        for(int i =0 ; i<arr.length ;i++)
        {
            if(arr[i]>max)
            {
                max= arr[i];
            }


        }
        return max;
    }

}
