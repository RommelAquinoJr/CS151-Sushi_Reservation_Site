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
Our plan is to create a reservation site that gives users the ability to create reservations at any local sushi restaurant without calling it in as well as managing the reservation for users who have a restaurant of their own. Specifically, users can use this site to choose the restaurant they would like to dine at and fill in all the needed information such as the time and size of their party. As for the owner, they can keep track of their customer’s name, phone number and the reserved table automatically just by opening up the site. Lastly, If the customers decide to cancel their reservation, they can simply do so through the site instead of calling the restaurant.

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
![LandingPage](https://lh3.googleusercontent.com/keep-bbsk/AG3SVnBFE53O6Wi5tWotSnlERZFbl_jANd-gIeOSm6pqCmPPWeKDKi7ecsFTo4_SKO-35OZcTcjmGcA7w0i-ZgQtw-ajDIspX1_6P9uzJJZFUMWoxvUH=s512)

Restaurant Selection Page
![Restaurant Selection Page](https://lh3.googleusercontent.com/keep-bbsk/AG3SVnCXgDl9I5rf-vVFux5PmUXiRpigleeZsXPy9NE2___p0oRLq74_69QdfA5BZ5fN9wzbgsXNtnBBMrFPwAAyH20z6qXeDAeFCh_4yMGCpxzZtkJo=s512)

Restaurant Minato
![Minato](https://lh3.googleusercontent.com/keep-bbsk/AG3SVnC4PHZZaqEkT10838QO3z5GfqJtpFmFYmiYj9qVb5OWXxxQHyDZzuM4tZ_T7k37sJn93_t36yZ5YrjhbN1eS5rn0Ebk7bee37OLDQ_a9h3IpEnl=s512)

Making a Reservation
![Reservation](https://lh3.googleusercontent.com/keep-bbsk/AG3SVnBaT07-3zNUBOUsVZrw-doHDXzfnf3JTnUxU1mDLWpP-Yksgkv36Ograh1RuOKF-OKx-YNq5o-M4ww8yZxP1e5LX2pOd9PdB8NfDjDIzZ7k56hh=s512)

Admin Login

![Admin](https://lh3.googleusercontent.com/keep-bbsk/AG3SVnAoPD7L-82Qu2d0xfwM7wFBR3lP7G8HWcQwUjYrdHvVxGAzhHVPJLVAcc73jRIaCM92XROlPBc_sdakGU34jwj-I3L2FvQNPqnMOqUGcmjRmRGY=s512)

Admin Page

![AdminPage](https://lh3.googleusercontent.com/keep-bbsk/AG3SVnARN7G3ySc78EbO4GeE54Li4Sglhg4DpNcAH37-GilqNUjOhG-zQOy8U_SW3uz15etjYP78MvC322qIEyB4zhj_fILt4082rGHXbSo6nF1WOSQP=s512)

Cancel Reservation
![Cancel](https://lh3.googleusercontent.com/keep-bbsk/AG3SVnBbAv75O35Rdbsp-UWqzJxtwUZZa2Q_Q3OqKrXQAmx2opZLNsg_o9dYVzwRaCMAQp_S6uhDTaXw6mmTcAv8dh-8L2iQ6asd2mUM_hV-pusUQoeM=s512)

### Solution to our Problem
- Users can now book reservations on their own, and when managers/admins have time, will be able to confirm/deny reservations
- ReservationList handles duplicate reservations and has verifying logic to make sure correct information is inputted.

### UML Diagram
![UML diagram](https://lh3.googleusercontent.com/keep-bbsk/AG3SVnCh1lje1ImgnrNyTx64D5bNhusVXqRl85OZuXDYTk7RU0gdLa3pzdP2HGlGBFQK2veQulMMwhdf8DxU-I-FNyC8ErPzU-8mwWArwl_qDUxjp80w=s512)

