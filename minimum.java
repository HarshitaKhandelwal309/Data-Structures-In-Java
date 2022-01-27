

// public class minimum {
//     public static void main(String[] args) {
//     int[] num = {7,9,40,876,0,-987};

//     int min =Integer.MAX_VALUE ;

//     for(int  i = 0 ;i<num.length ;i++)
//     {
//         if(num[i]<min)
//         {
//             min = num[i];
//         }
//     }
//     System.out.println(min);
// }

// }

import java.util.Scanner;
public class minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
System.out.println("Enter Value of array");
        int[] arr =new int[size];

        for(int  i = 0 ; i<size ;i++)
        {
            System.out.println("Enter Value of array"+ i);
               arr[i]= sc.nextInt();
        }

    // int[] num = {7,9,40,876,0,-987};

    int min =Integer.MAX_VALUE ;

    for(int  i = 0 ;i<arr.length ;i++)
    {
        if(arr[i]<min)
        {
            min = arr[i];
        }
    }
    System.out.println(min);
}

}