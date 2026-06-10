package com.flyease.model;

public class Discount {
    private String code;
    private String description;
    private double percentage;

    public Discount(String code, String description, double percentage) {
        this.code = code;
        this.description = description;
        this.percentage = percentage;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPercentage() {
        return percentage;
    }

    public double calculatePrice(double basePrice) {
        return basePrice - (basePrice * percentage / 100.0);
    }

    @Override
    public String toString() {
        return code + " - " + (int) percentage + "% OFF";
    }
}
