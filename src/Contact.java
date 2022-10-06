import java.util.Scanner;

class Contact {
    String fname;
    String lname;
    String address;
    String city;
    String state;
    int zip;
    int phoneno;
    String email;

    Contact(){
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
    public String toString() {
        return "Address{" +
                "\nFirstName='" + this.fname + '\'' +
                "\nLastName='" + this.lname + '\'' +
                "\nAddress='" + this.address + '\'' +
                "\nCity='" + this.city + '\'' +
                "\nState='" + this.state + '\'' +
                "\nzip='" + this.zip + '\'' +
                "\nemail='" + this.email + '\'' +
                "\nphoneNo='" + this.phoneno + '\'' +
                '}';
    }

/*    void printContact() {
        System.out.println("Firstname: " + this.fname);
        System.out.println("Lastname: " + this.lname);
        System.out.println("Address: " + this.address);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
        System.out.println("Zipcode: " + this.zip);
        System.out.println("Phone number: " + this.phoneno);
        System.out.println("Email: " + this.email);
 */
}
