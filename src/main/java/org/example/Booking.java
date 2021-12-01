package org.example;

import java.time.LocalDateTime;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Booking
{
    private int bookingId;
    private int passengerId;
    private int vehicleId;
    private LocalDateTime bookingDateTime;
    private LocationGPS startLocation;
    private LocationGPS endLocation;


    private double cost;
    public int getBookingId() {
        return bookingId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setBookingDateTime(LocalDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public void setStartLocation(LocationGPS startLocation) {
        this.startLocation = startLocation;
    }

    public void setEndLocation(LocationGPS endLocation) {
        this.endLocation = endLocation;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public LocalDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public LocationGPS getStartLocation() {
        return startLocation;
    }

    public LocationGPS getEndLocation() {
        return endLocation;
    }

    public double getCost() {
        return cost;
    }

    public Booking(int bookingId, int passengerId, int vehicleId, String bookingDateTime,
                   double startLat, double endLat, double startLong, double endLong, double cost) {
        this.bookingId = bookingId;
        this.passengerId = passengerId;
        this.vehicleId = vehicleId;



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.bookingDateTime  = LocalDateTime.parse(bookingDateTime, formatter);



        this.startLocation = new LocationGPS(startLat,startLong);
        this.endLocation = new LocationGPS(endLat,endLong);
//        this.cost = cost;
    }






    //TODO - see specification


}
