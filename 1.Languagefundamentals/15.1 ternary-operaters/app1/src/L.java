import java.util.Scanner;
class L
{
    public static void main(String[] args) 
    {
      int i =10;
      int j =20, k = 30;
      int min = 0;
      Scanner scanner = new Scanner(System.in);
      
        
        if(i < j){
           System.out.println(i);
            min = i;
                    }
        else if(i < k){
            min = k;
             System.out.println(i);}
        else if(j < k){
            min = k;
             System.out.println(i);
            }
        else if(k < j){
            min = j;
             System.out.println(i);}
         else{
            System.out.println("no value");      
               }
 System.out.println("Minimum value is" + i);
    }
}
