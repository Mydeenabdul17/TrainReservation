# Train Reservation Console Application

## Description
Train Reservation Console Application is a Java-based console application that allows users to view available trains, book tickets, and view booked tickets using a unique PNR number. The application utilizes MySQL for storage and Hibernate for connecting to the database.
## Branch 
- please change to Master Branch to view Code

## Features
- View available trains: Users can view a list of available trains with details such as train number, source, destination, departure time, and available seats.
- Book tickets: Users can book tickets for a specific train by providing necessary details such as passenger name, age, and preferred seat.
- View booked tickets: Users can view booked tickets using the auto-generated PNR number. The details of the booked ticket, including passenger information and journey details, are displayed.

## Technologies Used
- Java: Core programming language used for application development.
- MySQL: Relational database management system used for data storage.
- Hibernate: Object-relational mapping (ORM) framework used to connect Java applications with the database.
- Maven: Build automation tool and dependency management for the project.

## Setup Instructions
1. Clone the repository to your local machine.
  ```base
git clone https://github.com/Mydeenabdul17/TrainReservation.git
```
3. Install MySQL and create a database schema for the application.
4. Update the Hibernate configuration file (`hibernate.cfg.xml`) with your MySQL database credentials.
5. Compile the Java source files using Maven.
6. Run the application using the main class `TrainReservationApp`.

## Usage
1. Run the application.
2. Use the console interface to navigate through the available options:
   - View available trains.
   - Book a ticket.
   - View booked tickets.
3. Follow the prompts to perform desired actions such as booking a ticket or viewing booked tickets.
