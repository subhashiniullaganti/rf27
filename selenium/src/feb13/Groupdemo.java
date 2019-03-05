package feb13;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupdemo {
	

	@Test(groups="d")
	public void createUser() {
		Reporter.log("user created sucessfully",true);
		
		
	}

	@Test(groups="s")
	public void deleteeUser() {
		Reporter.log("user deleted sucessfully",true);
		
		
	}
	
	@Test(groups="m")
	public void editUser() {
		Reporter.log("user edit sucessfully",true);
		
		
	}

}
