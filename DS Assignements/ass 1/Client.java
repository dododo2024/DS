import java.rmi.*;
import java.util.Scanner;
public class Client{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
try{
String serverURL = "rmi://localhost/Server";
ServerInterface serverInterface = (ServerInterface) Naming.lookup(serverURL);
System.out.println("enter num1: ");
double num1 = sc.nextDouble();
System.out.println("enter num2: ");
double num2 = sc.nextDouble();
System.out.println("num1 is : " + num1);
System.out.println("num2 is : " +num2);
System.out.println("---------------RESULTS------------------");
System.out.println("Addition is: "+serverInterface.Addition(num1, num2));
System.out.println("Substraction is: "+serverInterface.Substraction(num1, num2));
System.out.println("Multiplication is: "+serverInterface.Multiplication(num1,
num2));
System.out.println("Division is: "+serverInterface.Division(num1, num2));
}catch(Exception e){
System.out.println("Exception occured at client" + e.getMessage());
}
 }
}
