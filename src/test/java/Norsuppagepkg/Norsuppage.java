package Norsuppagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Norsuppage {
	WebDriver driver;
	@FindBy(id="id_auth-username")
	WebElement nusername;
	@FindBy(id="id_auth-password")
	WebElement npassword;
	@FindBy(xpath="/html/body/div/form/button")
    WebElement login;		

public Norsuppage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver,this);
	
}
public void setvalues(String username ,String password)
{
nusername.clear();
nusername.sendKeys(username);
npassword.clear();
npassword.sendKeys(password);
	

}
public void loginclick() {
	login.click();
}}
