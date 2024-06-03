package pckge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Project {
		    private WebDriver driver;
		    @BeforeTest
		    public void setUp() {
		        // Set up Chrome WebDriver
		    //    System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    }
		    @Test
		    public void login() throws InterruptedException
		    {
		        driver.get("https://dev.sixweek.femmar.com/");
		        //Login 
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/div/div[1]/input")).sendKeys("samily506@yopmail.com");
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/div/div[2]/div/input")).sendKeys("Demo@123");
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/div/button[2]")).click();
		        Thread.sleep(3000);
		        //Dashboard
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div/button[1]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/button[2]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div/button[2]")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/button[2]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div/button[6]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/button[2]")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/div/button[4]")).click();
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/button[2]")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/button")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/button[4]")).click();
		        Thread.sleep(6000);
		     //  Phyto Tracker
		       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/button[2]")).click();
		       Thread.sleep(3000);
		        JavascriptExecutor js3 = (JavascriptExecutor) driver;
		        js3.executeScript("window.scrollBy(0,600)");
		        Thread.sleep(3000);
		       WebElement element= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div/div[1]/div[2]/input"));
		       element.sendKeys("Phyto fix bar");
		       element.sendKeys(Keys.ENTER);
		       Thread.sleep(3000);
		       WebElement element1= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/table/tbody/tr/td[2]/input"));
		       element1.clear();
		       element1.sendKeys("15");
		       element1.sendKeys(Keys.ENTER);
		       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[5]/button")).click();
		       Thread.sleep(3000);
		       JavascriptExecutor js4 = (JavascriptExecutor) driver;
		       js4.executeScript("window.scrollBy(0,5000)");
		       Thread.sleep(9000);
		       //six week
		       driver.get("https://dev.sixweek.femmar.com/SixWk/5");
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[5]/div[1]/button")).click();
		       Thread.sleep(6000);
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[1]/div/button")).click();
		       Thread.sleep(2000);
		       //Account settings
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[3]/div/button[2]")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[4]/div/div/div[3]/input")).sendKeys("ing");
		       JavascriptExecutor js5= (JavascriptExecutor) driver;
		        js5.executeScript("window.scrollBy(0,600)");
		       Thread.sleep(4000);
		       driver.findElement(By.xpath("//*[@id=\"femmar-Femmar Emails\"]")).click();
		       JavascriptExecutor js6= (JavascriptExecutor) driver;
		        js6.executeScript("window.scrollBy(0,600)");
		       Thread.sleep(4000);
		       driver.findElement(By.className("purple-btn")).click();
		       Thread.sleep(4000);
		       driver.get("https://dev.sixweek.femmar.com/DashboardMain");
		       //Logout
		       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/button[2]")).click();
		    

		       
		           	
		    }	  	 
}
