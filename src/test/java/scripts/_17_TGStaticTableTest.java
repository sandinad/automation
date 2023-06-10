package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;
import java.util.List;

public class _17_TGStaticTableTest extends Base{

    @BeforeMethod
    public void setPage(){

    }
    @Test
    public void validateFirstRow(){
        List<WebElement>firstRow = driver.findElements(By.cssSelector("tr:nth-child(1) td"));
        String[] expectedText = {"1", "Amazon", "1,523,000", "USA"};

        for(int i = 0; i < firstRow.size(); i++){
            Assert.assertTrue(firstRow.get(i).isDisplayed());
            Assert.assertEquals(firstRow.get(i).getText(),expectedText[i]);
        }


    }
    @Test
    public void lastRow(){
        List<WebElement> country = driver.findElements(By.cssSelector("td:nth-child(4"));
        String[] expected = {"USA", "China", "USA", "USA", "S.Korea"};
        for(int i = 0; i < country.size(); i++){
            Assert.assertEquals(country.get(i).getText(),expected[i]);
        }
    }
 

}
