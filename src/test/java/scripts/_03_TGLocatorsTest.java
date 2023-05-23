package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class _03_TGLocatorsTest {

    public static WebDriver driver; // declaration

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(); // initialization

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://techglobal-training.netlify.app/frontend/locators");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void validateKiwiParagraph(){
        WebElement kiwi_p = driver.findElement(By.id("item_kiwi"));
        Assert.assertTrue(kiwi_p.isDisplayed());
        Assert.assertEquals(kiwi_p.getText(),"Kiwi");
    }

    @Test
    public void validateOrangeParagraph(){
        WebElement orange_paragraph = driver.findElement(By.name("item_orange"));

        Assert.assertTrue(orange_paragraph.isDisplayed());
        Assert.assertEquals(orange_paragraph.getText(), "Orange");

        System.out.println(orange_paragraph.getText()); // Orange

        System.out.println(orange_paragraph.getAttribute("id")); // empty
        System.out.println(orange_paragraph.getAttribute("name")); // item_orange
        System.out.println(orange_paragraph.getTagName()); // p

        System.out.println(orange_paragraph.getCssValue("font-size")); // 14.4px
        System.out.println(orange_paragraph.getCssValue("color")); // rgba(105, 105, 105, 1)
        System.out.println(orange_paragraph.getCssValue("line-height")); // 21.6px
        System.out.println(orange_paragraph.getCssValue("font-family")); // Poppins, Helvetica, Arial, sans-serif
        System.out.println(orange_paragraph.getCssValue("box-sizing")); // border-box
    }

    @Test
    public void validateGrapeParagraph(){
        WebElement grape_paragraph = driver.findElement(By.className("item_grapes"));

        Assert.assertTrue(grape_paragraph.isDisplayed());
        Assert.assertEquals(grape_paragraph.getText(), "Grape");


    }

    /*
    Test case 5:
    Go to "https://techglobal-training.com/frontend/locators"
    Validate the "Red Apple" link (displayed and enabled)
    Validate it navigates user to the "https://en.wikipedia.org/wiki/Red_apple"
     */
    @Test
    public void validateRedAppleLink(){

        WebElement redApple = driver.findElement(By.cssSelector("href"));

        Assert.assertTrue(redApple.isDisplayed());


    }

}
