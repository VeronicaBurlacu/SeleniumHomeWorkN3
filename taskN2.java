package homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskN2 {
    public static void main(String[] args) throws InterruptedException {
        //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
        //Enter valid username
        //Leave password field empty
        //Click on login button
        //Verify error message with text “Password cannot be empty” is displayed. (edited)
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();


        WebElement username=driver.findElement(By.cssSelector(" input[id='txtUsername']"));
        username.sendKeys("Veronica");

        WebElement butt=driver.findElement(By.cssSelector("input[id='btnLogin']"));
        butt.click();
        WebElement r=driver.findElement(By.cssSelector("span[id='spanMessage']"));
        r.getText();
        if(r.equals("Password cannot be empty")){
            System.out.println("The Password is missing");
        }else{
            System.out.println("The Password was placed");
        }

    }
}
