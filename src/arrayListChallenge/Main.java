package arrayListChallenge;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("003 330 5698");
	public static void main(String[] args) {
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit){
			System.out.println("\nEnter action :(6 toshow available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action){
			case 0:
				System.out.println("\nShutting down....");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			}
		}
	}
		/*private static void printContacts(){
			mobilePhone.printContacts();
			
	} */
	
	private static void addNewContact(){
		System.out.println("Enter new Contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phone = scanner.nextLine();
		Contact newContact = Contact.createContact(name, phone);
		if(mobilePhone.addNewContact(newContact)){
			System.out.println("New contact added: name =" + name + "Phone = " +phone);
		}else{
			System.out.println("Cannot add, " + name + "already added");
		}
		
	}
	
	private static void updateContact(){
		System.out.println("Enter existing Contact name :");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord==null){
			System.out.println("Contact not Found");
			return;
		}
		System.out.println("Enter new Contact name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter new Contact phoneNumber");
		String newNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		if(mobilePhone.updateContact(existingContactRecord, newContact)){
			System.out.println("Successfully updated record");
		}else {
			System.out.println("Error updating record");
		}
	}
	
	private static void removeContact(){
		System.out.println("Enter existing Contact name :");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord==null){
			System.out.println("Contact not Found");
			return;
		}
		if(mobilePhone.removeContact(existingContactRecord)){
			System.out.println("Successfully deleted");
		}else{
			System.out.println("Error deleting record");
		}
	
	}
	
	
	private static void queryContact(){
		System.out.println("Enter existing Contact name :");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if(existingContactRecord==null){
			System.out.println("Contact not Found");
			return;
		}
		System.out.println("Name: " + existingContactRecord.getName()+ "phone number is" + existingContactRecord.getPhoneNumber());
	}

	
	private static void startPhone(){
		System.out.println("starting Phone.......");
	}
	private static void printActions(){
		System.out.println("\nAvailable actions:\npress");
		System.out.println("0 -toshutdown\n" +
						   "1 -to print contacts\n"+
						   "2 -to add a new contact\n"+
						   "3 -to update existing an exting contact\n"+
						   "4 -to remove an existing contact\n"+
						   "5 -query if an existing contact exists"+
						   "6 -to print a list of available actions");
		System.out.println("Choose your actions: ");
	}
}
