package homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskN1 {
    public static void main(String[] args) {
        //Open chrome browser
        //Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
        //fill in the complete form
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
       WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
       firstName.sendKeys("Veronica");
       WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
lastName.sendKeys("Burlacu");
WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
email.sendKeys("veronica36890@gmail.com");
WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
phone.sendKeys("87645609808");
WebElement adress=driver.findElement(By.xpath("//input[@name='address']"));
adress.sendKeys("134 Palatine Road");
WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
city.sendKeys("Palatine");
WebElement state=driver.findElement(By.xpath("//option[text()='Illinois']"));
state.click();
WebElement zipCode=driver.findElement(By.xpath("//input[@name='zip']"));
zipCode.sendKeys("12890");
WebElement a=driver.findElement(By.xpath("//input[@name='website']"));
a.sendKeys("www.google.com");
WebElement select=driver.findElement(By.xpath("//input[@value='yes']"));
select.click();
WebElement d= driver.findElement(By.xpath("//textarea[@name='comment']"));
d.sendKeys("Everything is amazing");




    }
}
