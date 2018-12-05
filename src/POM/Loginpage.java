package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	   //declaration
		private WebElement untb;
		private WebElement pwtb;
		private WebElement logintb;
		
		//initialization

		public LoginPage(WebDriver driver) {
			untb=driver.findElement(By.id("email"));
			pwtb=driver.findElement(By.id("pass"));
			logintb=driver.findElement(By.id("u_0_2"));
		}

		
			
			//utilization
			public void setUsername(String un){
				untb.sendKeys(un);
			}
			public void setPassword(String pw){
				pwtb.sendKeys(pw);
			}public void clickLogin(){
				logintb.click();
			}
}
