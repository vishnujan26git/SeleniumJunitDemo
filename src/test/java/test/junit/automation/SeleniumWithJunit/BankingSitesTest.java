package test.junit.automation.SeleniumWithJunit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
@Tag("Smoke_test")
public class BankingSitesTest extends Base{

	@Test
	public void wellsTest(){
		
		System.out.println(Thread.currentThread().getId() + " : " + "wellsTest()");
		driver.get("https://www.wellsfargo.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		if(title.equalsIgnoreCase("Wells Fargo – Banking, Credit Cards, Loans, Mortgages & More"))
			System.out.println("Landed on the Wells page");
		else
			System.out.println("Issue in landing on the wells page");
	}
	
	@Test
	public void morganStanleyTest() {
		System.out.println(Thread.currentThread().getId() + " : " + "morganStanleyTest()");
		driver.get("https://www.morganstanley.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Morgan Stanley | Global Leader in Financial Services"))
			System.out.println("Landed on the Morgan Stanley page");
		else
			System.out.println("Issue in landing on the Morgan Stanley page");
	}
}
