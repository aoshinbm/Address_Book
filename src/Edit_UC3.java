public class Edit_UC3 {
    public static void main(String[] args) {
        //add multiple contact
        AddressBook_Operation.addContact();
        AddressBook_Operation.addContact();
        //print contact
        AddressBook_Operation.printContact();
        //edit contact
        AddressBook_Operation.editContact();
        //print contact after changes
        AddressBook_Operation.printContact();
    }
}
