import java.util.Scanner;
public class SearchInString {
    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
         System.out.println("Enter Your Name");
         String name = sc.nextLine();
         System.out.println("Enter charcater you want to search");
       char ch = sc.nextLine().charAt(0);
         sc.close();
       System.out.println(checkChar(name, ch));

    }
         static boolean checkChar(String name , char ch)
         {
            for(int i =0 ; i<name.length() ;i++)
            {
               if(name.charAt(i)==ch)
               {
                   return true;
               }
           
            }
            return false;
         
    }
}

