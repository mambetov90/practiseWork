package pageObjectUnited.objectRepositoryUnited;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class UnitedHomePage {
    WebDriver driver;
    private final By PICK_ONE_WAY = By.xpath("//label[@for='oneway']");
    private final By DEPARTURE_FROM = By.xpath("//input[@id='bookFlightOriginInput']");
    private final By ARRIVAL_TO = By.xpath("//input[@id='bookFlightDestinationInput']");
    private final By DEPARTURE_CITY = By.xpath("//li[@id='bookFlightOriginInput-menu-item-0']");
    private final By ARRIVAL_CITY = By.xpath("//li[@id='bookFlightDestinationInput-menu-item-0']");
    private final By OPEN_CALENDAR = By.xpath("//input[@id='DepartDate']");
    private final By PICK_DEPART_DAY = By.xpath("//td[@aria-label='Tuesday, August 20, 2019']");
    private final By PICK_SEAT_CLASS = By.xpath("//button[@id='cabinType']");
    private final By PICK_ECONOM_CLASS = By.xpath("//li[@id='cabinType_item-0']");
    private final By CLICK_ON_BUTTON_FIND_FLIGHTS = By.xpath("//button[@aria-label='Find flights']");



    public UnitedHomePage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement oneWayFlight(){
        return driver.findElement(PICK_ONE_WAY);
    }
    public WebElement departureFrom(String text){
          driver.findElement(DEPARTURE_FROM).sendKeys(text);
     return driver.findElement(DEPARTURE_FROM);

    }
    public WebElement submitDepartureCity(){

        return driver.findElement(DEPARTURE_CITY);
    }
    public WebElement arrivalTo(String text){
        driver.findElement(ARRIVAL_TO).sendKeys(text);
        return driver.findElement(ARRIVAL_TO);
    }
    public WebElement sumbitArrivalCity(){
        return driver.findElement(ARRIVAL_CITY);
    }
    public void departDay(){
        driver.findElement(OPEN_CALENDAR).click();
        driver.findElement(PICK_DEPART_DAY).click();
    }
    public WebElement chooseClass(){ driver.findElement(PICK_SEAT_CLASS).click();
        return driver.findElement(PICK_ECONOM_CLASS);
    }
    public UnitedFlightInformationPage findFlights() throws IOException {
        driver.findElement(CLICK_ON_BUTTON_FIND_FLIGHTS).click();
        return new UnitedFlightInformationPage(driver);
    }



}
