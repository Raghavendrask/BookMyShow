package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidTouchAction;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class SelectseatNumber {

        private AppiumDriver<MobileElement> driver;

        public SelectseatNumber(AppiumDriver<MobileElement> driver){
            this.driver = driver;
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }

        public void settingarragnment(int x,int y){

//            List<MobileElement> radio=driver.findElements(By.xpath("//android.view.View"));
//            int count=radio.size();
//            System.out.print("Total element count is" + count);
//
//            for (int i=0; i<count; i++)
//            {
//                int x=radio.get(i).getLocation().getX();
//                System.out.print(x);
            new AndroidTouchAction(driver).tap(PointOption.point(x,y)).
                    waitAction(WaitOptions.waitOptions(Duration.ofSeconds(60))).perform();

        }



}
