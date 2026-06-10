package com.flyease.model;

public class Booking {
    private String bookingId;
    private String username;
    private String flightId;
    private String passengerName;
    private String seatNumber;
    private String discountCode;
    private double totalAmount;
    private String status;
    private String createdAt;

    public Booking(String bookingId, String username, String flightId, String passengerName, String seatNumber,
                   String discountCode, double totalAmount, String status, String createdAt) {
        this.bookingId = bookingId;
        this.username = username;
        this.flightId = flightId;
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.discountCode = discountCode;
        this.totalAmount = totalAmount;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getUsername() {
        return username;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toCsv() {
        return esc(bookingId) + "," + esc(username) + "," + esc(flightId) + "," + esc(passengerName) + "," +
                esc(seatNumber) + "," + esc(discountCode) + "," + totalAmount + "," + esc(status) + "," + esc(createdAt);
    }

    public static Booking fromCsv(String line) {
        String[] p = line.split(",", -1);
        if (p.length < 9) return null;
        double amount = 0;
        try {
            amount = Double.parseDouble(p[6]);
        } catch (NumberFormatException ignored) {
        }
        return new Booking(p[0], p[1], p[2], p[3], p[4], p[5], amount, p[7], p[8]);
    }

    private static String esc(String value) {
        return value == null ? "" : value.replace(",", " ");
    }
}
