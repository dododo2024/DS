import java.rmi.*;
import java.rmi.server.*;
public class ServerImplementation extends UnicastRemoteObject
implements ServerInterface{
public ServerImplementation() throws RemoteException{
}
public double Addition(double num1, double num2) throws RemoteException{
return num1 + num2;
}
public double Substraction(double num1, double num2) throws RemoteException{
return num1 - num2;
}
public double Multiplication(double num1, double num2) throws RemoteException{
return num1 * num2;
}
public double Division(double num1, double num2) throws RemoteException{
if (num2 != 0){
return num1 / num2;
}
else{
System.out.println("Cannot divide a number by zero: ");
}
return num1/num2;
}
}
