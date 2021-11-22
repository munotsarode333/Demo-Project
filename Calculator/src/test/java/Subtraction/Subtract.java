package Subtraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import util.HelperMethod;

@Test
public class Subtract {
	WebDriver driver;
	HelperMethod hp;
	String actRes;
	String expRes;
  public void f() {
	  hp.launchBrowser("chrome");
	  hp.openApp("https://www.calculator.net/");
	  
	  hp.clickBtn(By.xpath("//span[contains(text(),'2')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'3')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'4')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'8')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'2')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'3')]"));
	  
	  hp.clickBtn(By.xpath("//span[contains(text(),'–')]"));
	  
	  hp.clickBtn(By.xpath("//span[contains(text(),'–')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'2')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'3')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'0')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'9')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'4')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'8')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'2')]"));
	  hp.clickBtn(By.xpath("//span[contains(text(),'3')]"));
	  actRes=hp.elementText(By.xpath("//div[@id='sciOutPut']"));
	  System.out.println("Answer:"+actRes);
	  expRes="23118306";
	  
	  Assert.assertEquals(actRes, expRes);
  }
  @BeforeTest
  public void setup() {
    hp=new HelperMethod(driver);
  
}
public static By getnumber(int num) {
	return By.xpath("//span[contains(text(),'"+num+"')]");
   }
}