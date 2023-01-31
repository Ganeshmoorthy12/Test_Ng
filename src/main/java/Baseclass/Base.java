package Baseclass;

import org.testng.annotations.Test;

public class Base {
	
	@Test(priority = 2)
	public static void name() {
		System.out.println("Ganesh");
		}
	
	@Test(priority = 1)
	private void friendname() {
		System.out.println("Manoj");

	}

}
