package pageObjectUnited.objectRepositoryUnited;

import model.TicketInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;


public class UnitedFlightInformationPage {
    WebDriver driver;
    private final By CLICK_ON_ECONOMY = By.xpath("//div[contains(text(),'Basic Economy')]");
    private final By DEPART = By.xpath("//ul[@id='flight-result-list-revised']//div[@class='flight-time flight-time-depart']");
    private final By ARRIVE = By.xpath("//ul[@id='flight-result-list-revised']//div[@class='flight-time flight-time-arrive']");
    private final By STOPS = By.xpath("//ul[@id='flight-result-list-revised']//div[@class='flight-connection-container']");
    private final By DURATION = By.xpath("//ul[@id='flight-result-list-revised']//div[@class='flight-summary-bottom']");
    //private final By DEPART_DATA = By.xpath("//*[@id=\"flight-result-list-revised\"]/li//div[@class='flight-summary-top']");

    public UnitedFlightInformationPage(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    public void basicEconomy() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CLICK_ON_ECONOMY)).click();
    }
    public TicketInfo setTicketData(){

        TicketInfo flights = new TicketInfo();


      flights.setDepart(driver.findElement(DEPART).getText());
      //flights.setDepart(driver.findElements(DEPART).get(0).getText());



       // flights.setArrive(driver.findElement(ARRIVE).getText());
       // flights.setStops(driver.findElement(STOPS).getText());

        //flight.setPrice();
        return flights;
    }

}

