package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest
{
    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyThatSignInPageDisplay()
    {
        driver.findElement(By.xpath("//div[@class='panel header']//a[text()='Create an Account']")).click();

        String expected = "Create New Customer Account";

        WebElement productList  = driver.findElement(By.xpath("//div[@class='panel header']//a[text()='Create an Account']"));
        //$x("//span[@class='base']//text()='Create New Customer Account'")

    }

    @Test
    public void userSholdRegisterAccountSuccessfully()
    {
        driver.findElement(By.xpath("//div[@class='panel header']//a[text()='Create an Account']")).click();
        driver.findElement(By.id("firstname")).sendKeys("TestFirstName");
        driver.findElement(By.id("lastname")).sendKeys("TestLastName");
        driver.findElement(By.id("email")).sendKeys("email@email.com");
        driver.findElement(By.id("password")).sendKeys("Pa55word");
        driver.findElement(By.name("password_confirmation"));
        driver.findElement(By.xpath("//button[@class='action submit primary']//text()='Create an Account'")).click();


    }
}
