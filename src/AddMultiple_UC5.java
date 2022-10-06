import java.util.Scanner;

public class AddMultiple_UC5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many contacts you want to add in address book:");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            AddressBook_Operation.addContact();
        }
        System.out.println("Address Book");
        AddressBook_Operation.printContact();
    }
}
