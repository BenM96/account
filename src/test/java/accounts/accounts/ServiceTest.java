package accounts.accounts;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;

public class ServiceTest {
	static Map<Integer, Account> map= new HashMap<Integer, Account>();	 	
	
	@BeforeClass
	public static void setup() {		
		   
	    Account account = new Account("john", "smith",1);
	    map.put(account.getAccountNumber(), account);
	    account = new Account("dave", "smith",2);
	    map.put(account.getAccountNumber(), account);
	    account = new Account("john", "do",3);
	    map.put(account.getAccountNumber(), account);
	    account = new Account("frank", "poo",4);
	    map.put(account.getAccountNumber(), account);
	}
	
	
	@Test
	public void test1() {
		Service service=new Service();
		service.findName("john",map);
		assertEquals(2,service.findName("john",map));
		assertEquals(1,service.findName("dave", map));
	}
	

}
