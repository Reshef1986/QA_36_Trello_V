import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {


    WebDriver wd;

    @BeforeMethod
    public void preConditions() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();

    }

    @Test
    public void trello1() throws InterruptedException {
        WebElement loginButton = wd.findElement(By.cssSelector("[href='/login']"));
        loginButton.click();//click the Login button

        WebElement emailField = wd.findElement(By.cssSelector("#user"));
        emailField.click();
        emailField.clear();
        emailField.sendKeys("zaxarovalexandr1986@gmail.com");


        WebElement logButton = wd.findElement(By.cssSelector("#login"));
        logButton.click();

        Thread.sleep(2000);
        WebElement passwordInput = wd.findElement(By.cssSelector("#password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("RESHEF326943081reshef");

        WebElement submitLogin = wd.findElement(By.cssSelector("#login-submit"));
        submitLogin.click();
        System.out.println("Wow I got it");
       /* Thread.sleep(2000);
        WebElement logOutButton = wd.findElement(By.xpath("//*[@class ='yRPuNUIoZpQWwj']"));
        logOutButton.click();
        Thread.sleep(2000);
        WebElement out = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-logout']"));
out.click();

        */
    }

    @Test
    public void logOut() {
        WebElement logOutButton = wd.findElement(By.cssSelector(".yRPuNUIoZpQWwj"));
        logOutButton.click();
        //wd.findElement(By.xpath("//*[@class ='yRPuNUIoZpQWwj'"));
        WebElement out = wd.findElement(By.cssSelector("[data-testid='header-member-menu-logout']"));
        //wd.findElement(By.xpath("//*[@data-testid='header-member-menu-logout']"));
        out.click();

    }


    @AfterMethod
    public void postConditions() {
        wd.close();
        wd.quit();
    }

}
