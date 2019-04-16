package accounts.accounts;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class App {
	public static void main(String[] args) {
		
		
		String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
		
		GsonBuilder builder = new GsonBuilder();
		builder.setPrettyPrinting();
		
		Gson gson = builder.create();
		//Account account = gson.fromJson(jsonString, Account.class);
		//System.out.println(account);
		
		//jsonString = gson.toJson(account); 
	    //System.out.println(jsonString); 
	    
	    
	    
	    
	    Map<Integer, Account> map= new HashMap<Integer, Account>();
	    
	    Account account = new Account("john", "smith",1);
	    map.put(1, account);
	    System.out.println(map.get(1));
	    
	    jsonString= gson.toJson(map.get(1));
	    System.out.println(jsonString);
	    
	    
	    
	    
	    
	}

}
