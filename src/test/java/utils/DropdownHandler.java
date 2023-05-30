package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandler {


    public static void clickDropdownOption(WebElement dropdown, List<WebElement> dropdownOptions, String optionText){
        dropdown.click();

        for(WebElement dropdownOption: dropdownOptions){
            if(dropdownOption.getText().equals(optionText)){
                dropdownOption.click();
                break;
            }
        }
    }

    // Methods to handle dropdowns created with <select> tag
    public static void selectByVisibleText(WebElement dropdown, String text){
        new Select(dropdown).selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement dropdown, int index){
        new Select(dropdown).selectByIndex(index);
    }

    public static void selectByVisibleValue(WebElement dropdown, String text){
        new Select(dropdown).selectByValue(text);
    }

    /*
    public class _11_TGDropdownsTest extends Base {

    @BeforeMethod
    public void setPage(){
        driver.get("https://techglobal-training.com/frontend");
        driver.findElement(By.id("card-5")).click();
    }

    @Test
    public void productDropdownTest(){

        WebElement dropdown = driver.findElement(By.id("product_dropdown"));
        DropdownHandler.selectByVisibleText(dropdown, "iPhone 14 Pro Max");
    }

    @Test
    public void productColorTest(){
        WebElement dropdown = driver.findElement(By.id("color_dropdown"));
        DropdownHandler.selectByIndex(dropdown, 2);
    }

    @Test
    public void productDeliveryTest(){
        WebElement dropdown = driver.findElement(By.id("shipment_dropdown"));
        List<WebElement> dropdownOption = driver.findElements(By.cssSelector("#shipment_dropdown span"));

       DropdownHandler.clickDropdownOption(dropdown, dropdownOption, "Delivery");
    }
}
     */
}












