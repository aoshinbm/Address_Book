import java.util.ArrayList;
import java.util.Scanner;

public class MultipleBook_UC6 {
    static String address_book;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Address Book you want to add:");
        int num= sc.nextInt();
        for (int i=0;i<num;i++){
            System.out.println("Enter Address Book name");
            address_book=sc.next();
            AddressBook.addAddressBook();
        }
    }
}
