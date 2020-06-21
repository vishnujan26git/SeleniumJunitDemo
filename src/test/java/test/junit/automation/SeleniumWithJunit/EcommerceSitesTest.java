package test.junit.automation.SeleniumWithJunit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class EcommerceSitesTest extends Base{
	
	@Test
	@Tag("Smoke_test")
	public void lowesTest(){
		
		System.out.println(Thread.currentThread().getId() + " : " + "lowesTest()");
		driver.get("https://lowes.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		if(title.equalsIgnoreCase("Lowe's Home Improvement"))
			System.out.println("Landed on the lowe's page");
		else
			System.out.println("Issue in landing on the lowe's page");
	}
	
	@Test
	public void targetTest() {
		System.out.println(Thread.currentThread().getId() + " : " + "targetTest()");
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Target : Expect More. Pay Less."))
			System.out.println("Landed on the target page");
		else
			System.out.println("Issue in landing on the target page");
	}
}
