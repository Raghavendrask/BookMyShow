package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Conatactdetails {

    private AppiumDriver<MobileElement> driver;

    public Conatactdetails(AppiumDriver<MobileElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="//android.widget.EditText[@text='Email Address']")
    private AndroidElement email;
    @AndroidFindBy(xpath="//android.widget.EditText[@text='Phone']")
    private AndroidElement phone;
    @AndroidFindBy(xpath="//android.widget.Button[@text='Update Details']")
    private AndroidElement update;


    public void detailing(){
        email.sendKeys("raghavendrask526@gmail.com");
        phone.sendKeys("6363844256");
        update.click();

    }
}
