import java.util.*;
class demo 
 {
   static Scanner scan =new Scanner(System.in);
   public static void  main (String args[])
    {
      for(;;)
      {
       Scanner scan =new Scanner(System.in);
       System.out.println("\n------------------------");
       System.out.println("\npress 0 to exit");
       System.out.println("\npress 1 for bitwise and");
       System.out.println("\npress 2 for bitwise or");
       System.out.println("\npress 3 for bitwise xor");
       System.out.println("\npress 4 for bitwise complement");
       System.out.println("\n------------------------");
       System.out.println("\nEnter your option here");
       int option=scan.nextInt();
       if (option==0)
       {
        System.out.println("\n you are exited");
        break;
       }
       else if(option==1) 
       {
        bitwiseAnd();
       }
       else if(option==2)
       {
         bitwiseOr();
       }
       else if(option==3)
       {
          bitwiseXor();
       }
       else if(option==4)
       {
         bitwiseComple();
       }
       else
       {
        System.out.println("\ninvalid option");
       }
      }
    }
    static void bitwiseAnd()
    {
      System.out.println("\n Enter Number 1:-");
      int num1=scan.nextInt();
       System.out.println("\n Enter Number 2:-");
      int num2=scan.nextInt();
      int result =num1&num2;
      System.out.println("\n"+num1+"="+Integer.toBinaryString(num1));
      System.out.println("\n"+num2+"="+Integer.toBinaryString(num2));
      System.out.println("\n"+result+"="+Integer.toBinaryString(result));
    }
    static void bitwiseOr()
    {
       System.out.println("\n Enter Number 1:-");
      int num1=scan.nextInt();
       System.out.println("\n Enter Number 2:-");
      int num2=scan.nextInt();
      int result =num1|num2;
      System.out.println("\n"+num1+"="+Integer.toBinaryString(num1));
      System.out.println("\n"+num2+"="+Integer.toBinaryString(num2));
      System.out.println("\n"+result+"="+Integer.toBinaryString(result));
    }
    static void bitwiseXor()
    {
       System.out.println("\n Enter Number 1:-");
      int num1=scan.nextInt();
       System.out.println("\n Enter Number 2:-");
      int num2=scan.nextInt();
      int result =num1^num2;
      System.out.println("\n"+num1+"="+Integer.toBinaryString(num1));
      System.out.println("\n"+num2+"="+Integer.toBinaryString(num2));
      System.out.println("\n"+result+"="+Integer.toBinaryString(result));
    }
    static void bitwiseComple()
    {
       System.out.println("\n Enter Number 1:-");
      int num1=scan.nextInt();
      int result = ~num1;
      System.out.println(" -------------");
      System.out.println("\n"+result+"="+Integer.toBinaryString(result));
      System.out.println(" -------------");
    }
 }
