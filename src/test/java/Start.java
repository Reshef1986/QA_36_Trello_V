import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void startTrello() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();
        wd.quit();

    }

    WebElement el1 = wd.findElement(By.tagName("div"));
    WebElement el2 = wd.findElement(By.tagName("a"));
    WebElement el3 = wd.findElement(By.id("user"));
    WebElement el4 = wd.findElement(By.id("login-form"));
    //WebElement el5= wd.findElement(By.className("username-readonly hidden"));
    WebElement el6 = wd.findElement(By.className("username-readonly"));
    WebElement el7 = wd.findElement(By.className("css-164r41r"));
    WebElement el8 = wd.findElement(By.linkText("Log in"));
    WebElement el9 = wd.findElement(By.className("m2N684FcksCyfT"));

    //css
    WebElement el1c = wd.findElement(By.cssSelector("#user"));
    WebElement el2c = wd.findElement(By.cssSelector(".username-readonly"));
    WebElement el3c = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));

    //xpath
    WebElement el1x = wd.findElement(By.xpath("//*[@id='user']"));
    WebElement el2x = wd.findElement(By.xpath("//*[@class='username-readonly']"));
    WebElement el3x = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-button']"));


    //log in
    WebElement log1 = wd.findElement(By.cssSelector("[href='/login']"));
    WebElement log11 = wd.findElement(By.xpath("//*[@href='/login']"));

    WebElement log2 = wd.findElement(By.cssSelector("#user"));
    WebElement log22 = wd.findElement(By.xpath("//*[@id='user']"));

    WebElement log3 = wd.findElement(By.cssSelector("#login"));
    WebElement log33 = wd.findElement(By.xpath("//*[@id=login]"));

    WebElement log4 = wd.findElement(By.cssSelector("#password"));
    WebElement log44 = wd.findElement(By.xpath("//*[@id='password']"));

    WebElement log5 = wd.findElement(By.cssSelector("#login-submit"));
    WebElement log55 = wd.findElement(By.xpath("//*[@id='login-submit']"));

    WebElement log6 = wd.findElement(By.cssSelector(".m2N684FcksCyfT"));
    WebElement log66 = wd.findElement(By.xpath("//*[@class='m2N684FcksCyfT']"));

    //log out
    WebElement el33c = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));
    WebElement el33x = wd.findElement(By.xpath("//*[@data-testid='header-member-menu-button']"));

    WebElement ellogc1= wd.findElement(By.cssSelector("[data-testid='header-member-menu-logout']"));
    WebElement ellogx1= wd.findElement(By.xpath("//*[@data-testid='header-member-menu-logout']"));

    WebElement ellogc2 = wd.findElement(By.cssSelector("#logout-submit"));
    WebElement ellogx2 = wd.findElement(By.xpath("//*[@id='logout-submit']"));

    //ends-contains-starts css
    WebElement log111 = wd.findElement(By.cssSelector("[aria-label='Trello']"));
    WebElement log121 = wd.findElement(By.cssSelector("[aria-label $='llo']"));//ends
    WebElement log31 = wd.findElement(By.cssSelector("[aria-label ^='Tr']"));//starts
    WebElement log41 = wd.findElement(By.cssSelector("[aria-label *='rell']"));//contains

    //ends-contains-starts xpath

    WebElement logx1 = wd.findElement(By.xpath("//*[@aria-label='Trello']"));
    WebElement logx2 = wd.findElement(By.xpath("//*[contains(@aria-label, 'rel')]"));//contains
    WebElement logx3 = wd.findElement(By.xpath("//*[starts-with(@aria-label, 'Tr')]"));//starts with

}
