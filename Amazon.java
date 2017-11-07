package goal2017;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Amazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/ravimaddali/Desktop/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		//driver.manage().window().maximize();
		//Input the item to be purchased in the search box
		WebElement x= driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(x);
		x.sendKeys("50 inch LCD tv");
		WebElement y= driver.findElement(By.className("nav-input"));
		y.click();
		Thread.sleep(500);
		// CheckBox  for prime only
		WebElement z= driver.findElement(By.name("s-ref-checkbox-2470955011"));
		z.click();
		Thread.sleep(500);
		//CheckBox for 50 to 59 inches only
		WebElement a = driver.findElement(By.name("s-ref-checkbox-3578042011"));
		a.click();
		Thread.sleep(500);
		//CheckBox for Smart TV
		WebElement b = driver.findElement(By.name("s-ref-checkbox-6928153011"));
		b.click();
		Thread.sleep(500);
		//CheckBox for 1080p
		//WebElement c = driver.findElement(By.name("s-ref-checkbox-7688789011"));
		//c.click();
		
		
			 
	}

}


