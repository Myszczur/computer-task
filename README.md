
# computer-task

 Project created for recruitment purposes


## Authors

- [@Myszczur](https://www.github.com/Myszczur)


## Tech Stack

**Tools:** IntellIj IDE, Spring Boot, Spring Data JPA, Lombok, PostgreSQL, H2, Spring MVC, JSP views



## Appendix

ComputerApp is a simple web application written in Java.

The purpose of the application is to create a simple system for managing computer orders.

Thanks to it, we can place an order with the name of the computer and the price in USD. Computers are temporarily stored in the ArrayList Collection, thanks to which we have an overview summarizing our order.

The application connects to the external NBP API, downloads the USDPLN rate and converts the USD from computers to PLN.

If the order placed is correct, we can confirm it, thanks to which the data will be saved to the H2 database contained in the program memory. 
 With the booking date, USD amount, PLN amount and conversion date. Then the program automatically creates an .XML file and saves the invoice with the specified computers to it.

One of the views lists all computers available in the database. We can sort the list in ascending and descending order by the name of computers and by the date of booking.
Additionally, SearchBar is on the list thanks to which we can search for computers by name and booking date.


All data is stored in the memory of the H2 database





## Run Locally

Clone the project

```bash
  git clone https://github.com/Myszczur/computer-task
```

Go to the project directory

```bash
  cd computer-task/ComputerApp
```

Build the Project

```bash
   mvn clean package

```

Start compiled JAR

```bash
  java -cp target/ComputerApp-0.0.1-SNAPSHOT.jar pl.urbanik.computerapp.App

```

