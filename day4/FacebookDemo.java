package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.name("firstname")).sendKeys("Malik");
		driver.findElement(By.name("lastname")).sendKeys("Mohammed");
		driver.findElement(By.name("reg_email__")).sendKeys("7200075745");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Bnym123");

		//Date
		WebElement dateDD = driver.findElement(By.name("birthday_day"));
		Select date = new Select(dateDD);
		date.selectByIndex(1);

		//Month
		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		Select month = new Select(monthDD);
		month.selectByValue("Mar");

		//year
		WebElement yearDD = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yearDD);
		year.selectByVisibleText("2018");
		
		
	}

}
