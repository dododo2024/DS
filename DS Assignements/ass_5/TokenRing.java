import java.util.*;

public class TokenRing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes you want in the ring: ");
        int n = sc.nextInt();
        System.out.println("Ring formed is as below: ");
        for(int i=0; i<n; i++){
        System.out.print(i + " ");
        }
        System.out.println("0");
        int choice= 0;
        do{
                System.out.println("Enter Sender : ");
                int sender = sc.nextInt();

                System.out.println("Enter Receiver : ");
                int receiver = sc.nextInt();

                System.out.println("Enter Data to Sender : ");
                int data = sc.nextInt();
                
                int token = 0;
                System.out.println("Token Passing : ");
                for(int i=token; i<sender; i++){
                System.out.print(" " + i + "-->");
                }
                System.out.println(" " + sender);
                System.out.println("Sender " + sender + " Sending Data " + data);
                for(int i=sender; i!= receiver; i = (i + 1) %n){
                System.out.println("Data: "+ data + " forwerded by: " + i);
                }
                System.out.println("Receiver: " + receiver + " Received the data: " + data);
                token = sender;
                System.out.println("Do you want to send data again? If YES enter 1, If NO enter 0 " );
                choice = sc.nextInt();
        }while(choice == 1);
    }
}
