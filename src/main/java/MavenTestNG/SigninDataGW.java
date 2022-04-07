package MavenTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SigninDataGW {
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
	public void signin() throws InterruptedException {

	sign.findElement(By.linkText("Sign Up")).click();
	Thread.sleep(2000);

	sign.findElement(By.id("email_input")).sendKeys("chinuprev.sp1@gmail.com");
	sign.findElement(By.id("password_input")).sendKeys("Chinu@1415");
	Thread.sleep(1000);
	sign.findElement(By.id("confirm_password_input")).sendKeys("Chinu@1415");
	Thread.sleep(1000);

	sign.findElement(By.linkText("Sign Up")).click();

	WebElement sel=sign.findElement(By.name("LocaleId"));
	Select selname= new Select(sel);
	selname.selectByVisibleText("Australia");
	Thread.sleep(1000);
	sign.findElement(By.name("Terms")).click();

	sign.findElement(By.cssSelector("#register > form > div > button")).click();
	Thread.sleep(3000);
	System.out.println("SIGNUP ACCOUNT SUCCESSFULLY");

	}
	@Test(priority=2)
	public void signin1() throws InterruptedException {
	sign.findElement(By.linkText("Sign Up")).click();
	Thread.sleep(2000);

	sign.findElement(By.id("email_input")).sendKeys("chinuprev.sp1");
	sign.findElement(By.id("password_input")).sendKeys("Chinu@1415");
	Thread.sleep(1000);
	sign.findElement(By.id("confirm_password_input")).sendKeys("Chinu@1415");
	Thread.sleep(1000);

	sign.findElement(By.linkText("Sign Up")).click();

	WebElement sel=sign.findElement(By.name("LocaleId"));
	Select selname= new Select(sel);
	selname.selectByVisibleText("Australia");
	Thread.sleep(1000);
	sign.findElement(By.name("Terms")).click();

	sign.findElement(By.cssSelector("#register > form > div > button")).click();
	Thread.sleep(3000);
	System.out.println("ENTER MAIL ID CORRECTLY");

	}

	@Test(priority=3)
	public void signin2() throws InterruptedException {
	sign.findElement(By.linkText("Sign Up")).click();
	Thread.sleep(2000);

	sign.findElement(By.id("email_input")).sendKeys("chinuprev.sp1@gmail.com");
	sign.findElement(By.id("password_input")).sendKeys("");
	Thread.sleep(1000);
	sign.findElement(By.id("confirm_password_input")).sendKeys("");
	Thread.sleep(1000);

	sign.findElement(By.linkText("Sign Up")).click();

	WebElement sel=sign.findElement(By.name("LocaleId"));
	Select selname= new Select(sel);
	selname.selectByVisibleText("Australia");
	Thread.sleep(1000);
	sign.findElement(By.name("Terms")).click();

	sign.findElement(By.cssSelector("#register > form > div > button")).click();
	Thread.sleep(3000);
	System.out.println("ENTER PASSWORD");

	}
	@Test(priority=4)
	public void signin3() throws InterruptedException {
	sign.findElement(By.linkText("Sign Up")).click();
	Thread.sleep(2000);

	sign.findElement(By.id("email_input")).sendKeys("");
	sign.findElement(By.id("password_input")).sendKeys("Chinu@1415");
	Thread.sleep(1000);
	sign.findElement(By.id("confirm_password_input")).sendKeys("Ch@1415");
	Thread.sleep(1000);

	sign.findElement(By.linkText("Sign Up")).click();

	WebElement sel=sign.findElement(By.name("LocaleId"));
	Select selname= new Select(sel);
	selname.selectByVisibleText("Australia");
	Thread.sleep(1000);
	sign.findElement(By.name("Terms")).click();

	sign.findElement(By.cssSelector("#register > form > div > button")).click();
	Thread.sleep(3000);
	System.out.println("ENTER MAIL ID");

	}
	@Test(priority=5)
	public void signin4() throws InterruptedException {
	sign.findElement(By.linkText("Sign Up")).click();
	Thread.sleep(2000);

	sign.findElement(By.id("email_input")).sendKeys("chinuprev.sp1@gmail.com");
	sign.findElement(By.id("password_input")).sendKeys("Chi@1415");
	Thread.sleep(1000);
	sign.findElement(By.id("confirm_password_input")).sendKeys("ChiNu@1415");
	Thread.sleep(1000);

	sign.findElement(By.linkText("Sign Up")).click();

	WebElement sel=sign.findElement(By.name("LocaleId"));
	Select selname= new Select(sel);
	selname.selectByVisibleText("Australia");
	Thread.sleep(1000);
	sign.findElement(By.name("Terms")).click();

	sign.findElement(By.cssSelector("#register > form > div > button")).click();
	Thread.sleep(3000);
	System.out.println("PASSWORD MISMATCH");

	}
	@AfterMethod
	public void tearDown() {
	sign.quit();
	}

}
