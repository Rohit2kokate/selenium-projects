package firstt;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class secound {
	 public static void main(String[] args) {
		 WebDriver drive=new ChromeDriver();
		 drive.get("https://www.flipkart.com");
		 drive.manage().window().maximize();
		 boolean a=drive.findElement(By.id("container")).isDisplayed();
		 System.out.println(a);
		// drive.quit();
		/* 
		 String s=drive.getTitle();
		 System.out.println(s);
		 
		 boolean b=drive.findElement(By.className("_2NhoPJ")).isDisplayed();
		 System.out.println(b);
		 
		 boolean c=drive.findElement(By.linkText("Best of Electronics")).isDisplayed();
		 System.out.println(c);
		 
		
		 
		 List <WebElement> w=drive.findElements(By.tagName("a"));
		 
		 List <WebElement> m=drive.findElements(By.tagName("div"));
		 System.out.println("Tag of div "+m.size());
		 System.out.print("Tag of a "+w.size());
		 
		/// drive.findElements(By.className("3n8fnawo _3n8fnaoj _3n8fnagd _3n8fna1 _3n8fna87 _1i2djtb9 _1i2djt0 _1i2djtil _1i2djtl6")).click();
		///drive.findElement(By.partialLinkText("Best Truewireless ")).click();*/
		 
		// drive.findElement(By.cssSelector("uiU-ZX")).click();
	 }
}
