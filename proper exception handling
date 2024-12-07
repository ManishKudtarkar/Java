import java.util.Scanner;
class demo
{
  public static void main (String args[])
  {
    Scanner Scan=new Scanner(System.in);
    System.out.println("Enter your Age");
    int age=Scan.nextInt();
    System.out.println("age:-"+age);
    
    if(age<18)
   try{
      throw new LowAgeException();
    }
    catch (Exception e)
    {
      System.out.println(e);
      System.out.println("you are too young to join the army");
      return;
    }
    if(age>25)
    {
      try{
        throw new HighAgeException();
      }
      catch(Exception e)
      {
        System.out.println(e);
          System.out.println("you are overage");
      return;
      }
    }
    System.out.println("you are elligible to join");
  }
}
class LowAgeException extends Exception
{
  
}
class HighAgeException extends Exception
{
  
}
