package test.junit.parallel;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class InsuranceSitesTest extends Base{
	
	@Test
	public void allstateTest(){
		
		System.out.println(Thread.currentThread().getId() + " : " + "allstateTest()");
		driver.get("https://www.allstate.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		if(title.equalsIgnoreCase("Auto Insurance Quotes - Car Insurance | Allstate Online Quote"))
			System.out.println("Landed on the Allstate page");
		else
			System.out.println("Issue in landing on the Allstate page");
	}
	
	@Test
	@Tag("Smoke_test")
	public void stateFarmTest() {
		
		System.out.println(Thread.currentThread().getId() + " : " + "stateFarmTest()");
		driver.get("https://www.statefarm.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		
		if(title.contains("Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®"))
			System.out.println("Landed on the State Farm page");
		else
			System.out.println("Issue in landing on the State Farm page");
	}
}
