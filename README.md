# CS151-Sushi_Reservation_Site
## Project Proposal - Sushi Reservation Site
### Team 2 Members
* James Vo
* Katrina Weers
* Rommel Aquino Jr.
* Tri Nguyen

### Problem Statement
**Problem**

Nowadays, making phone calls and manually keeping track in a notebook are the only ways to make bookings. When this happens, clients may have to wait to make reservations over the phone since it is busy. It may also be expensive and time-consuming to manually maintain track. Additionally, it takes time for consumers to phone the restaurant again in order to cancel their reservation.

**Vision**

Create a seamless booking experience on the web for a private sushi pop-up. 

**Domain**

The target audience would include the owner of the sushi pop-up, who wants to automate the booking process, as well as the customers who want to conveniently and save time when making a reservation.

### Functionality
Users will be able to book reservations through a window, view the menu, and cancel reservations. The program should also keep track of booked reservations and make updates to reservations.

### Tech Stack
* Java
* Swing

### High Level Description
A Java Swing application that allows users to book reservations with a choice of 5 restaurants. Creating a reservation creates an instance of ReservationList, which is unique to each restaurant. Users put in their info and are provided a unique ReservationID in which they can cancel their reservation. Users cannot book at the same time but can make multiple Reservations. Admins have a separate login page before being able to confirm or deny reservations. Denying reservations deletes the instance by referencing the unique ReservationID created earlier.  

### Steps to Run Application
1. Download all five folders into one folder
2. compile all files using the following command inside the folder 

```
javac */*.java
```
3. run application
```
java Main/MainGUI.java
```

### Snapshot of Program Running
Landing Page of application

![LandingPage](https://github.com/RommelAquinoJr/CS151-Sushi_Reservation_Site/blob/main/Images/1landingpage.png)

Restaurant Selection Page

![Restaurant Selection Page](https://github.com/RommelAquinoJr/CS151-Sushi_Reservation_Site/blob/main/Images/2restaurantgui.png)

Restaurant Minato

![Minato](https://github.com/RommelAquinoJr/CS151-Sushi_Reservation_Site/blob/main/Images/3minato.png)

Making a Reservation

![Reservation](https://github.com/RommelAquinoJr/CS151-Sushi_Reservation_Site/blob/main/Images/4reservation.png)

Admin Login

![Admin](https://github.com/RommelAquinoJr/CS151-Sushi_Reservation_Site/blob/main/Images/5admin.png)

Admin Page

![AdminPage](https://github.com/RommelAquinoJr/CS151-Sushi_Reservation_Site/blob/main/Images/6adminlogin.png)

Cancel Reservation

![Cancel](https://github.com/RommelAquinoJr/CS151-Sushi_Reservation_Site/blob/main/Images/7cancel.png)

### Solution to our Problem
- Users can now book reservations on their own, and when managers/admins have time, will be able to confirm/deny reservations
- ReservationList handles duplicate reservations and has verifying logic to make sure correct information is inputted.

### UML Diagram
![UML diagram](https://github.com/RommelAquinoJr/CS151-Sushi_Reservation_Site/blob/main/Images/UML%20Class%20Diagram%20CS%20151.drawio.png)

### Slide Presentation
[presentation](https://docs.google.com/presentation/d/1HmBB-hWM-fOTwLo8Icp-iOUqQPCk6lmGluz1j3k0Ico/edit?usp=sharing)