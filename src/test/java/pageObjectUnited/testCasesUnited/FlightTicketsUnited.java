package pageObjectUnited.testCasesUnited;

import model.TicketInfo;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectUnited.objectRepositoryUnited.UnitedFlightInformationPage;
import pageObjectUnited.objectRepositoryUnited.UnitedHomePage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FlightTicketsUnited {
    WebDriver driver = new ChromeDriver();

    @Before
        public void SetUrl(){

        }
    @Test
    public void CheckTickets() throws IOException {
        driver.get("https://www.united.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        UnitedHomePage Uhp = new UnitedHomePage(driver);
        Uhp.oneWayFlight().click();
        Uhp.departureFrom("New York JFK").click();

        Uhp.submitDepartureCity().click();
        Uhp.arrivalTo("Miami, FL, US (MIA - All Airports)").click();

        Uhp.sumbitArrivalCity().click();
        Uhp.departDay();
        Uhp.chooseClass().click();
        Uhp.findFlights();

        UnitedFlightInformationPage Ufip = new UnitedFlightInformationPage(driver);
        Ufip.basicEconomy();
      //  Ufip.setTicketData();
        Ufip.setTicketData().getDepart();
        System.out.println(Ufip.setTicketData().getDepart());

       // Ufip.setTicketData().getArrive();
       // Ufip.setTicketData().getDuration();
       // Ufip.setTicketData().getStops();

       // System.out.println(Ufip.setTicketData().getDepart());
       // System.out.println(Ufip.setTicketData().getArrive());
       // System.out.println(Ufip.setTicketData().getDuration());
        //System.out.println(Ufip.setTicketData().getStops());
    }
    @AfterEach
    public void CloseBrowser(){
        driver.close();
    }
}
