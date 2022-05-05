# :film_strip: Cinema App
**About:**<br />
This is a simple project that simulates a cinema application and supports registration, 
authentication, and other CRUD operations.
_______________________________________________________________________________________
:pushpin: **3-tier architecture:**<br />

* Controllers - Presentation layer;<br />
* Service - Application layer;<br />
* DAO - Data access layer.

:pushpin: **Technologies:**

* Java 11
* Maven
* MySQL
* Tomcat
* Hibernate
* Spring Framework Core
* Spring MVC
* Spring Security

:pushpin: **Available endpoints:**

* **/register** -  (POST) registering a new user
* **/cinema-halls** - (POST) add a new cinema hall
* **/cinema-halls** - (GET) get all cinema halls list
* **/movies** - (POST) add a new movie
* **/movies** - (GET) get all films list
* **/movie-sessions** - (POST) add a new movie session
* **/movie-sessions/available** - (GET) get all available movie sessions
* **/movie-sessions/{id}** - (PUT) update a movie session
* **/movie-sessions/{id}** - (DELETE) delete a movie session
* **/orders/complete** - (POST) completing the order by the user
* **/orders** - (GET) get users order history
* **/shopping-carts/movie-sessions** - (PUT) add a session to a shopping cart
* **/shopping-carts/by-user** - (GET) get users shopping cart
* **/users/by-email** - (GET) find user by email

:pushpin: **To start to use:**

* Clone project from repository
* Install Apache Tomcat 9.0.** version
* Install MySQL
* Config the db.properties according to your credentials
* Inject two users using endpoint **/inject** (POST). You'll get users: <br />
  - admin@i.ua, admin123, ROLE_ADMIN
  - user@i.ua, user1234, ROLE_USER
* You can also add your user using **/register**
* This is it! You can use the application
