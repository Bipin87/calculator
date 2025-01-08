import java.util.*;


public class Calculator {
     public static void main(String [] args){
          System.out.println("This is a Basic Calculator");
          
          Scanner sc =new Scanner(System.in);
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          

          int result = Addition (num1,num2);
          System.out.println(result);

     }
     public static int Addition (int num1, int num2){
          return num1+num2;
     }
}