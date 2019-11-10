package Pages;

import org.openqa.selenium.By;

public class MainPage {
    private BaseFunc baseFunc;

    private final By MPLEFTDROP = By.id("afrom");

    public MainPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void openLeftDRop() {

        //Find and click element
        baseFunc.getElement(MPLEFTDROP).click();

    }
}
