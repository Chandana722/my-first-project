package automationproject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class airbnb{
	
	WebDriver ab;
	
	@BeforeMethod
	
	public void init() {
		
		ab.get("https://www.airbnb.co.in/");
		
	}
	
	@BeforeTest
	
	public void setup() {
		
		ab=new ChromeDriver();
	}
	@Test
	
	public void test() {
		
    ab.manage().window().maximize();
    
	ab.findElement(By.xpath("//*[@id=\"bigsearch-query-location-input\"]")).sendKeys("Haryana");
	
	WebDriverWait wait=new WebDriverWait(ab,Duration.ofSeconds(25));
	WebElement  se = ab.findElement(By.xpath("//*[@id=\"bigsearch-query-location-suggestion-2\"]/div[2]/div"));
		se.click();
	WebElement checkin = ab.findElement(By.xpath("//*[@id=\"panel--tabs--0\"]/div/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[3]"));
    checkin.click();
    
    WebElement checkout = ab.findElement(By.xpath("//*[@id=\"panel--tabs--0\"]/div/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div/table/tbody/tr[2]/td[2]/div"));
    checkout.click();
    
    ab.findElement(By.xpath("//*[@id=\"search-tabpanel\"]/div/div[5]/div[1]/div[1]/div/div[2]")).click();
    ab.findElement(By.xpath("//*[@id=\"stepper-adults\"]/button[2]/span")).click();
    ab.findElement(By.xpath("//*[@id=\"stepper-adults\"]/button[2]/span")).click();
    ab.findElement(By.xpath("//*[@id=\"stepper-children\"]/button[2]/span")).click();
    ab.findElement(By.cssSelector("#search-tabpanel > div > div.c111bvlt.atm_9s_1txwivl.atm_1eltean_1osqo2v.c1gh7ier.atm_am_1qhqiko.dir.dir-ltr > div.c1ddhymz.atm_h_1h6ojuz.atm_9s_1txwivl.atm_gi_1n1ank9.atm_jb_idpfg4.atm_mk_h2mmj6.atm_vy_10bmcub.cggll98.atm_am_1qhqiko.dir.dir-ltr > div.snd2ne0.atm_am_12336oc.atm_gz_yjp0fh.atm_ll_rdoju8.atm_mk_h2mmj6.atm_wq_qfx8er.dir.dir-ltr > button")).click();
    
    WebDriverWait wt=new WebDriverWait(ab,Duration.ofSeconds(15));
    
    WebElement nextArrow = ab.findElement(By.xpath("/html/body"));
    WebElement prevArrow = ab.findElement(By.xpath("/html/body"));
    Actions actions = new Actions(ab);
      for (int i = 0; i < 2; i++) { 
    	
        actions.moveToElement(nextArrow).click().perform();
        actions.moveToElement(prevArrow).click().perform();
	 }
    
    
    
	}}
