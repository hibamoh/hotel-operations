package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public double getPrice(){
        double price = 0.0;

        switch (this.roomType){
            case "king" -> { price = 139.00;}
            case "double" -> { price = 134.00;}
            default -> System.out.println("erm... that is not a room type");
        }
        return price;

    }

    public double getReservationTotal(){
        double reservationTotal = 0.0;

        if (weekend = true){
            reservationTotal = (getPrice() * numberOfNights);
            reservationTotal = (reservationTotal * 0.10) + reservationTotal;
        }
        else reservationTotal = (getPrice());

        return reservationTotal;

    }
}
