package week3day2assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		//Window setup
		WebDriverManager.chromedriver().setup();
		
		//Controling notification in browser
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//Trigger the Browser
		ChromeDriver driver= new ChromeDriver(options);
		
		//Launch URL
		driver.get("https://www.ajio.com");
		
		//Maximaize the window and enabling implicite wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys(("bags"),Keys.ENTER);
		
		//Trigerring sleep for 3seconds
		Thread.sleep(3000);
		
		//To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(@for,'Fashion')]")).click();
		Thread.sleep(2000);
		
		//Print the count of the items Found.
		String count = driver.findElement(By.xpath("//div[@class='filter']/div[@class='length']")).getText();
		System.out.println("The count of the items Found is "+count);
		
		//Get the list of brand of the products displayed in the page and print the list
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		System.out.println("Brand List size is " +brandList.size());
		for (WebElement brand:brandList)
		{
		System.out.println(brand.getText());
		}
		
		//Get the list of names of the bags and print
		List<WebElement> bagList = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagList.size());
		for (WebElement bag : bagList) 
		{
			System.out.println(bag.getText());
		}
		}
		
		

	}


