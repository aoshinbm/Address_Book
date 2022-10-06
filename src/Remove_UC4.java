public class Remove_UC4 {
    public static void main(String[] args) {
        //add multiple contact
        AddressBook_Operation.addContact();
        AddressBook_Operation.addContact();
        //print contact
        AddressBook_Operation.printContact();
        //edit contact
        AddressBook_Operation.removeContact();
        //print contact after changes
        AddressBook_Operation.printContact();
    }
}
