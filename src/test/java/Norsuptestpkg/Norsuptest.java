package Norsuptestpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Norsuppagepkg.Norsuppage;
import baseclass.Norsupbaseclass;
import utilities.Excelutils;

public class Norsuptest extends Norsupbaseclass {
	@Test
	public void Norlogin() {
		Norsuppage ob=new Norsuppage(driver);
		String xl="C:\\Users\\archa\\Desktop\\Norsuplogin.xlsx";
		String Sheet="Sheet1";
		int rowCount = Excelutils.getRowCount(xl, Sheet);
		for (int i=1;i<=rowCount;i++)

        {

                    String username=Excelutils.getCellValue(xl, Sheet, i, 0);
                       System.out.println("username--"+username);
                    String password=Excelutils.getCellValue(xl, Sheet, i, 1);
                     System.out.println("password---"+password);
                     ob.setvalues(username, password);
                     ob.loginclick();
                     
                     String expectedurl="https://norsup.nuventuretech.com/dashboard/";
                     String actualurl= driver.getCurrentUrl();
         			  
      			     if(actualurl.equals(expectedurl))
      			     {
      			    	System.out.println("pass");
      			    	driver.findElement(By.xpath("//*[@id=\"toggle-sidebar\"]/i")).click();
      			    	driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div[1]/div[2]/div[3]/i")).click();
      			    	WebElement dropdownElement = driver.findElement(By.xpath("/html/body/div/section[1]/aside/div[1]/div[2]/div[3]/ul/li[6]/a"));
      			    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      			    	wait.until(ExpectedConditions.elementToBeClickable(dropdownElement)).click();

						}
      			     else
      			     {
      			    	System.out.println("fail");
      			     }
                     

                    
        }}
        
        	
}
	
		
		


