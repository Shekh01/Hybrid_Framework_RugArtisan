package wishListSectionTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import commonBaseData.Base;

public class Checking_wishlist extends Base{
	@Test
	public void Select_Any_Product_Save_Add_Into_WishList_Bucket_Checking_wishlist_Test() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//ul[@class='links']//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sajid.shekh@rugartisan.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sajid01$");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btn-submit']//span[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		WebElement collection = driver.findElement(By.xpath("//a[@class='dropdown-toggle collection']"));
		Actions act = new Actions(driver);
		act.moveToElement(collection).perform();
		Thread.sleep(5000);
		/*driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[7]/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Verve']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@for='cm'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='widthCmRug'])[1]")).sendKeys("350");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='lengthCmRug'])[1]")).sendKeys("400");
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[@class='savewishlist']")).click();
		Thread.sleep(10000);
		WebElement collection1 = driver.findElement(By.xpath("//a[contains(text(),'Collection')]"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(collection1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[7]/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Seventy Eight']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@for='cm'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='widthCmRug'])[1]")).sendKeys("350");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='lengthCmRug'])[1]")).sendKeys("400");
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[@class='savewishlist']")).click();
		Thread.sleep(10000);
		WebElement collection2 = driver.findElement(By.xpath("//a[contains(text(),'Collection')]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(collection2).perform();
		Thread.sleep(5000);
		/*driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[7]/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Talkie']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@for='cm'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='widthCmRug'])[1]")).sendKeys("350");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='lengthCmRug'])[1]")).sendKeys("400");
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[@class='savewishlist']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[7]/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Negative']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@for='cm'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='widthCmRug'])[1]")).sendKeys("350");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='lengthCmRug'])[1]")).sendKeys("400");
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[@class='savewishlist']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/ul/li/div/div[7]/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Jardiniere']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@for='cm'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='widthCmRug'])[1]")).sendKeys("350");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='lengthCmRug'])[1]")).sendKeys("400");
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[@class='savewishlist']")).click();*/
		//driver.findElement(By.xpath("//a[@href='https://qa.rugartisan.co.uk/customer/account/index?page=wishlist']")).click();
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(300);
	}

}
