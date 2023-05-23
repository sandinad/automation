package scripts;

import org.testng.annotations.BeforeMethod;

public class _05_FacebookTest extends Base {

    @BeforeMethod
    public void setPage(){
        driver.get("https://www.facebook.com/");
    }

}
