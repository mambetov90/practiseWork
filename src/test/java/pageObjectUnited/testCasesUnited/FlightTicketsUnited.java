package pageObjectUnited.testCasesUnited;

import com.google.gson.Gson;
import model.TicketInfo;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectUnited.objectRepositoryUnited.UnitedFlightInformationPage;
import pageObjectUnited.objectRepositoryUnited.UnitedHomePage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("LoopConditionNotUpdatedInsideLoop")
public class FlightTicketsUnited {
    WebDriver driver = new ChromeDriver();


    @Test
    public void CheckTickets() throws IOException {

        driver.get("http://www.united.com");
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

        Gson json = new Gson();
        TicketInfo ticketInfo = Ufip.setTicketData();
        String response = json.toJson(ticketInfo);
        System.out.println(response);

        TicketInfo ticketInfo1 = Ufip.setTicketData1();
        String response1 = json.toJson(ticketInfo1);
        System.out.println(response1);

        TicketInfo ticketInfo2 = Ufip.setTicketData2();
        String response2 = json.toJson(ticketInfo2);
        System.out.println(response2);

        TicketInfo ticketInfo3 = Ufip.setTicketData3();
        String response3 = json.toJson(ticketInfo3);
        System.out.println(response3);

        TicketInfo ticketInfo4 = Ufip.setTicketData4();
        String response4 = json.toJson(ticketInfo4);
        System.out.println(response4);

        TicketInfo ticketInfo5 = Ufip.setTicketData5();
        String response5 = json.toJson(ticketInfo5);
        System.out.println(response5);

        TicketInfo ticketInfo6 = Ufip.setTicketData6();
        String response6 = json.toJson(ticketInfo6);
        System.out.println(response6);

        TicketInfo ticketInfo7 = Ufip.setTicketData7();
        String response7 = json.toJson(ticketInfo6);
        System.out.println(response7);

        TicketInfo ticketInfo8 = Ufip.setTicketData8();
        String response8 = json.toJson(ticketInfo8);
        System.out.println(response8);

        TicketInfo ticketInfo9 = Ufip.setTicketData9();
        String response9 = json.toJson(ticketInfo9);
        System.out.println(response9);

        TicketInfo ticketInfo10 = Ufip.setTicketData10();
        String response10 = json.toJson(ticketInfo10);
        System.out.println(response10);

        TicketInfo ticketInfo11 = Ufip.setTicketData11();
        String response11 = json.toJson(ticketInfo11);
        System.out.println(response11);

        TicketInfo ticketInfo12 = Ufip.setTicketData12();
        String response12 = json.toJson(ticketInfo12);
        System.out.println(response12);

        TicketInfo ticketInfo13 = Ufip.setTicketData13();
        String response13 = json.toJson(ticketInfo13);
        System.out.println(response13);

        TicketInfo ticketInfo14 = Ufip.setTicketData14();
        String response14 = json.toJson(ticketInfo14);
        System.out.println(response14);

        TicketInfo ticketInfo15 = Ufip.setTicketData15();
        String response15 = json.toJson(ticketInfo15);
        System.out.println(response15);

        TicketInfo ticketInfo16 = Ufip.setTicketData16();
        String response16 = json.toJson(ticketInfo16);
        System.out.println(response16);

        TicketInfo ticketInfo17 = Ufip.setTicketData17();
        String response17 = json.toJson(ticketInfo17);
        System.out.println(response17);

        TicketInfo ticketInfo18 = Ufip.setTicketData18();
        String response18 = json.toJson(ticketInfo18);
        System.out.println(response18);

        TicketInfo ticketInfo19 = Ufip.setTicketData19();
        String response19 = json.toJson(ticketInfo19);
        System.out.println(response19);

        TicketInfo ticketInfo20 = Ufip.setTicketData20();
        String response20 = json.toJson(ticketInfo20);
        System.out.println(response20);

        TicketInfo ticketInfo21 = Ufip.setTicketData21();
        String response21 = json.toJson(ticketInfo21);
        System.out.println(response21);

        TicketInfo ticketInfo22 = Ufip.setTicketData22();
        String response22 = json.toJson(ticketInfo22);
        System.out.println(response22);

        TicketInfo ticketInfo23 = Ufip.setTicketData23();
        String response23 = json.toJson(ticketInfo23);
        System.out.println(response23);

        TicketInfo ticketInfo24 = Ufip.setTicketData24();
        String response24 = json.toJson(ticketInfo24);
        System.out.println(response24);

        TicketInfo ticketInfo25 = Ufip.setTicketData25();
        String response25 = json.toJson(ticketInfo25);
        System.out.println(response25);

        TicketInfo ticketInfo26 = Ufip.setTicketData26();
        String response26 = json.toJson(ticketInfo26);
        System.out.println(response26);

        TicketInfo ticketInfo27 = Ufip.setTicketData27();
        String response27 = json.toJson(ticketInfo27);
        System.out.println(response27);

        TicketInfo ticketInfo28 = Ufip.setTicketData28();
        String response28 = json.toJson(ticketInfo28);
        System.out.println(response28);

        TicketInfo ticketInfo29 = Ufip.setTicketData29();
        String response29 = json.toJson(ticketInfo29);
        System.out.println(response29);

        TicketInfo ticketInfo30 = Ufip.setTicketData30();
        String response30 = json.toJson(ticketInfo30);
        System.out.println(response30);

        TicketInfo ticketInfo31 = Ufip.setTicketData31();
        String response31 = json.toJson(ticketInfo31);
        System.out.println(response31);

        TicketInfo ticketInfo32 = Ufip.setTicketData32();
        String response32 = json.toJson(ticketInfo32);
        System.out.println(response32);

        TicketInfo ticketInfo33 = Ufip.setTicketData33();
        String response33 = json.toJson(ticketInfo33);
        System.out.println(response33);

        TicketInfo ticketInfo34 = Ufip.setTicketData34();
        String response34 = json.toJson(ticketInfo34);
        System.out.println(response34);

        TicketInfo ticketInfo35 = Ufip.setTicketData35();
        String response35 = json.toJson(ticketInfo35);
        System.out.println(response35);
    }

    @AfterEach
    public void CloseBrowser(){
        driver.close();
    }
}
