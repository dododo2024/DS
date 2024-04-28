import java.rmi.*;

interface ServerInterface extends Remote{
//syntax for method declaration: access-modifiers return_type method_name(arguments..)
//{return value}
    public double Addition(double num1, double num2) throws RemoteException;
    public double Substraction(double num1, double num2) throws RemoteException;
    public double Multiplication(double num1, double num2) throws RemoteException;
    public double Division(double num1, double num2) throws RemoteException;
}
