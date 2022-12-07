import java.util.Scanner;
import java.util.ArrayList;
public class CellphoneMethods {

	private ArrayList<String>contactName=new ArrayList<>();
	private ArrayList<Integer>contactNum=new ArrayList<>();
	public Scanner sc = new Scanner(System.in);
	private String x;
	private int y;
	private int z;
	//private ArrayList<>

	public void addContact() {
		System.out.println("Please type the name of the contact: ");
		x=sc.next();
		sc.nextLine();
		this.getContactName().add(x);
		System.out.println("Please type the number of the contact: ");
		y=sc.nextInt();
		contactNum.add(y);
	}

	public void modifyContact() {
		int z;
		System.out.println("Please type the name of the contact that you wish to modify: ");
		x=sc.next();
		sc.nextLine();
		z=contactName.indexOf(x);
		if(z>=0) {
			System.out.println("Please type the new name: ");
			x=sc.next();
			sc.nextLine();
			contactName.set(z,x);
			System.out.println("Please type the new number of the contact: ");
			y=sc.nextInt();
			contactNum.set(z,y);
		}
		else {
			System.out.println("Contact not found!");
		}

	}

	public void removeContact() {
		System.out.println("Type the name of the contact that you wish to remove: ");
		x=sc.next();
		sc.nextLine();
		z=contactName.indexOf(x);
		if(z>=0) {
			contactName.remove(z);
			System.out.println("Contact removed!");
			contactNum.remove(z);
		}
		else {
			System.out.println("Contact not found!");
		}
	}
	
	public void searchContact() {
		boolean cttExist;
		System.out.println("Enter the name of the contact you wish to search: ");
		x=sc.next();
		sc.nextLine();
		cttExist = contactName.contains(x);
		if(cttExist = true) {
			z=contactName.indexOf(x);
			System.out.println("Contact found!");
			System.out.println(contactName.get(z)+" "+contactNum.get(z));
		}
		
	}
	
	public ArrayList<String> getContactName() {
		return contactName;
	}
	
	public void mainMenu() {
		System.out.println("Select the option you want to execute: ");
		System.out.println("\n");
		System.out.println("1 - Add a new contact.\n2 - Modify a contact.\n3 - Remove a contact.\n4 - Search a contact.\n5 - Exits the program.");
		y=sc.nextInt();
		switch (y) {
		case 1: {
			addContact();
			break;
		}
		case 2:{
			modifyContact();
			break;
		}
		case 3:{
			removeContact();
			break;
		}
		case 4:{
			searchContact();
			break;
		}
		case 5:{
			System.exit(0);
		}
		default:
			System.out.println("Invalid value");
		}
	}
}
