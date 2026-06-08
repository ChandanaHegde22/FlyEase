# FlyEase
# FlyEase - Airline Booking System

FlyEase is a Java-based Airline Booking System developed using Java Swing. It provides a simple and user-friendly desktop interface for booking airline tickets. The system includes user login, flight search, seat availability checking, ticket booking, discount application, booking cancellation, and flight management features.

## Features

* User registration and login
* Admin and demo login support
* Search flights by source, destination, and date
* View all available flights
* View total seats, available seats, and booked seats
* Book flight tickets
* Apply discount codes while booking
* Cancel booked tickets
* Add new flights from the application
* Clean and attractive Java Swing UI
* Flight emblem/logo included
* Runs locally without API keys
* No database setup required

## Technologies Used

* Java 17
* Java Swing
* AWT
* File handling using CSV
* Batch script for easy execution

## Project Structure

```text
AirlineBookingSystem/
│
├── src/
│   └── com/
│       └── flyease/
│           ├── Main.java
│           ├── model/
│           ├── service/
│           └── ui/
│
├── data/
│   ├── users.csv
│   ├── flights.csv
│   └── bookings.csv
│
├── assets/
│   └── logo.png
│
├── run.bat
└── README.md
```

## How to Run

### Step 1: Install Java

Make sure Java 17 or above is installed on your system.

Check Java version:

```bash
java -version
```

Check Java compiler version:

```bash
javac -version
```

### Step 2: Extract the ZIP File

Extract the project ZIP file.

Open the extracted folder:

```text
AirlineBookingSystem
```

### Step 3: Run the Application

Double-click:

```text
run.bat
```

Or open Command Prompt inside the project folder and run:

```bash
run.bat
```

## Login Details

### Demo User

```text
Username: demo
Password: demo123
```

### Admin User

```text
Username: admin
Password: admin123
```

## Discount Codes

Use these discount codes while booking:

```text
FIRST15   - 15% discount
STUDENT10 - 10% discount
SKY25     - 25% discount
WEEKEND5  - 5% discount
```

## Main Modules

### 1. Login Module

Users can log in using valid credentials. New users can also register and access the booking system.

### 2. Flight Search Module

Users can search flights based on source, destination, and date. The system also displays all available flights by default.

### 3. Seat Availability Module

The system displays:

* Total seats
* Available seats
* Booked seats

This helps users know the current seat status before booking.

### 4. Booking Module

Users can select a flight, apply a discount code, and book tickets.

### 5. My Bookings Module

Users can view their booked tickets and cancel bookings if required.

### 6. Add Flight Module

New flights can be added directly from the application. The details are stored in the `flights.csv` file.

## Advantages

* Easy to use
* Beginner-friendly Java project
* No external database required
* No API keys needed
* Good for academic mini project submission
* Demonstrates file handling, GUI development, and object-oriented programming concepts

## Future Enhancements

* Add MySQL database support
* Add payment gateway simulation
* Add email ticket confirmation
* Add admin dashboard
* Add ticket PDF generation
* Add role-based access control

## Conclusion

FlyEase is a simple and effective airline booking system built using Java. It helps users search flights, check seat availability, book tickets, apply discounts, and manage bookings through a clean desktop interface.

