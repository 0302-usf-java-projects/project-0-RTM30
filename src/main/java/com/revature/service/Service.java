package com.revature.service;
import java.util.Scanner;
import com.revature.model.Customers;
import com.revature.repository.Repository;
import com.revature.service.Service;
import com.revature.controller.Menu;

// These are your method calls
// This class contains business logic

public class Service {
  
  static Scanner sc = new Scanner(System.in);
  static String username;
  static String password;
  static boolean userNameTest = false;
  
  // Withdraw money: Subtract from Balance
  
  // Deposit Money: Add to Balance
  
  // **Create user account**
  public static Customers createUserAccount(Customers customer) {
    // Adds customer object to the HashMap
    Repository.addCustomer(customer);
    // Input username
   do {
    System.out.println("****Account Creator****");
    System.out.print("Choose a username: ");
    username = sc.nextLine();
    // Check if username is taken
    if(Repository.usernames.containsValue(username) == true) {
      System.out.println("Sorry, this username is taken.");
    }else {
      userNameTest = true;
    }
   }while(false);
    // Adds username to the HashMap
    Repository.addUsername(username);
    // Adds username to Customer.class
    customer.setUsername(username);
    createPassword(customer);
    createBalance(customer);
    System.out.println("");
    return customer;
  }
  
  public static String createPassword(Customers customer) {
    System.out.print("Create a password:");
    password = sc.nextLine();
    customer.setPassword(password);
    System.out.println("Your password was created!");
    return password; 
  }
  
  public static double createBalance(Customers customer) {
    customer.setBalance(22.00);
    return 0.0;  
  }
  
  public static void desposit(Customers customer) {
    customer.setBalance(10.00);
  }



}
