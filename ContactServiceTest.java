import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	@Test
	public void testAddContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("1", "Tiana", "Edmond", "1234567890", "123 Lane");
		
		service.addContact(contact);
		
		assertEquals("Tiana", contact.getFirstName());
	}
	
	@Test
	public void testDuplicateContactId();
	ContactService service = new ContactService();
	Contact contact1 = new Contact("1", "Tiana", "Edmond", "1234567890", "123 Lane");
	Contact contact2 = new Contact("1", "Zendaya", "Coleman", "0987654321", "999 Hollywood");
	
	service.addContact(contact1);
	
	assetThrows(IllegalArgumentException.class, () -> {
		service.addContact(contact2);
		}); 
}

@Test
public void testDeleteContact() {
	ContactService service = new ContactService();
	Contact contact = new Contact ("1", "Tiana", "Edmond", "1234567890", "123 Lane");
	
	service.addContact(contact);
	service.deleteContact("1");
	
	assertThrows(IllegalArgumentException.class, () -> {
		
	});
	
	@Test
	public void testUpdateContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact ("1", "Tiana", "Edmond", "1234567890", "123 Lane");
		
		service.addContact(contact);
		service.updateContact("1","NewName","Last", "9998887777","New Address");
		
		assertEquals("NewName", contact.getFirstName());
		
	}
}
