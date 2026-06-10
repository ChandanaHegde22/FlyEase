package com.flyease.model;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String id;
    private String airline;
    private String source;
    private String destination;
    private String departureDate;
    private String departureTime;
    private String arrivalTime;
    private double basePrice;
    private int rows;
    private String seatLetters;

    public Flight(String id, String airline, String source, String destination, String departureDate,
                  String departureTime, String arrivalTime, double basePrice, int rows, String seatLetters) {
        this.id = clean(id).toUpperCase();
        this.airline = clean(airline);
        this.source = clean(source);
        this.destination = clean(destination);
        this.departureDate = clean(departureDate);
        this.departureTime = clean(departureTime);
        this.arrivalTime = clean(arrivalTime);
        this.basePrice = basePrice;
        this.rows = rows;
        this.seatLetters = clean(seatLetters).toUpperCase().replaceAll("\\s+", "");
    }

    public String getId() {
        return id;
    }

    public String getAirline() {
        return airline;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getRows() {
        return rows;
    }

    public String getSeatLetters() {
        return seatLetters;
    }

    public int getTotalSeats() {
        return rows * seatLetters.length();
    }

    public List<String> getAllSeats() {
        List<String> seats = new ArrayList<>();
        for (int row = 1; row <= rows; row++) {
            for (char letter : seatLetters.toCharArray()) {
                seats.add(row + String.valueOf(letter));
            }
        }
        return seats;
    }

    public String toCsv() {
        return esc(id) + "," + esc(airline) + "," + esc(source) + "," + esc(destination) + "," +
                esc(departureDate) + "," + esc(departureTime) + "," + esc(arrivalTime) + "," +
                basePrice + "," + rows + "," + esc(seatLetters);
    }

    public static Flight fromCsv(String line) {
        String[] p = line.split(",", -1);
        if (p.length < 10) return null;
        double price;
        int rows;
        try {
            price = Double.parseDouble(p[7]);
            rows = Integer.parseInt(p[8]);
        } catch (NumberFormatException e) {
            return null;
        }
        return new Flight(p[0], p[1], p[2], p[3], p[4], p[5], p[6], price, rows, p[9]);
    }

    private static String clean(String value) {
        return value == null ? "" : value.trim();
    }

    private static String esc(String value) {
        return value == null ? "" : value.replace(",", " ").trim();
    }

    @Override
    public String toString() {
        return id + " | " + airline + " | " + source + " → " + destination + " | " + departureDate;
    }
}
