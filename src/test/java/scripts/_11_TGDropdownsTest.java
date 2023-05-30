package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Waiter;

public class _11_TGDropdownsTest extends Base {

    @BeforeMethod
    public void setPage(){
        driver.get("https://techglobal-training.com/frontend");
        driver.findElement(By.id("card-5")).click();
    }

    @Test
    public void productDropdownTest(){

        Select select = new Select(driver.findElement(By.id("product_dropdown")));

        select.selectByVisibleText("iPhone 14 Pro Max");
    }

    @Test
    public void colorDropdownTest(){

        Select select = new Select(driver.findElement(By.id("color_dropdown")));

        select.selectByIndex(2);
    }


    @Test
    public void productDeliveryTest(){
        WebElement dropdown = driver.findElement(By.id("shipment_dropdown"));
        dropdown.click();

        Waiter.pause(2);
        WebElement dropdownOption = driver.findElement(By.cssSelector("#shipment_dropdown span:last-child"));
        dropdownOption.click();

        Waiter.pause(2);
    }

}
