import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook_Operation {
    static ArrayList<Contact> contact = new ArrayList<>();

    static void addContact() {
        contact.add(new Contact());
    }

    static void printContact() {
        for (Contact contact : contact) {
            System.out.println(contact);
        }
    }

    static void editContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname to edit the contact:");
        String name = sc.next();
        for (Contact c : contact) {
            if (c.fname.equalsIgnoreCase(name)) {
                System.out.println(c.fname);
                System.out.println("What should be changed:");
                System.out.println("1.Firstname\n2.Lastname\n3.Address\n4.City\n5.State\n6.ZIP\n7.Phone Number\n8.EmailId");
                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("Enter new firstname:");
                        String new_fname = sc.next();
                        c.fname = new_fname;
                        break;
                    case 2:
                        System.out.println("Enter new lastname:");
                        String new_lname = sc.next();
                        c.lname = new_lname;
                        break;
                    case 3:
                        System.out.println("Enter new address:");
                        String new_address = sc.next();
                        c.address = new_address;
                        break;
                    case 4:
                        System.out.println("Enter new city:");
                        String new_city = sc.next();
                        c.city = new_city;
                        break;
                    case 5:
                        System.out.println("Enter new state:");
                        String new_state = sc.next();
                        c.state = new_state;
                        break;
                    case 6:
                        System.out.println("Enter new zip:");
                        int new_zip = sc.nextInt();
                        c.zip = new_zip;
                        break;
                    case 7:
                        System.out.println("Enter new phone number:");
                        int new_phoneno = sc.nextInt();
                        c.phoneno = new_phoneno;
                        break;
                    case 8:
                        System.out.println("Enter new email:");
                        String new_email = sc.next();
                        c.email = new_email;
                        break;
                    default:
                        System.out.println("Invalid choice..!!!--------");
                        break;
                }
            }
            /*else {
                System.out.println("NO such contact exist............");
            }

             */
        }
    }

    static void removeContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname to remove the contact:");
        String name = sc.next();
        for (Contact c : contact) {
            if (c.fname.equalsIgnoreCase(name)) {
                contact.remove(c);
                System.out.println("Contact Deleted..");
            }
        }
    }
}