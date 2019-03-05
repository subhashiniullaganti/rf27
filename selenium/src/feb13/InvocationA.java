package feb13;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationA {
	@Test(invocationCount=2)
	public void createUser() {
		Reporter.log("user created sucessfully",true);
		
		
	}

	@Test(priority=2)
	public void deleteeUser() {
		Reporter.log("user deleted sucessfully",true);
		
		
	}
	
	@Test(priority=1,invocationCount=2)
	public void editUser() {
		Reporter.log("user edit sucessfully",true);
		
		
	}
}

