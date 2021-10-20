package java.com.Trycloud.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setupDriver(){
        System.out.println("This is from @Before inside hook class");
        java.com.Trycloud.utilities.Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void teardown(){
        System.out.println("This is from @After inside hook class");
        java.com.Trycloud.utilities.Driver.closeBrowser();

    }

}