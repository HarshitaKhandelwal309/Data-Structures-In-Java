

public class binarySearch { 
    public static void main(String[] args) {
        int[] nums ={2,4,7,8,76,90,109,234};
        int target = 90;
        int  ans = binary(nums , target);
        System.out.println(ans);
    }

 
    //return the index
    static int binary(int[] arr,int target)
    {
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            //find middle 
           
            // int middle = (start+end)/2;//if the value is large then it will eexceed limit of integer
            //try tis way
            int middle = start+(end-start)/2;

            //check coditions
             if(target<arr[middle])
             {
                 //lies on left side
                 end= middle-1;


             }
             else if( target>arr[middle])
             {
                 start = middle+1;
             }
             else{
                 return middle;
             }
        }
        return -1;
    }
}
