package model;

import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

public class TicketInfo {


    private String depart;
    private String arrive;
    private String stops;
    private String duration;
    private String price;

    public String getDepart() { return depart; }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
