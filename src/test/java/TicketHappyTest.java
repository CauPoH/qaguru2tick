import Pages.BaseFunc;
import Pages.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TicketHappyTest {

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void ticketTest() {
        //open Chrome and go to url
        baseFunc.goToUrl("http://qaguru.lv:8089/tickets/");

        MainPage mainPage = new MainPage(baseFunc);
        mainPage.openLeftDRop();

        //Close Chrome
        baseFunc.closeDriver();
    }

}