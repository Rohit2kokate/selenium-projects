package xpathbytext;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class bytext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver web=new ChromeDriver();
		web.get("https://www.flipkart.com");
		web.manage().window().maximize();
		//String s=web.getTitle();
		//System.out.println(s);
		//WebElement element = web.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
		//String text="Home & Furniture";
       // WebElement elements = web.findElement(By.xpath("//*[text()='" + text + "']"));
	    // WebElement elements = web.findElement(By.xpath("//*[text()='Home & Furniture']"));
		//elements.click();
		
		//WebElement e=web.findElement(By.xpath("//*[contains(text(), 'Login')]"));
		//e.click();
		
		//WebElement m=web.findElement(By.xpath("//*[text()='Login']"));
		//m.click();
		
		//WebElement m=web.findElement(By.xpath("//a[@class='_1krdK5 _3jeYYh']"));
		//m.click();
		
		

		
	}

}
