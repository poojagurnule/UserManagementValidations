<h1 align = "center"> User Management System </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
This project is a Managing User data built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The User data model is defined in the User class, which has the following attributes:
```
- userId : unique identifier for each user and Not Null
- username: name of the User and Not Null
- dateOfBirth: Valid date format (yyyy-MM-dd) and not null
- email: Valid email format and not null
- phoneNumber: Valid phone number format (12 digits with country code) and not null

```
---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

### API Endpoints :-



>* GetMapping: "/getAllUser"
```
This endpoint makes a call to method in UserService class which retrieves data of all users from database. This data is sent to controller which is then sent through the API to client.
```
>* PostMapping: /addUser
```
This endpoint makes a call to method in UserService class which is connected to database. In database we add a new user given through API.
```

>* GetMapping: "/getUser/{id}"
```
This endpoint returns data of specific user based on userId through API
```
>* PutMapping : "/updateUser/{id}"
```
This endpoint makes a call to method in UserService class which is connected to database. In database we update a user by userId given through API.
```
>* DeleteMapping : "/deleteUser"
```
This endpoint makes a call to method in UserService class which is connected to database. In database we delete a user by userId given through API.
```
---

## Data structure Used

>* ArrayList
```
We have used ArrayList data structure for GetMapping to return list of all the User to the client .
```
### OutPut :
![UserManagementValidations](https://user-images.githubusercontent.com/102051371/235116956-556ed176-6069-4a08-bd8b-8f82efb35491.png)

---
## Project Summary

This project is a user management system implemented using the Spring framework. It provides endpoints for adding, retrieving, updating, and deleting user information. 
The user model includes attributes such as userId, username, dateOfBirth, email, phoneNumber, date, and time. 
The project uses Spring Validation API to validate the fields in the User model, including @NotNull, @Size, @Email, @Pattern, and @DateTimeFormat annotations.

In summary, this project provides a simple and effective way to manage user information using the Spring framework. The code is well-documented, and the endpoints are implemented with validation to ensure data integrity. 
It can be a useful tool for anyone looking to build a user management system using Spring.

## Author

👤 **Pooja Gurnule**

* GitHub: [Pooja Gurnule](https://github.com/poojagurnule)

---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").

---

## Show your support

Give a ⭐️ if this project helped you!

---

## 📝 License

Copyright © 2023 [Pooja Gurnule](https://github.com/poojagurnule).<br />



---
