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
    private final By DEPART1 = By.xpath("//ul[@id='flight-result-list-revised']/li[2]//div[@class='flight-time flight-time-depart']");
    private final By DEPART2 = By.xpath("//ul[@id='flight-result-list-revised']/li[3]//div[@class='flight-time flight-time-depart']");
    private final By DEPART3 = By.xpath("//ul[@id='flight-result-list-revised']/li[4]//div[@class='flight-time flight-time-depart']");
    private final By DEPART4 = By.xpath("//*[@id=\"flight-result-list-revised\"]/li[4]/div[2]/div[1]/div[1]/div[1]");
    private final By DEPART5 = By.xpath("//ul[@id='flight-result-list-revised']/li[6]//div[@class='flight-time flight-time-depart']");
    private final By DEPART6 = By.xpath("//ul[@id='flight-result-list-revised']/li[7]//div[@class='flight-time flight-time-depart']");
    private final By DEPART7 = By.xpath("//ul[@id='flight-result-list-revised']/li[8]//div[@class='flight-time flight-time-depart']");
    private final By DEPART8 = By.xpath("//ul[@id='flight-result-list-revised']/li[9]//div[@class='flight-time flight-time-depart']");
    private final By DEPART9 = By.xpath("//ul[@id='flight-result-list-revised']/li[10]//div[@class='flight-time flight-time-depart']");
    private final By DEPART10 = By.xpath("//ul[@id='flight-result-list-revised']/li[11]//div[@class='flight-time flight-time-depart']");
    private final By DEPART11 = By.xpath("//ul[@id='flight-result-list-revised']/li[12]//div[@class='flight-time flight-time-depart']");
    private final By DEPART12 = By.xpath("//ul[@id='flight-result-list-revised']/li[13]//div[@class='flight-time flight-time-depart']");
    private final By DEPART13 = By.xpath("//ul[@id='flight-result-list-revised']/li[14]//div[@class='flight-time flight-time-depart']");
    private final By DEPART14 = By.xpath("//ul[@id='flight-result-list-revised']/li[15]//div[@class='flight-time flight-time-depart']");
    private final By DEPART15 = By.xpath("//ul[@id='flight-result-list-revised']/li[16]//div[@class='flight-time flight-time-depart']");
    private final By DEPART16 = By.xpath("//ul[@id='flight-result-list-revised']/li[17]//div[@class='flight-time flight-time-depart']");
    private final By DEPART17 = By.xpath("//ul[@id='flight-result-list-revised']/li[18]//div[@class='flight-time flight-time-depart']");
    private final By DEPART18 = By.xpath("//ul[@id='flight-result-list-revised']/li[19]//div[@class='flight-time flight-time-depart']");
    private final By DEPART19 = By.xpath("//ul[@id='flight-result-list-revised']/li[20]//div[@class='flight-time flight-time-depart']");
    private final By DEPART20 = By.xpath("//ul[@id='flight-result-list-revised']/li[21]//div[@class='flight-time flight-time-depart']");
    private final By DEPART21 = By.xpath("//ul[@id='flight-result-list-revised']/li[22]//div[@class='flight-time flight-time-depart']");
    private final By DEPART22 = By.xpath("//ul[@id='flight-result-list-revised']/li[23]//div[@class='flight-time flight-time-depart']");
    private final By DEPART23 = By.xpath("//ul[@id='flight-result-list-revised']/li[24]//div[@class='flight-time flight-time-depart']");
    private final By DEPART24 = By.xpath("//ul[@id='flight-result-list-revised']/li[25]//div[@class='flight-time flight-time-depart']");
    private final By DEPART25 = By.xpath("//ul[@id='flight-result-list-revised']/li[26]//div[@class='flight-time flight-time-depart']");
    private final By DEPART26 = By.xpath("//ul[@id='flight-result-list-revised']/li[27]//div[@class='flight-time flight-time-depart']");
    private final By DEPART27 = By.xpath("//ul[@id='flight-result-list-revised']/li[28]//div[@class='flight-time flight-time-depart']");
    private final By DEPART28 = By.xpath("//ul[@id='flight-result-list-revised']/li[29]//div[@class='flight-time flight-time-depart']");
    private final By DEPART29 = By.xpath("//ul[@id='flight-result-list-revised']/li[30]//div[@class='flight-time flight-time-depart']");
    private final By DEPART30 = By.xpath("//ul[@id='flight-result-list-revised']/li[31]//div[@class='flight-time flight-time-depart']");
    private final By DEPART31 = By.xpath("//ul[@id='flight-result-list-revised']/li[32]//div[@class='flight-time flight-time-depart']");
    private final By DEPART32 = By.xpath("//ul[@id='flight-result-list-revised']/li[33]//div[@class='flight-time flight-time-depart']");
    private final By DEPART33 = By.xpath("//ul[@id='flight-result-list-revised']/li[34]//div[@class='flight-time flight-time-depart']");
    private final By DEPART34 = By.xpath("//ul[@id='flight-result-list-revised']/li[35]//div[@class='flight-time flight-time-depart']");
    private final By DEPART35 = By.xpath("//ul[@id='flight-result-list-revised']/li[36]//div[@class='flight-time flight-time-depart']");
    private final By ARRIVE = By.xpath("//ul[@id='flight-result-list-revised']//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE1 = By.xpath("//ul[@id='flight-result-list-revised']/li[2]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE2 = By.xpath("//ul[@id='flight-result-list-revised']/li[3]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE3 = By.xpath("//ul[@id='flight-result-list-revised']/li[4]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE4 = By.xpath("//*[@id=\"flight-result-list-revised\"]/li[4]/div[2]/div[1]/div[1]/div[3]");
    private final By ARRIVE5 = By.xpath("//ul[@id='flight-result-list-revised']/li[6]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE6 = By.xpath("//ul[@id='flight-result-list-revised']/li[7]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE7 = By.xpath("//ul[@id='flight-result-list-revised']/li[8]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE8 = By.xpath("//ul[@id='flight-result-list-revised']/li[9]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE9 = By.xpath("//ul[@id='flight-result-list-revised']/li[10]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE10 = By.xpath("//ul[@id='flight-result-list-revised']/li[11]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE11 = By.xpath("//ul[@id='flight-result-list-revised']/li[12]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE12 = By.xpath("//ul[@id='flight-result-list-revised']/li[13]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE13 = By.xpath("//ul[@id='flight-result-list-revised']/li[14]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE14 = By.xpath("//*[@id=\"flight-result-list-revised\"]/li[15]/div[2]/div[1]/div[1]/div[3]");
    private final By ARRIVE15 = By.xpath("//ul[@id='flight-result-list-revised']/li[16]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE16 = By.xpath("//ul[@id='flight-result-list-revised']/li[17]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE17 = By.xpath("//ul[@id='flight-result-list-revised']/li[18]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE18 = By.xpath("//ul[@id='flight-result-list-revised']/li[19]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE19 = By.xpath("//ul[@id='flight-result-list-revised']/li[20]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE20 = By.xpath("//ul[@id='flight-result-list-revised']/li[21]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE21 = By.xpath("//ul[@id='flight-result-list-revised']/li[22]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE22 = By.xpath("//ul[@id='flight-result-list-revised']/li[23]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE23 = By.xpath("//ul[@id='flight-result-list-revised']/li[24]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE24 = By.xpath("//ul[@id='flight-result-list-revised']/li[25]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE25 = By.xpath("//ul[@id='flight-result-list-revised']/li[26]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE26 = By.xpath("//ul[@id='flight-result-list-revised']/li[27]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE27 = By.xpath("//ul[@id='flight-result-list-revised']/li[28]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE28 = By.xpath("//ul[@id='flight-result-list-revised']/li[29]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE29 = By.xpath("//ul[@id='flight-result-list-revised']/li[30]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE30 = By.xpath("//ul[@id='flight-result-list-revised']/li[31]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE31 = By.xpath("//ul[@id='flight-result-list-revised']/li[32]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE32 = By.xpath("//ul[@id='flight-result-list-revised']/li[33]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE33 = By.xpath("//ul[@id='flight-result-list-revised']/li[34]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE34 = By.xpath("//ul[@id='flight-result-list-revised']/li[35]//div[@class='flight-time flight-time-arrive']");
    private final By ARRIVE35 = By.xpath("//ul[@id='flight-result-list-revised']/li[36]//div[@class='flight-time flight-time-arrive']");
    private final By STOPS = By.xpath("//ul[@id='flight-result-list-revised']//div[@class='flight-connection-container']");
    private final By STOPS1 = By.xpath("//*[@id=\"flight-result-list-revised\"]/li[2]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS2 = By.xpath("//*[@id=\"flight-result-list-revised\"]/li[3]/div[2]/div[1]/div[1]/div[4]\n");
    private final By STOPS3 = By.xpath("//*[@id='flight-result-list-revised']/li[4]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS4 = By.xpath("//*[@id=\"flight-result-list-revised\"]/li[4]/div[2]/div[1]/div[1]/div[4]/div");
    private final By STOPS5 = By.xpath("//*[@id='flight-result-list-revised']/li[6]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS6 = By.xpath("//*[@id='flight-result-list-revised']/li[7]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS7 = By.xpath("//*[@id='flight-result-list-revised']/li[8]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS8 = By.xpath("//*[@id='flight-result-list-revised']/li[9]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS9 = By.xpath("//*[@id='flight-result-list-revised']/li[10]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS10 = By.xpath("//*[@id='flight-result-list-revised']/li[11]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS11 = By.xpath("//*[@id='flight-result-list-revised']/li[12]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS12 = By.xpath("//*[@id='flight-result-list-revised']/li[13]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS13 = By.xpath("//*[@id='flight-result-list-revised']/li[14]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS14 = By.xpath("//*[@id='flight-result-list-revised']/li[15]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS15 = By.xpath("//*[@id='flight-result-list-revised']/li[16]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS16 = By.xpath("//*[@id='flight-result-list-revised']/li[17]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS17 = By.xpath("//*[@id='flight-result-list-revised']/li[18]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS18 = By.xpath("//*[@id='flight-result-list-revised']/li[19]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS19 = By.xpath("//*[@id='flight-result-list-revised']/li[20]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS20 = By.xpath("//*[@id='flight-result-list-revised']/li[21]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS21 = By.xpath("//*[@id='flight-result-list-revised']/li[22]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS22 = By.xpath("//*[@id='flight-result-list-revised']/li[23]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS23 = By.xpath("//*[@id='flight-result-list-revised']/li[24]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS24 = By.xpath("//*[@id='flight-result-list-revised']/li[25]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS25 = By.xpath("//*[@id='flight-result-list-revised']/li[26]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS26 = By.xpath("//*[@id='flight-result-list-revised']/li[27]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS27 = By.xpath("//*[@id='flight-result-list-revised']/li[28]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS28 = By.xpath("//*[@id='flight-result-list-revised']/li[29]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS29 = By.xpath("//*[@id='flight-result-list-revised']/li[30]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS30 = By.xpath("//*[@id='flight-result-list-revised']/li[31]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS31 = By.xpath("//*[@id='flight-result-list-revised']/li[32]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS32 = By.xpath("//*[@id='flight-result-list-revised']/li[33]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS33 = By.xpath("//*[@id='flight-result-list-revised']/li[34]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS34 = By.xpath("//*[@id='flight-result-list-revised']/li[35]/div[2]/div[1]/div[1]/div[4]");
    private final By STOPS35 = By.xpath("//*[@id='flight-result-list-revised']/li[36]/div[2]/div[1]/div[1]/div[4]");
    private final By DURATION = By.xpath("//ul[@id='flight-result-list-revised']//div[@class='flight-summary-bottom']");
    private final By DURATION1 = By.xpath("//ul[@id='flight-result-list-revised']/li[2]//a[@title='On-time performance']");
    private final By DURATION2 = By.xpath("//ul[@id='flight-result-list-revised']/li[3]//a[@title='On-time performance']");
    private final By DURATION3 = By.xpath("//ul[@id='flight-result-list-revised']/li[4]//a[@title='On-time performance']");
    private final By DURATION4 = By.xpath("//*[@id=\"flight-result-list-revised\"]/li[4]/div[2]/div[1]/div[2]/a");
    private final By DURATION5 = By.xpath("//ul[@id='flight-result-list-revised']/li[6]//a[@title='On-time performance']");
    private final By DURATION6 = By.xpath("//ul[@id='flight-result-list-revised']/li[7]//a[@title='On-time performance']");
    private final By DURATION7 = By.xpath("//ul[@id='flight-result-list-revised']/li[8]//a[@title='On-time performance']");
    private final By DURATION8 = By.xpath("//ul[@id='flight-result-list-revised']/li[9]//a[@title='On-time performance']");
    private final By DURATION9 = By.xpath("//ul[@id='flight-result-list-revised']/li[10]//a[@title='On-time performance']");
    private final By DURATION10 = By.xpath("//ul[@id='flight-result-list-revised']/li[11]//a[@title='On-time performance']");
    private final By DURATION11 = By.xpath("//ul[@id='flight-result-list-revised']/li[12]//a[@title='On-time performance']");
    private final By DURATION12 = By.xpath("//ul[@id='flight-result-list-revised']/li[13]//a[@title='On-time performance']");
    private final By DURATION13 = By.xpath("//ul[@id='flight-result-list-revised']/li[14]//a[@title='On-time performance']");
    private final By DURATION14 = By.xpath("//ul[@id='flight-result-list-revised']/li[15]//a[@title='On-time performance']");
    private final By DURATION15 = By.xpath("//ul[@id='flight-result-list-revised']/li[16]//a[@title='On-time performance']");
    private final By DURATION16 = By.xpath("//ul[@id='flight-result-list-revised']/li[17]//a[@title='On-time performance']");
    private final By DURATION17 = By.xpath("//ul[@id='flight-result-list-revised']/li[18]//a[@title='On-time performance']");
    private final By DURATION18 = By.xpath("//ul[@id='flight-result-list-revised']/li[19]//a[@title='On-time performance']");
    private final By DURATION19 = By.xpath("//ul[@id='flight-result-list-revised']/li[20]//a[@title='On-time performance']");
    private final By DURATION20 = By.xpath("//ul[@id='flight-result-list-revised']/li[21]//a[@title='On-time performance']");
    private final By DURATION21 = By.xpath("//ul[@id='flight-result-list-revised']/li[22]//a[@title='On-time performance']");
    private final By DURATION22 = By.xpath("//ul[@id='flight-result-list-revised']/li[23]//a[@title='On-time performance']");
    private final By DURATION23 = By.xpath("//ul[@id='flight-result-list-revised']/li[24]//a[@title='On-time performance']");
    private final By DURATION24 = By.xpath("//ul[@id='flight-result-list-revised']/li[25]//a[@title='On-time performance']");
    private final By DURATION25 = By.xpath("//ul[@id='flight-result-list-revised']/li[26]//a[@title='On-time performance']");
    private final By DURATION26 = By.xpath("//ul[@id='flight-result-list-revised']/li[27]//a[@title='On-time performance']");
    private final By DURATION27 = By.xpath("//ul[@id='flight-result-list-revised']/li[28]//a[@title='On-time performance']");
    private final By DURATION28 = By.xpath("//ul[@id='flight-result-list-revised']/li[29]//a[@title='On-time performance']");
    private final By DURATION29 = By.xpath("//ul[@id='flight-result-list-revised']/li[30]//a[@title='On-time performance']");
    private final By DURATION30 = By.xpath("//ul[@id='flight-result-list-revised']/li[31]//a[@title='On-time performance']");
    private final By DURATION31 = By.xpath("//ul[@id='flight-result-list-revised']/li[32]//a[@title='On-time performance']");
    private final By DURATION32 = By.xpath("//ul[@id='flight-result-list-revised']/li[33]//a[@title='On-time performance']");
    private final By DURATION33 = By.xpath("//ul[@id='flight-result-list-revised']/li[34]//a[@title='On-time performance']");
    private final By DURATION34 = By.xpath("//ul[@id='flight-result-list-revised']/li[35]//a[@title='On-time performance']");
    private final By DURATION35 = By.xpath("//ul[@id='flight-result-list-revised']/li[36]//a[@title='On-time performance']");

    public UnitedFlightInformationPage(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    public void basicEconomy() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CLICK_ON_ECONOMY)).click();
    }

    public TicketInfo setTicketData() {

        TicketInfo flights = new TicketInfo();

        flights.setDepart((driver.findElement(DEPART).getText()));
        flights.setArrive(driver.findElement(ARRIVE).getText());
        flights.setStops(driver.findElement(STOPS).getText());
        flights.setDuration(driver.findElement(DURATION).getText());


        return flights;

    }

    public TicketInfo setTicketData1() {
        TicketInfo flights1 = new TicketInfo();
        flights1.setDepart((driver.findElement(DEPART1).getText()));
        flights1.setArrive((driver.findElement(ARRIVE1).getText()));
        flights1.setStops((driver.findElement(STOPS1).getText()));
        flights1.setDuration(driver.findElement(DURATION1).getText());

        return flights1;
    }

    public TicketInfo setTicketData2() {
        TicketInfo flights2 = new TicketInfo();

        flights2.setDepart((driver.findElement(DEPART2).getText()));
        flights2.setArrive((driver.findElement(ARRIVE2).getText()));
        flights2.setStops((driver.findElement(STOPS2).getText()));
        flights2.setDuration(driver.findElement(DURATION2).getText());


        return flights2;
    }

    public TicketInfo setTicketData3() {
        TicketInfo flights3 = new TicketInfo();

        flights3.setDepart((driver.findElement(DEPART3).getText()));
        flights3.setArrive((driver.findElement(ARRIVE3).getText()));
        flights3.setStops((driver.findElement(STOPS3).getText()));
        flights3.setDuration(driver.findElement(DURATION3).getText());

        return flights3;
    }

    public TicketInfo setTicketData4() {
        TicketInfo flights4 = new TicketInfo();

        flights4.setDepart((driver.findElement(DEPART4).getText()));
        flights4.setArrive((driver.findElement(ARRIVE4).getText()));
        flights4.setStops((driver.findElement(STOPS4).getText()));
        flights4.setDuration(driver.findElement(DURATION4).getText());

        return flights4;
    }

    public TicketInfo setTicketData5() {
        TicketInfo flights5 = new TicketInfo();

        flights5.setDepart((driver.findElement(DEPART5).getText()));
        flights5.setArrive((driver.findElement(ARRIVE5).getText()));
        flights5.setStops((driver.findElement(STOPS5).getText()));
        flights5.setDuration(driver.findElement(DURATION5).getText());

        return flights5;
    }

    public TicketInfo setTicketData6() {
        TicketInfo flights6 = new TicketInfo();

        flights6.setDepart((driver.findElement(DEPART6).getText()));
        flights6.setArrive((driver.findElement(ARRIVE6).getText()));
        flights6.setStops((driver.findElement(STOPS6).getText()));
        flights6.setDuration(driver.findElement(DURATION6).getText());

        return flights6;
    }

    public TicketInfo setTicketData7() {
        TicketInfo flights7 = new TicketInfo();

        flights7.setDepart((driver.findElement(DEPART7).getText()));
        flights7.setArrive((driver.findElement(ARRIVE7).getText()));
        flights7.setStops((driver.findElement(STOPS7).getText()));
        flights7.setDuration(driver.findElement(DURATION7).getText());

        return flights7;
    }

    public TicketInfo setTicketData8() {
        TicketInfo flights8 = new TicketInfo();

        flights8.setDepart((driver.findElement(DEPART8).getText()));
        flights8.setArrive((driver.findElement(ARRIVE8).getText()));
        flights8.setStops((driver.findElement(STOPS8).getText()));
        flights8.setDuration(driver.findElement(DURATION8).getText());

        return flights8;
    }

    public TicketInfo setTicketData9() {
        TicketInfo flights9 = new TicketInfo();

        flights9.setDepart((driver.findElement(DEPART9).getText()));
        flights9.setArrive((driver.findElement(ARRIVE9).getText()));
        flights9.setStops((driver.findElement(STOPS9).getText()));
        flights9.setDuration(driver.findElement(DURATION9).getText());

        return flights9;
    }

    public TicketInfo setTicketData10() {
        TicketInfo flights10 = new TicketInfo();

        flights10.setDepart((driver.findElement(DEPART10).getText()));
        flights10.setArrive((driver.findElement(ARRIVE10).getText()));
        flights10.setStops((driver.findElement(STOPS10).getText()));
        flights10.setDuration(driver.findElement(DURATION10).getText());

        return flights10;
    }

    public TicketInfo setTicketData11() {
        TicketInfo flights11 = new TicketInfo();

        flights11.setDepart((driver.findElement(DEPART11).getText()));
        flights11.setArrive((driver.findElement(ARRIVE11).getText()));
        flights11.setStops((driver.findElement(STOPS11).getText()));
        flights11.setDuration(driver.findElement(DURATION11).getText());

        return flights11;
    }

    public TicketInfo setTicketData12() {
        TicketInfo flights12 = new TicketInfo();

        flights12.setDepart((driver.findElement(DEPART12).getText()));
        flights12.setArrive((driver.findElement(ARRIVE12).getText()));
        flights12.setStops((driver.findElement(STOPS12).getText()));
        flights12.setDuration(driver.findElement(DURATION12).getText());

        return flights12;
    }

    public TicketInfo setTicketData13() {
        TicketInfo flights13 = new TicketInfo();

        flights13.setDepart((driver.findElement(DEPART13).getText()));
        flights13.setArrive((driver.findElement(ARRIVE13).getText()));
        flights13.setStops((driver.findElement(STOPS13).getText()));
        flights13.setDuration(driver.findElement(DURATION13).getText());

        return flights13;
    }

    public TicketInfo setTicketData14() {
        TicketInfo flights14 = new TicketInfo();

        flights14.setDepart((driver.findElement(DEPART14).getText()));
        flights14.setArrive((driver.findElement(ARRIVE14).getText()));
        flights14.setStops((driver.findElement(STOPS14).getText()));
        flights14.setDuration(driver.findElement(DURATION14).getText());

        return flights14;
    }

    public TicketInfo setTicketData15() {
        TicketInfo flights15 = new TicketInfo();

        flights15.setDepart((driver.findElement(DEPART15).getText()));
        flights15.setArrive((driver.findElement(ARRIVE15).getText()));
        flights15.setStops((driver.findElement(STOPS15).getText()));
        flights15.setDuration(driver.findElement(DURATION15).getText());

        return flights15;
    }

    public TicketInfo setTicketData16() {
        TicketInfo flights16 = new TicketInfo();

        flights16.setDepart((driver.findElement(DEPART16).getText()));
        flights16.setArrive((driver.findElement(ARRIVE16).getText()));
        flights16.setStops((driver.findElement(STOPS16).getText()));
        flights16.setDuration(driver.findElement(DURATION16).getText());

        return flights16;
    }

    public TicketInfo setTicketData17() {
        TicketInfo flights17 = new TicketInfo();

        flights17.setDepart((driver.findElement(DEPART17).getText()));
        flights17.setArrive((driver.findElement(ARRIVE17).getText()));
        flights17.setStops((driver.findElement(STOPS17).getText()));
        flights17.setDuration(driver.findElement(DURATION17).getText());

        return flights17;
    }

    public TicketInfo setTicketData18() {
        TicketInfo flights18 = new TicketInfo();

        flights18.setDepart((driver.findElement(DEPART18).getText()));
        flights18.setArrive((driver.findElement(ARRIVE18).getText()));
        flights18.setStops((driver.findElement(STOPS18).getText()));
        flights18.setDuration(driver.findElement(DURATION18).getText());

        return flights18;
    }

    public TicketInfo setTicketData19() {
        TicketInfo flights19 = new TicketInfo();

        flights19.setDepart((driver.findElement(DEPART19).getText()));
        flights19.setArrive((driver.findElement(ARRIVE19).getText()));
        flights19.setStops((driver.findElement(STOPS19).getText()));
        flights19.setDuration(driver.findElement(DURATION19).getText());

        return flights19;
    }

    public TicketInfo setTicketData20() {
        TicketInfo flights20 = new TicketInfo();

        flights20.setDepart((driver.findElement(DEPART20).getText()));
        flights20.setArrive((driver.findElement(ARRIVE20).getText()));
        flights20.setStops((driver.findElement(STOPS20).getText()));
        flights20.setDuration(driver.findElement(DURATION20).getText());

        return flights20;
    }

    public TicketInfo setTicketData21() {
        TicketInfo flights21 = new TicketInfo();

        flights21.setDepart((driver.findElement(DEPART21).getText()));
        flights21.setArrive((driver.findElement(ARRIVE21).getText()));
        flights21.setStops((driver.findElement(STOPS21).getText()));
        flights21.setDuration(driver.findElement(DURATION21).getText());

        return flights21;
    }

    public TicketInfo setTicketData22() {
        TicketInfo flights22 = new TicketInfo();

        flights22.setDepart((driver.findElement(DEPART22).getText()));
        flights22.setArrive((driver.findElement(ARRIVE22).getText()));
        flights22.setStops((driver.findElement(STOPS22).getText()));
        flights22.setDuration(driver.findElement(DURATION22).getText());

        return flights22;
    }

    public TicketInfo setTicketData23() {
        TicketInfo flights23 = new TicketInfo();

        flights23.setDepart((driver.findElement(DEPART23).getText()));
        flights23.setArrive((driver.findElement(ARRIVE23).getText()));
        flights23.setStops((driver.findElement(STOPS23).getText()));
        flights23.setDuration(driver.findElement(DURATION23).getText());

        return flights23;
    }

    public TicketInfo setTicketData24() {
        TicketInfo flights24 = new TicketInfo();

        flights24.setDepart((driver.findElement(DEPART24).getText()));
        flights24.setArrive((driver.findElement(ARRIVE24).getText()));
        flights24.setStops((driver.findElement(STOPS24).getText()));
        flights24.setDuration(driver.findElement(DURATION24).getText());

        return flights24;
    }


    public TicketInfo setTicketData25() {
        TicketInfo flights25 = new TicketInfo();

        flights25.setDepart((driver.findElement(DEPART25).getText()));
        flights25.setArrive((driver.findElement(ARRIVE25).getText()));
        flights25.setStops((driver.findElement(STOPS25).getText()));
        flights25.setDuration(driver.findElement(DURATION25).getText());

        return flights25;
    }

    public TicketInfo setTicketData26() {
        TicketInfo flights26 = new TicketInfo();

        flights26.setDepart((driver.findElement(DEPART26).getText()));
        flights26.setArrive((driver.findElement(ARRIVE26).getText()));
        flights26.setStops((driver.findElement(STOPS26).getText()));
        flights26.setDuration(driver.findElement(DURATION26).getText());

        return flights26;
    }

    public TicketInfo setTicketData27() {
        TicketInfo flights27 = new TicketInfo();

        flights27.setDepart((driver.findElement(DEPART27).getText()));
        flights27.setArrive((driver.findElement(ARRIVE27).getText()));
        flights27.setStops((driver.findElement(STOPS27).getText()));
        flights27.setDuration(driver.findElement(DURATION27).getText());

        return flights27;
    }

    public TicketInfo setTicketData28() {
        TicketInfo flights28 = new TicketInfo();

        flights28.setDepart((driver.findElement(DEPART28).getText()));
        flights28.setArrive((driver.findElement(ARRIVE28).getText()));
        flights28.setStops((driver.findElement(STOPS28).getText()));
        flights28.setDuration(driver.findElement(DURATION28).getText());

        return flights28;
    }

    public TicketInfo setTicketData29() {
        TicketInfo flights29 = new TicketInfo();

        flights29.setDepart((driver.findElement(DEPART29).getText()));
        flights29.setArrive((driver.findElement(ARRIVE29).getText()));
        flights29.setStops((driver.findElement(STOPS29).getText()));
        flights29.setDuration(driver.findElement(DURATION29).getText());

        return flights29;
    }
    public TicketInfo setTicketData30() {
        TicketInfo flights30 = new TicketInfo();

        flights30.setDepart((driver.findElement(DEPART30).getText()));
        flights30.setArrive((driver.findElement(ARRIVE30).getText()));
        flights30.setStops((driver.findElement(STOPS30).getText()));
        flights30.setDuration(driver.findElement(DURATION30).getText());

        return flights30;
    }

    public TicketInfo setTicketData31() {
        TicketInfo flights31 = new TicketInfo();

        flights31.setDepart((driver.findElement(DEPART31).getText()));
        flights31.setArrive((driver.findElement(ARRIVE31).getText()));
        flights31.setStops((driver.findElement(STOPS31).getText()));
        flights31.setDuration(driver.findElement(DURATION31).getText());

        return flights31;
    }

    public TicketInfo setTicketData32() {
        TicketInfo flights32 = new TicketInfo();

        flights32.setDepart((driver.findElement(DEPART32).getText()));
        flights32.setArrive((driver.findElement(ARRIVE32).getText()));
        flights32.setStops((driver.findElement(STOPS32).getText()));
        flights32.setDuration(driver.findElement(DURATION32).getText());

        return flights32;
    }

    public TicketInfo setTicketData33() {
        TicketInfo flights33 = new TicketInfo();

        flights33.setDepart((driver.findElement(DEPART33).getText()));
        flights33.setArrive((driver.findElement(ARRIVE33).getText()));
        flights33.setStops((driver.findElement(STOPS33).getText()));
        flights33.setDuration(driver.findElement(DURATION33).getText());

        return flights33;
    }

    public TicketInfo setTicketData34() {
        TicketInfo flights34 = new TicketInfo();

        flights34.setDepart((driver.findElement(DEPART34).getText()));
        flights34.setArrive((driver.findElement(ARRIVE34).getText()));
        flights34.setStops((driver.findElement(STOPS34).getText()));
        flights34.setDuration(driver.findElement(DURATION34).getText());

        return flights34;
    }

    public TicketInfo setTicketData35() {
        TicketInfo flights35 = new TicketInfo();

        flights35.setDepart((driver.findElement(DEPART35).getText()));
        flights35.setArrive((driver.findElement(ARRIVE35).getText()));
        flights35.setStops((driver.findElement(STOPS35).getText()));
        flights35.setDuration(driver.findElement(DURATION35).getText());

        return flights35;
    }


}