import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static ArrayList<AddressBook_Operation> address = new ArrayList<>();

    static void addAddressBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ADDRESS Book name:");
        String book_name = sc.next();
        if (book_name.equalsIgnoreCase(MultipleBook_UC6.address_book)) {
            System.out.println("Address Book already exists");
        } else {
            System.out.println("Address BooK: \n1.ADD Contact\n2.EDIT Contact\n3.DELETE Contact");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("ADD Contact");
                    System.out.println("How many contact is to be added:");
                    int number = sc.nextInt();
                    for (int i = 0; i < number; i++) {
                        AddressBook_Operation.addContact();
                    }
                    System.out.println("--" + book_name + " ADDRESS BOOK");
                    AddressBook_Operation.printContact();
                    break;
                case 2:
                    System.out.println("DELETE Contact");
                    AddressBook_Operation.removeContact();
                    System.out.println("New Updated Address Book after deletion.");
                    AddressBook_Operation.printContact();
                    break;
                case 3:
                    System.out.println("EDIT Contact");
//                AddressBook_Operation.addContact();
                    AddressBook_Operation.editContact();
                    System.out.println("New Updated Address Book after editing.");
                    AddressBook_Operation.printContact();
                default:
                    System.out.println("INVALID......!!!!!");
            }
        }
    }
}
