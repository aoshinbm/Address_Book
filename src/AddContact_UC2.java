import java.util.Scanner;

public class AddContact_UC2 {
    String fname;
    String lname;
    String address;
    String city;
    String state;
    int zip;
    int phoneno;
    String email;

    //    Contact_UC1(String fname, String lname, String address, String city, String state, int zip, int phoneno, String email) {
    AddContact_UC2(){
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneno = phoneno;
        this.email = email;
    }
    void Contact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname: ");
        this.fname = sc.next();
        System.out.println("Enter lastname: ");
        this.lname = sc.next();
        System.out.println("Enter address: ");
        this.address = sc.next();
        System.out.println("Enter city: ");
        this.city = sc.next();
        System.out.println("Enter state: ");
        this.state = sc.next();
        System.out.println("Enter zip: ");
        this.zip = sc.nextInt();
        System.out.println("Enter phone number: ");
        this.phoneno = sc.nextInt();
        System.out.println("Enter email: ");
        this.email = sc.next();
    }
    void printContact() {
        System.out.println("ADDRESS BOOK");
        System.out.println("Firstname: " + this.fname);
        System.out.println("Lastname: " + this.lname);
        System.out.println("Address: " + this.address);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Zipcode: " + this.zip);
        System.out.println("Phone number: " + this.phoneno);
        System.out.println("Email: " + this.email);
    }

    public static void main(String[] args) {
        System.out.println("ADD Contacts in Address Book");

        AddContact_UC2 add=new AddContact_UC2();
        //add multiple contacts
        add.Contact();
        add.Contact();
        add.Contact();

        //print
        add.printContact();
    }
}
