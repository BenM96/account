package accounts.accounts;

import java.util.Map;

public class Service {
	
	public int findName(String name, Map<Integer, Account> map){
		int count=0;
		for(Map.Entry<Integer, Account> entry : map.entrySet()) {
			if (entry.getValue().getFirstName()==name) {
				count++;
				}
			
		}
		
		
		return count;
		
	}
	

}
