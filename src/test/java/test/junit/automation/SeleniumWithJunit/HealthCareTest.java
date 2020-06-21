package test.junit.automation.SeleniumWithJunit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class HealthCareTest extends Base{
	
	@Test
	@Tag("Smoke_test")
	public void fortis(){
		
		System.out.println(Thread.currentThread().getId() + " : " + "fortis()");
		driver.get("https://www.fortishealthcare.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		if(title.equalsIgnoreCase("Top Hospital In India For Medical Health Care Services | Fortis Healthcare"))
			System.out.println("Landed on the fortis page");
		else
			System.out.println("Issue in landing on the fortis page");
	}
	
	@Test
	public void stateFarmTest() {
		
		System.out.println(Thread.currentThread().getId() + " : " + "stateFarmTest()");
		driver.get("https://www.apollohospitals.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		
		if(title.contains("Multispeciality Hospitals in India | Apollo Hospitals for all Your Healthcare Needs"))
			System.out.println("Landed on the Apollo hospitals page");
		else
			System.out.println("Issue in landing on the Apollo hospitals page");
	}
}
