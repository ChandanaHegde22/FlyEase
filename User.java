package com.flyease.model;

public class User {
    private String username;
    private String password;
    private String fullName;
    private String role;

    public User(String username, String password, String fullName, String role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    public String toCsv() {
        return escape(username) + "," + escape(password) + "," + escape(fullName) + "," + escape(role);
    }

    public static User fromCsv(String line) {
        String[] parts = line.split(",", -1);
        if (parts.length < 4) return null;
        return new User(unescape(parts[0]), unescape(parts[1]), unescape(parts[2]), unescape(parts[3]));
    }

    private static String escape(String value) {
        return value == null ? "" : value.replace(",", " ");
    }

    private static String unescape(String value) {
        return value == null ? "" : value.trim();
    }
}
