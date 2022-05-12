package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.edge.EdgeDriver;
public class SeleniumWebDriver{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("pavithra");
		driver.findElement(By.name("lastname")).sendKeys("J");
		driver.findElement(By.name("regmail")).sendKeys("pavima2468@gamil.com");
		driver.findElement(By.name("password")).sendKeys("12345678");  
		
		WebElement date=driver.findElement(By.id("Date"));
		Select d1=new Select(date);
		d1.selectByValue("14");
		
		WebElement month=driver.findElement(By.id("month"));
		Select d2=new Select(month);
		d1.selectByValue("08");
		
		WebElement year=driver.findElement(By.id("year"));
		Select d3=new Select(year);
		d1.selectByValue("1997");
	}
}
