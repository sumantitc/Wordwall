package MavenTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoginDataGW {
	WebDriver sign;
	@BeforeMethod
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant Pandey\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	sign=new ChromeDriver();
	//sign.manage().window().maximize();
	sign.get("https://wordwall.net/");
	Thread.sleep(2000);
	}

	@Test(priority=1)
	public void Logintest() throws InterruptedException {
	sign.findElement(By.id("sign_in_btn")).click();
	Thread.sleep(2000);
	sign.findElement(By.id("Email")).sendKeys("Sumantpandey123@gmail.com");
	Thread.sleep(1000);
	sign.findElement(By.id("Password")).sendKeys("Sumant@123");
	Thread.sleep(2000);
	sign.findElement(By.name("RememberMe")).click();

	sign.findElement(By.cssSelector("#outer_wrapper > div.content-panel.info > form > div:nth-child(6) > div > button")).click();
	Thread.sleep(3000);
	System.out.println("Login Successfull");
	}
	@Test(priority=2)
	public void Logintest1() throws InterruptedException {
	sign.findElement(By.id("sign_in_btn")).click();
	Thread.sleep(2000);
	sign.findElement(By.id("Email")).sendKeys("Sumantpandey13@gmail.com");
	Thread.sleep(1000);
	sign.findElement(By.id("Password")).sendKeys("Sumt@123");
	Thread.sleep(2000);
	sign.findElement(By.name("RememberMe")).click();

	sign.findElement(By.cssSelector("#outer_wrapper > div.content-panel.info > form > div:nth-child(6) > div > button")).click();
	Thread.sleep(3000);
	System.out.println("Invalid email entered & Invalid password entered ");
	}
	@Test(priority=3)
	public void Logintest2() throws InterruptedException {
	sign.findElement(By.id("sign_in_btn")).click();
	Thread.sleep(1000);
	sign.findElement(By.id("Email")).sendKeys("Sumantpandey123@gmail.com");
	Thread.sleep(2000);
	sign.findElement(By.id("Password")).sendKeys("Sum@123");
	Thread.sleep(1000);
	sign.findElement(By.name("RememberMe")).click();

	sign.findElement(By.cssSelector("#outer_wrapper > div.content-panel.info > form > div:nth-child(6) > div > button")).click();
	Thread.sleep(3000);
	System.out.println("Password incorrect");
	}
	@Test(priority=4)
	public void Logintest3() throws InterruptedException {
	sign.findElement(By.id("sign_in_btn")).click();
	Thread.sleep(1000);
	sign.findElement(By.id("Email")).sendKeys("Sumantpa3@gmail.com");
	Thread.sleep(2000);
	sign.findElement(By.id("Password")).sendKeys("Sumant@123");
	Thread.sleep(1000);
	sign.findElement(By.name("RememberMe")).click();

	sign.findElement(By.cssSelector("#outer_wrapper > div.content-panel.info > form > div:nth-child(6) > div > button")).click();
	Thread.sleep(3000);
	System.out.println("Invalid email & correct password");
	}
	@AfterMethod
	public void tearDowv() {
	sign.quit();
	}
}
