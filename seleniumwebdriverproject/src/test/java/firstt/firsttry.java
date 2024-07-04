package firstt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttry {
    public static void main(String[] args) {
        
    	//ChromeDriver ch=new ChromeDriver();
       WebDriver driver = new ChromeDriver();
       driver.get("https://amazon.in/");
       driver.findElement(By.partialLinkText("& Orders")).click();
       driver.findElement(By.id("ap_email")).sendKeys("rohitkokate1163@gmail.com");
       driver.findElement(By.id("ap_password")).sendKeys("R.?B8Rt-dPb!6Xx");
       driver.findElement(By.id("signInSubmit")).click();
    }
}
