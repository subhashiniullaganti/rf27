package feb13;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert1 {
	@Test
	public void createUser() {
		Reporter.log("user created sucessfully",true);
		Assert.fail();
		
	}

	@Test(dependsOnMethods="creatrUser")
	public void deleteeUser() {
		Reporter.log("user deleted sucessfully",true);
		
		
	}
	
	@Test(dependsOnMethods="creatrUser")
	public void editUser() {
		Reporter.log("user edit sucessfully",true);
		
		
	}

}
