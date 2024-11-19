package com.pharmacystore;

import com.pharmacystore.connection.DbConnection;
import com.pharmacystore.daoimpl.UserDaoImpl;
import com.pharmacystore.pojo.User;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Starting Pharmacy Store Application...");

        // Initialize the database connection
        DbConnection dbConnection = new DbConnection();
        dbConnection.connect();  // Make sure DbConnection has a connect() method for this

        // Example: Test UserDaoImpl functionality
        UserDaoImpl userDao = new UserDaoImpl();

        // Creating a new user to test the add functionality
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");

        boolean userAdded = userDao.addUser(user);  // Assuming addUser is a method in UserDaoImpl
        if (userAdded) {
            System.out.println("User added successfully.");
        } else {
            System.out.println("Failed to add user.");
        }

        // Close the database connection (if applicable)
        dbConnection.close();  // Make sure DbConnection has a close() method for this
    }
}
