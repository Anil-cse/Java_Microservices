package com.hibernate.simple;

import java.util.List;
import java.util.Scanner;

import com.hibernate.simple.Dto.Contact;
import com.hibernate.simple.service.ContactService;
import com.hibernate.simple.serviceImpl.ContactServiceImpl;

public class App {
	public static void main(String[] args) {
		ContactService dao = new ContactServiceImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("==================MENU=================");
				System.out.println("1. Create a new user");
				System.out.println("2. See a contact detail by id");
				System.out.println("3. See all the contacts");
				System.out.println("4. Update a contact information");
				System.out.println("5. Delete a contact by id ");
				System.out.println("6. Exit");
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1: {
					System.out.print("Enter the contact id: ");
					int id = sc.nextInt();
					System.out.print("Enter the name: ");
					String name = sc.next();
					System.out.println();
					System.out.print("Enter the email: ");
					String email = sc.next();
					System.out.print("Enter the address: ");
					String address = sc.next();
					System.out.print("Enter the mobile: ");
					String mobile = sc.next();
					Contact contact = new Contact(id, name, email, address, mobile);
					System.out.println("\nAdding the contact.........");
					dao.saveContact(contact);
					System.out.println("User added successfully!");
					break;
				}
				case 2: {
					System.out.print("Enter the userId: ");
					int id = sc.nextInt();
					System.out.println(dao.getContactById(id));
					break;
				}
				case 3: {
					List<Contact> list = dao.getAllContact();
					System.out.println(list);
					break;
				}
				case 4: {
					System.out.println("Enter the contact Id: ");
					int id = sc.nextInt();
					Contact contact = dao.getContactById(id);
					if (contact == null) {
						System.out.println("Sorry! The contact does not exit.");
						break;
					}
					System.out.print("Enter the contact id: ");
					int id1 = sc.nextInt();
					contact.setContactId(id1);
					System.out.print("Enter the name: ");
					String name = sc.next();
					contact.setName(name);
					System.out.println();
					System.out.print("Enter the email: ");
					String email = sc.next();
					contact.setEmail(email);
					System.out.print("Enter the address: ");
					String address = sc.next();
					contact.setAddress(address);
					System.out.print("Enter the mobile number: ");
					String mobile = sc.next();
					contact.setMobile(mobile);
					System.out.println("\nUpdating the user.........");
					dao.updateContact(contact);
					System.out.println("User updated successfully!");
					break;
				}
				case 5: {
					System.out.println("Enter the contact Id: ");
					int id = sc.nextInt();
					dao.deleteContactById(id);;
					System.out.println("User deleted successfully!");
					break;
				}
				case 6:
					System.exit(0);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}