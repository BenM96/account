package accounts.accounts;

import org.junit.Test;

public class ServiceTest {
	
	@Test
	public void test1() {
		Service service=new Service();
		service.findName("john");
		assert.equals(0,service.findName("john"));
	}
	

}
