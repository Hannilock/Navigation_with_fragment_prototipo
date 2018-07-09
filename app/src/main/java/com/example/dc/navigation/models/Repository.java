package com.example.dc.navigation.models;


import java.util.ArrayList;


public class Repository  {

	private static ArrayList<Contact> bdContact = new ArrayList<>();

	public static void add(Contact contact) {
		bdContact.add(contact);
	}

	public static void update(int index, Contact contact) {
		int indexx = 0;
		for (int i = 0; i < bdContact.size(); i++) {
			if (contact.getContactId() == bdContact.get(i).getContactId()){
				indexx = i;
				break;
			}
		}
		bdContact.set(index, contact);
	}

	public static void remove(int contact) {
		bdContact.remove(contact);
	}

	public static Contact find(String contactName) {
		Contact ret = null;
		for (int i = 0; i < bdContact.size(); i++) {
			if (contactName.equals(bdContact.get(i).getFullName())){
				ret = bdContact.get(i);
				break;
			}
		}
		return ret;
	}

	public static ArrayList<Contact> listAll() {
		return bdContact;
	}

	public static ArrayList<String> listAllContactName() {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < bdContact.size(); i++) {
			list.add(bdContact.get(i).getFullName());
		}
		return list;
	}


	public static void loadRepository() {
		Contact a1 = new Contact("1", "Contact1", "23456", "email@email.com", android.R.color.holo_blue_light);
		Contact a2 = new Contact("2", "Contact2", "23456", "email@email.com", android.R.color.holo_blue_light);
		Contact a3 = new Contact("3", "Contact3", "23456", "email@email.com", android.R.color.holo_blue_light);

		bdContact.add(a1);
		bdContact.add(a2);
		bdContact.add(a3);
	}

}
