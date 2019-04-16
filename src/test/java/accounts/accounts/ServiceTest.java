package accounts.accounts;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.*;

public class ServiceTest {
	static Map<Integer, Account> map= new HashMap<Integer, Account>();	 	
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;	
	
	
	
	
	
	
	
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
	
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	
	
	@Test
	public void out() {
	    System.out.print("hello");
	    assertEquals("hello", outContent.toString());
	}
	
	@Test
	public void test1() {		
		
		
		Service service=new Service();
		service.findName("john",map);
		assertEquals(2,service.findName("john",map));
		assertEquals(1,service.findName("dave", map));
		assertEquals(0,service.findName("", map));
		
	}
		
	@Test
	public void test2() {
		Service service=new Service();
		service.findName("john",map);
		assertEquals("2",outContent.toString());
	}
	

}
