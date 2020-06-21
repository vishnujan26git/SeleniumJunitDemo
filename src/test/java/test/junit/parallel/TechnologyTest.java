package test.junit.parallel;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class TechnologyTest extends Base{
	
	@Test
	public void googleTest(){
		
		System.out.println(Thread.currentThread().getId() + " : " + "googleTest()");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		if(title.equalsIgnoreCase("Google"))
			System.out.println("Landed on the Google page");
		else
			System.out.println("Issue in landing on the Google page");
	}
	
	@Test
	@Tag("Smoke_test")
	public void microsoftTest() {
		
		System.out.println(Thread.currentThread().getId() + " : " + "microsoftTest()");
		driver.get("https://www.microsoft.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		
		if(title.contains("Microsoft - Official Home Page"))
			System.out.println("Landed on the Microsoft page");
		else
			System.out.println("Issue in landing on the Microsoft page");
	}
}
