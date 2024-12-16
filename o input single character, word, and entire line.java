import java.util.Scanner;
class inputName{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter your first name:");
String fname=scan.nextLine();
System.out.print("Enter your last name:");
String lname=scan.nextLine();
System.out.print("Enter your city:");
char city=scan.nextLine().charAt(0);
System.out.println("Your first name is:"+fname+"\nlast name:"+lname+"\ncity:"+city);
System.out.println("Enter any sentence:");
String word=scan.next();
System.out.println("word:"+word);
scan.close();
}
}
