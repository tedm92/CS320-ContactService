import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	public void testContactCreation() {
		Contact contact = new Contact("1", "Tiana", "Edmond", "1234567890", "123 Lane");
		assertEquals("Tiana", contact.getFirstName());
		assertEquals("Edmond", contact.getLastName());
	}
	
	@Test
	public void testInvalidPhone() {
		assertThrows(IllegalArgumentException.class, ()-> {
			new Contact ("1", "ThisNameIsTooLong", "Edmond", "1234567890", "123 Lane");
		});
	}
	@Test
	public void testUpdateContact( ) {
		Contact contact = new Contact("1","Tiana","Edmond", "1234567890", "123 Lane");
		contact.setFirstName("Zendaya");
		assertEquals("Zendaya", contact.getFirstName());
	}
}
