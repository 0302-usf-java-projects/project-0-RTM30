package com.revature.controller;

import java.util.Scanner;
import com.revature.model.Customers;
import com.revature.repository.Repository;
import com.revature.service.Service;

public class Menu {
  
  static Scanner sc = new Scanner(System.in);
  static String userInput = "0";
  
  public static void menu() {
    do {
    System.out.println("****Main Menu****");
    System.out.println("(1) Login");
    System.out.println("(2) Create Account");
    System.out.println("(3) Exit"); 
    userInput = sc.nextLine();
    System.out.println("");
    
    switch(userInput){
    case "1":
      login();
      break;
    case "2":
      Customers customer1 = new Customers();
      Service.createUserAccount(customer1); 
      break;
    case "3":
      System.out.println("Goodbye");
    default:
      System.out.println("Invalid input. Please try again.\n");
    }
      
    }while(!userInput.contains("3"));
  }
  
  public static void login() {
    System.out.println("****Login Menu****");
    System.out.print("Username:");
    sc.nextLine();
    System.out.print("Password: ");
    sc.nextLine();
    System.out.println("");
    System.out.println("Login successful!");
    userMenu();
    System.out.println("");
  }
  
  public static void userMenu() {
    do {
      System.out.print("****Welcome " + Repository.usernameSet.get("1").getUsername() + "****\n");
      System.out.println("(1) Profile Information");
      System.out.println("(2) Deposit");
      System.out.println("(3) Withdraw");
      System.out.println("(4) Logout");
      String userMenuInput;
      userMenuInput = sc.nextLine();
      System.out.println("");
      
      
      switch(userMenuInput) {
        case "1":
          System.out.println("**Profile Information**");
          System.out.print("Username: "); Repository.usernameSet.get("1").getUsername();
          System.out.print("Password: "); Repository.usernameSet.get("1").getPassword();
          System.out.print("Balance: $"); Repository.usernameSet.get("1").getBalance();
          System.out.print("\n");
          break;
        case "2":
          System.out.println("Time to deposite money!");
          Repository.usernameSet.get("1").setBalance(100.00);
          System.out.print("Balance: $"); Repository.usernameSet.get("1").getBalance();
          break;
        case "3":
          System.out.println("Time to withdraw money!");
          break;
        case "4":
          System.out.println("You are now logged out.");
          menu();
          break;
          default:
            System.out.println("Invalid input. Please try again.\n");
      }
      
    }while(true);
  }

}
