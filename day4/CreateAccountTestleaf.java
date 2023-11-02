package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountTestleaf {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click(); //click on Account tab
		driver.findElement(By.linkText("Create Account")).click(); //Click Create Account
		WebElement accountName = driver.findElement(By.id("accountName"));
		accountName.sendKeys("Akhathu"); //Enter Account name
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester."); //Enter Description

		//Dropdown Industry
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(industryDD);
		industry.selectByIndex(2);

		//Dropdown Ownership
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select ownership = new Select(ownershipDD);
		ownership.selectByVisibleText("S-Corporation");

		//Dropdown Source
		WebElement sourceDD = driver.findElement(By.name("dataSourceId"));
		Select source = new Select(sourceDD);
		source.selectByValue("LEAD_EMPLOYEE");

		//Dropdown MarketingCampaign
		WebElement campaignDD = driver.findElement(By.name("marketingCampaignId"));
		Select campaign = new Select(campaignDD);
		campaign.selectByIndex(6);

		//Dropdown State
		WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(stateDD);
		state.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(accountName);
		
		if(accountName.equals(accountName)) {
			System.out.println("Account Name verified");
		}else {
			System.out.println("Account Name is wrong");
		}
			driver.close();

	}

}
