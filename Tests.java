
import org.testng.annotations.Test;

import pages.*;

import java.util.concurrent.TimeUnit;

public class Tests extends Generic {

    @Test(enabled=true, priority = 0)
    public void LOGINANDSELECTLOCATION() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Login ln = new Login(driver);
        ln.skip_button();
        ln.loc();
        ln.cityname();
    }

    @Test(enabled=true, priority = 1)
    public void SELECTANDCLICKONMOVIE() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Movie mv= new Movie(driver);
        mv.movie_name();

    }

    @Test(enabled=true, priority = 2)
    public void BOOKTICKETOFMINE() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Bookticket bt= new Bookticket(driver);
        bt.ticket_book();
    }
    @Test(enabled=false, priority = 3)
    public void INFOPAGE() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Info_pop_up in= new Info_pop_up(driver);
        in.info_ok();
    }

    @Test(enabled=true, priority = 4)
    public void DATEPAGE() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Select_date da = new Select_date(driver);
        da.date_option();
    }

    @Test(enabled=true, priority = 5)
    public void SELECTTIME() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Select_showtime tm= new Select_showtime(driver);
        tm.time_option();
    }

    @Test(enabled=true, priority = 6)
    public void CLICKONACCEPTBUTTON(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Term_and_Conditon term = new Term_and_Conditon(driver);
        term.accept_button();
    }

    @Test(enabled =true, priority = 7)
    public void SELECTSEATTOBOOK() {
        Selectseat set = new Selectseat(driver);
        set.seatselect();
    }

    @Test(enabled =true, priority = 8)
    public void SEATNUMBER() {
        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
       SelectseatNumber num= new SelectseatNumber(driver);
       num.settingarragnment(337,1226);
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
       num.settingarragnment(584,1229);
    }

    @Test(enabled =true, priority = 9)
    public void PAYFORSEAT() {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Paypage pp= new Paypage(driver);
        pp.paying();
    }

    @Test(enabled =true, priority = 10)
    public void SKIPTHEOPTION() {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Skippage sk= new Skippage(driver);
        sk.skipping();

    }

    @Test(enabled =true, priority = 11)
    public void DETAILS() {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Conatactdetails cd = new Conatactdetails(driver);
        cd.detailing();
    }


}





