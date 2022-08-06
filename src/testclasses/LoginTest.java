package testclasses;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void validateLogin() {

		lp.enterCredentialsAndLogin();
	}

	@Test
	public void validateTitle() {
		lp.getTitleOfPage();
	}

}
