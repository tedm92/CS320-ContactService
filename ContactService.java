import java.util.HashMap;
import java.util.Map;

public class ContactService {
	
	private Map<String, Contact> contacts = new HashMap<>();
	
	public void addContact(Contact contact) {
		if (contact == null || contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact is invalid or ID already exists");
		}
		contacts.put(contact.getContactId(), contact);
	}
	
	public void deleteContact(String contactId) {
		if(!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		contacts.remove(contactId);
	}
	
	public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
		Contact contact = contacts.get(contactID);
		
		if (contact == null) {
			throw new IllegalArgumentException("Contact Id not found");
		}
		
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setPhone(phone);
		contact.setAddress(address);
	}

}
